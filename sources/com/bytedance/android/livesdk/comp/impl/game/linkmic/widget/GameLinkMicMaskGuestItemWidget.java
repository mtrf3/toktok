package com.bytedance.android.livesdk.comp.impl.game.linkmic.widget;

import X.AbstractC73672Svk;
import X.B83;
import X.BJM;
import X.BZI;
import X.C012403c;
import X.C0NB;
import X.C17N;
import X.C221108m2;
import X.C28787BRn;
import X.C29044Baa;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29927Bop;
import X.C46528INw;
import X.C62822Ol8;
import X.C73849Syb;
import X.C73933Szx;
import X.C73969T1h;
import X.C74740TUy;
import X.C74779TWl;
import X.C74780TWm;
import X.C74784TWq;
import X.C75377Ti9;
import X.EnumC31509CYf;
import X.EnumC74783TWp;
import X.InterfaceC29856Bng;
import X.TV2;
import X.TWL;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import Y.ACListenerS33S0100000_13;
import Y.AfS65S0100000_13;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkMicViewSmallStyle;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.GameLinkGuestMuteAudioEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.GameLinkPlayerMuteAudioEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.GameLinkStateChangeEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.RealGoLivePreviewDestroyEvent;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.model.message.LinkMicMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class GameLinkMicMaskGuestItemWidget extends LiveWidget implements OnMessageListener {
    public final C74779TWl LJLIL;
    public final C75377Ti9 LJLILLLLZI;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 207));
    public final C73849Syb<Boolean> LJLJJI = C73849Syb.LJJZZI(Boolean.FALSE);

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        IMessageManager iMessageManager;
        DataChannel dataChannel;
        super.onCreate();
        if (((Boolean) this.LJLJI.getValue()).booleanValue() && (dataChannel = this.dataChannel) != null) {
            dataChannel.ov0(this, GameLinkMicViewSmallStyle.class, new AqS179S0100000_13(this, 307));
        }
        C75377Ti9 c75377Ti9 = this.LJLILLLLZI;
        Boolean LJJZZIII = this.LJLJJI.LJJZZIII();
        if (LJJZZIII == null) {
            LJJZZIII = Boolean.FALSE;
        }
        c75377Ti9.LJFF(LJJZZIII.booleanValue(), ((Boolean) this.LJLJI.getValue()).booleanValue(), this.LJLIL);
        ((InterfaceC29856Bng) AbstractC73672Svk.LJI(this.LJLIL.LJI.LJIILIIL(), this.LJLJJI, C74784TWq.LJLIL).LJJJ(C73969T1h.LIZIZ()).LIZJ(C73933Szx.LJ(this))).LIZIZ(new AfS65S0100000_13(this, 77));
        if (this.LJLIL.LIZIZ()) {
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.ov0(this, GameLinkGuestMuteAudioEvent.class, new AqS179S0100000_13(this, 308));
                dataChannel2.lv0(this, RealGoLivePreviewDestroyEvent.class, new AqS179S0100000_13(this, 309));
            }
        } else {
            DataChannel dataChannel3 = this.dataChannel;
            if (dataChannel3 != null) {
                dataChannel3.ov0(this, GameLinkPlayerMuteAudioEvent.class, new AqS179S0100000_13(this, 310));
            }
            DataChannel dataChannel4 = this.dataChannel;
            if (dataChannel4 != null) {
                dataChannel4.ov0(this, GameLinkStateChangeEvent.class, new AqS179S0100000_13(this, 311));
            }
        }
        C74779TWl c74779TWl = this.LJLIL;
        this.LJLILLLLZI.setUserInfo(c74779TWl.LIZ());
        C75377Ti9 c75377Ti92 = this.LJLILLLLZI;
        Long LJJZZIII2 = c74779TWl.LJFF.LJJZZIII();
        if (LJJZZIII2 == null) {
            LJJZZIII2 = 0L;
        }
        o.LJIIIIZZ(LJJZZIII2, "coinNum.value ?: 0L");
        c75377Ti92.setCoinNum(LJJZZIII2.longValue());
        this.LJLILLLLZI.setState(c74779TWl.LIZLLL);
        C75377Ti9 c75377Ti93 = this.LJLILLLLZI;
        Boolean LJJZZIII3 = c74779TWl.LJ.LJJZZIII();
        if (LJJZZIII3 == null) {
            LJJZZIII3 = Boolean.FALSE;
        }
        o.LJIIIIZZ(LJJZZIII3, "isMute.value ?: false");
        c75377Ti93.setMuteState(LJJZZIII3.booleanValue());
        this.LJLILLLLZI.LJI(C17N.LJJLI(c74779TWl.LJII));
        LJZ(c74779TWl.LJII);
        ((InterfaceC29856Bng) this.LJLIL.LJ.LJJJ(C73969T1h.LIZIZ()).LIZJ(C73933Szx.LJ(this))).LIZIZ(new AfS65S0100000_13(this, 78));
        ((InterfaceC29856Bng) this.LJLIL.LJFF.LJJJ(C73969T1h.LIZIZ()).LIZJ(C73933Szx.LJ(this))).LIZIZ(new AfS65S0100000_13(this, 79));
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null && (iMessageManager = (IMessageManager) dataChannel5.kv0(C29927Bop.class)) != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.LINK_MIC.getIntType(), this);
        }
        this.LJLILLLLZI.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS33S0100000_13(this, 72)));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        IMessageManager iMessageManager;
        super.onDestroy();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.kv0(C29927Bop.class)) != null) {
            iMessageManager.removeMessageListener(this);
        }
        C29306Beo.LJJIJIIJIL(this.LJLILLLLZI);
    }

    @Override // com.bytedance.android.widget.Widget
    public final View getView() {
        return this.LJLILLLLZI;
    }

    public final void LJLZ(int i) {
        User user;
        Long valueOf;
        String str;
        long j;
        if (this.LJLILLLLZI.LJ(i) && (user = this.LJLIL.LIZ.mUser) != null && (valueOf = Long.valueOf(user.getId())) != null) {
            valueOf.longValue();
            if (C74740TUy.LIZLLL().LJ()) {
                str = "guest";
            } else {
                str = "viewer";
            }
            C74780TWm c74780TWm = new C74780TWm(str);
            long longValue = valueOf.longValue();
            c74780TWm.LIZJ = longValue;
            c74780TWm.LIZLLL = "guest";
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(longValue);
            LIZ.append('-');
            LIZ.append("guest");
            String LIZIZ = X1D.LIZIZ(LIZ);
            C62822Ol8 c62822Ol8 = C46528INw.LIZ;
            Long l = (Long) ((Map) c62822Ol8.getValue()).get(LIZIZ);
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j < 60000) {
                return;
            }
            ((Map) c62822Ol8.getValue()).put(LIZIZ, Long.valueOf(currentTimeMillis));
            if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_anchor_audio_guest_voice_wave_show", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
                return;
            }
            BZI LIZ2 = C28787BRn.LIZ("anchor_audio_guest_voice_wave_show");
            LIZ2.LJIJJ(Long.valueOf(c74780TWm.LIZJ), "user_id");
            LIZ2.LJIJJ(c74780TWm.LIZLLL, "user_type");
            LIZ2.LJIJJ(Long.valueOf(c74780TWm.LIZIZ), "to_user_id");
            LIZ2.LJIJJ(c74780TWm.LIZ, "to_user_type");
            LIZ2.LJIJJ(c74780TWm.LJ, "show_position");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
                LIZ2.LJIIZILJ();
                LIZ2.LJJIIJZLJL();
            } else {
                LIZ2.LJJIJ();
                LIZ2.LJIJJ(Long.valueOf(BJM.LJIILJJIL()), "room_id");
                LIZ2.LJJIIZI();
            }
        }
    }

    public final void LJZ(int i) {
        int i2;
        int i3 = this.LJLIL.LJII;
        if (i3 == i) {
            C012403c.LJ("GameLinkMicMaskGuestItemWidget_updateNetworkState return as networkState is the same as old ", i, "GameLinkMicMaskGuestItemWidget");
            return;
        }
        EnumC74783TWp LJJLI = C17N.LJJLI(i3);
        this.LJLIL.LJII = i;
        EnumC74783TWp LJJLI2 = C17N.LJJLI(i);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GameLinkMicMaskGuestItemWidget_updateNetworkState state = ");
        LIZ.append(LJJLI2);
        C0NB.LIZIZ("GameLinkMicMaskGuestItemWidget", X1D.LIZIZ(LIZ));
        this.LJLILLLLZI.LJI(LJJLI2);
        if (LJJLI != LJJLI2) {
            C0NB.LIZIZ("NetworkStateTips", "GameLinkMicMaskGuestItemWidget_reportCurrentNetworkState");
            User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
            o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
            if (TV2.LJIIIZ(LJ)) {
                long id = this.LJLIL.LIZ().getId();
                if (!UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_anchor_guest_netspeed_stuck_icon_show")) {
                    return;
                }
                HashMap hashMap = new HashMap();
                TWL.LIZ(hashMap);
                Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                if (room != null) {
                    String idStr = room.getIdStr();
                    o.LJIIIIZZ(idStr, "room.idStr");
                    hashMap.put("room_id", idStr);
                    hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                    hashMap.put("guest_id", String.valueOf(id));
                }
                hashMap.put("net_speed_level", String.valueOf(i));
                TWL.LJIL("livesdk_anchor_guest_netspeed_stuck_icon_show", hashMap);
                return;
            }
            long id2 = this.LJLIL.LIZ().getId();
            HashMap hashMap2 = new HashMap();
            TWL.LIZ(hashMap2);
            Room room2 = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room2 != null) {
                String idStr2 = room2.getIdStr();
                o.LJIIIIZZ(idStr2, "room.idStr");
                hashMap2.put("room_id", idStr2);
                hashMap2.put("anchor_id", String.valueOf(room2.getOwnerUserId()));
            }
            hashMap2.put("show_guest_id", String.valueOf(id2));
            if (id2 == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            hashMap2.put("is_self", String.valueOf(i2));
            hashMap2.put("net_speed_level", String.valueOf(i));
            TWL.LJIL("livesdk_guest_netspeed_stuck_icon_show", hashMap2);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        User user;
        if ((iMessage instanceof LinkMicMessage) && (user = this.LJLIL.LIZ.mUser) != null && user.getId() == ((LinkMicMessage) iMessage).userId) {
            LinkMicMessage linkMicMessage = (LinkMicMessage) iMessage;
            if (linkMicMessage.mType == 8) {
                this.LJLIL.LJFF.onNext(Long.valueOf(linkMicMessage.fanTicket));
            }
        }
    }

    public GameLinkMicMaskGuestItemWidget(C74779TWl c74779TWl, C75377Ti9 c75377Ti9) {
        this.LJLIL = c74779TWl;
        this.LJLILLLLZI = c75377Ti9;
    }
}
