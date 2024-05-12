package X;

import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import kotlin.jvm.internal.o;

/* renamed from: X.Xeb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85349Xeb extends AbstractC65781Prl implements InterfaceC88472Yns<C85333XeL, String> {
    public static final C85349Xeb LJLIL = new C85349Xeb();

    public C85349Xeb() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(C85333XeL c85333XeL) {
        PoiSearchApi.PoiSearchResult poiSearchResult;
        C85333XeL it = c85333XeL;
        o.LJIIIZ(it, "it");
        PoiSearchApi.PoiSearchResultWrapper LIZ = it.LJLIL.LIZ();
        if (LIZ != null && (poiSearchResult = LIZ.poiSearchResult) != null) {
            return poiSearchResult.getLogId();
        }
        return null;
    }
}
