package com.ss.ttm.player;

import X.C16880lQ;
import X.C1JX;
import X.J2M;
import X.O5Y;
import X.UC7;
import X.V16;
import X.X1D;
import Y.ARunnableS30S0200000_11;
import Y.ARunnableS47S0100000_11;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes12.dex */
public class AJMediaCodec {
    public static final ArrayList<MediaCodecInfo> LJIJJ = new ArrayList<>();
    public static final Object LJIJJLI = new Object();
    public static boolean LJIL = false;
    public static boolean LJJ = false;
    public static boolean LJJI = false;
    public static boolean LJJIFFI = false;
    public static int LJJII = 1;
    public static int LJJIII = 0;
    public static final Object LJJIIJ = new Object();
    public static int LJJIIJZLJL = 0;
    public static final ReentrantLock LJJIIZ;
    public static final Condition LJJIIZI;
    public ByteBuffer[] LIZ;
    public ByteBuffer[] LIZIZ;
    public boolean LIZJ;
    public MediaCodec LIZLLL;
    public MediaCodec.BufferInfo LJ;
    public MediaFormat LJFF;
    public DummySurface LJII;
    public Handler LJIIJ;
    public HandlerThread LJIIL;
    public String LJIJI;
    public final AJMediaFormat LJI = new AJMediaFormat();
    public int LJIIIIZZ = 0;
    public long LJIIIZ = 0;
    public int LJIIJJI = 0;
    public boolean LJIILIIL = false;
    public MediaCodecInfo LJIILJJIL = null;
    public String LJIILL = null;
    public int LJIILLIIL = -1;
    public int LJIIZILJ = 0;
    public int LJIJ = 0;

    public static final native void _clearBufferIndex(long j);

    public static final native void _onEmptyBuffer(long j, int i);

    public static final native void _onError(long j);

    public static final native void _onFilledBuffer(long j, int i, int i2, int i3, long j2, int i4);

    public static final native void _onFormatChanged(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    public static final native void _setSurfaceCompleted(long j);

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        LJJIIZ = reentrantLock;
        LJJIIZI = reentrantLock.newCondition();
    }

    private boolean supportSetSurface() {
        return !LJJ;
    }

    public final void LJFF() {
        synchronized (LJJIIJ) {
            if (this.LJIILIIL) {
                return;
            }
            _setSurfaceCompleted(this.LJIIIZ);
        }
    }

    public void close() {
        if (this.LIZLLL != null) {
            stop();
            MediaCodec mediaCodec = this.LIZLLL;
            this.LIZIZ = null;
            this.LIZ = null;
            if (this.LJIIIIZZ == 1 && J2M.LIZ >= 23) {
                synchronized (LJJIIJ) {
                    HandlerThread handlerThread = this.LJIIL;
                    if (handlerThread != null) {
                        handlerThread.quit();
                    }
                    _clearBufferIndex(this.LJIIIZ);
                    this.LJIILIIL = true;
                    this.LIZLLL = null;
                }
            } else {
                this.LIZLLL = null;
            }
            if (LJJIII > 0) {
                LJI(mediaCodec);
            } else {
                try {
                    V16.LIZLLL(new ARunnableS30S0200000_11(this, mediaCodec, 19));
                } catch (Throwable unused) {
                    O5Y.LJII("JAJMediaCodec", this, "new thread failed");
                    LJI(mediaCodec);
                }
            }
        }
        O5Y.LJI("JAJMediaCodec", this, "~JAJMediaCodec#}");
    }

    public int flush() {
        try {
            this.LIZLLL.flush();
            if (this.LJIIIIZZ == 1) {
                synchronized (LJJIIJ) {
                    this.LJIIJJI++;
                    this.LJIIJ.post(new ARunnableS47S0100000_11(this, 61));
                }
                return 0;
            }
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    public int getChannelCount() {
        MediaFormat mediaFormat = this.LJFF;
        if (mediaFormat != null) {
            try {
                return mediaFormat.getInteger("channel-count");
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public int getColorFormat() {
        MediaFormat mediaFormat = this.LJFF;
        if (mediaFormat != null) {
            try {
                int integer = mediaFormat.getInteger("color-format");
                if (integer != 21 && integer != 2130706688 && integer != 2141391872) {
                    return 0;
                }
                return 3;
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public int getColorTransfer() {
        MediaFormat mediaFormat = this.LJFF;
        if (mediaFormat != null) {
            try {
                int integer = mediaFormat.getInteger("color-transfer");
                if (integer != 6) {
                    if (integer != 7) {
                        return 0;
                    }
                    return 18;
                }
                return 16;
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public int getFormatHeight() {
        MediaFormat mediaFormat = this.LJFF;
        if (mediaFormat != null) {
            try {
                if (mediaFormat.containsKey("crop-right") && this.LJFF.containsKey("crop-left") && this.LJFF.containsKey("crop-bottom") && this.LJFF.containsKey("crop-top")) {
                    return (this.LJFF.getInteger("crop-bottom") - this.LJFF.getInteger("crop-top")) + 1;
                }
                return this.LJFF.getInteger("height");
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public int getFormatWidth() {
        MediaFormat mediaFormat = this.LJFF;
        if (mediaFormat != null) {
            try {
                if (mediaFormat.containsKey("crop-right") && this.LJFF.containsKey("crop-left") && this.LJFF.containsKey("crop-bottom") && this.LJFF.containsKey("crop-top")) {
                    return (this.LJFF.getInteger("crop-right") - this.LJFF.getInteger("crop-left")) + 1;
                }
                return this.LJFF.getInteger("width");
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public ByteBuffer[] getInputBuffers() {
        if (this.LIZJ) {
            return this.LIZIZ;
        }
        return null;
    }

    public int getSampleRate() {
        MediaFormat mediaFormat = this.LJFF;
        if (mediaFormat != null) {
            try {
                return mediaFormat.getInteger("sample-rate");
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public int getSliceHeight() {
        MediaFormat mediaFormat = this.LJFF;
        if (mediaFormat != null) {
            try {
                return mediaFormat.getInteger("slice-height");
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public int getStride() {
        MediaFormat mediaFormat = this.LJFF;
        if (mediaFormat != null) {
            try {
                return mediaFormat.getInteger("stride");
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    public int isAdaptivePlayback() {
        ?? r0;
        String str;
        int i = this.LJIILLIIL;
        if (i != -1) {
            return i;
        }
        MediaCodecInfo mediaCodecInfo = this.LJIILJJIL;
        if (mediaCodecInfo != null && (str = this.LJIILL) != null) {
            try {
                r0 = mediaCodecInfo.getCapabilitiesForType(str).isFeatureSupported("adaptive-playback");
            } catch (Exception unused) {
            }
            this.LJIILLIIL = r0;
            if ("Q7-G1".equals(Build.MODEL) && "kunlun".equals(Build.HARDWARE)) {
                "GK6323V100C".equals(Build.BOARD);
            }
            return this.LJIILLIIL;
        }
        r0 = 1;
        this.LJIILLIIL = r0;
        if ("Q7-G1".equals(Build.MODEL)) {
            "GK6323V100C".equals(Build.BOARD);
        }
        return this.LJIILLIIL;
    }

    public int start() {
        try {
            this.LIZLLL.start();
            if (this.LJIIIIZZ == 0) {
                this.LIZIZ = this.LIZLLL.getInputBuffers();
                if (J2M.LIZ >= 21) {
                    this.LIZ = this.LIZLLL.getOutputBuffers();
                }
            } else {
                this.LIZIZ = null;
                this.LIZ = null;
            }
            this.LIZJ = true;
            this.LJ = new MediaCodec.BufferInfo();
            return 0;
        } catch (Exception e) {
            LIZIZ(e);
            return -1;
        }
    }

    public int stop() {
        if (this.LIZJ) {
            try {
                this.LIZJ = false;
                this.LIZLLL.stop();
            } catch (Exception unused) {
                return -1;
            }
        }
        return 0;
    }

    public int vendorOppoHWEnable() {
        if (J2M.LJ.equals("OPPO")) {
            String LIZ = LIZ("persist.sys.aweme.hdsupport", "1");
            C1JX.LJIIIIZZ("oppo property = ", LIZ);
            try {
                return CastIntegerProtector.parseInt(LIZ);
            } catch (NumberFormatException unused) {
                O5Y.LJII("JAJMediaCodec", this, "vendor oppo property abnormal");
            }
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
    
        if (r1.startsWith("mt6750") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010d, code lost:
    
        if (r2.equals("AFTN") != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e9, code lost:
    
        if (r2.equals("santoni") == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe A[Catch: all -> 0x012c, TryCatch #1 {, blocks: (B:29:0x009e, B:31:0x00a2, B:33:0x00a8, B:35:0x00b2, B:38:0x00bb, B:45:0x00ed, B:50:0x0107, B:52:0x010f, B:53:0x00fe, B:56:0x00e3, B:58:0x00eb, B:59:0x00d1, B:62:0x00da, B:65:0x00b4, B:66:0x00b6), top: B:28:0x009e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AJMediaCodec() {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJMediaCodec.<init>():void");
    }

    public String getErrorInfo() {
        return this.LJIJI;
    }

    public int getOSVerion() {
        return J2M.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        if (r2.getErrorCode() != 1101) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        return -10001;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (r2.isRecoverable() == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZIZ(java.lang.Exception r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.toString()
            r5.LJIJI = r0
            int r4 = X.J2M.LIZ
            r0 = 21
            r3 = -10002(0xffffffffffffd8ee, float:NaN)
            r1 = -10000(0xffffffffffffd8f0, float:NaN)
            if (r4 < r0) goto L73
            boolean r0 = r6 instanceof android.media.MediaCodec.CodecException
            if (r0 == 0) goto L6b
            r2 = r6
            android.media.MediaCodec$CodecException r2 = (android.media.MediaCodec.CodecException) r2
            r1 = 23
            java.lang.String r0 = "exception codecExc isRecoverable: "
            if (r4 < r1) goto L53
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r0)
            boolean r0 = r2.isRecoverable()
            r1.append(r0)
            java.lang.String r0 = ", errorcode: "
            r1.append(r0)
            int r0 = r2.getErrorCode()
            r1.append(r0)
            X.X1D.LIZIZ(r1)
            boolean r0 = r2.isRecoverable()
            if (r0 != 0) goto L6b
            int r1 = r2.getErrorCode()
            r0 = 1100(0x44c, float:1.541E-42)
            if (r1 == r0) goto L6b
            int r1 = r2.getErrorCode()
            r0 = 1101(0x44d, float:1.543E-42)
            if (r1 == r0) goto L6b
        L50:
            r3 = -10001(0xffffffffffffd8ef, float:NaN)
        L52:
            return r3
        L53:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r0)
            boolean r0 = r2.isRecoverable()
            r1.append(r0)
            X.X1D.LIZIZ(r1)
            boolean r0 = r2.isRecoverable()
            if (r0 != 0) goto L6b
            goto L50
        L6b:
            boolean r0 = r6 instanceof java.lang.IllegalStateException
            if (r0 == 0) goto L70
            goto L52
        L70:
            r3 = -10000(0xffffffffffffd8f0, float:NaN)
            goto L52
        L73:
            boolean r0 = r6 instanceof java.lang.IllegalStateException
            if (r0 == 0) goto L78
            return r3
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJMediaCodec.LIZIZ(java.lang.Exception):int");
    }

    public final void LJ(ARunnableS47S0100000_11 aRunnableS47S0100000_11) {
        synchronized (LJJIIJ) {
            if (this.LJIILIIL) {
                return;
            }
            int i = this.LJIIJJI - 1;
            this.LJIIJJI = i;
            if (i > 0) {
                return;
            }
            if (i < 0) {
                return;
            }
            _clearBufferIndex(this.LJIIIZ);
            try {
                aRunnableS47S0100000_11.run();
            } catch (Exception e) {
                if (e instanceof IllegalStateException) {
                    _onError(this.LJIIIZ);
                } else {
                    O5Y.LJII("JAJMediaCodec", this, e.toString());
                }
            }
        }
    }

    public final void LJI(MediaCodec mediaCodec) {
        ReentrantLock reentrantLock;
        ReentrantLock reentrantLock2;
        if (mediaCodec == null) {
            return;
        }
        try {
            try {
                mediaCodec.release();
                DummySurface dummySurface = this.LJII;
                if (dummySurface != null) {
                    dummySurface.release();
                    this.LJII = null;
                }
            } catch (Exception unused) {
                reentrantLock2 = LJJIIZ;
            }
        } catch (Exception unused2) {
            if (this.LJII != null) {
                this.LJII.release();
                this.LJII = null;
            }
            if (this.LJIJ == 1) {
                try {
                    reentrantLock2 = LJJIIZ;
                    reentrantLock2.lock();
                    LJJIIJZLJL--;
                    LJJIIZI.signal();
                } finally {
                }
            } else {
                return;
            }
        } catch (Throwable th) {
            if (this.LJII != null) {
                this.LJII.release();
                this.LJII = null;
            }
            if (this.LJIJ == 1) {
                try {
                    reentrantLock = LJJIIZ;
                    reentrantLock.lock();
                    LJJIIJZLJL--;
                    LJJIIZI.signal();
                } catch (Exception unused3) {
                    reentrantLock = LJJIIZ;
                } catch (Throwable th2) {
                    throw th2;
                }
                reentrantLock.unlock();
            }
            throw th;
        }
        if (this.LJIJ == 1) {
            try {
                reentrantLock2 = LJJIIZ;
                reentrantLock2.lock();
                LJJIIJZLJL--;
                LJJIIZI.signal();
                reentrantLock2.unlock();
            } finally {
            }
        }
    }

    public int createByCodecName(String str) {
        C1JX.LJIIIIZZ("createByCodecName = ", str);
        try {
            if (this.LJIJ == 1) {
                try {
                    ReentrantLock reentrantLock = LJJIIZ;
                    reentrantLock.lock();
                    if (LJJIIJZLJL > 0) {
                        LJJIIZI.await(3000L, TimeUnit.MILLISECONDS);
                    }
                    if (LJJIIJZLJL > 0) {
                        O5Y.LJII("JAJMediaCodec", this, "already create a media codec");
                        reentrantLock.unlock();
                        return -1;
                    }
                    this.LIZLLL = MediaCodec.createByCodecName(str);
                    LJJIIJZLJL++;
                    reentrantLock.unlock();
                    return 0;
                } catch (Throwable th) {
                    LJJIIZ.unlock();
                    throw th;
                }
            }
            this.LIZLLL = MediaCodec.createByCodecName(str);
            return 0;
        } catch (Exception e) {
            LIZIZ(e);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("createByCodecName fail = ");
            LIZ.append(e.toString());
            X1D.LIZIZ(LIZ);
            return -1;
        }
    }

    public void decodeFRC(int i) {
        if (this.LIZLLL != null && this.LIZJ && J2M.LIZ >= 23) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("frc level = ");
            LIZ.append(i);
            X1D.LIZIZ(LIZ);
            Bundle bundle = new Bundle();
            bundle.putInt("vivo.video-dec.dynamic-frc", i);
            try {
                this.LIZLLL.setParameters(bundle);
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("setParameters failed ret = ");
                LIZ2.append(e);
                O5Y.LJII("JAJMediaCodec", this, X1D.LIZIZ(LIZ2));
            }
        }
    }

    public int dequeueInputBuffer(long j) {
        try {
            return this.LIZLLL.dequeueInputBuffer(j);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("dequeueInputBuffer failed, exception: ");
            LIZ.append(e);
            X1D.LIZIZ(LIZ);
            return LIZIZ(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x01b1 A[Catch: all -> 0x01f9, TryCatch #1 {, blocks: (B:19:0x004f, B:22:0x0059, B:26:0x0067, B:49:0x0078, B:50:0x0085, B:54:0x01bd, B:55:0x00a0, B:57:0x00a8, B:61:0x00b2, B:65:0x00ba, B:67:0x00be, B:71:0x0171, B:73:0x00ca, B:75:0x00d3, B:76:0x00d8, B:80:0x00e0, B:82:0x00f7, B:85:0x00ff, B:87:0x0107, B:89:0x010f, B:91:0x0117, B:93:0x011f, B:97:0x0128, B:99:0x0132, B:103:0x0137, B:106:0x013d, B:108:0x0145, B:112:0x0151, B:114:0x015b, B:116:0x0163, B:121:0x0175, B:125:0x017c, B:129:0x01a5, B:133:0x01b1, B:135:0x01b9, B:145:0x0081, B:29:0x006d, B:31:0x0073, B:34:0x01c3, B:35:0x01ce, B:37:0x01d4, B:45:0x01e2, B:46:0x01ee, B:148:0x005e, B:149:0x01f0, B:150:0x01f7), top: B:18:0x004f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b9 A[Catch: all -> 0x01f9, TryCatch #1 {, blocks: (B:19:0x004f, B:22:0x0059, B:26:0x0067, B:49:0x0078, B:50:0x0085, B:54:0x01bd, B:55:0x00a0, B:57:0x00a8, B:61:0x00b2, B:65:0x00ba, B:67:0x00be, B:71:0x0171, B:73:0x00ca, B:75:0x00d3, B:76:0x00d8, B:80:0x00e0, B:82:0x00f7, B:85:0x00ff, B:87:0x0107, B:89:0x010f, B:91:0x0117, B:93:0x011f, B:97:0x0128, B:99:0x0132, B:103:0x0137, B:106:0x013d, B:108:0x0145, B:112:0x0151, B:114:0x015b, B:116:0x0163, B:121:0x0175, B:125:0x017c, B:129:0x01a5, B:133:0x01b1, B:135:0x01b9, B:145:0x0081, B:29:0x006d, B:31:0x0073, B:34:0x01c3, B:35:0x01ce, B:37:0x01d4, B:45:0x01e2, B:46:0x01ee, B:148:0x005e, B:149:0x01f0, B:150:0x01f7), top: B:18:0x004f, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getBestCodecName(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJMediaCodec.getBestCodecName(java.lang.String):java.lang.String");
    }

    public ByteBuffer getInputBuffer(int i) {
        if (this.LIZJ) {
            try {
                return this.LIZLLL.getInputBuffer(i);
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("getInputBuffer failed, exception: ");
                LIZ.append(e);
                O5Y.LJFF("JAJMediaCodec", this, X1D.LIZIZ(LIZ));
            }
        }
        return null;
    }

    public void setEnableMediaCodecSyncClose(int i) {
        LJJIII = i;
    }

    public void setEnableVC1BlockList(int i) {
        LJJII = i;
    }

    public void setHandler(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ttmn: setHandler ");
        LIZ.append(j);
        X1D.LIZIZ(LIZ);
        this.LJIIIZ = j;
    }

    public int setOutputSurface(Surface surface) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setoutput surface = ");
        LIZ.append(surface);
        X1D.LIZIZ(LIZ);
        if (!LJJ && this.LIZJ) {
            if (surface == null) {
                if (this.LJII == null) {
                    this.LJII = DummySurface.LIZIZ();
                }
                surface = this.LJII;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setoutputSurface = ");
            LIZ2.append(surface);
            X1D.LIZIZ(LIZ2);
            int i = 1;
            try {
                this.LIZLLL.setOutputSurface(surface);
                if (this.LJIIIIZZ == 1 && this.LJIIZILJ == 1) {
                    synchronized (LJJIIJ) {
                        this.LJIIJ.post(new ARunnableS47S0100000_11(this, 62));
                    }
                }
                return 0;
            } catch (Exception e) {
                LIZIZ(e);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("setoutputsurface failed = ");
                LIZ3.append(e);
                O5Y.LJII("JAJMediaCodec", this, X1D.LIZIZ(LIZ3));
                DummySurface dummySurface = this.LJII;
                if (dummySurface != null) {
                    if (surface != dummySurface) {
                        i = 2;
                    }
                    dummySurface.LIZ(i);
                }
                if (e instanceof IllegalArgumentException) {
                    return -10003;
                }
            }
        }
        return -1;
    }

    public void setSingleCodec(int i) {
        UC7.LIZLLL("ttmn: EnableSingleCodec ", i);
        this.LJIJ = i;
    }

    public void speedEnhance(float f) {
        if (this.LIZLLL != null && this.LIZJ && J2M.LIZ >= 23 && f > 30.0f) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("rate ");
            LIZ.append(f);
            X1D.LIZIZ(LIZ);
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", f);
            try {
                this.LIZLLL.setParameters(bundle);
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("setParameters failed ret = ");
                LIZ2.append(e);
                O5Y.LJII("JAJMediaCodec", this, X1D.LIZIZ(LIZ2));
            }
        }
    }

    public int write(AJMediaCodecFrame aJMediaCodecFrame) {
        if (aJMediaCodecFrame != null && aJMediaCodecFrame.data != null) {
            try {
                int dequeueInputBuffer = this.LIZLLL.dequeueInputBuffer(30000L);
                if (dequeueInputBuffer >= 0) {
                    this.LIZIZ[dequeueInputBuffer].put(aJMediaCodecFrame.data);
                    this.LIZLLL.queueInputBuffer(dequeueInputBuffer, 0, aJMediaCodecFrame.size, aJMediaCodecFrame.pts, 0);
                    return 0;
                }
                if (dequeueInputBuffer != -1) {
                    return -1;
                }
                return 4;
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("write meet exception =");
                LIZ.append(e);
                O5Y.LJFF("JAJMediaCodec", this, X1D.LIZIZ(LIZ));
            }
        }
        return -1;
    }

    public static String LIZ(String str, String str2) {
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return str2;
            }
        } catch (Throwable unused) {
            return str2;
        }
    }

    public int read(AJMediaCodecFrame aJMediaCodecFrame, long j) {
        while (true) {
            try {
                int dequeueOutputBuffer = this.LIZLLL.dequeueOutputBuffer(this.LJ, j);
                if (dequeueOutputBuffer < 0) {
                    if (dequeueOutputBuffer == -3) {
                        try {
                            this.LIZ = this.LIZLLL.getOutputBuffers();
                        } catch (Exception e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("getOutputBuffers e = ");
                            LIZ.append(e);
                            X1D.LIZIZ(LIZ);
                            return LIZIZ(e);
                        }
                    } else {
                        if (dequeueOutputBuffer == -2) {
                            try {
                                this.LJFF = this.LIZLLL.getOutputFormat();
                                if (this.LIZ == null) {
                                    try {
                                        this.LIZ = this.LIZLLL.getOutputBuffers();
                                    } catch (Exception e2) {
                                        StringBuilder LIZ2 = X1D.LIZ();
                                        LIZ2.append("getOutputBuffers e = ");
                                        LIZ2.append(e2);
                                        X1D.LIZIZ(LIZ2);
                                        return LIZIZ(e2);
                                    }
                                }
                                return dequeueOutputBuffer;
                            } catch (Exception e3) {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("getOutputFormat e =");
                                LIZ3.append(e3);
                                X1D.LIZIZ(LIZ3);
                                return LIZIZ(e3);
                            }
                        }
                        if (dequeueOutputBuffer != -1) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("error, idx = ");
                            LIZ4.append(dequeueOutputBuffer);
                            O5Y.LJFF("JAJMediaCodec", this, X1D.LIZIZ(LIZ4));
                        }
                        return -1;
                    }
                } else {
                    aJMediaCodecFrame.data = this.LIZ[dequeueOutputBuffer];
                    MediaCodec.BufferInfo bufferInfo = this.LJ;
                    aJMediaCodecFrame.pts = bufferInfo.presentationTimeUs;
                    aJMediaCodecFrame.index = dequeueOutputBuffer;
                    aJMediaCodecFrame.size = bufferInfo.size;
                    aJMediaCodecFrame.flags = bufferInfo.flags;
                    return 0;
                }
            } catch (Exception e4) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("dequeueOutputBuffer e :");
                LIZ5.append(e4);
                X1D.LIZIZ(LIZ5);
                return LIZIZ(e4);
            }
        }
    }

    public void setMode(int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ttmn: mode ");
        LIZ.append(i);
        LIZ.append(", memcpyCrash ");
        LIZ.append(i2);
        X1D.LIZIZ(LIZ);
        this.LJIIIIZZ = i;
        this.LJIIZILJ = i2;
    }

    public static void LIZJ(MediaFormat mediaFormat, ByteBuffer byteBuffer, int i) {
        if (byteBuffer == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("csd-");
        LIZ.append(i);
        mediaFormat.setByteBuffer(X1D.LIZIZ(LIZ), byteBuffer);
    }

    public static void LIZLLL(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public int releaseBuffer(int i, boolean z, long j) {
        if (J2M.LIZ >= 21 && z) {
            try {
                this.LIZLLL.releaseOutputBuffer(i, j);
                return 0;
            } catch (Exception unused) {
                return -10000;
            }
        }
        try {
            this.LIZLLL.releaseOutputBuffer(i, z);
            return 0;
        } catch (Exception e) {
            return LIZIZ(e);
        }
    }

    public int queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        try {
            this.LIZLLL.queueInputBuffer(i, i2, i3, j, i4);
            return 0;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("queueInputBuffer failed, exception: ");
            LIZ.append(e);
            X1D.LIZIZ(LIZ);
            return LIZIZ(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b6, code lost:
    
        if (r0 == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0176 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0207  */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int configure(int r14, int r15, int r16, int r17, int r18, java.lang.String r19, java.nio.ByteBuffer r20, java.nio.ByteBuffer r21, java.nio.ByteBuffer r22, android.view.Surface r23, boolean r24, boolean r25, int r26, int r27, boolean r28, int r29, boolean r30, boolean r31, int r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJMediaCodec.configure(int, int, int, int, int, java.lang.String, java.nio.ByteBuffer, java.nio.ByteBuffer, java.nio.ByteBuffer, android.view.Surface, boolean, boolean, int, int, boolean, int, boolean, boolean, int, int, int):int");
    }
}
