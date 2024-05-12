package X;

/* loaded from: classes9.dex */
public final class J42 implements InterfaceC48512J2e {
    public final /* synthetic */ J4H LIZ;

    public J42(J4H j4h) {
        this.LIZ = j4h;
    }

    @Override // X.InterfaceC48512J2e
    public final void LIZ(boolean z, int i, C48044ItM c48044ItM, IFF iff) {
        String str;
        J4H j4h = this.LIZ;
        if (j4h != null) {
            java.util.Map<String, Float> map = null;
            if (c48044ItM != null) {
                str = c48044ItM.LIZ;
                map = c48044ItM.LIZIZ;
            } else {
                str = null;
            }
            j4h.LIZ(z, i, str, map);
        }
    }
}
