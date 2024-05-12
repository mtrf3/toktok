package com.bytedance.android.livesdk.gift.base.platform.business.tray;

import X.B83;
import X.BJM;
import X.BNM;
import X.BZI;
import X.C0NB;
import X.C28787BRn;
import X.C29374Bfu;
import X.C29824BnA;
import X.C30725C4b;
import X.C32221Ckj;
import X.C32366Cn4;
import X.C32405Cnh;
import X.C32433Co9;
import X.C32463Cod;
import X.C73318Sq2;
import X.C73933Szx;
import X.C73943T0h;
import X.C73969T1h;
import X.C78062UkM;
import X.C78064UkO;
import X.C78065UkP;
import X.C78066UkQ;
import X.C78069UkT;
import X.C78070UkU;
import X.C78071UkV;
import X.C78072UkW;
import X.C78074UkY;
import X.C78075UkZ;
import X.C78895Uxn;
import X.C80955Vpv;
import X.EnumC32093Cif;
import X.EnumC32466Cog;
import X.EnumC78063UkN;
import X.InterfaceC29856Bng;
import X.OST;
import X.X1D;
import Y.AfS57S0100000_5;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.CoHostAndMultiGuestSceneGiftPanelChangeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveMsgThreadSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchRequestLayoutSettings;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleRevenueWidgetSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetV2RevenueSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.AssetMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.LiveTrayMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LiveGiftTrayWidgetV2 extends AbsNormalGiftAnimWidget {
    public C78070UkU LJLILLLLZI;
    public C78071UkV LJLJI;
    public final int LJLJJI = 1;
    public final C73318Sq2 LJLJJL = new C73318Sq2();
    public C80955Vpv LJLJJLL;

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.AbsNormalGiftAnimWidget
    public final void LLF(int i) {
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.AbsNormalGiftAnimWidget
    public final void LLFF() {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dou;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.AbsNormalGiftAnimWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.AbsNormalGiftAnimWidget
    public final void LJZ() {
        C78070UkU c78070UkU = this.LJLILLLLZI;
        if (c78070UkU != null) {
            C78065UkP c78065UkP = C78066UkQ.LIZ;
            c78065UkP.LJFF += c78070UkU.LIZ.size();
            c78065UkP.LIZLLL = c78065UkP.LIZLLL;
            int i = c78065UkP.LIZJ;
            c78065UkP.LJ = c78065UkP.LJ;
            c78065UkP.LIZJ = i;
            GiftReceiveMsgThreadSetting giftReceiveMsgThreadSetting = GiftReceiveMsgThreadSetting.INSTANCE;
            List<C78072UkW> selfMessageQueue = c78070UkU.LIZ;
            o.LJIIIIZZ(selfMessageQueue, "selfMessageQueue");
            if (giftReceiveMsgThreadSetting.getMultiThread()) {
                synchronized (selfMessageQueue) {
                    c78070UkU.LIZ.clear();
                }
            } else {
                c78070UkU.LIZ.clear();
            }
            List<C78072UkW> outerMessageQueue = c78070UkU.LIZIZ;
            o.LJIIIIZZ(outerMessageQueue, "outerMessageQueue");
            if (giftReceiveMsgThreadSetting.getMultiThread()) {
                synchronized (outerMessageQueue) {
                    c78070UkU.LIZIZ.clear();
                }
            } else {
                c78070UkU.LIZIZ.clear();
            }
            c78070UkU.LIZLLL.clear();
            c78070UkU.LJ.clear();
            C32433Co9.LJ();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return EnableRecycleSingleRevenueWidgetSetting.INSTANCE.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        boolean z;
        int i;
        Gift gift;
        int i2;
        Gift gift2;
        String str;
        int i3;
        int i4;
        int i5;
        Boolean bool;
        int i6;
        Gift gift3;
        int i7;
        Gift gift4;
        Object obj;
        int i8;
        String str2;
        String str3;
        Boolean bool2;
        this.LJLJJL.LIZLLL();
        C78071UkV c78071UkV = this.LJLJI;
        boolean z2 = false;
        if (c78071UkV != null) {
            Iterator<C78069UkT> it = c78071UkV.LIZIZ.iterator();
            while (it.hasNext()) {
                it.next().LJIILIIL();
            }
            if (WatchMemoryLeakOpt.INSTANCE.settingValue()) {
                c78071UkV.LIZIZ.clear();
            }
            C78075UkZ c78075UkZ = c78071UkV.LJ;
            c78075UkZ.getClass();
            C0NB.LIZIZ("LiveGiftTrayBlockMonitor", "release");
            C0NB.LIZIZ("LiveGiftTrayBlockMonitor", "resetMonitor");
            c78075UkZ.LIZIZ = false;
            c78075UkZ.LIZJ = false;
            c78075UkZ.LJ = 0L;
            c78075UkZ.LJFF = 0L;
            c78075UkZ.LJI = 0L;
            c78075UkZ.LJIILJJIL.LIZLLL();
            c78075UkZ.LJIILL.LIZLLL();
        }
        C78070UkU c78070UkU = this.LJLILLLLZI;
        if (c78070UkU != null) {
            C78065UkP c78065UkP = C78066UkQ.LIZ;
            DataChannel dataChannel = c78070UkU.LIZJ;
            if (dataChannel != null && (bool2 = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null) {
                z = bool2.booleanValue();
            } else {
                z = false;
            }
            int size = c78070UkU.LIZ.size();
            if (c78065UkP.LIZIZ) {
                BZI LIZ = C28787BRn.LIZ("gift_tray");
                long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                Map map = (Map) dataChannelGlobal.mv0(C29824BnA.class);
                if (map == null || (obj = (String) map.get("anchor_id")) == null) {
                    obj = 0;
                }
                if (!(obj instanceof Long) || currentUserId != ((Number) obj).longValue()) {
                    i8 = 0;
                } else {
                    i8 = 1;
                }
                LIZ.LJIJJ(Integer.valueOf(i8), "is_anchor");
                LIZ.LJIJJ(Integer.valueOf(c78065UkP.LIZ), "gift_tray_show");
                LIZ.LJIJJ(0, "gift_tray_not_show");
                LIZ.LJIL("gift_tray_discard_rate", Float.valueOf(0 / c78065UkP.LIZ));
                String str4 = CardStruct.IStatusCode.DEFAULT;
                if (z) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                LIZ.LJIJJ(str2, "is_anchor");
                Map map2 = (Map) dataChannelGlobal.mv0(C29824BnA.class);
                if (map2 != null && (str3 = (String) map2.get("anchor_id")) != null) {
                    str4 = str3;
                }
                C78895Uxn.LIZIZ(LIZ, str4, "anchor_id", size, "own_send_not_show");
                LIZ.LJIJJ(Integer.valueOf(c78065UkP.LIZLLL), "dropped_common_cnt");
                LIZ.LJIJJ(Integer.valueOf(c78065UkP.LJ), "dropped_effect_cnt");
                LIZ.LJIJJ(0, "not_show_common_cnt");
                LIZ.LJIJJ(0, "not_show_effect_cnt");
                LIZ.LJIJJ(Integer.valueOf(c78065UkP.LIZJ), "gift_tray_drop");
                LIZ.LJIJJ(Integer.valueOf(c78065UkP.LJFF), "own_send_drop");
                if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
                    LIZ.LJIIZILJ();
                    LIZ.LJJIIJZLJL();
                } else {
                    LIZ.LJJIJ();
                    LIZ.LJI();
                    LIZ.LJIJJ(BJM.LIZLLL(), "action_type");
                    LIZ.LJIJJ(BJM.LJIILIIL(), "request_id");
                    LIZ.LJJIIZI();
                }
                c78065UkP.LIZIZ = false;
            }
            GiftReceiveMsgThreadSetting giftReceiveMsgThreadSetting = GiftReceiveMsgThreadSetting.INSTANCE;
            List<C78072UkW> selfMessageQueue = c78070UkU.LIZ;
            o.LJIIIIZZ(selfMessageQueue, "selfMessageQueue");
            if (giftReceiveMsgThreadSetting.getMultiThread()) {
                synchronized (selfMessageQueue) {
                    for (C78072UkW c78072UkW : c78070UkU.LIZ) {
                        C78065UkP c78065UkP2 = C78066UkQ.LIZ;
                        GiftMessage giftMessage = c78072UkW.LIZ;
                        if (giftMessage != null && (gift4 = giftMessage.mGift) != null) {
                            i7 = gift4.type;
                        } else {
                            i7 = 0;
                        }
                        c78065UkP2.LIZ(i7, true);
                        C32463Cod.LJI(c78072UkW, EnumC32093Cif.MESSAGE_DISCARDED, EnumC32466Cog.SHOW);
                    }
                }
            } else {
                for (C78072UkW c78072UkW2 : c78070UkU.LIZ) {
                    C78065UkP c78065UkP3 = C78066UkQ.LIZ;
                    GiftMessage giftMessage2 = c78072UkW2.LIZ;
                    if (giftMessage2 != null && (gift = giftMessage2.mGift) != null) {
                        i = gift.type;
                    } else {
                        i = 0;
                    }
                    c78065UkP3.LIZ(i, true);
                    C32463Cod.LJI(c78072UkW2, EnumC32093Cif.MESSAGE_DISCARDED, EnumC32466Cog.SHOW);
                }
            }
            GiftReceiveMsgThreadSetting giftReceiveMsgThreadSetting2 = GiftReceiveMsgThreadSetting.INSTANCE;
            List<C78072UkW> outerMessageQueue = c78070UkU.LIZIZ;
            o.LJIIIIZZ(outerMessageQueue, "outerMessageQueue");
            if (giftReceiveMsgThreadSetting2.getMultiThread()) {
                synchronized (outerMessageQueue) {
                    for (C78072UkW c78072UkW3 : c78070UkU.LIZIZ) {
                        C78065UkP c78065UkP4 = C78066UkQ.LIZ;
                        GiftMessage giftMessage3 = c78072UkW3.LIZ;
                        if (giftMessage3 != null && (gift3 = giftMessage3.mGift) != null) {
                            i6 = gift3.type;
                        } else {
                            i6 = 0;
                        }
                        c78065UkP4.LIZ(i6, false);
                        C32463Cod.LJI(c78072UkW3, EnumC32093Cif.MESSAGE_DISCARDED, EnumC32466Cog.SHOW);
                    }
                }
            } else {
                for (C78072UkW c78072UkW4 : c78070UkU.LIZIZ) {
                    C78065UkP c78065UkP5 = C78066UkQ.LIZ;
                    GiftMessage giftMessage4 = c78072UkW4.LIZ;
                    if (giftMessage4 != null && (gift2 = giftMessage4.mGift) != null) {
                        i2 = gift2.type;
                    } else {
                        i2 = 0;
                    }
                    c78065UkP5.LIZ(i2, false);
                    C32463Cod.LJI(c78072UkW4, EnumC32093Cif.MESSAGE_DISCARDED, EnumC32466Cog.SHOW);
                }
            }
            C78065UkP c78065UkP6 = C78066UkQ.LIZ;
            DataChannel dataChannel2 = c78070UkU.LIZJ;
            if (dataChannel2 != null && (bool = (Boolean) dataChannel2.kv0(UserIsAnchorChannel.class)) != null) {
                z2 = bool.booleanValue();
            }
            c78065UkP6.getClass();
            if (z2) {
                str = "gift_queue_drop_msg_anchor";
                i3 = c78065UkP6.LJIIIZ;
                i4 = c78065UkP6.LJIIJ;
                i5 = c78065UkP6.LJIIJJI;
            } else {
                str = "gift_queue_drop_msg_self";
                i3 = c78065UkP6.LJI;
                i4 = c78065UkP6.LJII;
                i5 = c78065UkP6.LJIIIIZZ;
            }
            BZI LIZ2 = C28787BRn.LIZ(str);
            LIZ2.LJIJJ(Integer.valueOf(i3), "small_gift_msg_total");
            LIZ2.LJIJJ(Integer.valueOf(i4), "big_gift_msg_total");
            LIZ2.LJIJJ(Integer.valueOf(i5), "sticker_gift_msg_total");
            LIZ2.LJIJJ("quit_room", "reason");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
                LIZ2.LJJIIJZLJL();
            } else {
                LIZ2.LJJIJ();
                LIZ2.LJJIIZI();
            }
            C78074UkY.LIZIZ.LIZLLL();
            GiftReceiveMsgThreadSetting giftReceiveMsgThreadSetting3 = GiftReceiveMsgThreadSetting.INSTANCE;
            List<C78072UkW> selfMessageQueue2 = c78070UkU.LIZ;
            o.LJIIIIZZ(selfMessageQueue2, "selfMessageQueue");
            if (giftReceiveMsgThreadSetting3.getMultiThread()) {
                synchronized (selfMessageQueue2) {
                    c78070UkU.LIZ.clear();
                }
            } else {
                c78070UkU.LIZ.clear();
            }
            List<C78072UkW> outerMessageQueue2 = c78070UkU.LIZIZ;
            o.LJIIIIZZ(outerMessageQueue2, "outerMessageQueue");
            if (giftReceiveMsgThreadSetting3.getMultiThread()) {
                synchronized (outerMessageQueue2) {
                    c78070UkU.LIZIZ.clear();
                }
            } else {
                c78070UkU.LIZIZ.clear();
            }
            c78070UkU.LIZLLL.clear();
            c78070UkU.LJ.clear();
            C32433Co9.LJ();
            if (WatchMemoryLeakOpt.INSTANCE.settingValue()) {
                c78070UkU.LIZJ = null;
            }
        }
        if (LiveRecycleWidgetV2RevenueSetting.INSTANCE.getValue()) {
            C80955Vpv c80955Vpv = this.LJLJJLL;
            if (c80955Vpv instanceof ViewGroup) {
                o.LJII(c80955Vpv, "null cannot be cast to non-null type android.view.ViewGroup");
                c80955Vpv.removeAllViews();
            }
        }
        C32433Co9.LJ();
        OST.LIZ = null;
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.AbsNormalGiftAnimWidget
    public final void LJLZ(GiftMessage giftMessage) {
        long j;
        Room room;
        giftMessage.LJLILLLLZI = true;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        C78072UkW LIZ = C78064UkO.LIZ(giftMessage, j);
        EnumC78063UkN enumC78063UkN = EnumC78063UkN.VIDEO_ONLY;
        o.LJIIIZ(enumC78063UkN, "<set-?>");
        LIZ.LJII = enumC78063UkN;
        C78070UkU c78070UkU = this.LJLILLLLZI;
        if (c78070UkU != null) {
            c78070UkU.LIZJ(LIZ, false);
        }
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.AbsNormalGiftAnimWidget
    public final void LJZI(AssetMessage assetMessage) {
        if (assetMessage == null || assetMessage.assets == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receiveAssetMessage. asset id = ");
        LIZ.append(assetMessage.assetId);
        C0NB.LJIIIZ("AssetMessage", X1D.LIZIZ(LIZ));
        C32405Cnh LIZIZ = C32221Ckj.LIZIZ();
        AssetsModel assets = assetMessage.assets;
        LIZIZ.getClass();
        o.LJIIIZ(assets, "assets");
        synchronized (C32366Cn4.LIZ) {
            ((ArrayList) C32366Cn4.LJ).add(assets);
            C32366Cn4.LIZLLL.add(assets);
        }
        GiftMessage giftMessage = new GiftMessage();
        giftMessage.giftId = assetMessage.assetId;
        giftMessage.comboCount = 0;
        giftMessage.fromUser = assetMessage.fromUser;
        giftMessage.toUser = assetMessage.toUser;
        giftMessage.LJLIL = true;
        C78072UkW c78072UkW = new C78072UkW(giftMessage);
        EnumC78063UkN enumC78063UkN = EnumC78063UkN.VIDEO_ONLY;
        o.LJIIIZ(enumC78063UkN, "<set-?>");
        c78072UkW.LJII = enumC78063UkN;
        c78072UkW.LJIL = C30725C4b.LIZ();
        c78072UkW.LJJ = System.currentTimeMillis();
        c78072UkW.LIZIZ = true;
        c78072UkW.LIZJ = C78062UkM.LIZ(c78072UkW);
        c78072UkW.LJJIZ.N(giftMessage);
        if (!this.LJLIL) {
            C78070UkU c78070UkU = this.LJLILLLLZI;
            if (c78070UkU != null) {
                c78070UkU.LIZJ(c78072UkW, false);
                return;
            }
            return;
        }
        C32463Cod.LJI(c78072UkW, EnumC32093Cif.SCREEN_CLEAR_MODE, EnumC32466Cog.ENQUEUE);
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.AbsNormalGiftAnimWidget
    public final void LJZL(GiftMessage giftMessage) {
        long j;
        Room room;
        if (giftMessage != null) {
            if (giftMessage.repeatEnd == 1) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("drop gift message(");
                LIZ.append(giftMessage.giftId);
                LIZ.append(") by repeatEnd==1");
                C0NB.LJIIIZ("LiveGiftTrayWidgetV2", X1D.LIZIZ(LIZ));
                return;
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                j = room.getOwnerUserId();
            } else {
                j = 0;
            }
            C78072UkW LIZ2 = C78064UkO.LIZ(giftMessage, j);
            LIZ2.LJJLI = true;
            if (!this.LJLIL) {
                C78070UkU c78070UkU = this.LJLILLLLZI;
                if (c78070UkU != null) {
                    c78070UkU.LIZJ(LIZ2, false);
                    return;
                }
                return;
            }
            C32463Cod.LJI(LIZ2, EnumC32093Cif.SCREEN_CLEAR_MODE, EnumC32466Cog.ENQUEUE);
        }
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.AbsNormalGiftAnimWidget
    public final void LL(LiveTrayMessage trayMessage) {
        o.LJIIIZ(trayMessage, "trayMessage");
        GiftMessage giftMessage = new GiftMessage();
        giftMessage.giftId = -999L;
        giftMessage.comboCount = trayMessage.comboCount;
        giftMessage.fromUser = trayMessage.user;
        giftMessage.LJLILLLLZI = true;
        C78072UkW c78072UkW = new C78072UkW(giftMessage);
        EnumC78063UkN enumC78063UkN = EnumC78063UkN.TRAY_ONLY;
        o.LJIIIZ(enumC78063UkN, "<set-?>");
        c78072UkW.LJII = enumC78063UkN;
        c78072UkW.LJJJIL = C78062UkM.LIZIZ(trayMessage.title);
        c78072UkW.LJJJJ = trayMessage.image;
        c78072UkW.LJJJJJ = trayMessage.user;
        c78072UkW.LJJJJI = C78062UkM.LIZIZ(trayMessage.describe);
        c78072UkW.LJJJJJL = true;
        c78072UkW.LJJIZ.LJLIL = true;
        c78072UkW.LJIIIIZZ = trayMessage.comboCount;
        c78072UkW.LJIL = C30725C4b.LIZ();
        if (!this.LJLIL) {
            C78070UkU c78070UkU = this.LJLILLLLZI;
            if (c78070UkU != null) {
                c78070UkU.LIZJ(c78072UkW, false);
                return;
            }
            return;
        }
        C32463Cod.LJI(c78072UkW, EnumC32093Cif.SCREEN_CLEAR_MODE, EnumC32466Cog.ENQUEUE);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C78065UkP c78065UkP = C78066UkQ.LIZ;
        c78065UkP.LIZIZ = true;
        c78065UkP.LIZ = 0;
        c78065UkP.LIZJ = 0;
        c78065UkP.LIZLLL = 0;
        c78065UkP.LJ = 0;
        c78065UkP.LJFF = 0;
        c78065UkP.LJI = 0;
        c78065UkP.LJII = 0;
        c78065UkP.LJIIIIZZ = 0;
        c78065UkP.LJIIIZ = 0;
        c78065UkP.LJIIJ = 0;
        c78065UkP.LJIIJJI = 0;
        C32433Co9.LJ();
        C80955Vpv c80955Vpv = (C80955Vpv) this.contentView.findViewById(R.id.dsy);
        this.LJLJJLL = c80955Vpv;
        if (c80955Vpv != null) {
            c80955Vpv.setEnableSizeChange(true);
        }
        C80955Vpv c80955Vpv2 = this.LJLJJLL;
        if (c80955Vpv2 != null) {
            c80955Vpv2.setEnableFixedSize(LiveMatchRequestLayoutSettings.INSTANCE.isMatchEnabled());
        }
        C78070UkU c78070UkU = new C78070UkU();
        this.LJLILLLLZI = c78070UkU;
        c78070UkU.LIZJ = this.dataChannel;
        C78071UkV c78071UkV = new C78071UkV();
        this.LJLJI = c78071UkV;
        C78070UkU c78070UkU2 = this.LJLILLLLZI;
        if (c78070UkU2 != null) {
            c78070UkU2.LJFF = c78071UkV;
        }
        c78071UkV.LIZ = c78070UkU2;
        c78071UkV.LIZLLL = this.dataChannel;
        C80955Vpv c80955Vpv3 = this.LJLJJLL;
        if (!(c80955Vpv3 instanceof ViewGroup)) {
            c80955Vpv3 = null;
        }
        c78071UkV.LIZLLL(0, c80955Vpv3, false, false);
        OST.LIZ = this.LJLILLLLZI;
        this.LJLJJL.LIZ(((InterfaceC29856Bng) C73943T0h.LIZ().LJ(BNM.class).LJJJ(C73969T1h.LIZIZ()).LIZJ(C73933Szx.LJ(this))).LIZIZ(new AfS57S0100000_5(this, 345)));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this, CoHostAndMultiGuestSceneGiftPanelChangeChannel.class, new AqS179S0100000_13(this, 585));
        }
    }
}
