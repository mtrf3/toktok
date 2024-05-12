package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion;

import X.ActivityC45651qj;
import X.C110614Vt;
import X.C113554cx;
import X.C16880lQ;
import X.C2068389v;
import X.C221108m2;
import X.C26508Aam;
import X.C26706Ady;
import X.C26867AgZ;
import X.C27162AlK;
import X.C27739Aud;
import X.C32I;
import X.C39849FkT;
import X.C44878HjO;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C69638RUs;
import X.C69960Rcy;
import X.C69961Rcz;
import X.C70101RfF;
import X.C70414RkI;
import X.C70433Rkb;
import X.C70437Rkf;
import X.C70438Rkg;
import X.C70469RlB;
import X.C70470RlC;
import X.C70472RlE;
import X.C70474RlG;
import X.C70475RlH;
import X.C70485RlR;
import X.C70885Rrt;
import X.C72264SXs;
import X.C72545SdZ;
import X.C78565UsT;
import X.C78613UtF;
import X.C78946Uyc;
import X.EnumC46479ILz;
import X.EnumC70477RlJ;
import X.InterfaceC72712tH;
import X.OSZ;
import X.OUP;
import X.Q7K;
import X.RYD;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.api.ClaimVoucherApi;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherRequest;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.InteractiveUserTask;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherInteractiveInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import defpackage.c0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes13.dex */
public final class PdpCouponsViewHolder extends AbsFullSpanVH implements InterfaceC72712tH, c {
    public static final SimpleDateFormat COUNT_DOWN_FORMAT;
    public static final C70485RlR Companion = new C70485RlR();
    public Map<Integer, View> _$_findViewCache;
    public int clickTimeGap;
    public boolean hasLeftCountDown;
    public boolean hasRightCountDown;
    public HashMap<String, Long> lastClickTimeMap;
    public final LinkedList<C70469RlB> scrapViews;
    public final C5H3 style$delegate;
    public final C5H3 viewModel$delegate;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        COUNT_DOWN_FORMAT = simpleDateFormat;
    }

    private final IPromotionStyle getStyle() {
        return (IPromotionStyle) this.style$delegate.getValue();
    }

    private final void hideCouponsItems() {
        View findViewById = this.itemView.findViewById(R.id.had);
        o.LJIIIIZZ(findViewById, "itemView.one_item");
        findViewById.setVisibility(8);
        View findViewById2 = this.itemView.findViewById(R.id.cfg);
        o.LJIIIIZZ(findViewById2, "itemView.double_item");
        findViewById2.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showV0StyleCouponView() {
        View findViewById = this.itemView.findViewById(R.id.e8d);
        o.LJIIIIZZ(findViewById, "itemView.hsv_new");
        findViewById.setVisibility(8);
        getViewModel().mx0(this);
        this.hasLeftCountDown = false;
        this.hasRightCountDown = false;
        int i = C70474RlG.LIZ[C70472RlE.LIZJ((C69638RUs) getItem()).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                showDoubleCouponsItems(((C69638RUs) getItem()).LJ);
                return;
            }
            showOneCouponsItem((Voucher) ListProtector.get(((C69638RUs) getItem()).LJ, 0));
            return;
        }
        hideCouponsItems();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x01a3, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0327  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void showV1StyleCouponView() {
        /*
            Method dump skipped, instructions count: 1125
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.PdpCouponsViewHolder.showV1StyleCouponView():void");
    }

    public final PdpViewModel getViewModel() {
        return (PdpViewModel) this.viewModel$delegate.getValue();
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public void onDestroy() {
        super.onDestroy();
        getViewModel().mx0(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpCouponsViewHolder(ViewGroup viewGroup) {
        super(C72545SdZ.LIZJ(viewGroup, "parent.context", R.layout.a29, viewGroup, false));
        this._$_findViewCache = C44878HjO.LIZIZ(viewGroup, "parent");
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.viewModel$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 54));
        this.clickTimeGap = Q7K.LIZIZ("click_pdp_voucher_claim_time_gap", 0);
        this.lastClickTimeMap = new HashMap<>();
        this.scrapViews = new LinkedList<>();
        this.style$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 230));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void claimCoupon(Voucher voucher) {
        long j;
        Long l = this.lastClickTimeMap.get(voucher.getVoucherID());
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - j;
        if (j == 0 || j2 >= this.clickTimeGap) {
            String voucherID = voucher.getVoucherID();
            if (voucherID != null) {
                this.lastClickTimeMap.put(voucherID, Long.valueOf(currentTimeMillis));
            }
            int indexOf = ((C69638RUs) getItem()).LJ.indexOf(voucher);
            C70414RkI c70414RkI = getViewModel().LLFII;
            if (c70414RkI != null) {
                c70414RkI.LJJIIJ(indexOf + 1, voucher, "claim_button");
            }
            PdpViewModel viewModel = getViewModel();
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            int i = indexOf + 1;
            viewModel.getClass();
            C70101RfF c70101RfF = IPdpStarter.LIZ;
            IPdpStarter.PdpEnterParam pdpEnterParam = viewModel.LJLJJLL;
            c70101RfF.getClass();
            int LIZIZ = C70101RfF.LIZIZ(pdpEnterParam);
            C69961Rcz c69961Rcz = ClaimVoucherApi.LIZ;
            String voucherTypeID = voucher.getVoucherTypeID();
            if (voucherTypeID == null) {
                voucherTypeID = "";
            }
            ClaimVoucherRequest claimVoucherRequest = new ClaimVoucherRequest(voucherTypeID, 1, Integer.valueOf(LIZIZ));
            c69961Rcz.getClass();
            C69961Rcz.LIZ(claimVoucherRequest).LIZ(new RYD(viewModel, itemView, voucher, i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void followAndClaimCoupon(Voucher voucher) {
        long j;
        Long l = this.lastClickTimeMap.get(voucher.getVoucherID());
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - j;
        if (j == 0 || j2 >= this.clickTimeGap) {
            String voucherID = voucher.getVoucherID();
            if (voucherID != null) {
                this.lastClickTimeMap.put(voucherID, Long.valueOf(currentTimeMillis));
            }
            int indexOf = ((C69638RUs) getItem()).LJ.indexOf(voucher);
            C70414RkI c70414RkI = getViewModel().LLFII;
            if (c70414RkI != null) {
                c70414RkI.LJJIIJ(indexOf + 1, voucher, "claim_button");
            }
            PdpViewModel viewModel = getViewModel();
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            viewModel.getClass();
            C78565UsT.LJJIJ(viewModel, C78613UtF.LIZJ, new C69960Rcy(voucher, viewModel, context, indexOf, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void jumpAddOnItemPage(Voucher voucher) {
        String str;
        int i;
        String str2;
        SellerInfo sellerInfo;
        String sourceInfo;
        HashMap<String, Object> trackParams;
        String vapSchema = voucher.getVapSchema();
        if (voucher.getFullVapSchema() != null && getViewModel().LJLJL) {
            vapSchema = voucher.getFullVapSchema();
            str = "100%";
            i = 1;
        } else {
            str = "73%";
            i = 0;
        }
        if (vapSchema != null) {
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("use_new_container", 1);
            linkedHashMap.put("height", str);
            linkedHashMap.put("hide_nav_bar", Integer.valueOf(i));
            String discountText = voucher.getDiscountText();
            if (discountText == null) {
                discountText = "";
            }
            linkedHashMap.put("discount_text", discountText);
            String thresholdText = voucher.getThresholdText();
            if (thresholdText == null) {
                thresholdText = "";
            }
            linkedHashMap.put("threshold_text", thresholdText);
            String validTimeText = voucher.getValidTimeText();
            if (validTimeText == null) {
                validTimeText = "";
            }
            linkedHashMap.put("valid_time_text", validTimeText);
            String voucherTypeID = voucher.getVoucherTypeID();
            if (voucherTypeID == null) {
                voucherTypeID = "";
            }
            linkedHashMap.put("voucher_type_id", voucherTypeID);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            IPdpStarter.PdpEnterParam pdpEnterParam = getViewModel().LJLJJLL;
            if (pdpEnterParam != null && (trackParams = pdpEnterParam.getTrackParams()) != null) {
                linkedHashMap2.putAll(trackParams);
            }
            IPdpStarter.PdpEnterParam pdpEnterParam2 = getViewModel().LJLJJLL;
            if (pdpEnterParam2 != null && (sourceInfo = pdpEnterParam2.getSourceInfo()) != null) {
                linkedHashMap2.put("source_info", sourceInfo);
            }
            linkedHashMap2.put("from_type", 1);
            linkedHashMap2.put("page_type", 1);
            linkedHashMap2.put("previous_page", "product_detail");
            linkedHashMap.put("trackParams", linkedHashMap2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<Voucher> list = ((C69638RUs) getItem()).LJ;
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(list, 10));
            for (Voucher voucher2 : list) {
                String voucherID = voucher2.getVoucherID();
                if (voucherID != null) {
                    arrayList.add(voucherID);
                }
                String voucherTypeID2 = voucher2.getVoucherTypeID();
                if (voucherTypeID2 == null) {
                    voucherTypeID2 = "";
                }
                arrayList3.add(Boolean.valueOf(arrayList2.add(voucherTypeID2)));
            }
            ArrayList arrayList4 = new ArrayList();
            ProductPackStruct productPackStruct = getViewModel().LJLJLLL;
            if (productPackStruct != null && (sellerInfo = productPackStruct.sellerInfo) != null) {
                str2 = sellerInfo.sellerId;
            } else {
                str2 = null;
            }
            arrayList4.add(String.valueOf(str2));
            linkedHashMap.put("shop_ids", arrayList4);
            C72264SXs.LIZ(C39849FkT.LIZ()).LJIIIIZZ(C113554cx.LJJL(new OSZ("voucherIdArray", C27739Aud.LJI(arrayList)), new OSZ("voucherTypeIdArray", C27739Aud.LJI(arrayList2))), "ec_storage_voucher_list_key");
            C26867AgZ.LIZIZ(context, vapSchema, linkedHashMap, false).open();
        }
    }

    private final void setHeadInfo(C69638RUs c69638RUs) {
        if (o.LJ(c69638RUs.LJFF, Boolean.TRUE)) {
            View findViewById = this.itemView.findViewById(R.id.bxg);
            o.LJIIIIZZ(findViewById, "itemView.coupons_entrance");
            findViewById.setVisibility(8);
            return;
        }
        View findViewById2 = this.itemView.findViewById(R.id.bxg);
        o.LJIIIIZZ(findViewById2, "itemView.coupons_entrance");
        findViewById2.setVisibility(0);
        ((TextView) this.itemView.findViewById(R.id.title)).setText(c69638RUs.LIZIZ);
        ((TextView) this.itemView.findViewById(R.id.cas)).setText(c69638RUs.LIZLLL);
        View findViewById3 = this.itemView.findViewById(R.id.bxg);
        o.LJIIIIZZ(findViewById3, "itemView.coupons_entrance");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 7, 42), findViewById3);
    }

    private final void showDoubleCouponsItems(List<Voucher> list) {
        View findViewById = this.itemView.findViewById(R.id.had);
        o.LJIIIIZZ(findViewById, "itemView.one_item");
        findViewById.setVisibility(8);
        View findViewById2 = this.itemView.findViewById(R.id.cfg);
        o.LJIIIIZZ(findViewById2, "itemView.double_item");
        findViewById2.setVisibility(0);
        EnumC70477RlJ LIZIZ = C70472RlE.LIZIZ((Voucher) ListProtector.get(list, 0));
        View findViewById3 = this.itemView.findViewById(R.id.fox);
        o.LJIIIIZZ(findViewById3, "itemView.left_item");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 8, 42), findViewById3);
        View findViewById4 = this.itemView.findViewById(R.id.fox).findViewById(R.id.avf);
        o.LJIIIIZZ(findViewById4, "itemView.left_item.findV…n>(R.id.btn_claim_or_use)");
        C16880lQ.LJIIJ(new Au2S19S0200000_12(this, LIZIZ, 6, 42), findViewById4);
        C70414RkI c70414RkI = getViewModel().LLFII;
        if (c70414RkI != null) {
            c70414RkI.LJJIIZ(1, (Voucher) ListProtector.get(list, 0), C70472RlE.LIZ(LIZIZ));
        }
        EnumC70477RlJ LIZIZ2 = C70472RlE.LIZIZ((Voucher) ListProtector.get(list, 1));
        View findViewById5 = this.itemView.findViewById(R.id.j2j);
        o.LJIIIIZZ(findViewById5, "itemView.right_item");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 9, 42), findViewById5);
        View findViewById6 = this.itemView.findViewById(R.id.j2j).findViewById(R.id.avf);
        o.LJIIIIZZ(findViewById6, "itemView.right_item.find…n>(R.id.btn_claim_or_use)");
        C16880lQ.LJIIJ(new Au2S19S0200000_12(this, LIZIZ2, 7, 42), findViewById6);
        C70414RkI c70414RkI2 = getViewModel().LLFII;
        if (c70414RkI2 != null) {
            c70414RkI2.LJJIIZ(2, (Voucher) ListProtector.get(list, 1), C70472RlE.LIZ(LIZIZ2));
        }
        Voucher voucher = (Voucher) ListProtector.get(list, 0);
        C70470RlC c70470RlC = (C70470RlC) this.itemView.findViewById(R.id.fox);
        o.LJIIIIZZ(c70470RlC, "itemView.left_item");
        updateCouponItem(voucher, c70470RlC, 1);
        Voucher voucher2 = (Voucher) ListProtector.get(list, 1);
        C70470RlC c70470RlC2 = (C70470RlC) this.itemView.findViewById(R.id.j2j);
        o.LJIIIIZZ(c70470RlC2, "itemView.right_item");
        updateCouponItem(voucher2, c70470RlC2, 2);
        String voucherID = ((Voucher) ListProtector.get(list, 0)).getVoucherID();
        if (voucherID != null) {
            this.lastClickTimeMap.put(voucherID, 0L);
        }
        String voucherID2 = ((Voucher) ListProtector.get(list, 1)).getVoucherID();
        if (voucherID2 != null) {
            this.lastClickTimeMap.put(voucherID2, 0L);
        }
    }

    private final void showOneCouponsItem(Voucher voucher) {
        View findViewById = this.itemView.findViewById(R.id.had);
        o.LJIIIIZZ(findViewById, "itemView.one_item");
        findViewById.setVisibility(0);
        View findViewById2 = this.itemView.findViewById(R.id.cfg);
        o.LJIIIIZZ(findViewById2, "itemView.double_item");
        findViewById2.setVisibility(8);
        View findViewById3 = this.itemView.findViewById(R.id.had);
        o.LJIIIIZZ(findViewById3, "itemView.one_item");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 10, 42), findViewById3);
        EnumC70477RlJ LIZIZ = C70472RlE.LIZIZ(voucher);
        View findViewById4 = this.itemView.findViewById(R.id.had).findViewById(R.id.avf);
        o.LJIIIIZZ(findViewById4, "itemView.one_item.findVi…n>(R.id.btn_claim_or_use)");
        C16880lQ.LJIIJ(new Au2S19S0200000_12(this, LIZIZ, 8, 42), findViewById4);
        C70414RkI c70414RkI = getViewModel().LLFII;
        if (c70414RkI != null) {
            c70414RkI.LJJIIZ(1, voucher, C70472RlE.LIZ(LIZIZ));
        }
        C70470RlC c70470RlC = (C70470RlC) this.itemView.findViewById(R.id.had);
        o.LJIIIIZZ(c70470RlC, "itemView.one_item");
        updateCouponItem(voucher, c70470RlC, 1);
        String voucherID = voucher.getVoucherID();
        if (voucherID != null) {
            this.lastClickTimeMap.put(voucherID, 0L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateDoubleCouponsCountDown(long j) {
        if (this.hasLeftCountDown) {
            Voucher voucher = (Voucher) ListProtector.get(((C69638RUs) getItem()).LJ, 0);
            C70470RlC c70470RlC = (C70470RlC) this.itemView.findViewById(R.id.fox);
            o.LJIIIIZZ(c70470RlC, "itemView.left_item");
            if (updateCouponsTime(j, voucher, c70470RlC)) {
                this.hasLeftCountDown = false;
            }
        }
        if (this.hasRightCountDown) {
            Voucher voucher2 = (Voucher) ListProtector.get(((C69638RUs) getItem()).LJ, 1);
            C70470RlC c70470RlC2 = (C70470RlC) this.itemView.findViewById(R.id.j2j);
            o.LJIIIIZZ(c70470RlC2, "itemView.right_item");
            if (updateCouponsTime(j, voucher2, c70470RlC2)) {
                this.hasRightCountDown = false;
            }
        }
        if (!this.hasLeftCountDown && !this.hasRightCountDown) {
            getViewModel().mx0(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateOneCouponsCountDown(long j) {
        Voucher voucher = (Voucher) ListProtector.get(((C69638RUs) getItem()).LJ, 0);
        C70470RlC c70470RlC = (C70470RlC) this.itemView.findViewById(R.id.had);
        o.LJIIIIZZ(c70470RlC, "itemView.one_item");
        if (updateCouponsTime(j, voucher, c70470RlC)) {
            getViewModel().mx0(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Voucher getVoucherByView(C70470RlC c70470RlC) {
        boolean z;
        List<Voucher> list = ((C69638RUs) getItem()).LJ;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (o.LJ(c70470RlC, this.itemView.findViewById(R.id.had))) {
            return (Voucher) ListProtector.get(((C69638RUs) getItem()).LJ, 0);
        }
        if (o.LJ(c70470RlC, this.itemView.findViewById(R.id.fox))) {
            if (((C69638RUs) getItem()).LJ.size() <= 1) {
                return null;
            }
            return (Voucher) ListProtector.get(((C69638RUs) getItem()).LJ, 0);
        }
        if (!o.LJ(c70470RlC, this.itemView.findViewById(R.id.j2j)) || ((C69638RUs) getItem()).LJ.size() <= 1) {
            return null;
        }
        return (Voucher) ListProtector.get(((C69638RUs) getItem()).LJ, 1);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public void onBind(C69638RUs item) {
        o.LJIIIZ(item, "item");
        C70414RkI c70414RkI = getViewModel().LLFII;
        if (c70414RkI != null) {
            List<Voucher> list = item.LJ;
            if (!c70414RkI.LJJJ) {
                c70414RkI.LJJJ = true;
                C70438Rkg LIZLLL = C70437Rkf.LIZLLL(Boolean.FALSE, list);
                C70433Rkb c70433Rkb = new C70433Rkb();
                c70433Rkb.LIZLLL(c70414RkI.LIZIZ);
                String str = LIZLLL.LJLILLLLZI;
                if (str == null || str.length() == 0) {
                    c70433Rkb.LJ(0);
                } else {
                    Integer num = null;
                    C70437Rkf.LJ(LIZLLL, c70433Rkb, null);
                    if (list != null) {
                        num = Integer.valueOf(list.size());
                    }
                    c70433Rkb.LJ(num);
                }
                c70433Rkb.LIZIZ();
            }
        }
        if (item.LIZ == 0) {
            showV0StyleCouponView();
        } else {
            showV1StyleCouponView();
        }
        setHeadInfo(item);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        Boolean bool = item.LJI;
        Boolean bool2 = Boolean.TRUE;
        C26508Aam.LIZ(itemView, o.LJ(bool, bool2));
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        OUP.LJJJJJL(getStyle().getItemViewPaddingTop(), itemView2);
        if (!o.LJ(item.LJII, bool2)) {
            View itemView3 = this.itemView;
            o.LJIIIIZZ(itemView3, "itemView");
            OUP.LJJJJI(getStyle().getPaddingBottomWithoutPromotionEntrance(), itemView3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onBodyClick(Voucher voucher) {
        if (voucher != null) {
            C70414RkI c70414RkI = getViewModel().LLFII;
            if (c70414RkI != null) {
                c70414RkI.LJJIIJ(((C69638RUs) getItem()).LJ.indexOf(voucher) + 1, voucher, "coupons");
            }
            if (this.itemView.getContext() instanceof ActivityC45651qj) {
                String str = ((C69638RUs) getItem()).LIZJ;
                m mVar = new m();
                mVar.LJJIIZ("voucher_type_id", voucher.getVoucherTypeID());
                String jVar = mVar.toString();
                o.LJIIIIZZ(jVar, "params.toString()");
                jumpCouponPage(str, jVar, "coupon");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC72712tH
    public void onCountDown(long j) {
        int i = C70474RlG.LIZ[C70472RlE.LIZJ((C69638RUs) getItem()).ordinal()];
        if (i != 2) {
            if (i != 3) {
                return;
            }
            updateDoubleCouponsCountDown(j);
            return;
        }
        updateOneCouponsCountDown(j);
    }

    private final void showButtonClaimedStatus(C70469RlB c70469RlB, Voucher voucher) {
        int i;
        c70469RlB.setCouponStatusVisible(true);
        c70469RlB.setButtonVisible(false);
        String buttonText = voucher.getButtonText();
        if (buttonText == null) {
            buttonText = "";
        }
        c70469RlB.setCouponStatusText(buttonText);
        Integer costType = voucher.getCostType();
        if (costType != null) {
            if (costType.intValue() == 2) {
                i = R.attr.eg;
            } else if (costType.intValue() == 3) {
                i = R.attr.j5;
            }
            c70469RlB.setCouponStatusTextColorRes(i);
        }
        i = R.attr.eb;
        c70469RlB.setCouponStatusTextColorRes(i);
    }

    private final void showFollowCouponInfo(C70469RlB c70469RlB, Voucher voucher) {
        Image image;
        Integer num;
        InteractiveUserTask taskInfo;
        c70469RlB.setFollowerContainerVisible(true);
        VoucherInteractiveInfo interactiveInfo = voucher.getInteractiveInfo();
        String str = null;
        if (interactiveInfo != null) {
            image = interactiveInfo.getAuthorPhoto();
        } else {
            image = null;
        }
        c70469RlB.setFollowerPortrait(image);
        C2068389v c2068389v = new C2068389v();
        int i = C27162AlK.LJIJJLI;
        c2068389v.LIZIZ = i;
        c2068389v.LIZJ = i;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        VoucherInteractiveInfo interactiveInfo2 = voucher.getInteractiveInfo();
        if (interactiveInfo2 != null && (taskInfo = interactiveInfo2.getTaskInfo()) != null) {
            num = taskInfo.getTaskStatus();
        } else {
            num = null;
        }
        int ordinal = EnumC46479ILz.INPROGRESS.ordinal();
        if (num == null || num.intValue() != ordinal) {
            int ordinal2 = EnumC46479ILz.WAITTOFINISH.ordinal();
            if (num == null || num.intValue() != ordinal2) {
                int ordinal3 = EnumC46479ILz.FINISHED.ordinal();
                if (num == null || num.intValue() != ordinal3) {
                    c70469RlB.setFollowerStatusVisible(false);
                }
            }
            c2068389v.LIZ = R.raw.icon_tick_fill;
            c70469RlB.setFollowerStatusIcon(c2068389v);
        } else {
            c2068389v.LIZ = R.raw.icon_plus_fill;
            c70469RlB.setFollowerStatusIcon(c2068389v);
        }
        VoucherInteractiveInfo interactiveInfo3 = voucher.getInteractiveInfo();
        if (interactiveInfo3 != null) {
            str = interactiveInfo3.getInteractiveText();
        }
        c70469RlB.setThresholdText(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onButtonClick(com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher r7, X.EnumC70477RlJ r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L80
            int[] r1 = X.C70474RlG.LIZIZ
            int r0 = r8.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L18
            r0 = 2
            if (r1 == r0) goto L14
            r0 = 3
            if (r1 == r0) goto L1c
            return
        L14:
            r6.followAndClaimCoupon(r7)
            goto L80
        L18:
            r6.claimCoupon(r7)
            goto L80
        L1c:
            java.lang.Integer r2 = r7.getVapSchemaType()
            r3 = 7
            if (r2 != 0) goto Le3
        L23:
            java.lang.String r2 = "add_on_item"
        L25:
            java.lang.Integer r0 = r7.getVapSchemaType()
            if (r0 != 0) goto L81
        L2b:
            r6.jumpAddOnItemPage(r7)
        L2e:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r0 = r6.getViewModel()
            X.RkI r3 = r0.LLFII
            if (r3 == 0) goto L80
            java.lang.Object r0 = r6.getItem()
            X.RUs r0 = (X.C69638RUs) r0
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher> r0 = r0.LJ
            int r0 = r0.indexOf(r7)
            int r5 = r0 + 1
            X.Rke r4 = new X.Rke
            r4.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            X.Rkg r1 = X.C70437Rkf.LIZJ(r7, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r3.LIZIZ
            X.C70437Rkf.LJ(r1, r4, r0)
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r3 = r4.LIZIZ
            java.lang.String r1 = "coupon_zone"
            java.lang.String r0 = "discounts_module"
            r3.put(r1, r0)
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r3 = r4.LIZIZ
            java.lang.String r1 = "button_type"
            java.lang.String r0 = "use_coupon"
            r3.put(r1, r0)
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r3 = r4.LIZIZ
            java.lang.String r1 = "button_name"
            java.lang.String r0 = "use"
            r3.put(r1, r0)
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r1 = r4.LIZIZ
            java.lang.String r0 = "subsequent_page"
            r1.put(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r4.LJFF(r0)
            r4.LIZIZ()
        L80:
            return
        L81:
            int r0 = r0.intValue()
            if (r0 != r3) goto L2b
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r0 = r6.getViewModel()
            X.RkI r0 = r0.LLFII
            if (r0 == 0) goto Le1
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r0.LIZIZ
            if (r0 == 0) goto Le1
            java.util.Map r3 = X.C113554cx.LJJLIL(r0)
            if (r3 == 0) goto La0
            java.lang.String r1 = "source_previous_page"
            java.lang.String r0 = "product_detail"
            r3.put(r1, r0)
        La0:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r7.getVapSchema()
            r1.append(r0)
            java.lang.String r0 = "&is_self="
            r1.append(r0)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r0 = r6.getViewModel()
            boolean r0 = r0.ww0()
            r1.append(r0)
            java.lang.String r0 = "&trackParams="
            r1.append(r0)
            if (r3 == 0) goto Lde
            java.lang.String r0 = X.C27739Aud.LJI(r3)
        Lc6:
            java.lang.String r0 = android.net.Uri.encode(r0)
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            android.app.Application r0 = X.C39849FkT.LIZ()
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r0, r1)
            r0.open()
            goto L2e
        Lde:
            java.lang.String r0 = "{}"
            goto Lc6
        Le1:
            r3 = 0
            goto La0
        Le3:
            int r1 = r2.intValue()
            r0 = 10
            if (r1 != r0) goto Lef
            java.lang.String r2 = "bonus_center"
            goto L25
        Lef:
            int r0 = r2.intValue()
            if (r0 != r3) goto L23
            java.lang.String r2 = "shop"
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.PdpCouponsViewHolder.onButtonClick(com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher, X.RlJ):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateCouponItem(com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher r13, X.C70470RlC r14, int r15) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.PdpCouponsViewHolder.updateCouponItem(com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher, X.RlC, int):void");
    }

    private final boolean updateCouponsTime(long j, Voucher voucher, C70470RlC c70470RlC) {
        Long usableEndTime = voucher.getUsableEndTime();
        if (usableEndTime != null) {
            long longValue = (usableEndTime.longValue() * 1000) - j;
            if (longValue < 0) {
                longValue = 0;
            }
            if (0 <= longValue && longValue < 86400001) {
                String format = COUNT_DOWN_FORMAT.format(Long.valueOf(longValue));
                o.LJIIIIZZ(format, "COUNT_DOWN_FORMAT.format(endTime)");
                c70470RlC.setDiscountTime(format);
            }
            if (longValue == 0) {
                PdpViewModel.bx0(getViewModel(), false, true, null, null, 28);
                return true;
            }
        }
        return false;
    }

    public final void jumpCouponPage(String str, String str2, String str3) {
        PdpViewModel viewModel = getViewModel();
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        viewModel.Fw0(context, str, str2, str3);
    }

    private final void showButtonStatusByState(C70469RlB c70469RlB, Voucher voucher, EnumC70477RlJ enumC70477RlJ, int i) {
        c0 c0Var;
        EnumC70477RlJ enumC70477RlJ2 = EnumC70477RlJ.USE;
        if (enumC70477RlJ == enumC70477RlJ2) {
            Integer costType = voucher.getCostType();
            if (costType != null) {
                if (costType.intValue() == 2) {
                    c0Var = new c0(C27162AlK.LJIJI, R.attr.eg, R.attr.eg, null);
                } else if (costType.intValue() == 3) {
                    c0Var = new c0(C27162AlK.LJIJI, R.attr.j4, R.attr.j4, null);
                }
            }
            c0Var = new c0(C27162AlK.LJIJI, R.attr.eb, R.attr.eb, null);
        } else {
            Integer costType2 = voucher.getCostType();
            if (costType2 != null) {
                if (costType2.intValue() == 2) {
                    c0Var = new c0(C27162AlK.LJIJI, R.attr.eg, R.attr.dj, Integer.valueOf(R.attr.eg));
                } else if (costType2.intValue() == 3) {
                    c0Var = new c0(C27162AlK.LJIJI, R.attr.j1, R.attr.j3, Integer.valueOf(R.attr.j1));
                }
            }
            c0Var = new c0(C27162AlK.LJIJI, R.attr.eb, R.attr.dj, Integer.valueOf(R.attr.eb));
        }
        c70469RlB.setButtonVisible(true);
        String buttonText = voucher.getButtonText();
        if (buttonText == null) {
            buttonText = "";
        }
        c70469RlB.setButtonText(buttonText);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZLLL = Integer.valueOf(c0Var.LIZ);
        c110614Vt.LJFF = Integer.valueOf(c0Var.LIZIZ);
        c110614Vt.LIZIZ = c0Var.LIZJ;
        c70469RlB.setButtonTextColorRes(c0Var.LIZLLL);
        Context context = c70469RlB.getContext();
        o.LJIIIIZZ(context, "context");
        c70469RlB.setButtonBackgroundDrawable(c110614Vt.LIZ(context));
        if (enumC70477RlJ == enumC70477RlJ2) {
            C70414RkI c70414RkI = getViewModel().LLFII;
            if (c70414RkI != null) {
                c70414RkI.LJJIII(voucher, i + 1);
            }
            Integer costType3 = voucher.getCostType();
            if (costType3 == null || costType3.intValue() != 3) {
                return;
            }
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C78946Uyc.LJJIIJ(itemView, new C70885Rrt(), C70475RlH.LJLIL);
        }
    }

    private final void showCouponButtonStatus(C70469RlB c70469RlB, Voucher voucher, EnumC70477RlJ enumC70477RlJ, int i) {
        int i2 = C70474RlG.LIZIZ[enumC70477RlJ.ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            if (i2 == 4) {
                showButtonClaimedStatus(c70469RlB, voucher);
            }
        } else {
            showButtonStatusByState(c70469RlB, voucher, enumC70477RlJ, i);
        }
        c70469RlB.LIZIZ(getStyle());
    }
}
