package X;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* renamed from: X.88y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2066088y extends ScrollingMovementMethod {
    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView widget, Spannable buffer, MotionEvent event) {
        o.LJIIIZ(widget, "widget");
        o.LJIIIZ(buffer, "buffer");
        o.LJIIIZ(event, "event");
        int action = event.getAction();
        if (action == 0 || action == 1) {
            int x = (int) event.getX();
            int y = (int) event.getY();
            int totalPaddingLeft = x - widget.getTotalPaddingLeft();
            int totalPaddingTop = y - widget.getTotalPaddingTop();
            int scrollX = widget.getScrollX() + totalPaddingLeft;
            int scrollY = widget.getScrollY() + totalPaddingTop;
            Layout layout = widget.getLayout();
            o.LJIIIIZZ(layout, "widget.layout");
            int LLLLLLL = C16880lQ.LLLLLLL(layout, layout.getLineForVertical(scrollY), scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) buffer.getSpans(LLLLLLL, LLLLLLL, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                if (action == 1) {
                    AnonymousClass890.LIZ(clickableSpanArr, null).onClick(widget);
                }
                return true;
            }
            Selection.removeSelection(buffer);
        }
        return super.onTouchEvent(widget, buffer, event);
    }
}
