package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyModel;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyQuestionnaire;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.satisfactionsurvey.core.config.SearchUsefulnessSurveyConfig;
import java.util.List;
import ujb.o;
import ujb.s;

/* renamed from: X.JpS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50350JpS {
    public static SearchUsefulnessSurveyConfig LIZ;

    public static boolean LIZ() {
        FeelgoodSurveyQuestionnaire questionnaire;
        List LJJLL;
        FeelgoodSurveyModel LIZJ = LIZJ();
        if (LIZJ == null || (questionnaire = LIZJ.getQuestionnaire()) == null || C44384HbQ.LJJZZIII(questionnaire).length() == 0 || (LJJLL = C44384HbQ.LJJLL(questionnaire)) == null || LJJLL.isEmpty()) {
            return false;
        }
        return true;
    }

    public static FeelgoodSurveyModel LIZJ() {
        C50351JpT c50351JpT = ((C50322Jp0) KNV.LIZ()).LJLLLL;
        if (c50351JpT != null) {
            return c50351JpT.LIZ;
        }
        return null;
    }

    public static String LIZIZ(String str) {
        if (str != null) {
            try {
                if (!o.LJJJJ(str, "_sub", false)) {
                    return str;
                }
                return (String) ListProtector.get(s.LJLJJL(str, new String[]{"_sub"}, 0, 6), 0);
            } catch (Exception unused) {
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
    
        r2 = r8.indexOf(r5);
        r1 = r5.getSubAweme();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZLLL(java.util.List r8) {
        /*
            X.OzC r0 = X.KNV.LIZ()
            X.Jp0 r0 = (X.C50322Jp0) r0
            java.util.Set<java.lang.String> r0 = r0.LJLLLLLL
            int r0 = r0.size()
            boolean r0 = X.C50399JqF.LIZ(r0)
            if (r0 == 0) goto L1e
            boolean r0 = X.C50440Jqu.LIZ()
            if (r0 == 0) goto L1e
            boolean r0 = X.C50440Jqu.LIZLLL
            if (r0 != 0) goto L1e
            if (r8 != 0) goto L1f
        L1e:
            return r8
        L1f:
            java.util.ArrayList r4 = X.C61328O5c.LJ(r8)
            java.util.Iterator r7 = r4.iterator()
            r6 = 0
            r2 = -1
            r1 = r6
        L2a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lab
            java.lang.Object r5 = r7.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = (com.ss.android.ugc.aweme.feed.model.Aweme) r5
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getSubAweme()
            if (r0 == 0) goto L2a
            boolean r0 = r5.getIsSubAweme()
            if (r0 != 0) goto L2a
            boolean r0 = r5.isWithSearchSurvey()
            if (r0 == 0) goto L2a
            boolean r0 = X.C220858ld.LJIIIIZZ(r5)
            if (r0 != 0) goto L2a
            boolean r0 = LIZ()
            if (r0 == 0) goto L2a
            boolean r0 = r5.isAd()
            if (r0 != 0) goto L2a
            int r0 = r8.indexOf(r5)
            int r0 = r0 + 1
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r0, r8)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto La9
            java.lang.String r1 = r0.getAid()
        L6c:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getSubAweme()
            java.lang.String r0 = r0.getAid()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L9f
            java.util.Iterator r3 = r8.iterator()
        L7e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto La0
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            java.lang.String r1 = r0.getAid()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getSubAweme()
            java.lang.String r0 = r0.getAid()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L7e
            if (r2 == 0) goto La0
        L9f:
            return r8
        La0:
            int r2 = r8.indexOf(r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.getSubAweme()
            goto L2a
        La9:
            r1 = r6
            goto L6c
        Lab:
            if (r2 < 0) goto Lba
            int r0 = r8.size()
            if (r2 >= r0) goto Lba
            if (r1 == 0) goto Lba
            int r0 = r2 + 1
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r4, r0, r1)
        Lba:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50350JpS.LIZLLL(java.util.List):java.util.List");
    }
}
