package com.ss.bytertc.base.media;

import X.C16880lQ;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes33.dex */
public class RTCSurfaceHelper {
    public ConcurrentHashMap<String, Object> mSurfaceCallbackMap = new ConcurrentHashMap<>();
    public final Object mSurfaceCallbackMapLock = new Object();
    public Long mSurfaceHelperHandle;

    public static native void nativeSetRenderTarget(long j, Surface surface, String str);

    public void destroy() {
        synchronized (this.mSurfaceCallbackMapLock) {
            Iterator<Object> it = this.mSurfaceCallbackMap.values().iterator();
            while (it.hasNext()) {
                unRegisterSurfaceCallback(it.next());
            }
            this.mSurfaceCallbackMap.clear();
        }
    }

    public static boolean checkIsOnMainThread() {
        if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
            return true;
        }
        return false;
    }

    public RTCSurfaceHelper(long j) {
        this.mSurfaceHelperHandle = 0L;
        this.mSurfaceHelperHandle = Long.valueOf(j);
    }

    private void unRegisterSurfaceCallback(Object obj) {
        if (obj instanceof RTCSurfaceTextureListener) {
            ((RTCSurfaceTextureListener) obj).resetCallback();
        } else {
            if (!(obj instanceof RTCSurfaceViewListener)) {
                return;
            }
            ((RTCSurfaceViewListener) obj).resetCallback();
        }
    }

    public void unRegisterRenderTargetView(String str) {
        synchronized (this.mSurfaceCallbackMapLock) {
            if (this.mSurfaceCallbackMap.containsKey(str)) {
                unRegisterSurfaceCallback(this.mSurfaceCallbackMap.get(str));
                this.mSurfaceCallbackMap.remove(str);
            }
        }
    }

    private Object registerSurfaceCallback(Object obj, String str) {
        if (obj instanceof SurfaceView) {
            SurfaceView surfaceView = (SurfaceView) obj;
            RTCSurfaceViewListener rTCSurfaceViewListener = new RTCSurfaceViewListener(surfaceView, this.mSurfaceHelperHandle.longValue(), str);
            surfaceView.getHolder().addCallback(rTCSurfaceViewListener);
            return rTCSurfaceViewListener;
        }
        if (obj instanceof TextureView) {
            TextureView textureView = (TextureView) obj;
            RTCSurfaceTextureListener rTCSurfaceTextureListener = new RTCSurfaceTextureListener(textureView, this.mSurfaceHelperHandle.longValue(), str);
            textureView.setSurfaceTextureListener(rTCSurfaceTextureListener);
            return rTCSurfaceTextureListener;
        }
        return null;
    }

    public void registerRenderTargetView(View view, String str) {
        synchronized (this.mSurfaceCallbackMapLock) {
            if (this.mSurfaceCallbackMap.containsKey(str)) {
                unRegisterRenderTargetView(str);
                return;
            }
            Object registerSurfaceCallback = registerSurfaceCallback(view, str);
            if (registerSurfaceCallback != null) {
                this.mSurfaceCallbackMap.put(str, registerSurfaceCallback);
            }
        }
    }
}
