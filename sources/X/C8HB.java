package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import java.util.LinkedHashMap;

/* renamed from: X.8HB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8HB extends C8H9 {
    @Override // android.view.View
    public final boolean isFocused() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            super.onWindowFocusChanged(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8HB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            super.onFocusChanged(z, i, rect);
        }
    }
}
