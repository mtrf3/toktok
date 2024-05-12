package com.ss.android.ugc.now.interaction.api;

import X.C16880lQ;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LikeState extends Interaction {
    public final String awemeId;
    public final boolean isLiked;
    public final boolean isRefresh;
    public final long likeCount;

    public static /* synthetic */ LikeState copy$default(LikeState likeState, long j, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = likeState.likeCount;
        }
        if ((i & 2) != 0) {
            z = likeState.isLiked;
        }
        if ((i & 4) != 0) {
            z2 = likeState.isRefresh;
        }
        if ((i & 8) != 0) {
            str = likeState.getAwemeId();
        }
        return likeState.copy(j, z, z2, str);
    }

    public final String component4() {
        return getAwemeId();
    }

    public final LikeState copy(long j, boolean z, boolean z2, String str) {
        return new LikeState(j, z, z2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikeState)) {
            return false;
        }
        LikeState likeState = (LikeState) obj;
        return this.likeCount == likeState.likeCount && this.isLiked == likeState.isLiked && this.isRefresh == likeState.isRefresh && o.LJ(getAwemeId(), likeState.getAwemeId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.likeCount) * 31;
        boolean z = this.isLiked;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((LLJIJIL + i) * 31) + (this.isRefresh ? 1 : 0)) * 31) + (getAwemeId() == null ? 0 : getAwemeId().hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LikeState(likeCount=");
        LIZ.append(this.likeCount);
        LIZ.append(", isLiked=");
        LIZ.append(this.isLiked);
        LIZ.append(", isRefresh=");
        LIZ.append(this.isRefresh);
        LIZ.append(", awemeId=");
        LIZ.append(getAwemeId());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // com.ss.android.ugc.now.interaction.api.Interaction
    public String getAwemeId() {
        return this.awemeId;
    }

    public final long getLikeCount() {
        return this.likeCount;
    }

    public final boolean isLiked() {
        return this.isLiked;
    }

    public final boolean isRefresh() {
        return this.isRefresh;
    }

    public LikeState(long j, boolean z, boolean z2, String str) {
        super(null, 1, null);
        this.likeCount = j;
        this.isLiked = z;
        this.isRefresh = z2;
        this.awemeId = str;
    }

    public /* synthetic */ LikeState(long j, boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : str);
    }
}
