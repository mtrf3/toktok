package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: X.XnS, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85898XnS extends C8BS<BaseResponse> {
    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        if (objArr.length == 2) {
            return true;
        }
        return false;
    }

    @Override // X.C8BS
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        FGR.LIZIZ().LIZ(this.mHandler, new CallableC85900XnU((String) objArr[0], ((Integer) objArr[1]).intValue()), 0);
        return true;
    }
}
