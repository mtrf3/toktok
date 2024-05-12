package com.ss.android.ugc.aweme.simkit.model.bitrateselect;

import X.C07670Rv;
import X.IY3;
import X.InterfaceC65349Pkn;
import X.X1D;

/* loaded from: classes9.dex */
public class AutoBitrateSet implements IY3 {

    @InterfaceC65349Pkn("param_a")
    public double firstParam;

    @InterfaceC65349Pkn("param_d")
    public double fourthParam;

    @InterfaceC65349Pkn("min_bitrate")
    public double minBitrate;

    @InterfaceC65349Pkn("param_b")
    public double secondParam;

    @InterfaceC65349Pkn("param_c")
    public double thirdParam;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoBitrateSet{firstParam=");
        LIZ.append(this.firstParam);
        LIZ.append(", secondParam=");
        LIZ.append(this.secondParam);
        LIZ.append(", thirdParam=");
        LIZ.append(this.thirdParam);
        LIZ.append(", fourthParam=");
        LIZ.append(this.fourthParam);
        LIZ.append(", minBitrate=");
        return C07670Rv.LIZ(LIZ, this.minBitrate, '}', LIZ);
    }

    @Override // X.IY3
    public final double LIZ() {
        return this.firstParam;
    }

    @Override // X.IY3
    public final double LIZIZ() {
        return this.thirdParam;
    }

    @Override // X.IY3
    public final double LIZJ() {
        return this.minBitrate;
    }

    @Override // X.IY3
    public final double LIZLLL() {
        return this.fourthParam;
    }

    @Override // X.IY3
    public final double LJ() {
        return this.secondParam;
    }
}
