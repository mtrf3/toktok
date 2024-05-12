package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes16.dex */
public final class YD5 extends ViewGroup implements YSD, YDC {
    public YD4 LJLIL;
    public YD8 LJLILLLLZI;
    public ImageView LJLJI;
    public View LJLJJI;

    @Override // X.YSD
    public final void LIZIZ() {
    }

    @Override // X.YSD
    public final void LJFF() {
    }

    public YDC getGestureTargetView() {
        return this;
    }

    public View getGestureView() {
        return this;
    }

    @Override // X.YSD
    public ViewGroup getVideoContainer() {
        return this;
    }

    @Override // X.YSD
    public final boolean LIZ() {
        return this.LJLIL.LJIIJJI;
    }

    @Override // X.YSD
    public final void LJ() {
        if (this.LJLJI.getVisibility() != 8) {
            this.LJLJI.setVisibility(8);
            this.LJLJI.setImageBitmap(null);
        }
    }

    public float getCenterCropScaleFactor() {
        return this.LJLIL.LIZ();
    }

    public float getCenterInsideScaleFactor() {
        this.LJLIL.getClass();
        return 1.0f;
    }

    @Override // X.YSD
    public int getTextureLayout() {
        return this.LJLIL.LJIIIZ;
    }

    @Override // X.YSD
    public int getVideoHeight() {
        return this.LJLIL.LIZJ;
    }

    @Override // X.YSD
    public int getVideoViewMarginTop() {
        if (this.LJLILLLLZI != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            }
            return -1;
        }
        return -1;
    }

    @Override // X.YSD
    public int getVideoWidth() {
        return this.LJLIL.LIZIZ;
    }

    public RectF getViewRect() {
        YD4 yd4 = this.LJLIL;
        yd4.getClass();
        return new RectF(yd4.LIZLLL(), yd4.LJ(), (yd4.LIZ.getScaleX() * yd4.LIZ.getWidth()) + yd4.LIZLLL(), (yd4.LIZ.getScaleY() * yd4.LIZ.getHeight()) + yd4.LJ());
    }

    @Override // X.YSD
    public View getBlackCoverView() {
        return this.LJLJJI;
    }

    @Override // X.YSD
    public YSF getVideoView() {
        return this.LJLILLLLZI;
    }

    public YD5(Context context) {
        super(context);
        setClipChildren(false);
        setBackgroundColor(-16777216);
        this.LJLIL = new YD4(this, this);
        YD8 yd8 = new YD8(context);
        this.LJLILLLLZI = yd8;
        yd8.getHolder();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.LJLILLLLZI, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        View view = new View(context);
        this.LJLJJI = view;
        view.setBackgroundColor(-16777216);
        layoutParams2.gravity = 17;
        addView(this.LJLJJI, layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        ImageView imageView = new ImageView(context);
        this.LJLJI = imageView;
        layoutParams3.gravity = 17;
        addView(imageView, layoutParams3);
    }

    @Override // X.YSD
    public final void LIZJ(Bitmap bitmap) {
        if (bitmap != null) {
            this.LJLJI.setImageBitmap(bitmap);
            this.LJLJI.setVisibility(0);
        }
    }

    @Override // X.YSD
    public final void LIZLLL(int i) {
        this.LJLIL.LJI(i);
    }

    @Override // X.YSD
    public void setCropStrategy(YDD ydd) {
        this.LJLIL.getClass();
    }

    public void setMaxScaleFactor(float f) {
        YD4 yd4 = this.LJLIL;
        yd4.getClass();
        if (Float.isNaN(f) || f < 0.0f || f > Float.MAX_VALUE) {
            return;
        }
        yd4.LJII = f;
    }

    public void setMinScaleFactor(float f) {
        YD4 yd4 = this.LJLIL;
        yd4.getClass();
        if (Float.isNaN(f) || f < 0.0f || f > Float.MAX_VALUE) {
            return;
        }
        yd4.LJIIIIZZ = f;
    }

    @Override // X.YSD
    public void setOptimizeBlackSide(boolean z) {
        this.LJLIL.getClass();
    }

    @Override // X.YSD
    public void setOptimizeNormalFillScreen(boolean z) {
        this.LJLIL.LJIIJ = z;
    }

    public void setResizeListener(YDB ydb) {
        this.LJLIL.getClass();
    }

    public void setRotatable(boolean z) {
        this.LJLIL.getClass();
    }

    public void setScalable(boolean z) {
        this.LJLIL.getClass();
    }

    public void setTextureLayout(int i) {
        YD4 yd4 = this.LJLIL;
        if (yd4.LJIIIZ != i) {
            yd4.LJIIIZ = i;
            yd4.LIZ.requestLayout();
        }
    }

    public void setTranslatable(boolean z) {
        this.LJLIL.getClass();
    }

    @Override // X.YSD
    public void setZoomingEnabled(boolean z) {
        this.LJLIL.LJIIJJI = z;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("widthMeasureSpec:");
        LIZ.append(View.MeasureSpec.toString(i));
        X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("heightMeasureSpec:");
        LIZ2.append(View.MeasureSpec.toString(i2));
        X1D.LIZIZ(LIZ2);
        Pair<Integer, Integer> LJFF = this.LJLIL.LJFF(i, i2, getPaddingRight() + getPaddingLeft() + getSuggestedMinimumWidth(), getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight());
        setMeasuredDimension(((Integer) LJFF.first).intValue(), ((Integer) LJFF.second).intValue());
    }

    @Override // X.YSD
    public final void setVideoSize(int i, int i2) {
        this.LJLIL.LJII(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
