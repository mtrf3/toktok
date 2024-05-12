package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;

/* renamed from: X.Gt7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42933Gt7 extends AbstractC65781Prl implements InterfaceC65784Pro<IAVPublishService> {
    public static final C42933Gt7 LJLIL = new C42933Gt7();

    public C42933Gt7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IAVPublishService invoke() {
        return AVExternalServiceImpl.LIZ().publishService();
    }
}
