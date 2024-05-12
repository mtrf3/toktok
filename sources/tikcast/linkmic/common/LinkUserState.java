package tikcast.linkmic.common;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;
import com.bytedance.android.livesdk.model.message.linkcore.Player;

/* loaded from: classes14.dex */
public final class LinkUserState {

    @InterfaceC65349Pkn("audio_muted")
    public int audioMuted;

    @InterfaceC65349Pkn("linked_time_nano")
    public long linkedTimeNano;

    @InterfaceC65349Pkn("linkmic_id")
    public String linkmicId = "";

    @InterfaceC65349Pkn("network_state")
    public int networkState;

    @InterfaceC65349Pkn("online_user_state")
    public int onlineUserState;

    @InterfaceC65349Pkn("pos")
    public MicPositionData pos;

    @InterfaceC65349Pkn("rtc_connection")
    public int rtcConnection;

    @InterfaceC65349Pkn("user")
    public Player user;

    @InterfaceC65349Pkn("video_muted")
    public int videoMuted;
}
