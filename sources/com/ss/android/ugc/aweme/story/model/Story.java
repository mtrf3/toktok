package com.ss.android.ugc.aweme.story.model;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* loaded from: classes2.dex */
public class Story implements Cloneable {
    public List<Aweme> awemes;

    @InterfaceC65349Pkn("skylight_display_tag")
    public String skyLightDisplayTag;

    @InterfaceC65349Pkn("status")
    public int status;

    @InterfaceC65349Pkn("type")
    public int type;

    @InterfaceC65349Pkn("update_time")
    public long updateTime;

    @InterfaceC65349Pkn("user_info")
    public User userInfo;

    public void setRead() {
        this.status = 1;
    }

    public String getLiveUid() {
        User user = this.userInfo;
        if (user == null) {
            return "";
        }
        return user.getLiveUid();
    }

    public boolean isFollowing() {
        if (this.type == 2) {
            return true;
        }
        return false;
    }

    public boolean isLive() {
        int i = this.type;
        if (i == 1 || i == 5 || i == 6) {
            return true;
        }
        return false;
    }

    public boolean isNewLiveType() {
        int i = this.type;
        if (i == 5 || i == 6) {
            return true;
        }
        return false;
    }

    public boolean isRead() {
        if (this.status == 1) {
            return true;
        }
        return false;
    }

    public boolean isStory() {
        if (this.type == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Story m193clone() {
        try {
            return (Story) super.clone();
        } catch (CloneNotSupportedException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public String getUid() {
        if (getUserInfo() == null) {
            return null;
        }
        return getUserInfo().getUid();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Story{status=");
        LIZ.append(this.status);
        LIZ.append(", userInfo=");
        LIZ.append(this.userInfo);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public List<Aweme> getAwemes() {
        return this.awemes;
    }

    public int getStatus() {
        return this.status;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public User getUserInfo() {
        return this.userInfo;
    }

    public void setAwemes(List<Aweme> list) {
        this.awemes = list;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public void setUserInfo(User user) {
        this.userInfo = user;
    }
}
