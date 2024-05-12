package com.bytedance.android.livesdk.livesetting.watchlive;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class SeiParseConfig implements Serializable {

    @InterfaceC65349Pkn("filter")
    public boolean filter;

    @InterfaceC65349Pkn("live_inner_enable")
    public boolean innerEnable;

    @InterfaceC65349Pkn("preview_enable")
    public boolean previewEnable;

    @InterfaceC65349Pkn("sub_thread_enable")
    public boolean threadEnable;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SeiParseConfig() {
        /*
            r7 = this;
            r1 = 0
            r5 = 15
            r6 = 0
            r0 = r7
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.watchlive.SeiParseConfig.<init>():void");
    }

    public final boolean getFilter() {
        return this.filter;
    }

    public final boolean getInnerEnable() {
        return this.innerEnable;
    }

    public final boolean getPreviewEnable() {
        return this.previewEnable;
    }

    public final boolean getThreadEnable() {
        return this.threadEnable;
    }

    public final void setFilter(boolean z) {
        this.filter = z;
    }

    public final void setInnerEnable(boolean z) {
        this.innerEnable = z;
    }

    public final void setPreviewEnable(boolean z) {
        this.previewEnable = z;
    }

    public final void setThreadEnable(boolean z) {
        this.threadEnable = z;
    }

    public SeiParseConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.threadEnable = z;
        this.filter = z2;
        this.previewEnable = z3;
        this.innerEnable = z4;
    }

    public /* synthetic */ SeiParseConfig(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
    }
}
