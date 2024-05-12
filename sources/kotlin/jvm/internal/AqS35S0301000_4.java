package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.B1S;
import X.B1T;
import X.C19N;
import X.C27949Ay1;
import X.C28002Ays;
import X.C45804HyK;
import X.C61841OOv;
import X.C76800UCe;
import X.C78609UtB;
import X.C78685UuP;
import X.InterfaceC65784Pro;
import Y.IDObjectS328S0100000_4;
import Y.IDObjectS3S0101000_4;
import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.global.osp.module.payment.GlobalPaymentInfoVH;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.payment.USPaymentInfoVH;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class AqS35S0301000_4 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AqS35S0301000_4 aqS35S0301000_4) {
        String str;
        PaymentMethod paymentMethod;
        boolean z;
        String str2;
        String str3;
        boolean z2;
        String str4;
        String str5;
        BindInfo bindInfo = ((PaymentMethod) aqS35S0301000_4.l0).bindInfo;
        String str6 = null;
        if (bindInfo != null) {
            str = bindInfo.buttonText;
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            PaymentMethod paymentMethod2 = (PaymentMethod) aqS35S0301000_4.l0;
            PaymentInfo paymentInfo = ((GlobalPaymentInfoVH) aqS35S0301000_4.l1).LJLJI;
            if (paymentInfo != null) {
                paymentMethod = paymentInfo.paymentMethod;
            } else {
                paymentMethod = null;
            }
            if (C61841OOv.LIZIZ(paymentMethod2, paymentMethod)) {
                ((B1T) aqS35S0301000_4.l2).setPaymentInfo(((GlobalPaymentInfoVH) aqS35S0301000_4.l1).LJLJI);
            }
            if (C78609UtB.LJJJJIZL((PaymentMethod) aqS35S0301000_4.l0) || o.LJ(((PaymentMethod) aqS35S0301000_4.l0).id, "pm_pi_ccdc_all")) {
                if (C19N.LJ("ecom_osp_fix_ccdc_all", false)) {
                    ((GlobalPaymentInfoVH) aqS35S0301000_4.l1).L().Tw0(null, false);
                }
                Context context = ((B1T) aqS35S0301000_4.l2).getContext();
                o.LJIIIIZZ(context, "context");
                ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
                if (LJJIFFI != null) {
                    GlobalPaymentInfoVH globalPaymentInfoVH = (GlobalPaymentInfoVH) aqS35S0301000_4.l1;
                    PaymentMethod paymentMethod3 = (PaymentMethod) aqS35S0301000_4.l0;
                    int i = aqS35S0301000_4.i3;
                    OrderSubmitViewModel L = globalPaymentInfoVH.L();
                    FragmentManager supportFragmentManager = LJJIFFI.getSupportFragmentManager();
                    o.LJIIIIZZ(supportFragmentManager, "it.supportFragmentManager");
                    L.Fw0(supportFragmentManager, paymentMethod3, L.LL, "ADD_NEW_CARD");
                    List<PaymentMethod> list = ((C28002Ays) globalPaymentInfoVH.getItem()).LJ;
                    if (list != null) {
                        Iterator<PaymentMethod> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            PaymentMethod next = it.next();
                            if (o.LJ(next.id, paymentMethod3.id)) {
                                if (next != null) {
                                    z = true;
                                }
                            }
                        }
                    }
                    z = false;
                    String LJIIL = paymentMethod3.LJIIL();
                    boolean LJJJZ = C78685UuP.LJJJZ(paymentMethod3.extraInfo);
                    boolean LJJJZ2 = C78685UuP.LJJJZ(paymentMethod3.balance);
                    Availability availability = paymentMethod3.availability;
                    if (availability != null) {
                        str2 = availability.unavailableCode;
                        str3 = availability.statusCode;
                    } else {
                        str2 = null;
                        str3 = null;
                    }
                    BindInfo bindInfo2 = paymentMethod3.bindInfo;
                    if (bindInfo2 != null) {
                        str6 = bindInfo2.bindStatus;
                    }
                    C27949Ay1.LJJIJL(LJIIL, LJJJZ, i, z, LJJJZ2, str2, str3, str6, null, 3584);
                }
            } else if (!((CompoundButton) ((B1T) aqS35S0301000_4.l2).LIZ(R.id.iln)).isChecked()) {
                RecyclerView recyclerView = (RecyclerView) ((GlobalPaymentInfoVH) aqS35S0301000_4.l1).LJLIL.findViewById(R.id.hjn);
                o.LJIIIIZZ(recyclerView, "view.payments_area");
                IDObjectS328S0100000_4 iDObjectS328S0100000_4 = new IDObjectS328S0100000_4(recyclerView, 4);
                ArrayList arrayList = new ArrayList();
                Iterator it2 = iDObjectS328S0100000_4.iterator();
                while (true) {
                    IDObjectS3S0101000_4 iDObjectS3S0101000_4 = (IDObjectS3S0101000_4) it2;
                    if (!iDObjectS3S0101000_4.hasNext()) {
                        break;
                    }
                    View view = (View) iDObjectS3S0101000_4.next();
                    if ((view instanceof B1T) && view != null) {
                        arrayList.add(view);
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    B1T b1t = (B1T) it3.next();
                    if (((CompoundButton) b1t.LIZ(R.id.iln)).isChecked()) {
                        b1t.setChecked(false);
                    }
                }
                ((B1T) aqS35S0301000_4.l2).setChecked(true);
                OrderSubmitViewModel.Iv0(((GlobalPaymentInfoVH) aqS35S0301000_4.l1).L(), OrderSubmitViewModel.Wv0(((GlobalPaymentInfoVH) aqS35S0301000_4.l1).L(), (PaymentMethod) aqS35S0301000_4.l0, null, null, 6), true, null, 12);
                List<PaymentMethod> list2 = ((C28002Ays) ((GlobalPaymentInfoVH) aqS35S0301000_4.l1).getItem()).LJ;
                if (list2 != null) {
                    PaymentMethod paymentMethod4 = (PaymentMethod) aqS35S0301000_4.l0;
                    Iterator<PaymentMethod> it4 = list2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        PaymentMethod next2 = it4.next();
                        if (o.LJ(next2.id, paymentMethod4.id)) {
                            if (next2 != null) {
                                z2 = true;
                            }
                        }
                    }
                }
                z2 = false;
                String LJIIL2 = ((PaymentMethod) aqS35S0301000_4.l0).LJIIL();
                boolean LJJJZ3 = C78685UuP.LJJJZ(((PaymentMethod) aqS35S0301000_4.l0).extraInfo);
                int i2 = aqS35S0301000_4.i3;
                boolean LJJJZ4 = C78685UuP.LJJJZ(((PaymentMethod) aqS35S0301000_4.l0).balance);
                PaymentMethod paymentMethod5 = (PaymentMethod) aqS35S0301000_4.l0;
                Availability availability2 = paymentMethod5.availability;
                if (availability2 != null) {
                    str4 = availability2.unavailableCode;
                    str5 = availability2.statusCode;
                } else {
                    str4 = null;
                    str5 = null;
                }
                BindInfo bindInfo3 = paymentMethod5.bindInfo;
                if (bindInfo3 != null) {
                    str6 = bindInfo3.bindStatus;
                }
                C27949Ay1.LJJIJL(LJIIL2, LJJJZ3, i2, z2, LJJJZ4, str4, str5, str6, null, 3584);
            }
            ((GlobalPaymentInfoVH) aqS35S0301000_4.l1).LJLJJL = (B1T) aqS35S0301000_4.l2;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AqS35S0301000_4 aqS35S0301000_4) {
        String str;
        PaymentMethod paymentMethod;
        boolean z;
        String str2;
        String str3;
        boolean z2;
        String str4;
        String str5;
        BindInfo bindInfo = ((PaymentMethod) aqS35S0301000_4.l0).bindInfo;
        String str6 = null;
        if (bindInfo != null) {
            str = bindInfo.buttonText;
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            PaymentMethod paymentMethod2 = (PaymentMethod) aqS35S0301000_4.l0;
            PaymentInfo paymentInfo = ((USPaymentInfoVH) aqS35S0301000_4.l1).LJLJI;
            if (paymentInfo != null) {
                paymentMethod = paymentInfo.paymentMethod;
            } else {
                paymentMethod = null;
            }
            if (C61841OOv.LIZIZ(paymentMethod2, paymentMethod)) {
                ((B1S) aqS35S0301000_4.l2).setPaymentInfo(((USPaymentInfoVH) aqS35S0301000_4.l1).LJLJI);
            }
            if (o.LJ(((PaymentMethod) aqS35S0301000_4.l0).id, "pm_pi_ccdc_all")) {
                if (C19N.LJ("ecom_osp_fix_ccdc_all", false)) {
                    ((USPaymentInfoVH) aqS35S0301000_4.l1).L().Tw0(null, false);
                }
                Context context = ((B1S) aqS35S0301000_4.l2).getContext();
                o.LJIIIIZZ(context, "context");
                ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
                if (LJJIFFI != null) {
                    USPaymentInfoVH uSPaymentInfoVH = (USPaymentInfoVH) aqS35S0301000_4.l1;
                    PaymentMethod paymentMethod3 = (PaymentMethod) aqS35S0301000_4.l0;
                    int i = aqS35S0301000_4.i3;
                    OrderSubmitViewModel L = uSPaymentInfoVH.L();
                    FragmentManager supportFragmentManager = LJJIFFI.getSupportFragmentManager();
                    o.LJIIIIZZ(supportFragmentManager, "it.supportFragmentManager");
                    L.Fw0(supportFragmentManager, paymentMethod3, L.LL, "ADD_NEW_CARD");
                    List<PaymentMethod> list = ((C28002Ays) uSPaymentInfoVH.getItem()).LJ;
                    if (list != null) {
                        Iterator<PaymentMethod> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            PaymentMethod next = it.next();
                            if (o.LJ(next.id, paymentMethod3.id)) {
                                if (next != null) {
                                    z2 = true;
                                }
                            }
                        }
                    }
                    z2 = false;
                    String LJIIL = paymentMethod3.LJIIL();
                    boolean LJJJZ = C78685UuP.LJJJZ(paymentMethod3.extraInfo);
                    boolean LJJJZ2 = C78685UuP.LJJJZ(paymentMethod3.balance);
                    Availability availability = paymentMethod3.availability;
                    if (availability != null) {
                        str4 = availability.unavailableCode;
                        str5 = availability.statusCode;
                    } else {
                        str4 = null;
                        str5 = null;
                    }
                    BindInfo bindInfo2 = paymentMethod3.bindInfo;
                    if (bindInfo2 != null) {
                        str6 = bindInfo2.bindStatus;
                    }
                    C27949Ay1.LJJIJL(LJIIL, LJJJZ, i, z2, LJJJZ2, str4, str5, str6, Boolean.valueOf(C78685UuP.LJJJZ(paymentMethod3.LJIIIIZZ())), 1536);
                }
            } else if (!((CompoundButton) ((B1S) aqS35S0301000_4.l2).LIZ(R.id.iln)).isChecked()) {
                RecyclerView recyclerView = (RecyclerView) ((USPaymentInfoVH) aqS35S0301000_4.l1).LJLIL.findViewById(R.id.hjn);
                o.LJIIIIZZ(recyclerView, "view.payments_area");
                IDObjectS328S0100000_4 iDObjectS328S0100000_4 = new IDObjectS328S0100000_4(recyclerView, 3);
                ArrayList arrayList = new ArrayList();
                Iterator it2 = iDObjectS328S0100000_4.iterator();
                while (true) {
                    IDObjectS3S0101000_4 iDObjectS3S0101000_4 = (IDObjectS3S0101000_4) it2;
                    if (!iDObjectS3S0101000_4.hasNext()) {
                        break;
                    }
                    View view = (View) iDObjectS3S0101000_4.next();
                    if ((view instanceof B1S) && view != null) {
                        arrayList.add(view);
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    B1S b1s = (B1S) it3.next();
                    if (((CompoundButton) b1s.LIZ(R.id.iln)).isChecked()) {
                        b1s.setChecked(false);
                    }
                }
                ((B1S) aqS35S0301000_4.l2).setChecked(true);
                OrderSubmitViewModel.Iv0(((USPaymentInfoVH) aqS35S0301000_4.l1).L(), OrderSubmitViewModel.Wv0(((USPaymentInfoVH) aqS35S0301000_4.l1).L(), (PaymentMethod) aqS35S0301000_4.l0, null, null, 6), true, null, 12);
                List<PaymentMethod> list2 = ((C28002Ays) ((USPaymentInfoVH) aqS35S0301000_4.l1).getItem()).LJ;
                if (list2 != null) {
                    PaymentMethod paymentMethod4 = (PaymentMethod) aqS35S0301000_4.l0;
                    Iterator<PaymentMethod> it4 = list2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        PaymentMethod next2 = it4.next();
                        if (o.LJ(next2.id, paymentMethod4.id)) {
                            if (next2 != null) {
                                z = true;
                            }
                        }
                    }
                }
                z = false;
                String LJIIL2 = ((PaymentMethod) aqS35S0301000_4.l0).LJIIL();
                boolean LJJJZ3 = C78685UuP.LJJJZ(((PaymentMethod) aqS35S0301000_4.l0).extraInfo);
                int i2 = aqS35S0301000_4.i3;
                boolean LJJJZ4 = C78685UuP.LJJJZ(((PaymentMethod) aqS35S0301000_4.l0).balance);
                PaymentMethod paymentMethod5 = (PaymentMethod) aqS35S0301000_4.l0;
                Availability availability2 = paymentMethod5.availability;
                if (availability2 != null) {
                    str2 = availability2.unavailableCode;
                    str3 = availability2.statusCode;
                } else {
                    str2 = null;
                    str3 = null;
                }
                BindInfo bindInfo3 = paymentMethod5.bindInfo;
                if (bindInfo3 != null) {
                    str6 = bindInfo3.bindStatus;
                }
                C27949Ay1.LJJIJL(LJIIL2, LJJJZ3, i2, z, LJJJZ4, str2, str3, str6, Boolean.valueOf(C78685UuP.LJJJZ(paymentMethod5.LJIIIIZZ())), 1536);
            }
            ((USPaymentInfoVH) aqS35S0301000_4.l1).LJLJJL = (B1S) aqS35S0301000_4.l2;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS35S0301000_4(PaymentMethod paymentMethod, GlobalPaymentInfoVH globalPaymentInfoVH, B1T b1t, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = paymentMethod;
        this.l1 = globalPaymentInfoVH;
        this.l2 = b1t;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS35S0301000_4(PaymentMethod paymentMethod, USPaymentInfoVH uSPaymentInfoVH, B1S b1s, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = paymentMethod;
        this.l1 = uSPaymentInfoVH;
        this.l2 = b1s;
        this.i3 = i;
    }
}
