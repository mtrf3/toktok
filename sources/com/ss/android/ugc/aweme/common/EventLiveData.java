package com.ss.android.ugc.aweme.common;

import X.C16880lQ;
import X.C80213Cv;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EventLiveData<T> extends NextLiveData<T> {
    @Override // com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData, androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void postValue(final T t) {
        if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
            setValue(t);
        } else {
            C80213Cv.LIZ.post(new Runnable(this, t) { // from class: X.3Cu
                public final MutableLiveData<T> LJLIL;
                public final T LJLILLLLZI;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        this.LJLIL.setValue(this.LJLILLLLZI);
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LJLIL = this;
                    this.LJLILLLLZI = t;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData, androidx.lifecycle.LiveData
    public void observe(LifecycleOwner owner, Observer<? super T> observer) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(observer, "observer");
        if (owner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        new LiveEventObserver(this, owner, observer);
    }

    public final LiveEventObserver<T> subscribe(LifecycleOwner owner, Observer<? super T> observer) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(observer, "observer");
        if (owner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return null;
        }
        return new LiveEventObserver<>(this, owner, observer);
    }
}
