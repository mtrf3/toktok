package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes13.dex */
public class HotSearchSprintStruct implements Serializable {
    public static final long serialVersionUID = 1;

    @InterfaceC65349Pkn("followers")
    public List<User> hitRankPeoples;

    @InterfaceC65349Pkn("sprint")
    public int sprint;

    public List<User> getHitRankPeoples() {
        return this.hitRankPeoples;
    }

    public int getSprint() {
        return this.sprint;
    }

    public void setHitRankPeoples(List<User> list) {
        this.hitRankPeoples = list;
    }

    public void setSprint(int i) {
        this.sprint = i;
    }
}
