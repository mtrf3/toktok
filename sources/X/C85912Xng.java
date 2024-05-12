package X;

import Y.ACallableS118S0100000_15;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.profile.presenter.UserIdResponse;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.Xng, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85912Xng extends C8BS<UserIdResponse> {
    public final /* synthetic */ C85913Xnh LJLIL;

    public C85912Xng(C85913Xnh c85913Xnh) {
        this.LJLIL = c85913Xnh;
    }

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
        Object obj = params[0];
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
        Uri.Builder buildUpon = UriProtector.parse(this.LJLIL.LJLJJI).buildUpon();
        buildUpon.appendQueryParameter("id", (String) obj);
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS118S0100000_15(buildUpon, 2), 0);
        return true;
    }
}
