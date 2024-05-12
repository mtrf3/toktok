package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance;
import kotlin.jvm.internal.o;

/* renamed from: X.Ar2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27516Ar2 extends F9E implements InterfaceC26837Ag5 {
    public final PromotionEntrance LJLIL;

    @Override // X.InterfaceC26837Ag5
    public final String LJJLIL() {
        return "promotion";
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C27516Ar2(PromotionEntrance promotionEntrance) {
        o.LJIIIZ(promotionEntrance, "promotionEntrance");
        this.LJLIL = promotionEntrance;
    }
}
