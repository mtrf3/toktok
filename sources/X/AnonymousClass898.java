package X;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* renamed from: X.898, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass898 extends BaseMovementMethod {
    public static final AnonymousClass898 LIZ = new AnonymousClass898();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        Integer valueOf;
        if (textView == null || spannable == null) {
            return super.onTouchEvent(textView, spannable, motionEvent);
        }
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null && (valueOf.intValue() == 1 || valueOf.intValue() == 0)) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y - textView.getTotalPaddingTop();
            int scrollX = textView.getScrollX() + totalPaddingLeft;
            int scrollY = textView.getScrollY() + totalPaddingTop;
            Layout layout = textView.getLayout();
            int LLLLLLL = C16880lQ.LLLLLLL(layout, layout.getLineForVertical(scrollY), scrollX);
            ClickableSpan[] links = (ClickableSpan[]) spannable.getSpans(LLLLLLL, LLLLLLL, ClickableSpan.class);
            o.LJIIIIZZ(links, "links");
            boolean z = false;
            if (links.length == 0) {
                Selection.removeSelection(spannable);
            } else {
                C101273yF c101273yF = links[0];
                if (c101273yF instanceof C89A) {
                    int intValue = valueOf.intValue();
                    if (intValue != 0) {
                        if (intValue == 1) {
                            ((C89A) c101273yF).LIZ(textView, spannable);
                        }
                    } else {
                        ((C89A) c101273yF).LIZIZ(textView, spannable);
                    }
                    z = true;
                }
                if (valueOf.intValue() == 1) {
                    c101273yF.onClick(textView);
                }
                if (z) {
                    textView.invalidate();
                }
                return true;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
