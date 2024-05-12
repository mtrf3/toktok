package com.facebook.common.references;

import X.C32151Nz;
import X.C81394Vx0;
import X.VWQ;
import X.W58;
import java.util.IdentityHashMap;
import java.util.Map;

/* loaded from: classes15.dex */
public class SharedReference<T> {
    public static final Map<Object, Integer> sLiveObjects = new IdentityHashMap();
    public int mRefCount;
    public final VWQ<T> mResourceReleaser;
    public T mValue;

    public synchronized void addReference() {
        ensureValid();
        this.mRefCount++;
    }

    public synchronized int decreaseRefCount() {
        boolean z;
        int i;
        ensureValid();
        if (this.mRefCount > 0) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        i = this.mRefCount - 1;
        this.mRefCount = i;
        return i;
    }

    public synchronized T get() {
        return this.mValue;
    }

    public synchronized int getRefCountTestOnly() {
        return this.mRefCount;
    }

    public synchronized boolean isValid() {
        boolean z;
        if (this.mRefCount <= 0) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    private void ensureValid() {
        if (isValid(this)) {
        } else {
            throw new C81394Vx0();
        }
    }

    public void deleteReference() {
        T t;
        if (decreaseRefCount() == 0) {
            synchronized (this) {
                t = this.mValue;
                this.mValue = null;
            }
            this.mResourceReleaser.LIZ(t);
            removeLiveReference(t);
        }
    }

    public static Map<Object, Integer> getLiveObjects() {
        return sLiveObjects;
    }

    public int getRefCount() {
        return this.mRefCount;
    }

    public static void addLiveReference(Object obj) {
        Map<Object, Integer> map = sLiveObjects;
        synchronized (map) {
            Integer num = map.get(obj);
            if (num == null) {
                map.put(obj, 1);
            } else {
                map.put(obj, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    public static boolean isValid(SharedReference<?> sharedReference) {
        if (sharedReference != null && sharedReference.isValid()) {
            return true;
        }
        return false;
    }

    public static void removeLiveReference(Object obj) {
        Map<Object, Integer> map = sLiveObjects;
        synchronized (map) {
            Integer num = map.get(obj);
            if (num == null) {
                W58.LJIJI("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
            } else if (num.intValue() == 1) {
                map.remove(obj);
            } else {
                map.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    public SharedReference(T t, VWQ<T> vwq) {
        t.getClass();
        this.mValue = t;
        vwq.getClass();
        this.mResourceReleaser = vwq;
        this.mRefCount = 1;
        addLiveReference(t);
    }
}
