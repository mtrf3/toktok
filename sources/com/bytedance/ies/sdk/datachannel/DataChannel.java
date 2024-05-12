package com.bytedance.ies.sdk.datachannel;

import X.C76800UCe;
import X.InterfaceC32538Cpq;
import X.InterfaceC32549Cq1;
import X.InterfaceC88472Yns;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DataChannel extends BaseDataChannel {
    public static final /* synthetic */ int LJLJJL = 0;
    public LifecycleOwner LJLJJI;

    public final <T extends InterfaceC32538Cpq<O>, O> O kv0(Class<T> clazz) {
        o.LJIIIZ(clazz, "clazz");
        return (O) ((InterfaceC32549Cq1) gv0(clazz)).getValue();
    }

    public final void pv0(Class cls) {
        if (hv0()) {
            ((LiveData) gv0(cls)).postValue(C76800UCe.LIZ);
        } else {
            ((LiveData) gv0(cls)).setValue(C76800UCe.LIZ);
        }
    }

    public final void qv0(Class clazz, Object obj) {
        o.LJIIIZ(clazz, "clazz");
        if (hv0()) {
            ((LiveData) gv0(clazz)).postValue(obj);
        } else {
            ((LiveData) gv0(clazz)).setValue(obj);
        }
    }

    public final void rv0(Class cls, Object obj) {
        if (hv0()) {
            ((LiveData) gv0(cls)).postValue(obj);
        } else {
            ((LiveData) gv0(cls)).setValue(obj);
        }
    }

    public final void lv0(LifecycleOwner lifecycleOwner, Class clazz, InterfaceC88472Yns observer) {
        o.LJIIIZ(clazz, "clazz");
        o.LJIIIZ(observer, "observer");
        if (lifecycleOwner != null) {
            ((NextLiveData) gv0(clazz)).observe(lifecycleOwner, observer, false);
            return;
        }
        LifecycleOwner lifecycleOwner2 = this.LJLJJI;
        if (lifecycleOwner2 == null) {
            return;
        }
        ((NextLiveData) gv0(clazz)).observe(lifecycleOwner2, observer, false);
    }

    public final void mv0(Class clazz, Object observerOwner, InterfaceC88472Yns observer) {
        o.LJIIIZ(observerOwner, "observerOwner");
        o.LJIIIZ(clazz, "clazz");
        o.LJIIIZ(observer, "observer");
        iv0(observerOwner, null, clazz, false, observer);
    }

    public final void nv0(Class cls, Object observerOwner, InterfaceC88472Yns observer) {
        o.LJIIIZ(observerOwner, "observerOwner");
        o.LJIIIZ(observer, "observer");
        iv0(observerOwner, null, cls, true, observer);
    }

    public final void ov0(LifecycleOwner lifecycleOwner, Class clazz, InterfaceC88472Yns observer) {
        o.LJIIIZ(clazz, "clazz");
        o.LJIIIZ(observer, "observer");
        if (lifecycleOwner != null) {
            ((NextLiveData) gv0(clazz)).observe(lifecycleOwner, observer, true);
            return;
        }
        LifecycleOwner lifecycleOwner2 = this.LJLJJI;
        if (lifecycleOwner2 == null) {
            return;
        }
        ((NextLiveData) gv0(clazz)).observe(lifecycleOwner2, observer, true);
    }
}
