package X;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class EVI implements EVL {
    public Class LJLIL;
    public Method LJLILLLLZI;
    public Object LJLJI;
    public EVK LJLJJI;

    public static Object LIZLLL(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "8165745636222670882"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // X.EVL
    public final boolean LIZ(long j) {
        return false;
    }

    @Override // X.EVL
    public final void release() {
    }

    @Override // X.EVL
    public final boolean LIZJ(long j) {
        boolean z;
        boolean z2;
        if (j <= 0) {
            return false;
        }
        try {
            int i = Build.VERSION.SDK_INT;
            if (i == 29) {
                LIZLLL(this.LJLJI, this.LJLILLLLZI, new Object[]{Integer.valueOf((int) j)});
            } else {
                if (i != 28) {
                    if (i == 27) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z3 = false | z;
                    if (i == 26) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z3 | z2) {
                    }
                }
                ((Integer) LIZLLL(this.LJLJI, this.LJLILLLLZI, new Object[]{4099, "canBoost=true|screenOn=1", new int[0]})).intValue();
            }
            return true;
        } catch (Throwable th) {
            EVK evk = this.LJLJJI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("cpuboost boost fail:");
            LIZ.append(th);
            evk.LIZIZ(X1D.LIZIZ(LIZ));
            return false;
        }
    }

    @Override // X.EVL
    public final void LIZIZ(EVK evk, Context context) {
        boolean z;
        boolean z2;
        this.LJLJJI = evk;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i == 29) {
                Class<?> LIZIZ = C36512EUq.LIZIZ("android.scrollerboostmanager.ScrollerBoostManager");
                this.LJLJI = LIZLLL(LIZIZ, C36512EUq.LJ(LIZIZ, "getInstance", null), null);
                this.LJLILLLLZI = C36512EUq.LJ(LIZIZ, "listFling", Integer.TYPE);
                LIZIZ.getDeclaredMethod("init", null).invoke(this.LJLJI, null);
            } else {
                if (i != 28) {
                    if (i == 27) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z3 = false | z;
                    if (i == 26) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 | z3) {
                    }
                }
                Class<?> LIZIZ2 = C36512EUq.LIZIZ("android.iawareperf.UniPerf");
                this.LJLIL = LIZIZ2;
                this.LJLILLLLZI = C36512EUq.LJ(LIZIZ2, "uniPerfEvent", Integer.TYPE, String.class, int[].class);
                this.LJLJI = LIZLLL(null, C36512EUq.LJ(this.LJLIL, "getInstance", new Class[0]), new Object[0]);
            }
        } catch (Throwable th) {
            EVK evk2 = this.LJLJJI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("cpuboost init fail:");
            LIZ.append(th);
            evk2.LIZIZ(X1D.LIZIZ(LIZ));
        }
    }
}
