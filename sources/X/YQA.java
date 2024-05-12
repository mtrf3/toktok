package X;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes16.dex */
public final class YQA extends YQ7 {
    @Override // X.YQ7
    public final int LJIJJ() {
        return 3;
    }

    @Override // X.YQ7
    public final void LJJIL() {
    }

    @Override // X.YQ7
    public final void LJJJ() {
    }

    @Override // X.YQ7
    public final int LJJIJLIJ() {
        Surface surface;
        Handler handler;
        Surface[] surfaceArr;
        P7J p7j = this.LJI.LJI;
        if (this.LJIIIZ == null || p7j == null) {
            C63922P6w.LIZ("TEVideo2Mode", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int LJJIIZ = LJJIIZ();
        if (LJJIIZ != 0) {
            return LJJIIZ;
        }
        C84134X0g c84134X0g = this.LJII;
        if (!c84134X0g.LLJILJILJ || this.LIZJ == null) {
            if (c84134X0g.LLIIII.getBoolean("enablePreviewTemplate")) {
                this.LIZJ = this.LJIIIZ.createCaptureRequest(1);
            } else {
                this.LIZJ = this.LJIIIZ.createCaptureRequest(3);
            }
        }
        ArrayList arrayList = new ArrayList();
        if (p7j.LIZ.LJIIJJI() == 8) {
            P7K p7k = p7j.LIZ;
            if (p7k != null) {
                surfaceArr = p7k.LJIIIIZZ();
            } else {
                surfaceArr = null;
            }
            arrayList.addAll(Arrays.asList(surfaceArr));
        } else if (p7j.LIZ.LJIIJJI() == 16) {
            arrayList.add(p7j.LIZIZ());
            arrayList.add(p7j.LIZ.LIZIZ());
        } else if (p7j.LIZ.LJIIJJI() == 32) {
            int i = this.LJII.LJLJJI;
            P7K p7k2 = p7j.LIZ;
            if (p7k2 != null) {
                surface = p7k2.LIZLLL(i);
            } else {
                surface = null;
            }
            arrayList.add(surface);
        } else {
            arrayList.add(p7j.LIZIZ());
        }
        if (!this.LJII.LLIILZL && p7j.LIZ.LJ() != null && p7j.LIZ.LJFF() == EnumC63904P6e.ADD_SURFACE) {
            arrayList.add(p7j.LIZ.LJ());
        }
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Surface surface2 = (Surface) it.next();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("startPreview, add surface = ");
            LIZ.append(surface2);
            C63922P6w.LIZLLL("TEVideo2Mode", X1D.LIZIZ(LIZ));
            this.LIZJ.addTarget(surface2);
            if (!surface2.isValid()) {
                z = true;
            }
        }
        this.LIZJ.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(this.LJJII.min / this.LJII.LJLJI.fpsUnitFactor), Integer.valueOf(this.LJJII.max / this.LJII.LJLJI.fpsUnitFactor)));
        if (z) {
            C63922P6w.LIZIZ("TEVideo2Mode", "start preview may be failed, surface invalid...");
        }
        this.LJJIIZI = false;
        this.LJJIJIIJI = System.currentTimeMillis();
        if (this.LJII.LJLLI) {
            handler = LJIJI();
        } else {
            handler = this.LJIIJ;
        }
        if (!this.LJII.LLJILJILJ) {
            this.LIZLLL = null;
            LJIILIIL(arrayList, this.LJJJJZ, handler);
        } else {
            if (!((ArrayList) this.LJJJJL).isEmpty() && !this.LJJJJJL) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((OutputConfiguration) ListProtector.get(this.LJJJJL, i2)).addSurface((Surface) ListProtector.get(arrayList, i2));
                    this.LJJJJJL = true;
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && this.LIZLLL != null) {
                this.LIZLLL.finalizeOutputConfigurations(this.LJJJJL);
                this.LJJJJJ = true;
                C63922P6w.LIZ("TEVideo2Mode", "finalizeOutputConfigurations in startPreview");
                LJJJJ();
            }
        }
        if (this.LIZLLL == null) {
            LJJJJLL();
        }
        return 0;
    }

    @Override // X.InterfaceC87376YQy
    public final void LJJJJJ(int i) {
        CaptureRequest.Builder builder = this.LIZJ;
        int i2 = 1;
        if (builder == null) {
            C63922P6w.LIZIZ("TEVideo2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: mCaptureRequestBuilder is null");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("switchFlashMode: ");
            LIZ.append("CaptureRequest.Builder is null");
            C63922P6w.LIZIZ("TEVideo2Mode", X1D.LIZIZ(LIZ));
            this.LJFF.LJ(this.LJIIIZ, this.LJII.LJLILLLLZI, -100, i0.LJFF("switchFlashMode:", "CaptureRequest.Builder is null"));
            YQV yqv = this.LJFF;
            if (i == 0) {
                i2 = 0;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("switchFlashMode:");
            LIZ2.append("CaptureRequest.Builder is null");
            yqv.LJII(i2, X1D.LIZIZ(LIZ2));
            return;
        }
        if (i != 0) {
            if (i != 2) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: not support flash mode ");
                LIZ3.append(i);
                C63922P6w.LIZIZ("TEVideo2Mode", X1D.LIZIZ(LIZ3));
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("Video Mode not support this mode : ");
                LIZ4.append(i);
                C63922P6w.LJ("TEVideo2Mode", X1D.LIZIZ(LIZ4));
                YQV yqv2 = this.LJFF;
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("Video Mode not support this mode : ");
                LIZ5.append(i);
                yqv2.LJII(-1, X1D.LIZIZ(LIZ5));
                return;
            }
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.LIZJ.set(CaptureRequest.FLASH_MODE, 2);
        } else {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.LIZJ.set(CaptureRequest.FLASH_MODE, 0);
        }
        this.LJII.getClass();
        YQV yqv3 = this.LJFF;
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("camera2 will change flash mode ");
        LIZ6.append(i);
        yqv3.LJIIIIZZ(104, 0, X1D.LIZIZ(LIZ6));
        XS3 LJJJJIZL = LJJJJIZL(this.LIZJ);
        YQV yqv4 = this.LJFF;
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("camera2 did change flash mode ");
        LIZ7.append(i);
        yqv4.LJIIIIZZ(105, 0, X1D.LIZIZ(LIZ7));
        if (!LJJJJIZL.LIZ) {
            StringBuilder LIZ8 = X1D.LIZ();
            LIZ8.append("[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -418. Reason: ");
            LIZ8.append(LJJJJIZL.LIZIZ);
            C63922P6w.LIZIZ("TEVideo2Mode", X1D.LIZIZ(LIZ8));
            YQV yqv5 = this.LJFF;
            StringBuilder LIZ9 = X1D.LIZ();
            LIZ9.append("switch flash failed.");
            LIZ9.append(LJJJJIZL.LIZIZ);
            yqv5.LJIIIIZZ(-418, -418, X1D.LIZIZ(LIZ9));
            YQV yqv6 = this.LJFF;
            if (i == 0) {
                i2 = 0;
            }
            StringBuilder LIZ10 = X1D.LIZ();
            LIZ10.append("switch flash failed.");
            LIZ10.append(LJJJJIZL.LIZIZ);
            yqv6.LJII(i2, X1D.LIZIZ(LIZ10));
            return;
        }
        YQV yqv7 = this.LJFF;
        if (i == 0) {
            i2 = 0;
        }
        yqv7.LJI(i2, "torch success");
    }

    public YQA(YQ6 yq6, Context context, CameraManager cameraManager, Handler handler) {
        super(yq6, context, handler);
        this.LJ = cameraManager;
        if (this.LJII.LJLLJ) {
            this.LJIIIIZZ = new C87359YQh(this);
        } else {
            this.LJIIIIZZ = new C87357YQf(this);
        }
    }
}
