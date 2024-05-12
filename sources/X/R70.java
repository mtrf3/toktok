package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R70 extends AbstractC69088R9o {
    public final R6E LIZJ;

    @Override // X.AbstractC69088R9o
    public final boolean LIZ() {
        EnumC69113RAn enumC69113RAn;
        R6E r6e = this.LIZJ;
        if (!r6e.LIZJ) {
            return false;
        }
        InterfaceC69056R8i interfaceC69056R8i = this.LIZIZ;
        Bundle LIZ = r6e.LIZ();
        this.LIZJ.getClass();
        LIZ.putInt("current_scene", EnumC69116RAq.CHANGE_PASSWORD.getValue());
        if (o.LJ(this.LIZJ.LIZIZ, "mobile")) {
            enumC69113RAn = EnumC69113RAn.PHONE_SMS_CHANGE_PASSWORD;
        } else {
            enumC69113RAn = EnumC69113RAn.EMAIL_SMS_CHANGE_PASSWORD;
        }
        LIZ.putInt("next_page", enumC69113RAn.getValue());
        interfaceC69056R8i.rh(LIZ);
        return true;
    }

    public R70(Fragment fragment, EnumC69116RAq enumC69116RAq, EnumC69113RAn enumC69113RAn, InterfaceC69056R8i interfaceC69056R8i, JSONObject jSONObject) {
        super(fragment, interfaceC69056R8i);
        this.LIZJ = new R6E(jSONObject);
    }
}
