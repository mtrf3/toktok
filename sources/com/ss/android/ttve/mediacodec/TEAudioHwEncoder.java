package com.ss.android.ttve.mediacodec;

import X.AnonymousClass028;
import X.C15890jp;
import X.C63845P3x;
import X.C63847P3z;
import X.C63868P4u;
import X.EnumC63844P3w;
import X.P40;
import X.P4Q;
import X.X1D;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.text.TextUtils;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes12.dex */
public class TEAudioHwEncoder {
    public static long INPUT_DEQUEUE_TIMEOUT_US = 10000;
    public static int TRY_AGAIN_LATER_COUNT_LIMIT = 5;
    public MediaCodec audioEncoder;
    public String curMimeType;
    public volatile boolean encoderStarted;
    public volatile long inputCountDequeued;
    public volatile boolean inputEof;
    public MediaFormat inputFormat;
    public byte[] outputAsc;
    public volatile long outputCountDequeued;
    public volatile boolean outputEof;
    public MediaFormat outputFormat;
    public int curSampleRate = -1;
    public int curChannelCount = -1;
    public int curCodecInfoAACProfile = -1;
    public int curBitrate = -1;
    public int curSampleNumPerChannel = -1;
    public int recordInputBufferSize = -1;
    public LinkedBlockingQueue<P40> remainingPcmQueue = new LinkedBlockingQueue<>();
    public C63847P3z theOldestAudioData = null;
    public LinkedBlockingQueue<C63847P3z> audioQueue = new LinkedBlockingQueue<>();
    public MediaCodec.BufferInfo outputBufferInfo = new MediaCodec.BufferInfo();

    private byte[] getAudioData() {
        C63847P3z c63847P3z = this.theOldestAudioData;
        if (c63847P3z != null) {
            return c63847P3z.LIZ;
        }
        return null;
    }

    private long getAudioPts() {
        C63847P3z c63847P3z = this.theOldestAudioData;
        if (c63847P3z != null) {
            return c63847P3z.LIZIZ;
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x002c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.media.MediaCodecInfo getGoogleEncoderCodecInfo() {
        /*
            r10 = this;
            java.lang.String r0 = r10.curMimeType
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r9 = 0
            if (r0 == 0) goto La
            return r9
        La:
            android.media.MediaCodecList r1 = new android.media.MediaCodecList     // Catch: java.lang.Throwable -> Lc4
            r0 = 1
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lc4
            android.media.MediaCodecInfo[] r5 = r1.getCodecInfos()
            int r4 = r5.length
            r3 = 0
        L16:
            if (r3 >= r4) goto Lc4
            r7 = r5[r3]
            boolean r0 = r7.isEncoder()
            if (r0 == 0) goto L2c
            java.lang.String r1 = r7.getName()
            java.lang.String r0 = "OMX.google"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L2f
        L2c:
            int r3 = r3 + 1
            goto L16
        L2f:
            java.lang.String[] r8 = r7.getSupportedTypes()
            if (r8 == 0) goto L2c
            int r6 = r8.length
            r2 = 0
        L37:
            if (r2 >= r6) goto L2c
            r1 = r8[r2]
            java.lang.String r0 = r10.curMimeType
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L69
            java.lang.String r0 = r10.curMimeType
            android.media.MediaCodecInfo$CodecCapabilities r0 = r7.getCapabilitiesForType(r0)
            android.media.MediaCodecInfo$AudioCapabilities r6 = r0.getAudioCapabilities()
            java.lang.String r2 = "TEAudioHwEncoder"
            if (r6 != 0) goto L6c
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r7.getName()
            r1.append(r0)
            java.lang.String r0 = " null audio capabilities"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.P4Q.LIZJ(r2, r0)
            goto L2c
        L69:
            int r2 = r2 + 1
            goto L37
        L6c:
            int r0 = r10.curSampleRate
            boolean r0 = r6.isSampleRateSupported(r0)
            if (r0 != 0) goto L91
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r7.getName()
            r1.append(r0)
            java.lang.String r0 = " not support SampleRate: "
            r1.append(r0)
            int r0 = r10.curSampleRate
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.P4Q.LIZJ(r2, r0)
            goto L2c
        L91:
            int r1 = r10.curChannelCount
            int r0 = r6.getMaxInputChannelCount()
            if (r1 <= r0) goto Lc3
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r7.getName()
            r1.append(r0)
            java.lang.String r0 = " not support ChannelCount: "
            r1.append(r0)
            int r0 = r10.curChannelCount
            r1.append(r0)
            java.lang.String r0 = ", max channel count is "
            r1.append(r0)
            int r0 = r6.getMaxInputChannelCount()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.P4Q.LIZJ(r2, r0)
            goto L2c
        Lc3:
            return r7
        Lc4:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEAudioHwEncoder.getGoogleEncoderCodecInfo():android.media.MediaCodecInfo");
    }

    private void releaseEncoder() {
        try {
            if (this.audioEncoder == null) {
                return;
            }
            try {
                if (this.encoderStarted) {
                    try {
                        this.audioEncoder.stop();
                    } catch (Exception e) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("MediaCodec stop exception: ");
                        LIZ.append(e.getMessage());
                        P4Q.LIZJ("TEAudioHwEncoder", X1D.LIZIZ(LIZ));
                    }
                    this.encoderStarted = false;
                }
                this.audioEncoder.release();
                this.audioEncoder = null;
            } catch (Exception e2) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("releaseEncoder: ");
                LIZ2.append(e2.getMessage());
                P4Q.LIZJ("TEAudioHwEncoder", X1D.LIZIZ(LIZ2));
            }
        } finally {
            resetCodecInfo();
        }
    }

    private void resetCodecInfo() {
        this.inputCountDequeued = 0L;
        this.outputCountDequeued = 0L;
        this.inputEof = false;
        this.outputEof = false;
        this.remainingPcmQueue.clear();
        this.audioQueue.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.media.MediaCodec selectMediaCodec() {
        /*
            r8 = this;
            java.lang.String r0 = r8.curMimeType
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r7 = 0
            if (r0 == 0) goto La
            return r7
        La:
            android.media.MediaCodecInfo r0 = r8.getGoogleEncoderCodecInfo()
            java.lang.String r6 = "TEAudioHwEncoder"
            if (r0 != 0) goto L16
        L12:
            r0 = r7
        L13:
            if (r0 != 0) goto L58
            goto L38
        L16:
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> L1f
            android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch: java.lang.Exception -> L1f
            goto L13
        L1f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "createByCodecName error: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.P4Q.LIZJ(r6, r0)
            goto L12
        L38:
            java.lang.String r0 = r8.curMimeType     // Catch: java.lang.Exception -> L3f
            android.media.MediaCodec r7 = android.media.MediaCodec.createEncoderByType(r0)     // Catch: java.lang.Exception -> L3f
            goto L59
        L3f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "createEncoderByType error: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.P4Q.LIZJ(r6, r0)
            goto L59
        L58:
            r7 = r0
        L59:
            if (r7 == 0) goto La9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "selectMediaCodec, encoder name: "
            r1.<init>(r0)
            java.lang.String r0 = r7.getName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.P4Q.LJFF(r6, r0)
            android.media.MediaFormat r0 = r8.inputFormat
            if (r0 == 0) goto La9
            android.media.MediaCodecInfo r1 = r7.getCodecInfo()
            java.lang.String r0 = r8.curMimeType
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.getCapabilitiesForType(r0)
            android.media.MediaCodecInfo$CodecProfileLevel[] r5 = r0.profileLevels
            r4 = 0
            if (r5 == 0) goto L90
            int r3 = r5.length
            r2 = 0
        L85:
            if (r2 >= r3) goto L90
            r0 = r5[r2]
            int r1 = r0.profile
            int r0 = r8.curCodecInfoAACProfile
            if (r1 != r0) goto Laa
            r4 = 1
        L90:
            if (r4 == 0) goto La9
            android.media.MediaFormat r2 = r8.inputFormat
            java.lang.String r1 = "aac-profile"
            int r0 = r8.curCodecInfoAACProfile
            r2.setInteger(r1, r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "final profile: "
            r1.append(r0)
            int r0 = r8.curCodecInfoAACProfile
            X.C01R.LIZJ(r1, r0, r1, r6)
        La9:
            return r7
        Laa:
            int r2 = r2 + 1
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEAudioHwEncoder.selectMediaCodec():android.media.MediaCodec");
    }

    private int startEncoder() {
        try {
            MediaCodec selectMediaCodec = selectMediaCodec();
            this.audioEncoder = selectMediaCodec;
            if (selectMediaCodec == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("create encoder failure, mime: ");
                LIZ.append(this.curMimeType);
                P4Q.LIZJ("TEAudioHwEncoder", X1D.LIZIZ(LIZ));
                return -201;
            }
            selectMediaCodec.configure(this.inputFormat, (Surface) null, (MediaCrypto) null, 1);
            this.audioEncoder.start();
            this.encoderStarted = true;
            return 0;
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("startEncoder: ");
            LIZ2.append(e.getMessage());
            P4Q.LIZJ("TEAudioHwEncoder", X1D.LIZIZ(LIZ2));
            return -203;
        }
    }

    private int closeEncoder() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("closeEncoder, remainingPcmQueue size: ");
        LIZ.append(this.remainingPcmQueue.size());
        LIZ.append(", audioQueue size: ");
        LIZ.append(this.audioQueue.size());
        LIZ.append(", inputCountDequeued: ");
        LIZ.append(this.inputCountDequeued);
        LIZ.append(", outputCountDequeued: ");
        LIZ.append(this.outputCountDequeued);
        P4Q.LJFF("TEAudioHwEncoder", X1D.LIZIZ(LIZ));
        releaseEncoder();
        this.curMimeType = null;
        this.curChannelCount = -1;
        this.curSampleRate = -1;
        this.curCodecInfoAACProfile = -1;
        this.curSampleNumPerChannel = -1;
        this.outputAsc = null;
        return 0;
    }

    private int restartEncoder() {
        releaseEncoder();
        return startEncoder();
    }

    private byte[] getOutputAsc() {
        return this.outputAsc;
    }

    private void addAudioData(byte[] bArr) {
        C63847P3z c63847P3z = new C63847P3z();
        c63847P3z.LIZ = bArr;
        c63847P3z.LIZIZ = this.outputBufferInfo.presentationTimeUs;
        this.audioQueue.add(c63847P3z);
    }

    private int drainOutputBuffer(boolean z) {
        long j;
        byte[] bArr;
        loop0: while (true) {
            int i = 0;
            while (true) {
                try {
                    if (!this.outputEof) {
                        MediaCodec mediaCodec = this.audioEncoder;
                        MediaCodec.BufferInfo bufferInfo = this.outputBufferInfo;
                        if (i > 0) {
                            j = 10000;
                        } else {
                            j = 0;
                        }
                        int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j);
                        if (dequeueOutputBuffer >= 0) {
                            if (this.outputBufferInfo.size > 0) {
                                ByteBuffer geOutputBufferByIndex = geOutputBufferByIndex(dequeueOutputBuffer);
                                geOutputBufferByIndex.position(this.outputBufferInfo.offset);
                                MediaCodec.BufferInfo bufferInfo2 = this.outputBufferInfo;
                                geOutputBufferByIndex.limit(bufferInfo2.offset + bufferInfo2.size);
                                byte[] bArr2 = new byte[this.outputBufferInfo.size];
                                geOutputBufferByIndex.get(bArr2);
                                if ((this.outputBufferInfo.flags & 2) != 0) {
                                    this.outputAsc = bArr2;
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append("output BUFFER_FLAG_CODEC_CONFIG, asc size: ");
                                    LIZ.append(this.outputBufferInfo.size);
                                    LIZ.append(", pts: ");
                                    LIZ.append(this.outputBufferInfo.presentationTimeUs);
                                    P4Q.LJFF("TEAudioHwEncoder", X1D.LIZIZ(LIZ));
                                } else {
                                    if (this.outputCountDequeued > 0 && this.outputBufferInfo.presentationTimeUs <= 0) {
                                        StringBuilder LIZ2 = X1D.LIZ();
                                        LIZ2.append("outputCountDequeued: ");
                                        LIZ2.append(this.outputCountDequeued);
                                        LIZ2.append(", size: ");
                                        LIZ2.append(this.outputBufferInfo.size);
                                        LIZ2.append(", pts: ");
                                        LIZ2.append(this.outputBufferInfo.presentationTimeUs);
                                        P4Q.LIZJ("TEAudioHwEncoder", X1D.LIZIZ(LIZ2));
                                    }
                                    addAudioData(bArr2);
                                    this.outputCountDequeued++;
                                }
                            }
                            this.audioEncoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                            if ((this.outputBufferInfo.flags & 4) != 0) {
                                P4Q.LJFF("TEAudioHwEncoder", "output buffer eof");
                                this.outputEof = true;
                                break;
                            }
                        } else if (dequeueOutputBuffer != -3) {
                            if (dequeueOutputBuffer != -2) {
                                if (dequeueOutputBuffer == -1) {
                                    if (z) {
                                        P4Q.LIZ("TEAudioHwEncoder", "dequeue output buffer timeout, try again later");
                                    }
                                    if (!this.inputEof && (!z || ((bArr = this.outputAsc) != null && bArr.length > 0))) {
                                        break loop0;
                                    }
                                    i++;
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    LIZ3.append("inputEof, tryAgainLaterCount: ");
                                    LIZ3.append(i);
                                    P4Q.LJFF("TEAudioHwEncoder", X1D.LIZIZ(LIZ3));
                                    if (i > TRY_AGAIN_LATER_COUNT_LIMIT) {
                                        StringBuilder LIZ4 = X1D.LIZ();
                                        LIZ4.append("dequeue output buffer timeout, tryAgainLaterCount: ");
                                        LIZ4.append(i);
                                        P4Q.LIZ("TEAudioHwEncoder", X1D.LIZIZ(LIZ4));
                                        break loop0;
                                    }
                                } else {
                                    P4Q.LIZ("TEAudioHwEncoder", "not available output buffer");
                                    break loop0;
                                }
                            } else {
                                this.outputFormat = this.audioEncoder.getOutputFormat();
                                StringBuilder LIZ5 = X1D.LIZ();
                                LIZ5.append("output buffer format changed: ");
                                LIZ5.append(this.outputFormat);
                                P4Q.LJFF("TEAudioHwEncoder", X1D.LIZIZ(LIZ5));
                                int integer = this.outputFormat.getInteger("sample-rate");
                                int integer2 = this.outputFormat.getInteger("channel-count");
                                if (this.curSampleRate != integer || this.curChannelCount != integer2) {
                                    P4Q.LIZJ("TEAudioHwEncoder", "audio meta info changed, error error error !!!");
                                }
                                ByteBuffer byteBuffer = this.outputFormat.getByteBuffer("csd-0");
                                if (byteBuffer.remaining() > 0) {
                                    byte[] bArr3 = new byte[byteBuffer.remaining()];
                                    byteBuffer.get(bArr3);
                                    this.outputAsc = bArr3;
                                }
                            }
                        } else {
                            P4Q.LJFF("TEAudioHwEncoder", "output buffer changed, need to getOutputBuffers again");
                            break;
                        }
                    } else {
                        break loop0;
                    }
                } catch (Throwable th) {
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("drainOutputBuffer error: ");
                    LIZ6.append(th.getMessage());
                    P4Q.LIZJ("TEAudioHwEncoder", X1D.LIZIZ(LIZ6));
                    return -60010;
                }
            }
        }
        return 0;
    }

    private ByteBuffer geOutputBufferByIndex(int i) {
        return this.audioEncoder.getOutputBuffer(i);
    }

    private ByteBuffer getInputBufferByIndex(int i) {
        return this.audioEncoder.getInputBuffer(i);
    }

    private void addPcmData(byte[] bArr, long j) {
        P40 p40 = new P40();
        p40.LIZ = bArr;
        p40.LIZIZ = j;
        this.remainingPcmQueue.add(p40);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0051, code lost:
    
        r17.audioEncoder.queueInputBuffer(r11, r12 ? 1 : 0, r12 ? 1 : 0, r7.LIZIZ, 4);
        r17.inputEof = true;
        r2 = X.X1D.LIZ();
        r2.append("input buffer eof, remainingPcmQueue size: ");
        r2.append(r17.remainingPcmQueue.size());
        X.P4Q.LJFF("TEAudioHwEncoder", X.X1D.LIZIZ(r2));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int encodeFrame(byte[] r18, long r19) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEAudioHwEncoder.encodeFrame(byte[], long):int");
    }

    private int initEncoder(String str, int i, int i2, int i3, int i4, int i5) {
        int i6;
        boolean z;
        int restartEncoder;
        int i7;
        int i8;
        if (C63845P3x.LIZLLL == EnumC63844P3w.AUDIO_ENC_INIT_FALLBACK.getValue()) {
            P4Q.LIZJ("TEAudioHwEncoder", "TESTING! HW AUDIO ENC INIT FALLBACK");
            return -203;
        }
        if (TextUtils.isEmpty(str) || i <= 0 || i2 <= 0 || i3 <= 0 || i4 <= 0 || i5 <= 0) {
            StringBuilder LJ = AnonymousClass028.LJ("initEncoder invalid param, mimeType: ", str, ", profile: ", i, ", sampleRate: ");
            C15890jp.LIZIZ(LJ, i2, ", channelCount: ", i3, ", bitrate: ");
            LJ.append(i4);
            LJ.append(", sampleNumPerChannel: ");
            LJ.append(i5);
            P4Q.LIZJ("TEAudioHwEncoder", X1D.LIZIZ(LJ));
            C63868P4u.LJ(1, 2L, "te_composition_audio_create_hw_encoder");
            return -101;
        }
        if (i == 2) {
            i6 = 5;
        } else {
            i6 = 2;
        }
        if (!str.equals(this.curMimeType) || this.curCodecInfoAACProfile != i6 || this.curSampleRate != i2 || this.curChannelCount != i3 || this.curSampleNumPerChannel != i5) {
            z = true;
        } else {
            z = false;
        }
        this.curMimeType = str;
        this.curCodecInfoAACProfile = i6;
        this.curSampleRate = i2;
        this.curChannelCount = i3;
        this.curBitrate = i4;
        this.curSampleNumPerChannel = i5;
        StringBuilder LJ2 = AnonymousClass028.LJ("initEncoder, mimeType: ", str, ", codecInfoAACProfile: ", i6, ", sampleRate: ");
        C15890jp.LIZIZ(LJ2, i2, ", channelCount: ", i3, ", bitrate: ");
        LJ2.append(i4);
        LJ2.append(", sampleNumPerChannel: ");
        LJ2.append(i5);
        P4Q.LJFF("TEAudioHwEncoder", X1D.LIZIZ(LJ2));
        if (z || !this.encoderStarted) {
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat(str, i2, i3);
            this.inputFormat = createAudioFormat;
            createAudioFormat.setInteger("bitrate", i4);
            this.inputFormat.setInteger("aac-profile", 2);
            int i9 = this.curChannelCount * i5 * 2 * 2;
            this.inputFormat.setInteger("max-input-size", i9);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("KEY_MAX_INPUT_SIZE: ");
            LIZ.append(i9);
            P4Q.LJFF("TEAudioHwEncoder", X1D.LIZIZ(LIZ));
            restartEncoder = restartEncoder();
            if (restartEncoder != 0) {
                i7 = 1;
                i8 = 1;
                C63868P4u.LJ(i8, i7, "te_composition_audio_create_hw_encoder");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("initEncoder, result: ");
                LIZ2.append(restartEncoder);
                LIZ2.append(", monitor: ");
                LIZ2.append(i7);
                P4Q.LJFF("TEAudioHwEncoder", X1D.LIZIZ(LIZ2));
                return restartEncoder;
            }
        }
        P4Q.LJFF("TEAudioHwEncoder", "initEncoder, try to get asc start");
        i8 = 1;
        restartEncoder = drainOutputBuffer(true);
        P4Q.LJFF("TEAudioHwEncoder", "initEncoder, try to get asc end");
        if (restartEncoder == 0) {
            i7 = 0;
        } else {
            i7 = 3;
        }
        C63868P4u.LJ(i8, i7, "te_composition_audio_create_hw_encoder");
        StringBuilder LIZ22 = X1D.LIZ();
        LIZ22.append("initEncoder, result: ");
        LIZ22.append(restartEncoder);
        LIZ22.append(", monitor: ");
        LIZ22.append(i7);
        P4Q.LJFF("TEAudioHwEncoder", X1D.LIZIZ(LIZ22));
        return restartEncoder;
    }
}
