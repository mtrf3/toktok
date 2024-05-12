package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JN1 implements InterfaceC48993JKr, JMS, InterfaceC57784Mm4 {
    public final SearchMixFeed LJLIL;
    public final JN2 LJLILLLLZI;
    public final C48462J0g LJLJI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        return this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TakoSugCardRenderDataImpl(searchMixFeed=");
        LIZ.append(this.LJLIL);
        LIZ.append(", sugItem=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC48993JKr
    public final SearchMixFeed LIZ() {
        return this.LJLIL;
    }

    @Override // X.JMS
    public final C48462J0g LLLF() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return o.LJ(other, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JN1)) {
            return false;
        }
        JN1 jn1 = (JN1) obj;
        if (o.LJ(this.LJLIL, jn1.LJLIL) && o.LJ(this.LJLILLLLZI, jn1.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public JN1(SearchMixFeed searchMixFeed, JN2 jn2) {
        o.LJIIIZ(searchMixFeed, "searchMixFeed");
        this.LJLIL = searchMixFeed;
        this.LJLILLLLZI = jn2;
        this.LJLJI = C87277YNd.LJJIFFI(new AqS174S0100000_8(this, 80));
    }
}
