package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class GeneralPermission implements Serializable {

    @InterfaceC65349Pkn("following_follower_list_toast")
    public int followingFollowerListToast;

    @InterfaceC65349Pkn("follow_toast")
    public int mFollowToast;

    @InterfaceC65349Pkn("follow_toast_type")
    public int mFollowToastType;

    @InterfaceC65349Pkn("original_list")
    public int mOriginalList;

    @InterfaceC65349Pkn("profile_toast")
    public String mProfileToast;

    @InterfaceC65349Pkn("share_profile_toast")
    public String mShareProfileToast;

    @InterfaceC65349Pkn("share_toast")
    public int mShareToast;

    @InterfaceC65349Pkn("shop_toast")
    public int mShopToast;

    public int getFollowToast() {
        return this.mFollowToast;
    }

    public int getFollowToastType() {
        return this.mFollowToastType;
    }

    public int getFollowingFollowerListToast() {
        return this.followingFollowerListToast;
    }

    public int getOriginalList() {
        return this.mOriginalList;
    }

    public String getProfileToast() {
        return this.mProfileToast;
    }

    public String getShareProfileToast() {
        return this.mShareProfileToast;
    }

    public int getShareToast() {
        return this.mShareToast;
    }

    public int getShopToast() {
        return this.mShopToast;
    }

    public void setFollowToastType(int i) {
        this.mFollowToastType = i;
    }

    public void setOriginalList(int i) {
        this.mOriginalList = i;
    }
}
