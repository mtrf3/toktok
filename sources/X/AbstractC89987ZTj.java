package X;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.benchmark.mediacodec.TEMediaCodecEncodeSettings;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.ZTj, reason: case insensitive filesystem */
/* loaded from: classes19.dex */
public abstract class AbstractC89987ZTj {
    public TEMediaCodecEncodeSettings LIZ;
    public MediaCodec LIZIZ;
    public MediaFormat LIZJ;
    public Surface LIZLLL;
    public ZTY LJ;
    public HandlerThread LJFF;
    public Handler LJI;
    public int LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIILJJIL;
    public int LJIILL;
    public byte[] LJIJ;
    public int LJIIJ = -1;
    public long LJIIJJI = -1;
    public long LJIIL = -1;
    public long LJIILIIL = -1;
    public final LinkedBlockingQueue<Long> LJIILLIIL = new LinkedBlockingQueue<>();
    public volatile EnumC89986ZTi LJIIZILJ = EnumC89986ZTi.UNSET;

    public abstract void LIZ();

    public abstract int LIZJ(C89989ZTl c89989ZTl);

    public final int LIZIZ() {
        MediaCodecInfo mediaCodecInfo;
        if (this.LJIIZILJ != EnumC89986ZTi.UNSET) {
            return -607;
        }
        String mimeType = this.LIZ.getMimeType();
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        if (codecInfos != null && codecInfos.length != 0) {
            int length = codecInfos.length;
            loop0: for (int i = 0; i < length; i++) {
                mediaCodecInfo = codecInfos[i];
                mediaCodecInfo.getName();
                C47261Igj.LJJIIJ("codec info name: ");
                if (mediaCodecInfo.isEncoder()) {
                    String name = mediaCodecInfo.getName();
                    if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                        for (String str : mediaCodecInfo.getSupportedTypes()) {
                            C47261Igj.LJJIIJ("codec name: ");
                            if (str.equalsIgnoreCase(mimeType)) {
                                break loop0;
                            }
                        }
                    }
                }
            }
        }
        mediaCodecInfo = null;
        if (mediaCodecInfo == null) {
            C47261Igj.LJIILL("BXMediaCodecEncoder");
            return -600;
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(this.LIZ.getMimeType());
        if (capabilitiesForType.colorFormats != null) {
            for (int i2 = 0; i2 < capabilitiesForType.colorFormats.length; i2++) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("support color format: ");
                LIZ.append(capabilitiesForType.colorFormats[i2]);
                X1D.LIZIZ(LIZ);
                C47261Igj.LJIILJJIL("BXMediaCodecEncoder");
                if (capabilitiesForType.colorFormats[i2] == this.LIZ.getInputColorFormat()) {
                    try {
                        MediaCodec createEncoderByType = MediaCodec.createEncoderByType(this.LIZ.getMimeType());
                        this.LIZIZ = createEncoderByType;
                        String name2 = createEncoderByType.getCodecInfo().getName();
                        if (!name2.equals(mediaCodecInfo.getName())) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("Don't find proper codec, find: ");
                            LIZ2.append(name2);
                            LIZ2.append("; require: ");
                            LIZ2.append(mediaCodecInfo.getName());
                            X1D.LIZIZ(LIZ2);
                            C47261Igj.LJJJJZ("BXMediaCodecEncoder");
                            if (!name2.startsWith("OMX.google.")) {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("Update codec: ");
                                LIZ3.append(name2);
                                X1D.LIZIZ(LIZ3);
                                C47261Igj.LJJJJZ("BXMediaCodecEncoder");
                            } else {
                                return -601;
                            }
                        } else {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("Create codec: ");
                            LIZ4.append(name2);
                            X1D.LIZIZ(LIZ4);
                            C47261Igj.LJJIIJ("BXMediaCodecEncoder");
                        }
                        return 0;
                    } catch (Exception e) {
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append("createByCodecName throw exception: ");
                        LIZ5.append(e.toString());
                        X1D.LIZIZ(LIZ5);
                        C47261Igj.LJIILL("BXMediaCodecEncoder");
                        return -600;
                    }
                }
            }
        }
        return -600;
    }

    public final void LJFF() {
        if (this.LJIIZILJ == EnumC89986ZTi.UNSET || this.LJIIZILJ == EnumC89986ZTi.RELEASED) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Start encode with invalid status. Current status: ");
            LIZ.append(this.LJIIZILJ);
            X1D.LIZIZ(LIZ);
            C47261Igj.LJIILL("BXMediaCodecEncoder");
            return;
        }
        C47261Igj.LJJIIJ("BXMediaCodecEncoder");
        if (this.LJIIZILJ != EnumC89986ZTi.STOPPED) {
            LJIIIZ();
        }
        Surface surface = this.LIZLLL;
        if (surface != null) {
            surface.release();
            this.LIZLLL = null;
        }
        MediaCodec mediaCodec = this.LIZIZ;
        if (mediaCodec != null) {
            mediaCodec.release();
        }
        this.LIZ = null;
        this.LIZIZ = null;
    }

    public final int LJI() {
        if (this.LJIIZILJ != EnumC89986ZTi.INITED) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Start encode with invalid status. Current status: ");
            LIZ.append(this.LJIIZILJ);
            X1D.LIZIZ(LIZ);
            C47261Igj.LJIILL("BXMediaCodecEncoder");
            return -607;
        }
        C47261Igj.LJJIIJ("BXMediaCodecEncoder");
        this.LIZIZ.start();
        this.LJIIZILJ = EnumC89986ZTi.STARTED;
        return 0;
    }

    public final void LJII() {
        if (this.LJIIZILJ != EnumC89986ZTi.STARTED) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Start encode with invalid status. Current status: ");
            LIZ.append(this.LJIIZILJ);
            X1D.LIZIZ(LIZ);
            C47261Igj.LJIILL("BXMediaCodecEncoder");
            return;
        }
        C47261Igj.LJJIIJ("BXMediaCodecEncoder");
        this.LJIIZILJ = EnumC89986ZTi.STOPPED;
        MediaCodec mediaCodec = this.LIZIZ;
        if (mediaCodec != null) {
            mediaCodec.stop();
        }
    }

    public AbstractC89987ZTj() {
        HandlerThread handlerThread = new HandlerThread("TECodecEncoder");
        this.LJFF = handlerThread;
        handlerThread.start();
        this.LJI = new Handler(this.LJFF.getLooper(), new C89984ZTg(this));
    }

    public final void LJIIIIZZ() {
        LJFF();
        this.LJFF.quitSafely();
        this.LJI = null;
        this.LJFF = null;
        this.LJII = 0;
        this.LJIIIIZZ = 0;
        this.LJIJ = null;
        this.LIZJ = null;
        this.LJIIZILJ = EnumC89986ZTi.UNSET;
    }

    public void LJIIIZ() {
        LJII();
    }

    public final int LIZLLL(C89989ZTl c89989ZTl) {
        int LIZJ;
        if (this.LJIIZILJ != EnumC89986ZTi.STARTED) {
            C47261Igj.LJIILL("BXMediaCodecEncoder");
            return -607;
        }
        if (this.LJ == null) {
            C47261Igj.LJIILL("BXMediaCodecEncoder");
            return -606;
        }
        if (!c89989ZTl.LIZ() && !c89989ZTl.LJI) {
            c89989ZTl.toString();
            C47261Igj.LJIILL("BXMediaCodecEncoder");
            return -100;
        }
        int i = this.LJIILJJIL;
        if (i > 0 && i == this.LJII + 1) {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.LIZIZ.setParameters(bundle);
            this.LJIILJJIL = 0;
        }
        if (this.LJIILL > 0 && this.LJII + 1 == 26) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("video-bitrate", this.LJIILL);
            this.LIZIZ.setParameters(bundle2);
            this.LJIILL = 0;
        }
        try {
            if (this.LIZ.useSurfaceInput()) {
                LIZJ = LJ(c89989ZTl);
            } else {
                LIZJ = LIZJ(c89989ZTl);
            }
            if (c89989ZTl.LIZLLL == 0) {
                this.LJIILIIL = System.currentTimeMillis();
            }
            if (LIZJ == 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("encode... ");
                LIZ.append(c89989ZTl);
                LIZ.append(" index: ");
                LIZ.append(this.LJII);
                X1D.LIZIZ(LIZ);
                C47261Igj.LJJIIJ("BXMediaCodecEncoder");
                this.LJII++;
                this.LJIILLIIL.offer(Long.valueOf(c89989ZTl.LIZLLL));
                if (c89989ZTl.LJI) {
                    this.LJIIIZ = true;
                }
            }
            return LIZJ;
        } catch (Exception e) {
            throw new C89988ZTk(e);
        }
    }

    public final int LJ(C89989ZTl c89989ZTl) {
        if (this.LJIIZILJ != EnumC89986ZTi.STARTED) {
            return -607;
        }
        int i = 0;
        if (c89989ZTl.LIZ()) {
            ZTY zty = this.LJ;
            if (zty.LIZJ.LJLJI.mSettings.useSurfaceInput()) {
                GLES20.glViewport(0, 0, zty.LIZ, zty.LIZIZ);
                C89992ZTo c89992ZTo = zty.LIZJ.LJLJI.yuvTextureDrawer;
                if (c89992ZTo.LJIIJ > 0 && c89992ZTo.LJIIJJI > 0) {
                    GLES20.glUseProgram(c89992ZTo.LIZJ);
                    GLES20.glEnableVertexAttribArray(c89992ZTo.LIZLLL);
                    GLES20.glEnableVertexAttribArray(c89992ZTo.LJ);
                    GLES20.glBindBuffer(34962, c89992ZTo.LJFF[0]);
                    GLES20.glVertexAttribPointer(c89992ZTo.LIZLLL, 3, 5126, false, 12, 0);
                    i = 0;
                    GLES20.glVertexAttribPointer(c89992ZTo.LJ, 3, 5126, false, 12, C89992ZTo.LJIILLIIL.length * 4);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, c89992ZTo.LJIIIZ[0]);
                    GLES20.glTexImage2D(3553, 0, 6409, c89992ZTo.LJIIJ, c89992ZTo.LJIIJJI, 0, 6409, 5121, c89992ZTo.LJIIL);
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(3553, c89992ZTo.LJIIIZ[1]);
                    GLES20.glTexImage2D(3553, 0, 6409, c89992ZTo.LJIIJ / 2, c89992ZTo.LJIIJJI / 2, 0, 6409, 5121, c89992ZTo.LJIILIIL);
                    GLES20.glActiveTexture(33986);
                    GLES20.glBindTexture(3553, c89992ZTo.LJIIIZ[2]);
                    GLES20.glTexImage2D(3553, 0, 6409, c89992ZTo.LJIIJ / 2, c89992ZTo.LJIIJJI / 2, 0, 6409, 5121, c89992ZTo.LJIILJJIL);
                    GLES20.glUniform1i(c89992ZTo.LJI, 0);
                    GLES20.glUniform1i(c89992ZTo.LJII, 1);
                    GLES20.glUniform1i(c89992ZTo.LJIIIIZZ, 2);
                    GLES20.glDrawArrays(5, 0, C89992ZTo.LJIJ);
                    GLES20.glDisableVertexAttribArray(c89992ZTo.LIZLLL);
                    GLES20.glDisableVertexAttribArray(c89992ZTo.LJ);
                }
                GLES20.glFinish();
                C89995ZTr c89995ZTr = zty.LIZJ.LJLILLLLZI;
                EGLExt.eglPresentationTimeANDROID(c89995ZTr.LIZJ, c89995ZTr.LIZLLL, c89989ZTl.LIZLLL * 1000);
                C89995ZTr.LIZ("eglPresentationTimeANDROID");
                C89995ZTr c89995ZTr2 = zty.LIZJ.LJLILLLLZI;
                EGL14.eglSwapBuffers(c89995ZTr2.LIZJ, c89995ZTr2.LIZLLL);
            }
        }
        if (c89989ZTl.LJI) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("signal end of stream...  pts: ");
            LIZ.append(c89989ZTl.LIZLLL);
            X1D.LIZIZ(LIZ);
            C47261Igj.LJJIIJ("BXMediaCodecEncoder");
            this.LIZIZ.signalEndOfInputStream();
        }
        return i;
    }
}
