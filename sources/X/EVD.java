package X;

import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class EVD extends QXX {
    public Object LJLIL;
    public Method LJLILLLLZI;
    public Method LJLJI;
    public Method LJLJJI;
    public Method LJLJJL;
    public Method LJLJJLL;
    public Method LJLJL;
    public Method LJLJLJ;
    public Method LJLJLLL;
    public final int LJLL;

    public static Object LLLLZLLIL(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "4448936863132079768"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // X.QXX
    public final int LJJLIIIJLJLI() {
        if (this.LJLIL == null || this.LJLJLJ == null) {
            LLLLZ();
        }
        Object LLLLZIL = LLLLZIL(this.LJLIL, this.LJLJLJ, new Object[0]);
        if (LLLLZIL == null) {
            return -1;
        }
        return ((Integer) LLLLZIL).intValue();
    }

    @Override // X.QXX
    public final void LJJLL() {
        Method method;
        Object obj = this.LJLIL;
        if (obj != null && (method = this.LJLJLLL) != null) {
            LLLLZIL(obj, method, new Object[0]);
            C48284IxE.LIZ(2, this.LJLL, "VideoOCLSRWrapper", "ReleaseVideoOclSr");
        }
        this.LJLIL = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLZ() {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EVD.LLLLZ():void");
    }

    public EVD(int i) {
        super((Object) null);
        this.LJLL = -1;
        this.LJLL = i;
        C48284IxE.LIZ(2, i, "VideoOCLSRWrapper", "new VideoOCLSRWrapper");
        LLLLZ();
    }

    public final Object LLLLZIL(Object obj, Method method, Object... objArr) {
        if (method != null && obj != null) {
            try {
                return LLLLZLLIL(obj, method, objArr);
            } catch (Exception e) {
                C48284IxE.LIZ(6, this.LJLL, "VideoOCLSRWrapper", e.toString());
                return null;
            }
        }
        return null;
    }

    @Override // X.QXX
    public final boolean LJJLIL(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4, boolean z) {
        Object LLLLZIL;
        if (this.LJLIL == null || this.LJLJJL == null) {
            LLLLZ();
        }
        Object obj = this.LJLIL;
        if (obj == null) {
            return false;
        }
        if (this.LJLJJL != null) {
            int i5 = this.LJLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("mInitWithLicenseMethod ");
            LIZ.append(str2);
            C48284IxE.LIZ(2, i5, "VideoOCLSRWrapper", X1D.LIZIZ(LIZ));
            LLLLZIL = LLLLZIL(this.LJLIL, this.LJLJJL, str, Integer.valueOf(i), Boolean.valueOf(z), Boolean.TRUE, str2, 720, 1440);
        } else {
            Method method = this.LJLILLLLZI;
            if (method == null) {
                return false;
            }
            LLLLZIL = LLLLZIL(obj, method, str, Integer.valueOf(i), Boolean.valueOf(z));
        }
        if (LLLLZIL == null || !((Boolean) LLLLZIL).booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // X.QXX
    public final int LJJZZI(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, int i9) {
        if (this.LJLIL == null || this.LJLJL == null) {
            LLLLZ();
        }
        Object LLLLZIL = LLLLZIL(this.LJLIL, this.LJLJL, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.TRUE);
        if (LLLLZIL != null) {
            C48284IxE.LIZ(1, this.LJLL, "VideoOCLSRWrapper", "lensTextureProcess sucess");
            return ((Integer) LLLLZIL).intValue();
        }
        return -1;
    }

    @Override // X.QXX
    public final int LJJZ(int i, int i2, int i3, float[] fArr, int i4, int i5, int i6, int i7, int i8, long j, int i9) {
        if (this.LJLIL == null || this.LJLJJLL == null) {
            LLLLZ();
        }
        Object LLLLZIL = LLLLZIL(this.LJLIL, this.LJLJJLL, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fArr, Boolean.TRUE);
        if (LLLLZIL != null) {
            C48284IxE.LIZ(1, this.LJLL, "VideoOCLSRWrapper", "lensTextureProcess sucess");
            return ((Integer) LLLLZIL).intValue();
        }
        return -1;
    }

    @Override // X.QXX
    public final boolean LJJLJ(String str, int i, boolean z, boolean z2, int i2, int i3, String str2, int i4, int i5, int i6, String str3, String str4) {
        Object LLLLZIL;
        if (this.LJLIL == null || this.LJLJJL == null) {
            LLLLZ();
        }
        Object obj = this.LJLIL;
        if (obj == null) {
            return false;
        }
        if (this.LJLJJL != null) {
            int i7 = this.LJLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("mInitWithLicenseMethod ");
            LIZ.append(str2);
            C48284IxE.LIZ(2, i7, "VideoOCLSRWrapper", X1D.LIZIZ(LIZ));
            LLLLZIL = LLLLZIL(this.LJLIL, this.LJLJJL, str, Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2), str2, Integer.valueOf(i2), Integer.valueOf(i3));
        } else {
            Method method = this.LJLJJI;
            if (method != null) {
                LLLLZIL = LLLLZIL(obj, method, str, Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i2), Integer.valueOf(i3));
            } else if (this.LJLJI != null) {
                C48284IxE.LIZ(2, this.LJLL, "VideoOCLSRWrapper", "mInitMethodMaxMalisync null, use mInitMethodMax");
                LLLLZIL = LLLLZIL(this.LJLIL, this.LJLJI, str, Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3));
            } else {
                if (this.LJLILLLLZI == null) {
                    return false;
                }
                C48284IxE.LIZ(2, this.LJLL, "VideoOCLSRWrapper", "mInitMethodMaxMalisync/mInitMethodMax null,use mInitMethod");
                LLLLZIL = LLLLZIL(this.LJLIL, this.LJLILLLLZI, str, Integer.valueOf(i), Boolean.valueOf(z));
            }
        }
        if (LLLLZIL == null || !((Boolean) LLLLZIL).booleanValue()) {
            return false;
        }
        return true;
    }
}
