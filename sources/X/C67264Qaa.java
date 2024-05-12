package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Qaa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C67264Qaa {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static final AtomicBoolean LIZ = new AtomicBoolean();
    public static final AtomicBoolean LIZLLL = new AtomicBoolean();

    public static boolean LIZ(Context context) {
        if (!LIZJ) {
            try {
                PackageInfo LIZIZ2 = QCX.LIZ(context).LIZIZ(64, "com.google.android.gms");
                C68435QtT.LIZ(context);
                if (LIZIZ2 != null && !C68435QtT.LIZLLL(LIZIZ2, false) && C68435QtT.LIZLLL(LIZIZ2, true)) {
                    LIZIZ = true;
                } else {
                    LIZIZ = false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } finally {
                LIZJ = true;
            }
        }
        if (!LIZIZ && "user".equals(Build.TYPE)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e2, code lost:
    
        if (r6.signatures[0].equals(r5.signatures[0]) == false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZIZ(android.content.Context r9, int r10) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67264Qaa.LIZIZ(android.content.Context, int):int");
    }

    public static boolean LIZJ(Context context, String str) {
        ApplicationInfo LLLLLLLLL;
        boolean equals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            LLLLLLLLL = C16880lQ.LLLLLLLLL(context.getPackageManager(), str, FileUtils.BUFFER_SIZE);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        if (equals) {
            return LLLLLLLLL.enabled;
        }
        if (LLLLLLLLL.enabled) {
            Object LLILL = C16880lQ.LLILL(context, "user");
            QH7.LJIIIIZZ(LLILL);
            Bundle applicationRestrictions = ((UserManager) LLILL).getApplicationRestrictions(context.getPackageName());
            if (applicationRestrictions == null || !"true".equals(applicationRestrictions.getString("restricted_profile"))) {
                return true;
            }
        }
        return false;
    }
}
