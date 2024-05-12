package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPolicy;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AfM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26792AfM extends F9E implements InterfaceC26837Ag5 {
    public final List<ShopPolicy> LJLIL;

    @Override // X.InterfaceC26837Ag5
    public final String LJJLIL() {
        return "retailer_policies";
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C26792AfM(List<ShopPolicy> shopPolicy) {
        o.LJIIIZ(shopPolicy, "shopPolicy");
        this.LJLIL = shopPolicy;
    }
}
