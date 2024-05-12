package com.ss.android.ugc.aweme.feed.model;

import X.C1NE;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class InteractionTagInfo implements Serializable {

    @InterfaceC65349Pkn("interest_level")
    public int interestLevel;

    @InterfaceC65349Pkn("tagged_users")
    public List<InteractionTagUserInfo> taggedUsers;

    @InterfaceC65349Pkn("video_label_text")
    public String videoLabelText;

    /* JADX WARN: Multi-variable type inference failed */
    public InteractionTagInfo() {
        this(0, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InteractionTagInfo copy$default(InteractionTagInfo interactionTagInfo, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = interactionTagInfo.interestLevel;
        }
        if ((i2 & 2) != 0) {
            str = interactionTagInfo.videoLabelText;
        }
        if ((i2 & 4) != 0) {
            list = interactionTagInfo.taggedUsers;
        }
        return interactionTagInfo.copy(i, str, list);
    }

    public final InteractionTagInfo copy(int i, String videoLabelText, List<InteractionTagUserInfo> list) {
        o.LJIIIZ(videoLabelText, "videoLabelText");
        return new InteractionTagInfo(i, videoLabelText, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractionTagInfo)) {
            return false;
        }
        InteractionTagInfo interactionTagInfo = (InteractionTagInfo) obj;
        return this.interestLevel == interactionTagInfo.interestLevel && o.LJ(this.videoLabelText, interactionTagInfo.videoLabelText) && o.LJ(this.taggedUsers, interactionTagInfo.taggedUsers);
    }

    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.videoLabelText, this.interestLevel * 31, 31);
        List<InteractionTagUserInfo> list = this.taggedUsers;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return LJ + hashCode;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InteractionTagInfo(interestLevel=");
        LIZ.append(this.interestLevel);
        LIZ.append(", videoLabelText=");
        LIZ.append(this.videoLabelText);
        LIZ.append(", taggedUsers=");
        return C1NE.LIZIZ(LIZ, this.taggedUsers, ')', LIZ);
    }

    public final int getInterestLevel() {
        return this.interestLevel;
    }

    public final List<InteractionTagUserInfo> getTaggedUsers() {
        return this.taggedUsers;
    }

    public final String getVideoLabelText() {
        return this.videoLabelText;
    }

    public final void setInterestLevel(int i) {
        this.interestLevel = i;
    }

    public final void setTaggedUsers(List<InteractionTagUserInfo> list) {
        this.taggedUsers = list;
    }

    public final void setVideoLabelText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.videoLabelText = str;
    }

    public InteractionTagInfo(int i, String videoLabelText, List<InteractionTagUserInfo> list) {
        o.LJIIIZ(videoLabelText, "videoLabelText");
        this.interestLevel = i;
        this.videoLabelText = videoLabelText;
        this.taggedUsers = list;
    }

    public /* synthetic */ InteractionTagInfo(int i, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : list);
    }
}
