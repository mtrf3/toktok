package X;

import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;

/* renamed from: X.8Wp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212758Wp extends AbstractC65781Prl implements InterfaceC65784Pro<ISpecialPlusService> {
    public static final C212758Wp LJLIL = new C212758Wp();

    public C212758Wp() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ISpecialPlusService invoke() {
        IExternalService iExternalService = (IExternalService) C212748Wo.LIZ.getValue();
        if (iExternalService != null) {
            return iExternalService.specialPlusService();
        }
        return null;
    }
}
