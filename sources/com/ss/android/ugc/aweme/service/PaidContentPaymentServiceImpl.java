package com.ss.android.ugc.aweme.service;

import X.A3T;
import X.A6H;
import X.A6I;
import X.A6P;
import X.A8I;
import X.C221108m2;
import X.C25641A4n;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C73440Ss0;
import X.C73893SzJ;
import X.C73969T1h;
import X.C77770Ufe;
import X.EnumC25627A3z;
import X.T16;
import Y.AfS19S1100000_4;
import Y.AfS53S0200000_4;
import Y.AfS56S0100000_4;
import Y.IDhS97S0100000_4;
import android.app.Activity;
import android.content.Context;
import com.bytedance.android.live.wallet.model.IapProductBuyParam;
import com.bytedance.android.live.wallet.model.IapProductBuyResult;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidContentPaymentServiceImpl implements IPaidContentPaymentService {
    public final C73893SzJ<IapProductBuyResult> LIZ = new C73893SzJ<>();
    public final C77770Ufe LIZIZ = new C77770Ufe(new A6P(), new A6H(this));
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 790));
    public final C73893SzJ<A6I> LIZLLL = new C73893SzJ<>();

    public static IPaidContentPaymentService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IPaidContentPaymentService.class, false);
        if (LIZ != null) {
            return (IPaidContentPaymentService) LIZ;
        }
        if (C58096Mr6.b5 == null) {
            synchronized (IPaidContentPaymentService.class) {
                if (C58096Mr6.b5 == null) {
                    C58096Mr6.b5 = new PaidContentPaymentServiceImpl();
                }
            }
        }
        return C58096Mr6.b5;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentPaymentService
    public final C73893SzJ LIZIZ() {
        return this.LIZLLL;
    }

    public final void LIZLLL(Context context, String str, String str2, String str3) {
        Object value = this.LIZJ.getValue();
        o.LJIIIIZZ(value, "<get-iapViewModel>(...)");
        IapProductBuyParam iapProductBuyParam = new IapProductBuyParam();
        iapProductBuyParam.diamondId = CastIntegerProtector.parseInt(str3);
        iapProductBuyParam.source = 14;
        o.LJIIIZ(str2, "<set-?>");
        iapProductBuyParam.productId = str2;
        iapProductBuyParam.way = 0;
        o.LJIIIZ(str, "<set-?>");
        iapProductBuyParam.orderId = str;
        iapProductBuyParam.tradeType = 1;
        iapProductBuyParam.businessType = 3;
        ((A8I) value).fW(context, iapProductBuyParam);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentPaymentService
    public final C73440Ss0 LIZ(Activity activity, long j, Long l, String str, String str2, Long l2, Long l3, EnumC25627A3z entrySource, String str3) {
        o.LJIIIZ(entrySource, "entrySource");
        return new C73440Ss0(C25641A4n.LIZ(j, entrySource, l).LJIL(new AfS56S0100000_4(this, 97)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJIJJLI(new A3T(this, str, l2, activity, str2, l3)).LJJLIIIIJ(new IDhS97S0100000_4(this, 4)).LJIJJLI(new AfS19S1100000_4(this, str3, 5)).LJIJJ(new AfS53S0200000_4(this, activity, 23)));
    }
}
