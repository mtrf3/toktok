package com.ss.android.ugc.aweme.result.common.core.model;

import X.C770830u;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EComShopCardStruct {

    @InterfaceC65349Pkn("live_entity")
    public final Aweme liveEntity;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EComShopCardStruct) && o.LJ(this.liveEntity, ((EComShopCardStruct) obj).liveEntity);
    }

    public final int hashCode() {
        Aweme aweme = this.liveEntity;
        if (aweme == null) {
            return 0;
        }
        return aweme.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EComShopCardStruct(liveEntity=");
        return C770830u.LIZ(LIZ, this.liveEntity, ')', LIZ);
    }

    public EComShopCardStruct(Aweme aweme) {
        this.liveEntity = aweme;
    }
}
