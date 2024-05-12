package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;

/* renamed from: X.4K4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4K4 extends AbstractC65781Prl implements InterfaceC65784Pro<C4K5> {
    public static final C4K4 LJLIL = new C4K4();

    public C4K4() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C4K5 invoke() {
        return new C4K5(IMService.createIIMServicebyMonsterPlugin(false).getMessagingGeckoUtils());
    }
}
