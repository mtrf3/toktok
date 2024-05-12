package X;

import Y.ALAdapterS3S0200000_4;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AAY extends FrameLayout {
    public final long LJLIL;
    public final float LJLILLLLZI;
    public final int LJLJI;
    public AnimatorSet LJLJJI;
    public AnimatorSet LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;

    private final View getContainerView() {
        return (View) this.LJLJL.getValue();
    }

    private final TextView getContentView() {
        return (TextView) this.LJLJJLL.getValue();
    }

    public final void LIZ() {
        setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getContentView(), "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(this.LJLIL);
        ofFloat.setInterpolator(getAnimInterpolator());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(getContentView(), "translationX", (this.LJLILLLLZI * 2) + (-getContentView().getMeasuredWidth()), 0.0f);
        ofFloat2.setDuration(this.LJLIL);
        ofFloat2.setInterpolator(getAnimInterpolator());
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
        this.LJLJJI = animatorSet;
    }

    private final Interpolator getAnimInterpolator() {
        PathInterpolator LIZIZ = C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f);
        o.LJIIIIZZ(LIZIZ, "PathInterpolatorCompat.c…ate(0.25f, 0f, 0.25f, 1f)");
        return LIZIZ;
    }

    public final void LIZIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        AnimatorSet animatorSet = this.LJLJJI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getContentView(), "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(this.LJLIL);
        ofFloat.setInterpolator(getAnimInterpolator());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(getContentView(), "translationX", 0.0f, -getContentView().getMeasuredWidth());
        ofFloat2.setDuration(this.LJLIL);
        ofFloat2.setInterpolator(getAnimInterpolator());
        animatorSet2.playTogether(ofFloat, ofFloat2);
        animatorSet2.start();
        animatorSet2.addListener(new ALAdapterS3S0200000_4(this, interfaceC65784Pro, 0));
        this.LJLJJL = animatorSet2;
    }

    public final void setBubbleText(String content) {
        o.LJIIIZ(content, "content");
        getContentView().setText(content);
        getContentView().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = getContentView().getMeasuredWidth();
        float f = this.LJLILLLLZI * 2;
        int i = (int) f;
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint LIZIZ = C6D8.LIZIZ(false);
        Bitmap createBitmap2 = Bitmap.createBitmap(measuredWidth, i, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.LJLJI);
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f});
        gradientDrawable.setBounds(0, 0, measuredWidth, i);
        gradientDrawable.draw(canvas2);
        canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, LIZIZ);
        LIZIZ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        float f2 = f / 2.0f;
        canvas.drawCircle(0.0f, f2, f2, LIZIZ);
        getContentView().setBackground(new BitmapDrawable(createBitmap));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AAY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
        this.LJLIL = 350L;
        this.LJLJI = -1;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1068));
        this.LJLJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1067));
        FrameLayout.inflate(context, R.layout.cti, this);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.b9z, R.attr.b_0}, 0, 0);
        try {
            float dimension = obtainStyledAttributes.getDimension(1, 0.0f);
            this.LJLILLLLZI = dimension;
            this.LJLJI = obtainStyledAttributes.getColor(0, -7829368);
            obtainStyledAttributes.recycle();
            ViewGroup.LayoutParams layoutParams = getContainerView().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (layoutParams instanceof ViewGroup.MarginLayoutParams ? layoutParams : null);
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginStart((int) dimension);
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
