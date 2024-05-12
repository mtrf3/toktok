package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.NotificationSettings;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.XnN, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85893XnN extends C8BS<NotificationSettings> {
    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        if (params.length == 0) {
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
        FGR.LIZIZ().LIZ(this.mHandler, CallableC85892XnM.LJLIL, 0);
        return true;
    }
}
