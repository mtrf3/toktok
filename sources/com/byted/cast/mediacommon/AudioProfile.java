package com.byted.cast.mediacommon;

import X.InterfaceC65349Pkn;
import X.V0N;
import X.X1D;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.NoiseSuppressor;
import com.byted.cast.mediacommon.MediaSetting;
import com.byted.cast.mediacommon.utils.Logger;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;

/* loaded from: classes29.dex */
public class AudioProfile implements Cloneable {

    @InterfaceC65349Pkn("bluetoothSCOEnabled")
    public boolean mBluetoothSCOEnabled;

    @InterfaceC65349Pkn("mIsAudioPer10ms")
    public boolean mIsAudioPer10ms;

    @InterfaceC65349Pkn("isEchoDetectionEnabled")
    public boolean mIsEchoDetectionEnabled;

    @InterfaceC65349Pkn("mIsEnabledAudioMix")
    public boolean mIsEnabledAudioMix;

    @InterfaceC65349Pkn("isForceAudioMediaProjection")
    public boolean mIsForceAudioManager;

    @InterfaceC65349Pkn("isHwAecEnabled")
    public boolean mIsHwAecEnabled;

    @InterfaceC65349Pkn("isHwNSEnabled")
    public boolean mIsHwNSEnabled;

    @InterfaceC65349Pkn("mIsSeparateAudio")
    public boolean mIsSeparateAudio;

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
    public MediaSetting.ACODEC_ID mCodecId = MediaSetting.ACODEC_ID.AAC;

    @InterfaceC65349Pkn("audioAecType")
    public AEC_TYPE mAECType = AEC_TYPE.NONE;

    @InterfaceC65349Pkn("audioAncType")
    public ANC_TYPE mANCType = ANC_TYPE.NONE;

    @InterfaceC65349Pkn("audioAgcType")
    public AGC_TYPE mAGCType = AGC_TYPE.NONE;

    @InterfaceC65349Pkn("audioBitrateMode")
    public MediaSetting.BITRATE_MODE mBitrateMode = MediaSetting.BITRATE_MODE.BITRATE_MODE_ABR;

    @InterfaceC65349Pkn("bitrate")
    public int mBitrate = 64;

    @InterfaceC65349Pkn("maxBitrate")
    public int mMaxBitrate = 192;

    @InterfaceC65349Pkn("autoPublish")
    public boolean mIsAutoPublish = true;

    @InterfaceC65349Pkn("autoSubscribe")
    public boolean mIsAutoSubscribe = true;

    @InterfaceC65349Pkn("mEnableAudio")
    public boolean mEnableAudioPause = true;

    @InterfaceC65349Pkn("mIsEnabled")
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

    public static int getSFI(int i) {
        if (i == 8000) {
            return 11;
        }
        if (i == 16000) {
            return 8;
        }
        if (i != 32000) {
            return (i == 44100 || i != 48000) ? 4 : 3;
        }
        return 5;
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
    public AudioProfile m56clone() {
        try {
            return (AudioProfile) super.clone();
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

    public MediaSetting.BITRATE_MODE getBitrateMode() {
        return this.mBitrateMode;
    }

    public int getBitwidth() {
        return this.mBitwidth;
    }

    public MediaSetting.ACODEC_ID getCodecId() {
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

    public boolean isAudioPer10ms() {
        return this.mIsAudioPer10ms;
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

    public boolean isEnableAudioPause() {
        return this.mEnableAudioPause;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public boolean isEnabledAudioMix() {
        return this.mIsEnabledAudioMix;
    }

    public boolean isHwAECEnabled() {
        return this.mIsHwAecEnabled;
    }

    public boolean isHwNSEnabled() {
        return this.mIsHwNSEnabled;
    }

    public boolean isSeparateAudio() {
        return this.mIsSeparateAudio;
    }

    public boolean mIsForceAudioManager() {
        return this.mIsForceAudioManager;
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

    public AudioProfile setAECType(AEC_TYPE aec_type) {
        this.mAECType = aec_type;
        return this;
    }

    public AudioProfile setAGCType(AGC_TYPE agc_type) {
        this.mAGCType = agc_type;
        return this;
    }

    public AudioProfile setANCType(ANC_TYPE anc_type) {
        this.mANCType = anc_type;
        return this;
    }

    public void setAudioEnablePause(boolean z) {
        this.mEnableAudioPause = z;
    }

    public void setAudioPer10ms(boolean z) {
        this.mIsAudioPer10ms = z;
    }

    public AudioProfile setAudioSource(int i) {
        this.mAudioSource = i;
        return this;
    }

    public AudioProfile setAudioStreamType(int i) {
        this.mAudioStreamType = i;
        return this;
    }

    public AudioProfile setBitrateMode(MediaSetting.BITRATE_MODE bitrate_mode) {
        this.mBitrateMode = bitrate_mode;
        return this;
    }

    public AudioProfile setBitwidth(int i) {
        this.mBitwidth = i;
        return this;
    }

    public AudioProfile setBluetoothSCOEnabled(boolean z) {
        this.mBluetoothSCOEnabled = z;
        return this;
    }

    public AudioProfile setCodecId(MediaSetting.ACODEC_ID acodec_id) {
        this.mCodecId = acodec_id;
        return this;
    }

    public void setEnableAudioMix(boolean z) {
        this.mIsEnabledAudioMix = z;
    }

    public AudioProfile setEnabled(boolean z) {
        this.mIsEnabled = z;
        if (!z) {
            this.mIsAutoPublish = false;
            this.mIsAutoSubscribe = false;
        }
        return this;
    }

    public AudioProfile setForceAudioManager(boolean z) {
        this.mIsForceAudioManager = z;
        return this;
    }

    public boolean setHwAECEnabled(boolean z) {
        if (AcousticEchoCanceler.isAvailable()) {
            this.mIsHwAecEnabled = z;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setAECEnabled ");
            LIZ.append(z);
            Logger.i("RTCAudioProfile", X1D.LIZIZ(LIZ));
            return true;
        }
        Logger.e("RTCAudioProfile", "failed to setAECEnabled, AcousticEchoCanceler not available !");
        return false;
    }

    public boolean setHwNSEnabled(boolean z) {
        if (NoiseSuppressor.isAvailable()) {
            this.mIsHwNSEnabled = z;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setNSEnabled ");
            LIZ.append(z);
            Logger.i("RTCAudioProfile", X1D.LIZIZ(LIZ));
            return true;
        }
        Logger.e("RTCAudioProfile", "failed to setNSEnabled, NoiseSuppressor not available !");
        return false;
    }

    public AudioProfile setIsAutoPublish(boolean z) {
        this.mIsAutoPublish = z;
        return this;
    }

    public AudioProfile setIsAutoSubscribe(boolean z) {
        this.mIsAutoSubscribe = z;
        return this;
    }

    public AudioProfile setIsEchoDetectionEnabled(boolean z) {
        this.mIsEchoDetectionEnabled = z;
        return this;
    }

    public AudioProfile setNumberOfChannels(int i) {
        this.mNumberOfChannels = i;
        return this;
    }

    public AudioProfile setPtsOptimizeEnabled(boolean z) {
        this.mAudioPtsOptimizeEnable = z;
        return this;
    }

    public AudioProfile setSampleRate(int i) {
        this.mCaptureSampleRate = i;
        return this;
    }

    public void setSeparateAudio(boolean z) {
        this.mIsSeparateAudio = z;
    }

    public AudioProfile setBitrate(int i, int i2) {
        this.mBitrate = i;
        this.mMaxBitrate = i2;
        return this;
    }
}
