package X;

import Y.ACallableS6S2000000_8;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KQF extends C8BS<Aweme> {
    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        boolean z;
        o.LJIIIZ(params, "params");
        if (params.length == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // X.C8BS
    public final boolean sendRequest(Object... params) {
        o.LJIIIZ(params, "params");
        if (!super.sendRequest(Arrays.copyOf(params, params.length))) {
            return false;
        }
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS6S2000000_8((String) params[0], (String) params[1], 0), 0);
        return true;
    }
}
