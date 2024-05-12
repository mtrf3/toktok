package com.ss.android.ugc.aweme.addyours.model;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AddYoursTopic implements Serializable {

    @InterfaceC65349Pkn("collect_status")
    public final int collectStatus;

    @InterfaceC65349Pkn("from_question")
    public final Boolean fromQuestion;

    @InterfaceC65349Pkn("inviter_avatars")
    public final List<AddYoursAvatar> inviterAvatars;

    @InterfaceC65349Pkn("inviters_count")
    public final Long inviterCount;

    @InterfaceC65349Pkn("suggest_invitee_avatars")
    public final List<AddYoursAvatar> suggestInviteeAvatars;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("topic_id")
    public final Long topicId;

    @InterfaceC65349Pkn("video")
    public final Aweme video;

    @InterfaceC65349Pkn("videos_count")
    public final Long videoCount;

    @InterfaceC65349Pkn("viewer_is_invited")
    public final Boolean viewerInvited;

    /* JADX WARN: Multi-variable type inference failed */
    public AddYoursTopic() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 1023, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddYoursTopic copy$default(AddYoursTopic addYoursTopic, Long l, String str, List list, Long l2, List list2, Long l3, Aweme aweme, Boolean bool, int i, Boolean bool2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l = addYoursTopic.topicId;
        }
        if ((i2 & 2) != 0) {
            str = addYoursTopic.text;
        }
        if ((i2 & 4) != 0) {
            list = addYoursTopic.inviterAvatars;
        }
        if ((i2 & 8) != 0) {
            l2 = addYoursTopic.inviterCount;
        }
        if ((i2 & 16) != 0) {
            list2 = addYoursTopic.suggestInviteeAvatars;
        }
        if ((i2 & 32) != 0) {
            l3 = addYoursTopic.videoCount;
        }
        if ((i2 & 64) != 0) {
            aweme = addYoursTopic.video;
        }
        if ((i2 & 128) != 0) {
            bool = addYoursTopic.fromQuestion;
        }
        if ((i2 & 256) != 0) {
            i = addYoursTopic.collectStatus;
        }
        if ((i2 & 512) != 0) {
            bool2 = addYoursTopic.viewerInvited;
        }
        return addYoursTopic.copy(l, str, list, l2, list2, l3, aweme, bool, i, bool2);
    }

    public final AddYoursTopic copy(Long l, String str, List<AddYoursAvatar> list, Long l2, List<AddYoursAvatar> list2, Long l3, Aweme aweme, Boolean bool, int i, Boolean bool2) {
        return new AddYoursTopic(l, str, list, l2, list2, l3, aweme, bool, i, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddYoursTopic)) {
            return false;
        }
        AddYoursTopic addYoursTopic = (AddYoursTopic) obj;
        return o.LJ(this.topicId, addYoursTopic.topicId) && o.LJ(this.text, addYoursTopic.text) && o.LJ(this.inviterAvatars, addYoursTopic.inviterAvatars) && o.LJ(this.inviterCount, addYoursTopic.inviterCount) && o.LJ(this.suggestInviteeAvatars, addYoursTopic.suggestInviteeAvatars) && o.LJ(this.videoCount, addYoursTopic.videoCount) && o.LJ(this.video, addYoursTopic.video) && o.LJ(this.fromQuestion, addYoursTopic.fromQuestion) && this.collectStatus == addYoursTopic.collectStatus && o.LJ(this.viewerInvited, addYoursTopic.viewerInvited);
    }

    public int hashCode() {
        Long l = this.topicId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<AddYoursAvatar> list = this.inviterAvatars;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.inviterCount;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List<AddYoursAvatar> list2 = this.suggestInviteeAvatars;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l3 = this.videoCount;
        int hashCode6 = (hashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Aweme aweme = this.video;
        int hashCode7 = (hashCode6 + (aweme == null ? 0 : aweme.hashCode())) * 31;
        Boolean bool = this.fromQuestion;
        int hashCode8 = (((hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31) + this.collectStatus) * 31;
        Boolean bool2 = this.viewerInvited;
        return hashCode8 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddYoursTopic(topicId=");
        LIZ.append(this.topicId);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", inviterAvatars=");
        LIZ.append(this.inviterAvatars);
        LIZ.append(", inviterCount=");
        LIZ.append(this.inviterCount);
        LIZ.append(", suggestInviteeAvatars=");
        LIZ.append(this.suggestInviteeAvatars);
        LIZ.append(", videoCount=");
        LIZ.append(this.videoCount);
        LIZ.append(", video=");
        LIZ.append(this.video);
        LIZ.append(", fromQuestion=");
        LIZ.append(this.fromQuestion);
        LIZ.append(", collectStatus=");
        LIZ.append(this.collectStatus);
        LIZ.append(", viewerInvited=");
        return C78920UyC.LIZIZ(LIZ, this.viewerInvited, ')', LIZ);
    }

    public final int getCollectStatus() {
        return this.collectStatus;
    }

    public final Boolean getFromQuestion() {
        return this.fromQuestion;
    }

    public final List<AddYoursAvatar> getInviterAvatars() {
        return this.inviterAvatars;
    }

    public final Long getInviterCount() {
        return this.inviterCount;
    }

    public final List<AddYoursAvatar> getSuggestInviteeAvatars() {
        return this.suggestInviteeAvatars;
    }

    public final String getText() {
        return this.text;
    }

    public final Long getTopicId() {
        return this.topicId;
    }

    public final Aweme getVideo() {
        return this.video;
    }

    public final Long getVideoCount() {
        return this.videoCount;
    }

    public final Boolean getViewerInvited() {
        return this.viewerInvited;
    }

    public AddYoursTopic(Long l, String str, List<AddYoursAvatar> list, Long l2, List<AddYoursAvatar> list2, Long l3, Aweme aweme, Boolean bool, int i, Boolean bool2) {
        this.topicId = l;
        this.text = str;
        this.inviterAvatars = list;
        this.inviterCount = l2;
        this.suggestInviteeAvatars = list2;
        this.videoCount = l3;
        this.video = aweme;
        this.fromQuestion = bool;
        this.collectStatus = i;
        this.viewerInvited = bool2;
    }

    public /* synthetic */ AddYoursTopic(Long l, String str, List list, Long l2, List list2, Long l3, Aweme aweme, Boolean bool, int i, Boolean bool2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : l, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? null : l2, (i2 & 16) != 0 ? null : list2, (i2 & 32) != 0 ? null : l3, (i2 & 64) != 0 ? null : aweme, (i2 & 128) != 0 ? null : bool, (i2 & 256) != 0 ? -1 : i, (i2 & 512) == 0 ? bool2 : null);
    }
}
