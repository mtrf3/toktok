package X;

import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3BeautyControlGroupAppLogSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.o;

/* renamed from: X.1Nn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32031Nn implements C0WU {
    public static LiveEffect LIZJ;
    public static LiveEffect LJ;
    public static C08840Wi LJFF;
    public static C08840Wi LJI;
    public static final C32031Nn LIZ = new C32031Nn();
    public static final C5H3 LIZIZ = C78996UzQ.LJJIJIIJI(C50381yM.LJLIL);
    public static final java.util.Map<Long, Long> LIZLLL = new LinkedHashMap();

    @Override // X.C0WU
    public final void LJFF() {
        LJ = null;
    }

    @Override // X.C0WU
    public final void LJII() {
        LIZJ = null;
    }

    @Override // X.C0WU
    public final boolean LJI() {
        C08840Wi c08840Wi = LJI;
        if (c08840Wi == null || c08840Wi.LIZ != C18420nu.LIZJ + 1) {
            return false;
        }
        return true;
    }

    @Override // X.C0WU
    public final void LIZJ() {
        C15610jN.LIZ().removeCallbacks((RunnableC08850Wj) LIZIZ.getValue());
    }

    @Override // X.C0WU
    public final void release() {
        Handler LIZ2 = C15610jN.LIZ();
        C5H3 c5h3 = LIZIZ;
        LIZ2.removeCallbacks((RunnableC08850Wj) c5h3.getValue());
        LIZJ = null;
        RunnableC08850Wj runnableC08850Wj = (RunnableC08850Wj) c5h3.getValue();
        runnableC08850Wj.LJLIL = null;
        runnableC08850Wj.LJLILLLLZI = null;
        runnableC08850Wj.LJLJJL = null;
        ((LinkedHashMap) LIZLLL).clear();
        LJFF = null;
        LJI = null;
    }

    @Override // X.C0WU
    public final void LIZIZ(LiveEffect liveEffect) {
        String str;
        LJFF = LJI;
        C08840Wi c08840Wi = null;
        if (C78880UxY.LJJJZ(liveEffect)) {
            int i = C18420nu.LIZJ + 1;
            C20000qS c20000qS = C18420nu.LIZ;
            if (c20000qS == null || ((str = c20000qS.LIZ) == null && (str = c20000qS.LIZIZ) == null)) {
                str = "";
            }
            c08840Wi = new C08840Wi(i, str, C18420nu.LJFF);
        }
        LJI = c08840Wi;
    }

    public static void LJIIL(BZI bzi, LiveEffect liveEffect) {
        Integer num;
        Integer num2 = liveEffect.parentImpressionPos;
        Object obj = null;
        if (num2 != null) {
            num = C77339UWx.LIZIZ(num2, 1);
        } else {
            num = null;
        }
        bzi.LJIJJ(String.valueOf(num), "impr_position");
        bzi.LJIJJ(String.valueOf(liveEffect.effectId), "sticker_id");
        bzi.LJIJJ(liveEffect.getResourceId(), "resource_id");
        bzi.LJIJJ(liveEffect.getName(), "sticker_name");
        bzi.LJIJJ(liveEffect.parentEffectId, "group_sticker_id");
        bzi.LJIJJ(liveEffect.parentResName, "group_sticker_name");
        bzi.LJIJJ(liveEffect.parentResId, "group_resource_id");
        Object mv0 = DataChannelGlobal.LJLJJI.mv0(C2BX.class);
        if (C77412UZs.LJJ(liveEffect)) {
            obj = mv0;
        }
        bzi.LJIJJ(obj, "is_sub_sticker_default");
        bzi.LJIJJ(liveEffect.impressionPos, "sub_impr_position");
        bzi.LJIJJ(liveEffect.effectPanelKey, "tab");
    }

    @Override // X.C0WU
    public final void LJIIIIZZ(DataChannel dataChannel, String str) {
        String str2;
        if (str == null || str.length() == 0) {
            return;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_guest_connection_sticker_tab_change");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(str, "tab");
        LIZ2.LJIJI(false);
        InterfaceC65784Pro<String> interfaceC65784Pro = BU9.LJ;
        if (interfaceC65784Pro == null || (str2 = interfaceC65784Pro.invoke()) == null) {
            str2 = "";
        }
        LIZ2.LJIJJ(str2, "event_page");
        LIZ2.LJJIIZI();
    }

    @Override // X.C0WU
    public final void LJIIIZ(LiveEffect liveEffect, DataChannel dataChannel) {
        long j;
        long j2;
        String str;
        String str2;
        String str3;
        if (liveEffect != null) {
            if (C78880UxY.LJJJZ(liveEffect)) {
                C08840Wi c08840Wi = LJFF;
                if (c08840Wi != null && (str3 = c08840Wi.LIZIZ) != null) {
                    j = CastLongProtector.parseLong(str3);
                } else {
                    j = 1;
                }
            } else {
                j = liveEffect.effectId;
            }
            java.util.Map<Long, Long> map = LIZLLL;
            if (!map.containsKey(Long.valueOf(j))) {
                return;
            }
            long LIZ2 = C30725C4b.LIZ();
            BZI LIZ3 = C28787BRn.LIZ("livesdk_guest_connection_sticker_use_time");
            LIZ3.LJIILLIIL(dataChannel);
            Long remove = map.remove(Long.valueOf(j));
            if (remove != null) {
                j2 = remove.longValue();
            } else {
                j2 = LIZ2;
            }
            LIZ3.LJIJJ(Long.valueOf((LIZ2 - j2) / 1000), "use_time");
            if (o.LJ(liveEffect, LJ)) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ3.LJIJJ(str, "is_connection_default");
            LJIIL(LIZ3, liveEffect);
            LIZ3.LJIJI(false);
            LJIIJJI(LIZ3, liveEffect, LJFF);
            LIZ3.LJII(C50371yL.LJLIL);
            InterfaceC65784Pro<String> interfaceC65784Pro = BU9.LJ;
            if (interfaceC65784Pro == null || (str2 = interfaceC65784Pro.invoke()) == null) {
                str2 = "";
            }
            LIZ3.LJIJJ(str2, "event_page");
            LIZ3.LJJIIZI();
        }
    }

    @Override // X.C0WU
    public final void LJIIJ(DataChannel dataChannel, String panelType) {
        String str;
        o.LJIIIZ(panelType, "panelType");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_guest_connection_sticker_close_click");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(panelType, "panel_type");
        LIZ2.LJIJI(false);
        InterfaceC65784Pro<String> interfaceC65784Pro = BU9.LJ;
        if (interfaceC65784Pro == null || (str = interfaceC65784Pro.invoke()) == null) {
            str = "";
        }
        LIZ2.LJIJJ(str, "event_page");
        LIZ2.LJJIIZI();
    }

    public static void LJIIJJI(BZI bzi, LiveEffect liveEffect, C08840Wi c08840Wi) {
        String str;
        Boolean bool;
        int i;
        boolean z = false;
        if (C78880UxY.LJJJZ(liveEffect)) {
            KNV.LJ(1, bzi, "is_avatar", "", "resource_id");
            bzi.LJIJJ("", "sticker_name");
            String str2 = null;
            if (c08840Wi != null) {
                str = c08840Wi.LIZIZ;
            } else {
                str = null;
            }
            bzi.LJIJJ(str, "sticker_id");
            bzi.LJIJJ(liveEffect.getName(), "group_sticker_name");
            bzi.LJIJJ(liveEffect.getResourceId(), "group_resource_id");
            if (c08840Wi != null) {
                bool = Boolean.valueOf(c08840Wi.LIZJ);
            } else {
                bool = null;
            }
            bzi.LJIJJ(String.valueOf(C29306Beo.LJJIFFI(bool) ? 1 : 0), "is_sub_sticker_default");
            if (c08840Wi != null) {
                str2 = Integer.valueOf(c08840Wi.LIZ).toString();
            }
            bzi.LJIJJ(str2, "sub_impr_position");
            if (c08840Wi != null) {
                i = c08840Wi.LIZ;
            } else {
                i = 1;
            }
            if (i <= C18420nu.LIZLLL) {
                z = true;
            }
            bzi.LJIJJ(String.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "is_avatar_user_create");
            bzi.LJIJJ(Integer.valueOf(C18420nu.LIZLLL), "user_avatar_count");
            bzi.LJIJJ(Integer.valueOf(C18420nu.LJ), "template_avatar_count");
            return;
        }
        bzi.LJIJJ(0, "is_avatar");
    }

    @Override // X.C0WU
    public final void LJ(LiveEffect liveEffect, DataChannel dataChannel, int i) {
        String str;
        long j;
        String str2;
        C5H3 c5h3 = LIZIZ;
        RunnableC08850Wj runnableC08850Wj = (RunnableC08850Wj) c5h3.getValue();
        C08840Wi c08840Wi = LJI;
        runnableC08850Wj.LJLILLLLZI = liveEffect;
        runnableC08850Wj.LJLIL = dataChannel;
        InterfaceC65784Pro<String> interfaceC65784Pro = BU9.LJ;
        if (interfaceC65784Pro == null || (str = interfaceC65784Pro.invoke()) == null) {
            str = "";
        }
        runnableC08850Wj.LJLJI = str;
        runnableC08850Wj.LJLJJI = i;
        runnableC08850Wj.LJLJJL = c08840Wi;
        if (C78880UxY.LJJJZ(liveEffect)) {
            C08840Wi c08840Wi2 = LJI;
            if (c08840Wi2 != null && (str2 = c08840Wi2.LIZIZ) != null) {
                j = CastLongProtector.parseLong(str2);
            } else {
                j = 1;
            }
        } else {
            j = liveEffect.effectId;
        }
        LIZLLL.put(Long.valueOf(j), Long.valueOf(C30725C4b.LIZ()));
        C15610jN.LIZ().postDelayed((RunnableC08850Wj) c5h3.getValue(), 30000L);
    }

    @Override // X.C0WU
    public final void LIZ(LiveEffect liveEffect, DataChannel dataChannel, int i, boolean z) {
        String str;
        String invoke;
        C08840Wi c08840Wi;
        o.LJIIIZ(liveEffect, "liveEffect");
        if (i == 1) {
            LJ = liveEffect;
        }
        if (C78880UxY.LJJJZ(liveEffect) && C78880UxY.LJJJZ(LIZJ)) {
            if (o.LJ(liveEffect, LIZJ) && (c08840Wi = LJI) != null && c08840Wi.LIZ == C18420nu.LIZJ + 1) {
                return;
            }
        } else if (o.LJ(liveEffect, LIZJ)) {
            return;
        }
        int i2 = C18420nu.LIZJ + 1;
        C20000qS c20000qS = C18420nu.LIZ;
        String str2 = "";
        C08840Wi c08840Wi2 = null;
        if (c20000qS == null || ((str = c20000qS.LIZ) == null && (str = c20000qS.LIZIZ) == null)) {
            str = "";
        }
        C08840Wi c08840Wi3 = new C08840Wi(i2, str, C18420nu.LJFF);
        if (z) {
            LJFF = LJI;
            if (C78880UxY.LJJJZ(liveEffect)) {
                c08840Wi2 = c08840Wi3;
            }
            LJI = c08840Wi2;
        }
        LIZJ = liveEffect;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_guest_connection_sticker_select");
        LIZ2.LJIILLIIL(dataChannel);
        LJIIL(LIZ2, liveEffect);
        LIZ2.LJIJI(false);
        LJIIJJI(LIZ2, liveEffect, c08840Wi3);
        LIZ2.LJIJJ(String.valueOf(i), "is_connection_default");
        InterfaceC65784Pro<String> interfaceC65784Pro = BU9.LJ;
        if (interfaceC65784Pro != null && (invoke = interfaceC65784Pro.invoke()) != null) {
            str2 = invoke;
        }
        LIZ2.LJIJJ(str2, "event_page");
        LIZ2.LJJIIZI();
    }

    @Override // X.C0WU
    public final void LIZLLL(String str, TreeMap<Integer, C75295Tgp> visibleItems, List<? extends LiveEffect> stickerList, DataChannel dataChannel) {
        String str2;
        String invoke;
        String str3;
        String resourceId;
        o.LJIIIZ(visibleItems, "visibleItems");
        o.LJIIIZ(stickerList, "stickerList");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<Map.Entry<Integer, C75295Tgp>> it = visibleItems.entrySet().iterator();
        while (true) {
            str2 = "";
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<Integer, C75295Tgp> next = it.next();
            arrayList.add(Integer.valueOf(next.getValue().LIZ + 1));
            if (o.LJ(str, "props") && next.getValue().LIZ == 0) {
                arrayList2.add(LiveGiftNewGifterBadgeSetting.DEFAULT);
                arrayList3.add(LiveGiftNewGifterBadgeSetting.DEFAULT);
            } else if (o.LJ(str, "props") && next.getValue().LIZ == stickerList.size() - 1 && C28952BXw.LIZ() && LinkMicMultiGuestV3BeautyControlGroupAppLogSetting.INSTANCE.getValue()) {
                arrayList2.add("expandButton");
                arrayList3.add("expandButton");
            } else {
                LiveEffect liveEffect = (LiveEffect) ORZ.LJLLLLLL(next.getValue().LIZ, stickerList);
                if (liveEffect == null || (str3 = Long.valueOf(liveEffect.effectId).toString()) == null) {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                arrayList2.add(str3);
                LiveEffect liveEffect2 = (LiveEffect) ORZ.LJLLLLLL(next.getValue().LIZ, stickerList);
                if (liveEffect2 != null && (resourceId = liveEffect2.getResourceId()) != null) {
                    str2 = resourceId;
                }
                arrayList3.add(str2);
            }
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_guest_connection_sticker_show");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(str, "tab");
        LIZ2.LJIJJ(arrayList.toString(), "sticker_position");
        LIZ2.LJIJJ(arrayList2.toString(), "sticker_id_set");
        LIZ2.LJIJJ(arrayList3.toString(), "resource_id_set");
        LIZ2.LJIJI(false);
        InterfaceC65784Pro<String> interfaceC65784Pro = BU9.LJ;
        if (interfaceC65784Pro != null && (invoke = interfaceC65784Pro.invoke()) != null) {
            str2 = invoke;
        }
        LIZ2.LJIJJ(str2, "event_page");
        LIZ2.LJJIIZI();
    }
}
