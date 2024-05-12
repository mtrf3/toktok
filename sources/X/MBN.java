package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.search.TrendingEventModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MBN implements MBO {
    public final /* synthetic */ MBO LIZ;
    public final /* synthetic */ TuxSheet LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ List<TrendingEventModel> LJFF;
    public final /* synthetic */ M89 LJI;

    @Override // X.MBO
    public final void LIZ() {
        this.LIZ.LIZ();
        this.LIZIZ.dismiss();
    }

    @Override // X.MBO
    public final void LIZIZ(TrendingEventModel model) {
        o.LJIIIZ(model, "model");
        if (!o.LJ(model.getEventId(), this.LIZJ)) {
            this.LIZ.LIZIZ(model);
        }
        String str = this.LIZLLL;
        String str2 = this.LJ;
        C188727au LIZLLL = KNV.LIZLLL(str2, "panelEntrance");
        LIZLLL.LJIIIZ("enter_from", MB3.LIZ);
        MB3.LJ(LIZLLL, str, model, null);
        LIZLLL.LJIIIZ("panel_entrance", str2);
        FMX.LJIIL("trending_inflow_panel_topic_click", LIZLLL.LIZ);
        this.LIZIZ.dismiss();
        Iterator<TrendingEventModel> it = this.LJFF.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (o.LJ(it.next().getEventId(), model.getEventId())) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        M89 param = this.LJI;
        o.LJIIIZ(param, "param");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("search_id", param.getSearchId());
        c188727au.LJIIIZ("search_keyword", param.getSearchKeyword());
        c188727au.LJIIIZ("search_result_id", param.getSearchResultId());
        c188727au.LJIIIZ("enter_from", MB3.LIZ);
        MB3.LJ(c188727au, null, model, null);
        if (!C56424MCm.LIZ()) {
            c188727au.LJFF(valueOf, "rank");
        }
        if (C78685UuP.LJJJZ(param.isFromTrendingCard())) {
            c188727au.LJI("is_from_trending_card", param.isFromTrendingCard());
        }
        FMX.LJIIL("trending_topic_click", c188727au.LIZ);
    }

    @Override // X.MBO
    public final void LIZJ(boolean z, TrendingEventModel trendingEventModel) {
        this.LIZ.LIZJ(z, trendingEventModel);
        if (z) {
            Iterator<TrendingEventModel> it = this.LJFF.iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (o.LJ(it.next().getEventId(), trendingEventModel.getEventId())) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i);
            M89 param = this.LJI;
            o.LJIIIZ(param, "param");
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("search_id", param.getSearchId());
            c188727au.LJIIIZ("search_keyword", param.getSearchKeyword());
            c188727au.LJIIIZ("search_result_id", param.getSearchResultId());
            c188727au.LJIIIZ("enter_from", MB3.LIZ);
            MB3.LJ(c188727au, null, trendingEventModel, null);
            if (C56424MCm.LIZ()) {
                c188727au.LJFF(valueOf, "rank");
            }
            if (C78685UuP.LJJJZ(param.isFromTrendingCard())) {
                c188727au.LJI("is_from_trending_card", param.isFromTrendingCard());
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[logListItemShow], rank: ");
            LIZ.append(valueOf);
            LIZ.append(", topic: ");
            LIZ.append(trendingEventModel.getTrendingName());
            X1D.LIZIZ(LIZ);
            FMX.LJIIL("trending_topic_show", c188727au.LIZ);
            String str = this.LIZLLL;
            String str2 = this.LJ;
            C188727au LIZLLL = KNV.LIZLLL(str2, "panelEntrance");
            LIZLLL.LJIIIZ("enter_from", MB3.LIZ);
            MB3.LJ(LIZLLL, str, trendingEventModel, null);
            LIZLLL.LJIIIZ("panel_entrance", str2);
            FMX.LJIIL("trending_inflow_panel_topic_show", LIZLLL.LIZ);
        }
    }

    public MBN(MBL mbl, TuxSheet tuxSheet, String str, String str2, String str3, List list, M89 m89) {
        this.LIZ = mbl;
        this.LIZIZ = tuxSheet;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = list;
        this.LJI = m89;
    }
}
