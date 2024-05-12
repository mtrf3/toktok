package com.byted.cast.sdk;

import android.opengl.GLSurfaceView;
import com.byted.cast.engine.VoipVideoRender;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* loaded from: classes29.dex */
public final class RTCVideoRender extends VoipVideoRender {

    /* loaded from: classes29.dex */
    public interface StatusListener {
        void onVideoSimulcasted(int i);

        void onVideoStatusChanged(boolean z);
    }

    @Override // com.byted.cast.engine.VoipVideoRender
    public boolean clearSource() {
        return super.clearSource();
    }

    @Override // com.byted.cast.engine.VoipVideoRender
    public RTCMediaKind getMediaKind() {
        return super.getMediaKind();
    }

    @Override // com.byted.cast.engine.VoipVideoRender
    public String getUserId() {
        return super.getUserId();
    }

    @Override // com.byted.cast.engine.VoipVideoRender
    public boolean isSetSource() {
        return super.isSetSource();
    }

    @Override // com.byted.cast.engine.VoipVideoRender
    public boolean isSubscribed() {
        return super.isSubscribed();
    }

    @Override // com.byted.cast.engine.VoipVideoRender
    public boolean subscribe() {
        return super.subscribe();
    }

    @Override // com.byted.cast.engine.VoipVideoRender
    public boolean unsubscribe() {
        return super.unsubscribe();
    }

    /* loaded from: classes29.dex */
    public static class ContextFactory implements GLSurfaceView.EGLContextFactory {
        public static int EGL_CONTEXT_CLIENT_VERSION = 12440;

        public ContextFactory() {
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{EGL_CONTEXT_CLIENT_VERSION, 2, 12344});
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            egl10.eglDestroyContext(eGLDisplay, eGLContext);
        }
    }

    public RTCVideoRender(GLSurfaceView gLSurfaceView, String str) {
        super(gLSurfaceView, str);
        gLSurfaceView.setEGLContextFactory(new ContextFactory());
        gLSurfaceView.setEGLContextClientVersion(2);
        gLSurfaceView.setRenderer(this);
        gLSurfaceView.setRenderMode(0);
    }

    @Override // com.byted.cast.engine.VoipVideoRender
    public boolean setSource(String str, RTCMediaKind rTCMediaKind, StatusListener statusListener) {
        return super.setSource(str, rTCMediaKind, statusListener);
    }
}
