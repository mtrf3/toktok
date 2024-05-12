package com.ss.android.ugc.profile.platform.base.data;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class UserAccountInfo implements Serializable {

    @InterfaceC65349Pkn("account_type")
    public Integer accountType;

    @InterfaceC65349Pkn("ban_status")
    public Integer banStatus;

    @InterfaceC65349Pkn("is_blocked")
    public boolean isBlocked;

    @InterfaceC65349Pkn("is_private_account")
    public Boolean isSecret;

    @InterfaceC65349Pkn("user_canceled")
    public boolean isUserCancel;

    public final Integer getAccountType() {
        return this.accountType;
    }

    public final Integer getBanStatus() {
        return this.banStatus;
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final Boolean isSecret() {
        return this.isSecret;
    }

    public final boolean isUserCancel() {
        return this.isUserCancel;
    }

    public final void setAccountType(Integer num) {
        this.accountType = num;
    }

    public final void setBanStatus(Integer num) {
        this.banStatus = num;
    }

    public final void setBlocked(boolean z) {
        this.isBlocked = z;
    }

    public final void setSecret(Boolean bool) {
        this.isSecret = bool;
    }

    public final void setUserCancel(boolean z) {
        this.isUserCancel = z;
    }
}
