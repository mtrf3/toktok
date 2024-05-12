package webcast.api.sub;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;

/* loaded from: classes17.dex */
public final class SubscriberMsg {

    @InterfaceC65349Pkn("avatar")
    public ImageModel avatar;

    @InterfaceC65349Pkn("badge")
    public BadgeStruct badge;

    @InterfaceC65349Pkn("is_watching_live")
    public boolean isWatchingLive;

    @InterfaceC65349Pkn("send_subs")
    public long sendSubs;

    @InterfaceC65349Pkn("status")
    public int status;

    @InterfaceC65349Pkn("user_id")
    public long userId;

    @InterfaceC65349Pkn("nick_name")
    public String nickName = "";

    @InterfaceC65349Pkn("status_txt")
    public String statusTxt = "";

    @InterfaceC65349Pkn("subscribe_time_txt")
    public String subscribeTimeTxt = "";
}
