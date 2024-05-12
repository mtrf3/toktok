package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettingDynamicUI;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.Xnd, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85909Xnd extends C8BS<PushSettingDynamicUI> {
    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        return true;
    }

    @Override // X.C8BS
    public final boolean sendRequest(Object... params) {
        o.LJIIIZ(params, "params");
        if (!super.sendRequest(Arrays.copyOf(params, params.length))) {
            return false;
        }
        FGR.LIZIZ().LIZ(this.mHandler, CallableC85908Xnc.LJLIL, 0);
        return true;
    }
}
