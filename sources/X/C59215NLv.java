package X;

import Y.ARunnableS46S0100000_10;
import android.app.Activity;
import android.view.KeyEvent;
import com.ss.android.ugc.aweme.ad.feed.card.FeedAdLynxCard;

/* renamed from: X.NLv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59215NLv extends AbstractC59497NWr {
    public final /* synthetic */ FeedAdLynxCard LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59215NLv(Activity activity, FeedAdLynxCard feedAdLynxCard) {
        super(activity);
        this.LJLILLLLZI = feedAdLynxCard;
    }

    @Override // X.GHC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            FeedAdLynxCard feedAdLynxCard = this.LJLILLLLZI;
            if (feedAdLynxCard.LLFF == 2) {
                feedAdLynxCard.LLFF = 1;
                C59215NLv c59215NLv = feedAdLynxCard.LLFFF;
                if (c59215NLv != null) {
                    c59215NLv.enable(false);
                }
                feedAdLynxCard.LJLZ.post(new ARunnableS46S0100000_10(feedAdLynxCard, 114));
                return true;
            }
        }
        return false;
    }
}
