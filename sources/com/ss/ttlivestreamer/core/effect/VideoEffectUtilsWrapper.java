package com.ss.ttlivestreamer.core.effect;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import X.X1D;
import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.EarlyAVLog;
import com.ss.ttlivestreamer.core.utils.LogUtil;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public class VideoEffectUtilsWrapper {
    public static final Object[] NO_ARGS = new Object[0];
    public static VideoEffectUtilsWrapper mVideoEffectUtilsWrapper;
    public Class<?> mEffectSdk;
    public final List<ListenerHandler> mListenerHandlerList;
    public Class<?> mMessageCenter;
    public Class<?> mMessageCenterListener;
    public Method mMethodEffectSdkFlushAlgorithmModelFiles;
    public Method mMethodMessageCenterAddListener;
    public Method mMethodMessageCenterRemoveListener;
    public Class<?> mResourceFinder;
    public Method mResourceFinderCreateNativeFinder;
    public Method mResourceFinderRelease;

    /* loaded from: classes12.dex */
    public class ListenerHandler implements InvocationHandler {
        public WeakReference<Object> mEffectListener;
        public IVideoEffectProcessor.EffectMsgListener mEffectMsgListener;

        public Object getEffectListener() {
            return this.mEffectListener.get();
        }

        public boolean sameEffectMsgListener(IVideoEffectProcessor.EffectMsgListener effectMsgListener) {
            if (effectMsgListener == this.mEffectMsgListener) {
                return true;
            }
            return false;
        }

        public void setEffectListener(WeakReference<Object> weakReference) {
            this.mEffectListener = weakReference;
        }

        public ListenerHandler(IVideoEffectProcessor.EffectMsgListener effectMsgListener) {
            this.mEffectMsgListener = effectMsgListener;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String str;
            boolean z = true;
            if (method.getName().equals("onMessageReceived")) {
                if (LogUtil.logFilterSwitch()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("invoke method:");
                    LIZ.append(method);
                    LIZ.append(" args ");
                    LIZ.append(objArr.length);
                    LIZ.append(" listener ");
                    LIZ.append(this.mEffectMsgListener);
                    AVLog.d("VideoEffectUtilsWrapper", X1D.LIZIZ(LIZ));
                }
                int intValue = ((Integer) objArr[0]).intValue();
                int intValue2 = ((Integer) objArr[1]).intValue();
                int intValue3 = ((Integer) objArr[2]).intValue();
                Object obj2 = objArr[3];
                if (obj2 == null) {
                    str = "";
                } else {
                    str = (String) obj2;
                }
                IVideoEffectProcessor.EffectMsgListener effectMsgListener = this.mEffectMsgListener;
                if (effectMsgListener != null) {
                    effectMsgListener.onMessageReceived(intValue, intValue2, intValue3, str);
                }
                return obj;
            }
            if (objArr == null) {
                objArr = VideoEffectUtilsWrapper.NO_ARGS;
            }
            if (objArr.length == 0 && method.getName().equals("hashCode")) {
                return Integer.valueOf(hashCode());
            }
            if (objArr.length == 1 && method.getName().equals("equals") && method.getParameterTypes()[0] == Object.class) {
                Object obj3 = objArr[0];
                if (obj3 == null) {
                    return Boolean.FALSE;
                }
                if (obj == obj3) {
                    return Boolean.TRUE;
                }
                if (!VideoEffectUtilsWrapper.isProxyOfSameInterfaces(obj3, obj.getClass()) || !equals(Proxy.getInvocationHandler(obj3))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            if (objArr.length == 0 && method.getName().equals("toString")) {
                return toString();
            }
            return obj;
        }
    }

    public static Object com_ss_ttlivestreamer_core_effect_VideoEffectUtilsWrapper_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "1641357100785398539"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public static List<String> getEffectLibs() {
        try {
            return (List) Class.forName("com.bef.effectsdk.EffectSDKBuildConfig").getMethod("getEffectLibs", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable th) {
            EarlyAVLog.println(6, "VideoEffectUtilsWrapper", Log.getStackTraceString(th), th);
            return null;
        }
    }

    public VideoEffectUtilsWrapper() {
        MediaEngineFactory.nativeGetVersion();
        this.mListenerHandlerList = new ArrayList();
        boolean z = false;
        try {
            this.mMessageCenter = Class.forName("com.bef.effectsdk.message.MessageCenter");
            Class<?> cls = Class.forName("com.bef.effectsdk.AssetResourceFinder");
            this.mResourceFinder = cls;
            Class<?> cls2 = Long.TYPE;
            this.mResourceFinderCreateNativeFinder = cls.getMethod("createNativeResourceFinder", cls2);
            this.mResourceFinderRelease = this.mResourceFinder.getMethod("release", cls2);
            this.mEffectSdk = Class.forName("com.bef.effectsdk.EffectSDKUtils");
            Class<?> cls3 = Class.forName("com.bef.effectsdk.message.MessageCenter$Listener");
            this.mMessageCenterListener = cls3;
            this.mMethodMessageCenterAddListener = this.mMessageCenter.getMethod("addListener", cls3);
            this.mMethodMessageCenterRemoveListener = this.mMessageCenter.getMethod("removeListener", this.mMessageCenterListener);
            this.mMethodEffectSdkFlushAlgorithmModelFiles = this.mEffectSdk.getMethod("flushAlgorithmModelFiles", Context.class, String.class);
            z = true;
        } catch (ClassNotFoundException e) {
            AVLog.ioe("VideoEffectUtilsWrapper", Log.getStackTraceString(e));
        } catch (NoSuchMethodException e2) {
            AVLog.ioe("VideoEffectUtilsWrapper", Log.getStackTraceString(e2));
        }
        AVLog.ioi("VideoEffectUtilsWrapper", "Init EffectSDK class " + z);
        if (!z) {
            this.mMessageCenter = null;
            this.mResourceFinder = null;
            this.mEffectSdk = null;
            this.mMethodMessageCenterRemoveListener = null;
            this.mMethodMessageCenterAddListener = null;
            this.mMessageCenterListener = null;
            this.mMethodEffectSdkFlushAlgorithmModelFiles = null;
        }
    }

    public static VideoEffectUtilsWrapper get() {
        if (mVideoEffectUtilsWrapper == null) {
            synchronized (VideoEffectUtilsWrapper.class) {
                if (mVideoEffectUtilsWrapper == null) {
                    mVideoEffectUtilsWrapper = new VideoEffectUtilsWrapper();
                }
            }
        }
        return mVideoEffectUtilsWrapper;
    }

    private boolean onHaveEffect() {
        if (this.mEffectSdk != null && this.mMethodEffectSdkFlushAlgorithmModelFiles != null) {
            return true;
        }
        return false;
    }

    public static boolean haveEffect() {
        return get().onHaveEffect();
    }

    private synchronized void addListener(IVideoEffectProcessor.EffectMsgListener effectMsgListener) {
        ListenerHandler listenerHandler;
        Object newProxyInstance;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Add listener: ");
        LIZ.append(effectMsgListener);
        AVLog.iod("VideoEffectUtilsWrapper", X1D.LIZIZ(LIZ));
        if (findListener(effectMsgListener) != null) {
            AVLog.w("VideoEffectUtilsWrapper", "Already exist listener");
            return;
        }
        if (this.mMethodMessageCenterAddListener != null && effectMsgListener != null && (newProxyInstance = Proxy.newProxyInstance(VideoEffectUtilsWrapper.class.getClassLoader(), new Class[]{this.mMessageCenterListener}, (listenerHandler = new ListenerHandler(effectMsgListener)))) != null) {
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Add listener ");
                LIZ2.append(newProxyInstance);
                AVLog.ioi("VideoEffectUtilsWrapper", X1D.LIZIZ(LIZ2));
                com_ss_ttlivestreamer_core_effect_VideoEffectUtilsWrapper_java_lang_reflect_Method_invoke(this.mMethodMessageCenterAddListener, null, new Object[]{newProxyInstance});
                listenerHandler.setEffectListener(new WeakReference<>(newProxyInstance));
                synchronized (this.mListenerHandlerList) {
                    this.mListenerHandlerList.add(listenerHandler);
                }
            } catch (Throwable th) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("AddListener failed ");
                LIZ3.append(Log.getStackTraceString(th));
                AVLog.ioe("VideoEffectUtilsWrapper", X1D.LIZIZ(LIZ3));
            }
        }
    }

    public static void addMessageCenterListener(IVideoEffectProcessor.EffectMsgListener effectMsgListener) {
        get().addListener(effectMsgListener);
    }

    private ListenerHandler findListener(IVideoEffectProcessor.EffectMsgListener effectMsgListener) {
        synchronized (this.mListenerHandlerList) {
            for (ListenerHandler listenerHandler : this.mListenerHandlerList) {
                if (listenerHandler.sameEffectMsgListener(effectMsgListener)) {
                    return listenerHandler;
                }
            }
            return null;
        }
    }

    private ListenerHandler popListener(IVideoEffectProcessor.EffectMsgListener effectMsgListener) {
        ListenerHandler findListener = findListener(effectMsgListener);
        if (findListener != null) {
            synchronized (this.mListenerHandlerList) {
                this.mListenerHandlerList.remove(findListener);
            }
        }
        return findListener;
    }

    private synchronized void removeListener(IVideoEffectProcessor.EffectMsgListener effectMsgListener) {
        ListenerHandler popListener;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Remove listener: ");
        LIZ.append(effectMsgListener);
        AVLog.ioi("VideoEffectUtilsWrapper", X1D.LIZIZ(LIZ));
        if (this.mMethodMessageCenterRemoveListener != null && (popListener = popListener(effectMsgListener)) != null) {
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Remove listener ");
                LIZ2.append(popListener.getEffectListener());
                AVLog.ioi("VideoEffectUtilsWrapper", X1D.LIZIZ(LIZ2));
                com_ss_ttlivestreamer_core_effect_VideoEffectUtilsWrapper_java_lang_reflect_Method_invoke(this.mMethodMessageCenterRemoveListener, null, new Object[]{popListener.getEffectListener()});
                popListener.setEffectListener(null);
            } catch (Throwable th) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("RemoveListener failed ");
                LIZ3.append(Log.getStackTraceString(th));
                AVLog.ioi("VideoEffectUtilsWrapper", X1D.LIZIZ(LIZ3));
            }
        }
    }

    public static void removeMessageCenterListener(IVideoEffectProcessor.EffectMsgListener effectMsgListener) {
        get().removeListener(effectMsgListener);
    }

    public static long createNativeResourceFinder(Object obj, long j) {
        if (obj != null && get().mResourceFinderCreateNativeFinder != null) {
            try {
                Object com_ss_ttlivestreamer_core_effect_VideoEffectUtilsWrapper_java_lang_reflect_Method_invoke = com_ss_ttlivestreamer_core_effect_VideoEffectUtilsWrapper_java_lang_reflect_Method_invoke(get().mResourceFinderCreateNativeFinder, obj, new Object[]{Long.valueOf(j)});
                if (com_ss_ttlivestreamer_core_effect_VideoEffectUtilsWrapper_java_lang_reflect_Method_invoke instanceof Long) {
                    return ((Long) com_ss_ttlivestreamer_core_effect_VideoEffectUtilsWrapper_java_lang_reflect_Method_invoke).longValue();
                }
            } catch (Throwable th) {
                AVLog.ioe("VideoEffectUtilsWrapper", Log.getStackTraceString(th));
            }
        }
        return 0L;
    }

    public static Object createResourceFinder(AssetManager assetManager, String str) {
        return get().onCreateResourceFinder(assetManager, str);
    }

    public static void flushAlgorithmModelFiles(Context context, String str) {
        get().onFlushAlgorithmModelFiles(context, str);
    }

    public static boolean isProxyOfSameInterfaces(Object obj, Class<?> cls) {
        if (cls.isInstance(obj) || (Proxy.isProxyClass(obj.getClass()) && Arrays.equals(obj.getClass().getInterfaces(), cls.getInterfaces()))) {
            return true;
        }
        return false;
    }

    private Object onCreateResourceFinder(AssetManager assetManager, String str) {
        Throwable th;
        Class<?> cls = this.mResourceFinder;
        if (cls != null && assetManager != null) {
            try {
                return cls.getConstructor(AssetManager.class, String.class).newInstance(assetManager, str);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
        }
        if (th != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Create effectsdk resourcefinder failed ");
            LIZ.append(Log.getStackTraceString(th));
            AVLog.ioe("VideoEffectUtilsWrapper", X1D.LIZIZ(LIZ));
        }
        return null;
    }

    private void onFlushAlgorithmModelFiles(Context context, String str) {
        Method method;
        if (context != null && (method = this.mMethodEffectSdkFlushAlgorithmModelFiles) != null) {
            try {
                com_ss_ttlivestreamer_core_effect_VideoEffectUtilsWrapper_java_lang_reflect_Method_invoke(method, null, new Object[]{context, str});
            } catch (Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onFlushAlgorithmModelFiles failed ctx ");
                LIZ.append(context);
                LIZ.append(" path ");
                LIZ.append(str);
                LIZ.append(" cause:");
                LIZ.append(Log.getStackTraceString(th));
                AVLog.ioe("VideoEffectUtilsWrapper", X1D.LIZIZ(LIZ));
            }
        }
    }

    public static void releaseFinder(Object obj, long j) {
        if (obj == null || get().mResourceFinderRelease == null) {
            return;
        }
        try {
            com_ss_ttlivestreamer_core_effect_VideoEffectUtilsWrapper_java_lang_reflect_Method_invoke(get().mResourceFinderRelease, obj, new Object[]{Long.valueOf(j)});
        } catch (Throwable th) {
            AVLog.ioe("VideoEffectUtilsWrapper", Log.getStackTraceString(th));
        }
    }
}
