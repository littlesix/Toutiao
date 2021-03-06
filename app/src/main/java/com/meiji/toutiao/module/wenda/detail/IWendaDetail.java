package com.meiji.toutiao.module.wenda.detail;

import com.meiji.toutiao.bean.news.NewsCommentMobileBean;
import com.meiji.toutiao.module.base.IBasePresenter;
import com.meiji.toutiao.module.base.IBaseView;

import java.util.List;

/**
 * Created by Meiji on 2017/5/23.
 */

public interface IWendaDetail {

    interface View extends IBaseView<Presenter> {

        /**
         * 加载网页
         */
        void onSetWebView(String baseUrl, boolean flag);

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
        void doLoadData(String url);

        /**
         * 加载评论
         */
        void doLoadComment(String... ansId);

        /**
         * 加载更多评论
         */
        void doLoadMoreComment();

        /**
         * 设置适配器
         */
        void doSetAdapter(List<NewsCommentMobileBean.DataBean.CommentBean> list);

        /**
         * 加载完毕
         */
        void doShowNoMore();
    }

}
