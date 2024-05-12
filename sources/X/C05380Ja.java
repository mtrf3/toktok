package X;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.view.Surface;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* renamed from: X.0Ja, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05380Ja {
    public VirtualDisplay LIZ;
    public MediaProjection LIZLLL;
    public final MediaProjectionManager LJ;
    public Surface LJFF;
    public int LIZIZ = 1920;
    public int LIZJ = 1080;
    public final C0JZ LJI = new VirtualDisplay.Callback() { // from class: X.0JZ
        @Override // android.hardware.display.VirtualDisplay.Callback
        public final void onPaused() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("virtualDisplay onPaused, virtualDisplay =");
            LIZ.append(C05380Ja.this.LIZ);
            C0NB.LJIIIZ("VirtualDisplayManager", X1D.LIZIZ(LIZ));
        }

        @Override // android.hardware.display.VirtualDisplay.Callback
        public final void onResumed() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("virtualDisplay onResumed, virtualDisplay =");
            LIZ.append(C05380Ja.this.LIZ);
            C0NB.LJIIIZ("VirtualDisplayManager", X1D.LIZIZ(LIZ));
        }

        @Override // android.hardware.display.VirtualDisplay.Callback
        public final void onStopped() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("virtualDisplay onStopped, virtualDisplay =");
            LIZ.append(C05380Ja.this.LIZ);
            C0NB.LJIIIZ("VirtualDisplayManager", X1D.LIZIZ(LIZ));
        }
    };

    public final void LIZ() {
        VirtualDisplay virtualDisplay;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("registerVirtualDisplay with MediaProjection, width{");
        LIZ.append(this.LIZIZ);
        LIZ.append("} height{");
        LIZ.append(this.LIZJ);
        LIZ.append("} name{");
        LIZ.append("xxx-v-display");
        LIZ.append("}, mediaProjection:");
        LIZ.append(this.LIZLLL);
        C0NB.LIZIZ("VirtualDisplayManager", X1D.LIZIZ(LIZ));
        try {
            MediaProjection mediaProjection = this.LIZLLL;
            if (mediaProjection != null) {
                virtualDisplay = P33.LIZ(mediaProjection, "xxx-v-display", this.LIZIZ, this.LIZJ, 1, this.LJFF, this.LJI, C78857UxB.LJJIIJ(1476411394, "bpea-game_live_cast_create_virtual_display"));
            } else {
                virtualDisplay = null;
            }
            this.LIZ = virtualDisplay;
        } catch (Q0C e) {
            C0NB.LJI("VirtualDisplayManager", e);
        }
    }

    public final void LIZIZ() {
        C0NB.LIZIZ("VirtualDisplayManager", "release ");
        VirtualDisplay virtualDisplay = this.LIZ;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.LIZ = null;
        }
        C0NB.LIZIZ("VirtualDisplayManager", "tearDownMediaProjection ");
        try {
            MediaProjection mediaProjection = this.LIZLLL;
            if (mediaProjection != null) {
                if (!new C03880Dg(2).LIZJ(102102, "android/media/projection/MediaProjection", "stop", mediaProjection, new Object[0], "void", new C65300Pk0(false, "()V", "-2033744794974144763")).LIZ) {
                    mediaProjection.stop();
                }
                this.LIZLLL = null;
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0JZ] */
    public C05380Ja(Context context) {
        Object LLILL = C16880lQ.LLILL(context, "media_projection");
        o.LJII(LLILL, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
        this.LJ = (MediaProjectionManager) LLILL;
    }

    public final void LJ(Surface surface) {
        o.LJIIIZ(surface, "surface");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSurface, Surface:");
        LIZ.append(surface);
        C0NB.LJIIIZ("VirtualDisplayManager", X1D.LIZIZ(LIZ));
        this.LJFF = surface;
    }

    public final void LIZJ(int i, Fragment fragment) {
        Intent intent;
        C0NB.LJIIIZ("VirtualDisplayManager", "requestRecordFromMediaProjection");
        try {
            MediaProjectionManager mediaProjectionManager = this.LJ;
            if (mediaProjectionManager != null) {
                P34 p34 = C29174Bcg.LIZ;
                C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476411394, "bpea-game_live_cast_create_capture_intent");
                p34.getClass();
                intent = P34.LIZIZ(mediaProjectionManager, LJJIIJ);
            } else {
                intent = null;
            }
            C16880lQ.LJII(fragment, intent, i);
        } catch (Q0C e) {
            C0NB.LJI("VirtualDisplayManager", e);
        }
    }

    public final void LIZLLL(int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setResolution, w:");
        LIZ.append(i);
        LIZ.append(", h:");
        LIZ.append(i2);
        C0NB.LJIIIZ("VirtualDisplayManager", X1D.LIZIZ(LIZ));
        if (1 <= i && i < 4097) {
            this.LIZIZ = i;
        }
        if (1 <= i2 && i2 < 4097) {
            this.LIZJ = i2;
        }
    }

    public final void LJFF(int i, Intent resultData) {
        Object LIZ;
        MediaProjection mediaProjection;
        o.LJIIIZ(resultData, "resultData");
        C0NB.LJIIIZ("VirtualDisplayManager", "setupMediaProjection");
        try {
            MediaProjectionManager mediaProjectionManager = this.LJ;
            if (mediaProjectionManager != null) {
                P34 p34 = C29174Bcg.LIZ;
                C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476411394, " bpea-game_live_cast_get_media_projection");
                p34.getClass();
                mediaProjection = P34.LIZJ(mediaProjectionManager, i, resultData, LJJIIJ);
            } else {
                mediaProjection = null;
            }
            this.LIZLLL = mediaProjection;
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C0NB.LJI("VirtualDisplayManager", m10exceptionOrNullimpl);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setupMediaProjection, mediaProjection:");
        LIZ2.append(this.LIZLLL);
        C0NB.LJIIIZ("VirtualDisplayManager", X1D.LIZIZ(LIZ2));
    }
}
