package X;

import android.view.View;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import kotlin.jvm.internal.o;

/* renamed from: X.6bg */
/* loaded from: classes3.dex */
public final class C163726bg {
    public static final /* synthetic */ int LIZ = 0;

    public static /* synthetic */ C165626ek LIZJ(View view) {
        WM7 LJI = C78598Ut0.LJI(view);
        if (LJI != null) {
            return LIZ(SceneExtensionsKt.LIZLLL(LJI), view);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static /* synthetic */ C165626ek LIZLLL(WM7 wm7) {
        return LIZIZ(SceneExtensionsKt.LIZLLL(wm7), wm7);
    }

    public static final C165626ek LIZ(ActivityC45651qj activity, View view) {
        o.LJIIIZ(activity, "activity");
        if (C165706es.LIZJ(activity)) {
            return C165616ej.LIZ(activity);
        }
        WM7 LJI = C78598Ut0.LJI(view);
        if (LJI != null) {
            return LIZIZ(activity, LJI);
        }
        throw new IllegalArgumentException("Scene not found");
    }

    public static final C165626ek LIZIZ(ActivityC45651qj activity, WM7 scene) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(activity, "activity");
        ViewModelStoreOwner LIZIZ = C165706es.LIZIZ(activity, scene);
        if (LIZIZ instanceof ActivityC45651qj) {
            return C165616ej.LIZ((ActivityC45651qj) LIZIZ);
        }
        return C165616ej.LIZIZ(LIZIZ);
    }
}
