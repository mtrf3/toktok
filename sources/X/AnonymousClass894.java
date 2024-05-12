package X;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: X.894, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass894 extends LinkMovementMethod {
    public static AnonymousClass894 LIZIZ;
    public AbstractC188397aN LIZ;

    public static AnonymousClass894 LIZ() {
        if (LIZIZ == null) {
            LIZIZ = new AnonymousClass894();
        }
        return LIZIZ;
    }

    public static AbstractC188397aN LIZIZ(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int scrollX = textView.getScrollX() + (((int) motionEvent.getX()) - textView.getTotalPaddingLeft());
        int scrollY = textView.getScrollY() + (((int) motionEvent.getY()) - textView.getTotalPaddingTop());
        Layout layout = textView.getLayout();
        int LLLLLLL = C16880lQ.LLLLLLL(layout, layout.getLineForVertical(scrollY), scrollX);
        AbstractC188397aN[] abstractC188397aNArr = (AbstractC188397aN[]) spannable.getSpans(LLLLLLL, LLLLLLL, AbstractC188397aN.class);
        if (abstractC188397aNArr.length > 0) {
            AbstractC188397aN abstractC188397aN = abstractC188397aNArr[0];
            if (LLLLLLL >= spannable.getSpanStart(abstractC188397aN) && LLLLLLL <= spannable.getSpanEnd(abstractC188397aN)) {
                return abstractC188397aNArr[0];
            }
        }
        return null;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            try {
                AbstractC188397aN LIZIZ2 = LIZIZ(textView, spannable, motionEvent);
                this.LIZ = LIZIZ2;
                if (LIZIZ2 != null) {
                    LIZIZ2.LJLJI = true;
                    Selection.setSelection(spannable, spannable.getSpanStart(LIZIZ2), spannable.getSpanEnd(this.LIZ));
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                C16880lQ.LLLLIIL(e);
                return false;
            }
        } else if (motionEvent.getAction() == 2) {
            try {
                AbstractC188397aN LIZIZ3 = LIZIZ(textView, spannable, motionEvent);
                AbstractC188397aN abstractC188397aN = this.LIZ;
                if (abstractC188397aN != null && LIZIZ3 != abstractC188397aN) {
                    abstractC188397aN.LJLJI = false;
                    this.LIZ = null;
                    Selection.removeSelection(spannable);
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                C16880lQ.LLLLIIL(e2);
                return false;
            }
        } else {
            AbstractC188397aN abstractC188397aN2 = this.LIZ;
            if (abstractC188397aN2 != null) {
                abstractC188397aN2.LJLJI = false;
                super.onTouchEvent(textView, spannable, motionEvent);
            }
            this.LIZ = null;
            Selection.removeSelection(spannable);
        }
        return true;
    }
}
