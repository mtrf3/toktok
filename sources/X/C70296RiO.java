package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.IShopRecommendStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Price;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Product;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.utils.Au2S1S0301000_12;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS32S0301000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.RiO, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70296RiO extends AbstractC029409q<C70297RiP> {
    public final ECBaseFragment LJLIL;
    public final IShopRecommendStyle LJLILLLLZI;
    public final PdpViewModel LJLJI;
    public List<ProductData> LJLJJI;
    public String LJLJJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJI.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C70297RiP c70297RiP, int i) {
        Image image;
        String str;
        Price price;
        String str2;
        String str3;
        String str4;
        Price price2;
        List<Image> list;
        C70297RiP holder = c70297RiP;
        o.LJIIIZ(holder, "holder");
        java.util.Map map = null;
        if (getItemCount() < 1) {
            return;
        }
        ProductData productData = (ProductData) ListProtector.get(this.LJLJJI, i % getItemCount());
        if (productData == null) {
            return;
        }
        Product product = productData.product;
        if (product != null && (list = product.images) != null) {
            image = (Image) ORZ.LJLLLLLL(0, list);
        } else {
            image = null;
        }
        W5F LJ = C70759Rpr.LJ(image);
        LJ.LJIJJ = EnumC72807Shn.FIT_CENTER;
        EnumC72807Shn enumC72807Shn = EnumC72807Shn.CENTER;
        LJ.LJIIJJI = R.drawable.adv;
        LJ.LJIILJJIL = enumC72807Shn;
        LJ.LIZIZ("ShopRecommendProductVH");
        IShopRecommendStyle iShopRecommendStyle = holder.LJLILLLLZI;
        Context context = holder.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        LJ.LJIJJLI = iShopRecommendStyle.getProductImageOption(context);
        LJ.LJJIIJ = (SmartImageView) holder.itemView.findViewById(R.id.i5x);
        C16880lQ.LLJJJ(LJ);
        View findViewById = holder.itemView.findViewById(R.id.i5x);
        o.LJIIIIZZ(findViewById, "itemView.product_image");
        C27570Aru.LJI(holder.LJLILLLLZI.getProductImageSize(), holder.LJLILLLLZI.getProductImageSize(), findViewById);
        Product product2 = productData.product;
        if (product2 != null && (price2 = product2.price) != null) {
            str = price2.pricePrefix;
        } else {
            str = null;
        }
        String str5 = "";
        if (str != null && product2.price.pricePrefix.length() > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(productData.product.price.pricePrefix);
            LIZ.append(' ');
            spannableStringBuilder.append((CharSequence) X1D.LIZIZ(LIZ));
            spannableStringBuilder.setSpan(new T5U(81, false), 0, productData.product.price.pricePrefix.length(), 33);
            String str6 = productData.product.price.minPrice;
            if (str6 != null) {
                str5 = str6;
            }
            spannableStringBuilder.append((CharSequence) str5);
            ((TextView) holder.itemView.findViewById(R.id.i6e)).setText(spannableStringBuilder);
        } else {
            TextView textView = (TextView) holder.itemView.findViewById(R.id.i6e);
            Product product3 = productData.product;
            if (product3 != null && (price = product3.price) != null && (str2 = price.minPrice) != null) {
                str5 = str2;
            }
            textView.setText(str5);
        }
        ((TuxTextView) holder.itemView.findViewById(R.id.i6e)).setTuxFont(holder.LJLILLLLZI.getProductPriceFont());
        ((TuxTextView) holder.itemView.findViewById(R.id.i6e)).setTextColorRes(holder.LJLILLLLZI.getProductPriceTextColor());
        Product product4 = productData.product;
        if (product4 != null) {
            str3 = product4.productId;
            str4 = product4.logExtra;
        } else {
            str3 = null;
            str4 = null;
        }
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str4, C65330PkU.LIZJ(C65352Pkq.LJIIIIZZ(java.util.Map.class, C65340Pke.LIZ(C65352Pkq.LJI(String.class)), C65340Pke.LIZ(C65352Pkq.LIZLLL(Object.class)))));
            if (!(fromJson instanceof java.util.Map)) {
                fromJson = null;
            }
            map = (java.util.Map) fromJson;
        } catch (s unused) {
        }
        View findViewById2 = holder.itemView.findViewById(R.id.i5x);
        o.LJIIIIZZ(findViewById2, "itemView.product_image");
        C16880lQ.LJIIJ(new Au2S1S0301000_12(holder, productData, i, map, 5), findViewById2);
        if (str3 == null || ((ArrayList) holder.LJLJI.LLJJIII).contains(str3)) {
            return;
        }
        ((ArrayList) holder.LJLJI.LLJJIII).add(str3);
        C78946Uyc.LJJII(holder.LJLIL, new C70913RsL(), new AqS32S0301000_12(i, holder, productData, map, 3));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C70297RiP com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C70297RiP c70297RiP = new C70297RiP(parent, this.LJLJI, this.LJLJJL, this.LJLIL, this.LJLILLLLZI);
        C0AX.LIZ(parent, c70297RiP.itemView, R.id.lj7);
        View view = c70297RiP.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c70297RiP.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C70297RiP.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c70297RiP.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c70297RiP.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C70297RiP.class.getName();
        return c70297RiP;
    }

    public C70296RiO(PdpViewModel viewModel, ECBaseFragment fragment, IShopRecommendStyle style) {
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(style, "style");
        this.LJLIL = fragment;
        this.LJLILLLLZI = style;
        this.LJLJI = viewModel;
        this.LJLJJI = new ArrayList();
        this.LJLJJL = "";
    }
}
