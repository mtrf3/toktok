package com.ss.ttlivestreamer.livestreamv2.control;

import com.ss.ttlivestreamer.livestreamv2.capture.algorithm.CameraAlgorithmParamWrapper;
import com.ss.ttlivestreamer.livestreamv2.capture.algorithm.CameraLensCallbackWrapper;
import com.ss.ttlivestreamer.livestreamv2.filter.ve.LiveAlgorithmParam;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public interface IVideoCapturerControl {

    /* loaded from: classes6.dex */
    public static class Range {
        public float max;
        public float min;
    }

    void addCameraAlgorithm(CameraAlgorithmParamWrapper cameraAlgorithmParamWrapper, boolean z);

    void cancelAudioFocus();

    void cancelAutoFocus();

    boolean currentSupportISPControl();

    long getAverageExposureTime();

    long getAvgFps();

    long getCameraAlgorithmState();

    double getCameraAvgCaptureResultFps();

    int getCameraCaptureHeight();

    int getCameraCaptureWidth();

    int getCameraState();

    int getCurrentCaptureDevice();

    Range getExposureCompensationRange();

    long getISOInfo();

    float getInCaptureRealFps();

    String getRealCameraFpsRangeStr();

    JSONObject getRealCameraStatus();

    boolean isCamera2Like();

    int queryZoomAbility(boolean z, boolean z2);

    int setCameraPreviewFpsRangeWhenRunning(int i, int i2);

    int setExposureCompensation(float f);

    int setFocusAreas(int i, int i2, int i3, int i4);

    void setLensCallback(CameraLensCallbackWrapper cameraLensCallbackWrapper);

    void startCameraRhythmAlgorithm(LiveAlgorithmParam.RhythmicMotion rhythmicMotion);

    void startLiveOneKeyProcess();

    int startZoom(boolean z, float f);

    void stopCameraRhythmAlgorithm();

    void stopLiveOneKeyProcess();

    int toggleFlashLight(boolean z);
}
