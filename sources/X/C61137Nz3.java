package X;

import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardSceneInfo;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardType;
import java.util.List;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS34S0001000_10;

/* renamed from: X.Nz3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61137Nz3 extends AbstractC61131Nyx {
    @Override // X.AbstractC61131Nyx, X.InterfaceC54881LgL
    public final void LIZJ() {
        ORS.LJJLIL(new AqS34S0001000_10(2), LJFF());
    }

    @Override // X.AbstractC61131Nyx, X.InterfaceC54881LgL
    public final void LIZIZ(CardTypeRequest cardTypeRequest) {
        if (cardTypeRequest != null) {
            ORS.LJJLIL(new AqS176S0100000_10(cardTypeRequest, 137), LJFF());
            LJFF().add(cardTypeRequest);
        }
    }

    @Override // X.AbstractC61131Nyx
    public final FeedCardType LJ(FeedCardSceneInfo feedCardSceneInfo) {
        if (feedCardSceneInfo != null) {
            return feedCardSceneInfo.nearbyCardScene;
        }
        return null;
    }

    @Override // X.AbstractC61131Nyx
    public final void LJI(FeedItemList feedItemList) {
        List<CardInsertResultInfo> list;
        if (feedItemList != null && (list = feedItemList.cardInsertResults) != null) {
            for (CardInsertResultInfo cardInsertResultInfo : list) {
                if (cardInsertResultInfo.getCardInsertStatus() == 20000) {
                    ORS.LJJLIL(new AqS176S0100000_10(cardInsertResultInfo, 138), LJFF());
                }
            }
        }
    }
}
