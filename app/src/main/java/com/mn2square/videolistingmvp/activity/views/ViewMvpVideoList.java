package com.mn2square.videolistingmvp.activity.views;


import com.mn2square.videolistingmvp.viewmvp.ViewMvp;

import androidx.viewpager.widget.ViewPager;

/**
 * Created by nitinagarwal on 3/5/17.
 */

public interface ViewMvpVideoList extends ViewMvp{
    ViewPager getViewPager();
}
