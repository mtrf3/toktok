package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;

/* renamed from: X.HcY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44454HcY extends AbstractC65781Prl implements InterfaceC65784Pro<IAVPublishService> {
    public static final C44454HcY LJLIL = new C44454HcY();

    public C44454HcY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IAVPublishService invoke() {
        return AVExternalServiceImpl.LIZ().publishService();
    }
}
