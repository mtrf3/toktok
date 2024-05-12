package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.B1R;
import X.C119774mz;
import X.C26799AfT;
import X.C27162AlK;
import X.C27949Ay1;
import X.C28002Ays;
import X.C45804HyK;
import X.C61841OOv;
import X.C76800UCe;
import X.C78609UtB;
import X.C78685UuP;
import X.C78977Uz7;
import X.InterfaceC65784Pro;
import Y.IDObjectS328S0100000_4;
import Y.IDObjectS3S0101000_4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoVH2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpReviewViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class AqS8S0401000_4 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS8S0401000_4 aqS8S0401000_4) {
        int width = (((C119774mz) aqS8S0401000_4.l0).getWidth() - (C27162AlK.LJIIIZ * 3)) / 4;
        C119774mz c119774mz = (C119774mz) aqS8S0401000_4.l0;
        List list = (List) aqS8S0401000_4.l1;
        C78977Uz7.LJJIIJZLJL(c119774mz, list.subList(0, Math.min(4, list.size())), new AqS94S0101000_4((C119774mz) aqS8S0401000_4.l0, width, 6), new C26799AfT((PdpReviewViewHolder) aqS8S0401000_4.l2, aqS8S0401000_4.i4, (ReviewItemStruct) aqS8S0401000_4.l3, (C119774mz) aqS8S0401000_4.l0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS8S0401000_4 aqS8S0401000_4) {
        String str;
        PaymentMethod paymentMethod;
        boolean z;
        String str2;
        String str3;
        boolean z2;
        String str4;
        String str5;
        BindInfo bindInfo = ((PaymentMethod) aqS8S0401000_4.l0).bindInfo;
        String str6 = null;
        if (bindInfo != null) {
            str = bindInfo.buttonText;
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            PaymentMethod paymentMethod2 = (PaymentMethod) aqS8S0401000_4.l0;
            PaymentInfo paymentInfo = ((PaymentInfoVH2) aqS8S0401000_4.l1).LJLJI;
            if (paymentInfo != null) {
                paymentMethod = paymentInfo.paymentMethod;
            } else {
                paymentMethod = null;
            }
            if (C61841OOv.LIZIZ(paymentMethod2, paymentMethod)) {
                ((B1R) aqS8S0401000_4.l2).setPaymentInfo(((PaymentInfoVH2) aqS8S0401000_4.l1).LJLJI);
            }
            if (o.LJ(((PaymentMethod) aqS8S0401000_4.l0).id, "pm_pi_ccdc_all") || C78609UtB.LJJJJIZL((PaymentMethod) aqS8S0401000_4.l0)) {
                OrderSubmitViewModel M = ((PaymentInfoVH2) aqS8S0401000_4.l1).M();
                Context context = ((B1R) aqS8S0401000_4.l2).getContext();
                o.LJIIIIZZ(context, "context");
                ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
                o.LJI(LJJIFFI);
                FragmentManager supportFragmentManager = LJJIFFI.getSupportFragmentManager();
                o.LJIIIIZZ(supportFragmentManager, "context.fragmentActivity)!!.supportFragmentManager");
                PaymentMethod paymentMethod3 = (PaymentMethod) aqS8S0401000_4.l0;
                o.LJIIIIZZ(paymentMethod3, "paymentMethod");
                M.Fw0(supportFragmentManager, paymentMethod3, M.LL, "ADD_NEW_CARD");
                List<PaymentMethod> list = ((C28002Ays) aqS8S0401000_4.l3).LJ;
                if (list != null) {
                    PaymentMethod paymentMethod4 = (PaymentMethod) aqS8S0401000_4.l0;
                    Iterator<PaymentMethod> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        PaymentMethod next = it.next();
                        if (o.LJ(next.id, paymentMethod4.id)) {
                            if (next != null) {
                                z = true;
                            }
                        }
                    }
                }
                z = false;
                String LJIIL = ((PaymentMethod) aqS8S0401000_4.l0).LJIIL();
                boolean LJJJZ = C78685UuP.LJJJZ(((PaymentMethod) aqS8S0401000_4.l0).extraInfo);
                int i = aqS8S0401000_4.i4;
                boolean LJJJZ2 = C78685UuP.LJJJZ(((PaymentMethod) aqS8S0401000_4.l0).balance);
                PaymentMethod paymentMethod5 = (PaymentMethod) aqS8S0401000_4.l0;
                Availability availability = paymentMethod5.availability;
                if (availability != null) {
                    str2 = availability.unavailableCode;
                    str3 = availability.statusCode;
                } else {
                    str2 = null;
                    str3 = null;
                }
                BindInfo bindInfo2 = paymentMethod5.bindInfo;
                if (bindInfo2 != null) {
                    str6 = bindInfo2.bindStatus;
                }
                C27949Ay1.LJJIJL(LJIIL, LJJJZ, i, z, LJJJZ2, str2, str3, str6, Boolean.valueOf(C78685UuP.LJJJZ(paymentMethod5.LJIIIIZZ())), 1536);
            } else if (!((B1R) aqS8S0401000_4.l2).LJIIIZ()) {
                ViewGroup viewGroup = (ViewGroup) ((PaymentInfoVH2) aqS8S0401000_4.l1).LJLIL.findViewById(R.id.g14);
                o.LJIIIIZZ(viewGroup, "view.llPayments");
                IDObjectS328S0100000_4 iDObjectS328S0100000_4 = new IDObjectS328S0100000_4(viewGroup, 7);
                ArrayList arrayList = new ArrayList();
                Iterator it2 = iDObjectS328S0100000_4.iterator();
                while (true) {
                    IDObjectS3S0101000_4 iDObjectS3S0101000_4 = (IDObjectS3S0101000_4) it2;
                    if (!iDObjectS3S0101000_4.hasNext()) {
                        break;
                    }
                    View view = (View) iDObjectS3S0101000_4.next();
                    if ((view instanceof B1R) && view != null) {
                        arrayList.add(view);
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    B1R b1r = (B1R) it3.next();
                    if (b1r.LJIIIZ()) {
                        b1r.setChecked(false);
                        b1r.LIZIZ();
                        b1r.LIZJ();
                    }
                }
                ((B1R) aqS8S0401000_4.l2).setChecked(true);
                OrderSubmitViewModel M2 = ((PaymentInfoVH2) aqS8S0401000_4.l1).M();
                PaymentMethod paymentMethod6 = (PaymentMethod) aqS8S0401000_4.l0;
                o.LJIIIIZZ(paymentMethod6, "paymentMethod");
                OrderSubmitViewModel.Iv0(((PaymentInfoVH2) aqS8S0401000_4.l1).M(), OrderSubmitViewModel.Wv0(M2, paymentMethod6, null, null, 6), true, null, 12);
                List<PaymentMethod> list2 = ((C28002Ays) aqS8S0401000_4.l3).LJ;
                if (list2 != null) {
                    PaymentMethod paymentMethod7 = (PaymentMethod) aqS8S0401000_4.l0;
                    Iterator<PaymentMethod> it4 = list2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        PaymentMethod next2 = it4.next();
                        if (o.LJ(next2.id, paymentMethod7.id)) {
                            if (next2 != null) {
                                z2 = true;
                            }
                        }
                    }
                }
                z2 = false;
                String LJIIL2 = ((PaymentMethod) aqS8S0401000_4.l0).LJIIL();
                boolean LJJJZ3 = C78685UuP.LJJJZ(((PaymentMethod) aqS8S0401000_4.l0).extraInfo);
                int i2 = aqS8S0401000_4.i4;
                boolean LJJJZ4 = C78685UuP.LJJJZ(((PaymentMethod) aqS8S0401000_4.l0).balance);
                PaymentMethod paymentMethod8 = (PaymentMethod) aqS8S0401000_4.l0;
                Availability availability2 = paymentMethod8.availability;
                if (availability2 != null) {
                    str4 = availability2.unavailableCode;
                    str5 = availability2.statusCode;
                } else {
                    str4 = null;
                    str5 = null;
                }
                BindInfo bindInfo3 = paymentMethod8.bindInfo;
                if (bindInfo3 != null) {
                    str6 = bindInfo3.bindStatus;
                }
                C27949Ay1.LJJIJL(LJIIL2, LJJJZ3, i2, z2, LJJJZ4, str4, str5, str6, Boolean.valueOf(C78685UuP.LJJJZ(paymentMethod8.LJIIIIZZ())), 1536);
            }
            ((PaymentInfoVH2) aqS8S0401000_4.l1).LJLJJL = (B1R) aqS8S0401000_4.l2;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS8S0401000_4(C119774mz c119774mz, C119774mz c119774mz2, List<ReviewMedia> list, PdpReviewViewHolder pdpReviewViewHolder, int i, ReviewItemStruct reviewItemStruct) {
        super(0);
        this.$t = reviewItemStruct;
        this.l0 = c119774mz;
        this.l1 = c119774mz2;
        this.l2 = list;
        this.i4 = pdpReviewViewHolder;
        this.l3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS8S0401000_4(PaymentMethod paymentMethod, PaymentInfoVH2 paymentInfoVH2, B1R b1r, C28002Ays c28002Ays, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = paymentMethod;
        this.l1 = paymentInfoVH2;
        this.l2 = b1r;
        this.l3 = c28002Ays;
        this.i4 = i;
    }
}
