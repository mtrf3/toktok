package com.bytedance.android.live.liveinteract.multimatch.matchitem.model;

import X.C31012CFc;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes14.dex */
public final class BattleItem4FEModel {

    @InterfaceC65349Pkn("gift_id")
    public long giftOnlyId;

    @InterfaceC65349Pkn("gift_name")
    public String giftOnlyName;

    @InterfaceC65349Pkn("is_specific_gift_match")
    public boolean isGiftOnlyMatch;

    @InterfaceC65349Pkn("item_infos")
    public List<ItemInfo4FE> itemList;

    @InterfaceC65349Pkn("item_type")
    public int itemType;

    @InterfaceC65349Pkn("time_diff")
    public long timeDiff = C31012CFc.LIZIZ;

    @InterfaceC65349Pkn("is_self_room")
    public boolean isSelfTeam = true;
}
