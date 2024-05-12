package X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.account.login.ui.CountDownTimer;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class RAX extends AbstractC69088R9o {
    public final JSONObject LIZJ;

    @Override // X.AbstractC69088R9o
    public final boolean LIZ() {
        CountDownTimer countDownTimer;
        JSONObject jSONObject = this.LIZJ;
        if (jSONObject != null) {
            String email = JSONObjectProtectorUtils.getString(jSONObject, "email");
            String string = JSONObjectProtectorUtils.getString(this.LIZJ, "password");
            if (!TextUtils.isEmpty(email) && !TextUtils.isEmpty(string)) {
                ActivityC45651qj mo49getActivity = this.LIZ.mo49getActivity();
                o.LJIIIIZZ(email, "email");
                C69135RBj LIZ = C69134RBi.LIZ(mo49getActivity, email, EnumC69116RAq.SIGN_UP);
                if (LIZ != null && (countDownTimer = LIZ.LIZ) != null && countDownTimer.isRunning()) {
                    InterfaceC69056R8i interfaceC69056R8i = this.LIZIZ;
                    Bundle arguments = this.LIZ.getArguments();
                    if (arguments == null) {
                        arguments = new Bundle();
                    }
                    arguments.putBoolean("code_sent", false);
                    arguments.putInt("next_page", EnumC69113RAn.EMAIL_SMS_SIGN_UP.getValue());
                    arguments.putString("password", string);
                    interfaceC69056R8i.rh(arguments);
                    return true;
                }
                C69093R9t.LJIJI(this.LIZ, this.LIZIZ, email, 1, "auto_system", null, string, 128).LJIIIZ(new RAW(this, string)).LJIILL();
            }
        }
        return true;
    }

    public RAX(Fragment fragment, InterfaceC69056R8i interfaceC69056R8i, JSONObject jSONObject) {
        super(fragment, interfaceC69056R8i);
        this.LIZJ = jSONObject;
    }
}
