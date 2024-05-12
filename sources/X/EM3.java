package X;

import com.ss.android.ugc.aweme.relation.auth.model.ContactBookEmail;
import com.ss.android.ugc.aweme.relation.auth.model.ContactBookUploadItem;
import defpackage.i0;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class EM3 {
    public static boolean LIZ(List list, EM2 em2) {
        int i;
        if (((Number) em2.LIZ.getValue()).intValue() < 2) {
            em2.LJFF("psiLowDevice", null);
            return false;
        }
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            ContactBookUploadItem contactBookUploadItem = (ContactBookUploadItem) it.next();
            int size = contactBookUploadItem.contactBookPhoneList.size();
            List<ContactBookEmail> list2 = contactBookUploadItem.contactBookEmailList;
            if (list2 != null) {
                i = list2.size();
            } else {
                i = 0;
            }
            i2 += size + i;
        }
        if (i2 > 200) {
            em2.LJFF("psiSizeLimit", null);
            return false;
        }
        if (i2 == 0) {
            em2.LJFF("psiSizeZero", null);
            return false;
        }
        Throwable th = DVI.LIZIZ;
        if (th != null) {
            em2.LJFF("expClosedByThrowable", th);
            return false;
        }
        String string = EMA.LIZ().getString("contact_syncing_by_psi", null);
        if (C78857UxB.LJJJIL(string)) {
            em2.LJFF("psiSyncUnclear", new Error(i0.LJFF("error session id: ", string)));
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d2, code lost:
    
        if (r0 != false) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb A[Catch: Exception -> 0x00c1, all -> 0x010e, TryCatch #4 {all -> 0x010e, blocks: (B:27:0x00b7, B:29:0x00bb, B:46:0x00c9), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r10v11, types: [X.EM4] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.Ynr, X.ELo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C36284ELw r15, X.C37065Egf r16, java.util.List r17, X.C36276ELo r18, X.InterfaceC67352kd r19) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EM3.LIZIZ(X.ELw, X.Egf, java.util.List, X.ELo, X.2kd):java.lang.Object");
    }
}
