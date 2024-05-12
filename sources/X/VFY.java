package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

/* loaded from: classes15.dex */
public final class VFY extends AbstractC79424VFc {
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public boolean LJIILJJIL;
    public QXX LJIILL;
    public float[] LJIILLIIL;
    public int LJIIZILJ;
    public boolean LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public String LJIL;
    public float LJJ;
    public float LJJI;
    public float LJJIFFI;
    public float LJJII;

    @Override // X.AbstractC79424VFc
    public final AbstractC79424VFc LJ() {
        if (this.LJIILL != null) {
            C48284IxE.LIZ(2, this.LJIIIZ, "TR_VideoOCLSREffect", "release video sr");
            this.LJIILL.LJJLL();
            this.LJIILL = null;
        }
        AbstractC79424VFc abstractC79424VFc = this.LJIIIIZZ;
        LJFF();
        return abstractC79424VFc;
    }

    public VFY(int i) {
        super(i, 5);
        this.LJIIJJI = -1;
        this.LJIILJJIL = true;
        this.LJIIZILJ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJIL = "";
        C48284IxE.LIZ(2, this.LJIIIZ, "TR_VideoOCLSREffect", "new VideoOCLSREffect");
        this.LIZLLL = 5;
        this.LIZJ = 1;
    }

    @Override // X.AbstractC79424VFc
    public final int LIZIZ(Bundle bundle) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        super.LIZIZ(bundle);
        int i3 = bundle.getInt("srAlgType");
        int i4 = bundle.getInt("texture_type");
        String string = bundle.getString("moduleName");
        boolean z6 = bundle.getBoolean("srIsMaliSync", true);
        if (bundle.getInt("enable_bmf") != 0) {
            z = true;
        } else {
            z = false;
        }
        int i5 = bundle.getInt("sr_backend");
        int i6 = bundle.getInt("scale_type");
        int i7 = bundle.getInt("pool_size");
        String string2 = bundle.getString("programCacheDir");
        if (bundle.getInt("use_bmf_component") != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String string3 = bundle.getString("lib_path");
        this.LJJ = 0.0f;
        this.LJJI = 0.0f;
        this.LJJIFFI = 0.0f;
        this.LJJII = 0.0f;
        if (C56509MFt.LJIIJJI()) {
            z = true;
        }
        if (this.LJIIJJI != i3 || this.LIZIZ != i4 || this.LJIILJJIL != z6 || z != this.LJIJ || this.LJIJI != i5 || this.LJIJJ != i6 || this.LJIJJLI != i7) {
            this.LJIJ = z;
            this.LIZIZ = i4;
            if (i4 == 36197 && this.LJIILLIIL == null) {
                this.LJIILLIIL = new float[16];
            }
            this.LJIIL = bundle.getInt("srMaxSizeWidth");
            this.LJIILIIL = bundle.getInt("srMaxSizeHeight");
            this.LJIJI = i5;
            this.LJIJJLI = i7;
            this.LJIJJ = i6;
            this.LJIL = string3;
            String str = (String) bundle.getSerializable("kernelBinPath");
            if (TextUtils.isEmpty(str)) {
                C48284IxE.LIZ(2, this.LJIIIZ, "TR_VideoOCLSREffect", "sr config is empty");
                C79445VFx c79445VFx = this.LJ;
                if (c79445VFx != null) {
                    c79445VFx.notifyError(1, this.LIZ, "sr config is empty");
                }
                return -1;
            }
            if (this.LJIILL != null) {
                C48284IxE.LIZ(2, this.LJIIIZ, "TR_VideoOCLSREffect", "release prev SR instance");
                this.LJIILL.LJJLL();
                this.LJIILL = null;
            }
            if (this.LJIJ) {
                this.LJIILL = new EVE(this.LJIIIZ, z2);
                if (i3 < 5) {
                    return -1;
                }
                i = i3 - 5;
            } else {
                this.LJIILL = new EVD(this.LJIIIZ);
                if (i3 > 4 || i3 < 0) {
                    return -1;
                }
                i = i3;
            }
            int i8 = this.LJIIIZ;
            StringBuilder LJ = C7MY.LJ("start init sr, altype: ", i, ", scale type: ");
            C79062V1e.LJII(LJ, this.LJIJJ, LJ, 2, i8, "TR_VideoOCLSREffect");
            int i9 = this.LJIIL;
            if (i9 > 0 && (i2 = this.LJIILIIL) > 0) {
                QXX qxx = this.LJIILL;
                if (this.LIZIZ == 36197) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z3 = z6;
                if (!qxx.LJJLJ(str, i, z5, z6, i2, i9, string, this.LJIJI, this.LJIJJ, this.LJIJJLI, this.LJIL, string2)) {
                    C48284IxE.LIZ(6, this.LJIIIZ, "TR_VideoOCLSREffect", "sr init set max texture size failed");
                    C79445VFx c79445VFx2 = this.LJ;
                    if (c79445VFx2 != null) {
                        c79445VFx2.notifyError(1, this.LIZ, "sr init set max texture size failed");
                    }
                    this.LJIILL.LJJLL();
                    this.LJIILL = null;
                    return -1;
                }
            } else {
                z3 = z6;
                QXX qxx2 = this.LJIILL;
                if (this.LIZIZ == 36197) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!qxx2.LJJLIL(i, this.LJIJI, this.LJIJJ, this.LJIJJLI, str, string, this.LJIL, string2, z4)) {
                    C48284IxE.LIZ(6, this.LJIIIZ, "TR_VideoOCLSREffect", "sr init failed");
                    C79445VFx c79445VFx3 = this.LJ;
                    if (c79445VFx3 != null) {
                        c79445VFx3.notifyError(1, this.LIZ, "sr init failed");
                    }
                    this.LJIILL.LJJLL();
                    this.LJIILL = null;
                    return -1;
                }
            }
            this.LJIIJJI = i3;
            this.LJIILJJIL = z3;
            int i10 = this.LJIIIZ;
            StringBuilder LJ2 = C7MY.LJ("init sr success, texTarget:", i4, " bundle:");
            LJ2.append(bundle.toString());
            C48284IxE.LIZ(2, i10, "TR_VideoOCLSREffect", X1D.LIZIZ(LJ2));
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0161  */
    @Override // X.AbstractC79424VFc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.VFZ LIZLLL(X.VFZ r44, X.VG6 r45) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VFY.LIZLLL(X.VFZ, X.VG6):X.VFZ");
    }
}
