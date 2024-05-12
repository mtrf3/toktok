package com.ss.bytertc.engine;

import X.ZVB;
import android.content.Context;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RtcContextUtils;
import com.bytedance.realx.video.EglBase;
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.ss.bytertc.engine.utils.TextureHelper;
import com.ss.bytertc.engine.utils.VideoFrameConverter;
import javax.microedition.khronos.egl.EGLContext;

/* loaded from: classes33.dex */
public class RtcSharedContext {
    public static String mPackageName;
    public static EglBase mRootEglBase;
    public static VideoFrameConverter mVideoFrameConverter;
    public static RTCHttpClient nativeHttpClient;

    public static synchronized EglBase getEGLContext() {
        EglBase eglBase;
        synchronized (RtcSharedContext.class) {
            eglBase = mRootEglBase;
        }
        return eglBase;
    }

    public static synchronized long getNativeEGLContext() {
        long j;
        synchronized (RtcSharedContext.class) {
            TextureHelper textureHelper = getTextureHelper();
            if (textureHelper != null) {
                j = textureHelper.getNativeEglContext();
            } else {
                EglBase eglBase = mRootEglBase;
                if (eglBase != null) {
                    j = eglBase.getEglBaseContext().getNativeEglContext();
                } else {
                    j = 0;
                }
            }
        }
        return j;
    }

    public static String getRtcPackageName() {
        String str = mPackageName;
        if (str != null) {
            return str;
        }
        return "";
    }

    public static TextureHelper getTextureHelper() {
        return mVideoFrameConverter.getTextureHelper();
    }

    public static synchronized void releaseEglContext() {
        synchronized (RtcSharedContext.class) {
            EglBase eglBase = mRootEglBase;
            if (eglBase != null) {
                eglBase.release();
                mRootEglBase = null;
            }
        }
    }

    public static Context getApplicationContext() {
        return ContextUtils.getApplicationContext();
    }

    public static VideoFrameConverter getVideoFrameConverter() {
        return mVideoFrameConverter;
    }

    public static synchronized boolean initEglContext(Object obj) {
        synchronized (RtcSharedContext.class) {
            if (obj == null) {
                mRootEglBase = ZVB.LIZ();
                return false;
            }
            if (obj instanceof EGLContext) {
                mRootEglBase = ZVB.LIZLLL((EGLContext) obj, EglBase.CONFIG_PLAIN);
            } else if (obj instanceof android.opengl.EGLContext) {
                mRootEglBase = ZVB.LJFF((android.opengl.EGLContext) obj, EglBase.CONFIG_PLAIN);
            } else if (obj instanceof EglBase) {
                mRootEglBase = ZVB.LIZJ(((EglBase) obj).getEglBaseContext(), EglBase.CONFIG_PLAIN);
            } else {
                mRootEglBase = ZVB.LIZ();
            }
            return true;
        }
    }

    public static void initialize(Context context) {
        RtcContextUtils.initialize(context);
        mPackageName = context.getPackageName();
    }

    public static synchronized void setHttpClient(RTCHttpClient rTCHttpClient) {
        synchronized (RtcSharedContext.class) {
            nativeHttpClient = rTCHttpClient;
        }
    }

    public static synchronized void setRootEglBase(EglBase eglBase) {
        synchronized (RtcSharedContext.class) {
            mRootEglBase = eglBase;
        }
    }

    public static synchronized void setVideoFrameConverter(VideoFrameConverter videoFrameConverter) {
        synchronized (RtcSharedContext.class) {
            mVideoFrameConverter = videoFrameConverter;
        }
    }

    public static void httpGetAsync(String str, int i, int i2, int i3) {
        if (nativeHttpClient == null) {
            return;
        }
        RTCEngineImpl.RtcHttpCallbackImpl rtcHttpCallbackImpl = new RTCEngineImpl.RtcHttpCallbackImpl();
        rtcHttpCallbackImpl.setCallbackId(i2);
        rtcHttpCallbackImpl.setClientId(i3);
        nativeHttpClient.GetAsync(str, rtcHttpCallbackImpl, i);
    }

    public static void httpPostAsync(String str, String str2, int i, int i2, int i3) {
        if (nativeHttpClient == null) {
            return;
        }
        RTCEngineImpl.RtcHttpCallbackImpl rtcHttpCallbackImpl = new RTCEngineImpl.RtcHttpCallbackImpl();
        rtcHttpCallbackImpl.setCallbackId(i2);
        rtcHttpCallbackImpl.setClientId(i3);
        nativeHttpClient.PostAsync(str, str2, rtcHttpCallbackImpl, i);
    }
}
