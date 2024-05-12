package com.ss.android.ugc.aweme.qna.api;

import X.C48339Iy7;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TiktokV1ForumProfileBannerResponse {

    @InterfaceC65349Pkn("allow_ask_question")
    public final boolean allowAskQuestion;

    @InterfaceC65349Pkn("answers_count")
    public final Long answersCount;

    @InterfaceC65349Pkn("answers_tab_title")
    public final String answersTabTitle;

    @InterfaceC65349Pkn("status_msg")
    public final String msg;

    @InterfaceC65349Pkn("profile_user")
    public final User profileUser;

    @InterfaceC65349Pkn("questions_count")
    public final Long questionsCount;

    @InterfaceC65349Pkn("questions_tab_title")
    public final String questionsTabTitle;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TiktokV1ForumProfileBannerResponse)) {
            return false;
        }
        TiktokV1ForumProfileBannerResponse tiktokV1ForumProfileBannerResponse = (TiktokV1ForumProfileBannerResponse) obj;
        return this.statusCode == tiktokV1ForumProfileBannerResponse.statusCode && o.LJ(this.msg, tiktokV1ForumProfileBannerResponse.msg) && o.LJ(this.answersTabTitle, tiktokV1ForumProfileBannerResponse.answersTabTitle) && o.LJ(this.questionsTabTitle, tiktokV1ForumProfileBannerResponse.questionsTabTitle) && o.LJ(this.profileUser, tiktokV1ForumProfileBannerResponse.profileUser) && o.LJ(this.answersCount, tiktokV1ForumProfileBannerResponse.answersCount) && o.LJ(this.questionsCount, tiktokV1ForumProfileBannerResponse.questionsCount) && this.allowAskQuestion == tiktokV1ForumProfileBannerResponse.allowAskQuestion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int LJ = C79062V1e.LJ(this.msg, this.statusCode * 31, 31);
        String str = this.answersTabTitle;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str2 = this.questionsTabTitle;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        User user = this.profileUser;
        if (user == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = user.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Long l = this.answersCount;
        if (l == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Long l2 = this.questionsCount;
        if (l2 != null) {
            i = l2.hashCode();
        }
        int i6 = (i5 + i) * 31;
        boolean z = this.allowAskQuestion;
        int i7 = z;
        if (z != 0) {
            i7 = 1;
        }
        return i6 + i7;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TiktokV1ForumProfileBannerResponse(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", msg=");
        LIZ.append(this.msg);
        LIZ.append(", answersTabTitle=");
        LIZ.append(this.answersTabTitle);
        LIZ.append(", questionsTabTitle=");
        LIZ.append(this.questionsTabTitle);
        LIZ.append(", profileUser=");
        LIZ.append(this.profileUser);
        LIZ.append(", answersCount=");
        LIZ.append(this.answersCount);
        LIZ.append(", questionsCount=");
        LIZ.append(this.questionsCount);
        LIZ.append(", allowAskQuestion=");
        return C48339Iy7.LIZJ(LIZ, this.allowAskQuestion, ')', LIZ);
    }

    public TiktokV1ForumProfileBannerResponse(int i, String msg, String str, String str2, User user, Long l, Long l2, boolean z) {
        o.LJIIIZ(msg, "msg");
        this.statusCode = i;
        this.msg = msg;
        this.answersTabTitle = str;
        this.questionsTabTitle = str2;
        this.profileUser = user;
        this.answersCount = l;
        this.questionsCount = l2;
        this.allowAskQuestion = z;
    }

    public /* synthetic */ TiktokV1ForumProfileBannerResponse(int i, String str, String str2, String str3, User user, Long l, Long l2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) == 0 ? user : null, (i2 & 32) != 0 ? 0L : l, (i2 & 64) != 0 ? 0L : l2, z);
    }
}
