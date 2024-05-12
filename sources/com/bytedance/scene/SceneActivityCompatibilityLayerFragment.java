package com.bytedance.scene;

import X.C0MB;
import X.C1JI;
import X.C78598Ut0;
import X.C78932UyO;
import X.I6A;
import X.InterfaceC78912Uy4;
import X.InterfaceC78913Uy5;
import X.InterfaceC78914Uy6;
import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes14.dex */
public final class SceneActivityCompatibilityLayerFragment extends Fragment {
    public final C0MB<InterfaceC78912Uy4> LJLIL = new C0MB<>();
    public final C0MB<InterfaceC78914Uy6> LJLILLLLZI = new C0MB<>();
    public final List<InterfaceC78913Uy5> LJLJI = new ArrayList();
    public final Set<I6A> LJLJJI = new HashSet();

    /* renamed from: com.bytedance.scene.SceneActivityCompatibilityLayerFragment$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements GenericLifecycleObserver {
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void onDestroy() {
            throw null;
        }
    }

    /* renamed from: com.bytedance.scene.SceneActivityCompatibilityLayerFragment$3, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements GenericLifecycleObserver {
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void onDestroy() {
            throw null;
        }
    }

    /* renamed from: com.bytedance.scene.SceneActivityCompatibilityLayerFragment$4, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass4 implements GenericLifecycleObserver {
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void onDestroy() {
            throw null;
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Iterator it = new HashSet(this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((I6A) it.next()).LIZ();
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ArrayList arrayList = new ArrayList(this.LJLJI);
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                InterfaceC78913Uy5 interfaceC78913Uy5 = (InterfaceC78913Uy5) ListProtector.get(arrayList, size);
                if (interfaceC78913Uy5 != null) {
                    interfaceC78913Uy5.LIZIZ();
                }
            } else {
                return;
            }
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC78912Uy4 LJ = this.LJLIL.LJ(i, null);
        if (LJ != null) {
            LJ.onResult(i2, intent);
            this.LJLIL.LJII(i);
        }
    }

    @Override // android.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        InterfaceC78914Uy6 LJ = this.LJLILLLLZI.LJ(i, null);
        if (LJ != null) {
            LJ.LIZ();
            this.LJLILLLLZI.LJII(i);
        }
    }

    public final void LIZ(final LifecycleOwner lifecycleOwner, Intent intent, final int i, InterfaceC78912Uy4 interfaceC78912Uy4) {
        C1JI.LJII();
        if (!C78932UyO.LJ(getActivity()) || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        if (i < 0) {
            C78598Ut0.LJIJJ(intent, this);
            startActivity(intent);
        } else {
            this.LJLIL.LJI(i, interfaceC78912Uy4);
            C78598Ut0.LJIJJ(intent, this);
            startActivityForResult(intent, i);
            lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.scene.SceneActivityCompatibilityLayerFragment.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        onDestroy();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public void onDestroy() {
                    lifecycleOwner.getLifecycle().removeObserver(this);
                    SceneActivityCompatibilityLayerFragment.this.LJLIL.LJII(i);
                }
            });
        }
    }
}
