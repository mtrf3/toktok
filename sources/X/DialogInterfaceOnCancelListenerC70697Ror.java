package X;

import android.content.DialogInterface;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;

/* renamed from: X.Ror, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class DialogInterfaceOnCancelListenerC70697Ror implements DialogInterface.OnCancelListener {
    public final /* synthetic */ ProductReviewViewModel LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ ReviewItemStruct LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public DialogInterfaceOnCancelListenerC70697Ror(ProductReviewViewModel productReviewViewModel, View view, int i, ReviewItemStruct reviewItemStruct, String str) {
        this.LJLIL = productReviewViewModel;
        this.LJLILLLLZI = view;
        this.LJLJI = i;
        this.LJLJJI = reviewItemStruct;
        this.LJLJJL = str;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C70691Rol c70691Rol = this.LJLIL.LJLLILLLL;
        if (c70691Rol != null) {
            c70691Rol.LJJ(this.LJLJI, this.LJLILLLLZI, this.LJLJJI, this.LJLJJL, "cancel");
        }
    }
}
