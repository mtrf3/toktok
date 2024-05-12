package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.ProductAnchor;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JPG extends LinearLayout {
    public final TextView LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JPG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        a1.LJFF(context, "context");
        C34447DfX.LIZ.getClass();
        C62822Ol8 c62822Ol8 = C34447DfX.LIZIZ;
        if (((Number) c62822Ol8.getValue()).intValue() == 1) {
            i = R.layout.cet;
        } else if (((Number) c62822Ol8.getValue()).intValue() == 2) {
            i = R.layout.ces;
        } else {
            i = R.layout.cer;
        }
        LinearLayout.inflate(context, i, this);
        this.LJLIL = (TextView) findViewById(R.id.lt8);
    }

    public final boolean LIZ(Aweme aweme, ProductAnchor productAnchor) {
        List<Product> list;
        Product product;
        String str;
        o.LJIIIZ(aweme, "aweme");
        if (productAnchor != null && (list = productAnchor.productList) != null && (product = (Product) ORZ.LJLLLL(list)) != null && product.LIZ().length() > 0 && 1 != 0) {
            if (aweme.getTotalProductAnchors() <= 0 || (((str = product.elasticTitle) == null || str.length() <= 0) && (str = product.title) == null)) {
                setVisibility(8);
                return false;
            }
            setVisibility(0);
            TextView textView = this.LJLIL;
            if (textView != null) {
                textView.setText(str);
            }
            C78897Uxp.LJJJJJL(this, 0.0f);
            return true;
        }
        setVisibility(8);
        return false;
    }
}
