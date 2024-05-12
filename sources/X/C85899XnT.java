package X;

import Y.ACallableS44S0000000_15;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;

/* renamed from: X.XnT, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85899XnT extends C8BS<PushSettings> {
    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    @Override // X.C8BS
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS44S0000000_15(2), 0);
        return true;
    }
}
