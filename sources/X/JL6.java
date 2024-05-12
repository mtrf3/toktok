package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class JL6 extends JLX {
    public final String LJLJJI;
    public JQA LJLJJL;
    public JL9 LJLJJLL;
    public final List<JL8> LJLJL;

    public abstract void LJLZ(List<? extends Aweme> list, SearchCardInfo searchCardInfo, Long l, boolean z);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JL6(RecyclerView rv) {
        super(rv);
        o.LJIIIZ(rv, "rv");
        this.LJLJJI = "";
        this.LJLJL = new ArrayList();
    }

    public static /* synthetic */ void LJZ(JL6 jl6, List list, SearchCardInfo searchCardInfo, Long l, int i) {
        boolean z;
        if ((i & 2) != 0) {
            searchCardInfo = null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        jl6.LJLZ(list, searchCardInfo, l, z);
    }
}
