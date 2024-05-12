package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.XhH, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85515XhH implements TextView.OnEditorActionListener {
    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6 && textView != null) {
            textView.clearFocus();
            return false;
        }
        return false;
    }
}
