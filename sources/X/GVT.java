package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;

/* loaded from: classes8.dex */
public final class GVT extends AbstractC65781Prl implements InterfaceC65784Pro<IAVPublishService> {
    public static final GVT LJLIL = new GVT();

    public GVT() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IAVPublishService invoke() {
        return AVExternalServiceImpl.LIZ().publishService();
    }
}
