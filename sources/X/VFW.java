package X;

import android.os.Bundle;

/* loaded from: classes15.dex */
public final class VFW extends AbstractC79424VFc {
    public VFV LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public boolean LJIILLIIL;
    public float LJIIZILJ;
    public float LJIJ;
    public float LJIJI;
    public float LJIJJ;
    public float LJIJJLI;
    public float LJIL;
    public float[] LJJ;

    @Override // X.AbstractC79424VFc
    public final AbstractC79424VFc LJ() {
        VFV vfv = this.LJIIJJI;
        vfv.LIZ(vfv.LIZ, vfv.LJ, new Object[0]);
        vfv.LIZ = null;
        vfv.LIZIZ = null;
        vfv.LJ = null;
        vfv.LIZJ = null;
        this.LJIIJJI = null;
        C48284IxE.LIZ(2, this.LJIIIZ, "AdaptiveGrading", "release");
        AbstractC79424VFc abstractC79424VFc = this.LJIIIIZZ;
        LJFF();
        return abstractC79424VFc;
    }

    public VFW(int i) {
        super(i, 14);
        this.LJIIL = 2000L;
        this.LIZLLL = 6;
        this.LJIIJJI = new VFV(i);
    }

    @Override // X.AbstractC79424VFc
    public final int LIZIZ(Bundle bundle) {
        String str;
        super.LIZIZ(bundle);
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        float[] fArr3 = new float[2];
        if (bundle != null) {
            this.LJIILJJIL = bundle.getInt("max_width");
            this.LJIILL = bundle.getInt("max_height");
            str = bundle.getString("cache_file");
            this.LJIIL = bundle.getLong("gop_time_ms");
            fArr = bundle.getFloatArray("brightness_threshold");
            fArr2 = bundle.getFloatArray("contrast_threshold");
            fArr3 = bundle.getFloatArray("saturation_threshold");
        } else {
            str = "";
        }
        int i = this.LJIIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdaptiveGrading width=");
        LIZ.append(this.LJIILJJIL);
        LIZ.append("::height=");
        C79062V1e.LJII(LIZ, this.LJIILL, LIZ, 2, i, "AdaptiveGrading");
        VFV vfv = this.LJIIJJI;
        int i2 = this.LJIILJJIL;
        int i3 = this.LJIILL;
        if (vfv.LIZ == null || vfv.LIZIZ == null) {
            try {
                Class LIZ2 = EVB.LIZ("com.bytedance.bmf_mods.AdaptiveGrading");
                Class<?> cls = Integer.TYPE;
                vfv.LIZIZ = LIZ2.getDeclaredMethod("Init", cls, cls, String.class, float[].class, float[].class, float[].class);
                Class<?> cls2 = Float.TYPE;
                Class<?> cls3 = Boolean.TYPE;
                vfv.LIZJ = LIZ2.getDeclaredMethod("ProcessTexture", cls, cls, cls, cls2, cls2, cls2, cls2, cls2, cls2, cls3);
                vfv.LIZLLL = LIZ2.getDeclaredMethod("ProcessOesTexture", cls, cls, cls, float[].class, cls2, cls2, cls2, cls2, cls2, cls2, cls3);
                vfv.LJ = LIZ2.getDeclaredMethod("Free", new Class[0]);
                vfv.LIZ = LIZ2.newInstance();
            } catch (Exception e) {
                int i4 = vfv.LJFF;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("VideoOCLSR get fail:");
                LIZ3.append(e.toString());
                C48284IxE.LIZ(6, i4, "AdaptiveGradingWrapper", X1D.LIZIZ(LIZ3));
                vfv.LIZ = null;
                vfv.LIZIZ = null;
                vfv.LJ = null;
                vfv.LIZJ = null;
            }
        }
        if (i2 <= 0) {
            i2 = 1440;
        }
        if (i3 <= 0) {
            i3 = 720;
        }
        vfv.LJI = i3;
        Object LIZ4 = vfv.LIZ(vfv.LIZ, vfv.LIZIZ, Integer.valueOf(i2), Integer.valueOf(vfv.LJI), str, fArr, fArr2, fArr3);
        if (LIZ4 != null && (LIZ4 instanceof Integer) && ((Integer) LIZ4).intValue() >= 0) {
            return 0;
        }
        int i5 = vfv.LJFF;
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("AdaptiveGrading init error:");
        LIZ5.append(LIZ4);
        C48284IxE.LIZ(2, i5, "AdaptiveGrading", X1D.LIZIZ(LIZ5));
        vfv.LIZ(vfv.LIZ, vfv.LJ, new Object[0]);
        vfv.LIZ = null;
        vfv.LIZIZ = null;
        vfv.LJ = null;
        vfv.LIZJ = null;
        return -1;
    }

    @Override // X.AbstractC79424VFc
    public final void LJIIIZ(Bundle bundle) {
        super.LJIIIZ(bundle);
        if (bundle == null) {
            return;
        }
        try {
            this.LJIIZILJ = LJIIJJI(bundle, "dst_brightness", this.LJIIZILJ);
            this.LJIJ = LJIIJJI(bundle, "dst_contrast", this.LJIJ);
            this.LJIJI = LJIIJJI(bundle, "dst_saturation", this.LJIJI);
            this.LJIL = LJIIJJI(bundle, "src_saturation", this.LJIL);
            this.LJIJJLI = LJIIJJI(bundle, "src_contrast", this.LJIJJLI);
            this.LJIJJ = LJIIJJI(bundle, "src_brightness", this.LJIJJ);
            boolean z = bundle.getBoolean("is_new_frame");
            this.LJIILLIIL = z;
            if (z) {
                this.LJIILIIL = 0L;
                this.LJIJJ = 0.0f;
                this.LJIJJLI = 0.0f;
                this.LJIL = 0.0f;
            }
        } catch (Exception e) {
            int i = this.LJIIIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AdaptiveGrading ex=");
            LIZ.append(e.toString());
            C48284IxE.LIZ(2, i, "AdaptiveGrading", X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.AbstractC79424VFc
    public final VFZ LIZLLL(VFZ vfz, VG6 vg6) {
        VFZ vfz2;
        int i;
        if (this.LJ == null || this.LJIIJJI == null || vfz == null) {
            C48284IxE.LIZ(2, this.LJIIIZ, "AdaptiveGrading", "process mAdaptiveGradingWrappers null");
            return vfz;
        }
        float f = this.LJIJJ;
        if (f == -1.0f && this.LJIJJLI == -1.0f && this.LJIL == -1.0f) {
            C48284IxE.LIZ(2, this.LJIIIZ, "AdaptiveGrading", "process no need");
            return vfz;
        }
        if (f == 0.0f && this.LJIJJLI == 0.0f && this.LJIL == 0.0f) {
            if (System.currentTimeMillis() - this.LJIILIIL <= this.LJIIL) {
                return vfz;
            }
            this.LJIJJ = -2.0f;
            this.LJIJJLI = -2.0f;
            this.LJIL = -2.0f;
        }
        if (vfz.LJ == 36197) {
            if (this.LJJ == null) {
                this.LJJ = new float[16];
            }
            this.LJ.getTransformMatrix(this.LJJ);
            VFV vfv = this.LJIIJJI;
            int i2 = vfz.LIZ;
            int i3 = vfz.LIZJ;
            int i4 = vfz.LIZLLL;
            float[] fArr = this.LJJ;
            float f2 = this.LJIJJ;
            float f3 = this.LJIIZILJ;
            float f4 = this.LJIJJLI;
            float f5 = this.LJIJ;
            float f6 = this.LJIL;
            float f7 = this.LJIJI;
            boolean z = this.LJIILLIIL;
            Object obj = vfv.LIZ;
            if (obj == null || vfv.LIZIZ == null) {
                C48284IxE.LIZ(2, vfv.LJFF, "AdaptiveGrading", "AdaptiveGrading oes mInitMethod null");
            } else if (i2 < 0 || i3 <= 0 || i4 <= 0) {
                C48284IxE.LIZ(2, vfv.LJFF, "AdaptiveGrading", "AdaptiveGrading oes width height = 0");
            } else {
                Object LIZ = vfv.LIZ(obj, vfv.LIZLLL, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fArr, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f6), Float.valueOf(f7), Boolean.valueOf(z));
                if (LIZ != null && (LIZ instanceof Integer)) {
                    Integer num = (Integer) LIZ;
                    if (num.intValue() >= 0) {
                        i2 = num.intValue();
                    }
                }
            }
            if (i2 == vfz.LIZ) {
                i = vfz.LJ;
            } else {
                i = 3553;
            }
            vfz2 = new VFZ(null, i2, vfz.LIZJ, vfz.LIZLLL, i);
        } else {
            VFV vfv2 = this.LJIIJJI;
            int i5 = vfz.LIZ;
            int i6 = vfz.LIZJ;
            int i7 = vfz.LIZLLL;
            float f8 = this.LJIJJ;
            float f9 = this.LJIIZILJ;
            float f10 = this.LJIJJLI;
            float f11 = this.LJIJ;
            float f12 = this.LJIL;
            float f13 = this.LJIJI;
            boolean z2 = this.LJIILLIIL;
            Object obj2 = vfv2.LIZ;
            if (obj2 == null || vfv2.LIZIZ == null) {
                C48284IxE.LIZ(2, vfv2.LJFF, "AdaptiveGrading", "AdaptiveGrading mInitMethod null");
            } else if (i5 < 0 || i6 <= 0 || i7 <= 0) {
                C48284IxE.LIZ(2, vfv2.LJFF, "AdaptiveGrading", "AdaptiveGrading width height = 0");
            } else {
                Object LIZ2 = vfv2.LIZ(obj2, vfv2.LIZJ, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Float.valueOf(f8), Float.valueOf(f9), Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13), Boolean.valueOf(z2));
                if (LIZ2 != null && (LIZ2 instanceof Integer)) {
                    Integer num2 = (Integer) LIZ2;
                    if (num2.intValue() >= 0) {
                        i5 = num2.intValue();
                    }
                }
            }
            vfz2 = new VFZ(null, i5, vfz.LIZJ, vfz.LIZLLL, 3553);
            vfz.LIZ();
        }
        if (this.LJIILLIIL) {
            this.LJIILIIL = System.currentTimeMillis();
            this.LJIILLIIL = false;
        }
        return vfz2;
    }

    public static float LJIIJJI(Bundle bundle, String str, float f) {
        float f2 = bundle.getFloat(str);
        if (f2 == 0.0f) {
            return f;
        }
        return f2;
    }
}
