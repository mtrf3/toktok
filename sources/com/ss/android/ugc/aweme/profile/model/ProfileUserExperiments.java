package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class ProfileUserExperiments implements Serializable {

    @InterfaceC65349Pkn("enable_share_private_account")
    public Boolean canSharePrivateAccount = Boolean.FALSE;

    @InterfaceC65349Pkn("block_bio_link_jump")
    public int canShowEntrance;

    public final Boolean getCanSharePrivateAccount() {
        return this.canSharePrivateAccount;
    }

    public final int getCanShowEntrance() {
        return this.canShowEntrance;
    }

    public final void setCanSharePrivateAccount(Boolean bool) {
        this.canSharePrivateAccount = bool;
    }

    public final void setCanShowEntrance(int i) {
        this.canShowEntrance = i;
    }
}
