package com.ss.android.ugc.aweme.music.report.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ExtraData {

    @InterfaceC65349Pkn("tt2dsp_info")
    public final TT2DspActionInfo tT2DspActionInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public ExtraData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExtraData) && o.LJ(this.tT2DspActionInfo, ((ExtraData) obj).tT2DspActionInfo);
    }

    public final int hashCode() {
        TT2DspActionInfo tT2DspActionInfo = this.tT2DspActionInfo;
        if (tT2DspActionInfo == null) {
            return 0;
        }
        return tT2DspActionInfo.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExtraData(tT2DspActionInfo=");
        LIZ.append(this.tT2DspActionInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ExtraData(TT2DspActionInfo tT2DspActionInfo) {
        this.tT2DspActionInfo = tT2DspActionInfo;
    }

    public /* synthetic */ ExtraData(TT2DspActionInfo tT2DspActionInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tT2DspActionInfo);
    }
}
