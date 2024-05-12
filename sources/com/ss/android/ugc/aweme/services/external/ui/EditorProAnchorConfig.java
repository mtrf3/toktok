package com.ss.android.ugc.aweme.services.external.ui;

import X.F9E;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class EditorProAnchorConfig extends F9E implements Serializable {
    public String anchorSubType;
    public CreativeInfo creativeInfo;
    public String detailBtnTitle;
    public String detailDescription;
    public String detailTitle;
    public String enterFrom;
    public String enterMethod;
    public String iconUrl;
    public String keyword;
    public String popUpDescription;
    public String popUpTitle;
    public final String shootWay;
    public UrlModel thumbnail;
    public String videoGuideUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public EditorProAnchorConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16383, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EditorProAnchorConfig copy$default(EditorProAnchorConfig editorProAnchorConfig, CreativeInfo creativeInfo, String str, String str2, String str3, UrlModel urlModel, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, Object obj) {
        CreativeInfo creativeInfo2 = creativeInfo;
        String str13 = str;
        String str14 = str2;
        String str15 = str3;
        UrlModel urlModel2 = urlModel;
        String str16 = str4;
        String str17 = str5;
        String str18 = str6;
        String str19 = str7;
        String str20 = str8;
        String str21 = str9;
        String str22 = str10;
        String str23 = str11;
        String str24 = str12;
        if ((i & 1) != 0) {
            creativeInfo2 = editorProAnchorConfig.creativeInfo;
        }
        if ((i & 2) != 0) {
            str13 = editorProAnchorConfig.anchorSubType;
        }
        if ((i & 4) != 0) {
            str14 = editorProAnchorConfig.keyword;
        }
        if ((i & 8) != 0) {
            str15 = editorProAnchorConfig.iconUrl;
        }
        if ((i & 16) != 0) {
            urlModel2 = editorProAnchorConfig.thumbnail;
        }
        if ((i & 32) != 0) {
            str16 = editorProAnchorConfig.popUpTitle;
        }
        if ((i & 64) != 0) {
            str17 = editorProAnchorConfig.popUpDescription;
        }
        if ((i & 128) != 0) {
            str18 = editorProAnchorConfig.videoGuideUrl;
        }
        if ((i & 256) != 0) {
            str19 = editorProAnchorConfig.detailTitle;
        }
        if ((i & 512) != 0) {
            str20 = editorProAnchorConfig.detailDescription;
        }
        if ((i & 1024) != 0) {
            str21 = editorProAnchorConfig.detailBtnTitle;
        }
        if ((i & 2048) != 0) {
            str22 = editorProAnchorConfig.shootWay;
        }
        if ((i & 4096) != 0) {
            str23 = editorProAnchorConfig.enterFrom;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            str24 = editorProAnchorConfig.enterMethod;
        }
        return editorProAnchorConfig.copy(creativeInfo2, str13, str14, str15, urlModel2, str16, str17, str18, str19, str20, str21, str22, str23, str24);
    }

    public final EditorProAnchorConfig copy(CreativeInfo creativeInfo, String anchorSubType, String keyword, String iconUrl, UrlModel thumbnail, String popUpTitle, String popUpDescription, String videoGuideUrl, String detailTitle, String detailDescription, String detailBtnTitle, String shootWay, String enterFrom, String enterMethod) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(anchorSubType, "anchorSubType");
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(iconUrl, "iconUrl");
        o.LJIIIZ(thumbnail, "thumbnail");
        o.LJIIIZ(popUpTitle, "popUpTitle");
        o.LJIIIZ(popUpDescription, "popUpDescription");
        o.LJIIIZ(videoGuideUrl, "videoGuideUrl");
        o.LJIIIZ(detailTitle, "detailTitle");
        o.LJIIIZ(detailDescription, "detailDescription");
        o.LJIIIZ(detailBtnTitle, "detailBtnTitle");
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        return new EditorProAnchorConfig(creativeInfo, anchorSubType, keyword, iconUrl, thumbnail, popUpTitle, popUpDescription, videoGuideUrl, detailTitle, detailDescription, detailBtnTitle, shootWay, enterFrom, enterMethod);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.creativeInfo, this.anchorSubType, this.keyword, this.iconUrl, this.thumbnail, this.popUpTitle, this.popUpDescription, this.videoGuideUrl, this.detailTitle, this.detailDescription, this.detailBtnTitle, this.shootWay, this.enterFrom, this.enterMethod};
    }

    public final String getAnchorSubType() {
        return this.anchorSubType;
    }

    public final CreativeInfo getCreativeInfo() {
        return this.creativeInfo;
    }

    public final String getDetailBtnTitle() {
        return this.detailBtnTitle;
    }

    public final String getDetailDescription() {
        return this.detailDescription;
    }

    public final String getDetailTitle() {
        return this.detailTitle;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getPopUpDescription() {
        return this.popUpDescription;
    }

    public final String getPopUpTitle() {
        return this.popUpTitle;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final UrlModel getThumbnail() {
        return this.thumbnail;
    }

    public final String getVideoGuideUrl() {
        return this.videoGuideUrl;
    }

    public final void setAnchorSubType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.anchorSubType = str;
    }

    public final void setCreativeInfo(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "<set-?>");
        this.creativeInfo = creativeInfo;
    }

    public final void setDetailBtnTitle(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.detailBtnTitle = str;
    }

    public final void setDetailDescription(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.detailDescription = str;
    }

    public final void setDetailTitle(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.detailTitle = str;
    }

    public final void setEnterFrom(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.enterFrom = str;
    }

    public final void setEnterMethod(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.enterMethod = str;
    }

    public final void setIconUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.iconUrl = str;
    }

    public final void setKeyword(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.keyword = str;
    }

    public final void setPopUpDescription(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.popUpDescription = str;
    }

    public final void setPopUpTitle(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.popUpTitle = str;
    }

    public final void setThumbnail(UrlModel urlModel) {
        o.LJIIIZ(urlModel, "<set-?>");
        this.thumbnail = urlModel;
    }

    public final void setVideoGuideUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.videoGuideUrl = str;
    }

    public EditorProAnchorConfig(CreativeInfo creativeInfo, String anchorSubType, String keyword, String iconUrl, UrlModel thumbnail, String popUpTitle, String popUpDescription, String videoGuideUrl, String detailTitle, String detailDescription, String detailBtnTitle, String shootWay, String enterFrom, String enterMethod) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(anchorSubType, "anchorSubType");
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(iconUrl, "iconUrl");
        o.LJIIIZ(thumbnail, "thumbnail");
        o.LJIIIZ(popUpTitle, "popUpTitle");
        o.LJIIIZ(popUpDescription, "popUpDescription");
        o.LJIIIZ(videoGuideUrl, "videoGuideUrl");
        o.LJIIIZ(detailTitle, "detailTitle");
        o.LJIIIZ(detailDescription, "detailDescription");
        o.LJIIIZ(detailBtnTitle, "detailBtnTitle");
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        this.creativeInfo = creativeInfo;
        this.anchorSubType = anchorSubType;
        this.keyword = keyword;
        this.iconUrl = iconUrl;
        this.thumbnail = thumbnail;
        this.popUpTitle = popUpTitle;
        this.popUpDescription = popUpDescription;
        this.videoGuideUrl = videoGuideUrl;
        this.detailTitle = detailTitle;
        this.detailDescription = detailDescription;
        this.detailBtnTitle = detailBtnTitle;
        this.shootWay = shootWay;
        this.enterFrom = enterFrom;
        this.enterMethod = enterMethod;
    }

    public /* synthetic */ EditorProAnchorConfig(CreativeInfo creativeInfo, String str, String str2, String str3, UrlModel urlModel, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CreativeInfo(null, 0, null, 7, null) : creativeInfo, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? new UrlModel() : urlModel, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? "ep_anchor" : str10, (i & 4096) != 0 ? "" : str11, (i & FileUtils.BUFFER_SIZE) == 0 ? str12 : "");
    }
}
