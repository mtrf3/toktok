package X;

import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsResponse;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public final class OLL extends FrameLayout {
    public static final OL9 LJLLI = new OL9();
    public OLO LJLIL;
    public final java.util.Map<String, String> LJLILLLLZI;
    public OLI LJLJI;
    public int LJLJJI;
    public VSAProductCardsResponse.ProductDetail LJLJJL;
    public OLP LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;
    public final java.util.Map<Integer, View> LJLL;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LIZIZ() {
        if (!this.LJLJL) {
            return;
        }
        try {
            if (FCZ.LIZ()) {
                OLP olp = this.LJLJJLL;
                if (olp != null) {
                    olp.hide();
                }
                OLO olo = this.LJLIL;
                if (olo != null) {
                    olo.LIZLLL();
                    return;
                }
                return;
            }
            ExecutorC142245i8.LJLILLLLZI.execute(new ARunnableS46S0100000_10(this, 187));
        } catch (Throwable unused) {
        }
    }

    public final void LIZLLL() {
        setVisibility(8);
        LIZIZ();
        OLP olp = this.LJLJJLL;
        if (olp != null) {
            olp.LIZ();
        }
        this.LJLJJLL = null;
        this.LJLIL = null;
        ((LinkedHashMap) this.LJLILLLLZI).clear();
        this.LJLJJI = -1;
        this.LJLJJL = null;
        this.LJLJI = OLI.UNKNOWN;
        this.LJLJL = false;
        this.LJLJLJ = true;
        this.LJLJLLL = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OLL(Context context) {
        super(context, null, 0);
        ContextThemeWrapper contextThemeWrapper;
        this.LJLL = C62850Ola.LJFF(context, "context");
        this.LJLILLLLZI = new LinkedHashMap();
        this.LJLJI = OLI.UNKNOWN;
        this.LJLJJI = -1;
        this.LJLJLJ = true;
        boolean LIZ = C52935Kq3.LIZ();
        setLayoutParams(new FrameLayout.LayoutParams(C7MY.LIZIZ(260), C7MY.LIZIZ(104)));
        if (LIZ) {
            contextThemeWrapper = new ContextThemeWrapper(context, R.style.vt);
        } else {
            contextThemeWrapper = new ContextThemeWrapper(context, R.style.ux);
        }
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(contextThemeWrapper), R.layout.apl, this, true);
        if (LIZ) {
            ((TuxIconView) LIZ(R.id.f0h)).setTintColorRes(R.attr.gu);
        } else {
            ((TuxIconView) LIZ(R.id.f0h)).setTintColorRes(R.attr.dl);
        }
    }

    public final void LIZJ(int i, VSAProductCardsResponse.ProductDetail productDetail) {
        OLO olo = this.LJLIL;
        if (olo != null) {
            olo.LIZIZ(this.LJLJJI, productDetail);
        }
        OLH.LIZLLL(this.LJLJI, i, productDetail, this.LJLILLLLZI, OL6.PRODUCT_CARD, false);
    }
}
