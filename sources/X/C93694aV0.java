package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.aV0, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93694aV0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ C94459ahL LJLIL;

    public C93694aV0(C94459ahL c94459ahL) {
        this.LJLIL = c94459ahL;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.LJLIL.clearFocus();
        return true;
    }
}
