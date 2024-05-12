package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldProduct;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S8J implements C33Q {
    public final TemplateFieldProduct LJLIL;
    public final String LJLILLLLZI;

    public S8J() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S8J)) {
            return false;
        }
        S8J s8j = (S8J) obj;
        return o.LJ(this.LJLIL, s8j.LJLIL) && o.LJ(this.LJLILLLLZI, s8j.LJLILLLLZI);
    }

    public final int hashCode() {
        TemplateFieldProduct templateFieldProduct = this.LJLIL;
        return this.LJLILLLLZI.hashCode() + ((templateFieldProduct == null ? 0 : templateFieldProduct.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductTemplateEditState(product=");
        LIZ.append(this.LJLIL);
        LIZ.append(", content=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public /* synthetic */ S8J(int i) {
        this(null, "");
    }

    public S8J(TemplateFieldProduct templateFieldProduct, String content) {
        o.LJIIIZ(content, "content");
        this.LJLIL = templateFieldProduct;
        this.LJLILLLLZI = content;
    }
}
