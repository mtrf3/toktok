package com.ss.android.ugc.aweme.audiomode.vopclone.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class HashtagId {

    @InterfaceC65349Pkn("hashtag_id")
    public final String hashtagID;

    /* JADX WARN: Multi-variable type inference failed */
    public HashtagId() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HashtagId) && o.LJ(this.hashtagID, ((HashtagId) obj).hashtagID);
    }

    public final int hashCode() {
        String str = this.hashtagID;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HashtagId(hashtagID=");
        return q.LIZIZ(LIZ, this.hashtagID, ')', LIZ);
    }

    public HashtagId(String str) {
        this.hashtagID = str;
    }

    public /* synthetic */ HashtagId(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
