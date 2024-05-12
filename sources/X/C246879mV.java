package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;

/* renamed from: X.9mV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C246879mV extends AbstractC65781Prl implements InterfaceC65784Pro<IIMService> {
    public static final C246879mV LJLIL = new C246879mV();

    public C246879mV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IIMService invoke() {
        return IMService.createIIMServicebyMonsterPlugin(false);
    }
}
