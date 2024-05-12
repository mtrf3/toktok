package X;

import Y.IDDListenerS395S0100000_14;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.lynx.tasm.utils.BlurUtils;

/* loaded from: classes15.dex */
public class VRK extends ViewGroup implements VPU {
    public Bitmap mBlurBitmap;
    public Canvas mBlurCanvas;
    public float mBlurRadius;
    public int mBlurSampling;
    public VOV mDrawChildHook;
    public String mImpressionId;
    public boolean mIsAttachToWindow;
    public boolean mNeedUsePreDrawListener;
    public final ViewTreeObserver.OnPreDrawListener mPreDrawListener;
    public boolean mPreDrawListenerAdded;
    public boolean nativeInteractionEnabled;

    public void removeBlur() {
        this.mBlurRadius = 0.0f;
        if (BlurUtils.removeEffect(this)) {
            return;
        }
        this.mNeedUsePreDrawListener = false;
        if (this.mPreDrawListenerAdded) {
            if (this.mIsAttachToWindow) {
                getViewTreeObserver().removeOnPreDrawListener(this.mPreDrawListener);
                this.mPreDrawListenerAdded = false;
            }
            this.mBlurBitmap = null;
            this.mBlurCanvas = null;
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        VOV vov = this.mDrawChildHook;
        if (vov != null) {
            return vov.hasOverlappingRendering();
        }
        return super.hasOverlappingRendering();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$new$0() {
        updateBlur();
        return true;
    }

    private void updateBlur() {
        int width = getWidth();
        int height = getHeight();
        Bitmap bitmap = this.mBlurBitmap;
        if (bitmap == null || bitmap.getWidth() != width || this.mBlurBitmap.getHeight() != height) {
            this.mBlurBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.mBlurCanvas = new Canvas(this.mBlurBitmap);
        }
        this.mBlurBitmap.eraseColor(0);
        this.mBlurCanvas.save();
        super.draw(this.mBlurCanvas);
        this.mBlurCanvas.restore();
        Bitmap blur = BlurUtils.blur(getContext(), this.mBlurBitmap, width, height, this.mBlurRadius, this.mBlurSampling);
        this.mBlurBitmap = blur;
        this.mBlurCanvas.setBitmap(blur);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mIsAttachToWindow = true;
        if (this.mNeedUsePreDrawListener && !this.mPreDrawListenerAdded) {
            getViewTreeObserver().addOnPreDrawListener(this.mPreDrawListener);
            this.mPreDrawListenerAdded = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mIsAttachToWindow = false;
        if (this.mPreDrawListenerAdded) {
            getViewTreeObserver().removeOnPreDrawListener(this.mPreDrawListener);
            this.mPreDrawListenerAdded = false;
        }
    }

    public String getImpressionId() {
        return this.mImpressionId;
    }

    public VRK(Context context) {
        super(context);
        this.mBlurSampling = 1;
        this.mPreDrawListener = new IDDListenerS395S0100000_14(this, 4);
        this.nativeInteractionEnabled = false;
    }

    @Override // X.VPU
    public void bindDrawChildHook(VOV vov) {
        this.mDrawChildHook = vov;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        VOV vov = this.mDrawChildHook;
        if (vov != null) {
            vov.beforeDispatchDraw(canvas);
        }
        super.dispatchDraw(canvas);
        VOV vov2 = this.mDrawChildHook;
        if (vov2 != null) {
            vov2.afterDispatchDraw(canvas);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Bitmap bitmap;
        VOV vov = this.mDrawChildHook;
        if (vov != null) {
            vov.beforeDraw(canvas);
        }
        if (this.mBlurRadius != 0.0f && (bitmap = this.mBlurBitmap) != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        } else {
            super.draw(canvas);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.nativeInteractionEnabled) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlur(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.mBlurRadius = f;
        if (BlurUtils.createEffect(this, f)) {
            return;
        }
        if (f == 0.0f) {
            removeBlur();
            return;
        }
        this.mNeedUsePreDrawListener = true;
        if (this.mIsAttachToWindow && !this.mPreDrawListenerAdded) {
            getViewTreeObserver().addOnPreDrawListener(this.mPreDrawListener);
            this.mPreDrawListenerAdded = true;
        }
    }

    public void setBlurSampling(int i) {
        this.mBlurSampling = i;
    }

    @Override // android.view.ViewGroup
    public void setChildrenDrawingOrderEnabled(boolean z) {
        super.setChildrenDrawingOrderEnabled(z);
    }

    public void setImpressionId(String str) {
        this.mImpressionId = str;
    }

    public void setNativeInteractionEnabled(boolean z) {
        this.nativeInteractionEnabled = z;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        VOV vov = this.mDrawChildHook;
        if (vov != null) {
            return vov.getChildDrawingOrder(i, i2);
        }
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        VOV vov;
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (!getRootView().isLayoutRequested() && (vov = this.mDrawChildHook) != null) {
            vov.performMeasureChildrenUI();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild;
        Rect beforeDrawChild;
        VOV vov = this.mDrawChildHook;
        if (vov != null && (beforeDrawChild = vov.beforeDrawChild(canvas, view, j)) != null) {
            canvas.save();
            canvas.clipRect(beforeDrawChild);
            drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
        } else {
            drawChild = super.drawChild(canvas, view, j);
        }
        VOV vov2 = this.mDrawChildHook;
        if (vov2 != null) {
            vov2.afterDrawChild(canvas, view, j);
        }
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        VOV vov;
        if (!getRootView().isLayoutRequested() && (vov = this.mDrawChildHook) != null) {
            vov.performLayoutChildrenUI();
        }
    }
}
