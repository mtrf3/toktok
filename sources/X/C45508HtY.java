package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import java.util.LinkedHashMap;

/* renamed from: X.HtY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45508HtY {
    public static boolean LIZIZ(String str, boolean z) {
        if (str != null) {
            if (z) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) MvChoosePhotoScene.u;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = Boolean.valueOf(C44687HgJ.LIZIZ(str));
                    linkedHashMap.put(str, obj);
                }
                return ((Boolean) obj).booleanValue();
            }
            boolean LIZIZ = C44687HgJ.LIZIZ(str);
            MvChoosePhotoScene.u.put(str, Boolean.valueOf(LIZIZ));
            return LIZIZ;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.lang.String r2, boolean r3, X.InterfaceC88472Yns r4) {
        /*
            if (r2 == 0) goto L25
            if (r3 == 0) goto L2d
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene.u
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L2d
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L2b
            boolean r0 = r0.booleanValue()
        L1a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.invoke(r0)
        L21:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L2a
        L25:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.invoke(r0)
        L2a:
            return
        L2b:
            r0 = 0
            goto L1a
        L2d:
            X.Htb r0 = new X.Htb
            r0.<init>(r2, r4)
            X.C44687HgJ.LIZ(r2, r0)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45508HtY.LIZ(java.lang.String, boolean, X.Yns):void");
    }
}
