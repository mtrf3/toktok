package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;

/* renamed from: X.GLw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41380GLw extends AbstractC65781Prl implements InterfaceC65784Pro<IAVPublishService> {
    public static final C41380GLw LJLIL = new C41380GLw();

    public C41380GLw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IAVPublishService invoke() {
        return AVExternalServiceImpl.LIZ().publishService();
    }
}
