package com.ss.android.ugc.aweme.sticker.data;

import X.AnonymousClass391;
import X.C161286Uq;
import X.C16880lQ;
import X.C61878OQg;
import X.EnumC81462Vy6;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.UC7;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.question.InviteInfo;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class QaStruct implements Serializable {
    public static final C161286Uq Companion = new C161286Uq();

    @InterfaceC65349Pkn("user_avatar")
    public UrlModel avatarUrl;

    @InterfaceC65349Pkn("category_meta")
    public String category_meta;

    @InterfaceC65349Pkn("collection_category")
    public Integer collectionCategory;

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("extra_event_params")
    public HashMap<String, HashMap<String, String>> extraEventParams;

    @InterfaceC65349Pkn("invite_info")
    public InviteInfo inviteInfo;

    @InterfaceC65349Pkn("invite_share_info")
    public ShareInfo inviteShareInfo;

    @InterfaceC65349Pkn("invited_users")
    public List<Long> inviteUserList;

    @InterfaceC65349Pkn("item_id")
    public long itemId;

    @InterfaceC65349Pkn("content")
    public String questionContent;

    @InterfaceC65349Pkn("question_id")
    public long questionId;

    @InterfaceC65349Pkn("sec_uid")
    public String secId;

    @InterfaceC65349Pkn("source")
    public EnumC81462Vy6 source;

    @InterfaceC65349Pkn("user_id")
    public long userId;

    @InterfaceC65349Pkn("username")
    public String userName;

    @InterfaceC65349Pkn("user_selected_categories")
    public String userSelectedCategory;

    @InterfaceC65349Pkn("videos_count")
    public int videosCount;

    public QaStruct() {
        this(0L, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, 131071, null);
    }

    public QaStruct(long j) {
        this(j, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, 131070, null);
    }

    public QaStruct(long j, long j2) {
        this(j, j2, 0L, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, 131068, null);
    }

    public QaStruct(long j, long j2, long j3) {
        this(j, j2, j3, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, 131064, null);
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel) {
        this(j, j2, j3, urlModel, null, null, null, null, null, null, null, null, null, null, 0, null, null, 131056, null);
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str) {
        this(j, j2, j3, urlModel, str, null, null, null, null, null, null, null, null, null, 0, null, null, 131040, null);
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2) {
        this(j, j2, j3, urlModel, str, str2, null, null, null, null, null, null, null, null, 0, null, null, 131008, null);
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3) {
        this(j, j2, j3, urlModel, str, str2, str3, null, null, null, null, null, null, null, 0, null, null, 130944, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List<Long> inviteUserList) {
        this(j, j2, j3, urlModel, str, str2, str3, inviteUserList, null, null, null, null, null, null, 0, null, null, 130816, null);
        o.LJIIIZ(inviteUserList, "inviteUserList");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List<Long> inviteUserList, EnumC81462Vy6 source) {
        this(j, j2, j3, urlModel, str, str2, str3, inviteUserList, source, null, null, null, null, null, 0, null, null, 130560, null);
        o.LJIIIZ(inviteUserList, "inviteUserList");
        o.LJIIIZ(source, "source");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List<Long> inviteUserList, EnumC81462Vy6 source, ShareInfo shareInfo) {
        this(j, j2, j3, urlModel, str, str2, str3, inviteUserList, source, shareInfo, null, null, null, null, 0, null, null, 130048, null);
        o.LJIIIZ(inviteUserList, "inviteUserList");
        o.LJIIIZ(source, "source");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List<Long> inviteUserList, EnumC81462Vy6 source, ShareInfo shareInfo, String str4) {
        this(j, j2, j3, urlModel, str, str2, str3, inviteUserList, source, shareInfo, str4, null, null, null, 0, null, null, 129024, null);
        o.LJIIIZ(inviteUserList, "inviteUserList");
        o.LJIIIZ(source, "source");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List<Long> inviteUserList, EnumC81462Vy6 source, ShareInfo shareInfo, String str4, HashMap<String, HashMap<String, String>> extraEventParams) {
        this(j, j2, j3, urlModel, str, str2, str3, inviteUserList, source, shareInfo, str4, extraEventParams, null, null, 0, null, null, 126976, null);
        o.LJIIIZ(inviteUserList, "inviteUserList");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(extraEventParams, "extraEventParams");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List<Long> inviteUserList, EnumC81462Vy6 source, ShareInfo shareInfo, String str4, HashMap<String, HashMap<String, String>> extraEventParams, String str5) {
        this(j, j2, j3, urlModel, str, str2, str3, inviteUserList, source, shareInfo, str4, extraEventParams, str5, null, 0, null, null, 122880, null);
        o.LJIIIZ(inviteUserList, "inviteUserList");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(extraEventParams, "extraEventParams");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List<Long> inviteUserList, EnumC81462Vy6 source, ShareInfo shareInfo, String str4, HashMap<String, HashMap<String, String>> extraEventParams, String str5, String str6) {
        this(j, j2, j3, urlModel, str, str2, str3, inviteUserList, source, shareInfo, str4, extraEventParams, str5, str6, 0, null, null, 114688, null);
        o.LJIIIZ(inviteUserList, "inviteUserList");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(extraEventParams, "extraEventParams");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List<Long> inviteUserList, EnumC81462Vy6 source, ShareInfo shareInfo, String str4, HashMap<String, HashMap<String, String>> extraEventParams, String str5, String str6, int i) {
        this(j, j2, j3, urlModel, str, str2, str3, inviteUserList, source, shareInfo, str4, extraEventParams, str5, str6, i, null, null, 98304, null);
        o.LJIIIZ(inviteUserList, "inviteUserList");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(extraEventParams, "extraEventParams");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List<Long> inviteUserList, EnumC81462Vy6 source, ShareInfo shareInfo, String str4, HashMap<String, HashMap<String, String>> extraEventParams, String str5, String str6, int i, InviteInfo inviteInfo) {
        this(j, j2, j3, urlModel, str, str2, str3, inviteUserList, source, shareInfo, str4, extraEventParams, str5, str6, i, inviteInfo, null, 65536, null);
        o.LJIIIZ(inviteUserList, "inviteUserList");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(extraEventParams, "extraEventParams");
    }

    public static /* synthetic */ QaStruct copy$default(QaStruct qaStruct, long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List list, EnumC81462Vy6 enumC81462Vy6, ShareInfo shareInfo, String str4, HashMap hashMap, String str5, String str6, int i, InviteInfo inviteInfo, Integer num, int i2, Object obj) {
        UrlModel urlModel2 = urlModel;
        long j4 = j3;
        long j5 = j;
        long j6 = j2;
        String str7 = str2;
        String str8 = str;
        String str9 = str3;
        List list2 = list;
        EnumC81462Vy6 enumC81462Vy62 = enumC81462Vy6;
        String str10 = str4;
        ShareInfo shareInfo2 = shareInfo;
        Integer num2 = num;
        HashMap hashMap2 = hashMap;
        String str11 = str6;
        int i3 = i;
        String str12 = str5;
        InviteInfo inviteInfo2 = inviteInfo;
        if ((i2 & 1) != 0) {
            j5 = qaStruct.questionId;
        }
        if ((i2 & 2) != 0) {
            j6 = qaStruct.userId;
        }
        if ((i2 & 4) != 0) {
            j4 = qaStruct.itemId;
        }
        if ((i2 & 8) != 0) {
            urlModel2 = qaStruct.avatarUrl;
        }
        if ((i2 & 16) != 0) {
            str8 = qaStruct.userName;
        }
        if ((i2 & 32) != 0) {
            str7 = qaStruct.questionContent;
        }
        if ((i2 & 64) != 0) {
            str9 = qaStruct.secId;
        }
        if ((i2 & 128) != 0) {
            list2 = qaStruct.inviteUserList;
        }
        if ((i2 & 256) != 0) {
            enumC81462Vy62 = qaStruct.source;
        }
        if ((i2 & 512) != 0) {
            shareInfo2 = qaStruct.inviteShareInfo;
        }
        if ((i2 & 1024) != 0) {
            str10 = qaStruct.extra;
        }
        if ((i2 & 2048) != 0) {
            hashMap2 = qaStruct.extraEventParams;
        }
        if ((i2 & 4096) != 0) {
            str12 = qaStruct.category_meta;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            str11 = qaStruct.userSelectedCategory;
        }
        if ((i2 & 16384) != 0) {
            i3 = qaStruct.videosCount;
        }
        if ((32768 & i2) != 0) {
            inviteInfo2 = qaStruct.inviteInfo;
        }
        if ((i2 & 65536) != 0) {
            num2 = qaStruct.collectionCategory;
        }
        String str13 = str7;
        List list3 = list2;
        ShareInfo shareInfo3 = shareInfo2;
        return qaStruct.copy(j5, j6, j4, urlModel2, str8, str13, str9, list3, enumC81462Vy62, shareInfo3, str10, hashMap2, str12, str11, i3, inviteInfo2, num2);
    }

    public final QaStruct copy(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List<Long> inviteUserList, EnumC81462Vy6 source, ShareInfo shareInfo, String str4, HashMap<String, HashMap<String, String>> extraEventParams, String str5, String str6, int i, InviteInfo inviteInfo, Integer num) {
        o.LJIIIZ(inviteUserList, "inviteUserList");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(extraEventParams, "extraEventParams");
        return new QaStruct(j, j2, j3, urlModel, str, str2, str3, inviteUserList, source, shareInfo, str4, extraEventParams, str5, str6, i, inviteInfo, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QaStruct)) {
            return false;
        }
        QaStruct qaStruct = (QaStruct) obj;
        return this.questionId == qaStruct.questionId && this.userId == qaStruct.userId && this.itemId == qaStruct.itemId && o.LJ(this.avatarUrl, qaStruct.avatarUrl) && o.LJ(this.userName, qaStruct.userName) && o.LJ(this.questionContent, qaStruct.questionContent) && o.LJ(this.secId, qaStruct.secId) && o.LJ(this.inviteUserList, qaStruct.inviteUserList) && this.source == qaStruct.source && o.LJ(this.inviteShareInfo, qaStruct.inviteShareInfo) && o.LJ(this.extra, qaStruct.extra) && o.LJ(this.extraEventParams, qaStruct.extraEventParams) && o.LJ(this.category_meta, qaStruct.category_meta) && o.LJ(this.userSelectedCategory, qaStruct.userSelectedCategory) && this.videosCount == qaStruct.videosCount && o.LJ(this.inviteInfo, qaStruct.inviteInfo) && o.LJ(this.collectionCategory, qaStruct.collectionCategory);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int LIZJ = JBR.LIZJ(this.itemId, JBR.LIZJ(this.userId, C16880lQ.LLJIJIL(this.questionId) * 31, 31), 31);
        UrlModel urlModel = this.avatarUrl;
        int i = 0;
        if (urlModel == null) {
            hashCode = 0;
        } else {
            hashCode = urlModel.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        String str = this.userName;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.questionContent;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.secId;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int hashCode10 = (this.source.hashCode() + AnonymousClass391.LIZIZ(this.inviteUserList, (i4 + hashCode4) * 31, 31)) * 31;
        ShareInfo shareInfo = this.inviteShareInfo;
        if (shareInfo == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = shareInfo.hashCode();
        }
        int i5 = (hashCode10 + hashCode5) * 31;
        String str4 = this.extra;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int hashCode11 = (this.extraEventParams.hashCode() + ((i5 + hashCode6) * 31)) * 31;
        String str5 = this.category_meta;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i6 = (hashCode11 + hashCode7) * 31;
        String str6 = this.userSelectedCategory;
        if (str6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str6.hashCode();
        }
        int i7 = (((i6 + hashCode8) * 31) + this.videosCount) * 31;
        InviteInfo inviteInfo = this.inviteInfo;
        if (inviteInfo == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = inviteInfo.hashCode();
        }
        int i8 = (i7 + hashCode9) * 31;
        Integer num = this.collectionCategory;
        if (num != null) {
            i = num.hashCode();
        }
        return i8 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("QaStruct(questionId=");
        sb.append(this.questionId);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", itemId=");
        sb.append(this.itemId);
        sb.append(", avatarUrl=");
        sb.append(this.avatarUrl);
        sb.append(", userName=");
        sb.append(this.userName);
        sb.append(", questionContent=");
        sb.append(this.questionContent);
        sb.append(", secId=");
        sb.append(this.secId);
        sb.append(", inviteUserList=");
        sb.append(this.inviteUserList);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", inviteShareInfo=");
        sb.append(this.inviteShareInfo);
        sb.append(", extra=");
        sb.append(this.extra);
        sb.append(", extraEventParams=");
        sb.append(this.extraEventParams);
        sb.append(", category_meta=");
        sb.append(this.category_meta);
        sb.append(", userSelectedCategory=");
        sb.append(this.userSelectedCategory);
        sb.append(", videosCount=");
        sb.append(this.videosCount);
        sb.append(", inviteInfo=");
        sb.append(this.inviteInfo);
        sb.append(", collectionCategory=");
        return UC7.LIZ(sb, this.collectionCategory, ')');
    }

    public final UrlModel getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getCategory_meta() {
        return this.category_meta;
    }

    public final Integer getCollectionCategory() {
        return this.collectionCategory;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final HashMap<String, HashMap<String, String>> getExtraEventParams() {
        return this.extraEventParams;
    }

    public final InviteInfo getInviteInfo() {
        return this.inviteInfo;
    }

    public final ShareInfo getInviteShareInfo() {
        return this.inviteShareInfo;
    }

    public final List<Long> getInviteUserList() {
        return this.inviteUserList;
    }

    public final long getItemId() {
        return this.itemId;
    }

    public final String getQuestionContent() {
        return this.questionContent;
    }

    public final long getQuestionId() {
        return this.questionId;
    }

    public final String getSecId() {
        return this.secId;
    }

    public final EnumC81462Vy6 getSource() {
        return this.source;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final String getUserSelectedCategory() {
        return this.userSelectedCategory;
    }

    public final int getVideosCount() {
        return this.videosCount;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setSource(EnumC81462Vy6 enumC81462Vy6) {
        o.LJIIIZ(enumC81462Vy6, "<set-?>");
        this.source = enumC81462Vy6;
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List<Long> inviteUserList, EnumC81462Vy6 source, ShareInfo shareInfo, String str4, HashMap<String, HashMap<String, String>> extraEventParams, String str5, String str6, int i, InviteInfo inviteInfo, Integer num) {
        o.LJIIIZ(inviteUserList, "inviteUserList");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(extraEventParams, "extraEventParams");
        this.questionId = j;
        this.userId = j2;
        this.itemId = j3;
        this.avatarUrl = urlModel;
        this.userName = str;
        this.questionContent = str2;
        this.secId = str3;
        this.inviteUserList = inviteUserList;
        this.source = source;
        this.inviteShareInfo = shareInfo;
        this.extra = str4;
        this.extraEventParams = extraEventParams;
        this.category_meta = str5;
        this.userSelectedCategory = str6;
        this.videosCount = i;
        this.inviteInfo = inviteInfo;
        this.collectionCategory = num;
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List list, EnumC81462Vy6 enumC81462Vy6, ShareInfo shareInfo, String str4, HashMap hashMap, String str5, String str6, int i, InviteInfo inviteInfo, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0L : j2, (i2 & 4) == 0 ? j3 : 0L, (i2 & 8) != 0 ? null : urlModel, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? C61878OQg.INSTANCE : list, (i2 & 256) != 0 ? EnumC81462Vy6.Default : enumC81462Vy6, (i2 & 512) != 0 ? null : shareInfo, (i2 & 1024) != 0 ? null : str4, (i2 & 2048) != 0 ? new HashMap() : hashMap, (i2 & 4096) != 0 ? "" : str5, (i2 & FileUtils.BUFFER_SIZE) == 0 ? str6 : "", (i2 & 16384) != 0 ? 0 : i, (32768 & i2) != 0 ? null : inviteInfo, (i2 & 65536) != 0 ? null : num);
    }
}
