package X;

import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.compliance.consent.serviceimpl.PNSDeviceConsentServiceImpl;

/* renamed from: X.Fb4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39266Fb4 extends AbstractC65781Prl implements InterfaceC65784Pro<IPNSDeviceConsentService> {
    public static final C39266Fb4 LJLIL = new C39266Fb4();

    public C39266Fb4() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IPNSDeviceConsentService invoke() {
        return PNSDeviceConsentServiceImpl.LJI();
    }
}
