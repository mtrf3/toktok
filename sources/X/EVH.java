package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import java.lang.reflect.Method;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public final class EVH implements EVL {
    public static Object LJLJJL;
    public static Method LJLJJLL;
    public static Method LJLJL;
    public EVK LJLIL;
    public static final int[] LJLILLLLZI = {1082146816, 4095, 1082147072, 4095, 1082130432, 4095, 1082130688, 4095, 1077936128, 1};
    public static final int[] LJLJI = {1115701248, 1, 1115734016, LiveNetAdaptiveHurryTimeSetting.DEFAULT};
    public static final int[] LJLJJI = {1077936128, 1};
    public static final CopyOnWriteArrayList<Integer> LJLJLJ = new CopyOnWriteArrayList<>();

    public static Object LIZLLL(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-7465108342134241914"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // X.EVL
    public final void release() {
        if (LJLJL != null && LJLJJL != null) {
            int i = 0;
            while (true) {
                try {
                    CopyOnWriteArrayList<Integer> copyOnWriteArrayList = LJLJLJ;
                    if (i < copyOnWriteArrayList.size()) {
                        LIZLLL(LJLJJL, LJLJL, new Object[]{copyOnWriteArrayList.get(i)});
                        i++;
                    } else {
                        copyOnWriteArrayList.clear();
                        return;
                    }
                } catch (Throwable th) {
                    EVK evk = this.LJLIL;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("cpuboost release fail");
                    LIZ.append(th.getMessage());
                    evk.LIZIZ(X1D.LIZIZ(LIZ));
                    return;
                }
            }
        }
    }

    @Override // X.EVL
    public final boolean LIZ(long j) {
        return LJ(j, LJLJI);
    }

    @Override // X.EVL
    public final boolean LIZJ(long j) {
        LJ(j, LJLJJI);
        return LJ(j, LJLILLLLZI);
    }

    @Override // X.EVL
    public final void LIZIZ(EVK evk, Context context) {
        this.LJLIL = evk;
        try {
            Class<?> LIZIZ = C36512EUq.LIZIZ("android.util.BoostFramework");
            LIZIZ.getDeclaredMethods();
            try {
                LJLJJL = C36512EUq.LIZJ(LIZIZ, Context.class).newInstance(context);
            } catch (Throwable unused) {
                LJLJJL = C36512EUq.LIZJ(LIZIZ, new Class[0]).newInstance(new Object[0]);
            }
            Class cls = Integer.TYPE;
            LJLJJLL = C36512EUq.LJ(LIZIZ, "perfLockAcquire", cls, int[].class);
            LJLJL = C36512EUq.LJ(LIZIZ, "perfLockReleaseHandler", cls);
        } catch (Throwable th) {
            EVK evk2 = this.LJLIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("cpuboost init fail: ");
            LIZ.append(th.getMessage());
            evk2.LIZIZ(X1D.LIZIZ(LIZ));
        }
    }

    public final boolean LJ(long j, int[] iArr) {
        if (j <= 0) {
            return false;
        }
        try {
            if (LJLJJL != null && LJLJJLL != null) {
                int intValue = ((Integer) LIZLLL(LJLJJL, LJLJJLL, new Object[]{Integer.valueOf((int) j), iArr})).intValue();
                if (intValue != 0) {
                    LJLJLJ.add(Integer.valueOf(intValue));
                }
            }
            return true;
        } catch (Throwable th) {
            EVK evk = this.LJLIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("cpuboost boost fail:");
            LIZ.append(th.getMessage());
            evk.LIZIZ(X1D.LIZIZ(LIZ));
            return false;
        }
    }
}
