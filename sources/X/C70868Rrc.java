package X;

import android.util.LruCache;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.Rrc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70868Rrc {
    public static final LruCache<String, InterfaceC43919HLn<C76800UCe>> LIZ = new LruCache<>(20);

    public static void LIZIZ(String str) {
        int LJIJJ = ECommerceAnchorService.LJJJJI().LJIJJ();
        if (str == null) {
            str = "";
        }
        try {
            str = C1E4.LJJIIJZLJL(LJIJJ, LJIJJ, str);
        } catch (Exception unused) {
        }
        String LJIIJJI = C70657RoD.LJIIJJI(str, EnumC70569Rmn.VIDEO_MULTI_ANCHOR);
        LruCache<String, InterfaceC43919HLn<C76800UCe>> lruCache = LIZ;
        if (lruCache.get(LJIIJJI) == null) {
            C84657XKj LIZ2 = C77275UUl.LIZ();
            XKX.LIZLLL(C780334l.LJLIL, null, null, new C27817Avt(LJIIJJI, LIZ2, null), 3);
            lruCache.put(LJIIJJI, LIZ2);
        }
    }

    public static void LIZ(String str, C71323Ryx c71323Ryx) {
        android.net.Uri parse = UriProtector.parse(str);
        o.LJIIIIZZ(parse, "parse(imageUrl)");
        AqS174S0100000_8 aqS174S0100000_8 = new AqS174S0100000_8(c71323Ryx, 188);
        InterfaceC70869Rrd LIZJ = W5U.LIZJ();
        if (LIZJ != null) {
            if (C70759Rpr.LIZ) {
                parse = N3O.LIZ.LIZIZ(parse);
            }
            LIZJ.LIZJ(parse, new C70773Rq5(aqS174S0100000_8));
        }
    }
}
