package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragment;

/* renamed from: X.Rqb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70805Rqb extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ ReviewFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70805Rqb(ReviewFragment reviewFragment) {
        super(0);
        this.LJLIL = reviewFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Bundle arguments = this.LJLIL.getArguments();
        boolean z = false;
        if (arguments != null) {
            z = arguments.getBoolean("is_cart_entry_show", false);
        }
        return Boolean.valueOf(z);
    }
}