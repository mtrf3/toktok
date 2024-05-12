package com.ss.android.ugc.aweme.relation.follow.model;

import X.C199847sq;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class RelationStatus extends BaseResponse implements Serializable {
    public static final C199847sq Companion = new Object() { // from class: X.7sq
    };
    public String LJLIL;
    public final Integer LJLILLLLZI;
    public final String LJLJI;
    public final User LJLJJI;

    @InterfaceC65349Pkn("follow_status")
    public final int followStatus;

    public static /* synthetic */ RelationStatus copy$default(RelationStatus relationStatus, String str, int i, Integer num, String str2, User user, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = relationStatus.LJLIL;
        }
        if ((i2 & 2) != 0) {
            i = relationStatus.followStatus;
        }
        if ((i2 & 4) != 0) {
            num = relationStatus.LJLILLLLZI;
        }
        if ((i2 & 8) != 0) {
            str2 = relationStatus.LJLJI;
        }
        if ((i2 & 16) != 0) {
            user = relationStatus.LJLJJI;
        }
        return relationStatus.copy(str, i, num, str2, user);
    }

    public final RelationStatus copy(String str, int i, Integer num, String str2, User user) {
        return new RelationStatus(str, i, num, str2, user);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelationStatus)) {
            return false;
        }
        RelationStatus relationStatus = (RelationStatus) obj;
        return o.LJ(this.LJLIL, relationStatus.LJLIL) && this.followStatus == relationStatus.followStatus && o.LJ(this.LJLILLLLZI, relationStatus.LJLILLLLZI) && o.LJ(this.LJLJI, relationStatus.LJLJI) && o.LJ(this.LJLJJI, relationStatus.LJLJJI);
    }

    public int hashCode() {
        String str = this.LJLIL;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.followStatus) * 31;
        Integer num = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LJLJI;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        User user = this.LJLJJI;
        return hashCode3 + (user != null ? user.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RelationStatus(uid=");
        LIZ.append(this.LJLIL);
        LIZ.append(", followStatus=");
        LIZ.append(this.followStatus);
        LIZ.append(", followerStatus=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", secUid=");
        LIZ.append(this.LJLJI);
        LIZ.append(", user=");
        LIZ.append(this.LJLJJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean isCheating() {
        if (this.status_code == 2149) {
            return true;
        }
        return false;
    }

    public final int getFollowStatus() {
        return this.followStatus;
    }

    public final Integer getFollowerStatus() {
        return this.LJLILLLLZI;
    }

    public final String getSecUid() {
        return this.LJLJI;
    }

    public final String getUid() {
        return this.LJLIL;
    }

    public final User getUser() {
        return this.LJLJJI;
    }

    public final void setUid(String str) {
        this.LJLIL = str;
    }

    public RelationStatus(String str, int i, Integer num, String str2, User user) {
        this.LJLIL = str;
        this.followStatus = i;
        this.LJLILLLLZI = num;
        this.LJLJI = str2;
        this.LJLJJI = user;
    }

    public /* synthetic */ RelationStatus(String str, int i, Integer num, String str2, User user, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? 0 : num, (i2 & 8) != 0 ? null : str2, (i2 & 16) == 0 ? user : null);
    }
}
