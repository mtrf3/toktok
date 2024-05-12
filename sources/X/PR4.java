package X;

/* loaded from: classes12.dex */
public final class PR4 implements InterfaceC64435PQp {
    public static final PR4 LIZ = new PR4();

    @Override // X.InterfaceC64435PQp
    public final void LIZ(int i) {
        if (i != 0) {
            PR3.LIZJ = System.currentTimeMillis();
        } else {
            if (PR3.LIZJ <= 0) {
                return;
            }
            PR3.LIZLLL = (System.currentTimeMillis() - PR3.LIZJ) + PR3.LIZLLL;
            PR3.LIZJ = 0L;
        }
    }
}
