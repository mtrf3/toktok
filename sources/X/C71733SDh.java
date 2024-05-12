package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.SDh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71733SDh implements TextView.OnEditorActionListener {
    public static final C71733SDh LJLIL = new C71733SDh();

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6 && textView != null) {
            textView.clearFocus();
            return false;
        }
        return false;
    }
}
