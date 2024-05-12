package com.bytedance.touchpoint.core.redpacketpendant.manager;

import X.AbstractC244999jT;
import X.C213688a4;
import X.C8YN;
import X.C95U;
import X.TBT;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.touchpoint.core.viewmodel.BaseTouchPointDataVM;
import kotlin.jvm.internal.AqS186S0100000_4;

/* loaded from: classes5.dex */
public abstract class AbsPendantManager<T> extends AbstractC244999jT implements GenericLifecycleObserver {
    public ViewGroup LJLIL;
    public LifecycleOwner LJLILLLLZI;
    public C95U LJLJI;

    public AbsPendantManager() {
        BaseTouchPointDataVM LJJ = LJJ();
        if (LJJ != null) {
            C8YN.LJII(this, LJJ, new TBT() { // from class: X.9Oq
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Long.valueOf(((C236009Oa) obj).LJLIL);
                }
            }, C213688a4.LIZLLL(), new AqS186S0100000_4((AbsPendantManager) this, 10), 4);
            C8YN.LJII(this, LJJ, new TBT() { // from class: X.9P4
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C236009Oa) obj).LJLILLLLZI;
                }
            }, C213688a4.LIZLLL(), new AqS186S0100000_4((AbsPendantManager) this, 11), 4);
        }
    }

    public abstract boolean LJJIFFI();

    public abstract void LJJII();

    public abstract void LJJIII();

    public abstract void LJJIIJ();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestory();
        }
    }

    public final boolean LJJI() {
        if (this.LJLJI == null || this.LJLILLLLZI == null || this.LJLIL == null || !LJJIFFI()) {
            return false;
        }
        return true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestory() {
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner = this.LJLILLLLZI;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        this.LJLILLLLZI = null;
        LJJIII();
    }
}
