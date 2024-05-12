package com.bytedance.android.livesdk.guide;

import X.AnimationAnimationListenerC45824Hye;
import X.BZI;
import X.C1FL;
import X.C20940ry;
import X.C221108m2;
import X.C28787BRn;
import X.C29232Bdc;
import X.C29927Bop;
import X.C30079BrH;
import X.C32089Cib;
import X.C32142CjS;
import X.C32314CmE;
import X.C32650Cre;
import X.C32696CsO;
import X.C32837Cuf;
import X.C35558DxS;
import X.C36636EZk;
import X.C36676EaO;
import X.C36701cI;
import X.C48841JEv;
import X.C62822Ol8;
import X.C64962gm;
import X.C73318Sq2;
import X.C73411SrX;
import X.C76825UDd;
import X.C78895Uxn;
import X.CN1;
import X.CountDownTimerC62024OVw;
import X.CountDownTimerC76833UDl;
import X.EnumC31509CYf;
import X.EnumC32853Cuv;
import X.EnumC76830UDi;
import X.InterfaceC65784Pro;
import X.UDZ;
import X.UEB;
import X.WM7;
import X.XKX;
import Y.AObserverS73S0100000_5;
import android.content.Context;
import android.os.SystemClock;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.ai.api.pitaya.GiftGuidePopupNewDescChannel;
import com.bytedance.android.live.ai.api.pitaya.GiftGuideTriggerResultChannel;
import com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.live.room.UserProfileShowingChannel;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.RemindFollowDialogVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.dataChannel.WatchDurationChannel;
import com.bytedance.android.livesdk.guide.model.GuideInfoResponse;
import com.bytedance.android.livesdk.hotword.HotWordGiftShowingChannel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftGuideClientAISettings;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftGuideExpSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGuideDialogDurationOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftOptimizationOptionSetting;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.bytedance.android.livesdkapi.depend.event.LiveExploreDrawerShowChannel;
import com.bytedance.android.livesdkapi.depend.event.LiveGiftBubbleShowEvent;
import com.bytedance.android.livesdkapi.depend.event.LiveGiftShowPinCardEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import djb.IDaS22S0000000_5;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class LiveGiftGuideWidgetV2 extends LiveWidget {
    public UDZ LJLILLLLZI;
    public boolean LJLJI;
    public long LJLJJI;
    public int LJLJJL;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 15));
    public final C73318Sq2 LJLJJLL = new C73318Sq2();
    public final C64962gm LJLJL = C48841JEv.LIZ(C36636EZk.LIZ.plus(new IDaS22S0000000_5(CoroutineExceptionHandler.LJJJJIZL, 1)));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.cvv;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final LiveGiftGuideViewModel LJZ() {
        return (LiveGiftGuideViewModel) this.LJLIL.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C48841JEv.LIZJ(this.LJLJL, null);
        super.onDestroy();
        LiveGiftGuideViewModel LJZ = LJZ();
        IMessageManager iMessageManager = LJZ.LJLIL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(LJZ);
        }
        CountDownTimerC62024OVw countDownTimerC62024OVw = LJZ.LJLJJLL;
        if (countDownTimerC62024OVw != null) {
            countDownTimerC62024OVw.cancel();
        }
        CountDownTimerC76833UDl countDownTimerC76833UDl = LJZ.LJLJL;
        if (countDownTimerC76833UDl != null) {
            countDownTimerC76833UDl.cancel();
        }
        C35558DxS c35558DxS = LJZ.LJLJLJ;
        c35558DxS.LJLIL = 0L;
        c35558DxS.LJLILLLLZI = 0;
        C36676EaO c36676EaO = LJZ.LJLLILLLL;
        c36676EaO.LIZ = true;
        C73411SrX c73411SrX = c36676EaO.LIZIZ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        ConstraintLayout LIZ;
        if (!C32142CjS.LIZ(this.dataChannel) || C29232Bdc.LJFF(this.dataChannel)) {
            return;
        }
        super.show();
        this.LJLJJI = SystemClock.elapsedRealtime();
        UDZ udz = this.LJLILLLLZI;
        if (udz != null && (LIZ = udz.LIZ()) != null) {
            UEB.LIZ(LIZ, null);
        }
        C32089Cib.LJLLILLLL = System.currentTimeMillis();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        ConstraintLayout LIZ;
        int i;
        if (!isShowing()) {
            super.hide();
            return;
        }
        UDZ udz = this.LJLILLLLZI;
        if (udz != null && (LIZ = udz.LIZ()) != null) {
            AqS163S0100000_13 aqS163S0100000_13 = new AqS163S0100000_13(this, 226);
            Context context = LIZ.getContext();
            if (UEB.LIZIZ()) {
                i = R.anim.h_;
            } else {
                i = R.anim.hd;
            }
            Animation exitAnim = AnimationUtils.loadAnimation(context, i);
            o.LJIIIIZZ(exitAnim, "exitAnim");
            exitAnim.setAnimationListener(new AnimationAnimationListenerC45824Hye(LIZ, aqS163S0100000_13));
            LIZ.startAnimation(exitAnim);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        C30079BrH c30079BrH;
        Object obj;
        super.onCreate();
        super.hide();
        LJZ().LJLJLLL.observe(this, new AObserverS73S0100000_5(this, 48));
        LJZ().LJLL.observe(this, new AObserverS73S0100000_5(this, 49));
        LiveGiftGuideViewModel LJZ = LJZ();
        DataChannel dataChannel = this.dataChannel;
        o.LJIIIIZZ(dataChannel, "dataChannel");
        LJZ.getClass();
        LJZ.LJLILLLLZI = dataChannel;
        IMessageManager iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.GIFT_GUIDE_MESSAGE.getIntType(), LJZ);
        } else {
            iMessageManager = null;
        }
        LJZ.LJLIL = iMessageManager;
        EnumC76830UDi.Companion.getClass();
        LiveGiftOptimizationOptionSetting liveGiftOptimizationOptionSetting = LiveGiftOptimizationOptionSetting.INSTANCE;
        if (liveGiftOptimizationOptionSetting.getValue() == EnumC76830UDi.GROUP_2.getValue() || liveGiftOptimizationOptionSetting.getValue() == EnumC76830UDi.GROUP_3.getValue()) {
            DataChannel dataChannel2 = LJZ.LJLILLLLZI;
            if (dataChannel2 != null) {
                dataChannel2.lv0(this, RemindFollowDialogVisibilityChannel.class, new AqS172S0100000_6(LJZ, 96));
                dataChannel2.lv0(this, GiftDialogVisibilityChannel.class, new AqS172S0100000_6(LJZ, 97));
                dataChannel2.lv0(this, UserProfileShowingChannel.class, new AqS172S0100000_6(LJZ, 98));
                dataChannel2.lv0(this, KeyboardStatusChannel.class, new AqS172S0100000_6(LJZ, 99));
                dataChannel2.lv0(this, LiveExploreDrawerShowChannel.class, new AqS172S0100000_6(LJZ, 100));
                dataChannel2.lv0(this, LiveGiftBubbleShowEvent.class, new AqS172S0100000_6(LJZ, 101));
            }
            DataChannelGlobal.LJLJJI.nv0(this, this, LiveGiftShowPinCardEvent.class, new AqS172S0100000_6(LJZ, 102));
        }
        DataChannel dataChannel3 = LJZ.LJLILLLLZI;
        if (dataChannel3 != null) {
            dataChannel3.lv0(this, SubOnlyLiveAudienceStatusChannel.class, new AqS179S0100000_13(LJZ, 485));
        }
        DataChannel dataChannel4 = LJZ.LJLILLLLZI;
        if (dataChannel4 != null) {
            dataChannel4.lv0(this, HotWordGiftShowingChannel.class, new AqS172S0100000_6(LJZ, 103));
        }
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.lv0(this, GiftGuidePopupNewDescChannel.class, new AqS179S0100000_13(this, 486));
        }
        DataChannel dataChannel6 = this.dataChannel;
        if (dataChannel6 != null) {
            dataChannel6.lv0(this, GiftGuideTriggerResultChannel.class, new AqS179S0100000_13(this, 487));
        }
        Object[] objArr = this.args;
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if ((obj2 instanceof C30079BrH) && ((obj = (c30079BrH = (C30079BrH) obj2).LIZ) == null || (obj instanceof IMessage))) {
                    LJZ().onMessage((IMessage) c30079BrH.LIZ);
                }
            }
        }
    }

    public static final /* synthetic */ void LJLZ(LiveGiftGuideWidgetV2 liveGiftGuideWidgetV2) {
        super.hide();
    }

    public final void LJZI(EnumC32853Cuv reason, boolean z, String str, GiftGuideMessage giftGuideMessage) {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        String str2;
        long j;
        Room room;
        long j2;
        int i;
        Room room2;
        if (this.LJLJI || !isShowing()) {
            return;
        }
        int i2 = 1;
        this.LJLJI = true;
        hide();
        Long l5 = null;
        long j3 = 0;
        if (giftGuideMessage != null) {
            LiveGiftGuideViewModel LJZ = LJZ();
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (room2 = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                j2 = room2.getId();
            } else {
                j2 = 0;
            }
            LJZ.getClass();
            o.LJIIIZ(reason, "closeReason");
            if (reason == EnumC32853Cuv.USER_CLOSE) {
                i = 3;
            } else {
                i = 2;
            }
            if (C76825UDd.LIZ(giftGuideMessage)) {
                C32696CsO.LIZIZ(j2, i);
            } else {
                XKX.LIZLLL(ViewModelKt.getViewModelScope(LJZ), null, null, new C32837Cuf(j2, giftGuideMessage, i, null), 3);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLJJI;
        o.LJIIIZ(reason, "reason");
        BZI LIZ = C28787BRn.LIZ("livesdk_gift_guide_popup_close");
        LIZ.LJIJJ(reason.getDesc$livegift_impl_release(), "close_reason");
        LIZ.LJIJJ(C32650Cre.LIZJ, "notification_type");
        C78895Uxn.LIZIZ(LIZ, C32650Cre.LIZIZ, "notification_request_id", z ? 1 : 0, "has_gift_sent_before");
        GuideInfoResponse.UserStats userStats = C32696CsO.LJ;
        if (userStats != null) {
            l = Long.valueOf(userStats.giftPanelShowCnt);
        } else {
            l = null;
        }
        LIZ.LJIJJ(l, "gift_panel_show_cnt");
        GuideInfoResponse.UserStats userStats2 = C32696CsO.LJ;
        if (userStats2 != null) {
            l2 = Long.valueOf(userStats2.shortcutGiftClickCnt);
        } else {
            l2 = null;
        }
        LIZ.LJIJJ(l2, "convenient_gift_click_cnt");
        GuideInfoResponse.UserStats userStats3 = C32696CsO.LJ;
        if (userStats3 != null) {
            l3 = Long.valueOf(userStats3.giftGuidePopupShowCnt);
        } else {
            l3 = null;
        }
        LIZ.LJIJJ(l3, "gift_guide_popup_show_cnt");
        GuideInfoResponse.UserStats userStats4 = C32696CsO.LJ;
        if (userStats4 != null) {
            l4 = Long.valueOf(userStats4.likeCnt);
        } else {
            l4 = null;
        }
        LIZ.LJIJJ(l4, "like_cnt");
        GuideInfoResponse.UserStats userStats5 = C32696CsO.LJ;
        if (userStats5 != null) {
            l5 = Long.valueOf(userStats5.watchDuration);
        }
        LIZ.LJIJJ(l5, "watch_duration");
        LIZ.LJIJJ(C32696CsO.LJFF, "trigger_rule");
        LIZ.LJIJJ(Long.valueOf(elapsedRealtime), "popup_duration");
        if (C32314CmE.LIZIZ() > 0) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        C1FL.LJI(LIZ, str2, "has_coin");
        DataChannel dataChannel2 = this.dataChannel;
        if (this.LJLJJI > 0) {
            j = SystemClock.elapsedRealtime() - this.LJLJJI;
        } else {
            j = 0;
        }
        if (reason != EnumC32853Cuv.SEND) {
            i2 = 0;
        }
        int i3 = LJZ().LJLLI;
        if (((LiveGiftGuideExpSetting.INSTANCE.getValue() == 0 || !LiveGiftGuideClientAISettings.INSTANCE.getValue().enableCollect) && !LiveGuideDialogDurationOptSetting.INSTANCE.enable()) || dataChannel2 == null || (room = (Room) dataChannel2.kv0(RoomChannel.class)) == null) {
            return;
        }
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) dataChannel2.kv0(WatchDurationChannel.class);
        if (interfaceC65784Pro != null) {
            j3 = ((Number) interfaceC65784Pro.invoke()).longValue();
        }
        ((ILiveClientAIService) CN1.LIZ(ILiveClientAIService.class)).UH();
        C36701cI c36701cI = C36701cI.LIZ;
        JSONObject put = new JSONObject().put("room_id", room.getId()).put("watch_duration", j3 / 1000);
        Object obj = ((LinkedHashMap) C32089Cib.LJLL).get(C32650Cre.LIZIZ);
        if (obj == null) {
            obj = "";
        }
        JSONObject put2 = put.put(WM7.SCENE_SERVICE, obj).put("last_gift_guide_ts", C32089Cib.LJLLILLLL).put("has_gift_guide_clicked", i2).put("dialog_display_duration", j).put("total_dialog_duration", i3);
        JSONObject remove = C32089Cib.LJLLLL.remove(str);
        if (remove == null) {
            remove = new JSONObject();
        }
        put2.put("guide_duration_optimize_features", remove);
        C20940ry.LIZ(c36701cI, "gift_guide_result", put2, 0, 12);
    }
}
