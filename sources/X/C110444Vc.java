package X;

import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.viewmodel.GroupSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.4Vc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110444Vc implements InterfaceC57784Mm4 {
    public final InterfaceC62225ObV LJLIL;
    public final GroupSharePackage LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C110444Vc)) {
            return false;
        }
        C110444Vc c110444Vc = (C110444Vc) obj;
        return o.LJ(this.LJLIL, c110444Vc.LJLIL) && o.LJ(this.LJLILLLLZI, c110444Vc.LJLILLLLZI);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        return this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShareGroupItem(channel=");
        LIZ.append(this.LJLIL);
        LIZ.append(", sharePackage=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C110444Vc(InterfaceC62225ObV channel, GroupSharePackage groupSharePackage) {
        o.LJIIIZ(channel, "channel");
        this.LJLIL = channel;
        this.LJLILLLLZI = groupSharePackage;
    }
}
