package com.ss.android.ugc.aweme.setting.performance;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class PageModeCodecConfigParam extends F9E {

    @InterfaceC65349Pkn("higher_fps_min_side_threshold")
    public final int highFpsResolutionVideoMinSide;

    @InterfaceC65349Pkn("lower_fps_min_side_threshold")
    public final int highResolutionVideoMinSide;

    @InterfaceC65349Pkn("page_mode")
    public final int pageMode;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PageModeCodecConfigParam() {
        /*
            r6 = this;
            r1 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.performance.PageModeCodecConfigParam.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.pageMode), Integer.valueOf(this.highResolutionVideoMinSide), Integer.valueOf(this.highFpsResolutionVideoMinSide)};
    }

    public PageModeCodecConfigParam(int i, int i2, int i3) {
        this.pageMode = i;
        this.highResolutionVideoMinSide = i2;
        this.highFpsResolutionVideoMinSide = i3;
    }

    public /* synthetic */ PageModeCodecConfigParam(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
