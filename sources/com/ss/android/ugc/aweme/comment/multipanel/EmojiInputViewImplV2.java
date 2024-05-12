package com.ss.android.ugc.aweme.comment.multipanel;

import X.C105374Bp;
import X.C105454Bx;
import X.C16880lQ;
import X.C1801075a;
import X.C221108m2;
import X.C224748ru;
import X.C26045AKb;
import X.C5S1;
import X.C62822Ol8;
import X.C74Z;
import X.C75W;
import X.EF7;
import X.InterfaceC105344Bm;
import X.InterfaceC1801475e;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.comment.experiment.PersonalizedEmojiExperiment;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class EmojiInputViewImplV2 implements InterfaceC105344Bm {
    public final EditText LJLIL;
    public final int LJLILLLLZI;
    public final InterfaceC1801475e LJLJI;
    public final C62822Ol8 LJLJJI;

    @Override // X.InterfaceC105344Bm
    public final void LLLZLZ(C105454Bx c105454Bx) {
    }

    @Override // X.InterfaceC105344Bm
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public /* bridge */ /* synthetic */ void onDestroy() {
        C105374Bp.LIZ(this);
    }

    @Override // X.InterfaceC105344Bm
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public /* bridge */ /* synthetic */ void onPause() {
        C105374Bp.LIZIZ(this);
    }

    @Override // X.InterfaceC105344Bm
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public /* bridge */ /* synthetic */ void onResume() {
        C105374Bp.LIZJ(this);
    }

    @Override // X.InterfaceC105344Bm
    public final void LLLLLZIL() {
        KeyEvent keyEvent = new KeyEvent(0, 67);
        if (this.LJLJJI.getValue() != null) {
            InputConnection inputConnection = (InputConnection) this.LJLJJI.getValue();
            if (inputConnection != null) {
                inputConnection.sendKeyEvent(keyEvent);
                return;
            }
            return;
        }
        this.LJLIL.dispatchKeyEvent(keyEvent);
    }

    @Override // X.InterfaceC105344Bm
    public final void Cf(String emojiText) {
        o.LJIIIZ(emojiText, "emojiText");
        C74Z.LJJIIJZLJL(emojiText, "emoji_board", 1, 0, "");
        if (PersonalizedEmojiExperiment.LIZIZ()) {
            C75W.LIZ(emojiText);
        }
        if (this.LJLJI.Q0(emojiText)) {
            return;
        }
        if (emojiText.length() + this.LJLIL.getText().length() > this.LJLILLLLZI) {
            String string = EF7.LIZIZ().getResources().getString(R.string.qim, Integer.valueOf(this.LJLILLLLZI));
            o.LJIIIIZZ(string, "AppContextManager.getApp…sage_overflow, maxLength)");
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZLLL(string);
            c5s1.LJ();
            return;
        }
        int selectionStart = this.LJLIL.getSelectionStart();
        int selectionEnd = this.LJLIL.getSelectionEnd();
        int max = Math.max(0, selectionStart);
        int max2 = Math.max(0, selectionEnd);
        if (max == max2) {
            this.LJLIL.getText().insert(max, emojiText);
        } else {
            try {
                this.LJLIL.getText().replace(max, max2, emojiText);
            } catch (IndexOutOfBoundsException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        int length = emojiText.length() + max;
        if (length >= this.LJLIL.length()) {
            EditText editText = this.LJLIL;
            editText.setSelection(editText.length());
        } else {
            this.LJLIL.setSelection(length);
        }
    }

    @Override // X.InterfaceC105344Bm
    public final void j2(CommentPersonalizedEmoji commentPersonalizedEmoji) {
        String emoji;
        if (commentPersonalizedEmoji == null || (emoji = commentPersonalizedEmoji.getEmoji()) == null) {
            return;
        }
        C74Z.LJJIIJZLJL(emoji, commentPersonalizedEmoji.getSource(), 1, commentPersonalizedEmoji.getScore(), commentPersonalizedEmoji.getStrategy());
        if (PersonalizedEmojiExperiment.LIZIZ()) {
            C75W.LIZ(emoji);
        }
        if (this.LJLJI.Q0(emoji)) {
            return;
        }
        if (emoji.length() + this.LJLIL.getText().length() > this.LJLILLLLZI) {
            String string = EF7.LIZIZ().getResources().getString(R.string.qim, Integer.valueOf(this.LJLILLLLZI));
            o.LJIIIIZZ(string, "AppContextManager.getApp…sage_overflow, maxLength)");
            C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
            c26045AKb.LJIIIZ(string);
            c26045AKb.LJIIJ();
            return;
        }
        SpannableString LIZ = C1801075a.LIZ(commentPersonalizedEmoji);
        int selectionStart = this.LJLIL.getSelectionStart();
        int selectionEnd = this.LJLIL.getSelectionEnd();
        int max = Math.max(0, selectionStart);
        int max2 = Math.max(0, selectionEnd);
        if (max == max2) {
            this.LJLIL.getText().insert(max, LIZ);
        } else {
            try {
                this.LJLIL.getText().replace(max, max2, LIZ);
            } catch (IndexOutOfBoundsException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        int length = emoji.length() + max;
        if (length >= this.LJLIL.length()) {
            EditText editText = this.LJLIL;
            editText.setSelection(editText.length());
        } else {
            this.LJLIL.setSelection(length);
        }
    }

    public EmojiInputViewImplV2(C224748ru mEditText, int i, InterfaceC1801475e listener) {
        o.LJIIIZ(mEditText, "mEditText");
        o.LJIIIZ(listener, "listener");
        this.LJLIL = mEditText;
        this.LJLILLLLZI = i;
        this.LJLJI = listener;
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1536));
    }
}
