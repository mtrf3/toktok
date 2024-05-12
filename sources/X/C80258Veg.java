package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: X.Veg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80258Veg extends LinearLayout {
    public ValueAnimator indicatorAnimator;
    public int layoutDirection;
    public int selectedPosition;
    public float selectionOffset;
    public final /* synthetic */ C80261Vej this$0;

    private void jumpIndicatorToSelectedPosition() {
        View childAt = getChildAt(this.selectedPosition);
        C80261Vej c80261Vej = this.this$0;
        C80256Vee c80256Vee = c80261Vej.tabIndicatorInterpolator;
        Drawable drawable = c80261Vej.tabSelectedIndicator;
        c80256Vee.getClass();
        RectF LIZ = C80256Vee.LIZ(c80261Vej, childAt);
        drawable.setBounds((int) LIZ.left, drawable.getBounds().top, (int) LIZ.right, drawable.getBounds().bottom);
    }

    public float getIndicatorPosition() {
        return this.selectedPosition + this.selectionOffset;
    }

    public boolean childrenNeedLayout() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).getWidth() <= 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int height;
        int height2 = this.this$0.tabSelectedIndicator.getBounds().height();
        if (height2 < 0) {
            height2 = this.this$0.tabSelectedIndicator.getIntrinsicHeight();
        }
        int i = this.this$0.tabIndicatorGravity;
        if (i != 0) {
            if (i != 1) {
                height = 0;
                if (i != 2) {
                    if (i != 3) {
                        height2 = 0;
                    } else {
                        height2 = getHeight();
                    }
                }
            } else {
                height = (getHeight() - height2) / 2;
                height2 = (getHeight() + height2) / 2;
            }
        } else {
            height = getHeight() - height2;
            height2 = getHeight();
        }
        if (this.this$0.tabSelectedIndicator.getBounds().width() > 0) {
            Rect bounds = this.this$0.tabSelectedIndicator.getBounds();
            this.this$0.tabSelectedIndicator.setBounds(bounds.left, height, bounds.right, height2);
            C80261Vej c80261Vej = this.this$0;
            Drawable drawable = c80261Vej.tabSelectedIndicator;
            if (c80261Vej.tabSelectedIndicatorColor != 0) {
                drawable = C07840Sm.LJFF(drawable);
                if (Build.VERSION.SDK_INT == 21) {
                    drawable.setColorFilter(this.this$0.tabSelectedIndicatorColor, PorterDuff.Mode.SRC_IN);
                } else {
                    C07820Sk.LJI(drawable, this.this$0.tabSelectedIndicatorColor);
                }
            }
            drawable.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (Build.VERSION.SDK_INT < 23 && this.layoutDirection != i) {
            requestLayout();
            this.layoutDirection = i;
        }
    }

    public void setSelectedIndicatorHeight(int i) {
        Rect bounds = this.this$0.tabSelectedIndicator.getBounds();
        this.this$0.tabSelectedIndicator.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80258Veg(C80261Vej c80261Vej, Context context) {
        super(context);
        this.this$0 = c80261Vej;
        this.selectedPosition = -1;
        this.layoutDirection = -1;
        setWillNotDraw(false);
    }

    public void animateIndicatorToPosition(int i, int i2) {
        ValueAnimator valueAnimator = this.indicatorAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.indicatorAnimator.cancel();
        }
        updateOrRecreateIndicatorAnimation(true, i, i2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        C80261Vej c80261Vej = this.this$0;
        if (c80261Vej.tabGravity == 1 || c80261Vej.mode == 2) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    i3 = Math.max(i3, childAt.getMeasuredWidth());
                }
            }
            if (i3 <= 0) {
                return;
            }
            if (i3 * childCount <= getMeasuredWidth() - (((int) C80250VeY.LIZIZ(16, getContext())) * 2)) {
                boolean z = false;
                for (int i5 = 0; i5 < childCount; i5++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                    if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                        layoutParams.width = i3;
                        layoutParams.weight = 0.0f;
                        z = true;
                    }
                }
                if (!z) {
                    return;
                }
            } else {
                C80261Vej c80261Vej2 = this.this$0;
                c80261Vej2.tabGravity = 0;
                c80261Vej2.updateTabViews(false);
            }
            super.onMeasure(i, i2);
        }
    }

    public void setIndicatorPositionFromTabPosition(int i, float f) {
        ValueAnimator valueAnimator = this.indicatorAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.indicatorAnimator.cancel();
        }
        this.selectedPosition = i;
        this.selectionOffset = f;
        tweenIndicatorPosition(getChildAt(i), getChildAt(this.selectedPosition + 1), this.selectionOffset);
    }

    private void updateOrRecreateIndicatorAnimation(boolean z, int i, int i2) {
        View childAt = getChildAt(this.selectedPosition);
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            jumpIndicatorToSelectedPosition();
            return;
        }
        C80259Veh c80259Veh = new C80259Veh(this, childAt, childAt2);
        if (z) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.indicatorAnimator = valueAnimator;
            valueAnimator.setInterpolator(C80237VeL.LIZIZ);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(c80259Veh);
            valueAnimator.addListener(new C80260Vei(this, i));
            valueAnimator.start();
            return;
        }
        this.indicatorAnimator.removeAllUpdateListeners();
        this.indicatorAnimator.addUpdateListener(c80259Veh);
    }

    public void tweenIndicatorPosition(View view, View view2, float f) {
        if (view != null && view.getWidth() > 0) {
            C80261Vej c80261Vej = this.this$0;
            c80261Vej.tabIndicatorInterpolator.LIZIZ(c80261Vej, view, view2, f, c80261Vej.tabSelectedIndicator);
        } else {
            Drawable drawable = this.this$0.tabSelectedIndicator;
            drawable.setBounds(-1, drawable.getBounds().top, -1, this.this$0.tabSelectedIndicator.getBounds().bottom);
        }
        C16300kU.LJIIJ(this);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.indicatorAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            updateOrRecreateIndicatorAnimation(false, this.selectedPosition, -1);
        } else {
            jumpIndicatorToSelectedPosition();
        }
    }
}
