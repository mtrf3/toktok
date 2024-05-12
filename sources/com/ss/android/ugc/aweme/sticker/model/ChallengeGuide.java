package com.ss.android.ugc.aweme.sticker.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class ChallengeGuide extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("challenge_id")
    public final String challengeId = "";

    @InterfaceC65349Pkn("challenge_name")
    public final String challengeName = "";

    @InterfaceC65349Pkn("profile_image")
    public final String profileImage = "";

    @InterfaceC65349Pkn("guide_desc")
    public final String guideDesc = "";

    @InterfaceC65349Pkn("open_url")
    public final String openUrl = "";

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final String getChallengeName() {
        return this.challengeName;
    }

    public final String getGuideDesc() {
        return this.guideDesc;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getProfileImage() {
        return this.profileImage;
    }
}
