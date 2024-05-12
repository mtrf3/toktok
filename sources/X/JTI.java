package X;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.search.performance.core.config.SearchHorizontalCardRecyclerViewSlideOptConfig;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JTI extends RecyclerView.ViewHolder {
    public final C42197GhF LJLIL;
    public final RecyclerView LJLILLLLZI;
    public final ViewGroup LJLJI;
    public final ViewGroup LJLJJI;
    public final C80001VaX LJLJJL;
    public final ViewStub LJLJJLL;
    public final JR9 LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JTI(View itemView) {
        super(itemView);
        Field field;
        o.LJIIIZ(itemView, "itemView");
        C42197GhF c42197GhF = new C42197GhF();
        this.LJLIL = c42197GhF;
        View findViewById = itemView.findViewById(R.id.b5o);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.card_list)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.LJLILLLLZI = recyclerView;
        this.LJLJI = (ViewGroup) itemView.findViewById(R.id.g7k);
        this.LJLJJI = (ViewGroup) itemView.findViewById(R.id.g7m);
        this.LJLJJL = (C80001VaX) itemView.findViewById(R.id.jcu);
        this.LJLJJLL = (ViewStub) itemView.findViewById(R.id.p1);
        if (JTG.LIZ()) {
            recyclerView.setMotionEventSplittingEnabled(false);
        }
        itemView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(c42197GhF);
        if (JTJ.LJLILLLLZI.LJJII() && (field = C7DG.LIZ) != null) {
            try {
                float f = ((SearchHorizontalCardRecyclerViewSlideOptConfig) JTJ.LJLJJI.getValue()).horizontalCardViewSlideOptRate;
                o.LJIIIIZZ(this.itemView.getContext(), "itemView.context");
                field.set(recyclerView, Integer.valueOf((int) (ViewConfiguration.get(r1).getScaledTouchSlop() * f)));
            } catch (Exception unused) {
            }
        }
        if (this.LJLJJLL != null && o.LJ(((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getSearchVideoAutoplayGuideLineSwitch(), Boolean.TRUE)) {
            this.LJLJL = (JR9) this.LJLJJLL.inflate().findViewById(R.id.p2);
        }
    }

    public final void L(AbstractC029409q<?> adapter) {
        o.LJIIIZ(adapter, "adapter");
        C42197GhF c42197GhF = this.LJLIL;
        AbstractC029409q<?> abstractC029409q = c42197GhF.LJLIL;
        if (abstractC029409q == adapter) {
            return;
        }
        if (abstractC029409q != null) {
            try {
                abstractC029409q.unregisterAdapterDataObserver(c42197GhF.LJLILLLLZI);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        c42197GhF.LJLIL = adapter;
        C42198GhG c42198GhG = new C42198GhG(c42197GhF);
        c42197GhF.LJLILLLLZI = c42198GhG;
        adapter.registerAdapterDataObserver(c42198GhG);
    }

    public final void M(String str) {
        C40443Fu3.LIZ(str).LJIIIIZZ(this.LJLILLLLZI);
    }
}
