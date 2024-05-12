package com.lynx.canvas.recorder;

import X.O5Y;
import X.P5E;
import X.P5F;
import X.P5G;
import X.P5L;
import X.P5M;
import X.X1D;
import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.os.Build;
import android.view.Surface;
import com.lynx.canvas.KryptonApp;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes12.dex */
public class MediaRecorder implements P5M {
    public volatile long LIZ;
    public final P5L LIZIZ;
    public final KryptonApp LIZJ;

    private native void nativeNotifyClipEndWithError(long j, String str);

    private native void nativeNotifyClipEndWithResult(long j, String str, float f, long j2);

    private native void nativeNotifyFlushRecord(long j);

    private native void nativeNotifyStartError(long j, String str);

    private native void nativeNotifyStopWithError(long j, String str);

    private native void nativeNotifyStopWithResult(long j, String str, float f, long j2);

    public final void LIZJ() {
        if (this.LIZ != 0) {
            nativeNotifyFlushRecord(this.LIZ);
        }
    }

    public long lastPresentationTime() {
        long j;
        P5E p5e = (P5E) this.LIZIZ;
        synchronized (p5e) {
            j = p5e.LJJIJIIJI;
        }
        return j;
    }

    public void pauseRecord() {
        O5Y.LJJJ("KryptonMediaRecorder", "pause record");
        P5E p5e = (P5E) this.LIZIZ;
        synchronized (p5e) {
            p5e.LJJIIZI = P5E.LIZLLL();
            p5e.LJIL = true;
        }
    }

    public void resumeRecord() {
        O5Y.LJJJ("KryptonMediaRecorder", "resume record");
        P5E p5e = (P5E) this.LIZIZ;
        synchronized (p5e) {
            p5e.LJJIJ = (P5E.LIZLLL() - p5e.LJJIIZI) + p5e.LJJIJ;
            p5e.LJIL = false;
        }
    }

    public Surface startRecord() {
        O5Y.LJJJ("KryptonMediaRecorder", "start record");
        P5E p5e = (P5E) this.LIZIZ;
        synchronized (p5e) {
            if (p5e.LJ <= 0 || p5e.LJFF <= 0) {
                P5M p5m = p5e.LIZIZ;
                if (p5m != null) {
                    ((MediaRecorder) p5m).LIZLLL("init param error");
                }
            } else {
                p5e.LJJIJ = 0L;
                p5e.LJJIIZI = 0L;
                p5e.LJIJJLI = false;
                p5e.LJJIJIIJI = 0L;
                p5e.LJJIIJZLJL = -1;
                p5e.LJJIIZ = -1;
                p5e.LJJIIJ = 0;
                p5e.LJIL = false;
                p5e.LJJIFFI = 0L;
                p5e.LJJII = 0L;
                try {
                    p5e.LJIIJ();
                    if (p5e.LJJI) {
                        try {
                            p5e.LJIIIZ();
                            p5e.LJJIII = 2;
                        } catch (Exception e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("prepareAudioEncoder ");
                            LIZ.append(e.toString());
                            String LIZIZ = X1D.LIZIZ(LIZ);
                            O5Y.LJIILIIL("KryptonMediaRecorder", LIZIZ);
                            P5M p5m2 = p5e.LIZIZ;
                            if (p5m2 != null) {
                                ((MediaRecorder) p5m2).LIZLLL(LIZIZ);
                            }
                        }
                    } else {
                        p5e.LJJIII = 1;
                    }
                    try {
                        p5e.LJIILJJIL = p5e.LIZIZ();
                        p5e.LJIJJ = new MediaMuxer(p5e.LJIILJJIL, 0);
                        p5e.LJJ = true;
                        new P5G(p5e).start();
                        return p5e.LJIILL;
                    } catch (Exception e2) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("initMediaMuxer ");
                        LIZ2.append(e2.toString());
                        String LIZIZ2 = X1D.LIZIZ(LIZ2);
                        O5Y.LJIILIIL("KryptonMediaRecorder", LIZIZ2);
                        P5M p5m3 = p5e.LIZIZ;
                        if (p5m3 != null) {
                            ((MediaRecorder) p5m3).LIZLLL(LIZIZ2);
                        }
                    }
                } catch (Exception e3) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("prepareVideoEncoder ");
                    LIZ3.append(e3.toString());
                    LIZ3.append("model:");
                    LIZ3.append(Build.MODEL);
                    LIZ3.append(" width:");
                    LIZ3.append(p5e.LJ);
                    LIZ3.append(" height:");
                    LIZ3.append(p5e.LJFF);
                    LIZ3.append(" bps:");
                    LIZ3.append(p5e.LJI);
                    LIZ3.append("ranges: ");
                    LIZ3.append(p5e.LJIILIIL);
                    String LIZIZ3 = X1D.LIZIZ(LIZ3);
                    O5Y.LJIILIIL("KryptonMediaRecorder", LIZIZ3);
                    P5M p5m4 = p5e.LIZIZ;
                    if (p5m4 != null) {
                        ((MediaRecorder) p5m4).LIZLLL(LIZIZ3);
                    }
                }
            }
            return null;
        }
    }

    public void stopRecord() {
        O5Y.LJJJ("KryptonMediaRecorder", "stop record");
        ((P5E) this.LIZIZ).LJIILIIL();
    }

    public final void LIZIZ(String str) {
        if (this.LIZ != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("on recorder clip end with error ");
            LIZ.append(str);
            O5Y.LJJLIIIJJI("KryptonMediaRecorder", X1D.LIZIZ(LIZ));
            nativeNotifyClipEndWithError(this.LIZ, str);
        }
    }

    public final void LIZLLL(String str) {
        if (this.LIZ != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("on recorder start error ");
            LIZ.append(str);
            O5Y.LJJLIIIJJI("KryptonMediaRecorder", X1D.LIZIZ(LIZ));
            nativeNotifyStartError(this.LIZ, str);
        }
    }

    public final void LJFF(String str) {
        if (this.LIZ != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("on recorder stop with error ");
            LIZ.append(str);
            O5Y.LJJLIIIJJI("KryptonMediaRecorder", X1D.LIZIZ(LIZ));
            nativeNotifyStopWithError(this.LIZ, str);
        }
    }

    public boolean clipVideo(long[] jArr) {
        O5Y.LJJJ("KryptonMediaRecorder", "clip video");
        P5E p5e = (P5E) this.LIZIZ;
        p5e.LJJIJIL = jArr;
        new P5F(p5e).start();
        return true;
    }

    public void destroy(boolean z) {
        O5Y.LJJJ("KryptonMediaRecorder", "destroy");
        this.LIZ = 0L;
        P5E p5e = (P5E) this.LIZIZ;
        synchronized (p5e) {
            p5e.LJIILIIL();
            if (z) {
                O5Y.LJJJ("KryptonMediaRecorder", "Media recorder destroy with video files deleted");
                Iterator<String> it = p5e.LJJIJL.iterator();
                while (it.hasNext()) {
                    P5E.LJ(it.next());
                }
            } else {
                O5Y.LJJJ("KryptonMediaRecorder", "Media recorder destroy with 1 video files not deleted");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MediaRecorder(long r4, com.lynx.canvas.KryptonApp r6) {
        /*
            r3 = this;
            r3.<init>()
            r3.LIZ = r4
            r3.LIZJ = r6
            java.lang.Class<X.P5J> r1 = X.P5J.class
            java.util.LinkedHashMap<java.lang.Class, X.J0Q> r0 = r6.LIZLLL
            java.lang.Object r0 = r0.get(r1)
            X.J0Q r0 = (X.J0Q) r0
            X.P5J r0 = (X.P5J) r0
            java.lang.String r2 = "KryptonMediaRecorder"
            if (r0 != 0) goto L21
            java.lang.String r0 = "media recorder service not found"
            X.O5Y.LJIILIIL(r2, r0)
        L1c:
            r1 = 0
        L1d:
            r3.LIZIZ = r1
            monitor-enter(r1)
            goto L2d
        L21:
            X.P5E r1 = r0.LIZ()
            if (r1 != 0) goto L1d
            java.lang.String r0 = "service create media recorder return null"
            X.O5Y.LJIILIIL(r2, r0)
            goto L1c
        L2d:
            r1.LIZIZ = r3     // Catch: java.lang.Throwable -> L31
            monitor-exit(r1)
            return
        L31:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.canvas.recorder.MediaRecorder.<init>(long, com.lynx.canvas.KryptonApp):void");
    }

    public static MediaRecorder create(long j, KryptonApp kryptonApp) {
        return new MediaRecorder(j, kryptonApp);
    }

    public void onAudioSample(ByteBuffer byteBuffer, int i) {
        P5E p5e = (P5E) this.LIZIZ;
        MediaCodec mediaCodec = p5e.LJIJI;
        if (mediaCodec == null) {
            return;
        }
        try {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            if (dequeueInputBuffer < 0) {
                O5Y.LJJLIIIJJI("KryptonMediaRecorder", "no input buffer, audio data dropped");
            } else {
                ByteBuffer byteBuffer2 = p5e.LJIJI.getInputBuffers()[dequeueInputBuffer];
                byteBuffer2.clear();
                byteBuffer.position(0).limit(i);
                byteBuffer2.put(byteBuffer);
                long j = p5e.LJJII;
                long j2 = (1000000 * j) / p5e.LJIIJJI;
                p5e.LJJIFFI = j2;
                p5e.LJJII = j + (i >> 2);
                p5e.LJIJI.queueInputBuffer(dequeueInputBuffer, 0, i, j2, 0);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onAudioSample exception ");
            LIZ.append(e.toString());
            O5Y.LJJLIIIJJI("KryptonMediaRecorder", X1D.LIZIZ(LIZ));
        }
    }

    public final void LIZ(String str, float f, long j) {
        if (this.LIZ != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("on recorder clip end with result. duration:");
            LIZ.append(f);
            LIZ.append(", size:");
            LIZ.append(j);
            O5Y.LJJJ("KryptonMediaRecorder", X1D.LIZIZ(LIZ));
            nativeNotifyClipEndWithResult(this.LIZ, str, f, j);
        }
    }

    public final void LJ(String str, float f, long j) {
        if (this.LIZ != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("on recorder stop with result. duration:");
            LIZ.append(f);
            LIZ.append(", size:");
            LIZ.append(j);
            O5Y.LJJJ("KryptonMediaRecorder", X1D.LIZIZ(LIZ));
            nativeNotifyStopWithResult(this.LIZ, str, f, j);
        }
    }

    public void configAudio(int i, int i2, int i3) {
        O5Y.LJJJ("KryptonMediaRecorder", "use audio");
        P5E p5e = (P5E) this.LIZIZ;
        synchronized (p5e) {
            if (i < 0) {
                p5e.LJJI = false;
            } else {
                p5e.LJIIJ = i;
                p5e.LJIIIZ = i2;
                p5e.LJIIJJI = i3;
                p5e.LJJI = true;
            }
        }
    }

    public void configVideo(String str, int i, int i2, int i3, int i4, int i5) {
        P5E p5e = (P5E) this.LIZIZ;
        synchronized (p5e) {
            p5e.LIZJ = str;
            p5e.LJIIIIZZ = i;
            p5e.LJ = i2;
            p5e.LJFF = i3;
            p5e.LJI = i4;
            p5e.LJII = i5;
            p5e.LJIIL = true;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("configVideo for ");
            LIZ.append(Build.MODEL);
            LIZ.append(", width: ");
            LIZ.append(p5e.LJ);
            LIZ.append(", height: ");
            LIZ.append(p5e.LJFF);
            LIZ.append(", bps: ");
            LIZ.append(p5e.LJI);
            LIZ.append(", fps: ");
            LIZ.append(p5e.LJII);
            O5Y.LJJJ("KryptonMediaRecorder", X1D.LIZIZ(LIZ));
        }
    }
}
