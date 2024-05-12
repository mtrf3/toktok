package X;

import Y.AfS36S0101000_5;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.livesdk.chatroom.detail.RoomApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: X.B3o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC28164B3o {
    public C73411SrX LIZ;
    public Pair<Integer, String> LIZIZ;
    public final B3W LIZJ;
    public boolean LIZLLL;
    public Room LJ;

    public final void LIZIZ() {
        String str;
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        C28163B3n c28163B3n = (C28163B3n) this;
        RoomApi roomApi = (RoomApi) Q7L.LIZIZ(RoomApi.class);
        if (!TextUtils.isEmpty(((C29374Bfu) B83.LIZ().LIZIZ()).LIZJ(c28163B3n.LJFF))) {
            str = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZJ(c28163B3n.LJFF);
        } else {
            str = c28163B3n.LJI;
        }
        this.LIZ = (C73411SrX) roomApi.fetchUserRoom(c28163B3n.LJFF, str).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS36S0101000_5(1, this, 29), new AfS36S0101000_5(0, this, 34));
    }

    public AbstractC28164B3o(B3W b3w) {
        this.LIZJ = b3w;
    }

    public final void LIZ(int i, String str) {
        this.LIZIZ = new Pair<>(Integer.valueOf(i), str);
        this.LIZLLL = false;
        this.LIZJ.LIZ(i, str);
    }
}
