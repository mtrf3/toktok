package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.T4k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74050T4k extends C47121t6 {
    public final C47121t6 LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;

    public final int getStrokeWidth() {
        return this.LJLLLLLL;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        TextPaint paint;
        o.LJIIIZ(canvas, "canvas");
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 != null && (paint = c47121t6.getPaint()) != null) {
            paint.setStrokeWidth(this.LJLLLLLL);
        }
        C47121t6 c47121t62 = this.LJLLLL;
        if (c47121t62 != null) {
            C37203Eit.LIZJ.getClass();
            C39214FaE.LIZ(c47121t62, canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        super.setEllipsize(truncateAt);
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 == null) {
            return;
        }
        c47121t6.setEllipsize(truncateAt);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        super.setGravity(i);
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 == null) {
            return;
        }
        c47121t6.setGravity(i);
    }

    @Override // X.C41541k6, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 == null) {
            return;
        }
        c47121t6.setLayoutParams(layoutParams);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        super.setMaxLines(i);
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 == null) {
            return;
        }
        c47121t6.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 == null) {
            return;
        }
        c47121t6.setMaxWidth(i);
    }

    public final void setStrokeColor(int i) {
        this.LJLZ = i;
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 != null) {
            c47121t6.setTextColor(i);
        }
    }

    public final void setStrokeWidth(int i) {
        this.LJLLLLLL = i;
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 == null) {
            return;
        }
        c47121t6.setTypeface(typeface);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74050T4k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bez, R.attr.bf_});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…able.TimeStickerTextView)");
            this.LJLZ = obtainStyledAttributes.getColor(1, 0);
            this.LJLLLLLL = obtainStyledAttributes.getDimensionPixelSize(0, this.LJLLLLLL);
            obtainStyledAttributes.recycle();
        }
        C47121t6 c47121t6 = new C47121t6(context, attributeSet, 0);
        this.LJLLLL = c47121t6;
        c47121t6.setGravity(getGravity());
        c47121t6.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        c47121t6.getPaint().setStrokeJoin(Paint.Join.ROUND);
        c47121t6.getPaint().setStrokeCap(Paint.Cap.ROUND);
        c47121t6.setTextColor(this.LJLZ);
        c47121t6.setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier());
        c47121t6.setMaxWidth(getMaxWidth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            c47121t6.setLayoutParams(layoutParams);
        }
        Typeface typeface = getTypeface();
        if (typeface != null) {
            c47121t6.setTypeface(typeface);
        }
        c47121t6.setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        c47121t6.setGravity(getGravity());
        c47121t6.getPaint().setTextSize(getTextSize());
        c47121t6.setText(getText());
        c47121t6.setMaxLines(getMaxLines());
        c47121t6.setEllipsize(getEllipsize());
        float f = 12;
        setShadowLayer(f, 0.0f, 0.0f, 0);
        c47121t6.setShadowLayer(f, 0.0f, 0.0f, 0);
    }

    @Override // X.C47121t6, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 != null) {
            c47121t6.measure(i, i2);
        }
    }

    @Override // android.widget.TextView
    public final void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 != null) {
            c47121t6.setLineSpacing(f, f2);
        }
    }

    @Override // X.C47121t6, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 != null) {
            c47121t6.setText(charSequence, bufferType);
        }
    }

    @Override // X.C47121t6, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 != null) {
            c47121t6.setTextSize(i, f);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 != null) {
            c47121t6.setPadding(i, i2, i3, i4);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 != null) {
            c47121t6.layout(i, i2, i3, i4);
        }
    }
}
