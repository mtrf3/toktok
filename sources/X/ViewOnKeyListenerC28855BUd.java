package X;

import android.view.KeyEvent;
import android.view.View;
import com.bytedance.android.livesdk.qa.AskQuestionDialog;

/* renamed from: X.BUd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnKeyListenerC28855BUd implements View.OnKeyListener {
    public final /* synthetic */ AskQuestionDialog LJLIL;

    public ViewOnKeyListenerC28855BUd(AskQuestionDialog askQuestionDialog) {
        this.LJLIL = askQuestionDialog;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (66 != i) {
            return false;
        }
        if (1 == keyEvent.getAction()) {
            this.LJLIL.xl(false);
        }
        return true;
    }
}
