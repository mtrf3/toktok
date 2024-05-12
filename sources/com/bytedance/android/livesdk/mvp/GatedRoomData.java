package com.bytedance.android.livesdk.mvp;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GatedRoomData {

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("detail_url")
    public final String detailUrl;

    @InterfaceC65349Pkn("event_name")
    public final String eventName;

    @InterfaceC65349Pkn("owner")
    public final User owner;

    /* JADX WARN: Multi-variable type inference failed */
    public GatedRoomData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GatedRoomData)) {
            return false;
        }
        GatedRoomData gatedRoomData = (GatedRoomData) obj;
        return o.LJ(this.eventName, gatedRoomData.eventName) && o.LJ(this.description, gatedRoomData.description) && o.LJ(this.detailUrl, gatedRoomData.detailUrl) && o.LJ(this.owner, gatedRoomData.owner);
    }

    public final int hashCode() {
        String str = this.eventName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.detailUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        User user = this.owner;
        return hashCode3 + (user != null ? user.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GatedRoomData(eventName=");
        LIZ.append(this.eventName);
        LIZ.append(", description=");
        LIZ.append(this.description);
        LIZ.append(", detailUrl=");
        LIZ.append(this.detailUrl);
        LIZ.append(", owner=");
        LIZ.append(this.owner);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public GatedRoomData(String str, String str2, String str3, User user) {
        this.eventName = str;
        this.description = str2;
        this.detailUrl = str3;
        this.owner = user;
    }

    public /* synthetic */ GatedRoomData(String str, String str2, String str3, User user, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : user);
    }
}
