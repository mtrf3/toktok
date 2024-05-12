package X;

import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;

/* loaded from: classes11.dex */
public final class N4I extends AbstractC65781Prl implements InterfaceC65784Pro<IFeedAdService> {
    public static final N4I INSTANCE = new N4I();

    public N4I() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IFeedAdService invoke() {
        return FeedAdServiceImpl.LJJIJLIJ();
    }
}
