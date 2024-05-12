package X;

import android.app.Fragment;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

/* renamed from: X.1gQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class FragmentC39261gQ extends Fragment implements LifecycleOwner {
    public final LifecycleRegistry LJLIL = new LifecycleRegistry(this);

    @Override // android.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LJLIL.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LJLIL.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LJLIL.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.LJLIL.handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.LJLIL.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LJLIL;
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LJLIL.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }
}
