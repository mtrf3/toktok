package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public class LinkData implements Serializable {
    public User LJLIL;

    @InterfaceC65349Pkn("avatar_icon")
    public UrlModel avatarIcon;

    @InterfaceC65349Pkn("background_type")
    public int backgroundType;

    @InterfaceC65349Pkn("button_style")
    public int buttonStyle;

    @InterfaceC65349Pkn("button_text")
    public String buttonText;

    @InterfaceC65349Pkn("click_track_url_list")
    public UrlModel clickTrackUrlList;

    @InterfaceC65349Pkn("comment_area")
    public CommentStruct commentArea;

    @InterfaceC65349Pkn("creative_id")
    public String creativeId;

    @InterfaceC65349Pkn("description")
    public String description;

    @InterfaceC65349Pkn("download_url")
    public String downloadUrl;

    @InterfaceC65349Pkn("feed_show_type")
    public int feedShowType;
    public boolean hasDislike;

    @InterfaceC65349Pkn("image_list")
    public List<UrlModel> imageList;

    @InterfaceC65349Pkn("is_preview")
    public boolean isPreview;

    @InterfaceC65349Pkn("label")
    public String label;

    @InterfaceC65349Pkn("label_type")
    public int labelType;
    public int linkType;

    @InterfaceC65349Pkn("log_extra")
    public String logExtra;

    @InterfaceC65349Pkn("mp_url")
    public String mpUrl;

    @InterfaceC65349Pkn("open_url")
    public String openUrl;

    @InterfaceC65349Pkn("package")
    public String packageName;

    @InterfaceC65349Pkn("report_enable")
    public boolean reportEnabled = true;

    @InterfaceC65349Pkn("saiyan_link_type")
    public int saiyanLinkType;

    @InterfaceC65349Pkn("show_close_tips")
    public boolean showCloseTips;

    @InterfaceC65349Pkn("show_type")
    public int showType;

    @InterfaceC65349Pkn("source")
    public String source;

    @InterfaceC65349Pkn("tips_schema")
    public String tipsSchema;

    @InterfaceC65349Pkn("tips_text")
    public String tipsText;

    @InterfaceC65349Pkn("tips_type")
    public int tipsType;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("track_url_list")
    public UrlModel trackUrlList;

    @InterfaceC65349Pkn("type")
    public String type;

    @InterfaceC65349Pkn("web_title")
    public String webTitle;

    @InterfaceC65349Pkn("web_url")
    public String webUrl;

    /* loaded from: classes4.dex */
    public static class CommentStruct implements Serializable {

        @InterfaceC65349Pkn("avatar_icon")
        public UrlModel avatarIcon;

        @InterfaceC65349Pkn("feature_label")
        public String featureLabel;

        @InterfaceC65349Pkn("title")
        public String title;
    }

    public UrlModel getCommentAvatarIcon() {
        UrlModel urlModel;
        CommentStruct commentStruct = this.commentArea;
        if (commentStruct != null && (urlModel = commentStruct.avatarIcon) != null) {
            return urlModel;
        }
        return this.avatarIcon;
    }

    public boolean showOnComment() {
        CommentStruct commentStruct;
        int i = this.showType;
        if ((i == 0 || i == 2) && (commentStruct = this.commentArea) != null && commentStruct.title != null && commentStruct.featureLabel != null) {
            return true;
        }
        return false;
    }

    public boolean showOnFeed() {
        int i = this.showType;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    public UrlModel getClickTrackUrlList() {
        return this.clickTrackUrlList;
    }

    public List<UrlModel> getImageList() {
        return this.imageList;
    }

    public int getLinkType() {
        return this.linkType;
    }

    public UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public User getUser() {
        return this.LJLIL;
    }

    public boolean isHasDislike() {
        return this.hasDislike;
    }

    public void setClickTrackUrlList(UrlModel urlModel) {
        this.clickTrackUrlList = urlModel;
    }

    public void setHasDislike(boolean z) {
        this.hasDislike = z;
    }

    public void setLinkType(int i) {
        this.linkType = i;
    }

    public void setTrackUrlList(UrlModel urlModel) {
        this.trackUrlList = urlModel;
    }

    public void setUser(User user) {
        this.LJLIL = user;
    }
}
