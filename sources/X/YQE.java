package X;

import Y.ARunnableS1S1102000_15;
import Y.ARunnableS51S0100000_15;
import android.hardware.camera2.CameraDevice;

/* loaded from: classes16.dex */
public class YQE extends CameraDevice.StateCallback {
    public P89<CameraDevice> LIZ;
    public final /* synthetic */ YQ6 LIZIZ;

    public YQE(YQ6 yq6) {
        this.LIZIZ = yq6;
        this.LIZ = new P89<>(yq6);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onClosed, CameraDevice:");
        LIZ.append(cameraDevice);
        C63922P6w.LIZLLL("TECamera2", X1D.LIZIZ(LIZ));
        YQ7 yq7 = this.LIZIZ.LJJJIL;
        if (yq7 instanceof YQ9) {
            ((YQ9) yq7).LJJJJZI(cameraDevice, 4, -1);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        C63922P6w.LIZLLL("TECamera2", "onDisconnected: OpenCameraCallBack");
        YQ7 yq7 = this.LIZIZ.LJJJIL;
        if (yq7 instanceof YQ9) {
            ((YQ9) yq7).LJJJJZI(cameraDevice, 1, -1);
        }
        this.LIZIZ.LJIIL();
        P89<CameraDevice> p89 = this.LIZ;
        if (p89 != null) {
            C63922P6w.LIZIZ("TECamera2", "StateCallback::onDisconnected...");
            YQ6 yq6 = p89.LIZ.get();
            if (yq6 == null) {
                return;
            }
            C84134X0g c84134X0g = yq6.LIZIZ;
            if (c84134X0g.LLJIJIL) {
                C63922P6w.LIZIZ("TECamera2", "StateCallback::onDisconnected...ignore reset...");
                yq6.LIZIZ.LLJIJIL = false;
                return;
            }
            ARunnableS51S0100000_15 aRunnableS51S0100000_15 = new ARunnableS51S0100000_15(yq6, 20);
            if (c84134X0g.LJLLI) {
                yq6.LJ.post(aRunnableS51S0100000_15);
            } else {
                aRunnableS51S0100000_15.run();
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        if (new C03880Dg(2).LIZJ(100200, "com/ss/android/ttvecamera/TECamera2$1", "onOpened", this, new Object[]{cameraDevice}, "void", new C65300Pk0(false, "(Landroid/hardware/camera2/CameraDevice;)V", "3958460556082944802")).LIZ) {
            return;
        }
        C63922P6w.LIZLLL("TECamera2", "onOpened: OpenCameraCallBack");
        this.LIZIZ.LIZ(107, "did start camera2");
        YQ7 yq7 = this.LIZIZ.LJJJIL;
        if (yq7 instanceof YQ9) {
            ((YQ9) yq7).LJJJJZI(cameraDevice, 0, -1);
        }
        this.LIZIZ.LJJJ = cameraDevice;
        YQ7 yq72 = this.LIZIZ.LJJJIL;
        yq72.getClass();
        yq72.LJIIIZ = cameraDevice;
        this.LIZIZ.LJIIL();
        P89<CameraDevice> p89 = this.LIZ;
        if (p89 != null) {
            C63922P6w.LIZLLL("TECamera2", "StateCallback::onOpened...");
            YQ6 yq6 = p89.LIZ.get();
            if (yq6 != null) {
                yq6.LIZIZ.LLJIJIL = false;
                yq6.LJIILIIL(2);
                ARunnableS51S0100000_15 aRunnableS51S0100000_15 = new ARunnableS51S0100000_15(yq6, 19);
                if (yq6.LIZIZ.LJLLI) {
                    yq6.LJ.post(aRunnableS51S0100000_15);
                } else {
                    aRunnableS51S0100000_15.run();
                }
                yq6.LJJJI = false;
                YQ6 yq62 = this.LIZIZ;
                if (yq62.LJJJJIZL && yq62.LJJJJI) {
                    C63925P6z.LIZ(cameraDevice, yq62.LJIJ);
                    YQV yqv = this.LIZIZ.LIZLLL;
                    if (yqv != null) {
                        yqv.LJFF(2, this.LIZ.LIZ.get(), this.LIZIZ.LJJJ);
                    }
                    C63922P6w.LJ("TECamera2", "onOpened: OpenCameraCallBack, but had camera close intent...");
                    this.LIZIZ.LJJJJI = false;
                    return;
                }
                if (yq62.LIZIZ.LLJILJILJ) {
                    try {
                        yq62.LJJJIL.LJIILJJIL();
                        return;
                    } catch (Exception e) {
                        C63922P6w.LJ("TECamera2", "onOpened: createSessionByDeferredSurface, some bad case occur, close camera! exception msg: " + e.getMessage());
                        YQ6 yq63 = this.LIZIZ;
                        yq63.LIZIZ.LLJILJILJ = false;
                        if (yq63.LJJIL != 3) {
                            this.LIZIZ.LLLIL();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
        C63925P6z.LIZ(cameraDevice, this.LIZIZ.LJIJ);
        C63922P6w.LJ("TECamera2", "onOpened: OpenCameraCallBack, some bad case occur, close camera!");
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        if (new C03880Dg(2).LIZJ(100207, "com/ss/android/ttvecamera/TECamera2$1", "onError", this, new Object[]{cameraDevice, Integer.valueOf(i)}, "void", new C65300Pk0(false, "(Landroid/hardware/camera2/CameraDevice;I)V", "3958460556082944802")).LIZ) {
            return;
        }
        C63922P6w.LIZLLL("TECamera2", "onError: " + i + " this = " + this);
        YQ7 yq7 = this.LIZIZ.LJJJIL;
        if (yq7 instanceof YQ9) {
            ((YQ9) yq7).LJJJJZI(cameraDevice, 3, i);
        }
        this.LIZIZ.LJIIL();
        P89<CameraDevice> p89 = this.LIZ;
        if (p89 == null) {
            C63922P6w.LIZIZ("TECamera2", "had called onError");
            return;
        }
        YQ6 yq6 = p89.LIZ.get();
        if (yq6 == null) {
            C63922P6w.LIZIZ("TECamera2", "onError...no camera holder");
        } else {
            int i2 = yq6.LJJIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("StateCallback::onError...");
            LIZ.append(i);
            LIZ.append(", session code: ");
            LIZ.append(i2);
            String LIZIZ = X1D.LIZIZ(LIZ);
            C63922P6w.LIZLLL("TECamera2", LIZIZ);
            ARunnableS1S1102000_15 aRunnableS1S1102000_15 = new ARunnableS1S1102000_15(yq6, i2, i, LIZIZ, 0);
            if (yq6.LIZIZ.LJLLI) {
                yq6.LJ.post(aRunnableS1S1102000_15);
            } else {
                aRunnableS1S1102000_15.run();
            }
            yq6.LJIILIIL(4);
        }
        this.LIZ = null;
    }
}
