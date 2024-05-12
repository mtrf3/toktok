package com.ss.android.ugc.aweme.music.report.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class TT2DspActionInfo {

    @InterfaceC65349Pkn("button_type")
    public final Integer buttonType;

    @InterfaceC65349Pkn("platform")
    public final Integer platform;

    /* JADX WARN: Multi-variable type inference failed */
    public TT2DspActionInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TT2DspActionInfo)) {
            return false;
        }
        TT2DspActionInfo tT2DspActionInfo = (TT2DspActionInfo) obj;
        return o.LJ(this.platform, tT2DspActionInfo.platform) && o.LJ(this.buttonType, tT2DspActionInfo.buttonType);
    }

    public final int hashCode() {
        Integer num = this.platform;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.buttonType;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TT2DspActionInfo(platform=");
        LIZ.append(this.platform);
        LIZ.append(", buttonType=");
        return s0.LIZJ(LIZ, this.buttonType, ')', LIZ);
    }

    public TT2DspActionInfo(Integer num, Integer num2) {
        this.platform = num;
        this.buttonType = num2;
    }

    public /* synthetic */ TT2DspActionInfo(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
