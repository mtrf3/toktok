package com.ss.android.ugc.now.interaction.assem;

import X.InterfaceC57784Mm4;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ViewerItem implements InterfaceC57784Mm4 {
    public final Aweme aweme;
    public final NowFeedMobHierarchyData interactionHierarchyData;
    public final User user;

    public static /* synthetic */ ViewerItem copy$default(ViewerItem viewerItem, User user, Aweme aweme, NowFeedMobHierarchyData nowFeedMobHierarchyData, int i, Object obj) {
        if ((i & 1) != 0) {
            user = viewerItem.user;
        }
        if ((i & 2) != 0) {
            aweme = viewerItem.aweme;
        }
        if ((i & 4) != 0) {
            nowFeedMobHierarchyData = viewerItem.interactionHierarchyData;
        }
        return viewerItem.copy(user, aweme, nowFeedMobHierarchyData);
    }

    public final ViewerItem copy(User user, Aweme aweme, NowFeedMobHierarchyData nowFeedMobHierarchyData) {
        o.LJIIIZ(user, "user");
        return new ViewerItem(user, aweme, nowFeedMobHierarchyData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewerItem)) {
            return false;
        }
        ViewerItem viewerItem = (ViewerItem) obj;
        return o.LJ(this.user, viewerItem.user) && o.LJ(this.aweme, viewerItem.aweme) && o.LJ(this.interactionHierarchyData, viewerItem.interactionHierarchyData);
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
        LIZ.append("ViewerItem(user=");
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
        if (other instanceof ViewerItem) {
            return o.LJ(this.user.getUid(), ((ViewerItem) other).user.getUid());
        }
        return false;
    }

    @Override // X.InterfaceC57784Mm4
    public Object getChangePayload(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return null;
    }

    public ViewerItem(User user, Aweme aweme, NowFeedMobHierarchyData nowFeedMobHierarchyData) {
        o.LJIIIZ(user, "user");
        this.user = user;
        this.aweme = aweme;
        this.interactionHierarchyData = nowFeedMobHierarchyData;
    }
}
