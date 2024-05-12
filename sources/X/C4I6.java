package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;

/* renamed from: X.4I6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4I6 extends AbstractC65781Prl implements InterfaceC65784Pro<C4I7> {
    public static final C4I6 LJLIL = new C4I6();

    public C4I6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C4I7 invoke() {
        return IMService.createIIMServicebyMonsterPlugin(false).getProfileViewerAnalytics();
    }
}
