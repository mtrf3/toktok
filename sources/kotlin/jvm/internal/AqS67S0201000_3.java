package kotlin.jvm.internal;

import X.AbstractC213068Xu;
import X.AbstractC65781Prl;
import X.C188727au;
import X.C214368bA;
import X.C68322mC;
import X.C76800UCe;
import X.C8RL;
import X.C8VZ;
import X.FMX;
import X.InterfaceC212878Xb;
import X.InterfaceC212998Xn;
import X.InterfaceC65784Pro;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.ext_power_list.AssemReusedContainer;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesFragment;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesVM;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.util.Map;

/* loaded from: classes4.dex */
public class AqS67S0201000_3 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS67S0201000_3 aqS67S0201000_3) {
        int i;
        int i2 = ((Bundle) aqS67S0201000_3.l0).getInt(((LocationServicesFragment) aqS67S0201000_3.l1).LJLJJLL);
        if (aqS67S0201000_3.i2 == i2) {
            i = 0;
        } else {
            i = 1;
        }
        LocationServicesVM wl = ((LocationServicesFragment) aqS67S0201000_3.l1).wl();
        Context context = ((LocationServicesFragment) aqS67S0201000_3.l1).getContext();
        Integer valueOf = Integer.valueOf(i);
        wl.getClass();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "location_services_setting");
        c188727au.LIZLLL(i2, "gps_authorization");
        c188727au.LJFF(valueOf, "is_changed");
        Map<String, String> map = c188727au.LIZ;
        if (context != null) {
            ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
            o.LJIIIIZZ(map, "this");
            iLocationBaseServiceForMT.injectMobParams(context, map);
        }
        FMX.LJIIL("system_location_device_setting_result", map);
        wl.gv0();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AqS67S0201000_3 aqS67S0201000_3) {
        int i;
        try {
            i = ((AbstractC213068Xu) aqS67S0201000_3.l0).LIZ.LJI((String) ((C68322mC) aqS67S0201000_3.l1).element);
        } catch (Exception unused) {
            i = aqS67S0201000_3.i2;
        }
        return Integer.valueOf(i);
    }

    public static final Object invoke$2(AqS67S0201000_3 aqS67S0201000_3) {
        if (C214368bA.LJIJJ) {
            AssemReusedContainer assemReusedContainer = (AssemReusedContainer) aqS67S0201000_3.l0;
            InterfaceC212878Xb<? extends InterfaceC212998Xn<?, ?>, ? extends C8RL> interfaceC212878Xb = assemReusedContainer.LJLIL;
            C8RL c8rl = (C8RL) aqS67S0201000_3.l1;
            C8VZ c8vz = assemReusedContainer.LJLJLJ;
            o.LJII(c8vz, "null cannot be cast to non-null type R of com.bytedance.ext_power_list.AssemReusedContainer");
            interfaceC212878Xb.LIZIZ(c8rl, (InterfaceC212998Xn) c8vz, aqS67S0201000_3.i2, null);
        } else {
            AssemReusedContainer assemReusedContainer2 = (AssemReusedContainer) aqS67S0201000_3.l0;
            assemReusedContainer2.LJLIL.LIZIZ((C8RL) aqS67S0201000_3.l1, assemReusedContainer2, aqS67S0201000_3.i2, null);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS67S0201000_3(AbstractC213068Xu abstractC213068Xu, AbstractC213068Xu<R, ITEM> abstractC213068Xu2, C68322mC<String> c68322mC, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC213068Xu;
        this.l1 = abstractC213068Xu2;
        this.i2 = c68322mC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS67S0201000_3(Bundle bundle, LocationServicesFragment locationServicesFragment, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = bundle;
        this.l1 = locationServicesFragment;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS67S0201000_3(AssemReusedContainer assemReusedContainer, AssemReusedContainer<InterfaceC212998Xn<Object, Object>, C8RL> assemReusedContainer2, C8RL c8rl, int i) {
        super(0);
        this.$t = i;
        this.l0 = assemReusedContainer;
        this.l1 = assemReusedContainer2;
        this.i2 = c8rl;
    }
}
