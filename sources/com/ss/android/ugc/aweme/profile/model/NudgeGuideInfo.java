package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class NudgeGuideInfo implements Serializable {

    @InterfaceC65349Pkn("guide_time")
    public long guideTime;

    @InterfaceC65349Pkn("show_guide")
    public boolean showGuide;

    public NudgeGuideInfo() {
        this(0L, false, 3, null);
    }

    public final long getGuideTime() {
        return this.guideTime;
    }

    public final boolean getShowGuide() {
        return this.showGuide;
    }

    public final void setGuideTime(long j) {
        this.guideTime = j;
    }

    public final void setShowGuide(boolean z) {
        this.showGuide = z;
    }

    public NudgeGuideInfo(long j, boolean z) {
        this.guideTime = j;
        this.showGuide = z;
    }

    public /* synthetic */ NudgeGuideInfo(long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? false : z);
    }
}
