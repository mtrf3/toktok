package X;

import android.graphics.Paint;
import android.os.Build;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.ObZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62229ObZ {
    public static final List<String> LIZ;
    public static final Paint LIZIZ;
    public static final Lock LIZJ;

    static {
        Lock lockC62230Oba;
        List<String> LJJIJIIJI = C47261Igj.LJJIJIIJI("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098");
        LIZ = LJJIJIIJI;
        LIZIZ = new Paint(6);
        if (LJJIJIIJI.contains(Build.MODEL) && Build.VERSION.SDK_INT == 22) {
            lockC62230Oba = new ReentrantLock();
        } else {
            lockC62230Oba = new LockC62230Oba();
        }
        LIZJ = lockC62230Oba;
    }
}
