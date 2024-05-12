package com.ss.android.ugc.aweme.arch.widgets.base;

import X.C16880lQ;
import X.C207668Da;
import android.os.Handler;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class DataCenter extends ViewModel {
    public LifecycleOwner LJLJI;
    public Thread LJLJJI;
    public final Map<String, Object> LJLIL = new HashMap();
    public final Map<String, NextLiveData<C207668Da>> LJLILLLLZI = new HashMap();
    public final Handler LJLJJL = new Handler(C16880lQ.LLJJJJ());
    public final AtomicInteger LJLJJLL = new AtomicInteger(0);

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        ((HashMap) this.LJLIL).clear();
        ((HashMap) this.LJLILLLLZI).clear();
        this.LJLJI = null;
    }

    public final <T> T get(String str) {
        T t = (T) ((HashMap) this.LJLIL).get(str);
        if (t != null) {
            return t;
        }
        return null;
    }

    public final NextLiveData<C207668Da> hv0(String str) {
        NextLiveData<C207668Da> nextLiveData = (NextLiveData) ((HashMap) this.LJLILLLLZI).get(str);
        if (nextLiveData == null) {
            nextLiveData = new NextLiveData<>();
            if (((HashMap) this.LJLIL).containsKey(str)) {
                nextLiveData.setValue(new C207668Da(str, ((HashMap) this.LJLIL).get(str)));
            }
            ((HashMap) this.LJLILLLLZI).put(str, nextLiveData);
        }
        return nextLiveData;
    }

    public final void kv0(Observer observer) {
        if (observer == null) {
            return;
        }
        Iterator it = ((HashMap) this.LJLILLLLZI).values().iterator();
        while (it.hasNext()) {
            ((LiveData) it.next()).removeObserver(observer);
        }
    }

    public static DataCenter gv0(ViewModelProvider viewModelProvider, LifecycleOwner lifecycleOwner) {
        DataCenter dataCenter = (DataCenter) viewModelProvider.get(DataCenter.class);
        dataCenter.LJLJI = lifecycleOwner;
        return dataCenter;
    }

    public final <T> T get(String str, T t) {
        if (!((HashMap) this.LJLIL).containsKey(str)) {
            return t;
        }
        return (T) get(str);
    }

    public void jv0(final Object obj, final String str) {
        if (this.LJLJJI == null) {
            this.LJLJJI = C16880lQ.LLJJJJ().getThread();
        }
        if (C16880lQ.LLLLIIIILLL() == this.LJLJJI) {
            while (this.LJLJJLL.get() > 0) {
                try {
                    Thread.sleep(2L);
                } catch (InterruptedException unused) {
                }
            }
            synchronized (this) {
                ((HashMap) this.LJLIL).put(str, obj);
                MutableLiveData mutableLiveData = (MutableLiveData) ((HashMap) this.LJLILLLLZI).get(str);
                if (mutableLiveData != null) {
                    mutableLiveData.setValue(new C207668Da(str, obj));
                }
            }
            return;
        }
        this.LJLJJL.post(new Runnable() { // from class: X.2Tt
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    DataCenter.this.jv0(obj, str);
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public final void iv0(String str, Observer observer, boolean z) {
        if (TextUtils.isEmpty(str) || observer == null) {
            return;
        }
        hv0(str).observe(this.LJLJI, observer, z);
    }
}
