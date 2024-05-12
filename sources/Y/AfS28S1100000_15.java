package Y;

import X.C69084R9k;
import X.C69093R9t;
import X.C85528XhU;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.R5Q;
import com.ss.android.ugc.aweme.account.bind.BindEmailFragment;
import com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login.RuInstantLoginSIModeFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputEmailFragment;
import com.ss.android.ugc.aweme.account.verify.ConfirmEmailFragment;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;

/* loaded from: classes16.dex */
public class AfS28S1100000_15 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public String s0;

    public static final void accept$3(AfS28S1100000_15 afS28S1100000_15, Object obj) {
        ((SettingNewVersionFragment) afS28S1100000_15.l1).lambda$deleteSmartLockAccount$117(afS28S1100000_15.s0, (Throwable) obj);
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS28S1100000_15 afS28S1100000_15, Object obj) {
        ((InputEmailFragment) afS28S1100000_15.l1).Ql(afS28S1100000_15.s0, true);
    }

    public static final void accept$1(AfS28S1100000_15 afS28S1100000_15, Object obj) {
        ((BindEmailFragment) afS28S1100000_15.l1).hm(afS28S1100000_15.s0, true);
    }

    public static final void accept$2(AfS28S1100000_15 afS28S1100000_15, Object obj) {
        ((ConfirmEmailFragment) afS28S1100000_15.l1).hm(afS28S1100000_15.s0, true);
    }

    public static final void accept$4(AfS28S1100000_15 afS28S1100000_15, Object obj) {
        RuInstantLoginSIModeFragment ruInstantLoginSIModeFragment = (RuInstantLoginSIModeFragment) afS28S1100000_15.l1;
        C69093R9t.LJJ(ruInstantLoginSIModeFragment, ruInstantLoginSIModeFragment, afS28S1100000_15.s0, ruInstantLoginSIModeFragment.xl(), ((RuInstantLoginSIModeFragment) afS28S1100000_15.l1).Al(), "user_click", null, 256).LJIIIZ(new AfS67S0100000_15((RuInstantLoginSIModeFragment) afS28S1100000_15.l1, 63)).LJFF(new IDaS224S0100000_15((RuInstantLoginSIModeFragment) afS28S1100000_15.l1, 8)).LJIILL();
    }

    public static final void accept$5(AfS28S1100000_15 afS28S1100000_15, Object obj) {
        C69084R9k c69084R9k;
        Throwable th = (Throwable) obj;
        if (th instanceof C69084R9k) {
            c69084R9k = (C69084R9k) th;
        } else {
            c69084R9k = null;
        }
        if (c69084R9k != null) {
            R5Q.LIZIZ(Integer.valueOf(c69084R9k.getErrorCode()), afS28S1100000_15.s0, false);
        }
        ((InterfaceC65784Pro) afS28S1100000_15.l1).invoke();
        C85528XhU.LIZ = false;
    }

    public AfS28S1100000_15(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
