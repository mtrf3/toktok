package Y;

import X.C116484hg;
import X.C26338AVi;
import X.C32151Nz;
import X.FMX;
import X.O6R;
import X.SY4;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import com.ss.android.ugc.aweme.account.login.email.EmailPopUpFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BindEmailWithoutVerifyFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetAvatarNicknameFragment;
import com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell;
import com.ss.android.ugc.aweme.util.CountDownTimer;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class IDObjectS186S0100000_15 implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void afterTextChanged$2(IDObjectS186S0100000_15 iDObjectS186S0100000_15, Editable editable) {
    }

    public static final void beforeTextChanged$1(IDObjectS186S0100000_15 iDObjectS186S0100000_15, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(IDObjectS186S0100000_15 iDObjectS186S0100000_15, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$3(IDObjectS186S0100000_15 iDObjectS186S0100000_15, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$3(IDObjectS186S0100000_15 iDObjectS186S0100000_15, CharSequence charSequence, int i, int i2, int i3) {
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
                o.LJIIIZ(charSequence, "s");
                return;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                return;
            case 2:
                beforeTextChanged$2(this, charSequence, i, i2, i3);
                return;
            case 3:
                beforeTextChanged$3(this, charSequence, i, i2, i3);
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
                onTextChanged$2(this, charSequence, i, i2, i3);
                return;
            case 3:
                onTextChanged$3(this, charSequence, i, i2, i3);
                return;
            default:
                return;
        }
    }

    public IDObjectS186S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$0(IDObjectS186S0100000_15 iDObjectS186S0100000_15, Editable s) {
        o.LJIIIZ(s, "s");
        SY4 Sl = ((SetAvatarNicknameFragment) iDObjectS186S0100000_15.l0).Sl();
        boolean z = false;
        if (s.length() > 0 || ((SetAvatarNicknameFragment) iDObjectS186S0100000_15.l0).LLIFFJFJJ) {
            z = true;
        }
        Sl.setEnabled(z);
        SetAvatarNicknameFragment setAvatarNicknameFragment = (SetAvatarNicknameFragment) iDObjectS186S0100000_15.l0;
        if (!setAvatarNicknameFragment.LLILIL) {
            setAvatarNicknameFragment.LLILIL = true;
            FMX.LJIIL("start_nickname_typing", setAvatarNicknameFragment.Rl().LIZ);
        }
    }

    public static final void afterTextChanged$1(IDObjectS186S0100000_15 iDObjectS186S0100000_15, Editable editable) {
        View inputEmailDomainHint = ((EmailPopUpFragment) iDObjectS186S0100000_15.l0)._$_findCachedViewById(R.id.eny);
        o.LJIIIIZZ(inputEmailDomainHint, "inputEmailDomainHint");
        C26338AVi.LJI(inputEmailDomainHint, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(30))), null, null, false, 29);
    }

    public static final void afterTextChanged$3(IDObjectS186S0100000_15 iDObjectS186S0100000_15, Editable editable) {
        ((DefaultMixListCell) iDObjectS186S0100000_15.l0).M();
        ((DefaultMixListCell) iDObjectS186S0100000_15.l0).P();
        CountDownTimer countDownTimer = ((DefaultMixListCell) iDObjectS186S0100000_15.l0).LJLJLJ;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            CountDownTimer countDownTimer2 = ((DefaultMixListCell) iDObjectS186S0100000_15.l0).LJLJLJ;
            if (countDownTimer2 != null) {
                countDownTimer2.start();
                return;
            } else {
                o.LJIJI("timer");
                throw null;
            }
        }
        o.LJIJI("timer");
        throw null;
    }

    public static final void onTextChanged$0(IDObjectS186S0100000_15 iDObjectS186S0100000_15, CharSequence s, int i, int i2, int i3) {
        o.LJIIIZ(s, "s");
        ((SetAvatarNicknameFragment) iDObjectS186S0100000_15.l0).Zl();
    }

    public static final void onTextChanged$1(IDObjectS186S0100000_15 iDObjectS186S0100000_15, CharSequence charSequence, int i, int i2, int i3) {
        if (TextUtils.isEmpty(charSequence)) {
            ((EmailPopUpFragment) iDObjectS186S0100000_15.l0)._$_findCachedViewById(R.id.eny).setVisibility(8);
        } else {
            ((EmailPopUpFragment) iDObjectS186S0100000_15.l0)._$_findCachedViewById(R.id.eny).setVisibility(0);
        }
    }

    public static final void onTextChanged$2(IDObjectS186S0100000_15 iDObjectS186S0100000_15, CharSequence charSequence, int i, int i2, int i3) {
        BindEmailWithoutVerifyFragment bindEmailWithoutVerifyFragment = (BindEmailWithoutVerifyFragment) iDObjectS186S0100000_15.l0;
        if (!bindEmailWithoutVerifyFragment.LLII) {
            C116484hg.LIZ("enter_from", bindEmailWithoutVerifyFragment.LJJLIIIJJI(), "start_email_typing");
            ((BindEmailWithoutVerifyFragment) iDObjectS186S0100000_15.l0).LLII = true;
        }
    }
}
