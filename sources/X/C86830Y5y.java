package X;

import android.hardware.Camera;
import ij2.a;

/* renamed from: X.Y5y, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86830Y5y {
    public Camera LIZ;
    public Camera.CameraInfo LIZIZ;
    public C86831Y5z LIZJ;
    public boolean LIZLLL;
    public String LJ;
    public Y6A LJI;
    public Y64 LJII;
    public Y64 LJIIIIZZ;
    public long LJIIJ;
    public VK2 LJFF = new VK2();
    public int LJIIIZ = -1;
    public float LJIIJJI = 1.0f;
    public final C86829Y5x LJIIL = new C86829Y5x(this);

    /* JADX WARN: Can't wrap try/catch for region: R(13:3|(2:4|5)|(10:(2:8|(2:10|(1:12))(1:32))(1:33)|13|(1:15)(1:31)|16|17|18|19|(1:21)(1:25)|22|23)|34|13|(0)(0)|16|17|18|19|(0)(0)|22|23) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:3|4|5|(10:(2:8|(2:10|(1:12))(1:32))(1:33)|13|(1:15)(1:31)|16|17|18|19|(1:21)(1:25)|22|23)|34|13|(0)(0)|16|17|18|19|(0)(0)|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        LIZJ(true);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0024 A[Catch: Exception -> 0x003b, TryCatch #1 {Exception -> 0x003b, blocks: (B:5:0x0006, B:13:0x001e, B:15:0x0024, B:16:0x002d, B:31:0x0033), top: B:4:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0033 A[Catch: Exception -> 0x003b, TRY_LEAVE, TryCatch #1 {Exception -> 0x003b, blocks: (B:5:0x0006, B:13:0x001e, B:15:0x0024, B:16:0x002d, B:31:0x0033), top: B:4:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r6 = this;
            android.hardware.Camera r5 = r6.LIZ
            if (r5 == 0) goto L65
            r4 = 0
            r3 = 1
            X.Y6A r0 = r6.LJI     // Catch: java.lang.Exception -> L3b
            int r1 = r0.LIZIZ     // Catch: java.lang.Exception -> L3b
            if (r1 == 0) goto L14
            if (r1 == r3) goto L1c
            r0 = 2
            if (r1 == r0) goto L19
            r0 = 3
            if (r1 == r0) goto L16
        L14:
            r2 = 0
            goto L1e
        L16:
            r2 = 270(0x10e, float:3.78E-43)
            goto L1e
        L19:
            r2 = 180(0xb4, float:2.52E-43)
            goto L1e
        L1c:
            r2 = 90
        L1e:
            android.hardware.Camera$CameraInfo r1 = r6.LIZIZ     // Catch: java.lang.Exception -> L3b
            int r0 = r1.facing     // Catch: java.lang.Exception -> L3b
            if (r0 != r3) goto L33
            int r0 = r1.orientation     // Catch: java.lang.Exception -> L3b
            int r0 = r0 + r2
            int r0 = r0 % 360
            int r0 = 360 - r0
            int r0 = r0 % 360
        L2d:
            r6.LJIIIZ = r0     // Catch: java.lang.Exception -> L3b
            r5.setDisplayOrientation(r0)     // Catch: java.lang.Exception -> L3b
            goto L3b
        L33:
            int r0 = r1.orientation     // Catch: java.lang.Exception -> L3b
            int r0 = r0 - r2
            int r0 = r0 + 360
            int r0 = r0 % 360
            goto L2d
        L3b:
            r6.LIZJ(r4)     // Catch: java.lang.Exception -> L3f
            goto L42
        L3f:
            r6.LIZJ(r3)     // Catch: java.lang.Exception -> L42
        L42:
            android.hardware.Camera r0 = r6.LIZ
            android.hardware.Camera$Parameters r0 = r0.getParameters()
            android.hardware.Camera$Size r0 = r0.getPreviewSize()
            if (r0 != 0) goto L59
            X.Y64 r0 = r6.LJII
            r6.LJIIIIZZ = r0
        L52:
            X.Y5x r1 = r6.LJIIL
            X.Y64 r0 = r6.LJIIIIZZ
            r1.LIZIZ = r0
            return
        L59:
            X.Y64 r2 = new X.Y64
            int r1 = r0.width
            int r0 = r0.height
            r2.<init>(r1, r0)
            r6.LJIIIIZZ = r2
            goto L52
        L65:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Camera not open"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86830Y5y.LIZ():void");
    }

    public final void LIZIZ() {
        Camera LIZ;
        this.LJFF.getClass();
        int LIZ2 = PPU.LIZ();
        if (LIZ2 == -1) {
            LIZ = null;
        } else {
            a.LJIJ.getClass();
            LIZ = C62006OVe.LIZ(LIZ2, a.LIZJ().LJFF);
        }
        this.LIZ = LIZ;
        if (LIZ != null) {
            this.LJFF.getClass();
            int LIZ3 = PPU.LIZ();
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            this.LIZIZ = cameraInfo;
            Camera.getCameraInfo(LIZ3, cameraInfo);
            return;
        }
        throw new RuntimeException("Failed to open camera");
    }

    public final void LJ() {
        Camera camera = this.LIZ;
        if (camera != null && !this.LIZLLL) {
            C03880Dg c03880Dg = new C03880Dg(2);
            Object[] objArr = new Object[0];
            C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "-6151844178443804827");
            if (c03880Dg.LIZJ(100102, "android/hardware/Camera", "startPreview", camera, objArr, "void", c65300Pk0).LIZ) {
                c03880Dg.LIZIZ(100102, "android/hardware/Camera", "startPreview", null, objArr, camera, c65300Pk0, false);
            } else {
                camera.startPreview();
                c03880Dg.LIZIZ(100102, "android/hardware/Camera", "startPreview", null, objArr, camera, c65300Pk0, true);
            }
            this.LIZLLL = true;
            this.LIZJ = new C86831Y5z(this.LIZ, this.LJFF);
        }
    }

    public final void LJFF() {
        C86831Y5z c86831Y5z = this.LIZJ;
        if (c86831Y5z != null) {
            c86831Y5z.LIZIZ();
            this.LIZJ = null;
        }
        Camera camera = this.LIZ;
        if (camera != null && this.LIZLLL) {
            C03880Dg c03880Dg = new C03880Dg(2);
            Object[] objArr = new Object[0];
            C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "-6151844178443804827");
            if (c03880Dg.LIZJ(100103, "android/hardware/Camera", "stopPreview", camera, objArr, "void", c65300Pk0).LIZ) {
                c03880Dg.LIZIZ(100103, "android/hardware/Camera", "stopPreview", null, objArr, camera, c65300Pk0, false);
            } else {
                camera.stopPreview();
                c03880Dg.LIZIZ(100103, "android/hardware/Camera", "stopPreview", null, objArr, camera, c65300Pk0, true);
            }
            this.LJIIL.LIZ = null;
            this.LIZLLL = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r1 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (r11 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        X.Y5B.LIZIZ(r4, false);
        r10.LJFF.getClass();
        r10.LJFF.getClass();
        r10.LJFF.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        r0 = r4.getSupportedPreviewSizes();
        r7 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (r0 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r0 = r4.getPreviewSize();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        r7.add(new X.Y64(r0.width, r0.height));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (r7.size() != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        r10.LJII = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if ("glass-1".equals(android.os.Build.DEVICE) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        r1 = r4.getSupportedPreviewFpsRange();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (r1 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        if (r1.isEmpty() != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        r5 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        if (r5.hasNext() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        r3 = r5.next();
        r2 = r3[0];
        r1 = r3[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
    
        if (r2 < 10000) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b1, code lost:
    
        if (r1 > 20000) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b3, code lost:
    
        r0 = new int[2];
        r4.getPreviewFpsRange(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bd, code lost:
    
        if (java.util.Arrays.equals(r0, r3) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
    
        r4.setPreviewFpsRange(r3[0], r3[1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bf, code lost:
    
        r4.setPreviewFormat(17);
        r10.LIZ.setParameters(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
    
        r8 = r10.LJI;
        r1 = r10.LJIIIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d7, code lost:
    
        if (r1 == (-1)) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00db, code lost:
    
        if ((r1 % 180) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00dd, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00de, code lost:
    
        r5 = r8.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e0, code lost:
    
        if (r5 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e2, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e3, code lost:
    
        r1 = r8.LIZJ;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e8, code lost:
    
        if (r5 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ea, code lost:
    
        r0 = (X.Y64) com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, 0);
        r10.LJII = r0;
        r4.setPreviewSize(r0.LJLIL, r0.LJLILLLLZI);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fa, code lost:
    
        java.util.Collections.sort(r7, new X.Y6C(r1, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0103, code lost:
    
        if (r0 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0105, code lost:
    
        r5 = new X.Y64(r5.LJLILLLLZI, r5.LJLIL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0110, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0170, code lost:
    
        throw new java.lang.IllegalStateException("Rotation not calculated yet. Call configure() first.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0112, code lost:
    
        r5 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011a, code lost:
    
        if (r5.hasNext() == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011c, code lost:
    
        r0 = r5.next();
        r7.add(new X.Y64(r0.width, r0.height));
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0044, code lost:
    
        if (r1.equals(r4.getFocusMode()) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012f, code lost:
    
        r4.setFocusMode(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x002c, code lost:
    
        if (r11 == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(boolean r11) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86830Y5y.LIZJ(boolean):void");
    }

    public final void LIZLLL(int i) {
        Camera camera = this.LIZ;
        if (camera == null) {
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        if (i < 0 || i >= parameters.getMaxZoom()) {
            return;
        }
        C86831Y5z c86831Y5z = this.LIZJ;
        if (c86831Y5z != null) {
            c86831Y5z.LIZIZ();
        }
        if (parameters.isSmoothZoomSupported()) {
            this.LIZ.startSmoothZoom(i);
        } else {
            int zoom = this.LIZ.getParameters().getZoom();
            if (zoom < i) {
                while (zoom <= i) {
                    parameters.setZoom(zoom);
                    this.LIZ.setParameters(parameters);
                    zoom++;
                }
            } else if (zoom > i) {
                while (zoom >= i) {
                    parameters.setZoom(zoom);
                    this.LIZ.setParameters(parameters);
                    zoom--;
                }
            }
        }
        C86831Y5z c86831Y5z2 = this.LIZJ;
        if (c86831Y5z2 == null) {
            return;
        }
        c86831Y5z2.LIZ = false;
        if (!c86831Y5z2.LIZJ || c86831Y5z2.LIZIZ) {
            return;
        }
        try {
            c86831Y5z2.LIZLLL.autoFocus(c86831Y5z2.LJFF);
            c86831Y5z2.LIZIZ = true;
        } catch (RuntimeException unused) {
            c86831Y5z2.LIZ();
        }
    }
}
