package X;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Range;
import android.view.Surface;
import com.lynx.canvas.recorder.MediaRecorder;
import com.lynx.tasm.utils.EnvUtils;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class P5E implements P5L {
    public P5M LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public String LJIILJJIL;
    public Surface LJIILL;
    public MediaCodec.BufferInfo LJIILLIIL;
    public MediaCodec.BufferInfo LJIIZILJ;
    public MediaCodec LJIJ;
    public MediaCodec LJIJI;
    public MediaMuxer LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public long LJJIFFI;
    public long LJJII;
    public int LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public int LJJIIZ;
    public long LJJIIZI;
    public long LJJIJ;
    public long LJJIJIIJI;
    public long LJJIJIIJIL;
    public long[] LJJIJIL;
    public String LJIILIIL = "";
    public final ArrayList<String> LJJIJL = new ArrayList<>();
    public final PPT LIZ = (PPT) VEZ.LIZIZ().LIZ(PPT.class);

    public final synchronized void LJIILIIL() {
        this.LJIL = false;
        if (this.LJJ) {
            this.LJJ = false;
        }
    }

    public final String LIZIZ() {
        String LIZJ;
        String str = this.LIZLLL;
        if (str == null || str.length() <= 0 || (LIZJ = LIZJ(this.LIZLLL)) == null) {
            return LIZJ(EnvUtils.getCacheDir());
        }
        return LIZJ;
    }

    public final void LJFF() {
        ByteBuffer[] outputBuffers;
        MediaCodec mediaCodec = this.LJIJI;
        if (mediaCodec == null || (outputBuffers = mediaCodec.getOutputBuffers()) == null) {
            return;
        }
        while (true) {
            int dequeueOutputBuffer = this.LJIJI.dequeueOutputBuffer(this.LJIIZILJ, 0L);
            if (dequeueOutputBuffer < 0) {
                if (dequeueOutputBuffer == -1) {
                    return;
                }
                if (dequeueOutputBuffer == -3) {
                    outputBuffers = this.LJIJI.getOutputBuffers();
                } else if (dequeueOutputBuffer == -2) {
                    LJIIL(true);
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("unexpected result from encoder.dequeueOutputBuffer: ");
                    LIZ.append(dequeueOutputBuffer);
                    O5Y.LJJJ("KryptonMediaRecorder", X1D.LIZIZ(LIZ));
                }
            } else {
                ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                if (byteBuffer != null) {
                    MediaCodec.BufferInfo bufferInfo = this.LJIIZILJ;
                    if ((bufferInfo.flags & 2) != 0) {
                        bufferInfo.size = 0;
                    }
                    if (this.LJIJJLI && bufferInfo.size != 0) {
                        byteBuffer.position(bufferInfo.offset);
                        MediaCodec.BufferInfo bufferInfo2 = this.LJIIZILJ;
                        byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                        this.LJIJJ.writeSampleData(this.LJJIIJZLJL, byteBuffer, this.LJIIZILJ);
                    }
                    this.LJIJI.releaseOutputBuffer(dequeueOutputBuffer, false);
                } else {
                    throw new RuntimeException(C0NY.LIZIZ("encoderOutputBuffer ", dequeueOutputBuffer, " was null"));
                }
            }
        }
    }

    public final void LJIIIZ() {
        this.LJIIZILJ = new MediaCodec.BufferInfo();
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", "audio/mp4a-latm");
        mediaFormat.setInteger("aac-profile", 2);
        mediaFormat.setInteger("sample-rate", this.LJIIJJI);
        mediaFormat.setInteger("channel-count", this.LJIIJ);
        mediaFormat.setInteger("bitrate", this.LJIIIZ);
        mediaFormat.setInteger("max-input-size", 32768);
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
        this.LJIJI = createEncoderByType;
        createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
        this.LJIJI.start();
    }

    public final void LJIIJ() {
        int i;
        int i2;
        int i3;
        int i4;
        Range<Integer> range;
        Range<Integer> range2;
        int i5;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i6;
        this.LJIILLIIL = new MediaCodec.BufferInfo();
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
        this.LJIJ = createEncoderByType;
        if (this.LJIIL) {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = createEncoderByType.getCodecInfo().getCapabilitiesForType(this.LIZJ);
            int i7 = 4;
            if (capabilitiesForType != null && (videoCapabilities = capabilitiesForType.getVideoCapabilities()) != null) {
                if (videoCapabilities.getWidthAlignment() > 4) {
                    i6 = videoCapabilities.getWidthAlignment();
                } else {
                    i6 = 4;
                }
                if (videoCapabilities.getHeightAlignment() > 4) {
                    i7 = videoCapabilities.getHeightAlignment();
                }
                range = videoCapabilities.getSupportedFrameRates();
                range2 = videoCapabilities.getBitrateRange();
                Range<Integer> supportedWidths = videoCapabilities.getSupportedWidths();
                Range<Integer> supportedHeights = videoCapabilities.getSupportedHeights();
                i = supportedWidths.getLower().intValue();
                i2 = supportedWidths.getUpper().intValue();
                i3 = supportedHeights.getLower().intValue();
                i4 = supportedHeights.getUpper().intValue();
                i5 = i7;
                StringBuilder LIZJ = C06460Ne.LIZJ("widthRange(", i, ",", i2, "),heightRange(");
                C15890jp.LIZIZ(LIZJ, i3, ",", i4, "),frameRateRange(");
                LIZJ.append(range.getLower());
                LIZJ.append(",");
                LIZJ.append(range.getUpper());
                LIZJ.append("),bitRateRange(");
                LIZJ.append(range2.getLower());
                LIZJ.append(",");
                LIZJ.append(range2.getUpper());
                LIZJ.append(")");
                this.LJIILIIL = X1D.LIZIZ(LIZJ);
                i7 = i6;
            } else {
                i = 176;
                i2 = 1920;
                i3 = 144;
                i4 = 1080;
                range = null;
                range2 = null;
                i5 = 4;
            }
            int i8 = this.LJ;
            int i9 = this.LJFF;
            if (i8 < i9) {
                int i10 = i3;
                i3 = i;
                i = i10;
            } else {
                int i11 = i2;
                i2 = i4;
                i4 = i11;
            }
            if (i8 > i4 || i9 > i2) {
                int i12 = i8 * i2;
                int i13 = i9 * i4;
                if (i12 > i13) {
                    if (i8 <= 0) {
                        i8 = 1;
                    }
                    i9 = i13 / i8;
                    i8 = i4;
                } else {
                    if (i9 <= 0) {
                        i9 = 1;
                    }
                    i8 = i12 / i9;
                    i9 = i2;
                }
            }
            if (i8 % i7 != 0) {
                i8 = (i8 / i7) * i7;
            }
            if (i9 % i5 != 0) {
                i9 = (i9 / i5) * i5;
            }
            int LJIILJJIL = LJIILJJIL(i8, null, i, i4);
            int LJIILJJIL2 = LJIILJJIL(i9, null, i3, i2);
            int LJIILJJIL3 = LJIILJJIL(this.LJII, range, 0, 960);
            int LJIILJJIL4 = LJIILJJIL(this.LJI, range2, 280000, 30000000);
            if (this.LJ != LJIILJJIL || this.LJFF != LJIILJJIL2 || this.LJII != LJIILJJIL3 || this.LJI != LJIILJJIL4) {
                StringBuilder LIZJ2 = C06460Ne.LIZJ("adjust video config to width: ", LJIILJJIL, ", height: ", LJIILJJIL2, ", bps: ");
                C15890jp.LIZIZ(LIZJ2, LJIILJJIL4, ", fps: ", LJIILJJIL3, " from original width: ");
                LIZJ2.append(this.LJ);
                LIZJ2.append(", height: ");
                LIZJ2.append(this.LJFF);
                LIZJ2.append(", bps: ");
                LIZJ2.append(this.LJI);
                LIZJ2.append(", fps: ");
                LIZJ2.append(this.LJII);
                LIZJ2.append(", range:");
                LIZJ2.append(this.LJIILIIL);
                O5Y.LJJJ("KryptonMediaRecorder", X1D.LIZIZ(LIZJ2));
                this.LJ = LJIILJJIL;
                this.LJFF = LJIILJJIL2;
                this.LJII = LJIILJJIL3;
                this.LJI = LJIILJJIL4;
            }
            this.LJIIL = true;
        }
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", this.LJ, this.LJFF);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", this.LJI);
        createVideoFormat.setInteger("frame-rate", this.LJII);
        createVideoFormat.setInteger("i-frame-interval", 1);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("create format width: ");
        LIZ.append(this.LJ);
        LIZ.append(", height: ");
        LIZ.append(this.LJFF);
        LIZ.append(", bps: ");
        LIZ.append(this.LJI);
        LIZ.append(", fps: ");
        LIZ.append(this.LJII);
        O5Y.LJJJ("KryptonMediaRecorder", X1D.LIZIZ(LIZ));
        this.LJIJ.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.LJIILL = this.LJIJ.createInputSurface();
        this.LJIJ.start();
    }

    public final void LJIIJJI() {
        MediaCodec mediaCodec = this.LJIJ;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.LJIJ.release();
            this.LJIJ = null;
        }
        MediaCodec mediaCodec2 = this.LJIJI;
        if (mediaCodec2 != null) {
            mediaCodec2.stop();
            this.LJIJI.release();
            this.LJIJI = null;
        }
        this.LJIJJ.stop();
        this.LJIJJ.release();
        this.LJIJJ = null;
    }

    public static long LIZLLL() {
        long nanoTime = System.nanoTime();
        return ((nanoTime - ((nanoTime / 1000000) * 1000000)) / 1000) + (System.currentTimeMillis() * 1000);
    }

    public static String LIZJ(String str) {
        if (str == null) {
            return null;
        }
        try {
            File createTempFile = File.createTempFile("krypton", ".mp4", new File(str));
            if (createTempFile.exists()) {
                C16880lQ.LLLZZIL(createTempFile);
            }
            return createTempFile.getPath();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void LJ(String str) {
        try {
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                if (C16880lQ.LLLZZIL(file)) {
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("delete file error for ");
                LIZ.append(str);
                O5Y.LJIILIIL("KryptonMediaRecorder", X1D.LIZIZ(LIZ));
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("delete file error for ");
                LIZ2.append(str);
                LIZ2.append(", file not exists");
                O5Y.LJIILIIL("KryptonMediaRecorder", X1D.LIZIZ(LIZ2));
            }
        } catch (Throwable th) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("delete file error for ", str, " exception ");
            LIZIZ.append(th.toString());
            O5Y.LJIILIIL("KryptonMediaRecorder", X1D.LIZIZ(LIZIZ));
        }
    }

    public final void LJI(boolean z) {
        ByteBuffer[] outputBuffers;
        long LIZLLL;
        MediaCodec mediaCodec = this.LJIJ;
        if (mediaCodec == null || (outputBuffers = mediaCodec.getOutputBuffers()) == null) {
            return;
        }
        while (true) {
            int dequeueOutputBuffer = this.LJIJ.dequeueOutputBuffer(this.LJIILLIIL, 0L);
            if (dequeueOutputBuffer < 0) {
                if (dequeueOutputBuffer != -3) {
                    if (dequeueOutputBuffer != -2) {
                        if (dequeueOutputBuffer != -1) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("unexpected result from encoder.dequeueOutputBuffer: ");
                            LIZ.append(dequeueOutputBuffer);
                            O5Y.LJJLIIIJJI("KryptonMediaRecorder", X1D.LIZIZ(LIZ));
                        } else if (!z) {
                            return;
                        }
                    } else {
                        LJIIL(false);
                    }
                } else {
                    outputBuffers = this.LJIJ.getOutputBuffers();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("encoder output buffer length:");
                    LIZ2.append(outputBuffers.length);
                    O5Y.LJJJ("KryptonMediaRecorder", X1D.LIZIZ(LIZ2));
                }
            } else {
                ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                if (byteBuffer != null) {
                    MediaCodec.BufferInfo bufferInfo = this.LJIILLIIL;
                    if ((bufferInfo.flags & 2) != 0) {
                        bufferInfo.size = 0;
                    }
                    if (this.LJIJJLI && bufferInfo.size > 0) {
                        byteBuffer.position(bufferInfo.offset);
                        MediaCodec.BufferInfo bufferInfo2 = this.LJIILLIIL;
                        byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                        MediaCodec.BufferInfo bufferInfo3 = this.LJIILLIIL;
                        synchronized (this) {
                            if (this.LJJI) {
                                LIZLLL = this.LJJIFFI;
                            } else {
                                LIZLLL = (LIZLLL() - this.LJJIJIIJIL) - this.LJJIJ;
                            }
                        }
                        bufferInfo3.presentationTimeUs = LIZLLL;
                        if (!this.LJIL) {
                            MediaCodec.BufferInfo bufferInfo4 = this.LJIILLIIL;
                            long j = bufferInfo4.presentationTimeUs;
                            long j2 = this.LJJIJIIJI;
                            if (j <= j2) {
                                bufferInfo4.presentationTimeUs = j2 + 8000;
                            }
                            this.LJJIJIIJI = bufferInfo4.presentationTimeUs;
                            this.LJIJJ.writeSampleData(this.LJJIIZ, byteBuffer, bufferInfo4);
                        }
                    }
                    this.LJIJ.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if ((this.LJIILLIIL.flags & 4) != 0) {
                        if (!z) {
                            O5Y.LJJLIIIJJI("KryptonMediaRecorder", "reached end of stream unexpectedly");
                            return;
                        }
                        return;
                    }
                } else {
                    throw new RuntimeException(C0NY.LIZIZ("encoderOutputBuffer ", dequeueOutputBuffer, " was null"));
                }
            }
        }
    }

    public final void LJIIIIZZ(String str) {
        String str2 = this.LJIILJJIL;
        synchronized (this) {
            if (str2 != null) {
                LJ(str2);
            }
        }
        P5M p5m = this.LIZIZ;
        if (p5m != null) {
            ((MediaRecorder) p5m).LJFF(str);
        }
    }

    public final void LJIIL(boolean z) {
        if (!this.LJIJJLI) {
            if (z) {
                this.LJJIIJZLJL = this.LJIJJ.addTrack(this.LJIJI.getOutputFormat());
            } else {
                this.LJJIIZ = this.LJIJJ.addTrack(this.LJIJ.getOutputFormat());
            }
            int i = this.LJJIIJ + 1;
            this.LJJIIJ = i;
            if (i == this.LJJIII) {
                this.LJIJJ.start();
                this.LJIJJLI = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("output format already changed!");
    }

    public final void LJII(String str, String str2) {
        synchronized (this) {
            if (str != null) {
                LJ(str);
            }
        }
        P5M p5m = this.LIZIZ;
        if (p5m != null) {
            ((MediaRecorder) p5m).LIZIZ(str2);
        }
    }

    public static int LJIILJJIL(int i, Range range, int i2, int i3) {
        if (range != null) {
            if (i > ((Integer) range.getUpper()).intValue()) {
                return ((Integer) range.getUpper()).intValue();
            }
            if (i < ((Integer) range.getLower()).intValue()) {
                return ((Integer) range.getLower()).intValue();
            }
        } else {
            if (i > i3) {
                return i3;
            }
            if (i < i2) {
                return i2;
            }
        }
        return i;
    }

    public static boolean LIZ(MediaExtractor mediaExtractor, MediaMuxer mediaMuxer, P5H p5h, ByteBuffer byteBuffer, int i, int i2) {
        mediaExtractor.selectTrack(i);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        long j = 0;
        long j2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        while (true) {
            P5I[] p5iArr = p5h.LIZ;
            if (i4 < p5iArr.length) {
                P5I p5i = p5iArr[i4];
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("start time ");
                LIZ.append(p5i.LIZ);
                LIZ.append(", end time");
                LIZ.append(p5i.LIZIZ);
                O5Y.LJJJ("KryptonMediaRecorder", X1D.LIZIZ(LIZ));
                mediaExtractor.seekTo(p5i.LIZ, i3);
                long j3 = -1;
                while (true) {
                    int readSampleData = mediaExtractor.readSampleData(byteBuffer, i3);
                    if (readSampleData < 0) {
                        mediaExtractor.unselectTrack(i);
                        break;
                    }
                    long sampleTime = mediaExtractor.getSampleTime();
                    int sampleFlags = mediaExtractor.getSampleFlags();
                    if (sampleTime > p5i.LIZIZ) {
                        StringBuilder LIZJ = V10.LIZJ("presentationTimeUs > endTime ", sampleTime, " > ");
                        LIZJ.append(p5i.LIZIZ);
                        O5Y.LJJJ("KryptonMediaRecorder", X1D.LIZIZ(LIZJ));
                        break;
                    }
                    if (p5i.LIZJ == -1) {
                        p5i.LIZ = sampleTime;
                        p5i.LIZJ = j2;
                    }
                    long j4 = p5i.LIZ;
                    if (sampleTime < j4) {
                        mediaExtractor.advance();
                    } else {
                        long j5 = (sampleTime - j4) + p5i.LIZJ;
                        if (j5 < j) {
                            mediaExtractor.advance();
                        } else {
                            bufferInfo.offset = 0;
                            bufferInfo.size = readSampleData;
                            bufferInfo.flags = sampleFlags;
                            bufferInfo.presentationTimeUs = j5;
                            mediaMuxer.writeSampleData(i2, byteBuffer, bufferInfo);
                            mediaExtractor.advance();
                            j = j5;
                            j3 = sampleTime;
                            i3 = 0;
                            z = true;
                        }
                    }
                    i3 = 0;
                }
                if (j3 != -1) {
                    j2 = (j3 - p5i.LIZ) + j2;
                } else {
                    p5i.LIZ = p5i.LIZIZ;
                }
                i4++;
                i3 = 0;
            } else {
                return z;
            }
        }
    }
}
