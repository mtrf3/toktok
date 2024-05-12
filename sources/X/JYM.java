package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JYM {
    public final View LIZ;
    public final Aweme LIZIZ;
    public final String LIZJ;
    public final JQA LIZLLL;
    public final Product LJ;
    public final Boolean LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    public JYM() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JYM)) {
            return false;
        }
        JYM jym = (JYM) obj;
        return o.LJ(this.LIZ, jym.LIZ) && o.LJ(this.LIZIZ, jym.LIZIZ) && o.LJ(this.LIZJ, jym.LIZJ) && o.LJ(this.LIZLLL, jym.LIZLLL) && o.LJ(this.LJ, jym.LJ) && o.LJ(this.LJFF, jym.LJFF);
    }

    public final int hashCode() {
        View view = this.LIZ;
        int hashCode = (view == null ? 0 : view.hashCode()) * 31;
        Aweme aweme = this.LIZIZ;
        int hashCode2 = (hashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
        String str = this.LIZJ;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        JQA jqa = this.LIZLLL;
        int hashCode4 = (hashCode3 + (jqa == null ? 0 : jqa.hashCode())) * 31;
        Product product = this.LJ;
        int hashCode5 = (hashCode4 + (product == null ? 0 : product.hashCode())) * 31;
        Boolean bool = this.LJFF;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemeData(view=");
        LIZ.append(this.LIZ);
        LIZ.append(", aweme=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", label=");
        LIZ.append(this.LIZJ);
        LIZ.append(", itemMobParam=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", product=");
        LIZ.append(this.LJ);
        LIZ.append(", isOpenSubtitle=");
        return C78920UyC.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    public /* synthetic */ JYM(View view, Aweme aweme, String str, JQA jqa, int i) {
        this((i & 1) != 0 ? null : view, (i & 2) != 0 ? null : aweme, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : jqa, null, null);
    }

    public JYM(View view, Aweme aweme, String str, JQA jqa, Product product, Boolean bool) {
        this.LIZ = view;
        this.LIZIZ = aweme;
        this.LIZJ = str;
        this.LIZLLL = jqa;
        this.LJ = product;
        this.LJFF = bool;
    }
}
