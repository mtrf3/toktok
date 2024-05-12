package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JLv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49023JLv implements InterfaceC49014JLm, InterfaceC57784Mm4 {
    public final SearchMixFeed LJLIL;
    public final Aweme LJLILLLLZI;
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
        LIZ.append("AggregatedSubCardRenderDataImpl(searchMixFeed=");
        LIZ.append(this.LJLIL);
        LIZ.append(", aweme=");
        return C770830u.LIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.InterfaceC48993JKr
    public final SearchMixFeed LIZ() {
        return this.LJLIL;
    }

    @Override // X.JMS
    public final C48462J0g LLLF() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC49000JKy
    public final Aweme getAweme() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49023JLv)) {
            return false;
        }
        C49023JLv c49023JLv = (C49023JLv) obj;
        if (o.LJ(this.LJLIL, c49023JLv.LJLIL) && o.LJ(this.LJLILLLLZI, c49023JLv.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public C49023JLv(SearchMixFeed searchMixFeed, Aweme aweme) {
        o.LJIIIZ(searchMixFeed, "searchMixFeed");
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL = searchMixFeed;
        this.LJLILLLLZI = aweme;
        this.LJLJI = C87277YNd.LJJIFFI(new AqS174S0100000_8(this, 98));
    }
}
