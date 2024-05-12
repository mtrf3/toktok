package X;

import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.ss.android.ugc.aweme.lexical.platform.span.MentionSpan;

/* loaded from: classes8.dex */
public class GSV extends InputConnectionWrapper {
    public final GSU LIZ;
    public final /* synthetic */ GSU LIZIZ;

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        return super.finishComposingText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        int i;
        GSU gsu = this.LIZIZ;
        View.OnKeyListener onKeyListener = gsu.LLI;
        if (onKeyListener != null) {
            return onKeyListener.onKey(gsu, keyEvent.getKeyCode(), keyEvent);
        }
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
            int selectionStart = this.LIZ.getSelectionStart();
            C41545GSf LJIIL = this.LIZIZ.LJIIL(selectionStart, this.LIZ.getSelectionEnd());
            if (LJIIL == null) {
                this.LIZIZ.LJLJLJ = false;
                return super.sendKeyEvent(keyEvent);
            }
            GSU gsu2 = this.LIZIZ;
            if (gsu2.LJLJLJ || selectionStart == (i = LJIIL.LIZ)) {
                gsu2.LJLJLJ = false;
                return super.sendKeyEvent(keyEvent);
            }
            gsu2.LJLJLJ = true;
            gsu2.LJLJLLL = LJIIL;
            if (Build.VERSION.SDK_INT >= 25) {
                setSelection(i, LJIIL.LIZIZ);
            } else {
                setSelection(LJIIL.LIZIZ, i);
            }
            return true;
        }
        return super.sendKeyEvent(keyEvent);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        try {
            CharSequence LJIILL = this.LIZIZ.LJIILL(charSequence);
            if (this.LIZIZ.LJLLI) {
                return false;
            }
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) LJIILL;
            if (C41554GSo.LIZLLL(spannableStringBuilder.toString())) {
                if (this.LIZIZ.LJIIIIZZ(spannableStringBuilder.toString())) {
                    String spannableStringBuilder2 = spannableStringBuilder.toString();
                    GSU gsu = this.LIZIZ;
                    C41554GSo.LIZJ(gsu.LJLLILLLL, gsu.LJLLJ, gsu, spannableStringBuilder2);
                }
                return true;
            }
            return super.commitText(LJIILL, i);
        } catch (NullPointerException e) {
            C16880lQ.LLLLIIL(e);
            return true;
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        MentionSpan[] mentionSpanArr;
        int i3 = i;
        int i4 = i2;
        if (i3 == 1) {
            if (i4 == 0) {
                Editable text = this.LIZIZ.getText();
                if (text != null && text.length() > 0) {
                    GSU gsu = this.LIZIZ;
                    gsu.getClass();
                    int length = text.length();
                    int max = Math.max(gsu.getSelectionStart() - i3, 0);
                    int min = Math.min(gsu.getSelectionEnd(), length);
                    int i5 = max;
                    int i6 = min;
                    boolean z = false;
                    boolean z2 = false;
                    for (CharacterStyle characterStyle : (CharacterStyle[]) text.getSpans(0, length, CharacterStyle.class)) {
                        if ((!(characterStyle instanceof MentionSpan) || ((MentionSpan) characterStyle).mType != 1) && !(characterStyle instanceof StyleSpan)) {
                            int spanStart = text.getSpanStart(characterStyle);
                            int spanEnd = text.getSpanEnd(characterStyle);
                            if (!z && spanStart <= max && spanEnd > max) {
                                i5 = spanStart;
                                z = true;
                            }
                            if (!z2 && spanStart < min && spanEnd >= min) {
                                i6 = spanEnd;
                                z2 = true;
                            }
                            if (z && z2) {
                                break;
                            }
                        }
                    }
                    if (i5 > i6) {
                        int i7 = i6;
                        i6 = i5;
                        i5 = i7;
                    }
                    C41545GSf LJIIL = this.LIZIZ.LJIIL(i5, i6);
                    if (LJIIL != null && (mentionSpanArr = (MentionSpan[]) text.getSpans(LJIIL.LIZ, LJIIL.LIZIZ, MentionSpan.class)) != null && mentionSpanArr.length > 0) {
                        if (sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67))) {
                            return true;
                        }
                        return false;
                    }
                    text.delete(i5, i6);
                }
                return false;
            }
        } else if (i3 < 0) {
            int i8 = -i4;
            i4 = -i3;
            i3 = i8;
        }
        return super.deleteSurroundingText(i3, i4);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        GSU gsu = this.LIZ;
        if (gsu != null && gsu.LJLLI) {
            return false;
        }
        return super.setComposingText(this.LIZIZ.LJIILL(charSequence), i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GSV(GSU gsu, InputConnection inputConnection, GSU gsu2) {
        super(inputConnection, true);
        this.LIZIZ = gsu;
        this.LIZ = gsu2;
    }
}
