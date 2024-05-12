package com.ss.android.ugc.aweme.friends.model;

import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DislikeRecommendParams {
    public final String secUid;
    public final String uid;

    public static /* synthetic */ DislikeRecommendParams copy$default(DislikeRecommendParams dislikeRecommendParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dislikeRecommendParams.uid;
        }
        if ((i & 2) != 0) {
            str2 = dislikeRecommendParams.secUid;
        }
        return dislikeRecommendParams.copy(str, str2);
    }

    public final DislikeRecommendParams copy(String uid, String str) {
        o.LJIIIZ(uid, "uid");
        return new DislikeRecommendParams(uid, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DislikeRecommendParams)) {
            return false;
        }
        DislikeRecommendParams dislikeRecommendParams = (DislikeRecommendParams) obj;
        return o.LJ(this.uid, dislikeRecommendParams.uid) && o.LJ(this.secUid, dislikeRecommendParams.secUid);
    }

    public int hashCode() {
        int hashCode = this.uid.hashCode() * 31;
        String str = this.secUid;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DislikeRecommendParams(uid=");
        LIZ.append(this.uid);
        LIZ.append(", secUid=");
        return q.LIZIZ(LIZ, this.secUid, ')', LIZ);
    }

    public DislikeRecommendParams(String uid, String str) {
        o.LJIIIZ(uid, "uid");
        this.uid = uid;
        this.secUid = str;
    }
}
