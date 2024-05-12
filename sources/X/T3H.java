package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes13.dex */
public final class T3H extends T3I {
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ String LJLJLLL;

    @Override // X.T3I
    public final void LIZJ() {
        String str;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null || (str = C17280m4.LIZ(room)) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C1JD.LJJIJLIJ("event_area_js_event_live_unity_animation_queue", new OSZ[]{new OSZ("type", "action_start"), new OSZ("containerID", this.LJLJLLL), new OSZ("bid", this.LJLJLJ), new OSZ("room_id", str)});
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendJsEvent: action_start  bid:");
        C31811Ce7.LJ(LIZ, this.LJLJLJ, LIZ, "EventAreaUnityAnimationWidget");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T3H(String str, String str2) {
        super(str, str2);
        this.LJLJLJ = str;
        this.LJLJLLL = str2;
    }
}
