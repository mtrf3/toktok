package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.View;
import com.byted.cast.sdk.view.IRenderView;
import com.byted.cast.sdk.view.MeasureHelper;
import com.byted.cast.sdk.view.VideoGLSurfaceView$VideoRenderer;

/* renamed from: X.Zhx, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90653Zhx extends GLSurfaceView implements IRenderView {
    public MeasureHelper mMeasureHelper;
    public VideoGLSurfaceView$VideoRenderer mRenderer;
    public IRenderView.IRenderCallback mSurfaceCallback;

    @Override // com.byted.cast.sdk.view.IRenderView
    public View getView() {
        return this;
    }

    @Override // com.byted.cast.sdk.view.IRenderView
    public void setVideoRotation(int i) {
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.mRenderer.getSurfaceTexture();
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
    }

    public C90653Zhx(Context context) {
        super(context, null);
        init(context);
        initView(context);
    }

    private void init(Context context) {
        setEGLContextClientVersion(2);
        VideoGLSurfaceView$VideoRenderer videoGLSurfaceView$VideoRenderer = new VideoGLSurfaceView$VideoRenderer(context, this);
        this.mRenderer = videoGLSurfaceView$VideoRenderer;
        setRenderer(videoGLSurfaceView$VideoRenderer);
        setRenderMode(0);
    }

    private void initView(Context context) {
        this.mMeasureHelper = new MeasureHelper(this);
    }

    @Override // com.byted.cast.sdk.view.IRenderView
    public void addRenderCallback(IRenderView.IRenderCallback iRenderCallback) {
        this.mRenderer.addRenderCallback(iRenderCallback);
    }

    @Override // com.byted.cast.sdk.view.IRenderView
    public void removeRenderCallback(IRenderView.IRenderCallback iRenderCallback) {
        this.mRenderer.removeRenderCallback(iRenderCallback);
    }

    @Override // com.byted.cast.sdk.view.IRenderView
    public void setAspectRatio(int i) {
        this.mMeasureHelper.setAspectRatio(i);
        requestLayout();
    }

    public C90653Zhx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
        initView(context);
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
}
