package X;

import Y.ARunnableS42S0100000_6;
import android.content.Context;
import android.os.Handler;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class EVJ implements EVL {
    public Object LJLIL;
    public Method LJLILLLLZI;
    public Method LJLJI;
    public Method LJLJJI;
    public Method LJLJJL;
    public EVK LJLJJLL;

    public static Object LIZLLL(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-7467939087487508593"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // X.EVL
    public final void release() {
        try {
            LIZLLL(this.LJLIL, this.LJLJJL, new Object[0]);
        } catch (Throwable th) {
            EVK evk = this.LJLJJLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("cpuboost release fail");
            LIZ.append(th.getMessage());
            evk.LIZIZ(X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.EVL
    public final boolean LIZ(long j) {
        return LJ(8, j);
    }

    @Override // X.EVL
    public final boolean LIZJ(long j) {
        if (LJ(23, j) || LJ(4, j)) {
            return true;
        }
        return false;
    }

    @Override // X.EVL
    public final void LIZIZ(EVK evk, Context context) {
        this.LJLJJLL = evk;
        try {
            Class<?> cls = Class.forName("com.mediatek.perfservice.PerfServiceWrapper");
            try {
                this.LJLIL = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused) {
                this.LJLIL = cls.getConstructor(Context.class).newInstance(context);
            }
            this.LJLILLLLZI = cls.getDeclaredMethod("userRegScn", new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            this.LJLJI = cls.getDeclaredMethod("userRegScnConfig", cls2, cls2, cls2, cls2, cls2, cls2);
            this.LJLJJI = cls.getDeclaredMethod("userEnable", cls2);
            this.LJLJJL = cls.getDeclaredMethod("userResetAll", new Class[0]);
        } catch (Throwable th) {
            EVK evk2 = this.LJLJJLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("cpuboost init fail: ");
            LIZ.append(th.getMessage());
            evk2.LIZIZ(X1D.LIZIZ(LIZ));
        }
    }

    public final boolean LJ(int i, long j) {
        boolean z = false;
        if (j <= 0) {
            return false;
        }
        try {
            int intValue = ((Integer) LIZLLL(this.LJLIL, this.LJLILLLLZI, new Object[0])).intValue();
            LIZLLL(this.LJLIL, this.LJLJI, new Object[]{Integer.valueOf(intValue), Integer.valueOf(i), 1000, 0, 0, 0});
            LIZLLL(this.LJLIL, this.LJLJJI, new Object[]{Integer.valueOf(intValue)});
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS42S0100000_6(this, 117), j);
            z = true;
            return true;
        } catch (Throwable th) {
            EVK evk = this.LJLJJLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("cpuboost boost fail: ");
            LIZ.append(th.getMessage());
            evk.LIZIZ(X1D.LIZIZ(LIZ));
            return z;
        }
    }
}
