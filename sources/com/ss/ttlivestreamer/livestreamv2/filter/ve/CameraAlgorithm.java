package com.ss.ttlivestreamer.livestreamv2.filter.ve;

import X.InterfaceC63852P4e;
import X.P3H;
import X.X1D;
import android.os.Handler;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmParam;
import com.ss.android.ttvecamera.cameraalgorithm.TEOneKeyProcessParams;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import com.ss.ttlivestreamer.livestreamv2.filter.ve.CameraAlgorithm;
import com.ss.ttlivestreamer.livestreamv2.filter.ve.LiveAlgorithmParam;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class CameraAlgorithm {
    public static final Companion Companion = new Companion();
    public final int flag;
    public Observer observer;
    public final String tag;

    /* loaded from: classes12.dex */
    public interface Observer {
        void onStarted(int i);

        void onStopped(int i);
    }

    /* loaded from: classes12.dex */
    public static final class RhythmMotion extends CameraAlgorithm {
        public final TECameraCapture capture;
        public final Handler handle;

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.ve.CameraAlgorithm
        public JSONObject getStatus() {
            return null;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.ve.CameraAlgorithm
        public void stop() {
            this.handle.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.ve.CameraAlgorithm$RhythmMotion$stop$1
                @Override // java.lang.Runnable
                public final void run() {
                    com_ss_ttlivestreamer_livestreamv2_filter_ve_CameraAlgorithm$RhythmMotion$stop$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public final void com_ss_ttlivestreamer_livestreamv2_filter_ve_CameraAlgorithm$RhythmMotion$stop$1__run$___twin___() {
                    AVLog.logKibana(4, CameraAlgorithm.RhythmMotion.this.getTag(), "stop LiveRhythmMotion", null);
                    CameraAlgorithm.RhythmMotion.this.capture.removeCameraAlgorithm(8);
                    CameraAlgorithm.RhythmMotion.this.capture.removeCameraAlgorithm(2);
                    CameraAlgorithm.Observer observer = CameraAlgorithm.RhythmMotion.this.getObserver();
                    if (observer != null) {
                        observer.onStopped(CameraAlgorithm.RhythmMotion.this.getFlag());
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_filter_ve_CameraAlgorithm$RhythmMotion$stop$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(CameraAlgorithm$RhythmMotion$stop$1 cameraAlgorithm$RhythmMotion$stop$1) {
                    boolean LIZ;
                    try {
                        cameraAlgorithm$RhythmMotion$stop$1.com_ss_ttlivestreamer_livestreamv2_filter_ve_CameraAlgorithm$RhythmMotion$stop$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.ve.CameraAlgorithm
        public boolean canProcess(LiveAlgorithmParam param) {
            o.LJIIIZ(param, "param");
            return param instanceof LiveAlgorithmParam.RhythmicMotion;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.ve.CameraAlgorithm
        public void start(final LiveAlgorithmParam param) {
            o.LJIIIZ(param, "param");
            this.handle.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.ve.CameraAlgorithm$RhythmMotion$start$1
                @Override // java.lang.Runnable
                public final void run() {
                    com_ss_ttlivestreamer_livestreamv2_filter_ve_CameraAlgorithm$RhythmMotion$start$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public final void com_ss_ttlivestreamer_livestreamv2_filter_ve_CameraAlgorithm$RhythmMotion$start$1__run$___twin___() {
                    AVLog.logKibana(4, CameraAlgorithm.RhythmMotion.this.getTag(), "startCameraRhythmAlgorithm", null);
                    TECameraAlgorithmParam tECameraAlgorithmParam = new TECameraAlgorithmParam();
                    tECameraAlgorithmParam.type = 2;
                    TECameraAlgorithmParam tECameraAlgorithmParam2 = new TECameraAlgorithmParam();
                    tECameraAlgorithmParam2.type = 8;
                    CameraAlgorithm.RhythmMotion.this.capture.addCameraAlgorithm(tECameraAlgorithmParam);
                    CameraAlgorithm.RhythmMotion.this.capture.addCameraAlgorithm(tECameraAlgorithmParam2);
                    CameraAlgorithm.RhythmMotion.this.capture.updateCameraAlgorithmParam(param.mappingValue());
                    CameraAlgorithm.Observer observer = CameraAlgorithm.RhythmMotion.this.getObserver();
                    if (observer != null) {
                        observer.onStarted(CameraAlgorithm.RhythmMotion.this.getFlag());
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_filter_ve_CameraAlgorithm$RhythmMotion$start$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(CameraAlgorithm$RhythmMotion$start$1 cameraAlgorithm$RhythmMotion$start$1) {
                    boolean LIZ;
                    try {
                        cameraAlgorithm$RhythmMotion$start$1.com_ss_ttlivestreamer_livestreamv2_filter_ve_CameraAlgorithm$RhythmMotion$start$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RhythmMotion(TECameraCapture capture, Handler handle, Observer observer) {
            super(1, "LiveRhythmicMotion", observer);
            o.LJIIIZ(capture, "capture");
            o.LJIIIZ(handle, "handle");
            this.capture = capture;
            this.handle = handle;
        }
    }

    public abstract boolean canProcess(LiveAlgorithmParam liveAlgorithmParam);

    public abstract JSONObject getStatus();

    public abstract void start(LiveAlgorithmParam liveAlgorithmParam);

    public abstract void stop();

    /* loaded from: classes12.dex */
    public static final class OneKeyProcess extends CameraAlgorithm {
        public final TECameraCapture capture;
        public final CountDownLatch countDownLatch;
        public final Handler handler;
        public final JSONObject status;

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.ve.CameraAlgorithm
        public void stop() {
            DebugLogUtils.isEnableDebugLog();
            this.handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.ve.CameraAlgorithm$OneKeyProcess$stop$1
                @Override // java.lang.Runnable
                public final void run() {
                    com_ss_ttlivestreamer_livestreamv2_filter_ve_CameraAlgorithm$OneKeyProcess$stop$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public final void com_ss_ttlivestreamer_livestreamv2_filter_ve_CameraAlgorithm$OneKeyProcess$stop$1__run$___twin___() {
                    AVLog.logKibana(4, CameraAlgorithm.OneKeyProcess.this.getTag(), "stop LiveOneKeyProcess", null);
                    CameraAlgorithm.OneKeyProcess.this.capture.removeCameraAlgorithm(2);
                    CameraAlgorithm.OneKeyProcess.this.capture.removeCameraAlgorithm(256);
                    CameraAlgorithm.Observer observer = CameraAlgorithm.OneKeyProcess.this.getObserver();
                    if (observer != null) {
                        observer.onStopped(CameraAlgorithm.OneKeyProcess.this.getFlag());
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_filter_ve_CameraAlgorithm$OneKeyProcess$stop$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(CameraAlgorithm$OneKeyProcess$stop$1 cameraAlgorithm$OneKeyProcess$stop$1) {
                    boolean LIZ;
                    try {
                        cameraAlgorithm$OneKeyProcess$stop$1.com_ss_ttlivestreamer_livestreamv2_filter_ve_CameraAlgorithm$OneKeyProcess$stop$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.ve.CameraAlgorithm
        public JSONObject getStatus() {
            return this.status;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.ve.CameraAlgorithm
        public boolean canProcess(LiveAlgorithmParam param) {
            o.LJIIIZ(param, "param");
            return param instanceof LiveAlgorithmParam.OneKeyProcess;
        }

        public final void setStatus(TEOneKeyProcessParams oneKeyParam) {
            o.LJIIIZ(oneKeyParam, "oneKeyParam");
            this.status.put("enableHDR", oneKeyParam.enableHDR);
            this.status.put("enableDenoise", oneKeyParam.enableDenoise);
            this.status.put("enableAfs", oneKeyParam.enableAfs);
            this.status.put("enableHdrV2", oneKeyParam.enableHdrV2);
            this.status.put("enableAsyncProcess", oneKeyParam.enableAsyncProcess);
            this.status.put("enableDayScene", oneKeyParam.enableDayScene);
            this.status.put("isFirstFrame", oneKeyParam.isFirstFrame);
            this.status.put("enableAlgoConfig", oneKeyParam.enableAlgoConfig);
            this.status.put("cvdetectFrames", oneKeyParam.cvdetectFrames);
            this.status.put("iso", oneKeyParam.iso);
            this.status.put("maxIso", oneKeyParam.maxIso);
            this.status.put("minIso", oneKeyParam.minIso);
            this.status.put("algParams", oneKeyParam.algParams);
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.ve.CameraAlgorithm
        public void start(final LiveAlgorithmParam param) {
            o.LJIIIZ(param, "param");
            DebugLogUtils.isEnableDebugLog();
            this.handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.ve.CameraAlgorithm$OneKeyProcess$start$1
                @Override // java.lang.Runnable
                public final void run() {
                    com_ss_ttlivestreamer_livestreamv2_filter_ve_CameraAlgorithm$OneKeyProcess$start$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public final void com_ss_ttlivestreamer_livestreamv2_filter_ve_CameraAlgorithm$OneKeyProcess$start$1__run$___twin___() {
                    AVLog.logKibana(4, CameraAlgorithm.OneKeyProcess.this.getTag(), "startLiveOneKeyProcess", null);
                    final int[] iArr = new int[1];
                    CameraAlgorithm.OneKeyProcess.this.capture.getISO(new P3H() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.ve.CameraAlgorithm$OneKeyProcess$start$1.1
                        @Override // X.P3H
                        public final void getCurrentISO(int i) {
                            iArr[0] = i;
                            String tag = CameraAlgorithm.OneKeyProcess.this.getTag();
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("get iso ");
                            LIZ.append(i);
                            AVLog.e(tag, X1D.LIZIZ(LIZ));
                            CameraAlgorithm.OneKeyProcess.this.countDownLatch.countDown();
                        }
                    });
                    int i = 0;
                    final int[][] iArr2 = {new int[2]};
                    CameraAlgorithm.OneKeyProcess.this.capture.getISORange(new InterfaceC63852P4e() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.ve.CameraAlgorithm$OneKeyProcess$start$1.2
                        @Override // X.InterfaceC63852P4e
                        public final void getISORange(int[] isoRange) {
                            o.LJIIIZ(isoRange, "isoRange");
                            iArr2[0] = isoRange;
                            CameraAlgorithm.OneKeyProcess.this.countDownLatch.countDown();
                        }
                    });
                    try {
                        CameraAlgorithm.OneKeyProcess.this.countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
                    } catch (Throwable unused) {
                    }
                    LiveAlgorithmParam liveAlgorithmParam = param;
                    if (liveAlgorithmParam != null) {
                        LiveAlgorithmParam.OneKeyProcess oneKeyProcess = (LiveAlgorithmParam.OneKeyProcess) liveAlgorithmParam;
                        int max = Math.max(iArr[0], 0);
                        if (max < 0) {
                            max = 0;
                        }
                        oneKeyProcess.setIso(max);
                        int[] iArr3 = iArr2[0];
                        int max2 = Math.max(iArr3[0], iArr3[1]);
                        if (max2 < 0) {
                            max2 = 0;
                        }
                        oneKeyProcess.setMaxIso(max2);
                        int[] iArr4 = iArr2[0];
                        int min = Math.min(iArr4[0], iArr4[1]);
                        if (min >= 0) {
                            i = min;
                        }
                        oneKeyProcess.setMinIso(i);
                        TEOneKeyProcessParams mappingValue = oneKeyProcess.mappingValue();
                        CameraAlgorithm.OneKeyProcess.this.setStatus(mappingValue);
                        TECameraAlgorithmParam tECameraAlgorithmParam = new TECameraAlgorithmParam();
                        tECameraAlgorithmParam.type = 2;
                        CameraAlgorithm.OneKeyProcess.this.capture.addCameraAlgorithm(tECameraAlgorithmParam);
                        CameraAlgorithm.OneKeyProcess.this.capture.addCameraAlgorithm(mappingValue);
                        CameraAlgorithm.OneKeyProcess.this.capture.updateCameraAlgorithmParam(mappingValue);
                        CameraAlgorithm.Observer observer = CameraAlgorithm.OneKeyProcess.this.getObserver();
                        if (observer != null) {
                            observer.onStarted(CameraAlgorithm.OneKeyProcess.this.getFlag());
                            return;
                        }
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.ttlivestreamer.livestreamv2.filter.ve.LiveAlgorithmParam.OneKeyProcess");
                }

                public static void com_ss_ttlivestreamer_livestreamv2_filter_ve_CameraAlgorithm$OneKeyProcess$start$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(CameraAlgorithm$OneKeyProcess$start$1 cameraAlgorithm$OneKeyProcess$start$1) {
                    boolean LIZ;
                    try {
                        cameraAlgorithm$OneKeyProcess$start$1.com_ss_ttlivestreamer_livestreamv2_filter_ve_CameraAlgorithm$OneKeyProcess$start$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OneKeyProcess(TECameraCapture capture, Handler handler, Observer observer) {
            super(2, "LiveOneKeyProcess", observer);
            o.LJIIIZ(capture, "capture");
            o.LJIIIZ(handler, "handler");
            o.LJIIIZ(observer, "observer");
            this.capture = capture;
            this.handler = handler;
            this.countDownLatch = new CountDownLatch(2);
            this.status = new JSONObject();
        }
    }

    /* loaded from: classes12.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getFlag() {
        return this.flag;
    }

    public final Observer getObserver() {
        return this.observer;
    }

    public final String getTag() {
        return this.tag;
    }

    public final void setObserver(Observer observer) {
        this.observer = observer;
    }

    public CameraAlgorithm(int i, String str, Observer observer) {
        this.flag = i;
        this.tag = str;
        this.observer = observer;
    }

    public /* synthetic */ CameraAlgorithm(int i, String str, Observer observer, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, observer);
    }
}
