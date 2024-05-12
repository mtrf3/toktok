package X;

import android.app.ActivityManager;
import android.content.Context;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Iy2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48334Iy2 {
    public static final HashMap<String, C48334Iy2> LJFF = new HashMap<>();
    public final Context LIZ;
    public final String LIZIZ;
    public C48338Iy6 LIZJ;
    public int LIZLLL;
    public boolean LJ;

    public C48334Iy2(Context context, String scene) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(scene, "scene");
        this.LIZ = context;
        this.LIZIZ = scene;
    }

    public static final C48334Iy2 LIZ(Context context, String scene) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(scene, "scene");
        HashMap<String, C48334Iy2> hashMap = LJFF;
        if (hashMap.get(scene) == null) {
            hashMap.put(scene, new C48334Iy2(context, scene));
        }
        C48334Iy2 c48334Iy2 = hashMap.get(scene);
        o.LJI(c48334Iy2);
        return c48334Iy2;
    }

    public final C48338Iy6 LIZIZ(Context context, String str) {
        ActivityManager activityManager;
        if (context != null && (activityManager = (ActivityManager) C16880lQ.LLILL(context, "activity")) != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            C48338Iy6 c48338Iy6 = new C48338Iy6();
            HTP.LJLJL.getClass();
            long j = 1024;
            c48338Iy6.LIZ = 0 / j;
            long j2 = memoryInfo.totalMem;
            long j3 = memoryInfo.availMem;
            c48338Iy6.LIZIZ = ((j2 - j3) / j) / j;
            c48338Iy6.LIZJ = (j3 / j) / j;
            StringBuilder LIZLLL = C06540Nm.LIZLLL("av-performance\nmonitor instant value => \nscene = ", this.LIZIZ, ", action = ", str, "\ncurrent memory snapshot: app memory usage = ");
            LIZLLL.append(c48338Iy6.LIZ);
            LIZLLL.append(" Mb, system memory usage = ");
            LIZLLL.append(c48338Iy6.LIZIZ);
            LIZLLL.append(" Mb, available memory = ");
            String LIZJ = C0H1.LIZJ(LIZLLL, c48338Iy6.LIZJ, " Mb. ", LIZLLL);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('\n');
            LIZ.append(LIZJ);
            H7B.LJ(X1D.LIZIZ(LIZ));
            return c48338Iy6;
        }
        return null;
    }
}
