package com.ss.android.ugc.aweme.comment.model;

import X.AbstractC36908Ee8;
import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class Comment extends AbstractC36908Ee8 implements Serializable, Cloneable {
    public static final long serialVersionUID = -8417684736500467488L;

    @InterfaceC65349Pkn("ad_flag")
    public int adFlag;

    @InterfaceC65349Pkn("alias_aweme")
    public Aweme aliasAweme;

    @InterfaceC65349Pkn("author_pin")
    public boolean authorPin;

    @InterfaceC65349Pkn("aweme_id")
    public String awemeId;

    @InterfaceC65349Pkn("cid")
    public String cid;

    @InterfaceC65349Pkn("collect_stat")
    public int collectStat;

    @InterfaceC65349Pkn("comment_language")
    public String commentLanguage;

    @InterfaceC65349Pkn("comment_type")
    public int commentStructType;

    @InterfaceC65349Pkn("commerce_info")
    public CommerceCommentStruct commerceInfo;

    @InterfaceC65349Pkn("create_time")
    public int createTime;

    @InterfaceC65349Pkn("digg_count")
    public int diggCount;
    public transient long fakeGiftId;
    public transient boolean fakeIsFromGiftBag;

    @InterfaceC65349Pkn("forward_id")
    public String forwardId;

    @InterfaceC65349Pkn("gift")
    public CommentGiftStruct gift;
    public transient boolean ignoreToast;

    @InterfaceC65349Pkn("image_list")
    public List<CommentImageStruct> imageList;

    @InterfaceC65349Pkn("is_author_digged")
    public boolean isAuthorDigged;
    public boolean isExpand;
    public transient boolean isStoryEmojiComment;
    public boolean isTranslated;

    @InterfaceC65349Pkn("label_info")
    public String labelInfo;

    @InterfaceC65349Pkn("label_text")
    public String labelText;

    @InterfaceC65349Pkn("label_type")
    public int labelType;
    public LogPbBean logPb;
    public int mCommentType;

    @InterfaceC65349Pkn("label_list")
    public List<CommentLabel> mLabelList;
    public boolean mNeedHint;
    public String mTimeDesc;
    public String mUserNamePrefix;
    public boolean needCollapse;
    public boolean needHighlight;
    public transient int offset;
    public String parentCommentId;
    public transient int publishScenario;

    @InterfaceC65349Pkn("qrec_virtual_enable")
    public String qrecVirtualEnable;

    @InterfaceC65349Pkn("relation_label")
    public RelationDynamicLabel relationLabel;

    @InterfaceC65349Pkn("reply_comment_total")
    public long replyCommentTotal;

    @InterfaceC65349Pkn("reply_comment")
    public List<Comment> replyComments;

    @InterfaceC65349Pkn("reply_id")
    public String replyId;

    @InterfaceC65349Pkn("reply_to_nickname")
    public String replyToNickName;

    @InterfaceC65349Pkn("reply_to_reply_id")
    public String replyToReplyId;

    @InterfaceC65349Pkn("reply_to_userid")
    public String replyToUserId;

    @InterfaceC65349Pkn("reply_to_username")
    public String replyToUserName;

    @InterfaceC65349Pkn("share_info")
    public CommentShareInfo shareInfo;
    public transient boolean shouldDisplayFakeComment;

    @InterfaceC65349Pkn("stick_position")
    public int stickPosition;

    @InterfaceC65349Pkn("text")
    public String text;

    @InterfaceC65349Pkn("text_extra")
    public List<TextExtraStruct> textExtra;

    @InterfaceC65349Pkn("reply_collapse_count")
    public Integer topCount;

    @InterfaceC65349Pkn("trans_btn_style")
    public int transBtnStyle;

    @InterfaceC65349Pkn("translated_text")
    public String translatedText;

    @InterfaceC65349Pkn("user")
    public User user;

    @InterfaceC65349Pkn("user_buried")
    public int userBuried;

    @InterfaceC65349Pkn("user_digged")
    public int userDigged;

    @InterfaceC65349Pkn("status")
    public int status = -1;
    public transient String giftEffectPath = "";
    public int parentCommentType = 1;
    public transient String fakeId = "";
    public transient int postStatus = -1;
    public transient String timeFormat = "";
    public transient String noticeRepliedCid = "";

    /* loaded from: classes4.dex */
    public interface CommentTranslateBtnType {
    }

    /* loaded from: classes4.dex */
    public interface LabelType {
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Comment m103clone() {
        RelationDynamicLabel relationDynamicLabel;
        Comment comment = new Comment();
        comment.cid = this.cid;
        comment.text = this.text;
        comment.awemeId = this.awemeId;
        comment.createTime = this.createTime;
        comment.diggCount = this.diggCount;
        comment.status = this.status;
        comment.user = this.user;
        comment.replyId = this.replyId;
        comment.userDigged = this.userDigged;
        comment.qrecVirtualEnable = this.qrecVirtualEnable;
        if (this.replyComments != null) {
            ArrayList arrayList = new ArrayList(this.replyComments.size());
            Iterator<Comment> it = this.replyComments.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m103clone());
            }
            comment.replyComments = arrayList;
        }
        if (this.textExtra != null) {
            ArrayList arrayList2 = new ArrayList(this.textExtra.size());
            Iterator<TextExtraStruct> it2 = this.textExtra.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().m142clone());
            }
            comment.textExtra = arrayList2;
        }
        comment.labelText = this.labelText;
        comment.labelType = this.labelType;
        if (this.relationLabel == null) {
            relationDynamicLabel = null;
        } else {
            relationDynamicLabel = new RelationDynamicLabel() { // from class: com.ss.android.ugc.aweme.comment.model.Comment.1
                {
                    setNickname(Comment.this.relationLabel.getNickname());
                    setLabelInfo(Comment.this.relationLabel.getLabelInfo());
                    setUserId(Comment.this.relationLabel.getUserId());
                    setCount(Comment.this.relationLabel.getCount());
                }
            };
        }
        comment.relationLabel = relationDynamicLabel;
        comment.forwardId = this.forwardId;
        comment.replyCommentTotal = this.replyCommentTotal;
        comment.replyToReplyId = this.replyToReplyId;
        comment.replyToUserName = this.replyToUserName;
        comment.replyToUserId = this.replyToUserId;
        comment.mCommentType = this.mCommentType;
        comment.commentStructType = this.commentStructType;
        comment.stickPosition = this.stickPosition;
        comment.aliasAweme = this.aliasAweme;
        comment.mLabelList = this.mLabelList;
        comment.topCount = this.topCount;
        comment.commerceInfo = this.commerceInfo;
        comment.transBtnStyle = this.transBtnStyle;
        comment.translatedText = this.translatedText;
        return comment;
    }

    public int getCommentMediaType() {
        List<CommentImageStruct> list = this.imageList;
        if (list != null && !list.isEmpty()) {
            return 1;
        }
        return 0;
    }

    public String getDirectReplyCid() {
        if (!TextUtils.isEmpty(this.replyToReplyId) && !CardStruct.IStatusCode.DEFAULT.equals(this.replyToReplyId)) {
            return this.replyToReplyId;
        }
        if (!TextUtils.isEmpty(this.replyId) && !CardStruct.IStatusCode.DEFAULT.equals(this.replyId)) {
            return this.replyId;
        }
        return "";
    }

    public String getFakeId() {
        String str = this.fakeId;
        if (str == null) {
            return "";
        }
        return str;
    }

    public int getIsPhotoContained() {
        List<CommentImageStruct> list = this.imageList;
        if (list != null && !list.isEmpty()) {
            return 1;
        }
        return 0;
    }

    public int hashCode() {
        String str = this.cid;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean isCollected() {
        if (this.collectStat == 1) {
            return true;
        }
        return false;
    }

    public boolean isUserBuried() {
        if (this.userBuried == 1) {
            return true;
        }
        return false;
    }

    public boolean isUserDigged() {
        if (this.userDigged == 1) {
            return true;
        }
        return false;
    }

    public int getAdFlag() {
        return this.adFlag;
    }

    public Aweme getAliasAweme() {
        return this.aliasAweme;
    }

    public String getAwemeId() {
        return this.awemeId;
    }

    public String getCid() {
        return this.cid;
    }

    public String getCommentLanguage() {
        return this.commentLanguage;
    }

    public int getCommentStructType() {
        return this.commentStructType;
    }

    public int getCommentType() {
        return this.mCommentType;
    }

    public CommerceCommentStruct getCommerceInfo() {
        return this.commerceInfo;
    }

    public int getCreateTime() {
        return this.createTime;
    }

    public int getDiggCount() {
        return this.diggCount;
    }

    public long getFakeGiftId() {
        return this.fakeGiftId;
    }

    public boolean getFakeIsFromGiftBag() {
        return this.fakeIsFromGiftBag;
    }

    public String getForwardId() {
        return this.forwardId;
    }

    public CommentGiftStruct getGift() {
        return this.gift;
    }

    public String getGiftEffectPath() {
        return this.giftEffectPath;
    }

    public List<CommentImageStruct> getImageList() {
        return this.imageList;
    }

    public String getLabelInfo() {
        return this.labelInfo;
    }

    public List<CommentLabel> getLabelList() {
        return this.mLabelList;
    }

    public String getLabelText() {
        return this.labelText;
    }

    public int getLabelType() {
        return this.labelType;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public String getNoticeRepliedCid() {
        return this.noticeRepliedCid;
    }

    public int getPostStatus() {
        return this.postStatus;
    }

    public int getPublishScenario() {
        return this.publishScenario;
    }

    public String getQrecVirtualEnable() {
        return this.qrecVirtualEnable;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public long getReplyCommentTotal() {
        return this.replyCommentTotal;
    }

    public List<Comment> getReplyComments() {
        return this.replyComments;
    }

    public String getReplyId() {
        return this.replyId;
    }

    public String getReplyToNickName() {
        return this.replyToNickName;
    }

    public String getReplyToReplyCommentId() {
        return this.replyToReplyId;
    }

    public String getReplyToUserId() {
        return this.replyToUserId;
    }

    public String getReplyToUserName() {
        return this.replyToUserName;
    }

    public CommentShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public boolean getShouldDisplayFakeComment() {
        return this.shouldDisplayFakeComment;
    }

    public int getStatus() {
        return this.status;
    }

    public int getStickPosition() {
        return this.stickPosition;
    }

    public String getText() {
        return this.text;
    }

    public List<TextExtraStruct> getTextExtra() {
        return this.textExtra;
    }

    public String getTimeFormat() {
        return this.timeFormat;
    }

    public Integer getTopCount() {
        return this.topCount;
    }

    public int getTransBtnStyle() {
        return this.transBtnStyle;
    }

    public String getTranslatedText() {
        return this.translatedText;
    }

    public User getUser() {
        return this.user;
    }

    public int getUserBuried() {
        return this.userBuried;
    }

    public int getUserDigged() {
        return this.userDigged;
    }

    public boolean isAuthorDigged() {
        return this.isAuthorDigged;
    }

    public boolean isAuthorPin() {
        return this.authorPin;
    }

    public boolean isIgnoreToast() {
        return this.ignoreToast;
    }

    public boolean isNeedHint() {
        return this.mNeedHint;
    }

    public boolean isStoryEmojiComment() {
        return this.isStoryEmojiComment;
    }

    public boolean isTranslated() {
        return this.isTranslated;
    }

    public static String getAuthorUid(Comment comment) {
        User user;
        if (comment == null || (user = comment.getUser()) == null) {
            return "";
        }
        return user.getUid();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.cid, ((Comment) obj).cid);
    }

    public void setAliasAweme(Aweme aweme) {
        this.aliasAweme = aweme;
    }

    public void setAuthorDigged(boolean z) {
        this.isAuthorDigged = z;
    }

    public void setAuthorPin(boolean z) {
        this.authorPin = z;
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setCollectStatus(int i) {
        this.collectStat = i;
    }

    public void setCommentStructType(int i) {
        this.commentStructType = i;
    }

    public void setCommentType(int i) {
        this.mCommentType = i;
    }

    public void setCommerceInfo(CommerceCommentStruct commerceCommentStruct) {
        this.commerceInfo = commerceCommentStruct;
    }

    public void setCreateTime(int i) {
        this.createTime = i;
    }

    public void setDiggCount(int i) {
        this.diggCount = i;
    }

    public void setFakeGiftId(long j) {
        this.fakeGiftId = j;
    }

    public void setFakeId(String str) {
        this.fakeId = str;
    }

    public void setFakeIsFromGiftBag(boolean z) {
        this.fakeIsFromGiftBag = z;
    }

    public void setForwardId(String str) {
        this.forwardId = str;
    }

    public void setGift(CommentGiftStruct commentGiftStruct) {
        this.gift = commentGiftStruct;
    }

    public void setGiftEffectPath(String str) {
        this.giftEffectPath = str;
    }

    public void setIgnoreToast(boolean z) {
        this.ignoreToast = z;
    }

    public void setImageList(List<CommentImageStruct> list) {
        this.imageList = list;
    }

    public void setLabelInfo(String str) {
        this.labelInfo = str;
    }

    public void setLabelList(List<CommentLabel> list) {
        this.mLabelList = list;
    }

    public void setLabelText(String str) {
        this.labelText = str;
    }

    public void setLabelType(int i) {
        this.labelType = i;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setNeedHint(boolean z) {
        this.mNeedHint = z;
    }

    public void setNoticeRepliedCid(String str) {
        this.noticeRepliedCid = str;
    }

    public void setPostStatus(int i) {
        this.postStatus = i;
    }

    public void setPublishScenario(int i) {
        this.publishScenario = i;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setReplyCommentTotal(long j) {
        this.replyCommentTotal = j;
    }

    public void setReplyComments(List<Comment> list) {
        this.replyComments = list;
    }

    public void setReplyId(String str) {
        this.replyId = str;
    }

    public void setReplyToNickName(String str) {
        this.replyToNickName = str;
    }

    public void setReplyToReplyId(String str) {
        this.replyToReplyId = str;
    }

    public void setReplyToUserId(String str) {
        this.replyToUserId = str;
    }

    public void setReplyToUserName(String str) {
        this.replyToUserName = str;
    }

    public void setShareInfo(CommentShareInfo commentShareInfo) {
        this.shareInfo = commentShareInfo;
    }

    public void setShouldDisplayFakeComment(boolean z) {
        this.shouldDisplayFakeComment = z;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStickPosition(int i) {
        this.stickPosition = i;
    }

    public void setStoryEmojiComment(boolean z) {
        this.isStoryEmojiComment = z;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTextExtra(List<TextExtraStruct> list) {
        this.textExtra = list;
    }

    public void setTimeFormat(String str) {
        this.timeFormat = str;
    }

    public void setTransBtnStyle(int i) {
        this.transBtnStyle = i;
    }

    public void setTranslated(boolean z) {
        this.isTranslated = z;
    }

    public void setTranslatedText(String str) {
        this.translatedText = str;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUserBuried(int i) {
        this.userBuried = i;
    }

    public void setUserDigged(int i) {
        this.userDigged = i;
    }
}
