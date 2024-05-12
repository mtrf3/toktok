package com.ss.android.ugc.aweme.feed.module;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FollowingInterestUser implements Serializable {
    public LogPbBean LJLIL;
    public transient SlimRoom LJLILLLLZI;
    public boolean LJLJI;

    @InterfaceC65349Pkn("interest_user_type")
    public int interestUserType;

    @InterfaceC65349Pkn("is_show_blue_point")
    public boolean showBluePoint;

    @InterfaceC65349Pkn("user")
    public final User user;

    public final int getInterestUserType() {
        return this.interestUserType;
    }

    public final LogPbBean getLogPbBean() {
        return this.LJLIL;
    }

    public final boolean getSeeAll() {
        return this.LJLJI;
    }

    public final boolean getShowBluePoint() {
        return this.showBluePoint;
    }

    public final SlimRoom getSlimRoom() {
        return this.LJLILLLLZI;
    }

    public final User getUser() {
        return this.user;
    }

    public final void setInterestUserType(int i) {
        this.interestUserType = i;
    }

    public final void setLogPbBean(LogPbBean logPbBean) {
        this.LJLIL = logPbBean;
    }

    public final void setSeeAll(boolean z) {
        this.LJLJI = z;
    }

    public final void setShowBluePoint(boolean z) {
        this.showBluePoint = z;
    }

    public final void setSlimRoom(SlimRoom slimRoom) {
        this.LJLILLLLZI = slimRoom;
    }

    public FollowingInterestUser(User user, boolean z, LogPbBean logPbBean, int i) {
        o.LJIIIZ(user, "user");
        this.user = user;
        this.showBluePoint = z;
        this.LJLIL = logPbBean;
        this.interestUserType = i;
    }

    public /* synthetic */ FollowingInterestUser(User user, boolean z, LogPbBean logPbBean, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(user, z, (i2 & 4) != 0 ? null : logPbBean, (i2 & 8) != 0 ? 0 : i);
    }
}
