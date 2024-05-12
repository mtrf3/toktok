package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;

/* loaded from: classes9.dex */
public final class KBL {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.KEr] */
    public static InterfaceC70514Rlu LIZ(Context context, ECSearchEntranceData eCSearchEntranceData, KEK kek, InterfaceC65784Pro interfaceC65784Pro, C018905p c018905p) {
        Long l;
        AbstractC51386KEs abstractC51386KEs;
        switch (C51286KAw.LIZIZ[((EnumC62182cI) C61322au.LIZ(eCSearchEntranceData, eCSearchEntranceData.getEnterViewType(), C61322au.LIZIZ)).ordinal()]) {
            case 1:
                abstractC51386KEs = new C51388KEu(context, eCSearchEntranceData, kek, interfaceC65784Pro);
                break;
            case 2:
                if (kek.LJIJI) {
                    abstractC51386KEs = new C51390KEw(context, eCSearchEntranceData, kek, interfaceC65784Pro);
                    break;
                } else {
                    abstractC51386KEs = new C51387KEt(context, eCSearchEntranceData, kek, interfaceC65784Pro);
                    break;
                }
            case 3:
                abstractC51386KEs = new KBK(context, eCSearchEntranceData, kek, interfaceC65784Pro);
                break;
            case 4:
                abstractC51386KEs = new C51389KEv(context, eCSearchEntranceData, kek, interfaceC65784Pro);
                break;
            case 5:
                abstractC51386KEs = new C51391KEx(context, eCSearchEntranceData, kek, interfaceC65784Pro);
                break;
            case 6:
                Aweme aweme = kek.LJIL;
                if (aweme != null && (l = kek.LJJIFFI) != null) {
                    long longValue = l.longValue();
                    String str = kek.LIZ;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    String str3 = kek.LJJ;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    abstractC51386KEs = new C51385KEr(context, aweme, str, str2, kek.LJJI, longValue, eCSearchEntranceData);
                    break;
                }
                break;
            default:
                abstractC51386KEs = null;
                break;
        }
        if (c018905p != null && abstractC51386KEs != null) {
            abstractC51386KEs.setLayoutParams(c018905p);
        }
        return abstractC51386KEs;
    }
}
