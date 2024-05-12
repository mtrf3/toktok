package X;

import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Rz6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71332Rz6 extends AbstractC65781Prl implements InterfaceC88476Ynw<Boolean, String, String, String, String, Integer, C76800UCe> {
    public final /* synthetic */ C71335Rz9 LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ ShopWindowAnchorModel LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71332Rz6(C71335Rz9 c71335Rz9, int i, ShopWindowAnchorModel shopWindowAnchorModel, String str, String str2, String str3) {
        super(6);
        this.LJLIL = c71335Rz9;
        this.LJLILLLLZI = i;
        this.LJLJI = shopWindowAnchorModel;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
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
            C71335Rz9 c71335Rz9 = this.LJLIL;
            c71335Rz9.P("tiktokec_confirm_cart_result", this.LJLILLLLZI, this.LJLJI, c71335Rz9.LJLJJI, this.LJLJJI, Boolean.TRUE, null, pre, after, itemId, this.LJLJJL);
        } else {
            C71335Rz9 c71335Rz92 = this.LJLIL;
            c71335Rz92.P("tiktokec_confirm_cart_result", this.LJLILLLLZI, this.LJLJI, c71335Rz92.LJLJJI, this.LJLJJI, Boolean.FALSE, code, pre, after, itemId, this.LJLJJL);
        }
        return C76800UCe.LIZ;
    }
}
