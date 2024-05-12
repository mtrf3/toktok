package X;

import android.media.MediaCodec;
import com.ss.ttm.player.AJMediaCodec;

/* loaded from: classes12.dex */
public final class P4L extends MediaCodec.Callback {
    public final /* synthetic */ AJMediaCodec LIZ;

    public P4L(AJMediaCodec aJMediaCodec) {
        this.LIZ = aJMediaCodec;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ttmn: ");
        LIZ.append(codecException);
        O5Y.LJFF("JAJMediaCodec", this, X1D.LIZIZ(LIZ));
        synchronized (AJMediaCodec.LJJIIJ) {
            AJMediaCodec aJMediaCodec = this.LIZ;
            if (aJMediaCodec.LJIILIIL) {
                return;
            }
            AJMediaCodec._onError(aJMediaCodec.LJIIIZ);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        if (mediaCodec == this.LIZ.LIZLLL) {
            synchronized (AJMediaCodec.LJJIIJ) {
                AJMediaCodec aJMediaCodec = this.LIZ;
                if (aJMediaCodec.LJIILIIL) {
                    return;
                }
                AJMediaCodec._onEmptyBuffer(aJMediaCodec.LJIIIZ, i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa A[Catch: Exception -> 0x0121, TryCatch #0 {Exception -> 0x0121, blocks: (B:8:0x0016, B:10:0x0025, B:13:0x0031, B:15:0x0037, B:17:0x003d, B:20:0x0046, B:22:0x004c, B:23:0x0057, B:25:0x005f, B:26:0x006a, B:28:0x0072, B:36:0x0095, B:37:0x00a4, B:39:0x00aa, B:44:0x00b5, B:45:0x00ce, B:47:0x00d8, B:48:0x00dc, B:50:0x00e8, B:51:0x00ec, B:54:0x00c6, B:55:0x00be, B:56:0x009d, B:57:0x0077, B:58:0x007e, B:60:0x00ee, B:62:0x00f6, B:64:0x0100, B:65:0x0104, B:67:0x0110, B:68:0x0114), top: B:7:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8 A[Catch: Exception -> 0x0121, TryCatch #0 {Exception -> 0x0121, blocks: (B:8:0x0016, B:10:0x0025, B:13:0x0031, B:15:0x0037, B:17:0x003d, B:20:0x0046, B:22:0x004c, B:23:0x0057, B:25:0x005f, B:26:0x006a, B:28:0x0072, B:36:0x0095, B:37:0x00a4, B:39:0x00aa, B:44:0x00b5, B:45:0x00ce, B:47:0x00d8, B:48:0x00dc, B:50:0x00e8, B:51:0x00ec, B:54:0x00c6, B:55:0x00be, B:56:0x009d, B:57:0x0077, B:58:0x007e, B:60:0x00ee, B:62:0x00f6, B:64:0x0100, B:65:0x0104, B:67:0x0110, B:68:0x0114), top: B:7:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e8 A[Catch: Exception -> 0x0121, TryCatch #0 {Exception -> 0x0121, blocks: (B:8:0x0016, B:10:0x0025, B:13:0x0031, B:15:0x0037, B:17:0x003d, B:20:0x0046, B:22:0x004c, B:23:0x0057, B:25:0x005f, B:26:0x006a, B:28:0x0072, B:36:0x0095, B:37:0x00a4, B:39:0x00aa, B:44:0x00b5, B:45:0x00ce, B:47:0x00d8, B:48:0x00dc, B:50:0x00e8, B:51:0x00ec, B:54:0x00c6, B:55:0x00be, B:56:0x009d, B:57:0x0077, B:58:0x007e, B:60:0x00ee, B:62:0x00f6, B:64:0x0100, B:65:0x0104, B:67:0x0110, B:68:0x0114), top: B:7:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011d  */
    @Override // android.media.MediaCodec.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onOutputFormatChanged(android.media.MediaCodec r16, android.media.MediaFormat r17) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P4L.onOutputFormatChanged(android.media.MediaCodec, android.media.MediaFormat):void");
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        if (mediaCodec == this.LIZ.LIZLLL) {
            synchronized (AJMediaCodec.LJJIIJ) {
                AJMediaCodec aJMediaCodec = this.LIZ;
                if (aJMediaCodec.LJIILIIL) {
                    return;
                }
                AJMediaCodec._onFilledBuffer(aJMediaCodec.LJIIIZ, i, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
            }
        }
    }
}
