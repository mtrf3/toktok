package X;

import com.ss.android.ugc.aweme.model.PaidVideoItem;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A3U implements InterfaceC57784Mm4 {
    public final PaidVideoItem LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LJLIL.getPaidVideoId());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaidContentDetailVideoItem(model=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isViewerSelfCreator=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", hasPurchasedCollection=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof A3U) {
            A3U a3u = (A3U) interfaceC57784Mm4;
            if (a3u.LJLIL.getPaidVideoId() == this.LJLIL.getPaidVideoId() && a3u.LJLILLLLZI == this.LJLILLLLZI && a3u.LJLJI == this.LJLJI) {
                return true;
            }
            return false;
        }
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof A3U) {
            if (((A3U) interfaceC57784Mm4).LJLIL.getPaidVideoId() == this.LJLIL.getPaidVideoId()) {
                return true;
            }
            return false;
        }
        return o.LJ(interfaceC57784Mm4, this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof A3U) {
            if (((A3U) obj).LJLIL.getPaidVideoId() == this.LJLIL.getPaidVideoId()) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        final boolean z;
        final boolean z2;
        if (interfaceC57784Mm4 instanceof A3U) {
            A3U a3u = (A3U) interfaceC57784Mm4;
            final boolean z3 = false;
            if (a3u.LJLIL.getPaidVideoId() != this.LJLIL.getPaidVideoId()) {
                z = true;
            } else {
                z = false;
            }
            if (a3u.LJLILLLLZI != this.LJLILLLLZI) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (a3u.LJLJI != this.LJLJI) {
                z3 = true;
            }
            return new F9E(z, z2, z3) { // from class: X.4uP
                public final boolean LJLIL;
                public final boolean LJLILLLLZI;
                public final boolean LJLJI;

                @Override // X.F9E
                public final Object[] getObjects() {
                    return new Object[]{Boolean.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI)};
                }

                {
                    this.LJLIL = z;
                    this.LJLILLLLZI = z2;
                    this.LJLJI = z3;
                }
            };
        }
        return null;
    }

    public A3U(PaidVideoItem model, boolean z, boolean z2) {
        o.LJIIIZ(model, "model");
        this.LJLIL = model;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
    }
}
