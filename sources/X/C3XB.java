package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;

/* renamed from: X.3XB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3XB extends AbstractC65781Prl implements InterfaceC65784Pro<C3B2> {
    public static final C3XB LJLIL = new C3XB();

    public C3XB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C3B2 invoke() {
        return IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel();
    }
}
