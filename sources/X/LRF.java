package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.service.IImInboxDmService;

/* loaded from: classes10.dex */
public final class LRF extends AbstractC65781Prl implements InterfaceC65784Pro<IImInboxDmService> {
    public static final LRF LJLIL = new LRF();

    public LRF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IImInboxDmService invoke() {
        return IMService.createIIMServicebyMonsterPlugin(false).getInboxDmService();
    }
}
