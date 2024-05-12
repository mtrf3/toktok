package com.bytedance.realx.video;

import X.C16880lQ;
import X.V0N;
import X.X1D;
import android.media.MediaRecorder;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.video.CameraEnumerationAndroid;

/* loaded from: classes33.dex */
public interface CameraVideoCapturer extends VideoCapturer {

    /* loaded from: classes33.dex */
    public interface CameraEventsHandler {
        void onCameraClosed();

        void onCameraConfig(int i, int i2, CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange);

        void onCameraDisconnected();

        void onCameraError(String str);

        void onCameraFreezed(String str);

        void onCameraOpening(String str);

        void onFirstFrameAvailable();
    }

    /* loaded from: classes33.dex */
    public static class CameraStatistics {
        public final Runnable cameraObserver;
        public final CameraEventsHandler eventsHandler;
        public int frameCount;
        public int freezePeriodCount;
        public final SurfaceTextureHelper surfaceTextureHelper;

        public void release() {
            this.surfaceTextureHelper.getHandler().removeCallbacks(this.cameraObserver);
        }

        private void checkThread() {
            if (C16880lQ.LLLLIIIILLL() == this.surfaceTextureHelper.getHandler().getLooper().getThread()) {
            } else {
                throw new IllegalStateException("Wrong thread");
            }
        }

        public void addFrame() {
            checkThread();
            this.frameCount++;
        }

        public CameraStatistics(SurfaceTextureHelper surfaceTextureHelper, CameraEventsHandler cameraEventsHandler) {
            Runnable runnable = new Runnable() { // from class: com.bytedance.realx.video.CameraVideoCapturer.CameraStatistics.1
                @Override // java.lang.Runnable
                public void run() {
                    com_bytedance_realx_video_CameraVideoCapturer$CameraStatistics$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_bytedance_realx_video_CameraVideoCapturer$CameraStatistics$1__run$___twin___() {
                    int round = Math.round((CameraStatistics.this.frameCount * 1000.0f) / 2000.0f);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Camera fps: ");
                    LIZ.append(round);
                    LIZ.append(".");
                    RXLogging.i("CameraStatistics", X1D.LIZIZ(LIZ));
                    CameraStatistics cameraStatistics = CameraStatistics.this;
                    if (cameraStatistics.frameCount == 0) {
                        int i = cameraStatistics.freezePeriodCount + 1;
                        cameraStatistics.freezePeriodCount = i;
                        if (i * LiveNetAdaptiveHurryTimeSetting.DEFAULT >= 4000 && cameraStatistics.eventsHandler != null) {
                            RXLogging.e("CameraStatistics", "Camera freezed.");
                            if (CameraStatistics.this.surfaceTextureHelper.isTextureInUse()) {
                                CameraStatistics.this.eventsHandler.onCameraFreezed("Camera failure. Client must return video buffers.");
                                return;
                            } else {
                                CameraStatistics.this.eventsHandler.onCameraFreezed("Camera failure.");
                                return;
                            }
                        }
                    } else {
                        cameraStatistics.freezePeriodCount = 0;
                    }
                    cameraStatistics.frameCount = 0;
                    cameraStatistics.surfaceTextureHelper.getHandler().postDelayed(this, 2000L);
                }

                public static void com_bytedance_realx_video_CameraVideoCapturer$CameraStatistics$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_bytedance_realx_video_CameraVideoCapturer$CameraStatistics$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            };
            this.cameraObserver = runnable;
            if (surfaceTextureHelper != null) {
                this.surfaceTextureHelper = surfaceTextureHelper;
                this.eventsHandler = cameraEventsHandler;
                this.frameCount = 0;
                this.freezePeriodCount = 0;
                surfaceTextureHelper.getHandler().postDelayed(runnable, 2000L);
                return;
            }
            throw new IllegalArgumentException("SurfaceTextureHelper is null");
        }
    }

    /* loaded from: classes33.dex */
    public interface CameraSwitchHandler {
        void onCameraSwitchDone(boolean z);

        void onCameraSwitchError(String str);
    }

    /* loaded from: classes33.dex */
    public interface MediaRecorderHandler {
        void onMediaRecorderError(String str);

        void onMediaRecorderSuccess();
    }

    void addMediaRecorderToCamera(MediaRecorder mediaRecorder, MediaRecorderHandler mediaRecorderHandler);

    void removeMediaRecorderFromCamera(MediaRecorderHandler mediaRecorderHandler);

    void setOrientationMode(ORIENTATION_MODE orientation_mode);

    void switchCamera(CameraSwitchHandler cameraSwitchHandler);

    /* loaded from: classes33.dex */
    public enum ORIENTATION_MODE {
        ORIENTATION_MODE_ADAPTIVE(0),
        ORIENTATION_MODE_FIXED_LANDSCAPE(1),
        ORIENTATION_MODE_FIXED_PORTRAIT(2);

        public int value;

        public int getValue() {
            return this.value;
        }

        public static ORIENTATION_MODE convertFromInt(int i) {
            return values()[i];
        }

        public static ORIENTATION_MODE valueOf(String str) {
            return (ORIENTATION_MODE) V0N.LJJJ(ORIENTATION_MODE.class, str);
        }

        ORIENTATION_MODE(int i) {
            this.value = i;
        }
    }
}
