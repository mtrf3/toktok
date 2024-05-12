package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C43I;
import X.C56386MBa;
import X.C56424MCm;
import X.C68322mC;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.MCI;
import X.MCK;
import X.X1D;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.widget.RemoteViews;
import com.ss.android.ugc.aweme.core.SmallAppWidgetProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.TrendingEventModel;
import com.ss.android.ugc.aweme.search.TrendingItems;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailSharedVM;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes10.dex */
public class AqS14S0500000_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS14S0500000_9 aqS14S0500000_9, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        ((SmallAppWidgetProvider) aqS14S0500000_9.l0).getClass();
        LIZ.append("now_s");
        LIZ.append(" set to trending failed, fall back to default.");
        String message = X1D.LIZIZ(LIZ);
        o.LJIIIZ(message, "message");
        String packageName = ((Context) aqS14S0500000_9.l1).getPackageName();
        ((SmallAppWidgetProvider) aqS14S0500000_9.l0).getClass();
        RemoteViews remoteViews = new RemoteViews(packageName, R.layout.hh);
        ((SmallAppWidgetProvider) aqS14S0500000_9.l0).LIZIZ((Context) aqS14S0500000_9.l1, remoteViews);
        MCK mck = (MCK) aqS14S0500000_9.l2;
        MCK other = MCI.LIZ;
        mck.getClass();
        o.LJIIIZ(other, "other");
        if (o.LJ(mck.LJFF, other.LJFF)) {
            ((AppWidgetManager) aqS14S0500000_9.l3).updateAppWidget((int[]) aqS14S0500000_9.l4, remoteViews);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS14S0500000_9 aqS14S0500000_9, Object obj) {
        TrendingEventModel trendingEventModel;
        List<TrendingEventModel> list;
        int i;
        int i2;
        C56386MBa setState = (C56386MBa) obj;
        o.LJIIIZ(setState, "$this$setState");
        if (setState.LJLJJLL != null) {
            trendingEventModel = (TrendingEventModel) aqS14S0500000_9.l0;
        } else {
            trendingEventModel = setState.LJLILLLLZI;
        }
        if (C56424MCm.LIZ()) {
            list = setState.LJLJJL;
            TrendingDetailSharedVM trendingDetailSharedVM = (TrendingDetailSharedVM) aqS14S0500000_9.l2;
            C68322mC c68322mC = (C68322mC) aqS14S0500000_9.l3;
            if (list.isEmpty()) {
                List<TrendingEventModel> list2 = trendingDetailSharedVM.LJLZ;
                if (list2 != null) {
                    for (TrendingEventModel trendingEventModel2 : list2) {
                        if (o.LJ(trendingEventModel2.getEventId(), c68322mC.element)) {
                            trendingDetailSharedVM.LJZ.add(trendingEventModel2);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                list = trendingDetailSharedVM.LJLZ;
                if (list == null) {
                    list = setState.LJLJJL;
                }
            }
        } else {
            list = (List) aqS14S0500000_9.l1;
            if (list == null) {
                list = setState.LJLJJL;
            }
        }
        Boolean bool = Boolean.FALSE;
        C43I c43i = new C43I(bool);
        C43I c43i2 = new C43I(bool);
        int i3 = 0;
        if (setState.LJLJJLL != null) {
            Map<String, List<String>> map = ((TrendingDetailSharedVM) aqS14S0500000_9.l2).LJLJJL;
            if (map != null) {
                List list3 = (List) ((LinkedHashMap) map).get(((C68322mC) aqS14S0500000_9.l3).element);
                if (list3 != null) {
                    i = list3.size();
                }
            }
            i = 0;
        } else {
            i = setState.LJLJLJ;
        }
        if (setState.LJLJJLL != null) {
            if (o.LJ(((TrendingDetailSharedVM) aqS14S0500000_9.l2).gv0(), "general_search")) {
                TrendingDetailSharedVM trendingDetailSharedVM2 = (TrendingDetailSharedVM) aqS14S0500000_9.l2;
                if (trendingDetailSharedVM2.LJZI) {
                    trendingDetailSharedVM2.LJZI = false;
                    List<? extends Aweme> list4 = ((TrendingItems) aqS14S0500000_9.l4).awemeList;
                    if (list4 != null) {
                        Iterator<? extends Aweme> it = list4.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String aid = it.next().getAid();
                            String str = trendingDetailSharedVM2.LJLLI;
                            if (str != null) {
                                if (o.LJ(aid, str)) {
                                    if (i3 > 0) {
                                        i2 = i3 + 1;
                                    }
                                } else {
                                    i3++;
                                }
                            } else {
                                o.LJIJI("awemeId");
                                throw null;
                            }
                        }
                    }
                }
            }
            i2 = 1;
        } else {
            i2 = setState.LJLJLLL;
        }
        return C56386MBa.LIZ(setState, null, trendingEventModel, c43i, c43i2, list, null, true, i, i2, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS14S0500000_9(SmallAppWidgetProvider smallAppWidgetProvider, Context context, MCK mck, AppWidgetManager appWidgetManager, int[] iArr, int i) {
        super(1);
        this.$t = i;
        this.l0 = smallAppWidgetProvider;
        this.l1 = context;
        this.l2 = mck;
        this.l3 = appWidgetManager;
        this.l4 = iArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS14S0500000_9(TrendingEventModel trendingEventModel, TrendingEventModel trendingEventModel2, List<TrendingEventModel> list, TrendingDetailSharedVM trendingDetailSharedVM, C68322mC<String> c68322mC, TrendingItems trendingItems) {
        super(1);
        this.$t = trendingItems;
        this.l0 = trendingEventModel;
        this.l1 = trendingEventModel2;
        this.l2 = list;
        this.l3 = trendingDetailSharedVM;
        this.l4 = c68322mC;
    }
}
