package X;

import com.ss.android.ugc.aweme.ad.service.IAdLandPageDependOutService;
import com.ss.android.ugc.aweme.commercialize.service.AdLandPageDependOutService;

/* renamed from: X.Msp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58203Msp extends AbstractC65781Prl implements InterfaceC65784Pro<NH4> {
    public static final C58203Msp LJLIL = new C58203Msp();

    public C58203Msp() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final NH4 invoke() {
        IAdLandPageDependOutService adLandPageDependOutService;
        Object LIZ = C58096Mr6.LIZ(IAdLandPageDependOutService.class, false);
        if (LIZ != null) {
            adLandPageDependOutService = (IAdLandPageDependOutService) LIZ;
        } else {
            adLandPageDependOutService = new AdLandPageDependOutService();
        }
        adLandPageDependOutService.LIZ();
        return NJR.LIZ;
    }
}
