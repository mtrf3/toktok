package com.lynx.tasm.behavior;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class PlatformExtraBundleHolder {
    public final Map<Integer, Object> mBundleHolder = new HashMap();

    public static PlatformExtraBundleHolder generateHolder() {
        return new PlatformExtraBundleHolder();
    }

    public Object getBundle(int i) {
        return this.mBundleHolder.get(Integer.valueOf(i));
    }

    public void putBundle(int i, Object obj) {
        if (obj == null) {
            return;
        }
        this.mBundleHolder.put(Integer.valueOf(i), obj);
    }
}
