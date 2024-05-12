package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;

/* renamed from: X.3KN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3KN {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        return IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().getSettings().LJFF();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r10 > X.C3AL.LIZ().status_copy_display_msg_time_threshold) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        r1 = X.C3KP.LIZ(r13, null, X.EF7.LIZIZ(), 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if ((r10 - r12.LJLJLJ) > X.C3AL.LIZ().status_copy_display_msg_time_threshold) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C3L3 LIZIZ(X.C3L3 r12, com.ss.android.ugc.aweme.im.service.model.ActivityStatus r13) {
        /*
            java.lang.String r0 = "session"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r12.LJIJI()
            if (r0 != 0) goto La1
            r2 = 0
        Lc:
            r4 = 0
            r3 = 3
            r1 = 1
            if (r2 == 0) goto L8d
            boolean r7 = LIZ()
        L15:
            boolean r0 = LIZ()
            long r10 = java.lang.System.currentTimeMillis()
            if (r0 != 0) goto L36
        L1f:
            X.3Ma r1 = X.C82603Ma.LJLJI
        L21:
            boolean r0 = r12.LLFII
            if (r7 != r0) goto L2d
            X.3Ma r0 = r12.LJLJJLL
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L35
        L2d:
            X.3L3 r12 = r12.clone()
            r12.LLFII = r7
            r12.LJLJJLL = r1
        L35:
            return r12
        L36:
            if (r13 != 0) goto L39
            goto L1f
        L39:
            if (r2 == 0) goto L5e
            int r0 = r12.LJLLILLLL
            if (r0 != 0) goto L1f
            boolean r0 = r12.LJLLJ
            if (r0 != 0) goto L1f
            long r0 = r12.LJLJLJ
            long r10 = r10 - r0
            X.3AL r0 = X.C3AL.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusConfig r0 = X.C3AL.LIZ()
            long r0 = r0.status_copy_display_msg_time_threshold
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1f
        L55:
            android.content.Context r0 = X.EF7.LIZIZ()
            X.3Ma r1 = X.C3KP.LIZ(r13, r4, r0, r3)
            goto L21
        L5e:
            int r0 = r12.LJLLILLLL
            if (r0 != 0) goto L1f
            boolean r0 = r12.LJLLJ
            if (r0 != 0) goto L1f
            long r0 = r13.activeTime
            r5 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r5
            long r8 = r10 - r0
            X.3AL r0 = X.C3AL.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusConfig r0 = X.C3AL.LIZ()
            long r1 = r0.status_copy_display_date_threshold
            r0 = 2
            long r5 = (long) r0
            long r1 = r1 * r5
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1f
            long r0 = r12.LJLJLJ
            long r10 = r10 - r0
            com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusConfig r0 = X.C3AL.LIZ()
            long r1 = r0.status_copy_display_msg_time_threshold
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1f
            goto L55
        L8d:
            boolean r0 = LIZ()
            if (r0 == 0) goto L9e
            if (r13 == 0) goto L9e
            boolean r0 = X.OUP.LJJII(r13, r4, r4, r3)
            if (r0 != r1) goto L9e
            r7 = 1
            goto L15
        L9e:
            r7 = 0
            goto L15
        La1:
            java.lang.String r0 = r0.getUid()
            boolean r2 = X.AV1.LJIJI(r0)
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3KN.LIZIZ(X.3L3, com.ss.android.ugc.aweme.im.service.model.ActivityStatus):X.3L3");
    }
}
