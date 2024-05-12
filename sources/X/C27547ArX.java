package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.ArX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27547ArX extends AbstractC65781Prl implements InterfaceC88472Yns<SellerDetailInfo, CharSequence> {
    public static final C27547ArX LJLIL = new C27547ArX();

    public C27547ArX() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(SellerDetailInfo sellerDetailInfo) {
        SellerDetailInfo it = sellerDetailInfo;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(it.countShowContent);
        LIZ.append(' ');
        LIZ.append(it.content);
        return X1D.LIZIZ(LIZ);
    }
}
