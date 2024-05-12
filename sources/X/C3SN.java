package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;

/* renamed from: X.3SN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3SN extends AbstractC65781Prl implements InterfaceC65784Pro<C82093Kb> {
    public static final C3SN LJLIL = new C3SN();

    public C3SN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C82093Kb invoke() {
        return IMService.createIIMServicebyMonsterPlugin(false).getInboxDmService().optInboxWhiteScreenTime();
    }
}
