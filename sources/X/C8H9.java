package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: X.8H9, reason: invalid class name */
/* loaded from: classes4.dex */
public class C8H9 extends AppCompatTextView {
    @Override // android.view.View
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean performLongClick() {
        try {
            return super.performLongClick();
        } catch (Exception unused) {
            getText();
            return false;
        }
    }

    @Override // android.view.View
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(super.toString());
        LIZ.append(", text: ");
        LIZ.append((Object) getText());
        return X1D.LIZIZ(LIZ);
    }

    public C8H9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C78880UxY.LJJJJJ(this, attributeSet, true);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        try {
            super.onVisibilityChanged(view, i);
        } catch (NullPointerException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public C8H9(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C78880UxY.LJJJJJ(this, attributeSet, true);
    }
}
