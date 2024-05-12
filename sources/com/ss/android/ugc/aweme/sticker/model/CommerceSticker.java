package com.ss.android.ugc.aweme.sticker.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.ChallengeDisclaimer;
import com.ss.android.ugc.aweme.discover.model.HTCMissionModule;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class CommerceSticker implements Serializable {

    @InterfaceC65349Pkn("ad_owner_commerce_level")
    public int adOwnerCommerceLevel;

    @InterfaceC65349Pkn("ad_owner_id")
    public String adOwnerId;

    @InterfaceC65349Pkn("ad_owner_name")
    public String adOwnerName;

    @InterfaceC65349Pkn("sponsor_ad_label")
    public String adTagText;

    @InterfaceC65349Pkn("challenge_id")
    public String challengeId;

    @InterfaceC65349Pkn("unlock_info")
    public CommerceStickerUnlockInfo commerceStickerUnlockInfo;

    @InterfaceC65349Pkn("detail_desc")
    public String detailDesc;

    @InterfaceC65349Pkn("detail_letters")
    public String detailLetters;

    @InterfaceC65349Pkn("detail_open_url")
    public String detailOpenUrl;

    @InterfaceC65349Pkn("detail_web_url")
    public String detailWebUrl;

    @InterfaceC65349Pkn("detail_web_url_title")
    public String detailWebUrlTitle;

    @InterfaceC65349Pkn("disclaimer")
    public ChallengeDisclaimer disclaimer;

    @InterfaceC65349Pkn("expire_time")
    public long expireTime;

    @InterfaceC65349Pkn("mission_module")
    public HTCMissionModule htcMissionModule;

    @InterfaceC65349Pkn("id")
    public String id;

    @InterfaceC65349Pkn("music_id")
    public String musicId;

    @InterfaceC65349Pkn("screen_desc")
    public String screenDesc;

    @InterfaceC65349Pkn("screen_icon")
    public UrlModel screenIcon;

    @InterfaceC65349Pkn("sec_ad_owner_id")
    public String secAdOwnerId;

    public int getAdOwnerCommerceLevel() {
        return this.adOwnerCommerceLevel;
    }

    public String getAdOwnerId() {
        return this.adOwnerId;
    }

    public String getAdOwnerName() {
        return this.adOwnerName;
    }

    public String getAdTagText() {
        return this.adTagText;
    }

    public String getChallengeId() {
        return this.challengeId;
    }

    public CommerceStickerUnlockInfo getCommerceStickerUnlockInfo() {
        return this.commerceStickerUnlockInfo;
    }

    public String getDetailDesc() {
        return this.detailDesc;
    }

    public String getDetailLetters() {
        return this.detailLetters;
    }

    public String getDetailOpenUrl() {
        return this.detailOpenUrl;
    }

    public String getDetailWebUrl() {
        return this.detailWebUrl;
    }

    public String getDetailWebUrlTitle() {
        return this.detailWebUrlTitle;
    }

    public ChallengeDisclaimer getDisclaimer() {
        return this.disclaimer;
    }

    public long getExpireTime() {
        return this.expireTime;
    }

    public HTCMissionModule getHtcMissionModule() {
        return this.htcMissionModule;
    }

    public String getId() {
        return this.id;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public String getScreenDesc() {
        return this.screenDesc;
    }

    public UrlModel getScreenIcon() {
        return this.screenIcon;
    }

    public String getSecAdOwnerId() {
        return this.secAdOwnerId;
    }

    public void setAdOwnerId(String str) {
        this.adOwnerId = str;
    }

    public void setAdOwnerName(String str) {
        this.adOwnerName = str;
    }

    public void setChallengeId(String str) {
        this.challengeId = str;
    }

    public void setCommerceStickerUnlockInfo(CommerceStickerUnlockInfo commerceStickerUnlockInfo) {
        this.commerceStickerUnlockInfo = commerceStickerUnlockInfo;
    }

    public void setDetailDesc(String str) {
        this.detailDesc = str;
    }

    public void setDetailLetters(String str) {
        this.detailLetters = str;
    }

    public void setDetailOpenUrl(String str) {
        this.detailOpenUrl = str;
    }

    public void setDetailWebUrl(String str) {
        this.detailWebUrl = str;
    }

    public void setDetailWebUrlTitle(String str) {
        this.detailWebUrlTitle = str;
    }

    public void setDisclaimer(ChallengeDisclaimer challengeDisclaimer) {
        this.disclaimer = challengeDisclaimer;
    }

    public void setExpireTime(long j) {
        this.expireTime = j;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setMusicId(String str) {
        this.musicId = str;
    }

    public void setScreenDesc(String str) {
        this.screenDesc = str;
    }

    public void setScreenIcon(UrlModel urlModel) {
        this.screenIcon = urlModel;
    }

    public void setSecAdOwnerId(String str) {
        this.secAdOwnerId = str;
    }
}
