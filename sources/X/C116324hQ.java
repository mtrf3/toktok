package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;

/* renamed from: X.4hQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116324hQ extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC116174hB> {
    public static final C116324hQ LJLIL = new C116324hQ();

    public C116324hQ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC116174hB invoke() {
        return IMService.createIIMServicebyMonsterPlugin(false).getMufActivityStatusModel();
    }
}
