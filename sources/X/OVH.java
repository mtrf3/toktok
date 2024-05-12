package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;

/* loaded from: classes11.dex */
public final class OVH extends AbstractC65781Prl implements InterfaceC65784Pro<IAVPublishService> {
    public static final OVH LJLIL = new OVH();

    public OVH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IAVPublishService invoke() {
        return AVExternalServiceImpl.LIZ().publishService();
    }
}
