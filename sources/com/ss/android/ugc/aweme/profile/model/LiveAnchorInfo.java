package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes7.dex */
public class LiveAnchorInfo implements Serializable {

    @InterfaceC65349Pkn("scheduled_master_switch")
    public boolean globalSwitch;

    @InterfaceC65349Pkn("scheduled_profile_switch")
    public boolean profileSwitch;

    @InterfaceC65349Pkn("scheduled_time_text")
    public String scheduledTimeText;

    public String getScheduledTimeText() {
        return this.scheduledTimeText;
    }

    public boolean isGlobalSwitch() {
        return this.globalSwitch;
    }

    public boolean isProfileSwitch() {
        return this.profileSwitch;
    }

    public void setGlobalSwitch(boolean z) {
        this.globalSwitch = z;
    }

    public void setProfileSwitch(boolean z) {
        this.profileSwitch = z;
    }

    public void setScheduledTimeText(String str) {
        this.scheduledTimeText = str;
    }
}
