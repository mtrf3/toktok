package com.ss.android.ugc.aweme.discover.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class ChallengeExtraAttrStruct extends F9E implements Serializable {

    @InterfaceC65349Pkn("is_live")
    public final boolean isLive;

    public ChallengeExtraAttrStruct() {
        this(false, 1, null);
    }

    public static /* synthetic */ ChallengeExtraAttrStruct copy$default(ChallengeExtraAttrStruct challengeExtraAttrStruct, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = challengeExtraAttrStruct.isLive;
        }
        return challengeExtraAttrStruct.copy(z);
    }

    public final ChallengeExtraAttrStruct copy(boolean z) {
        return new ChallengeExtraAttrStruct(z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isLive)};
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public ChallengeExtraAttrStruct(boolean z) {
        this.isLive = z;
    }

    public /* synthetic */ ChallengeExtraAttrStruct(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
