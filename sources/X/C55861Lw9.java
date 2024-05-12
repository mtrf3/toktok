package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.ss.android.ugc.aweme.ecommerce.mall.ECommerceMallService;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Lw9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55861Lw9 extends M56 {
    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "search");
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        String str;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        if (a.LJIIIZ().LIZJ()) {
            Z9N.LIZIZ.LJJJZ(uri);
            Intent LJIJI = C51029K0z.LJIJI(activity);
            LJIJI.putExtra("extra_from_deeplink", true);
            return LJIJI;
        }
        HG3.LJIIL();
        if (!HG3.LJLJL.LJFF().isLogin()) {
            C85990Xow.LIZ.getClass();
            if (C85990Xow.LJIIIIZZ()) {
                Z9N.LIZIZ.LJJZZI(uri);
                if (C61017Nx7.LIZ().LIZIZ()) {
                    return null;
                }
                Intent LJIJI2 = C51029K0z.LJIJI(activity);
                LJIJI2.putExtra("extra_from_deeplink", true);
                LJIJI2.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
                LJIJI2.putExtra("tab", 1);
                return LJIJI2;
            }
        }
        if (!C61017Nx7.LIZ().LIZIZ()) {
            C16880lQ.LIZIZ(activity, C51029K0z.LJIJI(activity));
        }
        if (KLA.LIZ() != 0 && EcomSearchServiceImpl.LJJJJZI().LIZJ(uri) && ECommerceMallService.v3().LLJLILLLLZIIL()) {
            Uri.Builder buildUpon = uri.buildUpon();
            if (KLA.LIZ() == 2) {
                str = KAK.SHOP.getTabName();
            } else {
                str = "";
            }
            android.net.Uri ecomSearchUri = buildUpon.appendQueryParameter("single_tab_type", str).build();
            IEcomSearchService LJJJJZI = EcomSearchServiceImpl.LJJJJZI();
            o.LJIIIIZZ(ecomSearchUri, "ecomSearchUri");
            return LJJJJZI.LIZLLL(activity, ecomSearchUri);
        }
        return Z9N.LIZIZ.LIZLLL(activity, uri);
    }
}
