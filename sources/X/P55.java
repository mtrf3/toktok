package X;

import Y.ARunnableS47S0100000_11;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class P55 extends MediaCodec.Callback {
    public int LIZ;
    public int LIZIZ;
    public final List<Long> LIZJ = new ArrayList();
    public final List<Long> LIZLLL = new ArrayList();
    public long LJ = 0;
    public final /* synthetic */ MediaExtractor LJFF;
    public final /* synthetic */ List[] LJI;
    public final /* synthetic */ List LJII;
    public final /* synthetic */ P53 LJIIIIZZ;

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        long j;
        try {
            int i2 = this.LIZ;
            P53 p53 = this.LJIIIIZZ;
            if (i2 >= p53.LIZLLL.length) {
                p53.LJIIL.queueInputBuffer(i, 0, 0, 0L, 4);
                P4Q.LJFF(this.LJIIIIZZ.LIZIZ, "onInputBufferAvailable end");
                return;
            }
            int readSampleData = this.LJFF.readSampleData(p53.LJIIL.getInputBuffer(i), 0);
            long sampleTime = this.LJFF.getSampleTime();
            if (this.LJFF.getSampleFlags() == 1) {
                this.LJ = sampleTime;
            }
            ((ArrayList) this.LIZJ).add(Long.valueOf(sampleTime));
            if (readSampleData > 0 && sampleTime >= 0) {
                this.LJIIIIZZ.LJIIL.queueInputBuffer(i, 0, readSampleData, sampleTime, 0);
                if (!this.LIZJ.containsAll(this.LJI[this.LIZ])) {
                    this.LJFF.advance();
                    return;
                }
                ((ArrayList) this.LIZJ).clear();
                int i3 = this.LIZ + 1;
                this.LIZ = i3;
                P53 p532 = this.LJIIIIZZ;
                if (i3 < p532.LIZLLL.length) {
                    int indexOf = this.LJII.indexOf(Long.valueOf(this.LJ));
                    long longValue = ((Long) ListProtector.get(this.LJI[this.LIZ], 0)).longValue();
                    if (indexOf != -1 && indexOf < this.LJII.size() - 1) {
                        j = ((Long) ListProtector.get(this.LJII, indexOf + 1)).longValue();
                        if (longValue <= sampleTime && longValue < j) {
                            this.LJFF.advance();
                            return;
                        } else {
                            this.LJFF.seekTo(longValue, 0);
                            return;
                        }
                    }
                    j = Long.MAX_VALUE;
                    if (longValue <= sampleTime) {
                    }
                    this.LJFF.seekTo(longValue, 0);
                    return;
                }
                P4Q.LJFF(p532.LIZIZ, "timer begin");
                new Handler().postDelayed(new ARunnableS47S0100000_11(this, 40), 1000L);
                return;
            }
            String str = this.LJIIIIZZ.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onInputBufferAvailable sampSize<0 or time<0 sampSize");
            LIZ.append(readSampleData);
            LIZ.append(" time: ");
            LIZ.append(sampleTime);
            P4Q.LJFF(str, X1D.LIZIZ(LIZ));
            this.LJIIIIZZ.LIZJ();
            this.LJIIIIZZ.LIZLLL();
        } catch (Exception unused) {
            P4Q.LJFF(this.LJIIIIZZ.LIZIZ, "onInputBufferAvailable crash");
            this.LJIIIIZZ.LIZJ();
            this.LJIIIIZZ.LIZLLL();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        try {
            int i2 = this.LIZIZ;
            if (i2 < this.LJIIIIZZ.LIZLLL.length && this.LJI[i2].contains(Long.valueOf(bufferInfo.presentationTimeUs))) {
                ((ArrayList) this.LIZLLL).add(Long.valueOf(bufferInfo.presentationTimeUs));
                synchronized (this.LJIIIIZZ) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        mediaCodec.releaseOutputBuffer(i, true);
                    } else {
                        mediaCodec.releaseOutputBuffer(i, bufferInfo.presentationTimeUs * 1000);
                    }
                    this.LJIIIIZZ.wait(0L);
                }
                if (this.LIZLLL.containsAll(this.LJI[this.LIZIZ])) {
                    this.LIZIZ++;
                    ((ArrayList) this.LIZLLL).clear();
                }
                int i3 = this.LIZIZ;
                P53 p53 = this.LJIIIIZZ;
                if (i3 >= p53.LIZLLL.length) {
                    p53.LIZLLL();
                    return;
                }
                return;
            }
            mediaCodec.releaseOutputBuffer(i, false);
        } catch (Exception unused) {
            this.LJIIIIZZ.LIZJ();
            this.LJIIIIZZ.LIZLLL();
        }
    }

    public P55(P53 p53, MediaExtractor mediaExtractor, List[] listArr, List list) {
        this.LJIIIIZZ = p53;
        this.LJFF = mediaExtractor;
        this.LJI = listArr;
        this.LJII = list;
    }
}
