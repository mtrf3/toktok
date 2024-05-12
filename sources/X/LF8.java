package X;

/* loaded from: classes10.dex */
public final class LF8 extends LFB {
    public LF8() {
        super(null, "ScreenSizeCheck");
    }

    @Override // X.LFB
    public final int LIZ() {
        int LIZLLL = C53947LFf.LIZLLL();
        int LIZ = C53947LFf.LIZ();
        if (LIZLLL <= 0 || LIZ <= 0) {
            C53946LFe.LIZJ(null, null);
        }
        if (LF2.LIZ(C53947LFf.LIZLLL(), C53947LFf.LIZ())) {
            return 1;
        }
        return 2;
    }
}
