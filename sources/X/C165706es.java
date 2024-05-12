package X;

import Y.IDFactoryS63S0000000_7;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import kotlin.jvm.internal.o;

/* renamed from: X.6es */
/* loaded from: classes3.dex */
public final class C165706es {
    public static final /* synthetic */ int LIZ = 0;

    public static final ViewModelProvider LIZLLL(View view) {
        return LJII(view, null, 6);
    }

    public static final ViewModelProvider LJFF(WM7 wm7) {
        return LJIIIIZZ(wm7, null, null, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean LIZJ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (!(activity instanceof InterfaceC163766bk) || ((InterfaceC163766bk) activity).LJL()) {
            return true;
        }
        return false;
    }

    public static final ViewModelProvider LJ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        WM7 LJI = C78598Ut0.LJI(fragment.getView());
        if (LJI != null) {
            ActivityC45651qj requireActivity = fragment.requireActivity();
            o.LJIIIIZZ(requireActivity, "fragment.requireActivity()");
            return LJIIIIZZ(LJI, requireActivity, null, 4);
        }
        ViewModelProvider of = ViewModelProviders.of(fragment.requireActivity());
        o.LJIIIIZZ(of, "ViewModelProviders.of(fragment.requireActivity())");
        return of;
    }

    public static final ViewModelStoreOwner LIZ(ActivityC45651qj activity, View view) {
        o.LJIIIZ(activity, "activity");
        if (LIZJ(activity)) {
            return activity;
        }
        WM7 LJI = C78598Ut0.LJI(view);
        if (LJI != null) {
            return LIZIZ(SceneExtensionsKt.LIZLLL(LJI), LJI);
        }
        throw new IllegalArgumentException("Scene not found");
    }

    public static final ViewModelStoreOwner LIZIZ(ActivityC45651qj activity, WM7 scene) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(activity, "activity");
        if (LIZJ(activity)) {
            return activity;
        }
        while (scene != null) {
            if (scene instanceof InterfaceC165686eq) {
                return scene;
            }
            scene = scene.mParentScene;
        }
        throw new IllegalArgumentException("ViewModelStoreOwnerRoot not found");
    }

    public static final ViewModelProvider LJI(WM7 scene, ActivityC45651qj activity, ViewModelProvider.Factory factory) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(activity, "activity");
        ViewModelStoreOwner LIZIZ = LIZIZ(activity, scene);
        if (LIZIZ instanceof WM7) {
            if (factory != null) {
                return new ViewModelProvider(((WM7) LIZIZ).getViewModelStore(), factory);
            }
            return C165716et.LIZ((WM7) LIZIZ);
        }
        ViewModelProvider of = ViewModelProviders.of((ActivityC45651qj) LIZIZ, factory);
        o.LJIIIIZZ(of, "ViewModelProviders.of(ow…ragmentActivity, factory)");
        return of;
    }

    public static ViewModelProvider LJII(View view, ActivityC45651qj activity, int i) {
        if ((i & 2) != 0) {
            WM7 LJI = C78598Ut0.LJI(view);
            if (LJI != null) {
                activity = SceneExtensionsKt.LIZLLL(LJI);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        o.LJIIIZ(activity, "activity");
        if (LIZJ(activity)) {
            ViewModelProvider of = ViewModelProviders.of(activity, (ViewModelProvider.Factory) null);
            o.LJIIIIZZ(of, "ViewModelProviders.of(activity, factory)");
            return of;
        }
        WM7 LJI2 = C78598Ut0.LJI(view);
        if (LJI2 != null) {
            return LJI(LJI2, activity, null);
        }
        throw new IllegalArgumentException("Scene not found");
    }

    public static /* synthetic */ ViewModelProvider LJIIIIZZ(WM7 wm7, ActivityC45651qj activityC45651qj, IDFactoryS63S0000000_7 iDFactoryS63S0000000_7, int i) {
        if ((i & 2) != 0) {
            activityC45651qj = SceneExtensionsKt.LIZLLL(wm7);
        }
        if ((i & 4) != 0) {
            iDFactoryS63S0000000_7 = null;
        }
        return LJI(wm7, activityC45651qj, iDFactoryS63S0000000_7);
    }
}
