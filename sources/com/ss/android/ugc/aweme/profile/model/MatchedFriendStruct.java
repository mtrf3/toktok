package com.ss.android.ugc.aweme.profile.model;

import X.C07670Rv;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MatchedFriendStruct implements Serializable {

    @InterfaceC65349Pkn("video_items")
    public List<Aweme> awemeList;

    @InterfaceC65349Pkn("external_recommend_reason")
    public ExternalRecommendReasonStruct externalRecommendReasonStruct;

    @InterfaceC65349Pkn("face_cover_num")
    public Integer faceCoverNum;

    @InterfaceC65349Pkn("is_acquaintance")
    public Boolean isAcquaintance;

    @InterfaceC65349Pkn("is_new_maf")
    public Boolean isNewMaF;

    @InterfaceC65349Pkn("mutual_struct")
    public MutualStruct mMutualStruct;

    @InterfaceC65349Pkn("rec_type")
    public String recType;

    @InterfaceC65349Pkn("recommend_reason")
    public String recommendReason;

    @InterfaceC65349Pkn("relation_type")
    public String relationType;

    @InterfaceC65349Pkn("social_info")
    public String socialInfo;

    @InterfaceC65349Pkn("video_item_reason")
    public String videoItemReason;

    @InterfaceC65349Pkn("video_num_type")
    public String videoNumType;

    /* JADX WARN: Multi-variable type inference failed */
    public MatchedFriendStruct() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4095, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MatchedFriendStruct copy$default(MatchedFriendStruct matchedFriendStruct, String str, String str2, String str3, MutualStruct mutualStruct, String str4, ExternalRecommendReasonStruct externalRecommendReasonStruct, Boolean bool, Boolean bool2, List list, String str5, Integer num, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = matchedFriendStruct.recommendReason;
        }
        if ((i & 2) != 0) {
            str2 = matchedFriendStruct.recType;
        }
        if ((i & 4) != 0) {
            str3 = matchedFriendStruct.relationType;
        }
        if ((i & 8) != 0) {
            mutualStruct = matchedFriendStruct.mMutualStruct;
        }
        if ((i & 16) != 0) {
            str4 = matchedFriendStruct.socialInfo;
        }
        if ((i & 32) != 0) {
            externalRecommendReasonStruct = matchedFriendStruct.externalRecommendReasonStruct;
        }
        if ((i & 64) != 0) {
            bool = matchedFriendStruct.isNewMaF;
        }
        if ((i & 128) != 0) {
            bool2 = matchedFriendStruct.isAcquaintance;
        }
        if ((i & 256) != 0) {
            list = matchedFriendStruct.awemeList;
        }
        if ((i & 512) != 0) {
            str5 = matchedFriendStruct.videoItemReason;
        }
        if ((i & 1024) != 0) {
            num = matchedFriendStruct.faceCoverNum;
        }
        if ((i & 2048) != 0) {
            str6 = matchedFriendStruct.videoNumType;
        }
        return matchedFriendStruct.copy(str, str2, str3, mutualStruct, str4, externalRecommendReasonStruct, bool, bool2, list, str5, num, str6);
    }

    public final MatchedFriendStruct copy(String str, String str2, String str3, MutualStruct mutualStruct, String str4, ExternalRecommendReasonStruct externalRecommendReasonStruct, Boolean bool, Boolean bool2, List<? extends Aweme> list, String str5, Integer num, String str6) {
        return new MatchedFriendStruct(str, str2, str3, mutualStruct, str4, externalRecommendReasonStruct, bool, bool2, list, str5, num, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchedFriendStruct)) {
            return false;
        }
        MatchedFriendStruct matchedFriendStruct = (MatchedFriendStruct) obj;
        return o.LJ(this.recommendReason, matchedFriendStruct.recommendReason) && o.LJ(this.recType, matchedFriendStruct.recType) && o.LJ(this.relationType, matchedFriendStruct.relationType) && o.LJ(this.mMutualStruct, matchedFriendStruct.mMutualStruct) && o.LJ(this.socialInfo, matchedFriendStruct.socialInfo) && o.LJ(this.externalRecommendReasonStruct, matchedFriendStruct.externalRecommendReasonStruct) && o.LJ(this.isNewMaF, matchedFriendStruct.isNewMaF) && o.LJ(this.isAcquaintance, matchedFriendStruct.isAcquaintance) && o.LJ(this.awemeList, matchedFriendStruct.awemeList) && o.LJ(this.videoItemReason, matchedFriendStruct.videoItemReason) && o.LJ(this.faceCoverNum, matchedFriendStruct.faceCoverNum) && o.LJ(this.videoNumType, matchedFriendStruct.videoNumType);
    }

    public int hashCode() {
        String str = this.recommendReason;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.recType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.relationType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MutualStruct mutualStruct = this.mMutualStruct;
        int hashCode4 = (hashCode3 + (mutualStruct == null ? 0 : mutualStruct.hashCode())) * 31;
        String str4 = this.socialInfo;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ExternalRecommendReasonStruct externalRecommendReasonStruct = this.externalRecommendReasonStruct;
        int hashCode6 = (hashCode5 + (externalRecommendReasonStruct == null ? 0 : externalRecommendReasonStruct.hashCode())) * 31;
        Boolean bool = this.isNewMaF;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isAcquaintance;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<Aweme> list = this.awemeList;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.videoItemReason;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.faceCoverNum;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.videoNumType;
        return hashCode11 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MatchedFriendStruct(recommendReason=");
        sb.append(this.recommendReason);
        sb.append(", recType=");
        sb.append(this.recType);
        sb.append(", relationType=");
        sb.append(this.relationType);
        sb.append(", mMutualStruct=");
        sb.append(this.mMutualStruct);
        sb.append(", socialInfo=");
        sb.append(this.socialInfo);
        sb.append(", externalRecommendReasonStruct=");
        sb.append(this.externalRecommendReasonStruct);
        sb.append(", isNewMaF=");
        sb.append(this.isNewMaF);
        sb.append(", isAcquaintance=");
        sb.append(this.isAcquaintance);
        sb.append(", awemeList=");
        sb.append(this.awemeList);
        sb.append(", videoItemReason=");
        sb.append(this.videoItemReason);
        sb.append(", faceCoverNum=");
        sb.append(this.faceCoverNum);
        sb.append(", videoNumType=");
        return C07670Rv.LIZIZ(sb, this.videoNumType, ')');
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final ExternalRecommendReasonStruct getExternalRecommendReasonStruct() {
        return this.externalRecommendReasonStruct;
    }

    public final Integer getFaceCoverNum() {
        return this.faceCoverNum;
    }

    public final MutualStruct getMMutualStruct() {
        return this.mMutualStruct;
    }

    public final String getRecType() {
        return this.recType;
    }

    public final String getRecommendReason() {
        return this.recommendReason;
    }

    public final String getRelationType() {
        return this.relationType;
    }

    public final String getSocialInfo() {
        return this.socialInfo;
    }

    public final String getVideoItemReason() {
        return this.videoItemReason;
    }

    public final String getVideoNumType() {
        return this.videoNumType;
    }

    public final Boolean isAcquaintance() {
        return this.isAcquaintance;
    }

    public final Boolean isNewMaF() {
        return this.isNewMaF;
    }

    public final void setExternalRecommendReasonStruct(ExternalRecommendReasonStruct externalRecommendReasonStruct) {
        this.externalRecommendReasonStruct = externalRecommendReasonStruct;
    }

    public final void setMMutualStruct(MutualStruct mutualStruct) {
        this.mMutualStruct = mutualStruct;
    }

    public final void setNewMaF(Boolean bool) {
        this.isNewMaF = bool;
    }

    public final void setRecType(String str) {
        this.recType = str;
    }

    public final void setRecommendReason(String str) {
        this.recommendReason = str;
    }

    public final void setRelationType(String str) {
        this.relationType = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MatchedFriendStruct(String str, String str2, String str3, MutualStruct mutualStruct, String str4, ExternalRecommendReasonStruct externalRecommendReasonStruct, Boolean bool, Boolean bool2, List<? extends Aweme> list, String str5, Integer num, String str6) {
        this.recommendReason = str;
        this.recType = str2;
        this.relationType = str3;
        this.mMutualStruct = mutualStruct;
        this.socialInfo = str4;
        this.externalRecommendReasonStruct = externalRecommendReasonStruct;
        this.isNewMaF = bool;
        this.isAcquaintance = bool2;
        this.awemeList = list;
        this.videoItemReason = str5;
        this.faceCoverNum = num;
        this.videoNumType = str6;
    }

    public /* synthetic */ MatchedFriendStruct(String str, String str2, String str3, MutualStruct mutualStruct, String str4, ExternalRecommendReasonStruct externalRecommendReasonStruct, Boolean bool, Boolean bool2, List list, String str5, Integer num, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : mutualStruct, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : externalRecommendReasonStruct, (i & 64) != 0 ? Boolean.FALSE : bool, (i & 128) != 0 ? Boolean.FALSE : bool2, (i & 256) != 0 ? null : list, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : num, (i & 2048) == 0 ? str6 : null);
    }
}
