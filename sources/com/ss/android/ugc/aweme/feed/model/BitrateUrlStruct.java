package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class BitrateUrlStruct implements Serializable {

    @InterfaceC65349Pkn("backup_url")
    public String backupUrl;

    @InterfaceC65349Pkn("fallback_url")
    public String fallbackUrl;

    @InterfaceC65349Pkn("main_url")
    public String mainUrl;

    public final String getBackupUrl() {
        return this.backupUrl;
    }

    public final String getFallbackUrl() {
        return this.fallbackUrl;
    }

    public final String getMainUrl() {
        return this.mainUrl;
    }

    public final void setBackupUrl(String str) {
        this.backupUrl = str;
    }

    public final void setFallbackUrl(String str) {
        this.fallbackUrl = str;
    }

    public final void setMainUrl(String str) {
        this.mainUrl = str;
    }
}
