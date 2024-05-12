package Y;

import X.C10I;
import X.C10K;
import X.C73305Spp;
import X.C76800UCe;
import X.C82544WaS;
import X.C85144XbI;
import X.InterfaceC84885XTd;
import X.XTV;
import com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse;
import com.ss.android.ugc.aweme.account.login.twostep.AuthDeviceResponse;
import com.ss.android.ugc.aweme.account.login.twostep.Device;
import com.ss.android.ugc.aweme.account.login.twostep.RecentDevicesFragmentViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.RecommendDevice;
import com.ss.android.ugc.aweme.account.login.twostep.RecommendDeviceResponse;
import com.ss.android.ugc.aweme.account.login.twostep.TrustedDevicesFragmentViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import ujb.o;

/* loaded from: classes16.dex */
public class AgS41S0110000_15 implements C10I {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.C10I
    public final Object then(C10K<RecommendDeviceResponse> c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            case 3:
                return then$3(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS41S0110000_15 agS41S0110000_15, C10K c10k) {
        int i;
        Integer errorCode;
        if (!C82544WaS.LJ(c10k)) {
            if (!agS41S0110000_15.z1) {
                RecentDevicesFragmentViewModel recentDevicesFragmentViewModel = (RecentDevicesFragmentViewModel) agS41S0110000_15.l0;
                recentDevicesFragmentViewModel.getClass();
                recentDevicesFragmentViewModel.setState(new AqS181S0100000_15(recentDevicesFragmentViewModel, 277));
            } else {
                RecentDevicesFragmentViewModel recentDevicesFragmentViewModel2 = (RecentDevicesFragmentViewModel) agS41S0110000_15.l0;
                RecentDevicesFragmentViewModel.hv0(recentDevicesFragmentViewModel2, null, null, 7);
                recentDevicesFragmentViewModel2.kv0();
            }
            return null;
        }
        RecommendDeviceResponse recommendDeviceResponse = (RecommendDeviceResponse) c10k.LJIIJJI();
        if (!o.LJJJJIZL("success", recommendDeviceResponse.getMessage(), true) || recommendDeviceResponse.getData() == null) {
            RecommendDeviceResponse.Data data = recommendDeviceResponse.getData();
            if (data != null && (errorCode = data.getErrorCode()) != null) {
                i = errorCode.intValue();
            } else {
                i = -2;
            }
            if (!agS41S0110000_15.z1) {
                RecentDevicesFragmentViewModel recentDevicesFragmentViewModel3 = (RecentDevicesFragmentViewModel) agS41S0110000_15.l0;
                recentDevicesFragmentViewModel3.getClass();
                recentDevicesFragmentViewModel3.setState(new AqS181S0100000_15(recentDevicesFragmentViewModel3, 277));
            } else {
                RecentDevicesFragmentViewModel recentDevicesFragmentViewModel4 = (RecentDevicesFragmentViewModel) agS41S0110000_15.l0;
                RecentDevicesFragmentViewModel.hv0(recentDevicesFragmentViewModel4, Integer.valueOf(i), null, 6);
                recentDevicesFragmentViewModel4.kv0();
            }
            return null;
        }
        List<RecommendDevice> deviceInfo = recommendDeviceResponse.getData().getDeviceInfo();
        if (deviceInfo != null) {
            ((RecentDevicesFragmentViewModel) agS41S0110000_15.l0).LJLIL = deviceInfo;
        }
        if (!agS41S0110000_15.z1) {
            RecentDevicesFragmentViewModel recentDevicesFragmentViewModel5 = (RecentDevicesFragmentViewModel) agS41S0110000_15.l0;
            recentDevicesFragmentViewModel5.getClass();
            recentDevicesFragmentViewModel5.withState(new AqS146S0200000_15(recentDevicesFragmentViewModel5, recommendDeviceResponse, 82));
        } else {
            RecentDevicesFragmentViewModel recentDevicesFragmentViewModel6 = (RecentDevicesFragmentViewModel) agS41S0110000_15.l0;
            recentDevicesFragmentViewModel6.getClass();
            recentDevicesFragmentViewModel6.withState(new AqS146S0200000_15(recentDevicesFragmentViewModel6, recommendDeviceResponse, 78));
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS41S0110000_15 agS41S0110000_15, C10K c10k) {
        if (!C82544WaS.LJ(c10k)) {
            TrustedDevicesFragmentViewModel trustedDevicesFragmentViewModel = (TrustedDevicesFragmentViewModel) agS41S0110000_15.l0;
            trustedDevicesFragmentViewModel.getClass();
            trustedDevicesFragmentViewModel.setState(new AqS181S0100000_15(trustedDevicesFragmentViewModel, 284));
            return null;
        }
        AuthDeviceResponse authDeviceResponse = (AuthDeviceResponse) c10k.LJIIJJI();
        if (!o.LJJJJIZL("success", authDeviceResponse.getMessage(), true) || authDeviceResponse.getData() == null) {
            TrustedDevicesFragmentViewModel trustedDevicesFragmentViewModel2 = (TrustedDevicesFragmentViewModel) agS41S0110000_15.l0;
            trustedDevicesFragmentViewModel2.getClass();
            trustedDevicesFragmentViewModel2.setState(new AqS181S0100000_15(trustedDevicesFragmentViewModel2, 284));
            return null;
        }
        List<Device> auth_device = authDeviceResponse.getData().getAuth_device();
        if (auth_device != null) {
            ((TrustedDevicesFragmentViewModel) agS41S0110000_15.l0).LJLIL = auth_device;
        }
        if (agS41S0110000_15.z1) {
            C85144XbI.LJJIIJ(((TrustedDevicesFragmentViewModel) agS41S0110000_15.l0).LJLIL.size(), (String) ((TrustedDevicesFragmentViewModel) agS41S0110000_15.l0).LJLJI.getValue());
        }
        TrustedDevicesFragmentViewModel trustedDevicesFragmentViewModel3 = (TrustedDevicesFragmentViewModel) agS41S0110000_15.l0;
        trustedDevicesFragmentViewModel3.LJLJJL.setAuthDeviceListStatus(authDeviceResponse);
        trustedDevicesFragmentViewModel3.withState(new AqS146S0200000_15(trustedDevicesFragmentViewModel3, authDeviceResponse, 84));
        return C76800UCe.LIZ;
    }

    public static final Object then$2(AgS41S0110000_15 agS41S0110000_15, C10K c10k) {
        if (!C82544WaS.LJ(c10k)) {
            ((TwoStepVerificationManageActivity) agS41S0110000_15.l0).LLILLL();
            return null;
        }
        if (agS41S0110000_15.z1) {
            Object LJIIJJI = c10k.LJIIJJI();
            kotlin.jvm.internal.o.LJIIIIZZ(LJIIJJI, "it.result");
            String enterFrom = ((TwoStepVerificationManageActivity) agS41S0110000_15.l0).getEnterFrom();
            kotlin.jvm.internal.o.LJIIIIZZ(enterFrom, "enterFrom");
            C85144XbI.LJIILJJIL((AddVerificationResponse) LJIIJJI, enterFrom, false, false, false, false);
        }
        AddVerificationResponse addVerificationResponse = (AddVerificationResponse) c10k.LJIIJJI();
        if (!o.LJJJJIZL("success", addVerificationResponse.getMessage(), true) || addVerificationResponse.getData() == null) {
            ((TwoStepVerificationManageActivity) agS41S0110000_15.l0).LLILLL();
            return null;
        }
        ((C73305Spp) ((TwoStepVerificationManageActivity) agS41S0110000_15.l0)._$_findCachedViewById(R.id.keh)).setVisibility(8);
        ((TwoStepVerificationManageActivity) agS41S0110000_15.l0)._$_findCachedViewById(R.id.dm7).setVisibility(0);
        ((TwoStepVerificationManageActivity) agS41S0110000_15.l0).LLILIL(addVerificationResponse);
        return C76800UCe.LIZ;
    }

    public static final Object then$3(AgS41S0110000_15 agS41S0110000_15, C10K c10k) {
        boolean z;
        if (!c10k.LJIILJJIL() && c10k.LJIILIIL()) {
            z = true;
        } else {
            z = false;
        }
        if (agS41S0110000_15.z1) {
            InterfaceC84885XTd interfaceC84885XTd = XTV.LJIIIZ.LIZIZ;
            if (interfaceC84885XTd != null) {
                interfaceC84885XTd.LIZ(z);
            }
        } else {
            InterfaceC84885XTd interfaceC84885XTd2 = (InterfaceC84885XTd) agS41S0110000_15.l0;
            if (interfaceC84885XTd2 != null) {
                interfaceC84885XTd2.LIZIZ(z);
            }
        }
        return C76800UCe.LIZ;
    }

    public AgS41S0110000_15(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
