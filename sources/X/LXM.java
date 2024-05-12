package X;

import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LXM {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(IFeedFetchDataAbility iFeedFetchDataAbility, String str) {
        if (iFeedFetchDataAbility != null && !iFeedFetchDataAbility.LJIILJJIL()) {
            return false;
        }
        MLCommonService.Companion.getClass();
        C46434IKg.LIZ.onBeforeLoadMore(str);
        if (iFeedFetchDataAbility == null) {
            return false;
        }
        return iFeedFetchDataAbility.LJJIJIIJI();
    }

    public static boolean LIZIZ(IFeedFetchDataAbility iFeedFetchDataAbility, String str) {
        C51031K1b<?> Qv;
        Aweme i6 = AwemeService.LIZ().i6(str);
        boolean z = false;
        if (i6 == null) {
            return false;
        }
        if (iFeedFetchDataAbility != null && (Qv = iFeedFetchDataAbility.Qv()) != null) {
            z = Qv.LJJIIJ(i6);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(" deleteItem :");
        LIZ2.append(z);
        C36922EeM.LIZLLL(4, "IFeedFetchDataAbility", X1D.LIZIZ(LIZ2));
        return z;
    }

    public static boolean LIZJ(IFeedFetchDataAbility iFeedFetchDataAbility, Aweme aweme) {
        C51031K1b<?> Qv;
        o.LJIIIZ(aweme, "aweme");
        if (iFeedFetchDataAbility != null && (Qv = iFeedFetchDataAbility.Qv()) != null) {
            return Qv.LJJIIJ(aweme);
        }
        return false;
    }
}
