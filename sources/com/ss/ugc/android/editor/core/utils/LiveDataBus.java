package com.ss.ugc.android.editor.core.utils;

import X.C16880lQ;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class LiveDataBus {
    public static LiveDataBus liveDataBus = new LiveDataBus();
    public Map<String, BusMutableLiveData> bus = new HashMap();

    public static LiveDataBus getInstance() {
        return liveDataBus;
    }

    /* loaded from: classes3.dex */
    public static class BusMutableLiveData<T> extends MutableLiveData<T> {
        private void hook(Observer<? super T> observer) {
            Object value;
            try {
                Field declaredField = LiveData.class.getDeclaredField("mObservers");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Method declaredMethod = obj.getClass().getDeclaredMethod("get", Object.class);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(obj, observer);
                if (invoke != null && (invoke instanceof Map.Entry) && (value = ((Map.Entry) invoke).getValue()) != null) {
                    Field declaredField2 = value.getClass().getSuperclass().getDeclaredField("mLastVersion");
                    declaredField2.setAccessible(true);
                    Field declaredField3 = LiveData.class.getDeclaredField("mVersion");
                    declaredField3.setAccessible(true);
                    declaredField2.set(value, declaredField3.get(this));
                    return;
                }
                throw new NullPointerException("observerWraper is null");
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }

        @Override // androidx.lifecycle.LiveData
        public void observe(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
            super.observe(lifecycleOwner, observer);
            hook(observer);
        }
    }

    public <T> MutableLiveData<T> with(String str, Class<T> cls) {
        if (!this.bus.containsKey(str)) {
            this.bus.put(str, new BusMutableLiveData());
        }
        return this.bus.get(str);
    }
}
