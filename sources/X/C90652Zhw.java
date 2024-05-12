package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.sdk.view.IRenderView;
import com.byted.cast.sdk.view.MeasureHelper;
import com.byted.cast.sdk.view.SurfaceRenderView$SurfaceCallback;

/* renamed from: X.Zhw, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90652Zhw extends SurfaceView implements IRenderView {
    public ContextManager.CastContext mCastContext;
    public CastLogger mLogger;
    public MeasureHelper mMeasureHelper;
    public SurfaceRenderView$SurfaceCallback mSurfaceCallback;

    @Override // com.byted.cast.sdk.view.IRenderView
    public View getView() {
        return this;
    }

    @Override // com.byted.cast.sdk.view.IRenderView
    public void setVideoRotation(int i) {
    }

    private void initView(Context context) {
        this.mMeasureHelper = new MeasureHelper(this);
        this.mSurfaceCallback = new SurfaceRenderView$SurfaceCallback(this, this.mCastContext);
        getHolder().addCallback(this.mSurfaceCallback);
        getHolder().setType(0);
    }

    @Override // com.byted.cast.sdk.view.IRenderView
    public void addRenderCallback(IRenderView.IRenderCallback iRenderCallback) {
        this.mSurfaceCallback.addRenderCallback(iRenderCallback);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C90652Zhw.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C90652Zhw.class.getName());
    }

    @Override // com.byted.cast.sdk.view.IRenderView
    public void removeRenderCallback(IRenderView.IRenderCallback iRenderCallback) {
        this.mSurfaceCallback.removeRenderCallback(iRenderCallback);
    }

    @Override // com.byted.cast.sdk.view.IRenderView
    public void setAspectRatio(int i) {
        this.mMeasureHelper.setAspectRatio(i);
        requestLayout();
    }

    public C90652Zhw(Context context, ContextManager.CastContext castContext) {
        super(context);
        this.mCastContext = castContext;
        this.mLogger = ContextManager.getLogger(castContext);
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

    public C90652Zhw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public C90652Zhw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }

    public C90652Zhw(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initView(context);
    }
}
