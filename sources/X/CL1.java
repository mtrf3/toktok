package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CL1 extends C47121t6 {
    public final C47121t6 LJLLLL;
    public boolean LJLLLLLL;

    public final boolean getStrokeEnable() {
        return this.LJLLLLLL;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        C47121t6 c47121t6;
        if (this.LJLLLLLL && canvas != null && (c47121t6 = this.LJLLLL) != null) {
            C37203Eit.LIZJ.getClass();
            C39214FaE.LIZ(c47121t6, canvas);
        }
        super.onDraw(canvas);
    }

    @Override // X.C41541k6, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 != null) {
            c47121t6.setLayoutParams(layoutParams);
        }
        super.setLayoutParams(layoutParams);
    }

    public final void setStrokeEnable(boolean z) {
        this.LJLLLLLL = z;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 != null) {
            c47121t6.setVisibility(i);
        }
        super.setVisibility(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CL1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        float LIZ = C15380j0.LIZ(1.0f);
        int LIZIZ = C15380j0.LIZIZ(R.color.a96);
        C47121t6 c47121t6 = new C47121t6(context, attributeSet, 0);
        this.LJLLLL = c47121t6;
        TextPaint paint = c47121t6.getPaint();
        if (paint != null) {
            paint.setStrokeWidth(LIZ);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
        }
        c47121t6.setTextColor(LIZIZ);
        c47121t6.setGravity(getGravity());
    }

    @Override // X.C47121t6, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 != null) {
            if (!o.LJ(c47121t6.getText(), getText())) {
                c47121t6.setText(getText());
                postInvalidate();
            }
            c47121t6.measure(i, i2);
        }
        super.onMeasure(i, i2);
    }

    @Override // X.C47121t6, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextSize(int i, float f) {
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 != null) {
            c47121t6.setTextSize(i, f);
        }
        super.setTextSize(i, f);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 != null) {
            c47121t6.layout(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}
