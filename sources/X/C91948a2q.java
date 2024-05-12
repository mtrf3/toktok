package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.a2q, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91948a2q implements TextView.OnEditorActionListener {
    public final /* synthetic */ C26018AJa LJLIL;

    public C91948a2q(C26018AJa c26018AJa) {
        this.LJLIL = c26018AJa;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            this.LJLIL.findViewById(R.id.cps).clearFocus();
            return false;
        }
        return false;
    }
}
