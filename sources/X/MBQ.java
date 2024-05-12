package X;

import android.content.Context;
import android.view.View;
import android.widget.TextSwitcher;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.TrendingEventModel;
import com.ss.android.ugc.aweme.trending.ui.TrendingTitleSwitcher;
import com.ss.android.ugc.aweme.trending.ui.detailpage.BottomBarAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS172S0200000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MBQ extends AbstractC65781Prl implements InterfaceC88473Ynt<UIAssem, TrendingEventModel, List<? extends TrendingEventModel>, C76800UCe> {
    public final /* synthetic */ BottomBarAssem LJLIL;
    public final /* synthetic */ TextSwitcher LJLILLLLZI;
    public final /* synthetic */ View LJLJI;
    public final /* synthetic */ TuxIconView LJLJJI;
    public final /* synthetic */ TuxTextView LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBQ(BottomBarAssem bottomBarAssem, TextSwitcher textSwitcher, View view, TuxIconView tuxIconView, TuxTextView tuxTextView) {
        super(3);
        this.LJLIL = bottomBarAssem;
        this.LJLILLLLZI = textSwitcher;
        this.LJLJI = view;
        this.LJLJJI = tuxIconView;
        this.LJLJJL = tuxTextView;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(UIAssem uIAssem, TrendingEventModel trendingEventModel, List<? extends TrendingEventModel> list) {
        int i;
        TrendingTitleSwitcher trendingTitleSwitcher;
        int i2;
        UIAssem selectSubscribe = uIAssem;
        TrendingEventModel current = trendingEventModel;
        List<? extends TrendingEventModel> total = list;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(current, "current");
        o.LJIIIZ(total, "total");
        if (!total.isEmpty()) {
            boolean z = false;
            if (this.LJLIL.LJLJL && C56424MCm.LIZ()) {
                BottomBarAssem bottomBarAssem = this.LJLIL;
                TextSwitcher bottomListTextSwitcher = this.LJLILLLLZI;
                o.LJIIIIZZ(bottomListTextSwitcher, "bottomListTextSwitcher");
                bottomBarAssem.LJLJLJ = new TrendingTitleSwitcher(bottomListTextSwitcher, selectSubscribe, total, new AqS172S0200000_9(this.LJLIL, (BottomBarAssem) total, (List<TrendingEventModel>) 7));
                TrendingTitleSwitcher trendingTitleSwitcher2 = this.LJLIL.LJLJLJ;
                if (trendingTitleSwitcher2 != null) {
                    trendingTitleSwitcher2.init();
                }
                this.LJLIL.LJLJL = false;
            }
            TrendingTitleSwitcher trendingTitleSwitcher3 = this.LJLIL.LJLJLJ;
            if (trendingTitleSwitcher3 != null) {
                ArrayList arrayList = new ArrayList(C32I.LJJL(total, 10));
                Iterator<? extends TrendingEventModel> it = total.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getEventId());
                }
                trendingTitleSwitcher3.LJLJL = arrayList;
            }
            String eventId = current.getEventId();
            if (eventId != null && (trendingTitleSwitcher = this.LJLIL.LJLJLJ) != null) {
                ((ArrayList) trendingTitleSwitcher.LJLJLJ).clear();
                trendingTitleSwitcher.LJLJLLL.add(eventId);
                while (((ArrayList) trendingTitleSwitcher.LJLJLJ).size() < 3) {
                    List LLIIIILZ = ORZ.LLIIIILZ(trendingTitleSwitcher.LJLJL, trendingTitleSwitcher.LJLJLLL);
                    o.LJII(LLIIIILZ, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String?>");
                    List LIZIZ = C65777Prh.LIZIZ(LLIIIILZ);
                    if (LIZIZ.size() <= 3) {
                        while (LIZIZ.size() > 0) {
                            Object LLIIJLIL = ORZ.LLIIJLIL(LIZIZ, V0Q.Default);
                            if (LLIIJLIL != null) {
                                ((ArrayList) trendingTitleSwitcher.LJLJLJ).add(LLIIJLIL);
                                LIZIZ.remove(LLIIJLIL);
                            }
                        }
                        while (((ArrayList) trendingTitleSwitcher.LJLJLJ).size() < 3) {
                            Object LLIIJLIL2 = ORZ.LLIIJLIL(trendingTitleSwitcher.LJLJLLL, V0Q.Default);
                            if (!((ArrayList) trendingTitleSwitcher.LJLJLJ).contains(LLIIJLIL2) && !o.LJ(LLIIJLIL2, eventId)) {
                                ((ArrayList) trendingTitleSwitcher.LJLJLJ).add(LLIIJLIL2);
                            }
                        }
                    } else {
                        Object LLIIJLIL3 = ORZ.LLIIJLIL(LIZIZ, V0Q.Default);
                        if (LLIIJLIL3 != null && !((ArrayList) trendingTitleSwitcher.LJLJLJ).contains(LLIIJLIL3) && (!trendingTitleSwitcher.LJLJLLL.contains(LLIIJLIL3) || ((ArrayList) trendingTitleSwitcher.LJLJL).size() - trendingTitleSwitcher.LJLJLLL.size() >= 1)) {
                            ((ArrayList) trendingTitleSwitcher.LJLJLJ).add(LLIIJLIL3);
                        }
                    }
                }
                if (trendingTitleSwitcher.LJLJLLL.size() >= ((ArrayList) trendingTitleSwitcher.LJLJL).size()) {
                    trendingTitleSwitcher.LJLJLLL.clear();
                }
                if (trendingTitleSwitcher.LJLJJLL + 1 >= ((ArrayList) trendingTitleSwitcher.LJLJLJ).size()) {
                    trendingTitleSwitcher.LJLJJLL = 0;
                    i2 = 0;
                } else {
                    i2 = trendingTitleSwitcher.LJLJJLL + 1;
                    trendingTitleSwitcher.LJLJJLL = i2;
                }
                trendingTitleSwitcher.LIZIZ(i2, true);
            }
            Iterator<? extends TrendingEventModel> it2 = total.iterator();
            int i3 = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (o.LJ(it2.next().getEventId(), current.getEventId())) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (ORZ.LJLLLLLL(i3 + 1, total) != null || (!total.isEmpty() && ORZ.LJLLJ(total) != null)) {
                z = true;
            }
            this.LJLJI.setActivated(z);
            Context context = this.LJLJI.getContext();
            if (z) {
                i = R.color.bc;
            } else {
                i = R.color.bh;
            }
            int LIZIZ2 = C04330Ez.LIZIZ(context, i);
            this.LJLJJI.setTintColor(LIZIZ2);
            this.LJLJJL.setTextColor(LIZIZ2);
        }
        return C76800UCe.LIZ;
    }
}
