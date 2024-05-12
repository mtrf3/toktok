package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;

/* renamed from: X.4SH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4SH extends AbstractC65781Prl implements InterfaceC65784Pro<C3B2> {
    public static final C4SH LJLIL = new C4SH();

    public C4SH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C3B2 invoke() {
        return IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel();
    }
}
