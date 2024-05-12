package X;

import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.livesdk.dataChannel.MultiGuestSelectedStickerEvent;
import com.bytedance.android.livesdk.dataChannel.StickerCancelChannel;
import com.bytedance.android.livesdk.dataChannel.StickerSelectedEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.HandlerThreadOptSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1No, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32041No implements C0WV {
    public static C08870Wl LIZJ;
    public static C08870Wl LIZLLL;
    public static C08870Wl LJ;
    public static C08870Wl LJFF;
    public static C08870Wl LJI;
    public static C08870Wl LJII;
    public static boolean LJIIIIZZ;
    public static boolean LJIIJ;
    public static boolean LJIIJJI;
    public static LiveEffect LJIILIIL;
    public static long LJIILJJIL;
    public static boolean LJIILL;
    public static boolean LJIILLIIL;
    public static boolean LJIIZILJ;
    public static boolean LJIJ;
    public static final C32041No LIZ = new C32041No();
    public static String LIZIZ = "normal_icon";
    public static final C5H3 LJIIIZ = C78996UzQ.LJJIJIIJI(C50421yQ.LJLIL);
    public static Handler LJIIL = LIZJ();

    public static final void LJIIJ() {
        LJFF = null;
        LJI = null;
        C32101Nu.LIZ(5L);
    }

    static {
        C50391yN c50391yN = C50391yN.LJLIL;
        o.LJIIIZ(c50391yN, "<set-?>");
        C31014CFe.LJIJI = c50391yN;
        LJIJ = true;
    }

    public static Handler LIZJ() {
        if (HandlerThreadOptSetting.INSTANCE.enable()) {
            return new Handler(C39202Fa2.LIZ.LIZ());
        }
        return new Handler(C16880lQ.LLJJJJ());
    }

    public static final void LIZLLL() {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        C08870Wl c08870Wl = LIZLLL;
        if (c08870Wl != null) {
            str = Long.valueOf(c08870Wl.LIZ).toString();
        } else {
            str = null;
        }
        BU2.LIZIZ = str;
        C08870Wl c08870Wl2 = LIZLLL;
        if (c08870Wl2 != null) {
            str2 = c08870Wl2.LIZJ;
        } else {
            str2 = null;
        }
        BU2.LIZ = str2;
        C08870Wl c08870Wl3 = LIZLLL;
        if (c08870Wl3 != null) {
            str3 = c08870Wl3.LIZIZ;
        } else {
            str3 = null;
        }
        BU2.LIZJ = str3;
        C08870Wl c08870Wl4 = LIZLLL;
        if (c08870Wl4 != null) {
            i = c08870Wl4.LJIJJ;
        } else {
            i = 0;
        }
        BU2.LJ = i;
        C08870Wl c08870Wl5 = LIZLLL;
        if (c08870Wl5 != null && c08870Wl5.LJIJJ == 1) {
            str4 = c08870Wl5.LJIJJLI;
        } else {
            str4 = null;
        }
        BU2.LIZLLL = str4;
        LIZJ = LIZLLL;
        if (C29306Beo.LJJI()) {
            LJ = LIZLLL;
        }
        LIZLLL = null;
        LJIIJ = false;
        LJIIJJI = false;
    }

    public static Handler LJ() {
        if (C77413UZt.LJIJJLI(LJIIL)) {
            return LJIIL;
        }
        Handler LIZJ2 = LIZJ();
        LJIIL = LIZJ2;
        return LIZJ2;
    }

    public static RunnableC08860Wk LJFF() {
        return (RunnableC08860Wk) LJIIIZ.getValue();
    }

    public static final void LJIL() {
        C32101Nu.LIZ(5L);
        C32101Nu.LJII(LJI, false);
        C32101Nu.LJII(LJFF, true);
        C32101Nu.LJIIL(5L);
    }

    public static void LIZ(BZI bzi) {
        bzi.LJIJJ(Integer.valueOf(LJIILLIIL ? 1 : 0), "is_new_anchor_guide");
    }

    public static void LJI(BZI bzi) {
        if (((IInteractService) CN1.LIZ(IInteractService.class)).Qe0()) {
            bzi.LJIJJ(Long.valueOf(((IInteractService) CN1.LIZ(IInteractService.class)).eq()), "pk_id");
        }
        if (((IInteractService) CN1.LIZ(IInteractService.class)).OB()) {
            bzi.LJIJJ(Long.valueOf(((IInteractService) CN1.LIZ(IInteractService.class)).LJJLI()), "channel_id");
        }
    }

    public static final void LJIIIIZZ(boolean z) {
        C08870Wl c08870Wl;
        C08870Wl c08870Wl2 = null;
        if (z) {
            LIZLLL = null;
            return;
        }
        if (C29306Beo.LJIILL() && (c08870Wl = LJ) != null) {
            LIZLLL = new C08870Wl(c08870Wl.LIZ, c08870Wl.LIZIZ, c08870Wl.LIZJ, c08870Wl.LIZLLL, c08870Wl.LJ, c08870Wl.LJFF, c08870Wl.LJI, c08870Wl.LJII, c08870Wl.LJIIIIZZ, c08870Wl.LJIIIZ, c08870Wl.LJIIJ, c08870Wl.LJIIJJI, c08870Wl.LJIIL, c08870Wl.LJIILIIL, true, 0L, c08870Wl.LJIILLIIL, c08870Wl.LJIIZILJ, c08870Wl.LJIJ, c08870Wl.LJIJI, c08870Wl.LJIJJ, c08870Wl.LJIJJLI, c08870Wl.LJIL, c08870Wl.LJJ, 32768);
            LJ = null;
            return;
        }
        List<LiveEffect> LIZ2 = C12890ez.LIZ().LIZ(C0TY.LIZIZ);
        o.LJIIIIZZ(LIZ2, "LiveComposerManagerProvi…cker(EffectPanel.STICKER)");
        LiveEffect liveEffect = (LiveEffect) ORZ.LJLLLLLL(0, LIZ2);
        if (liveEffect != null) {
            c08870Wl2 = LJIJJLI(liveEffect);
        }
        LIZLLL = c08870Wl2;
    }

    public static final void LJIIIZ(boolean z) {
        LJ().removeCallbacks(LJFF());
        if (!z) {
            LJ = null;
        }
        LIZLLL = null;
        LIZJ = null;
        LJIIIIZZ = false;
        RunnableC08860Wk LJFF2 = LJFF();
        LJFF2.LJLIL = null;
        LJFF2.LJLILLLLZI = null;
    }

    public static void LJIILLIIL(DataChannel dataChannel) {
        Boolean bool;
        if (C29306Beo.LJJI() || o.LJ(LIZJ, LIZLLL)) {
            return;
        }
        LJ().removeCallbacks(LJFF());
        RunnableC08860Wk LJFF2 = LJFF();
        C08870Wl c08870Wl = LIZLLL;
        if (c08870Wl != null) {
            bool = Boolean.valueOf(c08870Wl.LJIILLIIL);
        } else {
            bool = null;
        }
        C29306Beo.LJJIFFI(bool);
        boolean z = LJIILLIIL;
        LJFF2.LJLIL = dataChannel;
        LJFF2.LJLILLLLZI = c08870Wl;
        LJFF2.LJLJI = z;
        LJ().postDelayed(LJFF(), 30000L);
    }

    public static void LJIIZILJ(DataChannel dataChannel) {
        Boolean bool;
        String str;
        C08870Wl c08870Wl;
        C08870Wl c08870Wl2 = LIZLLL;
        if (c08870Wl2 == null || o.LJ(LIZJ, c08870Wl2)) {
            return;
        }
        Boolean bool2 = null;
        if (C29306Beo.LJIILL() && (c08870Wl = LIZLLL) != null && o.LJ(c08870Wl.LJFF, "")) {
            c08870Wl.LJFF = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene();
        }
        BZI LIZ2 = C28787BRn.LIZ("live_take_sticker_select");
        LIZ2.LJIILLIIL(dataChannel);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        LIZ2.LJIJJ(dataChannelGlobal.mv0(C55012Dx.class), "enter_from");
        LIZ2.LJIJJ(dataChannelGlobal.mv0(C2E4.class), "banner_id");
        LIZ2.LJIJJ(dataChannelGlobal.mv0(C2E5.class), "banner_from");
        LIZ(LIZ2);
        LIZ2.LJIIL("click");
        LJIJJ(LIZ2, LIZLLL);
        C08870Wl c08870Wl3 = LIZLLL;
        if (c08870Wl3 != null) {
            bool = Boolean.valueOf(c08870Wl3.LIZLLL);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(str, "is_video_sticker");
        C08870Wl c08870Wl4 = LIZLLL;
        if (c08870Wl4 != null) {
            bool2 = Boolean.valueOf(c08870Wl4.LJIILLIIL);
        }
        V10.LJ(bool2, LIZ2, "is_same_effect_scene");
        LIZIZ(LIZ2, LIZLLL);
        LJI(LIZ2);
        LIZ2.LJJIIZI();
        if (C29306Beo.LJIILL() && C29306Beo.LJIILLIIL(Boolean.valueOf(LJIIJJI))) {
            C32101Nu.LIZ(1L);
            C32101Nu.LJIIIIZZ(LIZLLL, false);
            C32101Nu.LJIIL(1L);
        }
    }

    public static final void LJIJ(DataChannel dataChannel) {
        String str;
        BZI LIZ2 = C28787BRn.LIZ("pm_live_sticker_use");
        LIZ2.LJIILLIIL(dataChannel);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        LIZ2.LJIJJ(dataChannelGlobal.mv0(C55012Dx.class), "enter_from");
        LIZ2.LJIJJ(dataChannelGlobal.mv0(C2E4.class), "banner_id");
        LIZ2.LJIJJ(dataChannelGlobal.mv0(C2E5.class), "banner_from");
        LIZ(LIZ2);
        if (LJIIIIZZ) {
            str = "use";
        } else {
            str = "unused";
        }
        LIZ2.LJIJJ(str, "use_status");
        LIZ2.LJJIIJZLJL();
    }

    public static final void LJIJI(DataChannel dataChannel) {
        C08870Wl c08870Wl;
        Boolean bool;
        long j;
        if (C29306Beo.LJJI() || (c08870Wl = LIZJ) == null || o.LJ(c08870Wl, LIZLLL)) {
            return;
        }
        long LIZ2 = C30725C4b.LIZ();
        BZI LIZ3 = C28787BRn.LIZ("live_sticker_use_time");
        LIZ3.LJIILLIIL(dataChannel);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        LIZ3.LJIJJ(dataChannelGlobal.mv0(C55012Dx.class), "enter_from");
        LIZ3.LJIJJ(dataChannelGlobal.mv0(C2E4.class), "banner_id");
        LIZ3.LJIJJ(dataChannelGlobal.mv0(C2E5.class), "banner_from");
        LIZ3.LJIIIZ("live_take");
        LIZ3.LJIIL("click");
        LIZ(LIZ3);
        LJIJJ(LIZ3, LIZJ);
        C08870Wl c08870Wl2 = LIZJ;
        if (c08870Wl2 != null) {
            bool = Boolean.valueOf(c08870Wl2.LJIILLIIL);
        } else {
            bool = null;
        }
        V10.LJ(bool, LIZ3, "is_same_effect_scene");
        C08870Wl c08870Wl3 = LIZJ;
        if (c08870Wl3 != null) {
            j = c08870Wl3.LJIILL;
        } else {
            j = LIZ2;
        }
        LIZ3.LJIJJ(Long.valueOf((LIZ2 - j) / 1000), "use_time");
        LIZIZ(LIZ3, LIZJ);
        LJI(LIZ3);
        LIZ3.LJJIIZI();
        if (C29306Beo.LJIILLIIL(Boolean.valueOf(LJIIJJI))) {
            C32101Nu.LIZ(1L);
            C32101Nu.LJIIIIZZ(LIZJ, true);
            C32101Nu.LJIIL(1L);
        }
    }

    public static C08870Wl LJIJJLI(LiveEffect liveEffect) {
        Integer num;
        String valueOf;
        boolean LIZLLL2;
        Integer num2;
        boolean z;
        long j;
        int i;
        String str;
        String str2;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        String str3 = (String) dataChannelGlobal.mv0(C2BX.class);
        if (!C77412UZs.LJJ(liveEffect)) {
            C40641ie c40641ie = C40641ie.LJLIL;
            String resourceId = liveEffect.getResourceId();
            c40641ie.getClass();
            LIZLLL2 = C40641ie.LIZLLL(resourceId);
            str3 = null;
            valueOf = null;
        } else {
            Integer num3 = liveEffect.impressionPos;
            if (num3 != null) {
                num = C77339UWx.LIZIZ(num3, 1);
            } else {
                num = null;
            }
            valueOf = String.valueOf(num);
            C40641ie c40641ie2 = C40641ie.LJLIL;
            String str4 = liveEffect.parentResId;
            c40641ie2.getClass();
            LIZLLL2 = C40641ie.LIZLLL(str4);
        }
        long j2 = liveEffect.effectId;
        String str5 = liveEffect.parentEffectId;
        if (C78880UxY.LJJJZ(liveEffect)) {
            C20000qS c20000qS = C18420nu.LIZ;
            if (c20000qS != null && ((str2 = c20000qS.LIZ) != null || (str2 = c20000qS.LIZIZ) != null)) {
                j2 = CastLongProtector.parseLong(str2);
            } else {
                j2 = -1;
            }
            str5 = String.valueOf(liveEffect.effectId);
            valueOf = String.valueOf(C18420nu.LIZJ + 1);
            str3 = String.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(C18420nu.LJFF)) ? 1 : 0);
        }
        String resourceId2 = liveEffect.getResourceId();
        String name = liveEffect.getName();
        boolean z2 = liveEffect.isVideoUsedSticker;
        String str6 = liveEffect.effectPanelKey;
        String broadcastScene = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene();
        C30496By0 c30496By0 = liveEffect.logParams;
        boolean z3 = c30496By0.LIZ;
        boolean z4 = c30496By0.LIZIZ;
        String str7 = LIZIZ;
        String str8 = liveEffect.parentResName;
        String str9 = liveEffect.parentResId;
        boolean z5 = false;
        long j3 = 0;
        Integer num4 = liveEffect.parentImpressionPos;
        if (num4 != null) {
            num2 = C77339UWx.LIZIZ(num4, 1);
        } else {
            num2 = null;
        }
        String valueOf2 = String.valueOf(num2);
        Effect effect = liveEffect.getEffect();
        if (effect != null) {
            if (C0TZ.LIZ(effect.getExtra(), "is_avatar", false) || C0TZ.LIZ(effect.getSdkExtra(), "is_avatar", false)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (liveEffect.isGreenScreen) {
            j = 1;
        } else {
            j = 0;
        }
        Effect effect2 = liveEffect.getEffect();
        if (effect2 != null && effect2.getSource() == 1) {
            i = 1;
        } else {
            i = 0;
        }
        Effect effect3 = liveEffect.getEffect();
        if (effect3 != null) {
            str = effect3.getDesignerId();
        } else {
            str = null;
        }
        C30496By0 c30496By02 = liveEffect.logParams;
        C08870Wl c08870Wl = new C08870Wl(j2, resourceId2, name, z2, str6, broadcastScene, z3, z4, str7, str5, str8, str9, str3, valueOf, z5, j3, LIZLLL2, valueOf2, z, j, i, str, c30496By02.LIZJ, c30496By02.LIZLLL, 49152);
        ((C32537Cpp) dataChannelGlobal.gv0(C2BX.class)).LIZ = CardStruct.IStatusCode.DEFAULT;
        return c08870Wl;
    }

    public static void LIZIZ(BZI bzi, C08870Wl c08870Wl) {
        Boolean bool;
        Boolean bool2;
        Long l;
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        String str5 = null;
        if (c08870Wl != null) {
            bool = Boolean.valueOf(c08870Wl.LJIJ);
        } else {
            bool = null;
        }
        bzi.LJIJJ(String.valueOf(C29306Beo.LJJIFFI(bool) ? 1 : 0), "is_avatar");
        if (c08870Wl != null) {
            bool2 = Boolean.valueOf(c08870Wl.LJIJ);
        } else {
            bool2 = null;
        }
        if (C29306Beo.LJIILLIIL(bool2)) {
            return;
        }
        if (c08870Wl != null) {
            l = Long.valueOf(c08870Wl.LIZ);
        } else {
            l = null;
        }
        bzi.LJIJJ(l, "sticker_id");
        bzi.LJIJJ("", "resource_id");
        bzi.LJIJJ("", "sticker_name");
        if (c08870Wl != null) {
            str = c08870Wl.LIZJ;
        } else {
            str = null;
        }
        bzi.LJIJJ(str, "group_sticker_name");
        if (c08870Wl != null) {
            str2 = c08870Wl.LIZIZ;
        } else {
            str2 = null;
        }
        bzi.LJIJJ(str2, "group_resource_id");
        if (c08870Wl != null) {
            str3 = c08870Wl.LJIIL;
        } else {
            str3 = null;
        }
        bzi.LJIJJ(str3, "is_sub_sticker_default");
        if (c08870Wl != null) {
            str5 = c08870Wl.LJIILIIL;
        }
        bzi.LJIJJ(str5, "sub_impr_position");
        boolean z = true;
        if (c08870Wl != null && (str4 = c08870Wl.LJIILIIL) != null) {
            i = CastIntegerProtector.parseInt(str4);
        } else {
            i = 1;
        }
        if (i > C18420nu.LIZLLL) {
            z = false;
        }
        bzi.LJIJJ(String.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "is_avatar_user_create");
        bzi.LJIJJ(Integer.valueOf(C18420nu.LIZLLL), "user_avatar_count");
        bzi.LJIJJ(Integer.valueOf(C18420nu.LJ), "template_avatar_count");
    }

    public static void LJIIL(DataChannel dataChannel, String str) {
        BZI LIZ2 = C28787BRn.LIZ("live_sticker_request_button_click");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(str, "button_type");
        LJIJJ(LIZ2, LIZJ);
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIILL(LiveEffect liveEffect, DataChannel dataChannel) {
        if (liveEffect == null) {
            return;
        }
        C40641ie c40641ie = C40641ie.LJLIL;
        String resourceId = liveEffect.getResourceId();
        c40641ie.getClass();
        boolean LIZLLL2 = C40641ie.LIZLLL(resourceId);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_rec_sticker_show");
        LIZ2.LJIJJ(Long.valueOf(liveEffect.effectId), "rec_sticker_id");
        LIZ2.LJIJJ(liveEffect.getResourceId(), "rec_resource_id");
        LIZ2.LJIJJ(liveEffect.getName(), "rec_sticker_name");
        LIZ2.LJJI(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(LIZLLL2)) ? 1 : 0), "is_same_effect_scene", C50411yP.LJLIL);
        LIZ2.LJIJJ(liveEffect.effectPanelKey, "tab");
        LIZ2.LJIJJ(((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene(), "select_scene");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIJJ(BZI bzi, C08870Wl c08870Wl) {
        Boolean bool;
        Boolean bool2;
        String str;
        Boolean bool3;
        Long l;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Boolean bool4;
        String str9;
        Boolean bool5;
        String str10;
        String str11;
        String str12;
        Integer num;
        Boolean bool6;
        String str13;
        Boolean bool7 = null;
        if (c08870Wl != null) {
            bool = Boolean.valueOf(c08870Wl.LJIL);
        } else {
            bool = null;
        }
        if (C29306Beo.LJIILLIIL(bool)) {
            if (c08870Wl != null) {
                str13 = c08870Wl.LJ;
            } else {
                str13 = null;
            }
            bzi.LJIJJ(str13, "tab");
        }
        if (c08870Wl != null) {
            bool2 = Boolean.valueOf(c08870Wl.LJI);
        } else {
            bool2 = null;
        }
        if (C29306Beo.LJJIFFI(bool2)) {
            str = "animation";
        } else {
            str = "normal";
        }
        bzi.LJIJJ(str, "method");
        if (c08870Wl != null) {
            bool3 = Boolean.valueOf(c08870Wl.LJII);
        } else {
            bool3 = null;
        }
        V10.LJ(bool3, bzi, "is_rec");
        if (c08870Wl != null) {
            l = Long.valueOf(c08870Wl.LIZ);
        } else {
            l = null;
        }
        bzi.LJIJJ(l, "sticker_id");
        if (c08870Wl != null) {
            str2 = c08870Wl.LIZIZ;
        } else {
            str2 = null;
        }
        bzi.LJIJJ(str2, "resource_id");
        if (c08870Wl != null) {
            str3 = c08870Wl.LIZJ;
        } else {
            str3 = null;
        }
        bzi.LJIJJ(str3, "sticker_name");
        if (c08870Wl != null) {
            str4 = c08870Wl.LJIIIZ;
        } else {
            str4 = null;
        }
        bzi.LJIJJ(str4, "group_sticker_id");
        if (c08870Wl != null) {
            str5 = c08870Wl.LJIIJ;
        } else {
            str5 = null;
        }
        bzi.LJIJJ(str5, "group_sticker_name");
        if (c08870Wl != null) {
            str6 = c08870Wl.LJIIJJI;
        } else {
            str6 = null;
        }
        bzi.LJIJJ(str6, "group_resource_id");
        if (c08870Wl != null) {
            str7 = c08870Wl.LJIIL;
        } else {
            str7 = null;
        }
        bzi.LJIJJ(str7, "is_sub_sticker_default");
        if (c08870Wl != null) {
            str8 = c08870Wl.LJIILIIL;
        } else {
            str8 = null;
        }
        bzi.LJIJJ(str8, "sub_impr_position");
        if (c08870Wl != null) {
            bool4 = Boolean.valueOf(c08870Wl.LIZLLL);
        } else {
            bool4 = null;
        }
        if (C29306Beo.LJJIFFI(bool4)) {
            str9 = "1";
        } else {
            str9 = CardStruct.IStatusCode.DEFAULT;
        }
        bzi.LJIJJ(str9, "is_video_sticker");
        if (c08870Wl != null) {
            bool5 = Boolean.valueOf(c08870Wl.LJIILJJIL);
        } else {
            bool5 = null;
        }
        V10.LJ(bool5, bzi, "is_live_take_default");
        if (c08870Wl != null) {
            str10 = c08870Wl.LJIIIIZZ;
        } else {
            str10 = null;
        }
        bzi.LJIJJ(str10, "effect_icon_type");
        if (c08870Wl != null) {
            str11 = c08870Wl.LJFF;
        } else {
            str11 = null;
        }
        bzi.LJIJJ(str11, "select_scene");
        if (c08870Wl != null) {
            str12 = c08870Wl.LJIIZILJ;
        } else {
            str12 = null;
        }
        bzi.LJIJJ(str12, "impr_position");
        if (c08870Wl != null) {
            num = Integer.valueOf(c08870Wl.LJIJJ);
        } else {
            num = null;
        }
        bzi.LJIJJ(num, "source");
        if (c08870Wl != null) {
            bool6 = Boolean.valueOf(c08870Wl.LJIL);
        } else {
            bool6 = null;
        }
        V10.LJ(bool6, bzi, "is_shortcut_panel");
        if (c08870Wl != null) {
            bool7 = Boolean.valueOf(c08870Wl.LJJ);
        }
        V10.LJ(bool7, bzi, "is_rec_pin");
    }

    public final void LJII(Fragment fragment, DataChannel dataChannel) {
        if (dataChannel != null) {
            dataChannel.lv0(fragment, StickerSelectedEvent.class, new IDqS416S0100000(dataChannel, 178));
            dataChannel.lv0(fragment, StickerCancelChannel.class, new IDqS416S0100000(dataChannel, 179));
            dataChannel.lv0(fragment, MultiGuestSelectedStickerEvent.class, new C50431yR(dataChannel));
            dataChannel.ov0(fragment, InteractStateChangeEvent.class, C50441yS.LJLIL);
        }
    }

    public static void LJIILJJIL(int i, long j, String str) {
        C70657RoD.LJJI(0.01d, new C50451yT(i, j, str));
    }

    public static void LJIIJJI(DataChannel dataChannel, String str, TreeMap visibleItems, List stickerList, boolean z) {
        long j;
        String str2;
        o.LJIIIZ(visibleItems, "visibleItems");
        o.LJIIIZ(stickerList, "stickerList");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry : visibleItems.entrySet()) {
            if (!z || ((C75295Tgp) entry.getValue()).LIZ != 0) {
                arrayList.add(Integer.valueOf(((C75295Tgp) entry.getValue()).LIZ + 1));
                LiveEffect liveEffect = (LiveEffect) ORZ.LJLLLLLL(((C75295Tgp) entry.getValue()).LIZ, stickerList);
                if (liveEffect != null) {
                    j = liveEffect.effectId;
                } else {
                    j = 0;
                }
                arrayList2.add(Long.valueOf(j));
                LiveEffect liveEffect2 = (LiveEffect) ORZ.LJLLLLLL(((C75295Tgp) entry.getValue()).LIZ, stickerList);
                if (liveEffect2 == null || (str2 = liveEffect2.getResourceId()) == null) {
                    str2 = "";
                }
                arrayList3.add(str2);
            }
        }
        C70657RoD.LJJI(0.01d, new C50401yO(dataChannel, arrayList, arrayList2, arrayList3, z, str));
    }

    public static void LJIILIIL(long j, DataChannel dataChannel, String closeMethod, boolean z, boolean z2) {
        o.LJIIIZ(closeMethod, "closeMethod");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_sticker_panel_duration");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(Long.valueOf(j), "use_time");
        LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "is_shortcut_panel");
        LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z2)) ? 1 : 0), "is_live_take_default");
        LIZ(LIZ2);
        LIZ2.LJIJJ(closeMethod, "close_method");
        LIZ2.LJJIIJZLJL();
    }
}
