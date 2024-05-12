package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;

/* renamed from: X.8mr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221618mr extends AbstractC65781Prl implements InterfaceC65784Pro<IIMService> {
    public static final C221618mr LJLIL = new C221618mr();

    public C221618mr() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IIMService invoke() {
        return IMService.createIIMServicebyMonsterPlugin(false);
    }
}
