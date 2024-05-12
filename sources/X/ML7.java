package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes10.dex */
public final class ML7 {
    public static ML6 LIZ(Throwable th) {
        String str;
        BaseResponse baseResponse;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        if (th instanceof C38333F2r) {
            Object rawResponse = ((C38333F2r) th).getRawResponse();
            if ((rawResponse instanceof BaseResponse) && (baseResponse = (BaseResponse) rawResponse) != null && (serverTimeExtra = baseResponse.extra) != null) {
                str = serverTimeExtra.logid;
            } else {
                str = null;
            }
            return new ML6(null, str, th);
        }
        return new ML6(null, null, th);
    }
}
