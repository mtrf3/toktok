package X;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.byted.cast.sdk.RTCMediaKind;
import com.byted.cast.sdk.RTCVideoRender;
import com.byted.cast.sdk.view.IRenderView;
import com.byted.cast.sdk.view.MeasureHelper;

/* renamed from: X.Zhv, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90651Zhv extends GLSurfaceView implements IRenderView {
    public GestureDetector mGestureDetector;
    public MeasureHelper mMeasureHelper;
    public String mMirrorId;
    public RTCVideoRender mVideoRender;

    @Override // com.byted.cast.sdk.view.IRenderView
    public void addRenderCallback(IRenderView.IRenderCallback iRenderCallback) {
    }

    @Override // com.byted.cast.sdk.view.IRenderView
    public View getView() {
        return this;
    }

    @Override // com.byted.cast.sdk.view.IRenderView
    public void removeRenderCallback(IRenderView.IRenderCallback iRenderCallback) {
    }

    @Override // com.byted.cast.sdk.view.IRenderView
    public void setVideoRotation(int i) {
    }

    private void init() {
        this.mVideoRender = new RTCVideoRender(this, this.mMirrorId);
        this.mMeasureHelper = new MeasureHelper(this);
        setRenderer(this.mVideoRender);
        setRenderMode(0);
    }

    public boolean clearSource() {
        return this.mVideoRender.clearSource();
    }

    public RTCMediaKind getMediaKind() {
        return this.mVideoRender.getMediaKind();
    }

    public String getUserId() {
        return this.mVideoRender.getUserId();
    }

    public boolean isSetSource() {
        return this.mVideoRender.isSetSource();
    }

    public boolean isSubscribed() {
        return this.mVideoRender.isSubscribed();
    }

    public boolean subscribe() {
        return this.mVideoRender.subscribe();
    }

    public boolean unsubscribe() {
        return this.mVideoRender.unsubscribe();
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return true;
    }

    public RTCVideoRender getRender() {
        return this.mVideoRender;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.mGestureDetector;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1) {
            performClick();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.byted.cast.sdk.view.IRenderView
    public void setAspectRatio(int i) {
        this.mMeasureHelper.setAspectRatio(i);
        requestLayout();
    }

    public void setOnGestureListener(GestureDetector.OnGestureListener onGestureListener) {
        if (onGestureListener == null) {
            return;
        }
        this.mGestureDetector = new GestureDetector(getContext(), onGestureListener);
    }

    public C90651Zhv(Context context, String str) {
        super(context);
        this.mMirrorId = str;
        init();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        this.mMeasureHelper.doMeasure(i, i2);
        setMeasuredDimension(this.mMeasureHelper.getMeasuredWidth(), this.mMeasureHelper.getMeasuredHeight());
    }

    @Override // com.byted.cast.sdk.view.IRenderView
    public void setVideoSampleAspectRatio(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.mMeasureHelper.setVideoSampleAspectRatio(i, i2);
            requestLayout();
        }
    }

    @Override // com.byted.cast.sdk.view.IRenderView
    public void setVideoSize(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.mMeasureHelper.setVideoSize(i, i2);
            getHolder().setFixedSize(i, i2);
            requestLayout();
        }
    }

    public C90651Zhv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public boolean setSource(String str, RTCMediaKind rTCMediaKind, RTCVideoRender.StatusListener statusListener) {
        return this.mVideoRender.setSource(str, rTCMediaKind, statusListener);
    }
}
