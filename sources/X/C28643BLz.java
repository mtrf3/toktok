package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.livesdkapi.session.ILinkSession;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: X.BLz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28643BLz {
    public final java.util.Map<String, ILinkSession> LIZ = new ConcurrentHashMap(10);
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;

    public final EnterRoomLinkSession LIZ() {
        if (C38354F3m.LJ(this.LIZIZ)) {
            JSONObject jSONObject = new JSONObject();
            EnterRoomLinkSession.LJII("error_msg", android.util.Log.getStackTraceString(new Throwable("")), jSONObject);
            C0K2.LIZLLL("live_enter_room_session_null_error", new JSONObject(), null, jSONObject);
            EnterRoomLinkSession enterRoomLinkSession = new EnterRoomLinkSession(new EnterRoomConfig());
            enterRoomLinkSession.LIZIZ(new Event("session_is_null", 4353, EnumC28203B5b.BussinessApiCall));
            LIZJ(enterRoomLinkSession);
        }
        return (EnterRoomLinkSession) ((ConcurrentHashMap) this.LIZ).get(this.LIZIZ);
    }

    public final void LIZIZ(Bundle bundle) {
        if (bundle != null) {
            this.LIZIZ = bundle.getString("enter_room_session_id");
            this.LIZJ = bundle.getString("first_enter_room_session_id");
            this.LIZLLL = bundle.getString("live_session_id");
            EnterRoomLinkSession enterRoomLinkSession = (EnterRoomLinkSession) bundle.getParcelable("enter_room_session");
            if (enterRoomLinkSession != null) {
                ((ConcurrentHashMap) this.LIZ).put(enterRoomLinkSession.LJ(), enterRoomLinkSession);
            }
        }
    }

    public final void LIZJ(EnterRoomLinkSession enterRoomLinkSession) {
        if (!TextUtils.isEmpty(this.LIZIZ) && !this.LIZIZ.equals(this.LIZJ)) {
            ((ConcurrentHashMap) this.LIZ).remove(this.LIZIZ);
        }
        String LJ = enterRoomLinkSession.LJ();
        this.LIZIZ = LJ;
        ((ConcurrentHashMap) this.LIZ).put(LJ, enterRoomLinkSession);
    }
}
