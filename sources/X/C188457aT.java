package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.7aT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188457aT implements InterfaceC57784Mm4 {
    public final String LJLIL;
    public final Aweme LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C188457aT)) {
            return false;
        }
        C188457aT c188457aT = (C188457aT) obj;
        return o.LJ(this.LJLIL, c188457aT.LJLIL) && o.LJ(this.LJLILLLLZI, c188457aT.LJLILLLLZI);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        String str = this.LJLIL;
        return this.LJLILLLLZI.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiVideoListItemItem(poiId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", data=");
        return C770830u.LIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C188457aT(String str, Aweme data) {
        o.LJIIIZ(data, "data");
        this.LJLIL = str;
        this.LJLILLLLZI = data;
    }
}
