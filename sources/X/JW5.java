package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JW5 implements JW6 {
    public final SearchMixFeed LJLIL;
    public final C48462J0g LJLILLLLZI = C87277YNd.LJJIFFI(new AqS174S0100000_8(this, 97));

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AggregatedCardRenderDataImpl(searchMixFeed=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC48993JKr
    public final SearchMixFeed LIZ() {
        return this.LJLIL;
    }

    @Override // X.JMS
    public final C48462J0g LLLF() {
        return this.LJLILLLLZI;
    }

    public JW5(SearchMixFeed searchMixFeed) {
        this.LJLIL = searchMixFeed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof JW5) && o.LJ(this.LJLIL, ((JW5) obj).LJLIL)) {
            return true;
        }
        return false;
    }
}