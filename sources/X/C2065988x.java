package X;

import android.text.Layout;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: X.88x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2065988x extends AnonymousClass891 {
    public static C2065988x LIZ;

    public static C2065988x LIZ() {
        if (LIZ == null) {
            synchronized (C2066188z.class) {
                if (LIZ == null) {
                    LIZ = new C2065988x();
                }
            }
        }
        return LIZ;
    }

    @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y - textView.getTotalPaddingTop();
            int scrollX = textView.getScrollX() + totalPaddingLeft;
            int scrollY = textView.getScrollY() + totalPaddingTop;
            Layout layout = textView.getLayout();
            int lineForVertical = layout.getLineForVertical(scrollY);
            float f = scrollX;
            int LLLLLLL = C16880lQ.LLLLLLL(layout, lineForVertical, f);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(LLLLLLL, LLLLLLL, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && action == 1) {
                if (f <= textView.getPaint().measureText(textView.getText().subSequence(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical)).toString())) {
                    AnonymousClass890.LIZ(clickableSpanArr, null).onClick(textView);
                }
            }
        }
        return true;
    }
}
