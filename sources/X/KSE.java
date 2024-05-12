package X;

import Y.ACListenerS28S0100000_8;
import Y.IDCListenerS245S0100000_8;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecommerce.live.IExtendedTopLiveProductView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KSE extends LinearLayout implements IExtendedTopLiveProductView {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final TuxTextView LJLIL;
    public JL8 LJLILLLLZI;
    public JL9 LJLJI;
    public InterfaceC49452Jay LJLJJI;
    public String LJLJJL;
    public Product LJLJJLL;
    public List<String> LJLJL;
    public volatile boolean LJLJLJ;

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView
    public View getView() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView
    public final void pauseDisplay() {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView
    public final void resumeDisplay() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KSE(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLJL = new ArrayList();
        o.LJII(View.inflate(context, R.layout.chh, this), "null cannot be cast to non-null type android.widget.LinearLayout");
        o.LJIIIIZZ(findViewById(R.id.i5w), "findViewById(R.id.product_icon)");
        View findViewById = findViewById(R.id.i6k);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.product_title)");
        this.LJLIL = (TuxTextView) findViewById;
        addOnAttachStateChangeListener(new IDCListenerS245S0100000_8(this, 10));
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView
    public final void bindProductData(JL8 jl8) {
        List<String> arrayList;
        String str;
        Aweme aweme;
        Product product;
        this.LJLILLLLZI = jl8;
        if (jl8 == null || (arrayList = jl8.LJLJI) == null) {
            arrayList = new ArrayList<>();
        }
        this.LJLJL = arrayList;
        if (jl8 != null && (aweme = jl8.LJLIL) != null) {
            List<Product> productsInfo = aweme.getProductsInfo();
            if (productsInfo != null) {
                product = (Product) ORZ.LJLLLL(productsInfo);
            } else {
                product = null;
            }
            this.LJLJJLL = product;
        }
        TuxTextView tuxTextView = this.LJLIL;
        Product product2 = this.LJLJJLL;
        if (product2 == null || (str = product2.title) == null) {
            str = "";
        }
        tuxTextView.setText(str);
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS28S0100000_8(this, 48)));
        C59780NdA.LIZ(this, new AqS158S0100000_8(this, 457), new AqS174S0100000_8(this, 160));
        if (!this.LJLJLJ) {
            this.LJLJLJ = true;
            C48658J7u.LIZIZ("rd_ec_product_entrance_did_show", C65232Piu.LIZJ("entrance_form", "search_live_single_anchor"));
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.IExtendedTopLiveProductView
    public void setLiveProductSearchAbility(InterfaceC49452Jay interfaceC49452Jay) {
        this.LJLJJI = interfaceC49452Jay;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.IExtendedTopLiveProductView
    public final void bindExtraProductData(JL9 jl9, String str, int i, Context context) {
        this.LJLJI = jl9;
        this.LJLJJL = str;
    }
}
