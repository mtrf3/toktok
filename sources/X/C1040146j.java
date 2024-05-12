package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;

/* renamed from: X.46j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1040146j extends AbstractC65781Prl implements InterfaceC65784Pro<C3B2> {
    public static final C1040146j LJLIL = new C1040146j();

    public C1040146j() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C3B2 invoke() {
        return IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel();
    }
}
