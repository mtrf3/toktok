package X;

import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import kotlin.jvm.internal.AqS22S0000100_1;

/* renamed from: X.3KK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3KK {
    public static boolean LIZIZ(boolean z, boolean z2, ActivityStatus activityStatus, long j) {
        if (z) {
            return z2;
        }
        if (z2 && activityStatus != null && OUP.LJJII(activityStatus, new AqS22S0000100_1(j, 0), null, 2)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (r6 > X.C3AL.LIZ().status_copy_display_msg_time_threshold) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
    
        if ((r8 - r11.LJLJLJ) > X.C3AL.LIZ().status_copy_display_msg_time_threshold) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C82603Ma LIZ(long r8, com.ss.android.ugc.aweme.im.service.model.ActivityStatus r10, X.C3L4 r11, boolean r12, boolean r13) {
        /*
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "session name : "
            r1.append(r0)
            java.lang.String r0 = r11.LJ()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            java.lang.String r5 = "SessionRefactor-ActivityStatus"
            X.C81843Jc.LIZIZ(r5, r0)
            r4 = 2
            if (r13 != 0) goto L70
        L1d:
            r2 = 0
        L1e:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "shouldShowStatusText: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C81843Jc.LIZIZ(r5, r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "status: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C81843Jc.LIZIZ(r5, r0)
            if (r2 == 0) goto L6d
            if (r10 == 0) goto L6a
            android.content.Context r2 = X.EF7.LIZIZ()
            kotlin.jvm.internal.AqS22S0000100_1 r1 = new kotlin.jvm.internal.AqS22S0000100_1
            r0 = 1
            r1.<init>(r8, r0)
            X.3Ma r2 = X.C3KP.LIZ(r10, r1, r2, r4)
        L56:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "the result: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C81843Jc.LIZIZ(r5, r0)
        L69:
            return r2
        L6a:
            X.3Ma r2 = X.C3KH.LJLJLJ
            goto L56
        L6d:
            X.3Ma r2 = X.C3KH.LJLJLJ
            goto L69
        L70:
            if (r10 != 0) goto L73
            goto L1d
        L73:
            long r0 = r10.activeTime
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L7c
            goto L1d
        L7c:
            if (r12 == 0) goto L9b
            int r0 = r11.LJLLILLLL
            if (r0 != 0) goto L1d
            boolean r0 = r11.LJLLJ
            if (r0 != 0) goto L1d
            long r0 = r11.LJLJLJ
            long r6 = r8 - r0
            X.3AL r0 = X.C3AL.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusConfig r0 = X.C3AL.LIZ()
            long r1 = r0.status_copy_display_msg_time_threshold
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1d
        L99:
            r2 = 1
            goto L1e
        L9b:
            int r0 = r11.LJLLILLLL
            if (r0 != 0) goto L1d
            boolean r0 = r11.LJLLJ
            if (r0 != 0) goto L1d
            long r0 = r10.activeTime
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            long r6 = r8 - r0
            X.3AL r0 = X.C3AL.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusConfig r0 = X.C3AL.LIZ()
            long r2 = r0.status_copy_display_date_threshold
            long r0 = (long) r4
            long r2 = r2 * r0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L1d
            long r0 = r11.LJLJLJ
            long r6 = r8 - r0
            com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusConfig r0 = X.C3AL.LIZ()
            long r1 = r0.status_copy_display_msg_time_threshold
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1d
            goto L99
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3KK.LIZ(long, com.ss.android.ugc.aweme.im.service.model.ActivityStatus, X.3L4, boolean, boolean):X.3Ma");
    }
}
