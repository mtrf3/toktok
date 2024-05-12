package com.ss.avframework.livestreamv2.core.interact.media;

import X.AnonymousClass028;
import android.util.AndroidRuntimeException;
import com.bytedance.realx.video.EglBase;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.InteractAudioClientFactory;
import com.ss.avframework.livestreamv2.core.interact.InteractAudioSinkFactory;
import com.ss.avframework.livestreamv2.core.interact.InteractEngineBuilder;
import com.ss.avframework.livestreamv2.core.interact.InteractEngineImpl;
import com.ss.avframework.livestreamv2.core.interact.InteractVideoClientFactory;
import com.ss.avframework.livestreamv2.core.interact.InteractVideoSinkFactory;
import com.ss.avframework.livestreamv2.core.interact.livertc.RTCEngineWrapper;
import com.ss.avframework.livestreamv2.core.interact.media.SurfacePublisherMgr;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper;
import com.ss.ttlivestreamer.core.buffer.SurfaceWithExtData;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.egl.EGLContext;

/* loaded from: classes12.dex */
public class MediaEngine implements LiveCore.ILiveCoreVideoFrameAvailableListener, ILiveStream.IAudioFrameAvailableListener, SurfacePublisherMgr.ITexCallback {
    public boolean hasRegisterListener;
    public InteractAudioSinkFactory mAudioSinkFactory;
    public InteractConfig mConfig;
    public InteractEngineImpl mInteractEngine;
    public InteractEngineBuilder mInteractEngineBuilder;
    public String mInteractId;
    public final LiveCore mLiveCore;
    public SurfaceWithExtData mSurface;
    public final SurfacePublisherMgr mSurfacePublisherMgr;
    public final Object mTextureFrameListenersFence = new Object();
    public final Object mAudioFrameListenersFence = new Object();
    public List<LiveCore.ILiveCoreVideoFrameAvailableListener> mTextureFrameListeners = new ArrayList();
    public List<ILiveStream.IAudioFrameAvailableListener> mAudioFrameListeners = new ArrayList();
    public InteractVideoClientFactory mVideoClientFactory = new InteractVideoClientFactory(this);
    public InteractAudioClientFactory mAudioClientFactory = new InteractAudioClientFactory(this);
    public InteractVideoSinkFactory mVideoSinkFactory = new InteractVideoSinkFactory(this);

    public void registerFrameAvailableListener() {
        if (this.hasRegisterListener) {
            return;
        }
        LiveCore liveCore = this.mLiveCore;
        if (liveCore != null) {
            liveCore.addTextureFrameAvailableListener(this);
            this.mLiveCore.addAudioFrameAvailableListener(this);
        }
        this.hasRegisterListener = true;
    }

    public void registerSurfacePublishListener() {
        LiveCore liveCore;
        if (this.mSurface == null) {
            this.mSurface = this.mSurfacePublisherMgr.getSingleSurface();
            this.mSurfacePublisherMgr.setSurfaceTexCallback(this);
            SurfaceWithExtData surfaceWithExtData = this.mSurface;
            if (surfaceWithExtData != null && (liveCore = this.mLiveCore) != null) {
                liveCore.addSurfaceAvailableListener(surfaceWithExtData);
                return;
            }
            throw new AndroidRuntimeException("BUG! registerSurfacePublishListener error");
        }
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG! surface not null why?");
        if (!AnonymousClass028.LJI(androidRuntimeException, "MediaEngine.registerSurfacePublishListener")) {
        } else {
            throw androidRuntimeException;
        }
    }

    public void stop() {
        if (this.mAudioClientFactory != null) {
            this.mAudioClientFactory = null;
        }
        if (this.mVideoClientFactory != null) {
            this.mVideoClientFactory = null;
        }
        InteractAudioSinkFactory interactAudioSinkFactory = this.mAudioSinkFactory;
        if (interactAudioSinkFactory != null) {
            interactAudioSinkFactory.release();
            this.mAudioSinkFactory = null;
        }
        InteractVideoSinkFactory interactVideoSinkFactory = this.mVideoSinkFactory;
        if (interactVideoSinkFactory != null) {
            interactVideoSinkFactory.release();
            this.mVideoSinkFactory = null;
        }
    }

    public void unRegisterFrameAvailableListener() {
        LiveCore liveCore = this.mLiveCore;
        if (liveCore != null) {
            liveCore.removeTextureFrameAvailableListener(this);
            this.mLiveCore.removeAudioFrameAvailableListener(this);
        }
        this.hasRegisterListener = false;
    }

    public void unregisterSurfacePublishListener() {
        SurfaceWithExtData surfaceWithExtData = this.mSurface;
        if (surfaceWithExtData != null) {
            LiveCore liveCore = this.mLiveCore;
            if (liveCore != null) {
                liveCore.removeSurfaceAvailableListener(surfaceWithExtData);
                this.mSurfacePublisherMgr.setSurfaceTexCallback(null);
                this.mSurfacePublisherMgr.releaseSurface();
                this.mSurface = null;
                return;
            }
            throw new AndroidRuntimeException("BUG! registerSurfacePublishListener error");
        }
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG! surface null why?");
        if (!AnonymousClass028.LJI(androidRuntimeException, "MediaEngine.unregisterSurfacePublishListener")) {
        } else {
            throw androidRuntimeException;
        }
    }

    public InteractAudioClientFactory getAudioClientFactory() {
        return this.mAudioClientFactory;
    }

    public InteractEngineBuilder getBuilder() {
        return this.mInteractEngineBuilder;
    }

    public InteractAudioSinkFactory getInteractAudioSinkFactory() {
        return this.mAudioSinkFactory;
    }

    public String getInteractId() {
        return this.mInteractId;
    }

    public InteractVideoSinkFactory getInteractVideoSinkFactory() {
        return this.mVideoSinkFactory;
    }

    public InteractVideoClientFactory getVideoClientFactory() {
        return this.mVideoClientFactory;
    }

    public void addAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        synchronized (this.mAudioFrameListenersFence) {
            if (iAudioFrameAvailableListener != null) {
                if (!this.mAudioFrameListeners.contains(iAudioFrameAvailableListener)) {
                    this.mAudioFrameListeners.add(iAudioFrameAvailableListener);
                }
            }
        }
    }

    public void addLiveCoreVideoFrameListener(LiveCore.ILiveCoreVideoFrameAvailableListener iLiveCoreVideoFrameAvailableListener) {
        synchronized (this.mTextureFrameListenersFence) {
            if (iLiveCoreVideoFrameAvailableListener != null) {
                if (!this.mTextureFrameListeners.contains(iLiveCoreVideoFrameAvailableListener)) {
                    this.mTextureFrameListeners.add(iLiveCoreVideoFrameAvailableListener);
                }
            }
        }
    }

    public void removeAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        synchronized (this.mAudioFrameListenersFence) {
            if (iAudioFrameAvailableListener != null) {
                this.mAudioFrameListeners.remove(iAudioFrameAvailableListener);
            }
        }
    }

    public void removeLiveCoreVideoFrameListener(LiveCore.ILiveCoreVideoFrameAvailableListener iLiveCoreVideoFrameAvailableListener) {
        synchronized (this.mTextureFrameListenersFence) {
            if (iLiveCoreVideoFrameAvailableListener != null) {
                this.mTextureFrameListeners.remove(iLiveCoreVideoFrameAvailableListener);
            }
        }
    }

    public void setConfig(InteractConfig interactConfig) {
        this.mConfig = interactConfig;
    }

    public void setInteractId(String str) {
        this.mInteractId = str;
    }

    public void setRtcEngine(RTCEngineWrapper rTCEngineWrapper) {
        this.mSurfacePublisherMgr.setRtcEngine(rTCEngineWrapper.getRtcEngine());
    }

    public MediaEngine(InteractEngineImpl interactEngineImpl, LiveCore liveCore, InteractEngineBuilder interactEngineBuilder) {
        this.mLiveCore = liveCore;
        this.mSurfacePublisherMgr = new SurfacePublisherMgr(liveCore.getBuilder().getVideoCaptureWidth(), liveCore.getBuilder().getVideoCaptureHeight());
        this.mInteractEngineBuilder = interactEngineBuilder;
        this.mInteractEngine = interactEngineImpl;
        this.mAudioSinkFactory = new InteractAudioSinkFactory(this.mInteractEngineBuilder);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.IAudioFrameAvailableListener
    public void onAudioFrameAvailable(Buffer buffer, int i, int i2, int i3, long j) {
        ArrayList arrayList;
        synchronized (this.mAudioFrameListenersFence) {
            arrayList = new ArrayList(this.mAudioFrameListeners);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ILiveStream.IAudioFrameAvailableListener) it.next()).onAudioFrameAvailable(buffer, i, i2, i3, j);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore.ILiveCoreVideoFrameAvailableListener
    public void onI420FrameAvailable(ByteBuffer byteBuffer, int i, int i2, long j, Object... objArr) {
        ArrayList arrayList;
        synchronized (this.mTextureFrameListenersFence) {
            arrayList = new ArrayList(this.mTextureFrameListeners);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LiveCore.ILiveCoreVideoFrameAvailableListener iLiveCoreVideoFrameAvailableListener = (LiveCore.ILiveCoreVideoFrameAvailableListener) it.next();
            if (iLiveCoreVideoFrameAvailableListener != null) {
                iLiveCoreVideoFrameAvailableListener.onI420FrameAvailable(byteBuffer, i, i2, j, objArr);
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.media.SurfacePublisherMgr.ITexCallback
    public void onTexCallback(SurfaceTextureHelper surfaceTextureHelper, SurfaceWithExtData surfaceWithExtData, int i, float[] fArr, EglBase eglBase) {
        InteractEngineImpl interactEngineImpl = this.mInteractEngine;
        if (interactEngineImpl != null) {
            for (Client client : interactEngineImpl.getClientList()) {
                if (client != null) {
                    this.mVideoClientFactory.fillSurfaceSeiIfNeed(surfaceWithExtData);
                    client.pushSurfaceExternalVideoFrame(surfaceTextureHelper, surfaceWithExtData, i, fArr, eglBase);
                }
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.ITextureFrameAvailableListener
    public void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, Object... objArr) {
        ArrayList arrayList;
        synchronized (this.mTextureFrameListenersFence) {
            arrayList = new ArrayList(this.mTextureFrameListeners);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener = (ILiveStream.ITextureFrameAvailableListener) it.next();
            if (iTextureFrameAvailableListener != null) {
                iTextureFrameAvailableListener.onTextureFrameAvailable(eGLContext, i, z, i2, i3, j, fArr, objArr);
            }
        }
    }

    public void pushRtcSeiData(int i, String str, int i2, int i3, int i4, float[] fArr, int i5, long j, ByteBuffer byteBuffer) {
        LiveCore liveCore = this.mLiveCore;
        if (liveCore != null) {
            liveCore.pushRtcSeiData(i, str, i2, i3, i4, fArr, i5, j, byteBuffer);
        }
    }
}
