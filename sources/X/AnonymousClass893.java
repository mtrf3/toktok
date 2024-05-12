package X;

import android.content.Context;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.893, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass893 extends LinkMovementMethod {
    public static final AnonymousClass893 LIZ = new AnonymousClass893();
    public static AbstractC91353iF LIZIZ;
    public static C74H LIZJ;

    public static AbstractC91353iF LIZ(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int scrollX = textView.getScrollX() + (((int) motionEvent.getX()) - textView.getTotalPaddingLeft());
        int scrollY = textView.getScrollY() + (((int) motionEvent.getY()) - textView.getTotalPaddingTop());
        Layout layout = textView.getLayout();
        if (layout != null) {
            int LLLLLLL = C16880lQ.LLLLLLL(layout, layout.getLineForVertical(scrollY), scrollX);
            AbstractC91353iF[] link = (AbstractC91353iF[]) spannable.getSpans(LLLLLLL, LLLLLLL, AbstractC91353iF.class);
            o.LJIIIIZZ(link, "link");
            if (link.length != 0) {
                AnonymousClass893 anonymousClass893 = LIZ;
                AbstractC91353iF abstractC91353iF = link[0];
                o.LJIIIIZZ(abstractC91353iF, "link[0]");
                anonymousClass893.getClass();
                if (LLLLLLL >= spannable.getSpanStart(abstractC91353iF) && LLLLLLL <= spannable.getSpanEnd(abstractC91353iF)) {
                    return link[0];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.text.Spannable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.text.style.ClickableSpan[], java.lang.Object] */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent event) {
        C2065188p c2065188p;
        TextExtraStruct textExtraStruct;
        C2065188p c2065188p2;
        TextExtraStruct textExtraStruct2;
        o.LJIIIZ(textView, "textView");
        o.LJIIIZ(spannable, "spannable");
        o.LJIIIZ(event, "event");
        int action = event.getAction();
        C2065188p c2065188p3 = null;
        c2065188p3 = null;
        c2065188p3 = null;
        c2065188p3 = null;
        boolean z = true;
        if (action != 0) {
            if (action != 2) {
                if (LIZIZ != null) {
                    super.onTouchEvent(textView, spannable, event);
                }
                LIZIZ = null;
                Selection.removeSelection(spannable);
                C74H c74h = LIZJ;
                if (c74h != null && c74h.LIZIZ > 0) {
                    if (event.getAction() == 1) {
                        z = false;
                    }
                    Z9N.LIZIZ.LIZ.LLLIIII(c74h.LIZIZ, "comment_highlighted_words", z);
                    c74h.LIZIZ = 0L;
                }
            } else {
                try {
                    AbstractC91353iF LIZ2 = LIZ(textView, spannable, event);
                    AbstractC91353iF abstractC91353iF = LIZIZ;
                    if (abstractC91353iF != null && LIZ2 != abstractC91353iF) {
                        LIZIZ = null;
                        Selection.removeSelection(spannable);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    String message = e.getMessage();
                    if (message != null) {
                        C71Y.LIZ("LinkTouch", message);
                    }
                    return false;
                }
            }
        } else {
            C74H c74h2 = LIZJ;
            if (c74h2 != null) {
                int scrollX = textView.getScrollX() + (((int) event.getX()) - textView.getTotalPaddingLeft());
                int scrollY = textView.getScrollY() + (((int) event.getY()) - textView.getTotalPaddingTop());
                Layout layout = textView.getLayout();
                if (layout != null) {
                    int LLLLLLL = C16880lQ.LLLLLLL(layout, layout.getLineForVertical(scrollY), scrollX);
                    ?? link = (ClickableSpan[]) spannable.getSpans(LLLLLLL, LLLLLLL, ClickableSpan.class);
                    o.LJIIIIZZ(link, "link");
                    if (link.length != 0) {
                        AnonymousClass893 anonymousClass893 = LIZ;
                        ?? r1 = link[0];
                        o.LJIIIIZZ(r1, "link[0]");
                        anonymousClass893.getClass();
                        if (LLLLLLL >= spannable.getSpanStart(r1) && LLLLLLL <= spannable.getSpanEnd(r1)) {
                            c2065188p3 = link[0];
                        }
                    }
                }
                boolean z2 = c2065188p3 instanceof C2065188p;
                if (z2 && (c2065188p = c2065188p3) != null && (textExtraStruct = c2065188p.LJLJJI) != null && textExtraStruct.getType() == 6) {
                    c74h2.LIZIZ = System.currentTimeMillis();
                    if (z2 && (c2065188p2 = c2065188p3) != null && (textExtraStruct2 = c2065188p2.LJLJJI) != null) {
                        Z9N z9n = Z9N.LIZIZ;
                        Context context = textView.getContext();
                        o.LJIIIIZZ(context, "view.context");
                        String searchKeyword = textExtraStruct2.getSearchKeyword();
                        o.LJIIIIZZ(searchKeyword, "textStruct.searchKeyword");
                        z9n.LLLFF(context, searchKeyword, c74h2.LIZ);
                    }
                }
            }
            try {
                AbstractC91353iF LIZ3 = LIZ(textView, spannable, event);
                LIZIZ = LIZ3;
                if (LIZ3 != null) {
                    Selection.setSelection(spannable, spannable.getSpanStart(LIZ3), spannable.getSpanEnd(LIZ3));
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                String message2 = e2.getMessage();
                if (message2 != null) {
                    C71Y.LIZ("LinkTouch", message2);
                }
                return false;
            }
        }
        return super.onTouchEvent(textView, spannable, event);
    }
}
