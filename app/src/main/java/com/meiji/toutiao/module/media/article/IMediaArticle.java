package com.meiji.toutiao.module.media.article;

import com.meiji.toutiao.bean.media.MediaArticleBean;
import com.meiji.toutiao.bean.media.MediaChannelBean;
import com.meiji.toutiao.module.base.IBasePresenter;
import com.meiji.toutiao.module.base.IBaseView;

import java.util.List;

/**
 * Created by Meiji on 2017/4/11.
 */

public interface IMediaArticle {

    interface View extends IBaseView<Presenter> {

        /**
         * 请求数据
         */
        void onLoadData();

        /**
         * 加载完毕
         */
        void onShowNoMore();
    }

    interface Presenter extends IBasePresenter {

        /**
         * 请求数据
         */
        void doLoadData(String... mediaId);

        /**
         * 再起请求数据
         */
        void doLoadMoreData();

        /**
         * 设置适配器
         */
        void doSetAdapter(List<MediaArticleBean.DataBean> dataBeen);

        /**
         * 加载完毕
         */
        void doShowNoMore();

        /**
         * 点击事件跳转
         */
        void doOnClickItem(int position, MediaChannelBean mediaChannelBean);
    }
}
