package com.bytedance.tiktok.sdk.powerviewpager;

import X.C72272SYa;
import X.C8ZK;
import X.InterfaceC36571c5;
import X.ORZ;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FragmentPageSelectedManager implements LifecycleEventObserver {
    public final C72272SYa LJLIL;
    public final HashMap<PowerViewPagerFragmentItem<?>, WeakReference<Fragment>> LJLILLLLZI;
    public Fragment LJLJI;

    public FragmentPageSelectedManager(C72272SYa adapter) {
        o.LJIIIZ(adapter, "adapter");
        this.LJLIL = adapter;
        this.LJLILLLLZI = new HashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(int i, Fragment fragment) {
        if (fragment == 0 || o.LJ(fragment, this.LJLJI)) {
            return;
        }
        InterfaceC36571c5 interfaceC36571c5 = this.LJLJI;
        if (interfaceC36571c5 instanceof C8ZK) {
            o.LJII(interfaceC36571c5, "null cannot be cast to non-null type com.bytedance.tiktok.sdk.powerviewpager.cell.PowerViewPagerFragmentCallback");
            ((C8ZK) interfaceC36571c5).Od();
        }
        if (fragment.isAdded() && (fragment instanceof C8ZK)) {
            ((C8ZK) fragment).onPageSelected(i);
            this.LJLJI = fragment;
        } else {
            this.LJLJI = null;
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        Fragment fragment;
        Fragment fragment2;
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event == Lifecycle.Event.ON_RESUME) {
            if (source instanceof Fragment) {
                fragment2 = (Fragment) source;
            } else {
                fragment2 = null;
            }
            LIZ(this.LJLIL.LJLLL, fragment2);
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            Set<PowerViewPagerFragmentItem<?>> keySet = this.LJLILLLLZI.keySet();
            o.LJIIIIZZ(keySet, "map.keys");
            for (Object obj : ORZ.LLJI(keySet)) {
                WeakReference<Fragment> weakReference = this.LJLILLLLZI.get(obj);
                if (weakReference != null) {
                    fragment = weakReference.get();
                } else {
                    fragment = null;
                }
                if (o.LJ(fragment, source)) {
                    this.LJLILLLLZI.remove(obj);
                }
            }
            if (o.LJ(source, this.LJLJI)) {
                if (source instanceof C8ZK) {
                    ((C8ZK) source).Od();
                }
                this.LJLJI = null;
            }
        }
    }
}
