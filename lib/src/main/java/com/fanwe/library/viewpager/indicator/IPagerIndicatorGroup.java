package com.fanwe.library.viewpager.indicator;

import android.support.v4.view.ViewPager;

import com.fanwe.library.viewpager.indicator.adapter.PagerIndicatorAdapter;

/**
 * ViewPager指示器GroupView
 */
public interface IPagerIndicatorGroup
{
    /**
     * 设置ViewPager
     *
     * @param viewPager
     */
    void setViewPager(ViewPager viewPager);

    /**
     * 返回设置的ViewPager
     *
     * @return
     */
    ViewPager getViewPager();

    /**
     * 设置适配器
     *
     * @param adapter
     */
    void setAdapter(PagerIndicatorAdapter adapter);

    /**
     * 返回设置的适配器
     *
     * @return
     */
    PagerIndicatorAdapter getAdapter();

    /**
     * 设置当DataSetObserver数据变化的时候是否全部重新创建Itemview，默认true
     *
     * @param fullCreateMode
     */
    void setFullCreateMode(boolean fullCreateMode);

    /**
     * 是否DataSetObserver变化的时候是否全部重新创建Itemview
     *
     * @return
     */
    boolean isFullCreateMode();

    /**
     * 设置追踪指示器Item的view
     *
     * @param pagerIndicatorTrack
     */
    void setPagerIndicatorTrack(IPagerIndicatorTrack pagerIndicatorTrack);

    /**
     * 返回跟随指示器Item的view
     *
     * @return
     */
    IPagerIndicatorTrack getPagerIndicatorTrack();

    /**
     * 返回position位置对应的ItemView
     *
     * @param position
     * @return
     */
    IPagerIndicatorItem getPagerIndicatorItem(int position);

    /**
     * ViewPager页数变化回调
     *
     * @param count
     */
    void onPageCountChanged(int count);

    /**
     * ViewPager页面显示的百分比回调
     *
     * @param position    第几页
     * @param showPercent 显示的百分比[0-1]
     * @param isEnter     true-当前页面处于进入状态，false-当前页面处于离开状态
     * @param isMoveLeft  true-ViewPager内容向左移动，false-ViewPager内容向右移动
     */
    void onShowPercent(int position, float showPercent, boolean isEnter, boolean isMoveLeft);

    /**
     * ViewPager某一页选中或者非选中回调
     *
     * @param position 第几页
     * @param selected true-选中，false-未选中
     */
    void onSelectedChanged(int position, boolean selected);
}
