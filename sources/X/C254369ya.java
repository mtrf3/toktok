package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionListAssem;

/* renamed from: X.9ya, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C254369ya extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C254369ya(PaidContentCollectionListAssem paidContentCollectionListAssem) {
        super(0, paidContentCollectionListAssem, PaidContentCollectionListAssem.class, "navigateToPromotionPage", "navigateToPromotionPage()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        PaidContentCollectionListAssem paidContentCollectionListAssem = (PaidContentCollectionListAssem) this.receiver;
        paidContentCollectionListAssem.getClass();
        SmartRoute buildRoute = SmartRouter.buildRoute(C212428Vi.LIZLLL(paidContentCollectionListAssem), "aweme://paidcontent/promote");
        buildRoute.withParam("enter_from", paidContentCollectionListAssem.C3().LJLJI);
        buildRoute.open();
        return C76800UCe.LIZ;
    }
}
