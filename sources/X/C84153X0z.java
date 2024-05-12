package X;

import Y.ARunnableS50S0100000_14;
import android.os.Handler;
import defpackage.b1;

/* renamed from: X.X0z, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C84153X0z implements YQV {
    public final /* synthetic */ EnumC84152X0y LIZ;

    public C84153X0z(EnumC84152X0y enumC84152X0y) {
        this.LIZ = enumC84152X0y;
    }

    @Override // X.YQV
    public final void LIZ(Object obj, String str) {
        C63922P6w.LIZLLL("TECameraServer", "stopCapture success!");
        LJIIIIZZ(4, 0, str);
    }

    @Override // X.YQV
    public final void LIZJ(Object obj, String str) {
        C63922P6w.LIZLLL("TECameraServer", "startCapture success!");
        EnumC84152X0y enumC84152X0y = this.LIZ;
        enumC84152X0y.mStartPreviewError = false;
        if (enumC84152X0y.mCameraSettings != null && enumC84152X0y.mCameraInstance != null) {
            EnumC84152X0y enumC84152X0y2 = this.LIZ;
            int LLLLLLJ = enumC84152X0y2.mCameraSettings.LLF - enumC84152X0y2.mCameraInstance.LLLLLLJ();
            LJIIIIZZ(0, LLLLLLJ, YE1.LIZIZ(str, ", Retry preview times = ", LLLLLLJ));
            this.LIZ.mCameraInstance.LLLLIIL();
        } else {
            LJIIIIZZ(0, 0, str);
        }
        C87367YQp.LIZ("te_record_camera_preview_ret", 0L);
    }

    @Override // X.YQV
    public final void LJI(int i, String str) {
        String str2;
        StringBuilder LIZJ = b1.LIZJ("onTorchSuccess ", str);
        if (i == 0) {
            str2 = " close";
        } else {
            str2 = " open";
        }
        LIZJ.append(str2);
        C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZJ));
    }

    @Override // X.YQV
    public final void LJII(int i, String str) {
        String str2;
        StringBuilder LIZJ = b1.LIZJ("onTorchError ", str);
        if (i == 0) {
            str2 = " close";
        } else {
            str2 = " open";
        }
        LIZJ.append(str2);
        C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZJ));
    }

    @Override // X.YQV
    public final void LJFF(int i, X10 x10, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCameraClosed, CameraState = ");
        LIZ.append(this.LIZ.mCurrentCameraState);
        C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ));
        if (x10 == this.LIZ.mCameraInstance) {
            synchronized (this.LIZ.mStateLock) {
                this.LIZ.updateCameraState(0);
            }
            this.LIZ.mCameraObserver.onCaptureStopped(0);
            EnumC84152X0y enumC84152X0y = this.LIZ;
            if (enumC84152X0y.mbNeedDestroy) {
                if (enumC84152X0y.decreaseClientCount() == 0) {
                    C63922P6w.LIZLLL("TECameraServer", "destroy in onCameraClosed callback");
                    this.LIZ.destroy();
                }
                this.LIZ.mbNeedDestroy = false;
            }
        }
    }

    @Override // X.YQV
    public final void LJIIIIZZ(int i, int i2, String str) {
        StringBuilder LIZJ = C06460Ne.LIZJ("onCameraInfo: ", i, ", ext: ", i2, " msg: ");
        LIZJ.append(str);
        C63922P6w.LIZ("TECameraServer", X1D.LIZIZ(LIZJ));
        if (i == 108) {
            this.LIZ.updateCameraState(4);
        } else if (i == 109) {
            this.LIZ.updateCameraState(0);
        }
        this.LIZ.mCameraObserver.onInfo(i, i2, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x03ce, code lost:
    
        if (r11.LIZ.mCurrentCameraState != 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03d0, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("onCameraOpened, no need to close camera, state: ");
        r1.append(r11.LIZ.mCurrentCameraState);
        X.C63922P6w.LJ("TECameraServer", X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x03ed, code lost:
    
        if (r11.LIZ.mCameraInstance == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x03ef, code lost:
    
        r11.LIZ.mCameraInstance.LLJZ();
        X.C63922P6w.LIZLLL("TECameraServer", "fall back to camera1, cameraInstance is null");
        r11.LIZ.mCameraInstance = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0401, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x042a, code lost:
    
        r1 = r11.LIZ;
        r1.mCameraSettings.LJLILLLLZI = 1;
        r1.mCameraEvent.LJIIIIZZ(51, 0, "need recreate surfacetexture");
        r3 = X.EnumC84152X0y.INSTANCE;
        r0 = r11.LIZ;
        r3.open(r0.mCameraClient, r0.mCameraSettings, r0.cachedOpenPrivacyCert);
        r11.LIZ.mOpenInfoMap.put("ResultType", "fallback to Camera1");
        X.C87367YQp.LIZIZ("te_record_camera_open_info", r11.LIZ.mOpenInfoMap.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0403, code lost:
    
        r11.LIZ.updateCameraState(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x040c, code lost:
    
        if (r11.LIZ.mCameraInstance == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x040e, code lost:
    
        r11.LIZ.mCameraInstance.LLLILZJ(r11.LIZ.cachedOpenPrivacyCert);
        X.C63922P6w.LIZLLL("TECameraServer", "fall back to camera1, updateCameraState cameraInstance is null");
        r11.LIZ.mCameraInstance = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0424, code lost:
    
        r11.LIZ.updateCameraState(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0342, code lost:
    
        if (r13 == (-408)) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03b6, code lost:
    
        if (r13 == (-403)) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0344, code lost:
    
        r11.LIZ.mCameraObserver.onCaptureStarted(r12, r13);
        X.C63922P6w.LIZLLL("TECameraServer", "finally go to the error.");
        X.C87367YQp.LIZ("te_record_camera_open_ret", r13);
        r1 = r11.LIZ.mCameraObserver;
        r2 = X.X1D.LIZ();
        r2.append("Open camera failed @");
        r2.append(r11.LIZ.mCameraSettings.LJLILLLLZI);
        r2.append(",face:");
        r2.append(r11.LIZ.mCameraSettings.LJLJJI);
        r2.append(" ");
        r2.append(r11.LIZ.mCameraSettings.LJZI.toString());
        r1.onError(r13, X.X1D.LIZIZ(r2));
        X.EnumC84152X0y.INSTANCE.close(r11.LIZ.cachedOpenPrivacyCert);
        r0 = r11.LIZ;
        r0.mRetryCnt = -1;
        X.C87367YQp.LIZIZ("te_record_camera_open_info", r0.mOpenInfoMap.toString());
        r11.LIZ.mOpenInfoMap.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03b8, code lost:
    
        X.C63922P6w.LIZLLL("TECameraServer", "Open camera failed, fall back to camera1");
        r1 = r11.LIZ;
        r1.mRetryCnt = r1.mCameraSettings.LLD;
        r4 = r1.mStateLock;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03c9, code lost:
    
        monitor-enter(r4);
     */
    @Override // X.YQV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r12, int r13, X.X10 r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 1236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84153X0z.LIZIZ(int, int, X.X10, java.lang.Object):void");
    }

    @Override // X.YQV
    public final void LIZLLL(Object obj, int i, int i2, String str) {
        EnumC84152X0y enumC84152X0y = this.LIZ;
        if (enumC84152X0y.mCameraSettings.LLILZLL && i2 == -437) {
            C87367YQp.LIZ("te_record_camera_preview_ret", i2);
            Handler handler = this.LIZ.mHandler;
            if (handler == null) {
                return;
            }
            handler.post(new ARunnableS50S0100000_14(this, 50));
            return;
        }
        synchronized (enumC84152X0y.mStateLock) {
            if (this.LIZ.mCameraInstance != null && this.LIZ.mCameraInstance.LLLLLLJ() > 0) {
                this.LIZ.mStartPreviewError = true;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Retry to startPreview. ");
                LIZ.append(this.LIZ.mCameraInstance.LLLLLLJ());
                LIZ.append(" times is waiting to retry.");
                C63922P6w.LJ("TECameraServer", X1D.LIZIZ(LIZ));
                this.LIZ.mCameraInstance.LLLF();
                Handler handler2 = this.LIZ.mHandler;
                if (handler2 == null) {
                } else {
                    handler2.postDelayed(new ARunnableS50S0100000_14(this, 51), 100L);
                }
            } else {
                LJ(obj, i, i2, str);
                C87367YQp.LIZ("te_record_camera_preview_ret", i2);
            }
        }
    }

    @Override // X.YQV
    public final void LJ(Object obj, int i, int i2, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCameraError: code = ");
        LIZ.append(i2);
        LIZ.append(", msg = ");
        LIZ.append(str);
        C63922P6w.LIZIZ("TECameraServer", X1D.LIZIZ(LIZ));
        YR1 yr1 = this.LIZ.mCameraObserver;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Open camera failed @");
        LIZ2.append(this.LIZ.mCameraSettings.LJLILLLLZI);
        LIZ2.append(",face:");
        LIZ2.append(this.LIZ.mCameraSettings.LJLJJI);
        LIZ2.append(" ");
        LIZ2.append(this.LIZ.mCameraSettings.LJZI.toString());
        LIZ2.append(" ");
        LIZ2.append(str);
        yr1.onError(i2, X1D.LIZIZ(LIZ2));
    }
}
