package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetails;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Asd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27615Asd extends C5XB {
    @Override // X.C5XB
    public final Image LIZ() {
        ProductDetails productDetails = (ProductDetails) ORZ.LJLLLL(this.LIZ);
        if (productDetails != null) {
            return productDetails.image;
        }
        return null;
    }

    @Override // X.C5XB
    public final boolean LIZLLL() {
        String str;
        ProductDetails productDetails = (ProductDetails) ORZ.LJLLLL(this.LIZ);
        if (productDetails != null) {
            str = productDetails.type;
        } else {
            str = null;
        }
        return o.LJ(str, "image");
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a0 A[SYNTHETIC] */
    @Override // X.C5XB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC27624Asm> LJ() {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27615Asd.LJ():java.util.List");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27615Asd(List<ProductDetails> details) {
        super(details);
        o.LJIIIZ(details, "details");
    }
}
