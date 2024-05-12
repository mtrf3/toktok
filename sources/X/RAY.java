package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.login.ui.CountDownTimer;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RAY extends AbstractC69088R9o {
    public final PhoneNumberUtil.PhoneNumber LIZJ;
    public final EnumC69116RAq LIZLLL;
    public final EnumC69113RAn LJ;

    @Override // X.AbstractC69088R9o
    public final boolean LIZ() {
        CountDownTimer countDownTimer;
        ActivityC45651qj mo49getActivity = this.LIZ.mo49getActivity();
        String LIZ = PhoneNumberUtil.LIZ(this.LIZJ);
        o.LJIIIIZZ(LIZ, "formatNumber(phoneNumber)");
        C69135RBj LIZ2 = C69134RBi.LIZ(mo49getActivity, LIZ, this.LIZLLL);
        if (LIZ2 != null && (countDownTimer = LIZ2.LIZ) != null && countDownTimer.isRunning()) {
            InterfaceC69056R8i interfaceC69056R8i = this.LIZIZ;
            Bundle arguments = this.LIZ.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", EnumC69113RAn.PHONE_SMS_LOGIN.getValue());
            arguments.putBoolean("code_sent", false);
            arguments.putBoolean("bind_secure", true);
            interfaceC69056R8i.rh(arguments);
            return true;
        }
        Fragment fragment = this.LIZ;
        InterfaceC69056R8i interfaceC69056R8i2 = this.LIZIZ;
        String LIZ3 = PhoneNumberUtil.LIZ(this.LIZJ);
        o.LJIIIIZZ(LIZ3, "formatNumber(phoneNumber)");
        C69093R9t.LJJ(fragment, interfaceC69056R8i2, LIZ3, this.LIZLLL, this.LJ, "auto_system", null, 384).LJIIIZ(new RAZ(this)).LJIILL();
        return true;
    }

    public RAY(Fragment fragment, InterfaceC69056R8i interfaceC69056R8i, PhoneNumberUtil.PhoneNumber phoneNumber, EnumC69116RAq enumC69116RAq, EnumC69113RAn enumC69113RAn) {
        super(fragment, interfaceC69056R8i);
        this.LIZJ = phoneNumber;
        this.LIZLLL = enumC69116RAq;
        this.LJ = enumC69113RAn;
    }
}
