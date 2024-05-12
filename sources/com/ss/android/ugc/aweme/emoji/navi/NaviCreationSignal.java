package com.ss.android.ugc.aweme.emoji.navi;

import Y.AObserverS65S0200000_1;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NaviCreationSignal {
    public static final SingleLiveData LIZ = new SingleLiveData();

    /* loaded from: classes2.dex */
    public static final class SingleLiveData<T> extends MutableLiveData<T> {
        @Override // androidx.lifecycle.LiveData
        public void observe(LifecycleOwner owner, Observer<? super T> observer) {
            o.LJIIIZ(owner, "owner");
            o.LJIIIZ(observer, "observer");
            super.observe(owner, new AObserverS65S0200000_1(observer, this, 5));
        }
    }
}
