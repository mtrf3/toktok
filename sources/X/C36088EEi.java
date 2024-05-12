package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.request_combine.request.p0.FetchAbTestRequest;
import com.ss.android.ugc.aweme.request_combine.request.p0.FetchAwemeSettingRequest;
import org.json.JSONObject;

/* renamed from: X.EEi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36088EEi<T> implements InterfaceC64592gB {
    public static final C36088EEi<T> LJLIL = new C36088EEi<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        C36093EEn.LIZ.getClass();
        C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
        LJIIIZ.LIZIZ(new FetchAbTestRequest(), true);
        LJIIIZ.LIZIZ(new FetchAwemeSettingRequest(), true);
        LJIIIZ.LIZJ();
        JSONObject jSONObject = new JSONObject();
        if (th == null || (str = th.getMessage()) == null) {
            str = "";
        }
        jSONObject.put("errorMsg", str);
        C09900aA.LJIIJJI("settings_v3_result", 1, jSONObject);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("creator_fund_investigate action = creator_fund_setting_finished, success = false, is_combine = false, is_v3 = ");
        FH5.LIZIZ().getClass();
        LIZ.append(true);
        LIZ.append(", is_v3_api = true");
        C36922EeM.LJ(X1D.LIZIZ(LIZ));
        if (!C3PG.LIZIZ.LIZ("config_fetch_success")) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("status", CardStruct.IStatusCode.DEFAULT);
            c188727au.LJIIIZ("source", CardStruct.IStatusCode.DEFAULT);
            FMX.LJIIL("config_fetch_success", c188727au.LIZ);
        }
    }
}
