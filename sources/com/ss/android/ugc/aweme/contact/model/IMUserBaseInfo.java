package com.ss.android.ugc.aweme.contact.model;

import X.C75792yF;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;

/* loaded from: classes2.dex */
public final class IMUserBaseInfo extends IMContact {
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;

    @InterfaceC65349Pkn("avatars")
    public Avatars avatars;

    @InterfaceC65349Pkn("nick_name")
    public String contactNickName;

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("follow_status")
    public Integer followStatus = 0;

    @InterfaceC65349Pkn("maf_status")
    public Integer mafStatus = 0;

    @InterfaceC65349Pkn("rec_type")
    public String recType;

    @InterfaceC65349Pkn("unique_id")
    public String uniqueId;

    @InterfaceC65349Pkn("update_time")
    public long updateTime;

    @InterfaceC65349Pkn("user_id")
    public long userId;

    @InterfaceC65349Pkn("user_type")
    public int userType;

    public final Avatars getAvatars() {
        Object obj;
        if (this.avatars == null) {
            Object obj2 = null;
            try {
                String str = this.LJLIL;
                if (str == null || str.length() <= 0) {
                    str = null;
                }
                obj = C75792yF.LIZ(str, UrlModel.class);
                try {
                    String str2 = this.LJLILLLLZI;
                    if (str2 != null && str2.length() > 0) {
                        obj2 = C75792yF.LIZ(str2, UrlModel.class);
                    }
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                obj = null;
            }
            this.avatars = new Avatars((UrlModel) obj, (UrlModel) obj2);
        }
        return this.avatars;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public UrlModel getDisplayAvatar() {
        Avatars avatars = getAvatars();
        if (avatars != null) {
            return avatars.avatarThumb;
        }
        return null;
    }

    public final String getAvatarMediumStr() {
        return this.LJLILLLLZI;
    }

    public final String getAvatarThumbStr() {
        return this.LJLIL;
    }

    public final String getContactNickName() {
        return this.contactNickName;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public String getDisplayName() {
        return this.contactNickName;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final Integer getFollowStatus() {
        return this.followStatus;
    }

    public final String getInitialLetter() {
        return this.LJLJJI;
    }

    public final Integer getMafStatus() {
        return this.mafStatus;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public String getNickName() {
        return this.contactNickName;
    }

    public final String getRecType() {
        return this.recType;
    }

    public final String getSortWeight() {
        return this.LJLJI;
    }

    public final String getUniqueId() {
        return this.uniqueId;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final int getUserType() {
        return this.userType;
    }

    public final void setAvatarMediumStr(String str) {
        this.LJLILLLLZI = str;
    }

    public final void setAvatarThumbStr(String str) {
        this.LJLIL = str;
    }

    public final void setAvatars(Avatars avatars) {
        this.avatars = avatars;
    }

    public final void setContactNickName(String str) {
        this.contactNickName = str;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setFollowStatus(Integer num) {
        this.followStatus = num;
    }

    public final void setInitialLetter(String str) {
        this.LJLJJI = str;
    }

    public final void setMafStatus(Integer num) {
        this.mafStatus = num;
    }

    public final void setRecType(String str) {
        this.recType = str;
    }

    public final void setSortWeight(String str) {
        this.LJLJI = str;
    }

    public final void setUniqueId(String str) {
        this.uniqueId = str;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }

    public final void setUserType(int i) {
        this.userType = i;
    }
}
