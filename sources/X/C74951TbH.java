package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3BeautyControlGroupAppLogSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestNaviAvatarSwitcherSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import kotlin.jvm.internal.o;

/* renamed from: X.TbH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74951TbH {
    public static long LIZIZ;
    public static int LIZLLL;
    public static final HashSet<String> LIZ = new HashSet<>();
    public static String LIZJ = "";

    public static final void LJI() {
        if (LIZJ.length() > 0) {
            long j = LIZIZ;
            if (j > 0 && LIZLLL == 2) {
                LJII(j, LIZJ);
            }
        }
        LIZJ = "";
    }

    public static final void LIZ(DataChannel dataChannel, boolean z) {
        LiveEffect liveEffect;
        LiveEffect liveEffect2;
        if (z) {
            return;
        }
        InterfaceC06390Mx LIZ2 = CN1.LIZ(IEffectService.class);
        o.LJIIIIZZ(LIZ2, "getService(T::class.java)");
        InterfaceC31991Nj multiGuestBeautyLogManager = ((IEffectService) LIZ2).getMultiGuestBeautyLogManager();
        if (multiGuestBeautyLogManager != null) {
            InterfaceC06390Mx LIZ3 = CN1.LIZ(IEffectService.class);
            o.LJIIIIZZ(LIZ3, "getService(T::class.java)");
            InterfaceC31981Ni composerManagerB = ((IEffectService) LIZ3).composerManagerB();
            o.LJIIIIZZ(composerManagerB, "service<IEffectService>().composerManagerB()");
            C42151l5.LJIIJJI = composerManagerB;
            C42151l5 c42151l5 = (C42151l5) multiGuestBeautyLogManager;
            c42151l5.LIZLLL(false);
            C42151l5.LJIIL = C77123UOp.LJJIIJZLJL();
            C42151l5.LJIIIZ(dataChannel, C42151l5.LIZIZ);
            C42151l5.LJI();
            java.util.Map<Long, C0W9> map = C42151l5.LJII;
            ((LinkedHashMap) map).clear();
            map.putAll(C42151l5.LIZLLL);
            c42151l5.LJ();
        }
        if (C28952BXw.LIZ() || LinkMicMultiGuestV3BeautyControlGroupAppLogSetting.INSTANCE.getValue()) {
            InterfaceC06390Mx LIZ4 = CN1.LIZ(IEffectService.class);
            o.LJIIIIZZ(LIZ4, "getService(T::class.java)");
            C0WU liveMultiGuestStickerLogManager = ((IEffectService) LIZ4).getLiveMultiGuestStickerLogManager();
            if (liveMultiGuestStickerLogManager != null) {
                List<LiveEffect> LIZ5 = C74957TbN.LIZ().LIZ(C0TY.LIZJ);
                if (LIZ5 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (LiveEffect liveEffect3 : LIZ5) {
                        if (liveEffect3.effectId != 0) {
                            arrayList.add(liveEffect3);
                        }
                    }
                    liveEffect = (LiveEffect) ORZ.LJLLLLLL(0, arrayList);
                } else {
                    liveEffect = null;
                }
                liveMultiGuestStickerLogManager.LIZJ();
                MultiGuestNaviAvatarSwitcherSetting multiGuestNaviAvatarSwitcherSetting = MultiGuestNaviAvatarSwitcherSetting.INSTANCE;
                if (multiGuestNaviAvatarSwitcherSetting.isEnable()) {
                    liveEffect2 = C74740TUy.LIZLLL().LJFF;
                } else {
                    liveEffect2 = liveEffect;
                }
                liveMultiGuestStickerLogManager.LIZIZ(liveEffect2);
                if (multiGuestNaviAvatarSwitcherSetting.isEnable()) {
                    liveEffect = C74740TUy.LIZLLL().LJFF;
                }
                liveMultiGuestStickerLogManager.LJIIIZ(liveEffect, dataChannel);
            }
        }
    }

    public static final void LIZIZ(String str, String str2) {
        if (LIZJ.length() == 0) {
            LIZJ = str2;
            return;
        }
        LJII(LIZIZ, LIZJ);
        LIZJ = str2;
        LIZIZ = System.currentTimeMillis();
    }

    public static final void LJFF(int i, boolean z) {
        LIZLLL = i;
        if (i == 1 && z) {
            LJII(LIZIZ, LIZJ);
        } else {
            if (i != 2) {
                return;
            }
            LIZIZ = System.currentTimeMillis();
        }
    }

    public static void LJII(long j, String str) {
        String str2;
        if (str.length() > 0) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_guest_connection_beauty_panel_use_time");
            LIZ2.LJIJJ(str, "tab");
            InterfaceC65784Pro<String> interfaceC65784Pro = BU9.LJ;
            if (interfaceC65784Pro == null || (str2 = interfaceC65784Pro.invoke()) == null) {
                str2 = "";
            }
            LIZ2.LJIJJ(str2, "event_page");
            LIZ2.LJIJI(false);
            LIZ2.LJIJJ(String.valueOf((System.currentTimeMillis() - j) / 1000), "use_time");
            LIZ2.LJJIIZI();
        }
    }

    public static final void LJIIIIZZ(LiveEffect liveEffect, DataChannel dataChannel) {
        InterfaceC06390Mx LIZ2 = CN1.LIZ(IEffectService.class);
        o.LJIIIIZZ(LIZ2, "getService(T::class.java)");
        C0WU liveMultiGuestStickerLogManager = ((IEffectService) LIZ2).getLiveMultiGuestStickerLogManager();
        if (liveMultiGuestStickerLogManager != null) {
            liveMultiGuestStickerLogManager.LIZ(liveEffect, dataChannel, 0, false);
        }
    }

    public static final void LIZLLL(DataChannel dataChannel, String source, boolean z) {
        LiveEffect liveEffect;
        LiveEffect liveEffect2;
        LiveEffect liveEffect3;
        RtcUserInfo LLLLLJIL;
        o.LJIIIZ(source, "source");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onGuestLeaveToUploadBeauty, source: ");
        LIZ2.append(source);
        C0NB.LJIIIZ("MultiGuestBeautyPropsLogUtil", X1D.LIZIZ(LIZ2));
        if (z) {
            InterfaceC06390Mx LIZ3 = CN1.LIZ(IEffectService.class);
            o.LJIIIIZZ(LIZ3, "getService(T::class.java)");
            InterfaceC31991Nj multiGuestBeautyLogManager = ((IEffectService) LIZ3).getMultiGuestBeautyLogManager();
            if (multiGuestBeautyLogManager != null) {
                C42151l5.LJIIJJI = C74957TbN.LIZ();
                C42151l5 c42151l5 = (C42151l5) multiGuestBeautyLogManager;
                c42151l5.LIZLLL(true);
                C42151l5.LJIIL = C77123UOp.LJJIIJZLJL();
                C42151l5.LJIIIZ(dataChannel, C42151l5.LIZIZ);
                c42151l5.LJ();
                c42151l5.release();
            }
        }
        List<LiveEffect> LIZ4 = C74957TbN.LIZ().LIZ(C0TY.LIZJ);
        String str = null;
        if (LIZ4 != null) {
            ArrayList arrayList = new ArrayList();
            for (LiveEffect liveEffect4 : LIZ4) {
                if (liveEffect4.effectId != 0) {
                    arrayList.add(liveEffect4);
                }
            }
            liveEffect = (LiveEffect) ORZ.LJLLLLLL(0, arrayList);
        } else {
            liveEffect = null;
        }
        if ((C28952BXw.LIZ() || LinkMicMultiGuestV3BeautyControlGroupAppLogSetting.INSTANCE.getValue()) && z) {
            InterfaceC06390Mx LIZ5 = CN1.LIZ(IEffectService.class);
            o.LJIIIIZZ(LIZ5, "getService(T::class.java)");
            C0WU liveMultiGuestStickerLogManager = ((IEffectService) LIZ5).getLiveMultiGuestStickerLogManager();
            if (liveMultiGuestStickerLogManager != null) {
                liveMultiGuestStickerLogManager.LIZJ();
                MultiGuestNaviAvatarSwitcherSetting multiGuestNaviAvatarSwitcherSetting = MultiGuestNaviAvatarSwitcherSetting.INSTANCE;
                if (multiGuestNaviAvatarSwitcherSetting.isEnable()) {
                    liveEffect2 = C74740TUy.LIZLLL().LJFF;
                } else {
                    liveEffect2 = liveEffect;
                }
                liveMultiGuestStickerLogManager.LIZIZ(liveEffect2);
                if (multiGuestNaviAvatarSwitcherSetting.isEnable()) {
                    liveEffect3 = C74740TUy.LIZLLL().LJFF;
                } else {
                    liveEffect3 = liveEffect;
                }
                liveMultiGuestStickerLogManager.LJIIIZ(liveEffect3, dataChannel);
                liveMultiGuestStickerLogManager.release();
            }
        }
        HashSet<String> hashSet = LIZ;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LLLLLJIL = R6.LLLLLJIL()) != null) {
            str = LLLLLJIL.getLinkMicId();
        }
        hashSet.add(str);
        ((IEffectService) CN1.LIZ(IEffectService.class)).getUploadEffectRelatedLog();
        C32101Nu.LJIILJJIL(liveEffect, true);
    }

    public static final void LJIIIZ(TreeMap treeMap, List list, DataChannel dataChannel) {
        if (treeMap != null && list != null) {
            InterfaceC06390Mx LIZ2 = CN1.LIZ(IEffectService.class);
            o.LJIIIIZZ(LIZ2, "getService(T::class.java)");
            C0WU liveMultiGuestStickerLogManager = ((IEffectService) LIZ2).getLiveMultiGuestStickerLogManager();
            if (liveMultiGuestStickerLogManager != null) {
                liveMultiGuestStickerLogManager.LIZLLL("props", treeMap, list, dataChannel);
            }
        }
    }

    public static final void LIZJ(DataChannel dataChannel, boolean z, boolean z2, Object obj) {
        List<LiveEffect> LIZ2;
        InterfaceC06390Mx LIZ3 = CN1.LIZ(IEffectService.class);
        o.LJIIIIZZ(LIZ3, "getService(T::class.java)");
        InterfaceC31991Nj multiGuestBeautyLogManager = ((IEffectService) LIZ3).getMultiGuestBeautyLogManager();
        if (multiGuestBeautyLogManager != null) {
            C42151l5 c42151l5 = (C42151l5) multiGuestBeautyLogManager;
            c42151l5.LIZLLL(false);
            C42151l5.LJIIL = C77123UOp.LJJIIJZLJL();
            if (!LinkMicMultiGuestV3BeautyControlGroupAppLogSetting.INSTANCE.getValue()) {
                c42151l5.LJFF(dataChannel, true);
            }
            if (z && z2) {
                C42151l5.LJIIJJI(dataChannel, C42151l5.LIZLLL, 0);
                c42151l5.LJIIIIZZ(dataChannel);
            }
            C42151l5.LJIIJ(dataChannel);
            c42151l5.LJ();
        }
        LJI();
        if (z) {
            if (LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
                BU9.LIZ("connection_status");
            } else {
                BU9.LJ = C74952TbI.LJLIL;
            }
        }
        if ((C28952BXw.LIZ() || LinkMicMultiGuestV3BeautyControlGroupAppLogSetting.INSTANCE.getValue()) && (obj instanceof C0WF) && z && z2) {
            InterfaceC06390Mx LIZ4 = CN1.LIZ(IEffectService.class);
            o.LJIIIIZZ(LIZ4, "getService(T::class.java)");
            C0WU liveMultiGuestStickerLogManager = ((IEffectService) LIZ4).getLiveMultiGuestStickerLogManager();
            if (liveMultiGuestStickerLogManager != null && (LIZ2 = ((C0WF) obj).LIZ(C0TY.LIZJ)) != null) {
                ArrayList arrayList = new ArrayList();
                for (LiveEffect liveEffect : LIZ2) {
                    if (liveEffect.effectId != 0) {
                        arrayList.add(liveEffect);
                    }
                }
                LiveEffect liveEffect2 = (LiveEffect) ORZ.LJLLLLLL(0, arrayList);
                if (liveEffect2 != null) {
                    liveMultiGuestStickerLogManager.LJII();
                    liveMultiGuestStickerLogManager.LIZ(liveEffect2, dataChannel, 1, true);
                    liveMultiGuestStickerLogManager.LJ(liveEffect2, dataChannel, 1);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x016a, code lost:
    
        if (r13 != false) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(com.bytedance.ies.sdk.datachannel.DataChannel r11, boolean r12, boolean r13, boolean r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74951TbH.LJ(com.bytedance.ies.sdk.datachannel.DataChannel, boolean, boolean, boolean, java.lang.Object):void");
    }
}
