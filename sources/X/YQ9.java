package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes16.dex */
public final class YQ9 extends YQ7 {
    public static final String LJJJZ = C16880lQ.LJLLJ(YQ9.class);
    public volatile boolean LJJJLIIL;
    public C80074Vbi LJJJLL;
    public long LJJJLZIJ;

    @Override // X.YQ7, X.InterfaceC87370YQs
    public final int LIZ() {
        return 0;
    }

    @Override // X.YQ7, X.InterfaceC87370YQs
    public final int LIZIZ() {
        return 0;
    }

    @Override // X.YQ7
    public final void LJI() {
    }

    @Override // X.YQ7
    public final int LJIILLIIL(C84151X0x c84151X0x) {
        return -412;
    }

    @Override // X.YQ7
    public final int LJJIIZ() {
        throw null;
    }

    @Override // X.YQ7
    public final void LJJIJIL(String str) {
    }

    @Override // X.YQ7
    public final void LJJIZ(float f, InterfaceC87361YQj interfaceC87361YQj) {
    }

    @Override // X.InterfaceC87376YQy
    public final void LJJJJJ(int i) {
    }

    @Override // X.YQ7
    public final void LJJJJZ(float f, InterfaceC87361YQj interfaceC87361YQj) {
    }

    @Override // X.YQ7
    public final Rect LJFF() {
        return new Rect();
    }

    @Override // X.YQ7
    public final void LJIIJ() {
        P7K p7k;
        long j;
        if (this.LJJIZ && !this.LJJIIZI) {
            long currentTimeMillis = System.currentTimeMillis() - this.LJJJLZIJ;
            C80074Vbi c80074Vbi = this.LJJJLL;
            if (c80074Vbi != null && currentTimeMillis > 0) {
                synchronized (c80074Vbi.LJII) {
                    Iterator it = ((ArrayList) c80074Vbi.LJIIIZ).iterator();
                    j = 0;
                    while (it.hasNext()) {
                        j += ((Long) it.next()).longValue();
                    }
                    if (((ArrayList) c80074Vbi.LJIIIZ).size() > 0) {
                        j /= ((ArrayList) c80074Vbi.LJIIIZ).size();
                    }
                }
                long j2 = j - currentTimeMillis;
                if (j2 > 0) {
                    String str = LJJJZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("close session, but first preview not arrive...wait: ");
                    LIZ.append(j2);
                    C63922P6w.LIZIZ(str, X1D.LIZIZ(LIZ));
                    try {
                        Thread.sleep(j2);
                    } catch (InterruptedException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        }
        this.LJJIZ = false;
        this.LJJJLIIL = false;
        P7J p7j = this.LJI.LJI;
        if (p7j == null || (p7k = p7j.LIZ) == null) {
            C63922P6w.LJ(LJJJZ, "ProviderManager or Provider is null!");
        } else {
            P7P p7p = p7k.LIZ;
            if (p7p != null && (p7p instanceof P7S)) {
                ((P7S) p7p).LIZJ(null);
            }
        }
        C80074Vbi c80074Vbi2 = this.LJJJLL;
        if (c80074Vbi2 != null) {
            c80074Vbi2.LJIIJJI();
        }
        C63922P6w.LIZLLL(LJJJZ, "ARCore session paused");
        super.LJIIJ();
    }

    @Override // X.YQ7
    public final int LJJIJLIJ() {
        List<TEFrameSizei> LJII;
        TEFrameSizei tEFrameSizei;
        List<Surface> asList;
        Handler handler;
        Surface[] surfaceArr;
        TEFrameSizei tEFrameSizei2;
        P7J p7j = this.LJI.LJI;
        if (this.LJIIIZ == null || p7j == null) {
            C63922P6w.LIZ(LJJJZ, "CameraDevice or ProviderManager is null!");
            return -100;
        }
        C80074Vbi c80074Vbi = this.LJJJLL;
        if (c80074Vbi == null || (LJII = c80074Vbi.LJII()) == null) {
            return -1;
        }
        P7K p7k = p7j.LIZ;
        if (p7k.LJ) {
            p7k.LJIILIIL(LJII, null);
            C84134X0g c84134X0g = this.LJII;
            P7K p7k2 = p7j.LIZ;
            if (p7k2.LJ) {
                tEFrameSizei2 = p7k2.LIZJ;
            } else {
                tEFrameSizei2 = null;
            }
            c84134X0g.LJZI = tEFrameSizei2;
            if (tEFrameSizei2 != null) {
                this.LJFF.LJIIIIZZ(50, 0, tEFrameSizei2.toString());
            }
        } else {
            p7k.LJIILIIL(LJII, this.LJII.LJZI);
            C84134X0g c84134X0g2 = this.LJII;
            P7K p7k3 = p7j.LIZ;
            if (!p7k3.LJ) {
                tEFrameSizei = p7k3.LIZJ;
            } else {
                tEFrameSizei = new TEFrameSizei(1080, 1920);
            }
            c84134X0g2.LJZL = tEFrameSizei;
        }
        if (p7j.LIZJ() == 1) {
            if (p7j.LIZLLL() == null) {
                C63922P6w.LIZIZ(LJJJZ, "SurfaceTexture is null.");
                return -100;
            }
            SurfaceTexture LIZLLL = p7j.LIZLLL();
            TEFrameSizei tEFrameSizei3 = this.LJII.LJZI;
            LIZLLL.setDefaultBufferSize(tEFrameSizei3.width, tEFrameSizei3.height);
        }
        P7K p7k4 = p7j.LIZ;
        int LJIIJ = p7k4.LJIIJ();
        if (LJIIJ != -1) {
            this.LJJJLL.LIZJ(LJIIJ);
        }
        p7k4.LJIJJLI(this.LJJJLL.LJIIIIZZ());
        this.LIZJ = this.LJIIIZ.createCaptureRequest(3);
        int LJIIJJI = p7j.LIZ.LJIIJJI();
        if (LJIIJJI != 2) {
            if (LJIIJJI != 8) {
                asList = null;
            } else {
                P7K p7k5 = p7j.LIZ;
                if (p7k5 != null) {
                    surfaceArr = p7k5.LJIIIIZZ();
                } else {
                    surfaceArr = null;
                }
                asList = Arrays.asList(surfaceArr);
                if (asList.size() > 1) {
                    ListProtector.remove(asList, 0);
                }
            }
        } else {
            asList = Arrays.asList(p7j.LIZIZ());
        }
        List<Surface> LJIIIZ = this.LJJJLL.LJIIIZ();
        if (asList != null) {
            this.LJJJLL.LJIILIIL(this.LJII.LLIIIILZ, asList);
            LJIIIZ.addAll(asList);
        }
        Iterator<Surface> it = LJIIIZ.iterator();
        while (it.hasNext()) {
            this.LIZJ.addTarget(it.next());
        }
        this.LIZJ.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(this.LJJII.min / this.LJII.LJLJI.fpsUnitFactor), Integer.valueOf(this.LJJII.max / this.LJII.LJLJI.fpsUnitFactor)));
        this.LJJIIZI = false;
        this.LJJIJIIJI = System.currentTimeMillis();
        if (this.LJII.LJLLI) {
            handler = LJIJI();
        } else {
            handler = this.LJIIJ;
        }
        this.LIZLLL = null;
        CameraCaptureSession.StateCallback yqf = new YQF(this);
        this.LJJJJZ = yqf;
        LJIILIIL(LJIIIZ, yqf, handler);
        if (this.LIZLLL == null) {
            LJJJJLL();
        }
        return 0;
    }

    @Override // X.YQ7
    public final Rect LJ(float f) {
        return new Rect();
    }

    @Override // X.YQ7
    public final String LJJIIZI(int i) {
        String LJ;
        C80074Vbi c80074Vbi = this.LJJJLL;
        if (c80074Vbi == null || (LJ = c80074Vbi.LJ()) == null) {
            return null;
        }
        CameraCharacteristics cameraCharacteristics = this.LJ.getCameraCharacteristics(LJ);
        this.LIZ = cameraCharacteristics;
        C84134X0g c84134X0g = this.LJII;
        int i2 = 1;
        if (((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            i2 = 0;
        }
        c84134X0g.LJLJJI = i2;
        return LJ;
    }

    public final void LJJJJZI(CameraDevice cameraDevice, int i, int i2) {
        C80074Vbi c80074Vbi;
        if (cameraDevice != null && (c80074Vbi = this.LJJJLL) != null) {
            CameraDevice.StateCallback LJFF = c80074Vbi.LJFF();
            if (LJFF == null) {
                String str = LJJJZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("on device proxy failed, state: ");
                LIZ.append(i);
                LIZ.append(", arg1: ");
                LIZ.append(i2);
                C63922P6w.LJ(str, X1D.LIZIZ(LIZ));
                return;
            }
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 3) {
                            if (i != 4) {
                            } else {
                                LJFF.onClosed(cameraDevice);
                            }
                        } else {
                            LJFF.onError(cameraDevice, i2);
                        }
                    } else {
                        LJFF.onDisconnected(cameraDevice);
                    }
                } else {
                    LJFF.onOpened(cameraDevice);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public final void LJJJLIIL(CameraCaptureSession cameraCaptureSession, int i, Object obj) {
        C80074Vbi c80074Vbi;
        if (cameraCaptureSession != null && (c80074Vbi = this.LJJJLL) != null) {
            CameraCaptureSession.StateCallback LJI = c80074Vbi.LJI();
            if (LJI == null) {
                String str = LJJJZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("on session proxy failed, state: ");
                LIZ.append(i);
                LIZ.append(", arg1: ");
                LIZ.append(obj);
                C63922P6w.LJ(str, X1D.LIZIZ(LIZ));
                return;
            }
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    if (i != 6) {
                                        if (i != 7 || obj == null) {
                                            return;
                                        }
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            LJI.onSurfacePrepared(cameraCaptureSession, (Surface) obj);
                                        }
                                    } else if (Build.VERSION.SDK_INT >= 26) {
                                        LJI.onCaptureQueueEmpty(cameraCaptureSession);
                                    }
                                } else {
                                    LJI.onClosed(cameraCaptureSession);
                                }
                            } else {
                                LJI.onReady(cameraCaptureSession);
                            }
                        } else {
                            LJI.onActive(cameraCaptureSession);
                        }
                    } else {
                        LJI.onConfigureFailed(cameraCaptureSession);
                    }
                } else {
                    LJI.onConfigured(cameraCaptureSession);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public YQ9(YQ6 yq6, Context context, CameraManager cameraManager, Handler handler) {
        super(yq6, context, handler);
        this.LJ = cameraManager;
        if (this.LJII.LJLLJ) {
            this.LJIIIIZZ = new C87359YQh(this);
        } else {
            this.LJIIIIZZ = new C87357YQf(this);
        }
        this.LJJJJZI = new YQH(this);
    }
}
