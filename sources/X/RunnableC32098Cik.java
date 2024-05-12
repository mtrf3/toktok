package X;

/* renamed from: X.Cik, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC32098Cik implements Runnable {
    public final EnumC32096Cii LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            EnumC32096Cii enumC32096Cii = this.LJLIL;
            if (enumC32096Cii != null) {
                C32097Cij.LIZ.remove(enumC32096Cii);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC32098Cik(EnumC32096Cii enumC32096Cii) {
        this.LJLIL = enumC32096Cii;
    }
}
