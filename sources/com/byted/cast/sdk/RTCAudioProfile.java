package com.byted.cast.sdk;

import X.InterfaceC65349Pkn;
import X.V0N;
import X.X1D;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.NoiseSuppressor;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.sdk.RTCSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;

/* loaded from: classes29.dex */
public class RTCAudioProfile implements Cloneable {

    @InterfaceC65349Pkn("bluetoothSCOEnabled")
    public boolean mBluetoothSCOEnabled;

    @InterfaceC65349Pkn("castContext")
    public ContextManager.CastContext mCastContext;

    @InterfaceC65349Pkn("isEchoDetectionEnabled")
    public boolean mIsEchoDetectionEnabled;

    @InterfaceC65349Pkn("isHwAecEnabled")
    public boolean mIsHwAecEnabled;

    @InterfaceC65349Pkn("isHwNSEnabled")
    public boolean mIsHwNSEnabled;

    @InterfaceC65349Pkn("logger")
    public CastLogger mLogger;

    @InterfaceC65349Pkn("useMediaProjection")
    public boolean mUseMediaProjection;

    @InterfaceC65349Pkn("audioSource")
    public int mAudioSource = 8;

    @InterfaceC65349Pkn("audioStreamType")
    public int mAudioStreamType = 3;

    @InterfaceC65349Pkn("samplerate")
    public int mCaptureSampleRate = 48000;

    @InterfaceC65349Pkn("pbsamplerate")
    public int mPlaybackSampleRate = 48000;

    @InterfaceC65349Pkn("channels")
    public int mNumberOfChannels = 2;

    @InterfaceC65349Pkn("bitwidth")
    public int mBitwidth = 16;

    @InterfaceC65349Pkn("audioPtsOptimizeEnable")
    public boolean mAudioPtsOptimizeEnable = true;

    @InterfaceC65349Pkn("codecId")
    public RTCSetting.ACODEC_ID mCodecId = RTCSetting.ACODEC_ID.AAC;

    @InterfaceC65349Pkn("audioAecType")
    public AEC_TYPE mAECType = AEC_TYPE.NONE;

    @InterfaceC65349Pkn("audioAncType")
    public ANC_TYPE mANCType = ANC_TYPE.NONE;

    @InterfaceC65349Pkn("audioAgcType")
    public AGC_TYPE mAGCType = AGC_TYPE.NONE;

    @InterfaceC65349Pkn("audioBitrateMode")
    public RTCSetting.BITRATE_MODE mBitrateMode = RTCSetting.BITRATE_MODE.BITRATE_MODE_ABR;

    @InterfaceC65349Pkn("bitrate")
    public int mBitrate = 192;

    @InterfaceC65349Pkn("maxBitrate")
    public int mMaxBitrate = 192;

    @InterfaceC65349Pkn("autoPublish")
    public boolean mIsAutoPublish = true;

    @InterfaceC65349Pkn("autoSubscribe")
    public boolean mIsAutoSubscribe = true;

    @InterfaceC65349Pkn("isEnabled")
    public boolean mIsEnabled = true;

    public static int getFrameSize(int i) {
        if (i == 8000) {
            return LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;
        }
        if (i == 16000) {
            return 1280;
        }
        if (i == 32000) {
            return 2560;
        }
        if (i != 44100) {
            return i != 48000 ? 3840 : 4096;
        }
        return 3528;
    }

    public boolean isAutoPublish() {
        if (this.mIsEnabled && this.mIsAutoPublish) {
            return true;
        }
        return false;
    }

    public boolean isAutoSubscribe() {
        if (this.mIsEnabled && this.mIsAutoSubscribe) {
            return true;
        }
        return false;
    }

    public String toString() {
        return GsonProtectorUtils.toJson(new Gson(), this);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RTCAudioProfile m58clone() {
        try {
            return (RTCAudioProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public AEC_TYPE getAECType() {
        return this.mAECType;
    }

    public AGC_TYPE getAGCType() {
        return this.mAGCType;
    }

    public ANC_TYPE getANCType() {
        return this.mANCType;
    }

    public int getAudioSource() {
        return this.mAudioSource;
    }

    public int getAudioStreamType() {
        return this.mAudioStreamType;
    }

    public int getBitrate() {
        return this.mBitrate;
    }

    public RTCSetting.BITRATE_MODE getBitrateMode() {
        return this.mBitrateMode;
    }

    public int getBitwidth() {
        return this.mBitwidth;
    }

    public RTCSetting.ACODEC_ID getCodecId() {
        return this.mCodecId;
    }

    public int getMaxBitrate() {
        return this.mMaxBitrate;
    }

    public int getNumberOfChannels() {
        return this.mNumberOfChannels;
    }

    public int getPlaySampleRate() {
        return this.mPlaybackSampleRate;
    }

    public int getRecordSampleRate() {
        return this.mCaptureSampleRate;
    }

    public boolean isAudioPtsOptimizeEnabled() {
        return this.mAudioPtsOptimizeEnable;
    }

    public boolean isBluetoothSCOEnabled() {
        return this.mBluetoothSCOEnabled;
    }

    public boolean isEchoDetectionEnabled() {
        return this.mIsEchoDetectionEnabled;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public boolean isHwAECEnabled() {
        return this.mIsHwAecEnabled;
    }

    public boolean isHwNSEnabled() {
        return this.mIsHwNSEnabled;
    }

    public boolean isUseMediaProjection() {
        return this.mUseMediaProjection;
    }

    /* loaded from: classes29.dex */
    public enum AEC_TYPE {
        NONE,
        AUTO,
        AEC3,
        AECM,
        BYTE;

        public static AEC_TYPE valueOf(String str) {
            return (AEC_TYPE) V0N.LJJJ(AEC_TYPE.class, str);
        }
    }

    /* loaded from: classes29.dex */
    public enum AGC_TYPE {
        NONE,
        AUTO,
        WEBRTC,
        BYTE;

        public static AGC_TYPE valueOf(String str) {
            return (AGC_TYPE) V0N.LJJJ(AGC_TYPE.class, str);
        }
    }

    /* loaded from: classes29.dex */
    public enum ANC_TYPE {
        NONE,
        AUTO,
        NSX,
        BYTE,
        RNN;

        public static ANC_TYPE valueOf(String str) {
            return (ANC_TYPE) V0N.LJJJ(ANC_TYPE.class, str);
        }
    }

    public RTCAudioProfile(ContextManager.CastContext castContext) {
        this.mCastContext = castContext;
        this.mLogger = ContextManager.getLogger(castContext);
    }

    public RTCAudioProfile setAECType(AEC_TYPE aec_type) {
        this.mAECType = aec_type;
        return this;
    }

    public RTCAudioProfile setAGCType(AGC_TYPE agc_type) {
        this.mAGCType = agc_type;
        return this;
    }

    public RTCAudioProfile setANCType(ANC_TYPE anc_type) {
        this.mANCType = anc_type;
        return this;
    }

    public RTCAudioProfile setAudioFormat(int i) {
        this.mBitwidth = i;
        return this;
    }

    public RTCAudioProfile setAudioSource(int i) {
        this.mAudioSource = i;
        return this;
    }

    public RTCAudioProfile setAudioStreamType(int i) {
        this.mAudioStreamType = i;
        return this;
    }

    public RTCAudioProfile setBitrateMode(RTCSetting.BITRATE_MODE bitrate_mode) {
        this.mBitrateMode = bitrate_mode;
        return this;
    }

    public RTCAudioProfile setBluetoothSCOEnabled(boolean z) {
        this.mBluetoothSCOEnabled = z;
        return this;
    }

    public RTCAudioProfile setCodecId(RTCSetting.ACODEC_ID acodec_id) {
        this.mCodecId = acodec_id;
        return this;
    }

    public RTCAudioProfile setEnabled(boolean z) {
        this.mIsEnabled = z;
        if (!z) {
            this.mIsAutoPublish = false;
            this.mIsAutoSubscribe = false;
        }
        return this;
    }

    public boolean setHwAECEnabled(boolean z) {
        if (AcousticEchoCanceler.isAvailable()) {
            this.mIsHwAecEnabled = z;
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setAECEnabled ");
            LIZ.append(z);
            castLogger.i("RTCAudioProfile", X1D.LIZIZ(LIZ));
            return true;
        }
        this.mLogger.e("RTCAudioProfile", "failed to setAECEnabled, AcousticEchoCanceler not available !");
        return false;
    }

    public boolean setHwNSEnabled(boolean z) {
        if (NoiseSuppressor.isAvailable()) {
            this.mIsHwNSEnabled = z;
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setNSEnabled ");
            LIZ.append(z);
            castLogger.i("RTCAudioProfile", X1D.LIZIZ(LIZ));
            return true;
        }
        this.mLogger.e("RTCAudioProfile", "failed to setNSEnabled, NoiseSuppressor not available !");
        return false;
    }

    public RTCAudioProfile setIsAutoPublish(boolean z) {
        this.mIsAutoPublish = z;
        return this;
    }

    public RTCAudioProfile setIsAutoSubscribe(boolean z) {
        this.mIsAutoSubscribe = z;
        return this;
    }

    public RTCAudioProfile setIsEchoDetectionEnabled(boolean z) {
        this.mIsEchoDetectionEnabled = z;
        return this;
    }

    public RTCAudioProfile setNumberOfChannels(int i) {
        this.mNumberOfChannels = i;
        return this;
    }

    public RTCAudioProfile setPtsOptimizeEnabled(boolean z) {
        this.mAudioPtsOptimizeEnable = z;
        return this;
    }

    public RTCAudioProfile setSampleRate(int i) {
        this.mCaptureSampleRate = i;
        return this;
    }

    public void setUseMediaProjection(boolean z) {
        this.mUseMediaProjection = z;
    }

    public RTCAudioProfile setBitrate(int i, int i2) {
        this.mBitrate = i;
        this.mMaxBitrate = i2;
        return this;
    }
}
