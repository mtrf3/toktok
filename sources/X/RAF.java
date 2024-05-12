package X;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes12.dex */
public final class RAF implements DialogInterface.OnClickListener {
    public final /* synthetic */ RAH LJLIL;

    public RAF(RAH rah) {
        this.LJLIL = rah;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z;
        boolean z2;
        this.LJLIL.LIZIZ("create_account");
        if (TextUtils.isEmpty(this.LJLIL.LIZJ)) {
            RAH rah = this.LJLIL;
            InterfaceC69056R8i interfaceC69056R8i = rah.LIZIZ;
            String string = rah.LIZ.getString(R.string.img);
            o.LJIIIIZZ(string, "fragment.getString(R.string.network_unavailable)");
            interfaceC69056R8i.Sg(0, string);
            return;
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_method", "login");
        FMX.LJIIL("click_sign_up", c35936E8m.LIZ);
        Bundle arguments = this.LJLIL.LIZ.getArguments();
        if (arguments != null && arguments.getBoolean("age_gate_block")) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            RAH rah2 = this.LJLIL;
            InterfaceC69056R8i interfaceC69056R8i2 = rah2.LIZIZ;
            Bundle arguments2 = rah2.LIZ.getArguments();
            if (arguments2 == null) {
                arguments2 = new Bundle();
            }
            arguments2.putInt("next_page", EnumC69113RAn.FTC_CREATE_ACCOUNT.getValue());
            interfaceC69056R8i2.rh(arguments2);
            return;
        }
        EnumC62956OnI LJI = a.LIZIZ().LJI();
        this.LJLIL.getClass();
        if (Q7K.LIZIZ("login_flow_check_guest_mode", 0) == 0 && RBV.LIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((!z2) && a.LIZIZ().LIZ()) {
            C35936E8m c35936E8m2 = new C35936E8m();
            c35936E8m2.LIZ(LJI.getValue(), "register_age_gate_action");
            c35936E8m2.LIZ(1, "show");
            FMX.LJIIL("tns_phone_not_registered_age_gate_action", c35936E8m2.LIZ);
            RAH rah3 = this.LJLIL;
            InterfaceC69056R8i interfaceC69056R8i3 = rah3.LIZIZ;
            Bundle arguments3 = rah3.LIZ.getArguments();
            if (arguments3 == null) {
                arguments3 = new Bundle();
            }
            RAH rah4 = this.LJLIL;
            arguments3.putInt("next_page", EnumC69113RAn.AGE_GATE_LOGIN.getValue());
            arguments3.putString("sms_code_key", rah4.LIZJ);
            interfaceC69056R8i3.rh(arguments3);
            return;
        }
        C35936E8m c35936E8m3 = new C35936E8m();
        c35936E8m3.LIZ(LJI.getValue(), "register_age_gate_action");
        c35936E8m3.LIZ(0, "show");
        FMX.LJIIL("tns_phone_not_registered_age_gate_action", c35936E8m3.LIZ);
        if (a.LJIJI().LJFF()) {
            RAH rah5 = this.LJLIL;
            InterfaceC69056R8i interfaceC69056R8i4 = rah5.LIZIZ;
            Bundle arguments4 = rah5.LIZ.getArguments();
            if (arguments4 == null) {
                arguments4 = new Bundle();
            }
            RAH rah6 = this.LJLIL;
            arguments4.putInt("next_page", EnumC69113RAn.TERMS_CONSENT_NEW_PHONE_USER.getValue());
            arguments4.putString("sms_code_key", rah6.LIZJ);
            interfaceC69056R8i4.rh(arguments4);
            return;
        }
        PhoneNumberUtil.PhoneNumber LJ = RBV.LJ(this.LJLIL.LIZ);
        Bundle extras = this.LJLIL.LIZIZ.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.putBoolean("phone_signup", true);
        if (RAJ.LIZIZ()) {
            InterfaceC69056R8i interfaceC69056R8i5 = this.LJLIL.LIZIZ;
            Bundle extras2 = interfaceC69056R8i5.getExtras();
            if (extras2 == null) {
                extras2 = new Bundle();
            }
            RAH rah7 = this.LJLIL;
            extras2.putInt("next_page", EnumC69113RAn.AGE_GATE_SIGN_UP.getValue());
            extras2.putString("sms_code_key", rah7.LIZJ);
            interfaceC69056R8i5.rh(extras2);
            return;
        }
        RAH rah8 = this.LJLIL;
        Fragment fragment = rah8.LIZ;
        InterfaceC69056R8i interfaceC69056R8i6 = rah8.LIZIZ;
        String LIZ = PhoneNumberUtil.LIZ(LJ);
        o.LJIIIIZZ(LIZ, "formatNumber(phoneNumber)");
        RAH rah9 = this.LJLIL;
        C69093R9t.LJIILIIL(fragment, EnumC69116RAq.SIGN_UP, rah9.LIZIZ.LJLLLL(), interfaceC69056R8i6, LIZ, rah9.LIZJ, true).LJIILL();
    }
}
