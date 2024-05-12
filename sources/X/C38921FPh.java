package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONObject;

/* renamed from: X.FPh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38921FPh implements InterfaceC11180cE {
    public static final C38921FPh LIZ = new C38921FPh();

    @Override // X.InterfaceC11180cE
    public final void LIZ(JSONObject jSONObject, boolean z) {
        String str;
        OSZ[] oszArr = new OSZ[2];
        if (z) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        oszArr[0] = new OSZ(str, "success");
        oszArr[1] = new OSZ(jSONObject.optString("code"), "status_code");
        FMX.LJIILL("feedback_alog_upload", oszArr);
    }
}
