package com.bytedance.android.livesdk.game.model;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class PartnershipGiftInfo {

    @InterfaceC65349Pkn("auth_param")
    public AuthParam authParam;

    @InterfaceC65349Pkn("end_time")
    public long endTime;

    @InterfaceC65349Pkn("need_auth")
    public boolean needAuth;

    @InterfaceC65349Pkn("start_time")
    public long startTime;

    @InterfaceC65349Pkn("type")
    public int type;

    @InterfaceC65349Pkn("id_str")
    public String idStr = "";

    @InterfaceC65349Pkn("name")
    public String name = "";

    @InterfaceC65349Pkn("icon_url")
    public String iconUrl = "";

    @InterfaceC65349Pkn("items")
    public List<GiftItem> items = new ArrayList();

    @InterfaceC65349Pkn("detail")
    public String detail = "";

    @InterfaceC65349Pkn("gift_code")
    public String giftCode = "";

    @InterfaceC65349Pkn("guidance")
    public String guidance = "";
}
