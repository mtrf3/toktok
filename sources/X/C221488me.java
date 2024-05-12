package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;

/* renamed from: X.8me, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221488me extends AbstractC65781Prl implements InterfaceC65784Pro<IIMService> {
    public static final C221488me LJLIL = new C221488me();

    public C221488me() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IIMService invoke() {
        return IMService.createIIMServicebyMonsterPlugin(false);
    }
}
