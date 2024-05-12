package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.bot.SearchBotHolder;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.TakoInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JT4 implements InterfaceC49194JSk {
    public final /* synthetic */ SearchBotHolder LJLIL;

    public JT4(SearchBotHolder searchBotHolder) {
        this.LJLIL = searchBotHolder;
    }

    @Override // X.InterfaceC49194JSk
    public final int LLD(Aweme aweme) {
        TakoInfo takoInfo;
        List<Aweme> awemeList;
        o.LJIIIZ(aweme, "aweme");
        SearchMixFeed searchMixFeed = this.LJLIL.LJZI;
        if (searchMixFeed != null && (takoInfo = searchMixFeed.bot) != null && (awemeList = takoInfo.getAwemeList()) != null) {
            return awemeList.indexOf(aweme);
        }
        return -1;
    }
}
