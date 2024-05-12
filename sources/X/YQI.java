package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;

/* loaded from: classes16.dex */
public class YQI implements YQV {
    public final int LIZ;
    public final /* synthetic */ YQB LIZIZ;

    @Override // X.YQV
    public final void LIZ(Object obj, String str) {
    }

    @Override // X.YQV
    public final void LJI(int i, String str) {
    }

    @Override // X.YQV
    public final void LJII(int i, String str) {
    }

    @Override // X.YQV
    public final void LJIIIIZZ(int i, int i2, String str) {
    }

    public YQI(YQB yqb, int i) {
        this.LIZIZ = yqb;
        this.LIZ = i;
    }

    @Override // X.YQV
    public final void LIZJ(Object obj, String str) {
        C87367YQp.LIZ("te_record_dual_camera_preview_ret", 0L);
        YQB yqb = this.LIZIZ;
        if (yqb.LJII.LLI && !yqb.LIZLLL.isEmpty()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onPreviewSuccess instance = ");
            LIZ.append(obj);
            C63922P6w.LIZLLL("TEMultiCamera", X1D.LIZIZ(LIZ));
            YQ5 yq5 = (YQ5) ListProtector.get(this.LIZIZ.LIZJ, 1);
            if (yq5 == null) {
                C63922P6w.LIZIZ("TEMultiCamera", "failed to open, first camera is null");
            } else if (this.LIZIZ.LIZIZ(yq5) != 0) {
                C63922P6w.LIZIZ("TEMultiCamera", "failed to open camera");
            }
        }
    }

    @Override // X.YQV
    public final void LJFF(int i, X10 x10, Object obj) {
        this.LIZIZ.LJ.remove(x10);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCameraClosed, mCameraToClose size = ");
        LIZ.append(this.LIZIZ.LJ.size());
        LIZ.append(" camera:");
        LIZ.append(x10);
        LIZ.append(", mbNeedToCallOnClosed = ");
        LIZ.append(this.LIZIZ.LJIIJJI);
        C63922P6w.LIZLLL("TEMultiCamera", X1D.LIZIZ(LIZ));
        if (this.LIZIZ.LJ.isEmpty()) {
            YQB yqb = this.LIZIZ;
            if (yqb.LJIIJJI) {
                yqb.LIZ.LJFF(i, yqb, obj);
                return;
            }
        }
        YQB yqb2 = this.LIZIZ;
        if (yqb2.LJIIJJI) {
            return;
        }
        yqb2.LJIIJJI = true;
    }

    @Override // X.YQV
    public final void LIZIZ(int i, int i2, X10 x10, Object obj) {
        C87367YQp.LIZ("te_record_dual_camera_open_ret", i2);
        long currentTimeMillis = System.currentTimeMillis() - this.LIZIZ.LJIIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCameraOpened, camera index =  ");
        LIZ.append(this.LIZ);
        LIZ.append(", camera = ");
        LIZ.append(x10);
        LIZ.append(", ret = ");
        V10.LJFF(LIZ, i2, ", cost ", currentTimeMillis);
        C63922P6w.LIZLLL("TEMultiCamera", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("te_record_camera_open_cost_multi_");
        LIZ2.append(this.LIZ);
        C87367YQp.LIZ(X1D.LIZIZ(LIZ2), currentTimeMillis);
        if (i2 != 0) {
            YQB yqb = this.LIZIZ;
            yqb.LIZ.LIZIZ(i, i2, yqb, obj);
            return;
        }
        if (x10 != null) {
            this.LIZIZ.LIZLLL.remove(x10);
            this.LIZIZ.LJ.add(x10);
        }
        YQB yqb2 = this.LIZIZ;
        if (yqb2.LJII.LLI) {
            if (!yqb2.LIZLLL.isEmpty()) {
                YQB yqb3 = this.LIZIZ;
                yqb3.LIZ.LIZIZ(i, i2, yqb3, obj);
                return;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("startCapture for sec camera = ");
            LIZ3.append(x10);
            C63922P6w.LIZLLL("TEMultiCamera", X1D.LIZIZ(LIZ3));
            if (x10 == null) {
                return;
            }
            if (x10.LLJJJJLIIL().LJLJJI == 0) {
                this.LIZIZ.LJIIIZ = false;
            } else {
                this.LIZIZ.LJIIJ = false;
            }
            x10.LLLIL();
            return;
        }
        if (!yqb2.LIZLLL.isEmpty()) {
            return;
        }
        YQB yqb4 = this.LIZIZ;
        yqb4.LIZ.LIZIZ(i, i2, yqb4, obj);
    }

    @Override // X.YQV
    public final void LIZLLL(Object obj, int i, int i2, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPreviewError ret");
        LIZ.append(i2);
        LIZ.append(" error = ");
        LIZ.append(str);
        C63922P6w.LJ("TEMultiCamera", X1D.LIZIZ(LIZ));
        C87367YQp.LIZ("te_record_dual_camera_preview_ret", i2);
        if (i2 == -437) {
            this.LIZIZ.LIZ.LJ(obj, i, -409, str);
        } else {
            this.LIZIZ.LIZ.LIZLLL(obj, i, i2, str);
        }
    }

    @Override // X.YQV
    public final void LJ(Object obj, int i, int i2, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCameraError ");
        LIZ.append(str);
        C63922P6w.LIZIZ("TEMultiCamera", X1D.LIZIZ(LIZ));
        if (i2 == -409 || i2 == 3) {
            C87367YQp.LIZ("te_record_dual_camera_open_ret", i2);
        }
        this.LIZIZ.LIZ.LJ(obj, i, i2, str);
    }
}
