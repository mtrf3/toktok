package X;

import com.ss.android.ugc.aweme.portrait.api.IIMClientPortraitProducerService;
import com.ss.android.ugc.aweme.portrait.impl.imclient.IMClientPortraitProducerService;

/* renamed from: X.3xV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100813xV extends AbstractC65781Prl implements InterfaceC65784Pro<IIMClientPortraitProducerService> {
    public static final C100813xV LJLIL = new C100813xV();

    public C100813xV() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.portrait.api.IIMClientPortraitProducerService, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final IIMClientPortraitProducerService invoke() {
        ?? LIZ = C58096Mr6.LIZ(IIMClientPortraitProducerService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C58096Mr6.a4 == null) {
            synchronized (IIMClientPortraitProducerService.class) {
                if (C58096Mr6.a4 == null) {
                    C58096Mr6.a4 = new IMClientPortraitProducerService();
                }
            }
        }
        return C58096Mr6.a4;
    }
}
