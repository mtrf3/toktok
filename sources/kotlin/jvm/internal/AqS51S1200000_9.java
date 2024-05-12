package kotlin.jvm.internal;

import X.ASL;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C188727au;
import X.C45804HyK;
import X.C4W0;
import X.C55723Ltv;
import X.C56386MBa;
import X.C56424MCm;
import X.C57142Mbi;
import X.C76800UCe;
import X.C78685UuP;
import X.EnumC77147UPn;
import X.FMX;
import X.InterfaceC88472Yns;
import X.M89;
import X.MB3;
import X.MBL;
import X.MBN;
import X.UPK;
import X.US3;
import Y.IDDListenerS103S0200000_9;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.TrendingEventModel;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.trending.ui.detailpage.BottomBarAssem;
import com.ss.android.ugc.aweme.trending.ui.list.TrendingListFragment;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public class AqS51S1200000_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS51S1200000_9 aqS51S1200000_9, Object obj) {
        TrendingEventModel trendingEventModel;
        String str;
        FragmentManager supportFragmentManager;
        C56386MBa it = (C56386MBa) obj;
        o.LJIIIZ(it, "it");
        List<TrendingEventModel> data = it.LJLJJL;
        if (data != null && !data.isEmpty()) {
            Context context = ((BottomBarAssem) aqS51S1200000_9.l1).getContext();
            o.LJI(context);
            String eventId = it.LJLILLLLZI.getEventId();
            if (eventId == null) {
                eventId = "";
            }
            M89 feedParam = ((BottomBarAssem) aqS51S1200000_9.l1).v3().LJLJI;
            String panelEntrance = aqS51S1200000_9.s0;
            String str2 = ((BottomBarAssem) aqS51S1200000_9.l1).v3().LJLILLLLZI;
            TrendingListFragment sheetFragment = (TrendingListFragment) ((BottomBarAssem) aqS51S1200000_9.l1).LJLJJI.getValue();
            BottomBarAssem bottomBarAssem = (BottomBarAssem) aqS51S1200000_9.l1;
            MBL mbl = new MBL(bottomBarAssem);
            IDDListenerS103S0200000_9 iDDListenerS103S0200000_9 = new IDDListenerS103S0200000_9(bottomBarAssem, (View) aqS51S1200000_9.l2, 0);
            o.LJIIIZ(data, "data");
            o.LJIIIZ(feedParam, "feedParam");
            o.LJIIIZ(panelEntrance, "panelEntrance");
            o.LJIIIZ(sheetFragment, "sheetFragment");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            sheetFragment.LJLJI = data;
            sheetFragment.LJLJJI = eventId;
            sheetFragment.LJLIL = str2;
            if (sheetFragment.isAdded()) {
                sheetFragment.vl();
            }
            ASL asl = new ASL();
            asl.LIZ.LJLLILLLL = sheetFragment;
            asl.LJI(1);
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJZI = false;
            tuxSheet.LJZL = true;
            tuxSheet.LJLILLLLZI = iDDListenerS103S0200000_9;
            sheetFragment.LJLILLLLZI = new MBN(mbl, tuxSheet, eventId, str2, panelEntrance, data, feedParam);
            if (LJJIFFI != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
                tuxSheet.show(supportFragmentManager, "TrendingDetailPageFrag");
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("trending_entrance", str2);
            c188727au.LJIIIZ("enter_from", MB3.LIZ);
            c188727au.LJIIIZ("panel_entrance", panelEntrance);
            FMX.LJIIL("trending_inflow_panel_show", c188727au.LIZ);
            Iterator<TrendingEventModel> it2 = data.iterator();
            while (true) {
                if (it2.hasNext()) {
                    trendingEventModel = it2.next();
                    if (o.LJ(trendingEventModel.getEventId(), eventId)) {
                        break;
                    }
                } else {
                    trendingEventModel = null;
                    break;
                }
            }
            TrendingEventModel trendingEventModel2 = trendingEventModel;
            Iterator<TrendingEventModel> it3 = data.iterator();
            int i = 0;
            while (true) {
                if (it3.hasNext()) {
                    String eventId2 = it3.next().getEventId();
                    if (trendingEventModel2 != null) {
                        str = trendingEventModel2.getEventId();
                    } else {
                        str = null;
                    }
                    if (o.LJ(eventId2, str)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i);
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("search_id", feedParam.getSearchId());
            c188727au2.LJIIIZ("search_keyword", feedParam.getSearchKeyword());
            c188727au2.LJIIIZ("search_result_id", feedParam.getSearchResultId());
            c188727au2.LJIIIZ("enter_from", MB3.LIZ);
            MB3.LJ(c188727au2, null, trendingEventModel2, null);
            if (!C56424MCm.LIZ()) {
                c188727au2.LJFF(valueOf, "rank");
            }
            if (C78685UuP.LJJJZ(feedParam.isFromTrendingCard())) {
                c188727au2.LJI("is_from_trending_card", feedParam.isFromTrendingCard());
            }
            FMX.LJIIL("click_more_trending", c188727au2.LIZ);
            ((View) aqS51S1200000_9.l2).setEnabled(false);
            ((BottomBarAssem) aqS51S1200000_9.l1).A3().LJJJJL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS51S1200000_9 aqS51S1200000_9, Object obj) {
        US3 buildAuthPipeline = (US3) obj;
        o.LJIIIZ(buildAuthPipeline, "$this$buildAuthPipeline");
        ActivityC45651qj requireActivity = ((UPK) aqS51S1200000_9.l1).LIZ.requireActivity();
        o.LJIIIIZZ(requireActivity, "fragment.requireActivity()");
        buildAuthPipeline.LIZLLL(LifecycleOwnerKt.getLifecycleScope(requireActivity));
        buildAuthPipeline.LIZJ(new AqS179S0100000_13((EnumC77147UPn) aqS51S1200000_9.l2, 669));
        buildAuthPipeline.LJ(new AqS62S1100000_9((UPK) aqS51S1200000_9.l1, aqS51S1200000_9.s0, 14));
        buildAuthPipeline.LIZIZ(C57142Mbi.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS51S1200000_9 aqS51S1200000_9, Object obj) {
        C4W0.LIZ(aqS51S1200000_9.s0, (Aweme) aqS51S1200000_9.l1, "click");
        C55723Ltv.LIZIZ.LIZLLL((ActivityC45651qj) aqS51S1200000_9.l2, new EnterStoryParam(null, "click_story_label", MainPageFragmentImpl.LJI().LJJLIIIJJI(), false, false, false, false, null, null, null, false, null, 4081, null));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS51S1200000_9(ActivityC45651qj activityC45651qj, String str, Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = aweme;
        this.l2 = activityC45651qj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS51S1200000_9(UPK upk, EnumC77147UPn enumC77147UPn, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = upk;
        this.l2 = enumC77147UPn;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS51S1200000_9(BottomBarAssem bottomBarAssem, String str, View view, int i) {
        super(1);
        this.$t = i;
        this.l1 = bottomBarAssem;
        this.s0 = str;
        this.l2 = view;
    }
}
