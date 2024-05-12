package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4nA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119884nA extends FrameLayout {
    public float LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public final Paint LJLJJL;
    public final C29701Eo LJLJJLL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LJLJJLL.isAnimating()) {
            this.LJLJJLL.cancelAnimation();
            this.LJLJJLL.setVisibility(8);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        if (this.LJLJJLL.getVisibility() == 0) {
            return;
        }
        canvas.drawCircle(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
    }

    public final void setLoadingAnim(String anim) {
        o.LJIIIZ(anim, "anim");
        this.LJLJJLL.setAnimation(anim);
    }

    public final void setStrokeColor(int i) {
        this.LJLJJL.setColor(getResources().getColor(i));
    }

    public final void setStrokeWidth(float f) {
        this.LJLJJL.setStrokeWidth(f);
        this.LJLIL = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119884nA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bf6, R.attr.bf9});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…yleable.UnReadCircleView)");
        this.LJLIL = obtainStyledAttributes.getDimensionPixelSize(1, (int) KL2.LIZJ(context, 2.0f));
        obtainStyledAttributes.recycle();
        setBackgroundColor(C04330Ez.LIZIZ(getContext(), R.color.cz));
        Paint paint = new Paint();
        paint.setColor(AnonymousClass636.LJIIIIZZ(R.attr.c6, context));
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.LJLIL);
        this.LJLJJL = paint;
        C29701Eo c29701Eo = new C29701Eo(context);
        this.LJLJJLL = c29701Eo;
        c29701Eo.setAnimation("story_upload_loading_yellow_lottie.json");
        c29701Eo.setLayerType(2, null);
        c29701Eo.setRepeatCount(-1);
        c29701Eo.setVisibility(8);
        addView(c29701Eo, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLILLLLZI = getMeasuredWidth() / 2.0f;
        this.LJLJI = getMeasuredHeight() / 2.0f;
        this.LJLJJI = (getMeasuredHeight() / 2) - (this.LJLIL / 2);
    }
}
