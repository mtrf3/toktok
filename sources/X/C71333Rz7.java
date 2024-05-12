package X;

import com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Rz7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71333Rz7 extends AbstractC65781Prl implements InterfaceC88476Ynw<Boolean, String, String, String, String, Integer, C76800UCe> {
    public final /* synthetic */ AnchorPanelAdapter LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ ShopWindowAnchorModel LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71333Rz7(AnchorPanelAdapter anchorPanelAdapter, int i, ShopWindowAnchorModel shopWindowAnchorModel, String str, String str2) {
        super(6);
        this.LJLIL = anchorPanelAdapter;
        this.LJLILLLLZI = i;
        this.LJLJI = shopWindowAnchorModel;
        this.LJLJJI = str;
        this.LJLJJL = str2;
    }

    @Override // X.InterfaceC88476Ynw
    public final C76800UCe invoke(Boolean bool, String str, String str2, String str3, String str4, Integer num) {
        boolean booleanValue = bool.booleanValue();
        String code = str;
        String itemId = str2;
        String pre = str3;
        String after = str4;
        num.intValue();
        o.LJIIIZ(code, "code");
        o.LJIIIZ(itemId, "itemId");
        o.LJIIIZ(pre, "pre");
        o.LJIIIZ(after, "after");
        if (booleanValue) {
            this.LJLIL.LJZL("tiktokec_confirm_cart_result", this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, Boolean.TRUE, null, pre, after, itemId);
        } else {
            this.LJLIL.LJZL("tiktokec_confirm_cart_result", this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, Boolean.FALSE, code, pre, after, itemId);
        }
        return C76800UCe.LIZ;
    }
}
