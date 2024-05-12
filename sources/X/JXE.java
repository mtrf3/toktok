package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;

/* loaded from: classes9.dex */
public final class JXE implements InterfaceC48979JKd {
    @Override // X.InterfaceC48979JKd
    public final String getIdentifier() {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AggregatedVideoCard_");
        SearchResultActivity LIZIZ = C50989Jzl.LIZIZ();
        if (LIZIZ != null) {
            num = Integer.valueOf(LIZIZ.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC48979JKd
    public final InterfaceC88472Yns<Aweme, Boolean> LIZ() {
        return JXH.LJLIL;
    }
}
