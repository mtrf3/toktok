package X;

import com.bytedance.android.live.network.response.RequestError;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class CH0 {
    public static void LIZ(int i, RequestError requestError, String str, String str2) {
        if (requestError == null) {
            requestError = new RequestError();
            requestError.prompts = C15380j0.LJIILJJIL(R.string.sz1);
        }
        CH1 ch1 = new CH1(i, requestError.url, str2);
        ch1.setErrorMsg(requestError.message);
        ch1.setPrompt(requestError.prompts);
        ch1.setAlert(requestError.alert);
        ch1.setExtra(str);
        throw ch1;
    }
}
