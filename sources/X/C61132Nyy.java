package X;

import com.ss.android.ugc.feed.platform.cardinsert.data.CardShowInfo;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertConfig;

/* renamed from: X.Nyy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61132Nyy extends AbstractC65781Prl implements InterfaceC65784Pro<CardShowInfo> {
    public static final C61132Nyy LJLIL = new C61132Nyy();

    public C61132Nyy() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final CardShowInfo invoke() {
        java.util.Map<Integer, CardShowInfo> map;
        C61133Nyz.LIZ.getClass();
        FeedCardInsertConfig feedCardInsertConfig = (FeedCardInsertConfig) C61133Nyz.LIZIZ.getValue();
        if (feedCardInsertConfig != null && (map = feedCardInsertConfig.cardInfo) != null) {
            return map.get(5);
        }
        return null;
    }
}
