package com.ss.android.ugc.aweme.creatoredit;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CreatorCaptionEditModel extends BaseResponse {

    @InterfaceC65349Pkn("aweme_info")
    public final Aweme aweme;

    @InterfaceC65349Pkn("is_under_review")
    public final Boolean isUnderReview;

    @InterfaceC65349Pkn("subtitle_id")
    public final String newSubtitleId;

    @InterfaceC65349Pkn("remaining_edit_times")
    public final Integer remainingEditTimes;

    @InterfaceC65349Pkn("subtitles")
    public final List<CreatorCaptionEditData> transSubtitle;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreatorCaptionEditModel copy$default(CreatorCaptionEditModel creatorCaptionEditModel, String str, Aweme aweme, List list, Integer num, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creatorCaptionEditModel.newSubtitleId;
        }
        if ((i & 2) != 0) {
            aweme = creatorCaptionEditModel.aweme;
        }
        if ((i & 4) != 0) {
            list = creatorCaptionEditModel.transSubtitle;
        }
        if ((i & 8) != 0) {
            num = creatorCaptionEditModel.remainingEditTimes;
        }
        if ((i & 16) != 0) {
            bool = creatorCaptionEditModel.isUnderReview;
        }
        return creatorCaptionEditModel.copy(str, aweme, list, num, bool);
    }

    public final CreatorCaptionEditModel copy(String str, Aweme aweme, List<CreatorCaptionEditData> list, Integer num, Boolean bool) {
        return new CreatorCaptionEditModel(str, aweme, list, num, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatorCaptionEditModel)) {
            return false;
        }
        CreatorCaptionEditModel creatorCaptionEditModel = (CreatorCaptionEditModel) obj;
        return o.LJ(this.newSubtitleId, creatorCaptionEditModel.newSubtitleId) && o.LJ(this.aweme, creatorCaptionEditModel.aweme) && o.LJ(this.transSubtitle, creatorCaptionEditModel.transSubtitle) && o.LJ(this.remainingEditTimes, creatorCaptionEditModel.remainingEditTimes) && o.LJ(this.isUnderReview, creatorCaptionEditModel.isUnderReview);
    }

    public int hashCode() {
        String str = this.newSubtitleId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Aweme aweme = this.aweme;
        int hashCode2 = (hashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
        List<CreatorCaptionEditData> list = this.transSubtitle;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.remainingEditTimes;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isUnderReview;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreatorCaptionEditModel(newSubtitleId=");
        LIZ.append(this.newSubtitleId);
        LIZ.append(", aweme=");
        LIZ.append(this.aweme);
        LIZ.append(", transSubtitle=");
        LIZ.append(this.transSubtitle);
        LIZ.append(", remainingEditTimes=");
        LIZ.append(this.remainingEditTimes);
        LIZ.append(", isUnderReview=");
        return C78920UyC.LIZIZ(LIZ, this.isUnderReview, ')', LIZ);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final String getNewSubtitleId() {
        return this.newSubtitleId;
    }

    public final Integer getRemainingEditTimes() {
        return this.remainingEditTimes;
    }

    public final List<CreatorCaptionEditData> getTransSubtitle() {
        return this.transSubtitle;
    }

    public final Boolean isUnderReview() {
        return this.isUnderReview;
    }

    public CreatorCaptionEditModel(String str, Aweme aweme, List<CreatorCaptionEditData> list, Integer num, Boolean bool) {
        this.newSubtitleId = str;
        this.aweme = aweme;
        this.transSubtitle = list;
        this.remainingEditTimes = num;
        this.isUnderReview = bool;
    }
}
