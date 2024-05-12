package X;

import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AJD implements C33Q {
    public final String LJLIL;
    public final boolean LJLILLLLZI;
    public final C43I<AJE> LJLJI;
    public final C43I<C76800UCe> LJLJJI;
    public final C43I<C76800UCe> LJLJJL;
    public final AbstractC72932td<AJN> LJLJJLL;

    public AJD() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AJD)) {
            return false;
        }
        AJD ajd = (AJD) obj;
        return o.LJ(this.LJLIL, ajd.LJLIL) && this.LJLILLLLZI == ajd.LJLILLLLZI && o.LJ(this.LJLJI, ajd.LJLJI) && o.LJ(this.LJLJJI, ajd.LJLJJI) && o.LJ(this.LJLJJL, ajd.LJLJJL) && o.LJ(this.LJLJJLL, ajd.LJLJJLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        C43I<AJE> c43i = this.LJLJI;
        int hashCode2 = (i2 + (c43i == null ? 0 : c43i.hashCode())) * 31;
        C43I<C76800UCe> c43i2 = this.LJLJJI;
        int hashCode3 = (hashCode2 + (c43i2 == null ? 0 : c43i2.hashCode())) * 31;
        C43I<C76800UCe> c43i3 = this.LJLJJL;
        return this.LJLJJLL.hashCode() + ((hashCode3 + (c43i3 != null ? c43i3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RssLinkState(rssLinkText=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isInputValid=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", onInitEvent=");
        LIZ.append(this.LJLJI);
        LIZ.append(", onRssUrlUnlinkEvent=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", onIntroSheetDismissed=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", apiState=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ AJD(int i) {
        this("", false, null, null, null, C33X.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AJD(String rssLinkText, boolean z, C43I<? extends AJE> c43i, C43I<C76800UCe> c43i2, C43I<C76800UCe> c43i3, AbstractC72932td<? extends AJN> apiState) {
        o.LJIIIZ(rssLinkText, "rssLinkText");
        o.LJIIIZ(apiState, "apiState");
        this.LJLIL = rssLinkText;
        this.LJLILLLLZI = z;
        this.LJLJI = c43i;
        this.LJLJJI = c43i2;
        this.LJLJJL = c43i3;
        this.LJLJJLL = apiState;
    }

    public static AJD LIZ(AJD ajd, String str, boolean z, C43I c43i, C43I c43i2, C43I c43i3, AbstractC72932td abstractC72932td, int i) {
        AbstractC72932td apiState = abstractC72932td;
        C43I c43i4 = c43i3;
        C43I c43i5 = c43i2;
        C43I c43i6 = c43i;
        String rssLinkText = str;
        boolean z2 = z;
        if ((i & 1) != 0) {
            rssLinkText = ajd.LJLIL;
        }
        if ((i & 2) != 0) {
            z2 = ajd.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i6 = ajd.LJLJI;
        }
        if ((i & 8) != 0) {
            c43i5 = ajd.LJLJJI;
        }
        if ((i & 16) != 0) {
            c43i4 = ajd.LJLJJL;
        }
        if ((i & 32) != 0) {
            apiState = ajd.LJLJJLL;
        }
        ajd.getClass();
        o.LJIIIZ(rssLinkText, "rssLinkText");
        o.LJIIIZ(apiState, "apiState");
        return new AJD(rssLinkText, z2, c43i6, c43i5, c43i4, apiState);
    }
}
