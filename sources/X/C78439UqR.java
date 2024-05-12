package X;

import android.os.Build;
import com.bytedance.globalpayment.iap.model.AbsIapOneTimePurchaseOffer;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.AbsIapSubscriptionOffer;
import com.bytedance.globalpayment.iap.model.IapChannelUserData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/* renamed from: X.UqR, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78439UqR extends AbsIapProduct {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<com.bytedance.globalpayment.iap.model.AbsIapSubscriptionOffer>] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    public C78439UqR(C0HQ c0hq) {
        ?? arrayList;
        this.mProductId = c0hq.LIZJ;
        String str = c0hq.LIZLLL;
        this.mProductType = str;
        if (str.equals("inapp")) {
            String str2 = c0hq.LIZ().LIZ;
            Long valueOf = Long.valueOf(c0hq.LIZ().LIZIZ);
            this.mOneTimePurchaseOffer = new AbsIapOneTimePurchaseOffer(str2, valueOf.longValue(), c0hq.LIZ().LIZJ);
        } else {
            List list = c0hq.LJIIIIZZ;
            if (list == null || list.size() == 0) {
                this.mSubscriptionOffer = null;
            }
            List<C0HO> list2 = c0hq.LJIIIIZZ;
            if (Build.VERSION.SDK_INT >= 24) {
                arrayList = (List) list2.stream().map(new Function() { // from class: X.UqT
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        C0HO c0ho = (C0HO) obj;
                        return new AbsIapSubscriptionOffer(c0ho.LIZJ, c0ho.LIZ, c0ho.LIZIZ, (List) c0ho.LIZLLL.LIZ.stream().map(new Function() { // from class: X.UqU
                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                C0HM c0hm = (C0HM) obj2;
                                return new AbsIapSubscriptionOffer.AbsIapSubscriptionPricing(c0hm.LIZ, c0hm.LIZIZ, c0hm.LIZJ, c0hm.LIZLLL, c0hm.LJ, c0hm.LJFF);
                            }
                        }).collect(Collectors.toList()), c0ho.LJ);
                    }
                }).collect(Collectors.toList());
            } else {
                arrayList = new ArrayList();
                for (C0HO c0ho : list2) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = ((ArrayList) c0ho.LIZLLL.LIZ).iterator();
                    while (it.hasNext()) {
                        C0HM c0hm = (C0HM) it.next();
                        arrayList2.add(new AbsIapSubscriptionOffer.AbsIapSubscriptionPricing(c0hm.LIZ, c0hm.LIZIZ, c0hm.LIZJ, c0hm.LIZLLL, c0hm.LJ, c0hm.LJFF));
                    }
                    arrayList.add(new AbsIapSubscriptionOffer(c0ho.LIZJ, c0ho.LIZ, c0ho.LIZIZ, arrayList2, c0ho.LJ));
                }
            }
            this.mSubscriptionOffer = arrayList;
        }
        this.mTitle = c0hq.LJ;
        this.mDescription = c0hq.LJFF;
        this.mChannelUserData = new IapChannelUserData(IapPaymentMethod.GOOGLE, "", "");
    }
}
