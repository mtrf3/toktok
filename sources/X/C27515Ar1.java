package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance;

/* renamed from: X.Ar1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27515Ar1 extends F9E implements InterfaceC26837Ag5 {
    public final PromotionEntrance LJLIL;
    public final boolean LJLILLLLZI;

    public /* synthetic */ C27515Ar1() {
        throw null;
    }

    @Override // X.InterfaceC26837Ag5
    public final String LJJLIL() {
        return "promotion";
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public C27515Ar1(PromotionEntrance promotionEntrance, boolean z) {
        this.LJLIL = promotionEntrance;
        this.LJLILLLLZI = z;
    }
}
