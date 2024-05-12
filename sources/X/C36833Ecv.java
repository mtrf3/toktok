package X;

import android.app.ActivityManager;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ecv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36833Ecv {
    public static long LIZ = Long.MAX_VALUE;
    public static boolean LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static C73411SrX LJ;
    public static C36832Ecu LJFF;
    public static final List<InterfaceC36830Ecs> LJI = new ArrayList();
    public static final C36834Ecw LJII = new C36834Ecw();

    public static boolean LIZ(AwemeHostApplication awemeHostApplication) {
        if (awemeHostApplication == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) C16880lQ.LLILL(awemeHostApplication, "activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.importance == 100) {
                String[] strArr = runningAppProcessInfo.pkgList;
                for (String str : strArr) {
                    if (str.equals(awemeHostApplication.getPackageName())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
