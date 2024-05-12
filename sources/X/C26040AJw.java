package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.FetchPushOffReasonsResp;

/* renamed from: X.AJw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26040AJw extends C8BS<FetchPushOffReasonsResp> {
    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    @Override // X.C8BS
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        FGR.LIZIZ().LIZ(this.mHandler, new CallableC26041AJx(), 0);
        return true;
    }
}
