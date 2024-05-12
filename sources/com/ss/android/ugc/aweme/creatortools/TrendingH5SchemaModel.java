package com.ss.android.ugc.aweme.creatortools;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TrendingH5SchemaModel extends F9E {

    @InterfaceC65349Pkn("trending_settings_android")
    public final String videoTrendingTopicSettingPage;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.videoTrendingTopicSettingPage};
    }

    public TrendingH5SchemaModel(String videoTrendingTopicSettingPage) {
        o.LJIIIZ(videoTrendingTopicSettingPage, "videoTrendingTopicSettingPage");
        this.videoTrendingTopicSettingPage = videoTrendingTopicSettingPage;
    }
}
