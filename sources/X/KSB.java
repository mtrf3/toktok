package X;

import Y.ACListenerS28S0100000_8;
import Y.ALAdapterS4S0300000_8;
import Y.IDCListenerS245S0100000_8;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecommerce.live.IExtendedTopLiveProductView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KSB extends LinearLayout implements IExtendedTopLiveProductView {
    public static final /* synthetic */ int LJZL = 0;
    public JL8 LJLIL;
    public JL9 LJLILLLLZI;
    public InterfaceC49452Jay LJLJI;
    public String LJLJJI;
    public volatile boolean LJLJJL;
    public List<Product> LJLJJLL;
    public int LJLJL;
    public final SmartImageView LJLJLJ;
    public final LinearLayout LJLJLLL;
    public boolean LJLL;
    public int LJLLI;
    public Product LJLLILLLL;
    public List<String> LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public C84657XKj LJLLLLLL;
    public XKQ LJLZ;
    public final TuxTextView LJZ;
    public final TuxTextView LJZI;

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView
    public View getView() {
        return this;
    }

    public final void LIZLLL() {
        Product product;
        String LIZ;
        setDisplayIndex(this.LJLLI + 1);
        if (this.LJLLI >= this.LJLJL) {
            this.LJLLJ.clear();
        }
        setDisplayIndex(this.LJLLI % this.LJLJL);
        List<Product> list = this.LJLJJLL;
        String str = null;
        if (list != null) {
            product = (Product) ListProtector.get(list, this.LJLLI);
        } else {
            product = null;
        }
        this.LJLLILLLL = product;
        if (product != null) {
            str = product.cover;
        }
        setCoverWithAnim(str);
        setPriceWithAnim(this.LJLLILLLL);
        Product product2 = this.LJLLILLLL;
        if (product2 != null && (LIZ = product2.LIZ()) != null && !this.LJLLJ.contains(LIZ)) {
            C49451Jax.LIZIZ(this.LJLLILLLL, this.LJLIL, this.LJLILLLLZI, this.LJLJI, "search_live_merge_entrance");
            this.LJLLJ.add(LIZ);
        }
    }

    public final Handler getAnimHandler() {
        return (Handler) this.LJLLL.getValue();
    }

    public final Runnable getShowRunnable() {
        return (Runnable) this.LJLLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView
    public final void pauseDisplay() {
        if (this.LJLJL <= 1) {
            return;
        }
        this.LJLL = false;
        getAnimHandler().removeCallbacks(getShowRunnable());
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView
    public final void resumeDisplay() {
        if (this.LJLJL <= 1) {
            return;
        }
        this.LJLL = true;
        getAnimHandler().removeCallbacks(getShowRunnable());
        getAnimHandler().postDelayed(getShowRunnable(), 4000L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KSB(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLLJ = new ArrayList();
        this.LJLLL = C221108m2.LIZIZ(C35891E6t.INSTANCE);
        this.LJLLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 459));
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(80);
        tuxTextView.setTextColorRes(R.attr.do);
        tuxTextView.setTuxFont(92);
        this.LJZ = tuxTextView;
        TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setTextAlignment(5);
        tuxTextView2.setGravity(17);
        tuxTextView2.setTextColorRes(R.attr.do);
        tuxTextView2.setTuxFont(62);
        this.LJZI = tuxTextView2;
        View inflate = View.inflate(context, R.layout.chi, this);
        o.LJII(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        C48956JJg.LIZ(inflate, 2.0f);
        View findViewById = findViewById(R.id.i5t);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.product_cover)");
        this.LJLJLJ = (SmartImageView) findViewById;
        View findViewById2 = findViewById(R.id.g5d);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.ll_price_info)");
        this.LJLJLLL = (LinearLayout) findViewById2;
        addOnAttachStateChangeListener(new IDCListenerS245S0100000_8(this, 11));
    }

    public static Animator LIZ(View target) {
        o.LJIIIZ(target, "target");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(target, (Property<View, Float>) LinearLayout.ALPHA, 1.0f, 0.0f);
        ofFloat.setDuration(300L);
        return ofFloat;
    }

    public static Animator LIZIZ(View target) {
        o.LJIIIZ(target, "target");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(target, (Property<View, Float>) LinearLayout.ALPHA, 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        return ofFloat;
    }

    private final void setCoverWithAnim(String str) {
        Animator LIZ = LIZ(this.LJLJLJ);
        Animator LIZIZ = LIZIZ(this.LJLJLJ);
        LIZ.start();
        LIZ.addListener(new KSC(str, LIZIZ, this));
    }

    private final void setDisplayIndex(int i) {
        this.LJLLI = i;
        JL8 jl8 = this.LJLIL;
        if (jl8 == null) {
            return;
        }
        jl8.LJLILLLLZI = i;
    }

    private final void setPriceWithAnim(Product product) {
        Animator LIZ = LIZ(this.LJLJLLL);
        Animator LIZIZ = LIZIZ(this.LJLJLLL);
        LIZ.start();
        LIZ.addListener(new ALAdapterS4S0300000_8(this, product, LIZIZ, 0));
    }

    public final void LIZJ(Product product) {
        String str;
        Integer num;
        String str2;
        this.LJLJLLL.removeAllViews();
        TuxTextView tuxTextView = this.LJZ;
        String str3 = "";
        if (product == null || (str = product.currencySymbol) == null) {
            str = "";
        }
        tuxTextView.setText(str);
        TuxTextView tuxTextView2 = this.LJZI;
        if (product != null && (str2 = product.formatPriceNumber) != null) {
            str3 = str2;
        }
        tuxTextView2.setText(str3);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C17N.LJIILL(1.0d);
        if (product == null || (num = product.currencyPosition) == null || num.intValue() != 0) {
            this.LJLJLLL.addView(this.LJZ, layoutParams);
            this.LJLJLLL.addView(this.LJZI);
        } else {
            this.LJLJLLL.addView(this.LJZI);
            this.LJLJLLL.addView(this.LJZ, layoutParams);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView
    public final void bindProductData(JL8 jl8) {
        int i;
        List<String> arrayList;
        Product product;
        List<Product> list;
        Product product2;
        String str;
        String str2;
        List<Product> list2;
        Aweme aweme;
        int i2;
        this.LJLIL = jl8;
        int i3 = 0;
        if (jl8 != null) {
            i = jl8.LJLILLLLZI;
        } else {
            i = 0;
        }
        setDisplayIndex(i);
        if (jl8 == null || (arrayList = jl8.LJLJI) == null) {
            arrayList = new ArrayList<>();
        }
        this.LJLLJ = arrayList;
        if (jl8 != null && (aweme = jl8.LJLIL) != null) {
            this.LJLL = false;
            this.LJLJJLL = aweme.getProductsInfo();
            List<Product> productsInfo = aweme.getProductsInfo();
            if (productsInfo != null) {
                i2 = productsInfo.size();
            } else {
                i2 = 0;
            }
            this.LJLJL = i2;
        }
        if (this.LJLJL > 0 && (list2 = this.LJLJJLL) != null) {
            JL8 jl82 = this.LJLIL;
            if (jl82 != null) {
                i3 = jl82.LJLILLLLZI;
            }
            product = (Product) ListProtector.get(list2, i3);
        } else {
            product = null;
        }
        this.LJLLILLLL = product;
        if (product != null && (str2 = product.cover) != null) {
            setCover(str2);
        }
        LIZJ(this.LJLLILLLL);
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS28S0100000_8(this, 49)));
        C59780NdA.LIZ(this, new AqS158S0100000_8(this, 458), new KSA(this));
        if (this.LJLJL > 0 && !this.LJLJJL) {
            this.LJLJJL = true;
            C48658J7u.LIZIZ("rd_ec_product_entrance_did_show", C65232Piu.LIZJ("entrance_form", "search_live_merge_entrance"));
        }
        if (this.LJLJL > 1 && (list = this.LJLJJLL) != null && (product2 = (Product) ListProtector.get(list, 1)) != null && (str = product2.cover) != null) {
            String LJJIIZ = C1E4.LJJIIZ(str, 192, 192, EnumC70569Rmn.GENERAL_SEARCH_LIVE_CARD);
            this.LJLLLLLL = C77275UUl.LIZ();
            this.LJLZ = XKX.LIZLLL(C780334l.LJLIL, null, null, new C37342El8(this, LJJIIZ, null), 3);
        }
    }

    public final void setCover(String str) {
        W5F LJIIIIZZ = W5U.LJIIIIZZ(C1E4.LJJIIZ(str, 192, 192, EnumC70569Rmn.GENERAL_SEARCH_LIVE_CARD));
        LJIIIIZZ.LJJIIJ = this.LJLJLJ;
        C16880lQ.LLJJJ(LJIIIIZZ);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.IExtendedTopLiveProductView
    public void setLiveProductSearchAbility(InterfaceC49452Jay interfaceC49452Jay) {
        this.LJLJI = interfaceC49452Jay;
    }

    public final void setPreloadCover(String str) {
        C84657XKj c84657XKj = this.LJLLLLLL;
        if (c84657XKj != null && c84657XKj.isCompleted()) {
            setCover(str);
        } else {
            XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new EHY(this, str, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.IExtendedTopLiveProductView
    public final void bindExtraProductData(JL9 jl9, String str, int i, Context context) {
        this.LJLILLLLZI = jl9;
        this.LJLJJI = str;
    }
}
