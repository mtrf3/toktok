package X;

import android.content.Context;
import android.os.Build;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.pullstream.SurfaceViewUnExpectedWHSetting;
import com.bytedance.android.livesdk.workaround.SurfaceViewAndroid10Workaround;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B4V {
    public View LIZ;
    public boolean LIZIZ;

    public final Context LIZ() {
        return this.LIZ.getContext();
    }

    public final ViewGroup.LayoutParams LIZIZ() {
        ViewGroup.LayoutParams layoutParams = this.LIZ.getLayoutParams();
        if (!SurfaceViewUnExpectedWHSetting.INSTANCE.getValue() || !((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline() || (layoutParams.height != 0 && layoutParams.width != 0)) {
            o.LJIIIIZZ(layoutParams, "layoutParams");
            return layoutParams;
        }
        throw new Exception("somewhere you changed make SurfaceView width and height equal to 0. This is not allowed");
    }

    public final B4E LIZJ() {
        KeyEvent.Callback callback = this.LIZ;
        if (callback instanceof B4E) {
            o.LJII(callback, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.view.IRender");
            return (B4E) callback;
        }
        return null;
    }

    public B4V(View videoView) {
        o.LJIIIZ(videoView, "videoView");
        this.LIZ = videoView;
        if (SurfaceViewAndroid10Workaround.INSTANCE.isProxyPositionChangeListenerOfSurfaceView() && Build.VERSION.SDK_INT == 29 && (this.LIZ instanceof SurfaceView)) {
            J0Z j0z = new J0Z();
            View view = this.LIZ;
            o.LJII(view, "null cannot be cast to non-null type android.view.SurfaceView");
            j0z.LIZ((SurfaceView) view);
        }
    }

    public final void LJFF(int i) {
        LJ(i, "");
    }

    public final void LJI(int i) {
        if (this.LIZIZ) {
            i = 8;
        }
        if (this.LIZ.getContext() != null) {
            KL2.LJIILLIIL(i, this.LIZ);
        }
    }

    public final void LIZLLL(ViewGroup.LayoutParams layoutParams, String from) {
        o.LJIIIZ(from, "from");
        if (this.LIZ.getContext() != null) {
            if (layoutParams.height != 0 || layoutParams.width != 0) {
                this.LIZ.setLayoutParams(layoutParams);
            }
        }
    }

    public final C76800UCe LJ(int i, String from) {
        o.LJIIIZ(from, "from");
        KeyEvent.Callback callback = this.LIZ;
        if (!(callback instanceof B4L) || callback == null) {
            return null;
        }
        ((B4L) callback).LIZ(i, from);
        return C76800UCe.LIZ;
    }
}
