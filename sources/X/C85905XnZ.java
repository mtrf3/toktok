package X;

import Y.ACallableS118S0100000_15;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.XnZ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85905XnZ extends C8BS<BaseResponse> {
    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        if (params.length == 1) {
            return true;
        }
        return false;
    }

    @Override // X.C8BS
    public final boolean sendRequest(Object... params) {
        o.LJIIIZ(params, "params");
        if (!super.sendRequest(Arrays.copyOf(params, params.length))) {
            return false;
        }
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS118S0100000_15(params, 7), 0);
        return true;
    }
}
