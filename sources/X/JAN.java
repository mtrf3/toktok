package X;

import com.ss.android.ugc.aweme.pipfeed.PipServiceImpl;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;

/* loaded from: classes9.dex */
public final class JAN extends AbstractC65781Prl implements InterfaceC65784Pro<IPipFeedService> {
    public static final JAN LJLIL = new JAN();

    public JAN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IPipFeedService invoke() {
        return PipServiceImpl.LJJII();
    }
}
