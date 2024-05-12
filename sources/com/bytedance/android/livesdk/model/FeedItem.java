package com.bytedance.android.livesdk.model;

import X.BLG;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.m;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class FeedItem {
    public transient JSONObject adJSONObject;

    @InterfaceC65349Pkn("anchor_relation_type")
    public int anchorRelationType;

    @InterfaceC65349Pkn("banner")
    public FeedBannerContainer bannerContainer;
    public transient List<FeedBanner> banners;

    @InterfaceC65349Pkn("data")
    public m data;

    @InterfaceC65349Pkn("debug_info")
    public String debugInfo;

    @InterfaceC65349Pkn("flare_info")
    public FlareInfo flareInfo;

    @InterfaceC65349Pkn("is_fresh")
    public boolean isFresh;

    @InterfaceC65349Pkn("is_recommend_card")
    public boolean isRecommendCard;
    public transient BLG item;

    @InterfaceC65349Pkn("live_reason")
    public String liveReason;
    public transient String logPb;
    public transient Object object;
    public transient boolean repeatDisable;

    @InterfaceC65349Pkn("rid")
    public String resId;
    public transient Room room;

    @InterfaceC65349Pkn("type")
    public int type;
    public transient String searchReqId = "";
    public transient String searchId = "";

    @InterfaceC65349Pkn("drawer_game_tag")
    public String drawerGameTag = "";

    public int hashCode() {
        return Objects.hash(this.item);
    }

    public Room getRoom() {
        Room room = this.room;
        if (room != null) {
            return room;
        }
        Room room2 = (Room) GsonProtectorUtils.fromJson(new Gson(), (j) this.data, Room.class);
        this.room = room2;
        if (room2 != null) {
            room2.init();
        }
        return this.room;
    }

    public void init() {
        int i = this.type;
        if (i == 1 || i == 2 || i == 4 || i == 5) {
            this.item = getRoom();
        }
    }

    public String toString() {
        BLG blg = this.item;
        if (blg == null) {
            return "null";
        }
        return blg.toString();
    }

    public String logPb() {
        return this.logPb;
    }

    public String requestId() {
        return this.resId;
    }

    /* renamed from: item, reason: merged with bridge method [inline-methods] */
    public BLG m65item() {
        return this.item;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.item, ((FeedItem) obj).item);
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setRoomFrom(FeedItem feedItem) {
        this.data = feedItem.data;
        this.room = feedItem.room;
    }
}
