package X;

import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import kotlin.jvm.internal.o;

/* renamed from: X.Xeu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85368Xeu extends AbstractC65781Prl implements InterfaceC88472Yns<C85286Xda, String> {
    public static final C85368Xeu LJLIL = new C85368Xeu();

    public C85368Xeu() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(C85286Xda c85286Xda) {
        PoiSearchApi.PoiSearchResult poiSearchResult;
        C85286Xda it = c85286Xda;
        o.LJIIIZ(it, "it");
        PoiSearchApi.PoiSearchResultWrapper LIZ = it.LJLIL.LIZ();
        if (LIZ != null && (poiSearchResult = LIZ.poiSearchResult) != null) {
            return poiSearchResult.getLogId();
        }
        return null;
    }
}
