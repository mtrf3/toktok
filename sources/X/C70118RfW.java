package X;

import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemResult;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;

/* renamed from: X.RfW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70118RfW extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public final /* synthetic */ C70120RfY LJLIL;
    public final /* synthetic */ Feed LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ RYM LJLJJL;
    public final /* synthetic */ AddItemResult LJLJJLL;
    public final /* synthetic */ int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70118RfW(C70120RfY c70120RfY, Feed feed, int i, String str, RYM rym, AddItemResult addItemResult, int i2) {
        super(1);
        this.LJLIL = c70120RfY;
        this.LJLILLLLZI = feed;
        this.LJLJI = i;
        this.LJLJJI = str;
        this.LJLJJL = rym;
        this.LJLJJLL = addItemResult;
        this.LJLJL = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r1 == 1) goto L10;
     */
    @Override // X.InterfaceC88472Yns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76800UCe invoke(com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams r4 = (com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams) r4
            java.lang.String r0 = "$this$logNode"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r1 = "cart_form"
            java.lang.String r0 = "add_to_cart"
            r4.plusAssign(r1, r0)
            X.RfY r2 = r3.LJLIL
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed r1 = r3.LJLILLLLZI
            int r0 = r3.LJLJI
            r2.LIZ(r4, r1, r0)
            java.lang.String r1 = "product_id"
            java.lang.String r0 = r3.LJLJJI
            r4.plusAssign(r1, r0)
            X.RYM r0 = r3.LJLJJL
            java.lang.String r1 = r0.LIZLLL
            java.lang.String r0 = "sku_id"
            r4.plusAssign(r0, r1)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed r0 = r3.LJLILLLLZI
            if (r0 == 0) goto La0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedProduct r0 = r0.product
            if (r0 == 0) goto La0
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem> r0 = r0.skus
            if (r0 == 0) goto La0
            int r1 = r0.size()
            r0 = 1
            if (r1 != r0) goto La0
        L3a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_single_sku"
            r4.plusAssign(r0, r1)
            java.lang.String r1 = "source_page_type"
            java.lang.String r0 = "buy_together"
            r4.plusAssign(r1, r0)
            java.lang.String r1 = "source_module"
            java.lang.String r0 = "rec_pdp_outer_buy_together_module"
            r4.plusAssign(r1, r0)
            com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemResult r0 = r3.LJLJJLL
            r2 = 0
            if (r0 == 0) goto L9e
            java.lang.Integer r1 = r0.preSkuCount
        L58:
            java.lang.String r0 = "sku_num_before"
            r4.plusAssign(r0, r1)
            com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemResult r0 = r3.LJLJJLL
            if (r0 == 0) goto L9c
            java.lang.Integer r1 = r0.postSkuCount
        L63:
            java.lang.String r0 = "sku_num_after"
            r4.plusAssign(r0, r1)
            com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemResult r0 = r3.LJLJJLL
            if (r0 == 0) goto L9a
            java.lang.String r1 = r0.cartItemId
        L6e:
            java.lang.String r0 = "cart_item_id"
            r4.plusAssign(r0, r1)
            X.RYM r0 = r3.LJLJJL
            java.lang.Integer r1 = r0.LIZJ
            java.lang.String r0 = "add_sku_num"
            r4.plusAssign(r0, r1)
            com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemResult r0 = r3.LJLJJLL
            if (r0 == 0) goto L82
            java.lang.Integer r2 = r0.result
        L82:
            java.lang.String r0 = "is_success"
            r4.plusAssign(r0, r2)
            int r0 = r3.LJLJL
            if (r0 == 0) goto L97
            java.lang.String r1 = java.lang.String.valueOf(r0)
        L8f:
            java.lang.String r0 = "fail_reason"
            r4.plusAssign(r0, r1)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L97:
            java.lang.String r1 = ""
            goto L8f
        L9a:
            r1 = r2
            goto L6e
        L9c:
            r1 = r2
            goto L63
        L9e:
            r1 = r2
            goto L58
        La0:
            r0 = 0
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70118RfW.invoke(java.lang.Object):java.lang.Object");
    }
}
