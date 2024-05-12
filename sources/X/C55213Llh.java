package X;

import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Llh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55213Llh extends AbstractC65781Prl implements InterfaceC88472Yns<C55127LkJ, Boolean> {
    public static final C55213Llh LJLIL = new C55213Llh();

    public C55213Llh() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C55127LkJ c55127LkJ) {
        boolean z;
        C55127LkJ it = c55127LkJ;
        o.LJIIIZ(it, "it");
        CardInsertInfo cardInsertInfo = it.LIZ.getCardInsertInfo();
        if (cardInsertInfo != null && cardInsertInfo.getCardType() == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
