package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;

/* renamed from: X.3bJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87053bJ extends AbstractC65781Prl implements InterfaceC65784Pro<C3B2> {
    public static final C87053bJ LJLIL = new C87053bJ();

    public C87053bJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C3B2 invoke() {
        return IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel();
    }
}
