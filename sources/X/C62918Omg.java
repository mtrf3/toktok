package X;

import com.appsflyer.AppsFlyerLib;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.service.ComplianceServiceImpl;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.Omg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62918Omg implements InterfaceC62926Omo {
    public final /* synthetic */ InterfaceC62932Omu LIZ;

    @Override // X.InterfaceC62926Omo
    public final void onError() {
        InterfaceC62932Omu interfaceC62932Omu = this.LIZ;
        if (interfaceC62932Omu != null) {
            interfaceC62932Omu.LIZLLL(false);
        }
    }

    public C62918Omg(InterfaceC62932Omu interfaceC62932Omu) {
        this.LIZ = interfaceC62932Omu;
    }

    @Override // X.InterfaceC62926Omo
    public final void LIZ(ComplianceSetting setting) {
        o.LJIIIZ(setting, "setting");
        ComplianceServiceImpl.LIZ().LJIJ();
        if (C62913Omb.LJ()) {
            AppsFlyerLib.getInstance().setSharingFilterForAllPartners();
        }
        InterfaceC62932Omu interfaceC62932Omu = this.LIZ;
        if (interfaceC62932Omu != null) {
            interfaceC62932Omu.LIZLLL(true);
        }
    }
}
