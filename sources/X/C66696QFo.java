package X;

import Y.ARunnableS22S0300000_11;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;

/* renamed from: X.QFo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66696QFo extends QGP<QGS> {
    public final int LIZ;
    public final ExecutorService LIZIZ = C16880lQ.LLLLZ(3);

    public static URLConnection LJFF(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-8593166185214544605"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    public C66696QFo(int i) {
        this.LIZ = i;
    }

    @Override // X.QGQ
    public final void LIZIZ(QGS qgs, W7U w7u) {
        qgs.LIZIZ.LIZLLL(new C66697QFp(this.LIZIZ.submit(new ARunnableS22S0300000_11(this, qgs, w7u, 12)), w7u));
    }

    @Override // X.QGQ
    public final QGS LJ(W7F<W8X> w7f, InterfaceC81770W7i interfaceC81770W7i) {
        return new QGS(w7f, interfaceC81770W7i);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.HttpURLConnection LJI(android.net.Uri r13, int r14) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66696QFo.LJI(android.net.Uri, int):java.net.HttpURLConnection");
    }
}
