package com.ss.android.ugc.aweme.search.pages.result.topsearch.precisead.core.model;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PreciseAdInfo implements Serializable {
    public static final int $stable = 0;

    @InterfaceC65349Pkn("is_horizontal")
    public final Boolean isHorizontal;

    /* JADX WARN: Multi-variable type inference failed */
    public PreciseAdInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PreciseAdInfo copy$default(PreciseAdInfo preciseAdInfo, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = preciseAdInfo.isHorizontal;
        }
        return preciseAdInfo.copy(bool);
    }

    public final PreciseAdInfo copy(Boolean bool) {
        return new PreciseAdInfo(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PreciseAdInfo) && o.LJ(this.isHorizontal, ((PreciseAdInfo) obj).isHorizontal);
    }

    public int hashCode() {
        Boolean bool = this.isHorizontal;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreciseAdInfo(isHorizontal=");
        return C78920UyC.LIZIZ(LIZ, this.isHorizontal, ')', LIZ);
    }

    public final Boolean isHorizontal() {
        return this.isHorizontal;
    }

    public PreciseAdInfo(Boolean bool) {
        this.isHorizontal = bool;
    }

    public /* synthetic */ PreciseAdInfo(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool);
    }
}
