package Y;

import X.C252949wI;
import X.C34K;
import X.C35936E8m;
import X.C74088T5w;
import X.FMX;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetNicknameFragment;
import com.ss.android.ugc.aweme.relation.fragment.AddPhoneNumberSheetFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class IDObjectS123S0200000_15 implements TextWatcher {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void beforeTextChanged$1(IDObjectS123S0200000_15 iDObjectS123S0200000_15, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(IDObjectS123S0200000_15 iDObjectS123S0200000_15, CharSequence charSequence, int i, int i2, int i3) {
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
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(charSequence, "s");
                return;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
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
            default:
                return;
        }
    }

    public static final void afterTextChanged$0(IDObjectS123S0200000_15 iDObjectS123S0200000_15, Editable s) {
        boolean z;
        o.LJIIIZ(s, "s");
        C74088T5w c74088T5w = (C74088T5w) ((SetNicknameFragment) iDObjectS123S0200000_15.l0)._$_findCachedViewById(R.id.jqd);
        if (c74088T5w != null) {
            if (s.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            c74088T5w.setEnabled(z);
        }
        SetNicknameFragment setNicknameFragment = (SetNicknameFragment) iDObjectS123S0200000_15.l0;
        if (!setNicknameFragment.LLFFF) {
            setNicknameFragment.LLFFF = true;
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZLLL("enter_from", ((SetNicknameFragment) iDObjectS123S0200000_15.l0).getEnterFrom());
            c35936E8m.LIZLLL("enter_method", ((SetNicknameFragment) iDObjectS123S0200000_15.l0).getEnterMethod());
            c35936E8m.LIZLLL("platform", ((SetNicknameFragment) iDObjectS123S0200000_15.l0).LLFII);
            c35936E8m.LIZLLL("login_panel_type", "signup");
            FMX.LJIIL("start_nickname_typing", c35936E8m.LIZ);
        }
        if (s.length() > 30) {
            C34K c34k = (C34K) iDObjectS123S0200000_15.l1;
            if (c34k.element) {
                c34k.element = false;
                s.delete(30, s.length());
            }
        }
    }

    public static final void afterTextChanged$1(IDObjectS123S0200000_15 iDObjectS123S0200000_15, Editable editable) {
        boolean z;
        C74088T5w c74088T5w = (C74088T5w) ((AddPhoneNumberSheetFragment) iDObjectS123S0200000_15.l0)._$_findCachedViewById(R.id.eo5);
        if (c74088T5w != null) {
            Editable text = ((EditText) iDObjectS123S0200000_15.l1).getText();
            o.LJIIIIZZ(text, "text");
            if (text.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            c74088T5w.setEnabled(z);
        }
        C252949wI c252949wI = (C252949wI) ((AddPhoneNumberSheetFragment) iDObjectS123S0200000_15.l0)._$_findCachedViewById(R.id.eo8);
        if (c252949wI != null) {
            c252949wI.LIZ();
        }
    }

    public IDObjectS123S0200000_15(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onTextChanged$0(IDObjectS123S0200000_15 iDObjectS123S0200000_15, CharSequence s, int i, int i2, int i3) {
        o.LJIIIZ(s, "s");
        if (i == 0 && i3 - i2 >= 2) {
            SetNicknameFragment setNicknameFragment = (SetNicknameFragment) iDObjectS123S0200000_15.l0;
            if (setNicknameFragment.LLIFFJFJJ) {
                if (!o.LJ(s.toString(), ((SetNicknameFragment) iDObjectS123S0200000_15.l0).LLII)) {
                    ((SetNicknameFragment) iDObjectS123S0200000_15.l0).LLIIII = true;
                }
            } else {
                setNicknameFragment.LLIIIILZ = true;
                ((C34K) iDObjectS123S0200000_15.l1).element = true;
            }
        } else {
            ((SetNicknameFragment) iDObjectS123S0200000_15.l0).LLIIII = true;
        }
        ((SetNicknameFragment) iDObjectS123S0200000_15.l0).Sl();
    }
}
