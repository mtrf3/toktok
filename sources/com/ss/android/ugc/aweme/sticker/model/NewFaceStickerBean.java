package com.ss.android.ugc.aweme.sticker.model;

import X.C70657RoD;
import X.EnumC56422MCk;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public class NewFaceStickerBean implements Serializable {

    @InterfaceC65349Pkn("attributions")
    public List<EffectAttribution> attributions;

    @InterfaceC65349Pkn("avatar_thumb")
    public UrlModel avatarThumb;

    @InterfaceC65349Pkn("challenge_guide")
    public ChallengeGuide challengeGuide;

    @InterfaceC65349Pkn("children")
    public List<String> children;

    @InterfaceC65349Pkn("commerce_sticker")
    public CommerceSticker commerceSticker;

    @InterfaceC65349Pkn("desc")
    public String desc;

    @InterfaceC65349Pkn("effect_id")
    public String effectId;

    @InterfaceC65349Pkn("effect_source")
    public int effectSource;

    @InterfaceC65349Pkn("effect_creator_type")
    public int effectType;

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("icon_url")
    public UrlModel iconUrl;

    @InterfaceC65349Pkn("id")
    public String id;

    @InterfaceC65349Pkn("can_be_edited")
    public boolean isEditable;

    @InterfaceC65349Pkn("is_favorite")
    public boolean isFavorite;

    @InterfaceC65349Pkn("linked_anchors")
    public List<EffectAnchor> linkedAnchors;
    public LogPbBean logPbBean;
    public boolean mIsSelect;

    @InterfaceC65349Pkn("sec_uid")
    public String mSecUid;

    @InterfaceC65349Pkn("tags")
    public List<String> mTags;

    @InterfaceC65349Pkn("template_info")
    public MobileEffectTemplateInfo mobileEffectTemplate;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("owner_id")
    public String ownerId;

    @InterfaceC65349Pkn("owner_nickname")
    public String ownerName;

    @InterfaceC65349Pkn("owner_verified_type")
    public int ownerVerifiedType;

    @InterfaceC65349Pkn("related_aweme")
    public Aweme relatedAweme;

    @InterfaceC65349Pkn("user_count")
    public long userCount;

    @InterfaceC65349Pkn("vv_count")
    public long viewCount;

    @InterfaceC65349Pkn("share_info")
    public ShareInfo shareInfo = new ShareInfo();

    @InterfaceC65349Pkn("featured_video_source")
    public int featureVideoSource = EnumC56422MCk.AUTO_BIND.featureVideoSource;
    public boolean isFriendVideoPresent = false;
    public boolean isFollowerVideoPresent = false;

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.id});
    }

    public EnumC56422MCk getFeatureVideoSource() {
        return EnumC56422MCk.getCurrentFeatureVideoSource(this.featureVideoSource);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C70657RoD.LJII(this.id, ((NewFaceStickerBean) obj).id);
    }
}
