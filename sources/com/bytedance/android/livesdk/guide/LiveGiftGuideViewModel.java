package com.bytedance.android.livesdk.guide;

import X.C0IT;
import X.C0NB;
import X.C22810uz;
import X.C22820v0;
import X.C29306Beo;
import X.C29921Fk;
import X.C31120CJg;
import X.C32650Cre;
import X.C32835Cud;
import X.C32836Cue;
import X.C32840Cui;
import X.C35201Zs;
import X.C35558DxS;
import X.C36676EaO;
import X.C76825UDd;
import X.CN1;
import X.CountDownTimerC62024OVw;
import X.CountDownTimerC76833UDl;
import X.EnumC32853Cuv;
import X.EnumC76826UDe;
import X.EnumC76830UDi;
import X.InterfaceC22790ux;
import X.OSZ;
import X.X1D;
import X.XKX;
import android.os.SystemClock;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.dataChannel.FullScreenSurveyShowing;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftGuideClientAISettings;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftUserConsumeLayerSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGuideDialogDurationOptSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGuideDialogDurationSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftOptimizationOptionSetting;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class LiveGiftGuideViewModel extends ViewModel implements OnMessageListener {
    public IMessageManager LJLIL;
    public DataChannel LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public CountDownTimerC62024OVw LJLJJLL;
    public CountDownTimerC76833UDl LJLJL;
    public int LJLLI;
    public final C35558DxS LJLJLJ = new C35558DxS();
    public final MutableLiveData<OSZ<GiftGuideMessage, Boolean>> LJLJLLL = new MutableLiveData<>();
    public final MutableLiveData<OSZ<Boolean, EnumC32853Cuv>> LJLL = new MutableLiveData<>();
    public final C36676EaO LJLLILLLL = new C36676EaO();

    public final void iv0() {
        GiftGuideMessage giftGuideMessage;
        this.LJLJLJ.LJLIL = SystemClock.uptimeMillis();
        OSZ<GiftGuideMessage, Boolean> value = this.LJLJLLL.getValue();
        if (value != null) {
            giftGuideMessage = value.getFirst();
        } else {
            giftGuideMessage = null;
        }
        onMessage(giftGuideMessage);
    }

    public final void hv0(boolean z) {
        if (z) {
            this.LJLL.setValue(new OSZ<>(Boolean.FALSE, EnumC32853Cuv.OTHER));
        } else {
            OSZ<GiftGuideMessage, Boolean> value = this.LJLJLLL.getValue();
            if (value != null && value.getFirst() != null) {
                CountDownTimerC62024OVw countDownTimerC62024OVw = new CountDownTimerC62024OVw(this);
                this.LJLJJLL = countDownTimerC62024OVw;
                countDownTimerC62024OVw.start();
            }
        }
        this.LJLJJI = z;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof GiftGuideMessage) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C32836Cue(this, iMessage, null), 3);
        }
    }

    public final void gv0(GiftGuideMessage giftGuideMessage, boolean z) {
        boolean z2;
        boolean z3;
        String str;
        int i;
        long j;
        User owner;
        Long l;
        String str2;
        EnumC76826UDe[] values = EnumC76826UDe.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (EnumC76826UDe enumC76826UDe : values) {
            arrayList.add(enumC76826UDe.getValue());
        }
        if (!arrayList.contains(giftGuideMessage.guideType) || o.LJ(giftGuideMessage.guideType, "gift_guide_bubble") || GiftManager.inst().findGiftById(giftGuideMessage.giftId) == null || this.LJLJJI) {
            return;
        }
        if (!this.LJLJJL || z) {
            DataChannel dataChannel = this.LJLILLLLZI;
            if (dataChannel != null && o.LJ(dataChannel.kv0(UserIsAnchorChannel.class), Boolean.TRUE)) {
                return;
            }
            EnumC76830UDi.Companion.getClass();
            IInteractService iInteractService = C31120CJg.LIZ;
            boolean Vc = iInteractService.Vc();
            boolean Zs0 = iInteractService.Zs0();
            LiveGiftOptimizationOptionSetting liveGiftOptimizationOptionSetting = LiveGiftOptimizationOptionSetting.INSTANCE;
            if (liveGiftOptimizationOptionSetting.getValue() == EnumC76830UDi.GROUP_1.getValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (liveGiftOptimizationOptionSetting.getValue() == EnumC76830UDi.GROUP_3.getValue()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (Vc && !Zs0 && (z2 || z3)) {
                return;
            }
            DataChannel dataChannel2 = this.LJLILLLLZI;
            if ((dataChannel2 != null && o.LJ(dataChannel2.kv0(FullScreenSurveyShowing.class), Boolean.TRUE)) || this.LJLJI) {
                return;
            }
            CommonMessageData commonMessageData = giftGuideMessage.baseMessage;
            String str3 = null;
            if (commonMessageData != null) {
                str3 = commonMessageData.logId;
            }
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            if (C76825UDd.LIZIZ(giftGuideMessage)) {
                str = EnumC76826UDe.GIFT_GUIDE_POPUP_NEW_GIFTER.getValue();
            } else if (z) {
                str = EnumC76826UDe.GIFT_GUIDE_POPUP_RECHARGE.getValue();
            } else {
                str = giftGuideMessage.guideType;
            }
            o.LJIIIZ(str, "<set-?>");
            C32650Cre.LIZJ = str;
            CommonMessageData commonMessageData2 = giftGuideMessage.baseMessage;
            if (commonMessageData2 != null && (str2 = commonMessageData2.logId) != null) {
                str4 = str2;
            }
            C32650Cre.LIZIZ = str4;
            C36676EaO c36676EaO = this.LJLLILLLL;
            DataChannel dataChannel3 = this.LJLILLLLZI;
            String type = giftGuideMessage.guideType;
            boolean z4 = giftGuideMessage.hasSent;
            C32840Cui c32840Cui = new C32840Cui(giftGuideMessage, this, z);
            c36676EaO.getClass();
            o.LJIIIZ(type, "type");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Enable predict --- ");
            LiveGuideDialogDurationOptSetting liveGuideDialogDurationOptSetting = LiveGuideDialogDurationOptSetting.INSTANCE;
            LIZ.append(liveGuideDialogDurationOptSetting.enable());
            C0NB.LJIIIZ("LiveGiftGuideDialogClientAIAdjuster", X1D.LIZIZ(LIZ));
            if (liveGuideDialogDurationOptSetting.enable() && dataChannel3 != null) {
                InterfaceC22790ux LJFF = C0IT.LJFF();
                JSONObject putOpt = new JSONObject().putOpt("room_id", Long.valueOf(C29306Beo.LJJIZ(dataChannel3)));
                Room LJJIJLIJ = C29306Beo.LJJIJLIJ(dataChannel3);
                if (LJJIJLIJ != null && (owner = LJJIJLIJ.getOwner()) != null && (l = owner.followStatus) != null) {
                    i = (int) l.longValue();
                } else {
                    i = 0;
                }
                JSONObject putOpt2 = putOpt.putOpt("initial_follow_status", Integer.valueOf(i)).putOpt("gift_guide_log_id", str3).putOpt("user_consume_layer", Integer.valueOf(LiveGiftUserConsumeLayerSetting.INSTANCE.getValue())).putOpt("guide_type", type).putOpt("has_sent", Integer.valueOf(z4 ? 1 : 0));
                IWalletCenter walletCenter = ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter();
                if (walletCenter != null) {
                    j = ((WalletCenter) walletCenter).LIZ();
                } else {
                    j = 0;
                }
                ((C29921Fk) LJFF).LIZJ(new C22810uz("live_gift_guide_dialog_duration_predict", new C22820v0(false, putOpt2.putOpt("available_diamonds", Long.valueOf(j))), new C32835Cud(dataChannel3, c32840Cui, c36676EaO, str3), new C35201Zs(0, false, 0, 0L, 0L, LiveGiftGuideClientAISettings.INSTANCE.getValue().taskTimeout, 31), 8));
                return;
            }
            c32840Cui.invoke(Integer.valueOf(LiveGuideDialogDurationSetting.INSTANCE.getValue()));
        }
    }
}
