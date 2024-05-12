package X;

/* loaded from: classes12.dex */
public abstract class R6Q extends QQE<R6R> {
    public abstract void LIZ(R6R r6r);

    public abstract void LIZIZ(R6R r6r, String str, String str2);

    public abstract void LIZJ(R6R r6r);

    @Override // X.QQE
    public final void onResponse(R6R r6r) {
        R6R r6r2 = r6r;
        if (r6r2.LIZIZ) {
            LIZJ(r6r2);
            return;
        }
        int i = r6r2.LIZLLL;
        if (i == 1030 || i == 1041) {
            if (r6r2.LJIIL != null) {
                LIZIZ(r6r2, r6r2.LJIIJ, r6r2.LJIIJJI);
                return;
            } else {
                LIZ(r6r2);
                return;
            }
        }
        LIZ(r6r2);
    }
}
