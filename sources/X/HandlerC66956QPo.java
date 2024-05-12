package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QPo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class HandlerC66956QPo extends Handler {
    public HandlerC66956QPo(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        if (message.what == 2001 && !C66953QPl.LL) {
            C66960QPs.LIZ.getClass();
            boolean LIZ = C36840Ed2.LIZ(QWR.LIZ());
            JSONObject jSONObject = new JSONObject();
            if (LIZ) {
                i = 1;
            } else {
                i = 0;
            }
            try {
                jSONObject.put("is_main_process", i);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            C79146V4k.LJJJZ("never_call_token_init", jSONObject);
        }
    }
}
