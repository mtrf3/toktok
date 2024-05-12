package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.api.MultiApiManager;
import com.ss.android.ugc.aweme.inbox.api.SkylightBizParams;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightDataResponse;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightFriendPostResponse;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.story.inbox.OnThisDayResponse;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import com.ss.android.ugc.aweme.utils.AppWidgetServiceImpl;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M9G implements InterfaceC56347M9n {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(M9I.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(M9H.LJLIL);

    @Override // X.InterfaceC56347M9n
    public final synchronized List<InterfaceC57784Mm4> LIZJ() {
        List<InterfaceC57784Mm4> list;
        if (((AtomicBoolean) this.LIZIZ.getValue()).get() && (list = (List) ((C84343Ss) this.LIZ.getValue()).LIZ("SKYLIGHT_DATA_CACHE")) != null) {
            ((AtomicBoolean) this.LIZIZ.getValue()).set(false);
            return list;
        }
        return LJI(false);
    }

    @Override // X.InterfaceC56347M9n
    public final boolean LIZLLL() {
        if (((Boolean) L2W.LIZJ.getValue()).booleanValue()) {
            if (C56678MMg.LJIIIZ() < 0) {
                return true;
            }
            return false;
        }
        if (((Boolean) L2W.LIZLLL.getValue()).booleanValue()) {
            return !C56350M9q.LIZ();
        }
        if (!L2W.LIZJ()) {
            return true;
        }
        if (!C56350M9q.LIZ() && C56678MMg.LJIIIZ() < 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC56347M9n
    public final void LIZ() {
        if (!L2W.LIZIZ()) {
            return;
        }
        MS5.LIZ(new AqS159S0100000_9(this, 754));
    }

    @Override // X.InterfaceC56347M9n
    public final AbstractC73672Svk<SkylightDataResponse> LIZIZ() {
        java.util.Map<String, String> map;
        String str;
        C86393XvR LJJIJIL;
        if (!C46604IQu.LJ() || (!C53345Kwf.LIZ() && !L2P.LIZ())) {
            C73536StY c73536StY = C73536StY.LJLIL;
            o.LJIIIIZZ(c73536StY, "empty()");
            return c73536StY;
        }
        C57008MYy.LIZ(C56647MLb.LJLIL);
        MultiApiManager.API LIZ = MultiApiManager.LIZ();
        ArrayList arrayList = new ArrayList();
        arrayList.add(LJII("inbox_skylight_friends_list_strategy", String.valueOf(L2R.LIZ())));
        arrayList.add(LJII("tt_inbox_skylight_platform_experiment", String.valueOf(((Number) L2P.LIZ.getValue()).intValue())));
        arrayList.add(LJII("creation_inbox_topcell_on_this_day_entrance", String.valueOf(C48708J9s.LIZ())));
        FFL.LJIIIZ().getClass();
        arrayList.add(LJII("creation_inbox_topcell_on_this_day_quit", String.valueOf(FFL.LJIIJ(31744, 0, "creation_inbox_topcell_on_this_day_quit", true))));
        String LIZLLL = JsonParseUtils.LIZLLL(arrayList);
        o.LJIIIIZZ(LIZLLL, "toJSONString(result)");
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null) {
            map = LJJIJIL.LJJIJLIJ(EF7.LIZIZ());
        } else {
            map = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("live_entrance", "5");
        linkedHashMap.put("req_from", "tiktok_message");
        linkedHashMap.put("is_draw", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("content_type", "3");
        linkedHashMap.put("channel_id", "81");
        if (C47267Igp.LIZIZ()) {
            str = "2";
        } else {
            str = "1";
        }
        linkedHashMap.put("scenario", str);
        linkedHashMap.put("has_shown_following_popup", "false");
        SkylightBizParams skylightBizParams = new SkylightBizParams(3, JsonParseUtils.LIZLLL(linkedHashMap));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(skylightBizParams);
        String LIZLLL2 = JsonParseUtils.LIZLLL(arrayList2);
        o.LJIIIIZZ(LIZLLL2, "toJSONString(result)");
        return LIZ.fetchSkylightEntrance(LIZLLL, LIZLLL2);
    }

    @Override // X.InterfaceC56347M9n
    public final AbstractC73672Svk<SkylightFriendPostResponse> LJ() {
        if (!C53339KwZ.LIZJ()) {
            C73536StY c73536StY = C73536StY.LJLIL;
            o.LJIIIIZZ(c73536StY, "empty()");
            return c73536StY;
        }
        List<C54859Lfz> LJ = LW8.LIZIZ.LJ();
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJ, 10));
        Iterator<C54859Lfz> it = LJ.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LJLIL);
        }
        MultiApiManager.API LIZ = MultiApiManager.LIZ();
        String LIZJ = C75792yF.LIZJ(arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(2);
        return LIZ.fetchSkylightFriendPost(0L, 20, LIZJ, arrayList2.toString());
    }

    @Override // X.InterfaceC56347M9n
    public final AbstractC73672Svk<OnThisDayResponse> LJFF() {
        if (C46604IQu.LJ() && C00F.LIZ(31744, 0, "creation_inbox_topcell_on_this_day_entrance", true) != 0) {
            return C55723Ltv.LIZIZ.LIZ().requestOnThisDayData();
        }
        C73536StY c73536StY = C73536StY.LJLIL;
        o.LJIIIIZZ(c73536StY, "empty()");
        return c73536StY;
    }

    public final synchronized List<InterfaceC57784Mm4> LJI(boolean z) {
        ArrayList arrayList;
        C56358M9y c56358M9y;
        arrayList = new ArrayList();
        C56653MLh c56653MLh = C56652MLg.LIZIZ;
        c56653MLh.getClass();
        c56653MLh.LIZJ = System.currentTimeMillis();
        c56653MLh.LJI = "from_preload";
        C56652MLg.LIZJ.LIZIZ(1);
        if (((Boolean) L2W.LIZLLL.getValue()).booleanValue() || L2W.LIZJ()) {
            OSZ<InterfaceC57784Mm4, Boolean> LIZJ = AppWidgetServiceImpl.LJIJI().LIZJ();
            StoryInboxItem storyInboxItem = null;
            if (LIZJ.getFirst() != null && !LIZJ.getSecond().booleanValue()) {
                InterfaceC57784Mm4 first = LIZJ.getFirst();
                o.LJII(first, "null cannot be cast to non-null type com.ss.android.ugc.aweme.story.StoryWidgetGuideItem");
                c56358M9y = C56358M9y.L((C56358M9y) first, 1000);
            } else {
                c56358M9y = null;
            }
            if (c56358M9y != null) {
                arrayList.add(c56358M9y);
            }
            if (C56350M9q.LIZ()) {
                storyInboxItem = new StoryInboxItem(C55723Ltv.LIZIZ.LJIL().LJI(), 0, true, 2, null);
            }
            if (storyInboxItem != null) {
                arrayList.add(storyInboxItem);
            }
        }
        if (((Boolean) L2W.LJFF.getValue()).booleanValue()) {
            ArrayList arrayList2 = new ArrayList();
            int LIZJ2 = C53432Ky4.LIZJ();
            for (int size = arrayList.size(); size < LIZJ2; size++) {
                arrayList2.add(new M9J());
            }
            arrayList.addAll(arrayList2);
        }
        if (((Boolean) L2W.LIZJ.getValue()).booleanValue() || L2W.LIZJ()) {
            arrayList.addAll(C56350M9q.LIZIZ(C56678MMg.LJIIIIZZ()));
        }
        if (z) {
            ((C84343Ss) this.LIZ.getValue()).LIZJ("SKYLIGHT_DATA_CACHE", arrayList);
            ((AtomicBoolean) this.LIZIZ.getValue()).set(true);
        }
        C56653MLh c56653MLh2 = C56652MLg.LIZIZ;
        c56653MLh2.getClass();
        long currentTimeMillis = System.currentTimeMillis() - c56653MLh2.LIZJ;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("state", "preload");
        c188727au.LJ(currentTimeMillis, "duration");
        FMX.LJIIL("inbox_skylight_lifecycle", c188727au.LIZ);
        C56652MLg.LIZJ.LIZ(1);
        return arrayList;
    }

    public static java.util.Map LJII(String str, String str2) {
        return C113554cx.LJJL(new OSZ("key", str), new OSZ("value", str2));
    }
}
