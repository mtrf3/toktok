package com.ss.android.vesdk;

import android.app.Application;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VEImageInitializer {
    public static final VEImageInitializer INSTANCE = new VEImageInitializer();
    public static ResourceFinder resourceFinder;

    public static final long createEffectResourceFinder(long j) {
        ResourceFinder resourceFinder2 = resourceFinder;
        if (resourceFinder2 != null) {
            return resourceFinder2.createNativeResourceFinder(j);
        }
        Object invoke = Class.forName("com.ss.android.medialib.VideoSdkCore").getDeclaredMethod("getNativeFinder", Long.TYPE).invoke(null, Long.valueOf(j));
        if (invoke != null) {
            return ((Long) invoke).longValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
    }

    public static final void destoryEffectResourceFinder(long j) {
        ResourceFinder resourceFinder2 = resourceFinder;
        if (resourceFinder2 != null) {
            resourceFinder = null;
            resourceFinder2.release(j);
        } else {
            Class.forName("com.ss.android.medialib.VideoSdkCore").getDeclaredMethod("releaseNativeFinder", Long.TYPE).invoke(null, Long.valueOf(j));
        }
    }

    public final void init(Application application) {
        o.LJIIIZ(application, "application");
        resourceFinder = new AssetResourceFinder(application.getAssets(), "");
    }
}
