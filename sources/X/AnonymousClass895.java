package X;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* renamed from: X.895, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass895 extends LinkMovementMethod {
    public static final AnonymousClass895 LIZ = new AnonymousClass895();
    public static AnonymousClass896 LIZIZ;

    public static AnonymousClass896 LIZ(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int scrollX = textView.getScrollX() + (((int) motionEvent.getX()) - textView.getTotalPaddingLeft());
        int scrollY = textView.getScrollY() + (((int) motionEvent.getY()) - textView.getTotalPaddingTop());
        Layout layout = textView.getLayout();
        if (layout != null) {
            int LLLLLLL = C16880lQ.LLLLLLL(layout, layout.getLineForVertical(scrollY), scrollX);
            AnonymousClass896[] link = (AnonymousClass896[]) spannable.getSpans(LLLLLLL, LLLLLLL, AnonymousClass896.class);
            o.LJIIIIZZ(link, "link");
            if (link.length != 0) {
                AnonymousClass895 anonymousClass895 = LIZ;
                AnonymousClass896 anonymousClass896 = link[0];
                o.LJIIIIZZ(anonymousClass896, "link[0]");
                anonymousClass895.getClass();
                if (LLLLLLL >= spannable.getSpanStart(anonymousClass896) && LLLLLLL <= spannable.getSpanEnd(anonymousClass896)) {
                    return link[0];
                }
            }
        }
        return null;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent event) {
        o.LJIIIZ(textView, "textView");
        o.LJIIIZ(spannable, "spannable");
        o.LJIIIZ(event, "event");
        int action = event.getAction();
        if (action != 0) {
            if (action != 2) {
                AnonymousClass896 anonymousClass896 = LIZIZ;
                if (anonymousClass896 != null) {
                    anonymousClass896.LJLIL = false;
                    super.onTouchEvent(textView, spannable, event);
                }
                LIZIZ = null;
                Selection.removeSelection(spannable);
            } else {
                try {
                    AnonymousClass896 LIZ2 = LIZ(textView, spannable, event);
                    AnonymousClass896 anonymousClass8962 = LIZIZ;
                    if (anonymousClass8962 != null && LIZ2 != anonymousClass8962) {
                        anonymousClass8962.LJLIL = false;
                        LIZIZ = null;
                        Selection.removeSelection(spannable);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    String message = e.getMessage();
                    if (message != null) {
                        C221018lt.LIZ("LinkTouch", message);
                    }
                    return false;
                }
            }
        } else {
            try {
                AnonymousClass896 LIZ3 = LIZ(textView, spannable, event);
                LIZIZ = LIZ3;
                if (LIZ3 != null) {
                    LIZ3.LJLIL = true;
                    Selection.setSelection(spannable, spannable.getSpanStart(LIZ3), spannable.getSpanEnd(LIZ3));
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                String message2 = e2.getMessage();
                if (message2 != null) {
                    C221018lt.LIZ("LinkTouch", message2);
                }
                return false;
            }
        }
        return true;
    }
}
