package X;

import com.ss.android.ugc.aweme.api.FeedServiceImpl;
import com.ss.android.ugc.aweme.api.IFeedService;

/* renamed from: X.Mr7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58097Mr7 extends AbstractC65781Prl implements InterfaceC65784Pro<IFeedService> {
    public static final C58097Mr7 LJLIL = new C58097Mr7();

    public C58097Mr7() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.api.IFeedService] */
    @Override // X.InterfaceC65784Pro
    public final IFeedService invoke() {
        ?? LIZ = C58096Mr6.LIZ(IFeedService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C58096Mr6.LLIIIZ == null) {
            synchronized (IFeedService.class) {
                if (C58096Mr6.LLIIIZ == null) {
                    C58096Mr6.LLIIIZ = new FeedServiceImpl();
                }
            }
        }
        return C58096Mr6.LLIIIZ;
    }
}
