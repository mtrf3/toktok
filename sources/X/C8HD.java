package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.util.AttributeSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8HD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8HD extends C8H9 {
    @Override // android.view.View
    public final boolean isFocused() {
        return true;
    }

    public final boolean LJJIJIL() {
        int right = ((getRight() - getLeft()) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        if (right <= 0) {
            return false;
        }
        Layout layout = getLayout();
        Float f = null;
        if (layout == null || Float.valueOf(layout.getLineWidth(0)) == null) {
            return false;
        }
        Layout layout2 = getLayout();
        if (layout2 != null) {
            f = Float.valueOf(layout2.getLineWidth(0));
        }
        o.LJI(f);
        if (f.floatValue() <= right) {
            return false;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            boolean LJJIJIL = LJJIJIL();
            setSelected(!LJJIJIL);
            setSelected(LJJIJIL);
            return;
        }
        setSelected(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8HD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            boolean LJJIJIL = LJJIJIL();
            setSelected(!LJJIJIL);
            setSelected(LJJIJIL);
            return;
        }
        setSelected(false);
    }
}
