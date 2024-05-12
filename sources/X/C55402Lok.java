package X;

import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;

/* renamed from: X.Lok, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55402Lok extends AbstractC65781Prl implements InterfaceC65784Pro<FDK> {
    public static final C55402Lok LJLIL = new C55402Lok();

    public C55402Lok() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final FDK invoke() {
        IFeedAdService LJJIJLIJ = FeedAdServiceImpl.LJJIJLIJ();
        if (LJJIJLIJ != null) {
            LJJIJLIJ.LJIIJJI();
            return C59198NLe.LIZ;
        }
        return null;
    }
}
