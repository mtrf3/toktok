package X;

import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaOutService;
import com.ss.android.ugc.aweme.commercialize.service.CommerceMediaOutService;

/* loaded from: classes11.dex */
public final class NH8 extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC44417Hbx> {
    public static final NH8 LJLIL = new NH8();

    public NH8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC44417Hbx invoke() {
        ICommerceMediaOutService commerceMediaOutService;
        Object LIZ = C58096Mr6.LIZ(ICommerceMediaOutService.class, false);
        if (LIZ != null) {
            commerceMediaOutService = (ICommerceMediaOutService) LIZ;
        } else {
            commerceMediaOutService = new CommerceMediaOutService();
        }
        return commerceMediaOutService.LIZ();
    }
}
