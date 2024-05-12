package X;

import android.content.Context;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class EVE extends QXX {
    public Object LJLIL;
    public Method LJLILLLLZI;
    public Method LJLJI;
    public Method LJLJJI;
    public Method LJLJJL;
    public Method LJLJJLL;
    public Method LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public final int LJLL;
    public final boolean LJLLI;

    public static Object LLLLZLLIL(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-1578639416431459725"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // X.QXX
    public final void LJJLL() {
        Method method;
        Object obj = this.LJLIL;
        if (obj != null && (method = this.LJLJL) != null) {
            LLLLZIL(obj, method, new Object[0]);
            C48284IxE.LIZ(2, this.LJLL, "VideoOCLSRBmfWrapper", "FreeVideoOclSr");
        }
        this.LJLIL = null;
    }

    public final void LLLLZ() {
        Class LIZ;
        try {
            if (this.LJLLI) {
                LIZ = EVB.LIZ("com.bytedance.bmf_mods_lite.VideoSuperResolution");
            } else {
                LIZ = EVB.LIZ("com.bytedance.bmf_mods.VideoSuperResolution");
            }
            Class<?> cls = Integer.TYPE;
            this.LJLILLLLZI = LIZ.getDeclaredMethod("Init", cls, cls, cls, cls, String.class, String.class, String.class, cls, cls);
            Class<?> cls2 = Long.TYPE;
            this.LJLJI = LIZ.getDeclaredMethod("ProcessTexture", cls, cls, cls, cls, cls, cls, cls, cls, cls2);
            this.LJLJJI = LIZ.getDeclaredMethod("ProcessOesTexture", cls, cls, cls, float[].class, cls, cls, cls, cls, cls, cls2);
            try {
                this.LJLJJL = LIZ.getDeclaredMethod("ProcessMultiScaleTexture", cls, cls, cls, cls, cls, cls, cls, cls, cls2, cls, cls);
            } catch (Exception e) {
                int i = this.LJLL;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("getmethod error:");
                LIZ2.append(e.toString());
                LIZ2.append(", old bmf version maybe");
                C48284IxE.LIZ(6, i, "VideoOCLSRBmfWrapper", X1D.LIZIZ(LIZ2));
            }
            try {
                Class<?> cls3 = Integer.TYPE;
                this.LJLJJLL = LIZ.getDeclaredMethod("ProcessMultiScaleOesTexture", cls3, cls3, cls3, float[].class, cls3, cls3, cls3, cls3, cls3, Long.TYPE, cls3, cls3);
            } catch (Exception e2) {
                int i2 = this.LJLL;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("getmethod error:");
                LIZ3.append(e2.toString());
                LIZ3.append(", old bmf version maybe");
                C48284IxE.LIZ(6, i2, "VideoOCLSRBmfWrapper", X1D.LIZIZ(LIZ3));
            }
            this.LJLJL = LIZ.getDeclaredMethod("Free", new Class[0]);
            this.LJLIL = LIZ.getConstructor(Context.class).newInstance(C47988IsS.LIZLLL().LIZLLL);
        } catch (Exception e3) {
            int i3 = this.LJLL;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("VideoOCLSR get fail:");
            LIZ4.append(e3.toString());
            C48284IxE.LIZ(6, i3, "VideoOCLSRBmfWrapper", X1D.LIZIZ(LIZ4));
            this.LJLIL = null;
            this.LJLILLLLZI = null;
            this.LJLJL = null;
            this.LJLJI = null;
            this.LJLJJI = null;
        }
    }

    @Override // X.QXX
    public final int LJJLIIIJLJLI() {
        return this.LJLJLLL;
    }

    public EVE(int i, boolean z) {
        super((Object) null);
        this.LJLJLLL = -1;
        this.LJLL = -1;
        this.LJLL = i;
        this.LJLLI = z;
        C48284IxE.LIZ(2, i, "VideoOCLSRBmfWrapper", "new VideoOCLSRBmfWrapper");
        LLLLZ();
    }

    public final Object LLLLZIL(Object obj, Method method, Object... objArr) {
        if (method != null && obj != null) {
            try {
                return LLLLZLLIL(obj, method, objArr);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                C48284IxE.LIZ(6, this.LJLL, "VideoOCLSRBmfWrapper", e.toString());
                return null;
            }
        }
        return null;
    }

    @Override // X.QXX
    public final boolean LJJLIL(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4, boolean z) {
        return LJJLJ(str, i, z, false, 1920, 3840, str2, i2, i3, i4, str3, str4);
    }

    @Override // X.QXX
    public final int LJJZZI(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, int i9) {
        Object obj;
        if (this.LJLIL == null || this.LJLJI == null) {
            LLLLZ();
        }
        if (this.LJLJLJ < 7) {
            obj = LLLLZIL(this.LJLIL, this.LJLJI, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Long.valueOf(j));
        } else {
            Method method = this.LJLJJL;
            if (method != null) {
                obj = LLLLZIL(this.LJLIL, method, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Long.valueOf(j), 0, Integer.valueOf(i9));
            } else {
                obj = null;
            }
        }
        if (obj == null) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        this.LJLJLLL = intValue;
        if (intValue != -1) {
            int i10 = this.LJLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("bmfTextureProcess sucess, scale type: ");
            LIZ.append(i9);
            C48284IxE.LIZ(1, i10, "VideoOCLSRBmfWrapper", X1D.LIZIZ(LIZ));
        }
        return ((Integer) obj).intValue();
    }

    @Override // X.QXX
    public final int LJJZ(int i, int i2, int i3, float[] fArr, int i4, int i5, int i6, int i7, int i8, long j, int i9) {
        Object obj;
        if (this.LJLIL == null || this.LJLJJI == null) {
            LLLLZ();
        }
        if (this.LJLJLJ < 7) {
            obj = LLLLZIL(this.LJLIL, this.LJLJJI, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fArr, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Long.valueOf(j));
        } else {
            Method method = this.LJLJJLL;
            if (method != null) {
                obj = LLLLZIL(this.LJLIL, method, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fArr, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Long.valueOf(j), 0, Integer.valueOf(i9));
            } else {
                obj = null;
            }
        }
        if (obj == null) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        this.LJLJLLL = intValue;
        if (intValue != -1) {
            int i10 = this.LJLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("bmfTextureProcess oes sucess, scale type: ");
            LIZ.append(i9);
            C48284IxE.LIZ(1, i10, "VideoOCLSRBmfWrapper", X1D.LIZIZ(LIZ));
        }
        return ((Integer) obj).intValue();
    }

    @Override // X.QXX
    public final boolean LJJLJ(String str, int i, boolean z, boolean z2, int i2, int i3, String str2, int i4, int i5, int i6, String str3, String str4) {
        Object LLLLZIL;
        if (this.LJLIL == null) {
            LLLLZ();
        }
        this.LJLJLJ = i;
        if (this.LJLIL != null) {
            if (str2 != null && str2.length() > 0) {
                int i7 = this.LJLL;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("mInitWithLicenseMethod ");
                LIZ.append(str2);
                C48284IxE.LIZ(2, i7, "VideoOCLSRBmfWrapper", X1D.LIZIZ(LIZ));
                LLLLZIL = LLLLZIL(this.LJLIL, this.LJLILLLLZI, Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str3, str2, str4, Integer.valueOf(i3), Integer.valueOf(i2));
            } else {
                Method method = this.LJLILLLLZI;
                if (method != null) {
                    LLLLZIL = LLLLZIL(this.LJLIL, method, Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str3, "", str4, Integer.valueOf(i3), Integer.valueOf(i2));
                }
            }
            if (LLLLZIL != null && ((Integer) LLLLZIL).intValue() == 0) {
                return true;
            }
        }
        return false;
    }
}
