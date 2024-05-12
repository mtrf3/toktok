package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27941Axt;
import X.C27949Ay1;
import X.C27959AyB;
import X.C76800UCe;
import X.C78764Uvg;
import X.InterfaceC88475Ynv;
import X.W5G;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.addon.AddonOrderVH;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonProductInfo;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.addon.USAddonOrderVH;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectDoneAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes13.dex */
public class IDqS460S0100000_12 extends AbstractC65781Prl implements InterfaceC88475Ynv {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88475Ynv
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4, obj5);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4, obj5);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4, obj5);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS460S0100000_12(AddonOrderVH addonOrderVH, int i) {
        super(5);
        this.$t = i;
        this.l0 = addonOrderVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS460S0100000_12(USAddonOrderVH uSAddonOrderVH, int i) {
        super(5);
        this.$t = i;
        this.l0 = uSAddonOrderVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS460S0100000_12(EffectDoneAssem effectDoneAssem, int i) {
        super(5);
        this.$t = i;
        this.l0 = effectDoneAssem;
    }

    public static final Object invoke$0(IDqS460S0100000_12 iDqS460S0100000_12, Object obj, Object obj2, Object obj3, Object clickArea, Object obj4) {
        String str;
        String str2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C27941Axt item = (C27941Axt) obj2;
        C27959AyB skuInfo = (C27959AyB) obj3;
        int intValue = ((Number) obj4).intValue();
        o.LJIIIZ(item, "item");
        o.LJIIIZ(skuInfo, "skuInfo");
        o.LJIIIZ(clickArea, "clickArea");
        ArrayList arrayList = new ArrayList();
        Iterator<C27959AyB> it = item.LIZ.iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            C27959AyB next = it.next();
            String str3 = next.LJIL;
            if (str3 != null) {
                str = str3;
            }
            ArrayList arrayList2 = new ArrayList();
            String str4 = next.LIZ;
            if (str4 != null) {
                arrayList2.add(str4);
            }
            arrayList.add(new AddonProductInfo(str, arrayList2));
        }
        boolean z = !booleanValue;
        ((AddonOrderVH) iDqS460S0100000_12.l0).M().Vw0(item, z, arrayList, skuInfo);
        if (z) {
            HashMap<String, Object> L = ((AddonOrderVH) iDqS460S0100000_12.l0).L(skuInfo, intValue);
            L.put("click_area", clickArea);
            String str5 = (String) ((HashMap) ((AddonOrderVH) iDqS460S0100000_12.l0).M().LLJJIJIL).get(skuInfo.LIZ);
            if (str5 == null) {
                str5 = "";
            }
            C27949Ay1.LJJIIJZLJL("tiktokec_product_click", str5, L);
        }
        HashMap<String, Object> L2 = ((AddonOrderVH) iDqS460S0100000_12.l0).L(skuInfo, intValue);
        L2.put("click_area", clickArea);
        if (z) {
            str2 = "select";
        } else {
            str2 = "cancel";
        }
        L2.put("action_type", str2);
        String str6 = (String) ((HashMap) ((AddonOrderVH) iDqS460S0100000_12.l0).M().LLJJIJIL).get(skuInfo.LIZ);
        if (str6 != null) {
            str = str6;
        }
        C27949Ay1.LJJIIJZLJL("tiktokec_product_select_option", str, L2);
        return Boolean.TRUE;
    }

    public static final Object invoke$1(IDqS460S0100000_12 iDqS460S0100000_12, Object obj, Object obj2, Object obj3, Object clickArea, Object obj4) {
        String str;
        String str2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C27941Axt item = (C27941Axt) obj2;
        C27959AyB skuInfo = (C27959AyB) obj3;
        int intValue = ((Number) obj4).intValue();
        o.LJIIIZ(item, "item");
        o.LJIIIZ(skuInfo, "skuInfo");
        o.LJIIIZ(clickArea, "clickArea");
        ArrayList arrayList = new ArrayList();
        Iterator<C27959AyB> it = item.LIZ.iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            C27959AyB next = it.next();
            String str3 = next.LJIL;
            if (str3 != null) {
                str = str3;
            }
            ArrayList arrayList2 = new ArrayList();
            String str4 = next.LIZ;
            if (str4 != null) {
                arrayList2.add(str4);
            }
            arrayList.add(new AddonProductInfo(str, arrayList2));
        }
        boolean z = !booleanValue;
        ((USAddonOrderVH) iDqS460S0100000_12.l0).N().Vw0(item, z, arrayList, skuInfo);
        if (z) {
            HashMap<String, Object> M = ((USAddonOrderVH) iDqS460S0100000_12.l0).M(skuInfo, intValue);
            USAddonOrderVH uSAddonOrderVH = (USAddonOrderVH) iDqS460S0100000_12.l0;
            M.put("click_area", clickArea);
            M.put("request_id", uSAddonOrderVH.LJLLLLLL);
            Object obj5 = ((LinkedHashMap) uSAddonOrderVH.LJLZ).get(skuInfo.LIZ);
            if (obj5 == null) {
                obj5 = "";
            }
            M.put("rec_params", obj5);
            String str5 = (String) ((HashMap) ((USAddonOrderVH) iDqS460S0100000_12.l0).N().LLJJIJIL).get(skuInfo.LIZ);
            if (str5 == null) {
                str5 = "";
            }
            C27949Ay1.LJJIIZI("tiktokec_product_click", str5, M);
        }
        HashMap<String, Object> M2 = ((USAddonOrderVH) iDqS460S0100000_12.l0).M(skuInfo, intValue);
        USAddonOrderVH uSAddonOrderVH2 = (USAddonOrderVH) iDqS460S0100000_12.l0;
        M2.put("click_area", clickArea);
        M2.put("request_id", uSAddonOrderVH2.LJLLLLLL);
        Object obj6 = ((LinkedHashMap) uSAddonOrderVH2.LJLZ).get(skuInfo.LIZ);
        if (obj6 == null) {
            obj6 = "";
        }
        M2.put("rec_params", obj6);
        if (z) {
            str2 = "select";
        } else {
            str2 = "cancel";
        }
        M2.put("action_type", str2);
        String str6 = (String) ((HashMap) ((USAddonOrderVH) iDqS460S0100000_12.l0).N().LLJJIJIL).get(skuInfo.LIZ);
        if (str6 != null) {
            str = str6;
        }
        C27949Ay1.LJJIIZI("tiktokec_product_select_option", str, M2);
        return Boolean.TRUE;
    }

    public static final Object invoke$2(IDqS460S0100000_12 iDqS460S0100000_12, Object selectSubscribe, Object obj, Object obj2, Object obj3, Object obj4) {
        String name = (String) obj;
        String author = (String) obj2;
        UrlModel originalImage = (UrlModel) obj3;
        Uri uri = (Uri) obj4;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(author, "author");
        o.LJIIIZ(originalImage, "originalImage");
        View view = ((EffectDoneAssem) iDqS460S0100000_12.l0).LJLL;
        if (view != null) {
            W5G w5g = (W5G) view.findViewById(R.id.csp);
            if (w5g != null) {
                if (uri != null) {
                    C78764Uvg.LJIIIZ(w5g, uri.toString(), -1, -1);
                } else {
                    C78764Uvg.LJFF(w5g, originalImage);
                }
            }
            View view2 = ((EffectDoneAssem) iDqS460S0100000_12.l0).LJLL;
            if (view2 != null) {
                TextView textView = (TextView) view2.findViewById(R.id.kpp);
                if (textView != null) {
                    textView.setText(name);
                }
                View view3 = ((EffectDoneAssem) iDqS460S0100000_12.l0).LJLL;
                if (view3 != null) {
                    TextView textView2 = (TextView) view3.findViewById(R.id.kpo);
                    if (textView2 != null) {
                        textView2.setText(author);
                    }
                    return C76800UCe.LIZ;
                }
                o.LJIJI("root");
                throw null;
            }
            o.LJIJI("root");
            throw null;
        }
        o.LJIJI("root");
        throw null;
    }
}
