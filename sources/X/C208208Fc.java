package X;

import android.content.Context;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.8Fc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208208Fc extends TuxTextView {
    public final C62822Ol8 LJLLLL;
    public CharacterStyle LJLLLLLL;
    public MotionEvent LJLZ;
    public final java.util.Map<Integer, View> LJZ;

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LJZ;
        Integer valueOf = Integer.valueOf(R.id.title);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.title);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // android.view.View
    public final ActionMode startActionMode(ActionMode.Callback callback) {
        o.LJIIIZ(callback, "callback");
        return null;
    }

    @Override // android.view.View
    public final ActionMode startActionMode(ActionMode.Callback callback, int i) {
        o.LJIIIZ(callback, "callback");
        return null;
    }

    private final GestureDetector getGestureDetector() {
        return (GestureDetector) this.LJLLLL.getValue();
    }

    private final CharacterStyle getPressedSpan() {
        CharacterStyle characterStyle = this.LJLLLLLL;
        if (characterStyle != null) {
            return characterStyle;
        }
        CharacterStyle charStyle = getCharStyle();
        this.LJLLLLLL = charStyle;
        return charStyle;
    }

    public final CharacterStyle getCharStyle() {
        return new BackgroundColorSpan(getHighlightColor());
    }

    public final CharacterStyle getHighlightSpan() {
        return this.LJLLLLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C208208Fc(Context context) {
        super(context, null, 4, 0);
        this.LJZ = C62850Ola.LJFF(context, "context");
        this.LJLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 634));
        getPaint().setUnderlineText(false);
        setTextIsSelectable(true);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        return getGestureDetector().onTouchEvent(event);
    }

    public final void setHighlightSpan(CharacterStyle characterStyle) {
        this.LJLLLLLL = characterStyle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C208208Fc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJZ = C62850Ola.LJFF(context, "context");
        this.LJLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 634));
        getPaint().setUnderlineText(false);
        setTextIsSelectable(true);
    }

    public final boolean LJJJIL(MotionEvent motionEvent, int i) {
        boolean z;
        o.LJI(motionEvent);
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int totalPaddingLeft = x - getTotalPaddingLeft();
        int totalPaddingTop = y - getTotalPaddingTop();
        int scrollX = getScrollX() + totalPaddingLeft;
        int scrollY = getScrollY() + totalPaddingTop;
        Layout layout = getLayout();
        int max = Math.max(C16880lQ.LLLLLLL(layout, layout.getLineForVertical(scrollY), scrollX), 0);
        CharSequence text = getText();
        o.LJII(text, "null cannot be cast to non-null type android.text.Spannable");
        Spannable spannable = (Spannable) text;
        ClickableSpan[] link = (ClickableSpan[]) spannable.getSpans(max, max, ClickableSpan.class);
        o.LJIIIIZZ(link, "link");
        if (link.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int spanStart = spannable.getSpanStart(link[0]);
            int spanEnd = spannable.getSpanEnd(link[0]);
            if (i != 0) {
                if (i != 1) {
                    if (i == 3) {
                        Selection.removeSelection(spannable);
                        spannable.removeSpan(getPressedSpan());
                        return true;
                    }
                } else {
                    link[0].onClick(this);
                    spannable.removeSpan(getPressedSpan());
                    Selection.removeSelection(spannable);
                    spannable.removeSpan(getPressedSpan());
                    return true;
                }
            } else {
                Selection.setSelection(spannable, spanStart, spanEnd);
                spannable.setSpan(getPressedSpan(), spanStart, spanEnd, 33);
                return true;
            }
        } else {
            Selection.removeSelection(spannable);
            spannable.removeSpan(getPressedSpan());
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            onTouchEvent(obtain);
        }
        return false;
    }
}
