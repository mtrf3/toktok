package X;

import android.text.TextUtils;
import android.view.ViewTreeObserver;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.controller.RankPageController;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankPageViewModel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import webcast.api.ranklist.LynxRankView;

/* renamed from: X.UiU, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ViewTreeObserverOnPreDrawListenerC77946UiU implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ RankListFragment LJLIL;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        String str;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        RankPageViewModel LJIIJ;
        MutableLiveData<LynxRankView> mutableLiveData;
        LynxRankView value;
        RankListFragment rankListFragment = this.LJLIL;
        RankListController rankListController = rankListFragment.LJLJJLL;
        if (rankListController != null && rankListController.LJII().LJLILLLLZI != null) {
            RankTypeV2 rankTypeV2 = rankListFragment.LJLJJI.LIZIZ;
            EnumC31514CYk enumC31514CYk = rankListController.LIZ().LJLJJI;
            RankTypeV2 rankTypeV22 = rankListController.LIZ().LJLJJL;
            RankPageController rankPageController = rankListFragment.LJLJL;
            if (rankPageController != null && (LJIIJ = rankPageController.LJIIJ()) != null && (mutableLiveData = LJIIJ.LJLL) != null && (value = mutableLiveData.getValue()) != null) {
                str = value.lynxSchema;
            } else {
                str = null;
            }
            C77936UiK c77936UiK = new C77936UiK(rankTypeV2, enumC31514CYk, rankTypeV22, str, Boolean.valueOf(rankListFragment.LJLJJI.LJ));
            if (!rankListController.LJII().LJLJL) {
                List<RankTabInfo> list = rankListController.LIZ().LJLIL;
                HashMap<OSZ<Integer, Integer>, Long> hashMap = C31524CYu.LJI;
                if (!hashMap.containsKey(new OSZ(Integer.valueOf(c77936UiK.LIZ.type), Integer.valueOf(c77936UiK.LIZ.rankPhase)))) {
                    hashMap.put(new OSZ<>(Integer.valueOf(c77936UiK.LIZ.type), Integer.valueOf(c77936UiK.LIZ.rankPhase)), Long.valueOf(System.currentTimeMillis()));
                    C31524CYu.LJIIIIZZ.put(new OSZ<>(Integer.valueOf(c77936UiK.LIZ.type), Integer.valueOf(c77936UiK.LIZ.rankPhase)), Integer.valueOf(EnumC31525CYv.SUCCESS.getType()));
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    C05630Jz.LJI(jSONObject, "current_entity_rank_type", c77936UiK.LIZ.rankName);
                    C05630Jz.LJI(jSONObject, "current_entrance_rank_type", c77936UiK.LIZJ.rankName);
                    C05630Jz.LIZ(c77936UiK.LIZIZ.getType(), "group_type", jSONObject);
                    RankTypeV2 rankTypeV23 = c77936UiK.LIZ;
                    C31524CYu.LIZ(jSONObject3, rankTypeV23.type, rankTypeV23.rankPhase, list);
                    C05630Jz.LJI(jSONObject, "event_name", "event_draw");
                    Long l = hashMap.get(new OSZ(Integer.valueOf(c77936UiK.LIZ.type), Integer.valueOf(c77936UiK.LIZ.rankPhase)));
                    if (l == null) {
                        l = 0L;
                    }
                    long longValue = l.longValue();
                    HashMap<OSZ<Integer, Integer>, Long> hashMap2 = C31524CYu.LJ;
                    Long l2 = hashMap2.get(new OSZ(Integer.valueOf(c77936UiK.LIZ.type), Integer.valueOf(c77936UiK.LIZ.rankPhase)));
                    if (l2 == null) {
                        l2 = 0L;
                    }
                    C05630Jz.LJFF(jSONObject2, "event_duration", longValue - l2.longValue());
                    Long l3 = hashMap.get(new OSZ(Integer.valueOf(c77936UiK.LIZ.type), Integer.valueOf(c77936UiK.LIZ.rankPhase)));
                    if (l3 == null) {
                        l3 = 0L;
                    }
                    long longValue2 = l3.longValue();
                    Long l4 = hashMap2.get(new OSZ(Integer.valueOf(c77936UiK.LIZ.type), Integer.valueOf(c77936UiK.LIZ.rankPhase)));
                    if (l4 == null) {
                        l4 = 0L;
                    }
                    C05630Jz.LJFF(jSONObject3, "event_duration", longValue2 - l4.longValue());
                    Long l5 = hashMap.get(new OSZ(Integer.valueOf(c77936UiK.LIZ.type), Integer.valueOf(c77936UiK.LIZ.rankPhase)));
                    if (l5 == null) {
                        l5 = 0L;
                    }
                    long longValue3 = l5.longValue();
                    HashMap<OSZ<Integer, Integer>, Long> hashMap3 = C31524CYu.LIZIZ;
                    Long l6 = hashMap3.get(new OSZ(Integer.valueOf(c77936UiK.LIZ.type), Integer.valueOf(c77936UiK.LIZ.rankPhase)));
                    if (l6 == null) {
                        l6 = 0L;
                    }
                    C05630Jz.LJFF(jSONObject2, "event_duration_all", longValue3 - l6.longValue());
                    Long l7 = hashMap.get(new OSZ(Integer.valueOf(c77936UiK.LIZ.type), Integer.valueOf(c77936UiK.LIZ.rankPhase)));
                    if (l7 == null) {
                        l7 = 0L;
                    }
                    long longValue4 = l7.longValue();
                    Long l8 = hashMap3.get(new OSZ(Integer.valueOf(c77936UiK.LIZ.type), Integer.valueOf(c77936UiK.LIZ.rankPhase)));
                    if (l8 == null) {
                        l8 = 0L;
                    }
                    C05630Jz.LJFF(jSONObject3, "event_duration_all", longValue4 - l8.longValue());
                    if (!TextUtils.isEmpty(c77936UiK.LIZLLL)) {
                        C05630Jz.LJI(jSONObject3, "event_lynx_url", c77936UiK.LIZLLL);
                        C05630Jz.LIZ(1, "has_lynx_cell", jSONObject);
                    } else {
                        C05630Jz.LIZ(0, "has_lynx_cell", jSONObject);
                    }
                    C05630Jz.LIZJ("extra", jSONObject4, jSONObject3);
                    C0K2.LJI("ttlive_ranklist_entity_show", jSONObject, jSONObject2, jSONObject4);
                }
                RunnableC31065CHd runnableC31065CHd = rankListFragment.LJLLLLLL;
                if (runnableC31065CHd != null && (viewTreeObserver2 = runnableC31065CHd.getViewTreeObserver()) != null) {
                    viewTreeObserver2.removeOnPreDrawListener(this);
                    return true;
                }
                return true;
            }
            List<RankTabInfo> list2 = rankListController.LIZ().LJLIL;
            HashMap<OSZ<Integer, Integer>, Long> hashMap4 = C31524CYu.LJII;
            if (!hashMap4.containsKey(new OSZ(Integer.valueOf(c77936UiK.LIZ.type), Integer.valueOf(c77936UiK.LIZ.rankPhase)))) {
                HashMap<OSZ<Integer, Integer>, Long> hashMap5 = C31524CYu.LIZIZ;
                if (hashMap5.containsKey(new OSZ(Integer.valueOf(c77936UiK.LIZ.type), Integer.valueOf(c77936UiK.LIZ.rankPhase)))) {
                    hashMap4.put(new OSZ<>(Integer.valueOf(c77936UiK.LIZ.type), Integer.valueOf(c77936UiK.LIZ.rankPhase)), Long.valueOf(System.currentTimeMillis()));
                    C31524CYu.LJI.put(new OSZ<>(Integer.valueOf(c77936UiK.LIZ.type), Integer.valueOf(c77936UiK.LIZ.rankPhase)), Long.valueOf(System.currentTimeMillis()));
                    C31524CYu.LJIIIIZZ.put(new OSZ<>(Integer.valueOf(c77936UiK.LIZ.type), Integer.valueOf(c77936UiK.LIZ.rankPhase)), Integer.valueOf(EnumC31525CYv.SUCCESS.getType()));
                    JSONObject jSONObject5 = new JSONObject();
                    JSONObject jSONObject6 = new JSONObject();
                    JSONObject jSONObject7 = new JSONObject();
                    JSONObject jSONObject8 = new JSONObject();
                    C05630Jz.LJI(jSONObject5, "current_entity_rank_type", c77936UiK.LIZ.rankName);
                    C05630Jz.LJI(jSONObject5, "current_entrance_rank_type", c77936UiK.LIZJ.rankName);
                    C05630Jz.LIZ(c77936UiK.LIZIZ.getType(), "group_type", jSONObject5);
                    C05630Jz.LJI(jSONObject5, "event_name", "event_cache_draw");
                    RankTypeV2 rankTypeV24 = c77936UiK.LIZ;
                    C31524CYu.LIZ(jSONObject7, rankTypeV24.type, rankTypeV24.rankPhase, list2);
                    Long l9 = hashMap4.get(new OSZ(Integer.valueOf(c77936UiK.LIZ.type), Integer.valueOf(c77936UiK.LIZ.rankPhase)));
                    if (l9 == null) {
                        l9 = 0L;
                    }
                    long longValue5 = l9.longValue();
                    Long l10 = hashMap5.get(new OSZ(Integer.valueOf(c77936UiK.LIZ.type), Integer.valueOf(c77936UiK.LIZ.rankPhase)));
                    if (l10 == null) {
                        l10 = 0L;
                    }
                    C05630Jz.LJFF(jSONObject6, "event_duration", longValue5 - l10.longValue());
                    Long l11 = hashMap4.get(new OSZ(Integer.valueOf(c77936UiK.LIZ.type), Integer.valueOf(c77936UiK.LIZ.rankPhase)));
                    if (l11 == null) {
                        l11 = 0L;
                    }
                    long longValue6 = l11.longValue();
                    Long l12 = hashMap5.get(new OSZ(Integer.valueOf(c77936UiK.LIZ.type), Integer.valueOf(c77936UiK.LIZ.rankPhase)));
                    if (l12 == null) {
                        l12 = 0L;
                    }
                    C05630Jz.LJFF(jSONObject7, "event_duration", longValue6 - l12.longValue());
                    Long l13 = hashMap4.get(new OSZ(Integer.valueOf(c77936UiK.LIZ.type), Integer.valueOf(c77936UiK.LIZ.rankPhase)));
                    if (l13 == null) {
                        l13 = 0L;
                    }
                    long longValue7 = l13.longValue();
                    Long l14 = hashMap5.get(new OSZ(Integer.valueOf(c77936UiK.LIZ.type), Integer.valueOf(c77936UiK.LIZ.rankPhase)));
                    if (l14 == null) {
                        l14 = 0L;
                    }
                    C05630Jz.LJFF(jSONObject6, "event_duration_all", longValue7 - l14.longValue());
                    Long l15 = hashMap4.get(new OSZ(Integer.valueOf(c77936UiK.LIZ.type), Integer.valueOf(c77936UiK.LIZ.rankPhase)));
                    if (l15 == null) {
                        l15 = 0L;
                    }
                    long longValue8 = l15.longValue();
                    Long l16 = hashMap5.get(new OSZ(Integer.valueOf(c77936UiK.LIZ.type), Integer.valueOf(c77936UiK.LIZ.rankPhase)));
                    if (l16 == null) {
                        l16 = 0L;
                    }
                    C05630Jz.LJFF(jSONObject7, "event_duration_all", longValue8 - l16.longValue());
                    if (!TextUtils.isEmpty(c77936UiK.LIZLLL)) {
                        C05630Jz.LJI(jSONObject7, "event_lynx_url", c77936UiK.LIZLLL);
                        C05630Jz.LIZ(1, "has_lynx_cell", jSONObject5);
                    } else {
                        C05630Jz.LIZ(0, "has_lynx_cell", jSONObject5);
                    }
                    C05630Jz.LIZJ("extra", jSONObject8, jSONObject7);
                    C0K2.LJI("ttlive_ranklist_entity_show", jSONObject5, jSONObject6, jSONObject8);
                }
            }
            RunnableC31065CHd runnableC31065CHd2 = rankListFragment.LJLLLLLL;
            if (runnableC31065CHd2 == null || (viewTreeObserver = runnableC31065CHd2.getViewTreeObserver()) == null) {
                return true;
            }
            viewTreeObserver.removeOnPreDrawListener(this);
            return true;
        }
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC77946UiU(RankListFragment rankListFragment) {
        this.LJLIL = rankListFragment;
    }
}
