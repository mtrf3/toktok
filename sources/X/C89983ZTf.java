package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.benchmark.presenter.HWEncodeManager;
import com.benchmark.settings.HWEncoderStrategyWrapper;
import java.nio.ByteBuffer;

/* renamed from: X.ZTf, reason: case insensitive filesystem */
/* loaded from: classes19.dex */
public class C89983ZTf extends MediaCodec.Callback {
    public final /* synthetic */ ZUG LIZ;

    public C89983ZTf(ZUG zug) {
        this.LIZ = zug;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onError: ");
        LIZ.append(codecException.getMessage());
        X1D.LIZIZ(LIZ);
        C47261Igj.LJIILL("BXMediaCodecAsyncEncoder");
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onInputBufferAvailable: index = ");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        C47261Igj.LJIILJJIL("BXMediaCodecAsyncEncoder");
        if (!this.LIZ.LIZ.useSurfaceInput()) {
            this.LIZ.LJIJI.offer(Integer.valueOf(i));
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onOutputFormatChanged: ");
        LIZ.append(mediaFormat.toString());
        X1D.LIZIZ(LIZ);
        C47261Igj.LJJIIJ("BXMediaCodecAsyncEncoder");
        this.LIZ.LIZJ = mediaFormat;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        byte[] bArr;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onOutputBufferAvailable: index = ");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        C47261Igj.LJIILJJIL("BXMediaCodecAsyncEncoder");
        ZUG zug = this.LIZ;
        if (zug.LJIIZILJ != EnumC89986ZTi.STARTED) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("the mediaCodec status is not started ,the status is ");
            LIZ2.append(zug.LJIIZILJ);
            X1D.LIZIZ(LIZ2);
            C47261Igj.LJJJJZ("BXMediaCodecEncoder");
            return;
        }
        boolean z2 = false;
        if ((bufferInfo.flags & 2) != 0) {
            ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i);
            outputBuffer.get(4);
            zug.LJIJ = new byte[bufferInfo.size];
            outputBuffer.position(bufferInfo.offset);
            outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
            outputBuffer.get(zug.LJIJ);
            zug.LJIIJ = zug.LJIJ[5];
            mediaCodec.releaseOutputBuffer(i, false);
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("output frame index: ");
        LIZ3.append(zug.LJIIIIZZ);
        X1D.LIZIZ(LIZ3);
        C47261Igj.LJJIIJ("BXMediaCodecEncoder");
        int i2 = zug.LJIIIIZZ + 1;
        zug.LJIIIIZZ = i2;
        if (i2 == 1) {
            zug.LJIIL = System.currentTimeMillis() - zug.LJIILIIL;
        }
        C89989ZTl c89989ZTl = new C89989ZTl();
        ByteBuffer outputBuffer2 = mediaCodec.getOutputBuffer(i);
        outputBuffer2.position(bufferInfo.offset);
        outputBuffer2.limit(bufferInfo.offset + bufferInfo.size);
        int i3 = bufferInfo.size;
        if (i3 > 0) {
            byte[] bArr2 = new byte[i3];
            c89989ZTl.LIZIZ = bArr2;
            outputBuffer2.get(bArr2);
        } else if ((bufferInfo.flags & 4) == 0) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("frame.mBufferInfo.size <= 0. size:");
            LIZ4.append(bufferInfo.size);
            X1D.LIZIZ(LIZ4);
            C47261Igj.LJIILL("BXMediaCodecEncoder");
        }
        mediaCodec.releaseOutputBuffer(i, false);
        if ((bufferInfo.flags & 1) != 0) {
            z = true;
            byte[] bArr3 = zug.LJIJ;
            if (bArr3 != null && (bArr = c89989ZTl.LIZIZ) != null && bArr.length > bArr3.length + 4 && bArr[4] == bArr3[4] && (bArr[bArr3.length + 4] & 31) == 5) {
                int length = bArr.length - bArr3.length;
                byte[] bArr4 = new byte[length];
                System.arraycopy(bArr, bArr3.length, bArr4, 0, length);
                c89989ZTl.LIZIZ = bArr4;
            }
        } else {
            z = false;
        }
        Long poll = zug.LJIILLIIL.poll();
        if (poll == null) {
            C47261Igj.LJIILL("BXMediaCodecEncoder");
            return;
        }
        if ((bufferInfo.flags & 4) != 0) {
            z2 = true;
            c89989ZTl.LIZLLL = poll.longValue();
        } else {
            c89989ZTl.LIZLLL = bufferInfo.presentationTimeUs;
        }
        c89989ZTl.LJ = poll.longValue();
        c89989ZTl.LJI = z2;
        c89989ZTl.LJFF = z;
        ZTY zty = zug.LJ;
        if (zty == null) {
            return;
        }
        zty.LIZJ.LJLJI.mOutputFrames.offer(c89989ZTl);
        HWEncodeManager hWEncodeManager = zty.LIZJ.LJLJI;
        HWEncoderStrategyWrapper hWEncoderStrategyWrapper = hWEncodeManager.mStrategy;
        if (hWEncoderStrategyWrapper == null) {
            return;
        }
        if (c89989ZTl.LJI) {
            hWEncoderStrategyWrapper.update(c89989ZTl, null, hWEncodeManager.mFrameRate);
            return;
        }
        C89989ZTl remove = hWEncodeManager.mInputFrames.remove(Long.valueOf(c89989ZTl.LIZLLL));
        if (remove == null) {
            return;
        }
        HWEncodeManager hWEncodeManager2 = zty.LIZJ.LJLJI;
        hWEncodeManager2.mStrategy.update(c89989ZTl, remove, hWEncodeManager2.mFrameRate);
    }
}
