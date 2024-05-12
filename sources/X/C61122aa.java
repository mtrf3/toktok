package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.2aa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61122aa implements InterfaceC57784Mm4 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61122aa)) {
            return false;
        }
        obj.getClass();
        return o.LJ(null, null) && o.LJ(null, null) && o.LJ(null, null);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowPostAggregationPowerItem(displayImage=");
        LIZ.append((Object) null);
        LIZ.append(", userAvatarList=");
        LIZ.append((Object) null);
        LIZ.append(", descStr=");
        LIZ.append((Object) null);
        LIZ.append(", nowFeedType=");
        LIZ.append(0);
        LIZ.append(", totalCount=");
        return b0.LIZJ(LIZ, 0, ')', LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }
}
