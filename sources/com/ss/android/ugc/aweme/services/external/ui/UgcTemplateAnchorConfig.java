package com.ss.android.ugc.aweme.services.external.ui;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class UgcTemplateAnchorConfig {
    public Aweme aweme;
    public boolean isFromPUgc;
    public CreativeInfo creativeInfo = new CreativeInfo(null, 0, null, 7, null);
    public final String shootWay = "ugc_template";

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final CreativeInfo getCreativeInfo() {
        return this.creativeInfo;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final boolean isFromPUgc() {
        return this.isFromPUgc;
    }

    public final void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    public final void setCreativeInfo(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "<set-?>");
        this.creativeInfo = creativeInfo;
    }

    public final void setFromPUgc(boolean z) {
        this.isFromPUgc = z;
    }
}
