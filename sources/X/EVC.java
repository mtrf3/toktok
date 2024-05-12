package X;

import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class EVC extends QXX {
    public Object LJLIL;
    public final Method LJLILLLLZI;
    public final Method LJLJI;
    public final Method LJLJJI;
    public final Method LJLJJL;
    public final Method LJLJJLL;
    public final int LJLJL;

    public static Object LLLLZIL(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-1169876703959134798"));
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
            C48284IxE.LIZ(2, this.LJLJL, "TR_BMFAdaptiveSharpenWrapper", "ReleaseAdaptiveSharpen");
        }
        this.LJLIL = null;
    }

    public EVC(int i) {
        super((Object) null);
        this.LJLJL = -1;
        this.LJLJL = i;
        C48284IxE.LIZ(2, i, "TR_BMFAdaptiveSharpenWrapper", "new BMFAdaptiveSharpenWrapper");
        try {
            Class LIZ = EVB.LIZ("com.bytedance.bmf_mods.Sharp");
            Class<?> cls = Integer.TYPE;
            Class<?> cls2 = Float.TYPE;
            this.LJLILLLLZI = LIZ.getDeclaredMethod("Init", cls, cls, cls, cls, String.class, cls2, cls2, cls2, Boolean.TYPE, cls2, cls2);
            this.LJLJI = LIZ.getDeclaredMethod("ProcessTexture", cls, cls, cls);
            this.LJLJJI = LIZ.getDeclaredMethod("ProcessOesTexture", cls, cls, cls, float[].class, float[].class, float[].class);
            this.LJLJJL = LIZ.getDeclaredMethod("GetResult", new Class[0]);
            this.LJLJJLL = LIZ.getDeclaredMethod("Free", new Class[0]);
            this.LJLIL = LIZ.newInstance();
        } catch (Exception e) {
            int i2 = this.LJLJL;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("AdaptiveSharpen get fail:");
            LIZ2.append(e.toString());
            C48284IxE.LIZ(2, i2, "TR_BMFAdaptiveSharpenWrapper", X1D.LIZIZ(LIZ2));
            this.LJLIL = null;
            this.LJLILLLLZI = null;
            this.LJLJI = null;
            this.LJLJJL = null;
            this.LJLJJLL = null;
        }
    }

    @Override // X.QXX
    public final int LJJLIIIJJI(int i, int i2, int i3) {
        Method method;
        Object LLLLZ;
        Object obj = this.LJLIL;
        if (obj == null || (method = this.LJLJI) == null || (LLLLZ = LLLLZ(obj, method, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3))) == null) {
            return -1;
        }
        return ((Integer) LLLLZ).intValue();
    }

    public final Object LLLLZ(Object obj, Method method, Object... objArr) {
        if (method != null && obj != null) {
            try {
                return LLLLZIL(obj, method, objArr);
            } catch (Exception e) {
                C48284IxE.LIZ(6, this.LJLJL, "TR_BMFAdaptiveSharpenWrapper", e.toString());
                return null;
            }
        }
        return null;
    }

    @Override // X.QXX
    public final int LJJLIIIJILLIZJL(int i, int i2, int i3, float[] fArr, float[] fArr2, float[] fArr3) {
        Method method;
        Object LLLLZ;
        Object obj = this.LJLIL;
        if (obj == null || (method = this.LJLJJI) == null || (LLLLZ = LLLLZ(obj, method, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fArr, fArr2, fArr3)) == null) {
            return -1;
        }
        return ((Integer) LLLLZ).intValue();
    }

    @Override // X.QXX
    public final int LJJLIIIJLLLLLLLZ(int i, int i2, int i3, int i4, String str, float f, float f2, float f3, boolean z, float f4, float f5) {
        Object LLLLZ = LLLLZ(this.LJLIL, this.LJLILLLLZI, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Boolean.valueOf(z), Float.valueOf(f4), Float.valueOf(f5));
        if (LLLLZ == null) {
            return -1;
        }
        return ((Integer) LLLLZ).intValue();
    }
}
