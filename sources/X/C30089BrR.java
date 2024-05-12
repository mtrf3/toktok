package X;

import com.bytedance.android.livesdk.chatroom.widget.api.FollowEventCollectApi;
import com.bytedance.android.livesdk.livesetting.watchlive.FsNeedEventCollectSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.o;

/* renamed from: X.BrR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30089BrR {
    public final Room LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    public C30089BrR(Room room) {
        o.LJIIIZ(room, "room");
        this.LIZ = room;
    }

    public final void LIZ(int i) {
        if (FsNeedEventCollectSetting.INSTANCE.getValue()) {
            ((FollowEventCollectApi) Q7L.LIZIZ(FollowEventCollectApi.class)).collectEventForFollow(i, this.LIZ.getId(), this.LIZ.getOwnerUserId()).LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LJJJJZ();
        }
    }
}
