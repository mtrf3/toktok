package X;

import com.bytedance.keva.Keva;
import java.util.Calendar;
import kotlin.jvm.internal.o;

/* renamed from: X.Ftj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40423Ftj {
    public static final /* synthetic */ int LJFF = 0;
    public final Keva LIZ = Keva.getRepo("fission_sp");
    public final C250819sr LIZIZ = new C250819sr();
    public int LIZJ = -1;
    public int LIZLLL = -1;
    public int LJ = -1;

    public final Keva LJ() {
        Keva keva = this.LIZ;
        o.LJIIIIZZ(keva, "keva");
        return keva;
    }

    public static long LIZ() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static String LIZIZ() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return String.valueOf(calendar.getTimeInMillis());
    }

    public final int LIZLLL() {
        if (o.LJ(LIZIZ(), LJ().getString("current_day", ""))) {
            return LJ().getInt("today_showed_time", 0);
        }
        LJ().storeString("current_day", LIZIZ());
        LJ().storeInt("today_showed_time", 0);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
    
        if (r5.getCount() < r16) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00cc A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(int r15, int r16, android.content.Context r17) {
        /*
            java.lang.String r3 = "open_time"
            r9 = 0
            r2 = 0
            android.content.pm.PackageManager r1 = r17.getPackageManager()     // Catch: java.lang.Exception -> L15
            java.lang.String r0 = r17.getPackageName()     // Catch: java.lang.Exception -> L15
            android.content.pm.PackageInfo r0 = X.C16880lQ.LLLLLLZ(r1, r0, r2)     // Catch: java.lang.Exception -> L15
            if (r0 == 0) goto L19
            long r0 = r0.firstInstallTime
            goto L1b
        L15:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L19:
            r0 = 0
        L1b:
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r0
            r0 = 86400000(0x5265c00, float:7.82218E-36)
            int r0 = r0 * r15
            long r0 = (long) r0
            r7 = 1
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 >= 0) goto Lcc
            com.ss.android.ugc.aweme.ug.IUgCommonService r4 = com.ss.android.ugc.aweme.ug.UgCommonServiceImpl.LJIJ()     // Catch: java.lang.Throwable -> Lc0
            android.database.sqlite.SQLiteDatabase r6 = r4.LJFF()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r8 = "app_open"
            java.lang.StringBuilder r5 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Lc0
            r5.append(r3)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r4 = " > ?"
            r5.append(r4)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r10 = X.X1D.LIZIZ(r5)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String[] r11 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> Lc0
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lc0
            long r4 = r4 - r0
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> Lc0
            r11[r2] = r0     // Catch: java.lang.Throwable -> Lc0
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            android.database.Cursor r5 = r6.query(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> Lc0
            if (r5 != 0) goto L5c
            return r2
        L5c:
            java.util.Calendar r4 = java.util.Calendar.getInstance()     // Catch: java.lang.Throwable -> Lc2
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lc2
            r4.setTimeInMillis(r0)     // Catch: java.lang.Throwable -> Lc2
            r0 = 11
            r4.set(r0, r2)     // Catch: java.lang.Throwable -> Lc2
            r0 = 12
            r4.set(r0, r2)     // Catch: java.lang.Throwable -> Lc2
            r0 = 13
            r4.set(r0, r2)     // Catch: java.lang.Throwable -> Lc2
            r0 = 14
            r4.set(r0, r2)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r8 = "app_open"
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Lc2
            r1.append(r3)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = " = ?"
            r1.append(r0)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r10 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String[] r11 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> Lc2
            long r0 = r4.getTimeInMillis()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lc2
            r11[r2] = r0     // Catch: java.lang.Throwable -> Lc2
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            android.database.Cursor r9 = r6.query(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> Lc2
            int r0 = r9.getCount()     // Catch: java.lang.Throwable -> Lbe
            r1 = r16
            if (r0 <= 0) goto Lb0
            int r0 = r5.getCount()     // Catch: java.lang.Throwable -> Lbe
            if (r0 > r1) goto Lb7
            goto Lb6
        Lb0:
            int r0 = r5.getCount()     // Catch: java.lang.Throwable -> Lbe
            if (r0 >= r1) goto Lb7
        Lb6:
            r2 = 1
        Lb7:
            r5.close()
            r9.close()
            return r2
        Lbe:
            r0 = move-exception
            goto Lc3
        Lc0:
            r0 = move-exception
            goto Lcb
        Lc2:
            r0 = move-exception
        Lc3:
            r5.close()
            if (r9 == 0) goto Lcb
            r9.close()
        Lcb:
            throw r0
        Lcc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40423Ftj.LIZJ(int, int, android.content.Context):boolean");
    }
}
