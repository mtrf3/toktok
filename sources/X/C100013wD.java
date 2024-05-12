package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3wD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100013wD {
    public static final int LIZ;
    public static final int LIZIZ;
    public static String LIZJ = "";

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    static {
        /*
            java.lang.String r0 = ""
            X.C100013wD.LIZJ = r0
            X.3Pa r0 = X.C85773Yf.LJLJI
            if (r0 == 0) goto L38
            X.3wE r0 = X.C77876UhM.LJ()
            if (r0 == 0) goto L39
            int r3 = r0.LIZLLL
        L10:
            X.C100013wD.LIZ = r3
            if (r0 == 0) goto L36
            int r2 = r0.LJ
        L16:
            X.C100013wD.LIZIZ = r2
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "init: enableMsgTypes="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", enableFunctions="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "AuthorSupporterHelper"
            X.C34B.LIZIZ(r0, r1)
            return
        L36:
            r2 = 3
            goto L16
        L38:
            r0 = 0
        L39:
            r3 = 5
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100013wD.<clinit>():void");
    }

    public static final boolean LIZ(C63120Opw c63120Opw) {
        java.util.Map<String, String> ext;
        if (c63120Opw != null) {
            C63088OpQ coreInfo = c63120Opw.getCoreInfo();
            if (coreInfo != null && (ext = coreInfo.getExt()) != null && o.LJ("1", ext.get("a:s_author_im_supporter"))) {
                return true;
            }
            java.util.Map<String, String> localExt = c63120Opw.getLocalExt();
            if (localExt != null && o.LJ("1", localExt.get("a:s_author_im_supporter"))) {
                return true;
            }
            return false;
        }
        return false;
    }
}
