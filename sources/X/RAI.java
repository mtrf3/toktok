package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RAI extends AbstractC69088R9o {
    public final String LIZJ;

    @Override // X.AbstractC69088R9o
    public final boolean LIZ() {
        PhoneNumberUtil.PhoneNumber LJ = RBV.LJ(this.LIZ);
        Bundle extras = this.LIZIZ.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.putBoolean("phone_signup", true);
        if (RAJ.LIZIZ()) {
            InterfaceC69056R8i interfaceC69056R8i = this.LIZIZ;
            Bundle extras2 = interfaceC69056R8i.getExtras();
            if (extras2 == null) {
                extras2 = new Bundle();
            }
            extras2.putInt("next_page", EnumC69113RAn.AGE_GATE_SIGN_UP.getValue());
            extras2.putString("sms_code_key", this.LIZJ);
            interfaceC69056R8i.rh(extras2);
        } else {
            Fragment fragment = this.LIZ;
            InterfaceC69056R8i interfaceC69056R8i2 = this.LIZIZ;
            String LIZ = PhoneNumberUtil.LIZ(LJ);
            o.LJIIIIZZ(LIZ, "formatNumber(phone)");
            C69093R9t.LJIILIIL(fragment, EnumC69116RAq.SIGN_UP, this.LIZIZ.LJLLLL(), interfaceC69056R8i2, LIZ, this.LIZJ, true).LJIILL();
        }
        return true;
    }

    public RAI(Fragment fragment, InterfaceC69056R8i interfaceC69056R8i, String str) {
        super(fragment, interfaceC69056R8i);
        this.LIZJ = str;
    }
}
