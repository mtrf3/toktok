package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.7iu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193687iu {
    public static boolean LIZJ(C7ML c7ml) {
        boolean uninstallOptimizeExplore;
        NowPostInfo nowPostInfo;
        if (!MWW.LIZIZ()) {
            return false;
        }
        if (C193697iv.LIZIZ() || C193697iv.LJ()) {
            uninstallOptimizeExplore = false;
        } else {
            uninstallOptimizeExplore = C193697iv.LIZJ().getUninstallOptimizeExplore();
        }
        if (uninstallOptimizeExplore) {
            if (c7ml.z() == 1) {
                return false;
            }
            if ((c7ml.z() == 2 || c7ml.z() == 3) && (nowPostInfo = c7ml.getAweme().nowPostInfo) != null && nowPostInfo.getNowPostSource() == 3) {
                return false;
            }
        }
        if (C193697iv.LJI()) {
            return !o.LJ(c7ml.getAweme().getAid(), C3AU.LIZIZ());
        }
        if (C193697iv.LJFF()) {
            o.LJIIIIZZ(c7ml.getAweme().getAid(), "aweme.aid");
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a1, code lost:
    
        if (X.C196367nE.LJIIIIZZ(r6) == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.AbstractC194007jQ LIZ(X.C7ML r6, X.AbstractC194637kR r7) {
        /*
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.getAweme()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            r3 = 0
            if (r0 == 0) goto Lde
            int r5 = r0.getFollowStatus()
        Lf:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.getAweme()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto Ldb
            int r2 = r0.getFollowerStatus()
        L1d:
            boolean r0 = X.MWW.LIZIZ()
            r4 = 0
            if (r0 == 0) goto L5e
            boolean r0 = X.C193697iv.LIZLLL()
            if (r0 == 0) goto L3a
            X.7jP r1 = new X.7jP
            if (r7 == 0) goto L36
            boolean r0 = r7.LIZ()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L36:
            r1.<init>(r5, r2, r4)
        L39:
            return r1
        L3a:
            int r1 = r6.z()
            r0 = 2
            if (r1 == r0) goto L48
            int r1 = r6.z()
            r0 = 6
            if (r1 != r0) goto L58
        L48:
            X.7jP r1 = new X.7jP
            if (r7 == 0) goto L54
            boolean r0 = r7.LIZ()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L54:
            r1.<init>(r5, r2, r4)
            goto L39
        L58:
            X.7jN r1 = new X.7jN
            r1.<init>(r5, r2)
            goto L39
        L5e:
            r1 = 1
            if (r7 == 0) goto L98
            boolean r0 = r7.LIZ()
            if (r0 != 0) goto L98
        L67:
            r1 = 0
        L68:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.getAweme()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L96
            int r2 = r0.getFollowStatus()
        L76:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.getAweme()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L84
            int r3 = r0.getFollowerStatus()
        L84:
            if (r1 == 0) goto La4
            X.7jP r1 = new X.7jP
            if (r7 == 0) goto L92
            boolean r0 = r7.LIZ()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L92:
            r1.<init>(r2, r3, r4)
            goto L39
        L96:
            r2 = 0
            goto L76
        L98:
            X.7nE r0 = X.C196367nE.LIZ
            r0.getClass()
            boolean r0 = X.C196367nE.LJIIIIZZ(r6)
            if (r0 != 0) goto L67
            goto L68
        La4:
            X.7nE r1 = X.C196367nE.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.getAweme()
            r1.getClass()
            boolean r0 = X.C196367nE.LJIIJ(r0)
            if (r0 == 0) goto Lb9
            X.7jL r1 = new X.7jL
            r1.<init>(r2, r3)
            goto L39
        Lb9:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.getAweme()
            boolean r0 = X.C196367nE.LJIIJJI(r0)
            if (r0 == 0) goto Lca
            X.7jM r1 = new X.7jM
            r1.<init>(r2, r3)
            goto L39
        Lca:
            X.7jP r1 = new X.7jP
            if (r7 == 0) goto Ld6
            boolean r0 = r7.LIZ()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        Ld6:
            r1.<init>(r2, r3, r4)
            goto L39
        Ldb:
            r2 = 0
            goto L1d
        Lde:
            r5 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C193687iu.LIZ(X.7ML, X.7kR):X.7jQ");
    }

    public static AbstractC193947jK LIZIZ(C7ML c7ml, AbstractC194637kR abstractC194637kR) {
        Integer num;
        if (c7ml.z() == 1) {
            C196367nE c196367nE = C196367nE.LIZ;
            Aweme aweme = c7ml.getAweme();
            c196367nE.getClass();
            o.LJIIIZ(aweme, "aweme");
            NowPostInfo nowPostInfo = aweme.nowPostInfo;
            if (nowPostInfo != null && nowPostInfo.getIncompatibilityInfo() != null) {
                return new C193847jA(C194017jR.LIZJ);
            }
            if (LIZJ(c7ml) && !C78996UzQ.LJJIIZI(c7ml.getAweme())) {
                return new C193847jA(LIZ(c7ml, abstractC194637kR));
            }
            if (C195937mX.LJ(c7ml.getAweme())) {
                return C193857jB.LIZIZ;
            }
            return C193887jE.LIZIZ;
        }
        C193887jE c193887jE = C193887jE.LIZIZ;
        if (o.LJ(c7ml.LLJJJ(), Boolean.TRUE)) {
            return C193837j9.LIZIZ;
        }
        if (C195937mX.LJ(c7ml.getAweme())) {
            return C193857jB.LIZIZ;
        }
        C196367nE c196367nE2 = C196367nE.LIZ;
        Aweme aweme2 = c7ml.getAweme();
        c196367nE2.getClass();
        o.LJIIIZ(aweme2, "aweme");
        NowPostInfo nowPostInfo2 = aweme2.nowPostInfo;
        if (nowPostInfo2 != null && nowPostInfo2.getIncompatibilityInfo() != null) {
            return new C193847jA(C194017jR.LIZJ);
        }
        String authorUid = c7ml.getAweme().getAuthorUid();
        o.LJIIIIZZ(authorUid, "aweme.authorUid");
        if (C196367nE.LJI(authorUid)) {
            return c193887jE;
        }
        if (!LIZJ(c7ml)) {
            if ((!C196367nE.LJIIJJI(c7ml.getAweme()) && !C196367nE.LJIIJ(c7ml.getAweme())) || C195937mX.LJI(c7ml.getAweme())) {
                return c193887jE;
            }
            String aid = c7ml.getAweme().getAid();
            if (aid != null && (num = (Integer) ((ConcurrentHashMap) C195827mM.LIZ).get(aid)) != null && (num.intValue() | 1) > 0) {
                return c193887jE;
            }
        }
        return new C193847jA(LIZ(c7ml, abstractC194637kR));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(X.C7ML r4, X.C194437k7 r5, boolean r6, boolean r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "nowPostCellState"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.Boolean r1 = r4.LLJJJ()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r3 = 1
            if (r0 == 0) goto L18
            return r3
        L18:
            if (r7 == 0) goto L1d
            if (r6 == 0) goto L1d
            return r3
        L1d:
            X.7jK r1 = r5.LJLIL
            boolean r0 = r1 instanceof X.C193907jG
            if (r0 == 0) goto L24
            return r3
        L24:
            boolean r0 = r1 instanceof X.C193847jA
            r2 = 0
            if (r0 != 0) goto L2a
            return r2
        L2a:
            boolean r0 = X.C193697iv.LIZLLL()
            if (r0 == 0) goto L31
            return r3
        L31:
            X.7kR r0 = r5.LJLILLLLZI
            boolean r0 = r0.LIZ()
            if (r0 == 0) goto L5a
            X.7nE r0 = X.C196367nE.LIZ
            r0.getClass()
            boolean r0 = X.C196367nE.LJIIIIZZ(r4)
            if (r0 != 0) goto L5a
            r1 = 1
        L45:
            boolean r0 = X.MWW.LIZIZ()
            if (r0 == 0) goto L5d
            int r1 = r4.z()
            r0 = 2
            if (r1 == r0) goto L59
            int r1 = r4.z()
            r0 = 6
            if (r1 != r0) goto L5c
        L59:
            return r3
        L5a:
            r1 = 0
            goto L45
        L5c:
            return r2
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C193687iu.LIZLLL(X.7ML, X.7k7, boolean, boolean):boolean");
    }
}
