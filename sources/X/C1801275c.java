package X;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.ss.android.ugc.aweme.comment.experiment.PersonalizedEmojiExperiment;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.zhiliaoapp.musically.R;

/* renamed from: X.75c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1801275c implements InterfaceC106584Gg {
    public final int LIZ;
    public final EditText LIZIZ;
    public final InputConnection LIZJ;
    public final InterfaceC1801475e LIZLLL;

    @Override // X.InterfaceC106584Gg
    public final void LLLLIIIILLL() {
        this.LIZLLL.LLLLIIIILLL();
    }

    @Override // X.InterfaceC106584Gg
    public final void LLLLLZIL() {
        KeyEvent keyEvent = new KeyEvent(0, 67);
        InputConnection inputConnection = this.LIZJ;
        if (inputConnection != null) {
            inputConnection.sendKeyEvent(keyEvent);
        } else {
            this.LIZIZ.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // X.InterfaceC106584Gg
    public final void LIZ(View view, C105454Bx c105454Bx) {
        this.LIZLLL.Pa(view, c105454Bx.LIZJ);
    }

    public C1801275c(EditText editText, int i, InterfaceC1801475e interfaceC1801475e) {
        this.LIZIZ = editText;
        this.LIZJ = editText.onCreateInputConnection(new EditorInfo());
        this.LIZ = i;
        this.LIZLLL = interfaceC1801475e;
    }

    @Override // X.InterfaceC106584Gg
    public final void LIZIZ(CommentPersonalizedEmoji commentPersonalizedEmoji, int i, int i2) {
        String emoji = commentPersonalizedEmoji.getEmoji();
        if (emoji == null) {
            return;
        }
        C74Z.LJJIIJZLJL(emoji, commentPersonalizedEmoji.getSource(), 1, commentPersonalizedEmoji.getScore(), commentPersonalizedEmoji.getStrategy());
        if (PersonalizedEmojiExperiment.LIZIZ()) {
            C75W.LIZ(emoji);
        }
        if (this.LIZLLL.Q0(emoji)) {
            return;
        }
        if (emoji.length() + this.LIZIZ.getText().length() > this.LIZ) {
            String string = C1791471i.LIZ.getResources().getString(R.string.cm8);
            C26045AKb c26045AKb = new C26045AKb(this.LIZIZ);
            c26045AKb.LJIIIZ(string);
            c26045AKb.LJIIJ();
            return;
        }
        if (i == 2) {
            this.LIZLLL.onEmojiClick(emoji, i, i2);
        }
        SpannableString LIZ = C1801075a.LIZ(commentPersonalizedEmoji);
        int selectionStart = this.LIZIZ.getSelectionStart();
        int selectionEnd = this.LIZIZ.getSelectionEnd();
        int max = Math.max(0, selectionStart);
        int max2 = Math.max(0, selectionEnd);
        if (max == max2) {
            this.LIZIZ.getText().insert(max, LIZ);
        } else {
            try {
                this.LIZIZ.getText().replace(max, max2, LIZ);
            } catch (IndexOutOfBoundsException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        int length = emoji.length() + max;
        if (length >= this.LIZIZ.length()) {
            EditText editText = this.LIZIZ;
            editText.setSelection(editText.length());
        } else {
            this.LIZIZ.setSelection(length);
        }
    }

    @Override // X.InterfaceC106584Gg
    public final void LIZJ(int i, int i2, String str) {
        if (i == 2) {
            C74Z.LJJIIJZLJL(str, "exposed_emoji", 1, 0, "");
        } else if (i == 1) {
            C74Z.LJJIIJZLJL(str, "emoji_board", 1, 0, "");
        }
        if (PersonalizedEmojiExperiment.LIZIZ()) {
            C75W.LIZ(str);
        }
        if (this.LIZLLL.Q0(str)) {
            return;
        }
        if (str.length() + this.LIZIZ.getText().length() > this.LIZ) {
            String string = C1791471i.LIZ.getResources().getString(R.string.cm8);
            C5S1 c5s1 = new C5S1(C1791471i.LIZ);
            c5s1.LIZLLL(string);
            c5s1.LJ();
            return;
        }
        if (i == 2) {
            this.LIZLLL.onEmojiClick(str, i, i2);
        }
        int selectionStart = this.LIZIZ.getSelectionStart();
        int selectionEnd = this.LIZIZ.getSelectionEnd();
        int max = Math.max(0, selectionStart);
        int max2 = Math.max(0, selectionEnd);
        if (max == max2) {
            this.LIZIZ.getText().insert(max, str);
        } else {
            try {
                this.LIZIZ.getText().replace(max, max2, str);
            } catch (IndexOutOfBoundsException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        int length = str.length() + max;
        if (length >= this.LIZIZ.length()) {
            EditText editText = this.LIZIZ;
            editText.setSelection(editText.length());
        } else {
            this.LIZIZ.setSelection(length);
        }
    }
}
