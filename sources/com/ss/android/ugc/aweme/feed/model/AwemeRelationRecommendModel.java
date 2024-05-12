package com.ss.android.ugc.aweme.feed.model;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AwemeRelationRecommendModel implements Serializable {

    @InterfaceC65349Pkn("friend_type_str")
    public String friendTypeStr;

    @InterfaceC65349Pkn("rec_type")
    public String recType;

    @InterfaceC65349Pkn("recommend_type")
    public long recommendType;

    @InterfaceC65349Pkn("relation_text_key")
    public String relationTextKey;

    public AwemeRelationRecommendModel() {
    }

    public static /* synthetic */ AwemeRelationRecommendModel copy$default(AwemeRelationRecommendModel awemeRelationRecommendModel, long j, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = awemeRelationRecommendModel.recommendType;
        }
        if ((i & 2) != 0) {
            str = awemeRelationRecommendModel.relationTextKey;
        }
        if ((i & 4) != 0) {
            str2 = awemeRelationRecommendModel.recType;
        }
        if ((i & 8) != 0) {
            str3 = awemeRelationRecommendModel.friendTypeStr;
        }
        return awemeRelationRecommendModel.copy(j, str, str2, str3);
    }

    public final AwemeRelationRecommendModel copy(long j, String str, String str2, String str3) {
        return new AwemeRelationRecommendModel(j, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeRelationRecommendModel)) {
            return false;
        }
        AwemeRelationRecommendModel awemeRelationRecommendModel = (AwemeRelationRecommendModel) obj;
        return this.recommendType == awemeRelationRecommendModel.recommendType && o.LJ(this.relationTextKey, awemeRelationRecommendModel.relationTextKey) && o.LJ(this.recType, awemeRelationRecommendModel.recType) && o.LJ(this.friendTypeStr, awemeRelationRecommendModel.friendTypeStr);
    }

    public int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.recommendType) * 31;
        String str = this.relationTextKey;
        int hashCode = (LLJIJIL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.recType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.friendTypeStr;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemeRelationRecommendModel(recommendType=");
        LIZ.append(this.recommendType);
        LIZ.append(", relationTextKey=");
        LIZ.append(this.relationTextKey);
        LIZ.append(", recType=");
        LIZ.append(this.recType);
        LIZ.append(", friendTypeStr=");
        return q.LIZIZ(LIZ, this.friendTypeStr, ')', LIZ);
    }

    public final String getFriendTypeStr() {
        return this.friendTypeStr;
    }

    public final String getRecType() {
        return this.recType;
    }

    public final long getRecommendType() {
        return this.recommendType;
    }

    public final String getRelationTextKey() {
        return this.relationTextKey;
    }

    public final void setFriendTypeStr(String str) {
        this.friendTypeStr = str;
    }

    public final void setRecType(String str) {
        this.recType = str;
    }

    public final void setRecommendType(long j) {
        this.recommendType = j;
    }

    public final void setRelationTextKey(String str) {
        this.relationTextKey = str;
    }

    public AwemeRelationRecommendModel(long j, String str, String str2, String str3) {
        this.recommendType = j;
        this.relationTextKey = str;
        this.recType = str2;
        this.friendTypeStr = str3;
    }
}
