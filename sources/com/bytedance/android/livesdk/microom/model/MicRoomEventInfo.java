package com.bytedance.android.livesdk.microom.model;

import X.C1NE;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.live.base.model.ImageModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MicRoomEventInfo implements Serializable {

    @InterfaceC65349Pkn("avatar_list")
    public List<? extends ImageModel> avatarList;

    @InterfaceC65349Pkn("event_name")
    public String eventName;

    @InterfaceC65349Pkn("show_list_url")
    public String showListUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public MicRoomEventInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MicRoomEventInfo copy$default(MicRoomEventInfo micRoomEventInfo, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = micRoomEventInfo.showListUrl;
        }
        if ((i & 2) != 0) {
            str2 = micRoomEventInfo.eventName;
        }
        if ((i & 4) != 0) {
            list = micRoomEventInfo.avatarList;
        }
        return micRoomEventInfo.copy(str, str2, list);
    }

    public final MicRoomEventInfo copy(String showListUrl, String eventName, List<? extends ImageModel> list) {
        o.LJIIIZ(showListUrl, "showListUrl");
        o.LJIIIZ(eventName, "eventName");
        return new MicRoomEventInfo(showListUrl, eventName, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MicRoomEventInfo)) {
            return false;
        }
        MicRoomEventInfo micRoomEventInfo = (MicRoomEventInfo) obj;
        return o.LJ(this.showListUrl, micRoomEventInfo.showListUrl) && o.LJ(this.eventName, micRoomEventInfo.eventName) && o.LJ(this.avatarList, micRoomEventInfo.avatarList);
    }

    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.eventName, this.showListUrl.hashCode() * 31, 31);
        List<? extends ImageModel> list = this.avatarList;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return LJ + hashCode;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MicRoomEventInfo(showListUrl=");
        LIZ.append(this.showListUrl);
        LIZ.append(", eventName=");
        LIZ.append(this.eventName);
        LIZ.append(", avatarList=");
        return C1NE.LIZIZ(LIZ, this.avatarList, ')', LIZ);
    }

    public final List<ImageModel> getAvatarList() {
        return this.avatarList;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final String getShowListUrl() {
        return this.showListUrl;
    }

    public final void setAvatarList(List<? extends ImageModel> list) {
        this.avatarList = list;
    }

    public final void setEventName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.eventName = str;
    }

    public final void setShowListUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.showListUrl = str;
    }

    public MicRoomEventInfo(String showListUrl, String eventName, List<? extends ImageModel> list) {
        o.LJIIIZ(showListUrl, "showListUrl");
        o.LJIIIZ(eventName, "eventName");
        this.showListUrl = showListUrl;
        this.eventName = eventName;
        this.avatarList = list;
    }

    public /* synthetic */ MicRoomEventInfo(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : list);
    }
}
