package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class SocialPlatformSetting implements Serializable {

    @InterfaceC65349Pkn("access_info")
    public final SocialPlatformAccessInfo accessInfo;

    @InterfaceC65349Pkn("display_consent_page")
    public final boolean displayConsentPage;

    @InterfaceC65349Pkn("email_ads_disclosure")
    public boolean emailAdsDisclosure;

    @InterfaceC65349Pkn("onboarding_rec_strategy")
    public final int onBoardingRecStrategy;

    @InterfaceC65349Pkn("social_platform")
    public final int socialPlatform;

    @InterfaceC65349Pkn("sync_status")
    public boolean syncStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public SocialPlatformSetting() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public final SocialPlatformAccessInfo getAccessInfo() {
        return this.accessInfo;
    }

    public final boolean getDisplayConsentPage() {
        return this.displayConsentPage;
    }

    public final boolean getEmailAdsDisclosure() {
        return this.emailAdsDisclosure;
    }

    public final int getOnBoardingRecStrategy() {
        return this.onBoardingRecStrategy;
    }

    public final int getSocialPlatform() {
        return this.socialPlatform;
    }

    public final boolean getSyncStatus() {
        return this.syncStatus;
    }

    public final void setEmailAdsDisclosure(boolean z) {
        this.emailAdsDisclosure = z;
    }

    public final void setSyncStatus(boolean z) {
        this.syncStatus = z;
    }

    public SocialPlatformSetting(int i, boolean z, int i2, boolean z2, SocialPlatformAccessInfo socialPlatformAccessInfo, boolean z3) {
        this.socialPlatform = i;
        this.syncStatus = z;
        this.onBoardingRecStrategy = i2;
        this.displayConsentPage = z2;
        this.accessInfo = socialPlatformAccessInfo;
        this.emailAdsDisclosure = z3;
    }

    public /* synthetic */ SocialPlatformSetting(int i, boolean z, int i2, boolean z2, SocialPlatformAccessInfo socialPlatformAccessInfo, boolean z3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? true : z2, (i3 & 16) != 0 ? null : socialPlatformAccessInfo, (i3 & 32) != 0 ? false : z3);
    }
}
