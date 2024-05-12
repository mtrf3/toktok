package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class UserPronounsInfo implements Serializable {

    @InterfaceC65349Pkn("enable_edit_pronouns")
    public Boolean enableEditPronouns;

    @InterfaceC65349Pkn("pronouns")
    public String pronouns;

    public final Boolean getEnableEditPronouns() {
        return this.enableEditPronouns;
    }

    public final String getPronouns() {
        return this.pronouns;
    }

    public final void setEnableEditPronouns(Boolean bool) {
        this.enableEditPronouns = bool;
    }

    public final void setPronouns(String str) {
        this.pronouns = str;
    }
}
