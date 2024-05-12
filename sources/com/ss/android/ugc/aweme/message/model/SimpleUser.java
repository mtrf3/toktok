package com.ss.android.ugc.aweme.message.model;

import X.C31461Li;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.hitrank.HitTaskInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* loaded from: classes10.dex */
public class SimpleUser implements Serializable {
    public static final long serialVersionUID = 42;

    @InterfaceC65349Pkn("avatar_thumb")
    public UrlModel avatarThumb;

    @InterfaceC65349Pkn("follow_status")
    public int followStatus;

    @InterfaceC65349Pkn("nickname")
    public String nickName;

    @InterfaceC65349Pkn("signature")
    public String signature;

    @InterfaceC65349Pkn("hit_task_info")
    public HitTaskInfo taskInfo;
    public int type;

    @InterfaceC65349Pkn("uid")
    public String uid;

    public int hashCode() {
        if (getUid() != null) {
            return getUid().hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SimpleUser{uid='");
        Q89.LIZIZ(LIZ, this.uid, '\'', ", nickName='");
        Q89.LIZIZ(LIZ, this.nickName, '\'', ", signature='");
        Q89.LIZIZ(LIZ, this.signature, '\'', ", avatarThumb=");
        return C31461Li.LIZLLL(LIZ, this.avatarThumb, '}', LIZ);
    }

    public SimpleUser() {
    }

    public UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public int getFollowStatus() {
        return this.followStatus;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getSignature() {
        return this.signature;
    }

    public HitTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public int getType() {
        return this.type;
    }

    public String getUid() {
        return this.uid;
    }

    public static SimpleUser fromUser(User user) {
        SimpleUser simpleUser = new SimpleUser();
        simpleUser.setNickName(user.getNickname());
        simpleUser.setAvatarThumb(user.getAvatarThumb());
        simpleUser.setSignature(user.getSignature());
        simpleUser.setUid(user.getUid());
        simpleUser.setFollowStatus(user.getFollowStatus());
        return simpleUser;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleUser)) {
            return false;
        }
        SimpleUser simpleUser = (SimpleUser) obj;
        if (getUid() != null) {
            return getUid().equals(simpleUser.getUid());
        }
        if (simpleUser.getUid() == null) {
            return true;
        }
        return false;
    }

    public void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
    }

    public void setFollowStatus(Integer num) {
        this.followStatus = num.intValue();
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public SimpleUser setTaskInfo(HitTaskInfo hitTaskInfo) {
        this.taskInfo = hitTaskInfo;
        return this;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public SimpleUser(String str, String str2, String str3, UrlModel urlModel, int i) {
        this.uid = str;
        this.nickName = str2;
        this.signature = str3;
        this.avatarThumb = urlModel;
        this.followStatus = i;
    }
}
