package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.text.NumberFormat;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.SRs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72108SRs extends View {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final Paint LJLJI;
    public int LJLJJI;
    public final ObjectAnimator LJLJJL;
    public boolean LJLJJLL;
    public final String LJLJL;
    public InterfaceC88472Yns<? super Integer, ? extends CharSequence> LJLJLJ;

    public final void LIZ() {
        if (this.LJLJJI == 100 && this.LJLJJLL) {
            this.LJLJJL.setDuration(200L);
            this.LJLJJL.start();
        } else {
            this.LJLJJL.cancel();
            setAlpha(1.0f);
        }
    }

    public final void LIZIZ() {
        setContentDescription(this.LJLJLJ.invoke(Integer.valueOf(this.LJLJJI)));
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return ProgressBar.class.getName();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        this.LJLJI.setStrokeWidth(getHeight());
        this.LJLJI.setColor(this.LJLIL);
        float height = getHeight() / 2;
        canvas.drawLine(0.0f, height, getWidth(), height, this.LJLJI);
        this.LJLJI.setColor(this.LJLILLLLZI);
        if (C26338AVi.LIZLLL(this)) {
            canvas.drawLine(getWidth(), height, getWidth() - ((this.LJLJJI / 100) * getWidth()), height, this.LJLJI);
            return;
        }
        canvas.drawLine(0.0f, height, (this.LJLJJI / 100) * getWidth(), height, this.LJLJI);
    }

    public final void setAutoDisappear(boolean z) {
        this.LJLJJLL = z;
        LIZ();
    }

    public final void setFormatProgressForDisplay(InterfaceC88472Yns<? super Integer, ? extends CharSequence> format) {
        o.LJIIIZ(format, "format");
        this.LJLJLJ = format;
        LIZIZ();
    }

    public final void setProgress(int i) {
        if (i < 0) {
            this.LJLJJI = 0;
        } else if (i > 100) {
            this.LJLJJI = 100;
        } else {
            this.LJLJJI = i;
        }
        invalidate();
        LIZ();
        LIZIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72108SRs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.kb);
        String str;
        a1.LJFF(context, "context");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        this.LJLJI = paint;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(this, \"alpha\", 1f, 0f)");
        this.LJLJJL = ofFloat;
        this.LJLJJLL = true;
        String format = NumberFormat.getPercentInstance().format(0L);
        o.LJIIIIZZ(format, "getPercentInstance().format(0)");
        if (s.LJJLIIIJJIZ(format, ' ', 0, false, 6) == -1) {
            str = "";
        } else {
            str = " ";
        }
        this.LJLJL = str;
        this.LJLJLJ = new AqS178S0100000_12(this, 506);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bpw, R.attr.bun}, R.attr.kb, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…,\n            0\n        )");
        int color = obtainStyledAttributes.getColor(1, 0);
        int color2 = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        this.LJLIL = color;
        this.LJLILLLLZI = color2;
        this.LJLJJLL = true;
        LIZIZ();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size2 = C7MY.LIZIZ(2);
        }
        setMeasuredDimension(size, size2);
    }
}
