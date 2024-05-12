package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;

/* loaded from: classes9.dex */
public final class JOC<T> implements InterfaceC15040iS {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ JVP LIZIZ;
    public final /* synthetic */ String LIZJ;

    public JOC(long j, JVP jvp, String str) {
        this.LIZ = j;
        this.LIZIZ = jvp;
        this.LIZJ = str;
    }

    @Override // X.InterfaceC15040iS
    public final void accept(Object obj) {
        SearchVideoHolder searchVideoHolder;
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj;
        if ((viewHolder instanceof SearchVideoHolder) && (searchVideoHolder = (SearchVideoHolder) viewHolder) != null) {
            long j = this.LIZ;
            this.LIZIZ.LJZ(this.LIZJ);
            searchVideoHolder.F0();
            searchVideoHolder.H0(j);
        }
    }
}
