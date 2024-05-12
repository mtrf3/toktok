package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.search.detail.filter.viewmodel.FilterVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KPH extends C3DO {
    public final ArrayList<Aweme> LLI;
    public final /* synthetic */ KPI LLIFFJFJJ;

    public final void LJJJJLI() {
        List<? extends Aweme> LIZ = JI4.LIZ(this.LLI);
        if (o.LJ(LJJIL(), LIZ)) {
            return;
        }
        C80796VnM viewPager = this.LLIFFJFJJ.LJLIL.getViewPager();
        if (viewPager != null) {
            viewPager.LLL = false;
        }
        super.setData(LIZ);
        C80796VnM viewPager2 = this.LLIFFJFJJ.LJLIL.getViewPager();
        if (viewPager2 != null) {
            viewPager2.LLL = true;
        }
    }

    public final void LJJJJL() {
        if (o.LJ(LJJIL(), this.LLI)) {
            return;
        }
        C80796VnM viewPager = this.LLIFFJFJJ.LJLIL.getViewPager();
        if (viewPager != null) {
            viewPager.LLL = false;
        }
        super.setData(this.LLI);
        C80796VnM viewPager2 = this.LLIFFJFJJ.LJLIL.getViewPager();
        if (viewPager2 != null) {
            viewPager2.LLL = true;
        }
    }

    @Override // X.AbstractC55082Lja, X.InterfaceC55062LjG
    public final void setData(List<? extends Aweme> list) {
        List originalAwemeList;
        FilterVM LJFF = this.LLIFFJFJJ.LJFF();
        if (list != null) {
            originalAwemeList = ORZ.LJLL(list);
        } else {
            originalAwemeList = C61878OQg.INSTANCE;
        }
        LJFF.getClass();
        o.LJIIIZ(originalAwemeList, "originalAwemeList");
        LJFF.setState(new AqS170S0100000_4(originalAwemeList, (List<? extends Object>) 963));
        this.LLI.clear();
        if (list != null) {
            this.LLI.addAll(list);
        }
        List<? extends Aweme> filterAwemeList = JI4.LIZ(list);
        if (this.LLIFFJFJJ.LJFF().getState().LJLJJLL == KPB.OPENED) {
            super.setData(filterAwemeList);
        } else {
            super.setData(list);
        }
        if (C50050Jkc.LIZ() || C50048Jka.LIZ()) {
            ArrayList arrayList = new ArrayList();
            for (Aweme aweme : filterAwemeList) {
                if (!C78963Uyt.LJJIJIIJI(aweme)) {
                    arrayList.add(aweme);
                }
            }
            filterAwemeList = arrayList;
        }
        FilterVM LJFF2 = this.LLIFFJFJJ.LJFF();
        LJFF2.getClass();
        o.LJIIIZ(filterAwemeList, "filterAwemeList");
        LJFF2.setState(new AqS170S0100000_4(filterAwemeList, (List<? extends Object>) 962));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KPH(KPI kpi, Context context, LayoutInflater inflater, InterfaceC72642tA<C50420Jqa> listener, Fragment fragment, View.OnTouchListener tapTouchListener, BaseFeedPageParams baseFeedPageParams, InterfaceC2302191t iHandlePlay) {
        super(context, inflater, listener, fragment, tapTouchListener, baseFeedPageParams, iHandlePlay);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(tapTouchListener, "tapTouchListener");
        o.LJIIIZ(baseFeedPageParams, "baseFeedPageParams");
        o.LJIIIZ(iHandlePlay, "iHandlePlay");
        this.LLIFFJFJJ = kpi;
        this.LLI = new ArrayList<>();
    }
}
