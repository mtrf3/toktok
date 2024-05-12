package webcast.data;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.KaraokeSong;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class ReqSong {

    @InterfaceC65349Pkn("req_count")
    public long reqCount;

    @InterfaceC65349Pkn("song")
    public KaraokeSong song;

    @InterfaceC65349Pkn("user_list")
    public List<User> userList = new ArrayList();
}
