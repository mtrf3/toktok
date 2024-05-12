package com.ss.android.vesdk.runtime;

import X.C16880lQ;
import X.C36865EdR;
import X.C63856P4i;
import X.C63868P4u;
import X.C63869P4v;
import X.C63878P5e;
import X.C63943P7r;
import X.C63947P7v;
import X.C63948P7w;
import X.C63949P7x;
import X.C63950P7y;
import X.C63951P7z;
import X.EnumC36866EdS;
import X.F9J;
import X.InterfaceC63853P4f;
import X.P4Q;
import X.P6I;
import X.P80;
import X.P81;
import X.P83;
import X.P84;
import X.P85;
import X.P86;
import X.P87;
import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.EffectApplicationInfo;
import com.bef.effectsdk.EffectSDKUtils;
import com.bef.effectsdk.FileResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.ies.common.IESAppLogger;
import com.ss.android.medialib.VideoSdkCore;
import com.ss.android.ttve.editorInfo.TEEditorInfoInvoker;
import com.ss.android.ttve.monitor.ApplogUtilsInvoker;
import com.ss.android.ttve.monitor.IMonitor;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVersionUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import jp3.c;

/* loaded from: classes12.dex */
public class VERuntime {
    public P87 mAB;
    public InterfaceC63853P4f mApplogListener;
    public Context mContext;
    public boolean mEnableAudioCapture;
    public boolean mEnableGLES3;
    public boolean mEnableRefactorRecorder;
    public boolean mEnableTransitionKeyframe;
    public C63947P7v mEnv;
    public P81 mExceptionMonitorListener;
    public boolean mIsInited;
    public VESize mMaxRenderSize;
    public IMonitor mMoniter;
    public C63878P5e mResManager;
    public C36865EdR mSP;
    public int mTransitionFrameCount;
    public int mTransitionKeyFrameMode;
    public int mTransitionKeyFrameVersion;
    public boolean mUseAssetManager;
    public boolean mUseResourceFinder;
    public WeakReference<P83> mVEApplogListener;
    public P85 mVEExceptionMonitorListener;
    public WeakReference<P84> mVEMonitorListener;

    public static native void nativeClearAllFreeMemoryCache(int i);

    public static native void nativeEnableAudioSDKApiV2(boolean z);

    public static native void nativeEnableCrossPlatGLBaseFBO(boolean z);

    public static native void nativeEnableEditorHdr2Sdr(boolean z);

    private native void nativeEnableHDByteVC1HWDecoder(boolean z, int i);

    private native void nativeEnableHDH264HWDecoder(boolean z, int i);

    private native void nativeEnableHDMpeg24VP89HWDecoder(boolean z);

    private native void nativeEnableHighFpsByteVC1HWDecoder(boolean z, int i, int i2);

    private native void nativeEnableHighFpsH264HWDecoder(boolean z, int i, int i2);

    public static native void nativeEnableImport10BitByteVC1Video(boolean z);

    public static native void nativeEnableRenderLib(boolean z);

    public static native void nativeEnableRenderLibFBOOpt(boolean z);

    private native void nativeEnableTTByteVC1Decoder(boolean z);

    public static native void nativeEnableTitanReleaseGPUResource(boolean z);

    public static native void nativeEnableTransitionKeyFrame(boolean z);

    private native long nativeGetNativeContext();

    public static native double nativeGetVirtualMemInfo();

    public static native boolean nativeIsArm64();

    public static native void nativeSetNativeLibraryDir(String str);

    public static native void nativeSetPageModeByteVC1CodecConfig(int i, int i2, int i3);

    public static native void nativeSetPageModeH264CodecConfig(int i, int i2, int i3);

    public static native void nativeSetTransitionFrameCount(int i);

    public static native void nativeSetTransitionKeyFrameMode(int i);

    public static native void nativeSetTransitionKeyFrameVersion(int i);

    public void enableNewRecorder(boolean z) {
    }

    public boolean isEnableNewRecorder() {
        return true;
    }

    public static VERuntime getInstance() {
        return P6I.LJLILLLLZI.LJLIL;
    }

    private void initConfig() {
        Context context = this.mContext;
        if (context != null) {
            nativeSetNativeLibraryDir(context.getApplicationInfo().nativeLibraryDir);
        }
        new C63869P4v(this).start();
    }

    public P87 getAB() {
        if (this.mAB == null) {
            this.mAB = new P87();
        }
        return this.mAB;
    }

    public AssetManager getAssetManager() {
        if (!this.mUseAssetManager) {
            P4Q.LIZJ("VERuntime", "disable use AssetManager!");
        }
        Context context = this.mContext;
        if (context == null) {
            P4Q.LIZJ("VERuntime", "context is null!");
            return null;
        }
        return context.getAssets();
    }

    public boolean isEnableAudioCapture() {
        if (this.mEnableAudioCapture || ((Boolean) VEConfigCenter.getInstance().getValue("ve_enable_lv_audio_graph_refactor").getValue()).booleanValue()) {
            return true;
        }
        return false;
    }

    public int needUpdateEffectModelFiles() {
        C63947P7v c63947P7v = this.mEnv;
        if (c63947P7v == null || TextUtils.isEmpty(c63947P7v.LIZ)) {
            return -108;
        }
        if (this.mUseResourceFinder) {
            P4Q.LJII("VERuntime", "Use resource finder. Do not need update effect model files!");
            return -1;
        }
        if (this.mUseAssetManager) {
            P4Q.LJII("VERuntime", "Enable assetManager. Do not need update effect model files!");
            return -1;
        }
        if (EffectSDKUtils.needUpdate(this.mContext, this.mEnv.LIZ())) {
            return 0;
        }
        VEEffectConfig.configEffect(this.mEnv.LIZ(), "nexus");
        return -1;
    }

    public void sensorReport() {
        new C63943P7r(this).start();
    }

    public int updateEffectModelFiles() {
        C63947P7v c63947P7v = this.mEnv;
        if (c63947P7v == null || TextUtils.isEmpty(c63947P7v.LIZ)) {
            return -108;
        }
        File file = new File(this.mEnv.LIZ, "models");
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            String absolutePath = file.getAbsolutePath();
            EffectSDKUtils.flushAlgorithmModelFiles(this.mContext, absolutePath);
            this.mEnv.LIZIZ = absolutePath;
            EnumC36866EdS.LJLILLLLZI.LJLIL.LIZIZ("vesdk_models_dir_sp_key", true, absolutePath);
            setEffectResourceFinder(new FileResourceFinder(absolutePath));
            return 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public VERuntime() {
        this.mTransitionKeyFrameVersion = -1;
        this.mTransitionFrameCount = 1;
        this.mMaxRenderSize = new VESize(0, 0);
        this.mIsInited = false;
        this.mMoniter = new C63949P7x(this);
        this.mApplogListener = new P80(this);
        this.mExceptionMonitorListener = new C63950P7y(this);
    }

    public static double getVirtualMemInfo() {
        return nativeGetVirtualMemInfo();
    }

    public static boolean isArm64() {
        return nativeIsArm64();
    }

    public long getNativeContext() {
        return nativeGetNativeContext();
    }

    public Context getContext() {
        return this.mContext;
    }

    public C63947P7v getEnv() {
        return this.mEnv;
    }

    public VESize getMaxRenderSize() {
        return this.mMaxRenderSize;
    }

    public C63878P5e getResManager() {
        return this.mResManager;
    }

    public int getTransitionFrameCount() {
        return this.mTransitionFrameCount;
    }

    public int getTransitionKeyFrameMode() {
        return this.mTransitionKeyFrameMode;
    }

    public int getTransitionKeyFrameVersion() {
        return this.mTransitionKeyFrameVersion;
    }

    public boolean isEnableRefactorRecorder() {
        return this.mEnableRefactorRecorder;
    }

    public boolean isGLES3Enabled() {
        return this.mEnableGLES3;
    }

    public boolean isTransitionKeyFrameEnable() {
        return this.mEnableTransitionKeyframe;
    }

    public boolean isUseAssetManager() {
        return this.mUseAssetManager;
    }

    public /* synthetic */ VERuntime(C63949P7x c63949P7x) {
        this();
    }

    public static void clearAllFreeMemoryCache(int i) {
        nativeClearAllFreeMemoryCache(i);
    }

    public static void enableAudioSDKApiV2(boolean z) {
        nativeEnableAudioSDKApiV2(z);
    }

    public static void enableCrossPlatGLBaseFBO(boolean z) {
        nativeEnableCrossPlatGLBaseFBO(z);
    }

    public static void enableEffectAudioManagerCallback(boolean z) {
        VideoSdkCore.enableEffectAudioManagerCallback(z);
        VEEffectConfig.nativeEnableEffectAudioManagerCallback(z);
    }

    public static void enableMakeupSegmentation(boolean z) {
        VideoSdkCore.enableMakeupSegmentation(z);
        VEEffectConfig.nativeEnableMakeupSegmentation(z);
    }

    public static void enableRenderLib(boolean z) {
        nativeEnableRenderLib(z);
    }

    public static void enableRenderLibFBOOpt(boolean z) {
        nativeEnableRenderLibFBOOpt(z);
    }

    private void setContextToEffect(Context context) {
        EffectApplicationInfo.setAppContext(context);
    }

    public void enableAudioCapture(boolean z) {
        this.mEnableAudioCapture = z;
    }

    public int enableByteVC1Decoder(boolean z) {
        if (!this.mIsInited) {
            P4Q.LIZJ("VERuntime", "runtime not init");
            return -108;
        }
        nativeEnableTTByteVC1Decoder(z);
        return 0;
    }

    public int enableEditorHdr2Sdr(boolean z) {
        if (!this.mIsInited) {
            P4Q.LIZJ("VERuntime", "runtime not init");
            return -108;
        }
        nativeEnableEditorHdr2Sdr(z);
        return 0;
    }

    public void enableEffectRT(boolean z) {
        VEEffectConfig.enableEffectRT(z);
    }

    public void enableGLES3(boolean z) {
        this.mEnableGLES3 = z;
    }

    public int enableHDMpeg24VP89HWDecoder(boolean z) {
        if (!this.mIsInited) {
            P4Q.LIZJ("VERuntime", "runtime not init");
            return -108;
        }
        nativeEnableHDMpeg24VP89HWDecoder(z);
        return 0;
    }

    public int enableImport10BitByteVC1Video(boolean z) {
        if (!this.mIsInited) {
            P4Q.LIZJ("VERuntime", "runtime not init");
            return -108;
        }
        nativeEnableImport10BitByteVC1Video(z);
        return 0;
    }

    public void enableRefactorRecorder(boolean z) {
        this.mEnableRefactorRecorder = z;
    }

    public int enableTransitionKeyframe(boolean z) {
        if (!this.mIsInited) {
            P4Q.LIZJ("VERuntime", "runtime not init");
            return -108;
        }
        nativeEnableTransitionKeyFrame(z);
        this.mEnableTransitionKeyframe = z;
        return 0;
    }

    public void registerApplog(P83 p832) {
        this.mVEApplogListener = new WeakReference<>(p832);
        InterfaceC63853P4f interfaceC63853P4f = this.mApplogListener;
        synchronized (c.class) {
            IESAppLogger.sharedInstance().setAppLogCallback("", new C63948P7w(interfaceC63853P4f), true);
        }
    }

    public void registerExceptionMonitor(P85 p85) {
        WeakReference<P81> weakReference;
        this.mVEExceptionMonitorListener = p85;
        P81 p81 = this.mExceptionMonitorListener;
        if (p81 == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(p81);
        }
        C63951P7z.LIZ = weakReference;
    }

    public void registerMonitor(P84 p84) {
        this.mVEMonitorListener = new WeakReference<>(p84);
        C63868P4u.LIZ = new WeakReference<>(this.mMoniter);
    }

    public void setAB(P87 p87) {
        this.mAB = p87;
    }

    public boolean setABbUseBuildinAmazing(boolean z) {
        VideoSdkCore.setABbUseBuildinAmazing(z);
        VEEffectConfig.setABbUseBuildinAmazing(z);
        return true;
    }

    public boolean setAssetManagerEnable(boolean z) {
        this.mUseAssetManager = z;
        VideoSdkCore.setEnableAssetManager(z);
        if (this.mUseAssetManager) {
            Context context = this.mContext;
            if (context != null) {
                setEffectResourceFinder(new AssetResourceFinder(context.getAssets(), ""));
                return true;
            }
            P4Q.LIZ("VERuntime", "mContext is null!!! need init");
            return false;
        }
        return true;
    }

    public boolean setEffectAmazingShareDir(String str) {
        VideoSdkCore.setAmazingShareDir(str);
        VEEffectConfig.setShareDir(str);
        return true;
    }

    public int setEffectAsynAPI(boolean z) {
        if (this.mEnv == null) {
            return -108;
        }
        VEEffectConfig.nativeSetEffectAsynAPI(z);
        return 0;
    }

    public int setEffectForceDetectFace(boolean z) {
        if (this.mEnv == null) {
            return -108;
        }
        VEEffectConfig.nativeSetEffectForceDetectFace(z);
        return 0;
    }

    public boolean setEffectJsonConfig(String str) {
        VideoSdkCore.setEffectJsonConfig(str);
        VEEffectConfig.setEffectJsonConfig(str);
        return true;
    }

    public boolean setEffectLogLevel(int i) {
        VideoSdkCore.setEffectLogLevel(i);
        VEEffectConfig.setEffectLogLevel(i);
        return true;
    }

    public boolean setEffectMaxMemoryCache(int i) {
        VideoSdkCore.setEffectMaxMemoryCache(i);
        VEEffectConfig.setEffectMaxMemoryCache(i);
        return true;
    }

    public boolean setEffectResourceFinder(ResourceFinder resourceFinder) {
        VideoSdkCore.setResourceFinder(resourceFinder);
        VEEffectConfig.setResourceFinder(resourceFinder);
        this.mUseAssetManager = false;
        this.mUseResourceFinder = true;
        VEEffectConfig.configEffect("", "nexus");
        return true;
    }

    public int setEffectSyncTimeDomain(boolean z) {
        if (this.mEnv == null) {
            return -108;
        }
        VEEffectConfig.nativeSetEffectSyncTimeDomain(z);
        return 0;
    }

    public int setEnableStickerAmazing(boolean z) {
        if (this.mEnv == null) {
            return -108;
        }
        VEEffectConfig.nativeSetEnableStickerAmazing(z);
        return 0;
    }

    public int setEnableStickerReleaseTexture(boolean z) {
        if (this.mEnv == null) {
            return -108;
        }
        VEEffectConfig.nativesetEnableStickerReleaseTexture(z);
        return 0;
    }

    public void setEnv(C63947P7v c63947P7v) {
        this.mEnv = c63947P7v;
    }

    public int setTransitionFrameCount(int i) {
        if (!this.mIsInited) {
            P4Q.LIZJ("VERuntime", "runtime not init");
            return -108;
        }
        nativeSetTransitionFrameCount(i);
        this.mTransitionFrameCount = i;
        return 0;
    }

    public int setTransitionKeyFrameMode(int i) {
        if (!this.mIsInited) {
            P4Q.LIZJ("VERuntime", "runtime not init");
            return -108;
        }
        nativeSetTransitionKeyFrameMode(i);
        this.mTransitionKeyFrameMode = i;
        return 0;
    }

    public int setTransitionKeyFrameVersion(int i) {
        if (!this.mIsInited) {
            P4Q.LIZJ("VERuntime", "runtime not init");
            return -108;
        }
        nativeSetTransitionKeyFrameVersion(i);
        this.mTransitionKeyFrameVersion = i;
        return 0;
    }

    public void setUseNewEffectAlgorithmApi(boolean z) {
        VEEffectConfig.nativeUseNewEffectAlgorithmApi(z);
    }

    public void enableAlgoParamIsForce(boolean z, boolean z2) {
        VEEffectConfig.nativeEnableAlgoParamisForce(z, z2);
    }

    public int enableHDByteVC1HWDecoder(boolean z, int i) {
        if (!this.mIsInited) {
            P4Q.LIZJ("VERuntime", "runtime not init");
            return -108;
        }
        if (i <= 720) {
            i = 730;
        }
        nativeEnableHDByteVC1HWDecoder(z, i);
        return 0;
    }

    public int enableHDH264HWDecoder(boolean z, int i) {
        if (!this.mIsInited) {
            P4Q.LIZJ("VERuntime", "runtime not init");
            return -108;
        }
        if (i <= 320) {
            i = 330;
        }
        nativeEnableHDH264HWDecoder(z, i);
        return 0;
    }

    public void init(Context context, String str) {
        if (this.mIsInited) {
            return;
        }
        this.mIsInited = true;
        this.mContext = context;
        VEEffectConfig.setCacheDir(C16880lQ.LLIIIL(context).getAbsolutePath());
        TENativeLibsLoader.setContext(context);
        C63947P7v c63947P7v = new C63947P7v();
        this.mEnv = c63947P7v;
        c63947P7v.LIZ = str;
        this.mAB = new P87();
        this.mResManager = new C63878P5e(getInstance().getEnv().LIZ);
        C36865EdR c36865EdR = EnumC36866EdS.LJLILLLLZI.LJLIL;
        this.mSP = c36865EdR;
        synchronized (c36865EdR) {
            if (!c36865EdR.LIZ) {
                c36865EdR.LIZIZ = F9J.LIZIZ(context, 0, context.getPackageName());
                c36865EdR.LIZ = true;
            }
        }
        C63868P4u.LIZ(this.mContext, (String) this.mSP.LIZ("KEY_DEVICEID", ""));
        ApplogUtilsInvoker.nativeInit(VEVersionUtil.getVESDKVersion());
        TEEditorInfoInvoker.nativeInit();
        C63856P4i.LIZIZ = new ConcurrentHashMap<>();
        VideoSdkCore.init(context);
        initConfig();
        EffectApplicationInfo.setAppContext(context);
    }

    public void setMaxRenderSize(int i, int i2) {
        VESize vESize = this.mMaxRenderSize;
        vESize.width = i;
        vESize.height = i2;
    }

    public int setPageModeCodecConfig(P86 p86, P86 p862) {
        if (!this.mIsInited) {
            P4Q.LIZJ("VERuntime", "runtime not init");
            return -108;
        }
        if (p86 != null) {
            nativeSetPageModeH264CodecConfig(p86.LIZ, p86.LIZIZ, p86.LIZJ);
        }
        if (p862 != null) {
            nativeSetPageModeByteVC1CodecConfig(p862.LIZ, p862.LIZIZ, p862.LIZJ);
            return 0;
        }
        return 0;
    }

    public void init(Context context, C63947P7v c63947P7v) {
        if (this.mIsInited) {
            return;
        }
        this.mContext = context;
        VEEffectConfig.setCacheDir(C16880lQ.LLIIIL(context).getAbsolutePath());
        this.mEnv = c63947P7v;
        this.mAB = new P87();
        TENativeLibsLoader.setContext(context);
        this.mResManager = new C63878P5e(getInstance().getEnv().LIZ);
        C36865EdR c36865EdR = EnumC36866EdS.LJLILLLLZI.LJLIL;
        this.mSP = c36865EdR;
        synchronized (c36865EdR) {
            if (!c36865EdR.LIZ) {
                c36865EdR.LIZIZ = F9J.LIZIZ(context, 0, context.getPackageName());
                c36865EdR.LIZ = true;
            }
        }
        C63868P4u.LIZ(this.mContext, (String) this.mSP.LIZ("KEY_DEVICEID", ""));
        TEEditorInfoInvoker.nativeInit();
        C63856P4i.LIZIZ = new ConcurrentHashMap<>();
        VideoSdkCore.init(context);
        initConfig();
    }

    public int enableHighFpsByteVC1HWDecoder(boolean z, int i, int i2) {
        if (!this.mIsInited) {
            P4Q.LIZJ("VERuntime", "runtime not init");
            return -108;
        }
        nativeEnableHighFpsByteVC1HWDecoder(z, i, i2);
        return 0;
    }

    public int enableHighFpsH264HWDecoder(boolean z, int i, int i2) {
        if (!this.mIsInited) {
            P4Q.LIZJ("VERuntime", "runtime not init");
            return -108;
        }
        nativeEnableHighFpsH264HWDecoder(z, i, i2);
        return 0;
    }
}
