package X;

import android.text.Layout;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* renamed from: X.88v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2065788v extends AnonymousClass892 {
    public static C2065788v LIZJ;
    public boolean LIZ = true;
    public float LIZIZ;

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable buffer, MotionEvent e) {
        o.LJIIIZ(textView, "textView");
        o.LJIIIZ(buffer, "buffer");
        o.LJIIIZ(e, "e");
        int action = e.getAction();
        if (action == 2) {
            if (Math.abs(e.getY() - this.LIZIZ) > 10.0f) {
                this.LIZ = false;
            }
        } else if (action == 0 || action == 1) {
            int x = (int) e.getX();
            int y = (int) e.getY();
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y - textView.getTotalPaddingTop();
            int scrollX = textView.getScrollX() + totalPaddingLeft;
            int scrollY = textView.getScrollY() + totalPaddingTop;
            Layout layout = textView.getLayout();
            o.LJIIIIZZ(layout, "textView.layout");
            int lineForVertical = layout.getLineForVertical(scrollY);
            float f = scrollX;
            int LLLLLLL = C16880lQ.LLLLLLL(layout, lineForVertical, f);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) buffer.getSpans(LLLLLLL, LLLLLLL, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                if (action != 0) {
                    if (this.LIZ) {
                        int lineStart = layout.getLineStart(lineForVertical);
                        int lineEnd = layout.getLineEnd(lineForVertical);
                        TextPaint paint = textView.getPaint();
                        o.LJIIIIZZ(paint, "textView.paint");
                        if (f >= textView.getWidth() - paint.measureText(textView.getText().subSequence(lineStart, lineEnd).toString())) {
                            AnonymousClass890.LIZ(clickableSpanArr, null).onClick(textView);
                        }
                    }
                } else {
                    this.LIZIZ = e.getY();
                    this.LIZ = true;
                }
            }
        }
        return super.onTouchEvent(textView, buffer, e);
    }
}
