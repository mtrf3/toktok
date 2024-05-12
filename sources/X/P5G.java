package X;

import android.media.MediaMetadataRetriever;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.lynx.canvas.recorder.MediaRecorder;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.io.File;

/* loaded from: classes12.dex */
public final class P5G extends PthreadThread {
    public final /* synthetic */ P5E LJLIL;

    public final void LIZLLL() {
        boolean z;
        String extractMetadata;
        float f;
        P5E p5e = this.LJLIL;
        p5e.getClass();
        try {
            p5e.LJJIJIIJIL = P5E.LIZLLL();
            while (true) {
                synchronized (p5e) {
                    z = p5e.LJJ;
                }
                if (!z) {
                    break;
                }
                P5M p5m = p5e.LIZIZ;
                if (p5m != null) {
                    ((MediaRecorder) p5m).LIZJ();
                }
                p5e.LJI(false);
                p5e.LJFF();
                int i = p5e.LJIIIIZZ;
                if (i > 0 && p5e.LJJIJIIJI >= i * 1000000.0d) {
                    p5e.LJJ = false;
                    p5e.LJIL = false;
                }
            }
            p5e.LJIJ.signalEndOfInputStream();
            p5e.LJI(true);
            p5e.LJFF();
            try {
                p5e.LJIIJJI();
                File file = new File(p5e.LJIILJJIL);
                if (!file.exists() || !file.isFile()) {
                    p5e.LJIIIIZZ("create video file failed.");
                    return;
                }
                long length = file.length();
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(p5e.LJIILJJIL);
                    PPT ppt = p5e.LIZ;
                    if (ppt != null) {
                        extractMetadata = ppt.LIZLLL(mediaMetadataRetriever);
                    } else {
                        extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                    }
                    if (extractMetadata != null) {
                        f = CastFloatProtector.parseFloat(extractMetadata);
                    } else {
                        f = 0.0f;
                    }
                    p5e.LJJIJL.add(p5e.LJIILJJIL);
                    float f2 = f / 1000.0f;
                    P5M p5m2 = p5e.LIZIZ;
                    if (p5m2 == null) {
                        return;
                    }
                    ((MediaRecorder) p5m2).LJ(p5e.LJIILJJIL, f2, length);
                } catch (Throwable unused) {
                    p5e.LJIIIIZZ("video file is empty");
                }
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("release Encoder error.");
                LIZ.append(e.toString());
                p5e.LJIIIIZZ(X1D.LIZIZ(LIZ));
            }
        } catch (Exception e2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("encode error ");
            LIZ2.append(e2.toString());
            p5e.LJIIIIZZ(X1D.LIZIZ(LIZ2));
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZLLL();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P5G(P5E p5e) {
        super("MediaRecorder");
        this.LJLIL = p5e;
    }
}
