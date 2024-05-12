package com.ss.android.ugc.aweme.ecommerce.global.osp.vm;

import X.C1A7;
import X.C26560Abc;
import X.C26566Abi;
import X.C26577Abt;
import X.C26840Ag8;
import X.C27855AwV;
import X.C27963AyF;
import X.C28002Ays;
import X.C61878OQg;
import X.C79081V1x;
import X.EF7;
import X.EnumC26562Abe;
import X.EnumC28020AzA;
import X.SFS;
import X.V2B;
import android.content.Context;
import android.text.SpannableStringBuilder;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Photos;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.GooglePayProcess;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.global.osp.dto.UserTrustModule;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class GlobalOrderSubmitViewModel extends OrderSubmitViewModel {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r25v0, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.ss.android.ugc.aweme.ecommerce.global.osp.vm.GlobalOrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel
    public final List<Object> Cw0(C27963AyF c27963AyF) {
        ?? r1;
        List<PaymentMethod> list;
        List<PaymentMethod> list2;
        List<String> list3;
        String str;
        PaymentMethodInfo paymentMethodInfo;
        Photos photos;
        UserTrustModule userTrustModule;
        C26577Abt LJJIZ;
        ArrayList arrayList = new ArrayList();
        for (String str2 : c27963AyF.LIZ.getLayout()) {
            EF7.LIZIZ();
            List<PaymentElement> list4 = null;
            switch (str2.hashCode()) {
                case -2037733451:
                    if (str2.equals("order_summary") && (!c27963AyF.LIZLLL.isEmpty())) {
                        arrayList.add(u.LJJJ(c27963AyF.LIZ, null));
                        break;
                    }
                    break;
                case -1847017863:
                    if (str2.equals("payment_methods")) {
                        if (!c27963AyF.LIZLLL.isEmpty()) {
                            CopyOnWriteArrayList<PaymentMethod> copyOnWriteArrayList = c27963AyF.LJII;
                            if (copyOnWriteArrayList != null) {
                                r1 = new ArrayList();
                                Iterator<PaymentMethod> it = copyOnWriteArrayList.iterator();
                                while (it.hasNext()) {
                                    PaymentMethod next = it.next();
                                    if (!GooglePayProcess.LJ(next) || GooglePayProcess.LIZ()) {
                                        r1.add(next);
                                    }
                                }
                            } else {
                                r1 = C61878OQg.INSTANCE;
                            }
                            Boolean bool = this.LLFFF;
                            PaymentInfo paymentInfo = this.LL;
                            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList((Collection) r1);
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
                                str = paymentMethods4.paymentMethodsText;
                            } else {
                                str = null;
                            }
                            PaymentInfo paymentInfo2 = this.LL;
                            if (paymentInfo2 != null && (paymentMethodInfo = paymentInfo2.paymentMethodInfo) != null) {
                                list4 = paymentMethodInfo.getPaymentElements();
                            }
                            arrayList.add(new C28002Ays(bool, paymentInfo, copyOnWriteArrayList2, list, list2, list3, str, C1A7.LJFF(list4)));
                        }
                        arrayList.add(new C26840Ag8(0.0f, true, R.attr.ds, 4));
                        break;
                    } else {
                        break;
                    }
                    break;
                case -1286000007:
                    if (str2.equals("privacy_policy_statement") && (!c27963AyF.LIZLLL.isEmpty()) && (userTrustModule = c27963AyF.LIZ.getUserTrustModule()) != null && (LJJIZ = SFS.LJJIZ(userTrustModule)) != null) {
                        arrayList.add(LJJIZ);
                        break;
                    }
                    break;
                case -361387049:
                    if (str2.equals("platform_promotion") && (!c27963AyF.LIZLLL.isEmpty()) && c27963AyF.LIZ.getPlatformPromotion() != null) {
                        arrayList.add(V2B.LJIJJ(c27963AyF.LIZ));
                        arrayList.add(new C26840Ag8(0.0f, true, R.attr.ds, 4));
                        break;
                    }
                    break;
                case 699961955:
                    if (str2.equals("shipping_address") && !C27855AwV.LIZ(c27963AyF.LIZ.getNewShopOrders())) {
                        C26566Abi LJJJ = C79081V1x.LJJJ(c27963AyF.LIZ, c27963AyF.LIZIZ, EnumC28020AzA.SINGLE_LINE);
                        if (c27963AyF.LIZLLL.isEmpty() && (!c27963AyF.LIZJ.isEmpty())) {
                            LJJJ.LJIIL = true;
                        }
                        setState(new AqS170S0100000_4(LJJJ, 353));
                        arrayList.add(LJJJ);
                        arrayList.add(new C26840Ag8(0.0f, true, R.attr.ds, 4));
                        break;
                    }
                    break;
                case 1463248431:
                    if (str2.equals("shop_orders_new")) {
                        rw0(c27963AyF.LJ, arrayList, !c27963AyF.LIZLLL.isEmpty(), c27963AyF.LIZJ);
                        OrderSubmitViewModel.nw0(arrayList, c27963AyF.LIZLLL, c27963AyF.LIZIZ);
                        break;
                    } else {
                        break;
                    }
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel
    public final SpannableStringBuilder Rv0(Context ctx, C26566Abi address) {
        o.LJIIIZ(ctx, "ctx");
        o.LJIIIZ(address, "address");
        return C26560Abc.LIZ(ctx, address, EnumC26562Abe.NO_ICON);
    }
}
