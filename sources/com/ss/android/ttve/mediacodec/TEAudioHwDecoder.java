package com.ss.android.ttve.mediacodec;

import X.AnonymousClass028;
import X.C63846P3y;
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
public class TEAudioHwDecoder {
    public static long INPUT_DEQUEUE_TIMEOUT_US = 10000;
    public MediaCodec audioDecoder;
    public byte[] curAsc;
    public String curMimeType;
    public volatile boolean decoderStarted;
    public volatile long inputCountQueued;
    public volatile boolean inputEof;
    public MediaFormat inputFormat;
    public volatile long outputCountDequeued;
    public volatile boolean outputEof;
    public MediaFormat outputFormat;
    public C63846P3y theOldestPcmData;
    public int curSampleRate = -1;
    public int curChannelCount = -1;
    public LinkedBlockingQueue<C63846P3y> pcmQueue = new LinkedBlockingQueue<>();
    public MediaCodec.BufferInfo outputBufferInfo = new MediaCodec.BufferInfo();

    private int drainOutputBuffer() {
        while (true) {
            try {
                if (this.outputEof) {
                    break;
                }
                int dequeueOutputBuffer = this.audioDecoder.dequeueOutputBuffer(this.outputBufferInfo, 0L);
                if (dequeueOutputBuffer >= 0) {
                    if (this.outputBufferInfo.size > 0) {
                        ByteBuffer geOutputBufferByIndex = geOutputBufferByIndex(dequeueOutputBuffer);
                        geOutputBufferByIndex.position(this.outputBufferInfo.offset);
                        MediaCodec.BufferInfo bufferInfo = this.outputBufferInfo;
                        geOutputBufferByIndex.limit(bufferInfo.offset + bufferInfo.size);
                        byte[] bArr = new byte[this.outputBufferInfo.size];
                        geOutputBufferByIndex.get(bArr);
                        addPcmData(bArr);
                        this.outputCountDequeued++;
                    }
                    this.audioDecoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if ((this.outputBufferInfo.flags & 4) != 0) {
                        P4Q.LJFF("TEAudioHwDecoder", "output buffer eof");
                        this.outputEof = true;
                        break;
                    }
                } else if (dequeueOutputBuffer == -3) {
                    P4Q.LJFF("TEAudioHwDecoder", "output buffer changed, need to getOutputBuffers again");
                } else if (dequeueOutputBuffer == -2) {
                    this.outputFormat = this.audioDecoder.getOutputFormat();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("output buffer format changed: ");
                    LIZ.append(this.outputFormat);
                    P4Q.LJFF("TEAudioHwDecoder", X1D.LIZIZ(LIZ));
                    int integer = this.outputFormat.getInteger("sample-rate");
                    int integer2 = this.outputFormat.getInteger("channel-count");
                    if (this.curSampleRate != integer || this.curChannelCount != integer2) {
                        P4Q.LIZJ("TEAudioHwDecoder", "audio meta info changed, error error error !!!");
                    }
                } else if (dequeueOutputBuffer != -1) {
                    P4Q.LIZ("TEAudioHwDecoder", "not available output buffer");
                }
            } catch (Throwable th) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("drainOutputBuffer error: ");
                LIZ2.append(th.getMessage());
                P4Q.LIZJ("TEAudioHwDecoder", X1D.LIZIZ(LIZ2));
                return -6000;
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x002c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.media.MediaCodecInfo getGoogleMediaCodecInfo() {
        /*
            r10 = this;
            java.lang.String r0 = r10.curMimeType
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r9 = 0
            if (r0 == 0) goto La
            return r9
        La:
            android.media.MediaCodecList r1 = new android.media.MediaCodecList     // Catch: java.lang.Throwable -> La7
            r0 = 1
            r1.<init>(r0)     // Catch: java.lang.Throwable -> La7
            android.media.MediaCodecInfo[] r5 = r1.getCodecInfos()
            int r4 = r5.length
            r3 = 0
        L16:
            if (r3 >= r4) goto La7
            r7 = r5[r3]
            boolean r0 = r7.isEncoder()
            if (r0 != 0) goto L2c
            java.lang.String r1 = r7.getName()
            java.lang.String r0 = "OMX.google"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L2f
        L2c:
            int r3 = r3 + 1
            goto L16
        L2f:
            java.lang.String[] r8 = r7.getSupportedTypes()
            int r6 = r8.length
            r2 = 0
        L35:
            if (r2 >= r6) goto L2c
            r1 = r8[r2]
            java.lang.String r0 = r10.curMimeType
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L72
            java.lang.String r0 = r10.curMimeType
            android.media.MediaCodecInfo$CodecCapabilities r0 = r7.getCapabilitiesForType(r0)
            android.media.MediaCodecInfo$AudioCapabilities r6 = r0.getAudioCapabilities()
            int r0 = r10.curSampleRate
            boolean r0 = r6.isSampleRateSupported(r0)
            java.lang.String r2 = "TEAudioHwDecoder"
            if (r0 != 0) goto L75
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
        L72:
            int r2 = r2 + 1
            goto L35
        L75:
            int r1 = r10.curChannelCount
            int r0 = r6.getMaxInputChannelCount()
            if (r1 <= r0) goto La6
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
        La6:
            return r7
        La7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEAudioHwDecoder.getGoogleMediaCodecInfo():android.media.MediaCodecInfo");
    }

    private byte[] getPcmData() {
        C63846P3y c63846P3y = this.theOldestPcmData;
        if (c63846P3y != null) {
            return c63846P3y.LIZ;
        }
        return null;
    }

    private long getPcmPts() {
        C63846P3y c63846P3y = this.theOldestPcmData;
        if (c63846P3y != null) {
            return c63846P3y.LIZIZ;
        }
        return -1L;
    }

    private void releaseDecoder() {
        if (this.audioDecoder == null) {
            return;
        }
        if (this.decoderStarted) {
            try {
                this.audioDecoder.stop();
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("MediaCodec stop exception: ");
                LIZ.append(e.getMessage());
                P4Q.LIZJ("TEAudioHwDecoder", X1D.LIZIZ(LIZ));
            }
            this.decoderStarted = false;
        }
        this.audioDecoder.release();
        this.audioDecoder = null;
        resetCodecInfo();
    }

    private void resetCodecInfo() {
        this.inputCountQueued = 0L;
        this.outputCountDequeued = 0L;
        this.inputEof = false;
        this.outputEof = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.media.MediaCodec selectMediaCodec() {
        /*
            r5 = this;
            java.lang.String r0 = r5.curMimeType
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            if (r0 == 0) goto La
            return r4
        La:
            android.media.MediaCodecInfo r0 = r5.getGoogleMediaCodecInfo()
            java.lang.String r3 = "TEAudioHwDecoder"
            if (r0 != 0) goto L16
        L12:
            r0 = r4
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
            X.P4Q.LIZJ(r3, r0)
            goto L12
        L38:
            java.lang.String r0 = r5.curMimeType     // Catch: java.lang.Exception -> L3f
            android.media.MediaCodec r4 = android.media.MediaCodec.createDecoderByType(r0)     // Catch: java.lang.Exception -> L3f
            goto L59
        L3f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "createDecoderByType error: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.P4Q.LIZJ(r3, r0)
            goto L59
        L58:
            r4 = r0
        L59:
            if (r4 == 0) goto L70
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "selectMediaCodec, decoder name: "
            r1.<init>(r0)
            java.lang.String r0 = r4.getName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.P4Q.LJFF(r3, r0)
        L70:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEAudioHwDecoder.selectMediaCodec():android.media.MediaCodec");
    }

    private int startDecoder() {
        try {
            MediaCodec selectMediaCodec = selectMediaCodec();
            this.audioDecoder = selectMediaCodec;
            if (selectMediaCodec == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("create decoder failure, mime: ");
                LIZ.append(this.curMimeType);
                P4Q.LIZJ("TEAudioHwDecoder", X1D.LIZIZ(LIZ));
                return -201;
            }
            selectMediaCodec.configure(this.inputFormat, (Surface) null, (MediaCrypto) null, 0);
            this.audioDecoder.start();
            this.decoderStarted = true;
            return 0;
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("startDecoder: ");
            LIZ2.append(e.getMessage());
            P4Q.LIZJ("TEAudioHwDecoder", X1D.LIZIZ(LIZ2));
            return -203;
        }
    }

    private int closeDecoder() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("closeDecoder, ");
        LIZ.append(hashCode());
        P4Q.LJFF("TEAudioHwDecoder", X1D.LIZIZ(LIZ));
        releaseDecoder();
        this.curMimeType = null;
        this.curSampleRate = -1;
        this.curChannelCount = -1;
        this.curAsc = null;
        return 0;
    }

    private int flushDecoder() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("flushDecoder, inputEof: ");
        LIZ.append(this.inputEof);
        LIZ.append(", outputEof: ");
        LIZ.append(this.outputEof);
        LIZ.append(", inputCountQueued: ");
        LIZ.append(this.inputCountQueued);
        LIZ.append(", ");
        LIZ.append(hashCode());
        P4Q.LJFF("TEAudioHwDecoder", X1D.LIZIZ(LIZ));
        if (this.audioDecoder == null) {
            return -204;
        }
        try {
            if (this.inputEof || this.outputEof) {
                return restartDecoder();
            }
            if (this.inputCountQueued > 0) {
                this.audioDecoder.flush();
                this.inputCountQueued = 0L;
                this.outputCountDequeued = 0L;
            }
            this.pcmQueue.clear();
            this.theOldestPcmData = null;
            return 0;
        } catch (Throwable th) {
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("flushDecoder error: ");
                LIZ2.append(th.getMessage());
                P4Q.LIZJ("TEAudioHwDecoder", X1D.LIZIZ(LIZ2));
                this.pcmQueue.clear();
                this.theOldestPcmData = null;
                return -211;
            } finally {
                this.pcmQueue.clear();
                this.theOldestPcmData = null;
            }
        }
    }

    private int restartDecoder() {
        releaseDecoder();
        return startDecoder();
    }

    private void addPcmData(byte[] bArr) {
        C63846P3y c63846P3y = new C63846P3y();
        c63846P3y.LIZ = bArr;
        c63846P3y.LIZIZ = this.outputBufferInfo.presentationTimeUs;
        this.pcmQueue.add(c63846P3y);
    }

    private ByteBuffer geOutputBufferByIndex(int i) {
        return this.audioDecoder.getOutputBuffer(i);
    }

    private ByteBuffer getInputBufferByIndex(int i) {
        return this.audioDecoder.getInputBuffer(i);
    }

    private boolean sameAsc(byte[] bArr) {
        byte[] bArr2 = this.curAsc;
        if (bArr2 == null && bArr == null) {
            return true;
        }
        if (bArr2 == null || bArr == null || bArr2.length != bArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr3 = this.curAsc;
            if (i >= bArr3.length) {
                return true;
            }
            if (bArr3[i] != bArr[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    private int[] decodeFrame(byte[] bArr, long j) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        String str = "TEAudioHwDecoder";
        if (bArr == null || bArr.length <= 0) {
            i = 0;
            i2 = 0;
            z = true;
        } else {
            i = bArr.length;
            i2 = 0;
            z = false;
        }
        while (true) {
            try {
                if (this.inputEof || (i2 >= i && !z)) {
                    break;
                }
                int dequeueInputBuffer = this.audioDecoder.dequeueInputBuffer(INPUT_DEQUEUE_TIMEOUT_US);
                if (dequeueInputBuffer >= 0) {
                    if (!z) {
                        ByteBuffer inputBufferByIndex = getInputBufferByIndex(dequeueInputBuffer);
                        inputBufferByIndex.clear();
                        int min = Math.min(i - i2, inputBufferByIndex.remaining());
                        inputBufferByIndex.put(bArr, i2, min);
                        i2 += min;
                        this.audioDecoder.queueInputBuffer(dequeueInputBuffer, 0, min, j, 0);
                        this.inputCountQueued++;
                    } else {
                        this.audioDecoder.queueInputBuffer(dequeueInputBuffer, 0, 0, j, 4);
                        this.inputEof = true;
                        P4Q.LJFF("TEAudioHwDecoder", "input buffer eof");
                        break;
                    }
                } else if (dequeueInputBuffer != -1) {
                    P4Q.LIZ("TEAudioHwDecoder", "not available input buffer");
                } else {
                    P4Q.LIZ("TEAudioHwDecoder", "dequeue input buffer timeout, try again later");
                }
            } catch (Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("drainOutputBuffer error: ");
                LIZ.append(th.getMessage());
                P4Q.LIZJ(str, X1D.LIZIZ(LIZ));
                i3 = -5000;
            }
        }
        str = drainOutputBuffer();
        i3 = str;
        C63846P3y poll = this.pcmQueue.poll();
        this.theOldestPcmData = poll;
        if (poll != null) {
            i4 = poll.LIZ.length;
        } else {
            i4 = 0;
        }
        return new int[]{i3, i2, i4};
    }

    private int initDecoder(String str, int i, int i2, byte[] bArr) {
        boolean z;
        int i3;
        if (TextUtils.isEmpty(str) || i <= 0 || i2 <= 0) {
            return -101;
        }
        if (!str.equals(this.curMimeType) || this.curSampleRate != i || this.curChannelCount != i2 || !sameAsc(bArr)) {
            z = true;
        } else {
            z = false;
        }
        this.curMimeType = str;
        this.curSampleRate = i;
        this.curChannelCount = i2;
        this.curAsc = bArr;
        StringBuilder LJ = AnonymousClass028.LJ("initDecoder, mimeType: ", str, ", sampleRate: ", i, ", channelCount: ");
        LJ.append(i2);
        LJ.append(", asc size: ");
        if (bArr != null) {
            i3 = bArr.length;
        } else {
            i3 = -1;
        }
        LJ.append(i3);
        LJ.append(", this: ");
        LJ.append(hashCode());
        P4Q.LJFF("TEAudioHwDecoder", X1D.LIZIZ(LJ));
        if (!z && this.decoderStarted) {
            return 0;
        }
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(str, i, i2);
        this.inputFormat = createAudioFormat;
        if (bArr != null && bArr.length > 0) {
            createAudioFormat.setByteBuffer("csd-0", ByteBuffer.wrap(bArr));
        } else {
            createAudioFormat.setInteger("is-adts", 1);
        }
        return restartDecoder();
    }
}
