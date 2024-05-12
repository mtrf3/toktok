package X;

import com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BQ2 implements BQ7 {
    public final BQ7 LIZ;
    public final RoomPlayer2 LIZIZ;

    public BQ2(BQ7 bq7, RoomPlayer2 roomPlayer2) {
        this.LIZ = bq7;
        this.LIZIZ = roomPlayer2;
    }

    @Override // X.BQ7
    public final void LIZ(String str, JSONObject jSONObject) {
        this.LIZIZ.onPlayerLog(jSONObject);
        this.LIZ.LIZ(str, jSONObject);
    }
}
