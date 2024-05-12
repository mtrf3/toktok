package com.bytedance.android.live.liveinteract.voicechat.main;

import X.B5G;
import X.C0NB;
import X.C28268B7o;
import X.C28272B7s;
import X.C32537Cpp;
import X.C74726TUk;
import X.C74736TUu;
import X.C74740TUy;
import X.C74743TVb;
import X.C74744TVc;
import X.C74751TVj;
import X.C74776TWi;
import X.C74824TYe;
import X.C74838TYs;
import X.C74893TaL;
import X.C74970Tba;
import X.C74971Tbb;
import X.C75400TiW;
import X.C75457TjR;
import X.C75559Tl5;
import X.EnumC30204BtI;
import X.EnumC38440F6u;
import X.EnumC74778TWk;
import X.FP1;
import X.FT5;
import X.TS1;
import X.TS8;
import X.TV3;
import X.TX9;
import X.TYW;
import X.TYZ;
import Y.ACListenerS33S0100000_13;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.linkroom.dataholder.LinkControlDataHolder;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestV3AnchorDestroyChannel;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestApplyNumChangedEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestAudienceNumChangedEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.RequestFrequencyEndEvent;
import com.bytedance.android.live.liveinteract.voicechat.api.AbsVoiceChatControlWidget;
import com.bytedance.android.live.liveinteract.voicechat.api.AbsVoiceChatSubWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget;
import com.bytedance.android.livesdk.dataChannel.AudienceInteractionDialogLinkHostClickEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3UseTimeFixSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class VoiceChatControlWidget extends AbsVoiceChatControlWidget implements TYZ {
    public final TX9 LJLIL;
    public AbsVoiceChatWidget LJLILLLLZI;
    public C74893TaL LJLJI;
    public final TYW LJLJJI = new TYW();

    @Override // com.bytedance.android.live.liveinteract.voicechat.api.AbsVoiceChatControlWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.TYZ
    public final void C8() {
        C74776TWi.LIZJ(this.dataChannel);
    }

    @Override // X.InterfaceC31336CRo
    public final String getLogTag() {
        return VoiceChatControlWidget.class.getName();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        AbsVoiceChatWidget absVoiceChatWidget = this.LJLILLLLZI;
        if (absVoiceChatWidget != null) {
            this.LJLIL.LIZ(absVoiceChatWidget);
        }
        this.LJLJJI.detachView();
        C75559Tl5.LIZIZ.LIZJ().clear();
        LJLZ("onDestroy");
        super.onDestroy();
    }

    @Override // X.TYZ
    public final void kr() {
        AbsVoiceChatWidget absVoiceChatWidget;
        boolean z;
        Integer num;
        B5G.LIZIZ().LJIILJJIL(2);
        C74838TYs.LJ().LIZIZ(Boolean.TRUE);
        AbsVoiceChatSubWidget LIZJ = this.LJLIL.LIZJ();
        if (LIZJ instanceof AbsVoiceChatWidget) {
            absVoiceChatWidget = (AbsVoiceChatWidget) LIZJ;
        } else {
            absVoiceChatWidget = null;
        }
        this.LJLILLLLZI = absVoiceChatWidget;
        if (absVoiceChatWidget != null) {
            absVoiceChatWidget.LJLIL = this.LJLIL;
        }
        int i = 0;
        if (absVoiceChatWidget != null && absVoiceChatWidget.LJLZ()) {
            z = true;
        } else {
            z = false;
        }
        C74893TaL c74893TaL = new C74893TaL(this, z);
        AbsVoiceChatWidget absVoiceChatWidget2 = this.LJLILLLLZI;
        if (absVoiceChatWidget2 != null && absVoiceChatWidget2.LJLZ()) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (num = (Integer) dataChannel.kv0(MultiGuestAudienceNumChangedEvent.class)) != null) {
                i = num.intValue();
            }
            C75457TjR.LJIL(i);
        }
        EnumC30204BtI.MULTIGUEST.load(this.dataChannel, c74893TaL, true);
        c74893TaL.LJLJLLL = new ACListenerS33S0100000_13(this, 189);
        this.LJLJI = c74893TaL;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.TiW, O] */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        MediaEngineFactory.nativeGetVersion();
        LJLZ("onCreate");
        C75559Tl5 c75559Tl5 = C75559Tl5.LIZIZ;
        if (c75559Tl5.LIZIZ("MULTI_GUEST_DATA_HOLDER") == null) {
            MultiGuestDataHolder multiGuestDataHolder = new MultiGuestDataHolder();
            c75559Tl5.LJI(multiGuestDataHolder, "MULTI_GUEST_DATA_HOLDER");
            C74824TYe.LIZIZ = multiGuestDataHolder;
        }
        c75559Tl5.LJI(new LinkControlDataHolder(), "LINK_CONTROL_DATA_HOLDER");
        ?? c75400TiW = new C75400TiW();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C74970Tba.class)).LIZ = c75400TiW;
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            ((C32537Cpp) dataChannel2.gv0(C74971Tbb.class)).LIZ = c75400TiW;
        }
        this.LJLJJI.attachView(this);
        C74744TVc c74744TVc = new C74744TVc();
        LiveAppBundleUtils.ensurePluginAvailable$default(EnumC38440F6u.LINK_MIC, new C74743TVb(TV3.LIZJ(), System.currentTimeMillis(), c74744TVc), false, 4, null);
        DataChannel dataChannel3 = this.dataChannel;
        dataChannel3.lv0(this, RequestFrequencyEndEvent.class, new AqS179S0100000_13(this, 232));
        dataChannel3.lv0(this, MultiGuestApplyNumChangedEvent.class, new AqS179S0100000_13(this, 233));
        dataChannel3.lv0(this, AudienceInteractionDialogLinkHostClickEvent.class, new AqS179S0100000_13(this, 234));
        dataChannel3.lv0(this, MultiGuestV3AnchorDestroyChannel.class, new AqS179S0100000_13(this, 235));
        TS1.LIZIZ(this);
        C0NB.LJIIIZ("VoiceChatControlWidget", "onCreate");
    }

    public VoiceChatControlWidget(TX9 tx9) {
        this.LJLIL = tx9;
    }

    public static void LJZ(long j) {
        C74751TVj.LJIIJJI("other");
        if (j != 0) {
            if (!LinkMicMultiGuestV3UseTimeFixSetting.INSTANCE.getValue() || j != 10004) {
                C74751TVj.LJIIL("connection_over");
            }
        }
    }

    @Override // X.TYZ
    public final void G9(boolean z) {
        VoiceChatWatchWidget voiceChatWatchWidget;
        C74776TWi.LJIIJ(this.dataChannel);
        AbsVoiceChatWidget absVoiceChatWidget = this.LJLILLLLZI;
        if (absVoiceChatWidget != null && !absVoiceChatWidget.LJLZ()) {
            AbsVoiceChatWidget absVoiceChatWidget2 = this.LJLILLLLZI;
            if ((absVoiceChatWidget2 instanceof VoiceChatWatchWidget) && (voiceChatWatchWidget = (VoiceChatWatchWidget) absVoiceChatWidget2) != null) {
                voiceChatWatchWidget.onMultiLivePermissionOff(z, false);
            }
        }
    }

    public final void LJLZ(String str) {
        Room room;
        FP1.LJFF("reset data holder ", str, "VoiceChatControlWidget");
        B5G.LIZIZ().LJIILJJIL(0);
        C74838TYs LJ = C74838TYs.LJ();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        LJ.LJFF(room, str);
        TS8.LIZ.LIZLLL(str);
        C74740TUy.LIZLLL().LJII();
    }

    @Override // X.TYZ
    public final void R5(LinkMessage finishMessage) {
        o.LJIIIZ(finishMessage, "finishMessage");
        if (isViewValid() && finishMessage.scene == 4) {
            Long reason = LinkControlWidget.LLFII;
            String str = finishMessage.extraStr;
            if (str != null) {
                try {
                    reason = CastLongProtector.valueOf(str);
                    o.LJIIIIZZ(reason, "reason");
                    C74726TUk.LIZIZ = reason.longValue();
                } catch (Throwable unused) {
                }
            }
            if (TV3.LIZJ()) {
                o.LJIIIIZZ(reason, "reason");
                zf(reason.longValue());
            } else {
                o.LJIIIIZZ(reason, "reason");
                LJZ(reason.longValue());
                C74736TUu.LIZ.LJIL(0, "anchor_turn_off_multi_guest", FT5.LIZLLL("is_anchor", CardStruct.IStatusCode.DEFAULT), false);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.api.AbsVoiceChatControlWidget
    public final void onSei(C28272B7s c28272B7s) {
        AbsVoiceChatWidget absVoiceChatWidget = this.LJLILLLLZI;
        if (absVoiceChatWidget != null) {
            absVoiceChatWidget.onSei(c28272B7s);
        }
    }

    public final void zf(long j) {
        LJZ(j);
        if (!TV3.LIZJ()) {
            C74824TYe.LJJLJ("others", EnumC74778TWk.NORMAL);
        }
        C74838TYs.LJ().LIZIZ(Boolean.FALSE);
        TS8.LIZ.LIZLLL("multi-guest turn off");
    }

    @Override // X.InterfaceC30131Bs7
    public final boolean LJJLIIIJLJLI(Runnable runnable, boolean z, boolean z2, C28268B7o c28268B7o) {
        AbsVoiceChatWidget absVoiceChatWidget;
        AbsVoiceChatWidget absVoiceChatWidget2 = this.LJLILLLLZI;
        if (absVoiceChatWidget2 == null || absVoiceChatWidget2.LJLZ() || (absVoiceChatWidget = this.LJLILLLLZI) == null) {
            return false;
        }
        return absVoiceChatWidget.interceptCloseRoom(runnable, z, z2, c28268B7o);
    }
}
