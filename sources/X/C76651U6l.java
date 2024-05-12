package X;

import Y.AfS65S0100000_13;
import Y.IDhS106S0100000_13;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRtcChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcLiveVideoParam;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRtcEnterRoomExitRoomOptConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControl;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.U6l, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76651U6l implements U8M {
    public final U66 LIZ;
    public final InterfaceC65784Pro<U66> LIZIZ;
    public final InterfaceC75011TcF LIZJ;
    public final Collection<U62> LIZLLL;
    public C73514StC LJ;

    public final U66 LJIIJJI() {
        U66 u66 = this.LIZ;
        if (u66 == null) {
            return this.LIZIZ.invoke();
        }
        return u66;
    }

    public final void LJJJJJ() {
        C73514StC c73514StC = this.LJ;
        if (c73514StC == null || c73514StC.isDisposed()) {
            U4R.LIZLLL("LiveLinkLayoutProvider", "startTurnOffEngineCountDown begin");
            MultiGuestRtcEnterRoomExitRoomOptConfigSetting multiGuestRtcEnterRoomExitRoomOptConfigSetting = MultiGuestRtcEnterRoomExitRoomOptConfigSetting.INSTANCE;
            long timeoutStopThresholdOneInSeconds = multiGuestRtcEnterRoomExitRoomOptConfigSetting.timeoutStopThresholdOneInSeconds();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            AbstractC73946T0k LIZIZ = C73969T1h.LIZIZ();
            C73320Sq4.LIZ(timeUnit, "unit is null");
            C73320Sq4.LIZ(LIZIZ, "scheduler is null");
            C73447Ss7 c73447Ss7 = new C73447Ss7(timeoutStopThresholdOneInSeconds, timeUnit, LIZIZ);
            C76766UAw c76766UAw = C76766UAw.LIZJ;
            C73451SsB LJII = c73447Ss7.LJII(C73969T1h.LIZ(c76766UAw.LIZIZ()));
            C76800UCe c76800UCe = C76800UCe.LIZ;
            C73320Sq4.LIZ(c76800UCe, "completionValue is null");
            C73531StT c73531StT = new C73531StT(new C73461SsL(LJII, null, c76800UCe), new IDhS106S0100000_13(this, 15));
            long timeoutStopThresholdTwoInSeconds = multiGuestRtcEnterRoomExitRoomOptConfigSetting.timeoutStopThresholdTwoInSeconds();
            this.LJ = (C73514StC) new C73596SuW(new C73524StM(new C73527StP(Math.max(0L, timeoutStopThresholdTwoInSeconds), c73531StT, C73969T1h.LIZIZ(), timeUnit).LJIIL(C73969T1h.LIZ(c76766UAw.LIZIZ())), new AfS65S0100000_13(this, 197)).LJIIIIZZ(C76654U6o.LJLIL).LJII(C76657U6r.LIZ), C73674Svm.LJI).LJIILL();
        }
    }

    public final void LJJJJJL() {
        C76683U7r k;
        U7U LLLLZLL;
        C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476788483, "bpea-auto_turn_off_rtc_engine");
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (LLLLZLL = LJIIJJI.LLLLZLL()) != null) {
            LLLLZLL.LJIIJJI(LJJIIJ, "auto_finish");
        }
        U66 LJIIJJI2 = LJIIJJI();
        if (LJIIJJI2 != null && (k = LJIIJJI2.k()) != null) {
            k.LIZIZ(1);
        }
    }

    @Override // X.U8M
    public final java.util.Map<String, OnLineMicInfo> LIZ() {
        InterfaceC76652U6m c;
        java.util.Map<String, OnLineMicInfo> LIZ;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI == null || (c = LJIIJJI.c()) == null || (LIZ = c.LIZ()) == null) {
            return C113554cx.LJJJLIIL();
        }
        return LIZ;
    }

    @Override // X.U8M
    public final java.util.Map<String, OnLineMicInfo> LIZLLL() {
        InterfaceC76652U6m c;
        java.util.Map<String, OnLineMicInfo> LIZLLL;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI == null || (c = LJIIJJI.c()) == null || (LIZLLL = c.LIZLLL()) == null) {
            return C113554cx.LJJJLIIL();
        }
        return LIZLLL;
    }

    @Override // X.U8M
    public final List<LinkUser> LJFF() {
        InterfaceC75973Trl LLZZ;
        List<LinkUser> LJFF;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI == null || (LLZZ = LJIIJJI.LLZZ()) == null || (LJFF = LLZZ.LJFF()) == null) {
            return C61878OQg.INSTANCE;
        }
        return LJFF;
    }

    @Override // X.U8M
    public final int LJIIIIZZ() {
        InterfaceC76652U6m c;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (c = LJIIJJI.c()) != null) {
            return c.LJIIIIZZ();
        }
        return 0;
    }

    @Override // X.U8M
    public final boolean LJIIIZ() {
        InterfaceC76652U6m c;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (c = LJIIJJI.c()) != null) {
            return c.LJIIIZ();
        }
        return false;
    }

    @Override // X.U8M
    public final DataChannel LJIIL() {
        N39 LLZZZZ;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (LLZZZZ = LJIIJJI.LLZZZZ()) != null) {
            return LLZZZZ.LIZLLL;
        }
        return null;
    }

    @Override // X.U8M
    public final java.util.Map<String, OnLineMicInfo> LJIILJJIL() {
        InterfaceC76652U6m c;
        java.util.Map<String, OnLineMicInfo> LJIILJJIL;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI == null || (c = LJIIJJI.c()) == null || (LJIILJJIL = c.LJIILJJIL()) == null) {
            return C113554cx.LJJJLIIL();
        }
        return LJIILJJIL;
    }

    @Override // X.U8M
    public final int LJIJ() {
        InterfaceC76652U6m c;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (c = LJIIJJI.c()) != null) {
            return c.LJIJ();
        }
        return 0;
    }

    @Override // X.U8M
    public final void LJJIFFI() {
        InterfaceC75973Trl LLZZ;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (LLZZ = LJIIJJI.LLZZ()) != null) {
            LLZZ.LJJIFFI();
        }
    }

    @Override // X.U8M
    public final String LJJIIJ() {
        InterfaceC75973Trl LLZZ;
        String LJJIIJ;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI == null || (LLZZ = LJIIJJI.LLZZ()) == null || (LJJIIJ = LLZZ.LJJIIJ()) == null) {
            return "";
        }
        return LJJIIJ;
    }

    @Override // X.U8M
    public final java.util.Map<String, OnLineMicInfo> LJJIIJZLJL() {
        InterfaceC76652U6m c;
        java.util.Map<String, OnLineMicInfo> LJJIIJZLJL;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI == null || (c = LJIIJJI.c()) == null || (LJJIIJZLJL = c.LJJIIJZLJL()) == null) {
            return C113554cx.LJJJLIIL();
        }
        return LJJIIJZLJL;
    }

    @Override // X.U8M
    public final List<LinkUser> LJJIIZI() {
        InterfaceC75973Trl LLZZ;
        List<LinkUser> LJJIIZI;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI == null || (LLZZ = LJIIJJI.LLZZ()) == null || (LJJIIZI = LLZZ.LJJIIZI()) == null) {
            return C61878OQg.INSTANCE;
        }
        return LJJIIZI;
    }

    @Override // X.U8M
    public final void LJJIJ() {
        U7U LLLLZLL;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (LLLLZLL = LJIIJJI.LLLLZLL()) != null) {
            LLLLZLL.LJJLIIIJLJLI();
        }
    }

    @Override // X.U8M
    public final ILayerControl.ILayer LJJIJIIJIL() {
        U7U LLLLZLL;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (LLLLZLL = LJIIJJI.LLLLZLL()) != null) {
            return LLLLZLL.LJIILJJIL();
        }
        return null;
    }

    @Override // X.U8M
    public final EnumC53637L3h LJJIJL() {
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI instanceof U7F) {
            return EnumC53637L3h.CO_LINK;
        }
        if (LJIIJJI instanceof U7T) {
            return EnumC53637L3h.LIVE_LINK;
        }
        return EnumC53637L3h.NONE;
    }

    @Override // X.U8M
    public final void LJJIL() {
        U7U LLLLZLL;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (LLLLZLL = LJIIJJI.LLLLZLL()) != null) {
            LLLLZLL.LJFF();
        }
    }

    @Override // X.U8M
    public final boolean LJJJ() {
        U7U LLLLZLL;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (LLLLZLL = LJIIJJI.LLLLZLL()) != null) {
            return LLLLZLL.LJJIIJZLJL();
        }
        return false;
    }

    @Override // X.U8M
    public final boolean LJJJJ() {
        U7U LLLLZLL;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (LLLLZLL = LJIIJJI.LLLLZLL()) != null) {
            return LLLLZLL.LJJIIZ();
        }
        return false;
    }

    @Override // X.U8M
    public final void LJJJJI() {
        U66 LJIIJJI;
        U7U LLLLZLL;
        U7U LLLLZLL2;
        U66 LJIIJJI2 = LJIIJJI();
        if ((LJIIJJI2 != null && (LLLLZLL2 = LJIIJJI2.LLLLZLL()) != null && LLLLZLL2.LIZJ) || ((LJIIJJI = LJIIJJI()) != null && (LLLLZLL = LJIIJJI.LLLLZLL()) != null && LLLLZLL.LIZ)) {
            LJJJJJ();
        }
    }

    @Override // X.U8M
    public final void removeAllWaterMarks() {
        U7U LLLLZLL;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (LLLLZLL = LJIIJJI.LLLLZLL()) != null) {
            LLLLZLL.LJJJJJ();
        }
    }

    @Override // X.U8M
    public final OnLineMicInfo LIZIZ(String linkMicId) {
        InterfaceC76652U6m c;
        o.LJIIIZ(linkMicId, "linkMicId");
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (c = LJIIJJI.c()) != null) {
            return c.LIZIZ(linkMicId);
        }
        return null;
    }

    @Override // X.U8M
    public final void LIZJ(java.util.Map<Integer, Integer> map) {
        InterfaceC76652U6m c;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (c = LJIIJJI.c()) != null) {
            c.LIZJ(map);
        }
    }

    @Override // X.U8M
    public final void LJ(InterfaceC75804Tp2 seiAppData) {
        InterfaceC76652U6m c;
        o.LJIIIZ(seiAppData, "seiAppData");
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (c = LJIIJJI.c()) != null) {
            c.LJ(seiAppData);
        }
    }

    @Override // X.U8M
    public final LinkUser LJI(String str) {
        InterfaceC75973Trl LLZZ;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (LLZZ = LJIIJJI.LLZZ()) != null) {
            return LLZZ.LJI(str);
        }
        return null;
    }

    @Override // X.U8M
    public final OnLineMicInfo LJII(String linkMicId) {
        InterfaceC76652U6m c;
        o.LJIIIZ(linkMicId, "linkMicId");
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (c = LJIIJJI.c()) != null) {
            return c.LJII(linkMicId);
        }
        return null;
    }

    @Override // X.U8M
    public final void LJIIJ(InterfaceC75804Tp2 seiAppData) {
        InterfaceC75973Trl LLZZ;
        o.LJIIIZ(seiAppData, "seiAppData");
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (LLZZ = LJIIJJI.LLZZ()) != null) {
            LLZZ.LJIIJ(seiAppData);
        }
    }

    @Override // X.U8M
    public final int LJIILIIL(int i) {
        InterfaceC76652U6m c;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (c = LJIIJJI.c()) != null) {
            return c.LJIILIIL(i);
        }
        return 0;
    }

    @Override // X.U8M
    public final boolean LJIILL(String layoutId) {
        o.LJIIIZ(layoutId, "layoutId");
        return this.LIZJ.LJIILL(layoutId);
    }

    @Override // X.U8M
    public final LinkUser LJIJI(long j) {
        InterfaceC75973Trl LLZZ;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (LLZZ = LJIIJJI.LLZZ()) != null) {
            return LLZZ.LJIJI(j);
        }
        return null;
    }

    @Override // X.U8M
    public final void LJIJJ(java.util.Map<String, String> map) {
        Iterator<U62> it = this.LIZLLL.iterator();
        while (it.hasNext()) {
            it.next().LJIJJ(map);
        }
    }

    @Override // X.U8M
    public final OnLineMicInfo LJIJJLI(String linkMicId) {
        InterfaceC76652U6m c;
        o.LJIIIZ(linkMicId, "linkMicId");
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (c = LJIIJJI.c()) != null) {
            return c.LJIJJLI(linkMicId);
        }
        return null;
    }

    @Override // X.U8M
    public final LinkUser LJIL(String linkMicId) {
        InterfaceC75973Trl LLZZ;
        o.LJIIIZ(linkMicId, "linkMicId");
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (LLZZ = LJIIJJI.LLZZ()) != null) {
            return LLZZ.LJIL(linkMicId);
        }
        return null;
    }

    @Override // X.U8M
    public final LinkUser LJJ(String linkMicId) {
        InterfaceC75973Trl LLZZ;
        o.LJIIIZ(linkMicId, "linkMicId");
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (LLZZ = LJIIJJI.LLZZ()) != null) {
            return LLZZ.LJJ(linkMicId);
        }
        return null;
    }

    @Override // X.U8M
    public final OnLineMicInfo LJJII(String linkMicId) {
        InterfaceC76652U6m c;
        o.LJIIIZ(linkMicId, "linkMicId");
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (c = LJIIJJI.c()) != null) {
            return c.LJJII(linkMicId);
        }
        return null;
    }

    @Override // X.U8M
    public final LinkUser LJJIII(long j) {
        InterfaceC75973Trl LLZZ;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (LLZZ = LJIIJJI.LLZZ()) != null) {
            return LLZZ.LJJIII(j);
        }
        return null;
    }

    @Override // X.U8M
    public final void LJJIIZ(String str) {
        U7U LLLLZLL;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (LLLLZLL = LJIIJJI.LLLLZLL()) != null) {
            LLLLZLL.LJIJJ(str);
        }
    }

    @Override // X.U8M
    public final boolean LJJIJIIJI(String str) {
        U7U LLLLZLL;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (LLLLZLL = LJIIJJI.LLLLZLL()) != null) {
            return LLLLZLL.LJIJJLI(str);
        }
        return false;
    }

    @Override // X.U8M
    public final void LJJIJIL(RtcLiveVideoParam rtcLiveVideoParam) {
        U7U LLLLZLL;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (LLLLZLL = LJIIJJI.LLLLZLL()) != null) {
            LLLLZLL.LJJLIIJ(rtcLiveVideoParam);
        }
    }

    @Override // X.U8M
    public final void LJJIJLIJ(LinkLayerRTCMessage linkLayerRTCMessage) {
        U66 LJIIJJI;
        U7U LLLLZLL;
        Iterator<U62> it = this.LIZLLL.iterator();
        while (it.hasNext()) {
            it.next().LJLJJI(linkLayerRTCMessage);
        }
        String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, linkLayerRTCMessage);
        if (json != null && (LJIIJJI = LJIIJJI()) != null && (LLLLZLL = LJIIJJI.LLLLZLL()) != null) {
            LLLLZLL.LJJJJZ(json);
        }
    }

    @Override // X.U8M
    public final void LJJJI(U8L u8l) {
        InterfaceC76652U6m c;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (c = LJIIJJI.c()) != null) {
            c.LJJIIZ(u8l);
        }
    }

    @Override // X.U8M
    public final void LLLLLLLLL(InterfaceC76768UAy<JoinRtcChannelResult> interfaceC76768UAy) {
        C73514StC c73514StC;
        if (LiveAbLabelSetting.INSTANCE.getBooleanValue("is_enable_linkmic_enter_and_leave_room_opt") && (c73514StC = this.LJ) != null) {
            c73514StC.dispose();
        }
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null) {
            LJIIJJI.LLLLLLLLL(interfaceC76768UAy);
        }
    }

    @Override // X.U8M
    public final ILayerControl.ILayer getLayer(String str) {
        U7U LLLLZLL;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (LLLLZLL = LJIIJJI.LLLLZLL()) != null) {
            return LLLLZLL.LJIILIIL(str);
        }
        return null;
    }

    @Override // X.U8M
    public final void LJIILLIIL(String str, boolean z) {
        U7U LLLLZLL;
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (LLLLZLL = LJIIJJI.LLLLZLL()) != null) {
            LLLLZLL.LJJLIIIJJI(str, z);
        }
        Iterator<U62> it = this.LIZLLL.iterator();
        while (it.hasNext()) {
            it.next().LJIILLIIL(str, z);
        }
    }

    @Override // X.U8M
    public final void LJJIZ(String waterMarkId, Client.RTCWaterMarkRegion rTCWaterMarkRegion) {
        U7U LLLLZLL;
        o.LJIIIZ(waterMarkId, "waterMarkId");
        U66 LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (LLLLZLL = LJIIJJI.LLLLZLL()) != null) {
            LLLLZLL.LIZIZ(waterMarkId, rTCWaterMarkRegion);
        }
    }

    @Override // X.U8M
    public final void LJJJIL(List<LinkUser> oldLinkedList, List<LinkUser> newLinkedList) {
        o.LJIIIZ(oldLinkedList, "oldLinkedList");
        o.LJIIIZ(newLinkedList, "newLinkedList");
        Iterator<U62> it = this.LIZLLL.iterator();
        while (it.hasNext()) {
            it.next().LJIIIIZZ(oldLinkedList, newLinkedList);
        }
    }

    @Override // X.U8M
    public final void LJJJJIZL(List<LinkUser> oldLinkedList, List<LinkUser> newLinkedList) {
        o.LJIIIZ(oldLinkedList, "oldLinkedList");
        o.LJIIIZ(newLinkedList, "newLinkedList");
        Iterator<U62> it = this.LIZLLL.iterator();
        while (it.hasNext()) {
            it.next().LJIIIZ(oldLinkedList, newLinkedList);
        }
    }

    @Override // X.U8M
    public final void LJIIZILJ(int i, String layoutId, UC6 uc6) {
        o.LJIIIZ(layoutId, "layoutId");
        this.LIZJ.LJIIZILJ(i, layoutId, uc6);
    }

    @Override // X.U8M
    public final void LJJI(int i, int i2, UC4 uc4) {
        this.LIZJ.LJJI(i, i2, uc4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C76651U6l(U66 u66, InterfaceC65784Pro<? extends U66> activeLinker, InterfaceC75011TcF dslManager, Collection<? extends U62> listeners) {
        o.LJIIIZ(activeLinker, "activeLinker");
        o.LJIIIZ(dslManager, "dslManager");
        o.LJIIIZ(listeners, "listeners");
        this.LIZ = u66;
        this.LIZIZ = activeLinker;
        this.LIZJ = dslManager;
        this.LIZLLL = listeners;
    }
}
