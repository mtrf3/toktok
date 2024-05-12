package com.ss.android.ugc.aweme.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class PreviewGuideData extends F9E {

    @InterfaceC65349Pkn("enable_cta")
    public final boolean enableCTA;

    @InterfaceC65349Pkn("guide_show_time")
    public final long guideShowTime;

    @InterfaceC65349Pkn("style")
    public final int style;

    /* JADX WARN: Multi-variable type inference failed */
    public PreviewGuideData() {
        this(0, 0L, 0 == true ? 1 : 0, 7, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.style), Long.valueOf(this.guideShowTime), Boolean.valueOf(this.enableCTA)};
    }

    public PreviewGuideData(int i, long j, boolean z) {
        this.style = i;
        this.guideShowTime = j;
        this.enableCTA = z;
    }

    public /* synthetic */ PreviewGuideData(int i, long j, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? false : z);
    }
}
