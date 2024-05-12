package X;

import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdOutService;
import com.ss.android.ugc.aweme.commercialize.service.CommercializeAdOutService;

/* renamed from: X.Ms0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58152Ms0 extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC59113NHx> {
    public static final C58152Ms0 LJLIL = new C58152Ms0();

    public C58152Ms0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC59113NHx invoke() {
        ICommercializeAdOutService commercializeAdOutService;
        Object LIZ = C58096Mr6.LIZ(ICommercializeAdOutService.class, false);
        if (LIZ != null) {
            commercializeAdOutService = (ICommercializeAdOutService) LIZ;
        } else {
            commercializeAdOutService = new CommercializeAdOutService();
        }
        commercializeAdOutService.LIZ();
        return C59114NHy.LIZ;
    }
}
