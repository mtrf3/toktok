package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;

/* renamed from: X.3m0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93683m0 extends AbstractC65781Prl implements InterfaceC65784Pro<IIMService> {
    public static final C93683m0 LJLIL = new C93683m0();

    public C93683m0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IIMService invoke() {
        return IMService.createIIMServicebyMonsterPlugin(false);
    }
}
