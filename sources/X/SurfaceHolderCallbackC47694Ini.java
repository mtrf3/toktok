package X;

import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;

/* renamed from: X.Ini, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class SurfaceHolderCallbackC47694Ini implements SurfaceHolder.Callback {
    public final WeakReference<TTVideoEngine> LJLIL;

    public SurfaceHolderCallbackC47694Ini(TTVideoEngine tTVideoEngine) {
        this.LJLIL = new WeakReference<>(tTVideoEngine);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("new surface callback:");
        LIZ.append(this);
        TTVideoEngineLog.d("TTVideoEngineSurfaceCallback", X1D.LIZIZ(LIZ));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("surfaceCreated, ");
        LIZ.append(surfaceHolder);
        TTVideoEngineLog.d("TTVideoEngineSurfaceCallback", X1D.LIZIZ(LIZ));
        TTVideoEngine tTVideoEngine = this.LJLIL.get();
        if (tTVideoEngine != null) {
            Surface surface = surfaceHolder.getSurface();
            VideoSurface LJJIL = tTVideoEngine.LJJIL();
            if (LJJIL != null) {
                LJJIL.LJJ(9, 1);
                LJJIL.LJJIJ(surface);
                LJJIL.LJJ(9, 0);
                LJJIL.LJJ(25, 1);
                TTVideoEngineLog.d("TTVideoEngineSurfaceCallback", "set texturerender force draw");
                return;
            }
            long j = C1A7.LJLJJI;
            if (j == Long.MIN_VALUE) {
                j = tTVideoEngine.LJJIIJZLJL(950);
            }
            tTVideoEngine.LLIZLLLIL(j, surface);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("surfaceDestroyed, ");
        LIZ.append(surfaceHolder);
        TTVideoEngineLog.d("TTVideoEngineSurfaceCallback", X1D.LIZIZ(LIZ));
        TTVideoEngine tTVideoEngine = this.LJLIL.get();
        if (tTVideoEngine != null) {
            VideoSurface LJJIL = tTVideoEngine.LJJIL();
            if (LJJIL != null) {
                LJJIL.LJJ(9, 1);
                LJJIL.LJJIJ(null);
                LJJIL.LJJ(9, 0);
            } else {
                long j = C1A7.LJLJJL;
                if (j == Long.MIN_VALUE) {
                    j = tTVideoEngine.LJJIIJZLJL(950);
                }
                tTVideoEngine.LLIZLLLIL(j, null);
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        VideoSurface LJJIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("surfaceChanged, ");
        LIZ.append(surfaceHolder);
        LIZ.append(", i:");
        LIZ.append(i);
        LIZ.append(",i1:");
        LIZ.append(i2);
        LIZ.append(", i2:");
        LIZ.append(i3);
        TTVideoEngineLog.d("TTVideoEngineSurfaceCallback", X1D.LIZIZ(LIZ));
        TTVideoEngine tTVideoEngine = this.LJLIL.get();
        if (tTVideoEngine != null && (LJJIL = tTVideoEngine.LJJIL()) != null) {
            LJJIL.LJJIIJZLJL(i2, i3);
        }
    }
}
