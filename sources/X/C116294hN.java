package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;

/* renamed from: X.4hN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116294hN extends AbstractC65781Prl implements InterfaceC65784Pro<MLE> {
    public static final C116294hN LJLIL = new C116294hN();

    public C116294hN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final MLE invoke() {
        return IMService.createIIMServicebyMonsterPlugin(false).getInboxDmService().getDMSessionLoadConfig();
    }
}
