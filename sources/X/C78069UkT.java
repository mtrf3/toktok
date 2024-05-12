package X;

import Y.ARunnableS49S0100000_13;
import Y.AfS65S0100000_13;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.GameLinkLayoutLandDataChannel;
import com.bytedance.android.live.gift.GameStarCommentLayoutLandDataChannel;
import com.bytedance.android.live.gift.NormalGiftDisplayForVideoEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.event.BattleVictoryLapActivityEvent;
import com.bytedance.android.live.liveinteract.api.event.MatchGiftTrayDodgeEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftInfoInBox;
import com.bytedance.android.livesdk.model.GiftRandomEffectInfo;
import com.bytedance.android.livesdk.model.GiftsBoxInfo;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.UkT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78069UkT implements InterfaceC78108Ul6 {
    public int LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public ViewGroup LJFF;
    public C78071UkV LJI;
    public C78072UkW LJII;
    public C78078Ukc LJIIIIZZ;
    public DataChannel LJIIIZ;
    public int LJIIJJI;
    public boolean LJIIL;
    public C78072UkW LJIILL;
    public boolean LJIILLIIL;
    public EnumC78090Uko LIZLLL = EnumC78090Uko.IDLE;
    public final MutableLiveData<EnumC78090Uko> LJ = new MutableLiveData<>();
    public final C73318Sq2 LJIIJ = new C73318Sq2();
    public final long LJIILIIL = 200;
    public final long LJIILJJIL = 2000;
    public final ARunnableS49S0100000_13 LJIIZILJ = new ARunnableS49S0100000_13(this, 247);
    public final ARunnableS49S0100000_13 LJIJ = new ARunnableS49S0100000_13(this, 246);

    /* JADX WARN: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c3  */
    @Override // X.InterfaceC78108Ul6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78069UkT.LIZIZ():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:252:0x0093, code lost:
    
        if (r2 != null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0184, code lost:
    
        if (r2 == null) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ() {
        /*
            Method dump skipped, instructions count: 1112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78069UkT.LJ():boolean");
    }

    public final void LJI() {
        C0NB.LJIIIZ("GiftTray", "comboTray");
        C78072UkW c78072UkW = this.LJII;
        if (c78072UkW != null) {
            C32463Cod.LJIIIIZZ(c78072UkW, true);
            C78112UlA c78112UlA = new C78112UlA(c78072UkW, EnumC78098Ukw.COMBO);
            C78078Ukc c78078Ukc = this.LJIIIIZZ;
            if (c78078Ukc != null) {
                c78078Ukc.LJIIL(c78112UlA);
            }
            C73943T0h.LIZ().LIZIZ(new C78114UlC(c78112UlA, this.LJIIJJI));
            c78072UkW.LJJIZ.O("trayLastComboStart");
        }
    }

    public final void LJIIIZ() {
        C78072UkW c78072UkW = this.LJII;
        if (c78072UkW != null) {
            if (!this.LJIIL) {
                LJIILLIIL(EnumC78090Uko.JUMPING);
            }
            C78112UlA c78112UlA = new C78112UlA(c78072UkW, EnumC78098Ukw.ENTER);
            C78078Ukc c78078Ukc = this.LJIIIIZZ;
            if (c78078Ukc != null) {
                c78078Ukc.LJIIL(c78112UlA);
            }
            C73943T0h.LIZ().LIZIZ(new C78114UlC(c78112UlA, this.LJIIJJI));
            c78072UkW.LJJIZ.O("trayEnterStart");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0032, code lost:
    
        if (r3 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI() {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78069UkT.LJIIJJI():void");
    }

    public final void LJIILIIL() {
        WatchMemoryLeakOpt watchMemoryLeakOpt = WatchMemoryLeakOpt.INSTANCE;
        if (watchMemoryLeakOpt.settingValue()) {
            this.LJIIIZ = null;
        }
        C78078Ukc c78078Ukc = this.LJIIIIZZ;
        if (c78078Ukc != null) {
            if (watchMemoryLeakOpt.settingValue()) {
                Handler handler = c78078Ukc.getHandler();
                if (handler != null) {
                    handler.removeCallbacks(c78078Ukc.LLFFF);
                }
                c78078Ukc.LJZL = null;
                c78078Ukc.setDataChannel(null);
            }
            AnimatorSet currAnimator = c78078Ukc.getCurrAnimator();
            if (currAnimator != null) {
                currAnimator.cancel();
            }
            c78078Ukc.LLFF = true;
        }
        this.LJIIJ.LIZLLL();
    }

    public final void LJIILJJIL() {
        boolean z = this.LIZJ;
        if (z || this.LIZIZ) {
            C78983UzD.LJIJI(new C31101CIn(), "play_end_receive_twice", C113554cx.LJJLIIIIJ(new OSZ("trayDisplayOngoing", String.valueOf(z)), new OSZ("videoPlayOngoing", String.valueOf(this.LIZIZ))));
        }
        this.LJII = null;
        LJIILLIIL(EnumC78090Uko.IDLE);
        C78071UkV c78071UkV = this.LJI;
        if (c78071UkV != null) {
            c78071UkV.LIZ();
        }
    }

    public static boolean LJFF(C78072UkW c78072UkW) {
        Long l;
        boolean z;
        boolean z2;
        User owner;
        if (c78072UkW != null && UC0.LJJIJ(c78072UkW)) {
            return false;
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        Long l2 = null;
        if (room != null && (owner = room.getOwner()) != null) {
            l = Long.valueOf(owner.getId());
        } else {
            l = null;
        }
        if (c78072UkW != null) {
            l2 = Long.valueOf(c78072UkW.LIZLLL());
        }
        boolean LJ = o.LJ(l, l2);
        IInteractService iInteractService = C31120CJg.LIZ;
        if (iInteractService.VY() || iInteractService.Zs0()) {
            z = true;
        } else {
            z = false;
        }
        if (LJ && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = !LJ;
        if (iInteractService.Vc() && (z2 || z3)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC78108Ul6
    public final void LIZ(C78072UkW c78072UkW) {
        C77419UZz c77419UZz;
        C78072UkW LIZIZ;
        C77419UZz c77419UZz2;
        C0NB.LJIIIZ("GiftTray", "onComboEnd");
        C78072UkW c78072UkW2 = this.LJII;
        if (c78072UkW2 != null && (c77419UZz2 = c78072UkW2.LJJIZ) != null) {
            c77419UZz2.O("trayLastComboEnd");
        }
        if (c78072UkW != null && c78072UkW.LJIIIZ > 1 && (LJFF(c78072UkW) || UC0.LJJIJ(c78072UkW))) {
            LJIIL(c78072UkW);
        }
        C78072UkW c78072UkW3 = this.LJII;
        if (c78072UkW3 != null && c78072UkW3.LJIIIIZZ - c78072UkW3.LJIIIZ > 0) {
            if (LJ()) {
                return;
            }
            C78072UkW c78072UkW4 = this.LJII;
            if (c78072UkW4 != null) {
                c78072UkW4.LIZIZ();
            }
            C78066UkQ.LIZ.LIZ++;
            LJI();
            return;
        }
        C78071UkV c78071UkV = this.LJI;
        if (c78071UkV != null && (LIZIZ = c78071UkV.LIZIZ(new C78106Ul4(c78072UkW3))) != null) {
            C78072UkW c78072UkW5 = this.LJII;
            if (c78072UkW5 != null) {
                c78072UkW5.LJ(LIZIZ);
            }
            C78072UkW c78072UkW6 = this.LJII;
            if (c78072UkW6 != null) {
                c78072UkW6.LJIIIIZZ = LIZIZ.LJIIIIZZ;
                c78072UkW6.LIZ(LIZIZ.LJJIJLIJ);
            }
            if (LJ()) {
                return;
            }
            EnumC78063UkN enumC78063UkN = LIZIZ.LJII;
            if (enumC78063UkN != EnumC78063UkN.VIDEO_ONLY && enumC78063UkN != EnumC78063UkN.TRAY_ONLY) {
                C78066UkQ.LIZ.LIZ++;
            }
            C78072UkW c78072UkW7 = this.LJII;
            if (c78072UkW7 != null) {
                c78072UkW7.LIZIZ();
            }
            LJI();
            return;
        }
        LJIILLIIL(EnumC78090Uko.WAITING);
        C78072UkW c78072UkW8 = this.LJII;
        if (c78072UkW8 != null && (c77419UZz = c78072UkW8.LJJIZ) != null) {
            c77419UZz.O("trayLastEnterWaiting");
        }
        LJIIJ(c78072UkW);
    }

    @Override // X.InterfaceC78108Ul6
    public final void LIZJ(C78072UkW c78072UkW) {
        C0NB.LJIIIZ("GiftTray", "onFirstGiftEnd");
        LJIIJ(c78072UkW);
    }

    @Override // X.InterfaceC78108Ul6
    public final void LIZLLL(C78072UkW c78072UkW) {
        C0NB.LJIIIZ("GiftTray", "onEnterEnd");
        if (LJFF(c78072UkW)) {
            LJIIL(c78072UkW);
        } else {
            if (c78072UkW == null) {
                return;
            }
            if (c78072UkW.LJI == 3) {
                C78078Ukc c78078Ukc = this.LJIIIIZZ;
                if (c78078Ukc != null) {
                    c78078Ukc.postDelayed(this.LJIJ, this.LJIILIIL);
                }
            }
            c78072UkW.LJJIZ.O("trayShow");
            C32463Cod.LJIIIIZZ(c78072UkW, false);
        }
        if (c78072UkW == null) {
            return;
        }
        c78072UkW.LJJIZ.O("trayShow");
        C32463Cod.LJIIIIZZ(c78072UkW, false);
    }

    public final void LJII(C78072UkW c78072UkW) {
        GiftMessage giftMessage;
        ArrayList arrayList;
        GiftRandomEffectInfo giftRandomEffectInfo;
        List<Long> list;
        List<GiftColorInfo> list2;
        long j;
        Room room;
        c78072UkW.LJJIIZ = this.LJIIJJI;
        this.LJII = c78072UkW;
        c78072UkW.LJJIZ.O("trayMsgAssign");
        if (C78062UkM.LIZJ(this.LJII)) {
            LJIILLIIL(EnumC78090Uko.JUMPING);
            if (C78062UkM.LIZLLL(this.LJII)) {
                C0NB.LJIIIZ("GiftTray", "playForVideoGift");
                LJIIZILJ(this.LIZ + 2);
                this.LIZIZ = true;
                this.LIZJ = true;
                DataChannel dataChannel = this.LJIIIZ;
                if (dataChannel != null) {
                    dataChannel.qv0(NormalGiftDisplayForVideoEvent.class, Boolean.FALSE);
                }
                C78072UkW c78072UkW2 = this.LJII;
                if (c78072UkW2 != null && c78072UkW2.LJI == 4) {
                    C0NB.LIZIZ("flymic", "MP4 play");
                    C78078Ukc c78078Ukc = this.LJIIIIZZ;
                    if (c78078Ukc != null) {
                        c78078Ukc.postDelayed(this.LJIJ, this.LJIILJJIL);
                    }
                }
                C78072UkW c78072UkW3 = this.LJII;
                if (c78072UkW3 != null && (giftMessage = c78072UkW3.LIZ) != null) {
                    DataChannel dataChannel2 = this.LJIIIZ;
                    User user = null;
                    if (dataChannel2 != null && (room = (Room) dataChannel2.kv0(RoomChannel.class)) != null) {
                        user = room.getOwner();
                    }
                    C31996Ch6 LIZ = C32459CoZ.LIZ(giftMessage, user);
                    if (LIZ == null) {
                        arrayList = new ArrayList();
                    } else {
                        arrayList = new ArrayList();
                        long j2 = LIZ.LIZLLL;
                        if (j2 > 0 && C32341Cmf.LIZIZ(j2) == null) {
                            if (!((ArrayList) C31585CaT.LIZ).contains(Long.valueOf(LIZ.LIZLLL))) {
                                arrayList.add(Long.valueOf(LIZ.LIZLLL));
                            }
                        }
                        Gift gift = giftMessage.mGift;
                        if (gift != null) {
                            if (gift.isBoxGift) {
                                long j3 = LIZ.LIZLLL;
                                if (j3 > 0) {
                                    if (!((ArrayList) C31585CaT.LIZ).contains(Long.valueOf(j3))) {
                                        arrayList.add(Long.valueOf(LIZ.LIZLLL));
                                    }
                                }
                                GiftsBoxInfo giftsBoxInfo = giftMessage.giftsInBox;
                                if (giftsBoxInfo != null) {
                                    long LIZ2 = C32394CnW.LIZ(giftMessage.mGift, giftMessage.colorId);
                                    if (C32341Cmf.LIZIZ(LIZ2) == null) {
                                        if (!((ArrayList) C31585CaT.LIZ).contains(Long.valueOf(LIZ2))) {
                                            arrayList.add(Long.valueOf(LIZ2));
                                        }
                                    }
                                    for (GiftInfoInBox giftInfoInBox : giftsBoxInfo.gifts) {
                                        long LIZIZ = C32394CnW.LIZIZ(GiftManager.inst().findGiftById(giftInfoInBox.giftId), Long.valueOf(giftInfoInBox.effectId), Long.valueOf(giftInfoInBox.colorId));
                                        if (LIZIZ != 0) {
                                            j = LIZIZ;
                                        } else {
                                            j = giftInfoInBox.effectId;
                                        }
                                        if (C32341Cmf.LIZIZ(j) == null) {
                                            if (!((ArrayList) C31585CaT.LIZ).contains(Long.valueOf(LIZIZ))) {
                                                arrayList.add(Long.valueOf(LIZIZ));
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (gift.colorInfos != null && (!r0.isEmpty())) {
                                    Gift gift2 = giftMessage.mGift;
                                    if (gift2 != null && (list2 = gift2.colorInfos) != null) {
                                        for (GiftColorInfo giftColorInfo : list2) {
                                            if (!((ArrayList) C31585CaT.LIZ).contains(giftColorInfo.colorEffectId)) {
                                                Long l = giftColorInfo.colorEffectId;
                                                o.LJIIIIZZ(l, "it.colorEffectId");
                                                arrayList.add(l);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        Gift gift3 = giftMessage.mGift;
                        if (gift3 != null && gift3.isRandomGift && (giftRandomEffectInfo = gift3.randomEffectInfo) != null && (list = giftRandomEffectInfo.effectIds) != null && (!list.isEmpty())) {
                            Iterator<Long> it = list.iterator();
                            while (it.hasNext()) {
                                long longValue = it.next().longValue();
                                if (!((ArrayList) C31585CaT.LIZ).contains(Long.valueOf(longValue))) {
                                    arrayList.add(Long.valueOf(longValue));
                                }
                            }
                        }
                    }
                    if (true ^ arrayList.isEmpty()) {
                        C31596Cae.LIZ(new ArrayList(arrayList), new AqS141S0200000_10(this, giftMessage, 67), new AqS157S0200000_10(this, giftMessage, 48));
                    } else {
                        LJIIJJI();
                    }
                }
            }
        }
        if (!c78072UkW.LIZIZ) {
            LJIIIZ();
        }
    }

    public final void LJIIIIZZ(C78072UkW c78072UkW) {
        c78072UkW.LJJIIZ = this.LJIIJJI;
        C78078Ukc c78078Ukc = this.LJIIIIZZ;
        if (c78078Ukc != null) {
            c78078Ukc.removeCallbacks(this.LJIIZILJ);
        }
        LJIILLIIL(EnumC78090Uko.JUMPING);
        EnumC78063UkN enumC78063UkN = c78072UkW.LJII;
        if (enumC78063UkN != EnumC78063UkN.VIDEO_ONLY && enumC78063UkN != EnumC78063UkN.TRAY_ONLY) {
            C78066UkQ.LIZ.LIZ++;
        }
        C78072UkW c78072UkW2 = this.LJII;
        if (c78072UkW2 != null) {
            c78072UkW2.LJ(c78072UkW);
        }
        C78072UkW c78072UkW3 = this.LJII;
        if (c78072UkW3 != null) {
            c78072UkW3.LJIIIIZZ = c78072UkW.LJIIIIZZ;
            c78072UkW3.LIZ(c78072UkW.LJJIJLIJ);
        }
        C78072UkW c78072UkW4 = this.LJII;
        if (c78072UkW4 != null) {
            c78072UkW4.LIZIZ();
        }
        LJI();
    }

    public final void LJIIJ(C78072UkW c78072UkW) {
        int i;
        C0NB.LJIIIZ("GiftTray", "exitTray");
        if (c78072UkW != null) {
            i = c78072UkW.LJJJJLI;
        } else {
            i = 0;
        }
        long LIZJ = C78080Uke.LIZJ(i, c78072UkW);
        if (LIZJ == 0) {
            this.LJIIZILJ.run();
        } else {
            C78078Ukc c78078Ukc = this.LJIIIIZZ;
            if (c78078Ukc != null) {
                c78078Ukc.postDelayed(this.LJIIZILJ, LIZJ);
            }
        }
        C78071UkV c78071UkV = this.LJI;
        if (c78071UkV != null) {
            C78075UkZ c78075UkZ = c78071UkV.LJ;
            c78075UkZ.LJI++;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onExitTray latest(");
            LIZ.append(c78075UkZ.LJI);
            LIZ.append(')');
            C0NB.LIZIZ("LiveGiftTrayBlockMonitor", X1D.LIZIZ(LIZ));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0160, code lost:
    
        if (r5 == null) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(X.C78072UkW r34) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78069UkT.LJIIL(X.UkW):void");
    }

    public final void LJIILL(DataChannel dataChannel) {
        this.LJIIIZ = dataChannel;
        this.LJIIJ.LIZ(C79004UzY.LJJJJL(C73943T0h.LIZ().LJ(C32447CoN.class), new AfS65S0100000_13(this, 226)));
        DataChannel dataChannel2 = this.LJIIIZ;
        if (dataChannel2 != null) {
            dataChannel2.lv0(dataChannel2.LJLJJI, BattleVictoryLapActivityEvent.class, new AqS175S0100000_9(this, 599));
        }
        DataChannel dataChannel3 = this.LJIIIZ;
        if (dataChannel3 != null) {
            dataChannel3.lv0(dataChannel3.LJLJJI, MatchGiftTrayDodgeEvent.class, new AqS175S0100000_9(this, 600));
        }
        DataChannel dataChannel4 = this.LJIIIZ;
        if (dataChannel4 != null) {
            dataChannel4.lv0(dataChannel4.LJLJJI, GameLinkLayoutLandDataChannel.class, new AqS175S0100000_9(this, 601));
        }
        DataChannel dataChannel5 = this.LJIIIZ;
        if (dataChannel5 != null) {
            dataChannel5.lv0(dataChannel5.LJLJJI, GameStarCommentLayoutLandDataChannel.class, new AqS175S0100000_9(this, 602));
        }
    }

    public final void LJIILLIIL(EnumC78090Uko enumC78090Uko) {
        this.LIZLLL = enumC78090Uko;
        this.LJ.setValue(enumC78090Uko);
        C78072UkW c78072UkW = this.LJII;
        if (c78072UkW != null) {
            c78072UkW.LJJJ = this.LIZ;
            String str = this.LIZLLL.toString();
            o.LJIIIZ(str, "<set-?>");
            c78072UkW.LJJJI = str;
        }
    }

    public final void LJIIZILJ(int i) {
        this.LIZ = i;
        C78072UkW c78072UkW = this.LJII;
        if (c78072UkW != null) {
            c78072UkW.LJJJ = i;
            String str = this.LIZLLL.toString();
            o.LJIIIZ(str, "<set-?>");
            c78072UkW.LJJJI = str;
        }
    }

    public final void LJIJ(ViewGroup viewGroup) {
        this.LJFF = viewGroup;
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "trayContainer.context");
        C78078Ukc c78078Ukc = new C78078Ukc(context);
        this.LJIIIIZZ = c78078Ukc;
        c78078Ukc.LJ(this.LJIIIZ, false);
        C78078Ukc c78078Ukc2 = this.LJIIIIZZ;
        if (c78078Ukc2 != null) {
            c78078Ukc2.setDisplayCallback(this);
        }
        C78078Ukc c78078Ukc3 = this.LJIIIIZZ;
        if (c78078Ukc3 != null) {
            c78078Ukc3.setTrackNum(this.LJIIJJI);
        }
        C78078Ukc c78078Ukc4 = this.LJIIIIZZ;
        if (c78078Ukc4 != null) {
            c78078Ukc4.setViewGroup(this.LJFF);
        }
        ViewGroup viewGroup2 = this.LJFF;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.LJIIIIZZ);
        }
    }
}
