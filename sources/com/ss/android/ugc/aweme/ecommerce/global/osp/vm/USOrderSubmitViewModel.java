package com.ss.android.ugc.aweme.ecommerce.global.osp.vm;

import X.AnonymousClass636;
import X.C1A7;
import X.C26560Abc;
import X.C26566Abi;
import X.C26577Abt;
import X.C26584Ac0;
import X.C26840Ag8;
import X.C27042AjO;
import X.C27043AjP;
import X.C27724AuO;
import X.C27739Aud;
import X.C27855AwV;
import X.C27941Axt;
import X.C27948Ay0;
import X.C27959AyB;
import X.C27963AyF;
import X.C27975AyR;
import X.C28002Ays;
import X.C38891fp;
import X.C47261Igj;
import X.C61878OQg;
import X.C65330PkU;
import X.C65340Pke;
import X.C65352Pkq;
import X.C70101RfF;
import X.C75792yF;
import X.C79081V1x;
import X.EF7;
import X.EnumC26562Abe;
import X.EnumC28020AzA;
import X.EnumC28022AzC;
import X.EnumC28094B0w;
import X.ORS;
import X.ORZ;
import X.SFS;
import X.V2B;
import android.content.Context;
import android.text.SpannableStringBuilder;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.android.play.core.appupdate.u;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Photos;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.GooglePayProcess;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonOrder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonProductInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarling;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlatformPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionBanner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.global.osp.dto.UserTrustModule;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class USOrderSubmitViewModel extends OrderSubmitViewModel {
    public boolean LLLIIII;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel
    public final boolean tw0() {
        return e1.LIZ(31744, "dismiss_awaiting_payment", true, false);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel
    public final void Bw0() {
        if (e1.LIZ(31744, "dismiss_awaiting_payment", true, false)) {
            this.LLJZIJLIL.LIZJ = true;
        } else {
            super.Bw0();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel
    public final int hw0() {
        return EnumC28094B0w.SAVE.ordinal();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel
    public final void lw0() {
        List<ShopOrderNew> list;
        AddonOrder addonOrder;
        boolean z;
        Integer exceptionUXType;
        BillInfoData billInfoData = this.LJZ;
        BillInfoData billInfoData2 = null;
        if (billInfoData != null) {
            list = billInfoData.getNewShopOrders();
        } else {
            list = null;
        }
        BillInfoData billInfoData3 = this.LJZ;
        if (billInfoData3 != null) {
            addonOrder = billInfoData3.getAddonOrder();
        } else {
            addonOrder = null;
        }
        ExceptionUX exceptionUX = this.LJLLILLLL;
        if (exceptionUX == null || (exceptionUXType = exceptionUX.getExceptionUXType()) == null || exceptionUXType.intValue() != 8) {
            z = false;
        } else {
            z = true;
        }
        if (addonOrder == null && list != null && !list.isEmpty() && !z) {
            BillInfoData billInfoData4 = this.LJZ;
            if (billInfoData4 != null) {
                billInfoData2 = BillInfoData.copy$default(billInfoData4, this.LJLLI, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 127, null);
            }
            this.LJZ = billInfoData2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.ss.android.ugc.aweme.ecommerce.global.osp.vm.USOrderSubmitViewModel, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r9v3, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel
    public final List<Object> Cw0(C27963AyF c27963AyF) {
        String str;
        ?? r9;
        List<PaymentMethod> list;
        List<PaymentMethod> list2;
        List<String> list3;
        String str2;
        PaymentMethodInfo paymentMethodInfo;
        Photos photos;
        UserTrustModule userTrustModule;
        C26577Abt LJJIZ;
        BillInfoData billInfoData;
        AddonOrder addonOrder;
        BillStarlingText billStarlingText;
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (String str3 : c27963AyF.LIZ.getLayout()) {
            Context LIZIZ = EF7.LIZIZ();
            switch (str3.hashCode()) {
                case -2037733451:
                    C27724AuO c27724AuO = null;
                    if (str3.equals("order_summary") && (!c27963AyF.LIZLLL.isEmpty())) {
                        BillInfoData billInfoData2 = c27963AyF.LIZ;
                        PaymentMethod paymentMethod = c27963AyF.LJFF;
                        if (paymentMethod != null) {
                            str = paymentMethod.id;
                        } else {
                            str = null;
                        }
                        o.LJIIIZ(billInfoData2, "<this>");
                        C27042AjO LJJJ = u.LJJJ(billInfoData2, str);
                        if (billInfoData2.getPlatformPromotion() != null) {
                            c27724AuO = V2B.LJIJJ(billInfoData2);
                        }
                        arrayList.add(new C27043AjP(LJJJ, c27724AuO));
                        arrayList.add(new C26840Ag8(0.0f, true, AnonymousClass636.LJIIIIZZ(R.attr.ds, LIZIZ), 4));
                        break;
                    }
                    break;
                case -1847017863:
                    List<PaymentElement> list4 = null;
                    if (str3.equals("payment_methods") && (!c27963AyF.LIZLLL.isEmpty())) {
                        CopyOnWriteArrayList<PaymentMethod> copyOnWriteArrayList = c27963AyF.LJII;
                        if (copyOnWriteArrayList != null) {
                            r9 = new ArrayList();
                            Iterator<PaymentMethod> it = copyOnWriteArrayList.iterator();
                            while (it.hasNext()) {
                                PaymentMethod next = it.next();
                                if (!GooglePayProcess.LJ(next) || GooglePayProcess.LIZ()) {
                                    r9.add(next);
                                }
                            }
                        } else {
                            r9 = C61878OQg.INSTANCE;
                        }
                        Boolean bool = this.LLFFF;
                        PaymentInfo paymentInfo = this.LL;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList((Collection) r9);
                        PaymentMethodsData paymentMethods = c27963AyF.LIZ.getPaymentMethods();
                        if (paymentMethods != null) {
                            list = paymentMethods.paymentMethods;
                        } else {
                            list = null;
                        }
                        PaymentMethodsData paymentMethods2 = c27963AyF.LIZ.getPaymentMethods();
                        if (paymentMethods2 != null) {
                            list2 = paymentMethods2.storedMethods;
                        } else {
                            list2 = null;
                        }
                        PaymentMethodsData paymentMethods3 = c27963AyF.LIZ.getPaymentMethods();
                        if (paymentMethods3 != null && (photos = paymentMethods3.methodsPhotos) != null) {
                            list3 = photos.lightPhotos;
                        } else {
                            list3 = null;
                        }
                        PaymentMethodsData paymentMethods4 = c27963AyF.LIZ.getPaymentMethods();
                        if (paymentMethods4 != null) {
                            str2 = paymentMethods4.paymentMethodsText;
                        } else {
                            str2 = null;
                        }
                        PaymentInfo paymentInfo2 = this.LL;
                        if (paymentInfo2 != null && (paymentMethodInfo = paymentInfo2.paymentMethodInfo) != null) {
                            list4 = paymentMethodInfo.getPaymentElements();
                        }
                        arrayList.add(new C28002Ays(bool, paymentInfo, copyOnWriteArrayList2, list, list2, list3, str2, C1A7.LJFF(list4)));
                        arrayList.add(new C26840Ag8(0.0f, true, AnonymousClass636.LJIIIIZZ(R.attr.ds, LIZIZ), 4));
                        break;
                    }
                    break;
                case -1286000007:
                    if (str3.equals("privacy_policy_statement") && (!c27963AyF.LIZLLL.isEmpty()) && (userTrustModule = c27963AyF.LIZ.getUserTrustModule()) != null && (LJJIZ = SFS.LJJIZ(userTrustModule)) != null) {
                        if ((!arrayList.isEmpty()) && (ORZ.LLFF(arrayList) instanceof C26840Ag8)) {
                            ORS.LJJZ(arrayList);
                        }
                        arrayList.add(LJJIZ);
                        break;
                    }
                    break;
                case 699961955:
                    if (str3.equals("shipping_address") && !C27855AwV.LIZ(c27963AyF.LIZ.getNewShopOrders())) {
                        if ((e1.LIZ(31744, "ec_osp_auto_open_address_edit", true, false) || e1.LIZ(31744, "ec_osp_auto_open_address_edit_uk", true, false)) && (((billInfoData = this.LJZ) == null || !billInfoData.hasAddress()) && !this.LLLIIII)) {
                            setState(C27975AyR.LJLIL);
                        }
                        this.LLLIIII = true;
                        C26566Abi LJJJ2 = C79081V1x.LJJJ(c27963AyF.LIZ, c27963AyF.LIZIZ, EnumC28020AzA.DOUBLE_LINE);
                        if (c27963AyF.LIZLLL.isEmpty() && (!c27963AyF.LIZJ.isEmpty())) {
                            LJJJ2.LJIIL = true;
                        }
                        setState(new AqS170S0100000_4(LJJJ2, 354));
                        arrayList.add(LJJJ2);
                        arrayList.add(new C26840Ag8(0.0f, true, AnonymousClass636.LJIIIIZZ(R.attr.ds, LIZIZ), 4));
                        break;
                    }
                    break;
                case 806427791:
                    Object obj = null;
                    if (str3.equals("addon_order") && (addonOrder = c27963AyF.LIZ.getAddonOrder()) != null) {
                        if (ORZ.LLFII(arrayList) instanceof C26840Ag8) {
                            ORS.LJJLL(arrayList);
                        }
                        C70101RfF c70101RfF = IPdpStarter.LIZ;
                        HashMap<String, Object> hashMap = this.LLIL;
                        c70101RfF.getClass();
                        int LIZ = C70101RfF.LIZ(hashMap);
                        String pw0 = OrderSubmitViewModel.pw0(this.LLIL);
                        List<ShopOrderNew> newShopOrders = c27963AyF.LIZ.getNewShopOrders();
                        HashMap<String, Object> hashMap2 = this.LLIL;
                        if (hashMap2 != null) {
                            obj = hashMap2.get("author_id");
                        }
                        C27941Axt LJJIJLIJ = C38891fp.LJJIJLIJ(addonOrder, LIZ, pw0, newShopOrders, String.valueOf(obj), Integer.valueOf(this.LJLJJLL), this.LJLJL, this.LJLLL, c27963AyF.LIZ.getRequestId());
                        arrayList.add(LJJIJLIJ);
                        ArrayList arrayList2 = new ArrayList();
                        for (C27959AyB c27959AyB : LJJIJLIJ.LIZ) {
                            String str4 = c27959AyB.LJIL;
                            if (str4 == null) {
                                str4 = "";
                            }
                            ArrayList arrayList3 = new ArrayList();
                            String str5 = c27959AyB.LIZ;
                            if (str5 != null) {
                                arrayList3.add(str5);
                            }
                            arrayList2.add(new AddonProductInfo(str4, arrayList3));
                        }
                        this.LLJJJ = arrayList2;
                        arrayList.add(new C26840Ag8(0.0f, true, AnonymousClass636.LJIIIIZZ(R.attr.ds, LIZIZ), 4));
                        break;
                    }
                    break;
                case 990130109:
                    if (str3.equals("ineligible_items")) {
                        rw0(c27963AyF.LJ, arrayList, !c27963AyF.LIZLLL.isEmpty(), c27963AyF.LIZJ);
                        break;
                    } else {
                        break;
                    }
                case 1463248431:
                    if (str3.equals("shop_orders_new") && (!c27963AyF.LIZLLL.isEmpty())) {
                        BillInfoData billInfoData3 = c27963AyF.LIZ;
                        boolean z2 = c27963AyF.LIZIZ;
                        List<ShopOrderNew> available = c27963AyF.LIZLLL;
                        EnumC28022AzC genSkuListType = EnumC28022AzC.GEN_TYPE_SUB_GIFT;
                        o.LJIIIZ(billInfoData3, "<this>");
                        o.LJIIIZ(available, "available");
                        o.LJIIIZ(genSkuListType, "genSkuListType");
                        ArrayList arrayList4 = new ArrayList();
                        int i = 0;
                        for (ShopOrderNew shopOrderNew : available) {
                            int i2 = i + 1;
                            if (i >= 0) {
                                ShopOrderNew shopOrderNew2 = shopOrderNew;
                                if (i != available.size() - 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                arrayList4.add(C27948Ay0.LIZIZ(shopOrderNew2, z2, Boolean.valueOf(z), genSkuListType));
                                i = i2;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                        String str6 = null;
                        BillStarling starlingTexts = billInfoData3.getStarlingTexts();
                        if (starlingTexts != null && (billStarlingText = starlingTexts.shippingMethodTitle) != null) {
                            str6 = billStarlingText.text;
                        }
                        arrayList.add(new C26584Ac0(str6, arrayList4));
                        arrayList.add(new C26840Ag8(0.0f, true, AnonymousClass636.LJIIIIZZ(R.attr.ds, LIZIZ), 4));
                        break;
                    }
                    break;
            }
        }
        if ((!arrayList.isEmpty()) && (ORZ.LLFF(arrayList) instanceof C26840Ag8)) {
            ORS.LJJZ(arrayList);
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel
    public final HashMap<String, Object> fw0(boolean z) {
        String str;
        Integer num;
        Integer num2;
        PlatformPromotion platformPromotion;
        PromotionBanner promotionBanner;
        String str2;
        HashMap<String, Object> fw0 = super.fw0(z);
        OrderSubmitState lv0 = lv0();
        C27724AuO platformDiscounts = lv0.getPlatformDiscounts();
        int i = 0;
        if (platformDiscounts != null && (str2 = platformDiscounts.LJIIIIZZ) != null && str2.length() > 0) {
            str = "all_applied";
        } else {
            C27724AuO platformDiscounts2 = lv0.getPlatformDiscounts();
            if (platformDiscounts2 != null && (num = platformDiscounts2.LJII) != null && num.intValue() > 0) {
                C27724AuO platformDiscounts3 = lv0.getPlatformDiscounts();
                if (platformDiscounts3 != null && (num2 = platformDiscounts3.LJII) != null) {
                    i = num2.intValue();
                }
                str = String.valueOf(i);
            } else {
                str = "no_coupon";
            }
        }
        fw0.put("coupon_applied_status", str);
        BillInfoData billInfoData = this.LJZ;
        String str3 = null;
        if (billInfoData != null && (platformPromotion = billInfoData.getPlatformPromotion()) != null && (promotionBanner = platformPromotion.promotionBanner) != null) {
            str3 = promotionBanner.daInfo;
        }
        HashMap<String, Object> LJII = C27739Aud.LJII(str3);
        if (LJII != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Object obj = LJII.get("currency");
            if (obj != null) {
                linkedHashMap.put("currency", obj);
            }
            Object obj2 = LJII.get("discounted_amount");
            if (obj2 != null) {
                linkedHashMap.put("discounted_amount", obj2);
            }
            fw0.putAll(linkedHashMap);
        }
        return fw0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel
    public final String gw0(ShopOrderNew shopOrderNew) {
        HashMap<String, String> hashMap = this.LLIIIILZ;
        String str = shopOrderNew.sellerId;
        if (str == null) {
            str = "";
        }
        return hashMap.get(str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel
    public final CreateOrderSku Aw0(CreateOrderSku createOrderSku, C27959AyB c27959AyB) {
        HashMap hashMap = null;
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), createOrderSku.entranceInfo, C65330PkU.LIZJ(C65352Pkq.LJFF(HashMap.class, C65340Pke.LIZ(C65352Pkq.LJI(String.class)), C65340Pke.LIZ(C65352Pkq.LJI(Object.class)))));
            if (!(fromJson instanceof HashMap)) {
                fromJson = null;
            }
            hashMap = (HashMap) fromJson;
        } catch (s unused) {
        }
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        Object obj = ((HashMap) this.LLJJIJIL).get(c27959AyB.LIZ);
        if (obj == null) {
            obj = "";
        }
        hashMap.put("add_on_track_id", obj);
        hashMap.put("is_add_on_product", 1);
        hashMap.put("source_page_type", "add_on_order_submit_rec");
        hashMap.put("entrance_form", "append_goods_card");
        hashMap.put("source_module", "rec_order_submit_outer_add_on_module");
        hashMap.put("purchase_path", "skip_pdp");
        Object obj2 = ((HashMap) this.LLJJIJIL).get(c27959AyB.LIZ);
        if (obj2 != null) {
            hashMap.put("track_id", obj2);
        }
        String LIZJ = C75792yF.LIZJ(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("entrance_info", LIZJ);
        return CreateOrderSku.LIZ(createOrderSku, OrderSubmitViewModel.pw0(hashMap2));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel
    public final SpannableStringBuilder Rv0(Context ctx, C26566Abi address) {
        o.LJIIIZ(ctx, "ctx");
        o.LJIIIZ(address, "address");
        SpannableStringBuilder LIZ = C26560Abc.LIZ(ctx, address, EnumC26562Abe.NO_ICON);
        int LJJLIIIJL = ujb.s.LJJLIIIJL(LIZ, "\n", 0, false, 6);
        if (LJJLIIIJL == -1) {
            return LIZ;
        }
        SpannableStringBuilder replace = LIZ.replace(LJJLIIIJL, LJJLIIIJL + 1, (CharSequence) ", ");
        o.LJIIIIZZ(replace, "briefAddressBarText.repl…, newLineIndex + 1, \", \")");
        return replace;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel
    public final List<String> Tv0(BillInfoData billInfoData, Boolean bool, Boolean bool2) {
        return C47261Igj.LJJIJ("order_submit_fragment");
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0155, code lost:
    
        if (r7 != null) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0133  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rw0(boolean r22, java.util.List r23, boolean r24, java.util.Map r25) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.global.osp.vm.USOrderSubmitViewModel.rw0(boolean, java.util.List, boolean, java.util.Map):void");
    }
}
