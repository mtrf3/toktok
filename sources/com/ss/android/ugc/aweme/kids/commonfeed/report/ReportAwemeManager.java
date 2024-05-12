package com.ss.android.ugc.aweme.kids.commonfeed.report;

import X.AFN;
import X.C47261Igj;
import X.C58096Mr6;
import X.ORY;
import com.ss.android.ugc.aweme.kids.common.services.IReportAwemeManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ReportAwemeManager implements IReportAwemeManager {
    public static final AFN LIZ = new AFN();

    public static IReportAwemeManager LIZJ() {
        Object LIZ2 = C58096Mr6.LIZ(IReportAwemeManager.class, false);
        if (LIZ2 != null) {
            return (IReportAwemeManager) LIZ2;
        }
        if (C58096Mr6.G1 == null) {
            synchronized (IReportAwemeManager.class) {
                if (C58096Mr6.G1 == null) {
                    C58096Mr6.G1 = new ReportAwemeManager();
                }
            }
        }
        return C58096Mr6.G1;
    }

    @Override // com.ss.android.ugc.aweme.kids.common.services.IReportAwemeManager
    public final void LIZ(String aid) {
        o.LJIIIZ(aid, "aid");
        AFN afn = LIZ;
        afn.getClass();
        if (afn.LIZIZ.getStringArray("report_aweme_list", null) == null) {
            afn.LIZIZ.storeStringArray("report_aweme_list", (String[]) C47261Igj.LJJIJIL(aid).toArray(new String[0]));
            return;
        }
        String[] stringArray = afn.LIZIZ.getStringArray("report_aweme_list", null);
        o.LJIIIIZZ(stringArray, "keva.getStringArray(REPORTED_AWEME, null)");
        List<String> LJLIIIL = ORY.LJLIIIL(stringArray);
        afn.LIZ = LJLIIIL;
        ArrayList arrayList = (ArrayList) LJLIIIL;
        arrayList.add(aid);
        afn.LIZIZ.storeStringArray("report_aweme_list", (String[]) arrayList.toArray(new String[0]));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    @Override // com.ss.android.ugc.aweme.kids.common.services.IReportAwemeManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> LIZIZ(java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r9) {
        /*
            r8 = this;
            java.lang.String r0 = "awemes"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.util.List r7 = X.ORZ.LLJILJILJ(r9)
            r0 = r7
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r6 = r0.iterator()
        L10:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r6.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            java.lang.String r4 = r0.getAid()
            java.lang.String r0 = "iterator.next().aid"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            X.AFN r5 = com.ss.android.ugc.aweme.kids.commonfeed.report.ReportAwemeManager.LIZ
            java.util.List<java.lang.String> r1 = r5.LIZ
            r3 = 0
            r2 = 0
            if (r1 == 0) goto L4a
            java.lang.String[] r0 = new java.lang.String[r3]
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object[] r0 = r1.toArray(r0)
        L35:
            if (r0 == 0) goto L3b
            java.util.Set r2 = X.ORY.LJLIL(r0)
        L3b:
            if (r2 == 0) goto L44
            boolean r0 = r2.contains(r4)
            if (r0 == 0) goto L44
            r3 = 1
        L44:
            if (r3 == 0) goto L10
            r6.remove()
            goto L10
        L4a:
            com.bytedance.keva.Keva r1 = r5.LIZIZ
            java.lang.String r0 = "report_aweme_list"
            java.lang.String[] r1 = r1.getStringArray(r0, r2)
            if (r1 == 0) goto L5a
            int r0 = r1.length
            if (r0 != 0) goto L89
            r0 = 1
        L58:
            if (r0 == 0) goto L87
        L5a:
            r0 = 1
        L5b:
            if (r0 == 0) goto L5f
        L5d:
            r0 = r2
            goto L35
        L5f:
            java.lang.String r0 = "cachedList"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            int r0 = r1.length
            if (r0 != 0) goto L6d
            r0 = 1
        L68:
            r0 = r0 ^ 1
            if (r0 == 0) goto L7a
            goto L6f
        L6d:
            r0 = 0
            goto L68
        L6f:
            java.util.List r0 = X.ORY.LJLIIIL(r1)     // Catch: java.lang.Exception -> L76
            r5.LIZ = r0     // Catch: java.lang.Exception -> L76
            goto L7a
        L76:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L7a:
            java.util.List<java.lang.String> r1 = r5.LIZ
            if (r1 == 0) goto L5d
            java.lang.String[] r0 = new java.lang.String[r3]
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object[] r0 = r1.toArray(r0)
            goto L35
        L87:
            r0 = 0
            goto L5b
        L89:
            r0 = 0
            goto L58
        L8b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.commonfeed.report.ReportAwemeManager.LIZIZ(java.util.List):java.util.List");
    }
}
