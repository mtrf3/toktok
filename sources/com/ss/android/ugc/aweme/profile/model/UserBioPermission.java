package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class UserBioPermission implements Serializable {

    @InterfaceC65349Pkn("enable_download_app_link")
    public boolean enableDownloadAppLink;

    @InterfaceC65349Pkn("enable_email")
    public boolean enableEmail;

    @InterfaceC65349Pkn("enable_location")
    public boolean enableLocation;

    @InterfaceC65349Pkn("enable_phone")
    public boolean enablePhone;

    @InterfaceC65349Pkn("enable_url")
    public boolean enableUrl;

    public final boolean getEnableDownloadAppLink() {
        return this.enableDownloadAppLink;
    }

    public final boolean getEnableEmail() {
        return this.enableEmail;
    }

    public final boolean getEnableLocation() {
        return this.enableLocation;
    }

    public final boolean getEnablePhone() {
        return this.enablePhone;
    }

    public final boolean getEnableUrl() {
        return this.enableUrl;
    }

    public final void setEnableDownloadAppLink(boolean z) {
        this.enableDownloadAppLink = z;
    }

    public final void setEnableEmail(boolean z) {
        this.enableEmail = z;
    }

    public final void setEnableLocation(boolean z) {
        this.enableLocation = z;
    }

    public final void setEnablePhone(boolean z) {
        this.enablePhone = z;
    }

    public final void setEnableUrl(boolean z) {
        this.enableUrl = z;
    }
}
