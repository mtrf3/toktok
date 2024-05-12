package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.IHomePageService;

/* loaded from: classes10.dex */
public final class LNT extends AbstractC65781Prl implements InterfaceC65784Pro<IHomePageService> {
    public static final LNT LJLIL = new LNT();

    public LNT() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.homepage.IHomePageService, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final IHomePageService invoke() {
        return ServiceManager.get().getService(IHomePageService.class);
    }
}
