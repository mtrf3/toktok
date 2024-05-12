package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.DiscountTemplateItem;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.S8c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71598S8c extends F9E implements C33Q {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final DiscountTemplateItem LJLJI;

    public C71598S8c() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public /* synthetic */ C71598S8c(int i) {
        this("", "", new DiscountTemplateItem((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, false, false, (List) null, 1023));
    }

    public C71598S8c(String title, String content, DiscountTemplateItem rawItem) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(rawItem, "rawItem");
        this.LJLIL = title;
        this.LJLILLLLZI = content;
        this.LJLJI = rawItem;
    }
}
