package X;

import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import kotlin.jvm.internal.o;

/* renamed from: X.Xet, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85367Xet extends AbstractC65781Prl implements InterfaceC88472Yns<C85286Xda, String> {
    public static final C85367Xet LJLIL = new C85367Xet();

    public C85367Xet() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(C85286Xda c85286Xda) {
        PoiSearchApi.PoiSearchResult poiSearchResult;
        C85286Xda state = c85286Xda;
        o.LJIIIZ(state, "state");
        PoiSearchApi.PoiSearchResultWrapper LIZ = state.LJLIL.LIZ();
        if (LIZ != null && (poiSearchResult = LIZ.poiSearchResult) != null) {
            return poiSearchResult.getLogId();
        }
        return null;
    }
}
