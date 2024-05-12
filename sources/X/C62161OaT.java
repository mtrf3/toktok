package X;

import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: X.OaT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62161OaT extends C62159OaR {
    @Override // X.C62159OaR
    public final File LIZ() {
        return C66462jC.LIZIZ(0);
    }

    @Override // X.C62159OaR
    public final boolean LIZJ() {
        return C66462jC.LIZIZ(0) != null;
    }

    @Override // X.C62159OaR
    public final void LIZLLL(final String str) {
        C10K.LIZJ(new Callable() { // from class: X.Uvo
            public final /* synthetic */ int LJLILLLLZI = 0;

            /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
            /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    r7 = this;
                    java.lang.String r1 = r2
                    int r6 = r7.LJLILLLLZI
                    android.content.Context r2 = X.EF7.LIZIZ()
                    boolean r0 = X.C38354F3m.LJ(r1)
                    r5 = 0
                    if (r0 == 0) goto L38
                Lf:
                    java.lang.String r2 = ""
                L11:
                    android.content.Context r0 = X.EF7.LIZIZ()
                    java.io.File r0 = X.C16880lQ.LLIIIL(r0)
                    if (r0 == 0) goto L36
                    X.C39579Fg7.LJFF(r0)
                    java.lang.String r1 = r0.getAbsolutePath()
                L22:
                    boolean r0 = android.text.TextUtils.isEmpty(r1)
                    if (r0 != 0) goto L35
                    boolean r0 = android.text.TextUtils.isEmpty(r2)
                    if (r0 != 0) goto L35
                    java.lang.String r0 = X.C66462jC.LIZ(r6)
                    X.C36980EfI.LIZIZ(r2, r1, r0)
                L35:
                    return r5
                L36:
                    r1 = r5
                    goto L22
                L38:
                    android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)
                    boolean r0 = X.C78765Uvh.LJIILIIL(r1)
                    if (r0 == 0) goto Lf
                    X.W5O r1 = X.W5O.LIZ(r1)
                    X.W5N r0 = X.W5N.LJI()
                    X.9kJ r1 = r0.LIZ(r1, r5)
                    X.W8E r0 = X.W8E.LJII()
                    X.W5e r0 = r0.LJIIIZ()
                    X.WEK r0 = r0.LJ(r1)
                    if (r0 == 0) goto Lf
                    java.io.File r4 = r0.LIZ
                    if (r4 == 0) goto Lf
                    X.XFx r0 = new X.XFx
                    r0.<init>(r2)
                    java.lang.String r3 = X.C84541XFx.LJ
                    java.lang.String r0 = r4.getName()
                    java.lang.String r2 = X.C38352F3k.LIZJ(r0)
                    java.io.File r1 = new java.io.File
                    r1.<init>(r3, r2)
                    boolean r0 = r1.exists()
                    if (r0 != 0) goto L81
                    java.lang.String r0 = r4.getAbsolutePath()
                    X.C36980EfI.LIZIZ(r0, r3, r2)
                L81:
                    java.lang.String r2 = r1.getAbsolutePath()
                    goto L11
                */
                throw new UnsupportedOperationException("Method not decompiled: X.CallableC78772Uvo.call():java.lang.Object");
            }
        });
    }
}
