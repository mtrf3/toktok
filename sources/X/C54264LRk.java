package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.service.IImInboxDmService;

/* renamed from: X.LRk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54264LRk extends AbstractC65781Prl implements InterfaceC65784Pro<IImInboxDmService> {
    public static final C54264LRk LJLIL = new C54264LRk();

    public C54264LRk() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IImInboxDmService invoke() {
        return IMService.createIIMServicebyMonsterPlugin(false).getInboxDmService();
    }
}
