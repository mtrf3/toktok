package com.ss.android.ugc.aweme.common;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class LiveEventObserver<T> implements LifecycleObserver, Observer<T> {
    public static final /* synthetic */ int LJLJJL = 0;
    public NextLiveData<T> LJLIL;
    public LifecycleOwner LJLILLLLZI;
    public Observer<? super T> LJLJI;
    public final List<T> LJLJJI = new ArrayList();

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestroy() {
        Lifecycle lifecycle;
        NextLiveData<T> nextLiveData = this.LJLIL;
        if (nextLiveData != null) {
            nextLiveData.removeObserver(this);
        }
        this.LJLIL = null;
        LifecycleOwner lifecycleOwner = this.LJLILLLLZI;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        this.LJLILLLLZI = null;
        ((ArrayList) this.LJLJJI).clear();
        this.LJLJI = null;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(T t) {
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        LifecycleOwner lifecycleOwner = this.LJLILLLLZI;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null && (currentState = lifecycle.getCurrentState()) != null && currentState.isAtLeast(Lifecycle.State.STARTED)) {
            Observer<? super T> observer = this.LJLJI;
            if (observer != null) {
                observer.onChanged(t);
                return;
            }
            return;
        }
        ((ArrayList) this.LJLJJI).add(t);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    private final void onEvent(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (lifecycleOwner != this.LJLILLLLZI) {
            return;
        }
        if (event == Lifecycle.Event.ON_START || event == Lifecycle.Event.ON_RESUME) {
            int size = ((ArrayList) this.LJLJJI).size();
            for (int i = 0; i < size; i++) {
                Observer<? super T> observer = this.LJLJI;
                if (observer != null) {
                    observer.onChanged((Object) ListProtector.get(this.LJLJJI, i));
                }
            }
            ((ArrayList) this.LJLJJI).clear();
        }
    }

    public LiveEventObserver(NextLiveData<T> nextLiveData, LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
        Lifecycle lifecycle;
        this.LJLIL = nextLiveData;
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = observer;
        LifecycleOwner lifecycleOwner2 = this.LJLILLLLZI;
        if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        NextLiveData<T> nextLiveData2 = this.LJLIL;
        if (nextLiveData2 != null) {
            nextLiveData2.observeForever(this);
        }
    }
}
