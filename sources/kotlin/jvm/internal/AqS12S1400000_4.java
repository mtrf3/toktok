package kotlin.jvm.internal;

import X.AUD;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C00F;
import X.C237559Tz;
import X.C244309iM;
import X.C255199zv;
import X.C26045AKb;
import X.C26867AgZ;
import X.C27090AkA;
import X.C27565Arp;
import X.C27943Axv;
import X.C27949Ay1;
import X.C36922EeM;
import X.C67964Qls;
import X.C76542zS;
import X.C76800UCe;
import X.C78685UuP;
import X.C78948Uye;
import X.C9L8;
import X.EF7;
import X.EnumC27721AuL;
import X.EnumC67961Qlp;
import X.InterfaceC71003Rtn;
import X.InterfaceC88472Yns;
import X.L69;
import X.Q7K;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commerce.CouponInfo;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.GooglePayProcess;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ConvenientSubmitOrder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.AvatarPresenter;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONArray;

/* loaded from: classes5.dex */
public class AqS12S1400000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS12S1400000_4 aqS12S1400000_4, Object it) {
        long j;
        String str;
        o.LJIIIZ(it, "it");
        C237559Tz c237559Tz = new C237559Tz();
        User user = (User) aqS12S1400000_4.l1;
        Aweme aweme = (Aweme) aqS12S1400000_4.l2;
        CouponInfo couponInfo = (CouponInfo) aqS12S1400000_4.l3;
        o.LJIIIZ(couponInfo, "couponInfo");
        c237559Tz.LIZJ = 0;
        c237559Tz.LJIIIZ(user, aweme);
        String couponCode = couponInfo.getCouponCode();
        String str2 = "";
        if (couponCode == null) {
            couponCode = "";
        }
        c237559Tz.LIZJ("code", couponCode);
        Long couponId = couponInfo.getCouponId();
        if (couponId != null) {
            j = couponId.longValue();
        } else {
            j = 0;
        }
        c237559Tz.LIZIZ("coupon_id", Long.valueOf(j));
        String website = couponInfo.getWebsite();
        if (website != null) {
            str2 = website;
        }
        c237559Tz.LIZJ("biolink", str2);
        c237559Tz.LJII("ttelite_user_click_coupon_openbiolink", "enter_from", "is_ads", "to_user_id", "from_user_id", "item_id");
        IBAProfilePageService LJIIJJI = BAProfilePageServiceImpl.LJIIJJI();
        Context context = (Context) aqS12S1400000_4.l4;
        String str3 = aqS12S1400000_4.s0;
        User user2 = (User) aqS12S1400000_4.l1;
        if (user2 != null) {
            str = user2.getUid();
        } else {
            str = null;
        }
        C9L8.LIZ(LJIIJJI, context, 1, str3, null, str, 32);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS12S1400000_4 aqS12S1400000_4, Object obj) {
        ConvenientSubmitOrder convenientSubmitOrder;
        InterfaceC71003Rtn LJIILIIL;
        LaneParams LJIILJJIL;
        HashMap<String, Object> trackParams;
        C27565Arp c27565Arp;
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (C00F.LIZ(31744, 0, "ec_add_to_cart_new_anim", true) != 0 && (c27565Arp = ((PdpViewModel) aqS12S1400000_4.l1).LLJLLL) != null && (interfaceC88472Yns = c27565Arp.LIZ.LJLLI) != null) {
            interfaceC88472Yns.invoke(Boolean.valueOf(booleanValue));
        }
        ((PdpViewModel) aqS12S1400000_4.l1).ix0((Context) aqS12S1400000_4.l2, aqS12S1400000_4.s0);
        ((PdpViewModel) aqS12S1400000_4.l1).nx0(aqS12S1400000_4.l3);
        PdpViewModel pdpViewModel = (PdpViewModel) aqS12S1400000_4.l1;
        Context context = (Context) aqS12S1400000_4.l2;
        View view = (View) aqS12S1400000_4.l4;
        ProductPackStruct productPackStruct = pdpViewModel.LJLJLLL;
        if (productPackStruct != null && (convenientSubmitOrder = productPackStruct.convenientSubmitOrder) != null && convenientSubmitOrder.LIZ(Boolean.valueOf(pdpViewModel.LJLJL)) && C78685UuP.LJJJZ(convenientSubmitOrder.schema)) {
            String str = convenientSubmitOrder.schema;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            IPdpStarter.PdpEnterParam pdpEnterParam = pdpViewModel.LJLJJLL;
            if (pdpEnterParam != null && (trackParams = pdpEnterParam.getTrackParams()) != null) {
                linkedHashMap2.putAll(trackParams);
            }
            if (view != null && (LJIILIIL = C78948Uye.LJIILIIL(view)) != null && (LJIILJJIL = C78948Uye.LJIILJJIL(LJIILIIL, "lib_track_builtin_lane_business")) != null) {
                Object obj2 = LJIILJJIL.get((Object) "first_source_page");
                if (obj2 != null) {
                    linkedHashMap2.put("first_source_page", obj2);
                }
                Object obj3 = LJIILJJIL.get((Object) "first_track_id");
                if (obj3 != null) {
                    linkedHashMap2.put("first_track_id", obj3);
                }
            }
            linkedHashMap2.put("previous_page", "product_detail");
            linkedHashMap.put("trackParams", linkedHashMap2);
            String str2 = C27090AkA.LJLILLLLZI;
            if (str2 != null) {
                linkedHashMap.put("buyer_addr_id", str2);
            }
            SmartRouter.buildRoute(context, C26867AgZ.LIZJ(str, linkedHashMap).toString()).open();
        }
        PdpViewModel pdpViewModel2 = (PdpViewModel) aqS12S1400000_4.l1;
        if (pdpViewModel2.LLII && Q7K.LIZIZ("ecom_pdp_after_add_cart_anchor", 0) == 1) {
            pdpViewModel2.tx0(EnumC27721AuL.RECOMMENDATION.getValue(), true);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS12S1400000_4 aqS12S1400000_4, Object obj) {
        PaymentInfo LIZLLL;
        C67964Qls paymentResult = (C67964Qls) obj;
        o.LJIIIZ(paymentResult, "paymentResult");
        long LIZJ = C27949Ay1.LIZJ("google_pay");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C27949Ay1.LIZIZ);
        linkedHashMap.put("page_name", "google_pay");
        linkedHashMap.put("stay_time", Long.valueOf(LIZJ));
        linkedHashMap.put("previous_page", "order_submit");
        linkedHashMap.put("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
        C76542zS.LIZ("tiktokec_stay_page", linkedHashMap);
        OrderSubmitViewModel orderSubmitViewModel = (OrderSubmitViewModel) aqS12S1400000_4.l1;
        orderSubmitViewModel.getClass();
        EnumC67961Qlp enumC67961Qlp = paymentResult.LIZ;
        if (enumC67961Qlp == EnumC67961Qlp.Success) {
            JSONArray jSONArray = paymentResult.LIZIZ;
            if (jSONArray != null && (LIZLLL = GooglePayProcess.LIZLLL((PaymentInfo) aqS12S1400000_4.l2, jSONArray)) != null) {
                OrderSubmitViewModel orderSubmitViewModel2 = (OrderSubmitViewModel) aqS12S1400000_4.l1;
                Context context = (Context) aqS12S1400000_4.l3;
                Boolean bool = (Boolean) aqS12S1400000_4.l4;
                String str = aqS12S1400000_4.s0;
                orderSubmitViewModel2.Tw0(LIZLLL, false);
                if (orderSubmitViewModel2.LLJZIJLIL.LIZJ) {
                    orderSubmitViewModel2.withState(new AqS29S1300000_4(context, orderSubmitViewModel2, bool, (String) null, 0));
                } else {
                    orderSubmitViewModel2.withState(new AqS29S1300000_4(context, orderSubmitViewModel2, bool, str, 2));
                }
            }
        } else if (GooglePayProcess.LJ.contains(enumC67961Qlp)) {
            String string = EF7.LIZIZ().getResources().getString(R.string.f2_);
            o.LJIIIIZZ(string, "getApplicationContext().…_bottom_line_payin_error)");
            orderSubmitViewModel.setState(new AqS29S1000000_4(string, 39));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS12S1400000_4 aqS12S1400000_4, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LJ((HashMap) aqS12S1400000_4.l1);
        sendLog.LIZLLL("is_success", Integer.valueOf(o.LJ((Boolean) aqS12S1400000_4.l2, Boolean.TRUE) ? 1 : 0));
        String str = aqS12S1400000_4.s0;
        if (str != null) {
            sendLog.LIZLLL("fail_reason", str);
        }
        Integer num = (Integer) aqS12S1400000_4.l3;
        if (num != null) {
            sendLog.LIZLLL("sku_num_before", num);
        }
        Integer num2 = (Integer) aqS12S1400000_4.l4;
        if (num2 != null) {
            sendLog.LIZLLL("sku_num_after", num2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS12S1400000_4 aqS12S1400000_4, Object it) {
        o.LJIIIZ(it, "it");
        if (TextUtils.isEmpty(aqS12S1400000_4.s0)) {
            C26045AKb c26045AKb = new C26045AKb((ActivityC45651qj) aqS12S1400000_4.l1);
            c26045AKb.LJIIIIZZ(R.string.qb6);
            c26045AKb.LJIIJ();
            C36922EeM.LJFF(new Exception("SD card is not available"));
        } else {
            HashMap hashMap = new HashMap();
            String LIZIZ = C255199zv.LIZIZ((User) aqS12S1400000_4.l2, "photo", "video");
            if (!TextUtils.isEmpty(LIZIZ)) {
                hashMap.put("btn_name", LIZIZ);
            }
            C244309iM.LJIIIIZZ("click_upload_entrance", "click_card", hashMap);
            AUD.LIZ((View) aqS12S1400000_4.l3, (ActivityC45651qj) aqS12S1400000_4.l1, (User) aqS12S1400000_4.l2, (AvatarPresenter) aqS12S1400000_4.l4);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S1400000_4(OrderSubmitViewModel orderSubmitViewModel, PaymentInfo paymentInfo, Context context, Boolean bool, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = orderSubmitViewModel;
        this.l2 = paymentInfo;
        this.l3 = context;
        this.l4 = bool;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S1400000_4(PdpViewModel pdpViewModel, Context context, String str, Object obj, View view, int i) {
        super(1);
        this.$t = i;
        this.l1 = pdpViewModel;
        this.l2 = context;
        this.s0 = str;
        this.l3 = obj;
        this.l4 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S1400000_4(User user, Aweme aweme, CouponInfo couponInfo, Context context, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = user;
        this.l2 = aweme;
        this.l3 = couponInfo;
        this.l4 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S1400000_4(String str, ActivityC45651qj activityC45651qj, User user, L69 l69, AvatarPresenter avatarPresenter, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = activityC45651qj;
        this.l2 = user;
        this.l3 = l69;
        this.l4 = avatarPresenter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS12S1400000_4(HashMap hashMap, HashMap<String, Object> hashMap2, Boolean bool, String str, Integer num, Integer num2) {
        super(1);
        this.$t = num2;
        this.l1 = hashMap;
        this.l2 = hashMap2;
        this.s0 = bool;
        this.l3 = str;
        this.l4 = num;
    }
}
