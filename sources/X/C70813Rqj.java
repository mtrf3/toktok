package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragmentV1;

/* renamed from: X.Rqj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70813Rqj extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ ReviewFragmentV1 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70813Rqj(ReviewFragmentV1 reviewFragmentV1) {
        super(0);
        this.LJLIL = reviewFragmentV1;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Bundle arguments = this.LJLIL.getArguments();
        boolean z = false;
        if (arguments != null) {
            z = arguments.getBoolean("is_im_chat_btn_show", false);
        }
        return Boolean.valueOf(z);
    }
}