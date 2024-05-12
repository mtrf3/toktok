package X;

import com.ss.android.ugc.aweme.feed.model.FeedItemList;

/* loaded from: classes5.dex */
public final class AW5 implements Runnable {
    public final /* synthetic */ FeedItemList LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C55693LtR.LJIL(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public AW5(FeedItemList feedItemList, boolean z, int i, int i2) {
        this.LJLIL = feedItemList;
        this.LJLILLLLZI = z;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }
}
