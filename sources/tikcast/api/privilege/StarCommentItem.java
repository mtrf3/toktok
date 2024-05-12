package tikcast.api.privilege;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.StarCommentMessage;

/* loaded from: classes6.dex */
public final class StarCommentItem {

    @InterfaceC65349Pkn("force_insert")
    public boolean forceInsert;

    @InterfaceC65349Pkn("server_to_show_timestamp_ms")
    public long serverToShowTimestampMs;

    @InterfaceC65349Pkn("star_comment")
    public StarCommentMessage starComment;

    @InterfaceC65349Pkn("start_comment_status")
    public int startCommentStatus;

    @InterfaceC65349Pkn("coins")
    public String coins = "";

    @InterfaceC65349Pkn("room_user_count")
    public String roomUserCount = "";
}
