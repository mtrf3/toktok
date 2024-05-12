package X;

import Y.ACallableS107S0100000_4;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: X.AJp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26033AJp extends C8BS<BaseResponse> {
    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    @Override // X.C8BS
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS107S0100000_4(objArr, 7), 0);
        return true;
    }
}
