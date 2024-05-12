package com.ss.android.ugc.aweme.general;

import X.C16880lQ;
import X.C40689Fy1;
import X.C47261Igj;
import X.C73105Smb;
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
import com.ss.android.ugc.aweme.utils.Au2S0S0301000_8;
import com.ss.android.ugc.aweme.utils.Au2S17S0100000_8;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ECStoreLiveAssem extends ReusedUISlotAssem<ECStoreLiveAssem> implements C8XO<JXS> {
    public JXS LLFF;
    public final Map<Integer, View> LLFFF = new LinkedHashMap();

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aoo;
    }

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFFF;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = getContainerView().findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    @Override // X.C8XO
    public final void F0(JXS jxs) {
        String str;
        int i;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        List<AddressCardProducts> list;
        String str2;
        int i2;
        Character LLI;
        List<String> list2;
        Resources resources;
        DisplayMetrics displayMetrics;
        SearchMixFeedBase searchMixFeedBase2;
        EComShopCardStruct eComShopCardStruct2;
        JXS item = jxs;
        o.LJIIIZ(item, "item");
        this.LLFF = item;
        TextView textView = (TextView) _$_findCachedViewById(R.id.maa);
        JXS jxs2 = this.LLFF;
        if (jxs2 == null || (searchMixFeedBase2 = jxs2.LJLIL) == null || (eComShopCardStruct2 = searchMixFeedBase2.shopCard) == null || (str = eComShopCardStruct2.liveTitle) == null) {
            str = "";
        }
        textView.setText(str);
        int i3 = R.id.g5f;
        ((ViewGroup) _$_findCachedViewById(R.id.g5f)).removeAllViews();
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            i = displayMetrics.widthPixels;
        } else {
            i = 0;
        }
        float LIZJ = KL2.LIZJ(getContext(), 8.0f);
        float f = 5 * LIZJ;
        float f2 = 2 * LIZJ;
        float f3 = i;
        int i4 = (int) (((f3 - f) - f2) / 4);
        int round = Math.round(((f3 - f2) - (i4 * 4)) / 5.0f);
        JXS jxs3 = this.LLFF;
        if (jxs3 != null && (searchMixFeedBase = jxs3.LJLIL) != null && (eComShopCardStruct = searchMixFeedBase.shopCard) != null && (list = eComShopCardStruct.addressCardProduct) != null) {
            int i5 = 0;
            for (AddressCardProducts addressCardProducts : list) {
                int i6 = i5 + 1;
                if (i5 >= 0) {
                    AddressCardProducts addressCardProducts2 = addressCardProducts;
                    View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.ap9, null, false);
                    if (i4 > 0) {
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i4, i4);
                        layoutParams.setMarginStart(round);
                        LLLLIILL.setLayoutParams(layoutParams);
                        ViewGroup viewGroup = (ViewGroup) _$_findCachedViewById(i3);
                        if (viewGroup != null) {
                            viewGroup.addView(LLLLIILL, layoutParams);
                        }
                    }
                    EComImage eComImage = addressCardProducts2.img;
                    if (eComImage == null || (list2 = eComImage.urlList) == null || (str2 = (String) ORZ.LJLLLLLL(0, list2)) == null) {
                        str2 = "";
                    }
                    W5F LJIIIIZZ = W5U.LJIIIIZZ(str2);
                    LJIIIIZZ.LIZJ = LLLLIILL.findViewById(R.id.eht).getContext();
                    S3I s3i = new S3I();
                    s3i.LIZLLL = KL2.LIZJ(getContext(), 4.0f);
                    LJIIIIZZ.LJIJJLI = new S3L(s3i);
                    LJIIIIZZ.LJJIIJ = (SmartImageView) LLLLIILL.findViewById(R.id.eht);
                    C16880lQ.LLJJJ(LJIIIIZZ);
                    String str3 = addressCardProducts2.marketPrice;
                    if (str3 != null && (LLI = C40689Fy1.LLI(0, str3)) != null) {
                        i2 = !Character.isDigit(LLI.charValue()) ? 1 : 0;
                    } else {
                        i2 = 1;
                    }
                    JZJ jzj = new JZJ();
                    String str4 = addressCardProducts2.marketPriceNumber;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = addressCardProducts2.currencySymbol;
                    if (str5 == null) {
                        str5 = "";
                    }
                    jzj.LIZ = str4;
                    jzj.LIZIZ = str5;
                    jzj.LIZJ = i2 ^ 1;
                    jzj.LIZLLL = "";
                    jzj.LIZJ(4);
                    jzj.LJI = R.attr.go;
                    jzj.LJII = false;
                    Context context2 = LLLLIILL.getContext();
                    o.LJIIIIZZ(context2, "productItemView.context");
                    ((TextView) LLLLIILL.findViewById(R.id.mes)).setText(jzj.LIZIZ(context2));
                    C16880lQ.LJIIJ(new Au2S0S0301000_8(LLLLIILL, this, addressCardProducts2, i5, 0), LLLLIILL);
                    i5 = i6;
                    i3 = R.id.g5f;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        _$_findCachedViewById(R.id.jge).setClipToOutline(true);
        _$_findCachedViewById(R.id.jge).setOutlineProvider(new C73105Smb(this));
        View search_live_view = _$_findCachedViewById(R.id.jge);
        o.LJIIIIZZ(search_live_view, "search_live_view");
        C16880lQ.LJIIJ(new Au2S17S0100000_8(this, 7), search_live_view);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(JXS jxs) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8VR.LIZ(this, new AqS139S0200000_8(view, this, 4));
        view.addOnAttachStateChangeListener(new IDCListenerS245S0100000_8(this, 1));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(JXS jxs) {
    }
}
