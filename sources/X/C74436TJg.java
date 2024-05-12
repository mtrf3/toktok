package X;

import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.TJg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74436TJg extends AbstractC65781Prl implements InterfaceC88471Ynr<AbstractC73672Svk<FetchFavoriteListResponse>, AbstractC73672Svk<FetchFavoriteListResponse>, AbstractC73672Svk<FetchFavoriteListResponse>> {
    public static final C74436TJg LJLIL = new C74436TJg();

    public C74436TJg() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final AbstractC73672Svk<FetchFavoriteListResponse> invoke(AbstractC73672Svk<FetchFavoriteListResponse> abstractC73672Svk, AbstractC73672Svk<FetchFavoriteListResponse> abstractC73672Svk2) {
        AbstractC73672Svk<FetchFavoriteListResponse> fetcher = abstractC73672Svk;
        AbstractC73672Svk<FetchFavoriteListResponse> cache = abstractC73672Svk2;
        o.LJIIIZ(fetcher, "fetcher");
        o.LJIIIZ(cache, "cache");
        return cache.LJJLI(fetcher);
    }
}
