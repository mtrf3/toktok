package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JQ3 implements InterfaceC49194JSk {
    public final /* synthetic */ SearchAwemeCardViewHolder LJLIL;

    public JQ3(SearchAwemeCardViewHolder searchAwemeCardViewHolder) {
        this.LJLIL = searchAwemeCardViewHolder;
    }

    @Override // X.InterfaceC49194JSk
    public final int LLD(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        SearchAwemeCardViewHolder searchAwemeCardViewHolder = this.LJLIL;
        searchAwemeCardViewHolder.getClass();
        if (!TextUtils.equals(JJG.LJLJLLL, aweme.getAid())) {
            searchAwemeCardViewHolder.LJJII(aweme);
        }
        List<? extends Aweme> list = searchAwemeCardViewHolder.LJLJJI;
        if (list != null) {
            Iterator<? extends Aweme> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (TextUtils.equals(it.next().getAid(), aweme.getAid())) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }
}
