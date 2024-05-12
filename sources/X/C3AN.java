package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;

/* renamed from: X.3AN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3AN extends AbstractC65781Prl implements InterfaceC65784Pro<C3GF> {
    public static final C3AN LJLIL = new C3AN();

    public C3AN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C3GF invoke() {
        return IMService.createIIMServicebyMonsterPlugin(false).getImUserService();
    }
}
