package com.ss.android.medialib;

import X.C16880lQ;
import X.P4Q;
import android.content.Context;
import android.content.res.AssetManager;
import com.bef.effectsdk.FileResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;

/* loaded from: classes12.dex */
public final class VideoSdkCore {
    public static Context APPLICATION_CONTEXT;
    public static final String TAG = C16880lQ.LJLLJ(VideoSdkCore.class);
    public static boolean inited = false;
    public static ResourceFinder sFinder = new FileResourceFinder("");

    public static native String nativeGetString(String str);

    public static native void nativeSetAssertManagerFromJava(AssetManager assetManager);

    public static native void nativeSetBoolean(String str, boolean z);

    public static native void nativeSetInt(String str, int i);

    public static native void nativeSetString(String str, String str2);

    static {
        TENativeLibsLoader.loadRecorder();
        APPLICATION_CONTEXT = null;
    }

    public static String getSdkVersionCode() {
        return nativeGetString("VersionCode");
    }

    public static String getSdkVersionName() {
        return nativeGetString("VersionName");
    }

    public static void enableEffectAudioManagerCallback(boolean z) {
        nativeSetBoolean("enableEffectAudioManagerCallback", z);
    }

    public static void enableGLES3(boolean z) {
        nativeSetBoolean("GLES3", z);
    }

    public static void enableMakeupSegmentation(boolean z) {
        nativeSetBoolean("enableMakeupSegmentation", z);
    }

    public static long getNativeFinder(long j) {
        if (j == 0) {
            P4Q.LIZJ(TAG, "getNativeFinder effectHandler is null");
            return 0L;
        }
        ResourceFinder resourceFinder = sFinder;
        if (resourceFinder == null) {
            P4Q.LIZJ(TAG, "Error call finder related interface.");
            return 0L;
        }
        return resourceFinder.createNativeResourceFinder(j);
    }

    public static void init(Context context) {
        if (!inited) {
            synchronized (VideoSdkCore.class) {
                if (!inited) {
                    APPLICATION_CONTEXT = C16880lQ.LLLLL(context);
                    nativeSetAssertManagerFromJava(context.getAssets());
                    inited = true;
                }
            }
        }
    }

    public static void releaseNativeFinder(long j) {
        if (j == 0) {
            P4Q.LIZJ(TAG, "getNativeFinder effectHandler is null");
            return;
        }
        ResourceFinder resourceFinder = sFinder;
        if (resourceFinder == null) {
            P4Q.LIZJ(TAG, "Error call finder related interface.");
        } else {
            resourceFinder.release(j);
        }
    }

    public static void setABbUseBuildinAmazing(boolean z) {
        nativeSetBoolean("ABbUseBuildinAmazing", z);
    }

    public static void setAmazingShareDir(String str) {
        nativeSetString("AmazingShareDir", str);
    }

    public static void setEffectJsonConfig(String str) {
        nativeSetString("EffectJsonConfig", str);
    }

    public static void setEffectLogLevel(int i) {
        nativeSetInt("EffectLogLevel", i);
    }

    public static void setEffectMaxMemoryCache(int i) {
        nativeSetInt("EffectMaxMemoryCache", i);
    }

    public static void setEnableAssetManager(boolean z) {
        nativeSetBoolean("AssertManagerEnable", z);
    }

    public static void setProduct(int i) {
        nativeSetInt("Product", i);
    }

    public static void setResourceFinder(ResourceFinder resourceFinder) {
        sFinder = resourceFinder;
        nativeSetBoolean("ResourceFinderEnable", true);
    }
}
