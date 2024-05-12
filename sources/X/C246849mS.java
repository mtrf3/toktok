package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import kotlin.jvm.internal.o;

/* renamed from: X.9mS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C246849mS extends AbstractC65781Prl implements InterfaceC65784Pro<IIMService> {
    public static final C246849mS LJLIL = new C246849mS();

    public C246849mS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IIMService invoke() {
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIIMServicebyMonsterPlugin, "get()");
        return createIIMServicebyMonsterPlugin;
    }
}
