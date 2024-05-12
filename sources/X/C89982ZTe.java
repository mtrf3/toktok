package X;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.ZTe, reason: case insensitive filesystem */
/* loaded from: classes19.dex */
public final class C89982ZTe {
    public static boolean LJIJJLI = true;
    public static String LJIL = null;
    public static String LJJ = "video/avc";
    public MediaFormat LIZ;
    public SurfaceTexture LIZLLL;
    public Surface LJ;
    public C89981ZTd LJFF;
    public ByteBuffer[] LJII;
    public MediaCodec LJIIIIZZ;
    public final HandlerThread LJIIIZ;
    public final Handler LJIIJ;
    public boolean LIZIZ = true;
    public final int[] LIZJ = new int[1];
    public final MediaCodec.BufferInfo LJI = new MediaCodec.BufferInfo();
    public final int LJIIJJI = 30;
    public int LJIIL = 0;
    public final Object LJIILIIL = new Object();
    public boolean LJIILJJIL = false;
    public final SurfaceTexture.OnFrameAvailableListener LJIILL = new C89980ZTc(this);
    public boolean LJIILLIIL = false;
    public final long LJIIZILJ = 10000;
    public final long LJIJ = 10000;
    public int LJIJI = 0;
    public int LJIJJ = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r7 = this;
            int[] r0 = r7.LIZJ
            r6 = 1
            r5 = 0
            android.opengl.GLES20.glGenTextures(r6, r0, r5)
            int r4 = android.opengl.GLES20.glGetError()
            r3 = 0
        Lc:
            if (r4 == 0) goto L46
            switch(r4) {
                case 1280: goto L37;
                case 1281: goto L3a;
                case 1282: goto L3d;
                case 1283: goto L11;
                case 1284: goto L11;
                case 1285: goto L40;
                case 1286: goto L43;
                default: goto L11;
            }
        L11:
            java.lang.String r1 = "unknown error"
        L13:
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r0 = "glGenTextures"
            r2[r5] = r0
            r2[r6] = r1
            r1 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2[r1] = r0
            java.lang.String r0 = "After tag \"%s\" glGetError %s(0x%x) "
            X.C16880lQ.LLLZ(r0, r2)
            java.lang.String r0 = "BXGLUtils"
            X.C47261Igj.LJIILL(r0)
            int r4 = android.opengl.GLES20.glGetError()
            int r3 = r3 + 1
            r0 = 4
            if (r3 >= r0) goto L46
            goto Lc
        L37:
            java.lang.String r1 = "invalid enum"
            goto L13
        L3a:
            java.lang.String r1 = "invalid value"
            goto L13
        L3d:
            java.lang.String r1 = "invalid operation"
            goto L13
        L40:
            java.lang.String r1 = "out of memory"
            goto L13
        L43:
            java.lang.String r1 = "invalid framebuffer operation"
            goto L13
        L46:
            int[] r0 = r7.LIZJ
            r0 = r0[r5]
            if (r0 > 0) goto L52
            java.lang.String r0 = "BXHwDecoder"
            X.C47261Igj.LJIILL(r0)
            return
        L52:
            r2 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r2, r0)
            r1 = 10241(0x2801, float:1.435E-41)
            r0 = 1175977984(0x46180000, float:9728.0)
            android.opengl.GLES20.glTexParameterf(r2, r1, r0)
            r1 = 10240(0x2800, float:1.4349E-41)
            r0 = 1175979008(0x46180400, float:9729.0)
            android.opengl.GLES20.glTexParameterf(r2, r1, r0)
            r0 = 10242(0x2802, float:1.4352E-41)
            r1 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r2, r0, r1)
            r0 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89982ZTe.LIZ():void");
    }

    public final void LIZLLL() {
        try {
            this.LJIIIIZZ.stop();
        } catch (Exception unused) {
            C47261Igj.LJJJJZ("BXHwDecoder");
        }
        this.LJIIIIZZ.release();
        this.LJIIIZ.quit();
        if (this.LIZIZ) {
            C89981ZTd c89981ZTd = this.LJFF;
            int i = c89981ZTd.LIZLLL;
            if (i != 0) {
                GLES20.glDeleteProgram(i);
                c89981ZTd.LIZLLL = 0;
            }
            int[] iArr = c89981ZTd.LJIIIIZZ;
            if (iArr[0] != 0) {
                GLES20.glDeleteFramebuffers(1, iArr, 0);
            }
            this.LJ.release();
            this.LIZLLL.release();
            int[] iArr2 = this.LIZJ;
            if (iArr2[0] != 0) {
                GLES20.glDeleteTextures(1, iArr2, 0);
                this.LIZJ[0] = 0;
            }
        }
        C47261Igj.LJJIIJ("BXHwDecoder");
    }

    public C89982ZTe(boolean z, String str, String str2) {
        HandlerThread handlerThread = new HandlerThread("BXHwDecoder");
        this.LJIIIZ = handlerThread;
        handlerThread.start();
        this.LJIIJ = new Handler(handlerThread.getLooper());
        LJIJJLI = z;
        LJIL = str;
        LJJ = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d1  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZIZ(byte[] r21, int r22, long r23, byte[] r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89982ZTe.LIZIZ(byte[], int, long, byte[], int, int, int):int");
    }

    public final int LIZJ(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int i4, boolean z) {
        MediaCodecInfo mediaCodecInfo;
        this.LIZIZ = z;
        String str = LJJ;
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        if (codecInfos != null && codecInfos.length != 0) {
            int length = codecInfos.length;
            loop0: for (int i5 = 0; i5 < length; i5++) {
                mediaCodecInfo = codecInfos[i5];
                if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder()) {
                    String name = mediaCodecInfo.getName();
                    if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                        for (String str2 : mediaCodecInfo.getSupportedTypes()) {
                            if (str2.equalsIgnoreCase(str)) {
                                break loop0;
                            }
                        }
                    }
                }
            }
        }
        mediaCodecInfo = null;
        if (mediaCodecInfo == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MediaCodecInfo is null, ");
            LIZ.append(LJJ);
            LIZ.append(" is not supported!");
            X1D.LIZIZ(LIZ);
            C47261Igj.LJIILL("BXHwDecoder");
            return -100;
        }
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(LJJ, i3, i4);
        this.LIZ = createVideoFormat;
        if (i > 0) {
            createVideoFormat.setByteBuffer("csd-0", ByteBuffer.wrap(bArr));
        }
        if (i2 > 0 && LJJ.equals("video/avc")) {
            this.LIZ.setByteBuffer("csd-1", ByteBuffer.wrap(bArr2));
        }
        try {
            this.LJIIIIZZ = MediaCodec.createDecoderByType(LJJ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("use decode to surface: ");
            LIZ2.append(z);
            X1D.LIZIZ(LIZ2);
            C47261Igj.LJJIIJ("BXHwDecoder");
            try {
                if (z) {
                    if (this.LIZJ[0] == 0) {
                        LIZ();
                    }
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.LIZJ[0]);
                    this.LIZLLL = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(this.LJIILL, this.LJIIJ);
                    this.LJ = new Surface(this.LIZLLL);
                    C89981ZTd c89981ZTd = new C89981ZTd(this.LIZLLL);
                    this.LJFF = c89981ZTd;
                    c89981ZTd.LIZJ();
                    this.LJIIIIZZ.configure(this.LIZ, this.LJ, (MediaCrypto) null, 0);
                } else {
                    this.LJIIIIZZ.configure(this.LIZ, (Surface) null, (MediaCrypto) null, 0);
                }
                this.LJIIIIZZ.start();
                return 0;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("startDecoder failed..., ");
                LIZ3.append(e.getMessage());
                X1D.LIZIZ(LIZ3);
                C47261Igj.LJIILL("BXHwDecoder");
                LIZLLL();
                return -105;
            }
        } catch (IOException e2) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("createDecoderByType failed: ");
            LIZ4.append(e2.getMessage());
            X1D.LIZIZ(LIZ4);
            C47261Igj.LJIILL("BXHwDecoder");
            C16880lQ.LLLLIIL(e2);
            return -102;
        }
    }
}
