package X;

import com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService;
import com.ss.android.ugc.aweme.notification.service.OldNoticeCountServiceImpl;

/* renamed from: X.LTj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54315LTj extends AbstractC65781Prl implements InterfaceC65784Pro<OldNoticeCountService> {
    public static final C54315LTj LJLIL = new C54315LTj();

    public C54315LTj() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final OldNoticeCountService invoke() {
        ?? LIZ = C58096Mr6.LIZ(OldNoticeCountService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C58096Mr6.u3 == null) {
            synchronized (OldNoticeCountService.class) {
                if (C58096Mr6.u3 == null) {
                    C58096Mr6.u3 = new OldNoticeCountServiceImpl();
                }
            }
        }
        return C58096Mr6.u3;
    }
}
