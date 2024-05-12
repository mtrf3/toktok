package com.ss.android.ugc.aweme.arch.widgets.base;

import X.C16880lQ;
import X.C1DH;
import Y.ARunnableS20S0200000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ChangeLiveData<T> extends NextLiveData<T> {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData, androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void postValue(T t) {
        if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
            setValue(t);
        } else {
            C1DH.LJJIJIIJI(new ARunnableS20S0200000_1(this, t, 3));
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData, androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void setValue(T t) {
        if (!o.LJ(getValue(), t)) {
            super.setValue(t);
        }
    }
}
