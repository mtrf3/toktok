package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.C27089Ak9;
import X.C28103B1f;
import X.C3C5;
import X.C61878OQg;
import X.C78886Uxe;
import X.C85990Xow;
import X.SAN;
import X.XKQ;
import X.XKX;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS42S1000000_4;
import kotlin.jvm.internal.AqS72S1100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaymentCacheHelper {
    public static LifecycleOwner LIZ;
    public static Region LIZLLL;
    public static XKQ LJ;
    public static PaymentMethod LJFF;
    public static final HashMap<String, List<PaymentElement>> LIZIZ = new HashMap<>();
    public static final LinkedList<PaymentInfo> LIZJ = new LinkedList<>();
    public static final ReentrantLock LJI = new ReentrantLock(true);
    public static final ReentrantLock LJII = new ReentrantLock(true);
    public static final PaymentCacheHelper$lifecycleObserver$1 LJIIIIZZ = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper$lifecycleObserver$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public final void onDestroy() {
            PaymentCacheHelper.LIZJ();
        }
    };

    public static void LIZJ() {
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner = LIZ;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(LJIIIIZZ);
        }
        LIZ = null;
        LIZIZ.clear();
        XKQ xkq = LJ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        LIZJ.clear();
        LJ = null;
        LIZLLL = null;
        LJFF = null;
    }

    public static List LJ() {
        Object LIZLLL2 = C78886Uxe.LIZLLL(LJII, C28103B1f.LJLIL);
        if (C3C5.m12isFailureimpl(LIZLLL2)) {
            LIZLLL2 = null;
        }
        List list = (List) LIZLLL2;
        if (list == null) {
            return C61878OQg.INSTANCE;
        }
        return list;
    }

    public static Region LJFF() {
        String str;
        Region region = LIZLLL;
        if (region == null) {
            String LIZ2 = C85990Xow.LIZ();
            if (LIZ2 != null) {
                str = LIZ2.toUpperCase(Locale.ROOT);
                o.LJIIIIZZ(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            } else {
                str = "";
            }
            region = new Region(null, null, str, null, null, null, 59, null);
        }
        return region;
    }

    public static List LIZLLL() {
        String str;
        List LJ2 = LJ();
        ArrayList arrayList = new ArrayList();
        for (Object obj : LJ2) {
            PaymentMethod paymentMethod = ((PaymentInfo) obj).paymentMethod;
            if (paymentMethod != null) {
                str = paymentMethod.id;
            } else {
                str = null;
            }
            if (!o.LJ(str, "pm_pi_atmcard_all")) {
                SAN.LIZ.getClass();
                if (SAN.LJ(str)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public static void LIZIZ(PaymentInfo paymentInfo) {
        C78886Uxe.LIZLLL(LJII, new AqS154S0100000_4(paymentInfo, 195));
    }

    public static void LJI(LifecycleOwner lifecycleOwner) {
        LifecycleCoroutineScope lifecycleScope;
        Lifecycle lifecycle;
        if (o.LJ(LIZ, lifecycleOwner)) {
            return;
        }
        LIZJ();
        LIZ = lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(LJIIIIZZ);
        }
        LifecycleOwner lifecycleOwner2 = LIZ;
        XKQ xkq = null;
        if (lifecycleOwner2 != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner2)) != null) {
            xkq = XKX.LIZLLL(lifecycleScope, null, null, new C27089Ak9(null), 3);
        }
        LJ = xkq;
    }

    public static void LJII(String str) {
        if (str == null) {
            return;
        }
        C78886Uxe.LIZLLL(LJII, new AqS42S1000000_4(str, 2));
    }

    public static void LIZ(String str, List list) {
        if (LIZ == null || list == null) {
            return;
        }
        C78886Uxe.LIZLLL(LJI, new AqS72S1100000_4(list, (List<PaymentElement>) str, (String) 0));
    }
}
