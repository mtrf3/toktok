package com.ss.android.ugc.now.interaction.assem;

import X.InterfaceC57784Mm4;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LikeItem implements InterfaceC57784Mm4 {
    public final Aweme aweme;
    public final NowFeedMobHierarchyData interactionHierarchyData;
    public final User user;

    public static /* synthetic */ LikeItem copy$default(LikeItem likeItem, User user, Aweme aweme, NowFeedMobHierarchyData nowFeedMobHierarchyData, int i, Object obj) {
        if ((i & 1) != 0) {
            user = likeItem.user;
        }
        if ((i & 2) != 0) {
            aweme = likeItem.aweme;
        }
        if ((i & 4) != 0) {
            nowFeedMobHierarchyData = likeItem.interactionHierarchyData;
        }
        return likeItem.copy(user, aweme, nowFeedMobHierarchyData);
    }

    public final LikeItem copy(User user, Aweme aweme, NowFeedMobHierarchyData nowFeedMobHierarchyData) {
        o.LJIIIZ(user, "user");
        return new LikeItem(user, aweme, nowFeedMobHierarchyData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikeItem)) {
            return false;
        }
        LikeItem likeItem = (LikeItem) obj;
        return o.LJ(this.user, likeItem.user) && o.LJ(this.aweme, likeItem.aweme) && o.LJ(this.interactionHierarchyData, likeItem.interactionHierarchyData);
    }

    public int hashCode() {
        int hashCode = this.user.hashCode() * 31;
        Aweme aweme = this.aweme;
        int hashCode2 = (hashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
        NowFeedMobHierarchyData nowFeedMobHierarchyData = this.interactionHierarchyData;
        return hashCode2 + (nowFeedMobHierarchyData != null ? nowFeedMobHierarchyData.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LikeItem(user=");
        LIZ.append(this.user);
        LIZ.append(", aweme=");
        LIZ.append(this.aweme);
        LIZ.append(", interactionHierarchyData=");
        LIZ.append(this.interactionHierarchyData);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final NowFeedMobHierarchyData getInteractionHierarchyData() {
        return this.interactionHierarchyData;
    }

    public final User getUser() {
        return this.user;
    }

    @Override // X.InterfaceC57784Mm4
    public boolean areContentsTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return o.LJ(other, this);
    }

    @Override // X.InterfaceC57784Mm4
    public boolean areItemTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        if (other instanceof LikeItem) {
            return o.LJ(this.user.getUid(), ((LikeItem) other).user.getUid());
        }
        return false;
    }

    @Override // X.InterfaceC57784Mm4
    public Object getChangePayload(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return null;
    }

    public LikeItem(User user, Aweme aweme, NowFeedMobHierarchyData nowFeedMobHierarchyData) {
        o.LJIIIZ(user, "user");
        this.user = user;
        this.aweme = aweme;
        this.interactionHierarchyData = nowFeedMobHierarchyData;
    }
}
