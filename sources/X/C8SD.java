package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;

/* renamed from: X.8SD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8SD extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C8SD LJLIL = new C8SD();

    public C8SD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(IMService.createIIMServicebyMonsterPlugin(false).getImTakoService().LIZLLL());
    }
}
