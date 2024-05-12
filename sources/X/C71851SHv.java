package X;

import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.DividerViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.TopTabListViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.SHv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71851SHv extends SIT {
    public final MessageCenterViewModel LJLJJLL;

    @Override // X.SIT, X.InterfaceC227608wW
    public final void onCreate() {
        LJIIIIZZ(TopTabListViewHolder.class, DividerViewHolder.class);
    }

    public C71851SHv(MessageCenterViewModel viewModel) {
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLJJLL = viewModel;
    }
}
