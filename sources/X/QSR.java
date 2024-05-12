package X;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import defpackage.i0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class QSR implements WeakHandler.IHandler {
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message == null || message.what != 1001) {
            return;
        }
        String LJFF = i0.LJFF(C67007QRn.LJI(QM0.LIZ).LIZLLL(((Integer) message.obj).intValue()), " register timeout");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", 108);
            jSONObject.put("pushType", message.obj);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C79004UzY.LJJJJ("push_monitor_register_result", jSONObject, null, null);
        QSU.LIZ("1004", LJFF, 108, jSONObject);
    }
}
