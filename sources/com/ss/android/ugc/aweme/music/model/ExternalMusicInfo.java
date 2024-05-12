package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public final class ExternalMusicInfo implements Serializable {

    @InterfaceC65349Pkn("button_text")
    public String buttonText;

    @InterfaceC65349Pkn("external_app_link")
    public String externalAppLink;

    @InterfaceC65349Pkn("external_deep_link")
    public String externalDeepLink;

    @InterfaceC65349Pkn("external_label")
    public String externalLabel;

    @InterfaceC65349Pkn("external_preview_schema")
    public String externalPreviewSchema;

    @InterfaceC65349Pkn("external_schema")
    public String externalSchema;

    @InterfaceC65349Pkn("external_song_key")
    public String externalSongKey;

    @InterfaceC65349Pkn("hide_when_uninstall")
    public Boolean hideWhenUninstall;

    @InterfaceC65349Pkn("h5_url")
    public String jumpUrl;

    @InterfaceC65349Pkn("partner_name")
    public String partnerName;

    @InterfaceC65349Pkn("partner_song_id")
    public String partnerSongId;

    @InterfaceC65349Pkn("product_status")
    public int productStatus = 2;

    @InterfaceC65349Pkn("subscribed")
    public boolean subscribed;

    @InterfaceC65349Pkn("vip_verification_schema")
    public String vipVerificationSchema;

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getExternalAppLink() {
        return this.externalAppLink;
    }

    public final String getExternalDeepLink() {
        return this.externalDeepLink;
    }

    public final String getExternalLabel() {
        return this.externalLabel;
    }

    public final String getExternalPreviewSchema() {
        return this.externalPreviewSchema;
    }

    public final String getExternalSchema() {
        return this.externalSchema;
    }

    public final String getExternalSongKey() {
        return this.externalSongKey;
    }

    public final Boolean getHideWhenUninstall() {
        return this.hideWhenUninstall;
    }

    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    public final String getPartnerName() {
        return this.partnerName;
    }

    public final String getPartnerSongId() {
        return this.partnerSongId;
    }

    public final int getProductStatus() {
        return this.productStatus;
    }

    public final boolean getSubscribed() {
        return this.subscribed;
    }

    public final String getVipVerificationSchema() {
        return this.vipVerificationSchema;
    }

    public final void setButtonText(String str) {
        this.buttonText = str;
    }

    public final void setExternalAppLink(String str) {
        this.externalAppLink = str;
    }

    public final void setExternalDeepLink(String str) {
        this.externalDeepLink = str;
    }

    public final void setExternalLabel(String str) {
        this.externalLabel = str;
    }

    public final void setExternalPreviewSchema(String str) {
        this.externalPreviewSchema = str;
    }

    public final void setExternalSchema(String str) {
        this.externalSchema = str;
    }

    public final void setExternalSongKey(String str) {
        this.externalSongKey = str;
    }

    public final void setHideWhenUninstall(Boolean bool) {
        this.hideWhenUninstall = bool;
    }

    public final void setJumpUrl(String str) {
        this.jumpUrl = str;
    }

    public final void setPartnerName(String str) {
        this.partnerName = str;
    }

    public final void setPartnerSongId(String str) {
        this.partnerSongId = str;
    }

    public final void setProductStatus(int i) {
        this.productStatus = i;
    }

    public final void setSubscribed(boolean z) {
        this.subscribed = z;
    }

    public final void setVipVerificationSchema(String str) {
        this.vipVerificationSchema = str;
    }
}
