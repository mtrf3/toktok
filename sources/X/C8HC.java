package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.8HC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8HC extends TuxTextView {
    public final java.util.Map<Integer, View> LJLLLL;

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LJLLLL;
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
    public final boolean isFocused() {
        return true;
    }

    public final boolean LJJJIL() {
        Layout layout;
        int right = ((getRight() - getLeft()) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        if (right <= 0 || (layout = getLayout()) == null || Float.valueOf(layout.getLineWidth(0)) == null || getLayout().getLineWidth(0) <= right) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(super.toString());
        LIZ.append(", text: ");
        LIZ.append((Object) getText());
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            boolean LJJJIL = LJJJIL();
            setSelected(!LJJJIL);
            setSelected(LJJJIL);
            return;
        }
        setSelected(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8HC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLLLL = C62850Ola.LJFF(context, "context");
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            boolean LJJJIL = LJJJIL();
            setSelected(!LJJJIL);
            setSelected(LJJJIL);
            return;
        }
        setSelected(false);
    }
}
