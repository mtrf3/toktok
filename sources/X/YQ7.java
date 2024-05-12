package X;

import Y.ARunnableS19S0101000_15;
import Y.ARunnableS51S0100000_15;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttvecamera.TEFocusParameters;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes16.dex */
public abstract class YQ7 implements InterfaceC87376YQy, InterfaceC87370YQs {
    public CameraCharacteristics LIZ;
    public final P9I LIZIZ;
    public CaptureRequest.Builder LIZJ;
    public volatile CameraCaptureSession LIZLLL;
    public CameraManager LJ;
    public final YQV LJFF;
    public final YQ6 LJI;
    public final C84134X0g LJII;
    public YQQ LJIIIIZZ;
    public CameraDevice LJIIIZ;
    public final Handler LJIIJ;
    public StreamConfigurationMap LJIIJJI;
    public CaptureRequest LJIIL;
    public boolean LJIILJJIL;
    public PDB LJIJJ;
    public InterfaceC87373YQv LJIL;
    public int[] LJJ;
    public C84151X0x LJJIFFI;
    public int LJJIII;
    public Rect LJJIIZ;
    public boolean LJJIJLIJ;
    public OutputConfiguration LJJJI;
    public final AtomicBoolean LJIILIIL = new AtomicBoolean(false);
    public float LJIILL = 0.0f;
    public float LJIILLIIL = 1.0f;
    public Range<Float> LJIIZILJ = null;
    public int LJIJ = 0;
    public Rect LJIJI = null;
    public P75 LJIJJLI = null;
    public int LJJI = 0;
    public TEFrameRateRange LJJII = new TEFrameRateRange(7, 30);
    public Handler LJJIIJ = null;
    public HandlerThread LJJIIJZLJL = null;
    public volatile boolean LJJIIZI = false;
    public long LJJIJ = 0;
    public long LJJIJIIJI = 0;
    public long LJJIJIIJIL = 0;
    public long LJJIJIL = 0;
    public int LJJIJL = 0;
    public boolean LJJIL = false;
    public volatile boolean LJJIZ = false;
    public boolean LJJJ = false;
    public boolean LJJJIL = false;
    public final C58226MtC LJJJJ = new C58226MtC();
    public final HashMap<Integer, String> LJJJJI = new HashMap<>();
    public boolean LJJJJIZL = false;
    public boolean LJJJJJ = false;
    public boolean LJJJJJL = false;
    public final List<OutputConfiguration> LJJJJL = new ArrayList();
    public final ARunnableS51S0100000_15 LJJJJLI = new ARunnableS51S0100000_15(this, 106);
    public final YQR LJJJJLL = new YQR(this);
    public CameraCaptureSession.StateCallback LJJJJZ = new YQM(this);
    public CameraCaptureSession.CaptureCallback LJJJJZI = new YQC(this);

    public void LJIIIIZZ(YR0 yr0, int i) {
    }

    public Range<Integer> LJIIJJI(Range<Integer> range) {
        return range;
    }

    public int[] LJIJ() {
        return null;
    }

    public int LJIJJ() {
        return 3;
    }

    public int LJJ() {
        return -1;
    }

    public int[] LJJIFFI() {
        return null;
    }

    public void LJJIJIIJI(int i, int i2) {
    }

    public void LJJIJIIJIL(int i) {
    }

    public abstract int LJJIJLIJ();

    public void LJJIL() {
    }

    public void LJJJ() {
    }

    public void LJJJI(PZA pza) {
    }

    @Override // X.InterfaceC87370YQs
    public int LIZ() {
        CaptureRequest.Builder builder = this.LIZJ;
        if (builder == null) {
            this.LJFF.LJ(this.LJIIIZ, this.LJII.LJLILLLLZI, -100, "rollbackNormalSessionRequest : param is null.");
            return -100;
        }
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        this.LIZJ.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(LJIJJ()));
        this.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 1);
        if (this.LJII.LJLLL) {
            CaptureRequest.Builder builder2 = this.LIZJ;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_REGIONS;
            MeteringRectangle[] meteringRectangleArr = YQW.LIZ;
            builder2.set(key, meteringRectangleArr);
            this.LIZJ.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        LJJJJIZL(this.LIZJ);
        C63922P6w.LIZLLL("TECameraModeBase", "rollbackNormalSessionRequest");
        return 0;
    }

    @Override // X.InterfaceC87370YQs
    public int LIZIZ() {
        if (this.LIZJ == null) {
            this.LJFF.LJ(this.LJIIIZ, this.LJII.LJLILLLLZI, -100, "rollbackMeteringSessionRequest : param is null.");
            return -100;
        }
        LJJJJLI(this.LJJI);
        this.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 1);
        if (this.LJII.LJLLL) {
            this.LIZJ.set(CaptureRequest.CONTROL_AE_REGIONS, YQW.LIZ);
        }
        LJJJJIZL(this.LIZJ);
        C63922P6w.LIZLLL("TECameraModeBase", "rollbackMeteringSessionRequest");
        return 0;
    }

    public final void LIZLLL() {
        if (this.LIZLLL != null && Build.VERSION.SDK_INT >= 28) {
            P7T.LIZ("TECameraModeBase-abortSession");
            long currentTimeMillis = System.currentTimeMillis();
            try {
                this.LIZLLL.abortCaptures();
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("abort session failed, e: ");
                LIZ.append(e.getMessage());
                C63922P6w.LIZIZ("TECameraModeBase", X1D.LIZIZ(LIZ));
            }
            this.LJJJ = true;
            C63922P6w.LIZLLL("TECameraModeBase", "abort session...consume = " + (System.currentTimeMillis() - currentTimeMillis));
            P7T.LIZIZ();
        }
    }

    public Rect LJFF() {
        Rect rect = this.LJJIIZ;
        if (rect == null) {
            C63922P6w.LIZIZ("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: mActiveArraySize is null");
            C63922P6w.LIZIZ("TECameraModeBase", "ActiveArraySize == null.");
            this.LJFF.LJIIIIZZ(-420, -420, "ActiveArraySize == null.");
            return null;
        }
        float f = this.LJIILLIIL;
        if (f < 1.0f || f > this.LJIILL) {
            C63922P6w.LIZIZ("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: invalid factor");
            C63922P6w.LIZIZ("TECameraModeBase", "factor invalid.");
            this.LJFF.LJIIIIZZ(-420, -420, "factor invalid.");
            return null;
        }
        int width = rect.width() / 2;
        int height = this.LJJIIZ.height() / 2;
        int width2 = (int) ((this.LJJIIZ.width() * 0.5f) / this.LJIILLIIL);
        int height2 = (int) ((this.LJJIIZ.height() * 0.5f) / this.LJIILLIIL);
        return new Rect(width - width2, height - height2, width + width2, height + height2);
    }

    public void LJI() {
        if (this.LIZJ == null) {
            this.LJFF.LJIIIIZZ(-100, -100, "rollbackNormalSessionRequest : param is null.");
        } else {
            this.LJIIIIZZ.LLJJL();
        }
    }

    public void LJIIIZ() {
        P7J p7j;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                if (!this.LJJJJJL && (p7j = this.LJI.LJI) != null && p7j.LIZIZ() != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.LJI.LJI.LIZIZ());
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((OutputConfiguration) ListProtector.get(this.LJJJJL, i)).addSurface((Surface) ListProtector.get(arrayList, i));
                        this.LJJJJJL = true;
                    }
                }
                if (!this.LJJJJJ && this.LJJJJJL) {
                    this.LIZLLL.finalizeOutputConfigurations(this.LJJJJL);
                    this.LJJJJJ = true;
                    C63922P6w.LIZ("TECameraModeBase", "finalizeOutputConfigurations in session onConfigured");
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public void LJIIJ() {
        C84134X0g c84134X0g;
        if (this.LJI != null && (c84134X0g = this.LJII) != null && c84134X0g.LJLLI) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("close session process...state = ");
            LIZ.append(this.LJI.LJJIL);
            C63922P6w.LIZLLL("TECameraModeBase", X1D.LIZIZ(LIZ));
            if (this.LJI.LJJIL == 2) {
                this.LJI.LJIILJJIL();
            }
        }
        this.LJJIZ = false;
        if (this.LJIIIZ == null) {
            C63922P6w.LIZIZ("TECameraModeBase", "close session process...device is null");
            return;
        }
        if (this.LIZLLL == null) {
            C63922P6w.LIZIZ("TECameraModeBase", "close session process...session is null");
            return;
        }
        if (!this.LJJJ && this.LJII.LLJILLL) {
            LIZLLL();
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.LIZLLL.close();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        this.LIZLLL = null;
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        C87367YQp.LIZ("te_record_camera2_close_session_cost", currentTimeMillis2);
        C63922P6w.LIZLLL("TECameraModeBase", "close session...consume = " + currentTimeMillis2);
    }

    public final CaptureRequest.Builder LJIIL() {
        CameraDevice cameraDevice = this.LJIIIZ;
        if (cameraDevice != null) {
            try {
                return cameraDevice.createCaptureRequest(2);
            } catch (CameraAccessException e) {
                C16880lQ.LLLLIIL(e);
            } catch (IllegalStateException e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        return null;
    }

    public void LJIILJJIL() {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28 && this.LJIIIZ != null) {
            ((ArrayList) this.LJJJJL).clear();
            C84134X0g c84134X0g = this.LJII;
            if (c84134X0g.LLIFFJFJJ == 0 && c84134X0g.LJLILLLLZI == 2) {
                List<OutputConfiguration> list = this.LJJJJL;
                TEFrameSizei tEFrameSizei = this.LJII.LJZI;
                ((ArrayList) list).add(new OutputConfiguration(new Size(tEFrameSizei.width, tEFrameSizei.height), SurfaceTexture.class));
                if (this.LJII.LJLLI) {
                    handler = LJIJI();
                } else {
                    handler = this.LJIIJ;
                }
                if (this.LJIIIZ != null) {
                    if (this.LIZJ == null) {
                        if (this.LJII.LLIIII.getBoolean("enablePreviewTemplate")) {
                            this.LIZJ = this.LJIIIZ.createCaptureRequest(1);
                        } else {
                            this.LIZJ = this.LJIIIZ.createCaptureRequest(3);
                        }
                    }
                    this.LIZJ.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, LJIIJJI(new Range<>(Integer.valueOf(this.LJJII.min / this.LJII.LJLJI.fpsUnitFactor), Integer.valueOf(this.LJJII.max / this.LJII.LJLJI.fpsUnitFactor))));
                    LJIILIIL(null, this.LJJJJZ, handler);
                }
            }
            this.LJJJJJ = false;
            this.LJJJJJL = false;
        }
    }

    public final void LJIILL() {
        Bundle bundle;
        P7T.LIZ("TECameraModeBase-fillFeatures");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJII.LJLILLLLZI);
        LIZ.append("_");
        LIZ.append(this.LJII.LJLJJI);
        String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("fillFeatures key = ");
        LIZ2.append(LIZIZ);
        C63922P6w.LIZ("TECameraModeBase", X1D.LIZIZ(LIZ2));
        if (((HashMap) this.LJI.LJIIZILJ).containsKey(LIZIZ)) {
            bundle = (Bundle) ((HashMap) this.LJI.LJIIZILJ).get(LIZIZ);
        } else {
            bundle = new Bundle();
            ((HashMap) this.LJI.LJIIZILJ).put(LIZIZ, bundle);
        }
        bundle.putParcelable("camera_preview_size", this.LJII.LJZI);
        if (this.LIZ != null && this.LJIIL != null) {
            TEFocusParameters tEFocusParameters = new TEFocusParameters();
            tEFocusParameters.mActiveSize = (Rect) this.LIZ.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            tEFocusParameters.mCropSize = (Rect) this.LJIIL.get(CaptureRequest.SCALER_CROP_REGION);
            tEFocusParameters.mMaxRegionsAE = ((Integer) this.LIZ.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue();
            tEFocusParameters.mMaxRegionsAF = ((Integer) this.LIZ.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
            bundle.putParcelable("camera_focus_parameters", tEFocusParameters);
        }
        bundle.putInt("camera_sensor_orientation", this.LJII.LJLJJL);
        P7T.LIZIZ();
    }

    public final float[] LJIIZILJ() {
        if (this.LIZJ == null || this.LIZLLL == null) {
            this.LJFF.LJIIIIZZ(-432, -432, "Capture Session is null");
        }
        float[] fArr = (float[]) this.LIZ.get(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
        if (fArr == null) {
            return new float[]{-1.0f, -1.0f};
        }
        return fArr;
    }

    public final Handler LJIJI() {
        if (this.LJJIIJZLJL == null) {
            HandlerThread handlerThread = new HandlerThread("camera thread");
            this.LJJIIJZLJL = handlerThread;
            handlerThread.start();
            C63922P6w.LIZLLL("TECameraModeBase", "getCameraHandler, init camera thread");
        }
        if (this.LJJIIJ == null) {
            this.LJJIIJ = new Handler(this.LJJIIJZLJL.getLooper());
        }
        return this.LJJIIJ;
    }

    public final List<Size> LJIL() {
        if (this.LJIIJJI == null) {
            this.LJIIJJI = (StreamConfigurationMap) this.LIZ.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        }
        if (!StreamConfigurationMap.isOutputSupportedFor(SurfaceTexture.class)) {
            C63922P6w.LIZIZ("TECameraModeBase", "Output is not supported, ignore getBestPreviewSize operation.");
            return new ArrayList();
        }
        Size[] outputSizes = this.LJIIJJI.getOutputSizes(SurfaceTexture.class);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(size);
        }
        return arrayList;
    }

    public final int[] LJJI() {
        if (this.LIZJ == null || this.LIZLLL == null) {
            this.LJFF.LJIIIIZZ(-430, -430, "Capture Session is null");
        }
        Range range = (Range) this.LIZ.get(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE);
        if (range == null || ((Integer) range.getUpper()).intValue() < 800 || ((Integer) range.getLower()).intValue() > 100) {
            return new int[]{-1, -1};
        }
        return new int[]{((Integer) range.getUpper()).intValue(), ((Integer) range.getLower()).intValue()};
    }

    public final long[] LJJIII() {
        if (this.LIZJ == null || this.LIZLLL == null) {
            this.LJFF.LJIIIIZZ(-431, -431, "Capture Session is null");
        }
        Range range = (Range) this.LIZ.get(CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE);
        if (range == null) {
            return new long[]{-1, -1};
        }
        return new long[]{((Long) range.getUpper()).longValue(), ((Long) range.getLower()).longValue()};
    }

    public final void LJJIIJZLJL() {
        YQ6 yq6 = this.LJI;
        if (yq6 != null) {
            yq6.LJIIL();
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("openCameraLock failed, ");
        LIZ.append(android.util.Log.getStackTraceString(new Throwable()));
        C63922P6w.LIZ("TECameraModeBase", X1D.LIZIZ(LIZ));
    }

    public int LJJIIZ() {
        TEFrameSizei tEFrameSizei;
        P7T.LIZ("TECameraModeBase-prepareProvider");
        P7J p7j = this.LJI.LJI;
        if (this.LJIIIZ == null || p7j == null) {
            C63922P6w.LIZIZ("TECameraModeBase", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        if (this.LJIIJJI == null) {
            this.LJIIJJI = (StreamConfigurationMap) this.LIZ.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        }
        P7K p7k = p7j.LIZ;
        if (p7k.LJ) {
            p7k.LJIIIIZZ = this.LJIJJLI;
            StreamConfigurationMap streamConfigurationMap = this.LJIIJJI;
            P7K p7k2 = p7j.LIZ;
            TEFrameSizei tEFrameSizei2 = null;
            if (p7k2 != null) {
                p7k2.LJIIL(streamConfigurationMap, null);
            }
            C84134X0g c84134X0g = this.LJII;
            P7K p7k3 = p7j.LIZ;
            if (p7k3.LJ) {
                tEFrameSizei2 = p7k3.LIZJ;
            }
            c84134X0g.LJZI = tEFrameSizei2;
            if (tEFrameSizei2 != null) {
                this.LJFF.LJIIIIZZ(50, 0, tEFrameSizei2.toString());
            }
        } else {
            p7k.LJIIL(this.LJIIJJI, this.LJII.LJZI);
            C84134X0g c84134X0g2 = this.LJII;
            P7K p7k4 = p7j.LIZ;
            if (!p7k4.LJ) {
                tEFrameSizei = p7k4.LIZJ;
            } else {
                tEFrameSizei = new TEFrameSizei(1080, 1920);
            }
            c84134X0g2.LJZL = tEFrameSizei;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Camera provider type: ");
        LIZ.append(p7j.LIZJ());
        C63922P6w.LIZLLL("TECameraModeBase", X1D.LIZIZ(LIZ));
        if (p7j.LIZJ() == 1 || p7j.LIZJ() == 16) {
            if (p7j.LIZLLL() == null) {
                C63922P6w.LIZIZ("TECameraModeBase", "SurfaceTexture is null.");
                return -100;
            }
            SurfaceTexture LIZLLL = p7j.LIZLLL();
            TEFrameSizei tEFrameSizei3 = this.LJII.LJZI;
            LIZLLL.setDefaultBufferSize(tEFrameSizei3.width, tEFrameSizei3.height);
        } else if (p7j.LIZJ() != 2) {
            if (p7j.LIZJ() == 8) {
                SurfaceTexture LIZLLL2 = p7j.LIZLLL();
                TEFrameSizei tEFrameSizei4 = this.LJII.LJZI;
                LIZLLL2.setDefaultBufferSize(tEFrameSizei4.width, tEFrameSizei4.height);
            } else if (p7j.LIZJ() != 32) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Unsupported camera provider type : ");
                LIZ2.append(p7j.LIZJ());
                C63922P6w.LIZIZ("TECameraModeBase", X1D.LIZIZ(LIZ2));
                return -200;
            }
        }
        P7T.LIZIZ();
        return 0;
    }

    public final void LJJIJ() {
        P9I p9i = this.LIZIZ;
        CameraCharacteristics cameraCharacteristics = this.LIZ;
        C84134X0g c84134X0g = this.LJII;
        TEFrameRateRange tEFrameRateRange = c84134X0g.LJLJI;
        int i = tEFrameRateRange.min;
        int i2 = tEFrameRateRange.max;
        int i3 = c84134X0g.LLIIL;
        int i4 = c84134X0g.LJLJJI;
        p9i.getClass();
        this.LJJII = P9I.LIZJ(cameraCharacteristics, i, i2, i3, i4);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Set Fps Range: ");
        LIZ.append(this.LJJII.toString());
        LIZ.append(", strategy: ");
        LIZ.append(this.LJII.LLIIL);
        C63922P6w.LIZLLL("TECameraModeBase", X1D.LIZIZ(LIZ));
    }

    public int LJJJJI() {
        P7T.LIZ("TECameraModeBase-updateCapture");
        if (this.LJI.LJI == null || this.LIZJ == null) {
            C63922P6w.LIZIZ("TECameraModeBase", "update capture failed");
            return -100;
        }
        P9I p9i = this.LIZIZ;
        CameraCharacteristics cameraCharacteristics = this.LIZ;
        p9i.getClass();
        if (P9I.LJIIIZ(cameraCharacteristics)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Stabilization Supported, toggle = ");
            LIZ.append(this.LJII.LLILL);
            C63922P6w.LIZLLL("TECameraModeBase", X1D.LIZIZ(LIZ));
            P9I p9i2 = this.LIZIZ;
            CameraCharacteristics cameraCharacteristics2 = this.LIZ;
            CaptureRequest.Builder builder = this.LIZJ;
            boolean z = this.LJII.LLILL;
            p9i2.getClass();
            if (P9I.LIZ(cameraCharacteristics2, builder, z) == 0 && this.LJII.LLILL) {
                this.LJFF.LJIIIIZZ(113, 1, "enable stablization");
            }
        }
        this.LIZJ.set(CaptureRequest.CONTROL_MODE, 1);
        LJJIJ();
        Range<Integer> LJIIJJI = LJIIJJI(new Range<>(Integer.valueOf(this.LJJII.min / this.LJII.LJLJI.fpsUnitFactor), Integer.valueOf(this.LJJII.max / this.LJII.LJLJI.fpsUnitFactor)));
        this.LIZJ.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, LJIIJJI);
        this.LJFF.LJIIIIZZ(121, 0, LJIIJJI.toString());
        this.LIZJ.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.LJIJ));
        LJJJJLI(this.LJJI);
        if (Float.compare(this.LJII.LLJJJJ, 1.0f) != 0) {
            float min = Math.min(this.LJII.LLJJJJ, this.LJIILL);
            this.LJIILLIIL = min;
            if (this.LJII.LLJJJJJIL) {
                if (Build.VERSION.SDK_INT < 30) {
                    Rect LJFF = LJFF();
                    if (LJFF == null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("calculateV2 default crop_region fail! zoom = ");
                        LIZ2.append(this.LJIILLIIL);
                        C63922P6w.LJ("TECameraModeBase", X1D.LIZIZ(LIZ2));
                    } else {
                        this.LIZJ.set(CaptureRequest.SCALER_CROP_REGION, LJFF);
                        this.LJIJI = LJFF;
                    }
                } else {
                    this.LIZJ.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(min));
                }
            } else {
                Rect LJ = LJ(min);
                if (LJ == null) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("calculate default crop_region fail! zoom = ");
                    LIZ3.append(this.LJIILLIIL);
                    C63922P6w.LJ("TECameraModeBase", X1D.LIZIZ(LIZ3));
                } else {
                    this.LIZJ.set(CaptureRequest.SCALER_CROP_REGION, LJ);
                    this.LJIJI = LJ;
                }
            }
        }
        XS3 LJJJJIZL = LJJJJIZL(this.LIZJ);
        if (!LJJJJIZL.LIZ) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("first request failed: ");
            LIZ4.append(LJJJJIZL.LIZIZ);
            C63922P6w.LIZIZ("TECameraModeBase", X1D.LIZIZ(LIZ4));
        }
        this.LJII.LJLJJL = ((Integer) this.LIZ.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("mCameraSettings.mRotation = ");
        LIZ5.append(this.LJII.LJLJJL);
        LIZ5.append(", mCameraSettings:");
        LIZ5.append(this.LJII.hashCode());
        C63922P6w.LIZLLL("TECameraModeBase", X1D.LIZIZ(LIZ5));
        this.LJI.LJIILIIL(3);
        LJIILL();
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("send capture request...");
        LIZ6.append(this.LIZLLL);
        C63922P6w.LIZLLL("TECameraModeBase", X1D.LIZIZ(LIZ6));
        this.LJFF.LIZJ(this.LJI, "TECamera2 preview");
        P7T.LIZIZ();
        return 0;
    }

    public final void LJJJJLL() {
        YQ6 yq6 = this.LJI;
        if (yq6 != null) {
            yq6.LJIILJJIL();
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("waitCameraTaskDoneOrTimeout failed, ");
        LIZ.append(android.util.Log.getStackTraceString(new Throwable()));
        C63922P6w.LIZ("TECameraModeBase", X1D.LIZIZ(LIZ));
    }

    public final void LJJJJ() {
        try {
            int LJJJJI = LJJJJI();
            if (LJJJJI != 0) {
                LJJIIJZLJL();
                ARunnableS19S0101000_15 aRunnableS19S0101000_15 = new ARunnableS19S0101000_15(this, LJJJJI, 11);
                if (this.LJII.LJLLI) {
                    this.LJIIJ.post(aRunnableS19S0101000_15);
                } else {
                    aRunnableS19S0101000_15.run();
                }
            }
        } catch (Exception e) {
            LJJIIJZLJL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("triggerUpdateCaptureRequest failed: ");
            LIZ.append(e.getMessage());
            C63922P6w.LIZIZ("TECameraModeBase", X1D.LIZIZ(LIZ));
        }
    }

    public Rect LJ(float f) {
        CameraCharacteristics cameraCharacteristics = this.LIZ;
        if (cameraCharacteristics == null || this.LIZJ == null) {
            this.LJFF.LJ(this.LJIIIZ, this.LJII.LJLILLLLZI, -420, "Camera info is null, may be you need reopen camera.");
            return null;
        }
        float floatValue = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        Rect rect = (Rect) this.LIZ.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        int width = (int) (rect.width() / floatValue);
        int height = (int) (rect.height() / floatValue);
        int width2 = (int) (((rect.width() - width) / floatValue) * f);
        int height2 = (int) (((rect.height() - height) / floatValue) * f);
        int i = width2 - (width2 & 3);
        int i2 = height2 - (height2 & 3);
        return new Rect(i, i2, rect.width() - i, rect.height() - i2);
    }

    public int LJIILLIIL(C84151X0x c84151X0x) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        Rect rect;
        C84134X0g c84134X0g = this.LJII;
        if (c84134X0g.LJLLJ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("settings = ");
            LIZ.append(c84151X0x);
            C63922P6w.LIZ("TECameraModeBase", X1D.LIZIZ(LIZ));
            this.LJJIFFI = c84151X0x;
            YQQ yqq = this.LJIIIIZZ;
            yqq.LIZIZ = c84151X0x;
            C84134X0g c84134X0g2 = this.LJII;
            yqq.LIZJ = c84134X0g2;
            yqq.LIZLLL = c84134X0g2.LJLL;
            if (this.LIZIZ == null || this.LIZLLL == null || this.LIZJ == null || this.LJJIFFI == null) {
                C63922P6w.LJ("TECameraModeBase", "Env is null");
                C84151X0x c84151X0x2 = this.LJJIFFI;
                if (c84151X0x2 != null) {
                    c84151X0x2.LJIIJJI.LIZ(-100, this.LJII.LJLJJI, "Env is null");
                }
            } else {
                P9I p9i = this.LIZIZ;
                CameraCharacteristics cameraCharacteristics = this.LIZ;
                p9i.getClass();
                if (cameraCharacteristics != null && ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() >= 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                P9I p9i2 = this.LIZIZ;
                CameraCharacteristics cameraCharacteristics2 = this.LIZ;
                p9i2.getClass();
                if (cameraCharacteristics2 != null && ((Integer) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() >= 1) {
                    z5 = true;
                } else {
                    z5 = false;
                    if (!z4) {
                        C63922P6w.LJ("TECameraModeBase", "not support focus and meter!");
                        this.LJJIFFI.LJIIJJI.LIZ(-412, this.LJII.LJLJJI, "not support focus and meter!");
                        return -412;
                    }
                }
                boolean z7 = this.LJIILIIL.get();
                if (!z5 || !this.LJJIFFI.LJI) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z7 && !z6) {
                    this.LJJJJLI.run();
                    try {
                        Thread.sleep(50L);
                    } catch (InterruptedException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    C63922P6w.LIZLLL("TECameraModeBase", "cancel previous touch af..");
                }
                if (z4 && this.LJJIFFI.LJII) {
                    this.LJJIFFI.getClass();
                    C84151X0x c84151X0x3 = this.LJJIFFI;
                    int i2 = c84151X0x3.LIZ;
                    int i3 = c84151X0x3.LIZIZ;
                    float f = c84151X0x3.LIZJ;
                    float f2 = c84151X0x3.LIZLLL;
                    int i4 = this.LJII.LJLJJL;
                    EnumC81106VsM enumC81106VsM = c84151X0x3.LJIIJ;
                    i = -100;
                    rect = LIZJ(i2, i3, f, f2, i4, 1, enumC81106VsM);
                    if (!PDA.LJIILL(rect)) {
                        C63922P6w.LIZIZ("TECameraModeBase", "meteringRect is not valid!");
                        this.LJJIFFI.LJIIJJI.LIZ(-100, this.LJII.LJLJJI, "meteringRect is not valid!");
                    } else {
                        this.LJIIIIZZ.LJ(this.LIZJ, rect);
                        if (z6) {
                            LJJJJJL(this.LIZJ, this.LJIIIIZZ.LIZIZ(false), this.LJIIJ);
                            this.LJIILIIL.set(false);
                            return 0;
                        }
                    }
                } else {
                    i = -100;
                    rect = null;
                }
                if (z5 && this.LJJIFFI.LJI) {
                    this.LJJIFFI.getClass();
                    C84151X0x c84151X0x4 = this.LJJIFFI;
                    Rect LIZJ = LIZJ(c84151X0x4.LIZ, c84151X0x4.LIZIZ, c84151X0x4.LIZJ, c84151X0x4.LIZLLL, this.LJII.LJLJJL, 0, c84151X0x4.LJIIJ);
                    if (!PDA.LJIILL(LIZJ)) {
                        C63922P6w.LIZIZ("TECameraModeBase", "focusRect is not valid!");
                        this.LJJIFFI.LJIIJJI.LIZ(i, this.LJII.LJLJJI, "focusRect is not valid!");
                    } else {
                        this.LJIILIIL.set(true);
                        if (this.LJJIJLIJ) {
                            if (c84151X0x.LJIIIZ) {
                                this.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 3);
                                this.LIZJ.set(CaptureRequest.FLASH_MODE, 1);
                            } else {
                                this.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 1);
                                this.LIZJ.set(CaptureRequest.FLASH_MODE, 0);
                            }
                        }
                        this.LJIIIIZZ.LIZLLL(this.LIZJ, LIZJ);
                        LJII(this.LIZJ, this.LJJJJZI, LJIJI());
                        this.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                        this.LIZJ.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(LIZJ, 999)});
                        if (rect != null) {
                            this.LIZJ.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
                        }
                        this.LIZJ.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
                        CaptureRequest.Builder builder = this.LIZJ;
                        XS3 LJJJJJL = LJJJJJL(builder, this.LJIIIIZZ.LIZJ(builder, this.LJIILIIL, c84151X0x.LJIIIIZZ), this.LJIIJ);
                        if (LJJJJJL.LIZ) {
                            return 0;
                        }
                        this.LJIILIIL.set(false);
                        C84151X0x c84151X0x5 = this.LJJIFFI;
                        if (c84151X0x5 != null) {
                            c84151X0x5.LJIIJJI.LIZ(-108, this.LJII.LJLJJI, LJJJJJL.LIZIZ);
                        }
                        this.LJFF.LJIIIIZZ(-411, -411, LJJJJJL.LIZIZ);
                        return -108;
                    }
                }
                return -412;
            }
            return -100;
        }
        this.LJJIFFI = c84151X0x;
        YQQ yqq2 = this.LJIIIIZZ;
        yqq2.LIZIZ = c84151X0x;
        yqq2.LIZJ = c84134X0g;
        yqq2.LIZLLL = c84134X0g.LJLL;
        if (this.LIZIZ == null || this.LIZLLL == null || this.LIZJ == null) {
            C63922P6w.LJ("TECameraModeBase", "Env is null");
            this.LJJIFFI.LJIIJJI.LIZ(-100, this.LJII.LJLJJI, "Env is null");
            return -100;
        }
        P9I p9i3 = this.LIZIZ;
        CameraCharacteristics cameraCharacteristics3 = this.LIZ;
        p9i3.getClass();
        if (cameraCharacteristics3 != null && ((Integer) cameraCharacteristics3.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() >= 1) {
            z = true;
        } else {
            z = false;
        }
        P9I p9i4 = this.LIZIZ;
        CameraCharacteristics cameraCharacteristics4 = this.LIZ;
        p9i4.getClass();
        if (cameraCharacteristics4 != null && ((Integer) cameraCharacteristics4.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() >= 1) {
            z2 = true;
        } else {
            z2 = false;
            if (!z) {
                C63922P6w.LJ("TECameraModeBase", "do not support MeteringAreaAF!");
                this.LJJIFFI.LJIIJJI.LIZ(-412, this.LJII.LJLJJI, "do not support MeteringAreaAF!");
                return -412;
            }
        }
        boolean z8 = c84151X0x.LJIIIIZZ;
        boolean z9 = this.LJIILIIL.get();
        if (!z2 || !this.LJJIFFI.LJI) {
            z3 = true;
        } else {
            z3 = false;
        }
        C63922P6w.LIZ("TECameraModeBase", "focusAtPoint++");
        if (z9 && !z3) {
            this.LJJJJLI.run();
            try {
                Thread.sleep(50L);
            } catch (InterruptedException e2) {
                C16880lQ.LLLLIIL(e2);
            }
            C63922P6w.LIZ("TECameraModeBase", "cancel previous touch af..");
        }
        this.LJJIFFI.getClass();
        C84151X0x c84151X0x6 = this.LJJIFFI;
        Rect LIZJ2 = LIZJ(c84151X0x6.LIZ, c84151X0x6.LIZIZ, c84151X0x6.LIZJ, c84151X0x6.LIZLLL, this.LJII.LJLJJL, 0, c84151X0x6.LJIIJ);
        this.LJJIFFI.getClass();
        C84151X0x c84151X0x7 = this.LJJIFFI;
        Rect LIZJ3 = LIZJ(c84151X0x7.LIZ, c84151X0x7.LIZIZ, c84151X0x7.LIZJ, c84151X0x7.LIZLLL, this.LJII.LJLJJL, 1, c84151X0x7.LJIIJ);
        if (!PDA.LJIILL(LIZJ2) || !PDA.LJIILL(LIZJ3)) {
            C63922P6w.LIZIZ("TECameraModeBase", "focusRect or meteringRect is not valid!");
            this.LJJIFFI.LJIIJJI.LIZ(-100, this.LJII.LJLJJI, "focusRect or meteringRect is not valid!");
            return -100;
        }
        if (this.LJJIFFI.LJII && z) {
            this.LJIIIIZZ.LJ(this.LIZJ, LIZJ3);
        }
        if (z3) {
            if (z && this.LJJIFFI.LJII) {
                LJJJJJL(this.LIZJ, this.LJIIIIZZ.LIZIZ(false), this.LJIIJ);
                this.LJIILIIL.set(false);
                if (this.LJII.LJLLL) {
                    YQ6 yq6 = this.LJI;
                    yq6.LJJJJ.LIZIZ(this.LJJJJLL, this.LJIIJ, yq6.LIZLLL(VKA.REGISTER_SENSOR));
                }
            }
            return -412;
        }
        this.LJIILIIL.set(true);
        this.LJIIIIZZ.LIZLLL(this.LIZJ, LIZJ2);
        if (this.LJII.LJLLL) {
            CaptureRequest.Builder builder2 = this.LIZJ;
            XS3 LJII = LJII(builder2, this.LJIIIIZZ.LIZJ(builder2, this.LJIILIIL, z8), this.LJIIJ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("focusAtPoint, capture to trigger focus, response = ");
            LIZ2.append(LJII.LIZ);
            C63922P6w.LIZLLL("TECameraModeBase", X1D.LIZIZ(LIZ2));
            this.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        }
        CaptureRequest.Builder builder3 = this.LIZJ;
        XS3 LJJJJJL2 = LJJJJJL(builder3, this.LJIIIIZZ.LIZJ(builder3, this.LJIILIIL, z8), this.LJIIJ);
        if (!LJJJJJL2.LIZ) {
            this.LJIILIIL.set(false);
            this.LJJIFFI.LJIIJJI.LIZ(-108, this.LJII.LJLJJI, LJJJJJL2.LIZIZ);
            this.LJFF.LJIIIIZZ(-411, -411, LJJJJJL2.LIZIZ);
            return -108;
        }
        if (this.LJII.LJLLL && !z8) {
            YQ6 yq62 = this.LJI;
            yq62.LJJJJ.LIZIZ(this.LJJJJLL, this.LJIIJ, yq62.LIZLLL(VKA.REGISTER_SENSOR));
        }
        C63922P6w.LIZLLL("TECameraModeBase", "focusAtPoint, done");
        return 0;
    }

    public final List<Size> LJIJJLI(int i) {
        if (this.LJIIJJI == null) {
            this.LJIIJJI = (StreamConfigurationMap) this.LIZ.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        }
        if (!this.LJIIJJI.isOutputSupportedFor(i)) {
            C63922P6w.LIZIZ("TECameraModeBase", "Output format is not supported");
            return new ArrayList();
        }
        Size[] outputSizes = this.LJIIJJI.getOutputSizes(i);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(size);
        }
        return arrayList;
    }

    public final int LJJII(List<Surface> list) {
        if (Build.VERSION.SDK_INT >= 28) {
            if (this.LJII.LJLILLLLZI == 9 && list.size() == 1 && this.LJII.LLILL) {
                C63922P6w.LIZLLL("TECameraModeBase", "getSessionType, create session for oppo video eis.");
                return 57355;
            }
            C63922P6w.LIZLLL("TECameraModeBase", "getSessionType, create regular session.");
            return 0;
        }
        C63922P6w.LIZLLL("TECameraModeBase", "getSessionType, create normal session.");
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String LJJIIZI(int r15) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YQ7.LJJIIZI(int):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LJJIJIL(String str) {
        int intValue;
        if (this.LIZJ == null || this.LIZLLL == null) {
            this.LJFF.LJIIIIZZ(-424, -424, "Capture Session is null");
        }
        if (this.LJJJJ.get(str) == null) {
            intValue = 1;
        } else {
            intValue = this.LJJJJ.get(str).intValue();
        }
        if (!Arrays.asList(this.LIZ.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES)).contains(Integer.valueOf(intValue))) {
            this.LJFF.LJIIIIZZ(-424, -424, "invalid white balance");
            return;
        }
        XS3 LJJJJIZL = LJJJJIZL(this.LIZJ);
        if (!LJJJJIZL.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setWhiteBalance exception: ");
            LIZ.append(LJJJJIZL.LIZIZ);
            C63922P6w.LIZIZ("TECameraModeBase", X1D.LIZIZ(LIZ));
            this.LJFF.LJIIIIZZ(-424, -424, LJJJJIZL.LIZIZ);
        }
    }

    public final void LJJIJL(CaptureRequest.Builder builder) {
        int[] iArr = this.LJJ;
        if (iArr != null) {
            if (PDA.LJFF(1, iArr)) {
                builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 1);
                builder.set(CaptureRequest.CONTROL_SCENE_MODE, 1);
                return;
            } else if (PDA.LJFF(2, this.LJJ)) {
                builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 2);
                builder.set(CaptureRequest.CONTROL_SCENE_MODE, 1);
                return;
            } else {
                if (!PDA.LJFF(0, this.LJJ)) {
                    return;
                }
                C63922P6w.LJ("TECameraModeBase", "FaceDetect is not supported!");
                return;
            }
        }
        C63922P6w.LIZ("TECameraModeBase", "FaceDetect is not supported!");
    }

    public final XS3 LJJJJIZL(CaptureRequest.Builder builder) {
        return LJJJJJL(builder, this.LJJJJZI, LJIJI());
    }

    public final void LJJJJLI(int i) {
        if (i == 1) {
            if (this.LJII.LJLJJI == 1) {
                LJJIJL(this.LIZJ);
                C63922P6w.LIZLLL("TECameraModeBase", "use faceae for front");
                return;
            }
            return;
        }
        if (i == 2) {
            if (this.LJII.LJLJJI != 0) {
                return;
            }
            LJJIJL(this.LIZJ);
            C63922P6w.LIZLLL("TECameraModeBase", "use faceae for rear");
            return;
        }
        if (i != 3) {
            return;
        }
        LJJIJL(this.LIZJ);
        C63922P6w.LIZLLL("TECameraModeBase", "use faceae for all");
    }

    public int LJJIIJ(int i, String str) {
        P7T.LIZ("TECameraModeBase-openCamera");
        this.LJJIJ = System.currentTimeMillis();
        CameraCharacteristics cameraCharacteristics = this.LIZ;
        if (cameraCharacteristics == null) {
            C63922P6w.LIZ("TECameraModeBase", "open failed, mCameraCharacteristics = null");
            return -439;
        }
        this.LIZIZ.getClass();
        if (!P9I.LJIIIIZZ(cameraCharacteristics, i)) {
            return -403;
        }
        this.LJII.LJLJJL = ((Integer) this.LIZ.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mCameraSettings.mRotation = ");
        LIZ.append(this.LJII.LJLJJL);
        LIZ.append(", mCameraSettings:");
        LIZ.append(this.LJII.hashCode());
        C63922P6w.LIZLLL("TECameraModeBase", X1D.LIZIZ(LIZ));
        if (this.LJII.LLJJLIIIJLLLLLLLZ) {
            this.LJIIJJI = P7W.LIZJ(this.LIZ, str);
        } else {
            this.LJIIJJI = (StreamConfigurationMap) this.LIZ.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        }
        if (this.LJIIJJI == null) {
            return -439;
        }
        P9I p9i = this.LIZIZ;
        CameraCharacteristics cameraCharacteristics2 = this.LIZ;
        float f = this.LJII.LJZ;
        p9i.getClass();
        this.LJIILL = P9I.LIZLLL(cameraCharacteristics2, f);
        C84134X0g c84134X0g = this.LJII;
        if (c84134X0g.LLJJIJIIJIL == -1.0f || c84134X0g.LLJJIJIL == -1.0f) {
            P9I p9i2 = this.LIZIZ;
            CameraCharacteristics cameraCharacteristics3 = this.LIZ;
            p9i2.getClass();
            this.LJIIZILJ = P9I.LJI(cameraCharacteristics3);
        } else {
            this.LJIIZILJ = new Range<>(Float.valueOf(this.LJII.LLJJIJIL), Float.valueOf(this.LJII.LLJJIJIIJIL));
        }
        this.LJIILLIIL = 1.0f;
        this.LJJIIZ = (Rect) this.LIZ.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        LJJIJ();
        this.LJJI = this.LJII.LLIIII.getInt("useCameraFaceDetect");
        this.LJJ = (int[]) this.LIZ.get(CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES);
        this.LJIJ = 0;
        P7T.LIZIZ();
        return 0;
    }

    public void LJJIZ(float f, InterfaceC87361YQj interfaceC87361YQj) {
        if (Math.abs(this.LJIILLIIL - f) < 0.1f) {
            return;
        }
        if (this.LIZIZ == null || this.LJIIL == null || this.LIZLLL == null || this.LIZJ == null) {
            C63922P6w.LIZIZ("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: camera is null");
            this.LJFF.LJIIIIZZ(-420, -420, "startZoom : Env is null");
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            Rect LJ = LJ(f);
            if (LJ == null) {
                C63922P6w.LIZIZ("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: zoomRect is null");
                this.LJFF.LJIIIIZZ(-420, -420, "zoom rect is null.");
                return;
            }
            this.LIZJ.set(CaptureRequest.SCALER_CROP_REGION, LJ);
        } else {
            Range<Float> range = this.LJIIZILJ;
            if (range != null) {
                Float upper = range.getUpper();
                Float lower = this.LJIIZILJ.getLower();
                if (Float.compare(f, upper.floatValue()) >= 0) {
                    f = upper.floatValue();
                } else if (Float.compare(f, lower.floatValue()) < 0) {
                    f = lower.floatValue();
                }
            }
            this.LIZJ.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(f));
        }
        XS3 LJJJJIZL = LJJJJIZL(this.LIZJ);
        if (!LJJJJIZL.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: ");
            LIZ.append(LJJJJIZL.LIZIZ);
            C63922P6w.LIZIZ("TECameraModeBase", X1D.LIZIZ(LIZ));
            this.LJFF.LJIIIIZZ(-420, -420, LJJJJIZL.LIZIZ);
            return;
        }
        if (interfaceC87361YQj != null) {
            interfaceC87361YQj.onChange(this.LJII.LJLILLLLZI, f, true);
        }
        LJIILL();
        this.LJIILLIIL = f;
    }

    public void LJJJIL(PZA pza, int i) {
        if (this.LJJIJLIJ) {
            this.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 3);
            this.LIZJ.set(CaptureRequest.FLASH_MODE, 1);
        }
    }

    public final void LJJJJL(CameraCaptureSession cameraCaptureSession, CaptureRequest.Builder builder) {
        if (cameraCaptureSession != this.LIZLLL || builder != this.LIZJ) {
            C63922P6w.LIZIZ("TECameraModeBase", "updateRequestRepeating failed, session changed...");
            return;
        }
        XS3 LJJJJIZL = LJJJJIZL(builder);
        if (!LJJJJIZL.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateRequestRepeating failed: ");
            LIZ.append(LJJJJIZL.LIZIZ);
            C63922P6w.LIZIZ("TECameraModeBase", X1D.LIZIZ(LIZ));
        }
    }

    public void LJJJJZ(float f, InterfaceC87361YQj interfaceC87361YQj) {
        if (this.LIZLLL == null || this.LJIIL == null || this.LIZJ == null) {
            C63922P6w.LIZIZ("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: camera is null");
            this.LJFF.LJ(this.LJIIIZ, this.LJII.LJLILLLLZI, -420, "Camera info is null, may be you need reopen camera.");
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            if (Float.compare(this.LJIILLIIL * f, this.LJIILL) >= 0) {
                this.LJIILLIIL = this.LJIILL;
            } else if (Float.compare(this.LJIILLIIL * f, 1.0f) < 0) {
                this.LJIILLIIL = 1.0f;
            } else {
                this.LJIILLIIL *= f;
            }
            Rect LJFF = LJFF();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("crop region zoom, factor = ");
            LIZ.append(f);
            LIZ.append(", mMaxZoom = ");
            LIZ.append(this.LJIILL);
            LIZ.append(", mNowZoom = ");
            LIZ.append(this.LJIILLIIL);
            LIZ.append(", rect = ");
            LIZ.append(LJFF);
            LIZ.append(", mActiveArraySize = ");
            LIZ.append(this.LJJIIZ);
            C63922P6w.LIZLLL("TECameraModeBase", X1D.LIZIZ(LIZ));
            if (LJFF == null) {
                return;
            }
            CaptureRequest captureRequest = this.LJIIL;
            if (captureRequest != null && LJFF.equals(captureRequest.get(CaptureRequest.SCALER_CROP_REGION))) {
                C63922P6w.LIZLLL("TECameraModeBase", "same SCALER_CROP_REGION, no need to set");
                return;
            }
            this.LIZJ.set(CaptureRequest.SCALER_CROP_REGION, LJFF);
            XS3 LJJJJIZL = LJJJJIZL(this.LIZJ);
            if (!LJJJJIZL.LIZ) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: ");
                LIZ2.append(LJJJJIZL.LIZIZ);
                C63922P6w.LIZIZ("TECameraModeBase", X1D.LIZIZ(LIZ2));
                this.LJFF.LJIIIIZZ(-420, -420, LJJJJIZL.LIZIZ);
                return;
            }
            this.LJIJI = LJFF;
        } else {
            Range<Float> range = this.LJIIZILJ;
            if (range != null) {
                Float upper = range.getUpper();
                Float lower = this.LJIIZILJ.getLower();
                if (Float.compare(this.LJIILLIIL * f, upper.floatValue()) >= 0) {
                    this.LJIILLIIL = upper.floatValue();
                } else if (Float.compare(this.LJIILLIIL * f, lower.floatValue()) < 0) {
                    this.LJIILLIIL = lower.floatValue();
                } else {
                    this.LJIILLIIL *= f;
                }
                if (this.LJIILLIIL < 1.0f) {
                    if (this.LJJIL) {
                        P9I p9i = this.LIZIZ;
                        CameraCharacteristics cameraCharacteristics = this.LIZ;
                        p9i.getClass();
                        if (cameraCharacteristics != null) {
                            for (int i : (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES)) {
                                if (i == 11) {
                                    break;
                                }
                            }
                        }
                    }
                    this.LJIILLIIL = 1.0f;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("zoom ratio zoom, factor = ");
                LIZ3.append(f);
                LIZ3.append(", maxZoom = ");
                LIZ3.append(upper);
                LIZ3.append(", minZoom = ");
                LIZ3.append(lower);
                LIZ3.append("， mNowZoom = ");
                LIZ3.append(this.LJIILLIIL);
                C63922P6w.LIZLLL("TECameraModeBase", X1D.LIZIZ(LIZ3));
            }
            this.LIZJ.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.LJIILLIIL));
            XS3 LJJJJIZL2 = LJJJJIZL(this.LIZJ);
            if (!LJJJJIZL2.LIZ) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: ");
                LIZ4.append(LJJJJIZL2.LIZIZ);
                C63922P6w.LIZIZ("TECameraModeBase", X1D.LIZIZ(LIZ4));
                this.LJFF.LJIIIIZZ(-420, -420, LJJJJIZL2.LIZIZ);
                return;
            }
        }
        if (interfaceC87361YQj != null) {
            interfaceC87361YQj.onChange(this.LJII.LJLILLLLZI, this.LJIILLIIL, true);
        }
        LJIILL();
    }

    public YQ7(YQ6 yq6, Context context, Handler handler) {
        this.LJIILJJIL = true;
        this.LJJIJLIJ = false;
        this.LJI = yq6;
        C84134X0g c84134X0g = yq6.LIZIZ;
        this.LJII = c84134X0g;
        this.LIZIZ = P9I.LIZIZ(c84134X0g.LJLILLLLZI, context);
        this.LJFF = yq6.LIZLLL;
        this.LJIIJ = handler;
        this.LJIILJJIL = c84134X0g.LJLL;
        this.LJJIJLIJ = false;
    }

    public final XS3 LJII(CaptureRequest.Builder builder, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        XS3 xs3 = new XS3();
        if (builder == null) {
            xs3.LIZIZ = "CaptureRequest.Builder is null";
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("capture: ");
            LIZ.append(xs3.LIZIZ);
            C63922P6w.LIZIZ("TECameraModeBase", X1D.LIZIZ(LIZ));
            return xs3;
        }
        if (this.LIZLLL == null) {
            xs3.LIZIZ = "Capture Session is null";
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("capture: ");
            LIZ2.append(xs3.LIZIZ);
            C63922P6w.LIZIZ("TECameraModeBase", X1D.LIZIZ(LIZ2));
            return xs3;
        }
        try {
            this.LIZLLL.capture(builder.build(), captureCallback, handler);
            xs3.LIZ = true;
        } catch (CameraAccessException e) {
            C16880lQ.LLLLIIL(e);
            xs3.LIZIZ = e.getMessage();
        } catch (IllegalStateException e2) {
            C16880lQ.LLLLIIL(e2);
            xs3.LIZIZ = e2.getMessage();
        }
        return xs3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List<android.hardware.camera2.params.OutputConfiguration>] */
    public void LJIILIIL(List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler) {
        ?? arrayList;
        if (Build.VERSION.SDK_INT >= 28) {
            if (list != null || !this.LJII.LLJILJILJ || (arrayList = this.LJJJJL) == 0) {
                arrayList = new ArrayList();
                for (Surface surface : list) {
                    if (this.LJII.LLIILZL) {
                        OutputConfiguration outputConfiguration = new OutputConfiguration(surface);
                        this.LJJJI = outputConfiguration;
                        outputConfiguration.enableSurfaceSharing();
                        C63922P6w.LIZ("TECameraModeBase", "enableSurfaceSharing");
                        arrayList.add(this.LJJJI);
                    } else {
                        arrayList.add(new OutputConfiguration(surface));
                    }
                }
            }
            SessionConfiguration sessionConfiguration = new SessionConfiguration(LJJII(list), arrayList, new ExecutorC87363YQl(handler), stateCallback);
            sessionConfiguration.setSessionParameters(this.LIZJ.build());
            C63922P6w.LIZLLL("TECameraModeBase", "createSession by sessionConfiguration ");
            this.LJIIIZ.createCaptureSession(sessionConfiguration);
            return;
        }
        C63922P6w.LIZLLL("TECameraModeBase", "createSession by normally");
        this.LJIIIZ.createCaptureSession(list, stateCallback, handler);
    }

    public final XS3 LJJJJJL(CaptureRequest.Builder builder, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        P7T.LIZ("TECameraModeBase-updatePreview");
        XS3 xs3 = new XS3();
        if (builder == null) {
            xs3.LIZIZ = "CaptureRequest.Builder is null";
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updatePreview: ");
            LIZ.append(xs3.LIZIZ);
            C63922P6w.LIZIZ("TECameraModeBase", X1D.LIZIZ(LIZ));
            return xs3;
        }
        if (this.LIZLLL == null) {
            xs3.LIZIZ = "Capture Session is null";
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("updatePreview: ");
            LIZ2.append(xs3.LIZIZ);
            C63922P6w.LIZIZ("TECameraModeBase", X1D.LIZIZ(LIZ2));
            return xs3;
        }
        CaptureRequest build = builder.build();
        this.LJIIL = build;
        try {
            this.LIZLLL.setRepeatingRequest(build, captureCallback, handler);
            xs3.LIZ = true;
            this.LJJIZ = true;
        } catch (CameraAccessException e) {
            C16880lQ.LLLLIIL(e);
            xs3.LIZIZ = e.getMessage();
        } catch (IllegalArgumentException e2) {
            C16880lQ.LLLLIIL(e2);
            xs3.LIZIZ = e2.getMessage();
        } catch (IllegalStateException e3) {
            C16880lQ.LLLLIIL(e3);
            xs3.LIZIZ = e3.getMessage();
            this.LJJIZ = false;
        } catch (SecurityException e4) {
            C16880lQ.LLLLIIL(e4);
            xs3.LIZIZ = e4.getMessage();
        }
        P7T.LIZIZ();
        return xs3;
    }

    public final Rect LIZJ(int i, int i2, float f, float f2, int i3, int i4, EnumC81106VsM enumC81106VsM) {
        int i5;
        int i6;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i7;
        if (this.LJIIL == null) {
            C63922P6w.LIZIZ("TECameraModeBase", "_calculateFocusRect, capture request is null, return");
            return null;
        }
        Rect rect = (Rect) this.LIZ.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SENSOR_INFO_ACTIVE_ARRAY_SIZE: [left, top, right, bottom] = [");
        LIZ.append(rect.left);
        LIZ.append(", ");
        LIZ.append(rect.top);
        LIZ.append(", ");
        LIZ.append(rect.right);
        LIZ.append(", ");
        LIZ.append(rect.bottom);
        LIZ.append("]");
        C63922P6w.LIZ("TECameraModeBase", X1D.LIZIZ(LIZ));
        Size size = (Size) this.LIZ.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("mCameraCharacteristics:[width, height]: [");
        LIZ2.append(size.getWidth());
        LIZ2.append(", ");
        LIZ2.append(size.getHeight());
        LIZ2.append("]");
        C63922P6w.LIZLLL("onAreaTouchEvent", X1D.LIZIZ(LIZ2));
        C84134X0g c84134X0g = this.LJII;
        TEFrameSizei tEFrameSizei = c84134X0g.LJZI;
        int i8 = tEFrameSizei.width;
        int i9 = tEFrameSizei.height;
        EnumC81106VsM enumC81106VsM2 = EnumC81106VsM.VIEW;
        if (enumC81106VsM == enumC81106VsM2 && (90 == (i7 = c84134X0g.LJLJJL) || 270 == i7)) {
            i6 = i9;
            i5 = i8;
        } else {
            i5 = i9;
            i6 = i8;
        }
        float f8 = 0.0f;
        if (i5 * i >= i6 * i2) {
            f3 = (i * 1.0f) / i6;
            f5 = ((i5 * f3) - i2) / 2.0f;
            f4 = 0.0f;
        } else {
            f3 = (i2 * 1.0f) / i5;
            f4 = ((i6 * f3) - i) / 2.0f;
            f5 = 0.0f;
        }
        float f9 = (f + f4) / f3;
        float f10 = (f2 + f5) / f3;
        if (enumC81106VsM == enumC81106VsM2) {
            if (90 == i3) {
                float f11 = i9 - f9;
                f9 = f10;
                f10 = f11;
            } else if (270 == i3) {
                float f12 = i8 - f10;
                f10 = f9;
                f9 = f12;
            }
        }
        Rect rect2 = (Rect) this.LJIIL.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect2 == null || rect2.isEmpty()) {
            C63922P6w.LJ("TECameraModeBase", "can't get crop region");
        } else {
            rect = rect2;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("cropRegion Rect: [left, top, right, bottom] = [");
        LIZ3.append(rect.left);
        LIZ3.append(", ");
        LIZ3.append(rect.top);
        LIZ3.append(", ");
        LIZ3.append(rect.right);
        LIZ3.append(", ");
        LIZ3.append(rect.bottom);
        C63922P6w.LIZ("TECameraModeBase", X1D.LIZIZ(LIZ3));
        int width = rect.width();
        int height = rect.height();
        C84134X0g c84134X0g2 = this.LJII;
        TEFrameSizei tEFrameSizei2 = c84134X0g2.LJZI;
        int i10 = tEFrameSizei2.height;
        int i11 = i10 * width;
        int i12 = tEFrameSizei2.width;
        if (i11 > i12 * height) {
            f6 = (height * 1.0f) / i10;
            f8 = (width - (i12 * f6)) / 2.0f;
            f7 = 0.0f;
        } else {
            f6 = (width * 1.0f) / i12;
            f7 = (height - (i10 * f6)) / 2.0f;
        }
        float f13 = (f9 * f6) + f8 + rect.left;
        float f14 = (f10 * f6) + f7 + rect.top;
        if (enumC81106VsM == enumC81106VsM2 && c84134X0g2.LJLJJI == 1) {
            f14 = rect.height() - f14;
        }
        Rect rect3 = new Rect();
        if (i4 == 0) {
            double d = f13;
            rect3.left = (int) (d - (rect.width() * 0.05d));
            rect3.right = (int) ((rect.width() * 0.05d) + d);
            double d2 = f14;
            rect3.top = (int) (d2 - (rect.height() * 0.05d));
            rect3.bottom = (int) ((0.05d * rect.height()) + d2);
        } else {
            double d3 = f13;
            rect3.left = (int) (d3 - (rect.width() * 0.1d));
            rect3.right = (int) ((rect.width() * 0.1d) + d3);
            double d4 = f14;
            rect3.top = (int) (d4 - (rect.height() * 0.1d));
            rect3.bottom = (int) ((rect.height() * 0.1d) + d4);
        }
        int i13 = rect3.left;
        if (i13 < 0 || i13 < rect.left) {
            rect3.left = rect.left;
        }
        int i14 = rect3.top;
        if (i14 < 0 || i14 < rect.top) {
            rect3.top = rect.top;
        }
        int i15 = rect3.right;
        if (i15 < 0 || i15 > rect.right) {
            rect3.right = rect.right;
        }
        int i16 = rect3.bottom;
        if (i16 < 0 || i16 > rect.bottom) {
            rect3.bottom = rect.bottom;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("Focus Rect: [left, top, right, bottom] = [");
        LIZ4.append(rect3.left);
        LIZ4.append(", ");
        LIZ4.append(rect3.top);
        LIZ4.append(", ");
        LIZ4.append(rect3.right);
        LIZ4.append(", ");
        LIZ4.append(rect3.bottom);
        LIZ4.append("] x: ");
        LIZ4.append(f13);
        LIZ4.append(" y: ");
        LIZ4.append(f14);
        C63922P6w.LIZLLL("TECameraModeBase", X1D.LIZIZ(LIZ4));
        return rect3;
    }
}
