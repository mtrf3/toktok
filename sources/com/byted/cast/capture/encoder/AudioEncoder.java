package com.byted.cast.capture.encoder;

import X.X1D;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.byted.cast.mediacommon.AudioProfile;
import com.byted.cast.mediacommon.MediaMonitor;
import com.byted.cast.mediacommon.MediaSetting;
import com.byted.cast.mediacommon.utils.Logger;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class AudioEncoder extends MediaEncoder {
    public IRecorderListener mRecordListener;
    public AudioProfile mSetting;

    /* loaded from: classes29.dex */
    public interface IRecorderListener {
        void onAudioEncoder(String str, int i, int i2, int i3, int i4);

        void onAudioFrameAvailable(byte[] bArr, MediaCodec.BufferInfo bufferInfo, MediaSetting.ACODEC_ID acodec_id, long j);

        void onAudioRecordFailed(int i);

        void onEncoderStop();

        void onOutputFormatChange(MediaFormat mediaFormat);
    }

    @Override // com.byted.cast.capture.encoder.MediaEncoder
    public void NotifyMessager(int i, String str) {
    }

    @Override // com.byted.cast.capture.encoder.MediaEncoder
    public String getTag() {
        return "AudioEncoder";
    }

    @Override // com.byted.cast.capture.encoder.MediaEncoder
    public void onRecevieFrameTimeout() {
    }

    @Override // com.byted.cast.capture.encoder.MediaEncoder
    public void onEncoderStop() {
        IRecorderListener iRecorderListener = this.mRecordListener;
        if (iRecorderListener != null) {
            iRecorderListener.onEncoderStop();
        }
    }

    public void prepare() {
        int i;
        Logger.i("AudioEncoder", "audio prepare:");
        if (this.mSetting.getNumberOfChannels() == 1) {
            i = 16;
        } else {
            i = 12;
        }
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", this.mSetting.getRecordSampleRate(), this.mSetting.getNumberOfChannels());
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("channel-mask", i);
        createAudioFormat.setInteger("bitrate", this.mSetting.getBitrate() * 1000);
        createAudioFormat.setInteger("channel-count", this.mSetting.getNumberOfChannels());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("format: ");
        LIZ.append(createAudioFormat);
        Logger.i("AudioEncoder", X1D.LIZIZ(LIZ));
        try {
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            this.mMediaCodec = createEncoderByType;
            if (createEncoderByType != null) {
                createEncoderByType.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
                this.mMediaCodec.start();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("prepare:");
                LIZ2.append(this.mMediaCodec);
                Logger.i("AudioEncoder", X1D.LIZIZ(LIZ2));
            }
        } catch (IOException e) {
            MediaMonitor.onMonitor("MediaCapture_Error", 100003, "mMediaCodec", e.toString());
            release();
            Logger.e("AudioEncoder", e.toString());
            IRecorderListener iRecorderListener = this.mRecordListener;
            if (iRecorderListener != null) {
                iRecorderListener.onAudioRecordFailed(14004004);
            }
        }
        IRecorderListener iRecorderListener2 = this.mRecordListener;
        if (iRecorderListener2 != null) {
            iRecorderListener2.onAudioEncoder("audio/mp4a-latm", this.mSetting.getRecordSampleRate(), this.mSetting.getNumberOfChannels(), this.mSetting.getBitwidth(), this.mSetting.getBitrate());
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mCodecType", "audio/mp4a-latm");
            jSONObject.put("SampleRate", this.mSetting.getRecordSampleRate());
            jSONObject.put("Channels", this.mSetting.getNumberOfChannels());
            jSONObject.put("Bitwidth", this.mSetting.getBitwidth());
            jSONObject.put("Bitrate", this.mSetting.getBitrate());
            MediaMonitor.onMonitor("MediaCapture_Audio_Param", jSONObject.toString());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        Logger.i("AudioEncoder", "prepare finishing");
    }

    @Override // com.byted.cast.capture.encoder.MediaEncoder
    public void release() {
        super.release();
        this.mSetting = null;
        this.mRecordListener = null;
    }

    @Override // com.byted.cast.capture.encoder.MediaEncoder
    public void onOutputFormatChange(MediaFormat mediaFormat) {
        IRecorderListener iRecorderListener = this.mRecordListener;
        if (iRecorderListener != null) {
            iRecorderListener.onOutputFormatChange(mediaFormat);
        }
    }

    public AudioEncoder(AudioProfile audioProfile, IRecorderListener iRecorderListener) {
        this.mSetting = audioProfile;
        this.mRecordListener = iRecorderListener;
    }

    private void addADTStoPacket(byte[] bArr, int i) {
        int sfi = AudioProfile.getSFI(this.mSetting.getRecordSampleRate());
        int numberOfChannels = this.mSetting.getNumberOfChannels();
        bArr[0] = -1;
        bArr[1] = -7;
        bArr[2] = (byte) (64 + (sfi << 2) + (numberOfChannels >> 2));
        bArr[3] = (byte) (((numberOfChannels & 3) << 6) + (i >> 11));
        bArr[4] = (byte) ((i & 2047) >> 3);
        bArr[5] = (byte) (((i & 7) << 5) + 31);
        bArr[6] = -4;
    }

    @Override // com.byted.cast.capture.encoder.MediaEncoder
    public void handleOutputBuffer(byte[] bArr, MediaCodec.BufferInfo bufferInfo, int i, int i2) {
        if (i2 == 1) {
            return;
        }
        int length = bArr.length;
        int i3 = length + 7;
        byte[] bArr2 = new byte[i3];
        addADTStoPacket(bArr2, i3);
        System.arraycopy(bArr, 0, bArr2, 7, length);
        IRecorderListener iRecorderListener = this.mRecordListener;
        if (iRecorderListener != null) {
            iRecorderListener.onAudioFrameAvailable(bArr2, bufferInfo, MediaSetting.ACODEC_ID.AAC, bufferInfo.presentationTimeUs);
        }
        printFPS(bufferInfo.presentationTimeUs, bArr.length);
    }
}
