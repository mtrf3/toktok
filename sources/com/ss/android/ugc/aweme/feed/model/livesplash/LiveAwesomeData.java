package com.ss.android.ugc.aweme.feed.model.livesplash;

import X.InterfaceC65349Pkn;
import X.InterfaceC65404Plg;
import com.ss.android.ugc.aweme.utils.JsonToStringAdapter;
import java.util.List;

/* loaded from: classes2.dex */
public final class LiveAwesomeData {

    @InterfaceC65349Pkn("gbc")
    public String gbc;

    @InterfaceC65349Pkn("psm_pi")
    public List<LiveShowMessage> psmPi;

    @InterfaceC65349Pkn("data")
    @InterfaceC65404Plg(JsonToStringAdapter.class)
    public String roomData;

    @InterfaceC65349Pkn("sec_uid")
    public String secUid;

    @InterfaceC65349Pkn("uid")
    public long uid;

    @InterfaceC65349Pkn("use_room_info")
    public boolean useRoomInfo = true;

    @InterfaceC65349Pkn("hidden_psm_pi")
    public boolean hideView = true;
}
