package X;

import android.os.Handler;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.Modification;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.1Nl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32011Nl implements C0WI {
    public static boolean LJII;
    public static final C32011Nl LIZ = new C32011Nl();
    public static final java.util.Map<Long, C08790Wd> LIZIZ = new LinkedHashMap();
    public static final java.util.Map<Long, C08790Wd> LIZJ = new LinkedHashMap();
    public static final java.util.Map<Long, C08790Wd> LIZLLL = new LinkedHashMap();
    public static final java.util.Map<Long, C08790Wd> LJ = new LinkedHashMap();
    public static final java.util.Map<Long, C08790Wd> LJFF = new LinkedHashMap();
    public static final java.util.Map<Long, RunnableC08800We> LJI = new LinkedHashMap();
    public static final java.util.Set<String> LJIIIIZZ = new LinkedHashSet();
    public static final java.util.Set<String> LJIIIZ = new LinkedHashSet();
    public static final java.util.Set<Long> LJIIJ = new LinkedHashSet();
    public static String LJIIJJI = "normal_video_live";
    public static final Handler LJIIL = new Handler(C16880lQ.LLJJJJ());

    @Override // X.C0WI
    public final void LJ() {
        java.util.Map<Long, C08790Wd> map = LIZJ;
        BU2.LJII = !map.isEmpty();
        java.util.Map<Long, C08790Wd> map2 = LIZIZ;
        ((LinkedHashMap) map2).clear();
        map2.putAll(map);
        ((LinkedHashMap) LIZLLL).clear();
        ((LinkedHashMap) LJ).clear();
        ((LinkedHashMap) LJFF).clear();
        ((LinkedHashMap) map).clear();
        LJII = false;
    }

    @Override // X.C0WI
    public final void release() {
        ((LinkedHashMap) LIZIZ).clear();
        ((LinkedHashMap) LIZJ).clear();
        ((LinkedHashMap) LIZLLL).clear();
        ((LinkedHashMap) LJ).clear();
        ((LinkedHashMap) LJFF).clear();
        Iterator it = ((LinkedHashMap) LJI).entrySet().iterator();
        while (it.hasNext()) {
            LJIIL.removeCallbacks((Runnable) ((Map.Entry) it.next()).getValue());
        }
        ((LinkedHashMap) LJI).clear();
        LJIIIZ.clear();
        LJIIIIZZ.clear();
    }

    public static boolean LJI() {
        LiveEffect liveEffect;
        int i;
        List<LiveEffect> LIZ2 = C12890ez.LIZ().LIZ(C0TY.LIZLLL);
        o.LJIIIIZZ(LIZ2, "LiveComposerManagerProvi….SMALL_ITEM_BEAUTY_PANEL)");
        Iterator<LiveEffect> it = LIZ2.iterator();
        while (true) {
            liveEffect = null;
            Boolean bool = null;
            if (!it.hasNext()) {
                break;
            }
            LiveEffect next = it.next();
            String str = next.effectPanelKey;
            if (str != null) {
                bool = Boolean.valueOf(ujb.o.LJJJLIIL(str, "makeup", false));
            }
            if (C29306Beo.LJJIFFI(bool)) {
                liveEffect = next;
                break;
            }
        }
        LiveEffect liveEffect2 = liveEffect;
        if (liveEffect2 != null) {
            LiveEffect.ComposerConfig smallItemConfig = liveEffect2.getSmallItemConfig();
            if (smallItemConfig != null) {
                i = smallItemConfig.LIZ;
            } else {
                i = 0;
            }
            if (O6R.LJJIIZ(C12920f2.LIZLLL(liveEffect2, i) * 100.0f) / 100.0f != 0.0f) {
                return true;
            }
        }
        return false;
    }

    public static void LJIIJJI() {
        long j;
        long j2;
        Integer num;
        long j3;
        if (C29306Beo.LJIILL() && C29306Beo.LJIILLIIL(Boolean.valueOf(LJII))) {
            C32101Nu.LIZ(2L);
            String broadcastScene = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene();
            o.LJIIIIZZ(broadcastScene, "getService(IBroadcastSer…lass.java).broadcastScene");
            LJIIJJI = broadcastScene;
            Iterator it = ((LinkedHashMap) C113554cx.LJJLIIIJILLIZJL(LIZLLL, LJ)).entrySet().iterator();
            boolean z = false;
            while (true) {
                String str = "";
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                LiveEffect liveEffect = ((C08790Wd) entry.getValue()).LIZLLL;
                long j4 = liveEffect.effectId;
                String name = liveEffect.getName();
                if (name == null) {
                    name = "";
                }
                String resourceId = liveEffect.getResourceId();
                Long valueOf = Long.valueOf(C30725C4b.LIZ() / 1000);
                String str2 = liveEffect.effectPanelKey;
                if (str2 != null) {
                    str = str2;
                }
                LiveEffect.ComposerConfig smallItemConfig = liveEffect.getSmallItemConfig();
                Integer num2 = null;
                if (smallItemConfig != null) {
                    num = Integer.valueOf(smallItemConfig.LIZ);
                } else {
                    num = null;
                }
                LiveEffect.ComposerConfig smallItemConfig2 = liveEffect.getSmallItemConfig();
                if (smallItemConfig2 != null) {
                    num2 = Integer.valueOf(smallItemConfig2.LIZIZ);
                }
                if (o.LJ(num, num2)) {
                    j3 = 1L;
                } else {
                    j3 = 2L;
                }
                C32101Nu.LJI(2L, new Modification(j4, name, resourceId, 2L, valueOf, null, 0L, str, j3, 1L, Float.valueOf(((C08790Wd) entry.getValue()).LIZIZ), null, LJIIJJI, null, null, 0L, 57344, null));
                z = true;
            }
            for (Map.Entry entry2 : ((LinkedHashMap) C113554cx.LJJLIIIJILLIZJL(LJ, LJFF)).entrySet()) {
                boolean contains = LJIIJ.contains(entry2.getKey());
                LiveEffect liveEffect2 = ((C08790Wd) entry2.getValue()).LIZLLL;
                C08790Wd c08790Wd = (C08790Wd) ((LinkedHashMap) LIZIZ).get(entry2.getKey());
                if (c08790Wd != null && c08790Wd.LIZIZ != 0.0f) {
                    long j5 = liveEffect2.effectId;
                    String name2 = liveEffect2.getName();
                    if (name2 == null) {
                        name2 = "";
                    }
                    String resourceId2 = liveEffect2.getResourceId();
                    long j6 = 1000;
                    Long valueOf2 = Long.valueOf(c08790Wd.LJFF / j6);
                    Long valueOf3 = Long.valueOf(C30725C4b.LIZ() / j6);
                    String str3 = liveEffect2.effectPanelKey;
                    if (str3 == null) {
                        str3 = "";
                    }
                    if (c08790Wd.LJ) {
                        j = 1L;
                    } else {
                        j = 2L;
                    }
                    if (contains) {
                        j2 = 2L;
                    } else {
                        j2 = 1L;
                    }
                    C32101Nu.LJI(2L, new Modification(j5, name2, resourceId2, 2L, valueOf2, valueOf3, 0L, str3, j, j2, Float.valueOf(c08790Wd.LIZIZ), null, LJIIJJI, null, null, 0L, 57344, null));
                    z = true;
                }
            }
            if (z) {
                LJII = true;
                C32101Nu.LJIIL(2L);
            }
        }
    }

    public static final void LJIIIIZZ(DataChannel dataChannel) {
        boolean z;
        if (C29306Beo.LJIILLIIL(InterfaceC30442Bx8.LLZLLLL.LIZJ())) {
            return;
        }
        boolean z2 = false;
        for (Map.Entry entry : ((LinkedHashMap) LJFF).entrySet()) {
            String str = ((C08790Wd) entry.getValue()).LIZLLL.effectPanelKey;
            if (str != null && ujb.o.LJJJLIIL(str, "beauty", false)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (C29306Beo.LJJIFFI(InterfaceC30442Bx8.LJJIIJZLJL.LIZJ())) {
                    if ((!LIZIZ.isEmpty()) && C29306Beo.LJIILLIIL(Boolean.valueOf(z2))) {
                        String str2 = ((C08790Wd) entry.getValue()).LIZLLL.effectPanelKey;
                        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_take_beauty_close");
                        LIZ2.LJIILLIIL(dataChannel);
                        LIZ2.LJIJJ(str2, "tab_name");
                        LIZ2.LJIJJ(C15380j0.LJIILJJIL(R.string.ke3), "effect_id");
                        LIZ2.LJIJJ(C15380j0.LJIILJJIL(R.string.ke3), "resource_id");
                        LIZ2.LJIJJ(C15380j0.LJIILJJIL(R.string.ke3), "beauty_type");
                        LIZ2.LJIJJ(C15380j0.LJIILJJIL(R.string.ke3), "beauty_type_name");
                        LIZ2.LJIJJ("", "beauty_type_name_tier2");
                        LIZ2.LJIJJ("", "impr_position");
                        LIZ2.LJIJJ(Boolean.valueOf(LJI()), "beauty_status");
                        LIZ2.LJJIIJZLJL();
                        z2 = true;
                    }
                } else {
                    BZI LIZ3 = C28787BRn.LIZ("livesdk_live_take_beauty_close");
                    LIZ3.LJIILLIIL(dataChannel);
                    LJII(LIZ3, ((C08790Wd) entry.getValue()).LIZLLL);
                    LIZ3.LJIJJ(Boolean.valueOf(LJI()), "beauty_status");
                    LIZ3.LJJIIJZLJL();
                }
            } else {
                BZI LIZ4 = C28787BRn.LIZ("livesdk_live_take_beauty_close");
                LIZ4.LJIILLIIL(dataChannel);
                LJII(LIZ4, ((C08790Wd) entry.getValue()).LIZLLL);
                LIZ4.LJIJJ(Boolean.valueOf(LJI()), "beauty_status");
                LIZ4.LJJIIJZLJL();
            }
        }
    }

    @Override // X.C0WI
    public final void LIZIZ(DataChannel dataChannel) {
        String str;
        for (String str2 : LJIIIIZZ) {
            if (!ujb.o.LJJJLIIL(str2, "beauty", false) || !o.LJ(InterfaceC30442Bx8.LJJIIJZLJL.LIZJ(), Boolean.TRUE)) {
                BZI LIZ2 = C28787BRn.LIZ("livesdk_live_beauty_use");
                LIZ2.LJIILLIIL(dataChannel);
                LIZ2.LJIJJ(str2, "tab_name");
                if (LJIIIZ.contains(str2)) {
                    str = "use";
                } else {
                    str = "unused";
                }
                LIZ2.LJIJJ(str, "use_status");
                LIZ2.LJJIIJZLJL();
            }
        }
    }

    @Override // X.C0WI
    public final void LIZJ(DataChannel dataChannel) {
        long j;
        long j2;
        if (C29306Beo.LJIILLIIL(InterfaceC30442Bx8.LLZLLLL.LIZJ()) || C29306Beo.LJJI()) {
            return;
        }
        C32101Nu.LIZ(2L);
        boolean z = false;
        for (Map.Entry entry : ((LinkedHashMap) C113554cx.LJJLIIIJILLIZJL(LJ, LJFF)).entrySet()) {
            java.util.Set<Long> set = LJIIJ;
            boolean contains = set.contains(entry.getKey());
            set.remove(entry.getKey());
            LiveEffect liveEffect = ((C08790Wd) entry.getValue()).LIZLLL;
            if (!C78880UxY.LJJL(liveEffect)) {
                C08790Wd c08790Wd = (C08790Wd) ((LinkedHashMap) LIZIZ).get(entry.getKey());
                if (c08790Wd != null && c08790Wd.LIZIZ != 0.0f) {
                    C70657RoD.LJJI(0.01d, new C50291yD(entry, c08790Wd, dataChannel, contains, liveEffect));
                    long j3 = liveEffect.effectId;
                    String name = liveEffect.getName();
                    String str = "";
                    if (name == null) {
                        name = "";
                    }
                    String resourceId = liveEffect.getResourceId();
                    long j4 = 1000;
                    Long valueOf = Long.valueOf(c08790Wd.LJFF / j4);
                    Long valueOf2 = Long.valueOf(C30725C4b.LIZ() / j4);
                    String str2 = liveEffect.effectPanelKey;
                    if (str2 != null) {
                        str = str2;
                    }
                    if (c08790Wd.LJ) {
                        j = 1L;
                    } else {
                        j = 2L;
                    }
                    if (contains) {
                        j2 = 2L;
                    } else {
                        j2 = 1L;
                    }
                    C32101Nu.LJI(2L, new Modification(j3, name, resourceId, 2L, valueOf, valueOf2, 0L, str, j, j2, Float.valueOf(c08790Wd.LIZIZ), null, LJIIJJI, null, null, 0L, 57344, null));
                    z = true;
                }
            }
        }
        if (z && C29306Beo.LJIILLIIL(Boolean.valueOf(LJII))) {
            C32101Nu.LJIIL(2L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0WI
    public final void LIZLLL(boolean z) {
        int i;
        Integer num;
        Integer num2;
        if (z) {
            for (Map.Entry entry : ((LinkedHashMap) LIZIZ).entrySet()) {
                LJFF.put(entry.getKey(), new C08790Wd((C08790Wd) entry.getValue()));
            }
            return;
        }
        List<LiveEffect> LIZ2 = C12890ez.LIZ().LIZ(C0TY.LIZLLL);
        ArrayList LIZIZ2 = s1.LIZIZ(LIZ2, "LiveComposerManagerProvi….SMALL_ITEM_BEAUTY_PANEL)");
        for (LiveEffect liveEffect : LIZ2) {
            if (C29306Beo.LJIJJLI(liveEffect.getName())) {
                LIZIZ2.add(liveEffect);
            }
        }
        Iterator it = LIZIZ2.iterator();
        while (it.hasNext()) {
            LiveEffect liveEffect2 = (LiveEffect) it.next();
            C08790Wd c08790Wd = (C08790Wd) ((LinkedHashMap) LIZIZ).get(Long.valueOf(liveEffect2.effectId));
            LiveEffect.ComposerConfig smallItemConfig = liveEffect2.getSmallItemConfig();
            if (smallItemConfig != null) {
                i = smallItemConfig.LIZ;
            } else {
                i = 0;
            }
            float LJJIIZ = O6R.LJJIIZ(C12920f2.LIZLLL(liveEffect2, i) * 100.0f) / 100.0f;
            Integer num3 = null;
            if (c08790Wd != null || LJJIIZ == 0.0f) {
                if (o.LJ(InterfaceC30442Bx8.LJJIIJZLJL.LIZJ(), Boolean.TRUE)) {
                    String str = liveEffect2.effectPanelKey;
                    if (str != null && ujb.o.LJJJLIIL(str, "beauty", false) && !C78880UxY.LJJL(liveEffect2) && c08790Wd != null) {
                        LJFF.put(Long.valueOf(liveEffect2.effectId), c08790Wd);
                    }
                } else if (c08790Wd != null) {
                    if (LJJIIZ == 0.0f) {
                        LJFF.put(Long.valueOf(liveEffect2.effectId), c08790Wd);
                    } else if (LJJIIZ == c08790Wd.LIZIZ) {
                        LIZJ.put(Long.valueOf(liveEffect2.effectId), c08790Wd);
                    } else {
                        long j = liveEffect2.effectId;
                        String name = liveEffect2.getName();
                        LiveEffect.ComposerConfig smallItemConfig2 = liveEffect2.getSmallItemConfig();
                        if (smallItemConfig2 != null) {
                            num = Integer.valueOf(smallItemConfig2.LIZ);
                        } else {
                            num = null;
                        }
                        LiveEffect.ComposerConfig smallItemConfig3 = liveEffect2.getSmallItemConfig();
                        if (smallItemConfig3 != null) {
                            num3 = Integer.valueOf(smallItemConfig3.LIZIZ);
                        }
                        C08790Wd c08790Wd2 = new C08790Wd(j, LJJIIZ, name, liveEffect2, o.LJ(num, num3));
                        LJ.put(Long.valueOf(liveEffect2.effectId), c08790Wd2);
                        LIZJ.put(Long.valueOf(liveEffect2.effectId), c08790Wd2);
                    }
                }
            } else {
                long j2 = liveEffect2.effectId;
                String name2 = liveEffect2.getName();
                LiveEffect.ComposerConfig smallItemConfig4 = liveEffect2.getSmallItemConfig();
                if (smallItemConfig4 != null) {
                    num2 = Integer.valueOf(smallItemConfig4.LIZ);
                } else {
                    num2 = null;
                }
                LiveEffect.ComposerConfig smallItemConfig5 = liveEffect2.getSmallItemConfig();
                if (smallItemConfig5 != null) {
                    num3 = Integer.valueOf(smallItemConfig5.LIZIZ);
                }
                C08790Wd c08790Wd3 = new C08790Wd(j2, LJJIIZ, name2, liveEffect2, o.LJ(num2, num3));
                LIZLLL.put(Long.valueOf(liveEffect2.effectId), c08790Wd3);
                LIZJ.put(Long.valueOf(liveEffect2.effectId), c08790Wd3);
            }
        }
        java.util.Map<Long, C08790Wd> map = LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry2 : ((LinkedHashMap) map).entrySet()) {
            if (!LIZJ.containsKey(entry2.getKey())) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            LJFF.put(entry3.getKey(), new C08790Wd((C08790Wd) entry3.getValue()));
        }
    }

    public static void LJII(BZI bzi, LiveEffect liveEffect) {
        String str;
        Integer num;
        Integer num2;
        bzi.LJIJJ(liveEffect.effectPanelKey, "tab_name");
        bzi.LJIJJ(Long.valueOf(liveEffect.effectId), "effect_id");
        bzi.LJIJJ(liveEffect.getResourceId(), "resource_id");
        String str2 = liveEffect.parentResName;
        if (str2 == null) {
            str2 = liveEffect.getName();
        }
        bzi.LJIJJ(str2, "beauty_type");
        String str3 = liveEffect.parentResName;
        if (str3 == null) {
            str3 = liveEffect.getName();
        }
        bzi.LJIJJ(str3, "beauty_type_name");
        if (liveEffect.isSubItem()) {
            str = liveEffect.getName();
        } else {
            str = "";
        }
        bzi.LJIJJ(str, "beauty_type_name_tier2");
        if (liveEffect.isSubItem()) {
            num = liveEffect.parentImpressionPos;
        } else {
            num = liveEffect.impressionPos;
        }
        if (num != null) {
            num2 = C77339UWx.LIZIZ(num, 1);
        } else {
            num2 = null;
        }
        bzi.LJIJJ(num2, "impr_position");
    }

    public static void LJIIIZ(long j, DataChannel dataChannel) {
        String str;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_take_beauty_panel_duration");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(Long.valueOf(j), "use_time");
        if (C29306Beo.LJJI()) {
            str = "live_take_page";
        } else {
            str = "live_take_detail";
        }
        LIZ2.LJIJJ(str, "event_page");
        LIZ2.LJJIIJZLJL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0WI
    public final void LIZ(DataChannel dataChannel, boolean z) {
        if (C29306Beo.LJJI() || C29306Beo.LJIILLIIL(InterfaceC30442Bx8.LLZLLLL.LIZJ())) {
            return;
        }
        Iterator it = ((LinkedHashMap) LJFF).entrySet().iterator();
        while (it.hasNext()) {
            RunnableC08800We remove = LJI.remove(((Map.Entry) it.next()).getKey());
            if (remove != null) {
                LJIIL.removeCallbacks(remove);
            }
        }
        for (Map.Entry entry : ((LinkedHashMap) C113554cx.LJJLIIIJILLIZJL(LIZLLL, LJ)).entrySet()) {
            java.util.Map<Long, RunnableC08800We> map = LJI;
            RunnableC08800We runnableC08800We = (RunnableC08800We) map.remove(entry.getKey());
            if (runnableC08800We != null) {
                LJIIL.removeCallbacks(runnableC08800We);
            }
            if (((C08790Wd) entry.getValue()).LIZIZ != 0.0f) {
                RunnableC08800We runnableC08800We2 = new RunnableC08800We(dataChannel, z, ((C08790Wd) entry.getValue()).LIZLLL, ((C08790Wd) entry.getValue()).LIZIZ, LJI());
                map.put(entry.getKey(), runnableC08800We2);
                LJIIL.postDelayed(runnableC08800We2, 30000L);
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry2 : ((LinkedHashMap) LJI).entrySet()) {
            arrayList.add(String.valueOf(((RunnableC08800We) entry2.getValue()).LJLJI.effectId));
            arrayList2.add(((RunnableC08800We) entry2.getValue()).LJLJI.getResourceId());
            arrayList3.add(Float.valueOf(C12920f2.LIZLLL(((RunnableC08800We) entry2.getValue()).LJLJI, ((RunnableC08800We) entry2.getValue()).LJLJI.getCurrentUiValue())));
        }
        C31014CFe.LIZIZ(arrayList);
        C31014CFe.LIZJ(arrayList2);
        C31014CFe.LIZ(arrayList3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0WI
    public final void LJFF(DataChannel dataChannel, boolean z) {
        Integer num;
        Integer num2;
        String str;
        Integer num3;
        Integer num4;
        long j;
        long j2;
        if (C29306Beo.LJIILLIIL(InterfaceC30442Bx8.LLZLLLL.LIZJ())) {
            return;
        }
        if (C29306Beo.LJIILL()) {
            C32101Nu.LIZ(2L);
        }
        String broadcastScene = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene();
        o.LJIIIIZZ(broadcastScene, "getService(IBroadcastSer…lass.java).broadcastScene");
        LJIIJJI = broadcastScene;
        boolean z2 = false;
        for (Map.Entry entry : ((LinkedHashMap) C113554cx.LJJLIIIJILLIZJL(LIZLLL, LJ)).entrySet()) {
            LiveEffect liveEffect = ((C08790Wd) entry.getValue()).LIZLLL;
            if (z) {
                LJIIJ.add(entry.getKey());
            }
            if (!C78880UxY.LJJL(liveEffect)) {
                BZI LIZ2 = C28787BRn.LIZ("livesdk_live_take_beauty_select");
                LIZ2.LJIILLIIL(dataChannel);
                LiveEffect.ComposerConfig smallItemConfig = liveEffect.getSmallItemConfig();
                if (smallItemConfig != null) {
                    num = Integer.valueOf(smallItemConfig.LIZ);
                } else {
                    num = null;
                }
                LiveEffect.ComposerConfig smallItemConfig2 = liveEffect.getSmallItemConfig();
                if (smallItemConfig2 != null) {
                    num2 = Integer.valueOf(smallItemConfig2.LIZIZ);
                } else {
                    num2 = null;
                }
                LIZ2.LJIJJ(Integer.valueOf(o.LJ(num, num2) ? 1 : 0), "is_default_value");
                LIZ2.LJIJJ(Integer.valueOf(z ? 1 : 0), "is_live_take_default");
                LIZ2.LJIL("beauty_value", Float.valueOf(((C08790Wd) entry.getValue()).LIZIZ));
                if (LJI()) {
                    str = "makeup";
                } else {
                    str = "normal";
                }
                LIZ2.LJIJJ(str, "beauty_status");
                LJII(LIZ2, liveEffect);
                LIZ2.LJJIIJZLJL();
                if (C29306Beo.LJIILL()) {
                    long j3 = liveEffect.effectId;
                    String name = liveEffect.getName();
                    if (name == null) {
                        name = "";
                    }
                    String resourceId = liveEffect.getResourceId();
                    Long valueOf = Long.valueOf(C30725C4b.LIZ() / 1000);
                    String str2 = liveEffect.effectPanelKey;
                    if (str2 == null) {
                        str2 = "";
                    }
                    LiveEffect.ComposerConfig smallItemConfig3 = liveEffect.getSmallItemConfig();
                    if (smallItemConfig3 != null) {
                        num3 = Integer.valueOf(smallItemConfig3.LIZ);
                    } else {
                        num3 = null;
                    }
                    LiveEffect.ComposerConfig smallItemConfig4 = liveEffect.getSmallItemConfig();
                    if (smallItemConfig4 != null) {
                        num4 = Integer.valueOf(smallItemConfig4.LIZIZ);
                    } else {
                        num4 = null;
                    }
                    if (o.LJ(num3, num4)) {
                        j = 1L;
                    } else {
                        j = 2L;
                    }
                    if (z) {
                        j2 = 2L;
                    } else {
                        j2 = 1L;
                    }
                    C32101Nu.LJI(2L, new Modification(j3, name, resourceId, 2L, valueOf, null, 0L, str2, j, j2, Float.valueOf(((C08790Wd) entry.getValue()).LIZIZ), null, LJIIJJI, null, null, 0L, 57344, null));
                    z2 = true;
                }
            }
        }
        if (C29306Beo.LJIILL() && z2 && C29306Beo.LJIILLIIL(Boolean.valueOf(LJII))) {
            C32101Nu.LJIIL(2L);
        }
    }

    public static final void LJIIJ(DataChannel dataChannel, String str, String str2) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_reset_beauty_popup_window_click");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(str, "tab_name");
        LIZ2.LJIJJ(str2, "click_type");
        LIZ2.LJJIIJZLJL();
    }
}
