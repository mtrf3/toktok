package com.ss.ttlivestreamer.livestreamv2.core;

import X.AnonymousClass028;
import X.X1D;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AndroidRuntimeException;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.ss.ttlivestreamer.core.buffer.JavaI420Buffer;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TTLSBuildConfig;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.core.utils.VideoFrameStatics;
import com.ss.ttlivestreamer.livestreamv2.RenderView;
import com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControl;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControlExt;
import com.ss.ttlivestreamer.livestreamv2.render.DirectVideoMixer;
import com.ss.ttlivestreamer.livestreamv2.render.RenderViewFactory;
import defpackage.a1;
import java.nio.ByteBuffer;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes12.dex */
public class LayerControl implements ILayerControlExt, View.OnTouchListener {
    public static AtomicInteger mAtomicInteger = new AtomicInteger(0);
    public final String TAG = "LayerControl";
    public long mIntervalUs;
    public LayerChangeListener mLayerChangeListener;
    public LayerEventListener mLayerEventListener;
    public final List<ILayerControlExt.ILayerExt> mLayers;
    public long mNextFrameTimestampUs;
    public String mOriginName;
    public RenderView mRenderView;
    public SurfaceHolder mSurfaceHolder;
    public DirectVideoMixer mVideoMixer;

    /* loaded from: classes12.dex */
    public class DirectLayer extends Layer {
        @Override // com.ss.ttlivestreamer.livestreamv2.core.LayerControl.Layer, com.ss.ttlivestreamer.livestreamv2.core.ILayerControl.ILayer
        public void dispose() {
            DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
            if (directVideoMixer != null) {
                directVideoMixer.enableDirectRender(false);
            }
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.LayerControl.Layer, com.ss.ttlivestreamer.livestreamv2.core.ILayerControl.ILayer, com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer
        public boolean isEnable() {
            VideoMixer.VideoMixerDescription videoMixerDescription = this.mVideoMixerDescription;
            if (videoMixerDescription != null && (videoMixerDescription.flags & 8) == 0) {
                return true;
            }
            return false;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.LayerControl.Layer
        public void createMixerTrack(String str) {
            this.mTrackId = -1;
            this.mVideoMixerDescription = VideoMixer.VideoMixerDescription.FILL();
            setEnable(false);
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.LayerControl.Layer, com.ss.ttlivestreamer.livestreamv2.core.ILayerControlExt.ILayerExt
        public void renderFrame(VideoFrame videoFrame) {
            if (isEnable() && LayerControl.this.keepFrame(videoFrame.getTimestampNs() / 1000)) {
                DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
                if (!this.mPause && directVideoMixer != null) {
                    directVideoMixer.onDirectFrame(videoFrame);
                }
            }
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.LayerControl.Layer, com.ss.ttlivestreamer.livestreamv2.core.ILayerControl.ILayer, com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer
        public void setEnable(boolean z) {
            VideoMixer.VideoMixerDescription videoMixerDescription = this.mVideoMixerDescription;
            if (videoMixerDescription != null) {
                if (z) {
                    videoMixerDescription.flags &= -9;
                } else {
                    videoMixerDescription.flags |= 8;
                }
            }
            DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
            if (directVideoMixer != null) {
                directVideoMixer.enableDirectRender(z);
            }
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.LayerControl.Layer, com.ss.ttlivestreamer.livestreamv2.core.ILayerControl.ILayer, com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer
        public void updateDescription(VideoMixer.VideoMixerDescription videoMixerDescription) {
            if (videoMixerDescription != null) {
                this.mVideoMixerDescription.copy(videoMixerDescription);
            }
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.LayerControl.Layer, com.ss.ttlivestreamer.livestreamv2.core.ILayerControlExt.ILayerExt
        public void renderFrame(VideoMixer.VideoMixerTexture videoMixerTexture) {
            throw new AndroidRuntimeException("later support");
        }

        public DirectLayer(String str, int i, int i2, VideoMixer.VideoMixerDescription videoMixerDescription) {
            super(str, i, i2, videoMixerDescription);
        }
    }

    /* loaded from: classes12.dex */
    public class Layer implements ILayerControlExt.ILayerExt, VideoFrameRenderer {
        public int mAnimationMode;
        public FrameAnimationBase mCurrentAnimation;
        public int mHeight;
        public String mName;
        public FrameAnimationBase mNextAnimation;
        public boolean mPause;
        public int mTrackId;
        public VideoMixer.VideoMixerDescription mVideoMixerDescription;
        public int mWidth;
        public boolean mFirstFrame = true;
        public VideoFrameStatics mRealRateStatistict = new VideoFrameStatics(1000);

        @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl.ILayer
        public Canvas lockCanvas() {
            return null;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl.ILayer
        public void pause() {
            this.mPause = true;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl.ILayer
        public void resume() {
            this.mPause = false;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl.ILayer
        public void unlockCanvasAndPost(Canvas canvas, long j) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl.ILayer
        public void dispose() {
            synchronized (LayerControl.this.mLayers) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Remove Layer(name:");
                LIZ.append(name());
                LIZ.append(",w:");
                LIZ.append(getWidth());
                LIZ.append(",h:");
                LIZ.append(getHeight());
                LIZ.append(")");
                AVLog.ioi("LayerControl", X1D.LIZIZ(LIZ));
                DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
                if (directVideoMixer != null) {
                    directVideoMixer.removeTrack(this.mTrackId);
                }
                LayerControl.this.mLayers.remove(this);
            }
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControlExt.ILayerExt
        public int getMixerOutHeight() {
            DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
            if (directVideoMixer != null) {
                return directVideoMixer.getHeight();
            }
            return -1;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControlExt.ILayerExt
        public int getMixerOutWidth() {
            DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
            if (directVideoMixer != null) {
                return directVideoMixer.getWidth();
            }
            return -1;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl.ILayer, com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer
        public float getRealRatePerSeconds() {
            VideoFrameStatics videoFrameStatics = this.mRealRateStatistict;
            if (videoFrameStatics != null) {
                return videoFrameStatics.getRealRatePerSecond();
            }
            return -1.0f;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl.ILayer, com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer
        public boolean isEnable() {
            DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
            if (directVideoMixer != null && directVideoMixer.isEnable(this.mTrackId)) {
                return true;
            }
            return false;
        }

        public void removeTrackFromVideoMix() {
            DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
            if (directVideoMixer != null) {
                directVideoMixer.removeTrack(this.mTrackId);
            }
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl.ILayer
        public int getHeight() {
            return this.mHeight;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl.ILayer
        public VideoMixer.VideoMixerDescription getLayerDescription() {
            return this.mVideoMixerDescription;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl.ILayer
        public int getWidth() {
            return this.mWidth;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl.ILayer
        public String name() {
            return this.mName;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer
        public void release() {
            dispose();
        }

        private void animationUpdateOnPerFrame(VideoFrame videoFrame) {
            if (this.mNextAnimation != null) {
                FrameAnimationBase frameAnimationBase = this.mCurrentAnimation;
                if (frameAnimationBase != null) {
                    frameAnimationBase.restore();
                    this.mCurrentAnimation = null;
                }
                this.mCurrentAnimation = this.mNextAnimation;
                this.mNextAnimation = null;
            }
            FrameAnimationBase frameAnimationBase2 = this.mCurrentAnimation;
            if (frameAnimationBase2 != null) {
                if (frameAnimationBase2.valid()) {
                    this.mCurrentAnimation.update(videoFrame);
                } else {
                    this.mCurrentAnimation.restore();
                    this.mCurrentAnimation = null;
                }
            }
        }

        public void createMixerTrack(String str) {
            DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
            if (directVideoMixer != null) {
                int createTrack = directVideoMixer.createTrack();
                this.mTrackId = createTrack;
                LayerControl.this.mVideoMixer.setLayerName(createTrack, str);
                this.mVideoMixerDescription = LayerControl.this.mVideoMixer.getDescription(this.mTrackId);
            }
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControlExt.ILayerExt
        public void renderFrame(VideoFrame videoFrame) {
            animationUpdateOnPerFrame(videoFrame);
            if (this.mFirstFrame) {
                updateFrameInfo(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
                this.mFirstFrame = false;
            }
            LayerControl layerControl = LayerControl.this;
            DirectVideoMixer directVideoMixer = layerControl.mVideoMixer;
            if (!this.mPause && directVideoMixer != null && layerControl.keepFrame(videoFrame.getTimestampNs() / 1000)) {
                VideoFrameStatics videoFrameStatics = this.mRealRateStatistict;
                if (videoFrameStatics != null) {
                    videoFrameStatics.add();
                }
                LayerControl layerControl2 = LayerControl.this;
                if (layerControl2.mLayerChangeListener != null) {
                    LayerControl.this.mLayerChangeListener.onLayerRender(this.mTrackId, layerControl2.isOriginTrack(layerControl2.mVideoMixer.getOriginTrackIndex(), this.mTrackId));
                }
                directVideoMixer.onFrame(this.mTrackId, videoFrame);
            }
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl.ILayer, com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer
        public void setEnable(boolean z) {
            DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
            if (directVideoMixer != null) {
                directVideoMixer.setEnable(this.mTrackId, z);
                if (z != directVideoMixer.isEnable(this.mTrackId)) {
                    AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG");
                    if (!AnonymousClass028.LJI(androidRuntimeException, "LayerControl.setEnable@1")) {
                        return;
                    } else {
                        throw androidRuntimeException;
                    }
                }
                return;
            }
            AndroidRuntimeException androidRuntimeException2 = new AndroidRuntimeException("BUG,mVideoMixer is null!!");
            if (!AnonymousClass028.LJI(androidRuntimeException2, "LayerControl.setEnable@2")) {
            } else {
                throw androidRuntimeException2;
            }
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer
        public void setFitMode(boolean z) {
            throw new AndroidRuntimeException("BUG! should not be here");
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl.ILayer
        public void setVisibility(int i) {
            throw new AndroidRuntimeException("Support later version");
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl.ILayer, com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer
        public void updateDescription(VideoMixer.VideoMixerDescription videoMixerDescription) {
            VideoMixer.VideoMixerDescription videoMixerDescription2;
            if (videoMixerDescription != null && (videoMixerDescription2 = this.mVideoMixerDescription) != null) {
                videoMixerDescription2.copy(videoMixerDescription);
                DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
                if (directVideoMixer != null) {
                    synchronized (directVideoMixer) {
                        directVideoMixer.updateDescription(this.mTrackId, this.mVideoMixerDescription);
                    }
                }
                LayerChangeListener layerChangeListener = LayerControl.this.mLayerChangeListener;
                if (layerChangeListener != null) {
                    layerChangeListener.onLayerUpdated();
                }
            }
        }

        private void animationUpdateOnPerFrame(VideoMixer.VideoMixerTexture videoMixerTexture) {
            if (this.mNextAnimation != null) {
                FrameAnimationBase frameAnimationBase = this.mCurrentAnimation;
                if (frameAnimationBase != null) {
                    frameAnimationBase.restore();
                    this.mCurrentAnimation = null;
                }
                this.mCurrentAnimation = this.mNextAnimation;
                this.mNextAnimation = null;
            }
            FrameAnimationBase frameAnimationBase2 = this.mCurrentAnimation;
            if (frameAnimationBase2 != null) {
                if (frameAnimationBase2.valid()) {
                    this.mCurrentAnimation.update(videoMixerTexture);
                } else {
                    this.mCurrentAnimation.restore();
                    this.mCurrentAnimation = null;
                }
            }
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControlExt.ILayerExt
        public void renderFrame(VideoMixer.VideoMixerTexture videoMixerTexture) {
            animationUpdateOnPerFrame(videoMixerTexture);
            if (this.mFirstFrame) {
                updateFrameInfo(videoMixerTexture.getWidth(), videoMixerTexture.getHeight());
                this.mFirstFrame = false;
            }
            LayerControl layerControl = LayerControl.this;
            DirectVideoMixer directVideoMixer = layerControl.mVideoMixer;
            if (!this.mPause && directVideoMixer != null && layerControl.keepFrame(TimeUtils.nativeNanoTime() / 1000)) {
                VideoFrameStatics videoFrameStatics = this.mRealRateStatistict;
                if (videoFrameStatics != null) {
                    videoFrameStatics.add();
                }
                directVideoMixer.onFrame(this.mTrackId, videoMixerTexture);
            }
        }

        private void updateFrameInfo(int i, int i2) {
            this.mWidth = i;
            this.mHeight = i2;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl.ILayer
        public void setAnimationMode(int i, long j, RectF rectF) {
            this.mNextAnimation = FrameAnimationFactory.create(i, this, j, rectF, 30);
            this.mAnimationMode = i;
        }

        public Layer(String str, int i, int i2, VideoMixer.VideoMixerDescription videoMixerDescription) {
            this.mName = str;
            this.mWidth = i;
            this.mHeight = i2;
            createMixerTrack(str);
            updateDescription(videoMixerDescription);
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer
        public int pushVideoFrame(ByteBuffer[] byteBufferArr, int[] iArr, int i, int i2, int i3, long j) {
            long j2;
            JavaI420Buffer[] javaI420BufferArr = {null};
            if (byteBufferArr.length == 1) {
                ByteBuffer byteBuffer = byteBufferArr[0];
                int i4 = (i + 1) / 2;
                int i5 = i * i2;
                int i6 = ((i2 + 1) / 2) * i4;
                int i7 = i5 + i6;
                byteBuffer.position(0);
                byteBuffer.limit(i5);
                ByteBuffer slice = byteBuffer.slice();
                byteBuffer.position(i5);
                byteBuffer.limit(i7);
                ByteBuffer slice2 = byteBuffer.slice();
                byteBuffer.position(i7);
                byteBuffer.limit(i7 + i6);
                j2 = 0;
                javaI420BufferArr[0] = JavaI420Buffer.wrap(i, i2, slice, i, slice2, i4, byteBuffer.slice(), i4, 0L, null);
            } else {
                j2 = 0;
                javaI420BufferArr[0] = JavaI420Buffer.wrap(i, i2, byteBufferArr[0], iArr[0], byteBufferArr[1], iArr[1], byteBufferArr[2], iArr[2], 0L, null);
            }
            renderFrame(new VideoFrame(javaI420BufferArr[0], 0, j2));
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer
        public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j) {
            int i5;
            if (z) {
                i5 = VideoMixer.TEXTURE_TYPE_OES;
            } else {
                i5 = VideoMixer.TEXTURE_TYPE_2D;
            }
            renderFrame(new VideoMixer.VideoMixerTexture(i2, i3, i4, i5, new int[]{i, 0, 0}, fArr));
            return 0;
        }
    }

    /* loaded from: classes12.dex */
    public interface LayerChangeListener {
        void onLayerAdded();

        void onLayerRender(int i, boolean z);

        void onLayerUpdated();
    }

    /* loaded from: classes12.dex */
    public interface LayerEventListener {
        void onHide();

        void onShow();

        boolean onTouch(View view, MotionEvent motionEvent);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl
    public ILayerControl.ILayer[] getLayers() {
        return null;
    }

    public boolean isOriginTrack(int i, int i2) {
        return i >= 0 ? i == i2 : i2 == 0;
    }

    public static int getStreamId() {
        return mAtomicInteger.incrementAndGet();
    }

    private void releaseSurface() {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            this.mSurfaceHolder = null;
            renderView.release();
            this.mRenderView = null;
        }
    }

    public void dump() {
        String str;
        synchronized (this.mLayers) {
            for (ILayerControlExt.ILayerExt iLayerExt : this.mLayers) {
                if (iLayerExt != null) {
                    VideoMixer.VideoMixerDescription layerDescription = iLayerExt.getLayerDescription();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Dump Layer(name:");
                    LIZ.append(iLayerExt.name());
                    LIZ.append(",w:");
                    LIZ.append(iLayerExt.getWidth());
                    LIZ.append(",h:");
                    LIZ.append(iLayerExt.getHeight());
                    LIZ.append(",");
                    if (layerDescription == null) {
                        str = "";
                    } else {
                        str = layerDescription.toString();
                    }
                    LIZ.append(str);
                    AVLog.ioi("LayerControl", X1D.LIZIZ(LIZ));
                }
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl
    public int getCanvasHeight() {
        DirectVideoMixer directVideoMixer = this.mVideoMixer;
        if (directVideoMixer != null) {
            return directVideoMixer.getHeight();
        }
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl
    public int getCanvasWidth() {
        DirectVideoMixer directVideoMixer = this.mVideoMixer;
        if (directVideoMixer != null) {
            return directVideoMixer.getWidth();
        }
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl
    public ILayerControl.ILayer getLocalOriginLayer() {
        return findLayer(this.mOriginName);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl
    public float getRealRenderFps() {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            return renderView.getRealRatePerSeconds();
        }
        return 0.0f;
    }

    public int getRenderViewHeight() {
        return this.mRenderView.getWindHeight();
    }

    public int getRenderViewWidth() {
        return this.mRenderView.getWindWidth();
    }

    public boolean isDirectRenderMode() {
        DirectVideoMixer directVideoMixer = this.mVideoMixer;
        if (directVideoMixer != null) {
            return directVideoMixer.isDirectRenderMode();
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControlExt
    public boolean isFitMode() {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            return renderView.isFitMode();
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl
    public int layerSize() {
        return this.mLayers.size();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControlExt
    public void pause() {
        LayerEventListener layerEventListener = this.mLayerEventListener;
        if (layerEventListener != null) {
            layerEventListener.onHide();
        }
    }

    public void release() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Release ");
        LIZ.append(this);
        AVLog.ioi("LayerControl", X1D.LIZIZ(LIZ));
        dump();
        synchronized (this.mLayers) {
            Iterator<ILayerControlExt.ILayerExt> it = this.mLayers.iterator();
            while (it.hasNext()) {
                ((Layer) it.next()).removeTrackFromVideoMix();
            }
            this.mLayers.clear();
        }
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            renderView.release();
            this.mRenderView = null;
        }
        DirectVideoMixer directVideoMixer = this.mVideoMixer;
        if (directVideoMixer != null) {
            synchronized (directVideoMixer) {
                this.mVideoMixer.release();
                this.mVideoMixer = null;
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControlExt
    public void resume() {
        LayerEventListener layerEventListener = this.mLayerEventListener;
        if (layerEventListener != null) {
            layerEventListener.onShow();
        }
    }

    public LayerControl() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Construct ");
        LIZ.append(this);
        AVLog.ioi("LayerControl", X1D.LIZIZ(LIZ));
        this.mLayers = new ArrayList();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl
    public void reportLayerControlLayersInfo() {
        VideoMixer videoMixer = getVideoMixer();
        if (videoMixer != null) {
            videoMixer.reportLayersInfo();
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControlExt
    public RenderView getRenderView() {
        return this.mRenderView;
    }

    public SurfaceHolder getSurfaceHolder() {
        return this.mSurfaceHolder;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControlExt
    public VideoMixer getVideoMixer() {
        return this.mVideoMixer;
    }

    private void addLayer(ILayerControlExt.ILayerExt iLayerExt) {
        synchronized (this.mLayers) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Create Layer(name:");
            LIZ.append(iLayerExt.name());
            LIZ.append(",w:");
            LIZ.append(iLayerExt.getWidth());
            LIZ.append(",h:");
            LIZ.append(iLayerExt.getHeight());
            LIZ.append(")");
            AVLog.ioi("LayerControl", X1D.LIZIZ(LIZ));
            if (!this.mLayers.contains(iLayerExt)) {
                this.mLayers.add(iLayerExt);
            } else {
                throw new AndroidRuntimeException("BUG");
            }
        }
        LayerChangeListener layerChangeListener = this.mLayerChangeListener;
        if (layerChangeListener != null) {
            layerChangeListener.onLayerAdded();
        }
    }

    private ILayerControlExt.ILayerExt findLayer(String str) {
        if (str == null) {
            return null;
        }
        synchronized (this.mLayers) {
            for (ILayerControlExt.ILayerExt iLayerExt : this.mLayers) {
                if (iLayerExt.name().equals(str)) {
                    return iLayerExt;
                }
            }
            return null;
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl
    public ILayerControl.ILayer getLayer(String str) {
        return findLayer(str);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControlExt
    public boolean isMirror(boolean z) {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            return renderView.isMirror(z);
        }
        return false;
    }

    public boolean keepFrame(long j) {
        if (this.mIntervalUs <= 0) {
            return true;
        }
        long j2 = this.mNextFrameTimestampUs;
        if (j2 != 0) {
            long j3 = j2 - j;
            long abs = Math.abs(j3);
            long j4 = this.mIntervalUs;
            if (abs < j4 * 2) {
                if (j3 > 0) {
                    return false;
                }
                this.mNextFrameTimestampUs += j4;
                return true;
            }
        }
        this.mNextFrameTimestampUs = (this.mIntervalUs / 2) + j;
        return true;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControlExt
    public boolean removeLayer(String str) {
        if (str == null) {
            return false;
        }
        synchronized (this.mLayers) {
            for (ILayerControlExt.ILayerExt iLayerExt : this.mLayers) {
                if (iLayerExt.name().equals(str)) {
                    this.mLayers.remove(iLayerExt);
                    if (iLayerExt instanceof Layer) {
                        ((Layer) iLayerExt).removeTrackFromVideoMix();
                    }
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl
    public void setEventListener(LayerEventListener layerEventListener) {
        this.mLayerEventListener = layerEventListener;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControlExt
    public void setFitMode(boolean z) {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            renderView.setFitMode(z);
        }
    }

    public void setLayerChangeListener(LayerChangeListener layerChangeListener) {
        this.mLayerChangeListener = layerChangeListener;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControlExt
    public void setLocalOrigin(String str) {
        this.mOriginName = str;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl
    public void setOriginTriggering(String str) {
        ILayerControlExt.ILayerExt findLayer = findLayer(str);
        if (findLayer != null) {
            this.mVideoMixer.setOriginTrackIndex(((Layer) findLayer).mTrackId);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl
    public void setPreViewFps(int i) {
        if (i != 0) {
            this.mIntervalUs = 1000000 / i;
        } else {
            this.mIntervalUs = 0L;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        LayerEventListener layerEventListener = this.mLayerEventListener;
        if (layerEventListener != null) {
            return layerEventListener.onTouch(view, motionEvent);
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControlExt
    public void setMirror(boolean z, boolean z2) {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            renderView.setMirror(z, z2);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl
    public ILayerControl.ILayer createLayer(String str, VideoMixer.VideoMixerDescription videoMixerDescription, int i, int i2) {
        return createLayerExt(str, videoMixerDescription, i, i2, 1);
    }

    public void setDisplay(View view, Context context, long j, boolean z) {
        DirectVideoMixer directVideoMixer = this.mVideoMixer;
        if (directVideoMixer == null) {
            DirectVideoMixer directVideoMixer2 = new DirectVideoMixer(j);
            this.mVideoMixer = directVideoMixer2;
            directVideoMixer2.setEnable(z);
            directVideoMixer = this.mVideoMixer;
        }
        if (view == null) {
            directVideoMixer.updateView(null);
            releaseSurface();
            return;
        }
        RenderView createRenderView = RenderViewFactory.createRenderView(j, view, context, directVideoMixer);
        if ((2 & j) != 0 || (32 & j) != 0) {
            createRenderView.setFitMode(true);
        } else {
            createRenderView.setFitMode(false);
        }
        if ((4 & j) != 0 || (64 & j) != 0) {
            createRenderView.setMirror(true, true);
        } else {
            createRenderView.setMirror(false, true);
        }
        if ((8 & j) != 0 || (j & 128) != 0) {
            createRenderView.setMirror(true, false);
        } else {
            createRenderView.setMirror(false, false);
        }
        if (view instanceof SurfaceView) {
            this.mSurfaceHolder = ((SurfaceView) view).getHolder();
        }
        directVideoMixer.updateView(createRenderView);
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            renderView.release();
        }
        this.mRenderView = createRenderView;
        view.setOnTouchListener(this);
    }

    /* loaded from: classes12.dex */
    public class CanvasLayer extends Layer {
        public CanvasLayer(String str, int i, int i2, VideoMixer.VideoMixerDescription videoMixerDescription) {
            super(str, i, i2, videoMixerDescription);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl
    public void catchImage(float f, float f2, float f3, float f4, ILayerControl.CatchViewPic catchViewPic) {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            renderView.catchViewPic(f, f2, f3, f4, catchViewPic);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControlExt
    public ILayerControlExt.ILayerExt createLayerExt(String str, VideoMixer.VideoMixerDescription videoMixerDescription, int i, int i2, int i3) {
        ILayerControlExt.ILayerExt canvasLayer;
        if (findLayer(str) != null) {
            InvalidParameterException invalidParameterException = new InvalidParameterException(a1.LJ("Layer name '", str, "' already exist."));
            AVLog.ioe("LayerControl", invalidParameterException.getMessage(), invalidParameterException);
            TTLSSladarBugReportUtils.getInstance().report(invalidParameterException, "LayerControl.createLayerExt");
            if (!TTLSBuildConfig.canThrowException()) {
                return null;
            }
            throw new AndroidRuntimeException(invalidParameterException);
        }
        if (i3 != 1) {
            if (i3 != 4) {
                canvasLayer = new Layer(str, i, i2, videoMixerDescription);
            } else {
                canvasLayer = new DirectLayer(str, i, i2, videoMixerDescription);
            }
        } else {
            canvasLayer = new CanvasLayer(str, i, i2, videoMixerDescription);
        }
        addLayer(canvasLayer);
        return canvasLayer;
    }
}
