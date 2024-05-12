package com.byted.cast.capture.encoder;

import X.X1D;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.util.Range;
import android.view.Surface;
import com.byted.cast.mediacommon.MediaMonitor;
import com.byted.cast.mediacommon.VideoProfile;
import com.byted.cast.mediacommon.utils.Logger;
import com.byted.cast.mediacommon.utils.Utils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class VideoEncoder extends MediaEncoder {
    public Surface inputSurface;
    public Context mContext;
    public IRecorderListener mRecordListener;
    public VideoProfile mSetting;
    public String mDefaultCodecType = "video/avc";
    public int mDefaultBitrate = 16384;
    public int mDefaultWidth = 1920;
    public int mDefaultHeight = 1080;
    public int mDefaultFrameRate = 30;

    /* loaded from: classes29.dex */
    public interface IRecorderListener {
        void onEncoderStop();

        void onOutputFormatChange(MediaFormat mediaFormat);

        void onRecevieFrameTimeout();

        void onVideoEncoder(String str, int i, int i2, int i3, int i4);

        void onVideoFrameAvailable(byte[] bArr, MediaCodec.BufferInfo bufferInfo, int i, int i2);

        void onVideoRecordError(int i, String str);
    }

    public boolean checkVideoEncoderFormat(String str, int i, int i2, int i3, int i4) {
        return true;
    }

    @Override // com.byted.cast.capture.encoder.MediaEncoder
    public String getTag() {
        return "VideoEncoder";
    }

    @Override // com.byted.cast.capture.encoder.MediaEncoder
    public void onEncoderStop() {
        IRecorderListener iRecorderListener = this.mRecordListener;
        if (iRecorderListener != null) {
            iRecorderListener.onEncoderStop();
        }
    }

    @Override // com.byted.cast.capture.encoder.MediaEncoder
    public void onRecevieFrameTimeout() {
        IRecorderListener iRecorderListener = this.mRecordListener;
        if (iRecorderListener != null) {
            iRecorderListener.onRecevieFrameTimeout();
        }
    }

    @Override // com.byted.cast.capture.encoder.MediaEncoder
    public void release() {
        super.release();
        this.mContext = null;
        this.mSetting = null;
        this.mRecordListener = null;
        this.inputSurface = null;
    }

    public int getDefaultBitrate() {
        return this.mDefaultBitrate;
    }

    public String getDefaultCodecType() {
        return this.mDefaultCodecType;
    }

    public int getDefaultFrameRate() {
        return this.mDefaultFrameRate;
    }

    public int getDefaultHeight() {
        return this.mDefaultHeight;
    }

    public int getDefaultWidth() {
        return this.mDefaultWidth;
    }

    private void verifyDefaultFormat(MediaCodecInfo.VideoCapabilities videoCapabilities) {
        if (!videoCapabilities.getBitrateRange().contains((Range<Integer>) Integer.valueOf(this.mDefaultBitrate * 1024))) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Not support DefaultFormat bitrate");
            LIZ.append(this.mDefaultBitrate);
            Logger.e("VideoEncoder", X1D.LIZIZ(LIZ));
            this.mDefaultBitrate = videoCapabilities.getBitrateRange().getUpper().intValue() / 1024;
        }
        if (!videoCapabilities.getSupportedFrameRates().contains((Range<Integer>) Integer.valueOf(this.mDefaultFrameRate))) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Not support DefaultFormat FrameRate");
            LIZ2.append(this.mDefaultFrameRate);
            Logger.e("VideoEncoder", X1D.LIZIZ(LIZ2));
            this.mDefaultFrameRate = videoCapabilities.getSupportedFrameRates().getUpper().intValue();
        }
        if (!videoCapabilities.isSizeSupported(this.mDefaultWidth, this.mDefaultHeight)) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Not Support DefaultFormat width:");
            LIZ3.append(this.mDefaultWidth);
            LIZ3.append("height:");
            LIZ3.append(this.mDefaultHeight);
            Logger.e("VideoEncoder", X1D.LIZIZ(LIZ3));
            int intValue = videoCapabilities.getSupportedWidths().getUpper().intValue();
            this.mDefaultWidth = intValue;
            this.mDefaultHeight = videoCapabilities.getSupportedHeightsFor(intValue).getUpper().intValue();
        }
    }

    @Override // com.byted.cast.capture.encoder.MediaEncoder
    public void onOutputFormatChange(MediaFormat mediaFormat) {
        IRecorderListener iRecorderListener = this.mRecordListener;
        if (iRecorderListener != null) {
            iRecorderListener.onOutputFormatChange(mediaFormat);
        }
    }

    @Override // com.byted.cast.capture.encoder.MediaEncoder
    public void NotifyMessager(int i, String str) {
        IRecorderListener iRecorderListener = this.mRecordListener;
        if (iRecorderListener != null) {
            iRecorderListener.onVideoRecordError(i, str);
        }
    }

    public VideoEncoder(Context context, VideoProfile videoProfile, IRecorderListener iRecorderListener) {
        this.mContext = context;
        this.mSetting = videoProfile;
        this.mRecordListener = iRecorderListener;
    }

    @Override // com.byted.cast.capture.encoder.MediaEncoder
    public void handleOutputBuffer(byte[] bArr, MediaCodec.BufferInfo bufferInfo, int i, int i2) {
        IRecorderListener iRecorderListener = this.mRecordListener;
        if (iRecorderListener != null) {
            iRecorderListener.onVideoFrameAvailable(bArr, bufferInfo, i, i2);
        }
        printFPS(bufferInfo.presentationTimeUs, bArr.length);
    }

    public Surface prepareVideoEncoder(String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str2, i, i2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("prepareVideoEncoder:");
        LIZ.append(str2);
        LIZ.append(" w:");
        LIZ.append(i);
        LIZ.append(" h:");
        LIZ.append(i2);
        LIZ.append(" fps:");
        LIZ.append(i3);
        LIZ.append("bitrate:");
        LIZ.append(i4);
        Logger.i("VideoEncoder", X1D.LIZIZ(LIZ));
        if (i == 0 || i2 == 0 || i3 == 0 || i4 == 0) {
            if (z) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("prepareVideoEncoder:");
                LIZ2.append(str2);
                LIZ2.append(" w:");
                LIZ2.append(i);
                LIZ2.append(" h:");
                LIZ2.append(i2);
                LIZ2.append(" fps:");
                LIZ2.append(i3);
                LIZ2.append("bitrate:");
                LIZ2.append(i4);
                MediaMonitor.onMonitor("MediaCapture_Error", 100004, "error param", X1D.LIZIZ(LIZ2));
            }
            Logger.e("VideoEncoder", "width, height, frameRate, bitrate set ERROR!!!");
            return null;
        }
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", i4);
        createVideoFormat.setInteger("frame-rate", i3);
        createVideoFormat.setInteger("i-frame-interval", this.mSetting.getFrameInterval());
        createVideoFormat.setInteger("capture-rate", i3);
        if (Utils.getProperty("persist.sys.virtual_display_pkg", "non-tnt").equals(Utils.getPackageName(this.mContext))) {
            createVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-i-min", 4);
            createVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-i-max", 30);
        } else if (this.mSetting.getAVSyncType() == VideoProfile.AVSYNC_TYPE.SYNC_LOW_LATENCY) {
            Logger.i("VideoEncoder", "Set latency in low latency mode");
            createVideoFormat.setInteger("vendor.qti-ext-enc-low-latency.enable", 1);
        } else {
            Logger.i("VideoEncoder", "set latency in normal mode");
        }
        String property = Utils.getProperty("ro.product.name", "non");
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 23) {
            if (property.equals("delta") || property.equals("darwin")) {
                createVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-i-min", 18);
                createVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-i-max", 22);
                createVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-p-min", 18);
                createVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-p-max", 22);
                createVideoFormat.setInteger("bytelink", 1);
                if (property.equals("delta")) {
                    createVideoFormat.setInteger("operating-rate", 240);
                } else if (property.equals("darwin")) {
                    createVideoFormat.setInteger("operating-rate", 480);
                }
            }
            createVideoFormat.setInteger("priority", 0);
        }
        if (i5 >= 29 && this.mSetting.isEnableSetMaxFps()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("set max fps: ");
            LIZ3.append(i3);
            Logger.i("VideoEncoder", X1D.LIZIZ(LIZ3));
            createVideoFormat.setFloat("max-fps-to-encoder", i3);
        }
        createVideoFormat.setInteger("vendor.qti-ext-enc-initial-qp.qp-i", 18);
        createVideoFormat.setInteger("vendor.qti-ext-enc-initial-qp.qp-i-enable", 1);
        createVideoFormat.setInteger("vendor.qti-ext-enc-initial-qp.qp-p", 18);
        createVideoFormat.setInteger("vendor.qti-ext-enc-initial-qp.qp-p-enable", 1);
        createVideoFormat.setInteger("vendor.qti-ext-enc-initial-qp.qp-b-enable", 0);
        createVideoFormat.setInteger("bitrate-mode", 2);
        createVideoFormat.setInteger("repeat-previous-frame-after", 2);
        Map<String, Integer> mediaFormat = this.mSetting.getMediaFormat();
        if (mediaFormat != null) {
            for (Map.Entry<String, Integer> entry : mediaFormat.entrySet()) {
                createVideoFormat.setInteger(entry.getKey(), entry.getValue().intValue());
            }
        }
        try {
            if (str == null || str == "") {
                this.mMediaCodec = MediaCodec.createEncoderByType(str2);
            } else {
                this.mMediaCodec = MediaCodec.createByCodecName(str);
            }
            MediaCodec mediaCodec = this.mMediaCodec;
            if (mediaCodec != null) {
                mediaCodec.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                this.inputSurface = this.mMediaCodec.createInputSurface();
                this.mMediaCodec.start();
            }
            IRecorderListener iRecorderListener = this.mRecordListener;
            if (iRecorderListener != null) {
                iRecorderListener.onVideoEncoder(str2, i, i2, i3, i4);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("mCodecType", str2);
                jSONObject.put("width", i);
                jSONObject.put("height", i2);
                jSONObject.put("frameRate", i3);
                jSONObject.put("bitrate", i4);
                MediaMonitor.onMonitor("MediaCapture_Video_Param", jSONObject.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return this.inputSurface;
        } catch (Exception e2) {
            if (z) {
                MediaMonitor.onMonitor("MediaCapture_Error", 100004, "mMediaCodec", e2.toString());
            }
            Logger.e("VideoEncoder", e2.toString());
            return null;
        }
    }
}
