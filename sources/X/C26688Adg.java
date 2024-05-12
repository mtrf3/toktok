package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.returnpolicies.ReturnPoliciesFragment;
import kotlin.jvm.internal.AqS135S0200000_4;

/* renamed from: X.Adg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26688Adg {
    /* JADX WARN: Multi-variable type inference failed */
    public static Object LIZ(Fragment fragment, UserRight userRight, IPdpStarter.PdpEnterParam pdpEnterParam, InterfaceC67352kd interfaceC67352kd) {
        if (fragment == 0 || fragment.getFragmentManager() == null) {
            return C76800UCe.LIZ;
        }
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        ReturnPoliciesFragment.LJLJJLL = c84654XKg;
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager != null) {
            ASL asl = new ASL();
            asl.LIZ.LJZL = true;
            asl.LJI(1);
            asl.LIZ.LJLLLLLL = (int) C27162AlK.LIZJ;
            ReturnPoliciesFragment returnPoliciesFragment = new ReturnPoliciesFragment();
            returnPoliciesFragment.LJLJJI = pdpEnterParam;
            Bundle bundle = new Bundle();
            bundle.putString("title", userRight.name);
            if (fragment instanceof InterfaceC71003Rtn) {
                C79234V7u.LJJIJIIJI(bundle, (InterfaceC71003Rtn) fragment, new AqS135S0200000_4(userRight, returnPoliciesFragment, 48));
            }
            returnPoliciesFragment.setArguments(bundle);
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLLILLLL = returnPoliciesFragment;
            tuxSheet.LJZI = false;
            tuxSheet.show(fragmentManager, "CommerceReturnPoliciesFragment");
        }
        Object LIZ = c84654XKg.LIZ();
        if (LIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZ;
        }
        return C76800UCe.LIZ;
    }
}
