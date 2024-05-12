package com.byted.cast.common.config;

import com.byted.cast.common.bean.MediaInfo;

/* loaded from: classes29.dex */
public interface IMediaInfoListener {
    void onFail(int i, String str);

    void onSuccess(MediaInfo mediaInfo);
}
