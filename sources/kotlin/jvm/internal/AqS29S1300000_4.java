package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.B1R;
import X.C244309iM;
import X.C255199zv;
import X.C26045AKb;
import X.C27788AvQ;
import X.C27790AvS;
import X.C28031AzL;
import X.C28049Azd;
import X.C28121B1x;
import X.C36922EeM;
import X.C61836OOq;
import X.C71053Rub;
import X.C73423Srj;
import X.C73969T1h;
import X.C74672wR;
import X.C76800UCe;
import X.C78685UuP;
import X.C86184Xs4;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import X.SA5;
import X.T16;
import Y.AfS56S0100000_4;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResultProcess;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PayRiskControlParam;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.AvatarPresenter;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* loaded from: classes5.dex */
public class AqS29S1300000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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

    public static final Object invoke$0(AqS29S1300000_4 aqS29S1300000_4, Object obj) {
        CommuteType commuteType;
        String str;
        Price price;
        Summary LJII;
        Summary LJII2;
        Summary LJII3;
        PaymentMethodInfo paymentMethodInfo;
        PaymentMethod paymentMethod;
        CommuteInfo LJIIJJI;
        OrderSubmitState it = (OrderSubmitState) obj;
        o.LJIIIZ(it, "it");
        String uuid = UUID.randomUUID().toString();
        o.LJIIIIZZ(uuid, "randomUUID().toString()");
        long currentTimeMillis = System.currentTimeMillis();
        OrderSubmitViewModel orderSubmitViewModel = (OrderSubmitViewModel) aqS29S1300000_4.l1;
        Boolean bool = (Boolean) aqS29S1300000_4.l2;
        String str2 = aqS29S1300000_4.s0;
        orderSubmitViewModel.getClass();
        PaymentResultProcess paymentResultProcess = PaymentResultProcess.INSTANCE;
        List<BillItem> list = null;
        Price price2 = null;
        String middlePageUrl$default = PaymentResultProcess.getMiddlePageUrl$default(paymentResultProcess, null, null, "ordersubmit", orderSubmitViewModel.LL, null, null, Boolean.valueOf(orderSubmitViewModel.tw0()), 48, null);
        C28031AzL c28031AzL = orderSubmitViewModel.LLJZIJLIL;
        String str3 = c28031AzL.LIZIZ;
        List<String> list2 = c28031AzL.LIZ;
        Boolean bool2 = Boolean.TRUE;
        PaymentMethodInfo LIZ = SA5.LIZ(it.getUserPaymentInfo(), false);
        String deepLink = paymentResultProcess.getDeepLink(middlePageUrl$default);
        PayRiskControlParam LIZ2 = C71053Rub.LIZ();
        PaymentInfo paymentInfo = orderSubmitViewModel.LL;
        if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null && (LJIIJJI = paymentMethod.LJIIJJI()) != null) {
            commuteType = LJIIJJI.commuteType;
        } else {
            commuteType = null;
        }
        PaymentInfo paymentInfo2 = orderSubmitViewModel.LL;
        if (paymentInfo2 != null && (paymentMethodInfo = paymentInfo2.paymentMethodInfo) != null) {
            str = paymentMethodInfo.getId();
        } else {
            str = null;
        }
        BillInfoData billInfoData = orderSubmitViewModel.LJZ;
        if (billInfoData != null && (LJII3 = u.LJII(billInfoData, str)) != null) {
            list = LJII3.getBillItems();
        }
        BillInfoData billInfoData2 = orderSubmitViewModel.LJZ;
        if (billInfoData2 != null && (LJII2 = u.LJII(billInfoData2, str)) != null) {
            price2 = LJII2.getTotal();
        }
        BillInfoData billInfoData3 = orderSubmitViewModel.LJZ;
        if (billInfoData3 != null && (LJII = u.LJII(billInfoData3, str)) != null) {
            price = LJII.getPaymentBeforePayPromotion();
        } else {
            price = null;
        }
        PayRequest payRequest = new PayRequest(str3, list2, bool2, LIZ, middlePageUrl$default, deepLink, LIZ2, commuteType, str2, bool, uuid, new Summary(list, price2, null, null, null, null, null, price));
        C28121B1x.LIZ.getClass();
        if (C28121B1x.LIZ()) {
            ((OrderSubmitViewModel) aqS29S1300000_4.l1).setState(C27788AvQ.LJLIL);
        } else {
            ((OrderSubmitViewModel) aqS29S1300000_4.l1).setState(C27790AvS.LJLIL);
        }
        ((OrderSubmitViewModel) aqS29S1300000_4.l1).getClass();
        PaymentApi.LIZ.getClass();
        C73423Srj LJIL = ((PaymentApi) C74672wR.LIZIZ.create(PaymentApi.class)).pay(payRequest).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJIL(new InterfaceC64592gB() { // from class: X.9Ej
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
            }
        });
        Context context = (Context) aqS29S1300000_4.l3;
        OrderSubmitViewModel orderSubmitViewModel2 = (OrderSubmitViewModel) aqS29S1300000_4.l1;
        LJIL.LJJJLIIL(new C28049Azd(context, orderSubmitViewModel2, it, currentTimeMillis, uuid), new AfS56S0100000_4(orderSubmitViewModel2, 107));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e7, code lost:
    
        if ((!r4.isEmpty()) != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AqS29S1300000_4 r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS29S1300000_4.invoke$1(kotlin.jvm.internal.AqS29S1300000_4, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0339, code lost:
    
        if (r15 != null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x00ce, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0.isValid, java.lang.Boolean.TRUE) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bc, code lost:
    
        if (r3 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b7, code lost:
    
        if (r3 == false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AqS29S1300000_4 r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS29S1300000_4.invoke$2(kotlin.jvm.internal.AqS29S1300000_4, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AqS29S1300000_4 aqS29S1300000_4, Object obj) {
        String str;
        String str2 = (String) obj;
        if (str2 != null && C78685UuP.LJJJZ(str2)) {
            Context context = ((B1R) aqS29S1300000_4.l1).getContext();
            o.LJIIIIZZ(context, "context");
            PaymentMethod paymentMethod = (PaymentMethod) aqS29S1300000_4.l2;
            if (paymentMethod != null) {
                str = paymentMethod.LIZLLL;
            } else {
                str = null;
            }
            C61836OOq.LIZ(context, str, aqS29S1300000_4.s0, str2, (CommuteType) aqS29S1300000_4.l3, "ordersubmit");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS29S1300000_4 aqS29S1300000_4, Object it) {
        o.LJIIIZ(it, "it");
        if (TextUtils.isEmpty(aqS29S1300000_4.s0)) {
            C26045AKb c26045AKb = new C26045AKb((ActivityC45651qj) aqS29S1300000_4.l1);
            c26045AKb.LJIIIIZZ(R.string.qb6);
            c26045AKb.LJIIJ();
            C36922EeM.LJFF(new Exception("SD card is not available"));
        } else {
            HashMap hashMap = new HashMap();
            String LIZIZ = C255199zv.LIZIZ((User) aqS29S1300000_4.l2, "photo", "video");
            if (!TextUtils.isEmpty(LIZIZ)) {
                hashMap.put("btn_name", LIZIZ);
            }
            C244309iM.LJIIIIZZ("shoot", "click_card", hashMap);
            C86184Xs4 headUploadHelper = ((AvatarPresenter) aqS29S1300000_4.l3).getHeadUploadHelper();
            if (headUploadHelper != null) {
                headUploadHelper.LJIIL(0);
            }
        }
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS29S1300000_4(android.content.Context r3, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel r4, java.lang.Boolean r5, java.lang.String r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            switch(r7) {
                case 0: goto L13;
                case 1: goto L5;
                case 2: goto L13;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r4
            r1.l2 = r3
            r1.l3 = r5
            r1.s0 = r6
            r0 = 1
        Lf:
            r1.<init>(r0)
            return
        L13:
            r1 = r2
            r1.l1 = r4
            r1.l2 = r5
            r1.s0 = r6
            r1.l3 = r3
            r0 = 1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS29S1300000_4.<init>(android.content.Context, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, java.lang.Boolean, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS29S1300000_4(B1R b1r, PaymentMethod paymentMethod, String str, CommuteType commuteType, int i) {
        super(1);
        this.$t = i;
        this.l1 = b1r;
        this.l2 = paymentMethod;
        this.s0 = str;
        this.l3 = commuteType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS29S1300000_4(String str, ActivityC45651qj activityC45651qj, User user, AvatarPresenter avatarPresenter, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = activityC45651qj;
        this.l2 = user;
        this.l3 = avatarPresenter;
    }
}
