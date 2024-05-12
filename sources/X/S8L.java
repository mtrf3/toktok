package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldProduct;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S8L extends AbstractC65781Prl implements InterfaceC88472Yns<S8J, S8J> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S8L(String str, String str2, String str3, int i) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final S8J invoke(S8J s8j) {
        S8J setState = s8j;
        o.LJIIIZ(setState, "$this$setState");
        TemplateFieldProduct templateFieldProduct = new TemplateFieldProduct(this.LJLIL, this.LJLILLLLZI, this.LJLJI, String.valueOf(this.LJLJJI));
        String content = setState.LJLILLLLZI;
        o.LJIIIZ(content, "content");
        return new S8J(templateFieldProduct, content);
    }
}
