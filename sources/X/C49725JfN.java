package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.o;

/* renamed from: X.JfN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49725JfN extends C0A6 {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ C8HS<SearchMixFeed> LJLILLLLZI;
    public final /* synthetic */ RecyclerView LJLJI;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            C49724JfM c49724JfM = C49724JfM.LIZ;
            Context context = this.LJLIL;
            C8HS<SearchMixFeed> c8hs = this.LJLILLLLZI;
            RecyclerView recyclerView2 = this.LJLJI;
            c49724JfM.getClass();
            C49724JfM.LIZJ(context, c8hs, recyclerView2);
        }
    }

    public C49725JfN(Context context, C8HS c8hs, C49710Jf8 c49710Jf8) {
        this.LJLIL = context;
        this.LJLILLLLZI = c8hs;
        this.LJLJI = c49710Jf8;
    }
}
