package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;

/* renamed from: X.XfF, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85389XfF extends AbstractC65781Prl implements InterfaceC65784Pro<IAVPublishService> {
    public static final C85389XfF LJLIL = new C85389XfF();

    public C85389XfF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IAVPublishService invoke() {
        return AVExternalServiceImpl.LIZ().publishService();
    }
}
