package X;

import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;

/* loaded from: classes11.dex */
public final class NS9 extends AbstractC65781Prl implements InterfaceC65784Pro<ICommercializeAdService> {
    public static final NS9 INSTANCE = new NS9();

    public NS9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ICommercializeAdService invoke() {
        return CommercializeAdServiceImpl.LJ();
    }
}
