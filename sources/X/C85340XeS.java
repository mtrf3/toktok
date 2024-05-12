package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;

/* renamed from: X.XeS, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85340XeS extends AbstractC65781Prl implements InterfaceC65784Pro<ILocationBaseServiceForMT> {
    public static final C85340XeS LJLIL = new C85340XeS();

    public C85340XeS() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final ILocationBaseServiceForMT invoke() {
        return ServiceManager.get().getService(ILocationBaseServiceForMT.class);
    }
}
