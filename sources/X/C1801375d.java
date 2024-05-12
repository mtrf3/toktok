package X;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputConnection;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;

/* renamed from: X.75d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1801375d implements InterfaceC106584Gg {
    public final C224738rt LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1497));

    @Override // X.InterfaceC106584Gg
    public final void LIZ(View view, C105454Bx c105454Bx) {
    }

    @Override // X.InterfaceC106584Gg
    public final /* synthetic */ void LLLLIIIILLL() {
    }

    @Override // X.InterfaceC106584Gg
    public final void LLLLLZIL() {
        KeyEvent keyEvent = new KeyEvent(0, 67);
        if (this.LIZIZ.getValue() != null) {
            InputConnection inputConnection = (InputConnection) this.LIZIZ.getValue();
            if (inputConnection != null) {
                inputConnection.sendKeyEvent(keyEvent);
                return;
            }
            return;
        }
        this.LIZ.dispatchKeyEvent(keyEvent);
    }

    public C1801375d(C224738rt c224738rt) {
        this.LIZ = c224738rt;
    }

    @Override // X.InterfaceC106584Gg
    public final void LIZIZ(CommentPersonalizedEmoji commentPersonalizedEmoji, int i, int i2) {
        String str;
        if (commentPersonalizedEmoji != null) {
            str = commentPersonalizedEmoji.getEmoji();
        } else {
            str = null;
        }
        LIZJ(i, i2, str);
    }

    @Override // X.InterfaceC106584Gg
    public final void LIZJ(int i, int i2, String str) {
        int i3;
        if (str == null) {
            return;
        }
        Editable text = this.LIZ.getText();
        if (text != null) {
            i3 = text.length();
        } else {
            i3 = 0;
        }
        if (str.length() + i3 > ((Number) C7K7.LIZ.getValue()).intValue()) {
            C26045AKb c26045AKb = new C26045AKb(this.LIZ);
            c26045AKb.LJIIIIZZ(R.string.j__);
            c26045AKb.LJIIJ();
            return;
        }
        int selectionStart = this.LIZ.getSelectionStart();
        int selectionEnd = this.LIZ.getSelectionEnd();
        int max = Math.max(0, selectionStart);
        int max2 = Math.max(0, selectionEnd);
        if (max == max2) {
            Editable text2 = this.LIZ.getText();
            if (text2 != null) {
                text2.insert(max, str);
            }
        } else {
            try {
                Editable text3 = this.LIZ.getText();
                if (text3 != null) {
                    text3.replace(max, max2, str);
                }
            } catch (IndexOutOfBoundsException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        int length = str.length() + max;
        if (length >= this.LIZ.length()) {
            C224738rt c224738rt = this.LIZ;
            c224738rt.setSelection(c224738rt.length());
        } else {
            this.LIZ.setSelection(length);
        }
    }
}
