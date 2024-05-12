package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MallRacunRequest {

    @InterfaceC65349Pkn("force_feeds")
    public final List<ForceFeed> forceFeeds;

    @InterfaceC65349Pkn("room_id")
    public final String roomId;

    @InterfaceC65349Pkn("tab_type")
    public final Integer tabType;

    @InterfaceC65349Pkn("video_id")
    public final String videoId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MallRacunRequest copy$default(MallRacunRequest mallRacunRequest, Integer num, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = mallRacunRequest.tabType;
        }
        if ((i & 2) != 0) {
            str = mallRacunRequest.roomId;
        }
        if ((i & 4) != 0) {
            str2 = mallRacunRequest.videoId;
        }
        if ((i & 8) != 0) {
            list = mallRacunRequest.forceFeeds;
        }
        return mallRacunRequest.copy(num, str, str2, list);
    }

    public final MallRacunRequest copy(Integer num, String str, String str2, List<ForceFeed> list) {
        return new MallRacunRequest(num, str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallRacunRequest)) {
            return false;
        }
        MallRacunRequest mallRacunRequest = (MallRacunRequest) obj;
        return o.LJ(this.tabType, mallRacunRequest.tabType) && o.LJ(this.roomId, mallRacunRequest.roomId) && o.LJ(this.videoId, mallRacunRequest.videoId) && o.LJ(this.forceFeeds, mallRacunRequest.forceFeeds);
    }

    public int hashCode() {
        Integer num = this.tabType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.roomId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.videoId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ForceFeed> list = this.forceFeeds;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MallRacunRequest(tabType=");
        LIZ.append(this.tabType);
        LIZ.append(", roomId=");
        LIZ.append(this.roomId);
        LIZ.append(", videoId=");
        LIZ.append(this.videoId);
        LIZ.append(", forceFeeds=");
        return C1NE.LIZIZ(LIZ, this.forceFeeds, ')', LIZ);
    }

    public final List<ForceFeed> getForceFeeds() {
        return this.forceFeeds;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final Integer getTabType() {
        return this.tabType;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public MallRacunRequest(Integer num, String str, String str2, List<ForceFeed> list) {
        this.tabType = num;
        this.roomId = str;
        this.videoId = str2;
        this.forceFeeds = list;
    }
}
