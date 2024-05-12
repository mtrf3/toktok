package com.ss.android.ugc.now.interaction.api;

import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PostActiveState extends Interaction {
    public final boolean active;
    public final String awemeId;

    /* JADX WARN: Multi-variable type inference failed */
    public PostActiveState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PostActiveState copy$default(PostActiveState postActiveState, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = postActiveState.active;
        }
        if ((i & 2) != 0) {
            str = postActiveState.getAwemeId();
        }
        return postActiveState.copy(z, str);
    }

    public final String component2() {
        return getAwemeId();
    }

    public final PostActiveState copy(boolean z, String str) {
        return new PostActiveState(z, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostActiveState)) {
            return false;
        }
        PostActiveState postActiveState = (PostActiveState) obj;
        return this.active == postActiveState.active && o.LJ(getAwemeId(), postActiveState.getAwemeId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        boolean z = this.active;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (i * 31) + (getAwemeId() == null ? 0 : getAwemeId().hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PostActiveState(active=");
        LIZ.append(this.active);
        LIZ.append(", awemeId=");
        LIZ.append(getAwemeId());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean getActive() {
        return this.active;
    }

    @Override // com.ss.android.ugc.now.interaction.api.Interaction
    public String getAwemeId() {
        return this.awemeId;
    }

    public PostActiveState(boolean z, String str) {
        super(null, 1, null);
        this.active = z;
        this.awemeId = str;
    }

    public /* synthetic */ PostActiveState(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str);
    }
}
