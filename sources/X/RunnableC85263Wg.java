package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3Wg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC85263Wg implements Comparable<RunnableC85263Wg>, Runnable {
    public final C3VZ LJLIL;
    public final int LJLILLLLZI;
    public final InterfaceC85303Wk LJLJI;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        r3.LIZ(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            r9 = this;
            X.3VZ r5 = r9.LJLIL
            int r4 = r9.LJLILLLLZI
            X.3Wk r3 = r9.LJLJI
            java.util.List<X.3VP> r0 = r5.LJLILLLLZI
            java.util.Iterator r8 = r0.iterator()
        Lc:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r2 = r8.next()
            X.3VP r2 = (X.C3VP) r2
            if (r2 == 0) goto L34
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.LJLIL
            if (r0 == 0) goto L34
            java.util.List r0 = r0.getUrlList()
            if (r0 == 0) goto L34
            java.lang.Object r1 = X.ORZ.LJLLLL(r0)
            java.lang.String r1 = (java.lang.String) r1
            r7 = 0
            r6 = 1
            if (r1 == 0) goto L34
            int r0 = r1.length()
            if (r0 != 0) goto L3a
        L34:
            if (r3 == 0) goto Lc
            r3.LIZ(r2)
            goto Lc
        L3a:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)
            boolean r0 = X.C78765Uvh.LJIILIIL(r1)
            if (r0 != 0) goto L51
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.2u7 r0 = X.C73232u7.LJLIL
            boolean r0 = X.C43659HBn.LJJIFFI(r1, r0)
            if (r0 == 0) goto L57
        L51:
            if (r3 == 0) goto Lc
            r3.LIZ(r2)
            goto Lc
        L57:
            X.W5F r1 = X.W5U.LJFF(r1)
            boolean r0 = r5.LJLJI
            if (r0 == 0) goto L6c
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r1.LJIJI = r0
            r1.LJFF = r6
            r1.LJ = r7
        L67:
            if (r4 == 0) goto L7a
            if (r4 == r6) goto L71
            goto Lc
        L6c:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            r1.LJIJI = r0
            goto L67
        L71:
            X.3Wi r0 = new X.3Wi
            r0.<init>()
            r1.LJII(r0)
            goto Lc
        L7a:
            X.3Wh r0 = new X.3Wh
            r0.<init>()
            r1.LJIIIZ(r0)
            goto Lc
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC85263Wg.LIZJ():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(RunnableC85263Wg runnableC85263Wg) {
        RunnableC85263Wg other = runnableC85263Wg;
        o.LJIIIZ(other, "other");
        return this.LJLIL.LJLJJI - other.LJLIL.LJLJJI;
    }

    public RunnableC85263Wg(C3VZ c3vz, int i, C3VO c3vo) {
        this.LJLIL = c3vz;
        this.LJLILLLLZI = i;
        this.LJLJI = c3vo;
    }
}
