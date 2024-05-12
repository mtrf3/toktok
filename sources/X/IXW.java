package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;

/* loaded from: classes9.dex */
public final class IXW {
    public SimBitRate LIZ;
    public SimAudioBitrate LIZIZ;
    public EnumC47177IfN LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public final boolean LJFF = true;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DashBitateSelectResult{videoBitrate=");
        LIZ.append(this.LIZ);
        LIZ.append(", audioBitrate=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", resolution=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isOpenSuperResolution=");
        LIZ.append(this.LJ);
        LIZ.append(", asyncInitSr=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, '}', LIZ);
    }
}
