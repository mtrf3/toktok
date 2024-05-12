package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchUserViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ja4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49396Ja4 extends JZH<SearchUser> implements KGT {
    public final JZB LJLJJLL;
    public SearchUserViewHolder LJLJL;
    public JQA LJLJLJ;
    public final String LJLJLLL;
    public String LJLL;
    public InterfaceC49417JaP LJLLI;

    @Override // X.AbstractC51777KTt
    public final RecyclerView.ViewHolder LJLZ(ViewGroup parent) {
        SearchUserViewHolder searchUserViewHolder = this.LJLJL;
        if (searchUserViewHolder != null) {
            this.LJLJL = null;
            return searchUserViewHolder;
        }
        JZB listener = this.LJLJJLL;
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(listener, "listener");
        return new SearchUserViewHolder(C50365Jph.LIZIZ(R.layout.chj, parent), listener);
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LJLJL = (SearchUserViewHolder) LJLZ(recyclerView);
    }

    @Override // X.C8HS
    public final void setData(List<SearchUser> list) {
        JZG jzg = this.LJLJJL;
        if (jzg != null) {
            jzg.LIZLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        super.setData(list);
    }

    public C49396Ja4(SearchKeywordPresenter searchKeywordPresenter, JVM jvm) {
        this.LJLJJI = searchKeywordPresenter;
        this.LJLJJLL = jvm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0111  */
    /* JADX WARN: Type inference failed for: r12v16, types: [android.text.SpannableString, android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r13v4, types: [X.Jau] */
    @Override // X.AbstractC51777KTt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLLLLLL(androidx.recyclerview.widget.RecyclerView.ViewHolder r27, int r28) {
        /*
            Method dump skipped, instructions count: 1623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49396Ja4.LJLLLLLL(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public C49396Ja4(SearchResultParam searchResultParam, InterfaceC49816Jgq interfaceC49816Jgq, JZB jzb, JZI jzi, String str) {
        super(searchResultParam, interfaceC49816Jgq, jzi);
        this.LJLJJLL = jzb;
        this.LJLJLLL = str;
    }
}
