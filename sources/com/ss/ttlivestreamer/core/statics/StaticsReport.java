package com.ss.ttlivestreamer.core.statics;

import X.C16880lQ;
import android.text.TextUtils;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import com.ss.ttlivestreamer.core.utils.TEBundle;

/* loaded from: classes12.dex */
public class StaticsReport extends TEBundle {
    public final String VELIVE_LOG_TAG = "velive_log_tag";

    /* loaded from: classes12.dex */
    public interface StaticReportInterface {
        boolean getStaticsReport(StaticsReport staticsReport);
    }

    public String getVideoFrameElapse() {
        return C16880lQ.LLLZ("[%d, %d, %d, %d, %d]", new Object[]{Integer.valueOf(getFrameCostCaptureToEffect()), Integer.valueOf(getFrameCostEffect()), Integer.valueOf(getFrameCostEffectToEncode()), Integer.valueOf(getFrameCostEncode()), Integer.valueOf(getFrameCostEncodeToSend())});
    }

    public double getAudioEncodeRealBps() {
        return getDouble("estream_aenc_real_bps");
    }

    public int getAudioStreamdB() {
        return getInt("estream_audio_stream_db");
    }

    public int getFrameAfterEffectGlFinishTime() {
        return getInt("FinishEffectGLFinish");
    }

    public int getFrameCameraCaptureTime() {
        return getInt("FinishCameraCapture");
    }

    public int getFrameCaptureToProcessorLatency() {
        return getInt("StartProcessor");
    }

    public int getFrameCostCaptureToEffect() {
        return getInt("cost_capture_to_effect");
    }

    public int getFrameCostEffect() {
        return getInt("cost_capture_pure_effect");
    }

    public int getFrameCostEffectToEncode() {
        return getInt("cost_effect_to_encode");
    }

    public int getFrameCostEncode() {
        return getInt("cost_capture_pure_encode");
    }

    public int getFrameCostEncodeToSend() {
        return getInt("cost_capture_encode_to_send");
    }

    public int getFrameEffectProcessTime() {
        return getInt("FinishEffectProcess");
    }

    public int getFrameEncoderDrawSurfaceTime() {
        return getInt("FinishDrawSurface");
    }

    public int getFrameOesTo2DTime() {
        return getInt("FinishOesTo2D");
    }

    public int getFramePostProcessAlgorithmTime() {
        return getInt("FinishPostProcessAlgorithm");
    }

    public int getFrameProcessToEncoderLatency() {
        return getInt("StartEncode");
    }

    public int getFrameProcessToRenderLatency() {
        return getInt("StartRender");
    }

    public int getFrameRenderTime() {
        return getInt("FinishRender");
    }

    public int getFrameUpdateTexImageTime() {
        return getInt("FinishUpdateTexImage");
    }

    public int getRealVideoGopMs() {
        return getInt("estream_real_video_gop");
    }

    public double getTransportDropCount() {
        return getDouble("estream_transport_video_drop_count");
    }

    public double getTransportDuration() {
        return getDouble("estream_transport_duration");
    }

    public double getTransportPackageAverageDelay() {
        return getDouble("estream_transport_package_delay");
    }

    public double getVideoDropCount() {
        return getDouble("estream_video_drop_count");
    }

    public int getVideoEncodePSNRFromKeyFrame() {
        return getInt("estream_video_enc_psnr_key_frame");
    }

    public int getVideoEncodePSNRFromNoKeyFrame() {
        return getInt("estream_video_enc_psnr_no_key_frame");
    }

    public double getVideoEncodeRealBps() {
        return getDouble("estream_venc_real_bps");
    }

    public double getVideoEncodeRealFps() {
        return getDouble("estream_venc_real_fps");
    }

    public String getVideoFrameElapseV2() {
        return C16880lQ.LLLZ("[%d, %d, %d, %d, %d, %d, %d, %d, %d, %d, %d]", new Object[]{Integer.valueOf(getFrameCameraCaptureTime()), Integer.valueOf(getFrameCaptureToProcessorLatency()), Integer.valueOf(getFrameUpdateTexImageTime()), Integer.valueOf(getFrameOesTo2DTime()), Integer.valueOf(getFrameEffectProcessTime()), Integer.valueOf(getFrameAfterEffectGlFinishTime()), Integer.valueOf(getFramePostProcessAlgorithmTime()), Integer.valueOf(getFrameProcessToRenderLatency()), Integer.valueOf(getFrameRenderTime()), Integer.valueOf(getFrameProcessToEncoderLatency()), Integer.valueOf(getFrameEncoderDrawSurfaceTime())});
    }

    public double getVideoTransportRealBps() {
        return getDouble("estream_transport_real_bps");
    }

    public double getVideoTransportRealFps() {
        return getDouble("estream_transport_real_fps");
    }

    public double getCostTimeProessPerFrame() {
        return getDouble("vtrack_cost_time_ppf");
    }

    public double getVideoSourceDeliverFps() {
        return getDouble("vsourc_deliver_fps");
    }

    public double getVideoSourceDropFps() {
        return getDouble("vsourc_drop_fps");
    }

    public double getVideoSourceFps() {
        return getVideoSourceDropFps() + getVideoSourceDeliverFps();
    }

    public String getVideoFrameElapseTTLiveStreamerFixed(String str) {
        if (TextUtils.isEmpty(str)) {
            DebugLogUtils.isEnableDebugLog();
            return getVideoFrameElapse();
        }
        String[] split = str.split(",");
        if (split.length != 5) {
            DebugLogUtils.isEnableDebugLog();
            return getVideoFrameElapse();
        }
        return C16880lQ.LLLZ("[%d, %d, %s, %s, %s", new Object[]{Integer.valueOf(getFrameCostCaptureToEffect()), Integer.valueOf(getFrameCostEffect()), split[2], split[3], split[4]});
    }

    public String getVideoFrameElapseV2TTLiveStreamerFixed(String str) {
        if (TextUtils.isEmpty(str)) {
            DebugLogUtils.isEnableDebugLog();
            return getVideoFrameElapseV2();
        }
        String[] split = str.split(",");
        if (split.length != 11) {
            DebugLogUtils.isEnableDebugLog();
            return getVideoFrameElapseV2();
        }
        return C16880lQ.LLLZ("[%d, %d, %d, %d, %d, %d, %d, %d, %d, %s, %s", new Object[]{Integer.valueOf(getFrameCameraCaptureTime()), Integer.valueOf(getFrameCaptureToProcessorLatency()), Integer.valueOf(getFrameUpdateTexImageTime()), Integer.valueOf(getFrameOesTo2DTime()), Integer.valueOf(getFrameEffectProcessTime()), Integer.valueOf(getFrameAfterEffectGlFinishTime()), Integer.valueOf(getFramePostProcessAlgorithmTime()), Integer.valueOf(getFrameProcessToRenderLatency()), Integer.valueOf(getFrameRenderTime()), split[9], split[10]});
    }
}
