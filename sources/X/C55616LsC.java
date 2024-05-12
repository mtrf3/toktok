package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;

/* renamed from: X.LsC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55616LsC extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC55617LsD> {
    public static final C55616LsC LJLIL = new C55616LsC();

    public C55616LsC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC55617LsD invoke() {
        return IMService.createIIMServicebyMonsterPlugin(false).getImNotificationService();
    }
}
