package com.ss.android.ugc.aweme.feed.model.upvote;

import X.C08880Wm;
import X.C61878OQg;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.ORY;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentGiftStruct;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class UpvoteStruct implements Serializable {

    @InterfaceC65349Pkn("bubble_hidden")
    public final boolean bubbleHidden;
    public UpvoteCacheState cacheState;

    @InterfaceC65349Pkn("collect_stat")
    public final int collectStat;

    @InterfaceC65349Pkn("comment_id")
    public final String commentId;

    @InterfaceC65349Pkn("create_time")
    public final long createTime;

    @InterfaceC65349Pkn("gift")
    public final CommentGiftStruct gift;

    @InterfaceC65349Pkn("image_list")
    public List<CommentImageStruct> imageList;

    @InterfaceC65349Pkn("is_author_liked")
    public final boolean isAuthorLiked;

    @InterfaceC65349Pkn("author_pin")
    public final boolean isAuthorPin;

    @InterfaceC65349Pkn("item_id")
    public final String itemId;

    @InterfaceC65349Pkn("like_count")
    public int likeCount;
    public boolean myNewUpvote;

    @InterfaceC65349Pkn("reply_comment_total")
    public final long replyCommentTotal;

    @InterfaceC65349Pkn("reply_comment")
    public final List<Comment> replyComments;
    public UpvoteCacheState repostState;

    @InterfaceC65349Pkn("status")
    public final int status;

    @InterfaceC65349Pkn("text")
    public String text;

    @InterfaceC65349Pkn("text_extra")
    public List<? extends TextExtraStruct> textExtra;

    @InterfaceC65349Pkn("total")
    public final int total;

    @InterfaceC65349Pkn("trans_btn_style")
    public final int transBtnStyle;

    @InterfaceC65349Pkn("upvote_label_type")
    public final int upvoteLabelType;

    @InterfaceC65349Pkn("upvote_with_photo")
    public final boolean upvoteWithPhoto;

    @InterfaceC65349Pkn("user")
    public final User user;

    @InterfaceC65349Pkn("user_buried")
    public final boolean userBuried;

    @InterfaceC65349Pkn("user_liked")
    public boolean userLiked;

    @InterfaceC65349Pkn("user_list")
    public final List<User> userList;

    public static /* synthetic */ UpvoteStruct copy$default(UpvoteStruct upvoteStruct, String str, String str2, String str3, long j, int i, int i2, User user, boolean z, int i3, boolean z2, List list, int i4, boolean z3, List list2, List list3, boolean z4, List list4, long j2, boolean z5, int i5, int i6, CommentGiftStruct commentGiftStruct, boolean z6, UpvoteCacheState upvoteCacheState, UpvoteCacheState upvoteCacheState2, boolean z7, int i7, Object obj) {
        List list5 = list;
        boolean z8 = z2;
        int i8 = i3;
        boolean z9 = z;
        User user2 = user;
        String str4 = str2;
        String str5 = str;
        String str6 = str3;
        int i9 = i4;
        long j3 = j;
        boolean z10 = z3;
        int i10 = i;
        int i11 = i2;
        boolean z11 = z7;
        UpvoteCacheState upvoteCacheState3 = upvoteCacheState2;
        int i12 = i5;
        boolean z12 = z6;
        List list6 = list3;
        int i13 = i6;
        boolean z13 = z5;
        List list7 = list2;
        UpvoteCacheState upvoteCacheState4 = upvoteCacheState;
        boolean z14 = z4;
        List list8 = list4;
        CommentGiftStruct commentGiftStruct2 = commentGiftStruct;
        long j4 = j2;
        if ((i7 & 1) != 0) {
            str5 = upvoteStruct.commentId;
        }
        if ((i7 & 2) != 0) {
            str4 = upvoteStruct.text;
        }
        if ((i7 & 4) != 0) {
            str6 = upvoteStruct.itemId;
        }
        if ((i7 & 8) != 0) {
            j3 = upvoteStruct.createTime;
        }
        if ((i7 & 16) != 0) {
            i10 = upvoteStruct.likeCount;
        }
        if ((i7 & 32) != 0) {
            i11 = upvoteStruct.status;
        }
        if ((i7 & 64) != 0) {
            user2 = upvoteStruct.user;
        }
        if ((i7 & 128) != 0) {
            z9 = upvoteStruct.userLiked;
        }
        if ((i7 & 256) != 0) {
            i8 = upvoteStruct.upvoteLabelType;
        }
        if ((i7 & 512) != 0) {
            z8 = upvoteStruct.isAuthorLiked;
        }
        if ((i7 & 1024) != 0) {
            list5 = upvoteStruct.userList;
        }
        if ((i7 & 2048) != 0) {
            i9 = upvoteStruct.total;
        }
        if ((i7 & 4096) != 0) {
            z10 = upvoteStruct.bubbleHidden;
        }
        if ((i7 & FileUtils.BUFFER_SIZE) != 0) {
            list7 = upvoteStruct.textExtra;
        }
        if ((i7 & 16384) != 0) {
            list6 = upvoteStruct.imageList;
        }
        if ((32768 & i7) != 0) {
            z14 = upvoteStruct.upvoteWithPhoto;
        }
        if ((65536 & i7) != 0) {
            list8 = upvoteStruct.replyComments;
        }
        if ((131072 & i7) != 0) {
            j4 = upvoteStruct.replyCommentTotal;
        }
        if ((262144 & i7) != 0) {
            z13 = upvoteStruct.userBuried;
        }
        if ((524288 & i7) != 0) {
            i12 = upvoteStruct.collectStat;
        }
        if ((1048576 & i7) != 0) {
            i13 = upvoteStruct.transBtnStyle;
        }
        if ((2097152 & i7) != 0) {
            commentGiftStruct2 = upvoteStruct.gift;
        }
        if ((4194304 & i7) != 0) {
            z12 = upvoteStruct.isAuthorPin;
        }
        if ((8388608 & i7) != 0) {
            upvoteCacheState4 = upvoteStruct.cacheState;
        }
        if ((16777216 & i7) != 0) {
            upvoteCacheState3 = upvoteStruct.repostState;
        }
        if ((i7 & 33554432) != 0) {
            z11 = upvoteStruct.myNewUpvote;
        }
        UpvoteCacheState upvoteCacheState5 = upvoteCacheState3;
        boolean z15 = z11;
        return upvoteStruct.copy(str5, str4, str6, j3, i10, i11, user2, z9, i8, z8, list5, i9, z10, list7, list6, z14, list8, j4, z13, i12, i13, commentGiftStruct2, z12, upvoteCacheState4, upvoteCacheState5, z15);
    }

    public final UpvoteStruct copy(String commentId, String str, String itemId, long j, int i, int i2, User user, boolean z, int i3, boolean z2, List<? extends User> list, int i4, boolean z3, List<? extends TextExtraStruct> list2, List<CommentImageStruct> list3, boolean z4, List<Comment> list4, long j2, boolean z5, int i5, int i6, CommentGiftStruct commentGiftStruct, boolean z6, UpvoteCacheState upvoteCacheState, UpvoteCacheState upvoteCacheState2, boolean z7) {
        o.LJIIIZ(commentId, "commentId");
        o.LJIIIZ(itemId, "itemId");
        return new UpvoteStruct(commentId, str, itemId, j, i, i2, user, z, i3, z2, list, i4, z3, list2, list3, z4, list4, j2, z5, i5, i6, commentGiftStruct, z6, upvoteCacheState, upvoteCacheState2, z7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpvoteStruct)) {
            return false;
        }
        UpvoteStruct upvoteStruct = (UpvoteStruct) obj;
        return o.LJ(this.commentId, upvoteStruct.commentId) && o.LJ(this.text, upvoteStruct.text) && o.LJ(this.itemId, upvoteStruct.itemId) && this.createTime == upvoteStruct.createTime && this.likeCount == upvoteStruct.likeCount && this.status == upvoteStruct.status && o.LJ(this.user, upvoteStruct.user) && this.userLiked == upvoteStruct.userLiked && this.upvoteLabelType == upvoteStruct.upvoteLabelType && this.isAuthorLiked == upvoteStruct.isAuthorLiked && o.LJ(this.userList, upvoteStruct.userList) && this.total == upvoteStruct.total && this.bubbleHidden == upvoteStruct.bubbleHidden && o.LJ(this.textExtra, upvoteStruct.textExtra) && o.LJ(this.imageList, upvoteStruct.imageList) && this.upvoteWithPhoto == upvoteStruct.upvoteWithPhoto && o.LJ(this.replyComments, upvoteStruct.replyComments) && this.replyCommentTotal == upvoteStruct.replyCommentTotal && this.userBuried == upvoteStruct.userBuried && this.collectStat == upvoteStruct.collectStat && this.transBtnStyle == upvoteStruct.transBtnStyle && o.LJ(this.gift, upvoteStruct.gift) && this.isAuthorPin == upvoteStruct.isAuthorPin && this.cacheState == upvoteStruct.cacheState && this.repostState == upvoteStruct.repostState && this.myNewUpvote == upvoteStruct.myNewUpvote;
    }

    public final boolean isFake() {
        return ORY.LJJIJIIJIL(this.cacheState, new UpvoteCacheState[]{UpvoteCacheState.PRE_PUBLISH, UpvoteCacheState.PUBLISH_FAILED});
    }

    public final boolean isOperationDisable() {
        return ORY.LJJIJIIJIL(this.cacheState, new UpvoteCacheState[]{UpvoteCacheState.PRE_PUBLISH, UpvoteCacheState.PRE_REMOVE});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9 = this.commentId.hashCode() * 31;
        String str = this.text;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LIZJ = (((JBR.LIZJ(this.createTime, C79062V1e.LJ(this.itemId, (hashCode9 + hashCode) * 31, 31), 31) + this.likeCount) * 31) + this.status) * 31;
        User user = this.user;
        if (user == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = user.hashCode();
        }
        int i2 = (LIZJ + hashCode2) * 31;
        boolean z = this.userLiked;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (((i2 + i4) * 31) + this.upvoteLabelType) * 31;
        boolean z2 = this.isAuthorLiked;
        int i6 = z2;
        if (z2 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        List<User> list = this.userList;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i8 = (((i7 + hashCode3) * 31) + this.total) * 31;
        boolean z3 = this.bubbleHidden;
        int i9 = z3;
        if (z3 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        List<? extends TextExtraStruct> list2 = this.textExtra;
        if (list2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list2.hashCode();
        }
        int i11 = (i10 + hashCode4) * 31;
        List<CommentImageStruct> list3 = this.imageList;
        if (list3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list3.hashCode();
        }
        int i12 = (i11 + hashCode5) * 31;
        boolean z4 = this.upvoteWithPhoto;
        int i13 = z4;
        if (z4 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        List<Comment> list4 = this.replyComments;
        if (list4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list4.hashCode();
        }
        int LIZJ2 = JBR.LIZJ(this.replyCommentTotal, (i14 + hashCode6) * 31, 31);
        boolean z5 = this.userBuried;
        int i15 = z5;
        if (z5 != 0) {
            i15 = 1;
        }
        int i16 = (((((LIZJ2 + i15) * 31) + this.collectStat) * 31) + this.transBtnStyle) * 31;
        CommentGiftStruct commentGiftStruct = this.gift;
        if (commentGiftStruct == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = commentGiftStruct.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        boolean z6 = this.isAuthorPin;
        int i18 = z6;
        if (z6 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        UpvoteCacheState upvoteCacheState = this.cacheState;
        if (upvoteCacheState == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = upvoteCacheState.hashCode();
        }
        int i20 = (i19 + hashCode8) * 31;
        UpvoteCacheState upvoteCacheState2 = this.repostState;
        if (upvoteCacheState2 != null) {
            i = upvoteCacheState2.hashCode();
        }
        int i21 = (i20 + i) * 31;
        if (!this.myNewUpvote) {
            i3 = 0;
        }
        return i21 + i3;
    }

    public final boolean isPublished() {
        if (this.cacheState == null) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UpvoteStruct(commentId=");
        sb.append(this.commentId);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", itemId=");
        sb.append(this.itemId);
        sb.append(", createTime=");
        sb.append(this.createTime);
        sb.append(", likeCount=");
        sb.append(this.likeCount);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", user=");
        sb.append(this.user);
        sb.append(", userLiked=");
        sb.append(this.userLiked);
        sb.append(", upvoteLabelType=");
        sb.append(this.upvoteLabelType);
        sb.append(", isAuthorLiked=");
        sb.append(this.isAuthorLiked);
        sb.append(", userList=");
        sb.append(this.userList);
        sb.append(", total=");
        sb.append(this.total);
        sb.append(", bubbleHidden=");
        sb.append(this.bubbleHidden);
        sb.append(", textExtra=");
        sb.append(this.textExtra);
        sb.append(", imageList=");
        sb.append(this.imageList);
        sb.append(", upvoteWithPhoto=");
        sb.append(this.upvoteWithPhoto);
        sb.append(", replyComments=");
        sb.append(this.replyComments);
        sb.append(", replyCommentTotal=");
        sb.append(this.replyCommentTotal);
        sb.append(", userBuried=");
        sb.append(this.userBuried);
        sb.append(", collectStat=");
        sb.append(this.collectStat);
        sb.append(", transBtnStyle=");
        sb.append(this.transBtnStyle);
        sb.append(", gift=");
        sb.append(this.gift);
        sb.append(", isAuthorPin=");
        sb.append(this.isAuthorPin);
        sb.append(", cacheState=");
        sb.append(this.cacheState);
        sb.append(", repostState=");
        sb.append(this.repostState);
        sb.append(", myNewUpvote=");
        return C08880Wm.LIZJ(sb, this.myNewUpvote, ')');
    }

    public final boolean getBubbleHidden() {
        return this.bubbleHidden;
    }

    public final UpvoteCacheState getCacheState() {
        return this.cacheState;
    }

    public final int getCollectStat() {
        return this.collectStat;
    }

    public final String getCommentId() {
        return this.commentId;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final CommentGiftStruct getGift() {
        return this.gift;
    }

    public final List<CommentImageStruct> getImageList() {
        return this.imageList;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final int getLikeCount() {
        return this.likeCount;
    }

    public final boolean getMyNewUpvote() {
        return this.myNewUpvote;
    }

    public final long getReplyCommentTotal() {
        return this.replyCommentTotal;
    }

    public final List<Comment> getReplyComments() {
        return this.replyComments;
    }

    public final UpvoteCacheState getRepostState() {
        return this.repostState;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getText() {
        return this.text;
    }

    public final List<TextExtraStruct> getTextExtra() {
        return this.textExtra;
    }

    public final int getTotal() {
        return this.total;
    }

    public final int getTransBtnStyle() {
        return this.transBtnStyle;
    }

    public final int getUpvoteLabelType() {
        return this.upvoteLabelType;
    }

    public final boolean getUpvoteWithPhoto() {
        return this.upvoteWithPhoto;
    }

    public final User getUser() {
        return this.user;
    }

    public final boolean getUserBuried() {
        return this.userBuried;
    }

    public final boolean getUserLiked() {
        return this.userLiked;
    }

    public final List<User> getUserList() {
        return this.userList;
    }

    public final boolean isAuthorLiked() {
        return this.isAuthorLiked;
    }

    public final boolean isAuthorPin() {
        return this.isAuthorPin;
    }

    public final void setCacheState(UpvoteCacheState upvoteCacheState) {
        this.cacheState = upvoteCacheState;
    }

    public final void setImageList(List<CommentImageStruct> list) {
        this.imageList = list;
    }

    public final void setLikeCount(int i) {
        this.likeCount = i;
    }

    public final void setMyNewUpvote(boolean z) {
        this.myNewUpvote = z;
    }

    public final void setRepostState(UpvoteCacheState upvoteCacheState) {
        this.repostState = upvoteCacheState;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTextExtra(List<? extends TextExtraStruct> list) {
        this.textExtra = list;
    }

    public final void setUserLiked(boolean z) {
        this.userLiked = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UpvoteStruct(String commentId, String str, String itemId, long j, int i, int i2, User user, boolean z, int i3, boolean z2, List<? extends User> list, int i4, boolean z3, List<? extends TextExtraStruct> list2, List<CommentImageStruct> list3, boolean z4, List<Comment> list4, long j2, boolean z5, int i5, int i6, CommentGiftStruct commentGiftStruct, boolean z6, UpvoteCacheState upvoteCacheState, UpvoteCacheState upvoteCacheState2, boolean z7) {
        o.LJIIIZ(commentId, "commentId");
        o.LJIIIZ(itemId, "itemId");
        this.commentId = commentId;
        this.text = str;
        this.itemId = itemId;
        this.createTime = j;
        this.likeCount = i;
        this.status = i2;
        this.user = user;
        this.userLiked = z;
        this.upvoteLabelType = i3;
        this.isAuthorLiked = z2;
        this.userList = list;
        this.total = i4;
        this.bubbleHidden = z3;
        this.textExtra = list2;
        this.imageList = list3;
        this.upvoteWithPhoto = z4;
        this.replyComments = list4;
        this.replyCommentTotal = j2;
        this.userBuried = z5;
        this.collectStat = i5;
        this.transBtnStyle = i6;
        this.gift = commentGiftStruct;
        this.isAuthorPin = z6;
        this.cacheState = upvoteCacheState;
        this.repostState = upvoteCacheState2;
        this.myNewUpvote = z7;
    }

    public UpvoteStruct(String str, String str2, String str3, long j, int i, int i2, User user, boolean z, int i3, boolean z2, List list, int i4, boolean z3, List list2, List list3, boolean z4, List list4, long j2, boolean z5, int i5, int i6, CommentGiftStruct commentGiftStruct, boolean z6, UpvoteCacheState upvoteCacheState, UpvoteCacheState upvoteCacheState2, boolean z7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? null : str2, str3, (i7 & 8) != 0 ? 0L : j, (i7 & 16) != 0 ? 0 : i, (i7 & 32) != 0 ? 0 : i2, (i7 & 64) != 0 ? null : user, (i7 & 128) != 0 ? false : z, (i7 & 256) != 0 ? 0 : i3, (i7 & 512) != 0 ? false : z2, (i7 & 1024) != 0 ? C61878OQg.INSTANCE : list, (i7 & 2048) != 0 ? 0 : i4, (i7 & 4096) != 0 ? false : z3, (i7 & FileUtils.BUFFER_SIZE) != 0 ? C61878OQg.INSTANCE : list2, (i7 & 16384) != 0 ? C61878OQg.INSTANCE : list3, (32768 & i7) != 0 ? false : z4, (65536 & i7) != 0 ? new ArrayList() : list4, (131072 & i7) != 0 ? 0L : j2, (262144 & i7) != 0 ? false : z5, (524288 & i7) != 0 ? 0 : i5, (1048576 & i7) != 0 ? 0 : i6, (2097152 & i7) != 0 ? null : commentGiftStruct, (4194304 & i7) != 0 ? false : z6, (8388608 & i7) != 0 ? null : upvoteCacheState, (16777216 & i7) != 0 ? null : upvoteCacheState2, (i7 & 33554432) != 0 ? false : z7);
    }
}
