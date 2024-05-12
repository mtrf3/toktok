package X;

/* loaded from: classes10.dex */
public final class LEN {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        if (LEP.LIZ(null)) {
            if (C54964Lhg.LIZ && C53946LFe.LIZJ(null, null).LJFF) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append((String) null);
                LIZ2.append(" supportDMBookMode: true, r: is super device");
                LFE.LIZIZ("DMBookMode", X1D.LIZIZ(LIZ2));
                return true;
            }
            if (LEQ.LIZJ()) {
                if (((Number) C53058Ks2.LIZ.getValue()).intValue() == 1) {
                    return true;
                }
            } else if (LEQ.LIZIZ(null)) {
                if (((Number) C53060Ks4.LIZ.getValue()).intValue() == 1) {
                    return true;
                }
            } else if (LEQ.LIZLLL(null)) {
                if (((Number) C53062Ks6.LIZ.getValue()).intValue() == 1) {
                    return true;
                }
            } else {
                LFE.LIZIZ("DMBookMode", "not support dm bookmode");
            }
        }
        return false;
    }
}
