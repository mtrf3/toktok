package Y;

import X.ActivityC45651qj;
import X.B0B;
import X.B1K;
import X.C141335gf;
import X.C16880lQ;
import X.C25574A1y;
import X.C28033AzN;
import X.C28064Azs;
import X.C28068Azw;
import X.C32I;
import X.C3C5;
import X.C45804HyK;
import X.C61878OQg;
import X.C68902n8;
import X.C76542zS;
import X.C76800UCe;
import X.C78688UuS;
import X.EnumC28094B0w;
import X.InterfaceC64592gB;
import X.InterfaceC73573Su9;
import X.ORZ;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentListRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentListResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPrice;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.GooglePayProcess;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.IDqS183S0200000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class AfS3S1200100_4 implements InterfaceC64592gB {
    public final int $t;
    public long j3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS3S1200100_4 afS3S1200100_4, Object obj) {
        String str;
        PaymentMethodsData paymentMethodsData;
        List<PaymentPrice> list;
        Summary summary;
        List<PaymentMethod> list2;
        FragmentManager supportFragmentManager;
        PaymentMethodsData paymentMethodsData2;
        Response response = (Response) obj;
        ((C28064Azs) afS3S1200100_4.l1).LJIIIZ = (PaymentListResponseData) response.data;
        long currentTimeMillis = System.currentTimeMillis() - afS3S1200100_4.j3;
        Address address = null;
        if (response.isCodeOK()) {
            C28064Azs c28064Azs = (C28064Azs) afS3S1200100_4.l1;
            if (c28064Azs.LJIIIZ != null) {
                PaymentCacheHelper.LJI(C45804HyK.LJJIFFI(c28064Azs.LIZ));
                if (C28033AzN.LIZ()) {
                    GooglePayProcess.LIZJ(((C28064Azs) afS3S1200100_4.l1).LIZ);
                    PaymentListResponseData paymentListResponseData = ((C28064Azs) afS3S1200100_4.l1).LJIIIZ;
                    if (paymentListResponseData != null) {
                        paymentMethodsData2 = paymentListResponseData.getPaymentMethodsData();
                    } else {
                        paymentMethodsData2 = null;
                    }
                    GooglePayProcess.LJI(GooglePayProcess.LIZIZ(paymentMethodsData2));
                }
                PaymentHalfFragment paymentHalfFragment = new PaymentHalfFragment();
                C28064Azs c28064Azs2 = (C28064Azs) afS3S1200100_4.l1;
                paymentHalfFragment.LJLJJL = new C68902n8(c28064Azs2, (PaymentListRequest) afS3S1200100_4.l2, null);
                int ordinal = EnumC28094B0w.PAY_NOW.ordinal();
                PaymentListResponseData paymentListResponseData2 = c28064Azs2.LJIIIZ;
                if (paymentListResponseData2 != null) {
                    paymentMethodsData = paymentListResponseData2.getPaymentMethodsData();
                } else {
                    paymentMethodsData = null;
                }
                String str2 = c28064Azs2.LJ;
                PaymentListResponseData paymentListResponseData3 = c28064Azs2.LJIIIZ;
                if (paymentListResponseData3 != null) {
                    list = paymentListResponseData3.getPaymentPrice();
                } else {
                    list = null;
                }
                PaymentListResponseData paymentListResponseData4 = c28064Azs2.LJIIIZ;
                if (paymentListResponseData4 != null) {
                    summary = paymentListResponseData4.getDefaultSummary();
                } else {
                    summary = null;
                }
                PaymentListResponseData paymentListResponseData5 = c28064Azs2.LJIIIZ;
                if (paymentListResponseData5 != null) {
                    address = paymentListResponseData5.getShippingAddress();
                }
                paymentHalfFragment.LJLIL = new EnterParams(null, null, Integer.valueOf(ordinal), paymentMethodsData, str2, false, null, c28064Azs2.LJII, list, summary, address, c28064Azs2.LJI, c28064Azs2.LJFF, c28064Azs2.LIZLLL, Long.valueOf(currentTimeMillis), null, null, 98400, null);
                B1K b1k = new B1K(paymentHalfFragment.LJLIL);
                EnterParams enterParams = paymentHalfFragment.LJLIL;
                o.LJIIIZ(enterParams, "enterParams");
                PaymentMethodsData paymentMethodsData3 = enterParams.paymentData;
                if (paymentMethodsData3 != null) {
                    list2 = paymentMethodsData3.LIZIZ();
                } else {
                    list2 = C61878OQg.INSTANCE;
                }
                ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
                Iterator<PaymentMethod> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().LJIIL());
                }
                C76542zS.LIZIZ("tiktokec_first_refresh_page", b1k.LIZ, new AqS58S1100000_4(ORZ.LLD(arrayList, ",", null, null, B0B.LJLIL, 30), (String) list2, (List<PaymentMethod>) 0));
                paymentHalfFragment.LJLILLLLZI = new IDqS183S0200000_4(c28064Azs2, paymentHalfFragment, 0);
                paymentHalfFragment.LJLJI = new AqS170S0100000_4(c28064Azs2, 16);
                ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(((C28064Azs) afS3S1200100_4.l1).LIZ);
                if (LJJIFFI == null || (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) == null) {
                    return;
                }
                paymentHalfFragment.show(supportFragmentManager, "payment_fragment");
                return;
            }
        }
        ((C28064Azs) afS3S1200100_4.l1).LIZIZ(response.message);
        String str3 = afS3S1200100_4.s0;
        String str4 = response.message;
        String valueOf = String.valueOf(response.code);
        List<String> list3 = ((C28064Azs) afS3S1200100_4.l1).LIZJ;
        if (list3 != null) {
            str = (String) ORZ.LJLLJ(list3);
        } else {
            str = null;
        }
        C28068Azw.LIZ(str3, false, str4, valueOf, 0L, currentTimeMillis, null, null, null, str);
    }

    public static final void accept$1(AfS3S1200100_4 afS3S1200100_4, Object obj) {
        ((InterfaceC73573Su9) afS3S1200100_4.l1).onNext(obj);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C25574A1y.LJ(currentTimeMillis - afS3S1200100_4.j3, (Map) afS3S1200100_4.l2, afS3S1200100_4.s0, 0, "");
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static final void accept$2(AfS3S1200100_4 afS3S1200100_4, Object obj) {
        Throwable it = (Throwable) obj;
        ((InterfaceC73573Su9) afS3S1200100_4.l1).onError(it);
        long currentTimeMillis = System.currentTimeMillis();
        String str = afS3S1200100_4.s0;
        long j = currentTimeMillis - afS3S1200100_4.j3;
        o.LJIIIIZZ(it, "it");
        Map map = (Map) afS3S1200100_4.l2;
        try {
            String LJLLJ = C16880lQ.LJLLJ(it.getClass());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("exception_name", LJLLJ);
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            C25574A1y.LJ(j, linkedHashMap, str, C78688UuS.LJJIIZ(it), C78688UuS.LJJIJL(it));
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public AfS3S1200100_4(Object obj, long j, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.j3 = j;
        this.s0 = str;
        this.l2 = obj2;
    }
}
