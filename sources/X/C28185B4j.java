package X;

import android.content.res.Resources;
import android.os.Build;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.workaround.SurfaceViewAndroid10Workaround;
import kotlin.jvm.internal.o;

/* renamed from: X.B4j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28185B4j {
    public final View LIZ;
    public final J0Z LIZIZ;

    public final void LIZ() {
        View view = this.LIZ;
        if ((view instanceof SurfaceView) && (view.getParent() instanceof ViewGroup)) {
            int i = Resources.getSystem().getDisplayMetrics().heightPixels;
            Object parent = this.LIZ.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((View) parent).getTranslationX();
            Object parent2 = this.LIZ.getParent();
            o.LJII(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            ((View) parent2).setTranslationX(i * 5.0f);
            Object parent3 = this.LIZ.getParent();
            o.LJII(parent3, "null cannot be cast to non-null type android.view.ViewGroup");
            ((View) parent3).getTranslationX();
        }
    }

    public final B4L LIZIZ() {
        KeyEvent.Callback callback = this.LIZ;
        if (callback instanceof B4L) {
            o.LJII(callback, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.view.IRenderView");
            return (B4L) callback;
        }
        return null;
    }

    public C28185B4j(View view) {
        this.LIZ = view;
        if (SurfaceViewAndroid10Workaround.INSTANCE.isProxyPreviewPositionChangeListenerOfSurfaceView() && Build.VERSION.SDK_INT == 29 && (view instanceof SurfaceView)) {
            J0Z j0z = new J0Z();
            this.LIZIZ = j0z;
            j0z.LIZ((SurfaceView) view);
        }
    }

    public static void LIZJ(C28185B4j c28185B4j, ViewGroup.LayoutParams layoutParams) {
        if (c28185B4j.LIZ.getContext() != null) {
            if (layoutParams.height != 0 || layoutParams.width != 0) {
                c28185B4j.LIZ.setLayoutParams(layoutParams);
            }
        }
    }

    public static void LIZLLL(C28185B4j c28185B4j, int i) {
        KeyEvent.Callback callback = c28185B4j.LIZ;
        if ((callback instanceof B4L) && callback != null) {
            ((B4L) callback).LIZ(i, "");
        }
    }
}
