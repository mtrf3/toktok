package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.TakoInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JLw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49024JLw implements InterfaceC49014JLm, C7MX, InterfaceC57784Mm4 {
    public final SearchMixFeed LJLIL;
    public final Aweme LJLILLLLZI;
    public final C48462J0g LJLJI;
    public final int LJLJJI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        return this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TakoSubCardRenderDataImpl(searchMixFeed=");
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

    @Override // X.C7MX
    public final int getIndex() {
        return this.LJLJJI;
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
        if (!(obj instanceof C49024JLw)) {
            return false;
        }
        C49024JLw c49024JLw = (C49024JLw) obj;
        if (o.LJ(this.LJLIL, c49024JLw.LJLIL) && o.LJ(this.LJLILLLLZI, c49024JLw.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public C49024JLw(SearchMixFeed searchMixFeed, Aweme aweme) {
        o.LJIIIZ(searchMixFeed, "searchMixFeed");
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL = searchMixFeed;
        this.LJLILLLLZI = aweme;
        this.LJLJI = C87277YNd.LJJIFFI(new AqS174S0100000_8(this, 79));
        this.LJLJJI = LIZIZ(searchMixFeed, aweme) + 1;
    }

    public static int LIZIZ(SearchMixFeed searchMixFeed, Aweme aweme) {
        TakoInfo takoInfo;
        List<Aweme> awemeList;
        String str;
        if (searchMixFeed != null && searchMixFeed.LJIIJ() && (takoInfo = searchMixFeed.bot) != null && (awemeList = takoInfo.getAwemeList()) != null) {
            Iterator<Aweme> it = awemeList.iterator();
            int i = 0;
            while (it.hasNext()) {
                String aid = it.next().getAid();
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (o.LJ(aid, str)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }
}
