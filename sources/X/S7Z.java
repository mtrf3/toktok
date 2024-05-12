package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S7Z extends F9E {
    public final boolean LJLIL;
    public final TemplateItem LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI, Integer.valueOf(this.LJLJI), this.LJLJJI};
    }

    public /* synthetic */ S7Z(TemplateItem templateItem) {
        this(true, templateItem, 0, "");
    }

    public S7Z(boolean z, TemplateItem newItem, int i, String errorMsg) {
        o.LJIIIZ(newItem, "newItem");
        o.LJIIIZ(errorMsg, "errorMsg");
        this.LJLIL = z;
        this.LJLILLLLZI = newItem;
        this.LJLJI = i;
        this.LJLJJI = errorMsg;
    }
}
