package X;

import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.BfU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29348BfU extends AbstractC38123Exj<JSONObject, JSONObject> {
    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(JSONObject params, C38131Exr callContext) {
        Boolean bool;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(callContext, "callContext");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null) {
            finishWithFailure();
            return;
        }
        JSONObject jSONObject = new JSONObject();
        RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
        if (roomAuthStatus != null) {
            bool = Boolean.valueOf(roomAuthStatus.chatSubOnly);
        } else {
            bool = null;
        }
        jSONObject.put("enable", C29306Beo.LJJIFFI(bool));
        finishWithResult(jSONObject);
    }
}
