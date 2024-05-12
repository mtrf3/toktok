package com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel;

import X.C025908h;
import X.C16880lQ;
import X.C188727au;
import X.C27739Aud;
import X.C45804HyK;
import X.C51029K0z;
import X.C63081OpJ;
import X.C70570Rmo;
import X.C70759Rpr;
import X.C71360RzY;
import X.C71361RzZ;
import X.C71363Rzb;
import X.C71370Rzi;
import X.C71379Rzr;
import X.C76542zS;
import X.C78939UyV;
import X.C86V;
import X.EnumC71103RvP;
import X.InterfaceC44105HSr;
import X.L7W;
import X.ORZ;
import X.OSZ;
import X.W5F;
import X.Z9N;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorPrivilege;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorPrivilegeItem;
import com.ss.android.ugc.aweme.ecommerce.model.DaInfo;
import com.ss.android.ugc.aweme.ecommerce.model.PanelOpenInfo;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS12S1110000_12;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS54S0110000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ECommerceAnchorPanelViewModel extends ViewModel {
    public static final /* synthetic */ int LJLLLL = 0;
    public InterfaceC44105HSr LJLIL;
    public ProductListModel LJLILLLLZI;
    public AnchorCommonStruct LJLJI;
    public int LJLJJI;
    public ShopWindowAnchorModel LJLJL;
    public String LJLL;
    public boolean LJLLL;
    public List<ShopWindowAnchorModel> LJLJJL = new ArrayList();
    public final MutableLiveData<ShopWindowExtraModel> LJLJJLL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJLJLJ = new MutableLiveData<>();
    public String LJLJLLL = "";
    public Map<String, Object> LJLLI = new LinkedHashMap();
    public final List<Observer<List<C71379Rzr>>> LJLLILLLL = new ArrayList();
    public final MutableLiveData<List<C71379Rzr>> LJLLJ = new MutableLiveData<>();

    public final boolean rv0() {
        ShopWindowExtraModel shopWindowExtraModel;
        ShopWindowAnchorModel shopWindowAnchorModel = this.LJLJL;
        if (shopWindowAnchorModel != null && (shopWindowExtraModel = shopWindowAnchorModel.LIZ) != null) {
            Integer num = shopWindowExtraModel.productStatus;
            int value = EnumC71103RvP.PRODUCT_STATUS_DOWN.getValue();
            if (num != null && num.intValue() == value) {
                return true;
            }
        }
        return false;
    }

    public final String xv0() {
        int i = this.LJLJJI;
        if (i > 1 && i == this.LJLJJL.size()) {
            String LJFF = C86V.LJFF(R.string.tqz);
            o.LJIIIIZZ(LJFF, "getString(R.string.view_products)");
            return LJFF;
        }
        int i2 = this.LJLJJI;
        if (i2 > 1 && i2 != this.LJLJJL.size()) {
            String LJFF2 = C86V.LJFF(R.string.tqx);
            o.LJIIIIZZ(LJFF2, "getString(R.string.view_links)");
            return LJFF2;
        }
        return yv0();
    }

    public final String yv0() {
        if (!this.LJLJJL.isEmpty()) {
            Integer num = ((ShopWindowAnchorModel) ListProtector.get(this.LJLJJL, 0)).type;
            if (num == null || num.intValue() != 33) {
                Integer num2 = ((ShopWindowAnchorModel) ListProtector.get(this.LJLJJL, 0)).type;
                if (num2 == null || num2.intValue() != 6) {
                    return "";
                }
                return ((ShopWindowAnchorModel) ListProtector.get(this.LJLJJL, 0)).keyword;
            }
            String str = ((ShopWindowAnchorModel) ListProtector.get(this.LJLJJL, 0)).LIZ.elasticTitle;
            if (!TextUtils.isEmpty(str)) {
                if (str == null) {
                    return "";
                }
            } else {
                str = ((ShopWindowAnchorModel) ListProtector.get(this.LJLJJL, 0)).LIZ.title;
                if (str == null) {
                    return "";
                }
            }
            return str;
        }
        String LJFF = C86V.LJFF(R.string.bok);
        o.LJIIIIZZ(LJFF, "getString(R.string.anchor_card_button)");
        return LJFF;
    }

    public ECommerceAnchorPanelViewModel() {
        new C188727au();
    }

    public static boolean hv0(ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel) {
        eCommerceAnchorPanelViewModel.getClass();
        if (eCommerceAnchorPanelViewModel.LJLJJLL.getValue() != null) {
            return true;
        }
        return false;
    }

    public static OSZ nv0(ShopWindowExtraModel product) {
        Object obj;
        o.LJIIIZ(product, "product");
        AnchorPrivilege anchorPrivilege = product.anchorPrivilege;
        Object obj2 = null;
        if (anchorPrivilege == null) {
            return new OSZ(null, null);
        }
        List<AnchorPrivilegeItem> anchorPrivilegeItems = anchorPrivilege.getAnchorPrivilegeItems();
        if (anchorPrivilegeItems != null) {
            obj = ORZ.LJLLLLLL(0, anchorPrivilegeItems);
        } else {
            obj = null;
        }
        List<AnchorPrivilegeItem> anchorPrivilegeItems2 = anchorPrivilege.getAnchorPrivilegeItems();
        if (anchorPrivilegeItems2 != null) {
            obj2 = ORZ.LJLLLLLL(1, anchorPrivilegeItems2);
        }
        return new OSZ(obj, obj2);
    }

    public static Map ov0(ShopWindowExtraModel product) {
        String str;
        AnchorPrivilegeItem anchorPrivilegeItem;
        DaInfo daInfo;
        AnchorPrivilegeItem anchorPrivilegeItem2;
        DaInfo daInfo2;
        o.LJIIIZ(product, "product");
        AnchorPrivilege anchorPrivilege = product.anchorPrivilege;
        if (anchorPrivilege == null) {
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<AnchorPrivilegeItem> anchorPrivilegeItems = anchorPrivilege.getAnchorPrivilegeItems();
        String str2 = null;
        if (anchorPrivilegeItems != null && (anchorPrivilegeItem2 = (AnchorPrivilegeItem) ORZ.LJLLLLLL(0, anchorPrivilegeItems)) != null && (daInfo2 = anchorPrivilegeItem2.getDaInfo()) != null) {
            str = daInfo2.extra;
        } else {
            str = null;
        }
        HashMap<String, Object> LJII = C27739Aud.LJII(str);
        if (LJII != null) {
            linkedHashMap.putAll(LJII);
        }
        List<AnchorPrivilegeItem> anchorPrivilegeItems2 = anchorPrivilege.getAnchorPrivilegeItems();
        if (anchorPrivilegeItems2 != null && (anchorPrivilegeItem = (AnchorPrivilegeItem) ORZ.LJLLLLLL(1, anchorPrivilegeItems2)) != null && (daInfo = anchorPrivilegeItem.getDaInfo()) != null) {
            str2 = daInfo.extra;
        }
        HashMap<String, Object> LJII2 = C27739Aud.LJII(str2);
        if (LJII2 != null) {
            linkedHashMap.putAll(LJII2);
        }
        return linkedHashMap;
    }

    public final String mv0(String str) {
        String str2;
        String aid;
        HashMap<String, String> mobParams;
        try {
            ProductListModel productListModel = this.LJLILLLLZI;
            String str3 = "";
            if (productListModel == null || (mobParams = productListModel.getMobParams()) == null || (str2 = mobParams.get("request_id")) == null) {
                str2 = "";
            }
            ProductListModel productListModel2 = this.LJLILLLLZI;
            if (productListModel2 != null && (aid = productListModel2.getAid()) != null) {
                str3 = aid;
            }
            str = C70570Rmo.LIZ(str2, str3, str);
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    public static void jv0(ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel, int i) {
        boolean z;
        Integer num;
        String str;
        ShopWindowExtraModel shopWindowExtraModel;
        ShopWindowExtraModel shopWindowExtraModel2;
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        eCommerceAnchorPanelViewModel.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ShopWindowAnchorModel shopWindowAnchorModel = eCommerceAnchorPanelViewModel.LJLJL;
        String str2 = null;
        if (shopWindowAnchorModel != null && (shopWindowExtraModel2 = shopWindowAnchorModel.LIZ) != null) {
            num = shopWindowExtraModel2.platform;
        } else {
            num = null;
        }
        linkedHashMap.put("product_source", String.valueOf(num));
        ShopWindowAnchorModel shopWindowAnchorModel2 = eCommerceAnchorPanelViewModel.LJLJL;
        if (shopWindowAnchorModel2 != null && (shopWindowExtraModel = shopWindowAnchorModel2.LIZ) != null) {
            str = shopWindowExtraModel.source;
        } else {
            str = null;
        }
        linkedHashMap.put("source", String.valueOf(str));
        ProductListModel productListModel = eCommerceAnchorPanelViewModel.LJLILLLLZI;
        if (productListModel != null) {
            str2 = productListModel.getEventType();
        }
        linkedHashMap.put("enter_from", str2);
        linkedHashMap.put("anchor_anim_type", 0);
        linkedHashMap.put("rd_extra", "custom");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C51029K0z.LJJIIZ(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                value = "";
            }
            linkedHashMap2.put(key, value);
        }
        C76542zS.LIZJ("rd_tiktok_video_anchor_show", new AqS54S0110000_12(z, (boolean) linkedHashMap2, (Map<String, ? extends Object>) 5));
    }

    public final void gv0(String str, String str2) {
        Integer num;
        String str3;
        boolean z;
        Boolean isSingleAnchor;
        ShopWindowExtraModel shopWindowExtraModel;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ShopWindowAnchorModel shopWindowAnchorModel = this.LJLJL;
        if (shopWindowAnchorModel != null && (shopWindowExtraModel = shopWindowAnchorModel.LIZ) != null) {
            num = shopWindowExtraModel.platform;
        } else {
            num = null;
        }
        linkedHashMap.put("product_source", String.valueOf(num));
        ProductListModel productListModel = this.LJLILLLLZI;
        if (productListModel == null || (str3 = productListModel.getEventType()) == null) {
            str3 = "";
        }
        linkedHashMap.put("enter_from", str3);
        linkedHashMap.put("rd_extra", str2);
        if (rv0()) {
            linkedHashMap.put("shopping_status", "product_not_available");
        } else {
            linkedHashMap.put("shopping_status", "product_available");
        }
        ProductListModel productListModel2 = this.LJLILLLLZI;
        if (productListModel2 != null && (isSingleAnchor = productListModel2.isSingleAnchor()) != null) {
            z = isSingleAnchor.booleanValue();
        } else {
            z = true;
        }
        C76542zS.LIZJ("rd_tiktok_video_anchor_click", new AqS12S1110000_12(str, linkedHashMap, z, 2));
    }

    public final void kv0(boolean z, boolean z2) {
        List<ShopWindowAnchorModel> list = this.LJLJJL;
        ArrayList arrayList = new ArrayList();
        Iterator<ShopWindowAnchorModel> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().LIZ.productId));
        }
        vv0(z, arrayList, 1, z2, null);
    }

    public final void lv0(TuxIconView tuxIconView, SmartImageView smartImageView) {
        UrlModel newStyleBubbleIcon;
        if (tuxIconView != null) {
            AqS159S0200000_12 aqS159S0200000_12 = new AqS159S0200000_12(this, tuxIconView, 13);
            if (smartImageView == null) {
                aqS159S0200000_12.invoke();
            }
            AnchorCommonStruct anchorCommonStruct = this.LJLJI;
            if (anchorCommonStruct != null && (newStyleBubbleIcon = anchorCommonStruct.getNewStyleBubbleIcon()) != null && this.LJLLL) {
                C45804HyK.LJJIJIIJIL(tuxIconView);
                C45804HyK.LJJLL(smartImageView);
                W5F LIZLLL = C70759Rpr.LIZLLL(C78939UyV.LJ(newStyleBubbleIcon));
                LIZLLL.LJJIIJ = smartImageView;
                C16880lQ.LLJJJ(LIZLLL);
                return;
            }
            aqS159S0200000_12.invoke();
        }
    }

    public final void pv0(ProductListModel productListModel, Map<String, Object> map) {
        if (productListModel == null) {
            return;
        }
        String str = null;
        map.putAll(Z9N.LIZIZ.LIZ.LJJZ(productListModel.getEventType(), null, "search_result_id", "search_id", "list_item_id", "last_from_group_id"));
        ProductListModel productListModel2 = this.LJLILLLLZI;
        if (productListModel2 != null) {
            str = productListModel2.getEventType();
        }
        if (o.LJ(str, "general_search")) {
            map.put("list_item_id", productListModel.getAid());
        }
    }

    public final void uv0(int i, int i2, long j, String str) {
        PanelOpenInfo panelOpenInfo;
        ProductListModel productListModel = this.LJLILLLLZI;
        int i3 = 1;
        String LJIIIZ = C71360RzY.LJIIIZ(productListModel, true);
        if (LJIIIZ == null) {
            LJIIIZ = "video_multi_anchor";
        }
        List<ShopWindowAnchorModel> list = this.LJLJJL;
        C71361RzZ.LIZ.getClass();
        L7W LJJIL = C71361RzZ.LJJIL(list);
        ProductListModel productListModel2 = this.LJLILLLLZI;
        if (productListModel2 != null && (panelOpenInfo = productListModel2.getPanelOpenInfo()) != null) {
            i3 = panelOpenInfo.getPanelStyle();
        }
        C71363Rzb.LJIJI(productListModel, LJIIIZ, i2, list, LJJIL, j, str, i, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zv0(com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponseData r26, boolean r27, androidx.recyclerview.widget.RecyclerView r28, int r29) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel.zv0(com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponseData, boolean, androidx.recyclerview.widget.RecyclerView, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0317  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void iv0(com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel r13, X.C188727au r14, java.lang.String r15, java.util.HashMap r16, int r17) {
        /*
            Method dump skipped, instructions count: 1097
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel.iv0(com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel, X.7au, java.lang.String, java.util.HashMap, int):void");
    }

    public final void qv0(AnchorCommonStruct anchorCommonStruct, InterfaceC44105HSr interfaceC44105HSr, boolean z, int i, ProductListModel productListModel) {
        List<ShopWindowAnchorModel> LJJJJLL;
        Aweme aweme;
        this.LJLIL = interfaceC44105HSr;
        this.LJLJI = anchorCommonStruct;
        this.LJLJJI = i;
        this.LJLLL = z;
        this.LJLJLJ.setValue(null);
        if (productListModel == null) {
            if (interfaceC44105HSr != null) {
                aweme = interfaceC44105HSr.LJJLL();
            } else {
                aweme = null;
            }
            productListModel = C71360RzY.LJJIJ(aweme, interfaceC44105HSr, null, null, 28);
        }
        this.LJLILLLLZI = productListModel;
        List<ShopWindowAnchorModel> products = productListModel.getProducts();
        if (products != null) {
            LJJJJLL = ORZ.LLJILJILJ(products);
        } else {
            C71361RzZ.LIZ.getClass();
            LJJJJLL = C71361RzZ.LJJJJLL(anchorCommonStruct, false);
        }
        this.LJLJJL = LJJJJLL;
        this.LJLJL = (ShopWindowAnchorModel) ORZ.LJLLLL(LJJJJLL);
    }

    public final void sv0(ProductListModel productListModel, int i, String str, String str2, String str3) {
        Integer num;
        String str4;
        AwemeRawAd LJJJJI;
        IECommerceAnchorService LJJJJI2 = ECommerceAnchorService.LJJJJI();
        Aweme aweme = productListModel.getAweme();
        String entranceForm = productListModel.getEntranceForm();
        if (entranceForm == null) {
            entranceForm = "video_multi_anchor";
        }
        PanelOpenInfo panelOpenInfo = productListModel.getPanelOpenInfo();
        if (panelOpenInfo != null) {
            num = Integer.valueOf(panelOpenInfo.getPanelStyle());
        } else {
            num = null;
        }
        LJJJJI2.LJJIZ(aweme, num, entranceForm);
        C71363Rzb.LIZJ(productListModel, this.LJLJJL, Integer.valueOf(i), str, this.LJLJLLL, false, "ecom_panel", "anchor", str2, str3);
        if (o.LJ(productListModel.isAd(), Boolean.TRUE) || C63081OpJ.LLF(productListModel.getAweme())) {
            AwemeRawAd awemeRawAd = productListModel.getAwemeRawAd();
            if ((awemeRawAd != null && awemeRawAd.getAnchorClickType() == 2) || C63081OpJ.LLF(productListModel.getAweme())) {
                str4 = "click";
            } else {
                str4 = "otherclick";
            }
            if (!C63081OpJ.LLF(productListModel.getAweme())) {
                LJJJJI = productListModel.getAwemeRawAd();
            } else {
                LJJJJI = C63081OpJ.LJJJJI(productListModel.getAweme());
            }
            C025908h.LIZLLL("draw_ad", str4, LJJJJI, "shop_anchor", "refer");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (r4.intValue() == 2) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vv0(boolean r28, java.util.List<java.lang.String> r29, int r30, boolean r31, androidx.recyclerview.widget.RecyclerView r32) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel.vv0(boolean, java.util.List, int, boolean, androidx.recyclerview.widget.RecyclerView):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x02ea, code lost:
    
        if (r8 != null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02e6, code lost:
    
        if (r8 != null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x005f, code lost:
    
        if (X.C63081OpJ.LLF(r0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x07b5, code lost:
    
        if (X.C63081OpJ.LLF(r0) != false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0710, code lost:
    
        if (X.C63081OpJ.LLF(r0) == false) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ea, code lost:
    
        if (r12 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ec, code lost:
    
        r12 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f0, code lost:
    
        if (r1 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f2, code lost:
    
        r10 = r1.get("rec_session_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f8, code lost:
    
        if (r10 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fc, code lost:
    
        r8 = X.C01R.LIZ("video_anchor", true);
        r8.putString("title", java.lang.String.valueOf(r7.LIZ.title));
        r8.putString("price", java.lang.String.valueOf(r7.LIZ.formatPrice));
        r6 = com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService.LJJJJI().LJIJJ();
        r1 = r7.LIZ.coverUrl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0129, code lost:
    
        if (r1 != null) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012b, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0378, code lost:
    
        r1 = X.C1E4.LJJIIZ(r1, r6, r6, X.EnumC70569Rmn.VIDEO_MULTI_ANCHOR);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00fa, code lost:
    
        r10 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00e2, code lost:
    
        if (r1 != null) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void tv0(com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel r33, android.content.Context r34, java.lang.String r35, java.lang.String r36, java.util.HashMap r37, int r38) {
        /*
            Method dump skipped, instructions count: 1982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel.tv0(com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel, android.content.Context, java.lang.String, java.lang.String, java.util.HashMap, int):void");
    }

    public static void wv0(ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel, boolean z, String str, int i, int i2, int i3) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Long l;
        ShopWindowExtraModel shopWindowExtraModel;
        ShopWindowExtraModel shopWindowExtraModel2;
        if ((i3 & 1) != 0) {
            z = true;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 1;
        }
        eCommerceAnchorPanelViewModel.LJLL = str;
        ProductListModel productListModel = eCommerceAnchorPanelViewModel.LJLILLLLZI;
        Integer num = null;
        if (productListModel != null) {
            str2 = productListModel.getAid();
        } else {
            str2 = null;
        }
        C71370Rzi.LJIIL(Integer.valueOf(i2), str2, str, eCommerceAnchorPanelViewModel.LJLLI);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ProductListModel productListModel2 = eCommerceAnchorPanelViewModel.LJLILLLLZI;
        if (productListModel2 != null) {
            str3 = productListModel2.getAid();
        } else {
            str3 = null;
        }
        linkedHashMap.put("group_id", str3);
        ProductListModel productListModel3 = eCommerceAnchorPanelViewModel.LJLILLLLZI;
        if (productListModel3 != null) {
            str4 = productListModel3.getEventType();
        } else {
            str4 = null;
        }
        linkedHashMap.put("enter_from", str4);
        ProductListModel productListModel4 = eCommerceAnchorPanelViewModel.LJLILLLLZI;
        if (productListModel4 != null) {
            str5 = productListModel4.getAuthorUid();
        } else {
            str5 = null;
        }
        linkedHashMap.put("author_id", str5);
        if (z) {
            str6 = "video_single_anchor";
        } else {
            str6 = "video_multi_anchor";
        }
        linkedHashMap.put("entrance_form", str6);
        linkedHashMap.put("info_list", str);
        if (!z) {
            linkedHashMap.put("multi_anchor_display", Integer.valueOf(i));
        }
        linkedHashMap.put("anchor_animation", Integer.valueOf(i2));
        ShopWindowAnchorModel shopWindowAnchorModel = eCommerceAnchorPanelViewModel.LJLJL;
        if (shopWindowAnchorModel != null && (shopWindowExtraModel2 = shopWindowAnchorModel.LIZ) != null) {
            l = shopWindowExtraModel2.productId;
        } else {
            l = null;
        }
        linkedHashMap.put("product_id", l);
        ShopWindowAnchorModel shopWindowAnchorModel2 = eCommerceAnchorPanelViewModel.LJLJL;
        if (shopWindowAnchorModel2 != null && (shopWindowExtraModel = shopWindowAnchorModel2.LIZ) != null) {
            num = shopWindowExtraModel.platform;
        }
        linkedHashMap.put("product_source", num);
        linkedHashMap.putAll(eCommerceAnchorPanelViewModel.LJLLI);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C51029K0z.LJJIIZ(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                value = "";
            }
            linkedHashMap2.put(key, value);
        }
        C76542zS.LIZJ("tiktokec_extra_info_show", new AqS170S0100000_4(linkedHashMap2, (Map<Integer, String>) 860));
    }
}
