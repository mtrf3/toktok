package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;

/* renamed from: X.GLy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41382GLy extends AbstractC65781Prl implements InterfaceC65784Pro<IAVPublishService> {
    public static final C41382GLy LJLIL = new C41382GLy();

    public C41382GLy() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IAVPublishService invoke() {
        return AVExternalServiceImpl.LIZ().publishService();
    }
}
