package Y;

import X.AnonymousClass195;
import X.C08780Wc;
import X.C0WB;
import X.C0YJ;
import X.C12880ey;
import X.C19K;
import X.C1TQ;
import X.C29306Beo;
import X.C30868C9o;
import X.C42681lw;
import X.C54252Az;
import X.XKX;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.effect.input.EffectTextInputFragment;
import com.bytedance.android.live.effect.karaoke.view.library.KaraokeLibraryFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDObjectS173S0100000 implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void afterTextChanged$0(IDObjectS173S0100000 iDObjectS173S0100000, Editable editable) {
    }

    public static final void beforeTextChanged$0(IDObjectS173S0100000 iDObjectS173S0100000, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(IDObjectS173S0100000 iDObjectS173S0100000, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(IDObjectS173S0100000 iDObjectS173S0100000, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                return;
            case 1:
                afterTextChanged$1(this, editable);
                return;
            case 2:
                afterTextChanged$2(this, editable);
                return;
            case 3:
                afterTextChanged$3(this, editable);
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                return;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                return;
            case 2:
                o.LJIIIZ(charSequence, "s");
                return;
            case 3:
                o.LJIIIZ(charSequence, "s");
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                return;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                return;
            case 2:
                o.LJIIIZ(charSequence, "s");
                return;
            case 3:
                onTextChanged$3(this, charSequence, i, i2, i3);
                return;
            default:
                return;
        }
    }

    public IDObjectS173S0100000(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$1(IDObjectS173S0100000 iDObjectS173S0100000, Editable editable) {
        boolean z;
        KaraokeLibraryFragment karaokeLibraryFragment = (KaraokeLibraryFragment) iDObjectS173S0100000.l0;
        karaokeLibraryFragment.getClass();
        if (editable != null) {
            if (editable.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                View view = karaokeLibraryFragment.LJLJI;
                if (view != null) {
                    C29306Beo.LJI(view);
                } else {
                    o.LJIJI("clearSearchBtn");
                    throw null;
                }
            } else {
                View view2 = karaokeLibraryFragment.LJLJI;
                if (view2 != null) {
                    C29306Beo.LJJLJLI(view2);
                } else {
                    o.LJIJI("clearSearchBtn");
                    throw null;
                }
            }
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(karaokeLibraryFragment), null, null, new C54252Az(karaokeLibraryFragment, editable, null), 3);
        }
    }

    public static final void afterTextChanged$2(IDObjectS173S0100000 iDObjectS173S0100000, Editable s) {
        String obj;
        int i;
        o.LJIIIZ(s, "s");
        Editable text = ((C19K) ((C1TQ) iDObjectS173S0100000.l0).LJFF(R.id.amo)).getText();
        if (text == null || (obj = text.toString()) == null) {
            return;
        }
        View LJFF = ((C1TQ) iDObjectS173S0100000.l0).LJFF(R.id.amp);
        if (obj.length() == 0) {
            i = 0;
        } else {
            i = 8;
        }
        LJFF.setVisibility(i);
        if (obj.length() > ((C1TQ) iDObjectS173S0100000.l0).getMaxSingleWordLength$livebroadcast_api_release()) {
            C30868C9o.LIZJ(R.string.mil);
            C1TQ c1tq = (C1TQ) iDObjectS173S0100000.l0;
            TextView block_word_edit_text = (TextView) c1tq.LJFF(R.id.amo);
            o.LJIIIIZZ(block_word_edit_text, "block_word_edit_text");
            int length = obj.length();
            c1tq.getClass();
            InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(length);
            c1tq.LJLILLLLZI = lengthFilter;
            block_word_edit_text.setFilters(new InputFilter.LengthFilter[]{lengthFilter});
            String substring = obj.substring(0, ((C1TQ) iDObjectS173S0100000.l0).getMaxSingleWordLength$livebroadcast_api_release());
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            ((TextView) ((C1TQ) iDObjectS173S0100000.l0).LJFF(R.id.amo)).setText(substring);
            ((EditText) ((C1TQ) iDObjectS173S0100000.l0).LJFF(R.id.amo)).setSelection(substring.length());
            return;
        }
        C1TQ c1tq2 = (C1TQ) iDObjectS173S0100000.l0;
        TextView block_word_edit_text2 = (TextView) c1tq2.LJFF(R.id.amo);
        o.LJIIIIZZ(block_word_edit_text2, "block_word_edit_text");
        c1tq2.getClass();
        if (c1tq2.LJLILLLLZI == null) {
            return;
        }
        block_word_edit_text2.setFilters(new InputFilter[0]);
        c1tq2.LJLILLLLZI = null;
    }

    public static final void afterTextChanged$3(IDObjectS173S0100000 iDObjectS173S0100000, Editable editable) {
        C0WB c0wb;
        int length;
        EditText editText = (EditText) ((EffectTextInputFragment) iDObjectS173S0100000.l0)._$_findCachedViewById(R.id.cq8);
        if (editable != null && editText != null) {
            int selectionStart = editText.getSelectionStart();
            int selectionEnd = editText.getSelectionEnd();
            int length2 = editable.toString().length();
            EffectTextInputFragment effectTextInputFragment = (EffectTextInputFragment) iDObjectS173S0100000.l0;
            int i = effectTextInputFragment.LJLIL;
            if (length2 > i && i > 0) {
                String obj = editable.toString();
                int i2 = selectionStart - 1;
                if (i2 < 0 || selectionEnd < 0 || selectionEnd < i2 || i2 > (length = obj.length()) || selectionEnd > length) {
                    editable.delete(((EffectTextInputFragment) iDObjectS173S0100000.l0).LJLIL, editable.toString().length());
                } else {
                    editable.delete(i2, selectionEnd);
                }
                editText.setText(editable);
                editText.setSelection(editable.toString().length());
                return;
            }
            String obj2 = editable.toString();
            C0YJ c0yj = effectTextInputFragment.LJLJJI;
            if (c0yj == null) {
                return;
            }
            C42681lw LIZ = C12880ey.LIZ();
            int i3 = c0yj.LIZ;
            int i4 = c0yj.LIZIZ;
            String str = c0yj.LIZJ;
            C08780Wc c08780Wc = LIZ.LJ;
            if (c08780Wc == null || (c0wb = c08780Wc.LIZJ) == null) {
                return;
            }
            c0wb.LIZLLL(i3, i4, obj2, str);
        }
    }

    public static final void onTextChanged$0(IDObjectS173S0100000 iDObjectS173S0100000, CharSequence charSequence, int i, int i2, int i3) {
        AnonymousClass195 anonymousClass195 = (AnonymousClass195) iDObjectS173S0100000.l0;
        Editable text = anonymousClass195.LJLLLLLL.getText();
        anonymousClass195.LLILLL = text;
        boolean z = !TextUtils.isEmpty(text);
        anonymousClass195.LJIJJLI(z);
        boolean z2 = !z;
        int i4 = 8;
        if (anonymousClass195.LLILLJJLI && !anonymousClass195.LLIILZL && z2) {
            anonymousClass195.LL.setVisibility(8);
            i4 = 0;
        }
        anonymousClass195.LLF.setVisibility(i4);
        anonymousClass195.LJIIZILJ();
        anonymousClass195.LJIJJ();
        charSequence.toString();
    }

    public static final void onTextChanged$3(IDObjectS173S0100000 iDObjectS173S0100000, CharSequence s, int i, int i2, int i3) {
        o.LJIIIZ(s, "s");
        EffectTextInputFragment effectTextInputFragment = (EffectTextInputFragment) iDObjectS173S0100000.l0;
        s.toString();
        effectTextInputFragment.getClass();
    }
}
