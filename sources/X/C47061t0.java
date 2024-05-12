package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.performance.RankOptimizeSetting;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1t0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C47061t0 extends W5G implements C0RR {
    public int LJLIL;
    public int LJLILLLLZI;
    public Drawable LJLJI;
    public int LJLJJI;
    public Drawable LJLJJL;
    public int LJLJJLL;
    public Drawable LJLJL;
    public int LJLJLJ;
    public Drawable LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public Drawable LJLLILLLL;
    public Drawable LJLLJ;
    public Drawable LJLLL;
    public boolean LJLLLL;
    public int LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public boolean LL;
    public boolean LLD;
    public boolean LLF;
    public boolean LLFF;
    public Integer LLFFF;
    public int LLFII;
    public Integer LLFZ;
    public C0RP LLI;
    public int LLIFFJFJJ;
    public Paint LLII;
    public PorterDuffXfermode LLIIII;
    public float LLIIIILZ;
    public boolean LLIIIJ;
    public float LLIIIL;
    public float LLIIIZ;

    @Override // X.C0RR
    public final void LJJJJIZL() {
        this.LLIFFJFJJ++;
    }

    @Override // X.C0RR
    public C0RP getCacheHelper() {
        if (this.LLI == null) {
            this.LLI = new C0RP();
        }
        return this.LLI;
    }

    public int getActualImageScaleType() {
        return this.LJLILLLLZI;
    }

    public Drawable getBackgroundImage() {
        return this.LJLLILLLL;
    }

    @Override // X.C0RR
    public int getCallCount() {
        return this.LLIFFJFJJ;
    }

    public int getFadeDuration() {
        return this.LJLIL;
    }

    public Drawable getFailureImage() {
        return this.LJLJJL;
    }

    public int getFailureImageScaleType() {
        return this.LJLJJLL;
    }

    public Drawable getOverlayImage() {
        return this.LJLLJ;
    }

    public Drawable getPlaceholderImage() {
        return this.LJLJI;
    }

    public int getPlaceholderImageScaleType() {
        return this.LJLJJI;
    }

    public Drawable getPressedStateOverlayImage() {
        return this.LJLLL;
    }

    public int getProgressBarAutoRotateInterval() {
        return this.LJLLI;
    }

    public Drawable getProgressBarImage() {
        return this.LJLJLLL;
    }

    public int getProgressBarImageScaleType() {
        return this.LJLL;
    }

    public Drawable getRetryImage() {
        return this.LJLJL;
    }

    public int getRetryImageScaleType() {
        return this.LJLJLJ;
    }

    public boolean getRoundAsCircle() {
        return this.LJLLLL;
    }

    public boolean getRoundBottomEnd() {
        return this.LLFF;
    }

    public boolean getRoundBottomLeft() {
        return this.LJZI;
    }

    public boolean getRoundBottomRight() {
        return this.LJZL;
    }

    public boolean getRoundBottomStart() {
        return this.LLF;
    }

    public boolean getRoundTopEnd() {
        return this.LLD;
    }

    public boolean getRoundTopLeft() {
        return this.LJLZ;
    }

    public boolean getRoundTopRight() {
        return this.LJZ;
    }

    public boolean getRoundTopStart() {
        return this.LL;
    }

    public Integer getRoundWithOverlayColor() {
        return this.LLFFF;
    }

    public int getRoundedCornerRadius() {
        return this.LJLLLLLL;
    }

    public Integer getRoundingBorderColor() {
        return this.LLFZ;
    }

    public int getRoundingBorderWidth() {
        return this.LLFII;
    }

    public C47061t0(Context context) {
        super(context);
        this.LJLIL = 300;
        this.LJLILLLLZI = -1;
        this.LJLJJI = -1;
        this.LJLJJLL = -1;
        this.LJLJLJ = -1;
        this.LJLL = -1;
        this.LJLLI = 1000;
    }

    @Override // X.C0RR
    public final void LJJIIZ(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.LLIIIILZ > 0.0f) {
            if (this.LLII == null) {
                this.LLII = new Paint(1);
                this.LLIIII = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            }
            this.LLII.setXfermode(null);
            C0EL.LIZ(canvas, getWidth(), getHeight(), this.LLII);
            super.draw(canvas);
            this.LLII.setXfermode(this.LLIIII);
            if (this.LLIIIJ) {
                float width = getWidth();
                float f = this.LLIIIILZ;
                canvas.drawCircle((width - f) - this.LLIIIL, this.LLIIIZ + f, f, this.LLII);
            } else {
                float f2 = this.LLIIIL;
                float f3 = this.LLIIIILZ;
                canvas.drawCircle(f2 + f3, this.LLIIIZ + f3, f3, this.LLII);
            }
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    public void setCutoutRadius(float f) {
        if (this.LLIIIILZ != f) {
            this.LLIIIILZ = f;
            invalidate();
        }
    }

    public void setCutoutStartOffset(float f) {
        if (this.LLIIIL != f) {
            this.LLIIIL = f;
            invalidate();
        }
    }

    public void setCutoutTopOffset(float f) {
        if (this.LLIIIZ != f) {
            this.LLIIIZ = f;
            invalidate();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0RQ.LIZ(this, layoutParams);
    }

    public C47061t0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLIL = 300;
        this.LJLILLLLZI = -1;
        this.LJLJJI = -1;
        this.LJLJJLL = -1;
        this.LJLJLJ = -1;
        this.LJLL = -1;
        this.LJLLI = 1000;
        LIZ(context, attributeSet);
    }

    public final void LIZ(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.v3, R.attr.v4, R.attr.v5, R.attr.xa, R.attr.acv, R.attr.acw, R.attr.acx, R.attr.b3j, R.attr.b4s, R.attr.b4t, R.attr.b5b, R.attr.b5t, R.attr.b5u, R.attr.b5v, R.attr.b7q, R.attr.b7r, R.attr.b8t, R.attr.b8u, R.attr.b8v, R.attr.b8w, R.attr.b8x, R.attr.b90, R.attr.b91, R.attr.b92, R.attr.b93, R.attr.b94, R.attr.b9b, R.attr.b9e, R.attr.b9f, R.attr.b9g, R.attr.bw9});
        this.LJLIL = obtainStyledAttributes.getInt(4, 300);
        this.LJLILLLLZI = obtainStyledAttributes.getInt(1, -1);
        this.LJLJI = obtainStyledAttributes.getDrawable(8);
        this.LJLJJI = obtainStyledAttributes.getInt(9, -1);
        this.LJLJJL = obtainStyledAttributes.getDrawable(5);
        this.LJLJJLL = obtainStyledAttributes.getInt(6, -1);
        this.LJLJL = obtainStyledAttributes.getDrawable(14);
        this.LJLJLJ = obtainStyledAttributes.getInt(15, -1);
        this.LJLJLLL = obtainStyledAttributes.getDrawable(12);
        this.LJLL = obtainStyledAttributes.getInt(13, -1);
        this.LJLLI = obtainStyledAttributes.getInt(11, 0);
        this.LJLLILLLL = obtainStyledAttributes.getDrawable(3);
        this.LJLLJ = obtainStyledAttributes.getDrawable(7);
        this.LJLLL = obtainStyledAttributes.getDrawable(10);
        this.LJLLLL = obtainStyledAttributes.getBoolean(16, false);
        this.LJLLLLLL = obtainStyledAttributes.getDimensionPixelSize(26, 0);
        this.LJLZ = obtainStyledAttributes.getBoolean(22, false);
        this.LJZ = obtainStyledAttributes.getBoolean(23, false);
        this.LJZI = obtainStyledAttributes.getBoolean(18, false);
        this.LJZL = obtainStyledAttributes.getBoolean(19, false);
        this.LL = obtainStyledAttributes.getBoolean(24, false);
        this.LLD = obtainStyledAttributes.getBoolean(21, false);
        this.LLF = obtainStyledAttributes.getBoolean(20, false);
        this.LLFF = obtainStyledAttributes.getBoolean(17, false);
        this.LLFFF = Integer.valueOf(obtainStyledAttributes.getColor(25, 0));
        this.LLFII = obtainStyledAttributes.getDimensionPixelSize(29, 0);
        this.LLFZ = Integer.valueOf(obtainStyledAttributes.getColor(27, 0));
        if (RankOptimizeSetting.INSTANCE.getValue()) {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean z = true;
        if (C16310kV.LIZLLL(this) != 1) {
            z = false;
        }
        this.LLIIIJ = z;
    }

    public C47061t0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLIL = 300;
        this.LJLILLLLZI = -1;
        this.LJLJJI = -1;
        this.LJLJJLL = -1;
        this.LJLJLJ = -1;
        this.LJLL = -1;
        this.LJLLI = 1000;
        LIZ(context, attributeSet);
    }
}
