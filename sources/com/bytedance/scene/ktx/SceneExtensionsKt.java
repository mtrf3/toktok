package com.bytedance.scene.ktx;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C62822Ol8;
import X.GKW;
import X.WM7;
import android.app.Activity;
import android.os.Handler;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SceneExtensionsKt {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(GKW.INSTANCE);

    public static final boolean LIZ(WM7 isDestroyed) {
        o.LJIIIZ(isDestroyed, "$this$isDestroyed");
        Lifecycle lifecycle = isDestroyed.getLifecycle();
        o.LJIIIIZZ(lifecycle, "this.lifecycle");
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return true;
        }
        return false;
    }

    public static final ActivityC45651qj LIZLLL(WM7 requireFragmentActivity) {
        o.LJIIIZ(requireFragmentActivity, "$this$requireFragmentActivity");
        Activity requireActivity = requireFragmentActivity.requireActivity();
        if (requireActivity != null) {
            return (ActivityC45651qj) requireActivity;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }

    public static final void LIZIZ(WM7 post, final Runnable runnable) {
        o.LJIIIZ(post, "$this$post");
        Lifecycle lifecycle = post.getLifecycle();
        o.LJIIIIZZ(lifecycle, "this.lifecycle");
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        ((Handler) LIZ.getValue()).post(runnable);
        post.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.scene.ktx.SceneExtensionsKt$post$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                ((Handler) SceneExtensionsKt.LIZ.getValue()).removeCallbacks(runnable);
            }
        });
    }

    public static final void LIZJ(WM7 postDelayed, final Runnable runnable, long j) {
        o.LJIIIZ(postDelayed, "$this$postDelayed");
        Lifecycle lifecycle = postDelayed.getLifecycle();
        o.LJIIIIZZ(lifecycle, "this.lifecycle");
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        ((Handler) LIZ.getValue()).postDelayed(runnable, j);
        postDelayed.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.scene.ktx.SceneExtensionsKt$postDelayed$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                ((Handler) SceneExtensionsKt.LIZ.getValue()).removeCallbacks(runnable);
            }
        });
    }
}
