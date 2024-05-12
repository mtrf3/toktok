package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.B1J;
import X.C243799hX;
import X.C243809hY;
import X.C243829ha;
import X.C243839hb;
import X.C248559pD;
import X.C248629pK;
import X.C26335AVf;
import X.C28120B1w;
import X.C32I;
import X.C34K;
import X.C68322mC;
import X.C72912tb;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.OP0;
import X.ORZ;
import X.YFM;
import android.content.Context;
import com.ss.android.ugc.aweme.commerce.CouponInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Balance;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BalanceCode;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.CreatorCollectionDetailResponse;
import com.ss.android.ugc.aweme.model.ManagementPagePaidCollectionInfo;
import com.ss.android.ugc.aweme.model.Price;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class AqS12S0500000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.List, T] */
    public static final Object invoke$0(AqS12S0500000_4 aqS12S0500000_4, Object obj) {
        Boolean bool;
        Availability availability;
        C28120B1w c28120B1w;
        Boolean bool2;
        Availability availability2;
        List<PaymentMethod> list;
        List<PaymentMethod> list2;
        PaymentState paymentState = (PaymentState) obj;
        o.LJIIIZ(paymentState, "paymentState");
        List<Balance> list3 = (List) aqS12S0500000_4.l0;
        if (list3 != null) {
            EnterParams enterParams = (EnterParams) aqS12S0500000_4.l4;
            C34K c34k = (C34K) aqS12S0500000_4.l1;
            C68322mC c68322mC = (C68322mC) aqS12S0500000_4.l2;
            for (Balance balance : list3) {
                if (balance.getBalanceCode() == BalanceCode.BALANCE_INSUFFICIENT || balance.getBalanceCode() == BalanceCode.BALANCE_SUFFICIENT) {
                    PaymentMethodsData paymentMethodsData = enterParams.paymentData;
                    if (paymentMethodsData != null && (list2 = paymentMethodsData.paymentMethods) != null) {
                        Iterator<PaymentMethod> it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            PaymentMethod next = it.next();
                            if (o.LJ(next.id, balance.getPaymentMethodId())) {
                                if (next != null) {
                                    c34k.element = true;
                                }
                            }
                        }
                    }
                    PaymentMethodsData paymentMethodsData2 = enterParams.paymentData;
                    if (paymentMethodsData2 != null && (list = paymentMethodsData2.storedMethods) != null) {
                        Iterator<PaymentMethod> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            PaymentMethod next2 = it2.next();
                            if (o.LJ(next2.id, balance.getPaymentMethodId())) {
                                if (next2 != null) {
                                    c34k.element = true;
                                }
                            }
                        }
                    }
                    if (c34k.element) {
                        List<Object> paymentList = paymentState.getPaymentList();
                        ArrayList arrayList = new ArrayList(C32I.LJJL(paymentList, 10));
                        for (Object obj2 : paymentList) {
                            if (obj2 instanceof C28120B1w) {
                                C28120B1w c28120B1w2 = (C28120B1w) obj2;
                                if (o.LJ(c28120B1w2.LIZIZ.id, balance.getPaymentMethodId())) {
                                    if (balance.getBalanceCode() == BalanceCode.BALANCE_INSUFFICIENT) {
                                        bool2 = Boolean.FALSE;
                                    } else {
                                        Availability availability3 = c28120B1w2.LIZIZ.availability;
                                        if (availability3 != null) {
                                            bool2 = availability3.isAvailable;
                                        } else {
                                            bool2 = null;
                                        }
                                    }
                                    Availability availability4 = c28120B1w2.LIZIZ.availability;
                                    if (availability4 != null) {
                                        availability2 = Availability.LIZ(availability4, bool2);
                                    } else {
                                        availability2 = null;
                                    }
                                    c28120B1w = new C28120B1w(c28120B1w2.LIZ, PaymentMethod.LIZIZ(c28120B1w2.LIZIZ, null, balance.getBalance(), availability2, false, null, -3145729, 255), c28120B1w2.LIZJ, c28120B1w2.LIZLLL);
                                } else {
                                    PaymentMethod newPaymentMethod = c28120B1w2.LIZIZ;
                                    o.LJIIIZ(newPaymentMethod, "newPaymentMethod");
                                    c28120B1w = new C28120B1w(c28120B1w2.LIZ, newPaymentMethod, c28120B1w2.LIZJ, c28120B1w2.LIZLLL);
                                }
                                obj2 = c28120B1w;
                            } else if (obj2 instanceof B1J) {
                                B1J b1j = (B1J) obj2;
                                if (o.LJ(b1j.LIZ.id, balance.getPaymentMethodId())) {
                                    if (balance.getBalanceCode() == BalanceCode.BALANCE_INSUFFICIENT) {
                                        bool = Boolean.FALSE;
                                    } else {
                                        Availability availability5 = b1j.LIZ.availability;
                                        if (availability5 != null) {
                                            bool = availability5.isAvailable;
                                        } else {
                                            bool = null;
                                        }
                                    }
                                    Availability availability6 = b1j.LIZ.availability;
                                    if (availability6 != null) {
                                        availability = Availability.LIZ(availability6, bool);
                                    } else {
                                        availability = null;
                                    }
                                    obj2 = B1J.LIZ(b1j, PaymentMethod.LIZIZ(b1j.LIZ, null, balance.getBalance(), availability, false, null, -3145729, 255), 6);
                                } else {
                                    obj2 = B1J.LIZ(b1j, null, 7);
                                }
                            }
                            arrayList.add(obj2);
                        }
                        c68322mC.element = ORZ.LLJILJILJ(arrayList);
                    }
                }
            }
        }
        if (((C34K) aqS12S0500000_4.l1).element && (!((Collection) ((C68322mC) aqS12S0500000_4.l2).element).isEmpty())) {
            ((PaymentViewModel) aqS12S0500000_4.l3).setState(new AqS170S0100000_4((C68322mC) aqS12S0500000_4.l2, (C68322mC<List<Object>>) 23));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS12S0500000_4 aqS12S0500000_4, Object obj) {
        C248629pK setStateImmediate = (C248629pK) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        String str = ((CreatorCollectionDetailResponse) aqS12S0500000_4.l0).collectionDetail.collectionId;
        C72912tb c72912tb = new C72912tb(C76800UCe.LIZ);
        ManagementPagePaidCollectionInfo managementPagePaidCollectionInfo = (ManagementPagePaidCollectionInfo) aqS12S0500000_4.l1;
        String str2 = managementPagePaidCollectionInfo.name;
        String str3 = managementPagePaidCollectionInfo.description;
        String str4 = managementPagePaidCollectionInfo.priceInUsd;
        String str5 = managementPagePaidCollectionInfo.discountAmountInUsd;
        Price price = (Price) aqS12S0500000_4.l2;
        Price price2 = (Price) aqS12S0500000_4.l3;
        C248559pD c248559pD = (C248559pD) aqS12S0500000_4.l4;
        return C248629pK.LIZ(setStateImmediate, str, str2, str3, price, price2, false, c248559pD, str2, str3, str4, c248559pD, str5, false, false, null, null, null, c72912tb, null, null, null, 1962016);
    }

    public static final Object invoke$2(AqS12S0500000_4 aqS12S0500000_4, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String websiteSecure = ((CouponInfo) aqS12S0500000_4.l0).getWebsiteSecure();
        if (websiteSecure != null && websiteSecure.length() != 0) {
            actionGroup.LJI(R.string.dy8, new AqS12S1400000_4((User) aqS12S0500000_4.l1, (Aweme) aqS12S0500000_4.l2, (CouponInfo) aqS12S0500000_4.l3, (Context) aqS12S0500000_4.l4, websiteSecure, 0));
        }
        actionGroup.LJIIIIZZ(R.string.dy2, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS12S0500000_4 aqS12S0500000_4, Object it) {
        o.LJIIIZ(it, "it");
        C243839hb c243839hb = (C243839hb) aqS12S0500000_4.l0;
        C26335AVf.LJIIL(c243839hb.LJLIL, c243839hb.LJLILLLLZI, c243839hb.LJLJI, C243799hX.LJ(((C243829ha) aqS12S0500000_4.l1).LJLIL));
        int i = ((C243829ha) aqS12S0500000_4.l1).LJLIL;
        OP0 op0 = (OP0) aqS12S0500000_4.l2;
        Context context = (Context) aqS12S0500000_4.l3;
        if (op0 != null && context != null) {
            YFM.LIZIZ.startThirdSocialActivity(context, op0, i);
        }
        C243799hX.LJFF((User) aqS12S0500000_4.l4, ((C243829ha) aqS12S0500000_4.l1).LJLIL, (C243839hb) aqS12S0500000_4.l0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S0500000_4(Context context, C243809hY c243809hY, User user, C243829ha c243829ha, C243839hb c243839hb, int i) {
        super(1);
        this.$t = i;
        this.l0 = c243839hb;
        this.l1 = c243829ha;
        this.l2 = c243809hY;
        this.l3 = context;
        this.l4 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S0500000_4(CouponInfo couponInfo, User user, Aweme aweme, CouponInfo couponInfo2, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = couponInfo;
        this.l1 = user;
        this.l2 = aweme;
        this.l3 = couponInfo2;
        this.l4 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S0500000_4(CreatorCollectionDetailResponse creatorCollectionDetailResponse, ManagementPagePaidCollectionInfo managementPagePaidCollectionInfo, Price price, Price price2, C248559pD c248559pD, int i) {
        super(1);
        this.$t = i;
        this.l0 = creatorCollectionDetailResponse;
        this.l1 = managementPagePaidCollectionInfo;
        this.l2 = price;
        this.l3 = price2;
        this.l4 = c248559pD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS12S0500000_4(List list, List<Balance> list2, C34K c34k, C68322mC<List<Object>> c68322mC, PaymentViewModel paymentViewModel, EnterParams enterParams) {
        super(1);
        this.$t = enterParams;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = c34k;
        this.l3 = c68322mC;
        this.l4 = paymentViewModel;
    }
}
