package X;

import com.ss.android.ugc.aweme.commercialize.live.promote.api.PromoteEligibleCheckModel;
import com.ss.android.ugc.aweme.commercialize.live.promote.service.PromoteUtilImpl;

/* loaded from: classes11.dex */
public final class NIE<T> implements InterfaceC64592gB {
    public static final NIE<T> LJLIL = new NIE<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        PromoteEligibleCheckModel promoteEligibleCheckModel = (PromoteEligibleCheckModel) obj;
        if (C78685UuP.LJJJZ(OKW.LIZJ())) {
            PromoteUtilImpl.LIZ.put(OKW.LIZJ(), Boolean.valueOf(promoteEligibleCheckModel.getShowPromote()));
        }
    }
}
