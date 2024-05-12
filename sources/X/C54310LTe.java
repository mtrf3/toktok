package X;

import com.ss.android.ugc.aweme.notice.api.count.OldRedPointService;
import com.ss.android.ugc.aweme.notification.service.RedPointServiceImpl;

/* renamed from: X.LTe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54310LTe extends AbstractC65781Prl implements InterfaceC65784Pro<OldRedPointService> {
    public static final C54310LTe LJLIL = new C54310LTe();

    public C54310LTe() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.notice.api.count.OldRedPointService] */
    @Override // X.InterfaceC65784Pro
    public final OldRedPointService invoke() {
        ?? LIZ = C58096Mr6.LIZ(OldRedPointService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C58096Mr6.v3 == null) {
            synchronized (OldRedPointService.class) {
                if (C58096Mr6.v3 == null) {
                    C58096Mr6.v3 = new RedPointServiceImpl();
                }
            }
        }
        return C58096Mr6.v3;
    }
}
