package com.ss.android.ugc.aweme.dsp.experiment;

import X.InterfaceC65349Pkn;

/* loaded from: classes16.dex */
public final class MusicDspOpt {

    @InterfaceC65349Pkn("enable_start_from_chorus")
    public final boolean enableStartFromChorus;

    @InterfaceC65349Pkn("enable_bitrate_drop")
    public final boolean enableBitrateDrop = true;

    @InterfaceC65349Pkn("enable_show_new_user_guide")
    public final boolean enableShowNewUserGuide = true;

    @InterfaceC65349Pkn("enable_show_swipe_up_guide")
    public final boolean enableShowSwipeUpGuide = true;

    @InterfaceC65349Pkn("enable_swipe_from_profile")
    public final boolean enableSwipeFromProfile = true;

    public final boolean getEnableBitrateDrop() {
        return this.enableBitrateDrop;
    }

    public final boolean getEnableShowNewUserGuide() {
        return this.enableShowNewUserGuide;
    }

    public final boolean getEnableShowSwipeUpGuide() {
        return this.enableShowSwipeUpGuide;
    }

    public final boolean getEnableStartFromChorus() {
        return this.enableStartFromChorus;
    }

    public final boolean getEnableSwipeFromProfile() {
        return this.enableSwipeFromProfile;
    }
}
