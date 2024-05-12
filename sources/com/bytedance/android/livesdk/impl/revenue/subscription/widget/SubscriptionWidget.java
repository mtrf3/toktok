package com.bytedance.android.livesdk.impl.revenue.subscription.widget;

import X.AbstractC73672Svk;
import X.B83;
import X.BCW;
import X.C09650Zl;
import X.C0NB;
import X.C16880lQ;
import X.C199097rd;
import X.C28467BFf;
import X.C28546BIg;
import X.C29063Bat;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29927Bop;
import X.C30843C8p;
import X.C30846C8s;
import X.C30847C8t;
import X.C30848C8u;
import X.C30850C8w;
import X.C30852C8y;
import X.C30929CBx;
import X.C32537Cpp;
import X.C36301be;
import X.C62705OjF;
import X.C72818Shy;
import X.C73943T0h;
import X.C90;
import X.C91;
import X.C94;
import X.CBN;
import X.CN1;
import X.EnumC30931CBz;
import X.EnumC31509CYf;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.Q7L;
import Y.ARunnableS41S0100000_5;
import Y.AfS57S0100000_5;
import Y.IDhS98S0100000_5;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SubscribeSubOnlyOnBoardingOpen;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscribeCommunitySetting;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleWidgetSetting;
import com.bytedance.android.livesdk.livesetting.performance.RoomSlowFunctionOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubsPrivilegeDetailOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.android.play.core.appupdate.u;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* loaded from: classes6.dex */
public final class SubscriptionWidget extends RoomRecycleWidget implements InterfaceC72822Si2, OnMessageListener, C94 {
    public Room LJLIL;
    public boolean LJLILLLLZI;
    public volatile boolean LJLJI;
    public IMessageManager LJLJJL;
    public final Handler LJLJJI = new Handler(C16880lQ.LLJJJJ());
    public String LJLJJLL = "";
    public final C30847C8t LJLJL = new C30847C8t(this);

    public final void LJLZ() {
        C30846C8s.LIZIZ = true;
        Room room = this.LJLIL;
        o.LJI(room);
        String idStr = room.getIdStr();
        Room room2 = this.LJLIL;
        o.LJI(room2);
        String LIZJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZJ(room2.getOwner().getId());
        if (TextUtils.isEmpty(idStr) || TextUtils.isEmpty(LIZJ) || TextUtils.isEmpty(idStr) || TextUtils.isEmpty(LIZJ)) {
            return;
        }
        C30850C8w c30850C8w = C30850C8w.LJLIL;
        if (RoomSlowFunctionOptSetting.watchOpt()) {
            AbstractC73672Svk<C28467BFf<m>> subPrivilegeDetail = ((SubscribeApi) Q7L.LIZIZ(SubscribeApi.class)).getSubPrivilegeDetail(idStr, LIZJ, 3);
            o.LJIIIIZZ(subPrivilegeDetail, "get().getService(Subscri…NEFIT_VIEW_SCENE_PRELOAD)");
            C30929CBx.LJIIJJI(subPrivilegeDetail, EnumC30931CBz.PRIVILEGE, this.LJLJJLL, C30843C8p.LJLIL).LJJIJL(new IDhS98S0100000_5(this, 1)).LJII(new C62705OjF()).LJJJLIIL(C30848C8u.LJLIL, new AfS57S0100000_5(c30850C8w, 127));
        } else {
            AbstractC73672Svk<C28467BFf<m>> subPrivilegeDetail2 = ((SubscribeApi) Q7L.LIZIZ(SubscribeApi.class)).getSubPrivilegeDetail(idStr, LIZJ, 3);
            o.LJIIIIZZ(subPrivilegeDetail2, "get().getService(Subscri…NEFIT_VIEW_SCENE_PRELOAD)");
            C30929CBx.LJIIJJI(subPrivilegeDetail2, EnumC30931CBz.PRIVILEGE, this.LJLJJLL, C30843C8p.LJLIL).LJII(new C62705OjF()).LJJJLIIL(new AfS57S0100000_5(this, 126), new AfS57S0100000_5(c30850C8w, 127));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return EnableRecycleSingleWidgetSetting.INSTANCE.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Boolean, O] */
    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        super.onUnload();
        C0NB.LJIIIZ("SubscriptionWidget", "onUnLoad");
        this.LJLJI = false;
        ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29063Bat.class)).LIZ = Boolean.TRUE;
        this.LJLJJI.removeCallbacksAndMessages(null);
        Looper.myQueue().removeIdleHandler(this.LJLJL);
        C72818Shy.LJII("sub_indicator_has_ongoing_goal", this);
        C72818Shy.LJII("live_lynx_sub_onboarding_open", this);
        C72818Shy.LJII("live_lynx_sub_onboarding_close", this);
        C72818Shy.LJII("open_native_sub_privilege_detail", this);
        ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).xg0();
        IMessageManager iMessageManager = this.LJLJJL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        C30846C8s.LIZLLL = null;
        C30846C8s.LJ = null;
        ((ArrayList) C30846C8s.LJFF).clear();
        C30846C8s.LIZ = false;
        C30846C8s.LIZIZ = false;
        C30846C8s.LIZJ = false;
    }

    @Override // X.C94
    public final void LJIILJJIL() {
        LJLZ();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Boolean, O] */
    public final C30852C8y<GetSubPrivilegeDetailResponse.Data> LJZ(C28467BFf<m> c28467BFf) {
        boolean z;
        boolean z2;
        j LJJIJ;
        j LJJIJ2;
        if (c28467BFf == null || c28467BFf.data == null) {
            return new C30852C8y<>(null);
        }
        if (!this.LJLJI) {
            return new C30852C8y<>(null);
        }
        ((IBrowserService) CN1.LIZ(IBrowserService.class)).qk0(this.context, c28467BFf.data.toString(), "user_subscribe_entry_info");
        m mVar = c28467BFf.data;
        if (mVar == null) {
            mVar = new m();
        }
        j LJJIJ3 = mVar.LJJIJ("sub_note_info");
        boolean z3 = true;
        if (LJJIJ3 != null && (LJJIJ2 = LJJIJ3.LJIIZILJ().LJJIJ("show_note_detail")) != null) {
            z = LJJIJ2.LJFF();
        } else {
            z = true;
        }
        j LJJIJ4 = mVar.LJJIJ("community_detail");
        if (LJJIJ4 == null || (LJJIJ = LJJIJ4.LJIIZILJ().LJJIJ("community_content_list")) == null || new C36301be(LJJIJ.LJIILLIIL()).isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = !z2;
        boolean value = SubscribeCommunitySetting.INSTANCE.getValue();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        if (!z && (!z4 || !value)) {
            z3 = false;
        }
        ((C32537Cpp) dataChannelGlobal.gv0(C29063Bat.class)).LIZ = Boolean.valueOf(z3);
        if (RoomSlowFunctionOptSetting.watchOpt()) {
            return new C30852C8y<>(GsonProtectorUtils.fromJson(C09650Zl.LIZJ, (j) c28467BFf.data, GetSubPrivilegeDetailResponse.Data.class));
        }
        return new C30852C8y<>(GsonProtectorUtils.fromJson(C09650Zl.LIZJ, c28467BFf.data.toString(), GetSubPrivilegeDetailResponse.Data.class));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C0NB.LJIIIZ("SubscriptionWidget", "onInIt");
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        boolean z;
        IMessageManager iMessageManager;
        User owner;
        Boolean bool;
        Boolean bool2;
        super.onLoad(objArr);
        C0NB.LJIIIZ("SubscriptionWidget", "onLoad");
        this.LJLJI = true;
        DataChannel dataChannel = this.dataChannel;
        Boolean bool3 = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLIL = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (bool2 = (Boolean) dataChannel2.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool2.booleanValue();
        } else {
            z = false;
        }
        this.LJLILLLLZI = z;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (bool = (Boolean) dataChannel3.kv0(BCW.class)) != null) {
            bool.booleanValue();
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            iMessageManager = (IMessageManager) dataChannel4.kv0(C29927Bop.class);
        } else {
            iMessageManager = null;
        }
        this.LJLJJL = iMessageManager;
        C72818Shy.LIZLLL("sub_indicator_has_ongoing_goal", this);
        C72818Shy.LIZLLL("live_lynx_sub_onboarding_open", this);
        C72818Shy.LIZLLL("live_lynx_sub_onboarding_close", this);
        C72818Shy.LIZLLL("open_native_sub_privilege_detail", this);
        Room room2 = this.LJLIL;
        if (room2 != null && (owner = room2.getOwner()) != null) {
            bool3 = Boolean.valueOf(owner.isAnchorHasSubQualification());
        }
        if (C29306Beo.LJJIFFI(bool3)) {
            LiveSubsPrivilegeDetailOptSetting liveSubsPrivilegeDetailOptSetting = LiveSubsPrivilegeDetailOptSetting.INSTANCE;
            if (!liveSubsPrivilegeDetailOptSetting.getValue().preloadDataIdle) {
                this.LJLJJI.postDelayed(new ARunnableS41S0100000_5(this, 321), 2000L);
            }
            this.LJLJJI.postDelayed(new ARunnableS41S0100000_5(this, 322), liveSubsPrivilegeDetailOptSetting.getValue().preloadDelay);
        }
        IMessageManager iMessageManager2 = this.LJLJJL;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(EnumC31509CYf.MEMBER.getIntType(), this);
        }
        IMessageManager iMessageManager3 = this.LJLJJL;
        if (iMessageManager3 != null) {
            iMessageManager3.addMessageListener(EnumC31509CYf.SUB_NOTIFY_MESSAGE.getIntType(), this);
        }
        C73943T0h.LIZ().LIZJ(this, C28546BIg.class).LIZIZ(new AfS57S0100000_5(this, 125));
        C30846C8s.LJ = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
    
        if (r8 == null) goto L39;
     */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.bytedance.android.livesdk.model.message.MemberMessage
            r7 = 1
            if (r0 == 0) goto Lb7
            com.bytedance.android.livesdk.model.message.MemberMessage r10 = (com.bytedance.android.livesdk.model.message.MemberMessage) r10
            int r3 = r10.action
            r0 = 5
            if (r3 == r0) goto Lac
            r0 = 6
            if (r3 == r0) goto Lac
            r0 = 20
            if (r3 == r0) goto Lac
            r0 = 28
            r1 = 1
            if (r3 == r0) goto L3a
            r0 = 36
            if (r3 == r0) goto L1e
        L1d:
            return
        L1e:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r9.LJLIL
            if (r0 != 0) goto L37
        L22:
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r9.dataChannel
            boolean r0 = X.C29232Bdc.LJFF(r0)
            if (r0 == 0) goto L1d
            X.T0h r1 = X.C73943T0h.LIZ()
            X.B3N r0 = new X.B3N
            r0.<init>(r7)
            r1.LIZIZ(r0)
            goto L1d
        L37:
            r0.disablePreviewSubOnly = r1
            goto L22
        L3a:
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r9.dataChannel
            if (r3 == 0) goto L1d
            java.lang.Class<X.BCW> r0 = X.BCW.class
            java.lang.Object r3 = r3.kv0(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 == 0) goto L1d
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r9.LJLIL
            if (r0 != 0) goto L96
        L50:
            X.BWZ r0 = X.BWZ.SUB_ONLY
            X.BYI.LIZJ(r0)
            X.2yf r4 = new X.2yf
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 0
            java.lang.String r0 = "switch_sub_only_live"
            r4.<init>(r1, r3, r0)
            X.C72818Shy.LIZ(r4)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r9.dataChannel
            boolean r0 = X.C29232Bdc.LJFF(r0)
            if (r0 == 0) goto L99
            long r5 = r10.allowPreviewTime
            com.bytedance.android.livesdkapi.depend.model.live.Room r8 = r9.LJLIL
            if (r8 == 0) goto L93
            long r3 = r8.maxPreviewTime
        L74:
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L90
            if (r8 == 0) goto L83
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L81
            r5 = r3
        L81:
            r8.allowPreviewTime = r5
        L83:
            X.T0h r1 = X.C73943T0h.LIZ()
            X.B3N r0 = new X.B3N
            r0.<init>(r7)
            r1.LIZIZ(r0)
            goto L1d
        L90:
            if (r8 != 0) goto L81
            goto L83
        L93:
            r3 = -1
            goto L74
        L96:
            r0.liveSubOnly = r1
            goto L50
        L99:
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r9.dataChannel
            boolean r0 = X.C29232Bdc.LJIILLIIL(r0)
            if (r0 == 0) goto L1d
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r9.dataChannel
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel> r1 = com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel.class
            X.BKI r0 = X.BKI.SUBSCRIBER_NORMAL_LIVE
            r2.rv0(r1, r0)
            goto L1d
        Lac:
            X.C30846C8s.LIZJ = r7
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = r9.LJLIL
            java.lang.String r0 = r9.LJLJJLL
            X.C30846C8s.LIZJ(r1, r0)
            goto L1d
        Lb7:
            boolean r0 = r10 instanceof com.bytedance.android.livesdk.model.message.SubNotifyMessage
            if (r0 == 0) goto L1d
            com.bytedance.android.livesdk.model.message.SubNotifyMessage r10 = (com.bytedance.android.livesdk.model.message.SubNotifyMessage) r10
            int r1 = r10.subscribeMessageType
            r0 = 12
            if (r1 != r0) goto L1d
            X.C30846C8s.LIZJ = r7
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = r9.LJLIL
            java.lang.String r0 = r9.LJLJJLL
            X.C30846C8s.LIZJ(r1, r0)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.subscription.widget.SubscriptionWidget.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [X.C90, O] */
    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        DataChannel dataChannel;
        Boolean bool;
        InterfaceC78280Uns interfaceC78280Uns;
        Boolean bool2;
        String str;
        String str2;
        InterfaceC78280Uns interfaceC78280Uns2;
        String LJJIJIL;
        User owner;
        InterfaceC78280Uns interfaceC78280Uns3;
        InterfaceC78280Uns interfaceC78280Uns4;
        Map<String, Object> LIZIZ;
        DataChannel dataChannel2;
        String str3 = c199097rd.LJLIL;
        String str4 = "";
        Boolean bool3 = null;
        switch (str3.hashCode()) {
            case -1791520632:
                if (!str3.equals("live_lynx_sub_onboarding_close") || (dataChannel2 = this.dataChannel) == null) {
                    return;
                }
                dataChannel2.rv0(SubscribeSubOnlyOnBoardingOpen.class, Boolean.FALSE);
                return;
            case -272510863:
                if (!str3.equals("open_native_sub_privilege_detail")) {
                    return;
                }
                InterfaceC78280Uns interfaceC78280Uns5 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns5 != null) {
                    interfaceC78280Uns4 = u.LJJIJIIJIL(interfaceC78280Uns5, "extra_params");
                } else {
                    interfaceC78280Uns4 = null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (interfaceC78280Uns4 != null && (LIZIZ = interfaceC78280Uns4.LIZIZ()) != null) {
                    for (Map.Entry<String, Object> entry : LIZIZ.entrySet()) {
                        linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                }
                Room room = this.LJLIL;
                if (room == null) {
                    return;
                }
                Context context = this.context;
                o.LJIIIIZZ(context, "context");
                String str5 = (String) linkedHashMap.get("show_entrance");
                if (str5 != null) {
                    str4 = str5;
                }
                CBN.LIZJ(context, room, str4, linkedHashMap, null);
                return;
            case 260701291:
                if (!str3.equals("sub_indicator_has_ongoing_goal")) {
                    return;
                }
                InterfaceC78280Uns interfaceC78280Uns6 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns6 != null) {
                    bool = Boolean.valueOf(interfaceC78280Uns6.hasKey("hasOngoingGoal"));
                } else {
                    bool = null;
                }
                if (C29306Beo.LJIL(bool) || (interfaceC78280Uns = c199097rd.LJLILLLLZI) == null) {
                    return;
                }
                boolean LJJIIZI = u.LJJIIZI(interfaceC78280Uns, "hasOngoingGoal", false);
                InterfaceC78280Uns interfaceC78280Uns7 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns7 != null) {
                    bool2 = Boolean.valueOf(interfaceC78280Uns7.hasKey("anchorUid"));
                } else {
                    bool2 = null;
                }
                if (!C29306Beo.LJJIFFI(bool2) || (interfaceC78280Uns3 = c199097rd.LJLILLLLZI) == null || (str = u.LJJIJIL(interfaceC78280Uns3, "anchorUid", "")) == null) {
                    str = "";
                }
                if (!o.LJ(str, "")) {
                    Room room2 = this.LJLIL;
                    if (room2 != null && (owner = room2.getOwner()) != null) {
                        str2 = owner.getIdStr();
                    } else {
                        str2 = null;
                    }
                    if (!o.LJ(str2, str)) {
                        return;
                    }
                    if (LJJIIZI) {
                        InterfaceC78280Uns interfaceC78280Uns8 = c199097rd.LJLILLLLZI;
                        if (interfaceC78280Uns8 != null) {
                            bool3 = Boolean.valueOf(interfaceC78280Uns8.hasKey("goalId"));
                        }
                        if (C29306Beo.LJJIFFI(bool3) && (interfaceC78280Uns2 = c199097rd.LJLILLLLZI) != null && (LJJIJIL = u.LJJIJIL(interfaceC78280Uns2, "goalId", "")) != null) {
                            str4 = LJJIJIL;
                        }
                    }
                    DataChannel dataChannel3 = this.dataChannel;
                    if (dataChannel3 == null) {
                        return;
                    }
                    ((C32537Cpp) dataChannel3.gv0(C91.class)).LIZ = new C90(LJJIIZI, str4);
                    return;
                }
                return;
            case 358212026:
                if (!str3.equals("live_lynx_sub_onboarding_open") || (dataChannel = this.dataChannel) == null) {
                    return;
                }
                dataChannel.rv0(SubscribeSubOnlyOnBoardingOpen.class, Boolean.TRUE);
                return;
            default:
                return;
        }
    }
}
