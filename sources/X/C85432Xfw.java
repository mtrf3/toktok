package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;

/* renamed from: X.Xfw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85432Xfw extends AbstractC65781Prl implements InterfaceC65784Pro<IAVPublishService> {
    public static final C85432Xfw LJLIL = new C85432Xfw();

    public C85432Xfw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IAVPublishService invoke() {
        return AVExternalServiceImpl.LIZ().publishService();
    }
}
