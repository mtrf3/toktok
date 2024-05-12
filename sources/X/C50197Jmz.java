package X;

import Y.IDCListenerS148S0200000_8;
import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.SearchHubTabsComponent;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubHeaderVM;
import java.util.HashMap;
import kotlin.jvm.internal.AqS32S0001000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.Jmz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50197Jmz extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ SearchHubTabsComponent LJLILLLLZI;
    public final /* synthetic */ RecyclerView LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50197Jmz(long j, SearchHubTabsComponent searchHubTabsComponent, RecyclerView recyclerView) {
        super(0);
        this.LJLIL = j;
        this.LJLILLLLZI = searchHubTabsComponent;
        this.LJLJI = recyclerView;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLIL;
        if (C50191Jmt.LIZ > 0) {
            long j = C50191Jmt.LIZ;
            C50196Jmy c50196Jmy = new C50196Jmy();
            c50196Jmy.LJI = true;
            OSZ[] oszArr = new OSZ[4];
            int i = 0;
            oszArr[0] = new OSZ("type", "native");
            Long[] lArr = {Long.valueOf(j), Long.valueOf(elapsedRealtime)};
            long j2 = 0;
            do {
                j2 += lArr[i].longValue();
                i++;
            } while (i < 2);
            oszArr[1] = new OSZ("total_cost", Long.valueOf(j2));
            oszArr[2] = new OSZ("create_view_cost", Long.valueOf(j));
            oszArr[3] = new OSZ("bind_cost", Long.valueOf(elapsedRealtime));
            ((HashMap) c50196Jmy.LJIIL).putAll(C113554cx.LJJL(oszArr));
            c50196Jmy.LJIILIIL();
            C50191Jmt.LIZ = 0L;
        }
        SearchHubHeaderVM H3 = this.LJLILLLLZI.H3();
        int max = Math.max(C7MY.LIZIZ(48), this.LJLJI.getHeight());
        H3.getClass();
        H3.setState(new AqS32S0001000_8(max, 2));
        RecyclerView recyclerView = this.LJLJI;
        o.LJIIIIZZ(recyclerView, "recyclerView");
        RecyclerView recyclerView2 = this.LJLJI;
        SearchHubTabsComponent searchHubTabsComponent = this.LJLILLLLZI;
        if (C16330kX.LIZJ(recyclerView) && !recyclerView.isLayoutRequested()) {
            try {
                recyclerView2.LJLI(searchHubTabsComponent.H3().getState().LJLJJLL);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        } else {
            recyclerView.addOnLayoutChangeListener(new IDCListenerS148S0200000_8(recyclerView2, searchHubTabsComponent, 1));
        }
        return C76800UCe.LIZ;
    }
}
