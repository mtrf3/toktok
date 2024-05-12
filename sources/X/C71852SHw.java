package X;

import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.DividerViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.SellerConversationViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.TitleViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.SHw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71852SHw extends SIT {
    public final C71850SHu LJLJJLL;

    @Override // X.SIT, X.InterfaceC227608wW
    public final void onCreate() {
        if (this.LJLJJLL.LJLJJLL) {
            LJIIIIZZ(SellerConversationViewHolder.class);
        } else {
            LJIIIIZZ(DividerViewHolder.class, TitleViewHolder.class, SellerConversationViewHolder.class);
        }
    }

    public C71852SHw(C71850SHu messageCenterData) {
        o.LJIIIZ(messageCenterData, "messageCenterData");
        this.LJLJJLL = messageCenterData;
    }
}
