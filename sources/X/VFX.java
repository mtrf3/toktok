package X;

import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes15.dex */
public final class VFX extends AbstractC79424VFc {
    public QXX LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public float LJIILLIIL;
    public float LJIIZILJ;
    public float LJIJ;
    public int LJIJI;
    public float[] LJIJJ;
    public boolean LJIJJLI;
    public int LJIL;
    public boolean LJJ;
    public final float[] LJJI;
    public final float[] LJJIFFI;

    @Override // X.AbstractC79424VFc
    public final AbstractC79424VFc LJ() {
        QXX qxx = this.LJIIJJI;
        if (qxx != null) {
            qxx.LJJLJLI();
            this.LJIIJJI = null;
            C48284IxE.LIZ(2, this.LJIIIZ, "TR_AdaptiveSharpenEffect", "sharpen released");
        }
        AbstractC79424VFc abstractC79424VFc = this.LJIIIIZZ;
        LJFF();
        return abstractC79424VFc;
    }

    public VFX(int i) {
        super(i, 1);
        this.LJIIL = 1920;
        this.LJIILIIL = 1080;
        this.LJIILLIIL = -1.0f;
        this.LJIIZILJ = -1.0f;
        this.LJIJ = -1.0f;
        this.LJIJI = -1;
        this.LJIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJJI = new float[0];
        this.LJJIFFI = new float[0];
        C48284IxE.LIZ(2, this.LJIIIZ, "TR_AdaptiveSharpenEffect", "new AdaptiveSharpenEffect");
        this.LIZLLL = 10;
        this.LIZJ = 1;
    }

    @Override // X.AbstractC79424VFc
    public final int LIZ(int i) {
        switch (i) {
            case 10001:
                return this.LJIIL;
            case 10002:
                return this.LJIILIIL;
            case 10003:
                return this.LJIILJJIL;
            case 10004:
                return this.LIZIZ;
            default:
                return super.LIZ(i);
        }
    }

    @Override // X.AbstractC79424VFc
    public final int LIZIZ(Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        super.LIZIZ(bundle);
        int i = 0;
        if (bundle.getInt("enable_bmf") == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LJJ = z;
        int i2 = bundle.getInt("texture_type");
        if ((this.LJIILJJIL != bundle.getInt("power_level") || this.LIZIZ != i2) && this.LJIIJJI != null) {
            C48284IxE.LIZ(2, this.LJIIIZ, "TR_AdaptiveSharpenEffect", "release prev sharpen instance");
            this.LJIIJJI.LJJLJLI();
            this.LJIIJJI = null;
        }
        if (this.LJIIJJI == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!this.LJJ) {
                this.LIZIZ = i2;
                if (i2 == 36197 && this.LJIJJ == null) {
                    this.LJIJJ = new float[16];
                }
                this.LJIIL = bundle.getInt("max_width");
                this.LJIILIIL = bundle.getInt("max_height");
                this.LJIILJJIL = bundle.getInt("power_level");
                EVA eva = new EVA(this.LJIIIZ);
                this.LJIIJJI = eva;
                if (this.LIZIZ == 36197) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!eva.LJJLIIJ(z3, this.LJIIL, this.LJIILIIL, this.LJIILJJIL)) {
                    i = -1;
                }
            } else {
                this.LIZIZ = i2;
                int i3 = this.LJIIIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("init sharpen mInTextureTarget: ");
                C79062V1e.LJII(LIZ, this.LIZIZ, LIZ, 2, i3, "TR_AdaptiveSharpenEffect");
                if (this.LIZIZ == 36197 && this.LJIJJ == null) {
                    this.LJIJJ = new float[16];
                }
                this.LJIIL = bundle.getInt("max_width");
                this.LJIILIIL = bundle.getInt("max_height");
                int i4 = bundle.getInt("alg_type");
                int i5 = bundle.getInt("pool_size");
                float f = bundle.getFloat("weight_threshold");
                float f2 = bundle.getFloat("global_threshold");
                float f3 = bundle.getFloat("overflow_ratio");
                if (bundle.getInt("enable_adaptive") == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                float f4 = bundle.getFloat("initial_weight");
                float f5 = bundle.getFloat("low_weight_threshold");
                String string = bundle.getString("program_cache_dir", "");
                EVC evc = new EVC(this.LJIIIZ);
                this.LJIIJJI = evc;
                i = evc.LJJLIIIJLLLLLLLZ(i4, this.LJIIL, this.LJIILIIL, i5, string, f, f2, f3, z2, f4, f5);
                int i6 = this.LJIIIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("init sharpen, algType: ");
                LIZ2.append(i4);
                C48284IxE.LIZ(2, i6, "TR_AdaptiveSharpenEffect", X1D.LIZIZ(LIZ2));
            }
            C48284IxE.LIZ(2, this.LJIIIZ, "TR_AdaptiveSharpenEffect", "init sharpen, ret:" + i + ",cost:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
            if (i != 0) {
                this.LJIJJLI = true;
                this.LJIIJJI.LJJLJLI();
                this.LJIIJJI = null;
                C79445VFx c79445VFx = this.LJ;
                if (c79445VFx != null) {
                    c79445VFx.notifyError(3, this.LIZ, "init sharpen fail, release");
                }
                C48284IxE.LIZ(2, this.LJIIIZ, "TR_AdaptiveSharpenEffect", "init sharpen fail, release");
            }
        }
        return i;
    }

    @Override // X.AbstractC79424VFc
    public final VFZ LIZLLL(VFZ vfz, VG6 vg6) {
        int LJJLIIIJJI;
        int i;
        C79445VFx c79445VFx = this.LJ;
        if (c79445VFx == null) {
            return vfz;
        }
        if (this.LJIIJJI == null) {
            if (this.LJIJJLI) {
                c79445VFx.notifyError(4, this.LIZ, "");
                this.LJIJJLI = false;
            }
            C48284IxE.LIZ(1, this.LJIIIZ, "TR_AdaptiveSharpenEffect", "sharpen empty");
            this.LJ.setOption(15, 0);
            return vfz;
        }
        c79445VFx.currentEffectProcessBegin(this.LIZ);
        if (this.LJ.getIntOption(16, -1) == 1) {
            int i2 = vfz.LIZJ;
            int i3 = vfz.LIZLLL;
            if (!this.LJJ) {
                if (this.LIZIZ == 36197) {
                    this.LJ.getTransformMatrix(this.LJIJJ);
                    LJJLIIIJJI = this.LJIIJJI.LJJLIIIJ(vfz.LIZ, i2, i3, this.LJIJJ, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI);
                } else {
                    LJJLIIIJJI = this.LJIIJJI.LJJLIIIJJIZ(vfz.LIZ, i2, i3, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI);
                }
            } else if (this.LIZIZ == 36197) {
                this.LJ.getTransformMatrix(this.LJIJJ);
                LJJLIIIJJI = this.LJIIJJI.LJJLIIIJILLIZJL(vfz.LIZ, i2, i3, this.LJJI, this.LJJIFFI, this.LJIJJ);
            } else {
                LJJLIIIJJI = this.LJIIJJI.LJJLIIIJJI(vfz.LIZ, i2, i3);
            }
            if (LJJLIIIJJI != 0) {
                if (this.LJIL != -1) {
                    int i4 = this.LJIIIZ;
                    StringBuilder LIZJ = C06460Ne.LIZJ("process error,ret:", LJJLIIIJJI, ",width:", i2, ",height:");
                    LIZJ.append(i3);
                    LIZJ.append(",texTarget:");
                    C79062V1e.LJII(LIZJ, this.LIZIZ, LIZJ, 6, i4, "TR_AdaptiveSharpenEffect");
                    this.LJIL = -1;
                }
                C79445VFx c79445VFx2 = this.LJ;
                if (c79445VFx2 != null) {
                    c79445VFx2.notifyError(4, this.LIZ, "");
                }
            } else {
                int LJJLIIIJL = this.LJIIJJI.LJJLIIIJL();
                if (this.LJIL != 0) {
                    int i5 = this.LJIIIZ;
                    StringBuilder LIZJ2 = C06460Ne.LIZJ("process success,texid:", LJJLIIIJL, ",width:", i2, ",height:");
                    LIZJ2.append(i3);
                    LIZJ2.append(",texTarget:");
                    i = 1;
                    C79062V1e.LJII(LIZJ2, this.LIZIZ, LIZJ2, 1, i5, "TR_AdaptiveSharpenEffect");
                    this.LJIL = 0;
                } else {
                    i = 1;
                }
                this.LJ.setOption(15, i);
                vfz.LIZ();
                this.LJ.currentEffectProcessEnd(this.LIZ);
                return new VFZ(null, LJJLIIIJL, i2, i3, 3553);
            }
        }
        this.LJ.setOption(15, 0);
        this.LJ.currentEffectProcessEnd(this.LIZ);
        return vfz;
    }

    @Override // X.AbstractC79424VFc
    public final void LJI(int i, float f) {
        switch (i) {
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                this.LJIILLIIL = f;
                break;
            case 12:
                this.LJIIZILJ = f;
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                this.LJIJ = f;
                break;
            default:
                super.LJI(i, f);
                break;
        }
        int i2 = this.LJIIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setOption float, key:");
        LIZ.append(i);
        LIZ.append(",value:");
        LIZ.append(f);
        C48284IxE.LIZ(2, i2, "TR_AdaptiveSharpenEffect", X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC79424VFc
    public final void LJII(int i, int i2) {
        if (i != 14) {
            if (i != 17) {
                super.LJII(i, i2);
                return;
            }
            this.LJIILL = i2;
            int i3 = this.LJIIIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("set SceneMode:");
            LIZ.append(i2);
            C48284IxE.LIZ(2, i3, "TR_AdaptiveSharpenEffect", X1D.LIZIZ(LIZ));
            return;
        }
        this.LJIJI = i2;
        int i4 = this.LJIIIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("set DiffImgSmoothEnable:");
        LIZ2.append(i2);
        C48284IxE.LIZ(2, i4, "TR_AdaptiveSharpenEffect", X1D.LIZIZ(LIZ2));
    }
}
