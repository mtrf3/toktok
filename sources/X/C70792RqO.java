package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewFragment;

/* renamed from: X.RqO, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70792RqO extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ ProductReviewFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70792RqO(ProductReviewFragment productReviewFragment) {
        super(0);
        this.LJLIL = productReviewFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Bundle arguments = this.LJLIL.getArguments();
        boolean z = false;
        if (arguments != null) {
            z = arguments.getBoolean("is_store_btn_show", false);
        }
        return Boolean.valueOf(z);
    }
}
