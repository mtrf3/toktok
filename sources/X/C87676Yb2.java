package X;

import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import defpackage.e1;

/* renamed from: X.Yb2, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87676Yb2 implements InterfaceC43519H6d {
    public final C87678Yb4 LIZ = new C87678Yb4();
    public final int LIZIZ = C43521H6f.LIZ();

    @Override // X.InterfaceC43519H6d
    public final boolean LIZ() {
        FP1.LJ("BDUploadSpeedProbe : ", "call invalid");
        if (this.LIZIZ == 1) {
            FP1.LJ("BDUploadSpeedProbe : ", "client route mode not need invalid context");
            return false;
        }
        C87678Yb4 c87678Yb4 = this.LIZ;
        synchronized (c87678Yb4) {
            c87678Yb4.LIZ.LIZJ();
        }
        return true;
    }

    @Override // X.InterfaceC43519H6d
    public final void cancel() {
        C87678Yb4 c87678Yb4 = this.LIZ;
        synchronized (c87678Yb4) {
            c87678Yb4.LIZ.LIZ();
        }
    }

    @Override // X.InterfaceC43519H6d
    public final void start() {
        if (!e1.LIZ(31744, "enable_video_edit_activity_upload_speed_probe", true, false) || C1DG.LJIIIIZZ()) {
            return;
        }
        if (e1.LIZ(31744, "studio_not_request_authkey", true, false) && !C44172HVg.LJIJ.isLogin()) {
            return;
        }
        C87678Yb4 c87678Yb4 = this.LIZ;
        synchronized (c87678Yb4) {
            c87678Yb4.LIZ.LJII();
        }
    }

    @Override // X.InterfaceC43519H6d
    public final UploadSpeedInfo getSpeed() {
        AbstractC87674Yb0 abstractC87674Yb0;
        UploadSpeedInfo uploadSpeedInfo;
        cancel();
        C87678Yb4 c87678Yb4 = this.LIZ;
        synchronized (c87678Yb4) {
            abstractC87674Yb0 = c87678Yb4.LIZ;
        }
        if (abstractC87674Yb0 instanceof C87672Yay) {
            YXT yxt = ((C87672Yay) abstractC87674Yb0).LIZIZ;
            uploadSpeedInfo = new UploadSpeedInfo(yxt.LJLIL, yxt.LJLILLLLZI, yxt.LJLJJI, yxt.LJLJJL, 0, 16, null);
        } else if (abstractC87674Yb0 instanceof C87670Yaw) {
            uploadSpeedInfo = new UploadSpeedInfo(-6L, null, 0L, 0L, 0, 30, null);
        } else if (abstractC87674Yb0 instanceof C87669Yav) {
            uploadSpeedInfo = new UploadSpeedInfo(-7L, null, 0L, 0L, 0, 30, null);
        } else if (abstractC87674Yb0 instanceof C87666Yas) {
            YXT yxt2 = ((C87666Yas) abstractC87674Yb0).LIZIZ;
            if (yxt2 == null) {
                uploadSpeedInfo = new UploadSpeedInfo(-5L, null, 0L, 0L, 0, 30, null);
            } else {
                uploadSpeedInfo = new UploadSpeedInfo(yxt2.LJLIL, yxt2.LJLILLLLZI, yxt2.LJLJJI, yxt2.LJLJJL, 0, 16, null);
            }
        } else if (abstractC87674Yb0 instanceof C87667Yat) {
            uploadSpeedInfo = new UploadSpeedInfo(-4L, null, 0L, 0L, 0, 30, null);
        } else if ((abstractC87674Yb0 instanceof C87680Yb6) || (abstractC87674Yb0 instanceof C87682Yb8)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BDUploadSpeedProbe : ");
            LIZ.append("get speed when running and fast result");
            H78.LIZJ(X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("BDUploadSpeedProbe : ");
            LIZ2.append("get speed when running and fast result");
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ2));
            uploadSpeedInfo = new UploadSpeedInfo(-8L, null, 0L, 0L, 0, 30, null);
        } else {
            throw new C162476Zf();
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("getSpeed:");
        LIZ3.append(uploadSpeedInfo);
        X1D.LIZIZ(LIZ3);
        return uploadSpeedInfo;
    }
}
