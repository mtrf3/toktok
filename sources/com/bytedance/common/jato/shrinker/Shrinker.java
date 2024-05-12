package com.bytedance.common.jato.shrinker;

import android.os.Build;

/* loaded from: classes16.dex */
public class Shrinker {
    public static Shrinker sInstance;

    public static synchronized Shrinker getInstance() {
        Shrinker shrinker;
        synchronized (Shrinker.class) {
            if (sInstance == null) {
                sInstance = new Shrinker();
            }
            shrinker = sInstance;
        }
        return shrinker;
    }

    public int doShrink() {
        return doShrink(512, 2048);
    }

    public int doShrink(int i) {
        return doShrink(i, 2048);
    }

    public int doShrinkRegion(int i) {
        if (Build.VERSION.SDK_INT >= 26 && ShrinkerNativeHolder.LIZ()) {
            return ShrinkerNativeHolder.shrinkRegionNative(i);
        }
        return 0;
    }

    public int doShrink(int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 > 23 && i3 <= 29 && ShrinkerNativeHolder.LIZ()) {
            ShrinkerNativeHolder.shrinkMallocNative(2, 16);
        }
        if (ShrinkerNativeHolder.LIZ()) {
            if (i3 < 26) {
                return ShrinkerNativeHolder.shrinkHeapNative(i);
            }
            return ShrinkerNativeHolder.shrinkRegionNative(i2);
        }
        return -1;
    }
}
