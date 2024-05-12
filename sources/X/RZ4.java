package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Specification;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.desc.GlobalProductDescStyle;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RZ4 extends RZA {
    @Override // X.RZA, X.InterfaceC27598AsM
    public final IProductDescStyle I50() {
        LIZ();
        return new GlobalProductDescStyle();
    }

    @Override // X.RZA, X.InterfaceC27598AsM
    public final InterfaceC27624Asm TT(List<Specification> specifications) {
        o.LJIIIZ(specifications, "specifications");
        return C69818Rag.LIZJ(LIZ(), specifications);
    }
}
