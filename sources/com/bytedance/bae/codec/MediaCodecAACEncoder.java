package com.bytedance.bae.codec;

import X.C16880lQ;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.bytedance.realx.base.RXLogging;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class MediaCodecAACEncoder {
    public MediaCodec mAACEncoder;
    public MediaCodec.BufferInfo mBufferInfo;
    public byte[] mEncodedData;
    public ByteBuffer[] mInputBuffers;
    public ByteBuffer[] mOutputBuffers;
    public String mMimeType = "audio/mp4a-latm";
    public int mSampleRate = 44100;
    public int mChannels = 1;
    public int mProfile = 2;
    public int mBitrate = 64000;
    public int mFrameSize = 1024;

    public void closeEncoder() {
        try {
            MediaCodec mediaCodec = this.mAACEncoder;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mAACEncoder.release();
                this.mAACEncoder = null;
                RXLogging.e("MediaCodecAACEncoder", "close AAC encoder success");
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            RXLogging.e("MediaCodecAACEncoder", "close AAC encoder failed");
        }
    }

    public boolean configAndStartEncoder() {
        try {
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat(this.mMimeType, this.mSampleRate, this.mChannels);
            createAudioFormat.setInteger("bitrate", this.mBitrate);
            createAudioFormat.setInteger("aac-profile", this.mProfile);
            createAudioFormat.setInteger("profile", this.mProfile);
            createAudioFormat.setInteger("max-input-size", this.mChannels * this.mFrameSize * 100);
            this.mAACEncoder.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            this.mAACEncoder.start();
            this.mBufferInfo = new MediaCodec.BufferInfo();
            RXLogging.e("MediaCodecAACEncoder", "config AAC encoder success");
            return true;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            RXLogging.e("MediaCodecAACEncoder", "Config and Start Encoder Error");
            return false;
        }
    }

    public boolean openEncoder() {
        try {
            this.mAACEncoder = MediaCodec.createEncoderByType(this.mMimeType);
            RXLogging.e("MediaCodecAACEncoder", "open AAC encoder success");
            if (this.mAACEncoder == null) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            this.mAACEncoder = null;
            RXLogging.e("MediaCodecAACEncoder", "Open AAC encoder failed");
            return false;
        }
    }

    public MediaCodecAACEncoder() {
        RXLogging.e("MediaCodecAACEncoder", "MediaCodecAAC Encoder Created");
    }

    public byte[] getEncodedData() {
        return this.mEncodedData;
    }

    public int getFrameSize() {
        return this.mFrameSize;
    }

    public boolean encodeProcess(byte[] bArr) {
        try {
            MediaCodec mediaCodec = this.mAACEncoder;
            if (mediaCodec == null) {
                return false;
            }
            this.mEncodedData = null;
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(300L);
            if (dequeueInputBuffer >= 0) {
                ByteBuffer inputBuffer = this.mAACEncoder.getInputBuffer(dequeueInputBuffer);
                inputBuffer.clear();
                inputBuffer.put(bArr);
                this.mAACEncoder.queueInputBuffer(dequeueInputBuffer, 0, bArr.length, 0L, 0);
            }
            int dequeueOutputBuffer = this.mAACEncoder.dequeueOutputBuffer(this.mBufferInfo, 0L);
            int i = this.mBufferInfo.size;
            if (i > 0 && dequeueOutputBuffer >= 0) {
                ByteBuffer outputBuffer = this.mAACEncoder.getOutputBuffer(dequeueOutputBuffer);
                byte[] bArr2 = new byte[i];
                this.mEncodedData = bArr2;
                outputBuffer.get(bArr2, this.mBufferInfo.offset, i);
                outputBuffer.clear();
                this.mAACEncoder.releaseOutputBuffer(dequeueOutputBuffer, false);
            }
            return true;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            RXLogging.e("MediaCodecAACEncoder", "AAC Encoder Encode failed");
            return false;
        }
    }

    public void setBitRateValue(int i) {
        this.mBitrate = i;
    }

    public boolean setBitrate(int i) {
        try {
            MediaCodec mediaCodec = this.mAACEncoder;
            if (mediaCodec == null) {
                return false;
            }
            mediaCodec.stop();
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat(this.mMimeType, this.mSampleRate, this.mChannels);
            createAudioFormat.setInteger("bitrate", i);
            createAudioFormat.setInteger("aac-profile", this.mProfile);
            this.mAACEncoder.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            this.mAACEncoder.start();
            this.mBitrate = i;
            return true;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            RXLogging.e("MediaCodecAACEncoder", "Config and Start Encoder Error");
            return false;
        }
    }

    public void setChannelsValue(int i) {
        this.mChannels = i;
    }

    public void setProfileValue(String str) {
        if (str.equals("he_aac")) {
            this.mProfile = 5;
            this.mFrameSize = 2048;
        } else if (str.equals("he_aac_v2")) {
            this.mProfile = 29;
            this.mFrameSize = 2048;
        } else {
            this.mProfile = 2;
            this.mFrameSize = 1024;
        }
    }

    public void setSampeRateValue(int i) {
        this.mSampleRate = i;
    }
}
