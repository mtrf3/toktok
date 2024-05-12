package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: X.XnL, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85891XnL extends C8BS<BaseResponse> {
    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        if (objArr.length >= 2 && objArr.length <= 5) {
            return true;
        }
        return false;
    }

    @Override // X.C8BS
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        FGR.LIZIZ().LIZ(this.mHandler, new CallableC85890XnK(objArr, (String) objArr[0], ((Integer) objArr[1]).intValue()), 0);
        return true;
    }
}
