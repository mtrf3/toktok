package com.bytedance.android.live.liveinteract.voicechat.main.guest;

import X.AbstractC75411Tih;
import X.C025908h;
import X.C0NB;
import X.C29306Beo;
import X.C29556Biq;
import X.C74613TQb;
import X.C74630TQs;
import X.C74631TQt;
import X.C74736TUu;
import X.C74838TYs;
import X.C74983Tbn;
import X.C75559Tl5;
import X.C78886Uxe;
import X.C79004UzY;
import X.C8E;
import X.InterfaceC24140x8;
import X.InterfaceC55235Lm3;
import X.InterfaceC74605TPt;
import X.InterfaceC74612TQa;
import X.InterfaceC74695TTf;
import X.InterfaceC75441TjB;
import X.TQ6;
import X.TQ8;
import X.TQU;
import X.TTB;
import X.TZM;
import X.UC0;
import X.X1D;
import android.os.Message;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiLiveUserMediaEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteAudioEvent;
import com.bytedance.android.live.liveinteract.platform.core.message.LinkMessageCenter;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.live.liveinteract.voicechat.main.common.BackgroundTimeOutEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3BackgroundUseMediaFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicStateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiguestPauseTimeoutIntervalSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class VoiceChatGuestPresenter extends AbstractC75411Tih<InterfaceC74612TQa> implements WeakHandler.IHandler {
    public static final C74613TQb Companion = new C74613TQb();
    public final InterfaceC74605TPt client;
    public MultiGuestDataHolder dataHolder;
    public TTB guestLinkListener;
    public WeakHandler handler;
    public boolean isEnterBackground;

    public final void onEnterBackground() {
        Boolean bool;
        InterfaceC74695TTf LLIIJLIL;
        this.isEnterBackground = true;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(MultiLiveGuestMuteAudioEvent.class, new C74631TQt(false, "business_mute_enter_foreground"));
        }
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LLIIJLIL = R6.LLIIJLIL()) != null) {
            LLIIJLIL.pause();
        }
        InterfaceC74605TPt interfaceC74605TPt = this.client;
        if (interfaceC74605TPt != null) {
            interfaceC74605TPt.LIZJ(TokenCert.Companion.with("bpea-voice-linkmic_guestpre_onenterbackground"));
        }
        InterfaceC74612TQa interfaceC74612TQa = (InterfaceC74612TQa) this.mView;
        if (interfaceC74612TQa != null) {
            bool = Boolean.valueOf(interfaceC74612TQa.Ub());
        } else {
            bool = null;
        }
        if (C29306Beo.LJIILLIIL(bool)) {
            WeakHandler weakHandler = this.handler;
            if (weakHandler != null) {
                weakHandler.sendEmptyMessageDelayed(123110, LiveSdkMultiguestPauseTimeoutIntervalSetting.INSTANCE.getValue() * 1000);
            }
            if (!C74838TYs.LJ().LJJIJIIJI) {
                C29556Biq.LIZ().getClass();
                C74736TUu.LJIJJLI("guest_pause", C74983Tbn.LIZJ(), false);
            }
        }
    }

    private final void registerGuestLinkListener() {
        Room room;
        DataChannel dataChannel;
        TQ8 tq8;
        LinkMessageCenter linkMessageCenter;
        MultiGuestDataHolder multiGuestDataHolder;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (room = (Room) dataChannel2.kv0(RoomChannel.class)) == null || (dataChannel = this.dataChannel) == null || (tq8 = (TQ8) C79004UzY.LJIL(dataChannel, TQ8.class)) == null || (linkMessageCenter = (LinkMessageCenter) C75559Tl5.LIZIZ.LIZIZ("LINK_MESSAGE_CENTER")) == null || (multiGuestDataHolder = this.dataHolder) == null) {
            return;
        }
        long LIZ = C025908h.LIZ();
        int i = room.liveRoomMode;
        DataChannel dataChannel3 = this.dataChannel;
        o.LJIIIIZZ(dataChannel3, "dataChannel");
        TTB ttb = new TTB(LIZ, i, multiGuestDataHolder, tq8, dataChannel3, new AqS163S0100000_13(this, 160));
        linkMessageCenter.LIZ(ttb);
        this.guestLinkListener = ttb;
    }

    @Override // X.AbstractC75411Tih, X.AbstractC31497CXt, X.BY9
    public void detachView() {
        LinkMessageCenter linkMessageCenter;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        TTB ttb = this.guestLinkListener;
        if (ttb != null && (linkMessageCenter = (LinkMessageCenter) C75559Tl5.LIZIZ.LIZIZ("LINK_MESSAGE_CENTER")) != null) {
            linkMessageCenter.LJ(ttb);
        }
        MultiGuestDataHolder multiGuestDataHolder = this.dataHolder;
        if (multiGuestDataHolder != null) {
            multiGuestDataHolder.LIZLLL = true;
        }
        super.detachView();
    }

    private final boolean isEngineOn() {
        if (C78886Uxe.LJJJJZ(C8E.LJ()) == 5 || C78886Uxe.LJJJJZ(C8E.LJ()) == 4) {
            return true;
        }
        return false;
    }

    public final void onEnterForeground() {
        InterfaceC74695TTf LLIIJLIL;
        Boolean bool;
        if (isEngineOn() && this.isEnterBackground) {
            TQ6.LIZ = System.currentTimeMillis();
        }
        this.isEnterBackground = false;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            MultiGuestDataHolder multiGuestDataHolder = this.dataHolder;
            if (multiGuestDataHolder != null) {
                bool = Boolean.valueOf(multiGuestDataHolder.LIZLLL);
            } else {
                bool = null;
            }
            dataChannel.qv0(MultiLiveGuestMuteAudioEvent.class, new C74631TQt(C29306Beo.LJJ(bool), "business_mute_enter_foreground"));
        }
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LLIIJLIL = R6.LLIIJLIL()) != null) {
            LLIIJLIL.resume();
        }
        InterfaceC74605TPt interfaceC74605TPt = this.client;
        if (interfaceC74605TPt != null) {
            interfaceC74605TPt.LJIIJ(TokenCert.Companion.with("bpea-voice-linkmic_guestpre_onenterforeground"));
        }
        WeakHandler weakHandler = this.handler;
        if (weakHandler != null) {
            weakHandler.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.AbstractC75411Tih, X.AbstractC31497CXt
    public void attachView(InterfaceC74612TQa view) {
        TZM tzm;
        InterfaceC55235Lm3 linkScope;
        ILinkStateAbility iLinkStateAbility;
        o.LJIIIZ(view, "view");
        super.attachView((VoiceChatGuestPresenter) view);
        this.dataHolder = (MultiGuestDataHolder) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_DATA_HOLDER");
        InterfaceC74612TQa interfaceC74612TQa = (InterfaceC74612TQa) this.mView;
        if (interfaceC74612TQa != null && (linkScope = interfaceC74612TQa.linkScope()) != null && (iLinkStateAbility = (ILinkStateAbility) UC0.LJIIL(linkScope, ILinkStateAbility.class, null)) != null) {
            subscribeStateChange(iLinkStateAbility);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mv0(MultiLiveGuestMuteAudioEvent.class, this, new AqS179S0100000_13(this, 242));
        }
        registerGuestLinkListener();
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (tzm = (TZM) C79004UzY.LJIL(dataChannel2, TZM.class)) != null) {
            tzm.LJJLIIIJJI(1, C78886Uxe.LJJJJLL(C8E.LJ()));
        }
        this.handler = new WeakHandler(this);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        Boolean bool;
        DataChannel dataChannel;
        InterfaceC74612TQa interfaceC74612TQa = (InterfaceC74612TQa) this.mView;
        if (interfaceC74612TQa != null) {
            bool = Boolean.valueOf(interfaceC74612TQa.isValid());
        } else {
            bool = null;
        }
        if (!C29306Beo.LJIL(bool) && message != null && message.what == 123110 && (dataChannel = this.dataChannel) != null) {
            dataChannel.pv0(BackgroundTimeOutEvent.class);
        }
    }

    @Override // X.AbstractC75411Tih
    public void onUserMediaStateListChanged(C74630TQs listState) {
        InterfaceC75441TjB R6;
        InterfaceC74695TTf LLIIJLIL;
        o.LJIIIZ(listState, "listState");
        super.onUserMediaStateListChanged(listState);
        DataChannel dataChannel = this.dataChannel;
        o.LJIIIIZZ(dataChannel, "dataChannel");
        TZM tzm = (TZM) C79004UzY.LJIL(dataChannel, TZM.class);
        if (tzm != null) {
            List<UserState> list = listState.LJLILLLLZI;
            ArrayList arrayList = new ArrayList();
            for (UserState userState : list) {
                if (!o.LJ(userState.linkMicId, C78886Uxe.LJJJJLL(C8E.LJ()))) {
                    arrayList.add(userState);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                UserState userState2 = (UserState) it.next();
                int i = listState.LJLIL;
                if (i == 2 || i == 3) {
                    int i2 = userState2.audioMuted;
                    int i3 = userState2.onlineUserState;
                    int i4 = userState2.rtcConnection;
                    tzm.LJJLIIIJJI(i2, userState2.linkMicId);
                    tzm.LLLLZIL(i3, userState2.linkMicId);
                    tzm.LJJLIIJ(i4, userState2.linkMicId);
                }
            }
            boolean filterStateType = LinkMicStateSetting.INSTANCE.filterStateType();
            if ((listState.LJLJI || filterStateType) && (R6 = C8E.LJ().R6()) != null && (LLIIJLIL = R6.LLIIJLIL()) != null) {
                LLIIJLIL.LJJIIZ("onRemoteMediaChanged");
            }
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.qv0(MultiLiveUserMediaEvent.class, listState);
        }
        InterfaceC74612TQa interfaceC74612TQa = (InterfaceC74612TQa) this.mView;
        if (interfaceC74612TQa != null) {
            interfaceC74612TQa.onUserMediaStateListChanged(listState);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceChatGuestPresenter(LifecycleOwner lifecycleOwner, InterfaceC74605TPt interfaceC74605TPt) {
        super(lifecycleOwner);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.client = interfaceC74605TPt;
    }

    private final boolean changeMediaState(int i, int i2) {
        InterfaceC55235Lm3 interfaceC55235Lm3;
        InterfaceC74612TQa interfaceC74612TQa = (InterfaceC74612TQa) this.mView;
        if (interfaceC74612TQa != null) {
            interfaceC55235Lm3 = interfaceC74612TQa.linkScope();
        } else {
            interfaceC55235Lm3 = null;
        }
        return changeMediaState(interfaceC55235Lm3, i, i2);
    }

    public final void switchAudio(boolean z, String str) {
        Boolean bool;
        TQU LIZLLL;
        TZM tzm;
        boolean z2;
        InterfaceC74695TTf LLIIJLIL;
        InterfaceC74695TTf LLIIJLIL2;
        InterfaceC74695TTf LLIIJLIL3;
        Boolean LJ;
        InterfaceC74612TQa interfaceC74612TQa = (InterfaceC74612TQa) this.mView;
        if (interfaceC74612TQa != null) {
            bool = Boolean.valueOf(interfaceC74612TQa.Ub());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            return;
        }
        if (this.isEnterBackground && z && LinkMicMultiGuestV3BackgroundUseMediaFixSetting.INSTANCE.getValue()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("switchAudio is filtered because it is in the background, source: ");
            LIZ.append(str);
            C0NB.LJIIIIZZ(X1D.LIZIZ(LIZ));
            return;
        }
        String LJJJJLL = C78886Uxe.LJJJJLL(C8E.LJ());
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (tzm = (TZM) C79004UzY.LJIL(dataChannel, TZM.class)) != null) {
            InterfaceC74605TPt interfaceC74605TPt = this.client;
            if (interfaceC74605TPt == null || (LJ = interfaceC74605TPt.LJ()) == null) {
                z2 = false;
            } else {
                z2 = LJ.booleanValue();
            }
            tzm.LLLIIII(LJJJJLL, z, z2);
            if (!changeMediaState(3, tzm.LL(LJJJJLL))) {
                InterfaceC75441TjB R6 = C8E.LJ().R6();
                if (R6 != null && (LLIIJLIL3 = R6.LLIIJLIL()) != null) {
                    LLIIJLIL3.switchAudio(z);
                }
                InterfaceC75441TjB R62 = C8E.LJ().R6();
                if (R62 != null && (LLIIJLIL2 = R62.LLIIJLIL()) != null) {
                    LLIIJLIL2.LJIIIZ(str, z);
                }
                InterfaceC75441TjB R63 = C8E.LJ().R6();
                if (R63 != null && (LLIIJLIL = R63.LLIIJLIL()) != null) {
                    LLIIJLIL.LIZLLL(str, !z);
                }
            }
        }
        InterfaceC74605TPt interfaceC74605TPt2 = this.client;
        if (interfaceC74605TPt2 == null || !(interfaceC74605TPt2 instanceof InterfaceC24140x8)) {
            return;
        }
        InterfaceC75441TjB R64 = C8E.LJ().R6();
        if (R64 != null && (LIZLLL = R64.LIZLLL()) != null) {
            LIZLLL.LIZIZ(Boolean.valueOf(!z), "Livecore.setAudioMute", str, null);
        }
        if (!z) {
            interfaceC74605TPt2.LJFF(true, TokenCert.Companion.with("bpea-voice-linkmic_guestpre_switchaudio_true"));
        } else {
            interfaceC74605TPt2.LJFF(false, TokenCert.Companion.with("bpea-voice-linkmic_guestpre_switchaudio_false"));
        }
    }

    public static /* synthetic */ void switchAudio$default(VoiceChatGuestPresenter voiceChatGuestPresenter, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "business_unknown";
        }
        voiceChatGuestPresenter.switchAudio(z, str);
    }
}
