package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.R9q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69090R9q extends AbstractC69088R9o {
    public final JSONObject LIZJ;
    public final EnumC69113RAn LIZLLL;

    @Override // X.AbstractC69088R9o
    public final boolean LIZ() {
        String mobileProfile;
        JSONObject jSONObject = this.LIZJ;
        if (jSONObject == null || (mobileProfile = jSONObject.optString("mobile_profile")) == null || mobileProfile.length() == 0) {
            return false;
        }
        if (this.LIZLLL == EnumC69113RAn.INPUT_PHONE_SIGN_UP) {
            Fragment fragment = this.LIZ;
            InterfaceC69056R8i interfaceC69056R8i = this.LIZIZ;
            o.LJIIIIZZ(mobileProfile, "mobileProfile");
            C69093R9t.LIZIZ(fragment, interfaceC69056R8i, mobileProfile).LJIILL();
            return true;
        }
        Bundle arguments = this.LIZ.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("current_scene", EnumC69116RAq.SIGN_UP.getValue());
        arguments.putInt("next_page", EnumC69113RAn.RU_INSTANT_LOGIN_ERROR_NEW_USER.getValue());
        arguments.putString("mobile_profile", mobileProfile);
        if (this.LIZ.mo49getActivity() instanceof AbstractActivityC69131RBf) {
            this.LIZIZ.rh(arguments);
        } else if (this.LIZ.mo49getActivity() != null) {
            SmartRoute buildRoute = SmartRouter.buildRoute(this.LIZ.getContext(), "//account/login/signup_or_login");
            buildRoute.withParam(arguments);
            buildRoute.open();
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69090R9q(Fragment fragment, InterfaceC69056R8i interfaceC69056R8i, JSONObject jSONObject, EnumC69113RAn lastStep) {
        super(fragment, interfaceC69056R8i);
        o.LJIIIZ(lastStep, "lastStep");
        this.LIZJ = jSONObject;
        this.LIZLLL = lastStep;
    }
}
