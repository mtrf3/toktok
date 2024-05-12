package X;

import Y.ARunnableS48S0100000_12;
import com.ss.android.ugc.aweme.commercialize.model.AdNativeProduct;
import com.ss.android.ugc.aweme.commercialize.model.AdProductTile;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2Ry, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58662Ry implements InterfaceC58172Qb {
    public static final C58662Ry LIZ = new C58662Ry();

    @Override // X.InterfaceC58172Qb
    public final void LIZLLL(String str) {
    }

    @Override // X.InterfaceC58172Qb
    public final void LJIIIIZZ(Aweme aweme) {
        AdProductTile productTile;
        List<AdNativeProduct> productList;
        o.LJIIIZ(aweme, "aweme");
        synchronized (aweme) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && (productTile = awemeRawAd.getProductTile()) != null && (productList = productTile.getProductList()) != null && (!productList.isEmpty())) {
                C38995FSd.LIZLLL().execute(new ARunnableS48S0100000_12(productList, 79));
            }
        }
    }

    @Override // X.InterfaceC58172Qb
    public final void LJIIJ(int i, List list) {
        AdProductTile productTile;
        List<AdNativeProduct> productList;
        o.LJIIIZ(list, "list");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AwemeRawAd awemeRawAd = ((Aweme) it.next()).getAwemeRawAd();
            if (awemeRawAd != null && (productTile = awemeRawAd.getProductTile()) != null && (productList = productTile.getProductList()) != null && (!productList.isEmpty())) {
                C38995FSd.LIZLLL().execute(new ARunnableS48S0100000_12(productList, 79));
            }
        }
    }
}
