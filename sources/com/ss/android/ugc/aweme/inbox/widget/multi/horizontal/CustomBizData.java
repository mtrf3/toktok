package com.ss.android.ugc.aweme.inbox.widget.multi.horizontal;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CustomBizData implements Serializable {

    @InterfaceC65349Pkn("aweme")
    public final Aweme aweme;

    @InterfaceC65349Pkn("room_info")
    public final String roomInfo;

    @InterfaceC65349Pkn("type")
    public final int type;

    @InterfaceC65349Pkn("user")
    public final User user;

    public static /* synthetic */ CustomBizData copy$default(CustomBizData customBizData, User user, Aweme aweme, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            user = customBizData.user;
        }
        if ((i2 & 2) != 0) {
            aweme = customBizData.aweme;
        }
        if ((i2 & 4) != 0) {
            i = customBizData.type;
        }
        if ((i2 & 8) != 0) {
            str = customBizData.roomInfo;
        }
        return customBizData.copy(user, aweme, i, str);
    }

    public final CustomBizData copy(User user, Aweme aweme, int i, String str) {
        return new CustomBizData(user, aweme, i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomBizData)) {
            return false;
        }
        CustomBizData customBizData = (CustomBizData) obj;
        return o.LJ(this.user, customBizData.user) && o.LJ(this.aweme, customBizData.aweme) && this.type == customBizData.type && o.LJ(this.roomInfo, customBizData.roomInfo);
    }

    public int hashCode() {
        User user = this.user;
        int hashCode = (user == null ? 0 : user.hashCode()) * 31;
        Aweme aweme = this.aweme;
        int hashCode2 = (((hashCode + (aweme == null ? 0 : aweme.hashCode())) * 31) + this.type) * 31;
        String str = this.roomInfo;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CustomBizData(user=");
        LIZ.append(this.user);
        LIZ.append(", aweme=");
        LIZ.append(this.aweme);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", roomInfo=");
        return q.LIZIZ(LIZ, this.roomInfo, ')', LIZ);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final String getRoomInfo() {
        return this.roomInfo;
    }

    public final int getType() {
        return this.type;
    }

    public final User getUser() {
        return this.user;
    }

    public CustomBizData(User user, Aweme aweme, int i, String str) {
        this.user = user;
        this.aweme = aweme;
        this.type = i;
        this.roomInfo = str;
    }

    public /* synthetic */ CustomBizData(User user, Aweme aweme, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(user, aweme, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : str);
    }
}
