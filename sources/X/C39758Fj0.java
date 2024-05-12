package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import java.util.HashSet;

/* renamed from: X.Fj0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39758Fj0 {
    public static final java.util.Set<Integer> LIZ;
    public static final java.util.Set<Integer> LIZIZ;
    public static final Object LIZJ;
    public static java.util.Set<String> LIZLLL;
    public static final java.util.Set<String> LJ;
    public static final Object LJFF;
    public static InterfaceC39771FjD LJI;

    static {
        HashSet hashSet = new HashSet();
        LIZ = hashSet;
        HashSet hashSet2 = new HashSet();
        LIZIZ = hashSet2;
        LIZJ = new Object();
        hashSet.add(113);
        hashSet.add(114);
        hashSet.add(115);
        hashSet.add(116);
        hashSet.add(121);
        hashSet.add(122);
        hashSet.add(123);
        hashSet2.add(Integer.valueOf(UserLevelGeckoUpdateSetting.DEFAULT));
        hashSet2.add(118);
        hashSet2.add(113);
        hashSet2.add(114);
        hashSet2.add(115);
        hashSet2.add(116);
        hashSet2.add(121);
        hashSet2.add(122);
        hashSet2.add(123);
        LJ = new HashSet();
        LJFF = new Object();
        LJI = new C39768FjA();
    }

    public static void LIZ(Message message) {
        if (message == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Success handle delay message ");
        LIZ2.append(message.what);
        LIZ2.append("!");
        X1D.LIZIZ(LIZ2);
        C39749Fir.LIZ();
        Handler handler = (Handler) EWB.LIZJ();
        synchronized (LIZJ) {
            message.arg2 = 1000089;
            handler.dispatchMessage(message);
        }
    }

    public static boolean LIZIZ(Message message) {
        boolean z;
        if (message.getTarget() != EWB.LIZJ()) {
            return false;
        }
        if (!((HashSet) LIZ).contains(Integer.valueOf(message.what))) {
            return false;
        }
        java.util.Set<String> set = LIZLLL;
        if (set != null && !set.isEmpty()) {
            C39761Fj3 LIZ2 = C39761Fj3.LIZ(message);
            synchronized (LJFF) {
                if (message.what == 114 && LJI.LIZIZ(LIZ2.LIZ)) {
                    ((HashSet) LJ).add(LIZ2.LIZLLL);
                }
                if (!LJI.LIZIZ(LIZ2.LIZ)) {
                    if (!((HashSet) LJ).contains(LIZ2.LIZLLL)) {
                        z = false;
                    }
                }
                z = true;
            }
            if (z) {
                return false;
            }
        }
        return true;
    }
}
