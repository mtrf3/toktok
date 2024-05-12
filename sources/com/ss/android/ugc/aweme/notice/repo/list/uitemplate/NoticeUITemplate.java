package com.ss.android.ugc.aweme.notice.repo.list.uitemplate;

import X.C07670Rv;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NoticeUITemplate {

    @InterfaceC65349Pkn("avatar_badge_url")
    public final UrlModel avatarBadgeUrl;

    @InterfaceC65349Pkn("avatar_cover_url")
    public final UrlModel avatarCoverUrl;

    @InterfaceC65349Pkn("avatar_image_url")
    public final UrlModel avatarImageUrl;

    @InterfaceC65349Pkn("avatar_schema_url")
    public final String avatarSchemaUrl;

    @InterfaceC65349Pkn("banner_image_url")
    public final UrlModel bannerImageUrl;

    @InterfaceC65349Pkn("banner_schema_url")
    public final String bannerSchemaUrl;

    @InterfaceC65349Pkn("buttons")
    public final List<NoticeUITemplateButton> bottomButtons;

    @InterfaceC65349Pkn("button_content")
    public final String buttonContent;

    @InterfaceC65349Pkn("button_type")
    public final Integer buttonType;

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("content_text_link_configs")
    public final List<TextLinkConfig> contentTextLinkConfigs;

    @InterfaceC65349Pkn("event")
    public final String event;

    @InterfaceC65349Pkn("label")
    public final LabelInfoTemplate labelInfo;

    @InterfaceC65349Pkn("middle_image_schemas")
    public final List<String> middleImageSchemas;

    @InterfaceC65349Pkn("middle_image_urls")
    public final List<UrlModel> middleImageUrls;

    @InterfaceC65349Pkn("middle_schema_url")
    public final String middleSchemaUrl;

    @InterfaceC65349Pkn("middle_type")
    public final int middleType;

    @InterfaceC65349Pkn("quote_content")
    public final String quoteContent;

    @InterfaceC65349Pkn("quote_image")
    public final UrlModel quoteImage;

    @InterfaceC65349Pkn("right_icon_url")
    public final UrlModel rightIconUrl;

    @InterfaceC65349Pkn("image_url")
    public final UrlModel rightImageUrl;

    @InterfaceC65349Pkn("right_schema_url")
    public final String rightSchemaUrl;

    @InterfaceC65349Pkn("right_type")
    public final int rightType;

    @InterfaceC65349Pkn("title")
    public final TitleTemplate titleTemplate;

    @InterfaceC65349Pkn("toast_text")
    public final String toastText;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeUITemplate)) {
            return false;
        }
        NoticeUITemplate noticeUITemplate = (NoticeUITemplate) obj;
        return o.LJ(this.avatarImageUrl, noticeUITemplate.avatarImageUrl) && o.LJ(this.avatarSchemaUrl, noticeUITemplate.avatarSchemaUrl) && o.LJ(this.avatarCoverUrl, noticeUITemplate.avatarCoverUrl) && this.middleType == noticeUITemplate.middleType && o.LJ(this.titleTemplate, noticeUITemplate.titleTemplate) && o.LJ(this.labelInfo, noticeUITemplate.labelInfo) && o.LJ(this.content, noticeUITemplate.content) && o.LJ(this.event, noticeUITemplate.event) && o.LJ(this.quoteContent, noticeUITemplate.quoteContent) && o.LJ(this.quoteImage, noticeUITemplate.quoteImage) && o.LJ(this.middleImageUrls, noticeUITemplate.middleImageUrls) && o.LJ(this.middleSchemaUrl, noticeUITemplate.middleSchemaUrl) && o.LJ(this.middleImageSchemas, noticeUITemplate.middleImageSchemas) && this.rightType == noticeUITemplate.rightType && o.LJ(this.rightImageUrl, noticeUITemplate.rightImageUrl) && o.LJ(this.rightIconUrl, noticeUITemplate.rightIconUrl) && o.LJ(this.buttonContent, noticeUITemplate.buttonContent) && o.LJ(this.buttonType, noticeUITemplate.buttonType) && o.LJ(this.rightSchemaUrl, noticeUITemplate.rightSchemaUrl) && o.LJ(this.contentTextLinkConfigs, noticeUITemplate.contentTextLinkConfigs) && o.LJ(this.bottomButtons, noticeUITemplate.bottomButtons) && o.LJ(this.bannerImageUrl, noticeUITemplate.bannerImageUrl) && o.LJ(this.bannerSchemaUrl, noticeUITemplate.bannerSchemaUrl) && o.LJ(this.avatarBadgeUrl, noticeUITemplate.avatarBadgeUrl) && o.LJ(this.toastText, noticeUITemplate.toastText);
    }

    public final int hashCode() {
        UrlModel urlModel = this.avatarImageUrl;
        int hashCode = (urlModel == null ? 0 : urlModel.hashCode()) * 31;
        String str = this.avatarSchemaUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        UrlModel urlModel2 = this.avatarCoverUrl;
        int hashCode3 = (((hashCode2 + (urlModel2 == null ? 0 : urlModel2.hashCode())) * 31) + this.middleType) * 31;
        TitleTemplate titleTemplate = this.titleTemplate;
        int hashCode4 = (hashCode3 + (titleTemplate == null ? 0 : titleTemplate.hashCode())) * 31;
        LabelInfoTemplate labelInfoTemplate = this.labelInfo;
        int hashCode5 = (hashCode4 + (labelInfoTemplate == null ? 0 : labelInfoTemplate.hashCode())) * 31;
        String str2 = this.content;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.event;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.quoteContent;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        UrlModel urlModel3 = this.quoteImage;
        int hashCode9 = (hashCode8 + (urlModel3 == null ? 0 : urlModel3.hashCode())) * 31;
        List<UrlModel> list = this.middleImageUrls;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.middleSchemaUrl;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list2 = this.middleImageSchemas;
        int hashCode12 = (((hashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.rightType) * 31;
        UrlModel urlModel4 = this.rightImageUrl;
        int hashCode13 = (hashCode12 + (urlModel4 == null ? 0 : urlModel4.hashCode())) * 31;
        UrlModel urlModel5 = this.rightIconUrl;
        int hashCode14 = (hashCode13 + (urlModel5 == null ? 0 : urlModel5.hashCode())) * 31;
        String str6 = this.buttonContent;
        int hashCode15 = (hashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.buttonType;
        int hashCode16 = (hashCode15 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.rightSchemaUrl;
        int hashCode17 = (hashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<TextLinkConfig> list3 = this.contentTextLinkConfigs;
        int hashCode18 = (hashCode17 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<NoticeUITemplateButton> list4 = this.bottomButtons;
        int hashCode19 = (hashCode18 + (list4 == null ? 0 : list4.hashCode())) * 31;
        UrlModel urlModel6 = this.bannerImageUrl;
        int hashCode20 = (hashCode19 + (urlModel6 == null ? 0 : urlModel6.hashCode())) * 31;
        String str8 = this.bannerSchemaUrl;
        int hashCode21 = (hashCode20 + (str8 == null ? 0 : str8.hashCode())) * 31;
        UrlModel urlModel7 = this.avatarBadgeUrl;
        int hashCode22 = (hashCode21 + (urlModel7 == null ? 0 : urlModel7.hashCode())) * 31;
        String str9 = this.toastText;
        return hashCode22 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NoticeUITemplate(avatarImageUrl=");
        sb.append(this.avatarImageUrl);
        sb.append(", avatarSchemaUrl=");
        sb.append(this.avatarSchemaUrl);
        sb.append(", avatarCoverUrl=");
        sb.append(this.avatarCoverUrl);
        sb.append(", middleType=");
        sb.append(this.middleType);
        sb.append(", titleTemplate=");
        sb.append(this.titleTemplate);
        sb.append(", labelInfo=");
        sb.append(this.labelInfo);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", event=");
        sb.append(this.event);
        sb.append(", quoteContent=");
        sb.append(this.quoteContent);
        sb.append(", quoteImage=");
        sb.append(this.quoteImage);
        sb.append(", middleImageUrls=");
        sb.append(this.middleImageUrls);
        sb.append(", middleSchemaUrl=");
        sb.append(this.middleSchemaUrl);
        sb.append(", middleImageSchemas=");
        sb.append(this.middleImageSchemas);
        sb.append(", rightType=");
        sb.append(this.rightType);
        sb.append(", rightImageUrl=");
        sb.append(this.rightImageUrl);
        sb.append(", rightIconUrl=");
        sb.append(this.rightIconUrl);
        sb.append(", buttonContent=");
        sb.append(this.buttonContent);
        sb.append(", buttonType=");
        sb.append(this.buttonType);
        sb.append(", rightSchemaUrl=");
        sb.append(this.rightSchemaUrl);
        sb.append(", contentTextLinkConfigs=");
        sb.append(this.contentTextLinkConfigs);
        sb.append(", bottomButtons=");
        sb.append(this.bottomButtons);
        sb.append(", bannerImageUrl=");
        sb.append(this.bannerImageUrl);
        sb.append(", bannerSchemaUrl=");
        sb.append(this.bannerSchemaUrl);
        sb.append(", avatarBadgeUrl=");
        sb.append(this.avatarBadgeUrl);
        sb.append(", toastText=");
        return C07670Rv.LIZIZ(sb, this.toastText, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NoticeUITemplate(UrlModel urlModel, String str, UrlModel urlModel2, int i, TitleTemplate titleTemplate, LabelInfoTemplate labelInfoTemplate, String str2, String str3, String str4, UrlModel urlModel3, List<? extends UrlModel> list, String str5, List<String> list2, int i2, UrlModel urlModel4, UrlModel urlModel5, String str6, Integer num, String str7, List<TextLinkConfig> list3, List<NoticeUITemplateButton> list4, UrlModel urlModel6, String str8, UrlModel urlModel7, String str9) {
        this.avatarImageUrl = urlModel;
        this.avatarSchemaUrl = str;
        this.avatarCoverUrl = urlModel2;
        this.middleType = i;
        this.titleTemplate = titleTemplate;
        this.labelInfo = labelInfoTemplate;
        this.content = str2;
        this.event = str3;
        this.quoteContent = str4;
        this.quoteImage = urlModel3;
        this.middleImageUrls = list;
        this.middleSchemaUrl = str5;
        this.middleImageSchemas = list2;
        this.rightType = i2;
        this.rightImageUrl = urlModel4;
        this.rightIconUrl = urlModel5;
        this.buttonContent = str6;
        this.buttonType = num;
        this.rightSchemaUrl = str7;
        this.contentTextLinkConfigs = list3;
        this.bottomButtons = list4;
        this.bannerImageUrl = urlModel6;
        this.bannerSchemaUrl = str8;
        this.avatarBadgeUrl = urlModel7;
        this.toastText = str9;
    }
}
