package com.bytedance.ies.sdk.widgets;

import X.C16880lQ;
import X.HWA;
import Y.ARunnableS15S0301000_15;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public class DataCenter extends ViewModel {
    public LifecycleOwner lifecycleOwner;
    public Thread mainThread;
    public Map<String, Object> dataStore = new HashMap();
    public Map<String, NextLiveData<KVData>> liveDataMap = new HashMap();
    public Handler handler = new Handler(C16880lQ.LLJJJJ());

    private boolean notMainThread() {
        if (this.mainThread == null) {
            this.mainThread = C16880lQ.LLJJJJ().getThread();
        }
        if (C16880lQ.LLLLIIIILLL() != this.mainThread) {
            return true;
        }
        return false;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        this.dataStore.clear();
        this.liveDataMap.clear();
        this.lifecycleOwner = null;
        this.handler.removeCallbacksAndMessages(null);
    }

    private NextLiveData<KVData> getLiveData(String str) {
        NextLiveData<KVData> nextLiveData = this.liveDataMap.get(str);
        if (nextLiveData == null) {
            nextLiveData = new NextLiveData<>();
            if (this.dataStore.containsKey(str)) {
                nextLiveData.setValue(new KVData(str, this.dataStore.get(str)));
            }
            this.liveDataMap.put(str, nextLiveData);
        }
        return nextLiveData;
    }

    public <T> T get(String str) {
        T t = (T) this.dataStore.get(str);
        if (t != null) {
            return t;
        }
        return null;
    }

    public boolean has(String str) {
        return this.dataStore.containsKey(str);
    }

    /* renamed from: put, reason: merged with bridge method [inline-methods] */
    public DataCenter lambda$put$0(Bundle bundle) {
        if (notMainThread()) {
            this.handler.post(new HWA(0, this, bundle));
            return this;
        }
        if (bundle == null) {
            return this;
        }
        for (String str : bundle.keySet()) {
            if (str != null) {
                lambda$put$1(str, C16880lQ.LLJJIII(bundle, str));
            }
        }
        return this;
    }

    public DataCenter removeObserver(Observer<KVData> observer) {
        if (observer == null) {
            return this;
        }
        Iterator<NextLiveData<KVData>> it = this.liveDataMap.values().iterator();
        while (it.hasNext()) {
            it.next().removeObserver(observer);
        }
        return this;
    }

    public static DataCenter create(ViewModelProvider viewModelProvider, LifecycleOwner lifecycleOwner) {
        DataCenter dataCenter = (DataCenter) viewModelProvider.get(DataCenter.class);
        dataCenter.lifecycleOwner = lifecycleOwner;
        return dataCenter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T get(Object obj, T t) {
        if (obj == 0) {
            return null;
        }
        if (t == null || (((obj instanceof Number) && (t instanceof Number)) || t.getClass().isAssignableFrom(obj.getClass()))) {
            return obj;
        }
        return t;
    }

    public DataCenter observe(String str, Observer<KVData> observer) {
        observe(str, observer, false);
        return this;
    }

    public DataCenter observeForever(String str, Observer<KVData> observer) {
        observeForever(str, observer, false);
        return this;
    }

    /* renamed from: put, reason: merged with bridge method [inline-methods] */
    public DataCenter lambda$put$1(String str, Object obj) {
        if (notMainThread()) {
            this.handler.post(new ARunnableS15S0301000_15(1, this, str, obj, 2));
            return this;
        }
        this.dataStore.put(str, obj);
        NextLiveData<KVData> nextLiveData = this.liveDataMap.get(str);
        if (nextLiveData != null) {
            nextLiveData.setValue(new KVData(str, obj));
        }
        return this;
    }

    public DataCenter removeObserver(String str, Observer<KVData> observer) {
        NextLiveData<KVData> nextLiveData;
        if (!TextUtils.isEmpty(str) && observer != null && (nextLiveData = this.liveDataMap.get(str)) != null) {
            nextLiveData.removeObserver(observer);
        }
        return this;
    }

    public <T> T get(String str, T t) {
        if (!this.dataStore.containsKey(str)) {
            return t;
        }
        return (T) get(this.dataStore.get(str), t);
    }

    public DataCenter observe(String str, Observer<KVData> observer, boolean z) {
        if (!TextUtils.isEmpty(str) && observer != null) {
            NextLiveData<KVData> liveData = getLiveData(str);
            LifecycleOwner lifecycleOwner = this.lifecycleOwner;
            if (lifecycleOwner != null) {
                liveData.observe(lifecycleOwner, observer, z);
            }
        }
        return this;
    }

    public DataCenter observeForever(String str, Observer<KVData> observer, boolean z) {
        if (!TextUtils.isEmpty(str) && observer != null) {
            getLiveData(str).observeForever(observer, z);
        }
        return this;
    }
}
