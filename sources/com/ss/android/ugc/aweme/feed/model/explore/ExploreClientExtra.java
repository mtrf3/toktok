package com.ss.android.ugc.aweme.feed.model.explore;

import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ExploreClientExtra {
    public static final Companion Companion = new Companion();
    public volatile int cacheType;
    public String displayDesc;

    /* JADX WARN: Multi-variable type inference failed */
    public ExploreClientExtra() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ExploreClientExtra copy$default(ExploreClientExtra exploreClientExtra, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = exploreClientExtra.cacheType;
        }
        if ((i2 & 2) != 0) {
            str = exploreClientExtra.displayDesc;
        }
        return exploreClientExtra.copy(i, str);
    }

    public final ExploreClientExtra copy(int i, String str) {
        return new ExploreClientExtra(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreClientExtra)) {
            return false;
        }
        ExploreClientExtra exploreClientExtra = (ExploreClientExtra) obj;
        return this.cacheType == exploreClientExtra.cacheType && o.LJ(this.displayDesc, exploreClientExtra.displayDesc);
    }

    public int hashCode() {
        int i = this.cacheType * 31;
        String str = this.displayDesc;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExploreClientExtra(cacheType=");
        LIZ.append(this.cacheType);
        LIZ.append(", displayDesc=");
        return q.LIZIZ(LIZ, this.displayDesc, ')', LIZ);
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final void update(ExploreClientExtra exploreClientExtra) {
        if (exploreClientExtra == null) {
            return;
        }
        if (exploreClientExtra.cacheType > this.cacheType) {
            this.cacheType = exploreClientExtra.cacheType;
        }
        if (this.displayDesc == null) {
            this.displayDesc = exploreClientExtra.displayDesc;
        }
    }

    public ExploreClientExtra(int i, String str) {
        this.cacheType = i;
        this.displayDesc = str;
    }

    public /* synthetic */ ExploreClientExtra(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str);
    }
}
