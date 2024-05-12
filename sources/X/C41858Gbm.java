package X;

import Y.ACallableS7S2100000_1;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gbm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41858Gbm {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZIZ(String enterFrom, Aweme aweme, String enterMethod) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        C10K.LIZIZ(new ACallableS7S2100000_1(enterFrom, aweme, enterMethod, 4), FMX.LIZIZ(), null);
    }

    public static final void LIZ(int i, Aweme aweme, String enterFrom, String enterMethod, String str, String str2, List reasonIds, List hashtags) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(reasonIds, "reasonIds");
        o.LJIIIZ(hashtags, "hashtags");
        C10K.LIZIZ(new CallableC41856Gbk(i, aweme, enterFrom, enterMethod, str, str2, hashtags, reasonIds), FMX.LIZIZ(), null);
    }
}
