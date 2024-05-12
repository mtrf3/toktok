package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;

/* renamed from: X.4hH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116234hH extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C116234hH LJLIL = new C116234hH();

    public C116234hH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(IMService.createIIMServicebyMonsterPlugin(false).getInboxDmService().enableSkylightAvatarOpt());
    }
}
