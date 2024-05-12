package Y;

import X.ActivityC45651qj;
import X.C0H1;
import X.C188727au;
import X.C26227ARb;
import X.C28111B1n;
import X.C3AW;
import X.C3AY;
import X.C77273UUj;
import X.DialogC25756A8y;
import X.FMX;
import X.HG3;
import X.R41;
import X.RBX;
import X.RCY;
import X.UC0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.page.account.ThirdPartyBindingPage;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AqS10S2200000_4;
import kotlin.jvm.internal.AqS72S1100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ACListenerS43S1100000_4 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS43S1100000_4 aCListenerS43S1100000_4, View view) {
        SmartRouter.buildRoute(((C28111B1n) aCListenerS43S1100000_4.l1).getContext(), aCListenerS43S1100000_4.s0).open();
    }

    public static final void onClick$1(ACListenerS43S1100000_4 aCListenerS43S1100000_4, View view) {
        SmartRouter.buildRoute((Context) aCListenerS43S1100000_4.l1, aCListenerS43S1100000_4.s0).open();
    }

    public static final void onClick$2(ACListenerS43S1100000_4 aCListenerS43S1100000_4, View view) {
        ThirdPartyBindingPage thirdPartyBindingPage = (ThirdPartyBindingPage) aCListenerS43S1100000_4.l1;
        String platformName = aCListenerS43S1100000_4.s0;
        o.LJIIIIZZ(platformName, "platformName");
        thirdPartyBindingPage.getClass();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("source", "manage_account");
        c188727au.LJIIIZ("platform", platformName);
        FMX.LJIIL("manage_account_3rd_party_click", c188727au.LIZ);
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        Map<String, RCY> boundSocialPlatforms = R41.LIZIZ().getBoundSocialPlatforms();
        if (boundSocialPlatforms.containsKey(platformName)) {
            if (curUser.isPhoneBinded() || boundSocialPlatforms.size() > 1 || (!TextUtils.isEmpty(curUser.getEmail()) && thirdPartyBindingPage.LJLJJL)) {
                String LIZJ = C77273UUj.LIZJ(platformName);
                ActivityC45651qj requireActivity = thirdPartyBindingPage.requireActivity();
                o.LJIIIIZZ(requireActivity, "requireActivity()");
                DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(requireActivity);
                Context requireContext = thirdPartyBindingPage.requireContext();
                o.LJIIIIZZ(requireContext, "requireContext()");
                C26227ARb LIZ = C3AW.LIZ(requireContext);
                LIZ.LJFF(thirdPartyBindingPage.getString(R.string.s8_, LIZJ));
                LIZ.LIZIZ(thirdPartyBindingPage.getString(R.string.s89, LIZJ));
                UC0.LIZJ(LIZ, new AqS10S2200000_4(dialogC25756A8y, thirdPartyBindingPage, platformName, LIZJ, 2));
                LIZ.LJI().LIZLLL();
                ThirdPartyBindingPage.Dl(platformName, "remove");
                return;
            }
            if (!TextUtils.isEmpty(curUser.getEmail()) && !thirdPartyBindingPage.LJLJJL) {
                ActivityC45651qj requireActivity2 = thirdPartyBindingPage.requireActivity();
                o.LJIIIIZZ(requireActivity2, "requireActivity()");
                C3AY.LIZ(requireActivity2, thirdPartyBindingPage.getString(R.string.s86), thirdPartyBindingPage.getString(R.string.s7v, platformName), thirdPartyBindingPage.getString(R.string.s80), new AqS72S1100000_4(thirdPartyBindingPage, platformName, 1), new AqS72S1100000_4(thirdPartyBindingPage, platformName, 2));
                return;
            } else {
                ActivityC45651qj requireActivity3 = thirdPartyBindingPage.requireActivity();
                o.LJIIIIZZ(requireActivity3, "requireActivity()");
                C3AY.LIZ(requireActivity3, thirdPartyBindingPage.getString(R.string.s7u), thirdPartyBindingPage.getString(R.string.s7t, platformName), thirdPartyBindingPage.getString(R.string.s80), new AqS72S1100000_4(thirdPartyBindingPage, platformName, 3), new AqS72S1100000_4(thirdPartyBindingPage, platformName, 4));
                return;
            }
        }
        R41.LIZIZ().bindPlatform(thirdPartyBindingPage.requireActivity(), platformName, C0H1.LIZ("source", "manage_account"));
    }

    public ACListenerS43S1100000_4(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
