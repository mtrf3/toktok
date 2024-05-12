package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;

/* renamed from: X.XfE, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85388XfE extends AbstractC65781Prl implements InterfaceC65784Pro<IAVPublishService> {
    public static final C85388XfE LJLIL = new C85388XfE();

    public C85388XfE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IAVPublishService invoke() {
        return AVExternalServiceImpl.LIZ().publishService();
    }
}
