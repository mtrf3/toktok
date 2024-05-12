package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;

/* renamed from: X.4hI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116244hI extends AbstractC65781Prl implements InterfaceC65784Pro<C3B2> {
    public static final C116244hI LJLIL = new C116244hI();

    public C116244hI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C3B2 invoke() {
        return IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel();
    }
}
