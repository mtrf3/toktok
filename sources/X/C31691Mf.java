package X;

import Y.IDfS292S0100000;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.LiveGetGoalInfoApi;
import com.bytedance.android.live.effect.SoloBgEffectSelectChannel;
import com.bytedance.android.live.effect.StickerSelectChannel;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.LiveGoalHighLightEvent;
import com.bytedance.android.live.effect.model.LastPosition;
import com.bytedance.android.live.effect.model.LiveGoalInfo;
import com.bytedance.android.live.effect.model.VideoSize;
import com.bytedance.android.livesdk.livesetting.performance.LiveGoal2GreenScreenSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.m;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.1Mf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31691Mf implements InterfaceC08090Tl {
    public static final C31691Mf LIZ = new C31691Mf();
    public static List<? extends LiveEffect> LIZIZ;
    public static DataChannel LIZJ;
    public static boolean LIZLLL;
    public static m LJ;
    public static C31824CeK LJFF;
    public static final C42681lw LJI;
    public static final List<Boolean> LJII;
    public static C08870Wl LJIIIIZZ;
    public static final C31671Md LJIIIZ;
    public static final C42081ky LJIIJ;

    /* JADX WARN: Type inference failed for: r0v10, types: [X.1ky] */
    static {
        new LastPosition(10000, 10000);
        new LastPosition(10000, 10000);
        LJI = C12890ez.LIZ();
        Boolean bool = Boolean.FALSE;
        LJII = C47261Igj.LJJIJIL(bool, bool, bool);
        LJIIIZ = new C31671Md();
        LJIIJ = new InterfaceC88472Yns<InterfaceC72996Skq, C76800UCe>() { // from class: X.1ky
            @Override // X.InterfaceC88472Yns
            public final C76800UCe invoke(InterfaceC72996Skq interfaceC72996Skq) {
                InterfaceC72996Skq cb = interfaceC72996Skq;
                o.LJIIIZ(cb, "cb");
                cb.LIZLLL(C49491wv.LJLIL);
                cb.LIZJ(C49501ww.LJLIL);
                return C76800UCe.LIZ;
            }
        };
    }

    public static final boolean LIZIZ() {
        return OUP.LJIIJ(LIZIZ);
    }

    public static final boolean LIZLLL() {
        if (!LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
            return false;
        }
        Integer LIZJ2 = InterfaceC30442Bx8.i2.LIZJ();
        if (LIZJ2 != null && LIZJ2.intValue() == 0) {
            return false;
        }
        m LIZJ3 = InterfaceC30442Bx8.g2.LIZJ();
        o.LJIIIIZZ(LIZJ3, "LIVE_GOAL_INFO.value");
        if (LIZJ3.LJJIJ("max_line") == null) {
            return false;
        }
        return true;
    }

    public static String LJII() {
        String LJJIIJZLJL;
        C31824CeK c31824CeK = LJFF;
        if (c31824CeK == null || (LJJIIJZLJL = C78983UzD.LJJIIJZLJL(c31824CeK)) == null || !C1B6.LIZIZ(LJJIIJZLJL)) {
            return null;
        }
        return LJJIIJZLJL;
    }

    public static boolean LJIIIIZZ() {
        ArrayList arrayList = new ArrayList();
        List<LiveEffect> LIZ2 = LJI.LIZ("livegame");
        o.LJIIIIZZ(LIZ2, "composerManager.getCurre…(EffectPanel.EFFECT_GAME)");
        arrayList.addAll(LIZ2);
        if (arrayList.size() > 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIZ() {
        ArrayList arrayList = new ArrayList();
        List<LiveEffect> LIZ2 = LJI.LIZ("livebackground");
        o.LJIIIIZZ(LIZ2, "composerManager.getCurre…el.LIVE_BACKGROUND_PANEL)");
        arrayList.addAll(LIZ2);
        if (arrayList.size() > 0) {
            return true;
        }
        return false;
    }

    public static final void LJIILJJIL() {
        InterfaceC30442Bx8.g2.LIZ(new m());
        InterfaceC30442Bx8.i2.LIZ(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LiveGoalInfo LJIIZILJ() {
        try {
            Object LIZJ2 = C09650Zl.LIZIZ.LIZJ(InterfaceC30442Bx8.g2.LIZJ(), LiveGoalInfo.class);
            o.LJIIIIZZ(LIZJ2, "{\n            GsonHelper…fo::class.java)\n        }");
            return (LiveGoalInfo) LIZJ2;
        } catch (Throwable unused) {
            int i = 0;
            return new LiveGoalInfo("", null, 0 == true ? 1 : 0, "", "", 0.0f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, new LastPosition(10000, 10000), i, i, i, i, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 129024, 0 == true ? 1 : 0);
        }
    }

    public static final void LJJI() {
        if (LJ != null) {
            InterfaceC30442Bx8.g2.LIZ(LJ);
            LJ = null;
        }
    }

    public final void LJIIL() {
        if (LJIIIIZZ != null) {
            C32101Nu.LJIILIIL(LJIIIIZZ, true);
        }
        LJIIIIZZ = null;
        LJI.LIZLLL("livebackground");
        LJIILLIIL(true);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.android.livesdkapi.depend.model.LiveEffect, O] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.bytedance.android.livesdkapi.depend.model.LiveEffect, O] */
    public final void LJIILIIL() {
        DataChannel dataChannel;
        ?? LJJIJIL = C79081V1x.LJJIJIL(LIZJ);
        if (LJJIJIL != 0) {
            DataChannel dataChannel2 = LIZJ;
            if (dataChannel2 != null) {
                ((C32537Cpp) dataChannel2.gv0(C54522Ca.class)).LIZ = LJJIJIL;
            }
        } else {
            ?? LJJIJIIJIL = C79081V1x.LJJIJIIJIL(LIZJ);
            if (LJJIJIIJIL != 0 && (dataChannel = LIZJ) != null) {
                ((C32537Cpp) dataChannel.gv0(C54522Ca.class)).LIZ = LJJIJIIJIL;
            }
        }
        if (C79081V1x.LJJI()) {
            LJIIL();
        }
    }

    public static final void LJJ() {
        m mVar;
        LiveGoalInfo LJIIZILJ = LJIIZILJ();
        Integer LIZJ2 = InterfaceC30442Bx8.i2.LIZJ();
        o.LJIIIIZZ(LIZJ2, "LIVE_GOAL_EFFECT_POSITION.value");
        LJIIZILJ.effectPosition = LIZJ2.intValue();
        C48459J0d<m> c48459J0d = InterfaceC30442Bx8.g2;
        String LJIILLIIL = OUP.LJIILLIIL(LJIIZILJ);
        if (LJIILLIIL != null) {
            mVar = OUP.LJJJLL(LJIILLIIL);
        } else {
            mVar = null;
        }
        c48459J0d.LIZ(mVar);
    }

    public final void LJIIJJI() {
        LJIIL();
        LJIILJJIL();
    }

    public final void LJIILL() {
        LiveEffect liveEffect;
        C0PQ c0pq;
        C0PQ c0pq2;
        LJIIL();
        InterfaceC30442Bx8.i2.LIZ(Integer.valueOf(LJIIZILJ().effectPosition));
        DataChannel dataChannel = LIZJ;
        if (dataChannel == null || (liveEffect = (LiveEffect) dataChannel.kv0(C54522Ca.class)) == null) {
            return;
        }
        if (liveEffect.isSoloBackground) {
            DataChannel dataChannel2 = LIZJ;
            C12890ez.LIZ().LIZIZ(liveEffect, "livebackground");
            if (dataChannel2 != null) {
                dataChannel2.rv0(SoloBgEffectSelectChannel.class, liveEffect);
            }
            WeakReference<C0PQ> weakReference = C11020by.LIZ;
            if (weakReference != null && (c0pq2 = weakReference.get()) != null) {
                c0pq2.LIZ(null, liveEffect);
            }
            InterfaceC30594Bza interfaceC30594Bza = C07510Rf.LIZLLL;
            if (interfaceC30594Bza != null) {
                interfaceC30594Bza.LJ(liveEffect);
            }
            InterfaceC30594Bza interfaceC30594Bza2 = C07510Rf.LIZLLL;
            if (interfaceC30594Bza2 != null) {
                interfaceC30594Bza2.LJI(liveEffect);
            }
        } else if (liveEffect.isLiveGoal) {
            if (LJIIZILJ().effectPosition == 0) {
                LJIIL();
            } else {
                LIZ(liveEffect);
                LJIILLIIL(false);
            }
        } else {
            DataChannel dataChannel3 = LIZJ;
            C12890ez.LIZ().LIZIZ(liveEffect, C0TY.LIZIZ);
            if (dataChannel3 != null) {
                dataChannel3.rv0(StickerSelectChannel.class, liveEffect);
            }
            WeakReference<C0PQ> weakReference2 = C11020by.LIZ;
            if (weakReference2 != null && (c0pq = weakReference2.get()) != null) {
                c0pq.LIZ(null, liveEffect);
            }
        }
        DataChannel dataChannel4 = LIZJ;
        if (dataChannel4 != null) {
            ((C32537Cpp) dataChannel4.gv0(C54522Ca.class)).LIZ = null;
        }
    }

    public static final void LIZ(LiveEffect liveEffect) {
        Integer num;
        boolean z;
        int i;
        if (liveEffect != null) {
            LJI.LIZIZ(liveEffect, "livebackground");
            long j = liveEffect.effectId;
            String resourceId = liveEffect.getResourceId();
            String name = liveEffect.getName();
            boolean z2 = liveEffect.isVideoUsedSticker;
            String str = liveEffect.effectPanelKey;
            String broadcastScene = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene();
            C30496By0 c30496By0 = liveEffect.logParams;
            boolean z3 = c30496By0.LIZ;
            boolean z4 = c30496By0.LIZIZ;
            String str2 = liveEffect.parentEffectId;
            String str3 = liveEffect.parentResName;
            String str4 = liveEffect.parentResId;
            String str5 = (String) DataChannelGlobal.LJLJJI.mv0(C2BX.class);
            String valueOf = String.valueOf(C18420nu.LIZJ + 1);
            boolean z5 = liveEffect.isFromOtherUser;
            Integer num2 = liveEffect.parentImpressionPos;
            String str6 = null;
            if (num2 != null) {
                num = C77339UWx.LIZIZ(num2, 1);
            } else {
                num = null;
            }
            String valueOf2 = String.valueOf(num);
            Effect effect = liveEffect.getEffect();
            if (effect != null && (C0TZ.LIZ(effect.getExtra(), "is_avatar", false) || C0TZ.LIZ(effect.getSdkExtra(), "is_avatar", false))) {
                z = true;
            } else {
                z = false;
            }
            long LIZ2 = C30725C4b.LIZ();
            Effect effect2 = liveEffect.getEffect();
            if (effect2 != null && effect2.getSource() == 1) {
                i = 1;
            } else {
                i = 0;
            }
            Effect effect3 = liveEffect.getEffect();
            if (effect3 != null) {
                str6 = effect3.getDesignerId();
            }
            C30496By0 c30496By02 = liveEffect.logParams;
            LJIIIIZZ = new C08870Wl(j, resourceId, name, z2, str, broadcastScene, z3, z4, "normal_icon", str2, str3, str4, str5, valueOf, false, LIZ2, z5, valueOf2, z, 0L, i, str6, c30496By02.LIZJ, c30496By02.LIZLLL, 540672);
            C32101Nu.LJIILIIL(LJIIIIZZ, false);
        }
    }

    public static LiveEffect LJFF(String str) {
        List<? extends LiveEffect> list = LIZIZ;
        LiveEffect liveEffect = null;
        if (list == null) {
            return null;
        }
        Iterator<? extends LiveEffect> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            LiveEffect next = it.next();
            if (o.LJ(next.getResourceId(), str)) {
                liveEffect = next;
                break;
            }
        }
        return liveEffect;
    }

    public static void LJI(InterfaceC88472Yns interfaceC88472Yns) {
        String LIZJ2 = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZJ(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        if (LIZJ2 == null) {
            return;
        }
        C1EW.LIZ(((LiveGetGoalInfoApi) Q7L.LIZIZ(LiveGetGoalInfoApi.class)).getGoalInfo(LIZJ2, 0L, 1, 1)).LJJJLIIL(new IDfS292S0100000(interfaceC88472Yns, 20), new InterfaceC64592gB() { // from class: X.1Me
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }

    public static final void LJIIJ(String highLight) {
        o.LJIIIZ(highLight, "highLight");
        m LJJJLL = OUP.LJJJLL(highLight);
        if (LJJJLL == null) {
            return;
        }
        if (LJJJLL.LJJIJLIJ("highlight")) {
            m LJJIJIL = LJJJLL.LJJIJIL("highlight");
            if (LJJIJIL.LJJIJLIJ("highlight_line")) {
                DataChannel dataChannel = LIZJ;
                if (dataChannel != null) {
                    dataChannel.qv0(LiveGoalHighLightEvent.class, Integer.valueOf(LJJIJIL.LJJIJ("highlight_line").LJIILJJIL()));
                    return;
                }
                return;
            }
            DataChannel dataChannel2 = LIZJ;
            if (dataChannel2 == null) {
                return;
            }
            dataChannel2.qv0(LiveGoalHighLightEvent.class, -1);
            return;
        }
        DataChannel dataChannel3 = LIZJ;
        if (dataChannel3 == null) {
            return;
        }
        dataChannel3.qv0(LiveGoalHighLightEvent.class, -1);
    }

    public static final void LJIILLIIL(boolean z) {
        String LJIILLIIL;
        if (z || (LJIILLIIL = OUP.LJIILLIIL(LJIIZILJ())) == null) {
            LJIILLIIL = "";
        }
        LJI.setRenderCacheString("LiveGoal", LJIILLIIL);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setRenderCacheString: ");
        LIZ2.append(LJIILLIIL);
        C0NB.LIZIZ("LiveGoalEffect", X1D.LIZIZ(LIZ2));
    }

    public static final void LJIJI(List<? extends LiveEffect> list) {
        LiveEffect.LiveGoalExtra liveGoalExtra;
        LiveEffect.LiveGoalExtra liveGoalExtra2;
        LiveEffect.LiveGoalExtra liveGoalExtra3;
        ArrayList LJ2 = AnonymousClass391.LJ(list, "effectList");
        if (list.size() >= 4) {
            LJ2.addAll(list.subList(0, 4));
        }
        Iterator<? extends LiveEffect> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            LiveEffect next = it.next();
            if (next.isNone()) {
                if (next != null) {
                    ListProtector.add(LJ2, 0, next);
                }
            }
        }
        Iterator<? extends LiveEffect> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            LiveEffect next2 = it2.next();
            LiveEffect liveEffect = next2;
            o.LJIIIZ(liveEffect, "<this>");
            LiveEffect.StickerSDKExtra stickerSDKExtra = liveEffect.sdkExtraModel;
            if (stickerSDKExtra != null && (liveGoalExtra3 = stickerSDKExtra.liveGoalExtra) != null && liveGoalExtra3.isFullScreen()) {
                if (next2 != null) {
                    ListProtector.add(LJ2, 1, next2);
                }
            }
        }
        Iterator<? extends LiveEffect> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            LiveEffect next3 = it3.next();
            LiveEffect liveEffect2 = next3;
            o.LJIIIZ(liveEffect2, "<this>");
            LiveEffect.StickerSDKExtra stickerSDKExtra2 = liveEffect2.sdkExtraModel;
            if (stickerSDKExtra2 != null && (liveGoalExtra2 = stickerSDKExtra2.liveGoalExtra) != null && liveGoalExtra2.isHorizontal()) {
                if (next3 != null) {
                    ListProtector.add(LJ2, 2, next3);
                }
            }
        }
        Iterator<? extends LiveEffect> it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            LiveEffect next4 = it4.next();
            LiveEffect liveEffect3 = next4;
            o.LJIIIZ(liveEffect3, "<this>");
            LiveEffect.StickerSDKExtra stickerSDKExtra3 = liveEffect3.sdkExtraModel;
            if (stickerSDKExtra3 != null && (liveGoalExtra = stickerSDKExtra3.liveGoalExtra) != null && liveGoalExtra.isVertical()) {
                if (next4 != null) {
                    ListProtector.add(LJ2, 3, next4);
                }
            }
        }
        LIZIZ = LJ2;
    }

    public static final void LJIJJLI(String lastPosition) {
        LastPosition lastPosition2;
        o.LJIIIZ(lastPosition, "lastPosition");
        m LJJJLL = OUP.LJJJLL(lastPosition);
        if (LJJJLL == null || !LJJJLL.LJJIJLIJ("last_position") || (lastPosition2 = (LastPosition) OUP.LJJIIZI(LJJJLL.LJJIJ("last_position"), LastPosition.class)) == null) {
            return;
        }
        m mVar = LJ;
        m mVar2 = null;
        if (mVar != null) {
            LiveGoalInfo liveGoalInfo = (LiveGoalInfo) OUP.LJJIIZI(mVar, LiveGoalInfo.class);
            if (liveGoalInfo == null) {
                return;
            }
            liveGoalInfo.lastPosition = lastPosition2;
            String LJIILLIIL = OUP.LJIILLIIL(liveGoalInfo);
            if (LJIILLIIL != null) {
                mVar2 = OUP.LJJJLL(LJIILLIIL);
            }
            LJ = mVar2;
            return;
        }
        LiveGoalInfo LJIIZILJ = LJIIZILJ();
        LJIIZILJ.lastPosition = lastPosition2;
        C48459J0d<m> c48459J0d = InterfaceC30442Bx8.g2;
        String LJIILLIIL2 = OUP.LJIILLIIL(LJIIZILJ);
        if (LJIILLIIL2 != null) {
            mVar2 = OUP.LJJJLL(LJIILLIIL2);
        }
        c48459J0d.LIZ(mVar2);
    }

    public final void LJIJJ(String str) {
        m mVar;
        if (LIZLLL() && LIZIZ() && C1B6.LIZIZ(str)) {
            LiveGoalInfo LJIIZILJ = LJIIZILJ();
            LJIIZILJ.iconPath = str;
            C48459J0d<m> c48459J0d = InterfaceC30442Bx8.g2;
            String LJIILLIIL = OUP.LJIILLIIL(LJIIZILJ);
            if (LJIILLIIL != null) {
                mVar = OUP.LJJJLL(LJIILLIIL);
            } else {
                mVar = null;
            }
            c48459J0d.LIZ(mVar);
            LJIILLIIL(false);
        }
    }

    public static boolean LIZJ(int i, boolean z) {
        if (z) {
            return true;
        }
        if (C29306Beo.LJJI()) {
            ListProtector.set(LJII, i, Boolean.TRUE);
            return true;
        }
        if (!((Boolean) ListProtector.get(LJII, i)).booleanValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x020e, code lost:
    
        if (r5.intValue() != r1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(com.bytedance.android.livesdk.gift.model.LiveStreamGoal r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31691Mf.LJIL(com.bytedance.android.livesdk.gift.model.LiveStreamGoal, boolean):void");
    }

    public static void LJ(String str, String str2, InterfaceC88472Yns cb) {
        o.LJIIIZ(cb, "cb");
        if (str == null || str2 == null) {
            return;
        }
        List LJLJJL = s.LJLJJL(str, new String[]{"."}, 0, 6);
        StringBuilder LIZ2 = X1D.LIZ();
        C31824CeK c31824CeK = new C31824CeK(str2, EnumC31874Cf8.LIVE_GOAL, null, null, JBR.LJFF(LIZ2, ORZ.LLD(LJLJJL.subList(0, LJLJJL.size() - 1), ".", null, null, null, 62), ".png", LIZ2), null, false, 3, false, 748);
        C79258V8s.LIZ.LIZIZ(c31824CeK, cb);
        LJFF = c31824CeK;
    }

    public final void LJIJ(boolean z, boolean z2, Integer num, Integer num2) {
        VideoSize videoSize;
        int i;
        int i2;
        LiveCore liveCore;
        LiveCore.Builder builder;
        LiveCore liveCore2;
        LiveCore.Builder builder2;
        m mVar;
        if (C29306Beo.LJJI()) {
            videoSize = C31661Mc.LIZ();
            if (videoSize == null) {
                return;
            }
        } else {
            InterfaceC12690ef videoSizeManager = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getVideoSizeManager();
            if (z2 && num != null && num2 != null) {
                int intValue = num.intValue();
                int intValue2 = num2.intValue();
                videoSizeManager.getClass();
                if (intValue < 0 && z) {
                    ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalAreaHelper().getClass();
                    intValue = C31661Mc.LIZLLL;
                }
                C30471Bxb.LIZLLL = intValue;
                if (intValue2 < 0 && z) {
                    ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalAreaHelper().getClass();
                    intValue2 = C31661Mc.LJ - C15380j0.LJIILIIL();
                }
                C30471Bxb.LJ = intValue2;
                float f = C30471Bxb.LIZLLL / intValue2;
                InterfaceC21020s6 interfaceC21020s6 = C30471Bxb.LJIIIZ;
                if (interfaceC21020s6 != null && (liveCore2 = interfaceC21020s6.getLiveCore()) != null && (builder2 = liveCore2.getBuilder()) != null) {
                    i = builder2.getCaptureAdaptedWidth();
                } else {
                    i = 720;
                }
                InterfaceC21020s6 interfaceC21020s62 = C30471Bxb.LJIIIZ;
                if (interfaceC21020s62 != null && (liveCore = interfaceC21020s62.getLiveCore()) != null && (builder = liveCore.getBuilder()) != null) {
                    i2 = builder.getCaptureAdaptedHeight();
                } else {
                    i2 = 1280;
                }
                float f2 = i / i2;
                if (f > f2) {
                    int i3 = C30471Bxb.LIZLLL;
                    C30471Bxb.LIZIZ = i3;
                    C30471Bxb.LIZJ = (int) (i3 / f2);
                } else {
                    int i4 = C30471Bxb.LJ;
                    C30471Bxb.LIZJ = i4;
                    C30471Bxb.LIZIZ = (int) (i4 * f2);
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("surfaceWidth:");
                C15890jp.LIZIZ(LIZ2, C30471Bxb.LIZLLL, ",videoWidth:", i, ",realWidth:");
                LIZ2.append(C30471Bxb.LIZIZ);
                LIZ2.append(",surfaceHeight:");
                C15890jp.LIZIZ(LIZ2, C30471Bxb.LJ, ",videoHeight:", i2, ",realHeight:");
                C1DD.LJFF(LIZ2, C30471Bxb.LIZJ, LIZ2, "LiveGoalEffect");
            } else {
                C30471Bxb.LIZ();
            }
            videoSizeManager.getClass();
            videoSize = new VideoSize(C30471Bxb.LIZIZ, C30471Bxb.LIZLLL, C30471Bxb.LIZJ, C30471Bxb.LJ, z);
        }
        C31661Mc.LIZIZ = videoSize;
        LiveGoalInfo LJIIZILJ = LJIIZILJ();
        int i5 = !z ? 1 : 0;
        LJIIZILJ.dragMode = i5;
        C31701Mg.LIZIZ.dragMode = i5;
        LJIIZILJ.canvas = C31661Mc.LIZIZ();
        LJIIZILJ.safeArea = C31661Mc.LJ();
        LJIIZILJ.initPosition = C31661Mc.LIZLLL();
        C48459J0d<m> c48459J0d = InterfaceC30442Bx8.g2;
        String LJIILLIIL = OUP.LJIILLIIL(LJIIZILJ);
        if (LJIILLIIL != null) {
            mVar = OUP.LJJJLL(LJIILLIIL);
        } else {
            mVar = null;
        }
        c48459J0d.LIZ(mVar);
        LJIILLIIL(false);
    }
}
