package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* loaded from: classes4.dex */
public class CommentStruct extends Comment {
    public static final long serialVersionUID = 1075399560205544614L;
    public int LJLIL;
    public String LJLILLLLZI;
    public AwemeRawAd LJLJI;
    public boolean LJLJJI;

    @InterfaceC65349Pkn("avatar_icon")
    public UrlModel avatarIcon;

    @InterfaceC65349Pkn("button_text")
    public String buttonText;

    @InterfaceC65349Pkn("comment_info")
    public String commentInfo;

    @InterfaceC65349Pkn("comment_nickname")
    public String commentNickName;

    @InterfaceC65349Pkn("comment_style")
    public int commentStyle;

    @InterfaceC65349Pkn("comment_time")
    public long commentTime;

    @InterfaceC65349Pkn("mock_count")
    public int mockCount;

    @InterfaceC65349Pkn("mock_creator")
    public int mockCreator;

    @InterfaceC65349Pkn("show_button_number")
    public int showButtonNumber;

    @InterfaceC65349Pkn("show_comment_number")
    public int showCommentNumber;

    @InterfaceC65349Pkn("source")
    public String source;

    @InterfaceC65349Pkn("tag_text")
    public String tagText;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("type")
    public int type;

    public boolean showAsDefault() {
        if (this.mockCount == 1) {
            return true;
        }
        return false;
    }

    public boolean showCreatorTag() {
        if (this.mockCreator == 1) {
            return true;
        }
        return false;
    }

    public String getAid() {
        return this.LJLILLLLZI;
    }

    public UrlModel getAvatarIcon() {
        return this.avatarIcon;
    }

    public int getAvatarSize() {
        return this.LJLIL;
    }

    public AwemeRawAd getAwemeRawAd() {
        return this.LJLJI;
    }

    public String getButtonText() {
        return this.buttonText;
    }

    public String getCommentInfo() {
        return this.commentInfo;
    }

    public String getCommentNickName() {
        return this.commentNickName;
    }

    public int getCommentStyle() {
        return this.commentStyle;
    }

    public long getCommentTime() {
        return this.commentTime;
    }

    public int getShowButtonNumber() {
        return this.showButtonNumber;
    }

    public int getShowCommentNumber() {
        return this.showCommentNumber;
    }

    public String getSource() {
        return this.source;
    }

    public String getTagText() {
        return this.tagText;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public boolean isAdFake() {
        return this.LJLJJI;
    }

    public CommentStruct setAdFake(boolean z) {
        this.LJLJJI = z;
        return this;
    }

    public CommentStruct setAid(String str) {
        this.LJLILLLLZI = str;
        return this;
    }

    public void setAvatarIcon(UrlModel urlModel) {
        this.avatarIcon = urlModel;
    }

    public void setAvatarSize(int i) {
        this.LJLIL = i;
    }

    public CommentStruct setAwemeRawAd(AwemeRawAd awemeRawAd) {
        this.LJLJI = awemeRawAd;
        return this;
    }

    public void setButtonText(String str) {
        this.buttonText = str;
    }

    public void setCommentInfo(String str) {
        this.commentInfo = str;
    }

    public void setCommentNickName(String str) {
        this.commentNickName = str;
    }

    public void setCommentStyle(int i) {
        this.commentStyle = i;
    }

    public void setCommentTime(long j) {
        this.commentTime = j;
    }

    public void setShowButtonNumber(int i) {
        this.showButtonNumber = i;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
