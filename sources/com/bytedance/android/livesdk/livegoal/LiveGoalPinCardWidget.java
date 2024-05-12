package com.bytedance.android.livesdk.livegoal;

import X.AnimationAnimationListenerC29070Bb0;
import X.BII;
import X.C04330Ez;
import X.C05590Jv;
import X.C15380j0;
import X.C199097rd;
import X.C1JD;
import X.C29044Baa;
import X.C29067Bax;
import X.C29068Bay;
import X.C29069Baz;
import X.C29071Bb1;
import X.C29232Bdc;
import X.C29306Beo;
import X.C29927Bop;
import X.C30079BrH;
import X.C32537Cpp;
import X.C72818Shy;
import X.CN1;
import X.CountDownTimerC29073Bb3;
import X.CountDownTimerC29853Bnd;
import X.InterfaceC06390Mx;
import X.InterfaceC40159FpT;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.OSZ;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import Y.IDAListenerS232S0100000_5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.dataChannel.CustomizedPerksCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.QuestionCardVisibilityEvent;
import com.bytedance.android.livesdk.dataChannel.SubGoalCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGoalReverseControlSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftGoalAnchorV2Setting;
import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdkapi.depend.event.LiveGiftShowPinCardEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.google.android.play.core.appupdate.u;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveGoalPinCardWidget extends LiveWidget implements InterfaceC40159FpT, InterfaceC72822Si2 {
    public static final /* synthetic */ int LJLJL = 0;
    public IMessageManager LJLIL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLILLLLZI;
    public FrameLayout LJLJI;
    public CountDownTimerC29073Bb3 LJLJJI;
    public CountDownTimerC29853Bnd LJLJJL;
    public boolean LJLJJLL;

    @Override // X.InterfaceC40159FpT
    public final void LLJIJIL() {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.d5v;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.NV7
    public final void refresh() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        String str;
        if (isShowing()) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            C29068Bay c29068Bay = (C29068Bay) dataChannelGlobal.mv0(LiveGiftShowPinCardEvent.class);
            if (c29068Bay != null && !c29068Bay.LIZ) {
                return;
            }
            C29069Baz.LIZ();
            C29068Bay c29068Bay2 = (C29068Bay) dataChannelGlobal.mv0(LiveGiftShowPinCardEvent.class);
            if (c29068Bay2 == null || (str = c29068Bay2.LJ) == null) {
                str = "";
            }
            C1JD.LJJIJLIJ("lynx_pin_card_closed", new OSZ[]{new OSZ("name", str)});
            View view = getView();
            if (view == null) {
                return;
            }
            AqS155S0100000_5 aqS155S0100000_5 = new AqS155S0100000_5(this, 243);
            if (view.getAlpha() == 0.0f || view.getVisibility() == 8) {
                aqS155S0100000_5.invoke();
                return;
            }
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 1.0f);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.setDuration(500L);
            animationSet.addAnimation(scaleAnimation);
            animationSet.addAnimation(alphaAnimation);
            animationSet.setAnimationListener(new AnimationAnimationListenerC29070Bb0(view, aqS155S0100000_5));
            view.startAnimation(animationSet);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Boolean, O] */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        IMessageManager iMessageManager;
        super.onCreate();
        DataChannel dataChannel = this.dataChannel;
        FrameLayout frameLayout = null;
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
        } else {
            iMessageManager = null;
        }
        this.LJLIL = iMessageManager;
        View view = this.contentView;
        if (view instanceof FrameLayout) {
            frameLayout = (FrameLayout) view;
        }
        this.LJLJI = frameLayout;
        C72818Shy.LIZLLL("live_goal_update_event", this);
        DataChannelGlobal.LJLJJI.ov0(LiveGiftShowPinCardEvent.class, this, new AqS171S0100000_5(this, 643));
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.ov0(this, FrameL2SlotVisibilityChannel.class, new AqS171S0100000_5(this, 638));
            dataChannel2.ov0(this, QuestionCardVisibilityEvent.class, new AqS171S0100000_5(this, 639));
            dataChannel2.ov0(this, SubOnlyLiveAudienceStatusChannel.class, new AqS171S0100000_5(this, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT));
            dataChannel2.ov0(this, CustomizedPerksCardVisibilityChannel.class, new AqS171S0100000_5(this, 641));
            dataChannel2.ov0(this, SubGoalCardVisibilityChannel.class, new AqS171S0100000_5(this, 642));
        }
        Object[] objArr = this.args;
        if (objArr != null) {
            boolean z = false;
            for (Object obj : objArr) {
                if (obj instanceof C30079BrH) {
                    Object obj2 = ((C30079BrH) obj).LIZ;
                    if (obj2 instanceof C29068Bay) {
                        o.LJII(obj2, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.event.GiftPinCardInfo");
                        LJZI((C29068Bay) obj2);
                        z = true;
                    }
                }
            }
            if (z) {
                return;
            }
        }
        C29069Baz.LIZ();
        ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29067Bax.class)).LIZ = Boolean.FALSE;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        CountDownTimerC29073Bb3 countDownTimerC29073Bb3 = this.LJLJJI;
        if (countDownTimerC29073Bb3 != null) {
            countDownTimerC29073Bb3.cancel();
        }
        CountDownTimerC29853Bnd countDownTimerC29853Bnd = this.LJLJJL;
        if (countDownTimerC29853Bnd != null) {
            countDownTimerC29853Bnd.cancel();
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLILLLLZI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
        C29069Baz.LIZ();
        C72818Shy.LJII("live_goal_update_event", this);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        View view = getView();
        if (view != null) {
            AqS155S0100000_5 aqS155S0100000_5 = new AqS155S0100000_5(this, 244);
            Animation animation = view.getAnimation();
            if (animation != null && animation.hasStarted()) {
                aqS155S0100000_5.invoke();
                return;
            }
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 1.0f);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.setDuration(500L);
            animationSet.addAnimation(scaleAnimation);
            animationSet.addAnimation(alphaAnimation);
            animationSet.setAnimationListener(new IDAListenerS232S0100000_5(aqS155S0100000_5, 10));
            view.startAnimation(animationSet);
        }
    }

    @Override // X.InterfaceC40159FpT
    public final void close() {
        hide();
    }

    public static final /* synthetic */ void LJLZ(LiveGoalPinCardWidget liveGoalPinCardWidget) {
        super.hide();
    }

    public static final /* synthetic */ void LJZ(LiveGoalPinCardWidget liveGoalPinCardWidget) {
        super.show();
    }

    public final void LJZI(C29068Bay c29068Bay) {
        Long l;
        String str;
        ViewGroup.LayoutParams layoutParams;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        long currentTimeMillis = (c29068Bay.LJFF * 1000) - System.currentTimeMillis();
        if (c29068Bay.LIZ && o.LJ(c29068Bay.LIZLLL, l) && currentTimeMillis > 0) {
            CountDownTimerC29073Bb3 countDownTimerC29073Bb3 = this.LJLJJI;
            if (countDownTimerC29073Bb3 != null) {
                countDownTimerC29073Bb3.cancel();
            }
            if (this.context == null || (str = c29068Bay.LIZJ) == null || str.length() == 0 || C29232Bdc.LJFF(this.dataChannel)) {
                return;
            }
            InterfaceC06390Mx LIZ = CN1.LIZ(IHybridContainerService.class);
            o.LJIIIIZZ(LIZ, "getService(IHybridContainerService::class.java)");
            IHybridContainerService iHybridContainerService = (IHybridContainerService) LIZ;
            Context context = this.context;
            o.LJIIIIZZ(context, "context");
            String str2 = c29068Bay.LIZJ;
            if (str2 == null) {
                str2 = "";
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZIZ = C05590Jv.LIZIZ(iHybridContainerService, context, str2, false, new C29071Bb1(c29068Bay, this, currentTimeMillis), 4);
            this.LJLILLLLZI = LIZIZ;
            if (LIZIZ != null) {
                LIZIZ.setBackgroundColor(C04330Ez.LIZIZ(this.context, R.color.yi));
            }
            FrameLayout frameLayout = this.LJLJI;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            FrameLayout frameLayout2 = this.LJLJI;
            if (frameLayout2 != null) {
                frameLayout2.addView(this.LJLILLLLZI, -1, -1);
            }
            FrameLayout frameLayout3 = this.LJLJI;
            if (frameLayout3 == null || (layoutParams = frameLayout3.getLayoutParams()) == null) {
                return;
            }
            layoutParams.height = C15380j0.LIZ(c29068Bay.LIZIZ);
            layoutParams.width = -1;
            FrameLayout frameLayout4 = this.LJLJI;
            if (frameLayout4 == null) {
                return;
            }
            frameLayout4.setLayoutParams(layoutParams);
        }
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        Integer num;
        C29068Bay c29068Bay;
        if (o.LJ("live_goal_update_event", c199097rd.LJLIL)) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            Boolean bool = null;
            if (interfaceC78280Uns != null) {
                num = Integer.valueOf(u.LJJIJIIJI(interfaceC78280Uns, "goalStatus", 0));
                bool = Boolean.valueOf(u.LJJIIZI(interfaceC78280Uns, "pinned", false));
            } else {
                num = null;
            }
            if (!LiveGoalReverseControlSetting.INSTANCE.enableReverse() && LiveGiftGoalAnchorV2Setting.INSTANCE.getValue() && o.LJ(bool, Boolean.FALSE)) {
                int code = BII.ONGOING.getCode();
                if (num == null || num.intValue() != code || !C29306Beo.LJIIJ(this.dataChannel) || this.LJLJJLL || (c29068Bay = (C29068Bay) DataChannelGlobal.LJLJJI.mv0(LiveGiftShowPinCardEvent.class)) == null || c29068Bay.LIZ) {
                    return;
                }
                CountDownTimerC29853Bnd countDownTimerC29853Bnd = new CountDownTimerC29853Bnd(this);
                this.LJLJJL = countDownTimerC29853Bnd;
                countDownTimerC29853Bnd.start();
                this.LJLJJLL = true;
            }
        }
    }
}
