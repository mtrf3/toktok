package X;

import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import kotlin.jvm.internal.o;

/* renamed from: X.Xev, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85369Xev extends AbstractC65781Prl implements InterfaceC88472Yns<C85333XeL, String> {
    public static final C85369Xev LJLIL = new C85369Xev();

    public C85369Xev() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(C85333XeL c85333XeL) {
        PoiSearchApi.PoiSearchResult poiSearchResult;
        C85333XeL state = c85333XeL;
        o.LJIIIZ(state, "state");
        PoiSearchApi.PoiSearchResultWrapper LIZ = state.LJLIL.LIZ();
        if (LIZ != null && (poiSearchResult = LIZ.poiSearchResult) != null) {
            return poiSearchResult.getLogId();
        }
        return null;
    }
}
