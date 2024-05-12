package X;

import X.C78488UrE;
import X.C78489UrF;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;

/* renamed from: X.UrE, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78488UrE<T> {
    public final ArrayList<InterfaceC78491UrH<T>> LIZ = new ArrayList<>();

    public final void LIZIZ(Fragment fragment) {
        fragment.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.base.ui.session.Session$2
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public void onDestroy() {
                C78488UrE c78488UrE = C78488UrE.this;
                c78488UrE.LIZ.clear();
                C78489UrF LIZ = C78489UrF.LIZ();
                synchronized (LIZ) {
                    LIZ.LIZ.values().remove(c78488UrE);
                }
            }
        });
    }

    public final void LIZ(ActivityC45651qj activityC45651qj, final C78490UrG c78490UrG) {
        if (!this.LIZ.contains(c78490UrG)) {
            this.LIZ.add(c78490UrG);
        }
        activityC45651qj.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.base.ui.session.Session$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public void onDestroy() {
                C78488UrE c78488UrE = C78488UrE.this;
                c78488UrE.LIZ.remove(c78490UrG);
            }
        });
    }
}
