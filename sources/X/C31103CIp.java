package X;

import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* renamed from: X.CIp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31103CIp extends InputConnectionWrapper {
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        try {
            super.closeConnection();
        } catch (Exception e) {
            C0K2.LIZ("CommentEditText NPE", e);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        try {
            return super.getHandler();
        } catch (Exception e) {
            C0K2.LIZ("CommentEditText NPE", e);
            return null;
        }
    }

    public C31103CIp(InputConnection inputConnection) {
        super(inputConnection, true);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = false;
        if (charSequence.equals("\n")) {
            sendKeyEvent(new KeyEvent(1, 66));
            return false;
        }
        try {
            z = super.commitText(charSequence, i);
            return z;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CommentEditText commitText Exception, text:");
            LIZ.append((Object) charSequence);
            LIZ.append("  newCursorPosition:");
            LIZ.append(i);
            String LIZIZ = X1D.LIZIZ(LIZ);
            C0NB.LIZIZ("CommentEditText_commitText", LIZIZ);
            C0K2.LIZ(LIZIZ, e);
            return z;
        }
    }
}
