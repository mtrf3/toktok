package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.ecommercelive.business.cache.LiveExposedProductsCache;

/* renamed from: X.S0g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71394S0g extends AbstractC65781Prl implements InterfaceC65784Pro<LruCache<String, LiveExposedProductsCache.RelatedProductInfo>> {
    public static final C71394S0g LJLIL = new C71394S0g();

    public C71394S0g() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LruCache<String, LiveExposedProductsCache.RelatedProductInfo> invoke() {
        return new LruCache<>(20);
    }
}
