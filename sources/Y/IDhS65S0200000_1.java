package Y;

import X.AbstractC62625Ohx;
import X.AbstractC73635Sv9;
import X.AbstractC73672Svk;
import X.C32I;
import X.C3AD;
import X.C3B7;
import X.C68322mC;
import X.C76800UCe;
import X.InterfaceC48038ItG;
import X.InterfaceC62225ObV;
import X.InterfaceC73518StG;
import X.PO8;
import X.X1D;
import android.content.Context;
import com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login.GetVendorInfoResponse;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.sdk.activitystatus.data.api.ActivityStatusAPI;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDhS65S0200000_1 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(IDhS65S0200000_1 iDhS65S0200000_1, Object obj) {
        String str;
        ActivityStatusAPI.Result result = (ActivityStatusAPI.Result) obj;
        o.LJIIIZ(result, "result");
        PO8 po8 = ((C3B7) iDhS65S0200000_1.l0).LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getStatuses logid ");
        BaseResponse.ServerTimeExtra serverTimeExtra = result.extra;
        if (serverTimeExtra != null) {
            str = serverTimeExtra.logid;
        } else {
            str = null;
        }
        LIZ.append(str);
        po8.i(X1D.LIZIZ(LIZ));
        List<ActivityStatus> list = result.activityStatuses;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long longValue = ((Number) ((C3B7) iDhS65S0200000_1.l0).LIZIZ.invoke()).longValue();
        if (list != null) {
            for (ActivityStatus activityStatus : list) {
                linkedHashMap.put(activityStatus.userID, activityStatus);
            }
        }
        List<String> list2 = (List) iDhS65S0200000_1.l1;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
        for (String str2 : list2) {
            arrayList.add(new C3AD(str2, longValue, (ActivityStatus) linkedHashMap.get(str2)));
        }
        return arrayList;
    }

    public static final Object apply$1(IDhS65S0200000_1 iDhS65S0200000_1, Object obj) {
        final AbstractC62625Ohx res = (AbstractC62625Ohx) obj;
        o.LJIIIZ(res, "res");
        final InterfaceC62225ObV interfaceC62225ObV = (InterfaceC62225ObV) iDhS65S0200000_1.l0;
        final Context context = (Context) iDhS65S0200000_1.l1;
        return AbstractC73635Sv9.LJ(new InterfaceC73518StG() { // from class: X.4Yd
            @Override // X.InterfaceC73518StG
            public final void LIZ(C73516StE c73516StE) {
                InterfaceC62225ObV interfaceC62225ObV2 = InterfaceC62225ObV.this;
                AbstractC62625Ohx res2 = res;
                o.LJIIIIZZ(res2, "res");
                c73516StE.onSuccess(Boolean.valueOf(interfaceC62225ObV2.LJIIJ(res2, context, null)));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.String] */
    public static final Object apply$2(IDhS65S0200000_1 iDhS65S0200000_1, Object obj) {
        GetVendorInfoResponse.VendorInfo siVendorInfo = (GetVendorInfoResponse.VendorInfo) obj;
        o.LJIIIZ(siVendorInfo, "siVendorInfo");
        ((C68322mC) iDhS65S0200000_1.l0).element = siVendorInfo.vendorId;
        ((C68322mC) iDhS65S0200000_1.l1).element = siVendorInfo.other;
        return C76800UCe.LIZ;
    }

    public static final Object apply$3(IDhS65S0200000_1 iDhS65S0200000_1, Object obj) {
        final AbstractC62625Ohx res = (AbstractC62625Ohx) obj;
        o.LJIIIZ(res, "res");
        final InterfaceC62225ObV interfaceC62225ObV = (InterfaceC62225ObV) iDhS65S0200000_1.l0;
        final Context context = (Context) iDhS65S0200000_1.l1;
        return AbstractC73635Sv9.LJ(new InterfaceC73518StG() { // from class: X.4Yc
            @Override // X.InterfaceC73518StG
            public final void LIZ(C73516StE c73516StE) {
                InterfaceC62225ObV interfaceC62225ObV2 = InterfaceC62225ObV.this;
                AbstractC62625Ohx res2 = res;
                o.LJIIIIZZ(res2, "res");
                c73516StE.onSuccess(Boolean.valueOf(interfaceC62225ObV2.LJIIJ(res2, context, null)));
            }
        });
    }

    public static final Object apply$4(IDhS65S0200000_1 iDhS65S0200000_1, Object obj) {
        return AbstractC73672Svk.LJJIZ((AbstractC73672Svk) iDhS65S0200000_1.l0, (AbstractC73672Svk) iDhS65S0200000_1.l1).LJJIJL(new IDhS94S0100000_1(obj, 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDhS65S0200000_1(Object obj, C3B7 c3b7, List<String> list) {
        this.$t = list;
        this.l0 = obj;
        this.l1 = c3b7;
    }
}
