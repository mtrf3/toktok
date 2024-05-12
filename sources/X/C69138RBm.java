package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.verify.VerifyEmailCodeFragment;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.RBm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69138RBm<T> implements InterfaceC64592gB {
    public final /* synthetic */ VerifyEmailCodeFragment LJLIL;

    public C69138RBm(VerifyEmailCodeFragment verifyEmailCodeFragment) {
        this.LJLIL = verifyEmailCodeFragment;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C69032R7k c69032R7k = (C69032R7k) obj;
        VerifyEmailCodeFragment verifyEmailCodeFragment = this.LJLIL;
        RC0.LJI(verifyEmailCodeFragment.LLIIIILZ, verifyEmailCodeFragment.LLIIII);
        if (this.LJLIL.xl() == EnumC69116RAq.MODIFY_PHONE) {
            VerifyEmailCodeFragment verifyEmailCodeFragment2 = this.LJLIL;
            Bundle arguments = verifyEmailCodeFragment2.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", EnumC69113RAn.INPUT_PHONE_MODIFY.getValue());
            arguments.putString("ticket", c69032R7k.LJIIIZ);
            verifyEmailCodeFragment2.rh(arguments);
            return;
        }
        R41.LIZJ().setEmailVerified(true);
        if (this.LJLIL.lm()) {
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZLLL("page", "Input Email Captcha");
            c35936E8m.LIZLLL("method", "verify_email");
            c35936E8m.LIZIZ(System.currentTimeMillis() - this.LJLIL.LJLIL, "duration");
            FMX.LJIIL("set_up_proAccount", c35936E8m.LIZ);
        }
        Bundle arguments2 = this.LJLIL.getArguments();
        o.LJI(arguments2);
        if (arguments2.getBoolean("show_success_toast", true)) {
            C5S1 c5s1 = new C5S1(C58725N2z.LIZ);
            c5s1.LIZLLL(this.LJLIL.getString(R.string.g22));
            c5s1.LJ();
            Bundle arguments3 = this.LJLIL.getArguments();
            String str6 = null;
            if (arguments3 != null) {
                str = arguments3.getString("enter_from", "");
            } else {
                str = null;
            }
            Bundle arguments4 = this.LJLIL.getArguments();
            if (arguments4 != null) {
                str2 = arguments4.getString("enter_method", "");
            } else {
                str2 = null;
            }
            Bundle arguments5 = this.LJLIL.getArguments();
            if (arguments5 != null) {
                str3 = arguments5.getString("page", "");
            } else {
                str3 = null;
            }
            C1JD.LJJI("email_bind_status", str, str2, str3, "verified_old_email");
            Bundle arguments6 = this.LJLIL.getArguments();
            if (arguments6 != null) {
                str4 = arguments6.getString("enter_from", "");
            } else {
                str4 = null;
            }
            Bundle arguments7 = this.LJLIL.getArguments();
            if (arguments7 != null) {
                str5 = arguments7.getString("enter_method", "");
            } else {
                str5 = null;
            }
            Bundle arguments8 = this.LJLIL.getArguments();
            if (arguments8 != null) {
                str6 = arguments8.getString("page", "");
            }
            C1JD.LJJI("email_bind_status", str4, str5, str6, "changed_to_new_email");
        }
        FMX.LJIIL(this.LJLIL.LLIIIZ, new HashMap());
        Bundle bundle = new Bundle();
        bundle.putString("platform", "email");
        String str7 = c69032R7k.LJIIIZ;
        o.LJIIIIZZ(str7, "it.ticket");
        RBV.LJIILL(bundle, str7);
        Bundle arguments9 = this.LJLIL.getArguments();
        o.LJI(arguments9);
        arguments9.putBundle("final_data", bundle);
        VerifyEmailCodeFragment verifyEmailCodeFragment3 = this.LJLIL;
        Bundle arguments10 = verifyEmailCodeFragment3.getArguments();
        o.LJI(arguments10);
        verifyEmailCodeFragment3.Dl(arguments10);
    }
}
