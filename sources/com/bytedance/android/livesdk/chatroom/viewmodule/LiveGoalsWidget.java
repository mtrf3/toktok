package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.AbstractC60811Ntn;
import X.B83;
import X.C113554cx;
import X.C15380j0;
import X.C17280m4;
import X.C29306Beo;
import X.C29927Bop;
import X.C29958BpK;
import X.C29959BpL;
import X.C30924CBs;
import X.C36636EZk;
import X.C65232Piu;
import X.C6A;
import X.C6B;
import X.C6D;
import X.C6F;
import X.C6G;
import X.C6K;
import X.C73318Sq2;
import X.C73943T0h;
import X.C78598Ut0;
import X.C78613UtF;
import X.C80955Vpv;
import X.CN1;
import X.EnumC31509CYf;
import X.InterfaceC05190Ih;
import X.InterfaceC06390Mx;
import X.InterfaceC29405BgP;
import X.InterfaceC30925CBt;
import X.InterfaceC60761Nsz;
import X.KL2;
import X.MBA;
import X.OSZ;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.XKQ;
import X.XKX;
import Y.AfS57S0100000_5;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.performance.widget.PerformProcessWidget;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoalServerMessage;
import com.bytedance.android.livesdk.livesetting.banner.LiveGoalSparkOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.DynamicContainerOptSettingV1;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleRevenueWidgetSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetV2RevenueSetting;
import com.bytedance.android.livesdk.model.message.SubWaveMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class LiveGoalsWidget extends PerformProcessWidget implements OnIMMessageListener {
    public ViewGroup LJLIL;
    public C80955Vpv LJLILLLLZI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJI;
    public final C73318Sq2 LJLJJI = new C73318Sq2();
    public C6D LJLJJL;
    public Room LJLJJLL;
    public InterfaceC30925CBt LJLJL;
    public XKQ LJLJLJ;
    public boolean LJLJLLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dpa;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "LiveGoalsWidget";
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return EnableRecycleSingleRevenueWidgetSetting.INSTANCE.getValue();
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        boolean z;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2;
        SparkContext sparkContext;
        XKQ xkq;
        XKQ xkq2 = this.LJLJLJ;
        if (xkq2 != null && !xkq2.isCompleted()) {
            z = true;
        } else {
            z = false;
        }
        if (z && (xkq = this.LJLJLJ) != null) {
            xkq.LIZIZ(null);
        }
        this.LJLJLJ = null;
        DataChannel dataChannel = this.dataChannel;
        o.LJIIIIZZ(dataChannel, "dataChannel");
        IMessageManager iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this);
        }
        C6D c6d = this.LJLJJL;
        if (c6d != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJLJI) != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.getSparkContext()) != null) {
            sparkContext.LJIIJ(AbstractC60811Ntn.class, c6d);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4 = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4 != null) {
            LJZ(false, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4);
        }
        this.LJLJJI.LIZLLL();
        C6F.LIZ = null;
        if (LiveRecycleWidgetV2RevenueSetting.INSTANCE.getValue() && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJI) != null) {
            C29306Beo.LJJIJIIJIL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
        this.LJLJI = null;
        InterfaceC30925CBt interfaceC30925CBt = this.LJLJL;
        if (interfaceC30925CBt != null) {
            interfaceC30925CBt.onUnload();
        }
        this.LJLJJLL = null;
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, "container_disappear", new JSONObject());
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
            JSONObject LIZJ = C65232Piu.LIZJ("type", "app");
            LIZJ.put("args", new JSONObject().put("foreground", false));
            C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2, "H5_appStateChange", LIZJ);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, "container_appear", new JSONObject());
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
            JSONObject LIZJ = C65232Piu.LIZJ("type", "app");
            LIZJ.put("args", new JSONObject().put("foreground", true));
            C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2, "H5_appStateChange", LIZJ);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    public final void LJZI(boolean z) {
        MBA mba;
        C6K LIZIZ = C6F.LIZIZ();
        if (z) {
            LIZIZ.LIZ("init_api", "create_from");
        } else {
            LIZIZ.LIZ("message", "create_from");
        }
        if (DynamicContainerOptSettingV1.enableAsyncGoal()) {
            mba = C78613UtF.LIZJ;
        } else {
            mba = C36636EZk.LIZ;
        }
        this.LJLJLJ = XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), mba, null, new C6A(this, z, null), 2);
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        C80955Vpv c80955Vpv;
        User owner;
        this.LJLIL = (ViewGroup) findViewById(R.id.k98);
        DataChannel dataChannel = this.dataChannel;
        ViewGroup.LayoutParams layoutParams = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLJJLL = room;
        ViewGroup viewGroup = this.LJLIL;
        if (viewGroup instanceof C80955Vpv) {
            c80955Vpv = (C80955Vpv) viewGroup;
        } else {
            c80955Vpv = null;
        }
        this.LJLILLLLZI = c80955Vpv;
        this.LJLJLLL = C29306Beo.LJIIJ(this.dataChannel);
        C80955Vpv c80955Vpv2 = this.LJLILLLLZI;
        if (c80955Vpv2 != null) {
            c80955Vpv2.setEnableFixedSize(DynamicContainerOptSettingV1.enableFixLayout());
        }
        if (!C29306Beo.LJIIJ(this.dataChannel) && LiveGoalSparkOptSetting.INSTANCE.getValue()) {
            DataChannel dataChannel2 = this.dataChannel;
            o.LJIIIIZZ(dataChannel2, "dataChannel");
            IMessageManager iMessageManager = (IMessageManager) dataChannel2.kv0(C29927Bop.class);
            if (iMessageManager != null) {
                iMessageManager.addMessageListener(EnumC31509CYf.STREAM_GOAL_SERVER_MESSAGE.getIntType(), (OnIMMessageListener) this);
                iMessageManager.addMessageListener(EnumC31509CYf.SUB_WAVE_MESSAGE.getIntType(), (OnIMMessageListener) this);
            }
        }
        if (!C29306Beo.LJIIJ(this.dataChannel) && LiveGoalSparkOptSetting.INSTANCE.getValue()) {
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C78613UtF.LIZJ, null, new C6B(this, true, null), 2);
        } else {
            LJZI(true);
        }
        this.LJLJJI.LIZ(C73943T0h.LIZ().LJ(C29958BpK.class).LJJJJZI(new AfS57S0100000_5(this, 84)));
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && o.LJ(dataChannel3.kv0(UserIsAnchorChannel.class), Boolean.FALSE)) {
            ViewGroup viewGroup2 = this.LJLIL;
            if (viewGroup2 != null && (layoutParams = viewGroup2.getLayoutParams()) != null) {
                layoutParams.width = C15380j0.LIZ(82.0f);
            }
            ViewGroup viewGroup3 = this.LJLIL;
            if (viewGroup3 != null) {
                viewGroup3.setLayoutParams(layoutParams);
            }
        } else {
            KL2.LJIJ(C15380j0.LIZ(100.0f), -3, this.LJLIL);
        }
        this.LJLJJI.LIZ(C73943T0h.LIZ().LJ(C29959BpL.class).LJJJJZI(new AfS57S0100000_5(this, 85)));
        ViewGroup viewGroup4 = this.LJLIL;
        if (viewGroup4 != null) {
            C6G.LIZ(C15380j0.LJIJ(viewGroup4.getLayoutParams().width), C15380j0.LJIJ(viewGroup4.getLayoutParams().height), viewGroup4);
        }
        Room room2 = this.LJLJJLL;
        if (room2 != null && (owner = room2.getOwner()) != null && owner.isAnchorHasSubQualification()) {
            InterfaceC06390Mx LIZ = CN1.LIZ(ISubscribeService.class);
            o.LJIIIIZZ(LIZ, "getService(T::class.java)");
            C30924CBs CH = ((ISubscribeService) LIZ).CH();
            this.LJLJL = CH;
            if (CH != null) {
                CH.LIZLLL(this.context, this.dataChannel);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (((iMessage instanceof LiveStreamGoalServerMessage) || (iMessage instanceof SubWaveMessage)) && this.LJLJI == null) {
            LJZI(false);
        }
    }

    public final HashMap<String, Object> LJLZ(String str, String str2) {
        Boolean bool;
        String str3;
        InterfaceC05190Ih interfaceC05190Ih;
        long j;
        String str4;
        User user;
        DataChannel dataChannel = this.dataChannel;
        String str5 = null;
        if (dataChannel != null) {
            bool = Boolean.valueOf(C29306Beo.LJIIJ(dataChannel));
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null) {
            interfaceC05190Ih = LIZIZ.getCurrentUser();
        } else {
            interfaceC05190Ih = null;
        }
        if ((interfaceC05190Ih instanceof User) && (user = (User) interfaceC05190Ih) != null) {
            j = user.getId();
        } else {
            j = 0;
        }
        OSZ[] oszArr = new OSZ[6];
        oszArr[0] = new OSZ("is_anchor", str3);
        oszArr[1] = new OSZ("container_id", str);
        oszArr[2] = new OSZ("url", str2);
        Room room = this.LJLJJLL;
        if (room != null) {
            str4 = C17280m4.LIZ(room);
        } else {
            str4 = null;
        }
        oszArr[3] = new OSZ("room_id", str4);
        Room room2 = this.LJLJJLL;
        if (room2 != null) {
            str5 = Long.valueOf(room2.getOwnerUserId()).toString();
        }
        oszArr[4] = new OSZ("anchor_id", str5);
        oszArr[5] = new OSZ("current_user_id", Long.valueOf(j));
        return C113554cx.LJJJLZIJ(oszArr);
    }

    public final void LJZ(boolean z, SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "refresh";
        } else {
            str = "unmount";
        }
        jSONObject.put("status", str);
        Room room = this.LJLJJLL;
        if (room == null || (str2 = C17280m4.LIZ(room)) == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("roomId", str2);
        InterfaceC60761Nsz interfaceC60761Nsz = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJLIL;
        if (interfaceC60761Nsz != null) {
            interfaceC60761Nsz.LJIIIZ("goal_indicator_load_status_change", jSONObject);
        }
    }
}
