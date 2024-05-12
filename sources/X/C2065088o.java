package X;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;

/* renamed from: X.88o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2065088o extends DmtTextView {
    public AbstractC204007zY LJLJL;

    @Override // com.bytedance.ies.dmt.ui.widget.DmtTextView, android.view.View
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception e) {
            C36922EeM.LIZ(e);
            return null;
        }
    }

    public C2065088o(Context context) {
        super(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC204007zY abstractC204007zY;
        try {
            super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            C36922EeM.LIZ(e);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && (abstractC204007zY = this.LJLJL) != null) {
                        abstractC204007zY.LIZ(false);
                        this.LJLJL = null;
                    }
                    return false;
                }
                AbstractC204007zY abstractC204007zY2 = this.LJLJL;
                if (abstractC204007zY2 != null && abstractC204007zY2 != LJJIJIL(motionEvent, AbstractC204007zY.class)) {
                    this.LJLJL.LIZ(false);
                    this.LJLJL = null;
                }
                return false;
            }
            AbstractC204007zY abstractC204007zY3 = this.LJLJL;
            if (abstractC204007zY3 == null || abstractC204007zY3 != LJJIJIL(motionEvent, AbstractC204007zY.class)) {
                return false;
            }
            this.LJLJL.LIZ(false);
            this.LJLJL = null;
            return true;
        }
        AbstractC204007zY abstractC204007zY4 = (AbstractC204007zY) LJJIJIL(motionEvent, AbstractC204007zY.class);
        if (abstractC204007zY4 != null) {
            abstractC204007zY4.LIZ(true);
            this.LJLJL = abstractC204007zY4;
            return true;
        }
        if (LJJIJIL(motionEvent, ClickableSpan.class) != null) {
            return true;
        }
        return false;
    }

    public C2065088o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
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
}
