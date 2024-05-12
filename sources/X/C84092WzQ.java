package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.medialib.camera.ImageFrame;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.medialib.presenter.IStickerRequestCallback;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ttve.model.VERenderContext;
import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.ttve.monitor.TEMonitorInvoker;
import com.ss.android.ttve.nativePort.TEAudioDataInterface;
import com.ss.android.ttve.nativePort.TEBundle;
import com.ss.android.ttve.nativePort.TECallbackClient;
import com.ss.android.ttve.nativePort.TEImageFactory;
import com.ss.android.ttve.nativePort.TEMessageClient;
import com.ss.android.ttve.nativePort.TERecorderInterface;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ttvecamera.TECameraFrameSetting;
import com.ss.android.vesdk.TEMemMonitor;
import com.ss.android.vesdk.VEARCoreParam;
import com.ss.android.vesdk.VEAudioCapture;
import com.ss.android.vesdk.VEAudioCaptureSettings;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.VECameraFrameTime;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VECherEffectParam;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VEDuetSettings;
import com.ss.android.vesdk.VEEffectParams;
import com.ss.android.vesdk.VEFileUtils;
import com.ss.android.vesdk.VEFocusSettings;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.VEPreviewSettings;
import com.ss.android.vesdk.VEReactSettings;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VERecordMode;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESafeAreaParams;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VETouchPointer;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEVolumeParam;
import com.ss.android.vesdk.VEWatermarkParam;
import com.ss.android.vesdk.algorithm.VEBaseAlgorithmParam;
import com.ss.android.vesdk.camera.TECamera;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.ss.android.vesdk.effect.IEffect;
import com.ss.android.vesdk.filterparam.VEAudioAECFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioSpeedFilterParam;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.filterparam.VEBeautyFilterParam;
import com.ss.android.vesdk.filterparam.VEBlurFilterParam;
import com.ss.android.vesdk.filterparam.VEColorFilterParam;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.ss.android.vesdk.filterparam.VEExposureFilterParam;
import com.ss.android.vesdk.filterparam.VEFocusRunEffectFilter;
import com.ss.android.vesdk.filterparam.VEMIMOFilterParam;
import com.ss.android.vesdk.filterparam.VEMakeUpFilterParam;
import com.ss.android.vesdk.filterparam.VEReshapeFilterParam;
import com.ss.android.vesdk.lens.VEAdaptiveSharpenParams;
import com.ss.android.vesdk.lens.VEBaseRecorderLensParams;
import com.ss.android.vesdk.lens.VELumaDetectParams;
import com.ss.android.vesdk.lens.VEOneKeyProcessParams;
import com.ss.android.vesdk.lens.VERhythmicMotionParam;
import com.ss.android.vesdk.lens.VETaintSceneDetectParams;
import com.ss.android.vesdk.model.VEPrePlayParams;
import com.ss.android.vesdk.model.VERecordPerformanceData;
import com.ss.android.vesdk.runtime.VERuntime;
import com.ss.android.vesdk.utils.TEArrayUtils;
import com.ss.android.vesdk.utils.TEFrameUtils;
import com.ss.android.vesdk.video.TEVideoDataInterface;
import defpackage.b0;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import jp3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.WzQ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84092WzQ extends AbstractC84025WyL implements P6T {
    public final X0G LIZ;
    public final TERecorderInterface LIZIZ;
    public final TECamera LIZJ;
    public TEVideoDataInterface LIZLLL;
    public final C84099WzX LJ;
    public final Object LJFF;
    public InterfaceC84100WzY LJI;
    public P6Q LJII;
    public VEPreviewSettings LJIIIIZZ;
    public TECameraFrameSetting LJIIIZ;
    public final TECallbackClient LJIIJ;
    public boolean LJIIJJI;
    public InterfaceC133905Ni LJIIL;
    public final List<InterfaceC133905Ni> LJIILIIL;
    public final Object LJIILJJIL;
    public InterfaceC133905Ni LJIILL;
    public InterfaceC133905Ni LJIILLIIL;
    public InterfaceC84052Wym LJIIZILJ;
    public InterfaceC84052Wym LJIJ;
    public InterfaceC84052Wym LJIJI;
    public InterfaceC84052Wym LJIJJ;
    public InterfaceC84052Wym LJIJJLI;
    public InterfaceC84052Wym LJIL;
    public InterfaceC84052Wym LJJ;
    public InterfaceC84052Wym LJJI;
    public InterfaceC84052Wym LJJIFFI;
    public InterfaceC84052Wym LJJII;
    public int LJJIII;
    public final java.util.Map<Integer, Pair<VEBaseFilterParam, Integer>> LJJIIJ;
    public final ExecutorService LJJIIJZLJL;
    public int LJJIIZ;
    public int LJJIIZI;
    public int LJJIJ;
    public int LJJIJIIJI;
    public final Object LJJIJIIJIL;
    public final AtomicBoolean LJJIJIL;
    public X02 LJJIJL;
    public final Object LJJIJLIJ;
    public int LJJIL;
    public EnumC84106Wze LJJIZ;
    public TEAudioDataInterface LJJJ;
    public VEAudioCaptureSettings LJJJI;
    public final Handler LJJJIL;
    public boolean LJJJJ;
    public boolean LJJJJI;
    public String LJJJJIZL;
    public boolean LJJJJJ;
    public VEDisplaySettings LJJJJJL;
    public int LJJJJL;
    public int LJJJJLI;
    public final C84104Wzc LJJJJLL;
    public final Lock LJJJJZ;
    public final Condition LJJJJZI;
    public final Lock LJJJLIIL;
    public final Condition LJJJLL;
    public final Lock LJJJLZIJ;
    public final Condition LJJJZ;
    public final Lock LJJL;
    public final Condition LJJLI;
    public boolean LJJLIIIIJ;
    public Surface LJJLIIIJ;
    public int LJJLIIIJILLIZJL;
    public final VESize LJJLIIIJJI;
    public final float LJJLIIIJJIZ;
    public int LJJLIIIJL;
    public VESize LJJLIIIJLJLI;
    public int LJJLIIIJLLLLLLLZ;
    public int LJJLIIJ;
    public X06 LJJLIL;
    public boolean LJJLJ;
    public volatile boolean LJJLJLI;
    public P4F LJJLL;
    public C168396jD LJJZ;
    public final TECamera LJJZZI;
    public final C169706lK<P6O> LJJZZIII;
    public final Queue<Pair<Integer, Long>> LJL;
    public boolean LJLI;
    public Cert LJLIIIL;
    public int LJLIIL;
    public boolean LJLIL;
    public int LJLILLLLZI;
    public C84030WyQ LJLJI;
    public VEFocusSettings LJLJJI;

    @Override // X.AbstractC84025WyL
    public final void addSticker(Bitmap bitmap, int i, int i2) {
    }

    @Override // X.AbstractC84025WyL
    public final void clearSticker() {
    }

    @Override // X.AbstractC84025WyL
    public final float[] getAECSuggestVolume() {
        return new float[]{0.0f, 0.0f};
    }

    @Override // X.AbstractC84025WyL
    public final float getCameraFps() {
        return 0.0f;
    }

    @Override // X.AbstractC84025WyL
    public final InterfaceC84082WzG getRecorderModelControl() {
        X06 x06;
        synchronized (this) {
            if (this.LJJLIL == null) {
                LJIIIIZZ();
            }
            x06 = this.LJJLIL;
        }
        if (x06 == null) {
            return null;
        }
        x06.LIZIZ();
        return null;
    }

    @Override // X.AbstractC84025WyL
    public final InterfaceC84083WzH getRecorderPrePlayControl() {
        X06 x06;
        synchronized (this) {
            if (this.LJJLIL == null) {
                LJIIIIZZ();
            }
            x06 = this.LJJLIL;
        }
        if (x06 == null) {
            return null;
        }
        x06.LIZ();
        return null;
    }

    @Override // X.AbstractC84025WyL
    public final void onPause() {
    }

    @Override // X.AbstractC84025WyL
    public final boolean previewDuetVideo() {
        return false;
    }

    @Override // X.AbstractC84025WyL
    public final int setBeautyIntensity(int i, float f) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public final void setCaptureMirror(boolean z) {
    }

    @Override // X.AbstractC84025WyL
    public final void setDropFrame(int i) {
    }

    @Override // X.AbstractC84025WyL
    public final void setFocusWithFaceDetect() {
        regFaceInfoCallback(new C84028WyO(this, new int[]{3}));
    }

    @Override // X.AbstractC84025WyL
    public final void setPreviewDuetVideoPaused(boolean z) {
    }

    @Override // X.AbstractC84025WyL
    public final void setPreviewRotation(int i) {
    }

    @Override // X.AbstractC84025WyL
    public final void setReactPosMarginInVideoRecordPixel(int i, int i2, int i3, int i4) {
    }

    @Override // X.AbstractC84025WyL
    public final void setReactionBorderParam(int i, int i2) {
    }

    @Override // X.AbstractC84025WyL
    public final void setSwapDuetRegion(boolean z) {
    }

    @Override // X.AbstractC84025WyL
    public final void startAudioRecorder() {
        startAudioRecorder(null);
    }

    @Override // X.AbstractC84025WyL
    public final void stopAudioRecorder() {
        stopAudioRecorder(null);
    }

    @Override // X.AbstractC84025WyL
    public final void stopPreview() {
        stopPreview(false);
    }

    @Override // X.AbstractC84025WyL
    public final int stopRecord(boolean z) {
        return 0;
    }

    public final int LJII() {
        boolean z = false;
        boolean LJFF = C65429Pm5.LJFF("ve_enable_sys_karaoke", false);
        if (this.mVEAudioCapture != null) {
            VEAudioCaptureSettings.Builder builder = new VEAudioCaptureSettings.Builder();
            builder.setAudioDataStore(1);
            builder.setAudioCaptureLowLatency(LJIIIZ());
            if (LJFF && this.mEnableEarBack) {
                z = true;
            }
            builder.enableSysKaraoke(z);
            VEAudioCaptureSettings build = builder.build();
            this.LJJJI = build;
            int init = this.mVEAudioCapture.init(build);
            if (init != 0) {
                Q7K.LJ("audio capture init failed %d", init, "TERecorder");
            }
            return init;
        }
        P4Q.LIZJ("TERecorder", "audio capture is null");
        return -1;
    }

    public final void LJIIIIZZ() {
        if (!this.LJJLJ) {
            this.LJJLJ = true;
            try {
                Class<?> cls = Class.forName("com.ss.android.vesdk.internal.apiimpl.VERecorderBusiness");
                this.LJJLIL = (X06) cls.getMethod("newInternalInstance", Long.TYPE).invoke(null, Long.valueOf(this.LIZIZ.LIZ));
                cls.getDeclaredMethod("init", new Class[0]).invoke(this.LJJLIL, new Object[0]);
            } catch (ClassNotFoundException e) {
                C16880lQ.LLLLIIL(e);
            } catch (IllegalAccessException e2) {
                C16880lQ.LLLLIIL(e2);
            } catch (NoSuchMethodException e3) {
                C16880lQ.LLLLIIL(e3);
            } catch (InvocationTargetException e4) {
                C16880lQ.LLLLIIL(e4);
            } catch (Exception e5) {
                C16880lQ.LLLLIIL(e5);
            }
        }
    }

    public final boolean LJIIIZ() {
        VERecordMode vERecordMode = this.mVERecordMode;
        if (vERecordMode == VERecordMode.KARAOKE || vERecordMode == VERecordMode.KARAOKE_PURE_AUDIO || vERecordMode == VERecordMode.DUET_KARAOKE) {
            return true;
        }
        return false;
    }

    public final boolean LJIIJ() {
        boolean z;
        synchronized (this.LJJIJLIJ) {
            X02 x02 = this.LJJIJL;
            if (x02 != null && (x02 instanceof C84089WzN)) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // X.AbstractC84025WyL
    public final void changeCamera() {
        InterfaceC84100WzY interfaceC84100WzY = this.LJI;
        if (interfaceC84100WzY != null) {
            interfaceC84100WzY.LLLIILIL();
        } else {
            P4Q.LJII("TERecorder", "No Camera capture to changeCamera");
        }
    }

    @Override // X.AbstractC84025WyL
    public final void clearAllFrags() {
        this.LIZIZ.LIZIZ();
    }

    @Override // X.AbstractC84025WyL
    public final void clearLandMarkDetectListener() {
        ((CopyOnWriteArrayList) this.LIZ.LJLJLLL).clear();
    }

    @Override // X.AbstractC84025WyL
    public final void deleteLastFrag() {
        int LJ = this.LIZIZ.LJ(false);
        synchronized (this.LJJIJLIJ) {
            if (LJ == 0) {
                X02 x02 = this.LJJIJL;
                if (x02 != null) {
                    x02.LJII();
                }
            }
        }
    }

    @Override // X.AbstractC84025WyL
    public final InterfaceC84100WzY detachCameraCapture() {
        InterfaceC84100WzY interfaceC84100WzY = this.LJI;
        this.LJI = null;
        return interfaceC84100WzY;
    }

    @Override // X.AbstractC84025WyL
    public final void downExposureCompensation() {
        InterfaceC84100WzY interfaceC84100WzY = this.LJI;
        if (interfaceC84100WzY == null) {
            return;
        }
        interfaceC84100WzY.LJ();
    }

    @Override // X.AbstractC84025WyL
    public final P4F getAudioConsumer() {
        if (this.LJJJ == null) {
            this.LJJJ = new TEAudioDataInterface();
        }
        return this.LJJJ;
    }

    @Override // X.AbstractC84025WyL
    public final C168396jD getAudioPlayGlitchInfo() {
        C168396jD c168396jD = this.LJJZ;
        if (c168396jD == null) {
            P4Q.LIZJ("TERecorder", "can not get glitch info, please enable glitch metrics");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C168396jD c168396jD2 = this.LJJZ;
        c168396jD.LIZLLL = currentTimeMillis - c168396jD2.LIZLLL;
        return c168396jD2;
    }

    @Override // X.AbstractC84025WyL
    public final X0R getCameraECInfo() {
        InterfaceC84100WzY interfaceC84100WzY = this.LJI;
        if (interfaceC84100WzY != null && interfaceC84100WzY.getCameraECInfo() != null) {
            return new X0R();
        }
        return null;
    }

    @Override // X.AbstractC84025WyL
    public final VECameraSettings.CAMERA_FACING_ID getCameraFacing() {
        InterfaceC84100WzY interfaceC84100WzY = this.LJI;
        if (interfaceC84100WzY != null) {
            return interfaceC84100WzY.getCameraFacing();
        }
        throw new IllegalStateException("No Camera capture to getCameraFacing");
    }

    @Override // X.AbstractC84025WyL
    public final VECameraFrameTime getCameraFrameTime() {
        return this.LIZIZ.LJII();
    }

    @Override // X.AbstractC84025WyL
    public final String getComposerNodePaths() {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 21);
        LIZJ.setInt("effectEngineType", 0);
        TEBundle obtain = TEBundle.obtain();
        if (x0g.LJLIL.callEffectInterfaceWithResult(LIZJ, obtain) != 0) {
            return "";
        }
        String string = obtain.getString("Result");
        obtain.recycle();
        return string;
    }

    @Override // X.AbstractC84025WyL
    public final VERecordMode getCurRecordMode() {
        synchronized (this.LJJIJLIJ) {
            X02 x02 = this.LJJIJL;
            if (x02 == null) {
                return this.mVERecordMode;
            }
            if (x02 instanceof C84096WzU) {
                return VERecordMode.REACTION;
            }
            if (x02 instanceof C84091WzP) {
                return VERecordMode.DUET;
            }
            if (x02 instanceof C84089WzN) {
                return VERecordMode.CUSTOM_VIDEO_BG;
            }
            return VERecordMode.DEFAULT;
        }
    }

    @Override // X.AbstractC84025WyL
    public final String getDuetAudioPath() {
        if (VERecordMode.DUET == getCurRecordMode()) {
            return this.mVEDuetSettings.getDuetAudioPath();
        }
        return null;
    }

    @Override // X.AbstractC84025WyL
    public final C78941UyX getEffectFrameCostStatistics() {
        C78941UyX c78941UyX;
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 55);
        TEBundle obtain = TEBundle.obtain();
        if (x0g.LJLIL.callEffectInterfaceWithResult(LIZJ, obtain) == 0) {
            c78941UyX = new C78941UyX();
            c78941UyX.LIZ = obtain.getFloat("processTextureTime");
            c78941UyX.LIZIZ = obtain.getFloat("pureRenderTime");
            c78941UyX.LIZJ = obtain.getFloat("waitAlgorithmTime");
            c78941UyX.LIZLLL = obtain.getFloat("pureAlgorithmTime");
            String str = C84094WzS.LJLLI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getFrameCostStatistics processTextureTime = ");
            LIZ.append(c78941UyX.LIZ);
            LIZ.append(", pureRenderTime = ");
            LIZ.append(c78941UyX.LIZIZ);
            LIZ.append(", waitAlgorithmTime = ");
            LIZ.append(c78941UyX.LIZJ);
            LIZ.append(", pureAlgorithmTime = ");
            LIZ.append(c78941UyX.LIZLLL);
            P4Q.LJFF(str, X1D.LIZIZ(LIZ));
        } else {
            c78941UyX = null;
        }
        obtain.recycle();
        return c78941UyX;
    }

    @Override // X.AbstractC84025WyL
    public final long getEffectHandler() {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 35);
        LIZJ.setInt("effectEngineType", 0);
        TEBundle obtain = TEBundle.obtain();
        x0g.LJLIL.callEffectInterfaceWithResult(LIZJ, obtain);
        long j = obtain.getLong("EffectHandler");
        obtain.recycle();
        return j;
    }

    @Override // X.AbstractC84025WyL
    public final HYA getEffectStickerLagInfo() {
        HYA hya;
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 56);
        TEBundle obtain = TEBundle.obtain();
        if (x0g.LJLIL.callEffectInterfaceWithResult(LIZJ, obtain) == 0) {
            hya = new HYA();
            int[] intArray = obtain.getIntArray("stickerLagInfo");
            hya.LIZ = intArray[0];
            hya.LIZIZ = intArray[1];
            hya.LIZJ = intArray[2];
            String str = C84094WzS.LJLLI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getStickerLagInfo lagCount = ");
            LIZ.append(hya.LIZ);
            LIZ.append(", lagTotalDuration = ");
            LIZ.append(hya.LIZIZ);
            LIZ.append(", stickerDuration = ");
            C01R.LIZJ(LIZ, hya.LIZJ, LIZ, str);
        } else {
            hya = null;
        }
        obtain.recycle();
        return hya;
    }

    @Override // X.AbstractC84025WyL
    public final long getEndFrameTime() {
        int LJIIIZ;
        if (this.LJIIIIZZ.isEnableRenderLayer()) {
            LJIIIZ = this.LIZIZ.LJIIIZ("CurMediaTime");
        } else {
            LJIIIZ = this.LIZIZ.LJIIIZ("CurMediaTime") / 1000;
        }
        return LJIIIZ;
    }

    @Override // X.AbstractC84025WyL
    public final EnigmaResult getEnigmaResult() {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 104);
        LIZJ.setInt("effectEngineType", 0);
        Object callEffectInterfaceWithResult = x0g.LJLIL.callEffectInterfaceWithResult(LIZJ);
        if (callEffectInterfaceWithResult != null) {
            return (EnigmaResult) callEffectInterfaceWithResult;
        }
        return null;
    }

    @Override // X.AbstractC84025WyL
    public final VERecordPerformanceData getLastPerformanceData() {
        return this.LIZIZ.LJIIJ();
    }

    @Override // X.AbstractC84025WyL
    public final int getMicState() {
        VEAudioCapture vEAudioCapture = this.mVEAudioCapture;
        if (vEAudioCapture == null) {
            return super.getMicState();
        }
        return vEAudioCapture.getMicState();
    }

    @Override // X.AbstractC84025WyL
    public final long getPrePlayTimeStamp() {
        return this.LIZIZ.LJIIIZ("PrePlayTimeStamp");
    }

    @Override // X.AbstractC84025WyL
    public final int[] getPreviewRenderRect() {
        boolean z;
        int i;
        int i2;
        if (!this.mIsBindingViewMode || !this.LJJLIIIJJI.isValid()) {
            return null;
        }
        VESize vESize = this.LJJLIIIJJI;
        int i3 = vESize.width;
        int i4 = vESize.height;
        if (this.LJJLIIIJILLIZJL == EnumC63976P8y.RADIO_1_1.ordinal() || this.LJJLIIIJILLIZJL == EnumC63976P8y.RADIO_ROUND.ordinal()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            VESize vESize2 = this.LJJLIIIJJI;
            i4 = vESize2.width;
            i2 = (int) ((this.mViewportPaddingBottomInRadio34 - this.LJJLIIIJJIZ) * ((i4 * 4.0f) / 3.0f));
            i = ((vESize2.height - i4) / 2) - i2;
        } else {
            i = 0;
            i2 = 0;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getPreviewRenderRect, surface size: ");
        LIZ.append(this.LJJLIIIJJI);
        LIZ.append(", ratio mode: ");
        LIZ.append(this.LJJLIIIJILLIZJL);
        LIZ.append(", translateY: ");
        LIZ.append(i2);
        P4Q.LJFF("TERecorder", X1D.LIZIZ(LIZ));
        return new int[]{0, i, i3, i4};
    }

    @Override // X.AbstractC84025WyL
    public final String getReactAudioPath() {
        if (VERecordMode.REACTION == getCurRecordMode()) {
            return this.mVEReactSettings.getReactAudioPath();
        }
        return null;
    }

    @Override // X.AbstractC84025WyL
    public final int[] getReactRegionInRecordVideoPixel() {
        P4Q.LJFF("TERecorder", "getReactRegionInRecordVideoPixel");
        VESize videoRes = this.mVideoEncodeSettings.getVideoRes();
        return new int[]{0, 0, videoRes.width, videoRes.height};
    }

    @Override // X.AbstractC84025WyL
    public final int[] getReactRegionInViewPixel() {
        P4Q.LJFF("TERecorder", "getReactRegionInViewPixel");
        VESize videoRes = this.mVideoEncodeSettings.getVideoRes();
        return new int[]{0, 0, videoRes.width, videoRes.height};
    }

    @Override // X.AbstractC84025WyL
    public final int[] getReactionPosMarginInViewPixel() {
        P4Q.LJFF("TERecorder", "getReactionPosMarginInViewPixel");
        return new int[]{0, 0, 0, 0};
    }

    @Override // X.AbstractC84025WyL
    public final float getReactionWindowRotation() {
        P4Q.LJFF("TERecorder", "getReactionWindowRotation");
        return 0.0f;
    }

    @Override // X.AbstractC84025WyL
    public final long getRealSegmentFrameTimeUS() {
        return this.LIZIZ.LJIIIZ("RealSegmentFrameTime");
    }

    @Override // X.AbstractC84025WyL
    public final int getRecordCount() {
        int LJIIIZ = this.LIZIZ.LJIIIZ("ClipCount");
        this.recordCount = LJIIIZ;
        return LJIIIZ;
    }

    @Override // X.AbstractC84025WyL
    public final int getRecordStatus() {
        TERecorderInterface tERecorderInterface = this.LIZIZ;
        if (tERecorderInterface.LIZ != 0) {
            return tERecorderInterface.LJIIIZ("RecordStatus");
        }
        P4Q.LIZJ("TERecorder", "getRecordStatus failed");
        return -1;
    }

    @Override // X.AbstractC84025WyL
    public final String[] getRecordedVideoPaths() {
        return this.LIZIZ.LJIILIIL();
    }

    @Override // X.AbstractC84025WyL
    public final long getSegmentAudioPlayBackTimestamp() {
        return this.LIZIZ.LJIIIZ("PlayBackTimeStamp");
    }

    @Override // X.AbstractC84025WyL
    public final long getSegmentFrameTimeUS() {
        return this.LIZIZ.LJIIIZ("SegmentFrameTime");
    }

    @Override // X.AbstractC84025WyL
    public final VEAudioCaptureSettings getSuggestionSettingsForKaraoke() {
        P4Q.LJFF("TERecorder", "getSuggestionSettingsForKaraoke");
        if (this.mAttachAudioFromOther) {
            P4Q.LJFF("TERecorder", "get suggestion settings for karaoke");
            boolean z = false;
            boolean booleanValue = VEConfigCenter.getInstance().getValue("ve_enable_sys_karaoke", false).booleanValue();
            VEAudioCaptureSettings.Builder builder = new VEAudioCaptureSettings.Builder();
            builder.setAudioDataStore(1);
            builder.setAudioCaptureLowLatency(true);
            if (booleanValue && this.mEnableEarBack) {
                z = true;
            }
            builder.enableSysKaraoke(z);
            VEAudioCaptureSettings build = builder.build();
            this.LJJJI = build;
            return build;
        }
        P4Q.LIZJ("TERecorder", "get suggestion settings for karaoke error, current is old audio capture");
        return null;
    }

    @Override // X.AbstractC84025WyL
    public final ICH getVideoController() {
        synchronized (this.LJJIJLIJ) {
            X02 x02 = this.LJJIJL;
            if (x02 != null && (x02 instanceof ICH)) {
                return new ICI((ICH) x02);
            }
            return new X0M();
        }
    }

    @Override // X.AbstractC84025WyL
    public final boolean isSupportedExposureCompensation() {
        InterfaceC84100WzY interfaceC84100WzY = this.LJI;
        if (interfaceC84100WzY != null && interfaceC84100WzY.isSupportedExposureCompensation()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC84025WyL
    public final void onDestroy() {
        removeFaceInfoCallback(this.LJLJI);
        this.LJLJI = null;
        this.LIZJ.destroy();
        this.LJJZZI.destroy();
        if (this.LJJLIL != null) {
            getRecorderModelControl();
        }
        synchronized (this.LJFF) {
            if (this.LJ.LJFF != 0) {
                this.LJ.LJFF = 0;
                int LJIL = this.LIZIZ.LJIL();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("releaseInternalRecorder ret: ");
                LIZ.append(LJIL);
                P4Q.LJFF("TERecorder", X1D.LIZIZ(LIZ));
            }
        }
        X06 x06 = this.LJJLIL;
        if (x06 != null) {
            x06.release();
        }
        this.LJIILL = null;
        this.LJIIL = null;
        this.LJIILLIIL = null;
        this.LJIJ = null;
        X0G x0g = this.LIZ;
        if (x0g != null) {
            MessageCenter.removeListener(x0g);
            List<InterfaceC84042Wyc> list = x0g.LJLJI;
            if (list != null) {
                ((CopyOnWriteArrayList) list).clear();
            }
            List<X0W> list2 = x0g.LJLJLLL;
            if (list2 != null) {
                ((CopyOnWriteArrayList) list2).clear();
            }
        }
        VEAudioCapture vEAudioCapture = this.mVEAudioCapture;
        if (vEAudioCapture != null) {
            vEAudioCapture.clean();
        }
        TEAudioDataInterface tEAudioDataInterface = this.LJJJ;
        if (tEAudioDataInterface != null) {
            tEAudioDataInterface.release();
        }
        TECallbackClient tECallbackClient = this.LJIIJ;
        if (tECallbackClient != null) {
            tECallbackClient.setLensCallback(null);
        }
        InterfaceC84078WzC interfaceC84078WzC = this.recordScanControl;
        if (interfaceC84078WzC != null) {
            ((C84034WyU) interfaceC84078WzC).LIZ();
        }
        super.onDestroy();
        TEMonitorInvoker.nativeMonitorPerfWithType(0);
    }

    @Override // X.AbstractC84025WyL
    public final int pausePrePlay() {
        return this.LIZIZ.LJIJI();
    }

    @Override // X.AbstractC84025WyL
    public final float queryShaderStep() {
        InterfaceC84100WzY interfaceC84100WzY = this.LJI;
        if (interfaceC84100WzY == null) {
            return 0.0f;
        }
        return interfaceC84100WzY.LJFF();
    }

    @Override // X.AbstractC84025WyL
    public final int queryZoomAbility() {
        InterfaceC84100WzY interfaceC84100WzY = this.LJI;
        if (interfaceC84100WzY == null) {
            return -1;
        }
        return interfaceC84100WzY.LJIIJJI();
    }

    @Override // X.AbstractC84025WyL
    public final int refreshMotionPhoto() {
        return this.LIZIZ.LJJIII("refreshMotionPhoto", true);
    }

    @Override // X.AbstractC84025WyL
    public final void releaseGPUResources() {
        this.LIZIZ.LJJ(false);
    }

    @Override // X.AbstractC84025WyL
    public final void resetCameraFrameTime() {
        this.LIZIZ.LJJIFFI();
    }

    @Override // X.AbstractC84025WyL
    public final void resetEffectFrameCostStatistics() {
        X0G x0g = this.LIZ;
        x0g.LJLIL.callEffectInterface(Q7K.LIZJ(x0g, "effectInterfaceName", 54));
    }

    @Override // X.AbstractC84025WyL
    public final int startFollowingShotPreview() {
        return this.LIZIZ.LJJJJ();
    }

    @Override // X.AbstractC84025WyL
    public final void stopCameraPreview() {
        if (this.LJI != null) {
            P4Q.LJFF("TERecorder", "stopCameraPreview");
            this.LJI.LIZ();
        } else {
            P4Q.LJII("TERecorder", "No Camera capture to stopCameraPreview");
        }
    }

    @Override // X.AbstractC84025WyL
    public final void stopFollowingShotPreview() {
        this.LIZIZ.LJJJJLI();
    }

    @Override // X.AbstractC84025WyL
    public final int stopPreviewParallel() {
        return this.LIZIZ.LJJJJZI();
    }

    @Override // X.AbstractC84025WyL
    public final int stopRecord() {
        int LJJJLIIL;
        VEAudioCapture vEAudioCapture;
        if (this.mIsEnableVBoost) {
            this.mSystemResManager.LIZ(new X04(EnumC79412VEq.BOOST_CPU, getVBoostTimeout()));
            LJJJLIIL = this.LIZIZ.LJJJLIIL();
            this.mSystemResManager.LIZ(new X04(EnumC79412VEq.RESTORE_CPU));
        } else {
            LJJJLIIL = this.LIZIZ.LJJJLIIL();
        }
        if (!this.LJ.LJIILIIL && (vEAudioCapture = this.mVEAudioCapture) != null) {
            vEAudioCapture.stop(this.LJLIIIL);
        }
        synchronized (this.LJJIJLIJ) {
            if (LJJJLIIL == 0) {
                X02 x02 = this.LJJIJL;
                if (x02 != null) {
                    x02.LIZ();
                }
            }
        }
        C63868P4u.LJ(0, this.mVERecordMode.ordinal(), "te_record_mode");
        return LJJJLIIL;
    }

    @Override // X.AbstractC84025WyL
    public final void stopZoom() {
        InterfaceC84100WzY interfaceC84100WzY = this.LJI;
        if (interfaceC84100WzY == null) {
            return;
        }
        interfaceC84100WzY.LJIJI();
    }

    @Override // X.AbstractC84025WyL
    public final void unregEffectAlgorithmCallback() {
        this.LIZ.LJ(null);
    }

    @Override // X.AbstractC84025WyL
    public final void upExposureCompensation() {
        InterfaceC84100WzY interfaceC84100WzY = this.LJI;
        if (interfaceC84100WzY == null) {
            return;
        }
        interfaceC84100WzY.LJIIJ();
    }

    @Override // X.AbstractC84025WyL
    public final void updateCameraOrientation() {
        InterfaceC84100WzY interfaceC84100WzY = this.LJI;
        if (interfaceC84100WzY != null) {
            interfaceC84100WzY.LJIILJJIL(new X0N());
        }
    }

    @Override // X.AbstractC84025WyL
    public final void updateVideoDecodeChainByTimeline() {
        this.LIZIZ.LJJJZ();
    }

    public final void LJIILL() {
        VEAudioCapture vEAudioCapture;
        if (LJII() == 0 && (vEAudioCapture = this.mVEAudioCapture) != null) {
            Cert cert = this.LJLIIIL;
            C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100850, "com/ss/android/vesdk/VEAudioCapture", "start", vEAudioCapture, new Object[]{cert}, "int", new C65300Pk0(false, "(Lcom/bytedance/bpea/basics/Cert;)I", "-7418885746304930668"));
            if (LIZJ.LIZ) {
                ((Integer) LIZJ.LIZIZ).intValue();
            } else {
                vEAudioCapture.start(cert);
            }
        }
    }

    @Override // X.AbstractC84025WyL
    public final VERenderContext getCurVERenderContext() {
        EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
        C63907P6h c63907P6h = new C63907P6h();
        EnumC46487IMh enumC46487IMh = EnumC46487IMh.VE_RENDER_ENV_OPENGL;
        VERenderContext vERenderContext = c63907P6h.LIZ;
        vERenderContext.envType = enumC46487IMh;
        vERenderContext.eglContext = eglGetCurrentContext;
        return vERenderContext;
    }

    @Override // X.AbstractC84025WyL
    public final long getSegmentAudioUS() {
        return getSegmentFrameTimeUS();
    }

    @Override // X.AbstractC84025WyL
    public final int pauseRender() {
        VEConfigCenter.getInstance().getValue("ve_titan_release_gpu_resource", false).booleanValue();
        return this.LIZIZ.LJIJJ();
    }

    @Override // X.AbstractC84025WyL
    public final int startRender() {
        VEConfigCenter.getInstance().getValue("ve_titan_release_gpu_resource", false).booleanValue();
        return this.LIZIZ.LJJJJJL();
    }

    @Override // X.AbstractC84025WyL
    public final void unRegFaceInfoCallback() {
        super.unRegFaceInfoCallback();
        this.LIZ.LJFF();
    }

    @Override // X.AbstractC84025WyL
    public final void unRegSkeletonDetectCallback() {
        super.unRegSkeletonDetectCallback();
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 10);
        LIZJ.setInt("FlagType", 9);
        LIZJ.setInt("flag", 0);
        x0g.LJLIL.callEffectInterface(LIZJ);
        x0g.LJLIL.setSkeletonDetectCallback(null);
    }

    @Override // X.AbstractC84025WyL
    public final void unRegSmartBeautyCallback() {
        super.unRegSmartBeautyCallback();
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 10);
        LIZJ.setInt("FlagType", 3);
        LIZJ.setInt("flag", 0);
        x0g.LJLIL.callEffectInterface(LIZJ);
        x0g.LJLIL.setSmartBeautyCallback(null);
    }

    @Override // X.AbstractC84025WyL
    public final int getBGMTrackIndex() {
        return this.LJJIII;
    }

    @Override // X.AbstractC84025WyL
    public final InterfaceC84100WzY getCurrentCameraCapture() {
        return this.LJI;
    }

    @Override // X.AbstractC84025WyL
    public final VEDisplaySettings getDisplaySettings() {
        return this.LJJJJJL;
    }

    @Override // X.AbstractC84025WyL
    public final /* bridge */ /* synthetic */ IEffect getEffect() {
        return this.LIZ;
    }

    @Override // X.AbstractC84025WyL
    public final int getLastRecordFrameNum() {
        return this.LJJIIZ;
    }

    public final void LIZ(VEVideoEncodeSettings vEVideoEncodeSettings) {
        synchronized (this.LJJIJLIJ) {
            X02 x02 = this.LJJIJL;
            if (x02 != null && (x02 instanceof C84097WzV)) {
                VESize vESize = ((C84097WzV) x02).LJIIL;
                if (vESize.isValid()) {
                    vEVideoEncodeSettings.setVideoRes(vESize.width, vESize.height);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("_checkForceOutputSize: width=");
                    LIZ.append(vESize.width);
                    LIZ.append(", height=");
                    LIZ.append(vESize.height);
                    P4Q.LJII("TERecorder", X1D.LIZIZ(LIZ));
                }
            }
        }
    }

    public final void LJIILJJIL(Surface surface) {
        if (this.mIsBindingViewMode) {
            ((ReentrantLock) this.LJJJLZIJ).lock();
            this.LJJLIIIJ = surface;
            this.LJJJZ.signalAll();
            ((ReentrantLock) this.LJJJLZIJ).unlock();
            return;
        }
        this.LJJLIIIJ = surface;
    }

    @Override // X.AbstractC84025WyL
    public final void addCommonCallback(InterfaceC133905Ni interfaceC133905Ni) {
        if (interfaceC133905Ni == null) {
            P4Q.LIZJ("TERecorder", "VECommonCallback is null...");
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addCommonCallback: ");
        LIZ.append(interfaceC133905Ni.hashCode());
        P4Q.LJFF("TERecorder", X1D.LIZIZ(LIZ));
        synchronized (this.LJIILJJIL) {
            if (!((ArrayList) this.LJIILIIL).contains(interfaceC133905Ni)) {
                ((ArrayList) this.LJIILIIL).add(interfaceC133905Ni);
            }
        }
    }

    @Override // X.AbstractC84025WyL
    public final void addDataSource(AbstractC124534uf abstractC124534uf) {
        if (abstractC124534uf instanceof C124544ug) {
            if (this.LIZLLL == null) {
                this.LIZLLL = new TEVideoDataInterface(this.LIZIZ.LJIILJJIL());
            }
            abstractC124534uf.getClass();
            throw null;
        }
    }

    @Override // X.AbstractC84025WyL
    public final void addLandMarkDetectListener(X0W x0w) {
        X0G x0g = this.LIZ;
        if (x0g.LJLJLLL == null) {
            x0g.LJLJLLL = new CopyOnWriteArrayList();
        }
        if (((CopyOnWriteArrayList) x0g.LJLJLLL).size() <= 0) {
            x0g.LJLIL.setLandMarkDetectCallback(new C84118Wzq(x0g));
        }
        ((CopyOnWriteArrayList) x0g.LJLJLLL).add(x0w);
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 10);
        obtain.setInt("FlagType", 6);
        obtain.setInt("flag", 1);
        x0g.LJLIL.callEffectInterface(obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void attachCameraCapture(InterfaceC84100WzY interfaceC84100WzY) {
        if (this.mIsBindingViewMode) {
            ((ReentrantLock) this.LJJJJZ).lock();
            this.LJI = interfaceC84100WzY;
            this.LJJJJZI.signalAll();
            ((ReentrantLock) this.LJJJJZ).unlock();
            return;
        }
        this.LJI = interfaceC84100WzY;
    }

    @Override // X.AbstractC84025WyL
    public final void changeCamera(VECameraSettings.CAMERA_FACING_ID camera_facing_id) {
        InterfaceC84100WzY interfaceC84100WzY = this.LJI;
        if (interfaceC84100WzY != null) {
            interfaceC84100WzY.LJII(camera_facing_id);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No Camera capture to changeCamera(");
        LIZ.append(camera_facing_id);
        LIZ.append(")");
        P4Q.LJII("TERecorder", X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC84025WyL
    public final boolean changePreviewSize(VESize vESize) {
        InterfaceC84100WzY interfaceC84100WzY = this.LJI;
        if (interfaceC84100WzY == null) {
            return false;
        }
        return interfaceC84100WzY.LIZJ(vESize);
    }

    @Override // X.AbstractC84025WyL
    public final void changeRecordContentType(EnumC46476ILw enumC46476ILw) {
        super.changeRecordContentType(enumC46476ILw);
        C84099WzX c84099WzX = this.LJ;
        if (!c84099WzX.LJII) {
            P4Q.LIZJ("TERecorder", "changeRecordContentType failed, must be EnableDynamicRecordContentType");
            return;
        }
        if (c84099WzX.LJI == enumC46476ILw.ordinal()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("changeRecordContentType suc, cur is: ");
            LIZ.append(enumC46476ILw);
            P4Q.LJII("TERecorder", X1D.LIZIZ(LIZ));
            return;
        }
        this.LJ.LJI = enumC46476ILw.ordinal();
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("type", enumC46476ILw.ordinal());
        this.LIZIZ.LJJIIJ("changeRecordContentType", obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void changeRecordMode(VERecordMode vERecordMode) {
        boolean z;
        if (this.mVERecordMode == vERecordMode) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("changeRecordMode ");
        LIZ.append(vERecordMode);
        P4Q.LJFF("TERecorder", X1D.LIZIZ(LIZ));
        this.mVERecordMode = vERecordMode;
        synchronized (this.LJJIJLIJ) {
            if (this.mVideoEncodeSettings != null && !LJIIIZ() && getRecordStatus() == 2) {
                X02 x02 = this.LJJIJL;
                if (x02 != null) {
                    x02.onDestroy();
                    this.LJJIJL = null;
                }
                VERecordMode vERecordMode2 = this.mVERecordMode;
                if (vERecordMode2 == VERecordMode.DUET) {
                    C84097WzV c84097WzV = new C84097WzV(this, this.mVEDuetSettings, this.mVideoEncodeSettings.getVideoRes());
                    this.LJJIJL = c84097WzV;
                    c84097WzV.onCreate();
                    this.LJJIZ = EnumC84106Wze.CAM_WITH_VIDEO_TYPE_DUET;
                } else if (vERecordMode2 == VERecordMode.REACTION) {
                    C84096WzU c84096WzU = new C84096WzU(this, this.mVEReactSettings, this.mVideoEncodeSettings.getVideoRes());
                    this.LJJIJL = c84096WzU;
                    c84096WzU.onCreate();
                    this.LJJIZ = EnumC84106Wze.CAM_WITH_VIDEO_TYPE_REACTION;
                }
            }
        }
        boolean z2 = true;
        if (this.mVERecordMode == VERecordMode.DUET_KARAOKE) {
            this.LJ.LJIILL = true;
            this.LIZIZ.LJJIII("EnableAudioGraphRefactor", true);
        }
        this.LIZIZ.LJJIII("Karaoke", LJIIIZ());
        TERecorderInterface tERecorderInterface = this.LIZIZ;
        VERecordMode vERecordMode3 = this.mVERecordMode;
        if (vERecordMode3 == VERecordMode.KARAOKE_PURE_AUDIO || vERecordMode3 == VERecordMode.AUDIO) {
            z = true;
        } else {
            z = false;
        }
        tERecorderInterface.LJJIII("PureAudio", z);
        TERecorderInterface tERecorderInterface2 = this.LIZIZ;
        VERecordMode vERecordMode4 = this.mVERecordMode;
        if (vERecordMode4 != VERecordMode.DUET && vERecordMode4 != VERecordMode.REACTION) {
            z2 = false;
        }
        tERecorderInterface2.LJJIII("FocusSingleAudioTrack", z2);
        this.LIZIZ.LJJIJIIJIL("VERecordMode", this.mVERecordMode.ordinal());
    }

    @Override // X.AbstractC84025WyL
    public final int changeRenderSize(VESize vESize) {
        int i;
        int i2 = this.LJJJJL;
        if (i2 == 90 || i2 == 270) {
            vESize = new VESize(vESize.height, vESize.width);
        }
        this.LJ.LJJIII = vESize;
        VEDisplaySettings.Builder builder = new VEDisplaySettings.Builder(this.LJJJJJL);
        builder.setRenderSize(vESize);
        int i3 = this.LJJJJL;
        if (i3 == 90 || i3 == 270) {
            i = 0;
        } else {
            i = this.LJJJJJL.getTranslateY();
        }
        builder.setTranslateY(i);
        this.LJJJJJL = builder.build();
        this.LIZIZ.LJJIJIIJIL("RenderWidth", vESize.width);
        this.LIZIZ.LJJIJIIJIL("RenderHeight", vESize.height);
        return setDisplaySettings(this.LJJJJJL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        if (r1 != 0) goto L14;
     */
    @Override // X.AbstractC84025WyL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int changeResManager(X.AbstractC84033WyT r9) {
        /*
            r8 = this;
            super.changeResManager(r9)
            X.WzX r0 = r8.LJ
            int r0 = r0.LJFF
            java.lang.String r7 = "TERecorder"
            if (r0 == 0) goto L1a
            X.WzX r0 = r8.LJ
            int r1 = r0.LJFF
            r0 = 1
            if (r1 == r0) goto L1a
            java.lang.String r0 = "Invoking the wrong timing!"
            X.P4Q.LIZJ(r7, r0)
            r0 = -105(0xffffffffffffff97, float:NaN)
            return r0
        L1a:
            super.changeResManager(r9)
            X.WzX r0 = r8.LJ
            java.util.Queue<java.lang.String> r0 = r0.LJ
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r0.clear()
            X.WzX r0 = r8.LJ
            java.util.Queue<java.lang.String> r0 = r0.LIZLLL
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r0.clear()
            X.WzX r0 = r8.LJ
            r0.getClass()
            java.lang.String r0 = r9.LIZJ()
            java.lang.String r3 = java.io.File.separator
            boolean r0 = r0.endsWith(r3)
            if (r0 != 0) goto L56
            X.WzX r2 = r8.LJ
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r9.LIZJ()
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.LIZ = r0
        L56:
            com.ss.android.ttve.nativePort.TERecorderInterface r6 = r8.LIZIZ
            X.WzX r5 = r8.LJ
            long r3 = r6.LIZ
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L6a
            r1 = -112(0xffffffffffffff90, float:NaN)
        L64:
            java.lang.String r0 = "changeResManager failed ret="
            X.Q7K.LJ(r0, r1, r7)
        L69:
            return r1
        L6a:
            com.ss.android.ttve.nativePort.TEBundle r1 = X.C84093WzR.LIZIZ(r5)
            java.lang.String r0 = "RecordContext"
            r6.LJJIIJ(r0, r1)
            int r1 = r6.LIZIZ()
            if (r1 == 0) goto L69
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84092WzQ.changeResManager(X.WyT):int");
    }

    @Override // X.AbstractC84025WyL
    public final int changeSurface(Surface surface) {
        return changeSurface(surface, 0, 0);
    }

    @Override // X.AbstractC84025WyL
    public final void changeVideoEncodeSettings(VEVideoEncodeSettings vEVideoEncodeSettings) {
        this.mVideoEncodeSettings = vEVideoEncodeSettings;
        LIZ(vEVideoEncodeSettings);
        TERecorderInterface tERecorderInterface = this.LIZIZ;
        tERecorderInterface.getClass();
        tERecorderInterface.LJJIIJ("VideoEncode", C84093WzR.LIZLLL(vEVideoEncodeSettings));
    }

    @Override // X.AbstractC84025WyL
    public final int deleteFrag(int i) {
        Q4K.LJ("deleteRecordedFrag... index: ", i, "TERecorder");
        if (i < 0) {
            P4Q.LJII("TERecorder", "deleteRecordedFrag... index less than zero!");
            return -100;
        }
        return this.LIZIZ.LIZLLL(i);
    }

    @Override // X.AbstractC84025WyL
    public final void deleteLastFrag(InterfaceC84052Wym interfaceC84052Wym) {
        this.LJJ = interfaceC84052Wym;
        int LJ = this.LIZIZ.LJ(true);
        synchronized (this.LJJIJLIJ) {
            if (LJ == 0) {
                X02 x02 = this.LJJIJL;
                if (x02 != null) {
                    x02.LJII();
                }
            }
        }
        if (LJ != 0) {
            this.LJJ.LIZ(LJ);
            this.LJJ = null;
        }
    }

    @Override // X.AbstractC84025WyL
    public final void disableRender(boolean z) {
        if (z) {
            changeSurface(null);
        }
    }

    @Override // X.AbstractC84025WyL
    public final void enable34To916RatioForEffectRender(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enable34To916RatioForEffectRender : ");
        LIZ.append(z);
        P4Q.LJFF("TERecorder", X1D.LIZIZ(LIZ));
        this.LIZIZ.LJJIII("Enable34To916RatioForEffectRender", z);
    }

    @Override // X.AbstractC84025WyL
    public final void enableAudio(boolean z) {
        EnumC84112Wzk enumC84112Wzk;
        C84099WzX c84099WzX = this.LJ;
        if (z) {
            enumC84112Wzk = EnumC84112Wzk.ENABLE;
        } else {
            enumC84112Wzk = EnumC84112Wzk.DISABLE;
        }
        c84099WzX.LJJII = enumC84112Wzk;
        this.LIZIZ.LJJIJIIJIL("RecordMicConfig", enumC84112Wzk.ordinal());
    }

    @Override // X.AbstractC84025WyL
    public final void enableAudioPlayGlitchMetrics(boolean z) {
        C168396jD c168396jD = new C168396jD();
        this.LJJZ = c168396jD;
        c168396jD.LIZLLL = System.currentTimeMillis();
        TEBundle obtain = TEBundle.obtain();
        obtain.setBool("enableAudioGlitchMetrics", z);
        this.LIZIZ.LJJIIJ("enableAudioGlitchMetrics", obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void enableAudioRecorder(boolean z) {
        enableAudioRecorder(z, null);
    }

    @Override // X.AbstractC84025WyL
    public final void enableDuetMicRecord(boolean z) {
        enableAudio(z);
    }

    @Override // X.AbstractC84025WyL
    public final void enableEffect(boolean z) {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 23);
        LIZJ.setInt("effectEngineType", 0);
        LIZJ.setBool("enableEffect", z);
        LIZJ.setBool("needPassToPostProcess", true);
        x0g.LJLIL.callEffectInterface(LIZJ);
    }

    @Override // X.AbstractC84025WyL
    public final void enableEffectAmazing(boolean z) {
        super.enableEffectAmazing(z);
        X0G x0g = this.LIZ;
        x0g.getClass();
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 30);
        obtain.setBool("useAmazing", z);
        x0g.LJLIL.callEffectInterface(obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void enableFaceBeautifyDetect(int i) {
        X0G x0g = this.LIZ;
        x0g.getClass();
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 43);
        obtain.setInt("position", i);
        x0g.LJLIL.callEffectInterface(obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void enableFaceExtInfo(int i) {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 10);
        LIZJ.setInt("FlagType", 1);
        LIZJ.setInt("flag", i);
        x0g.LJLIL.callEffectInterface(LIZJ);
    }

    @Override // X.AbstractC84025WyL
    public final void enableFirstFrameBypassEffectFrame(boolean z) {
        this.LIZIZ.LJJIII("EnableFirstFrameBypassEffect", z);
    }

    @Override // X.AbstractC84025WyL
    public final void enableFollowingShotWindowLoopPlayWhenRecord(boolean z) {
        this.LIZIZ.LJJIII("enableFollowingShotWindowLoopPlayWhenRecord", z);
    }

    @Override // X.AbstractC84025WyL
    public final void enablePreviewPureColorFakeFrame(boolean z) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setBool("camera_preview_pure_color_fake_frame", z);
        this.LIZIZ.LJJIIJ("camera_preview_pure_color_fake_frame", obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void enableRecordFlip(boolean z) {
        if (z) {
            C87278YNe c87278YNe = new C87278YNe(this.mVideoEncodeSettings);
            c87278YNe.LIZIZ.mMirrorMode = VEVideoEncodeSettings.VEVideoEncodeMirrorMode.X_MIRROR;
            VEVideoEncodeSettings LIZ = c87278YNe.LIZ();
            TERecorderInterface tERecorderInterface = this.LIZIZ;
            tERecorderInterface.getClass();
            tERecorderInterface.LJJIIJ("VideoEncode", C84093WzR.LIZLLL(LIZ));
        }
    }

    @Override // X.AbstractC84025WyL
    public final void enableRecordingMp4(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enableRecordingMp4... value is ");
        LIZ.append(z);
        P4Q.LJFF("TERecorder", X1D.LIZIZ(LIZ));
        this.LIZIZ.LJJIII("RecordingMp4", z);
    }

    @Override // X.AbstractC84025WyL
    public final void enableSceneRecognition(boolean z) {
        this.LIZ.getClass();
        P4Q.LIZ("VEEffect", "Not supported yet.");
    }

    @Override // X.AbstractC84025WyL
    public final void enableSkeletonDetect(boolean z) {
        this.LIZ.getClass();
        P4Q.LIZ("VEEffect", "Not supported yet.");
    }

    @Override // X.AbstractC84025WyL
    public final void enableSmartBeauty(boolean z) {
        X0G x0g = this.LIZ;
        Pair pair = (Pair) ((HashMap) x0g.LJLJJLL).get(0);
        Pair pair2 = (Pair) ((HashMap) x0g.LJLJJLL).get(6);
        if (z) {
            int[] iArr = x0g.LJLJLJ;
            iArr[0] = iArr[0] + 1;
            if (pair == null) {
                x0g.LIZ(new C84073Wz7(0, "FaceDetect"), -1, -1, 0);
            }
            if (pair2 != null) {
                return;
            }
            x0g.LIZ(new C84073Wz7(6, "SmartBeauty"), -1, -1, 6);
            return;
        }
        x0g.LJLJLJ[0] = r1[0] - 1;
        if (pair2 != null) {
            x0g.removeTrackAlgorithm(((Integer) pair2.second).intValue());
        }
        if (x0g.LJLJLJ[0] > 0 || pair == null) {
            return;
        }
        x0g.removeTrackAlgorithm(((Integer) pair.second).intValue());
    }

    @Override // X.AbstractC84025WyL
    public final void enableStickerRecognition(boolean z) {
        this.LIZ.getClass();
        P4Q.LIZ("VEEffect", "Not supported yet.");
    }

    @Override // X.AbstractC84025WyL
    public final void enableTimestampCallback(boolean z) {
        this.LIZIZ.LJJIII("EnableTimestampCallback", z);
    }

    @Override // X.AbstractC84025WyL
    public final void enableWaterMark(boolean z) {
        super.enableWaterMark(z);
        TEBundle obtain = TEBundle.obtain();
        obtain.setBool("EnableWaterMark", z);
        this.LIZIZ.LJJIIJ("EnableWaterMark", obtain);
    }

    @Override // X.AbstractC84025WyL
    public final int exportResource(String str) {
        X0G x0g = this.LIZ;
        x0g.getClass();
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 53);
        obtain.setString("Path", str);
        return x0g.LJLIL.callEffectInterface(obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void forceVEPermanceRunOnceNow(Boolean bool) {
        this.LIZIZ.LJI(bool.booleanValue());
    }

    @Override // X.AbstractC84025WyL
    public final int getDuetAVTrackIndex(int i) {
        synchronized (this.LJJIJLIJ) {
            X02 x02 = this.LJJIJL;
            if (x02 != null && (x02 instanceof C84091WzP)) {
                if (i == 0) {
                    return ((C84091WzP) x02).LJII;
                }
                if (i == 1) {
                    return ((C84091WzP) x02).LJI;
                }
            }
            return -1;
        }
    }

    @Override // X.AbstractC84025WyL
    public final String getEffectETData(int i) {
        String str;
        X0G x0g = this.LIZ;
        x0g.getClass();
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 58);
        obtain.setInt("etType", i);
        TEBundle obtain2 = TEBundle.obtain();
        if (x0g.LJLIL.callEffectInterfaceWithResult(obtain, obtain2) == 0) {
            str = obtain2.getString("Result");
            String str2 = C84094WzS.LJLLI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getETData etData = ");
            LIZ.append(str);
            P4Q.LJFF(str2, X1D.LIZIZ(LIZ));
        } else {
            str = null;
        }
        obtain2.recycle();
        return str;
    }

    @Override // X.AbstractC84025WyL
    public final float getFilterIntensity(String str) {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 5);
        LIZJ.setInt("effectEngineType", 0);
        LIZJ.setString("filterPath", str);
        TEBundle obtain = TEBundle.obtain();
        x0g.LJLIL.callEffectInterfaceWithResult(LIZJ, obtain);
        float f = obtain.getFloat("filterIntensity");
        obtain.recycle();
        return f;
    }

    @Override // X.AbstractC84025WyL
    public final VEFrame getFrameByConfig(C84041Wyb c84041Wyb) {
        if (c84041Wyb.LIZ == 1) {
            X0G x0g = this.LIZ;
            String str = c84041Wyb.LIZIZ;
            TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 25);
            LIZJ.setInt("effectEngineType", 0);
            LIZJ.setString("FrameKey", str);
            return (VEFrame) x0g.LJLIL.callEffectInterfaceWithResult(LIZJ);
        }
        return null;
    }

    @Override // X.AbstractC84025WyL
    public final int getPreviewFrame(C84098WzW c84098WzW) {
        this.LJJJJI = false;
        this.LJJJJIZL = "";
        long currentTimeMillis = System.currentTimeMillis();
        c84098WzW.getClass();
        this.LJIIJ.setGetFrameListener(new C63967P8p(c84098WzW, currentTimeMillis, c84098WzW));
        return this.LIZIZ.LJIIJJI(c84098WzW);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        if (r1 == r6.ordinal()) goto L9;
     */
    @Override // X.AbstractC84025WyL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getPreviewFrameWithOrigin(X.C84098WzW r9) {
        /*
            r8 = this;
            r5 = 0
            r8.LJJJJI = r5
            java.lang.String r0 = ""
            r8.LJJJJIZL = r0
            long r2 = java.lang.System.currentTimeMillis()
            X.Wzl r4 = X.EnumC84113Wzl.NO_MIRROR
            int r1 = r8.LJJLIIIJLLLLLLLZ
            int r0 = r4.ordinal()
            if (r1 != r0) goto L4a
        L15:
            r9.getClass()
            X.X0B r1 = new X.X0B
            r1.<init>()
            X.P8r r0 = X.EnumC63969P8r.NORMAL_GET_FRAME_MODE
            X.WzW r7 = r1.LIZ
            r7.LIZ = r0
            r7.LJFF = r5
            X.P8e r0 = X.EnumC63956P8e.NO_EFFECT
            r7.LJ = r0
            X.Uw7 r6 = X.EnumC78791Uw7.CENTER_CROP
            r7.LJI = r6
            com.ss.android.vesdk.VESize r0 = r9.LIZJ
            r7.LIZIZ = r0
            boolean r0 = r9.LIZLLL
            r7.LIZLLL = r0
            r7.LJIIIIZZ = r4
            X.P8q r1 = new X.P8q
            r1.<init>(r9, r2)
            com.ss.android.ttve.nativePort.TECallbackClient r0 = r8.LJIIJ
            r0.setGetFrameListener(r1)
            com.ss.android.ttve.nativePort.TERecorderInterface r0 = r8.LIZIZ
            int r0 = r0.LJIIJJI(r7)
            if (r0 == 0) goto L61
            return r0
        L4a:
            int r1 = r8.LJJLIIIJLLLLLLLZ
            X.Wzl r6 = X.EnumC84113Wzl.X_MIRROR
            int r0 = r6.ordinal()
            if (r1 != r0) goto L56
        L54:
            r4 = r6
            goto L15
        L56:
            int r1 = r8.LJJLIIIJLLLLLLLZ
            X.Wzl r6 = X.EnumC84113Wzl.Y_MIRROR
            int r0 = r6.ordinal()
            if (r1 != r0) goto L15
            goto L54
        L61:
            X.X0B r1 = new X.X0B
            r1.<init>()
            X.P8r r0 = r9.LIZ
            X.WzW r2 = r1.LIZ
            r2.LIZ = r0
            r1 = 1
            r2.LJFF = r1
            boolean r0 = r9.LIZLLL
            r2.LIZLLL = r0
            X.P8e r0 = X.EnumC63956P8e.FULL_EFFECT
            r2.LJ = r0
            r2.LJI = r6
            com.ss.android.vesdk.VESize r0 = r9.LIZIZ
            r2.LIZIZ = r0
            r2.LJIIIIZZ = r4
            r2.LJIIIZ = r5
            r2.LJIJJ = r1
            r0 = 0
            r2.LJIJ = r0
            com.ss.android.ttve.nativePort.TERecorderInterface r0 = r8.LIZIZ
            int r0 = r0.LJIIJJI(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84092WzQ.getPreviewFrameWithOrigin(X.WzW):int");
    }

    @Override // X.AbstractC84025WyL
    public final String getResourceMultiViewTag(String str) {
        String str2;
        X0G x0g = this.LIZ;
        x0g.getClass();
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 33);
        obtain.setString("Features", str);
        TEBundle obtain2 = TEBundle.obtain();
        if (x0g.LJLIL.callEffectInterfaceWithResult(obtain, obtain2) == 0) {
            str2 = obtain2.getString("Result");
        } else {
            str2 = "";
        }
        obtain2.recycle();
        return str2;
    }

    @Override // X.AbstractC84025WyL
    public final void handleEffectAudioPlay(boolean z) {
        this.LIZ.getClass();
        P4Q.LIZ("VEEffect", "Not supported yet.");
    }

    @Override // X.AbstractC84025WyL
    public final void initDuet(VEDuetSettings vEDuetSettings) {
        this.mVEDuetSettings = vEDuetSettings;
        if (this.LJ.LJFF == 0) {
            this.mVERecordMode = VERecordMode.DUET;
        }
        this.LIZIZ.LJJIII("FocusSingleAudioTrack", true);
        synchronized (this.LJJIJLIJ) {
            X02 x02 = this.LJJIJL;
            if (x02 != null && !(x02 instanceof C84091WzP)) {
                x02.onDestroy();
                this.LJJIJL = null;
            }
            setCameraFirstFrameOptimize(false);
        }
    }

    @Override // X.AbstractC84025WyL
    public final void initFaceBeautifyDetectExtParam(C84074Wz8 c84074Wz8) {
        this.LIZ.getClass();
        TEBundle.obtain().setInt("effectInterfaceName", 44);
        throw null;
    }

    @Override // X.AbstractC84025WyL
    public final void initFaceBeautyDetectExtParam(C84075Wz9 c84075Wz9) {
        this.LIZ.getClass();
        P4Q.LIZ("VEEffect", "Not supported yet.");
    }

    @Override // X.AbstractC84025WyL
    public final void initFaceDetectExtParam(C84073Wz7 c84073Wz7) {
        X0G x0g = this.LIZ;
        x0g.getClass();
        c84073Wz7.setAlgorithmType(0);
        c84073Wz7.setForInit(true);
        x0g.LIZ(c84073Wz7, -1, -1, 0);
    }

    @Override // X.AbstractC84025WyL
    public final void initHDRNetDetectExtParam(C84076WzA c84076WzA) {
        this.LIZ.getClass();
        P4Q.LIZ("VEEffect", "Not supported yet.");
    }

    @Override // X.AbstractC84025WyL
    public final void initHandDetectExtParam(C84077WzB c84077WzB) {
        this.LIZ.getClass();
        P4Q.LIZ("VEEffect", "Not supported yet.");
    }

    @Override // X.AbstractC84025WyL
    public final void initReact(VEReactSettings vEReactSettings) {
        super.initReact(vEReactSettings);
        setCameraFirstFrameOptimize(false);
    }

    @Override // X.AbstractC84025WyL
    public final boolean isGestureRegistered(OOG oog) {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 38);
        LIZJ.setInt("effectEngineType", 0);
        LIZJ.setInt("ProcessTouchEventType", oog.ordinal());
        TEBundle obtain = TEBundle.obtain();
        x0g.LJLIL.callEffectInterfaceWithResult(LIZJ, obtain);
        boolean bool = obtain.getBool("isGestureRegisteredResult");
        obtain.recycle();
        return bool;
    }

    @Override // X.AbstractC84025WyL
    public final int loadDraft(C84086WzK c84086WzK) {
        throw null;
    }

    @Override // X.AbstractC84025WyL
    public final void pauseEffectAudio(boolean z) {
        X0G x0g = this.LIZ;
        x0g.getClass();
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 27);
        obtain.setBool("effectaudio", z);
        x0g.LJLIL.callEffectInterface(obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void pauseRenderAsync(InterfaceC84052Wym interfaceC84052Wym) {
        VEConfigCenter.getInstance().getValue("ve_titan_release_gpu_resource", false).booleanValue();
        this.LJJI = interfaceC84052Wym;
        int LJIJJ = this.LIZIZ.LJIJJ();
        if (LJIJJ != 0 && interfaceC84052Wym != null) {
            interfaceC84052Wym.LIZ(LJIJJ);
        }
    }

    @Override // X.AbstractC84025WyL
    public final void preventTextureRender(boolean z) {
        TECamera tECamera = this.LIZJ;
        if (tECamera != null) {
            tECamera.preventTextureRender(z);
        }
    }

    @Override // X.AbstractC84025WyL
    public final void recoverCherEffect(VECherEffectParam vECherEffectParam) {
        this.LIZ.getClass();
        P4Q.LIZ("VEEffect", "Not supported yet.");
    }

    @Override // X.AbstractC84025WyL
    public final void regEffectAlgorithmCallback(X0O x0o) {
        this.LIZ.LJ(x0o);
    }

    @Override // X.AbstractC84025WyL
    public final void regFaceInfoCallback(InterfaceC84042Wyc interfaceC84042Wyc) {
        VEBaseAlgorithmParam c84073Wz7;
        VEBaseAlgorithmParam vEBaseAlgorithmParam;
        VEBaseAlgorithmParam vEBaseAlgorithmParam2;
        super.regFaceInfoCallback(interfaceC84042Wyc);
        X0G x0g = this.LIZ;
        if (x0g.LJLJI == null) {
            x0g.LJLJI = new CopyOnWriteArrayList();
        }
        ((CopyOnWriteArrayList) x0g.LJLJI).add(interfaceC84042Wyc);
        x0g.LJLIL.setFaceInfoCallback(new X0A(x0g));
        if (((HashSet) x0g.LJLJJL).contains(0)) {
            return;
        }
        ((HashSet) x0g.LJLJJL).add(0);
        Pair pair = (Pair) ((HashMap) x0g.LJLJJLL).get(0);
        Pair pair2 = (Pair) ((HashMap) x0g.LJLJJLL).get(1);
        Pair pair3 = (Pair) ((HashMap) x0g.LJLJJLL).get(2);
        if (pair != null) {
            c84073Wz7 = (VEBaseAlgorithmParam) pair.first;
        } else {
            c84073Wz7 = new C84073Wz7(0, "FaceDetect");
        }
        if (pair2 != null) {
            vEBaseAlgorithmParam = (VEBaseAlgorithmParam) pair2.first;
        } else {
            vEBaseAlgorithmParam = new VEBaseAlgorithmParam(1, "ExpressBaseDetect", false);
        }
        if (pair3 != null) {
            vEBaseAlgorithmParam2 = (VEBaseAlgorithmParam) pair3.first;
        } else {
            vEBaseAlgorithmParam2 = new VEBaseAlgorithmParam(2, "GenderDetect", false);
        }
        if (pair == null) {
            x0g.LIZ(c84073Wz7, -1, -1, 0);
        } else if (c84073Wz7.getForInit()) {
            c84073Wz7.setForInit(false);
            x0g.updateTrackAlgorithmParam(((Integer) pair.second).intValue(), c84073Wz7);
        }
        if (pair2 == null) {
            x0g.LIZ(vEBaseAlgorithmParam, -1, -1, 1);
        }
        if (pair3 == null) {
            x0g.LIZ(vEBaseAlgorithmParam2, -1, -1, 2);
        }
        for (Integer num : (Integer[]) ((HashMap) x0g.LJLJJI).get(0)) {
            int[] iArr = x0g.LJLJLJ;
            int intValue = num.intValue();
            iArr[intValue] = iArr[intValue] + 1;
        }
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 10);
        obtain.setInt("FlagType", 0);
        obtain.setInt("flag", 1);
        x0g.LJLIL.callEffectInterface(obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void regSkeletonDetectCallback(X0K x0k) {
        super.regSkeletonDetectCallback(x0k);
        X0G x0g = this.LIZ;
        x0g.LJLIL.setSkeletonDetectCallback(x0k);
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 10);
        obtain.setInt("FlagType", 9);
        obtain.setInt("flag", 1);
        x0g.LJLIL.callEffectInterface(obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void regSmartBeautyCallback(X0T x0t) {
        super.regSmartBeautyCallback(null);
        X0G x0g = this.LIZ;
        x0g.LJLIL.setSmartBeautyCallback(null);
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 10);
        obtain.setInt("FlagType", 3);
        obtain.setInt("flag", 1);
        x0g.LJLIL.callEffectInterface(obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void releaseGPUResourcesAsync(InterfaceC84052Wym interfaceC84052Wym) {
        this.LJJII = interfaceC84052Wym;
        int LJJ = this.LIZIZ.LJJ(true);
        if (LJJ != 0) {
            interfaceC84052Wym.LIZ(LJJ);
        }
    }

    @Override // X.AbstractC84025WyL
    public final void removeCommonCallback(InterfaceC133905Ni interfaceC133905Ni) {
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("removeCommonCallback: ");
        if (interfaceC133905Ni != null) {
            i = interfaceC133905Ni.hashCode();
        } else {
            i = 0;
        }
        C01R.LIZJ(LIZ, i, LIZ, "TERecorder");
        synchronized (this.LJIILJJIL) {
            ((ArrayList) this.LJIILIIL).remove(interfaceC133905Ni);
        }
    }

    @Override // X.AbstractC84025WyL
    public final void removeFaceInfoCallback(InterfaceC84042Wyc interfaceC84042Wyc) {
        super.removeFaceInfoCallback(interfaceC84042Wyc);
        X0G x0g = this.LIZ;
        List<InterfaceC84042Wyc> list = x0g.LJLJI;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next.equals(interfaceC84042Wyc)) {
                    ((CopyOnWriteArrayList) x0g.LJLJI).remove(next);
                }
            }
            if (((CopyOnWriteArrayList) x0g.LJLJI).isEmpty()) {
                x0g.LJFF();
            }
        }
    }

    @Override // X.AbstractC84025WyL
    public final void removeLandMarkDetectListener(X0W x0w) {
        X0G x0g = this.LIZ;
        List<X0W> list = x0g.LJLJLLL;
        if (list == null) {
            return;
        }
        ((CopyOnWriteArrayList) list).remove(x0w);
        if (!((CopyOnWriteArrayList) x0g.LJLJLLL).isEmpty()) {
            return;
        }
        if (C84094WzS.LIZIZ()) {
            TEBundle obtain = TEBundle.obtain();
            obtain.setInt("effectInterfaceName", 10);
            obtain.setInt("FlagType", 6);
            obtain.setInt("flag", 0);
            x0g.LJLIL.callEffectInterface(obtain);
        }
        x0g.LJLIL.setLandMarkDetectCallback(null);
    }

    @Override // X.AbstractC84025WyL
    public final void renderFrame(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        if (decodeFile == null) {
            C63922P6w.LIZIZ("TERecorder", "error picture");
        } else {
            renderFrame(decodeFile, options.outWidth, options.outHeight, false, null);
        }
    }

    @Override // X.AbstractC84025WyL
    public final void resetEffectETData(int i) {
        X0G x0g = this.LIZ;
        x0g.getClass();
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 57);
        obtain.setInt("etType", i);
        x0g.LJLIL.callEffectInterface(obtain);
    }

    @Override // X.AbstractC84025WyL
    public final float rotateReactionWindow(float f) {
        P4Q.LJFF("TERecorder", "rotateReactionWindow");
        return 0.0f;
    }

    @Override // X.AbstractC84025WyL
    public final void runTask(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // X.AbstractC84025WyL
    public final int[] scaleReactionWindow(float f) {
        P4Q.LJFF("TERecorder", "scaleReactionWindow");
        VESize videoRes = this.mVideoEncodeSettings.getVideoRes();
        return new int[]{0, 0, videoRes.width, videoRes.height, 0, 0};
    }

    @Override // X.AbstractC84025WyL
    public final void setAudioCaptureListener(P4F p4f) {
        P4F p4f2;
        if (VERuntime.getInstance().isEnableAudioCapture()) {
            if (p4f == null && (p4f2 = this.LJJLL) != null) {
                this.mVEAudioCapture.removeCaptureListener(p4f2);
            } else if (this.LJJLL == null && p4f != null) {
                this.mVEAudioCapture.addCaptureListener(p4f);
            }
            this.LJJLL = p4f;
            return;
        }
        this.LJIIJ.setAudioCaptureListener(new C63879P5f(p4f));
    }

    @Override // X.AbstractC84025WyL
    public final void setBgmMute(boolean z) {
        X0G x0g = this.LIZ;
        x0g.getClass();
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 41);
        obtain.setBool("setBgmMute", z);
        x0g.LJLIL.callEffectInterface(obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void setCameraFirstFrameOptimize(boolean z) {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 23);
        LIZJ.setInt("effectEngineType", 0);
        LIZJ.setBool("camera_first_frame_opt", z);
        x0g.LJLIL.callEffectInterface(LIZJ);
    }

    @Override // X.AbstractC84025WyL
    public final void setCameraStateListener(InterfaceC84139X0l interfaceC84139X0l) {
        super.setCameraStateListener(interfaceC84139X0l);
        InterfaceC84100WzY interfaceC84100WzY = this.LJI;
        if (interfaceC84100WzY != null) {
            interfaceC84100WzY.LJIILL(interfaceC84139X0l);
        }
    }

    @Override // X.AbstractC84025WyL
    public final void setCameraZoomListener(X0Z x0z) {
        super.setCameraZoomListener(x0z);
        InterfaceC84100WzY interfaceC84100WzY = this.LJI;
        if (interfaceC84100WzY != null) {
            interfaceC84100WzY.LIZLLL(x0z);
        }
    }

    @Override // X.AbstractC84025WyL
    public final void setCaptureMirror(int i) {
        this.LJJLIIIJLLLLLLLZ = i;
    }

    @Override // X.AbstractC84025WyL
    public final void setClientState(int i) {
        this.LIZIZ.LJJIJIIJIL("ClientState", i);
    }

    @Override // X.AbstractC84025WyL
    public final void setCommonCallback(InterfaceC133905Ni interfaceC133905Ni) {
        P4Q.LJFF("TERecorder", "setCommonCallback...");
        synchronized (this.LJIILJJIL) {
            this.LJIIL = interfaceC133905Ni;
        }
    }

    @Override // X.AbstractC84025WyL
    public final int setComposerResourcePath(String str) {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 13);
        LIZJ.setInt("effectEngineType", 0);
        LIZJ.setString("Path", str);
        return x0g.LJLIL.callEffectInterface(LIZJ);
    }

    @Override // X.AbstractC84025WyL
    public final void setDLEEnable(boolean z) {
        this.LIZ.getClass();
        P4Q.LIZ("VEEffect", "Not supported yet.");
    }

    @Override // X.AbstractC84025WyL
    public final void setDetectInterval(int i) {
        X0G x0g = this.LIZ;
        Pair pair = (Pair) ((HashMap) x0g.LJLJJLL).get(0);
        if (pair == null) {
            return;
        }
        int intValue = ((Integer) pair.second).intValue();
        C84073Wz7 c84073Wz7 = (C84073Wz7) pair.first;
        c84073Wz7.setForInit(false);
        c84073Wz7.LIZ = i;
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 9);
        obtain.setInt("AlgorithmIndex", intValue);
        TEBundle LJ = C84093WzR.LJ(c84073Wz7);
        if (LJ != null) {
            obtain.setHandle("AlgorithmParam", LJ.getHandle());
        }
        x0g.LJLIL.callEffectInterface(obtain);
        if (LJ == null) {
            return;
        }
        LJ.recycle();
    }

    @Override // X.AbstractC84025WyL
    public final void setDeviceRotation(float[] fArr) {
        setDeviceRotation(fArr, -1.0d);
    }

    @Override // X.AbstractC84025WyL
    public final void setDisplayBlendFrameParam(C84085WzJ c84085WzJ) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setBool("enableDisplayBlendFrame", false);
        this.LIZIZ.LJJIIJ("setDisplayBlendFrameParam", obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void setDisplayParamsListener(InterfaceC84087WzL interfaceC84087WzL) {
        this.LJIIJ.setDisplayParamsListener(null);
    }

    @Override // X.AbstractC84025WyL
    public final int setDisplaySettings(VEDisplaySettings vEDisplaySettings) {
        if (C65429Pm5.LJFF("ve_enable_record_canvas_size_opt", false)) {
            VESize canvasSize = vEDisplaySettings.getCanvasSize();
            VESize renderSize = vEDisplaySettings.getRenderSize();
            if (canvasSize != null && renderSize != null && canvasSize.isValid() && renderSize.isValid()) {
                VESize vESize = new VESize(canvasSize.width, canvasSize.height);
                VESize vESize2 = new VESize(renderSize.width, renderSize.height);
                int i = canvasSize.width * canvasSize.height;
                if (i > 2073600) {
                    double sqrt = Math.sqrt(2073600 / i);
                    int round = (int) Math.round(canvasSize.width * sqrt);
                    int round2 = (int) Math.round(canvasSize.height * sqrt);
                    P4Q.LJFF("TERecorder", C16880lQ.LLLZ("canvas size is bigger than 1080P, executing downscale, origin size: %d x %d, new size: %d x %d", new Object[]{Integer.valueOf(canvasSize.width), Integer.valueOf(canvasSize.height), Integer.valueOf(round), Integer.valueOf(round2)}));
                    vESize.width = round;
                    vESize.height = round2;
                }
                int i2 = vESize.width;
                int i3 = vESize2.width;
                if (i2 < i3 || vESize.height < vESize2.height) {
                    double min = Math.min(i2 / i3, vESize.height / vESize2.height);
                    vESize2.width = (int) (vESize2.width * min);
                    vESize2.height = (int) (vESize2.height * min);
                }
                VEDisplaySettings.Builder builder = new VEDisplaySettings.Builder(vEDisplaySettings);
                builder.setCanvasSize(vESize);
                builder.setRenderSize(vESize2);
                builder.build();
            }
        }
        if (VEDisplaySettings.VEDisPlayEffect.GAUSSIAN_BLUR == vEDisplaySettings.getDisplayEffect()) {
            VEBlurFilterParam vEBlurFilterParam = new VEBlurFilterParam();
            vEBlurFilterParam.intensity = vEDisplaySettings.getEffectIntensity();
            synchronized (this.LJJIJIIJIL) {
                int i4 = this.LJJIIZI;
                if (i4 < 0) {
                    this.LJJIIZI = this.LIZ.addTrackFilter(0, 0, vEBlurFilterParam, -1, -1);
                } else {
                    this.LIZ.updateTrackFilterParam(i4, vEBlurFilterParam);
                }
            }
        } else if (VEDisplaySettings.VEDisPlayEffect.NONE == vEDisplaySettings.getDisplayEffect()) {
            synchronized (this.LJJIJIIJIL) {
                int i5 = this.LJJIIZI;
                if (i5 >= 0) {
                    this.LIZ.removeTrackFilter(i5);
                    this.LJJIIZI = -1;
                }
            }
        }
        if (vEDisplaySettings.getLayoutSize() != null && vEDisplaySettings.getCamOutSize() != null && vEDisplaySettings.getLayoutSize().isValid() && vEDisplaySettings.getCamOutSize().isValid()) {
            VEMIMOFilterParam vEMIMOFilterParam = new VEMIMOFilterParam();
            vEMIMOFilterParam.layoutWidth = vEDisplaySettings.getLayoutSize().width;
            vEMIMOFilterParam.layoutHeight = vEDisplaySettings.getLayoutSize().height;
            vEMIMOFilterParam.camOutWidth = vEDisplaySettings.getCamOutSize().width;
            vEMIMOFilterParam.camOutHeight = vEDisplaySettings.getCamOutSize().height;
            int i6 = this.LJJIJIIJI;
            if (i6 < 0) {
                this.LJJIJIIJI = this.LIZ.addTrackFilter(0, 0, vEMIMOFilterParam, -1, -1);
            } else {
                this.LIZ.updateTrackFilterParam(i6, vEMIMOFilterParam);
            }
        } else {
            int i7 = this.LJJIJIIJI;
            if (i7 > -1) {
                this.LIZ.removeTrackFilter(i7);
                this.LJJIJIIJI = -1;
            }
        }
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("TranslateX", vEDisplaySettings.getTranslateX());
        obtain.setInt("TranslateY", vEDisplaySettings.getTranslateY());
        obtain.setBool("FlipX", vEDisplaySettings.getFlipX());
        obtain.setBool("FlipY", vEDisplaySettings.getFlipY());
        obtain.setInt("FitMode", vEDisplaySettings.getFitMode().ordinal());
        obtain.setInt("Rotation", vEDisplaySettings.getRotation());
        obtain.setInt("CameraEffectRotation", vEDisplaySettings.getEffectRotation());
        this.LIZ.LJLL = vEDisplaySettings.getEffectRotation();
        obtain.setInt("DisplayRotation", vEDisplaySettings.getDisplayRotation());
        obtain.setBool("AdaptSurfaceSize", vEDisplaySettings.isForceAdaptSurfaceSize());
        VEDisplaySettings.Builder builder2 = new VEDisplaySettings.Builder(vEDisplaySettings);
        obtain.setFloat("DisplayRatio", vEDisplaySettings.getDisplayRatio());
        if (vEDisplaySettings.getRenderSize() != null) {
            obtain.setInt("RenderWidth", vEDisplaySettings.getRenderSize().width);
            obtain.setInt("RenderHeight", vEDisplaySettings.getRenderSize().height);
        } else {
            obtain.setInt("RenderWidth", this.LJJJJJL.getRenderSize().width);
            obtain.setInt("RenderHeight", this.LJJJJJL.getRenderSize().height);
            builder2.setRenderSize(this.LJJJJJL.getRenderSize());
        }
        this.LJJJJJL = builder2.build();
        if (vEDisplaySettings.getLayoutSize() != null) {
            obtain.setInt("LayoutWidth", vEDisplaySettings.getLayoutSize().width);
            obtain.setInt("LayoutHeight", vEDisplaySettings.getLayoutSize().height);
        }
        if (vEDisplaySettings.getCamOutSize() != null) {
            obtain.setInt("CamOutWidth", vEDisplaySettings.getCamOutSize().width);
            obtain.setInt("CamOutHeight", vEDisplaySettings.getCamOutSize().height);
        }
        if (vEDisplaySettings.getCanvasSize() != null && vEDisplaySettings.getCanvasSize().isValid()) {
            obtain.setInt("CanvasWidth", vEDisplaySettings.getCanvasSize().width);
            obtain.setInt("CanvasHeight", vEDisplaySettings.getCanvasSize().height);
        }
        this.LIZIZ.LJJIIJ("DisplaySettings", obtain);
        this.LJJJJJL = vEDisplaySettings;
        return this.LIZIZ.LJJIIJZLJL();
    }

    @Override // X.AbstractC84025WyL
    public final void setDuetVideoCompleteCallback(Runnable runnable) {
        synchronized (this.LJJIJLIJ) {
            X02 x02 = this.LJJIJL;
            if (x02 != null && (x02 instanceof C84091WzP)) {
                ((C84091WzP) x02).LJIIJJI(runnable);
            }
        }
    }

    @Override // X.AbstractC84025WyL
    public final void setEffectBgmEnable(boolean z) {
        X0G x0g = this.LIZ;
        x0g.getClass();
        String str = C84094WzS.LJLLI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setEffectBgmEnable... enable: ");
        LIZ.append(z);
        P4Q.LJFF(str, X1D.LIZIZ(LIZ));
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 28);
        obtain.setBool("enable", z);
        x0g.LJLIL.callEffectInterface(obtain);
    }

    @Override // X.AbstractC84025WyL
    public final int setEffectMaxMemoryCache(int i) {
        this.LIZ.getClass();
        P4Q.LIZ("VEEffect", "Not supported yet.");
        return -200;
    }

    @Override // X.AbstractC84025WyL
    public final void setEffectMessageListener(MessageCenter.Listener listener) {
        this.LIZ.LJLILLLLZI = listener;
        P4Q.LIZ("VEEffect", "Not supported yet.");
    }

    @Override // X.AbstractC84025WyL
    public final void setEnableDuetV2(boolean z) {
        P4Q.LIZJ("TERecorder", "setEnableDuetV2 is not supported");
    }

    @Override // X.AbstractC84025WyL
    public final int setEnableEarBack(boolean z) {
        this.mEnableEarBack = z;
        return this.LIZIZ.LJJIII("EarBack", z);
    }

    @Override // X.AbstractC84025WyL
    public final void setExposureCompensation(int i) {
        InterfaceC84100WzY interfaceC84100WzY = this.LJI;
        if (interfaceC84100WzY == null) {
            return;
        }
        interfaceC84100WzY.setExposureCompensation(i);
    }

    @Override // X.AbstractC84025WyL
    public final int setFaceMakeUp(String str) {
        setFaceMakeUp(str, -1.0f, -1.0f);
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public final void setFocus(VEFocusSettings vEFocusSettings) {
        InterfaceC84100WzY interfaceC84100WzY = this.LJI;
        if (interfaceC84100WzY != null) {
            interfaceC84100WzY.LJIILIIL(vEFocusSettings);
        } else {
            P4Q.LJII("TERecorder", "no Camera capture to setFocus");
        }
    }

    @Override // X.AbstractC84025WyL
    public final void setFocusWithFaceDetect(VEFocusSettings vEFocusSettings) {
        this.LJLIL = true;
        this.LJLILLLLZI = 3;
        this.LJLJJI = vEFocusSettings;
        if (this.LJLJI == null) {
            C84030WyQ c84030WyQ = new C84030WyQ(this);
            this.LJLJI = c84030WyQ;
            regFaceInfoCallback(c84030WyQ);
        }
    }

    @Override // X.AbstractC84025WyL
    public final void setFollowShotDisplayDegree(int i) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("FollowShotDegree", i);
        this.LIZIZ.LJJIIJ("SetFollowShotDegree", obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void setForceAlgorithmEnableCount(int i) {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 23);
        LIZJ.setInt("effectEngineType", 0);
        LIZJ.setInt("ForceAlgorithmEnableCount", i);
        x0g.LJLIL.callEffectInterface(LIZJ);
    }

    @Override // X.AbstractC84025WyL
    public final void setForceAlgorithmExecuteCount(int i) {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 23);
        LIZJ.setInt("effectEngineType", 0);
        LIZJ.setInt("ForceAlgorithmExecuteCount", i);
        x0g.LJLIL.callEffectInterface(LIZJ);
    }

    @Override // X.AbstractC84025WyL
    public final void setFrameEffectCallback(InterfaceC84063Wyx interfaceC84063Wyx) {
        this.LJIIJ.setFrameEffectCallback(new X08());
    }

    @Override // X.AbstractC84025WyL
    public final void setHandDetectLowpowerEnable(boolean z) {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 23);
        LIZJ.setInt("effectEngineType", 0);
        LIZJ.setBool("HandDetectLowpowerEnable", z);
        x0g.LJLIL.callEffectInterface(LIZJ);
    }

    @Override // X.AbstractC84025WyL
    public final void setImageExposure(float f) {
        VEExposureFilterParam vEExposureFilterParam;
        int i;
        Pair pair = (Pair) ((HashMap) this.LJJIIJ).get(39);
        if (pair != null) {
            vEExposureFilterParam = (VEExposureFilterParam) pair.first;
            i = ((Integer) pair.second).intValue();
        } else {
            vEExposureFilterParam = new VEExposureFilterParam();
            i = -1;
        }
        vEExposureFilterParam.exposure = f;
        if (i >= 0) {
            this.LIZ.updateTrackFilterParam(i, vEExposureFilterParam);
        } else {
            i = this.LIZ.addTrackFilter(0, 0, vEExposureFilterParam, -1, -1);
        }
        if (pair == null) {
            pair = new Pair(vEExposureFilterParam, Integer.valueOf(i));
        }
        ((HashMap) this.LJJIIJ).put(39, pair);
    }

    @Override // X.AbstractC84025WyL
    public final void setLargeMattingModelEnable(boolean z) {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 23);
        LIZJ.setInt("effectEngineType", 0);
        LIZJ.setBool("LargeMattingModelEnable", z);
        x0g.LJLIL.callEffectInterface(LIZJ);
    }

    @Override // X.AbstractC84025WyL
    public final int setMaleMakeupState(boolean z) {
        VEMakeUpFilterParam vEMakeUpFilterParam;
        int i;
        if (this.LJIIIIZZ.isEnablePassEffectWhenNoEffectFilter()) {
            return 0;
        }
        Pair pair = (Pair) ((HashMap) this.LJJIIJ).get(26);
        if (pair != null) {
            vEMakeUpFilterParam = (VEMakeUpFilterParam) pair.first;
            i = ((Integer) pair.second).intValue();
        } else {
            vEMakeUpFilterParam = new VEMakeUpFilterParam();
            i = -1;
        }
        vEMakeUpFilterParam.maleMakeupState = z;
        if (i >= 0) {
            this.LIZ.updateTrackFilterParam(i, vEMakeUpFilterParam);
        } else {
            i = this.LIZ.addTrackFilter(0, 0, vEMakeUpFilterParam, -1, -1);
        }
        if (pair == null) {
            pair = new Pair(vEMakeUpFilterParam, Integer.valueOf(i));
        }
        ((HashMap) this.LJJIIJ).put(26, pair);
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public final int setMultiCamMode(EnumC83975WxX enumC83975WxX) {
        this.mMulticamEffectMode = enumC83975WxX;
        return this.LIZIZ.LJJIJLIJ(enumC83975WxX, false);
    }

    @Override // X.AbstractC84025WyL
    public final int setMultiCamModeAsync(EnumC83975WxX enumC83975WxX) {
        this.mMulticamEffectMode = enumC83975WxX;
        return this.LIZIZ.LJJIJLIJ(enumC83975WxX, true);
    }

    @Override // X.AbstractC84025WyL
    public final void setMusicNodes(String str) {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 40);
        LIZJ.setInt("effectEngineType", 0);
        LIZJ.setString("Path", str);
        x0g.LJLIL.callEffectInterface(LIZJ);
    }

    @Override // X.AbstractC84025WyL
    public final void setOnErrorListener(InterfaceC133905Ni interfaceC133905Ni) {
        P4Q.LJFF("TERecorder", "setOnErrorListener...");
        this.LJIILL = interfaceC133905Ni;
    }

    @Override // X.AbstractC84025WyL
    public final void setOnFrameAvailableListenerExt(VERecorder.OnFrameAvailableListenerExt onFrameAvailableListenerExt) {
        super.setOnFrameAvailableListenerExt(onFrameAvailableListenerExt);
        TEBundle obtain = TEBundle.obtain();
        if (onFrameAvailableListenerExt != null) {
            C63913P6n config = onFrameAvailableListenerExt.config();
            if (config != null) {
                C63911P6l c63911P6l = new C63911P6l(this, onFrameAvailableListenerExt);
                P6Z p6z = config.LIZ;
                if (p6z == P6Z.TEPixFmt_YUV420P) {
                    this.LJIIJ.setBufferedFrameListener(c63911P6l);
                    obtain.setBool("NeedYUV420", true);
                } else if (p6z == P6Z.TEPixFmt_OpenGL_RGBA8) {
                    this.LJIIJ.setTextureFrameListener(c63911P6l);
                    obtain.setBool("NeedTextureRGBA8", true);
                } else {
                    obtain.setBool("EnableFrameScreenInfo", true);
                }
                EnumC46488IMi enumC46488IMi = config.LIZIZ;
                if (enumC46488IMi == EnumC46488IMi.REQUEST_FRAME_STAGE_SOURCE) {
                    obtain.setString("OnFrameSrcPos", "TERecordSourceBin");
                } else if (enumC46488IMi == EnumC46488IMi.REQUEST_FRAME_STAGE_RENDERED) {
                    obtain.setString("OnFrameSrcPos", "TERecorderRenderBin");
                } else {
                    obtain.setString("OnFrameSrcPos", "");
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setOnFrameAvailableListenerExt request format ");
                LIZ.append(config.LIZ);
                LIZ.append(", stage ");
                LIZ.append(config.LIZIZ);
                LIZ.append(", wxh ");
                LIZ.append(0);
                LIZ.append("x");
                C01R.LIZJ(LIZ, 0, LIZ, "TERecorder");
            }
        } else {
            P4Q.LJFF("TERecorder", "setOnFrameAvailableListenerExt null");
            this.LJIIJ.setBufferedFrameListener(null);
            this.LJIIJ.setTextureFrameListener(null);
            obtain.setInt("requestWidth", 0);
            obtain.setInt("requestHeight", 0);
            obtain.setBool("NeedYUV420", false);
            obtain.setBool("NeedTextureRGBA8", false);
            obtain.setBool("EnableFrameScreenInfo", false);
            obtain.setString("OnFrameSrcPos", "");
        }
        this.LIZIZ.LJJIIJ("OnFrameAvailable", obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void setOnInfoListener(InterfaceC133905Ni interfaceC133905Ni) {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setOnInfoListener=");
        LIZ.append(interfaceC133905Ni);
        P4Q.LJFF("TERecorder", X1D.LIZIZ(LIZ));
        this.LJIILLIIL = interfaceC133905Ni;
        if (interfaceC133905Ni != null) {
            z = true;
        } else {
            z = false;
        }
        enableTimestampCallback(z);
    }

    @Override // X.AbstractC84025WyL
    public final void setPaddingBottomInRatio34(float f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setPaddingBottomInRatio34 from ");
        LIZ.append(this.mViewportPaddingBottomInRadio34);
        LIZ.append(" to ");
        LIZ.append(f);
        P4Q.LJFF("TERecorder", X1D.LIZIZ(LIZ));
        super.setPaddingBottomInRatio34(f);
        if (this.LJJLIIIJILLIZJL == EnumC63976P8y.RADIO_1_1.ordinal() || this.LJJLIIIJILLIZJL == EnumC63976P8y.RADIO_ROUND.ordinal()) {
            int i = (int) ((this.mViewportPaddingBottomInRadio34 - this.LJJLIIIJJIZ) * ((this.LJJLIIIJJI.width * 4.0f) / 3.0f));
            VEDisplaySettings.Builder builder = new VEDisplaySettings.Builder();
            builder.setRenderSize(this.LJJLIIIJLJLI);
            builder.setTranslateY(i);
            builder.setFitMode(EnumC84107Wzf.SCALE_MODE_CENTER_INSIDE);
            VEDisplaySettings build = builder.build();
            if (this.LJJLIIIIJ) {
                setDisplaySettings(build);
            } else {
                this.LJJJJJL = build;
            }
        }
    }

    @Override // X.AbstractC84025WyL
    public final void setRecordMaxDuration(long j) {
        this.LIZIZ.LJJIJIL("RecordMaxDuration", j);
    }

    @Override // X.AbstractC84025WyL
    public final void setRecordMode(int i) {
        this.LIZIZ.LJJIJIIJIL("RecordMode", i);
    }

    @Override // X.AbstractC84025WyL
    public final int setRecordPrepareTime(long j) {
        return this.LIZIZ.LJJIJIL("RecordPrepareTime", j);
    }

    @Override // X.AbstractC84025WyL
    public final int setReshapeIntensityDict(java.util.Map<Integer, Float> map) {
        Pair pair = (Pair) ((HashMap) this.LJJIIJ).get(13);
        if (pair == null) {
            return -105;
        }
        VEReshapeFilterParam vEReshapeFilterParam = (VEReshapeFilterParam) pair.first;
        int intValue = ((Integer) pair.second).intValue();
        if (intValue < 0) {
            return -105;
        }
        for (Map.Entry<Integer, Float> entry : map.entrySet()) {
            if (entry.getKey().intValue() == 4) {
                vEReshapeFilterParam.eyeIntensity = entry.getValue().floatValue();
            } else if (entry.getKey().intValue() == 5) {
                vEReshapeFilterParam.cheekIntensity = entry.getValue().floatValue();
            }
        }
        return this.LIZ.updateTrackFilterParam(intValue, vEReshapeFilterParam);
    }

    @Override // X.AbstractC84025WyL
    public final int setReshapeResource(String str) {
        VEReshapeFilterParam vEReshapeFilterParam;
        int i;
        Pair pair = (Pair) ((HashMap) this.LJJIIJ).get(13);
        if (pair != null) {
            vEReshapeFilterParam = (VEReshapeFilterParam) pair.first;
            i = ((Integer) pair.second).intValue();
        } else {
            vEReshapeFilterParam = new VEReshapeFilterParam();
            i = -1;
        }
        if (str == null) {
            str = "";
        }
        vEReshapeFilterParam.resPath = str;
        if (i >= 0) {
            this.LIZ.updateTrackFilterParam(i, vEReshapeFilterParam);
        } else {
            i = this.LIZ.addTrackFilter(0, 0, vEReshapeFilterParam, -1, -1);
        }
        if (pair == null) {
            pair = new Pair(vEReshapeFilterParam, Integer.valueOf(i));
        }
        ((HashMap) this.LJJIIJ).put(13, pair);
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public final void setSATZoomListener(InterfaceC83712WtI interfaceC83712WtI) {
        super.setSATZoomListener(interfaceC83712WtI);
        InterfaceC84100WzY interfaceC84100WzY = this.LJI;
        if (interfaceC84100WzY != null) {
            interfaceC84100WzY.setSATZoomListener(interfaceC83712WtI);
        }
    }

    @Override // X.AbstractC84025WyL
    public final void setShaderZoomListener(X0S x0s) {
        super.setShaderZoomListener(null);
        InterfaceC84100WzY interfaceC84100WzY = this.LJI;
        if (interfaceC84100WzY != null) {
            interfaceC84100WzY.LJIIL();
        }
    }

    @Override // X.AbstractC84025WyL
    public final boolean setSharedTextureStatus(boolean z) {
        this.LIZ.getClass();
        P4Q.LIZ("VEEffect", "Not supported yet.");
        return false;
    }

    @Override // X.AbstractC84025WyL
    public final int setSkinTone(String str) {
        VEBeautyFilterParam vEBeautyFilterParam;
        int i;
        Pair pair = (Pair) ((HashMap) this.LJJIIJ).get(12);
        if (pair != null) {
            vEBeautyFilterParam = (VEBeautyFilterParam) pair.first;
            i = ((Integer) pair.second).intValue();
        } else {
            vEBeautyFilterParam = new VEBeautyFilterParam();
            i = -1;
        }
        vEBeautyFilterParam.skinTonePath = str;
        if (i >= 0) {
            this.LIZ.updateTrackFilterParam(i, vEBeautyFilterParam);
        } else {
            i = this.LIZ.addTrackFilter(0, 0, vEBeautyFilterParam, -1, -1);
        }
        if (pair == null) {
            pair = new Pair(vEBeautyFilterParam, Integer.valueOf(i));
        }
        ((HashMap) this.LJJIIJ).put(12, pair);
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public final int setSkinToneIntensity(float f) {
        Pair pair = (Pair) ((HashMap) this.LJJIIJ).get(12);
        if (pair == null) {
            P4Q.LIZJ("TERecorder", "Set skin tone resource first pls.");
            return -105;
        }
        VEBeautyFilterParam vEBeautyFilterParam = (VEBeautyFilterParam) pair.first;
        int intValue = ((Integer) pair.second).intValue();
        vEBeautyFilterParam.skinToneIntensity = f;
        this.LIZ.updateTrackFilterParam(intValue, vEBeautyFilterParam);
        ((HashMap) this.LJJIIJ).put(12, pair);
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public final void setSpeed(float f) {
        this.LIZIZ.LJJIJ("Speed", f);
    }

    @Override // X.AbstractC84025WyL
    public final void setStickerRequestCallback(IStickerRequestCallback iStickerRequestCallback) {
        int i;
        X0G x0g = this.LIZ;
        x0g.LJLIL.setStickerRequestCallback(iStickerRequestCallback);
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 10);
        obtain.setInt("FlagType", 7);
        if (C84094WzS.LIZIZ() && iStickerRequestCallback == null) {
            i = 0;
        } else {
            i = 1;
        }
        obtain.setInt("flag", i);
        x0g.LJLIL.callEffectInterface(obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void setSwapReactionRegion(boolean z) {
        P4Q.LJFF("TERecorder", "setSwapReactionRegion");
    }

    @Override // X.AbstractC84025WyL
    public final int setVEEffectParams(VEEffectParams vEEffectParams) {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 12);
        LIZJ.setInt("effectEngineType", 0);
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effect type", vEEffectParams.TYPE);
        obtain.setInt("int value one", vEEffectParams.intValueOne);
        obtain.setInt("int value two", vEEffectParams.intValueTwo);
        obtain.setInt("int value three", vEEffectParams.intValueThree);
        obtain.setFloat("float value one", vEEffectParams.floatValueOne);
        obtain.setFloat("float value two", vEEffectParams.floatValueTwo);
        obtain.setFloat("float value three", vEEffectParams.floatValueThree);
        obtain.setBool("bool value one", vEEffectParams.boolValueOne);
        obtain.setBool("bool value two", vEEffectParams.boolValueTwo);
        obtain.setBool("bool value three", vEEffectParams.boolValueThree);
        obtain.setString("string value one", vEEffectParams.stringValueOne);
        obtain.setString("string value two", vEEffectParams.stringValueTwo);
        obtain.setString("string value three", vEEffectParams.stringValueThree);
        ArrayList<Integer> arrayList = vEEffectParams.intArrayValue;
        if (arrayList != null && !arrayList.isEmpty()) {
            int[] iArr = new int[vEEffectParams.intArrayValue.size()];
            for (int i = 0; i < vEEffectParams.intArrayValue.size(); i++) {
                iArr[i] = ((Integer) ListProtector.get(vEEffectParams.intArrayValue, i)).intValue();
            }
            obtain.setIntArray("int array one", iArr);
        }
        ArrayList<Float> arrayList2 = vEEffectParams.floatArrayValue;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            float[] fArr = new float[vEEffectParams.floatArrayValue.size()];
            for (int i2 = 0; i2 < vEEffectParams.floatArrayValue.size(); i2++) {
                fArr[i2] = ((Float) ListProtector.get(vEEffectParams.floatArrayValue, i2)).floatValue();
            }
            obtain.setFloatArray("float array one", fArr);
        }
        ArrayList<Boolean> arrayList3 = vEEffectParams.boolArrayValue;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int[] iArr2 = new int[vEEffectParams.boolArrayValue.size()];
            for (int i3 = 0; i3 < vEEffectParams.boolArrayValue.size(); i3++) {
                iArr2[i3] = ((Boolean) ListProtector.get(vEEffectParams.boolArrayValue, i3)).booleanValue() ? 1 : 0;
            }
            obtain.setIntArray("bool array one", iArr2);
        }
        obtain.setStringArray("string array one", (String[]) vEEffectParams.stringArrayOne.toArray(new String[0]));
        obtain.setStringArray("string array two", (String[]) vEEffectParams.stringArrayTwo.toArray(new String[0]));
        obtain.setStringArray("string array three", (String[]) vEEffectParams.stringArrayThree.toArray(new String[0]));
        LIZJ.setHandle("ComposerParams", obtain.getHandle());
        int callEffectInterface = x0g.LJLIL.callEffectInterface(LIZJ);
        obtain.recycle();
        return callEffectInterface;
    }

    @Override // X.AbstractC84025WyL
    public final void setVideoBgSpeed(double d) {
        synchronized (this.LJJIJLIJ) {
            X02 x02 = this.LJJIJL;
            if (x02 != null && (x02 instanceof C84089WzN)) {
                ((C84089WzN) x02).LJIIZILJ((float) d);
            }
        }
    }

    @Override // X.AbstractC84025WyL
    public final void setVolume(VEVolumeParam vEVolumeParam) {
        super.setVolume(vEVolumeParam);
        if (vEVolumeParam.trackIndex >= 0) {
            TEBundle obtain = TEBundle.obtain();
            obtain.setFloat("Volume", vEVolumeParam.bgmPlayVolume);
            obtain.setInt("TrackIndex", vEVolumeParam.trackIndex);
            this.LIZIZ.LJJIIJ("setVolume", obtain);
            return;
        }
        this.LIZIZ.LJJIJ("setVolume", vEVolumeParam.bgmPlayVolume);
    }

    @Override // X.AbstractC84025WyL
    public final void setWaterMark(VEWatermarkParam vEWatermarkParam) {
        super.setWaterMark(vEWatermarkParam);
        this.LIZIZ.LJJJIL(vEWatermarkParam);
    }

    @Override // X.AbstractC84025WyL
    public final int shotScreen(C63965P8n c63965P8n) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("shotScreen settings = ");
        LIZ.append(c63965P8n);
        P4Q.LJFF("TERecorder", X1D.LIZIZ(LIZ));
        this.LJJJJI = c63965P8n.LJ;
        this.LJJJJIZL = c63965P8n.LJFF;
        boolean z = false;
        if (VEConfigCenter.getInstance().getValue("ve_titan_shot_screen_opt", 0) != 0) {
            z = true;
        }
        this.LJJJJJ = z;
        VESize vESize = c63965P8n.LIZ;
        if (vESize == null) {
            P4Q.LJII("TERecorder", "size is null, can not shotscreen");
            return -100;
        }
        InterfaceC63955P8d interfaceC63955P8d = c63965P8n.LJII;
        if (interfaceC63955P8d != null) {
            VERecorder.IVEFrameShotScreenCallback iVEFrameShotScreenCallback = c63965P8n.LJIIIIZZ;
            if (iVEFrameShotScreenCallback != null) {
                return shotScreen(vESize.width, vESize.height, c63965P8n.LIZIZ, interfaceC63955P8d, false, iVEFrameShotScreenCallback, false);
            }
            return shotScreen(vESize.width, vESize.height, false, c63965P8n.LIZIZ, interfaceC63955P8d);
        }
        InterfaceC63961P8j interfaceC63961P8j = c63965P8n.LJI;
        if (interfaceC63961P8j != null) {
            return shotScreen(c63965P8n.LIZJ, vESize.width, vESize.height, false, c63965P8n.LIZIZ, c63965P8n.LIZLLL, interfaceC63961P8j);
        }
        VERecorder.IVEFrameShotScreenCallback iVEFrameShotScreenCallback2 = c63965P8n.LJIIIIZZ;
        if (iVEFrameShotScreenCallback2 != null) {
            return shotScreen(vESize.width, vESize.height, c63965P8n.LIZIZ, false, iVEFrameShotScreenCallback2, false);
        }
        P4Q.LJII("TERecorder", "All screenshot callback are null");
        return -1;
    }

    @Override // X.AbstractC84025WyL
    public final int slamGetTextBitmap(X09 x09) {
        int i;
        X0G x0g = this.LIZ;
        x0g.LJLIL.setARTextBitmapCallback(x09);
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 10);
        obtain.setInt("FlagType", 4);
        if (C84094WzS.LIZIZ() && x09 == null) {
            i = 0;
        } else {
            i = 1;
        }
        obtain.setInt("flag", i);
        x0g.LJLIL.callEffectInterface(obtain);
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public final int slamGetTextLimitCount(X0H x0h) {
        this.LIZ.getClass();
        TEBundle.obtain().setInt("effectInterfaceName", 103);
        return -200;
    }

    @Override // X.AbstractC84025WyL
    public final int slamGetTextParagraphContent(X0H x0h) {
        int i;
        X0G x0g = this.LIZ;
        x0g.LJLIL.setARTextParagraphContentCallback(x0h);
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 10);
        obtain.setInt("FlagType", 5);
        if (C84094WzS.LIZIZ() && x0h == null) {
            i = 0;
        } else {
            i = 1;
        }
        obtain.setInt("flag", i);
        x0g.LJLIL.callEffectInterface(obtain);
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public final int slamNotifyHideKeyBoard(boolean z) {
        X0G x0g = this.LIZ;
        x0g.getClass();
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 101);
        obtain.setBool("isFinished", z);
        return x0g.LJLIL.callEffectInterface(obtain);
    }

    @Override // X.AbstractC84025WyL
    public final int slamSetLanguage(String str) {
        X0G x0g = this.LIZ;
        x0g.getClass();
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 102);
        obtain.setString("Language", str);
        return x0g.LJLIL.callEffectInterface(obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void startAudioRecorder(Cert cert) {
        P4Q.LJFF("TERecorder", "start audio Record");
        this.LJLIIIL = cert;
        enableAudio(true);
        LJIILL();
        this.LJ.LJIILIIL = true;
        this.LIZIZ.LJJIII("AudioCapturingForSomeScenes", true);
    }

    @Override // X.AbstractC84025WyL
    public final void startCameraPreview(P6Q p6q) {
        startCameraPreview(p6q, true);
    }

    @Override // X.AbstractC84025WyL
    public final int startPrePlay(VEPrePlayParams vEPrePlayParams) {
        X02 x02 = this.LJJIJL;
        if (x02 != null && (x02 instanceof C84089WzN) && C65429Pm5.LJFF("ve_enable_titan_video_decode_opt", false)) {
            int[] iArr = new int[12];
            if (TEVideoUtils.nativeGetFileInfo(((C84089WzN) this.LJJIJL).LIZJ, iArr) != null) {
                vEPrePlayParams.duration = iArr[3];
            }
        }
        this.LJJLJLI = false;
        this.LIZIZ.LJJIIJ("PrePlayParams", C84093WzR.LJI(vEPrePlayParams));
        return this.LIZIZ.LJJJJI();
    }

    @Override // X.AbstractC84025WyL
    public final void startPreview(Surface surface) {
        TECamera tECamera = this.LIZJ;
        if (tECamera != null) {
            tECamera.setEnableCameraNotify(true);
        }
        LJIILJJIL(surface);
        int LJJJJIZL = this.LIZIZ.LJJJJIZL(surface);
        C63868P4u.LJ(0, LJJJJIZL, "te_record_start_preview_ret");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resultCode", LJJJJIZL);
            c.LIZ("vesdk_event_recorder_start_preview_async", "business", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        LJIIJJI(1020, 0, "You can replace the Res Manager here.");
        synchronized (this.LJJIJLIJ) {
            VEVideoEncodeSettings vEVideoEncodeSettings = this.mVideoEncodeSettings;
            if (vEVideoEncodeSettings != null && this.LJJIJL == null) {
                VERecordMode vERecordMode = this.mVERecordMode;
                if (vERecordMode == VERecordMode.DUET) {
                    C84097WzV c84097WzV = new C84097WzV(this, this.mVEDuetSettings, vEVideoEncodeSettings.getVideoRes());
                    this.LJJIJL = c84097WzV;
                    c84097WzV.onCreate();
                    this.LJJIZ = EnumC84106Wze.CAM_WITH_VIDEO_TYPE_DUET;
                } else if (vERecordMode == VERecordMode.REACTION) {
                    C84096WzU c84096WzU = new C84096WzU(this, this.mVEReactSettings, this.mVideoEncodeSettings.getVideoRes());
                    this.LJJIJL = c84096WzU;
                    c84096WzU.onCreate();
                    this.LJJIZ = EnumC84106Wze.CAM_WITH_VIDEO_TYPE_REACTION;
                }
            }
        }
    }

    @Override // X.AbstractC84025WyL
    public final int startRecord(float f) {
        return LJIILLIIL("", "", f, false);
    }

    @Override // X.AbstractC84025WyL
    public final void startRenderAsync(InterfaceC84052Wym interfaceC84052Wym) {
        VEConfigCenter.getInstance().getValue("ve_titan_release_gpu_resource", false).booleanValue();
        this.LJJIFFI = interfaceC84052Wym;
        int LJJJJJL = this.LIZIZ.LJJJJJL();
        if (LJJJJJL != 0 && interfaceC84052Wym != null) {
            interfaceC84052Wym.LIZ(LJJJJJL);
        }
    }

    @Override // X.AbstractC84025WyL
    public final void startShaderZoom(float f) {
        this.LIZIZ.LJJIJ("setShaderZoom", f);
    }

    @Override // X.AbstractC84025WyL
    public final void startZoom(float f) {
        InterfaceC84100WzY interfaceC84100WzY = this.LJI;
        if (interfaceC84100WzY == null) {
            return;
        }
        interfaceC84100WzY.LIZIZ(f);
    }

    @Override // X.AbstractC84025WyL
    public final void stopAudioRecorder(Cert cert) {
        this.LJ.LJIILIIL = false;
        this.LIZIZ.LJJIII("AudioCapturingForSomeScenes", false);
        VEAudioCapture vEAudioCapture = this.mVEAudioCapture;
        if (vEAudioCapture != null) {
            vEAudioCapture.stop(cert);
        }
        this.LJLIIIL = null;
    }

    @Override // X.AbstractC84025WyL
    public final void stopFollowShowRender(boolean z) {
        this.LIZIZ.LJJJJL(z);
    }

    @Override // X.AbstractC84025WyL
    public final int stopPrePlay(InterfaceC84052Wym interfaceC84052Wym) {
        this.LJJLJLI = true;
        C84013Wy9 c84013Wy9 = new C84012Wy8().LIZ;
        c84013Wy9.LIZ = false;
        return stopPrePlay(interfaceC84052Wym, c84013Wy9);
    }

    @Override // X.AbstractC84025WyL
    public final int stopPreview(boolean z) {
        TECamera tECamera = this.LIZJ;
        int i = 0;
        if (tECamera != null) {
            tECamera.setEnableCameraNotify(false);
        }
        boolean z2 = true;
        if (3 == getRecordStatus() && this.LJIIIIZZ.checkStatusWhenStopPreview()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stopRecord on stopPreview isAsync=");
            LIZ.append(z);
            P4Q.LJII("TERecorder", X1D.LIZIZ(LIZ));
            int stopRecord = stopRecord();
            if (stopRecord != 0) {
                LJIIJJI(1022, stopRecord, "stopRecord in stopPreview!!");
                this.LJJJJ = false;
            } else {
                this.LJJJJ = true;
            }
        }
        VEAudioCapture vEAudioCapture = this.mVEAudioCapture;
        if (vEAudioCapture != null) {
            vEAudioCapture.release(this.LJLIIIL);
            this.LJ.LJIILIIL = false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        VEPreviewSettings vEPreviewSettings = this.LJIIIIZZ;
        if (vEPreviewSettings == null || !vEPreviewSettings.isBlockRenderExit()) {
            z2 = false;
        }
        if (z) {
            if (z2) {
                i = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            }
        } else {
            i = -1;
        }
        StringBuilder LIZLLL = C00F.LIZLLL("stopPreview start: isBlock=", z2, ", isAsync=", z, ", blockTimeOutInMS=");
        C01R.LIZJ(LIZLLL, i, LIZLLL, "TERecorder");
        int LJJJJZ = this.LIZIZ.LJJJJZ(i);
        synchronized (this.LJJIJLIJ) {
            X02 x02 = this.LJJIJL;
            if (x02 != null && (x02 instanceof C84089WzN)) {
                x02.onDestroy();
                this.LJJIJL = null;
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("stopPreview done. cost ");
        LIZ2.append(System.currentTimeMillis() - currentTimeMillis);
        P4Q.LJFF("TERecorder", X1D.LIZIZ(LIZ2));
        return LJJJJZ;
    }

    @Override // X.AbstractC84025WyL
    public final void stopPreviewAsync(InterfaceC84052Wym interfaceC84052Wym) {
        this.LJIJJ = interfaceC84052Wym;
        stopPreview(true);
    }

    @Override // X.AbstractC84025WyL
    public final int stopRecord(InterfaceC84052Wym interfaceC84052Wym) {
        this.LJIJ = interfaceC84052Wym;
        int stopRecord = stopRecord();
        if (stopRecord != 0 && interfaceC84052Wym != null && !this.LJJJJ) {
            interfaceC84052Wym.LIZ(stopRecord);
        }
        return stopRecord;
    }

    @Override // X.AbstractC84025WyL
    public final void stopRecordAsync(InterfaceC84052Wym interfaceC84052Wym) {
        stopRecord(interfaceC84052Wym);
    }

    @Override // X.AbstractC84025WyL
    public final void stopRender(boolean z) {
        this.LIZIZ.LJJJLL(z);
    }

    @Override // X.AbstractC84025WyL
    public final int switchCameraMode(int i) {
        InterfaceC84100WzY interfaceC84100WzY = this.LJI;
        if (interfaceC84100WzY == null) {
            return -1;
        }
        return interfaceC84100WzY.LLJJLIIIJLLLLLLLZ(i);
    }

    @Override // X.AbstractC84025WyL
    public final int switchEffectInternal(VEEffectFilterParam vEEffectFilterParam) {
        int addTrackFilter;
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[switchEffect]switchEffectInternal, stickerId = ");
        LIZ.append(vEEffectFilterParam.longStickerId);
        LIZ.append(", path = ");
        b0.LJ(LIZ, vEEffectFilterParam.effectPath, ", timeStamp = ", currentTimeMillis);
        P4Q.LJFF("TERecorder", X1D.LIZIZ(LIZ));
        Pair pair = (Pair) ((HashMap) this.LJJIIJ).get(8);
        if (pair != null && (addTrackFilter = ((Integer) pair.second).intValue()) >= 0) {
            this.LIZ.updateTrackFilterParam(addTrackFilter, vEEffectFilterParam);
        } else {
            addTrackFilter = this.LIZ.addTrackFilter(0, 0, vEEffectFilterParam, -1, -1);
        }
        if (pair == null) {
            pair = new Pair(vEEffectFilterParam, Integer.valueOf(addTrackFilter));
        }
        ((HashMap) this.LJJIIJ).put(8, pair);
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public final void switchFlashMode(VECameraSettings.CAMERA_FLASH_MODE camera_flash_mode) {
        InterfaceC84100WzY interfaceC84100WzY = this.LJI;
        if (interfaceC84100WzY != null) {
            interfaceC84100WzY.LJIIZILJ(camera_flash_mode);
        } else {
            P4Q.LJII("TERecorder", "No Camera capture to switchFlashMode");
        }
    }

    @Override // X.AbstractC84025WyL
    public final void switchTorch(boolean z) {
        InterfaceC84100WzY interfaceC84100WzY = this.LJI;
        if (interfaceC84100WzY != null) {
            interfaceC84100WzY.LJIJ(z);
        } else {
            P4Q.LJII("TERecorder", "No Camera capture to switchTorch");
        }
    }

    @Override // X.AbstractC84025WyL
    public final void updateDuetLayout(EnumC62342cY enumC62342cY) {
        X02 x02;
        TERecorderInterface tERecorderInterface = this.LIZIZ;
        if (tERecorderInterface != null && (x02 = this.LJJIJL) != null && (x02 instanceof C84091WzP)) {
            tERecorderInterface.LJJIJIIJIL("DuetLayout", enumC62342cY.ordinal());
            this.mVEDuetSettings.setDuetLayout(enumC62342cY);
        } else {
            this.mVEDuetSettings.setDuetLayout(enumC62342cY);
        }
    }

    @Override // X.AbstractC84025WyL
    public final void updateLensParams(VEBaseRecorderLensParams vEBaseRecorderLensParams) {
        boolean z;
        boolean z2;
        int i = vEBaseRecorderLensParams.algorithmFlag;
        if (i != 15) {
            if (i != 21) {
                if (i != 24) {
                    if (i != 33) {
                        if (i != 34) {
                            switch (i) {
                                case 27:
                                    break;
                                case 28:
                                    VEOneKeyProcessParams vEOneKeyProcessParams = (VEOneKeyProcessParams) vEBaseRecorderLensParams;
                                    TEBundle obtain = TEBundle.obtain();
                                    obtain.setInt("Iso", vEOneKeyProcessParams.iso);
                                    obtain.setInt("MinIso", vEOneKeyProcessParams.minIso);
                                    obtain.setInt("MaxIso", vEOneKeyProcessParams.maxIso);
                                    obtain.setBool("IsFirstFrame", vEOneKeyProcessParams.isFirstFrame);
                                    obtain.setInt("FaceNum", vEOneKeyProcessParams.faceNum);
                                    obtain.setInt("Flag", vEOneKeyProcessParams.algorithmFlag);
                                    if (vEOneKeyProcessParams.faceNum != 0) {
                                        for (int i2 = 0; i2 < vEOneKeyProcessParams.faceNum; i2++) {
                                            Rect rect = vEOneKeyProcessParams.faceRects[i2];
                                            int[] iArr = {rect.bottom, rect.left, rect.right, rect.top};
                                            StringBuilder LIZ = X1D.LIZ();
                                            LIZ.append("FaceRect_");
                                            LIZ.append(i2);
                                            obtain.setIntArray(X1D.LIZIZ(LIZ), iArr);
                                        }
                                    }
                                    this.LIZIZ.LJJIIJ("oneKeyProcess", obtain);
                                    return;
                                case 29:
                                    VERhythmicMotionParam vERhythmicMotionParam = (VERhythmicMotionParam) vEBaseRecorderLensParams;
                                    TEBundle obtain2 = TEBundle.obtain();
                                    obtain2.setFloatArray("CropList", vERhythmicMotionParam.cropList);
                                    obtain2.setFloat("MaxAlpha", vERhythmicMotionParam.maxAlpha);
                                    obtain2.setFloat("MaxVelocity", vERhythmicMotionParam.maxVelocity);
                                    obtain2.setInt("Flag", vERhythmicMotionParam.algorithmFlag);
                                    this.LIZIZ.LJJIIJ("RhythmicMotion", obtain2);
                                    return;
                                default:
                                    return;
                            }
                        } else {
                            C84126Wzy c84126Wzy = (C84126Wzy) vEBaseRecorderLensParams;
                            TEBundle obtain3 = TEBundle.obtain();
                            obtain3.setInt("BufferSize", c84126Wzy.LIZ);
                            obtain3.setFloat("Threshold", c84126Wzy.LIZIZ);
                            obtain3.setInt("StableFrameCount", c84126Wzy.LIZJ);
                            obtain3.setFloat("LowStableThreshold", c84126Wzy.LIZLLL);
                            obtain3.setFloat("HighStableThreshold", c84126Wzy.LJ);
                            obtain3.setBool("Enable", c84126Wzy.enable);
                            obtain3.setInt("Flag", c84126Wzy.algorithmFlag);
                            obtain3.setFloatArray("DeltaRotationMatrix", null);
                            if (c84126Wzy.resultCallback != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            obtain3.setBool("EnableResult", z2);
                            this.LIZIZ.LJJIIJ("ShakingDetect", obtain3);
                            return;
                        }
                    } else {
                        C84125Wzx c84125Wzx = (C84125Wzx) vEBaseRecorderLensParams;
                        TEBundle obtain4 = TEBundle.obtain();
                        obtain4.setString("ModelPath", null);
                        obtain4.setString("KernelBinPath", null);
                        obtain4.setInt("NumThread", c84125Wzx.LIZIZ);
                        obtain4.setInt("BackendType", c84125Wzx.LIZ);
                        obtain4.setInt("RunType", 4);
                        obtain4.setFloat("Threshold", c84125Wzx.LJ);
                        obtain4.setBool("Enable", c84125Wzx.enable);
                        obtain4.setInt("Flag", c84125Wzx.algorithmFlag);
                        obtain4.setFloat("Alpha", c84125Wzx.LIZJ);
                        obtain4.setFloat("Beta", c84125Wzx.LIZLLL);
                        if (c84125Wzx.resultCallback != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        obtain4.setBool("EnableResult", z);
                        this.LIZIZ.LJJIIJ("DefinitionDetect", obtain4);
                        return;
                    }
                } else {
                    VEAdaptiveSharpenParams vEAdaptiveSharpenParams = (VEAdaptiveSharpenParams) vEBaseRecorderLensParams;
                    TEBundle obtain5 = TEBundle.obtain();
                    obtain5.setInt("SceneMode", vEAdaptiveSharpenParams.sceneMode);
                    obtain5.setFloat("Amount", vEAdaptiveSharpenParams.amount);
                    obtain5.setFloat("OverRatio", vEAdaptiveSharpenParams.overRatio);
                    obtain5.setFloat("EdgeWeightGamma", vEAdaptiveSharpenParams.edgeWeightGamma);
                    obtain5.setInt("DiffImgSmoothEnable", vEAdaptiveSharpenParams.diffImgSmoothEnable);
                    obtain5.setInt("PowerLevelPara", vEAdaptiveSharpenParams.powerLevelPara);
                    obtain5.setInt("InitDelayFrameCnt", vEAdaptiveSharpenParams.initDelayFrameCnt);
                    obtain5.setInt("ProcessDelayFrameCnt", vEAdaptiveSharpenParams.processDelayFrameCnt);
                    this.LIZIZ.LJJIIJ("asf", obtain5);
                    return;
                }
            } else {
                VETaintSceneDetectParams vETaintSceneDetectParams = (VETaintSceneDetectParams) vEBaseRecorderLensParams;
                TEBundle obtain6 = TEBundle.obtain();
                obtain6.setInt("DetectFrequency", vETaintSceneDetectParams.detectFrequency);
                obtain6.setString("ModelPath", vETaintSceneDetectParams.modelPath);
                obtain6.setString("KernelBinPath", vETaintSceneDetectParams.kernelBinPath);
                obtain6.setInt("BackendType", vETaintSceneDetectParams.backendType);
                obtain6.setInt("NumThread", vETaintSceneDetectParams.numThread);
                obtain6.setInt("DetectRepeatNum", vETaintSceneDetectParams.detectRepeatNum);
                this.LIZIZ.LJJIIJ("taintSceneDetect", obtain6);
                enableLensProcess(21, true);
                return;
            }
        }
        VELumaDetectParams vELumaDetectParams = (VELumaDetectParams) vEBaseRecorderLensParams;
        TEBundle obtain7 = TEBundle.obtain();
        obtain7.setInt("Iso", vELumaDetectParams.iso);
        obtain7.setInt("MinIso", vELumaDetectParams.minIso);
        obtain7.setInt("MaxIso", vELumaDetectParams.maxIso);
        obtain7.setInt("ExposureTime", vELumaDetectParams.exposureTime);
        obtain7.setInt("MinExposureTime", vELumaDetectParams.minExposureTime);
        obtain7.setInt("MaxExposureTime", vELumaDetectParams.maxExposureTime);
        obtain7.setFloat("EcStep", vELumaDetectParams.ecStep);
        obtain7.setInt("Flag", vELumaDetectParams.algorithmFlag);
        obtain7.setInt("DetectFrames", vELumaDetectParams.detectFrames);
        obtain7.setInt("FaceNum", vELumaDetectParams.faceNum);
        obtain7.setInt("Flag", vELumaDetectParams.algorithmFlag);
        if (vELumaDetectParams.faceNum != 0) {
            for (int i3 = 0; i3 < vELumaDetectParams.faceNum; i3++) {
                Rect rect2 = vELumaDetectParams.faceRects[i3];
                int[] iArr2 = {rect2.bottom, rect2.left, rect2.right, rect2.top};
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("FaceRect_");
                LIZ2.append(i3);
                obtain7.setIntArray(X1D.LIZIZ(LIZ2), iArr2);
            }
        }
        this.LIZIZ.LJJIIJ("lumaDetect", obtain7);
    }

    @Override // X.AbstractC84025WyL
    public final void useMusic(boolean z) {
        this.LJIIJJI = z;
    }

    public C84092WzQ(Context context, AbstractC84033WyT abstractC84033WyT) {
        super(context, abstractC84033WyT, null);
        this.LJFF = new Object();
        this.LJII = null;
        this.LJIIL = null;
        this.LJIILIIL = new ArrayList();
        this.LJIILJJIL = new Object();
        this.LJIILL = null;
        this.LJIILLIIL = null;
        this.LJJIII = -1;
        HashMap hashMap = new HashMap();
        this.LJJIIJ = hashMap;
        this.LJJIIJZLJL = C16880lQ.LLLLZLLIL();
        this.LJJIIZ = 0;
        this.LJJIIZI = -1;
        this.LJJIJ = -1;
        this.LJJIJIIJI = -1;
        this.LJJIJIIJIL = new Object();
        this.LJJIJIL = new AtomicBoolean(false);
        this.LJJIJL = null;
        this.LJJIJLIJ = new Object();
        this.LJJIL = -1;
        this.LJJIZ = EnumC84106Wze.CAM_WITH_VIDEO_TYPE_NORMAL;
        this.LJJJIL = new Handler(C16880lQ.LLJJJJ());
        this.LJJJJ = false;
        this.LJJJJI = false;
        this.LJJJJJ = false;
        this.LJJJJLI = -1;
        this.LJJJJLL = null;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LJJJJZ = reentrantLock;
        this.LJJJJZI = reentrantLock.newCondition();
        ReentrantLock reentrantLock2 = new ReentrantLock();
        this.LJJJLIIL = reentrantLock2;
        this.LJJJLL = reentrantLock2.newCondition();
        ReentrantLock reentrantLock3 = new ReentrantLock();
        this.LJJJLZIJ = reentrantLock3;
        this.LJJJZ = reentrantLock3.newCondition();
        ReentrantLock reentrantLock4 = new ReentrantLock();
        this.LJJL = reentrantLock4;
        this.LJJLI = reentrantLock4.newCondition();
        this.LJJLIIIIJ = false;
        this.LJJLIIIJILLIZJL = EnumC63976P8y.RADIO_9_16.ordinal();
        this.LJJLIIIJJI = new VESize(0, 0);
        this.LJJLIIIJJIZ = 0.125f;
        this.LJJLIIIJL = 0;
        this.LJJLIIIJLJLI = new VESize(0, 0);
        this.LJJLIIIJLLLLLLLZ = EnumC84114Wzm.NO_MIRROR.ordinal();
        this.LJJLIIJ = -1;
        this.LJJLJ = false;
        this.LJJLJLI = true;
        this.LJJZZIII = new C169706lK<>();
        this.LJL = new LinkedList();
        this.LJLI = false;
        this.LJLIIIL = null;
        P6M p6m = new P6M(this);
        this.LJLIIL = -1;
        this.LJLIL = false;
        this.LJLILLLLZI = 3;
        this.LJLJI = null;
        this.LJ = new C84099WzX();
        TERecorderInterface tERecorderInterface = new TERecorderInterface();
        this.LIZIZ = tERecorderInterface;
        TECamera tECamera = new TECamera(tERecorderInterface.LJIIIIZZ());
        this.LIZJ = tECamera;
        this.LJJZZI = new TECamera(tERecorderInterface.LJIIL());
        tECamera.setOnCameraInfoListener(this);
        X0G x0g = new X0G(tERecorderInterface.LIZIZ);
        this.LIZ = x0g;
        x0g.LJLJL = hashMap;
        TEMessageClient tEMessageClient = new TEMessageClient();
        this.mSystemResManager = new C84119Wzr();
        boolean enableVBoost = getEnableVBoost();
        this.mIsEnableVBoost = enableVBoost;
        if (enableVBoost) {
            C84119Wzr c84119Wzr = this.mSystemResManager;
            C109434Rf c109434Rf = new C109434Rf();
            c84119Wzr.LIZ = false;
            c84119Wzr.LIZIZ = c109434Rf;
            c84119Wzr.LIZ = true;
        }
        TECallbackClient tECallbackClient = new TECallbackClient();
        this.LJIIJ = tECallbackClient;
        tECallbackClient.setOpenGLListeners(p6m);
        tECallbackClient.setCommonCallback(new C84095WzT(this));
        tEMessageClient.setErrorListener(new C84103Wzb(this));
        tEMessageClient.setInfoListener(new C84029WyP(this));
        tERecorderInterface.LJJIJL(tEMessageClient, tECallbackClient);
        this.LJJJJLL = new C84104Wzc(this);
    }

    public static VESize LIZLLL(VESize vESize, VESize vESize2) {
        VESize vESize3 = new VESize(0, 0);
        if (vESize != null && vESize2 != null && vESize.isValid() && vESize2.isValid()) {
            float f = vESize2.width * 1.0f;
            float f2 = f / vESize2.height;
            int i = vESize.width;
            int i2 = vESize.height;
            float f3 = i2;
            if (f2 > (i * 1.0f) / f3) {
                vESize3.width = i;
                vESize3.height = (int) (((i * r6) * 1.0f) / vESize2.width);
            } else {
                vESize3.height = i2;
                vESize3.width = (int) ((f / vESize2.height) * f3);
            }
        }
        return vESize3;
    }

    public final void LIZIZ(P6Q p6q, boolean z) {
        if (p6q.LLJJJJLIIL() != null) {
            this.mLastCameraFacing = p6q.LLJJJJLIIL().getCameraFacing();
        } else {
            VECameraSettings vECameraSettings = this.mCameraSettings;
            if (vECameraSettings != null) {
                this.mLastCameraFacing = vECameraSettings.getCameraFacing();
            }
        }
        EnumC83975WxX enumC83975WxX = this.mMulticamEffectMode;
        if (enumC83975WxX == EnumC83975WxX.DEFAULT_PRIMARY || enumC83975WxX == EnumC83975WxX.FRONT_PRIMARY_MULTI_RENDER || enumC83975WxX == EnumC83975WxX.BACK_PRIMARY_MULTI_RENDER) {
            VECameraSettings.CAMERA_FACING_ID camera_facing_id = this.mLastCameraFacing;
            if (camera_facing_id != VECameraSettings.CAMERA_FACING_ID.FACING_REAR_MAIN_FRONT_MAIN) {
                this.LIZIZ.LJJIJIIJIL("DefaultFacing", camera_facing_id.ordinal());
            }
            this.LJJZZIII.LIZIZ();
            List<P6O> LIZJ = this.LIZJ.createCapturePipeline(p6q, z).LIZJ();
            List<P6O> LIZJ2 = this.LJJZZI.createCapturePipeline(p6q, z).LIZJ();
            Iterator<P6O> it = LIZJ.iterator();
            while (it.hasNext()) {
                this.LJJZZIII.LIZ(it.next());
            }
            for (P6O p6o : LIZJ2) {
                p6o.LJFF = false;
                this.LJJZZIII.LIZ(p6o);
            }
            p6q.LJIILLIIL(this.LJJZZIII);
            P4Q.LJFF("TERecorder", "_startCameraPreview, dual-camera");
            return;
        }
        TECamera tECamera = this.LIZJ;
        if (tECamera != null) {
            tECamera.start(p6q, z);
        }
    }

    public final void LJ(int i, int i2) {
        int i3 = i - (i & 15);
        int i4 = i2 - (i2 & 15);
        C87278YNe c87278YNe = new C87278YNe(this.mVideoEncodeSettings);
        c87278YNe.LJIIJ(i3, i4);
        VEVideoEncodeSettings LIZ = c87278YNe.LIZ();
        this.mVideoEncodeSettings = LIZ;
        LIZ(LIZ);
        TERecorderInterface tERecorderInterface = this.LIZIZ;
        VEVideoEncodeSettings vEVideoEncodeSettings = this.mVideoEncodeSettings;
        tERecorderInterface.getClass();
        tERecorderInterface.LJJIIJ("VideoEncode", C84093WzR.LIZLLL(vEVideoEncodeSettings));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("changeVideoOutputSizeViaInner: width=");
        LIZ2.append(i3);
        LIZ2.append(", height=");
        C01R.LIZJ(LIZ2, i4, LIZ2, "TERecorder");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000e, code lost:
    
        if (r7 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(boolean r6, boolean r7) {
        /*
            r5 = this;
            java.lang.String r3 = "TERecorder"
            r4 = 1
            r1 = -1
            if (r6 != 0) goto La
            int r0 = r5.LJJJJLI
            if (r0 != r1) goto L10
        La:
            int r0 = r5.LJJJJLI
            if (r0 == r1) goto L1d
            if (r7 == 0) goto L1f
        L10:
            int r0 = r5.LJJJJLI
            r5.removeTrack(r4, r0)
            java.lang.String r0 = "remove empty track"
            X.C63922P6w.LIZLLL(r3, r0)
            r5.LJJJJLI = r1
            return
        L1d:
            if (r7 != 0) goto L58
        L1f:
            if (r0 != r1) goto L58
            X.Wc7 r2 = new X.Wc7
            r2.<init>()
            java.lang.String r0 = "empty_path"
            r2.LIZ(r0)
            r1 = 0
            r2.LIZJ(r1)
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.LIZLLL(r0)
            r2.LIZIZ()
            com.ss.android.ttve.model.VETrackParams r0 = r2.LIZ
            int r0 = r5.LIZJ(r4, r0, r1)
            r5.LJJJJLI = r0
            r5.alignTo(r0, r4, r4, r1)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "add empty track, track index:"
            r1.append(r0)
            int r0 = r5.LJJJJLI
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C63922P6w.LIZLLL(r3, r0)
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84092WzQ.LJFF(boolean, boolean):void");
    }

    @Override // X.AbstractC84025WyL
    public final boolean addMetadata(String str, String str2) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setString("MetadataKey", str);
        obtain.setString("MetadataValue", str2);
        if (this.LIZIZ.LJJIIJ("AddMetaData", obtain) == 0) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC84025WyL
    public final int addTrack(int i, VETrackParams vETrackParams) {
        return LIZJ(i, vETrackParams, false);
    }

    @Override // X.AbstractC84025WyL
    public final int animateImageToPreview(String str, String str2) {
        VEFrame createByteBufferFrame;
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 34);
        if (!TextUtils.isEmpty(str2)) {
            Context context = VERuntime.getInstance().getContext();
            if (context == null) {
                return -108;
            }
            TEImageFactory.ImageInfo decodeFile = TEImageFactory.decodeFile(context.getContentResolver(), str2);
            if (decodeFile == null || (createByteBufferFrame = VEFrame.createByteBufferFrame(decodeFile.getBitmap(), 0L)) == null) {
                return -100;
            }
            LIZJ.setByteBuffer("data", ((VEFrame.ByteBufferFrame) createByteBufferFrame.getFrame()).getByteBuffer());
            LIZJ.setInt("width", createByteBufferFrame.getWidth());
            LIZJ.setInt("height", createByteBufferFrame.getHeight());
        }
        LIZJ.setString("key", str);
        return x0g.LJLIL.callEffectInterface(LIZJ);
    }

    @Override // X.AbstractC84025WyL
    public final int animateImagesToPreview(List<String> list, List<VEFrame> list2) {
        X0G x0g = this.LIZ;
        x0g.getClass();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            String[] strArr = new String[size];
            list.toArray(strArr);
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            TEBundle obtain = TEBundle.obtain();
            if (list2 != null && !list2.isEmpty()) {
                int size2 = list2.size();
                for (int i = 0; i < size && i < size2; i++) {
                    VEFrame vEFrame = (VEFrame) ListProtector.get(list2, i);
                    if (vEFrame == null) {
                        P4Q.LIZJ(C84094WzS.LJLLI, "frame nullptr");
                    } else if (!(vEFrame.getFrame() instanceof VEFrame.ByteBufferFrame)) {
                        P4Q.LIZJ(C84094WzS.LJLLI, "Only support ByteBufferFrame");
                    } else {
                        ByteBuffer byteBuffer = ((VEFrame.ByteBufferFrame) vEFrame.getFrame()).getByteBuffer();
                        if (byteBuffer == null) {
                            P4Q.LIZJ(C84094WzS.LJLLI, "buffer nullptr");
                        } else {
                            iArr[i] = vEFrame.getWidth();
                            iArr2[i] = vEFrame.getHeight();
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("data");
                            LIZ.append(i);
                            obtain.setByteBuffer(X1D.LIZIZ(LIZ), byteBuffer);
                        }
                    }
                }
            }
            obtain.setInt("effectInterfaceName", 34);
            obtain.setStringArray("keys", strArr);
            obtain.setIntArray("widths", iArr);
            obtain.setIntArray("heights", iArr2);
            return x0g.LJLIL.callEffectInterface(obtain);
        }
        return -100;
    }

    @Override // X.AbstractC84025WyL
    public final int appendComposerNodes(String[] strArr, int i) {
        X0G x0g = this.LIZ;
        x0g.getClass();
        if (i <= 0 || strArr == null || strArr.length != i) {
            return -100;
        }
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 17);
        obtain.setInt("effectEngineType", 0);
        obtain.setStringArray("node paths", strArr);
        return x0g.LJLIL.callEffectInterface(obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void captureNightEnhance(C84084WzI c84084WzI, InterfaceC84057Wyr interfaceC84057Wyr) {
        throw null;
    }

    @Override // X.AbstractC84025WyL
    public final void changeDuetVideo(String str, String str2) {
        synchronized (this.LJJIJLIJ) {
            X02 x02 = this.LJJIJL;
            if (x02 != null && (x02 instanceof C84091WzP)) {
                ((C84091WzP) x02).LJIIIIZZ(str, str2);
            }
        }
    }

    @Override // X.AbstractC84025WyL
    public final void changeVideoOutputSize(int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("changeOutputVideoSize: width=");
        LIZ.append(i);
        LIZ.append(", height=");
        LIZ.append(i2);
        P4Q.LJFF("TERecorder", X1D.LIZIZ(LIZ));
        if (this.mIsBindingViewMode && (this.LJJLIIIJILLIZJL == EnumC63976P8y.RADIO_9_16.ordinal() || this.LJJLIIIJILLIZJL == EnumC63976P8y.RADIO_FULL.ordinal())) {
            new VESize(i, i2);
            VESize LIZLLL = LIZLLL(new VESize(i, i2), this.LJJLIIIJJI);
            if (LIZLLL.isValid()) {
                LJ(LIZLLL.width, LIZLLL.height);
                return;
            }
        }
        C87278YNe c87278YNe = new C87278YNe(this.mVideoEncodeSettings);
        c87278YNe.LJIIJ(i, i2);
        VEVideoEncodeSettings LIZ2 = c87278YNe.LIZ();
        this.mVideoEncodeSettings = LIZ2;
        LIZ(LIZ2);
        TERecorderInterface tERecorderInterface = this.LIZIZ;
        VEVideoEncodeSettings vEVideoEncodeSettings = this.mVideoEncodeSettings;
        tERecorderInterface.getClass();
        tERecorderInterface.LJJIIJ("VideoEncode", C84093WzR.LIZLLL(vEVideoEncodeSettings));
    }

    @Override // X.AbstractC84025WyL
    public final int[] checkComposerNodeExclusion(String str, String str2) {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 26);
        LIZJ.setInt("effectEngineType", 0);
        LIZJ.setString("newNodePath", str);
        LIZJ.setString("nodeKey", str2);
        TEBundle obtain = TEBundle.obtain();
        x0g.LJLIL.callEffectInterfaceWithResult(LIZJ, obtain);
        int[] intArray = obtain.getIntArray("checkComposerNodeExclusionRet");
        obtain.recycle();
        return intArray;
    }

    @Override // X.AbstractC84025WyL
    public final void enableAudioRecorder(boolean z, Cert cert) {
        enableAudio(z);
        VEAudioCapture vEAudioCapture = this.mVEAudioCapture;
        if (vEAudioCapture != null) {
            if (z) {
                LJII();
            } else {
                vEAudioCapture.release(cert);
            }
        }
    }

    @Override // X.AbstractC84025WyL
    public final void enableBachScan(boolean z, X0F x0f) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setBool("EnableBachScan", z);
        x0f.getClass();
        obtain.setString("algorithmConfig", null);
        obtain.setInt("AlgorithmType", x0f.getAlgorithmType());
        if (x0f.getAlgorithmType() == 12) {
            X0D x0d = (X0D) x0f;
            obtain.setInt("ScanType", x0d.LIZIZ);
            obtain.setInt("ObjectDetectIntervalTimeMs", x0d.LIZJ);
            obtain.setInt("MaxTrackNum", x0d.LIZLLL);
            obtain.setInt("MaxObjectNum", x0d.LJ);
        } else if (x0f.getAlgorithmType() == 11) {
            X05 x05 = (X05) x0f;
            obtain.setInt("FrameNum", x05.LIZIZ);
            obtain.setLong("CodeType", 0);
            obtain.setInt("scanBehavior", x05.LIZJ.ordinal());
        } else if (x0f.getAlgorithmType() == 13) {
            C84105Wzd c84105Wzd = (C84105Wzd) x0f;
            obtain.setInt("detectFrameRate", c84105Wzd.LIZIZ);
            obtain.setFloat("threshold", c84105Wzd.LIZJ);
            obtain.setInt("notQRCodeTimeOut", c84105Wzd.LIZLLL);
            obtain.setFloat("needZoomFactorToFrameHeight", c84105Wzd.LJ);
            obtain.setFloat("maxFactorToFrameHeight", c84105Wzd.LJFF);
            obtain.setBool("enableZoomBehavior", c84105Wzd.LJI);
            obtain.setFloat("top", c84105Wzd.LJII);
            obtain.setFloat("bottom", c84105Wzd.LJIIIIZZ);
            obtain.setFloat("left", c84105Wzd.LJIIIZ);
            obtain.setFloat("right", c84105Wzd.LJIIJ);
            obtain.setFloat("percent", c84105Wzd.LJIIJJI);
            obtain.setFloat("maxZoomFactor", c84105Wzd.LJIIL);
        } else if (x0f.getAlgorithmType() == 16) {
            X0J x0j = (X0J) x0f;
            obtain.setBool("Enable", z);
            obtain.setLong("CodeType", x0j.LIZJ);
            obtain.setInt("detectFrameRate", x0j.LIZIZ);
        }
        this.LIZIZ.LJJIIJ("BachScan", obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void enableFastCVProcess(int i, boolean z) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("FastCVFlag", i);
        obtain.setBool("EnableFastCVProcess", z);
        this.LIZIZ.LJJIIJ("EnableFastCV", obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void enableLensProcess(int i, boolean z) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("LensFlag", i);
        obtain.setBool("EnableLensProcess", z);
        this.LIZIZ.LJJIIJ("EnableLens", obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void enablePictureTestMode(boolean z, boolean z2) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setBool("ModeoPictureTestFlag", z);
        this.LIZIZ.LJJIIJ("enablePictureTestMode", obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void enableScan(boolean z, long j) {
        X0G x0g = this.LIZ;
        x0g.getClass();
        if (z) {
            if (j < 0) {
                j = 65536;
            }
            C84036WyW c84036WyW = new C84036WyW();
            c84036WyW.LIZ = 0.0f;
            c84036WyW.LIZIZ = 0.0f;
            c84036WyW.LIZJ = 1.0f;
            c84036WyW.LIZLLL = 1.0f;
            c84036WyW.LJ = true;
            c84036WyW.LJFF = j;
            x0g.LIZ(c84036WyW, 0, Integer.MAX_VALUE, 7);
            return;
        }
        if (!((HashMap) x0g.LJLJJLL).containsKey(7)) {
            return;
        }
        Pair pair = (Pair) ((HashMap) x0g.LJLJJLL).get(7);
        x0g.removeTrackAlgorithm(((Integer) pair.second).intValue());
        ((HashMap) x0g.LJLJJLL).remove(pair);
    }

    @Override // X.AbstractC84025WyL
    public final float getComposerNodeValue(String str, String str2) {
        X0G x0g = this.LIZ;
        x0g.getClass();
        if (str2 == null) {
            return -100.0f;
        }
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 20);
        obtain.setInt("effectEngineType", 0);
        obtain.setString("node path", str);
        obtain.setString("node key", str2);
        TEBundle obtain2 = TEBundle.obtain();
        x0g.LJLIL.callEffectInterfaceWithResult(obtain, obtain2);
        float f = obtain2.getFloat("Result");
        obtain2.recycle();
        return f;
    }

    @Override // X.AbstractC84025WyL
    public final void handleEffectAudio(boolean z, long j) {
        X0G x0g = this.LIZ;
        x0g.getClass();
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 46);
        obtain.setBool("isPause", z);
        obtain.setLong("type", j);
        x0g.LJLIL.callEffectInterface(obtain);
    }

    @Override // X.AbstractC84025WyL
    public final int pausePlayTrack(int i, int i2) {
        return this.LIZIZ.LJJIZ(-1L, i, i2, 1, false);
    }

    @Override // X.AbstractC84025WyL
    public final boolean posInReactionRegion(int i, int i2) {
        P4Q.LJFF("TERecorder", "posInReactionRegion");
        return false;
    }

    @Override // X.AbstractC84025WyL
    public final boolean processTouchEvent(VETouchPointer vETouchPointer, int i) {
        X0G x0g = this.LIZ;
        x0g.getClass();
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("ProcessTouchEventType", vETouchPointer.getEvent().ordinal());
        obtain.setInt("PointerID", vETouchPointer.getPointerId());
        obtain.setFloat("x", vETouchPointer.getX());
        obtain.setFloat("y", vETouchPointer.getY());
        obtain.setFloat("force", vETouchPointer.getForce());
        obtain.setFloat("majorRadius", vETouchPointer.getMajorRadius());
        obtain.setInt("pointerCount", i);
        obtain.setInt("EffectRotation", x0g.LJLL);
        obtain.setInt("effectInterfaceName", 37);
        obtain.setInt("effectEngineType", 0);
        TEBundle obtain2 = TEBundle.obtain();
        x0g.LJLIL.callEffectInterfaceWithResult(obtain, obtain2);
        boolean bool = obtain2.getBool("processTouchEventResult");
        obtain2.recycle();
        return bool;
    }

    @Override // X.AbstractC84025WyL
    public final int reloadComposerNodes(String[] strArr, int i) {
        X0G x0g = this.LIZ;
        x0g.getClass();
        if (i <= 0 || strArr == null || strArr.length != i) {
            return -100;
        }
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 16);
        obtain.setInt("effectEngineType", 0);
        obtain.setStringArray("node paths", strArr);
        return x0g.LJLIL.callEffectInterface(obtain);
    }

    @Override // X.AbstractC84025WyL
    public final int removeComposerNodes(String[] strArr, int i) {
        X0G x0g = this.LIZ;
        x0g.getClass();
        if (i <= 0 || strArr == null || strArr.length != i) {
            return -100;
        }
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 18);
        obtain.setInt("effectEngineType", 0);
        obtain.setStringArray("node paths", strArr);
        return x0g.LJLIL.callEffectInterface(obtain);
    }

    @Override // X.AbstractC84025WyL
    public final int removeTrack(int i, int i2) {
        return LJIILIIL(i, i2, false);
    }

    @Override // X.AbstractC84025WyL
    public final void renderFrame(VEFrame vEFrame, C84098WzW c84098WzW) {
        int i;
        boolean isFromFrontCamera = vEFrame.isFromFrontCamera();
        ((LinkedList) this.LJL).offer(new Pair(Integer.valueOf(isFromFrontCamera ? 1 : 0), Long.valueOf(System.currentTimeMillis())));
        C63972P8u c63972P8u = new C63972P8u(this, c84098WzW);
        Bitmap bitmap = c84098WzW.LJIJ;
        this.LJIIJ.setGetFrameListener(c63972P8u);
        ImageFrame VEFrame2ImageFrame = TEFrameUtils.VEFrame2ImageFrame(vEFrame);
        if (VEFrame2ImageFrame == null) {
            VEFrame.FrameBase frame = vEFrame.getFrame();
            if (vEFrame.getFormat() == P6Z.TEPixFmt_RGBA8 && (frame instanceof VEFrame.IntArrayFrame)) {
                Bitmap createBitmap = Bitmap.createBitmap(((VEFrame.IntArrayFrame) frame).getIntArray(), vEFrame.getWidth(), vEFrame.getHeight(), Bitmap.Config.ARGB_8888);
                ByteBuffer allocate = ByteBuffer.allocate(createBitmap.getByteCount());
                createBitmap.copyPixelsToBuffer(allocate);
                this.LJIIIZ = new TECameraFrameSetting(allocate.array(), allocate.capacity(), vEFrame.getWidth(), vEFrame.getHeight(), vEFrame.getRotation(), P6Z.TEPixFmt_ARGB8.ordinal());
                createBitmap.recycle();
                if (bitmap != null) {
                    this.LJIIIZ.setDirectBitmap(bitmap);
                }
                this.LIZIZ.LJJI(this.LJIIIZ, c84098WzW);
                return;
            }
            c84098WzW.LJII.onResult(null, 0, 0);
            return;
        }
        if (VEFrame2ImageFrame.getBuf() != null) {
            if (VEFrame2ImageFrame.getFormat() == -3) {
                i = 3;
            } else {
                i = 17;
            }
            this.LJIIIZ = new TECameraFrameSetting(VEFrame2ImageFrame.getBuf(), VEFrame2ImageFrame.getBuf().length, VEFrame2ImageFrame.getWidth(), VEFrame2ImageFrame.getHeight(), vEFrame.getRotation(), i);
        } else if (vEFrame.getFormat() == P6Z.TEPIXEL_FORMAT_YUV420) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 3, 3);
            ByteBuffer[] byteBufferArr = new ByteBuffer[3];
            new P6V(VEFrame2ImageFrame).LIZ(iArr, byteBufferArr);
            this.LJIIIZ = new TECameraFrameSetting(byteBufferArr[0], iArr[0], byteBufferArr[1], iArr[1], byteBufferArr[2], iArr[2], VEFrame2ImageFrame.getWidth(), VEFrame2ImageFrame.getHeight(), vEFrame.getRotation(), 0);
        } else if (VEFrame2ImageFrame.getBitmap() != null) {
            P4Q.LJII("TERecorder", "Not support now.");
        } else {
            P4Q.LJII("TERecorder", "Not support now.");
        }
        int i2 = this.LJJJJL;
        if (i2 != 0) {
            c84098WzW.LJIIJ = 360 - i2;
            if (i2 == 90 || i2 == 270) {
                VESize vESize = c84098WzW.LIZIZ;
                c84098WzW.LIZIZ = new VESize(vESize.height, vESize.width);
            }
        }
        if (bitmap != null) {
            this.LJIIIZ.setDirectBitmap(bitmap);
        }
        this.LIZIZ.LJJI(this.LJIIIZ, c84098WzW);
    }

    @Override // X.AbstractC84025WyL
    public final void resetQRDetectZoom(float f, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("resetQRDetectZoom zoom is ");
        LIZ.append(f);
        LIZ.append(" ,isZoomByUser is ");
        LIZ.append(z);
        P4Q.LJFF("TERecorder", X1D.LIZIZ(LIZ));
        TEBundle obtain = TEBundle.obtain();
        obtain.setFloat("VE_QRCODE_DETECT_RESET_ZOOM", f);
        obtain.setBool("VE_QRCODE_DETECT_ZOOM_BY_USER", z);
        this.LIZIZ.LJJIIJ("resetQRDetectZoom", obtain);
    }

    @Override // X.AbstractC84025WyL
    public final int setAlgorithmPreConfig(int i, int i2) {
        X0G x0g = this.LIZ;
        x0g.getClass();
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 52);
        obtain.setInt("width", i);
        obtain.setInt("height", i2);
        return x0g.LJLIL.callEffectInterface(obtain);
    }

    @Override // X.AbstractC84025WyL
    public final int setBeautyFace(int i, String str) {
        VEBeautyFilterParam vEBeautyFilterParam;
        int i2;
        Pair pair = (Pair) ((HashMap) this.LJJIIJ).get(12);
        if (pair != null) {
            vEBeautyFilterParam = (VEBeautyFilterParam) pair.first;
            i2 = ((Integer) pair.second).intValue();
        } else {
            vEBeautyFilterParam = new VEBeautyFilterParam();
            i2 = -1;
        }
        if (i == 0 && i2 >= 0) {
            ((HashMap) this.LJJIIJ).remove(12);
            this.LIZ.removeTrackFilter(i2);
            return 0;
        }
        vEBeautyFilterParam.beautyType = i;
        if (str == null) {
            str = "";
        }
        vEBeautyFilterParam.beautyName = str;
        if (i2 >= 0) {
            this.LIZ.updateTrackFilterParam(i2, vEBeautyFilterParam);
        } else {
            i2 = this.LIZ.addTrackFilter(0, 0, vEBeautyFilterParam, -1, -1);
        }
        if (pair == null) {
            pair = new Pair(vEBeautyFilterParam, Integer.valueOf(i2));
        }
        ((HashMap) this.LJJIIJ).put(12, pair);
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public final int setBeautyFaceIntensity(float f, float f2) {
        Pair pair = (Pair) ((HashMap) this.LJJIIJ).get(12);
        if (pair == null) {
            return -105;
        }
        VEBeautyFilterParam vEBeautyFilterParam = (VEBeautyFilterParam) pair.first;
        int intValue = ((Integer) pair.second).intValue();
        if (intValue < 0) {
            return -105;
        }
        vEBeautyFilterParam.smoothIntensity = f;
        vEBeautyFilterParam.brightenIntensity = f2;
        return this.LIZ.updateTrackFilterParam(intValue, vEBeautyFilterParam);
    }

    @Override // X.AbstractC84025WyL
    public final int setComposerMode(int i, int i2) {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 11);
        LIZJ.setInt("effectEngineType", 0);
        LIZJ.setInt("Mode", i);
        LIZJ.setInt("OrderType", i2);
        return x0g.LJLIL.callEffectInterface(LIZJ);
    }

    @Override // X.AbstractC84025WyL
    public final int setComposerNodes(String[] strArr, int i) {
        X0G x0g = this.LIZ;
        x0g.getClass();
        if (i <= 0 || strArr == null || strArr.length != i) {
            return -100;
        }
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 15);
        obtain.setInt("effectEngineType", 0);
        obtain.setStringArray("node paths", strArr);
        return x0g.LJLIL.callEffectInterface(obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void setCustomVideoBg(String str, String str2) {
        synchronized (this.LJJIJLIJ) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                X02 x02 = this.LJJIJL;
                if (x02 != null && !(x02 instanceof C84090WzO)) {
                    x02.onDestroy();
                    this.LJJIJL = null;
                }
                X02 x022 = this.LJJIJL;
                if (x022 == null) {
                    C84090WzO c84090WzO = new C84090WzO(this, str, str2);
                    this.LJJIJL = c84090WzO;
                    c84090WzO.onCreate();
                } else {
                    C84090WzO c84090WzO2 = (C84090WzO) x022;
                    int i = c84090WzO2.LIZLLL;
                    if (i >= 0) {
                        c84090WzO2.LIZ.LJIILIIL(0, i, true);
                        c84090WzO2.LIZLLL = -1;
                    }
                    int i2 = c84090WzO2.LJFF;
                    if (i2 != -1) {
                        c84090WzO2.LIZ.LIZ.removeTrackFilter(i2);
                        c84090WzO2.LJFF = -1;
                    }
                    c84090WzO2.LIZIZ = str;
                    c84090WzO2.LIZJ = str2;
                    c84090WzO2.LJIIJ();
                }
                this.LJJIZ = EnumC84106Wze.CAM_WITH_VIDEO_TYPE_VIDEO_GIF_BG;
            } else {
                this.LJJIZ = EnumC84106Wze.CAM_WITH_VIDEO_TYPE_NORMAL;
                X02 x023 = this.LJJIJL;
                if (x023 != null && (x023 instanceof C84090WzO)) {
                    x023.onDestroy();
                    this.LJJIJL = null;
                }
            }
        }
    }

    @Override // X.AbstractC84025WyL
    public final void setDetectListener(InterfaceC83744Wto interfaceC83744Wto, int i) {
        super.setDetectListener(interfaceC83744Wto, i);
        X0G x0g = this.LIZ;
        if (i == 0) {
            x0g.LJLIL.setFaceDetectListener(new X0I(interfaceC83744Wto));
            TEBundle obtain = TEBundle.obtain();
            obtain.setInt("effectInterfaceName", 10);
            obtain.setInt("FlagType", 2);
            obtain.setInt("flag", 1);
            x0g.LJLIL.callEffectInterface(obtain);
            return;
        }
        x0g.getClass();
    }

    @Override // X.AbstractC84025WyL
    public final void setDeviceRotation(float[] fArr, double d) {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 23);
        LIZJ.setInt("effectEngineType", 0);
        LIZJ.setFloatArray("deviceRotation", fArr);
        LIZJ.setDouble("timeStampNano", d);
        x0g.LJLIL.callEffectInterface(LIZJ);
    }

    @Override // X.AbstractC84025WyL
    public final int setEnableAEC(boolean z, String str) {
        int LJJIII = this.LIZIZ.LJJIII("AEC", z);
        int LJJJ = this.LIZIZ.LJJJ("AecModelPath", str);
        if (z) {
            int i = this.LJLIIL;
            if (i >= 0) {
                this.LIZ.removeTrackFilter(i);
            }
            VEAudioAECFilterParam vEAudioAECFilterParam = new VEAudioAECFilterParam();
            vEAudioAECFilterParam.modelPath = str;
            this.LJLIIL = this.LIZ.addTrackFilter(1, 0, vEAudioAECFilterParam, 0, Integer.MAX_VALUE);
        } else {
            this.LIZ.removeTrackFilter(this.LJLIIL);
            this.LJLIIL = -1;
        }
        if (LJJIII != 0 || LJJJ != 0) {
            return -1;
        }
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public final int setEnableLoudness(boolean z, int i) {
        this.LIZIZ.LJJIII("EnableLoudness", z);
        if (z) {
            this.LIZIZ.LJJIJIIJIL("AudioLoudness", i);
            return 0;
        }
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public final int setFilterNew(String str, float f) {
        VEColorFilterParam vEColorFilterParam;
        int i;
        Pair pair = (Pair) ((HashMap) this.LJJIIJ).get(7);
        if (pair != null) {
            vEColorFilterParam = (VEColorFilterParam) pair.first;
            i = ((Integer) pair.second).intValue();
        } else {
            vEColorFilterParam = new VEColorFilterParam();
            i = -1;
        }
        if (str == null) {
            str = "";
        }
        vEColorFilterParam.leftFilterPath = str;
        vEColorFilterParam.rightFilterPath = "";
        vEColorFilterParam.position = 0.0f;
        vEColorFilterParam.intensity = f;
        vEColorFilterParam.rightIntensity = 0.0f;
        vEColorFilterParam.useFilterV3 = true;
        if (i >= 0) {
            this.LIZ.updateTrackFilterParam(i, vEColorFilterParam);
        } else {
            pair = new Pair(vEColorFilterParam, Integer.valueOf(this.LIZ.addTrackFilter(0, 0, vEColorFilterParam, -1, -1)));
        }
        ((HashMap) this.LJJIIJ).put(7, pair);
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public final void setFocus(float f, float f2) {
        C63975P8x c63975P8x = this.mRenderView;
        if (c63975P8x != null) {
            c63975P8x.getClass();
        }
        C63975P8x c63975P8x2 = this.mRenderView;
        if (c63975P8x2 != null) {
            c63975P8x2.getClass();
        }
        setFocus(f, f2, 0, 0);
    }

    @Override // X.AbstractC84025WyL
    public final void setLensParams(VEBaseRecorderLensParams vEBaseRecorderLensParams, X03 x03) {
        synchronized (this.mCallbackMapLock) {
            this.callbackMap.put(Integer.valueOf(vEBaseRecorderLensParams.algorithmFlag), x03);
        }
        this.LJIIJ.setLensCallback(new C84101WzZ(this));
        updateLensParams(vEBaseRecorderLensParams);
    }

    @Override // X.AbstractC84025WyL
    public final boolean setReactionMaskImagePath(String str, boolean z) {
        P4Q.LJFF("TERecorder", "setReactionMaskImagePath");
        return false;
    }

    @Override // X.AbstractC84025WyL
    public final void setRecordScanSettings(C84045Wyf c84045Wyf, boolean z) {
        TEBundle obtain = TEBundle.obtain();
        if (c84045Wyf != null) {
            obtain.setBool("ScanAsync", false);
        }
        obtain.setBool("ScanStart", z);
        this.LIZIZ.LJJIIJ("RecordScanSettings", obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void setRenderCacheString(String str, String str2) {
        X0G x0g = this.LIZ;
        x0g.getClass();
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 29);
        obtain.setString("key", str);
        obtain.setString("value", str2);
        x0g.LJLIL.callEffectInterface(obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void setRenderCacheTexture(String str, String str2) {
        X0G x0g = this.LIZ;
        x0g.getClass();
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 31);
        obtain.setString("key", str);
        obtain.setString("value", str2);
        x0g.LJLIL.callEffectInterface(obtain);
    }

    @Override // X.AbstractC84025WyL
    public final int setReshapeIntensity(int i, float f) {
        Pair pair = (Pair) ((HashMap) this.LJJIIJ).get(13);
        if (pair == null) {
            return -105;
        }
        VEReshapeFilterParam vEReshapeFilterParam = (VEReshapeFilterParam) pair.first;
        int intValue = ((Integer) pair.second).intValue();
        if (intValue < 0) {
            return -105;
        }
        if (i == 4) {
            vEReshapeFilterParam.eyeIntensity = f;
        } else if (i == 5) {
            vEReshapeFilterParam.cheekIntensity = f;
        }
        return this.LIZ.updateTrackFilterParam(intValue, vEReshapeFilterParam);
    }

    @Override // X.AbstractC84025WyL
    public final int setReshapeParam(String str, java.util.Map<Integer, Float> map) {
        VEReshapeFilterParam vEReshapeFilterParam;
        int i;
        Pair pair = (Pair) ((HashMap) this.LJJIIJ).get(13);
        if (pair != null) {
            vEReshapeFilterParam = (VEReshapeFilterParam) pair.first;
            i = ((Integer) pair.second).intValue();
        } else {
            vEReshapeFilterParam = new VEReshapeFilterParam();
            i = -1;
        }
        if (str == null) {
            str = "";
        }
        vEReshapeFilterParam.resPath = str;
        for (Map.Entry<Integer, Float> entry : map.entrySet()) {
            if (entry.getKey().intValue() == 4) {
                vEReshapeFilterParam.eyeIntensity = entry.getValue().floatValue();
            } else if (entry.getKey().intValue() == 5) {
                vEReshapeFilterParam.cheekIntensity = entry.getValue().floatValue();
            }
        }
        if (i >= 0) {
            this.LIZ.updateTrackFilterParam(i, vEReshapeFilterParam);
        } else {
            i = this.LIZ.addTrackFilter(0, 0, vEReshapeFilterParam, -1, -1);
        }
        if (pair == null) {
            pair = new Pair(vEReshapeFilterParam, Integer.valueOf(i));
        }
        ((HashMap) this.LJJIIJ).put(13, pair);
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public final int setSafeArea(int i, VESafeAreaParams[] vESafeAreaParamsArr) {
        int length;
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "SafeType", i);
        if (vESafeAreaParamsArr == null) {
            length = 0;
        } else {
            length = vESafeAreaParamsArr.length;
            TEBundle[] tEBundleArr = new TEBundle[length];
            for (int i2 = 0; i2 < length; i2++) {
                VESafeAreaParams vESafeAreaParams = vESafeAreaParamsArr[i2];
                TEBundle obtain = TEBundle.obtain();
                obtain.setInt("SafeType", vESafeAreaParams.safeType);
                obtain.setFloat("left", vESafeAreaParams.left);
                obtain.setFloat("top", vESafeAreaParams.top);
                obtain.setFloat("right", vESafeAreaParams.right);
                obtain.setFloat("bottom", vESafeAreaParams.bottom);
                obtain.setInt("safetype", vESafeAreaParams.safeType);
                obtain.setFloat("left", vESafeAreaParams.left);
                obtain.setFloat("top", vESafeAreaParams.top);
                obtain.setFloat("right", vESafeAreaParams.right);
                obtain.setFloat("bottom", vESafeAreaParams.bottom);
                LIZJ.setHandle(String.valueOf(i2), obtain.getHandle());
                tEBundleArr[i2] = obtain;
            }
            for (int i3 = 0; i3 < length; i3++) {
                tEBundleArr[i3].recycle();
            }
        }
        LIZJ.setInt("SafeAreaSize", length);
        LIZJ.setInt("effectInterfaceName", 45);
        return x0g.LJLIL.callEffectInterface(LIZJ);
    }

    @Override // X.AbstractC84025WyL
    public final void setScanListener(InterfaceC84088WzM interfaceC84088WzM, InterfaceC63909P6j interfaceC63909P6j) {
        this.LJIIJ.setScanListener(null, interfaceC63909P6j);
    }

    @Override // X.AbstractC84025WyL
    public final int slamProcessDoubleClickEvent(float f, float f2) {
        EnumC84109Wzh enumC84109Wzh = EnumC84109Wzh.DB_CLICK;
        EnumC84108Wzg enumC84108Wzg = EnumC84108Wzg.TAP;
        C84117Wzp c84117Wzp = new C84117Wzp();
        c84117Wzp.LIZ = new C84124Wzw(enumC84109Wzh, enumC84108Wzg, f, f2);
        return this.LIZ.LIZLLL(c84117Wzp);
    }

    @Override // X.AbstractC84025WyL
    public final int slamProcessIngestOri(double[] dArr, double d) {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 23);
        LIZJ.setInt("effectEngineType", 0);
        LIZJ.setBool("slamProcessIngestOri", true);
        LIZJ.setDoubleArray("wRbs", dArr);
        LIZJ.setDouble("timestamp", d);
        x0g.LJLIL.callEffectInterface(LIZJ);
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public final int slamProcessRotationEvent(float f, float f2) {
        C84117Wzp c84117Wzp = new C84117Wzp();
        c84117Wzp.LIZ = new C84122Wzu(f, f2);
        return this.LIZ.LIZLLL(c84117Wzp);
    }

    @Override // X.AbstractC84025WyL
    public final int slamProcessScaleEvent(float f, float f2) {
        C84117Wzp c84117Wzp = new C84117Wzp();
        c84117Wzp.LIZ = new C84123Wzv(f, f2);
        return this.LIZ.LIZLLL(c84117Wzp);
    }

    @Override // X.AbstractC84025WyL
    public final void startCameraPreview(P6Q p6q, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CAMERA_COST TERecorder startCameraPreview, isGLReady = ");
        LIZ.append(z);
        P4Q.LJFF("TERecorder", X1D.LIZIZ(LIZ));
        this.LJII = p6q;
        if (!z) {
            LIZIZ(p6q, true);
        } else {
            this.LIZIZ.LJIJJLI(1051, 0);
        }
    }

    @Override // X.AbstractC84025WyL
    public final int startPlayTrack(int i, int i2) {
        return this.LIZIZ.LJJIZ(-1L, i, i2, 0, false);
    }

    @Override // X.AbstractC84025WyL
    public final void startPreviewAsync(Surface surface, InterfaceC84052Wym interfaceC84052Wym) {
        TECamera tECamera = this.LIZJ;
        if (tECamera != null) {
            tECamera.setEnableCameraNotify(true);
        }
        C78866UxK.LJIJ("startPreviewAsync");
        this.LJIL = interfaceC84052Wym;
        C78866UxK.LJIJ("startPreview");
        int LJJJJIZL = this.LIZIZ.LJJJJIZL(surface);
        C78866UxK.LJJIIJ();
        synchronized (this.LJJIJLIJ) {
            VEVideoEncodeSettings vEVideoEncodeSettings = this.mVideoEncodeSettings;
            if (vEVideoEncodeSettings != null && this.LJJIJL == null) {
                VERecordMode vERecordMode = this.mVERecordMode;
                if (vERecordMode == VERecordMode.DUET) {
                    C84097WzV c84097WzV = new C84097WzV(this, this.mVEDuetSettings, vEVideoEncodeSettings.getVideoRes());
                    this.LJJIJL = c84097WzV;
                    c84097WzV.onCreate();
                    this.LJJIZ = EnumC84106Wze.CAM_WITH_VIDEO_TYPE_DUET;
                } else if (vERecordMode == VERecordMode.REACTION) {
                    C84096WzU c84096WzU = new C84096WzU(this, this.mVEReactSettings, this.mVideoEncodeSettings.getVideoRes());
                    this.LJJIJL = c84096WzU;
                    c84096WzU.onCreate();
                    this.LJJIZ = EnumC84106Wze.CAM_WITH_VIDEO_TYPE_REACTION;
                }
            }
        }
        C63868P4u.LJ(0, LJJJJIZL, "te_record_start_preview_ret");
        if (LJJJJIZL != 0) {
            this.LJIL.LIZ(LJJJJIZL);
            this.LJIL = null;
        }
        C78866UxK.LJJIIJ();
    }

    @Override // X.AbstractC84025WyL
    public final int startRecord(String str, float f) {
        if (TextUtils.isEmpty(str)) {
            P4Q.LJII("TERecorder", "Mp4 file path is null or empty.");
            return -100;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(VEFileUtils.getFilePathWithoutExtension(str));
        LIZ.append(".mp4");
        return LJIILLIIL(X1D.LIZIZ(LIZ), "", f, true);
    }

    @Override // X.AbstractC84025WyL
    public final void startRecordAsync(float f, InterfaceC84052Wym interfaceC84052Wym) {
        int LJIILLIIL = LJIILLIIL("", "", f, false);
        if (LJIILLIIL == 0 && this.mVERecordMode != VERecordMode.KARAOKE_PURE_AUDIO) {
            this.LJIIZILJ = interfaceC84052Wym;
        } else {
            if (interfaceC84052Wym == null) {
                return;
            }
            interfaceC84052Wym.LIZ(LJIILLIIL);
        }
    }

    @Override // X.AbstractC84025WyL
    public final int stopPrePlay(InterfaceC84052Wym interfaceC84052Wym, C84013Wy9 c84013Wy9) {
        this.LJJLJLI = true;
        if (LJIIJ()) {
            VEPrePlayParams vEPrePlayParams = new VEPrePlayParams();
            vEPrePlayParams.stopStrategy = 1;
            this.LIZIZ.LJJIIJ("PrePlayParams", C84093WzR.LJI(vEPrePlayParams));
        }
        TEBundle obtain = TEBundle.obtain();
        obtain.setBool("Sync", c84013Wy9.LIZ);
        obtain.setBool("RebuildTimeline", false);
        this.LIZIZ.LJJIIJ("PrePlayStopParams", obtain);
        this.LJIJI = interfaceC84052Wym;
        if (this.LJ.LJIILLIIL) {
            LJFF(true, false);
        }
        return this.LIZIZ.LJJJJLL();
    }

    @Override // X.AbstractC84025WyL
    public final void stopPreviewAsync(InterfaceC84052Wym interfaceC84052Wym, boolean z) {
        if (z) {
            this.LJIJJ = interfaceC84052Wym;
        }
        stopPreview(z);
    }

    @Override // X.AbstractC84025WyL
    public final boolean suspendGestureRecognizer(OOG oog, boolean z) {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 39);
        LIZJ.setInt("effectEngineType", 0);
        LIZJ.setInt("ProcessTouchEventType", oog.ordinal());
        LIZJ.setBool("Suspend", z);
        TEBundle obtain = TEBundle.obtain();
        x0g.LJLIL.callEffectInterfaceWithResult(LIZJ, obtain);
        boolean bool = obtain.getBool("suspendGestureRecognizerResult");
        obtain.recycle();
        return bool;
    }

    @Override // X.AbstractC84025WyL
    public final void switchSingleOrDualCamera(InterfaceC84100WzY interfaceC84100WzY, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("switchSingleOrDualCamera, isSingle = ");
        LIZ.append(z);
        C63922P6w.LIZLLL("TERecorder", X1D.LIZIZ(LIZ));
        this.LIZIZ.LJIJJLI(1093, !z ? 1 : 0);
    }

    @Override // X.AbstractC84025WyL
    public final void updateAlgorithmRuntimeParam(int i, float f) {
        X0G x0g = this.LIZ;
        x0g.getClass();
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 51);
        obtain.setInt("key", i);
        obtain.setFloat("value", f);
        x0g.LJLIL.callEffectInterface(obtain);
    }

    @Override // X.AbstractC84025WyL
    public final int processTouchEvent(float f, float f2) {
        C84117Wzp c84117Wzp = new C84117Wzp();
        c84117Wzp.LIZ = new C84121Wzt(f, f2);
        return this.LIZ.LIZLLL(c84117Wzp);
    }

    public final int LIZJ(int i, VETrackParams vETrackParams, boolean z) {
        TEBundle LIZ = C84093WzR.LIZ(vETrackParams);
        LIZ.setInt("TrackType", i);
        LIZ.setBool("UpdateTimeline", z);
        return this.LIZIZ.LJJIIJ("AddTrack", LIZ);
    }

    public final void LJIIJJI(int i, int i2, String str) {
        boolean z;
        Iterator<X0L> it = getRecorderStateExtListeners().iterator();
        while (it.hasNext()) {
            X0L next = it.next();
            if (VEInfo.TE_RECORD_INFO_ENGINE_START == i) {
                next.LJFF(i2);
                next.onInfo(i, i2, str);
                next.onInfo(1002, i2, str);
            } else if (VEInfo.TE_RECORD_INFO_VIDEO_HW_ENCODER_INIT == i) {
                int i3 = 1;
                if (i2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                next.LJI(z);
                if (i2 != 0) {
                    i3 = -1;
                }
                next.onInfo(1003, i3, "Init HardEncode");
            } else {
                next.onInfo(i, i2, str);
            }
        }
    }

    public final int LJIILIIL(int i, int i2, boolean z) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("TrackIndex", i2);
        obtain.setInt("TrackType", i);
        obtain.setBool("UpdateTimeline", z);
        return this.LIZIZ.LJJIIJ("RemoveTrack", obtain);
    }

    @Override // X.AbstractC84025WyL
    public final int changeSurface(Surface surface, int i, int i2) {
        LJIILJJIL(surface);
        return this.LIZIZ.LJJIIZ(i, i2, surface);
    }

    @Override // X.AbstractC84025WyL
    public final int changeSurfaceSync(Surface surface, int i, int i2) {
        LJIILJJIL(surface);
        return this.LIZIZ.LJJIIZI(i, i2, surface);
    }

    @Override // X.AbstractC84025WyL
    public final int[] checkComposerNodeExclusion(String str, String str2, String str3) {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 26);
        LIZJ.setInt("effectEngineType", 0);
        LIZJ.setString("newNodePath", str);
        LIZJ.setString("oldNodePath", str2);
        LIZJ.setString("nodeKey", str3);
        TEBundle obtain = TEBundle.obtain();
        x0g.LJLIL.callEffectInterfaceWithResult(LIZJ, obtain);
        int[] intArray = obtain.getIntArray("checkComposerNodeExclusionRet");
        obtain.recycle();
        return intArray;
    }

    @Override // X.AbstractC84025WyL
    public final int initFollowingShotWindow(String str, long j, long j2) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setString("FollowingShotFilePath", str);
        obtain.setLong("FollowingShotTrimIn", j);
        obtain.setLong("FollowingShotTrimOut", j2);
        return this.LIZIZ.LJJIIJ("initFollowingShotWindow", obtain);
    }

    @Override // X.AbstractC84025WyL
    public final int seekTrack(int i, int i2, long j) {
        return this.LIZIZ.LJJIZ(1000 * j, i, i2, 2, false);
    }

    @Override // X.AbstractC84025WyL
    public final void setCustomVideoBg(String str, String str2, String str3) {
        synchronized (this.LJJIJLIJ) {
            X02 x02 = this.LJJIJL;
            if (x02 != null && !(x02 instanceof C84089WzN)) {
                x02.onDestroy();
                this.LJJIJL = null;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                if (this.LJJIJL == null) {
                    C84089WzN c84089WzN = new C84089WzN(this, str, str2, str3);
                    this.LJJIJL = c84089WzN;
                    c84089WzN.onCreate();
                }
                ((C84089WzN) this.LJJIJL).LJIIJ(str, str2, str3);
                this.LJJIZ = EnumC84106Wze.CAM_WITH_VIDEO_TYPE_VIDEO_BG;
            } else {
                this.LJJIZ = EnumC84106Wze.CAM_WITH_VIDEO_TYPE_NORMAL;
                X02 x022 = this.LJJIJL;
                if (x022 != null) {
                    x022.onDestroy();
                }
                this.LJJIJL = null;
            }
        }
    }

    @Override // X.AbstractC84025WyL
    public final void setExternalFaceMakeupOpacity(String str, float f, float f2) {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 42);
        LIZJ.setInt("effectEngineType", 0);
        LIZJ.setString("path", str);
        LIZJ.setFloat("maleOpacity", f);
        LIZJ.setFloat("femaleOpacity", f2);
        x0g.LJLIL.callEffectInterface(LIZJ);
    }

    @Override // X.AbstractC84025WyL
    public final int setFaceMakeUp(String str, float f, float f2) {
        VEMakeUpFilterParam vEMakeUpFilterParam;
        int i;
        Pair pair = (Pair) ((HashMap) this.LJJIIJ).get(26);
        if (pair != null) {
            vEMakeUpFilterParam = (VEMakeUpFilterParam) pair.first;
            i = ((Integer) pair.second).intValue();
        } else {
            vEMakeUpFilterParam = new VEMakeUpFilterParam();
            i = -1;
        }
        if (str == null) {
            str = "";
        }
        vEMakeUpFilterParam.resPath = str;
        vEMakeUpFilterParam.lipIntensity = f;
        vEMakeUpFilterParam.blusherIntensity = f2;
        if (i >= 0) {
            this.LIZ.updateTrackFilterParam(i, vEMakeUpFilterParam);
        } else {
            i = this.LIZ.addTrackFilter(0, 0, vEMakeUpFilterParam, -1, -1);
        }
        if (pair == null) {
            pair = new Pair(vEMakeUpFilterParam, Integer.valueOf(i));
        }
        ((HashMap) this.LJJIIJ).put(26, pair);
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public final int setFaceReshape(String str, float f, float f2) {
        VEReshapeFilterParam vEReshapeFilterParam;
        int i;
        Pair pair = (Pair) ((HashMap) this.LJJIIJ).get(13);
        if (pair != null) {
            vEReshapeFilterParam = (VEReshapeFilterParam) pair.first;
            i = ((Integer) pair.second).intValue();
        } else {
            vEReshapeFilterParam = new VEReshapeFilterParam();
            i = -1;
        }
        if (str == null) {
            str = "";
        }
        vEReshapeFilterParam.resPath = str;
        vEReshapeFilterParam.eyeIntensity = f;
        vEReshapeFilterParam.cheekIntensity = f2;
        if (i >= 0) {
            this.LIZ.updateTrackFilterParam(i, vEReshapeFilterParam);
        } else {
            i = this.LIZ.addTrackFilter(0, 0, vEReshapeFilterParam, -1, -1);
        }
        if (pair == null) {
            pair = new Pair(vEReshapeFilterParam, Integer.valueOf(i));
        }
        ((HashMap) this.LJJIIJ).put(13, pair);
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public final int setFilter(String str, float f, boolean z) {
        VEColorFilterParam vEColorFilterParam;
        int i;
        Pair pair = (Pair) ((HashMap) this.LJJIIJ).get(7);
        if (pair != null) {
            vEColorFilterParam = (VEColorFilterParam) pair.first;
            i = ((Integer) pair.second).intValue();
        } else {
            vEColorFilterParam = new VEColorFilterParam();
            i = -1;
        }
        if (str == null) {
            str = "";
        }
        vEColorFilterParam.leftFilterPath = str;
        vEColorFilterParam.intensity = f;
        vEColorFilterParam.useFilterResIntensity = z;
        if (i >= 0) {
            this.LIZ.updateTrackFilterParam(i, vEColorFilterParam);
        } else {
            pair = new Pair(vEColorFilterParam, Integer.valueOf(this.LIZ.addTrackFilter(0, 0, vEColorFilterParam, -1, -1)));
        }
        ((HashMap) this.LJJIIJ).put(7, pair);
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public final int setLandscape(int i, int i2, int i3) {
        VESize vESize;
        int i4 = this.LJJJJL;
        if (i4 == i) {
            return 0;
        }
        int abs = Math.abs(i4 - i);
        if (abs == 90 || abs == 270) {
            vESize = new VESize(this.LJJJJJL.getRenderSize().height, this.LJJJJJL.getRenderSize().width);
        } else {
            vESize = this.LJJJJJL.getRenderSize();
        }
        int i5 = 360 - i;
        VEDisplaySettings.Builder builder = new VEDisplaySettings.Builder(this.LJJJJJL);
        builder.setRenderSize(vESize);
        builder.setEffectRotation(i5);
        builder.setTranslateX(i2);
        builder.setTranslateY(i3);
        setDisplaySettings(builder.build());
        C87278YNe c87278YNe = new C87278YNe(this.mVideoEncodeSettings);
        c87278YNe.LIZIZ.rotate = i5;
        changeVideoEncodeSettings(c87278YNe.LIZ());
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("FollowShotDegree", i);
        this.LIZIZ.LJJIIJ("SetFollowShotDegree", obtain);
        this.LJJJJL = i;
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public final void setSubSurface(Surface surface, int i, int i2) {
        this.LIZIZ.LJJJI(i, i2, surface);
    }

    @Override // X.AbstractC84025WyL
    public final int setTrackSpeed(int i, int i2, float f) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("TrackIndex", i);
        obtain.setInt("TrackType", i2);
        obtain.setFloat("TrackSpeed", f);
        return this.LIZIZ.LJJIIJ("TrackSpeed", obtain);
    }

    @Override // X.AbstractC84025WyL
    public final int startPlayTrack(int i, int i2, boolean z) {
        return this.LIZIZ.LJJIZ(-1L, i, i2, 0, z);
    }

    @Override // X.AbstractC84025WyL
    public final int startRecord(String str, String str2, float f) {
        return LJIILLIIL(str, str2, f, false);
    }

    @Override // X.AbstractC84025WyL
    public final int updateClipsTimelineParam(int i, int i2, java.util.Map<Integer, VEClipTimelineParam> map) {
        if (map == null || map.isEmpty()) {
            return -100;
        }
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("TrackIndex", i2);
        obtain.setInt("TrackType", i);
        int size = map.size();
        TEBundle[] tEBundleArr = new TEBundle[size];
        String[] strArr = new String[map.size()];
        int i3 = 0;
        for (Integer num : map.keySet()) {
            VEClipTimelineParam vEClipTimelineParam = map.get(num);
            TEBundle obtain2 = TEBundle.obtain();
            obtain2.setInt("TrimIn", vEClipTimelineParam.trimIn);
            obtain2.setInt("TrimOut", vEClipTimelineParam.trimOut);
            obtain2.setDouble("Speed", vEClipTimelineParam.speed);
            obtain2.setBool("IsReverseCurveSpeed", vEClipTimelineParam.isReverseCurveSpeed);
            obtain2.setFloatArray("CurveSpeedPointX", vEClipTimelineParam.curveSpeedPointX);
            obtain2.setFloatArray("CurveSpeedPointY", vEClipTimelineParam.curveSpeedPointY);
            obtain.setInt("ClipIndex", num.intValue());
            String valueOf = String.valueOf(num);
            obtain.setHandle(valueOf, obtain2.getHandle());
            tEBundleArr[i3] = obtain2;
            strArr[i3] = valueOf;
            i3++;
        }
        obtain.setStringArray("ClipIndexes", strArr);
        int LJJIIJ = this.LIZIZ.LJJIIJ("UpdateClipsTimelineParam", obtain);
        for (int i4 = 0; i4 < size; i4++) {
            tEBundleArr[i4].recycle();
        }
        return LJJIIJ;
    }

    @Override // X.AbstractC84025WyL
    public final int updateComposerNode(String str, String str2, float f) {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 14);
        LIZJ.setInt("effectEngineType", 0);
        LIZJ.setString("node path", str);
        LIZJ.setString("node tag", str2);
        LIZJ.setFloat("node value", f);
        return x0g.LJLIL.callEffectInterface(LIZJ);
    }

    @Override // X.AbstractC84025WyL
    public final void updateRotation(float f, float f2, float f3) {
        X0G x0g = this.LIZ;
        x0g.getClass();
        int i = (int) f3;
        if (i < 0) {
            P4Q.LJII(C84094WzS.LJLLI, "updateRotation failed, rotation < 0.");
            return;
        }
        if (i > 360) {
            i %= 360;
        }
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 22);
        obtain.setInt("effectEngineType", 0);
        obtain.setInt("effect orientation", i);
        x0g.LJLIL.callEffectInterface(obtain);
    }

    @Override // X.AbstractC84025WyL
    public final int updateTrack(int i, int i2, VETrackParams vETrackParams) {
        return LJIIZILJ(i, i2, vETrackParams, false);
    }

    @Override // X.AbstractC84025WyL
    public final void setFilter(String str, String str2, float f) {
        VEColorFilterParam vEColorFilterParam;
        int i;
        Pair pair = (Pair) ((HashMap) this.LJJIIJ).get(7);
        if (pair != null) {
            vEColorFilterParam = (VEColorFilterParam) pair.first;
            i = ((Integer) pair.second).intValue();
        } else {
            vEColorFilterParam = new VEColorFilterParam();
            i = -1;
        }
        if (str == null) {
            str = "";
        }
        vEColorFilterParam.leftFilterPath = str;
        vEColorFilterParam.rightFilterPath = str2;
        vEColorFilterParam.position = f;
        if (i >= 0) {
            this.LIZ.updateTrackFilterParam(i, vEColorFilterParam);
        } else {
            pair = new Pair(vEColorFilterParam, Integer.valueOf(this.LIZ.addTrackFilter(0, 0, vEColorFilterParam, -1, -1)));
        }
        ((HashMap) this.LJJIIJ).put(7, pair);
    }

    public final void LJI(int i, int i2, float f, String str) {
        int i3;
        if (i == 1000 || i == 1001 || i == VEInfo.TE_INFO_EFFECT_INIT || i == VEInfo.TE_INFO_DUET_DST_SIZE || i == VEInfo.TE_INFO_MULTIPLE_TRACK_EOF || i == (i3 = VEInfo.TE_INFO_DELETE_LAST_FRAG_DONE_NOTIFY) || i == VEInfo.TE_INFO_PREVIEW_FIRST_FRAME_SCREEN) {
            LJIIJJI(i, i2, str);
            return;
        }
        if (i == VEInfo.TE_RECORD_INFO_ENGINE_START) {
            if (i2 != -124) {
                LJIIJJI(i, i2, str);
            }
            InterfaceC84052Wym interfaceC84052Wym = this.LJIL;
            if (interfaceC84052Wym == null) {
                return;
            }
            interfaceC84052Wym.LIZ(i2);
            this.LJIL = null;
            return;
        }
        if (i == VEInfo.TE_RECORD_INFO_VIDEO_HW_ENCODER_INIT || i == VEInfo.TE_RECORD_INFO_VIDEO_SW_ENCODER_INIT) {
            LJIIJJI(i, i2, str);
            return;
        }
        if (i == VEInfo.TE_RECORD_INFO_ENGINE_STOP) {
            InterfaceC84052Wym interfaceC84052Wym2 = this.LJIJJ;
            if (interfaceC84052Wym2 != null) {
                interfaceC84052Wym2.LIZ(0);
                this.LJIJJ = null;
            }
            TEMonitorInvoker.nativeMonitorPerfWithType(0);
            return;
        }
        if (i == i3) {
            InterfaceC84052Wym interfaceC84052Wym3 = this.LJJ;
            if (interfaceC84052Wym3 == null) {
                return;
            }
            interfaceC84052Wym3.LIZ(i2);
            return;
        }
        if (i == VEInfo.TE_INFO_CLEAR_ALL_FRAG_DONE_NOTIFY) {
            return;
        }
        if (i == VEInfo.TE_INFO_PREVIEW_DISPLAY_CHANGED) {
            LJIIJJI(1053, i2, str);
            return;
        }
        if (i == VEInfo.TE_INFO_CHANGE_SURFACE) {
            LJIIJJI(1071, i2, str);
            return;
        }
        if (i == VEInfo.INFO_TITAN_START_RECORD_FIRST_FRAME) {
            LJIIJJI(1080, i2, str);
            return;
        }
        if (i == VEInfo.TE_INFO_RECORD_REACH_MAX_DURATION) {
            LJIIJJI(1054, i2, str);
            return;
        }
        if (i == 1022 || i == 1061) {
            return;
        }
        if (i == 1050) {
            LJIIJJI(1050, i2, String.valueOf(System.currentTimeMillis()));
            return;
        }
        if (i == VEInfo.TE_RECORD_INFO_MIC_AUDIO_DELAY || i == VEInfo.TE_RECORD_INFO_MIC_AUDIO_DELAY_RET) {
            LJIIJJI(i, i2, "");
            return;
        }
        int i4 = VEInfo.TE_INFO_PREVIEW_FIRST_FAKE_FRAME;
        if (i == i4) {
            LJIIJJI(i4, i2, str);
            return;
        }
        if (i == VEInfo.TE_RECORD_INFO_ENGINE_START_RENDER) {
            InterfaceC84052Wym interfaceC84052Wym4 = this.LJJIFFI;
            if (interfaceC84052Wym4 == null) {
                return;
            }
            interfaceC84052Wym4.LIZ(0);
            this.LJJIFFI = null;
            return;
        }
        if (i == VEInfo.TE_MSG_MEDIA_ENGINE_RELEASE_GPU_RESOURCE) {
            InterfaceC84052Wym interfaceC84052Wym5 = this.LJJII;
            if (interfaceC84052Wym5 == null) {
                return;
            }
            interfaceC84052Wym5.LIZ(0);
            this.LJJII = null;
            return;
        }
        if (i == VEInfo.TE_RECORD_INFO_ENGINE_PAUSE_RENDER) {
            InterfaceC84052Wym interfaceC84052Wym6 = this.LJJI;
            if (interfaceC84052Wym6 == null) {
                return;
            }
            interfaceC84052Wym6.LIZ(0);
            this.LJJI = null;
            return;
        }
        int i5 = VEInfo.TE_MSG_EFFECT_EXPORT_RES_DONE;
        if (i == i5) {
            LJIIJJI(i5, i2, str);
            return;
        }
        if (i == VEInfo.TE_MSG_AUDIO_GLITCH_HAPPEN) {
            this.LJJZ.LIZ++;
        } else {
            if (i != VEInfo.TE_MSG_AUDIO_GLITCH_INFO) {
                return;
            }
            C168396jD c168396jD = this.LJJZ;
            c168396jD.LIZJ = (int) f;
            c168396jD.LIZIZ = i2;
        }
    }

    public final void LJIIL(int i, int i2, float f, String str) {
        ArrayList arrayList;
        synchronized (this.LJIILJJIL) {
            arrayList = new ArrayList(this.LJIILIIL);
            InterfaceC133905Ni interfaceC133905Ni = this.LJIIL;
            if (interfaceC133905Ni != null) {
                arrayList.add(interfaceC133905Ni);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC133905Ni interfaceC133905Ni2 = (InterfaceC133905Ni) it.next();
            if (interfaceC133905Ni2 != null) {
                interfaceC133905Ni2.LIZ(i, i2, f, str);
            }
        }
    }

    public final int LJIILLIIL(String str, String str2, float f, boolean z) {
        long j;
        VEAudioCaptureSettings vEAudioCaptureSettings;
        File file = new File(C79061V1d.LJ(this.LJ.LIZ, 1, 0));
        if (!file.exists()) {
            if (!file.mkdirs()) {
                return -114;
            }
            P4Q.LJFF("TERecorder", "Record dir doesn't exists, create it successfully.");
        }
        if (z) {
            C84099WzX c84099WzX = this.LJ;
            c84099WzX.LIZIZ = str;
            c84099WzX.LIZJ = str;
            if (!((LinkedList) c84099WzX.LIZLLL).offer(str) || !((LinkedList) this.LJ.LJ).offer(str)) {
                P4Q.LIZJ("TERecorder", "add video path or audio error.");
            }
            this.LIZIZ.LJJJ("VideoPath", str);
            this.LIZIZ.LJJJ("AudioPath", str);
        } else if (!str.isEmpty() && !str2.isEmpty()) {
            C84099WzX c84099WzX2 = this.LJ;
            c84099WzX2.LIZIZ = str;
            c84099WzX2.LIZJ = str2;
            if (!((LinkedList) c84099WzX2.LIZLLL).offer(str) || !((LinkedList) this.LJ.LJ).offer(str2)) {
                P4Q.LIZJ("TERecorder", "add video path or audio error.");
            }
            this.LIZIZ.LJJJ("VideoPath", str);
            this.LIZIZ.LJJJ("AudioPath", str2);
        }
        synchronized (this.LJJIJLIJ) {
            X02 x02 = this.LJJIJL;
            if (x02 != null && (x02 instanceof C84089WzN)) {
                TEBundle.obtain();
                this.LIZIZ.LJJIII("VideoBGProxyAudioLoop", true);
                ((C84089WzN) this.LJJIJL).LJIILJJIL(this.LJJIII, this.mBgmPath);
            }
        }
        if (LJIIIZ() && (vEAudioCaptureSettings = this.LJJJI) != null) {
            TEBundle obtain = TEBundle.obtain();
            obtain.setInt("SampleRate", vEAudioCaptureSettings.getSampleRate());
            obtain.setInt("Channels", vEAudioCaptureSettings.getChannel());
            obtain.setInt("FramesPerBuffer", vEAudioCaptureSettings.getFramesPerBuffer());
            obtain.setInt("BitsPerSample", vEAudioCaptureSettings.getBitSamples());
            this.LIZIZ.LJJIIJ("CaptureSettings", obtain);
        }
        if (this.mAttachAudioFromOther) {
            TERecorderInterface tERecorderInterface = this.LIZIZ;
            TEAudioDataInterface tEAudioDataInterface = this.LJJJ;
            if (tEAudioDataInterface != null) {
                j = tEAudioDataInterface.getHandle();
            } else {
                j = 0;
            }
            tERecorderInterface.LJJIJIL("AudioDataInterface", j);
        }
        if (this.LJ.LJIILL && !this.LJIIIIZZ.isEnableRenderLayer()) {
            VEAudioSpeedFilterParam vEAudioSpeedFilterParam = new VEAudioSpeedFilterParam();
            vEAudioSpeedFilterParam.speed = f;
            int i = this.LJJIJ;
            if (i < 0) {
                this.LJJIJ = this.LIZ.addTrackFilter(1, 0, vEAudioSpeedFilterParam, 0, -1);
            } else {
                this.LIZ.updateTrackFilterParam(i, vEAudioSpeedFilterParam);
            }
        }
        synchronized (this.LJJIJLIJ) {
            X02 x022 = this.LJJIJL;
            if (x022 != null && (x022 instanceof C84089WzN)) {
                this.LIZIZ.LJJIII("freezeAudioClock", true);
            }
        }
        int LJJJJJ = this.LIZIZ.LJJJJJ(f);
        synchronized (this.LJJIJLIJ) {
            if (LJJJJJ == 0) {
                X02 x023 = this.LJJIJL;
                if (x023 != null) {
                    x023.LIZLLL(f);
                }
            }
        }
        C63868P4u.LJ(0, 1L, "te_titan_engine");
        C63868P4u.LJ(0, this.LJJIZ.ordinal(), "te_record_type");
        C63868P4u.LJ(0, LJJJJJ, "te_record_start_record_ret");
        return LJJJJJ;
    }

    public final int LJIIZILJ(int i, int i2, VETrackParams vETrackParams, boolean z) {
        TEBundle LIZ = C84093WzR.LIZ(vETrackParams);
        LIZ.setInt("TrackIndex", i2);
        LIZ.setInt("TrackType", i);
        LIZ.setBool("UpdateTimeline", z);
        return this.LIZIZ.LJJIIJ("UpdateTrack", LIZ);
    }

    @Override // X.AbstractC84025WyL
    public final int alignTo(int i, int i2, int i3, int i4) {
        return this.LIZIZ.LIZ(i, i2, i3, i4);
    }

    @Override // X.AbstractC84025WyL
    public final void clearDisplayColor(int i, int i2, int i3, int i4) {
        this.LIZIZ.LIZJ(i / 255.0f, i2 / 255.0f, i3 / 255.0f, i4 / 255.0f);
    }

    @Override // X.AbstractC84025WyL
    public final void notifyFollowShotSurfaceChanged(Surface surface, int i, int i2, boolean z) {
        this.LIZIZ.LJIIZILJ(surface, i, i2, z);
    }

    @Override // X.AbstractC84025WyL
    public final void notifySurfaceChanged(int i, int i2, int i3, boolean z) {
        this.LIZIZ.LJIJ(i, i2, i3, z);
    }

    @Override // X.AbstractC84025WyL
    public final int replaceComposerNodes(String[] strArr, int i, String[] strArr2, int i2) {
        X0G x0g = this.LIZ;
        x0g.getClass();
        if (i2 <= 0 || i != strArr.length || i2 != strArr2.length) {
            return -100;
        }
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 19);
        obtain.setInt("effectEngineType", 0);
        obtain.setStringArray("node paths old", strArr);
        obtain.setStringArray("node paths new", strArr2);
        return x0g.LJLIL.callEffectInterface(obtain);
    }

    @Override // X.AbstractC84025WyL
    public final void sendEffectMsg(int i, long j, long j2, String str) {
        synchronized (this.LJFF) {
            if (this.LJ.LJFF == 0) {
                P4Q.LJII("TERecorder", "sendEffectMsg failed. TERecorder instance is destroying");
                return;
            }
            X0G x0g = this.LIZ;
            x0g.getClass();
            TEBundle obtain = TEBundle.obtain();
            obtain.setInt("effectInterfaceName", 24);
            obtain.setInt("MsgID", i);
            obtain.setLong("ARG1", j);
            obtain.setLong("ARG2", j2);
            obtain.setString("ARG3", str);
            x0g.LJLIL.callEffectInterface(obtain);
        }
    }

    @Override // X.AbstractC84025WyL
    public final void setBackground(int i, int i2, int i3, int i4) {
        this.LIZIZ.LJJII(i / 255.0f, i2 / 255.0f, i3 / 255.0f, i4 / 255.0f);
    }

    @Override // X.AbstractC84025WyL
    public final void setFocus(float f, float f2, int i, int i2) {
        setFocus(new C84040Wya((int) f, (int) f2, i, i2, this.mContext.getResources().getDisplayMetrics().density).LIZ);
    }

    @Override // X.AbstractC84025WyL
    public final void setFollowingShotWindowsBackground(int i, int i2, int i3, int i4) {
        this.LIZIZ.LJJIJIIJI(i / 255.0f, i2 / 255.0f, i3 / 255.0f, i4 / 255.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        if (r3 != null) goto L26;
     */
    @Override // X.AbstractC84025WyL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setPreviewRatio(int r13, float r14, com.ss.android.vesdk.VESize r15, com.ss.android.vesdk.VESize r16) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84092WzQ.setPreviewRatio(int, float, com.ss.android.vesdk.VESize, com.ss.android.vesdk.VESize):void");
    }

    @Override // X.AbstractC84025WyL
    public final int setRecordBGM(String str, long j, long j2, int i) {
        boolean z;
        if (getRecordStatus() == 3 || getCurRecordMode() == VERecordMode.DUET) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setRecordBGM failed. Current record mode is ");
            LIZ.append(getCurRecordMode());
            P4Q.LIZJ("TERecorder", X1D.LIZIZ(LIZ));
            return -105;
        }
        if (!this.LJJLJLI) {
            P4Q.LIZJ("TERecorder", "setRecordBGM could not be executed, after startPrePlay");
            return -105;
        }
        super.setRecordBGM(str, j, j2, i);
        if (TextUtils.isEmpty(str)) {
            TEBundle obtain = TEBundle.obtain();
            int i2 = this.LJJIII;
            if (i2 >= 0) {
                obtain.setInt("TrackIndex", i2);
                obtain.setInt("TrackType", 1);
                int LJJIIJ = this.LIZIZ.LJJIIJ("RemoveTrack", obtain);
                if (LJJIIJ == 0) {
                    synchronized (this.LJJIJLIJ) {
                        X02 x02 = this.LJJIJL;
                        if (x02 != null && (x02 instanceof C84089WzN)) {
                            this.LIZIZ.LJJIII("FocusSingleAudioTrack", true);
                            ((C84089WzN) this.LJJIJL).LJIIL(this.LJJIII);
                        }
                    }
                    this.LJJIII = -1;
                }
                if (this.LJ.LJIILL) {
                    if (!C65429Pm5.LJFF("ve_enable_recorder_simply_project", false)) {
                        alignTo(this.LJJIII, 1, -1, 0);
                    } else {
                        alignTo(this.LJJIII, 1, -1, -1);
                    }
                }
                return LJJIIJ;
            }
        }
        if (LJIIJ()) {
            this.LIZIZ.LJJIII("FocusSingleAudioTrack", false);
        }
        ArrayList LIZIZ = C05040Hs.LIZIZ(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf((int) j));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf((int) j2));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(Double.valueOf(1.0d));
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        TEBundle obtain2 = TEBundle.obtain();
        obtain2.setInt("TrackIndex", this.LJJIII);
        obtain2.setInt("TrackType", 1);
        obtain2.setStringArray("Paths", TEArrayUtils.toStringArray(LIZIZ));
        obtain2.setIntArray("TrimIns", TEArrayUtils.toIntArray(arrayList));
        obtain2.setIntArray("TrimOuts", TEArrayUtils.toIntArray(arrayList2));
        obtain2.setDoubleArray("Speeds", TEArrayUtils.toDoubleArray(arrayList3));
        obtain2.setBool("Loop", z);
        int LJJIIJ2 = this.LIZIZ.LJJIIJ("AudioStreamInfo", obtain2);
        this.LJJIII = LJJIIJ2;
        if (this.LJ.LJIILL) {
            alignTo(LJJIIJ2, 1, 1, 0);
        }
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public final void setScanArea(float f, float f2, float f3, float f4) {
        this.LIZ.getClass();
        P4Q.LIZ("VEEffect", "Not supported yet.");
    }

    @Override // X.AbstractC84025WyL
    public final int slamDeviceConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 23);
        LIZJ.setInt("effectEngineType", 0);
        LIZJ.setBool("slamDeviceConfig", true);
        LIZJ.setBool("hasAcc", z);
        LIZJ.setBool("hasGyr", z2);
        LIZJ.setBool("hasGravity", z3);
        LIZJ.setBool("hasOrientation", z4);
        x0g.LJLIL.callEffectInterface(LIZJ);
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public final int slamProcessIngestAcc(double d, double d2, double d3, double d4) {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 23);
        LIZJ.setInt("effectEngineType", 0);
        LIZJ.setBool("slamProcessIngestAcc", true);
        LIZJ.setDouble("ax", d);
        LIZJ.setDouble("ay", d2);
        LIZJ.setDouble("az", d3);
        LIZJ.setDouble("timestamp", d4);
        x0g.LJLIL.callEffectInterface(LIZJ);
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public final int slamProcessIngestGra(double d, double d2, double d3, double d4) {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 23);
        LIZJ.setInt("effectEngineType", 0);
        LIZJ.setBool("slamProcessIngestGra", true);
        LIZJ.setDouble("gax", d);
        LIZJ.setDouble("gay", d2);
        LIZJ.setDouble("gaz", d3);
        LIZJ.setDouble("timestamp", d4);
        x0g.LJLIL.callEffectInterface(LIZJ);
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public final int slamProcessIngestGyr(double d, double d2, double d3, double d4) {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 23);
        LIZJ.setInt("effectEngineType", 0);
        LIZJ.setBool("slamProcessIngestGyr", true);
        LIZJ.setDouble("grx", d);
        LIZJ.setDouble("gry", d2);
        LIZJ.setDouble("grz", d3);
        LIZJ.setDouble("timestamp", d4);
        x0g.LJLIL.callEffectInterface(LIZJ);
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public final int slamProcessTouchEventByType(int i, float f, float f2, int i2) {
        EnumC84109Wzh enumC84109Wzh;
        if (i == 0) {
            enumC84109Wzh = EnumC84109Wzh.TOUCH_DOWN;
        } else if (i == 1) {
            enumC84109Wzh = EnumC84109Wzh.PAN;
        } else if (i == 2) {
            enumC84109Wzh = EnumC84109Wzh.TOUCH_UP;
        } else if (i == 3) {
            enumC84109Wzh = EnumC84109Wzh.TOUCH_LONG;
        } else {
            return -100;
        }
        EnumC84108Wzg enumC84108Wzg = EnumC84108Wzg.values()[i2];
        C84117Wzp c84117Wzp = new C84117Wzp();
        c84117Wzp.LIZ = new C84124Wzw(enumC84109Wzh, enumC84108Wzg, f, f2);
        return this.LIZ.LIZLLL(c84117Wzp);
    }

    @Override // X.AbstractC84025WyL
    public final int slamSetInputText(String str, int i, int i2, String str2) {
        X0G x0g = this.LIZ;
        x0g.getClass();
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 100);
        obtain.setString("InputText", str);
        obtain.setInt("Arg1", i);
        obtain.setInt("Arg2", i2);
        obtain.setString("Arg3", str2);
        return x0g.LJLIL.callEffectInterface(obtain);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC84025WyL
    public final int tryRestore(List<C84014WyA> list, String str, int i, int i2) {
        setRecordBGM(str, i, 2147483647L, i2);
        int size = list.size();
        String[] strArr = new String[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        double[] dArr = new double[size];
        for (int i3 = 0; i3 < size; i3++) {
            if (this.LJ.LIZLLL.isEmpty() || this.LJ.LJ.isEmpty()) {
                StringBuilder LIZ = X1D.LIZ();
                C0EH.LIZLLL(LIZ, this.LJ.LIZ, "/", i3, "_frag_v");
                strArr[i3] = X1D.LIZIZ(LIZ);
            } else {
                strArr[i3] = ((LinkedList) this.LJ.LIZLLL).poll();
            }
            iArr[i3] = 0;
            iArr2[i3] = (int) ((C84014WyA) ListProtector.get(list, i3)).LIZ;
            dArr[i3] = ((C84014WyA) ListProtector.get(list, i3)).LIZIZ;
        }
        TEBundle obtain = TEBundle.obtain();
        obtain.setStringArray("Paths", strArr);
        obtain.setIntArray("TrimIns", iArr);
        obtain.setIntArray("TrimOuts", iArr2);
        obtain.setDoubleArray("Speeds", dArr);
        obtain.setInt("TrackType", 0);
        this.LIZIZ.LJJIIJ("FillRecordedClips", obtain);
        String[] strArr2 = new String[size];
        for (int i4 = 0; i4 < size; i4++) {
            if (this.LJ.LIZLLL.isEmpty() || this.LJ.LJ.isEmpty()) {
                StringBuilder LIZ2 = X1D.LIZ();
                C0EH.LIZLLL(LIZ2, this.LJ.LIZ, "/", i4, "_frag_a");
                strArr2[i4] = X1D.LIZIZ(LIZ2);
            } else {
                strArr2[i4] = ((LinkedList) this.LJ.LJ).poll();
            }
        }
        TEBundle obtain2 = TEBundle.obtain();
        obtain2.setStringArray("Paths", strArr2);
        obtain2.setIntArray("TrimIns", iArr);
        obtain2.setIntArray("TrimOuts", iArr2);
        obtain2.setDoubleArray("Speeds", dArr);
        obtain2.setInt("TrackType", 1);
        this.LIZIZ.LJJIIJ("FillRecordedClips", obtain2);
        int LJJJLZIJ = this.LIZIZ.LJJJLZIJ();
        synchronized (this.LJJIJLIJ) {
            X02 x02 = this.LJJIJL;
            if (x02 != null) {
                x02.LJ();
            }
        }
        return LJJJLZIJ;
    }

    @Override // X.AbstractC84025WyL
    public final int updateMultiComposerNodes(int i, String[] strArr, String[] strArr2, float[] fArr) {
        X0G x0g = this.LIZ;
        TEBundle LIZJ = Q7K.LIZJ(x0g, "effectInterfaceName", 36);
        LIZJ.setInt("effectEngineType", 0);
        LIZJ.setInt("node num", i);
        LIZJ.setStringArray("node paths", strArr);
        LIZJ.setStringArray("node keys", strArr2);
        LIZJ.setFloatArray("values", fArr);
        return x0g.LJLIL.callEffectInterface(LIZJ);
    }

    @Override // X.AbstractC84025WyL
    public final void useAudioGraphOutput(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        C84099WzX c84099WzX = this.LJ;
        c84099WzX.LJIILLIIL = z2;
        boolean z6 = true;
        if (z2) {
            c84099WzX.LJIILL = true;
            this.LIZIZ.LJJIII("EnableAudioGraphRefactor", true);
        } else {
            boolean LJFF = C65429Pm5.LJFF("ve_enable_titan_audio_graph_refactor", false);
            boolean LJFF2 = C65429Pm5.LJFF("ve_enable_lv_audio_graph_refactor", false);
            C84099WzX c84099WzX2 = this.LJ;
            if (LJFF || LJFF2) {
                z5 = true;
            } else {
                z5 = false;
            }
            c84099WzX2.LJIILL = z5;
            this.LIZIZ.LJJIII("EnableAudioGraphRefactor", z5);
            stopAudioRecorder(null);
            enableAudioRecorder(false, null);
        }
        LJFF(z2, z4);
        TEBundle obtain = TEBundle.obtain();
        obtain.setBool("UseAudioGraph", z2);
        obtain.setBool("UseOutPut", z);
        obtain.setBool("UseMicIn", z3);
        obtain.setBool("UseBgm", z4);
        this.LIZIZ.LJJIIJ("AudioGraphParam", obtain);
        TERecorderInterface tERecorderInterface = this.LIZIZ;
        if (z2 && !z3) {
            z6 = false;
        }
        tERecorderInterface.LJJIII("UseMicIn", z6);
    }

    @Override // X.AbstractC84025WyL
    public final void capture(int i, boolean z, boolean z2, InterfaceC84058Wys interfaceC84058Wys, InterfaceC84057Wyr interfaceC84057Wyr) {
        InterfaceC84100WzY interfaceC84100WzY = this.LJI;
        if (interfaceC84100WzY != null) {
            interfaceC84100WzY.LJIIIZ(new X07(this, z, z2));
            return;
        }
        throw new IllegalStateException("No Camera capture to capture");
    }

    @Override // X.AbstractC84025WyL
    public final int concat(String str, String str2, int i, String str3, String str4) {
        return concat(str, str2, i, str3, str4, -1);
    }

    @Override // X.AbstractC84025WyL
    public final int init(VECameraSettings vECameraSettings, VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, String str, String str2) {
        throw new UnsupportedOperationException("Not supported yet in TERecorder");
    }

    @Override // X.AbstractC84025WyL
    public final void renderFrame(Bitmap bitmap, int i, int i2, boolean z, InterfaceC84064Wyy interfaceC84064Wyy) {
        VEFrame createByteBufferFrame = VEFrame.createByteBufferFrame(bitmap, 0L);
        X0B x0b = new X0B();
        EnumC63969P8r enumC63969P8r = EnumC63969P8r.RENDER_PICTURE_MODE;
        C84098WzW c84098WzW = x0b.LIZ;
        c84098WzW.LIZ = enumC63969P8r;
        c84098WzW.LJFF = true;
        c84098WzW.LJ = EnumC63956P8e.FULL_EFFECT;
        c84098WzW.LJI = EnumC78791Uw7.CENTER_CROP;
        VESize vESize = new VESize(i, i2);
        C84098WzW c84098WzW2 = x0b.LIZ;
        c84098WzW2.LIZIZ = vESize;
        ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        TECameraFrameSetting tECameraFrameSetting = new TECameraFrameSetting(allocate.array(), allocate.capacity(), createByteBufferFrame.getWidth(), createByteBufferFrame.getHeight(), createByteBufferFrame.getRotation(), P6Z.TEPixFmt_ARGB8.ordinal());
        this.LJIIIZ = tECameraFrameSetting;
        this.LIZIZ.LJJI(tECameraFrameSetting, c84098WzW2);
    }

    @Override // X.AbstractC84025WyL
    public final void setFilterNew(String str, String str2, float f, float f2, float f3) {
        VEColorFilterParam vEColorFilterParam;
        int i;
        Pair pair = (Pair) ((HashMap) this.LJJIIJ).get(7);
        if (pair != null) {
            vEColorFilterParam = (VEColorFilterParam) pair.first;
            i = ((Integer) pair.second).intValue();
        } else {
            vEColorFilterParam = new VEColorFilterParam();
            i = -1;
        }
        if (str == null) {
            str = "";
        }
        vEColorFilterParam.leftFilterPath = str;
        if (str2 == null) {
            str2 = "";
        }
        vEColorFilterParam.rightFilterPath = str2;
        vEColorFilterParam.position = f;
        vEColorFilterParam.intensity = f2;
        vEColorFilterParam.rightIntensity = f3;
        vEColorFilterParam.useFilterV3 = true;
        if (i >= 0) {
            this.LIZ.updateTrackFilterParam(i, vEColorFilterParam);
        } else {
            pair = new Pair(vEColorFilterParam, Integer.valueOf(this.LIZ.addTrackFilter(0, 0, vEColorFilterParam, -1, -1)));
        }
        ((HashMap) this.LJJIIJ).put(7, pair);
    }

    @Override // X.AbstractC84025WyL
    public final int shotScreen(int i, int i2, boolean z, boolean z2, InterfaceC63955P8d interfaceC63955P8d) {
        boolean z3;
        EnumC63956P8e enumC63956P8e;
        Bitmap bitmap = null;
        if (this.LJJIJIL.get()) {
            P4Q.LJII("TERecorder", "Last screenshot not complete");
            interfaceC63955P8d.LIZ(-1, null);
            return -1;
        }
        if (this.LJIIIIZZ.isSyncCapture() || VEConfigCenter.getInstance().getValue("ve_titan_shot_screen_opt", 0) != 0) {
            z3 = true;
            bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        } else {
            z3 = false;
        }
        this.LJJIJIL.set(true);
        P8Z p8z = new P8Z(this, System.currentTimeMillis(), z3, bitmap, interfaceC63955P8d);
        EnumC84113Wzl enumC84113Wzl = EnumC84113Wzl.NO_MIRROR;
        int i3 = this.LJJLIIIJLLLLLLLZ;
        if (i3 != 0) {
            if (i3 == 1) {
                enumC84113Wzl = EnumC84113Wzl.X_MIRROR;
            } else if (i3 == 2) {
                enumC84113Wzl = EnumC84113Wzl.Y_MIRROR;
            }
        }
        X0B x0b = new X0B();
        EnumC63969P8r enumC63969P8r = EnumC63969P8r.NORMAL_GET_FRAME_MODE;
        C84098WzW c84098WzW = x0b.LIZ;
        c84098WzW.LIZ = enumC63969P8r;
        c84098WzW.LJFF = z;
        if (z2) {
            enumC63956P8e = EnumC63956P8e.FULL_EFFECT;
        } else {
            enumC63956P8e = EnumC63956P8e.NO_EFFECT;
        }
        c84098WzW.LJ = enumC63956P8e;
        c84098WzW.LJI = EnumC78791Uw7.CENTER_CROP;
        VESize vESize = new VESize(i, i2);
        C84098WzW c84098WzW2 = x0b.LIZ;
        c84098WzW2.LIZIZ = vESize;
        c84098WzW2.LJIIIIZZ = enumC84113Wzl;
        c84098WzW2.LJII = p8z;
        c84098WzW2.LJIJ = bitmap;
        c84098WzW2.LJIIJJI = this.LJJJJI;
        return getPreviewFrame(c84098WzW2);
    }

    @Override // X.AbstractC84025WyL
    public final int slamProcessPanEvent(float f, float f2, float f3, float f4, float f5) {
        C84117Wzp c84117Wzp = new C84117Wzp();
        c84117Wzp.LIZ = new C84120Wzs(f, f2, f3, f4, f5);
        return this.LIZ.LIZLLL(c84117Wzp);
    }

    @Override // X.AbstractC84025WyL
    public final void tryRestoreAsync(List<C84014WyA> list, String str, int i, int i2, InterfaceC84052Wym interfaceC84052Wym) {
        this.LJIJJLI = interfaceC84052Wym;
        this.LJJIIJZLJL.execute(new RunnableC84115Wzn(this, list, str, i, i2));
    }

    @Override // X.AbstractC84025WyL
    public final int[] updateReactionRegion(int i, int i2, int i3, int i4, float f) {
        P4Q.LJFF("TERecorder", "updateReactionRegion");
        VESize videoRes = this.mVideoEncodeSettings.getVideoRes();
        return new int[]{i, i2, i3, i4, 0, 0, videoRes.width, videoRes.height};
    }

    @Override // X.AbstractC84025WyL
    public final int concat(String str, String str2, int i, String str3, String str4, int i2) {
        boolean z;
        if (this.LIZIZ.LJIILLIIL()) {
            C63868P4u.LJ(0, -105L, "te_record_concat_ret");
            return -105;
        }
        AbstractC84033WyT abstractC84033WyT = this.mResManager;
        if (this.LJIIJJI && this.LJ.LJJII != EnumC84112Wzk.ENABLE) {
            z = true;
        } else {
            z = false;
        }
        VERecordData create = VERecordData.create(abstractC84033WyT, z);
        if (create == null) {
            return -100;
        }
        int size = create.getSegmentData().size();
        if (size <= 0) {
            P4Q.LIZJ("VEUtils", "frag count is 0");
            C63868P4u.LJ(0, -100L, "te_record_concat_ret");
            return -100;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        int i3 = 0;
        do {
            strArr[i3] = ((VERecordData.VERecordSegmentData) ListProtector.get(create.getSegmentData(), i3)).mVideo;
            jArr2[i3] = ((VERecordData.VERecordSegmentData) ListProtector.get(create.getSegmentData(), i3)).mVideoLength;
            strArr2[i3] = ((VERecordData.VERecordSegmentData) ListProtector.get(create.getSegmentData(), i3)).mAudio;
            jArr[i3] = ((VERecordData.VERecordSegmentData) ListProtector.get(create.getSegmentData(), i3)).mAudioLength;
            i3++;
        } while (i3 < size);
        create.concatVideo = str;
        create.concatAudio = str2;
        int concatRecordFrag = TEVideoUtils.concatRecordFrag(strArr, jArr2, strArr2, jArr, create.isUseMusic(), 0, str3, str4, create.concatVideo, create.concatAudio);
        C63868P4u.LJ(0, concatRecordFrag, "te_record_concat_ret");
        C63868P4u.LJ(0, System.currentTimeMillis() - currentTimeMillis, "te_record_concat_time");
        return concatRecordFrag;
    }

    @Override // X.AbstractC84025WyL
    public final int init(VECameraSettings vECameraSettings, VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, VEPreviewSettings vEPreviewSettings, String str, String str2) {
        C84133X0f c84133X0f = new C84133X0f();
        c84133X0f.LJLJL = this.mCameraStateListener;
        c84133X0f.LJJIIJZLJL(this.mContext, vECameraSettings);
        return init((InterfaceC84100WzY) c84133X0f, vEVideoEncodeSettings, vEAudioEncodeSettings, vEPreviewSettings, str, str2, false);
    }

    @Override // X.AbstractC84025WyL
    public final int shotScreen(int i, int i2, boolean z, boolean z2, VERecorder.IVEFrameShotScreenCallback iVEFrameShotScreenCallback, boolean z3) {
        EnumC63956P8e enumC63956P8e;
        if (this.LJIIIIZZ.isSyncCapture()) {
            P4Q.LIZJ("TERecorder", "isSyncCapture should not be open");
        }
        if (z && z2) {
            P4Q.LIZJ("TERecorder", "needEffect and needOriginPic are true");
            iVEFrameShotScreenCallback.onShotScreen(null, -1);
            return -1;
        }
        if (this.LJJIJIL.get()) {
            P4Q.LJII("TERecorder", "Last screenshot not complete");
            iVEFrameShotScreenCallback.onShotScreen(null, -1);
            return -1;
        }
        this.LJJIJIL.set(true);
        long currentTimeMillis = System.currentTimeMillis();
        VESize vESize = new VESize(i, i2);
        if (this.mIsBindingViewMode && this.LJJJJJL != null) {
            VESize vESize2 = new VESize(i, i2);
            VESize renderSize = this.LJJJJJL.getRenderSize();
            if (renderSize != null && renderSize.width > 0 && renderSize.height > 0) {
                VESize LIZLLL = LIZLLL(vESize2, renderSize);
                if (LIZLLL.width > 0 && LIZLLL.height > 0) {
                    vESize = LIZLLL;
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("aspect shot screen size err: ");
                    LIZ.append(LIZLLL);
                    C63922P6w.LIZIZ("TERecorder", X1D.LIZIZ(LIZ));
                }
            }
        }
        EnumC84113Wzl enumC84113Wzl = EnumC84113Wzl.NO_MIRROR;
        int i3 = this.LJJLIIIJLLLLLLLZ;
        if (i3 != 0) {
            if (i3 == 1) {
                enumC84113Wzl = EnumC84113Wzl.X_MIRROR;
            } else if (i3 == 2) {
                enumC84113Wzl = EnumC84113Wzl.Y_MIRROR;
            }
        }
        C63954P8c c63954P8c = new C63954P8c(this, currentTimeMillis, iVEFrameShotScreenCallback);
        EnumC63957P8f enumC63957P8f = EnumC63957P8f.RGBA_ARRAY;
        this.LJJJJIZL = "";
        X0B x0b = new X0B();
        EnumC63969P8r enumC63969P8r = EnumC63969P8r.NORMAL_GET_FRAME_MODE;
        C84098WzW c84098WzW = x0b.LIZ;
        c84098WzW.LIZ = enumC63969P8r;
        c84098WzW.LJFF = true;
        if (z) {
            enumC63956P8e = EnumC63956P8e.FULL_EFFECT;
        } else {
            enumC63956P8e = EnumC63956P8e.NO_EFFECT;
        }
        c84098WzW.LJ = enumC63956P8e;
        c84098WzW.LJI = EnumC78791Uw7.CENTER_CROP;
        c84098WzW.LIZIZ = vESize;
        c84098WzW.LJII = c63954P8c;
        c84098WzW.LJIIIZ = false;
        c84098WzW.LJIIJJI = this.LJJJJI;
        c84098WzW.LJIILIIL = enumC63957P8f;
        c84098WzW.LJIILL = this.LJJJJIZL;
        c84098WzW.LJIIIIZZ = enumC84113Wzl;
        return getPreviewFrame(c84098WzW);
    }

    @Override // X.AbstractC84025WyL
    public final void capture(int i, int i2, int i3, boolean z, boolean z2, InterfaceC84058Wys interfaceC84058Wys, InterfaceC84057Wyr interfaceC84057Wyr) {
        if (this.LJI != null) {
        } else {
            throw new IllegalStateException("No Camera capture to capture");
        }
    }

    @Override // X.AbstractC84025WyL
    public final void concatAsync(String str, String str2, int i, String str3, String str4, InterfaceC84052Wym interfaceC84052Wym, int i2) {
        this.LJJIIJZLJL.execute(new RunnableC84116Wzo(this, str, str2, i, str3, str4, i2, interfaceC84052Wym));
    }

    @Override // X.AbstractC84025WyL
    public final int init(InterfaceC84100WzY interfaceC84100WzY, VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, VEPreviewSettings vEPreviewSettings, String str, String str2, boolean z) {
        VECameraSettings LLJJJJLIIL;
        boolean z2;
        VERecordMode vERecordMode;
        long j;
        int i;
        attachCameraCapture(interfaceC84100WzY);
        if (interfaceC84100WzY == null) {
            LLJJJJLIIL = null;
        } else {
            LLJJJJLIIL = interfaceC84100WzY.LLJJJJLIIL();
        }
        this.mCameraSettings = LLJJJJLIIL;
        if (LLJJJJLIIL != null && LLJJJJLIIL.getOutputMode() == VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE_FRAME && this.mCameraSettings.getCameraType() != VECameraSettings.CAMERA_TYPE.TYPE1) {
            this.mCameraSettings.setOutPutMode(VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE);
        }
        C84099WzX c84099WzX = this.LJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(File.separator);
        c84099WzX.LIZ = X1D.LIZIZ(LIZ);
        if (!this.mIsBindingViewMode) {
            VEDisplaySettings.Builder builder = new VEDisplaySettings.Builder();
            builder.setRenderSize(vEPreviewSettings.getRenderSize());
            this.LJJJJJL = builder.build();
        }
        this.LJ.LJI = vEPreviewSettings.getRecordContentType();
        this.LJ.LJII = vEPreviewSettings.isEnableDynamicRecordContentType();
        this.LJ.LJIIIZ = vEPreviewSettings.needPostProcess();
        this.LJ.LIZLLL = new LinkedList();
        this.LJ.LJ = new LinkedList();
        this.LJ.LJIIIIZZ = vEPreviewSettings.isRecordEffectContentHighSpeed();
        this.LJ.LJIIL = vEPreviewSettings.isEnable2DEngineEffect();
        this.LJ.LJIIJJI = vEPreviewSettings.isEnableEffectAmazingEngine();
        this.LJ.LJIILJJIL = vEPreviewSettings.isFollowShotIndependentThread();
        this.LJ.LJIL = vEPreviewSettings.isVideoDecodeUseSetMultiTrackStatus();
        if (vEPreviewSettings.getForceRenderThreadSelfDriveConfig()) {
            this.LJ.LJJ = vEPreviewSettings.getRenderThreadSelfDriveConfig();
        } else if (vEPreviewSettings.isEnableRenderThreadSelfDrive()) {
            this.LJ.LJJ = 2;
        } else {
            this.LJ.LJJ = 0;
        }
        this.LJ.LJJI = vEPreviewSettings.getHwDecodeConfig();
        this.LJ.LJJIFFI = vEPreviewSettings.isEnableTitanAudioOpt();
        boolean LJFF = C65429Pm5.LJFF("ve_enable_titan_audio_graph_refactor", false);
        boolean LJFF2 = C65429Pm5.LJFF("ve_enable_lv_audio_graph_refactor", false);
        C84099WzX c84099WzX2 = this.LJ;
        if (LJFF || LJFF2) {
            z2 = true;
        } else {
            z2 = false;
        }
        c84099WzX2.LJIILL = z2;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("enableAudioGraphRefactor: ");
        LIZ2.append(this.LJ.LJIILL);
        P4Q.LJFF("TERecorder", X1D.LIZIZ(LIZ2));
        VEConfigCenter.getInstance().updateConfigToNative("ve_enable_recorder_photo_delay_opt");
        C84099WzX c84099WzX3 = this.LJ;
        c84099WzX3.LJIIZILJ = true;
        c84099WzX3.LJIJ = vEPreviewSettings.getAudioDecodeTimeOpt();
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("ve_enable_render_encode_resolution_align4");
        if (value != null && value.getValue() != null) {
            C87278YNe c87278YNe = new C87278YNe(vEVideoEncodeSettings);
            if (((Boolean) value.getValue()).booleanValue()) {
                i = 4;
            } else {
                i = 16;
            }
            c87278YNe.LIZIZ.mResolutionAlign = i;
            this.mVideoEncodeSettings = c87278YNe.LIZ();
        } else {
            this.mVideoEncodeSettings = vEVideoEncodeSettings;
        }
        this.mAudioEncodeSettings = vEAudioEncodeSettings;
        this.LJIIIIZZ = vEPreviewSettings;
        this.mDetectModelsDir = str2;
        this.LJLI = z;
        TEMonitorInvoker.nativeReset(0);
        C63868P4u.LIZIZ(0);
        C63868P4u.LJ(0, 1L, "te_titan_engine");
        if (this.LJ.LJFF != 0) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("initInternalRecorder called in a invalid state: ");
            LIZ3.append(this.LJ.LJFF);
            LIZ3.append("should be : ");
            LIZ3.append(0);
            P4Q.LIZJ("TERecorder", X1D.LIZIZ(LIZ3));
            return -105;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("create audio capture VERecordMode is ");
        LIZ4.append(this.mVERecordMode);
        P4Q.LIZJ("TERecorder", X1D.LIZIZ(LIZ4));
        if ((VERuntime.getInstance().isEnableAudioCapture() && !this.mAttachAudioFromOther) || (vERecordMode = this.mVERecordMode) == VERecordMode.KARAOKE || vERecordMode == VERecordMode.KARAOKE_PURE_AUDIO || vERecordMode == VERecordMode.DUET_KARAOKE) {
            this.mVEAudioCapture = new VEAudioCapture();
            TEAudioDataInterface tEAudioDataInterface = new TEAudioDataInterface();
            this.LJJJ = tEAudioDataInterface;
            this.mVEAudioCapture.addCaptureListener(tEAudioDataInterface);
            this.mVEAudioCapture.setAudioDeviceChangeListener(this.LJJJJLL);
        }
        this.LJ.LJJIII = this.LJIIIIZZ.getRenderSize();
        this.LJ.LJIJI = this.LJIIIIZZ.isEnableRenderLayer();
        this.LJ.LJIJJ = this.LJIIIIZZ.isEnableModelHotUpdate();
        this.LJ.LJIJJLI = this.LJIIIIZZ.isEnablePassEffectWhenNoEffectFilter();
        int LJIILL = this.LIZIZ.LJIILL(this.LJ, this.mVideoEncodeSettings, this.mAudioEncodeSettings, this.LJIIIIZZ);
        if (LJIILL == 0) {
            this.LJ.LJFF = 1;
        }
        if (this.LJIIIIZZ.isEnableRenderLayer()) {
            LJIIIIZZ();
        }
        if (!this.LJIIIIZZ.isEnablePassEffectWhenNoEffectFilter() && !this.LJIIIIZZ.isEnableModelHotUpdate() && !this.LJIIIIZZ.isEnableRenderLayer()) {
            VEFocusRunEffectFilter vEFocusRunEffectFilter = new VEFocusRunEffectFilter();
            int i2 = this.LJJIL;
            if (i2 >= 0) {
                this.LIZ.updateTrackFilterParam(i2, vEFocusRunEffectFilter);
            } else {
                this.LJJIL = this.LIZ.addTrackFilter(0, 0, vEFocusRunEffectFilter, -1, -1);
            }
        }
        VEARCoreParam vEARCoreParam = new VEARCoreParam();
        vEARCoreParam.setEnableARCore(this.LJLI);
        this.LIZ.setARCoreParam(vEARCoreParam);
        if (this.mAttachAudioFromOther && this.LJJJ == null) {
            this.LJJJ = new TEAudioDataInterface();
        }
        TERecorderInterface tERecorderInterface = this.LIZIZ;
        TEAudioDataInterface tEAudioDataInterface2 = this.LJJJ;
        if (tEAudioDataInterface2 != null) {
            j = tEAudioDataInterface2.getHandle();
        } else {
            j = 0;
        }
        tERecorderInterface.LJJIJIL("AudioDataInterface", j);
        if (this.mAttachAudioFromOther) {
            C84099WzX c84099WzX4 = this.LJ;
            if (c84099WzX4.LJIILL) {
                c84099WzX4.LJIILIIL = true;
                this.LIZIZ.LJJIII("AudioCapturingForSomeScenes", true);
            }
        }
        this.LIZIZ.LJJIL(new TEMemMonitor(this.mContext));
        this.LIZIZ.LJFF();
        return LJIILL;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6  */
    @Override // X.AbstractC84025WyL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int shotScreen(int r16, int r17, boolean r18, X.InterfaceC63955P8d r19, boolean r20, com.ss.android.vesdk.VERecorder.IVEFrameShotScreenCallback r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84092WzQ.shotScreen(int, int, boolean, X.P8d, boolean, com.ss.android.vesdk.VERecorder$IVEFrameShotScreenCallback, boolean):int");
    }

    @Override // X.AbstractC84025WyL
    public final int shotScreen(String str, int i, int i2, boolean z, boolean z2, Bitmap.CompressFormat compressFormat, InterfaceC63961P8j interfaceC63961P8j) {
        Bitmap bitmap;
        EnumC63956P8e enumC63956P8e;
        if (this.LJJIJIL.get()) {
            P4Q.LJII("TERecorder", "Last screenshot not complete");
            interfaceC63961P8j.LIZ(-1);
            return -1;
        }
        this.LJJIJIL.set(true);
        if (this.LJJJJJ) {
            bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        } else {
            bitmap = null;
        }
        C63959P8h c63959P8h = new C63959P8h(this, bitmap, interfaceC63961P8j, str, compressFormat);
        EnumC84113Wzl enumC84113Wzl = EnumC84113Wzl.NO_MIRROR;
        int i3 = this.LJJLIIIJLLLLLLLZ;
        if (i3 != 0) {
            if (i3 == 1) {
                enumC84113Wzl = EnumC84113Wzl.X_MIRROR;
            } else if (i3 == 2) {
                enumC84113Wzl = EnumC84113Wzl.Y_MIRROR;
            }
        }
        X0B x0b = new X0B();
        EnumC63969P8r enumC63969P8r = EnumC63969P8r.NORMAL_GET_FRAME_MODE;
        C84098WzW c84098WzW = x0b.LIZ;
        c84098WzW.LIZ = enumC63969P8r;
        c84098WzW.LJFF = z;
        if (z2) {
            enumC63956P8e = EnumC63956P8e.FULL_EFFECT;
        } else {
            enumC63956P8e = EnumC63956P8e.NO_EFFECT;
        }
        c84098WzW.LJ = enumC63956P8e;
        c84098WzW.LJI = EnumC78791Uw7.CENTER_CROP;
        VESize vESize = new VESize(i, i2);
        C84098WzW c84098WzW2 = x0b.LIZ;
        c84098WzW2.LIZIZ = vESize;
        c84098WzW2.LJIIIIZZ = enumC84113Wzl;
        c84098WzW2.LJII = c63959P8h;
        c84098WzW2.LJIJ = bitmap;
        c84098WzW2.LJIIJJI = this.LJJJJI;
        return getPreviewFrame(c84098WzW2);
    }

    @Override // X.AbstractC84025WyL
    public final int shotScreen(String str, int i, int i2, boolean z, boolean z2, Bitmap.CompressFormat compressFormat, InterfaceC63961P8j interfaceC63961P8j, boolean z3) {
        return shotScreen(str, i, i2, z, z2, compressFormat, interfaceC63961P8j);
    }
}
