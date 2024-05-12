package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.vesdk.VECameraSettings;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import jp3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class YQ8 extends YQ7 {
    public long LJJJLIIL;
    public final YQJ LJJJLL;
    public final Handler LJJJLZIJ;
    public ImageReader LJJJZ;
    public ImageReader LJJL;
    public int LJJLI;
    public TotalCaptureResult[] LJJLIIIIJ;
    public TotalCaptureResult LJJLIIIJ;
    public volatile boolean LJJLIIIJILLIZJL;
    public List<CaptureRequest.Key<?>> LJJLIIIJJI;
    public int LJJLIIIJJIZ;
    public int LJJLIIIJL;
    public boolean LJJLIIIJLJLI;
    public boolean LJJLIIIJLLLLLLLZ;
    public boolean LJJLIIJ;
    public boolean LJJLIL;
    public int LJJLJ;
    public int LJJLJLI;
    public long LJJLL;
    public ConditionVariable LJJZ;
    public int LJJZZI;
    public int LJJZZIII;
    public PZA LJL;
    public int LJLI;
    public long LJLIIIL;

    @Override // X.YQ7
    public final void LJIIJ() {
        this.LJJLIIIJJIZ = 0;
        this.LJJJLL.removeCallbacksAndMessages(null);
        Handler handler = this.LJJIIJ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.LJJIJ = 0L;
        this.LJJJLIIL = 0L;
        this.LJJLIIJ = false;
        this.LJJLJ = 0;
        this.LJJZZI = -1;
        this.LJJLIIIJ = null;
        this.LJJIJLIJ = false;
        ImageReader imageReader = this.LJJJZ;
        if (imageReader != null) {
            imageReader.close();
            this.LJJJZ = null;
        }
        ImageReader imageReader2 = this.LJJL;
        if (imageReader2 != null) {
            imageReader2.close();
            this.LJJL = null;
        }
        ((ArrayList) this.LJJJJL).clear();
        this.LJJJJIZL = false;
        this.LJJJJJ = false;
        this.LJJLIIIIJ = null;
        this.LJL = null;
        this.LIZJ = null;
        super.LJIIJ();
    }

    @Override // X.YQ7
    public final int LJIJJ() {
        return 4;
    }

    @Override // X.YQ7
    public final int LJJIIZ() {
        throw null;
    }

    @Override // X.YQ7, X.InterfaceC87370YQs
    public final int LIZIZ() {
        CaptureRequest.Builder builder = this.LIZJ;
        if (builder == null) {
            this.LJFF.LJ(this.LJIIIZ, this.LJII.LJLILLLLZI, -100, "rollbackMeteringSessionRequest : param is null.");
            return -100;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            builder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        }
        return super.LIZIZ();
    }

    @Override // X.YQ7
    public final void LJIIIZ() {
        P7J p7j;
        if (Build.VERSION.SDK_INT >= 28) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("checkDeferredSurfaceHasReady, mIsSurfaceReady: ");
            LIZ.append(this.LJJJJJL);
            LIZ.append(", outputs: ");
            LIZ.append(((ArrayList) this.LJJJJL).size());
            C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LIZ));
            if (((ArrayList) this.LJJJJL).isEmpty()) {
                this.LJJJJJ = true;
                C63922P6w.LJ("TEImage2Mode", "checkDeferredSurfaceHasReady, use real surface");
                return;
            }
            try {
                if (!this.LJJJJJL && (p7j = this.LJI.LJI) != null && p7j.LIZIZ() != null) {
                    ((OutputConfiguration) ListProtector.get(this.LJJJJL, 0)).addSurface(this.LJI.LJI.LIZIZ());
                    this.LJJJJJL = true;
                    C63922P6w.LIZLLL("TEImage2Mode", "checkDeferredSurfaceHasReady, deferred surface has ready");
                }
                if (!this.LJJJJJ && this.LJJJJJL) {
                    this.LIZLLL.finalizeOutputConfigurations(this.LJJJJL);
                    this.LJJJJJ = true;
                    C63922P6w.LIZ("TEImage2Mode", "checkDeferredSurfaceHasReady, finalizeOutputConfigurations");
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // X.YQ7
    public final void LJIILJJIL() {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("createSessionByDeferredSurface, mIsSessionStarted: ");
            LIZ.append(this.LJJJJIZL);
            C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LIZ));
            if (this.LJJJJIZL) {
                return;
            }
            this.LJJJJIZL = true;
            this.LJJJJJ = false;
            this.LJJJJJL = false;
            ((ArrayList) this.LJJJJL).clear();
            List<OutputConfiguration> list = this.LJJJJL;
            TEFrameSizei tEFrameSizei = this.LJII.LJZI;
            ((ArrayList) list).add(new OutputConfiguration(new Size(tEFrameSizei.width, tEFrameSizei.height), SurfaceTexture.class));
            if (this.LJJJZ == null) {
                TEFrameSizei tEFrameSizei2 = this.LJII.LJZL;
                LJJLI(tEFrameSizei2.width, tEFrameSizei2.height);
            }
            if (this.LJJJZ != null) {
                ((ArrayList) this.LJJJJL).add(new OutputConfiguration(this.LJJJZ.getSurface()));
            }
            if (this.LJJL != null) {
                ((ArrayList) this.LJJJJL).add(new OutputConfiguration(this.LJJL.getSurface()));
            }
            this.LJJIJIIJI = System.currentTimeMillis();
            if (this.LJII.LJLLI) {
                handler = LJIJI();
            } else {
                handler = this.LJIIJ;
            }
            LJIILIIL(null, this.LJJJJZ, handler);
            if (this.LIZLLL == null) {
                LJJJJLL();
            }
            C63922P6w.LIZLLL("TEImage2Mode", "createSessionByDeferredSurface end");
        }
    }

    @Override // X.YQ7
    public final int[] LJIJ() {
        ImageReader imageReader = this.LJJJZ;
        if (imageReader == null) {
            return null;
        }
        int width = imageReader.getWidth();
        int height = this.LJJJZ.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        return new int[]{width, height};
    }

    @Override // X.YQ7
    public final int[] LJJIFFI() {
        ImageReader imageReader = this.LJJJZ;
        if (imageReader == null) {
            return null;
        }
        return new int[]{imageReader.getWidth(), this.LJJJZ.getHeight()};
    }

    @Override // X.YQ7
    public final int LJJIJLIJ() {
        int intValue;
        boolean z;
        Surface[] surfaceArr;
        Handler handler;
        boolean z2;
        Surface[] surfaceArr2;
        P7T.LIZ("TEImage2Mode-startPreview");
        this.LJJIJLIJ = false;
        Float f = (Float) this.LIZ.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        if (f == null) {
            intValue = 0;
        } else {
            intValue = f.intValue();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("lensInfoMinFocusDistance = ");
        LIZ.append(intValue);
        C63922P6w.LIZ("TEImage2Mode", X1D.LIZIZ(LIZ));
        if (intValue != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJJLIIIJLJLI = z;
        P7J p7j = this.LJI.LJI;
        if (this.LJIIIZ == null || p7j == null) {
            C63922P6w.LIZIZ("TEImage2Mode", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        if (this.LJII.LLJJI) {
            P7K p7k = p7j.LIZ;
            if (p7k != null) {
                p7k.LJIILJJIL();
                C63922P6w.LIZLLL("TEImage2Mode", "reallocate st...");
            } else {
                C63922P6w.LIZIZ("TEImage2Mode", "reallocate st...err");
            }
        }
        int LJJIIZ = super.LJJIIZ();
        if (LJJIIZ != 0) {
            return LJJIIZ;
        }
        if (this.LJJJZ == null) {
            TEFrameSizei tEFrameSizei = this.LJII.LJZL;
            LJJLI(tEFrameSizei.width, tEFrameSizei.height);
        }
        if (this.LIZJ == null) {
            this.LIZJ = this.LJIIIZ.createCaptureRequest(1);
        }
        if (Build.VERSION.SDK_INT < 30) {
            Rect rect = this.LJIJI;
            if (rect != null) {
                this.LIZJ.set(CaptureRequest.SCALER_CROP_REGION, rect);
            }
        } else {
            this.LIZJ.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.LJIILLIIL));
        }
        ArrayList arrayList = new ArrayList();
        if (p7j.LIZ.LJIIJJI() == 8) {
            P7K p7k2 = p7j.LIZ;
            if (p7k2 != null) {
                surfaceArr2 = p7k2.LJIIIIZZ();
            } else {
                surfaceArr2 = null;
            }
            arrayList.addAll(Arrays.asList(surfaceArr2));
        } else if (p7j.LIZ.LJIIJJI() == 32) {
            int i = this.LJII.LJLJJI;
            P7K p7k3 = p7j.LIZ;
            if (p7k3 != null) {
                surfaceArr = p7k3.LJIIIZ(i);
            } else {
                surfaceArr = null;
            }
            arrayList.addAll(Arrays.asList(surfaceArr));
        } else {
            arrayList.add(p7j.LIZIZ());
        }
        ImageReader imageReader = this.LJJL;
        if (imageReader != null) {
            arrayList.add(imageReader.getSurface());
        }
        if (!this.LJII.LLIILZL && p7j.LIZ.LJ() != null && p7j.LIZ.LJFF() == EnumC63904P6e.ADD_SURFACE) {
            arrayList.add(p7j.LIZ.LJ());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.LIZJ.addTarget((Surface) it.next());
        }
        ImageReader imageReader2 = this.LJJJZ;
        if (imageReader2 != null) {
            arrayList.add(imageReader2.getSurface());
        }
        this.LIZJ.set(CaptureRequest.CONTROL_AF_MODE, 4);
        C84134X0g c84134X0g = this.LJII;
        if (c84134X0g.LLILLL) {
            if (Build.VERSION.SDK_INT >= 28) {
                long currentTimeMillis = System.currentTimeMillis();
                CameraCharacteristics cameraCharacteristics = this.LIZ;
                if (cameraCharacteristics != null && this.LJJLIIIJJI == null) {
                    this.LJJLIIIJJI = cameraCharacteristics.getAvailableSessionKeys();
                }
                List<CaptureRequest.Key<?>> list = this.LJJLIIIJJI;
                if (list != null) {
                    Iterator<CaptureRequest.Key<?>> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE.getName().equals(it2.next().getName())) {
                            this.LJII.LLILLL = false;
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                StringBuilder LJI = JBR.LJI("check aeTargetFpsRange is session key: ", z2, ", consume: ");
                LJI.append(System.currentTimeMillis() - currentTimeMillis);
                C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LJI));
            } else {
                c84134X0g.LLILLL = false;
            }
        }
        this.LJLIIIL = 0L;
        this.LJLI = 0;
        this.LJJLJ = 0;
        this.LJJLI = -1;
        int i2 = this.LJII.LLILLIZIL;
        this.LJJLJLI = i2;
        if (i2 > 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("release camera metadata threshold: ");
            LIZ2.append(this.LJJLJLI);
            C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LIZ2));
        }
        this.LJJLIL = false;
        this.LJJLIIIJJIZ = 0;
        this.LJJIJIIJI = System.currentTimeMillis();
        if (this.LJII.LJLLI) {
            handler = LJIJI();
        } else {
            handler = this.LJIIJ;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("startPreview, mIsSurfaceReady: ");
        LIZ3.append(this.LJJJJJL);
        LIZ3.append(", outputs: ");
        LIZ3.append(((ArrayList) this.LJJJJL).size());
        C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LIZ3));
        if (((ArrayList) this.LJJJJL).isEmpty()) {
            this.LJJJJIZL = true;
            this.LIZLLL = null;
            LJIILIIL(arrayList, this.LJJJJZ, handler);
            if (this.LIZLLL == null) {
                LJJJJLL();
            }
        } else if (Build.VERSION.SDK_INT >= 28) {
            if (!this.LJJJJJL) {
                ((OutputConfiguration) ListProtector.get(this.LJJJJL, 0)).addSurface((Surface) ListProtector.get(arrayList, 0));
                this.LJJJJJL = true;
                C63922P6w.LIZLLL("TEImage2Mode", "deferred surface has ready");
            }
            if (this.LIZLLL != null) {
                this.LIZLLL.finalizeOutputConfigurations(this.LJJJJL);
                this.LJJJJJ = true;
                C63922P6w.LIZLLL("TEImage2Mode", "finalizeOutputConfigurations in startPreview");
                LJJJJ();
            }
        }
        P7T.LIZIZ();
        return 0;
    }

    @Override // X.YQ7
    public final int LJJJJI() {
        LJJLIIIJ(this.LJJZZI);
        return super.LJJJJI();
    }

    public final void LJJJJZI() {
        this.LJJLL = System.currentTimeMillis();
        this.LJJLIIIJJIZ = 0;
        CaptureRequest.Builder LJIIL = LJIIL();
        if (LJIIL == null) {
            LJJJZ(-1001, new Exception("capture build is null"));
            return;
        }
        ImageReader imageReader = this.LJJJZ;
        if (imageReader == null) {
            LJJJZ(-1001, new Exception("image reader is null"));
            return;
        }
        LJIIL.addTarget(imageReader.getSurface());
        LJJLIIIIJ(LJIIL);
        XS3 LJII = LJII(LJIIL, new YQG(this), this.LJIIJ);
        if (!LJII.LIZ) {
            LJJJZ(-1001, new Exception(LJII.LIZIZ));
        }
    }

    public final void LJJJLIIL() {
        this.LJJLL = System.currentTimeMillis();
        this.LJJLIIIJJIZ = 0;
        CaptureRequest.Builder LJIIL = LJIIL();
        if (LJIIL == null) {
            LJJJZ(-1001, new Exception("capture build is null"));
            return;
        }
        ImageReader imageReader = this.LJJJZ;
        if (imageReader == null) {
            LJJJZ(-1001, new Exception("image reader is null"));
            return;
        }
        LJIIL.addTarget(imageReader.getSurface());
        LJJLIIIIJ(LJIIL);
        XS3 LJII = LJII(LJIIL, new YQL(this), null);
        if (!LJII.LIZ) {
            LJJJZ(-1001, new Exception(LJII.LIZIZ));
        }
    }

    @Override // X.YQ7
    public final int LJJ() {
        return this.LJJZZI;
    }

    @Override // X.YQ7
    public final Range<Integer> LJIIJJI(Range<Integer> range) {
        Range<Integer> range2;
        Range<Integer> LJJJLZIJ;
        CameraCharacteristics cameraCharacteristics = this.LIZ;
        if (cameraCharacteristics != null && this.LJII.LLJJJIL) {
            Range<Integer>[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            if (rangeArr == null) {
                return range;
            }
            if (this.LJIL != null) {
                ArrayList arrayList = new ArrayList(rangeArr.length);
                for (Range<Integer> range3 : rangeArr) {
                    arrayList.add(new int[]{range3.getLower().intValue(), range3.getUpper().intValue()});
                }
                InterfaceC84050Wyk interfaceC84050Wyk = ((C87372YQu) this.LJIL).LIZ.mFpsConfigCallback;
                if (interfaceC84050Wyk != null) {
                    ((C84046Wyg) interfaceC84050Wyk).LIZ.getClass();
                }
            }
            if (this.LJII.LLIIL == 4) {
                range2 = new Range<>(Integer.valueOf(this.LJII.LJLJI.min), Integer.valueOf(this.LJII.LJLJI.max));
                for (Range<Integer> range4 : rangeArr) {
                    if (range2.equals(range4)) {
                        break;
                    }
                }
            }
            range2 = null;
            if (range2 != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select fps from user direct set: ");
                LIZ.append(range2);
                C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LIZ));
                return range2;
            }
            int i = this.LJJZZIII;
            if (i == 0) {
                LJJJLZIJ = LJJJLL(rangeArr);
            } else {
                if (i == 1) {
                    LJJJLZIJ = LJJJLZIJ(rangeArr);
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("select fps: ");
                LIZ2.append(range);
                C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LIZ2));
            }
            if (LJJJLZIJ != null) {
                range = LJJJLZIJ;
            }
            StringBuilder LIZ22 = X1D.LIZ();
            LIZ22.append("select fps: ");
            LIZ22.append(range);
            C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LIZ22));
        }
        return range;
    }

    @Override // X.YQ7
    public final int LJIILLIIL(C84151X0x c84151X0x) {
        if (this.LJJLIIIJJIZ != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("focus action discard, state = ");
            LIZ.append(this.LJJLIIIJJIZ);
            C63922P6w.LIZIZ("TEImage2Mode", X1D.LIZIZ(LIZ));
            return -108;
        }
        return super.LJIILLIIL(c84151X0x);
    }

    @Override // X.YQ7
    public final void LJJIJIIJIL(int i) {
        Surface surface;
        CameraCharacteristics cameraCharacteristics;
        Surface surface2;
        CameraCharacteristics cameraCharacteristics2;
        this.LJJZZIII = i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSceneMode: ");
        LIZ.append(i);
        C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LIZ));
        if (i == 0) {
            if (this.LJII.LLILLL && (cameraCharacteristics2 = this.LIZ) != null) {
                Range<Integer> LJJJLL = LJJJLL((Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
                CaptureRequest.Builder builder = this.LIZJ;
                if (builder != null && LJJJLL != null) {
                    builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, LJJJLL);
                    LJJJJIZL(this.LIZJ);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("apply capture scene: ");
                    LIZ2.append(LJJJLL);
                    C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LIZ2));
                }
            }
            ImageReader imageReader = this.LJJL;
            if (imageReader != null && (surface2 = imageReader.getSurface()) != null && surface2.isValid()) {
                CaptureRequest.Builder builder2 = this.LIZJ;
                if (builder2 != null) {
                    try {
                        builder2.removeTarget(surface2);
                        this.LIZJ.addTarget(surface2);
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                LJJJJIZL(this.LIZJ);
                return;
            }
            return;
        }
        if (i == 1) {
            if (this.LJII.LLILLL && (cameraCharacteristics = this.LIZ) != null) {
                Range<Integer> LJJJLZIJ = LJJJLZIJ((Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
                CaptureRequest.Builder builder3 = this.LIZJ;
                if (builder3 != null && LJJJLZIJ != null) {
                    builder3.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, LJJJLZIJ);
                    LJJJJIZL(this.LIZJ);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("apply record scene: ");
                    LIZ3.append(LJJJLZIJ);
                    C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LIZ3));
                }
            }
            ImageReader imageReader2 = this.LJJL;
            if (imageReader2 != null && (surface = imageReader2.getSurface()) != null && surface.isValid()) {
                CaptureRequest.Builder builder4 = this.LIZJ;
                if (builder4 != null) {
                    try {
                        builder4.removeTarget(surface);
                    } catch (Exception e2) {
                        C16880lQ.LLLLIIL(e2);
                    }
                }
                LJJJJIZL(this.LIZJ);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("un support scene");
    }

    @Override // X.YQ7
    public final void LJJJI(PZA pza) {
        LJJJIL(pza, this.LJII.LJLJJI);
    }

    @Override // X.InterfaceC87376YQy
    public final void LJJJJJ(int i) {
        boolean z;
        XS3 LJJJJIZL;
        if (this.LIZJ == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("switchFlashMode failed, mode: ");
            LIZ.append(i);
            C63922P6w.LIZIZ("TEImage2Mode", X1D.LIZIZ(LIZ));
            return;
        }
        int i2 = this.LJJZZI;
        if (i2 != -1 && i2 != 0 && i == 0) {
            z = true;
        } else {
            z = false;
        }
        LJJLIIIJ(i);
        if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.LJJZ == null) {
                this.LJJZ = new ConditionVariable();
            }
            this.LJJZ.close();
            LJJJJIZL = LJJJJJL(this.LIZJ, new YQU(this), this.LJJJLZIJ);
            if (!this.LJJZ.block(33L)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("close flash: ");
                LIZ2.append(System.currentTimeMillis() - currentTimeMillis);
                LIZ2.append("ms");
                C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LIZ2));
            }
            LJJJJIZL(this.LIZJ);
        } else {
            LJJJJIZL = LJJJJIZL(this.LIZJ);
        }
        if (!LJJJJIZL.LIZ) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: ");
            LIZ3.append(LJJJJIZL.LIZIZ);
            C63922P6w.LIZIZ("TEImage2Mode", X1D.LIZIZ(LIZ3));
            this.LJFF.LJIIIIZZ(-100, -100, LJJJJIZL.LIZIZ);
        }
    }

    public final Range<Integer> LJJJLL(Range<Integer>[] rangeArr) {
        int i;
        int i2;
        Range<Integer> range = null;
        if (rangeArr != null) {
            C84134X0g c84134X0g = this.LJII;
            if (c84134X0g == null || (i = c84134X0g.LLILLJJLI) < 30) {
                i = 30;
            }
            int i3 = 0;
            int i4 = 0;
            for (Range<Integer> range2 : rangeArr) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("fps: ");
                LIZ.append(range2.toString());
                C63922P6w.LIZ("TEImage2Mode", X1D.LIZIZ(LIZ));
                int intValue = range2.getUpper().intValue();
                int intValue2 = range2.getLower().intValue();
                if (intValue2 < 5) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("discard fps: ");
                    LIZ2.append(range2.toString());
                    C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LIZ2));
                } else {
                    if (intValue > i3) {
                        i3 = intValue;
                    }
                    if (intValue <= i && (i2 = intValue - intValue2) > i4) {
                        range = range2;
                        i4 = i2;
                    }
                }
            }
            if (i3 > 30) {
                C87367YQp.LIZ("te_record_camera_max_fps", i3);
            }
        }
        return range;
    }

    public final Range<Integer> LJJJLZIJ(Range<Integer>[] rangeArr) {
        int i;
        Range<Integer> range = null;
        if (rangeArr != null) {
            C84134X0g c84134X0g = this.LJII;
            int i2 = 30;
            if (c84134X0g != null && (i = c84134X0g.LLILLJJLI) >= 30) {
                i2 = i;
            }
            int i3 = 0;
            int i4 = 0;
            for (Range<Integer> range2 : rangeArr) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("fps: ");
                LIZ.append(range2.toString());
                C63922P6w.LIZ("TEImage2Mode", X1D.LIZIZ(LIZ));
                int intValue = range2.getUpper().intValue();
                if (intValue > i3) {
                    i3 = intValue;
                }
                if (intValue <= i2 && intValue == range2.getLower().intValue() && intValue > i4) {
                    range = range2;
                    i4 = intValue;
                }
            }
        }
        return range;
    }

    public final void LJJLIIIIJ(CaptureRequest.Builder builder) {
        Integer num;
        CaptureRequest.Builder builder2 = this.LIZJ;
        if (builder2 == null) {
            C63922P6w.LIZIZ("TEImage2Mode", "syncPreviewParam failed, no preview builder");
            return;
        }
        Object obj = builder2.get(CaptureRequest.CONTROL_AF_MODE);
        if (obj != null) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, obj);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sync afMode: ");
            LIZ.append(obj);
            C63922P6w.LIZ("TEImage2Mode", X1D.LIZIZ(LIZ));
        }
        Object[] objArr = (Object[]) this.LIZJ.get(CaptureRequest.CONTROL_AE_REGIONS);
        if (objArr != null) {
            builder.set(CaptureRequest.CONTROL_AE_REGIONS, objArr);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("sync aeRect: ");
            LIZ2.append(Arrays.toString(objArr));
            C63922P6w.LIZ("TEImage2Mode", X1D.LIZIZ(LIZ2));
        }
        Object[] objArr2 = (Object[]) this.LIZJ.get(CaptureRequest.CONTROL_AF_REGIONS);
        if (objArr != null) {
            builder.set(CaptureRequest.CONTROL_AF_REGIONS, objArr2);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("sync afRect: ");
            LIZ3.append(Arrays.toString(objArr2));
            C63922P6w.LIZ("TEImage2Mode", X1D.LIZIZ(LIZ3));
        }
        CaptureRequest.Builder builder3 = this.LIZJ;
        Integer num2 = (Integer) builder3.get(CaptureRequest.CONTROL_AE_MODE);
        if (num2 != null) {
            if (num2.intValue() == 3) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 3);
                builder.set(CaptureRequest.FLASH_MODE, 1);
            } else if (num2.intValue() == 1 && (num = (Integer) builder3.get(CaptureRequest.FLASH_MODE)) != null && num.intValue() == 2) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                builder.set(CaptureRequest.FLASH_MODE, 2);
            }
        }
        Object obj2 = this.LIZJ.get(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE);
        if (obj2 != null) {
            builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, obj2);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("sync fpsRange: ");
            LIZ4.append(obj2);
            C63922P6w.LIZ("TEImage2Mode", X1D.LIZIZ(LIZ4));
        }
        if (Build.VERSION.SDK_INT < 30) {
            Rect rect = this.LJIJI;
            if (rect != null) {
                builder.set(CaptureRequest.SCALER_CROP_REGION, rect);
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("sync crop region: ");
                LIZ5.append(this.LJIJI);
                C63922P6w.LIZ("TEImage2Mode", X1D.LIZIZ(LIZ5));
            }
        } else {
            builder.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.LJIILLIIL));
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("sync zoom ratio: ");
            LIZ6.append(this.LJIILLIIL);
            C63922P6w.LIZ("TEImage2Mode", X1D.LIZIZ(LIZ6));
        }
        if (this.LIZIZ != null) {
            P9I.LIZ(this.LIZ, builder, false);
        }
        builder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.LJIJ));
    }

    public final void LJJLIIIJ(int i) {
        int intValue;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateFlashModeParam: ");
        LIZ.append(i);
        C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LIZ));
        this.LJJZZI = i;
        CaptureRequest.Builder builder = this.LIZJ;
        if (builder == null) {
            C63922P6w.LIZIZ("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: mCaptureRequestBuilder is null");
            this.LJFF.LJ(this.LJIIIZ, this.LJII.LJLILLLLZI, -100, "switchFlashMode : CaptureRequest.Builder is null");
            return;
        }
        Integer num = (Integer) builder.get(CaptureRequest.FLASH_MODE);
        if (num == null) {
            intValue = 0;
        } else {
            intValue = num.intValue();
        }
        if (i == 1) {
            if (this.LJII.LJLJJI == 1) {
                C63922P6w.LIZIZ("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -416. Reason: not support torch");
                C63922P6w.LJ("TEImage2Mode", "flash on is not supported in front camera!");
                return;
            } else {
                this.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 3);
                this.LIZJ.set(CaptureRequest.FLASH_MODE, 1);
                this.LJJIJLIJ = true;
                return;
            }
        }
        if (i == 0) {
            this.LJJIJLIJ = false;
            if (intValue == 0) {
                C63922P6w.LIZLLL("TEImage2Mode", "switchFlashMode flashStatus == FLASH_MODE_OFF");
                return;
            } else {
                this.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.LIZJ.set(CaptureRequest.FLASH_MODE, 0);
                return;
            }
        }
        if (i == 2) {
            this.LJJIJLIJ = false;
            if (intValue == 2) {
                C63922P6w.LIZLLL("TEImage2Mode", "switchFlashMode flashStatus == FLASH_MODE_TORCH");
                return;
            } else {
                this.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.LIZJ.set(CaptureRequest.FLASH_MODE, 2);
                return;
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -416. Reason: not support flash mode ");
        LIZ2.append(i);
        C63922P6w.LIZIZ("TEImage2Mode", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("not support flash mode: ");
        LIZ3.append(i);
        C63922P6w.LIZIZ("TEImage2Mode", X1D.LIZIZ(LIZ3));
    }

    @Override // X.YQ7
    public final void LJIIIIZZ(YR0 yr0, int i) {
        yr0.getClass();
        this.LJL = null;
        this.LJJLIIIJL = i;
        this.LJJLL = System.currentTimeMillis();
        new YQO(this, this.LJJJZ.getWidth(), this.LJJJZ.getHeight());
        throw null;
    }

    @Override // X.YQ7
    public final int LJJIIJ(int i, String str) {
        this.LJJZZIII = 0;
        this.LJJLIIIJJI = null;
        if (this.LJJZZI == -1) {
            this.LJJZZI = 0;
        }
        return super.LJJIIJ(i, str);
    }

    @Override // X.YQ7
    public final void LJJIJIIJI(int i, int i2) {
        C84134X0g c84134X0g = this.LJII;
        c84134X0g.LLFZ = true;
        TEFrameSizei tEFrameSizei = c84134X0g.LJZL;
        tEFrameSizei.width = i;
        tEFrameSizei.height = i2;
        LJIIJ();
        try {
            LJJIJLIJ();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.YQ7
    public final void LJJJIL(PZA pza, int i) {
        long j;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("takePicture, cameraFacing = ");
        LIZ.append(i);
        C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LIZ));
        super.LJJJIL(pza, i);
        this.LJL = pza;
        this.LJJLIIIJL = i;
        this.LJJLIIJ = false;
        this.LJJLL = System.currentTimeMillis();
        if (this.LJJL != null && !this.LJJIJLIJ) {
            this.LJJLIIIJJIZ = 1;
            this.LJJLIIIJILLIZJL = true;
            C63922P6w.LIZLLL("TEImage2Mode", "takePicture...use zsl buffer");
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("takePicture...flash strategy: ");
        LIZ2.append(this.LJII.LLILZIL);
        LIZ2.append(", mCameraLightOn: ");
        LIZ2.append(this.LJJIJLIJ);
        C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LIZ2));
        boolean z = this.LJJIJLIJ;
        if (z) {
            j = 1600;
        } else {
            j = 800;
        }
        C84134X0g c84134X0g = this.LJII;
        if (c84134X0g.LJLJJI == 0) {
            int i2 = c84134X0g.LLILZIL;
            if (i2 == 3) {
                if (z) {
                    this.LJJJLIIL = System.currentTimeMillis();
                    this.LJJLIIIJJIZ = 2;
                    this.LJJJLL.sendEmptyMessageDelayed(1001, j);
                    this.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    this.LIZJ.set(CaptureRequest.FLASH_MODE, 2);
                    if (this.LJJLIIIJLJLI) {
                        this.LIZJ.set(CaptureRequest.CONTROL_AF_MODE, 1);
                        this.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                        this.LIZJ.setTag("CAPTURE_REQUEST_TAG_FOR_SHOT");
                        LJII(this.LIZJ, this.LJJJJZI, LJIJI());
                        this.LIZJ.setTag(null);
                        this.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                        this.LIZJ.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
                        XS3 LJJJJIZL = LJJJJIZL(this.LIZJ);
                        if (!LJJJJIZL.LIZ) {
                            YQJ yqj = this.LJJJLL;
                            yqj.sendMessage(yqj.obtainMessage(1003, new Exception(LJJJJIZL.LIZIZ)));
                            return;
                        }
                        return;
                    }
                    this.LJJJLL.sendEmptyMessageDelayed(1000, 300L);
                    return;
                }
                LJJJLIIL();
                return;
            }
            if (i2 == 2) {
                if (z || !this.LJJLIL) {
                    this.LJJJLIIL = System.currentTimeMillis();
                    this.LJJLIIIJJIZ = 2;
                    this.LJJJLL.sendEmptyMessageDelayed(1001, j);
                    if (this.LJJLIIIJLJLI) {
                        this.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                    }
                    this.LIZJ.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                    this.LIZJ.setTag("CAPTURE_REQUEST_TAG_FOR_SHOT");
                    LJII(this.LIZJ, this.LJJJJZI, LJIJI());
                    this.LIZJ.setTag(null);
                    this.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                    this.LIZJ.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
                    XS3 LJJJJIZL2 = LJJJJIZL(this.LIZJ);
                    if (LJJJJIZL2.LIZ) {
                        return;
                    }
                    YQJ yqj2 = this.LJJJLL;
                    yqj2.sendMessage(yqj2.obtainMessage(1003, new Exception(LJJJJIZL2.LIZIZ)));
                    return;
                }
                C63922P6w.LIZLLL("TEImage2Mode", "af converge, do capture...");
                LJJJLIIL();
                return;
            }
            if (i2 == 0) {
                if (z || !this.LJJLIL) {
                    this.LJJJLIIL = System.currentTimeMillis();
                    this.LJJLIIIJJIZ = 1;
                    this.LJJJLL.sendEmptyMessageDelayed(1007, j);
                    if (this.LJJLIIIJLJLI) {
                        this.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                    }
                    this.LIZJ.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                    XS3 LJII = LJII(this.LIZJ, this.LJJJJZI, this.LJIIJ);
                    if (LJII.LIZ) {
                        return;
                    }
                    YQJ yqj3 = this.LJJJLL;
                    yqj3.sendMessage(yqj3.obtainMessage(1003, new Exception(LJII.LIZIZ)));
                    return;
                }
                C63922P6w.LIZLLL("TEImage2Mode", "af converge, do capture...");
                LJJJJZI();
                return;
            }
            if (i2 == 1) {
                this.LJJLIIIJJIZ = 1;
                if (z) {
                    this.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    this.LIZJ.set(CaptureRequest.FLASH_MODE, 2);
                }
                LJJJJZI();
                return;
            }
            this.LJJLIIIJJIZ = 1;
            LJJJLIIL();
            return;
        }
        this.LJJLIIIJJIZ = 1;
        LJJJLIIL();
    }

    public final void LJJJZ(int i, Exception exc) {
        if (this.LJL != null) {
            if (this.LJI != null) {
                exc = YQ5.LIZIZ(i, exc);
            }
            ((C63973P8v) this.LJL).LIZIZ(exc);
            C63973P8v c63973P8v = (C63973P8v) this.LJL;
            if (c63973P8v.LIZ != null) {
                VECameraSettings.CAMERA_FACING_ID.values();
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("resultCode", -2);
                jSONObject.put("duration", System.currentTimeMillis() - c63973P8v.LIZIZ);
                c.LIZ("vesdk_event_recorder_take_picture", "business", jSONObject);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        this.LJJLIIIJJIZ = 0;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCaptureFailed, err = ");
        LIZ.append(exc);
        LIZ.append(", errCode = ");
        LIZ.append(i);
        LIZ.append(", facing = ");
        LIZ.append(this.LJJLIIIJL);
        C63922P6w.LJ("TEImage2Mode", X1D.LIZIZ(LIZ));
    }

    public final void LJJL(Image image, TotalCaptureResult totalCaptureResult) {
        int i;
        EnumC63901P6b enumC63901P6b;
        int width = image.getWidth();
        int height = image.getHeight();
        if (this.LJJLIIIJL == 1) {
            i = 270;
        } else {
            i = 90;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("on image available, consume: ");
        LIZ.append(System.currentTimeMillis() - this.LJJLL);
        LIZ.append(", size: ");
        LIZ.append(width);
        LIZ.append("x");
        LIZ.append(height);
        LIZ.append(", format: ");
        LIZ.append(image.getFormat());
        LIZ.append(", rotation: ");
        LIZ.append(i);
        C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LIZ));
        if (this.LJL != null) {
            P6Y p6y = new P6Y(image.getPlanes());
            if (image.getFormat() == 256) {
                enumC63901P6b = EnumC63901P6b.PIXEL_FORMAT_JPEG;
            } else {
                enumC63901P6b = EnumC63901P6b.PIXEL_FORMAT_YUV420;
            }
            int i2 = this.LJJLIIIJL;
            P6E p6e = new P6E(width, height, 0L);
            p6e.LJI(p6y, i, enumC63901P6b, i2);
            if (image.getFormat() == 35) {
                P6S p6s = new P6S();
                System.currentTimeMillis();
                p6s.LIZ = totalCaptureResult;
                p6e.LIZLLL = p6s;
                int i3 = ((width * height) * 3) / 2;
                byte[] bArr = new byte[i3];
                if (image.getFormat() != 35) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("image format wrong: ");
                    LIZ2.append(image.getFormat());
                    C63922P6w.LIZIZ("TECameraUtils", X1D.LIZIZ(LIZ2));
                } else {
                    int width2 = image.getWidth();
                    int height2 = image.getHeight();
                    if (i3 < ((width2 * height2) * 3) / 2) {
                        C63922P6w.LIZIZ("TECameraUtils", "output buffer size invalid...");
                    } else {
                        Image.Plane[] planes = image.getPlanes();
                        int i4 = 0;
                        for (int i5 = 0; i5 < planes.length; i5 += 2) {
                            Image.Plane plane = planes[i5];
                            ByteBuffer buffer = plane.getBuffer();
                            if (buffer != null) {
                                int rowStride = plane.getRowStride();
                                if (rowStride <= 0) {
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    LIZ3.append("imageToNV21, rowStride: ");
                                    LIZ3.append(width2);
                                    C63922P6w.LIZIZ("TECameraUtils", X1D.LIZIZ(LIZ3));
                                    rowStride = width2;
                                }
                                int pixelStride = plane.getPixelStride();
                                if (pixelStride <= 0) {
                                    StringBuilder LIZ4 = X1D.LIZ();
                                    LIZ4.append("imageToNV21, pixelStride: ");
                                    LIZ4.append(pixelStride);
                                    C63922P6w.LIZIZ("TECameraUtils", X1D.LIZIZ(LIZ4));
                                    pixelStride = 1;
                                }
                                int i6 = height2 / pixelStride;
                                if (rowStride == width2) {
                                    buffer.get(bArr, i4, buffer.remaining());
                                    i4 += rowStride * i6;
                                } else {
                                    for (int i7 = 0; i7 < i6 - 1; i7++) {
                                        buffer.get(bArr, i4, rowStride);
                                        i4 += width2;
                                    }
                                    buffer.get(bArr, i4, Math.min(width2, buffer.remaining()));
                                    i4 += width2;
                                }
                            }
                        }
                        p6e = new P6E(bArr, EnumC63901P6b.PIXEL_FORMAT_NV21, width, height, i);
                    }
                }
                C63922P6w.LJ("TEImage2Mode", "convert nv21 failed");
                break;
            }
            ((C63973P8v) this.LJL).LIZ(p6e);
        }
    }

    public final void LJJLI(int i, int i2) {
        int i3;
        TEFrameSizei LJIIJJI;
        C84134X0g c84134X0g = this.LJII;
        int i4 = 256;
        if (c84134X0g.LLJJIII || c84134X0g.LJLJLJ) {
            i3 = 35;
        } else {
            i3 = 256;
        }
        int i5 = c84134X0g.LL;
        boolean z = false;
        if (c84134X0g.LLFZ) {
            c84134X0g.LLFZ = false;
            LJIIJJI = c84134X0g.LJZL;
        } else {
            List<TEFrameSizei> LJI = PDA.LJI(LJIJJLI(i3));
            C84134X0g c84134X0g2 = this.LJII;
            if (c84134X0g2.LLFII) {
                LJIIJJI = PDA.LJIIJ(LJI, c84134X0g2.LJZI, i5, c84134X0g2.LLFFF);
            } else {
                if (this.LJIJJ != null) {
                    if (!StreamConfigurationMap.isOutputSupportedFor(SurfaceTexture.class)) {
                        C63922P6w.LIZIZ("TEImage2Mode", "Output SurfaceTexture is not supported");
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("select picture size failed...format: ");
                        LIZ.append(i3);
                        C63922P6w.LIZIZ("TEImage2Mode", X1D.LIZIZ(LIZ));
                    }
                    try {
                        LJIIJJI = this.LJIJJ.LIZ(LJI, PDA.LJI(LJIL()));
                        if (LJIIJJI == null) {
                        }
                    } catch (Exception e) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("select pic size from client err: ");
                        LIZ2.append(e.getMessage());
                        C63922P6w.LIZIZ("TEImage2Mode", X1D.LIZIZ(LIZ2));
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("select pic size is null, get closest size: ");
                    LIZ3.append(LJIIJJI);
                    C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LIZ3));
                }
                LJIIJJI = PDA.LJIIJJI(LJI, this.LJII.LJZI, new TEFrameSizei(i, i2));
                StringBuilder LIZ32 = X1D.LIZ();
                LIZ32.append("select pic size is null, get closest size: ");
                LIZ32.append(LJIIJJI);
                C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LIZ32));
            }
        }
        if (LJIIJJI != null) {
            C84134X0g c84134X0g3 = this.LJII;
            c84134X0g3.LJZL = LJIIJJI;
            int i6 = LJIIJJI.width;
            int i7 = LJIIJJI.height;
            if (c84134X0g3.LJLJLJ && i6 <= 4096 && i3 == 35) {
                this.LJJLIIIIJ = new TotalCaptureResult[5];
                ImageReader newInstance = ImageReader.newInstance(i6, i7, i3, 3);
                this.LJJL = newInstance;
                newInstance.setOnImageAvailableListener(new P7U(this), this.LJJJLZIJ);
                z = true;
                Iterator it = ((ArrayList) LJIJJLI(256)).iterator();
                while (it.hasNext()) {
                    Size size = (Size) it.next();
                    if (size.getWidth() == i6 && size.getHeight() == i7) {
                        i6 = size.getWidth();
                        i7 = size.getHeight();
                        break;
                    }
                }
                this.LJJLIIIIJ = null;
                this.LJJL.setOnImageAvailableListener(null, null);
                this.LJJL.close();
                this.LJJL = null;
            }
            i4 = i3;
            this.LJJJZ = ImageReader.newInstance(i6, i7, i4, 1);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("image reader width: ");
            LIZ4.append(this.LJJJZ.getWidth());
            LIZ4.append(", height = ");
            LIZ4.append(this.LJJJZ.getHeight());
            LIZ4.append(", format: ");
            LIZ4.append(i4);
            LIZ4.append(", maxWidth: ");
            LIZ4.append(this.LJII.LL);
            LIZ4.append(", hasZslYuvSurface: ");
            LIZ4.append(z);
            C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LIZ4));
            this.LJJJZ.setOnImageAvailableListener(new P7V(this), this.LJJJLZIJ);
            return;
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("select picture size failed...format: ");
        LIZ5.append(i3);
        C63922P6w.LIZIZ("TEImage2Mode", X1D.LIZIZ(LIZ5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List<android.hardware.camera2.params.OutputConfiguration>] */
    @Override // X.YQ7
    public final void LJIILIIL(List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler) {
        ?? arrayList;
        P7T.LIZ("TEImage2Mode-createSession");
        if (Build.VERSION.SDK_INT >= 28) {
            if (!((ArrayList) this.LJJJJL).isEmpty()) {
                arrayList = this.LJJJJL;
            } else {
                arrayList = new ArrayList();
                if (list != null) {
                    Iterator it = ((ArrayList) list).iterator();
                    while (it.hasNext()) {
                        arrayList.add(new OutputConfiguration((Surface) it.next()));
                    }
                } else {
                    C63922P6w.LIZIZ("TEImage2Mode", "create session err, no surface...");
                }
            }
            SessionConfiguration sessionConfiguration = new SessionConfiguration(LJJII(list), arrayList, new ExecutorC87360YQi(handler), stateCallback);
            Range<Integer> LJIIJJI = LJIIJJI(new Range<>(Integer.valueOf(this.LJJII.min / this.LJII.LJLJI.fpsUnitFactor), Integer.valueOf(this.LJJII.max / this.LJII.LJLJI.fpsUnitFactor)));
            if (this.LIZJ == null) {
                this.LIZJ = this.LJIIIZ.createCaptureRequest(1);
            }
            this.LIZJ.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, LJIIJJI);
            LJJLIIIJ(this.LJJZZI);
            sessionConfiguration.setSessionParameters(this.LIZJ.build());
            C63922P6w.LIZLLL("TEImage2Mode", "createSession by sessionConfiguration");
            this.LJIIIZ.createCaptureSession(sessionConfiguration);
        } else {
            C63922P6w.LIZLLL("TEImage2Mode", "createSession by normally");
            this.LJIIIZ.createCaptureSession(list, stateCallback, handler);
        }
        P7T.LIZIZ();
    }

    public YQ8(YQ6 yq6, Context context, CameraManager cameraManager, Handler handler) {
        super(yq6, context, handler);
        this.LJJJLZIJ = new Handler(C16880lQ.LLJJJJ());
        this.LJJL = null;
        this.LJJLI = -1;
        this.LJJLIIIJ = null;
        this.LJJLIIIJILLIZJL = false;
        this.LJJLIIIJJI = null;
        this.LJJLIIIJJIZ = 0;
        this.LJJLIIIJLJLI = false;
        this.LJJLIIIJLLLLLLLZ = false;
        this.LJJLIIJ = false;
        this.LJJLIL = false;
        this.LJJLJ = 0;
        this.LJJLJLI = 0;
        this.LJJLL = 0L;
        this.LJJZ = null;
        this.LJJZZI = -1;
        this.LJJZZIII = 0;
        this.LJLI = 0;
        this.LJLIIIL = 0L;
        this.LJ = cameraManager;
        if (this.LJII.LJLLJ) {
            this.LJIIIIZZ = new C87358YQg(this);
        } else {
            this.LJIIIIZZ = new C87356YQe(this);
        }
        this.LJJJLL = new YQJ(this, handler.getLooper());
        this.LJJJJZI = new YQD(this);
    }
}
