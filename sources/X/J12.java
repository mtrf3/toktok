package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;

/* loaded from: classes9.dex */
public final class J12 extends AbstractC65781Prl implements InterfaceC88472Yns<Aweme, Boolean> {
    public static final J12 LJLIL = new J12();

    public J12() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Aweme aweme) {
        boolean z;
        CardInsertInfo cardInsertInfo;
        Aweme aweme2 = aweme;
        if (aweme2 != null && (cardInsertInfo = aweme2.getCardInsertInfo()) != null && cardInsertInfo.getCardType() == 3) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
