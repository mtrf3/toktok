package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;

/* renamed from: X.XfD, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85387XfD extends AbstractC65781Prl implements InterfaceC65784Pro<IAVPublishService> {
    public static final C85387XfD LJLIL = new C85387XfD();

    public C85387XfD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IAVPublishService invoke() {
        return AVExternalServiceImpl.LIZ().publishService();
    }
}
