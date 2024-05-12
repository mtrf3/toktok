package X;

import Y.ARunnableS39S0100000_3;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: X.89C, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C89C extends LinkMovementMethod {
    public static C89C LJFF;
    public AnonymousClass896 LIZ;
    public View LIZLLL;
    public final long LIZIZ = ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout();
    public boolean LIZJ = false;
    public final ARunnableS39S0100000_3 LJ = new ARunnableS39S0100000_3(this, 184);

    public static AnonymousClass896 LIZ(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int scrollX = textView.getScrollX() + (((int) motionEvent.getX()) - textView.getTotalPaddingLeft());
        int scrollY = textView.getScrollY() + (((int) motionEvent.getY()) - textView.getTotalPaddingTop());
        Layout layout = textView.getLayout();
        int LLLLLLL = C16880lQ.LLLLLLL(layout, layout.getLineForVertical(scrollY), scrollX);
        AnonymousClass896[] anonymousClass896Arr = (AnonymousClass896[]) spannable.getSpans(LLLLLLL, LLLLLLL, AnonymousClass896.class);
        if (anonymousClass896Arr.length > 0) {
            AnonymousClass896 anonymousClass896 = anonymousClass896Arr[0];
            if (LLLLLLL >= spannable.getSpanStart(anonymousClass896) && LLLLLLL <= spannable.getSpanEnd(anonymousClass896)) {
                return anonymousClass896Arr[0];
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.widget.TextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.text.Spannable] */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        this.LIZLLL = textView;
        if (motionEvent.getAction() == 0) {
            try {
                this.LIZ = LIZ(textView, spannable, motionEvent);
                this.LIZJ = false;
                textView.getHandler().removeCallbacks(this.LJ);
                textView.postDelayed(this.LJ, this.LIZIZ);
                AnonymousClass896 anonymousClass896 = this.LIZ;
                if (anonymousClass896 != null) {
                    anonymousClass896.LJLIL = true;
                    Selection.setSelection(spannable, spannable.getSpanStart(anonymousClass896), spannable.getSpanEnd(this.LIZ));
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                C16880lQ.LLLLIIL(e);
                return false;
            }
        } else if (motionEvent.getAction() == 2) {
            try {
                AnonymousClass896 LIZ = LIZ(textView, spannable, motionEvent);
                AnonymousClass896 anonymousClass8962 = this.LIZ;
                if (anonymousClass8962 != null && LIZ != anonymousClass8962) {
                    anonymousClass8962.LJLIL = false;
                    this.LIZ = null;
                    Selection.removeSelection(spannable);
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                C16880lQ.LLLLIIL(e2);
                return false;
            }
        } else {
            textView.getHandler().removeCallbacks(this.LJ);
            if (motionEvent.getAction() == 1 && !this.LIZJ) {
                AnonymousClass896 anonymousClass8963 = this.LIZ;
                if (anonymousClass8963 != null) {
                    anonymousClass8963.LJLIL = false;
                    super.onTouchEvent(textView, spannable, motionEvent);
                }
                while (true) {
                    if (!(textView.getParent() instanceof ViewGroup)) {
                        break;
                    }
                    textView = (View) textView.getParent();
                    if (textView.hasOnClickListeners()) {
                        textView.performClick();
                        break;
                    }
                }
            }
            AnonymousClass896 anonymousClass8964 = this.LIZ;
            if (anonymousClass8964 != null) {
                anonymousClass8964.LJLIL = false;
            }
            this.LIZJ = false;
            this.LIZ = null;
            this.LIZLLL = null;
            Selection.removeSelection(spannable);
        }
        return true;
    }
}
