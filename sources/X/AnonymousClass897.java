package X;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* renamed from: X.897, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass897 extends BaseMovementMethod {
    public final InterfaceC88471Ynr<MotionEvent, ViewGroup, C76800UCe> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass897(InterfaceC88471Ynr<? super MotionEvent, ? super ViewGroup, C76800UCe> onClickNonLinkText) {
        o.LJIIIZ(onClickNonLinkText, "onClickNonLinkText");
        this.LIZ = onClickNonLinkText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        Integer num;
        if (textView == null || spannable == null) {
            return super.onTouchEvent(textView, spannable, motionEvent);
        }
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        Object parent = textView.getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        View view = (View) parent;
        if (num != null) {
            if (num.intValue() == 1 || num.intValue() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int totalPaddingLeft = x - textView.getTotalPaddingLeft();
                int totalPaddingTop = y - textView.getTotalPaddingTop();
                int scrollX = textView.getScrollX() + totalPaddingLeft;
                int scrollY = textView.getScrollY() + totalPaddingTop;
                Layout layout = textView.getLayout();
                if (layout != null) {
                    int LLLLLLL = C16880lQ.LLLLLLL(layout, layout.getLineForVertical(scrollY), scrollX);
                    AbstractC188397aN[] links = (AbstractC188397aN[]) spannable.getSpans(LLLLLLL, LLLLLLL + 1, AbstractC188397aN.class);
                    o.LJIIIIZZ(links, "links");
                    if (links.length == 0) {
                        this.LIZ.invoke(motionEvent, view);
                        Selection.removeSelection(spannable);
                    } else {
                        AbstractC188397aN abstractC188397aN = links[0];
                        int intValue = num.intValue();
                        if (intValue != 0) {
                            if (intValue == 1) {
                                abstractC188397aN.onClick(textView);
                                Selection.removeSelection(spannable);
                                abstractC188397aN.LJLJI = false;
                            }
                        } else {
                            abstractC188397aN.LJLJI = true;
                            Selection.setSelection(spannable, spannable.getSpanStart(abstractC188397aN), spannable.getSpanEnd(abstractC188397aN));
                        }
                        return true;
                    }
                }
            } else if (num.intValue() == 3) {
                view.setPressed(false);
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
