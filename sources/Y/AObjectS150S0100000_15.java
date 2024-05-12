package Y;

import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.feed.adapter.FeedLiveViewHolderNew;
import com.ss.android.ugc.aweme.feed.adapter.FeedLiveViewHolderOpt;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;

/* loaded from: classes16.dex */
public class AObjectS150S0100000_15 implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public AObjectS150S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS150S0100000_15 aObjectS150S0100000_15, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        LivePreviewPlayerVM LJZI = ((FeedLiveViewHolderNew) aObjectS150S0100000_15.l0).LJZI();
        if (LJZI != null) {
            LJZI.LJLLLL.LIZLLL(booleanValue);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS150S0100000_15 aObjectS150S0100000_15, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        LivePreviewPlayerVM LJZI = ((FeedLiveViewHolderOpt) aObjectS150S0100000_15.l0).LJZI();
        if (LJZI != null) {
            LJZI.LJLLLL.LIZLLL(booleanValue);
        }
        return C76800UCe.LIZ;
    }
}
