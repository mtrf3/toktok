package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* renamed from: X.RBk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69136RBk<T> implements InterfaceC64592gB {
    public final /* synthetic */ InputCodeFragment LJLIL;

    public C69136RBk(InputCodeFragment inputCodeFragment) {
        this.LJLIL = inputCodeFragment;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        R40 r40 = (R40) obj;
        RC0.LJI(this.LJLIL.cm(), this.LJLIL.LLILLIZIL);
        this.LJLIL.Xl(1, 0);
        if (((Boolean) this.LJLIL.LLIIZ.getValue()).booleanValue()) {
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZLLL("page", "Input Phone Captcha");
            c35936E8m.LIZLLL("method", "set_by_phone");
            c35936E8m.LIZIZ(System.currentTimeMillis() - this.LJLIL.LJLIL, "duration");
            FMX.LJIIL("set_up_proAccount", c35936E8m.LIZ);
        }
        InputCodeFragment inputCodeFragment = this.LJLIL;
        R9Z r9z = (R9Z) r40.LJIIIZ;
        inputCodeFragment.getClass();
        User LIZJ = R41.LIZJ();
        if (r9z != null) {
            C67046QTa c67046QTa = (C67046QTa) ((HashMap) r9z.LJFF.LIZIZ).get("mobile");
            if (c67046QTa != null) {
                str = c67046QTa.LIZJ;
            } else {
                str = "";
            }
            Bundle arguments = inputCodeFragment.getArguments();
            if (arguments == null || !arguments.getBoolean("is_mandatory_two_sv", false)) {
                LIZJ.setPhoneBinded(true);
                LIZJ.setBindPhone(str);
                if (r9z.LJFF.LIZ > 0) {
                    R41.LIZ().updateUserInfo(r9z.LJFF);
                }
            }
            if (str != null) {
                String jSONObject = r9z.LJFF.LJIIL.toString();
                o.LJIIIIZZ(jSONObject, "mobileObj.mUserInfo.rawData.toString()");
                R41.LJIIL(7, 1, new RC1(str, jSONObject));
            }
        }
        if (this.LJLIL.LJLL.getValue() == EnumC69113RAn.BIND_PHONE_ON_SIGN_UP_OR_LOGIN) {
            if (o.LJ(this.LJLIL.LLIIIILZ, "signup")) {
                C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
                c26045AKb.LJIIIZ(this.LJLIL.getString(R.string.qu0));
                c26045AKb.LJFF(R.raw.icon_tick_fill_small);
                c26045AKb.LJII(R.attr.e8);
                c26045AKb.LIZ(true);
                c26045AKb.LJIIJ();
            } else {
                Bundle arguments2 = this.LJLIL.getArguments();
                if (arguments2 != null) {
                    InputCodeFragment inputCodeFragment2 = this.LJLIL;
                    arguments2.putString("bind_pii_success_toast_text", inputCodeFragment2.getString(R.string.qu0));
                    inputCodeFragment2.rh(arguments2);
                }
            }
            Bundle arguments3 = this.LJLIL.getArguments();
            if (arguments3 != null) {
                arguments3.putBoolean("should_bind_phone", false);
            }
            if (o.LJ(this.LJLIL.LLIIIILZ, "login")) {
                InputCodeFragment inputCodeFragment3 = this.LJLIL;
                inputCodeFragment3.Zl(new AqS161S0100000_11(inputCodeFragment3, 34));
                return;
            } else {
                if (!o.LJ(this.LJLIL.LLIIIILZ, "signup")) {
                    return;
                }
                InputCodeFragment inputCodeFragment4 = this.LJLIL;
                inputCodeFragment4.Zl(new C69108RAi(inputCodeFragment4));
                return;
            }
        }
        InputCodeFragment viewCallback = this.LJLIL;
        o.LJIIIZ(viewCallback, "viewCallback");
        Bundle arguments4 = viewCallback.getArguments();
        if (arguments4 == null) {
            arguments4 = new Bundle();
        }
        viewCallback.Dl(arguments4);
        if (o.LJ(this.LJLIL.LJLLL.getValue(), Boolean.TRUE)) {
            ASQ.LJ(this.LJLIL, ASX.LIZ);
            C26045AKb c26045AKb2 = new C26045AKb(this.LJLIL);
            c26045AKb2.LJIIIIZZ(R.string.qu0);
            c26045AKb2.LJIIJ();
        }
    }
}
