package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.service.IImInboxDmService;

/* renamed from: X.LRl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54265LRl extends AbstractC65781Prl implements InterfaceC65784Pro<IImInboxDmService> {
    public static final C54265LRl LJLIL = new C54265LRl();

    public C54265LRl() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IImInboxDmService invoke() {
        return IMService.createIIMServicebyMonsterPlugin(false).getInboxDmService();
    }
}