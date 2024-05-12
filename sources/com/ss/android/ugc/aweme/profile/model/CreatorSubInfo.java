package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class CreatorSubInfo implements Serializable {

    @InterfaceC65349Pkn("has_optin")
    public final Boolean hasOptin;

    @InterfaceC65349Pkn("is_revoke")
    public final Boolean isRevoke;

    public final Boolean getHasOptin() {
        return this.hasOptin;
    }

    public final Boolean isRevoke() {
        return this.isRevoke;
    }

    public CreatorSubInfo(Boolean bool, Boolean bool2) {
        this.hasOptin = bool;
        this.isRevoke = bool2;
    }
}
