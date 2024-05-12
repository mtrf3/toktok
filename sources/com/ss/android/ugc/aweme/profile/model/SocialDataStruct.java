package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class SocialDataStruct implements Serializable {

    @InterfaceC65349Pkn("enable_permission_pop_up")
    public final boolean enablePermissionPopup;

    @InterfaceC65349Pkn("is_new_follower")
    public final boolean isNewFollower;

    @InterfaceC65349Pkn("social_platform_settings")
    public List<SocialPlatformSetting> socialPlatformSettings;

    public final boolean getEnablePermissionPopup() {
        return this.enablePermissionPopup;
    }

    public final List<SocialPlatformSetting> getSocialPlatformSettings() {
        return this.socialPlatformSettings;
    }

    public final boolean isNewFollower() {
        return this.isNewFollower;
    }

    public final void setSocialPlatformSettings(List<SocialPlatformSetting> list) {
        this.socialPlatformSettings = list;
    }

    public SocialDataStruct(List<SocialPlatformSetting> list, boolean z, boolean z2) {
        this.socialPlatformSettings = list;
        this.enablePermissionPopup = z;
        this.isNewFollower = z2;
    }

    public /* synthetic */ SocialDataStruct(List list, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2);
    }
}
