package com.ss.android.ugc.aweme.profile.model;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class PostGuideTasks extends F9E {
    public final int followCountFromRecommend;
    public final boolean isFollowTaskDone;
    public final boolean isProfileTaskDone;
    public final boolean isShootTaskDone;

    public static /* synthetic */ PostGuideTasks copy$default(PostGuideTasks postGuideTasks, boolean z, boolean z2, boolean z3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = postGuideTasks.isFollowTaskDone;
        }
        if ((i2 & 2) != 0) {
            z2 = postGuideTasks.isShootTaskDone;
        }
        if ((i2 & 4) != 0) {
            z3 = postGuideTasks.isProfileTaskDone;
        }
        if ((i2 & 8) != 0) {
            i = postGuideTasks.followCountFromRecommend;
        }
        return postGuideTasks.copy(z, z2, z3, i);
    }

    public final PostGuideTasks copy(boolean z, boolean z2, boolean z3, int i) {
        return new PostGuideTasks(z, z2, z3, i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isFollowTaskDone), Boolean.valueOf(this.isShootTaskDone), Boolean.valueOf(this.isProfileTaskDone), Integer.valueOf(this.followCountFromRecommend)};
    }

    public final boolean allAccomplish() {
        if (this.isFollowTaskDone && this.isShootTaskDone && this.isProfileTaskDone) {
            return true;
        }
        return false;
    }

    public final int taskCountDone() {
        return (this.isFollowTaskDone ? 1 : 0) + (this.isShootTaskDone ? 1 : 0) + (this.isProfileTaskDone ? 1 : 0);
    }

    public PostGuideTasks(boolean z, boolean z2, boolean z3, int i) {
        this.isFollowTaskDone = z;
        this.isShootTaskDone = z2;
        this.isProfileTaskDone = z3;
        this.followCountFromRecommend = i;
    }

    public /* synthetic */ PostGuideTasks(boolean z, boolean z2, boolean z3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, (i2 & 8) != 0 ? 0 : i);
    }
}
