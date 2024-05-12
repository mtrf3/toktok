package X;

import android.os.Handler;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.1l5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42151l5 implements InterfaceC31991Nj {
    public static final C42151l5 LIZ = new C42151l5();
    public static final java.util.Map<Long, C0W9> LIZIZ = new LinkedHashMap();
    public static final java.util.Map<Long, Integer> LIZJ = new LinkedHashMap();
    public static final java.util.Map<Long, C0W9> LIZLLL = new LinkedHashMap();
    public static final java.util.Map<Long, C0W9> LJ = new LinkedHashMap();
    public static final java.util.Map<Long, C0W9> LJFF = new LinkedHashMap();
    public static final java.util.Map<Long, C0W9> LJI = new LinkedHashMap();
    public static final java.util.Map<Long, C0W9> LJII = new LinkedHashMap();
    public static final java.util.Map<Long, RunnableC08830Wh> LJIIIIZZ = new LinkedHashMap();
    public static final java.util.Set<String> LJIIIZ = new LinkedHashSet();
    public static final java.util.Set<String> LJIIJ = new LinkedHashSet();
    public static C0WF LJIIJJI;
    public static java.util.Map<String, String> LJIIL;
    public static boolean LJIILIIL;

    @Override // X.C0WI
    public final void LIZIZ(DataChannel dataChannel) {
    }

    static {
        new LinkedHashSet();
        LJIIJJI = C12890ez.LIZ();
    }

    @Override // X.C0WI
    public final void LJ() {
        java.util.Map<Long, C0W9> map = LIZLLL;
        BU2.LJII = !map.isEmpty();
        java.util.Map<Long, C0W9> map2 = LIZIZ;
        ((LinkedHashMap) map2).clear();
        map2.putAll(map);
        ((LinkedHashMap) LJ).clear();
        ((LinkedHashMap) LJFF).clear();
        ((LinkedHashMap) LJI).clear();
        ((LinkedHashMap) map).clear();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("previousBeautyMap = ");
        LIZ2.append(map2);
        LJII("finishLog", X1D.LIZIZ(LIZ2));
    }

    @Override // X.C0WI
    public final void release() {
        ((LinkedHashMap) LIZIZ).clear();
        ((LinkedHashMap) LIZLLL).clear();
        ((LinkedHashMap) LJ).clear();
        ((LinkedHashMap) LJFF).clear();
        ((LinkedHashMap) LJI).clear();
        Iterator it = ((LinkedHashMap) LJIIIIZZ).entrySet().iterator();
        while (it.hasNext()) {
            C15610jN.LIZ().removeCallbacks((Runnable) ((Map.Entry) it.next()).getValue());
        }
        ((LinkedHashMap) LJIIIIZZ).clear();
        LJIIJ.clear();
        LJIIIZ.clear();
    }

    public static final void LJI() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("effectuse map ");
        java.util.Map<Long, RunnableC08830Wh> map = LJIIIIZZ;
        LIZ2.append(map);
        LJII("clearMultiGuestEffectiveUseTimer", X1D.LIZIZ(LIZ2));
        Iterator it = ((LinkedHashMap) map).entrySet().iterator();
        while (it.hasNext()) {
            C15610jN.LIZ().removeCallbacks((Runnable) ((Map.Entry) it.next()).getValue());
        }
        ((LinkedHashMap) LJIIIIZZ).clear();
    }

    public static final void LJIIJ(DataChannel dataChannel) {
        if (C29306Beo.LJIILLIIL(InterfaceC30442Bx8.LLZLLLL.LIZJ())) {
            return;
        }
        for (Map.Entry entry : ((LinkedHashMap) LJI).entrySet()) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_guest_connection_beauty_close");
            LIZ2.LJIILLIIL(dataChannel);
            C77412UZs.LJJIIZ(LIZ2, ((C0W9) entry.getValue()).LIZLLL);
            LIZ2.LJJIFFI(LJIIL);
            LIZ2.LJJIIJZLJL();
        }
    }

    @Override // X.C0WI
    public final void LIZJ(DataChannel dataChannel) {
        if (LJIILIIL) {
            LJIIIZ(dataChannel, C113554cx.LJJLIIIJILLIZJL(LJFF, LJI));
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
                LJI.put(entry.getKey(), new C0W9((C0W9) entry.getValue()));
            }
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("previewBeautyMap = ");
        LIZ2.append(LIZIZ);
        LJII("prepareLogData", X1D.LIZIZ(LIZ2));
        List<LiveEffect> LIZ3 = LJIIJJI.LIZ("liveguestbeauty");
        ArrayList LIZIZ2 = s1.LIZIZ(LIZ3, "baseComposerManager\n    …MULTI_GUEST_BEAUTY_PANEL)");
        for (LiveEffect liveEffect : LIZ3) {
            if (C29306Beo.LJIJJLI(liveEffect.getName())) {
                LIZIZ2.add(liveEffect);
            }
        }
        Iterator it = LIZIZ2.iterator();
        while (it.hasNext()) {
            LiveEffect liveEffect2 = (LiveEffect) it.next();
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("current sticker ");
            LIZ4.append(liveEffect2);
            LJII("prepareLogData", X1D.LIZIZ(LIZ4));
            C0W9 c0w9 = (C0W9) ((LinkedHashMap) LIZIZ).get(Long.valueOf(liveEffect2.effectId));
            LiveEffect.ComposerConfig smallItemConfig = liveEffect2.getSmallItemConfig();
            if (smallItemConfig != null) {
                i = smallItemConfig.LIZ;
            } else {
                i = 0;
            }
            float LJJIIZ = O6R.LJJIIZ(C12920f2.LIZLLL(liveEffect2, i) * 100.0f) / 100.0f;
            Integer num3 = null;
            if (c0w9 == null) {
                if (LJJIIZ == 0.0f) {
                    LJII("prepareLogData", "preview beauty == null and new effect.");
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
                    C0W9 c0w92 = new C0W9(j, LJJIIZ, name, liveEffect2, o.LJ(num, num3));
                    LJ.put(Long.valueOf(liveEffect2.effectId), c0w92);
                    LIZLLL.put(Long.valueOf(liveEffect2.effectId), c0w92);
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("find new added ");
                    LIZ5.append(liveEffect2);
                    LJII("prepareLogData", X1D.LIZIZ(LIZ5));
                }
            } else if (LJJIIZ == 0.0f) {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("find effect to be deleted ");
                LIZ6.append(liveEffect2);
                LJII("prepareLogData", X1D.LIZIZ(LIZ6));
                LJI.put(Long.valueOf(liveEffect2.effectId), c0w9);
            } else if (LJJIIZ == c0w9.LIZIZ) {
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("find a existing effect ");
                LIZ7.append(liveEffect2);
                LJII("prepareLogData", X1D.LIZIZ(LIZ7));
                if (LJII.containsKey(Long.valueOf(c0w9.LIZLLL.effectId))) {
                    LIZLLL.put(Long.valueOf(liveEffect2.effectId), new C0W9(c0w9.LIZ, c0w9.LIZIZ, c0w9.LIZJ, c0w9.LIZLLL, c0w9.LJ, System.currentTimeMillis()));
                } else {
                    LIZLLL.put(Long.valueOf(liveEffect2.effectId), c0w9);
                }
            } else {
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append("find a changed effect ");
                LIZ8.append(liveEffect2);
                LJII("prepareLogData", X1D.LIZIZ(LIZ8));
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
                C0W9 c0w93 = new C0W9(j2, LJJIIZ, name2, liveEffect2, o.LJ(num2, num3));
                LJFF.put(Long.valueOf(liveEffect2.effectId), c0w93);
                LIZLLL.put(Long.valueOf(liveEffect2.effectId), c0w93);
            }
        }
        java.util.Map<Long, C0W9> map = LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry2 : ((LinkedHashMap) map).entrySet()) {
            if (!LIZLLL.containsKey(entry2.getKey())) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            LJI.put(entry3.getKey(), new C0W9((C0W9) entry3.getValue()));
        }
        ((LinkedHashMap) LJII).clear();
        LJII("prepareLogData", "deleteMap = " + LJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIIZZ(DataChannel dataChannel) {
        Handler LIZ2 = C15610jN.LIZ();
        Iterator it = ((LinkedHashMap) LJIIIIZZ).entrySet().iterator();
        while (it.hasNext()) {
            LIZ2.removeCallbacks((Runnable) ((Map.Entry) it.next()).getValue());
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(LJ);
        LIZ3.append(' ');
        LIZ3.append(LJFF);
        LJII("reportAllBeautyEffectiveUse", X1D.LIZIZ(LIZ3));
        for (Map.Entry entry : ((LinkedHashMap) LIZLLL).entrySet()) {
            java.util.Map<Long, RunnableC08830Wh> map = LJIIIIZZ;
            RunnableC08830Wh runnableC08830Wh = (RunnableC08830Wh) map.remove(entry.getKey());
            if (runnableC08830Wh != null) {
                LIZ2.removeCallbacks(runnableC08830Wh);
            }
            int i = 1;
            if (((C0W9) entry.getValue()).LIZIZ != 0.0f) {
                LiveEffect liveEffect = ((C0W9) entry.getValue()).LIZLLL;
                float f = ((C0W9) entry.getValue()).LIZIZ;
                Integer num = (Integer) ((LinkedHashMap) LIZJ).get(Long.valueOf(((C0W9) entry.getValue()).LIZ));
                if (num != null) {
                    i = num.intValue();
                }
                RunnableC08830Wh runnableC08830Wh2 = new RunnableC08830Wh(dataChannel, liveEffect, f, i);
                map.put(entry.getKey(), runnableC08830Wh2);
                LIZ2.postDelayed(runnableC08830Wh2, 30000L);
            }
        }
    }

    public static void LJII(String str, String str2) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("method#");
        LIZ2.append(str);
        LIZ2.append(" - ");
        LIZ2.append(str2);
        C0NB.LIZIZ("LiveMultiGuestBeautyLogManager", X1D.LIZIZ(LIZ2));
    }

    public static void LJIIIZ(DataChannel dataChannel, java.util.Map map) {
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            C0W9 c0w9 = (C0W9) entry.getValue();
            LiveEffect liveEffect = c0w9.LIZLLL;
            C0W9 c0w92 = (C0W9) ((LinkedHashMap) LIZIZ).get(entry.getKey());
            if (c0w92 != null && c0w92.LIZIZ != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis() - c0w92.LJFF;
                BZI LIZ2 = C28787BRn.LIZ("livesdk_guest_connection_beauty_use_time");
                LIZ2.LJIILLIIL(dataChannel);
                LIZ2.LJIL("beauty_value", Float.valueOf(c0w92.LIZIZ));
                LIZ2.LJIJJ(Long.valueOf(currentTimeMillis), "use_time");
                LIZ2.LJIJJ(((LinkedHashMap) LIZJ).get(Long.valueOf(c0w9.LIZ)), "event_scene");
                LIZ2.LJIJJ(Integer.valueOf(c0w92.LJ ? 1 : 0), "is_default_value");
                C77412UZs.LJJIIZ(LIZ2, liveEffect);
                LIZ2.LJJIFFI(LJIIL);
                LIZ2.LJII(C50351yJ.LJLIL);
                LIZ2.LJJIIJZLJL();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0WI
    public final void LIZ(DataChannel dataChannel, boolean z) {
        Handler LIZ2 = C15610jN.LIZ();
        Iterator it = ((LinkedHashMap) LJI).entrySet().iterator();
        while (it.hasNext()) {
            RunnableC08830Wh remove = LJIIIIZZ.remove(((Map.Entry) it.next()).getKey());
            if (remove != null) {
                LIZ2.removeCallbacks(remove);
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        java.util.Map<Long, C0W9> map = LJ;
        LIZ3.append(map);
        LIZ3.append(' ');
        java.util.Map<Long, C0W9> map2 = LJFF;
        LIZ3.append(map2);
        LJII("reportBeautyEffectiveUse", X1D.LIZIZ(LIZ3));
        for (Map.Entry entry : ((LinkedHashMap) C113554cx.LJJLIIIJILLIZJL(map, map2)).entrySet()) {
            java.util.Map<Long, RunnableC08830Wh> map3 = LJIIIIZZ;
            RunnableC08830Wh runnableC08830Wh = (RunnableC08830Wh) map3.remove(entry.getKey());
            if (runnableC08830Wh != null) {
                LIZ2.removeCallbacks(runnableC08830Wh);
            }
            int i = 1;
            if (((C0W9) entry.getValue()).LIZIZ != 0.0f) {
                LiveEffect liveEffect = ((C0W9) entry.getValue()).LIZLLL;
                float f = ((C0W9) entry.getValue()).LIZIZ;
                Integer num = (Integer) ((LinkedHashMap) LIZJ).get(Long.valueOf(((C0W9) entry.getValue()).LIZ));
                if (num != null) {
                    i = num.intValue();
                }
                RunnableC08830Wh runnableC08830Wh2 = new RunnableC08830Wh(dataChannel, liveEffect, f, i);
                map3.put(entry.getKey(), runnableC08830Wh2);
                LIZ2.postDelayed(runnableC08830Wh2, 30000L);
            }
        }
    }

    @Override // X.C0WI
    public final void LJFF(DataChannel dataChannel, boolean z) {
        Integer num;
        if (LJIILIIL) {
            StringBuilder LIZ2 = X1D.LIZ();
            java.util.Map<Long, C0W9> map = LJ;
            LIZ2.append(map);
            LIZ2.append(' ');
            java.util.Map<Long, C0W9> map2 = LJFF;
            LIZ2.append(map2);
            LJII("reportBeautySelected", X1D.LIZIZ(LIZ2));
            for (Map.Entry entry : ((LinkedHashMap) C113554cx.LJJLIIIJILLIZJL(map, map2)).entrySet()) {
                LiveEffect liveEffect = ((C0W9) entry.getValue()).LIZLLL;
                BZI LIZ3 = C28787BRn.LIZ("livesdk_guest_connection_beauty_select");
                LIZ3.LJIILLIIL(dataChannel);
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
                LIZ3.LJIJJ(Integer.valueOf(o.LJ(num, num2) ? 1 : 0), "is_default_value");
                LIZ3.LJIL("beauty_value", Float.valueOf(((C0W9) entry.getValue()).LIZIZ));
                LIZ3.LJJIFFI(LJIIL);
                C77412UZs.LJJIIZ(LIZ3, liveEffect);
                LIZ3.LJJIIJZLJL();
            }
        }
    }

    public static void LJIIJJI(DataChannel dataChannel, java.util.Map map, int i) {
        Integer num;
        LJII("reportBeautyUseInternal", String.valueOf(map));
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            LiveEffect liveEffect = ((C0W9) entry.getValue()).LIZLLL;
            LIZJ.put(Long.valueOf(((C0W9) entry.getValue()).LIZ), Integer.valueOf(i));
            BZI LIZ2 = C28787BRn.LIZ("livesdk_guest_connection_beauty_use");
            LIZ2.LJIILLIIL(dataChannel);
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
            LIZ2.LJIJJ(Integer.valueOf(o.LJ(num, num2) ? 1 : 0), "is_default_value");
            LIZ2.LJIJJ(Integer.valueOf(i), "event_scene");
            LIZ2.LJIL("beauty_value", Float.valueOf(((C0W9) entry.getValue()).LIZIZ));
            LIZ2.LJJIFFI(LJIIL);
            C77412UZs.LJJIIZ(LIZ2, liveEffect);
            LIZ2.LJJIIJZLJL();
        }
    }

    public static final void LJIIL(DataChannel dataChannel, String str, String str2) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_guest_connection_reset_beauty_popup_window_click");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(str, "tab_name");
        LIZ2.LJIJJ(str2, "click_type");
        LIZ2.LJJIFFI(LJIIL);
        LIZ2.LJJIIJZLJL();
    }
}
