package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.service.IImInboxDmService;

/* renamed from: X.4hW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116384hW extends AbstractC65781Prl implements InterfaceC65784Pro<IImInboxDmService> {
    public static final C116384hW LJLIL = new C116384hW();

    public C116384hW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IImInboxDmService invoke() {
        return IMService.createIIMServicebyMonsterPlugin(false).getInboxDmService();
    }
}
