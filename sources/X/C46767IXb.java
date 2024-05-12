package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* renamed from: X.IXb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46767IXb {
    public static Boolean LIZ;
    public static Boolean LIZIZ;

    public static boolean LIZIZ() {
        boolean z;
        boolean z2;
        IUB iub = IUA.LIZ;
        if (iub.LIZ().getPlayerType() == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean enableForceUseH264CheckPolicy = iub.LIZ().enableForceUseH264CheckPolicy();
        iub.LIZ().enableByteVc1FailCheckCountPolicy();
        if (!iub.LIZ().enableForceUseH264Global()) {
            if (!z || !enableForceUseH264CheckPolicy) {
                return false;
            }
            if (LIZ == null) {
                if (IYU.LIZ == null) {
                    if (IYV.LIZ(new IYY(), new IYX("video/hevc")) != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    IYU.LIZ = Boolean.valueOf(z2);
                }
                Boolean valueOf = Boolean.valueOf(IYU.LIZ.booleanValue());
                LIZ = valueOf;
                if (!valueOf.booleanValue()) {
                    C46982IcE.LJI().ensureNotReachHere(new Exception(), "hevc not supported.");
                }
            }
            if (LIZ.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static SimVideoUrlModel LIZ(SimVideo simVideo, ITZ itz) {
        return IUA.LIZ.LIZ().getVideoPlayAddr(simVideo, itz);
    }
}
