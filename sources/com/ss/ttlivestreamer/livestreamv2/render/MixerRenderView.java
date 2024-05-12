package com.ss.ttlivestreamer.livestreamv2.render;

import X.X1D;
import android.view.View;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.RenderView;
import java.lang.ref.WeakReference;

/* loaded from: classes12.dex */
public class MixerRenderView extends RenderView {
    public Object mFence;
    public boolean mUpdated;
    public WeakReference<DirectVideoMixer> mVideoMixer;

    @Override // com.ss.ttlivestreamer.livestreamv2.RenderView, com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink, com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        super.release();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.RenderView, com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink.GLRenderer
    public void onSurfaceCreated() {
        super.onSurfaceCreated();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("surface Create ");
        LIZ.append(this);
        AVLog.ioi("MixerRenderView", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.RenderView, com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink.GLRenderer
    public void onSurfaceDestroy() {
        super.onSurfaceDestroy();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("surface Destroy ");
        LIZ.append(this);
        AVLog.ioi("MixerRenderView", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.RenderView, com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink.GLRenderer
    public void onSurfaceChanged(int i, int i2) {
        synchronized (this.mFence) {
            super.onSurfaceChanged(i, i2);
            WeakReference<DirectVideoMixer> weakReference = this.mVideoMixer;
            if (weakReference == null) {
                return;
            }
            this.mUpdated = true;
            DirectVideoMixer directVideoMixer = weakReference.get();
            if (directVideoMixer != null) {
                directVideoMixer.updateSize(i, i2);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("surface Change(");
            LIZ.append(i);
            LIZ.append(",");
            LIZ.append(i2);
            LIZ.append(")");
            LIZ.append(this);
            AVLog.ioi("MixerRenderView", X1D.LIZIZ(LIZ));
        }
    }

    public MixerRenderView(View view, DirectVideoMixer directVideoMixer, boolean z) {
        super(view, null, true, z);
        DirectVideoMixer directVideoMixer2;
        Object obj = new Object();
        this.mFence = obj;
        this.mUpdated = false;
        synchronized (obj) {
            WeakReference<DirectVideoMixer> weakReference = new WeakReference<>(directVideoMixer);
            this.mVideoMixer = weakReference;
            if (!this.mUpdated && this.mWindHeight > 1 && this.mWindWidth > 1 && (directVideoMixer2 = weakReference.get()) != null) {
                directVideoMixer2.updateSize(this.mWindWidth, this.mWindHeight);
            }
        }
    }
}
