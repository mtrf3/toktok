package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.8yC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C228648yC implements InterfaceC57784Mm4 {
    public UrlModel LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public Aweme LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;

    public C228648yC() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C228648yC)) {
            return false;
        }
        C228648yC c228648yC = (C228648yC) obj;
        return o.LJ(this.LJLIL, c228648yC.LJLIL) && this.LJLILLLLZI == c228648yC.LJLILLLLZI && this.LJLJI == c228648yC.LJLJI && this.LJLJJI == c228648yC.LJLJJI && o.LJ(this.LJLJJL, c228648yC.LJLJJL) && this.LJLJJLL == c228648yC.LJLJJLL && this.LJLJL == c228648yC.LJLJL;
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        UrlModel urlModel = this.LJLIL;
        int hashCode = (urlModel == null ? 0 : urlModel.hashCode()) * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.LJLJI;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.LJLJJI;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        Aweme aweme = this.LJLJJL;
        int hashCode2 = (i6 + (aweme != null ? aweme.hashCode() : 0)) * 31;
        boolean z4 = this.LJLJJLL;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        return ((hashCode2 + i7) * 31) + (this.LJLJL ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MixPickCandidatePowerItem(cover=");
        LIZ.append(this.LJLIL);
        LIZ.append(", selected=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", gray=");
        LIZ.append(this.LJLJI);
        LIZ.append(", inOtherList=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", video=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", selectedGray=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", isBlocked=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJL, ')', LIZ);
    }

    public /* synthetic */ C228648yC(int i) {
        this(null, false, false, false, null, false, false);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof C228648yC) {
            return o.LJ(this.LJLJJL, ((C228648yC) interfaceC57784Mm4).LJLJJL);
        }
        return o.LJ(interfaceC57784Mm4, this);
    }

    public static C228648yC LIZ(C228648yC c228648yC, boolean z) {
        UrlModel urlModel = c228648yC.LJLIL;
        boolean z2 = c228648yC.LJLILLLLZI;
        boolean z3 = c228648yC.LJLJJI;
        Aweme aweme = c228648yC.LJLJJL;
        boolean z4 = c228648yC.LJLJJLL;
        boolean z5 = c228648yC.LJLJL;
        c228648yC.getClass();
        return new C228648yC(urlModel, z2, z, z3, aweme, z4, z5);
    }

    public C228648yC(UrlModel urlModel, boolean z, boolean z2, boolean z3, Aweme aweme, boolean z4, boolean z5) {
        this.LJLIL = urlModel;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = z3;
        this.LJLJJL = aweme;
        this.LJLJJLL = z4;
        this.LJLJL = z5;
    }
}
