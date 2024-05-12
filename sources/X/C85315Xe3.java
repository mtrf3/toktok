package X;

import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import kotlin.jvm.internal.o;

/* renamed from: X.Xe3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85315Xe3 extends AbstractC65781Prl implements InterfaceC88472Yns<C85286Xda, String> {
    public static final C85315Xe3 LJLIL = new C85315Xe3();

    public C85315Xe3() {
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
