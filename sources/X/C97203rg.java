package X;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3rg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97203rg extends TuxTextView {
    public int LJLLLL;
    public final java.util.Map<Integer, View> LJLLLLLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C97203rg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LJLLLLLL;
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

    public final int getMode() {
        return this.LJLLLL;
    }

    public final void setMode(int i) {
        this.LJLLLL = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C97203rg(android.content.Context r2, android.util.AttributeSet r3, int r4) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = "context"
            java.util.LinkedHashMap r0 = X.C62850Ola.LJFF(r2, r0)
            r1.LJLLLLLL = r0
            r0 = 0
            r1.<init>(r2, r3, r0)
            r0 = 1
            r1.LJLLLL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97203rg.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams;
        TextPaint paint;
        TextPaint paint2;
        super.onTextChanged(charSequence, i, i2, i3);
        CharSequence text = getText();
        if (text != null && (layoutParams = getLayoutParams()) != null && layoutParams.width != -2) {
            int i4 = this.LJLLLL;
            if (i4 == 0) {
                if (i2 != i3 && (paint2 = getPaint()) != null) {
                    int LJJIIZ = O6R.LJJIIZ(paint2.measureText(text.toString()));
                    getWidth();
                    if (getWidth() < LJJIIZ) {
                        requestLayout();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i4 != 1 || (paint = getPaint()) == null) {
                return;
            }
            if (getWidth() == O6R.LJJIIZ(paint.measureText(text.toString()))) {
                return;
            }
            requestLayout();
        }
    }
}
