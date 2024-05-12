package X;

import androidx.lifecycle.LifecycleEventObserver;
import androidx.navigation.NavBackStackEntry;

/* renamed from: X.a84, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92272a84 implements InterfaceC24580xq {
    public final /* synthetic */ NavBackStackEntry LIZ;
    public final /* synthetic */ LifecycleEventObserver LIZIZ;

    @Override // X.InterfaceC24580xq
    public final void dispose() {
        this.LIZ.LJLJLJ.removeObserver(this.LIZIZ);
    }

    public C92272a84(NavBackStackEntry navBackStackEntry, LifecycleEventObserver lifecycleEventObserver) {
        this.LIZ = navBackStackEntry;
        this.LIZIZ = lifecycleEventObserver;
    }
}
