package X;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;

/* renamed from: X.89J, reason: invalid class name */
/* loaded from: classes4.dex */
public class C89J extends C89I {
    public void setSpanColor(int i) {
    }

    public C89J(final Context context, final AttributeSet attributeSet) {
        new DmtTextView(context, attributeSet) { // from class: X.89I
            @Override // com.bytedance.ies.dmt.ui.widget.DmtTextView, android.view.View
            public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
                try {
                    return super.createAccessibilityNodeInfo();
                } catch (Exception e) {
                    C170666ms.LIZ.LJIIJJI(e);
                    return null;
                }
            }

            @Override // android.widget.TextView, android.view.View
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                try {
                    super.onTouchEvent(motionEvent);
                } catch (Exception e) {
                    C170666ms.LIZ.LJIIJJI(e);
                }
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                if (LJJIJIL(motionEvent, C89L.class) == null) {
                    if (LJJIJIL(motionEvent, ClickableSpan.class) == null) {
                        return false;
                    }
                    return true;
                }
                throw null;
            }

            public final <T extends ClickableSpan> T LJJIJIL(MotionEvent motionEvent, Class<T> cls) {
                if (!(getText() instanceof Spanned)) {
                    return null;
                }
                Spanned spanned = (Spanned) getText();
                int scrollX = getScrollX() + (((int) motionEvent.getX()) - getTotalPaddingLeft());
                int scrollY = getScrollY() + (((int) motionEvent.getY()) - getTotalPaddingTop());
                Layout layout = getLayout();
                try {
                    int LLLLLLL = C16880lQ.LLLLLLL(layout, layout.getLineForVertical(scrollY), scrollX);
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(LLLLLLL, LLLLLLL, cls);
                    if (clickableSpanArr.length <= 0) {
                        return null;
                    }
                    ClickableSpan clickableSpan = clickableSpanArr[0];
                    if (LLLLLLL < spanned.getSpanStart(clickableSpan) || LLLLLLL > spanned.getSpanEnd(clickableSpan)) {
                        return null;
                    }
                    return (T) clickableSpanArr[0];
                } catch (Exception unused) {
                    return null;
                }
            }
        };
        getTextSize();
        getCurrentTextColor();
        setHighlightColor(0);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Exception e) {
            C170666ms.LIZ.LJIIJJI(e);
        }
    }
}
