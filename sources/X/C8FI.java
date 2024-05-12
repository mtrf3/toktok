package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LineBackgroundSpan;
import android.view.View;
import android.widget.TextView;
import java.text.Bidi;
import kotlin.jvm.internal.o;

/* renamed from: X.8FI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8FI implements LineBackgroundSpan, C8FM, C48R {
    public final CharSequence LJLIL;
    public final java.util.Map<String, Object> LJLILLLLZI;
    public final InterfaceC116744i6 LJLJI;
    public final Paint LJLJJI;
    public final T5S LJLJJL;
    public final TextPaint LJLJJLL;

    @Override // X.C48R
    public final boolean LJ() {
        return true;
    }

    @Override // X.C48R
    public final boolean LJI() {
        return false;
    }

    @Override // X.C8FM
    public final void LJFF(View widget) {
        o.LJIIIZ(widget, "widget");
        InterfaceC116744i6 interfaceC116744i6 = this.LJLJI;
        if (interfaceC116744i6 != null) {
            interfaceC116744i6.LIZ(this);
        }
    }

    @Override // X.C8FM
    public final void onClick(View widget) {
        o.LJIIIZ(widget, "widget");
        InterfaceC116744i6 interfaceC116744i6 = this.LJLJI;
        if (interfaceC116744i6 != null) {
            interfaceC116744i6.LIZIZ(this, this.LJLIL, this.LJLILLLLZI);
        }
    }

    @Override // X.C8FM
    public final void LIZ(TextView widget, Spanned text) {
        o.LJIIIZ(widget, "widget");
        o.LJIIIZ(text, "text");
    }

    @Override // X.C8FM
    public final void LIZIZ(TextView widget, Spanned text) {
        o.LJIIIZ(widget, "widget");
        o.LJIIIZ(text, "text");
    }

    @Override // X.C8FM
    public final void LIZJ(TextView widget, Spanned text) {
        o.LJIIIZ(widget, "widget");
        o.LJIIIZ(text, "text");
    }

    public C8FI(int i, CharSequence text, java.util.Map map, InterfaceC116744i6 interfaceC116744i6) {
        o.LJIIIZ(text, "text");
        this.LJLIL = text;
        this.LJLILLLLZI = map;
        this.LJLJI = interfaceC116744i6;
        Paint paint = new Paint();
        this.LJLJJI = paint;
        T5S t5s = new T5S();
        this.LJLJJL = t5s;
        this.LJLJJLL = new TextPaint();
        paint.setStrokeWidth(C32151Nz.LJIIZILJ(1));
        paint.setColor(i);
        t5s.LIZ(42);
    }

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence text, int i6, int i7, int i8) {
        float LJIJJLI;
        float f;
        float f2;
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(paint, "paint");
        o.LJIIIZ(text, "text");
        try {
            this.LJLJJLL.set(paint);
            this.LJLJJLL.setTypeface(this.LJLJJL.getTypeface());
            float measureText = this.LJLJJLL.measureText(text, i6, i7);
            Bidi bidi = new Bidi(text.toString(), -2);
            if (i7 == text.toString().length()) {
                LJIJJLI = C17N.LJIJJLI(1);
            } else {
                LJIJJLI = C17N.LJIJJLI(-2);
            }
            if (bidi.isLeftToRight()) {
                f = i;
            } else {
                f = i2;
            }
            float f3 = LJIJJLI + i5;
            if (bidi.isLeftToRight()) {
                f2 = i + measureText;
            } else {
                f2 = i2 - measureText;
            }
            canvas.drawLine(f, f3, f2, f3, this.LJLJJI);
        } catch (Exception unused) {
        }
    }
}
