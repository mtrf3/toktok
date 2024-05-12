package X;

import android.text.Layout;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* renamed from: X.88w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2065888w extends AnonymousClass892 {
    public static C2065888w LIZJ;
    public boolean LIZ = true;
    public float LIZIZ;

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView widget, Spannable buffer, MotionEvent event) {
        o.LJIIIZ(widget, "widget");
        o.LJIIIZ(buffer, "buffer");
        o.LJIIIZ(event, "event");
        int action = event.getAction();
        if (action == 2) {
            if (Math.abs(event.getY() - this.LIZIZ) > 10.0f) {
                this.LIZ = false;
            }
        } else if (action == 0 || action == 1) {
            int x = (int) event.getX();
            int y = (int) event.getY();
            int totalPaddingLeft = x - widget.getTotalPaddingLeft();
            int totalPaddingTop = y - widget.getTotalPaddingTop();
            int scrollX = widget.getScrollX() + totalPaddingLeft;
            int scrollY = widget.getScrollY() + totalPaddingTop;
            Layout layout = widget.getLayout();
            o.LJIIIIZZ(layout, "widget.layout");
            int lineForVertical = layout.getLineForVertical(scrollY);
            float f = scrollX;
            int LLLLLLL = C16880lQ.LLLLLLL(layout, lineForVertical, f);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) buffer.getSpans(LLLLLLL, LLLLLLL, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                if (action != 0) {
                    if (this.LIZ) {
                        int lineStart = layout.getLineStart(lineForVertical);
                        int lineEnd = layout.getLineEnd(lineForVertical);
                        TextPaint paint = widget.getPaint();
                        o.LJIIIIZZ(paint, "widget.paint");
                        if (f <= paint.measureText(widget.getText().subSequence(lineStart, lineEnd).toString())) {
                            AnonymousClass890.LIZ(clickableSpanArr, widget.getContext()).onClick(widget);
                        }
                    }
                } else {
                    this.LIZIZ = event.getY();
                    this.LIZ = true;
                }
            }
        }
        return super.onTouchEvent(widget, buffer, event);
    }
}
