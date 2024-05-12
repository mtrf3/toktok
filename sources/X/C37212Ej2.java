package X;

import android.webkit.ValueCallback;
import org.json.JSONObject;

/* renamed from: X.Ej2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37212Ej2<T> implements ValueCallback<String> {
    public final /* synthetic */ C37960Ev6 LIZ;

    public C37212Ej2(C37960Ev6 c37960Ev6) {
        this.LIZ = c37960Ev6;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(String str) {
        String str2 = str;
        this.LIZ.LJIILJJIL = str2;
        try {
            this.LIZ.LIZIZ(1, "jsb_auth_token_event", C38381F4n.LJIIIIZZ(new JSONObject(str2)));
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("something wrong: ");
            LIZ.append(e);
            C37887Etv.LIZIZ("AuthReportModel", X1D.LIZIZ(LIZ));
            this.LIZ.LIZIZ(1, "jsb_auth_token_event", C51029K0z.LJJIIZI(new OSZ("jsb_auth_raw_inject_data_error", e.getMessage())));
        }
    }
}
