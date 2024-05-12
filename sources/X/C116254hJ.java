package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;

/* renamed from: X.4hJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116254hJ extends AbstractC65781Prl implements InterfaceC65784Pro<C3GF> {
    public static final C116254hJ LJLIL = new C116254hJ();

    public C116254hJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C3GF invoke() {
        return IMService.createIIMServicebyMonsterPlugin(false).getImUserService();
    }
}
