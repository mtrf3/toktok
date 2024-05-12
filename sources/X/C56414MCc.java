package X;

import Y.ARunnableS15S0110000_9;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.MCc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C56414MCc extends View {
    public Bitmap LJLIL;
    public Bitmap LJLILLLLZI;
    public Paint LJLJI;
    public Paint LJLJJI;
    public PorterDuffXfermode LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public ValueAnimator LJLJLLL;
    public Animator.AnimatorListener LJLL;

    public final void LIZJ() {
        ValueAnimator valueAnimator = this.LJLJLLL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LJLJLLL.cancel();
        }
        this.LJLJJLL = this.LJLJL;
        postInvalidate();
    }

    public Bitmap getSrcBitmap() {
        return this.LJLIL;
    }

    public final Bitmap LIZ(C47061t0 c47061t0) {
        Bitmap createBitmap;
        if (c47061t0 == null) {
            return null;
        }
        int measuredWidth = c47061t0.getMeasuredWidth();
        int measuredHeight = c47061t0.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0 || (createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888)) == null) {
            return null;
        }
        Canvas canvas = new Canvas(createBitmap);
        C37203Eit.LIZJ.getClass();
        C39214FaE.LIZ(c47061t0, canvas);
        canvas.setBitmap(null);
        this.LJLIL = createBitmap;
        return createBitmap;
    }

    public final void LIZIZ(boolean z) {
        if (this.LJLIL == null) {
            return;
        }
        Bitmap bitmap = this.LJLILLLLZI;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = this.LJLILLLLZI.getHeight();
            if (getMeasuredHeight() > 0 && height > 0 && width > 0) {
                Matrix matrix = new Matrix();
                float measuredHeight = getMeasuredHeight() / height;
                matrix.postScale(measuredHeight, measuredHeight);
                this.LJLILLLLZI = Bitmap.createBitmap(this.LJLILLLLZI, 0, 0, width, height, matrix, true);
            }
        }
        post(new ARunnableS15S0110000_9(this, z, 0));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Bitmap bitmap;
        super.onDraw(canvas);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.LJLJI, 31);
        ValueAnimator valueAnimator = this.LJLJLLL;
        if (valueAnimator != null && valueAnimator.isRunning() && (bitmap = this.LJLILLLLZI) != null) {
            canvas.drawBitmap(bitmap, this.LJLJJLL, 0.0f, this.LJLJI);
        }
        if (this.LJLIL != null && (paint = this.LJLJI) != null) {
            paint.setXfermode(this.LJLJJL);
            canvas.drawBitmap(this.LJLIL, 0.0f, 0.0f, this.LJLJI);
            this.LJLJI.setXfermode(null);
        }
        canvas.restoreToCount(saveLayer);
    }

    public void setAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.LJLL = animatorListener;
    }

    public void setLightBitMap(int i) {
        this.LJLILLLLZI = BitmapFactory.decodeResource(C15380j0.LJIIJ(), i);
    }

    public void setSrcBitmap(Bitmap bitmap) {
        this.LJLIL = bitmap;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public C56414MCc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        this.LJLJI = paint;
        paint.setDither(true);
        this.LJLJI.setFilterBitmap(true);
        Paint paint2 = new Paint(1);
        this.LJLJJI = paint2;
        paint2.setDither(true);
        this.LJLJJI.setStyle(Paint.Style.FILL);
        this.LJLJJI.setColor(-1);
        this.LJLJJI.setFilterBitmap(true);
        this.LJLJJL = new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LJLILLLLZI = BitmapFactory.decodeResource(C15380j0.LJIIJ(), R.drawable.d82);
        float f = -i;
        this.LJLJL = f;
        this.LJLJJLL = f;
        this.LJLJLJ = i;
    }
}
