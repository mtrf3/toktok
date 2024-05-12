package com.byted.cast.common.api;

import com.byted.cast.common.bean.DramaBean;

/* loaded from: classes29.dex */
public interface IReverseControl {
    long getCurrentPosition();

    String getDramaId();

    DramaBean[] getDramaList();

    long getDuration();

    String getPlayState();
}
