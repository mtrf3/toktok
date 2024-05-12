package X;

import com.ss.android.ugc.aweme.IAccountFeatureFlagService;
import com.ss.android.ugc.aweme.account.experiment.AccountFeatureFlagService;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class RA6 extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final RA6 LJLIL = new RA6();

    public RA6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        IAccountFeatureFlagService LJI = AccountFeatureFlagService.LJI();
        ArrayList arrayList = new ArrayList();
        if (LJI.LJFF()) {
            arrayList.add(RA4.V1);
        }
        if (LJI.LIZ()) {
            arrayList.add(RA4.V2);
        }
        return ORZ.LLD(arrayList, ",", null, null, RA5.LJLIL, 30);
    }
}
