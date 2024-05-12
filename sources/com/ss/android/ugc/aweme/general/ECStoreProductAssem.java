package com.ss.android.ugc.aweme.general;

import X.C16880lQ;
import X.C40689Fy1;
import X.C47261Igj;
import X.C49362JYw;
import X.C8VR;
import X.C8XO;
import X.JXS;
import X.JZJ;
import X.KL2;
import X.ORZ;
import X.S3I;
import X.S3L;
import X.W5F;
import X.W5U;
import Y.IDCListenerS245S0100000_8;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.model.AddressCardProducts;
import com.ss.android.ugc.aweme.ecommerce.model.EComImage;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS38S0301000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ECStoreProductAssem extends ReusedUISlotAssem<ECStoreProductAssem> implements C8XO<JXS> {
    public JXS LLFF;
    public final Map<Integer, View> LLFFF = new LinkedHashMap();

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ap_;
    }

    public final View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this.LLFFF;
        Integer valueOf = Integer.valueOf(R.id.g5f);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = getContainerView().findViewById(R.id.g5f);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(JXS jxs) {
        int i;
        EComShopCardStruct eComShopCardStruct;
        List<AddressCardProducts> list;
        EComShopCardStruct eComShopCardStruct2;
        List<AddressCardProducts> list2;
        String str;
        int i2;
        Character LLI;
        List<String> list3;
        Resources resources;
        DisplayMetrics displayMetrics;
        JXS item = jxs;
        o.LJIIIZ(item, "item");
        this.LLFF = item;
        int i3 = R.id.g5f;
        ((ViewGroup) _$_findCachedViewById(R.id.g5f)).removeAllViews();
        View ll_product = _$_findCachedViewById(R.id.g5f);
        o.LJIIIIZZ(ll_product, "ll_product");
        ll_product.setVisibility(0);
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            i = displayMetrics.widthPixels;
        } else {
            i = 0;
        }
        float LIZJ = (i - (KL2.LIZJ(getContext(), 8.0f) * 4)) / 3;
        SearchMixFeedBase searchMixFeedBase = item.LJLIL;
        if (searchMixFeedBase == null || (eComShopCardStruct = searchMixFeedBase.shopCard) == null || (list = eComShopCardStruct.addressCardProduct) == null || list.size() < 3) {
            View ll_product2 = _$_findCachedViewById(R.id.g5f);
            o.LJIIIIZZ(ll_product2, "ll_product");
            ll_product2.setVisibility(8);
            return;
        }
        SearchMixFeedBase searchMixFeedBase2 = item.LJLIL;
        if (searchMixFeedBase2 == null || (eComShopCardStruct2 = searchMixFeedBase2.shopCard) == null || (list2 = eComShopCardStruct2.addressCardProduct) == null) {
            return;
        }
        int i4 = 0;
        for (AddressCardProducts addressCardProducts : list2) {
            int i5 = i4 + 1;
            if (i4 >= 0) {
                AddressCardProducts addressCardProducts2 = addressCardProducts;
                if (i4 >= 3) {
                    return;
                }
                View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.ap9, null, false);
                if (LIZJ > 0.0f) {
                    int i6 = (int) LIZJ;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i6, i6);
                    layoutParams.setMarginStart((int) KL2.LIZJ(getContext(), 8.0f));
                    LLLLIILL.setLayoutParams(layoutParams);
                    ViewGroup viewGroup = (ViewGroup) _$_findCachedViewById(i3);
                    if (viewGroup != null) {
                        viewGroup.addView(LLLLIILL, layoutParams);
                    }
                }
                EComImage eComImage = addressCardProducts2.img;
                if (eComImage == null || (list3 = eComImage.urlList) == null || (str = (String) ORZ.LJLLLLLL(0, list3)) == null) {
                    str = "";
                }
                W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
                LJIIIIZZ.LIZJ = LLLLIILL.findViewById(R.id.eht).getContext();
                S3I s3i = new S3I();
                s3i.LIZLLL = KL2.LIZJ(getContext(), 4.0f);
                LJIIIIZZ.LJIJJLI = new S3L(s3i);
                LJIIIIZZ.LJJIIJ = (SmartImageView) LLLLIILL.findViewById(R.id.eht);
                C16880lQ.LLJJJ(LJIIIIZZ);
                String str2 = addressCardProducts2.marketPrice;
                if (str2 != null && (LLI = C40689Fy1.LLI(0, str2)) != null) {
                    i2 = !Character.isDigit(LLI.charValue()) ? 1 : 0;
                } else {
                    i2 = 1;
                }
                JZJ jzj = new JZJ();
                String str3 = addressCardProducts2.marketPriceNumber;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = addressCardProducts2.currencySymbol;
                if (str4 == null) {
                    str4 = "";
                }
                jzj.LIZ = str3;
                jzj.LIZIZ = str4;
                jzj.LIZJ = i2 ^ 1;
                jzj.LIZLLL = "";
                jzj.LIZJ(3);
                jzj.LJI = R.attr.go;
                jzj.LJII = false;
                Context context2 = LLLLIILL.getContext();
                o.LJIIIIZZ(context2, "productItemView.context");
                ((TextView) LLLLIILL.findViewById(R.id.mes)).setText(jzj.LIZIZ(context2));
                if (Build.VERSION.SDK_INT >= 23) {
                    LLLLIILL.setForeground(LLLLIILL.getContext().getDrawable(R.drawable.ap0));
                }
                C49362JYw.LIZIZ(LLLLIILL, Integer.valueOf(R.drawable.ap0), Integer.valueOf(R.drawable.ap1), new AqS38S0301000_8(LLLLIILL, addressCardProducts2, this, i4, 0));
                i4 = i5;
                i3 = R.id.g5f;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(JXS jxs) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8VR.LIZ(this, new AqS174S0100000_8(this, 41));
        view.addOnAttachStateChangeListener(new IDCListenerS245S0100000_8(this, 2));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(JXS jxs) {
    }
}
