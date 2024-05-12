package X;

import com.bytedance.helios.network.api.service.ISkynetService;

/* renamed from: X.PuR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65947PuR extends AbstractC65781Prl implements InterfaceC65784Pro<ISkynetService> {
    public static final C65947PuR LJLIL = new C65947PuR();

    public C65947PuR() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.helios.network.api.service.ISkynetService] */
    @Override // X.InterfaceC65784Pro
    public final ISkynetService invoke() {
        return C65940PuK.LIZ("com.bytedance.helios.network.skynet.impl.SkynetServiceImpl");
    }
}
