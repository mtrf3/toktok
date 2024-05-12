package X;

import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Lkx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55167Lkx extends AbstractC65781Prl implements InterfaceC88472Yns<C55127LkJ, Boolean> {
    public static final C55167Lkx LJLIL = new C55167Lkx();

    public C55167Lkx() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C55127LkJ c55127LkJ) {
        boolean z;
        C55127LkJ it = c55127LkJ;
        o.LJIIIZ(it, "it");
        CardInsertInfo cardInsertInfo = it.LIZ.getCardInsertInfo();
        if (cardInsertInfo != null && cardInsertInfo.getCardType() == 3) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
