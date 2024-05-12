package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C234999Kd;
import X.C254149yE;
import X.C254559yt;
import X.C25848ACm;
import X.C25849ACn;
import X.C25881ADt;
import X.C27724AuO;
import X.C27863Awd;
import X.C27949Ay1;
import X.C27962AyE;
import X.C27996Aym;
import X.C32I;
import X.C43I;
import X.C47261Igj;
import X.C73969T1h;
import X.C76800UCe;
import X.C780334l;
import X.EnumC235129Kq;
import X.InterfaceC25880ADs;
import X.InterfaceC88472Yns;
import X.S4U;
import X.T16;
import X.XKX;
import Y.ACListenerS21S0210000_4;
import Y.IDxS128S0200000_4;
import android.content.Context;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.api.CartApi;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemToCartRequest;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.QuitReasonData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.global.osp.module.discount.GlobalDiscountVH;
import com.ss.android.ugc.aweme.ecommerce.ttf.osp.module.discount.TtfDiscountVH;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentCollectionListAssemViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagSearchListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class AqS28S0210000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS28S0210000_4 aqS28S0210000_4, Object obj) {
        String string;
        String string2;
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        if (aqS28S0210000_4.z2 && ((OrderSubmitFragment) aqS28S0210000_4.l0).getViewModel().LJLJJLL == 0) {
            string = ((OrderSubmitFragment) aqS28S0210000_4.l0).getString(R.string.slh);
        } else {
            string = ((OrderSubmitFragment) aqS28S0210000_4.l0).getString(R.string.r_f);
        }
        o.LJIIIIZZ(string, "if (addUnpaidToCartGroup…on)\n                    }");
        actionGroup.LJII(string, C27863Awd.LJLIL);
        if (aqS28S0210000_4.z2 && ((OrderSubmitFragment) aqS28S0210000_4.l0).getViewModel().LJLJJLL == 0) {
            string2 = ((OrderSubmitFragment) aqS28S0210000_4.l0).getString(R.string.slg);
        } else {
            string2 = ((OrderSubmitFragment) aqS28S0210000_4.l0).getString(R.string.r_g);
        }
        o.LJIIIIZZ(string2, "if (addUnpaidToCartGroup…n2)\n                    }");
        actionGroup.LJIIIZ(string2, new AqS28S0210000_4((Context) aqS28S0210000_4.l1, (OrderSubmitFragment) aqS28S0210000_4.l0, aqS28S0210000_4.z2, 1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS28S0210000_4 aqS28S0210000_4, Object it) {
        String str;
        List<Voucher> autoVouchers;
        o.LJIIIZ(it, "it");
        boolean z = true;
        z = true;
        z = true;
        z = true;
        if (((OrderSubmitFragment) aqS28S0210000_4.l0).getViewModel().LLFII != null) {
            ((OrderSubmitFragment) aqS28S0210000_4.l0).getViewModel().getClass();
            OrderSubmitViewModel.Ow0();
            if (!((OrderSubmitFragment) aqS28S0210000_4.l0).showFeedbackDialog((Context) aqS28S0210000_4.l1)) {
                Context context = (Context) aqS28S0210000_4.l1;
                QuitReasonData quitReasonData = ((OrderSubmitFragment) aqS28S0210000_4.l0).getViewModel().LLFII;
                AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4((OrderSubmitFragment) aqS28S0210000_4.l0, 193);
                AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4((OrderSubmitFragment) aqS28S0210000_4.l0, 270);
                HashMap<String, Object> fw0 = ((OrderSubmitFragment) aqS28S0210000_4.l0).getViewModel().fw0(true);
                fw0.put("previous_page", "order_submit");
                new S4U(context, quitReasonData, aqS154S0100000_4, aqS170S0100000_4, fw0).LIZ();
            }
        } else {
            ActivityC45651qj mo49getActivity = ((OrderSubmitFragment) aqS28S0210000_4.l0).mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.finish();
            }
        }
        ArrayList arrayList = null;
        if (((OrderSubmitFragment) aqS28S0210000_4.l0).getViewModel().LLJZIJLIL.LIZJ) {
            OrderSubmitViewModel viewModel = ((OrderSubmitFragment) aqS28S0210000_4.l0).getViewModel();
            viewModel.getClass();
            XKX.LIZLLL(C780334l.LJLIL, null, null, new C27962AyE(viewModel, null), 3);
        }
        if (aqS28S0210000_4.z2 && ((OrderSubmitFragment) aqS28S0210000_4.l0).getViewModel().LJLJJLL == 0) {
            OrderSubmitViewModel viewModel2 = ((OrderSubmitFragment) aqS28S0210000_4.l0).getViewModel();
            BillInfoData billInfoData = viewModel2.LJZ;
            if (billInfoData != null && (autoVouchers = billInfoData.getAutoVouchers()) != null) {
                arrayList = new ArrayList(C32I.LJJL(autoVouchers, 10));
                Iterator<Voucher> it2 = autoVouchers.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().getVoucherTypeID());
                }
            }
            List<OrderShopDigest> list = viewModel2.LJLJLLL;
            if (list != null) {
                for (OrderShopDigest orderShopDigest : list) {
                    List<OrderSKUDTO> orderSKUs = orderShopDigest.getOrderSKUs();
                    if (orderSKUs != null) {
                        for (OrderSKUDTO orderSKUDTO : orderSKUs) {
                            String sellerId = orderShopDigest.getSellerId();
                            String str2 = orderSKUDTO.warehouseId;
                            String str3 = orderSKUDTO.productId;
                            String str4 = orderSKUDTO.skuId;
                            Integer valueOf = Integer.valueOf(z ? 1 : 0);
                            String str5 = orderSKUDTO.chainKey;
                            String str6 = orderSKUDTO.entranceInfo;
                            Integer num = orderSKUDTO.source;
                            String str7 = orderSKUDTO.kolId;
                            String str8 = orderSKUDTO.sourceInfo;
                            BillInfoData billInfoData2 = viewModel2.LJZ;
                            if (billInfoData2 != null) {
                                str = billInfoData2.getBuyerAddressId();
                            } else {
                                str = null;
                            }
                            AddItemToCartRequest addItemToCartRequest = new AddItemToCartRequest(sellerId, str2, str3, str4, valueOf, str5, str6, num, str7, arrayList, str8, str, orderSKUDTO.priceVal, orderSKUDTO.logisticsServiceId, orderSKUDTO.sourceInfo, 3, Boolean.FALSE);
                            CartApi.LIZ.getClass();
                            ((CartApi) C27996Aym.LIZIZ.create(CartApi.class)).addToCart(addItemToCartRequest).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS128S0200000_4(viewModel2, orderSKUDTO, 2));
                            z = true;
                        }
                    }
                }
            }
        }
        C27949Ay1.LJJIII("quit_checkout", "quit", null, null, "order_submit", z, 28);
        ((OrderSubmitFragment) aqS28S0210000_4.l0).getViewModel().LLFII = null;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS28S0210000_4 aqS28S0210000_4, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.b4a, new AqS28S0210000_4((Context) aqS28S0210000_4.l0, (InterfaceC25880ADs) aqS28S0210000_4.l1, aqS28S0210000_4.z2, 11));
        actionGroup.LJIIIIZZ(R.string.ehl, null);
        actionGroup.LJI = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS28S0210000_4 aqS28S0210000_4, Object it) {
        o.LJIIIZ(it, "it");
        C25881ADt.LIZ((Context) aqS28S0210000_4.l0, aqS28S0210000_4.z2, (InterfaceC25880ADs) aqS28S0210000_4.l1, true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS28S0210000_4 aqS28S0210000_4, Object obj) {
        HashMap logView = (HashMap) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.put("module_name", "discounts");
        logView.put("discount_amount", ((C27724AuO) aqS28S0210000_4.l0).LIZ);
        logView.putAll(((TtfDiscountVH) aqS28S0210000_4.l1).L().cw0(2));
        logView.put("coupon_cost_role", "platform");
        if ((!((C27724AuO) aqS28S0210000_4.l0).LJ.isEmpty()) && aqS28S0210000_4.z2) {
            logView.put("module_item_cnt", Integer.valueOf(((C27724AuO) aqS28S0210000_4.l0).LJ.size()));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS28S0210000_4 aqS28S0210000_4, Object obj) {
        HashMap logWhenShow = (HashMap) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        logWhenShow.put("module_name", "discounts");
        logWhenShow.put("discount_amount", ((C27724AuO) aqS28S0210000_4.l0).LIZ);
        logWhenShow.putAll(((TtfDiscountVH) aqS28S0210000_4.l1).L().cw0(2));
        logWhenShow.put("coupon_cost_role", "platform");
        if ((!((C27724AuO) aqS28S0210000_4.l0).LJ.isEmpty()) && aqS28S0210000_4.z2) {
            logWhenShow.put("module_item_cnt", Integer.valueOf(((C27724AuO) aqS28S0210000_4.l0).LJ.size()));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS28S0210000_4 aqS28S0210000_4, Object obj) {
        C254149yE it = (C254149yE) obj;
        o.LJIIIZ(it, "it");
        List<C254559yt> list = it.LJLILLLLZI.LJLJJI;
        if (list != null) {
            CollectionDetailModel collectionDetailModel = (CollectionDetailModel) aqS28S0210000_4.l0;
            boolean z = aqS28S0210000_4.z2;
            PaidContentCollectionListAssemViewModel paidContentCollectionListAssemViewModel = (PaidContentCollectionListAssemViewModel) aqS28S0210000_4.l1;
            Iterator<C254559yt> it2 = list.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C254559yt next = it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    C254559yt c254559yt = next;
                    if (c254559yt.LJLIL.getCollectionId() == collectionDetailModel.getCollectionId()) {
                        paidContentCollectionListAssemViewModel.listSetItemAt(i, (int) new C254559yt(c254559yt.LJLIL, c254559yt.LJLILLLLZI, c254559yt.LJLJI, c254559yt.LJLJJI, c254559yt.LJLJJL, z));
                        break;
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS28S0210000_4 aqS28S0210000_4, Object obj) {
        C234999Kd c234999Kd = (C234999Kd) obj;
        if (c234999Kd != null) {
            User user = (User) aqS28S0210000_4.l0;
            return C234999Kd.LIZ(c234999Kd, user, new C43I(user), aqS28S0210000_4.z2, false, (EnumC235129Kq) aqS28S0210000_4.l1, null, null, 208);
        }
        return null;
    }

    public static final Object invoke$4(AqS28S0210000_4 aqS28S0210000_4, Object obj) {
        C234999Kd c234999Kd = (C234999Kd) obj;
        if (c234999Kd != null) {
            User user = (User) aqS28S0210000_4.l0;
            return C234999Kd.LIZ(c234999Kd, user, new C43I(user), aqS28S0210000_4.z2, false, (EnumC235129Kq) aqS28S0210000_4.l1, null, null, 208);
        }
        return null;
    }

    public static final Object invoke$5(AqS28S0210000_4 aqS28S0210000_4, Object obj) {
        C254149yE it = (C254149yE) obj;
        o.LJIIIZ(it, "it");
        List<C254559yt> list = it.LJLILLLLZI.LJLJJI;
        if (list != null) {
            CollectionDetailModel collectionDetailModel = (CollectionDetailModel) aqS28S0210000_4.l0;
            boolean z = aqS28S0210000_4.z2;
            PaidContentCollectionListAssemViewModel paidContentCollectionListAssemViewModel = (PaidContentCollectionListAssemViewModel) aqS28S0210000_4.l1;
            Iterator<C254559yt> it2 = list.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C254559yt next = it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    C254559yt c254559yt = next;
                    if (c254559yt.LJLIL.getCollectionId() == collectionDetailModel.getCollectionId()) {
                        paidContentCollectionListAssemViewModel.listSetItemAt(i, (int) new C254559yt(CollectionDetailModel.copy$default(collectionDetailModel, 0L, null, null, null, null, 0L, 0L, 0L, 0L, 0L, 0.0f, 0, 0L, z, false, false, false, null, null, false, false, false, null, null, false, null, null, null, null, false, 0L, 0, null, null, -8193, 3, null), c254559yt.LJLILLLLZI, c254559yt.LJLJI, c254559yt.LJLJJI, false));
                        break;
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS28S0210000_4 aqS28S0210000_4, Object obj) {
        C25848ACm it = (C25848ACm) obj;
        o.LJIIIZ(it, "it");
        return C25848ACm.LJIILJJIL(it, false, null, new ACListenerS21S0210000_4((C25849ACn) aqS28S0210000_4.l0, aqS28S0210000_4.z2, (CaptionsPanelFragment) aqS28S0210000_4.l1, 0), false, null, null, null, false, false, false, 65531);
    }

    public static final Object invoke$7(AqS28S0210000_4 aqS28S0210000_4, Object obj) {
        String str;
        String str2;
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("previous_page", ((VideoTagSearchListViewModel) aqS28S0210000_4.l0).hv0().getEnterFrom());
        sendEventTrackingAsync.put("to_user_id", ((IMUser) aqS28S0210000_4.l1).getUid());
        if (aqS28S0210000_4.z2) {
            str = "choose";
        } else {
            str = "cancel_choose";
        }
        sendEventTrackingAsync.put("click_type", str);
        if (((VideoTagSearchListViewModel) aqS28S0210000_4.l0).LJLJI.contains((IMUser) aqS28S0210000_4.l1)) {
            str2 = "following";
        } else {
            str2 = "all_user";
        }
        sendEventTrackingAsync.put("user_type", str2);
        sendEventTrackingAsync.put("search_keyword", ((VideoTagSearchListViewModel) aqS28S0210000_4.l0).LJLJJLL);
        sendEventTrackingAsync.put("function", "tag");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS28S0210000_4 aqS28S0210000_4, Object obj) {
        HashMap logView = (HashMap) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.put("module_name", "discounts");
        logView.put("discount_amount", ((C27724AuO) aqS28S0210000_4.l0).LIZ);
        logView.putAll(((GlobalDiscountVH) aqS28S0210000_4.l1).L().cw0(2));
        logView.put("coupon_cost_role", "platform");
        if ((!((C27724AuO) aqS28S0210000_4.l0).LJ.isEmpty()) && aqS28S0210000_4.z2) {
            logView.put("module_item_cnt", Integer.valueOf(((C27724AuO) aqS28S0210000_4.l0).LJ.size()));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS28S0210000_4 aqS28S0210000_4, Object obj) {
        HashMap logWhenShow = (HashMap) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        logWhenShow.put("module_name", "discounts");
        logWhenShow.put("discount_amount", ((C27724AuO) aqS28S0210000_4.l0).LIZ);
        logWhenShow.putAll(((GlobalDiscountVH) aqS28S0210000_4.l1).L().cw0(2));
        logWhenShow.put("coupon_cost_role", "platform");
        if ((!((C27724AuO) aqS28S0210000_4.l0).LJ.isEmpty()) && aqS28S0210000_4.z2) {
            logWhenShow.put("module_item_cnt", Integer.valueOf(((C27724AuO) aqS28S0210000_4.l0).LJ.size()));
        }
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS28S0210000_4(android.content.Context r3, com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment r4, boolean r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.z2 = r5
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.z2 = r5
            r1.l0 = r4
            r1.l1 = r3
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS28S0210000_4.<init>(android.content.Context, com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS28S0210000_4(C25849ACn c25849ACn, CaptionsPanelFragment captionsPanelFragment, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c25849ACn;
        this.l1 = captionsPanelFragment;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS28S0210000_4(C27724AuO c27724AuO, GlobalDiscountVH globalDiscountVH, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c27724AuO;
        this.l1 = globalDiscountVH;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS28S0210000_4(C27724AuO c27724AuO, TtfDiscountVH ttfDiscountVH, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c27724AuO;
        this.l1 = ttfDiscountVH;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS28S0210000_4(Context context, InterfaceC25880ADs interfaceC25880ADs, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.z2 = z;
        this.l1 = interfaceC25880ADs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS28S0210000_4(CollectionDetailModel collectionDetailModel, boolean z, PaidContentCollectionListAssemViewModel paidContentCollectionListAssemViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = collectionDetailModel;
        this.z2 = z;
        this.l1 = paidContentCollectionListAssemViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS28S0210000_4(User user, EnumC235129Kq enumC235129Kq, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = user;
        this.z2 = z;
        this.l1 = enumC235129Kq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS28S0210000_4(VideoTagSearchListViewModel videoTagSearchListViewModel, IMUser iMUser, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoTagSearchListViewModel;
        this.l1 = iMUser;
        this.z2 = z;
    }
}
