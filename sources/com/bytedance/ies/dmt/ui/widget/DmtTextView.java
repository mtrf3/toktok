package com.bytedance.ies.dmt.ui.widget;

import X.C16880lQ;
import X.C8HI;
import X.X1D;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes4.dex */
public class DmtTextView extends AppCompatTextView {
    public DmtTextView() {
        throw null;
    }

    @Override // android.view.View
    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
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

    public void setFontType(String str) {
        C8HI.LIZJ().LIZIZ(this, str);
    }

    public DmtTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C8HI.LIZJ().LIZ(this, attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        try {
            super.onVisibilityChanged(view, i);
        } catch (NullPointerException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public DmtTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8HI.LIZJ().LIZ(this, attributeSet);
    }
}
