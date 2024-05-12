package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.config.SearchDualStreamOptionalModel;

/* renamed from: X.95k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2311695k {
    public static final SearchDualStreamOptionalModel LIZ = new SearchDualStreamOptionalModel(20);

    public static int LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        SearchDualStreamOptionalModel searchDualStreamOptionalModel = LIZ;
        SearchDualStreamOptionalModel searchDualStreamOptionalModel2 = (SearchDualStreamOptionalModel) LIZLLL.LJIIIIZZ("search_dual_stream_optional", SearchDualStreamOptionalModel.class, searchDualStreamOptionalModel);
        if (searchDualStreamOptionalModel2 != null) {
            searchDualStreamOptionalModel = searchDualStreamOptionalModel2;
        }
        return searchDualStreamOptionalModel.androidCacheLimit;
    }
}
