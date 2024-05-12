package X;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class P54 extends MediaCodec.Callback {
    public int LIZ;
    public int LIZIZ;
    public final List<Long> LIZJ = new ArrayList();
    public final List<Long> LIZLLL = new ArrayList();
    public long LJ = 0;
    public final /* synthetic */ MediaExtractor LJFF;
    public final /* synthetic */ List LJI;
    public final /* synthetic */ List[] LJII;
    public final /* synthetic */ List LJIIIIZZ;
    public final /* synthetic */ P52 LJIIIZ;

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0099, code lost:
    
        r14.LJ = r11;
     */
    @Override // android.media.MediaCodec.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onInputBufferAvailable(android.media.MediaCodec r15, int r16) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P54.onInputBufferAvailable(android.media.MediaCodec, int):void");
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        try {
            if (bufferInfo.flags != 4) {
                int i2 = this.LIZIZ;
                List[] listArr = this.LJII;
                if (i2 < listArr.length) {
                    if (i2 < this.LJIIIZ.LIZLLL.length && listArr[i2].contains(Long.valueOf(bufferInfo.presentationTimeUs))) {
                        ((ArrayList) this.LIZLLL).add(Long.valueOf(bufferInfo.presentationTimeUs));
                        synchronized (this.LJIIIZ) {
                            if (Build.VERSION.SDK_INT >= 23) {
                                mediaCodec.releaseOutputBuffer(i, true);
                            } else {
                                mediaCodec.releaseOutputBuffer(i, bufferInfo.presentationTimeUs * 1000);
                            }
                            this.LJIIIZ.wait(0L);
                        }
                        if (this.LIZLLL.containsAll(this.LJII[this.LIZIZ])) {
                            this.LIZIZ++;
                            ((ArrayList) this.LIZLLL).clear();
                        }
                        int i3 = this.LIZIZ;
                        P52 p52 = this.LJIIIZ;
                        if (i3 >= p52.LIZLLL.length) {
                            p52.LIZLLL();
                            return;
                        }
                        return;
                    }
                    mediaCodec.releaseOutputBuffer(i, false);
                    return;
                }
            }
            this.LJIIIZ.LIZJ();
            this.LJIIIZ.LIZLLL();
        } catch (Exception unused) {
            this.LJIIIZ.LIZJ();
            this.LJIIIZ.LIZLLL();
        }
    }

    public P54(P52 p52, MediaExtractor mediaExtractor, List list, List[] listArr, List list2) {
        this.LJIIIZ = p52;
        this.LJFF = mediaExtractor;
        this.LJI = list;
        this.LJII = listArr;
        this.LJIIIIZZ = list2;
    }
}
