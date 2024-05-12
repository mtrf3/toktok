package X;

import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class EVA extends QXX {
    public Object LJLIL;
    public final Method LJLILLLLZI;
    public final Method LJLJI;
    public final Method LJLJJI;
    public final Method LJLJJL;
    public final Method LJLJJLL;
    public final int LJLJL;

    public static Object LLLLZIL(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "5460894925093433205"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // X.QXX
    public final int LJJLIIIJL() {
        Method method;
        Object LLLLZ;
        Object obj = this.LJLIL;
        if (obj == null || (method = this.LJLJJL) == null || (LLLLZ = LLLLZ(obj, method, new Object[0])) == null) {
            return -1;
        }
        return ((Integer) LLLLZ).intValue();
    }

    @Override // X.QXX
    public final void LJJLJLI() {
        Method method;
        Object obj = this.LJLIL;
        if (obj != null && (method = this.LJLJJLL) != null) {
            LLLLZ(obj, method, new Object[0]);
            C48284IxE.LIZ(2, this.LJLJL, "TR_AdaptiveSharpenWrapper", "ReleaseAdaptiveSharpen");
        }
        this.LJLIL = null;
    }

    public EVA(int i) {
        super((Object) null);
        this.LJLJL = -1;
        this.LJLJL = i;
        C48284IxE.LIZ(2, i, "TR_AdaptiveSharpenWrapper", "new AdaptiveSharpenWrapper");
        try {
            Class LIZ = EVB.LIZ("com.ss.lens.algorithm.AdaptiveSharpen");
            Class<?> cls = Boolean.TYPE;
            Class<?> cls2 = Integer.TYPE;
            this.LJLILLLLZI = LIZ.getDeclaredMethod("InitAdaptiveSharpen", cls, cls2, cls2, cls2);
            Class<?> cls3 = Float.TYPE;
            this.LJLJI = LIZ.getDeclaredMethod("AdaptiveSharpenProcess", cls2, cls2, cls2, cls, cls2, cls3, cls3, cls3, cls2);
            this.LJLJJI = LIZ.getDeclaredMethod("AdaptiveSharpenOesProcess", cls2, cls2, cls2, float[].class, cls, cls2, cls3, cls3, cls3, cls2);
            this.LJLJJL = LIZ.getDeclaredMethod("GetAdaptiveSharpenOutput", new Class[0]);
            this.LJLJJLL = LIZ.getDeclaredMethod("ReleaseAdaptiveSharpen", new Class[0]);
            this.LJLIL = LIZ.newInstance();
        } catch (Exception e) {
            int i2 = this.LJLJL;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("AdaptiveSharpen get fail:");
            LIZ2.append(e.toString());
            C48284IxE.LIZ(2, i2, "TR_AdaptiveSharpenWrapper", X1D.LIZIZ(LIZ2));
            this.LJLIL = null;
            this.LJLILLLLZI = null;
            this.LJLJI = null;
            this.LJLJJL = null;
            this.LJLJJLL = null;
        }
    }

    public final Object LLLLZ(Object obj, Method method, Object... objArr) {
        if (method != null && obj != null) {
            try {
                return LLLLZIL(obj, method, objArr);
            } catch (Exception e) {
                C48284IxE.LIZ(6, this.LJLJL, "TR_AdaptiveSharpenWrapper", e.toString());
                return null;
            }
        }
        return null;
    }

    @Override // X.QXX
    public final boolean LJJLIIJ(boolean z, int i, int i2, int i3) {
        Method method;
        Object LLLLZ;
        Object obj = this.LJLIL;
        if (obj == null || (method = this.LJLILLLLZI) == null || (LLLLZ = LLLLZ(obj, method, Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3))) == null) {
            return false;
        }
        return ((Boolean) LLLLZ).booleanValue();
    }

    @Override // X.QXX
    public final int LJJLIIIJJIZ(int i, int i2, int i3, int i4, float f, float f2, float f3, int i5) {
        Method method;
        Object LLLLZ;
        Object obj = this.LJLIL;
        if (obj == null || (method = this.LJLJI) == null || (LLLLZ = LLLLZ(obj, method, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.TRUE, Integer.valueOf(i4), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i5))) == null) {
            return -1;
        }
        return ((Integer) LLLLZ).intValue();
    }

    @Override // X.QXX
    public final int LJJLIIIJ(int i, int i2, int i3, float[] fArr, int i4, float f, float f2, float f3, int i5) {
        Method method;
        Object LLLLZ;
        Object obj = this.LJLIL;
        if (obj == null || (method = this.LJLJJI) == null || (LLLLZ = LLLLZ(obj, method, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fArr, Boolean.TRUE, Integer.valueOf(i4), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i5))) == null) {
            return -1;
        }
        return ((Integer) LLLLZ).intValue();
    }
}
