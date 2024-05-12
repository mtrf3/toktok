package com.bytedance.android.livesdk.userinfowidget;

import X.ActivityC45651qj;
import X.AnonymousClass064;
import X.B5G;
import X.B76;
import X.B77;
import X.B83;
import X.BJB;
import X.BJM;
import X.BU8;
import X.BZI;
import X.C018905p;
import X.C0NB;
import X.C15380j0;
import X.C15620jO;
import X.C15640jQ;
import X.C15700jW;
import X.C16880lQ;
import X.C199097rd;
import X.C1Q4;
import X.C259710f;
import X.C259910h;
import X.C28294B8o;
import X.C28329B9x;
import X.C28594BKc;
import X.C28787BRn;
import X.C28835BTj;
import X.C28965BYj;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29494Bhq;
import X.C29504Bi0;
import X.C29719BlT;
import X.C29722BlW;
import X.C29726Bla;
import X.C29727Blb;
import X.C29822Bn8;
import X.C29927Bop;
import X.C2A4;
import X.C2A8;
import X.C31597Caf;
import X.C32205CkT;
import X.C32537Cpp;
import X.C38354F3m;
import X.C47061t0;
import X.C47121t6;
import X.C48459J0d;
import X.C57562Ns;
import X.C72818Shy;
import X.C73318Sq2;
import X.C73943T0h;
import X.C74838TYs;
import X.C78501UrR;
import X.C87095YGd;
import X.CCJ;
import X.CL0;
import X.CN1;
import X.CY3;
import X.EnumC31509CYf;
import X.InterfaceC05190Ih;
import X.InterfaceC06060Lq;
import X.InterfaceC29734Bli;
import X.InterfaceC29980Bpg;
import X.InterfaceC29986Bpm;
import X.InterfaceC30442Bx8;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.KL2;
import Y.ACListenerS24S0101000_5;
import Y.ACListenerS25S0100000_5;
import Y.ACListenerS26S0101000_8;
import Y.ACListenerS28S0101000_10;
import Y.ALAdapterS4S0200000_5;
import Y.AObjectS22S0000000_5;
import Y.ARunnableS11S0101000_7;
import Y.ARunnableS41S0100000_5;
import Y.IDRunnableS6S0101000;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.SystemClock;
import android.text.BidiFormatter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import au3.IDdS56S0100000_5;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveStreamerLayoutBGSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconNeedHideTextSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscribeEnhanceIconSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionAudienceEntranceEnhanceSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLikeOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleUserInfoWidgetSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikeDegradeSettings;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikePerformanceOptimizeSettings;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveUserInfoShowIconSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveChatViewImageSetting;
import com.bytedance.android.livesdk.message.proto.LiveProInfo;
import com.bytedance.android.livesdk.microom.LiveMicRoomInfoDialog;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.watch.IDisplayOptService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetProviderProxy;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class LiveRoomUserInfoWidget extends RoomRecycleFunctionWidget implements InterfaceC29986Bpm, OnMessageListener, InterfaceC06060Lq, InterfaceC72822Si2 {
    public static final String LLJL = LiveRoomUserInfoWidget.class.getName();
    public boolean LJLILLLLZI;
    public ViewGroup LJLJI;
    public C47061t0 LJLJJI;
    public C31597Caf LJLJJL;
    public C47061t0 LJLJJLL;
    public C47121t6 LJLJL;
    public View LJLJLJ;
    public C47121t6 LJLJLLL;
    public ImageView LJLL;
    public View LJLLI;
    public CY3 LJLLILLLL;
    public CL0 LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public CL0 LJLLLLLL;
    public C32205CkT LJLZ;
    public boolean LJZ;
    public View LJZI;
    public C47061t0 LJZL;
    public C2A8 LL;
    public boolean LLD;
    public boolean LLF;
    public int LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public View LLFZ;
    public View LLI;
    public int LLIFFJFJJ;
    public View LLII;
    public ViewGroup LLIIII;
    public ViewGroup LLIIIILZ;
    public C47121t6 LLIIIJ;
    public LiveIconView LLIIIL;
    public View LLIIIZ;
    public C2A4 LLIIJI;
    public ImageView LLIIJLIL;
    public ImageView LLIIL;
    public TextView LLIILII;
    public C31597Caf LLIILZL;
    public ViewGroup LLIIZ;
    public ViewGroup LLIL;
    public Room LLILIL;
    public boolean LLILL;
    public long LLILZ;
    public Animator LLILZLL;
    public Animator LLIZ;
    public ActivityC45651qj LLIZLLLIL;
    public IMicRoomService LLJ;
    public UserInfoLikeHelper LLJI;
    public View LLJIJIL;
    public C29727Blb LLJILJILJ;
    public long LLJILLL;
    public final boolean LLJJI;
    public final Handler LLJJIII;
    public final ARunnableS41S0100000_5 LLJJIJI;
    public long LLJJIJIIJIL;
    public long LLJJIJIL;
    public LiveRecyclableWidget LLJJJ;
    public LiveRecyclableWidget LLJJJIL;
    public LiveRecyclableWidget LLJJJJ;
    public final ARunnableS41S0100000_5 LLJJJJJIL;
    public final ARunnableS41S0100000_5 LLJJJJLIIL;
    public final ARunnableS41S0100000_5 LLJJL;
    public final ARunnableS11S0101000_7 LLJJLIIIJLLLLLLLZ;
    public final C73318Sq2 LLILII = new C73318Sq2();
    public boolean LLILLIZIL = true;
    public boolean LLILLJJLI = false;
    public boolean LLILLL = false;
    public long LLILZIL = -1;
    public boolean LLJILJIL = true;
    public final boolean LLJJ = LiveLikeOptSetting.INSTANCE.isOtherTextViewWidthOpt();

    public String A4() {
        return "LiveRoomUserInfoWidget";
    }

    @Override // X.InterfaceC06060Lq
    public final void LJJIJ(boolean z) {
    }

    @Override // X.InterfaceC29986Bpm
    public final /* synthetic */ void dc(LikeHelper likeHelper, String str) {
    }

    @Override // com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Boolean, O] */
    @Override // com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onUnload() {
        IMessageManager iMessageManager;
        InterfaceC29980Bpg hq0;
        this.LJLIL = false;
        this.LJLJI.setAccessibilityDelegate(null);
        ViewGroup viewGroup = this.LLIIIILZ;
        if (viewGroup != null) {
            viewGroup.setAccessibilityDelegate(null);
        }
        if (this.LLILIL != null) {
            ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).Ao0(this.LLILIL.getId(), this);
        }
        this.LLILLL = false;
        C29727Blb c29727Blb = this.LLJILJILJ;
        if (c29727Blb != null) {
            c29727Blb.LJJIFFI = false;
        }
        DataChannel dataChannel = this.dataChannel;
        dataChannel.getClass();
        dataChannel.jv0(this);
        C72818Shy.LJII("js_event_report_log_live_follow", this);
        C72818Shy.LJII("user_border_update_event", this);
        this.LLILII.LIZLLL();
        C29306Beo.LJIIIZ(getView());
        this.LLILLJJLI = false;
        if (this.LLILIL != null && (hq0 = ((IBarrageService) CN1.LIZ(IBarrageService.class)).hq0(this.LLILIL.getId())) != null && hq0.isEnabled() && hq0.LIZIZ()) {
            hq0.LJIILJJIL(this.LLJI);
            hq0.LJIILJJIL(this);
            hq0.LIZ(null);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.kv0(C29927Bop.class)) != null) {
            iMessageManager.removeMessageListener(EnumC31509CYf.LIKE.getIntType(), this);
        }
        this.LLIZLLLIL = null;
        IMessageManager iMessageManager2 = (IMessageManager) this.dataChannel.kv0(C29927Bop.class);
        if (iMessageManager2 != null) {
            iMessageManager2.removeMessageListener(EnumC31509CYf.LIKE.getIntType(), this);
            iMessageManager2.removeMessageListener(EnumC31509CYf.USER_SEQ.getIntType(), this);
        }
        this.LLJILJILJ.LIZIZ();
        Animator animator = this.LLILZLL;
        if (animator != null && animator.isRunning()) {
            this.LLILZLL.cancel();
        }
        Animator animator2 = this.LLIZ;
        if (animator2 != null && animator2.isRunning()) {
            this.LLIZ.cancel();
        }
        this.LLJILJILJ.LJIIZILJ(false);
        C29727Blb c29727Blb2 = this.LLJILJILJ;
        KL2.LJIILLIIL(8, c29727Blb2.LJJIII);
        KL2.LJIILLIIL(8, c29727Blb2.LJJIIJ);
        InterfaceC29734Bli interfaceC29734Bli = c29727Blb2.LJJIIZ;
        if (interfaceC29734Bli != null) {
            interfaceC29734Bli.onRelease();
        }
        InterfaceC29734Bli interfaceC29734Bli2 = c29727Blb2.LJJIIJZLJL;
        if (interfaceC29734Bli2 != null) {
            interfaceC29734Bli2.onRelease();
        }
        C2A4 c2a4 = c29727Blb2.LJII;
        if (c2a4 != null) {
            c2a4.setAlpha(1.0f);
        }
        View view = c29727Blb2.LIZ;
        if (view != null) {
            view.setAlpha(1.0f);
        }
        ((IBrowserService) CN1.LIZ(IBrowserService.class)).zb(this.context, "user_subscribe_entry_info");
        this.LLJJIII.removeCallbacks(this.LLJJJJJIL);
        this.LLJJIII.removeCallbacks(this.LLJJJJLIIL);
        this.LLJJIII.removeCallbacks(this.LLJJL);
        this.LLJJIII.removeCallbacks(this.LLJJLIIIJLLLLLLLZ);
        if (LiveRecycleUserInfoWidgetSetting.INSTANCE.getValue()) {
            this.LJLILLLLZI = false;
            this.LJLLL = false;
            this.LJLLLL = false;
            this.LLILL = false;
            this.LLILLIZIL = true;
            this.LLILLJJLI = false;
            this.LLILLL = false;
            this.LLILZ = 0L;
            this.LLILZIL = -1L;
            this.LLJJJ = null;
            this.LLJJJIL = null;
            this.LLJJJJ = null;
            View view2 = this.LLJIJIL;
            if (view2 != null) {
                view2.setAlpha(1.0f);
                this.LLJIJIL.setTranslationY(0.0f);
            }
            CL0 cl0 = this.LJLLLLLL;
            if (cl0 != null) {
                cl0.setAlpha(1.0f);
                this.LJLLLLLL.setTranslationY(1.0f);
            }
            KL2.LJIILLIIL(8, this.LJLLILLLL);
            KL2.LJIILLIIL(8, this.LJLLJ);
            KL2.LJIILLIIL(8, this.LJLL);
            KL2.LJIILLIIL(8, this.LJLJL);
            KL2.LJIILLIIL(8, this.LJLLLLLL);
            KL2.LJIILLIIL(8, this.LLII);
            KL2.LJIILLIIL(8, this.LLIIII);
            KL2.LJIILLIIL(8, this.LLIIIL);
            KL2.LJIILLIIL(8, this.LLIIIJ);
            KL2.LJIILLIIL(8, this.LLIIJLIL);
            KL2.LJIILLIIL(8, this.LLIIL);
            KL2.LJIILLIIL(8, this.LLIILII);
            KL2.LJIILLIIL(8, this.LLIIZ);
            KL2.LJIILLIIL(8, this.LLIL);
            KL2.LJIILLIIL(8, this.LLJIJIL);
            KL2.LJIILLIIL(8, this.LJZI);
            C47121t6 c47121t6 = this.LJLJLLL;
            if (c47121t6 != null) {
                c47121t6.setText("");
                this.LJLJLLL.requestLayout();
            }
            C31597Caf c31597Caf = this.LJLJJL;
            if (c31597Caf != null) {
                c31597Caf.setImageResource(R.drawable.cul);
            }
            C47061t0 c47061t0 = this.LJLJJLL;
            if (c47061t0 != null) {
                c47061t0.setImageDrawable(null);
            }
        }
        LLIIJI();
        this.LLJIJIL = null;
        this.LLFII = false;
        this.LLF = false;
        this.LLFFF = false;
        this.LLD = false;
        this.LLI = null;
        this.LLFZ = null;
        this.LJLLL = false;
        LLIL();
        this.LJZ = false;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            ((C32537Cpp) dataChannel3.gv0(C29722BlW.class)).LIZ = Boolean.FALSE;
        }
    }

    public final void LJZI() {
        if (this.LLJJJJ == null) {
            enableSubWidgetManager(null, null, LiveWidgetProviderProxy.getInstance(), C28329B9x.LIZJ(getContext()));
            if (LiveRecycleUserInfoWidgetSetting.INSTANCE.getValue()) {
                RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
                if (recyclableWidgetManager != null) {
                    this.LLJJJJ = recyclableWidgetManager.getRecyclableWidgetFromCacheOrNew(((IFansClubService) CN1.LIZ(IFansClubService.class)).mk(), null, new AObjectS22S0000000_5(1));
                }
            } else {
                this.LLJJJJ = ((IFansClubService) CN1.LIZ(IFansClubService.class)).mY();
            }
            this.subWidgetManager.load(this.LLJJJJ);
        }
    }

    public final void LJZL() {
        if (this.LLJJJ == null) {
            enableSubWidgetManager(null, null, LiveWidgetProviderProxy.getInstance(), C28329B9x.LIZJ(getContext()));
            if (LiveRecycleUserInfoWidgetSetting.INSTANCE.getValue()) {
                this.LLJJJ = this.subWidgetManager.getRecyclableWidgetFromCacheOrNew(((ISubscribeService) CN1.LIZ(ISubscribeService.class)).wa(), null, new AObjectS22S0000000_5(2));
            } else {
                this.LLJJJ = ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).Nt();
            }
            this.subWidgetManager.load(this.LLJJJ);
        }
    }

    public final void LL() {
        if (this.LLJJJIL == null) {
            enableSubWidgetManager(null, null, LiveWidgetProviderProxy.getInstance(), C28329B9x.LIZJ(getContext()));
            if (LiveRecycleUserInfoWidgetSetting.INSTANCE.getValue()) {
                RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
                if (recyclableWidgetManager != null) {
                    this.LLJJJIL = recyclableWidgetManager.getRecyclableWidgetFromCacheOrNew(((IUserLevelService) CN1.LIZ(IUserLevelService.class)).ei(), null, new AObjectS22S0000000_5(0));
                }
            } else {
                this.LLJJJIL = ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).xa0();
            }
            this.subWidgetManager.load(this.LLJJJIL);
        }
    }

    public final boolean LLF() {
        IDisplayOptService iDisplayOptService = (IDisplayOptService) CN1.LIZ(IDisplayOptService.class);
        if (iDisplayOptService != null && iDisplayOptService.bq(this.dataChannel)) {
            return true;
        }
        return false;
    }

    public final void LLFF() {
        C29727Blb c29727Blb;
        View view;
        if (!this.LLILL && (c29727Blb = this.LLJILJILJ) != null && c29727Blb.LJJIFFI && (view = this.LLI) != null && view == this.LJLLLLLL) {
            LLIIII();
            LLIILII(false);
            LLIIIJ();
            KL2.LJIILLIIL(8, this.LJZI);
            LLIL();
            LLILII();
        }
    }

    public final boolean LLFFF() {
        IMicRoomService iMicRoomService = this.LLJ;
        if (iMicRoomService != null && iMicRoomService.rk()) {
            return true;
        }
        return false;
    }

    public final boolean LLFII() {
        boolean z;
        LiveProInfo liveProInfo;
        if (this.LJLLL) {
            return true;
        }
        Room room = this.LLILIL;
        if (room != null && (liveProInfo = room.anchorLiveProInfo) != null && liveProInfo.isLivePro) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLILL) {
            if (!z) {
                InterfaceC30442Bx8.F1.LIZ(0);
                return true;
            }
        } else if (!z) {
            return true;
        }
        if (this.LLILIL.anchorLiveProInfo.label == null) {
            return true;
        }
        return false;
    }

    public void LLIIII() {
        C0NB.LJIIL(LLJL, "should implement in ClearScreenUserInfoWidget");
    }

    public void LLIIIILZ() {
        C0NB.LJIIL(LLJL, "should implement in ClearScreenUserInfoWidget");
    }

    public void LLIIIJ() {
        C0NB.LJIIL(LLJL, "should implement in ClearScreenUserInfoWidget");
    }

    public final void LLIIIL() {
        C48459J0d<Integer> c48459J0d;
        C47061t0 c47061t0;
        if (this.LLJILJILJ.LJJIFFI) {
            return;
        }
        if (this.LLILL) {
            c48459J0d = InterfaceC30442Bx8.F1;
        } else {
            c48459J0d = InterfaceC30442Bx8.G1;
        }
        if (this.LJZ || c48459J0d.LIZJ().intValue() >= 3 || this.LJLZ == null || (c47061t0 = this.LJZL) == null || c47061t0.getController() == null || this.LJZL.getController().LIZ() == null || !(this.LJZL.getController().LIZ() instanceof AnimatedDrawable2)) {
            return;
        }
        AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) this.LJZL.getController().LIZ();
        this.LJLZ.setAnimatorListener(new ALAdapterS4S0200000_5(this, animatedDrawable2, 13));
        animatedDrawable2.LJI(new C29719BlT(this));
        this.LJLZ.post(new IDRunnableS6S0101000(1, this, 23));
        this.LJZ = true;
        c48459J0d.LIZ(Integer.valueOf(c48459J0d.LIZJ().intValue() + 1));
    }

    public final void LLIIJI() {
        if (LiveStreamerLayoutBGSetting.INSTANCE.getValue()) {
            GradientDrawable gradientDrawable = (GradientDrawable) this.LJLJI.getBackground();
            gradientDrawable.setColor(ColorProtector.parseColor("#3f000000"));
            gradientDrawable.setStroke(0, ColorProtector.parseColor("#00000000"));
            this.LJLJI.setBackground(gradientDrawable);
        }
    }

    public final void LLIIJLIL() {
        User owner;
        String str;
        IMicRoomService iMicRoomService;
        Room room;
        OfficialChannelInfo officialChannelInfo;
        if (!this.LLILL && (iMicRoomService = this.LLJ) != null && iMicRoomService.rk() && (room = this.LLILIL) != null && (officialChannelInfo = room.officialChannelInfo) != null && officialChannelInfo.channelUser != null && (!LLFFF() || !((IProgrammedLiveService) CN1.LIZ(IProgrammedLiveService.class)).lj())) {
            new UserProfileEvent(this.LLILIL.officialChannelInfo.channelUser.getId());
            if (this.dataChannel != null) {
                IMicRoomService iMicRoomService2 = (IMicRoomService) CN1.LIZ(IMicRoomService.class);
                Context context = this.context;
                boolean z = this.LLILLIZIL;
                long id = this.LLILIL.officialChannelInfo.channelUser.getId();
                Room room2 = this.LLILIL;
                this.dataChannel.kv0(RoomUserChannel.class);
                LiveMicRoomInfoDialog ir0 = iMicRoomService2.ir0(context, z, id, room2);
                FragmentManager fragmentManager = (FragmentManager) this.dataChannel.kv0(C29494Bhq.class);
                if (fragmentManager != null && ir0 != null) {
                    ir0.show(fragmentManager, "LiveMicRoomInfoDialog");
                    return;
                }
                return;
            }
            return;
        }
        Room room3 = this.LLILIL;
        if (room3 == null || room3.getOwner() == null) {
            return;
        }
        if (LLFFF() && ((IProgrammedLiveService) CN1.LIZ(IProgrammedLiveService.class)).lj()) {
            owner = this.LLILIL.officialChannelInfo.channelUser;
        } else {
            owner = this.LLILIL.getOwner();
        }
        UserProfileEvent userProfileEvent = new UserProfileEvent(owner.getId());
        userProfileEvent.mReportType = "report_anchor";
        userProfileEvent.mSource = "video_head";
        if (this.LLILL) {
            str = "self_anchor_profile";
        } else {
            str = "host_anchor_profile";
        }
        userProfileEvent.clickModule = str;
        C73943T0h.LIZ().LIZIZ(userProfileEvent);
    }

    public final void LLIL() {
        C32205CkT c32205CkT = this.LJLZ;
        if (c32205CkT != null) {
            c32205CkT.LJLJJLL = null;
            ValueAnimator valueAnimator = c32205CkT.LJLJJL;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.end();
            }
        }
        C47061t0 c47061t0 = this.LJZL;
        if (c47061t0 != null && c47061t0.getController() != null && this.LJZL.getController().LIZ() != null && (this.LJZL.getController().LIZ() instanceof AnimatedDrawable2) && this.LJZL.getController().LIZ().isRunning()) {
            this.LJZL.getController().LIZ().stop();
            ((AnimatedDrawable2) this.LJZL.getController().LIZ()).LJ(0);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        if (Boolean.TRUE.equals(this.dataChannel.kv0(UserIsAnchorChannel.class))) {
            return R.layout.dej;
        }
        return R.layout.dek;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return LiveRecycleUserInfoWidgetSetting.INSTANCE.getValue();
    }

    public LiveRoomUserInfoWidget() {
        this.LLJJI = SubscriptionAudienceEntranceEnhanceSetting.INSTANCE.getValue() && C15380j0.LJIJ(C15380j0.LJIIL()) > ((float) SubscriptionIconHideTextMinimumDimensionSetting.INSTANCE.getValue()) && !SubscriptionIconNeedHideTextSetting.INSTANCE.getValue();
        this.LLJJIII = new Handler(C16880lQ.LLJJJJ());
        this.LLJJIJI = new ARunnableS41S0100000_5(this, 190);
        this.LLJJIJIL = 0L;
        this.LLJJJJJIL = new ARunnableS41S0100000_5(this, 187);
        this.LLJJJJLIIL = new ARunnableS41S0100000_5(this, 188);
        this.LLJJL = new ARunnableS41S0100000_5(this, 189);
        this.LLJJLIIIJLLLLLLLZ = new ARunnableS11S0101000_7(0, this, 3);
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, X.YA7
    public void LJJJJ() {
        if (LLF()) {
            B76.LIZLLL("anchor_info", this.LLILIL, Long.valueOf(this.LLJJIJIL));
        }
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, X.YA7
    public final void LJLJI() {
        if (LLF()) {
            this.LLJJIJIL = System.currentTimeMillis();
        }
    }

    public final void LLIILZL() {
        if (LLFII()) {
            return;
        }
        KL2.LJIILLIIL(8, this.LJLLLLLL);
        KL2.LJIILLIIL(4, this.LLJIJIL);
        KL2.LJIILLIIL(0, this.LJZI);
        View view = this.LLJIJIL;
        if (view != null) {
            view.setAlpha(1.0f);
        }
        View view2 = this.LJZI;
        if (view2 != null) {
            view2.setAlpha(1.0f);
            this.LJZI.setTranslationY(0.0f);
        }
        View view3 = this.LLJIJIL;
        if (view3 != null) {
            view3.setTranslationY(0.0f);
        }
        this.LLD = false;
        if (!this.LLFFF) {
            this.LLFFF = true;
            BZI LIZ = C28787BRn.LIZ("livesdk_live_pro_badge_show");
            LIZ.LJIJJ(String.valueOf(this.LLILIL.author().getId()), "anchor_id");
            LIZ.LJIJJ(String.valueOf(this.LLILIL.getId()), "room_id");
            LIZ.LJIJJ("profile_photo", "position");
            if (this.LLILL) {
                LIZ.LJIJJ("1", "is_anchor");
            } else {
                LIZ.LJIJJ(CardStruct.IStatusCode.DEFAULT, "is_anchor");
            }
            LIZ.LJJIIJZLJL();
        }
        LLIIIL();
    }

    public final void LLILII() {
        View view;
        if (LLFII() || this.LLD) {
            return;
        }
        if (!this.LLILL && (view = this.LLI) != null && view == this.LJLLLLLL) {
            return;
        }
        this.LLJJIII.removeCallbacks(this.LLJJL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0012, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLILLIZIL() {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.LLILLIZIL():void");
    }

    public final void LJLZ(boolean z) {
        ViewGroup viewGroup;
        if (z && (viewGroup = this.LLIIIILZ) != null) {
            viewGroup.announceForAccessibility(this.context.getResources().getString(R.string.k3z, this.LJLJLLL.getText()));
        }
    }

    public final void LJZ(User user) {
        Room room;
        String str;
        if (user.getAuthenticationInfo() != null) {
            KL2.LJIILLIIL(0, this.LJLL);
            C15640jQ.LJFF(this.LJLL, user.getAuthenticationInfo().authenticationBadge, 0, new IDdS56S0100000_5(this, 6));
            if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_authentication_icon_show", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) && (room = this.LLILIL) != null && this.LLILZIL != room.getId()) {
                HashMap hashMap = new HashMap();
                hashMap.put("anchor_id", user.getIdStr());
                hashMap.put("room_id", this.LLILIL.getIdStr());
                hashMap.put("show_type", "nickname_anchor");
                hashMap.put("live_type", this.LLILIL.getStreamType().logStreamingType);
                hashMap.put("enter_from_merge", BJM.LJFF());
                hashMap.put("enter_method", BJM.LJIIIIZZ());
                InterfaceC05190Ih interfaceC05190Ih = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ;
                if (interfaceC05190Ih.getId() == user.getId()) {
                    str = "anchor";
                } else if (interfaceC05190Ih.getUserAttr() != null && interfaceC05190Ih.getUserAttr().isAdmin) {
                    str = "admin";
                } else {
                    str = "viewer";
                }
                hashMap.put("admin_type", str);
                C29822Bn8.LIZIZ("livesdk_authentication_icon_show", hashMap);
                return;
            }
            return;
        }
        KL2.LJIILLIIL(8, this.LJLL);
        this.LJLL.setImageDrawable(null);
    }

    public final void LLIIL(int i) {
        if (LLFII() || this.LLD || this.LLJIJIL == null || this.LJZI == null) {
            return;
        }
        KL2.LJIILLIIL(8, this.LJLLLLLL);
        KL2.LJIILLIIL(0, this.LLJIJIL);
        KL2.LJIILLIIL(4, this.LJZI);
        LLIL();
        this.LLJIJIL.setAlpha(1.0f);
        this.LJZI.setAlpha(1.0f);
        this.LLJIJIL.setTranslationY(0.0f);
        this.LJZI.setTranslationY(0.0f);
        this.LLI = this.LLJIJIL;
        this.LLFZ = this.LJZI;
        this.LLJJIII.removeCallbacks(this.LLJJJJJIL);
        LLIIZ(i);
        this.LLD = false;
    }

    public final void LLIILII(boolean z) {
        int i;
        if (LLFII()) {
            return;
        }
        LLIILZL();
        if (!z) {
            if (this.LLD) {
                i = 40;
            } else {
                i = 55;
            }
        } else {
            i = 0;
        }
        this.LLJJIII.removeCallbacks(this.LLJJJJJIL);
        this.LLI = this.LJZI;
        this.LLFZ = this.LLJIJIL;
        LLIIZ(i);
        this.LLD = false;
    }

    public final void LLIIZ(int i) {
        UserInfoLikeHelper userInfoLikeHelper;
        if (this.LLI == null || this.LLFZ == null) {
            return;
        }
        C29727Blb c29727Blb = this.LLJILJILJ;
        if (c29727Blb != null && c29727Blb.LJJIFFI) {
            return;
        }
        Animator animator = this.LLIZ;
        if (animator != null) {
            animator.cancel();
        }
        this.LLIFFJFJJ = i;
        this.LLJJIII.removeCallbacks(this.LLJJL);
        this.LLJJIII.postDelayed(this.LLJJL, i * 1000);
        if (!this.LLILL || (userInfoLikeHelper = this.LLJI) == null) {
            return;
        }
        View view = this.LLI;
        View view2 = this.LJZI;
        if (view == view2) {
            userInfoLikeHelper.LIZ(view2);
        } else {
            if (view != this.LLJIJIL) {
                return;
            }
            userInfoLikeHelper.LIZ(this.LJLLILLLL);
        }
    }

    public final void LLILIL(BorderInfo borderInfo) {
        IMicRoomService iMicRoomService;
        if (borderInfo != null && (iMicRoomService = this.LLJ) != null && (!iMicRoomService.rk() || this.LLILL)) {
            int[] iArr = new int[2];
            this.LJLJJL.getLocationOnScreen(iArr);
            int[] iArr2 = {((this.LJLJJL.getWidth() + 1) / 2) + iArr[0], ((this.LJLJJL.getHeight() + 1) / 2) + iArr[1]};
            int[] iArr3 = new int[2];
            this.LJLJJLL.getLocationOnScreen(iArr3);
            int[] iArr4 = {((this.LJLJJLL.getWidth() + 1) / 2) + iArr3[0], ((this.LJLJJLL.getHeight() + 1) / 2) + iArr3[1]};
            C47061t0 c47061t0 = this.LJLJJLL;
            c47061t0.setX((c47061t0.getX() + iArr2[0]) - iArr4[0]);
            C47061t0 c47061t02 = this.LJLJJLL;
            c47061t02.setY((c47061t02.getY() + iArr2[1]) - iArr4[1]);
            this.LJLJJLL.requestLayout();
            C15620jO.LIZIZ(borderInfo.icon, this.LJLJJLL);
            User owner = this.LLILIL.getOwner();
            C29504Bi0.LIZIZ(owner, "top_left_corner", this.LLILL, C29504Bi0.LIZ(owner));
            if (LiveStreamerLayoutBGSetting.INSTANCE.getValue()) {
                GradientDrawable gradientDrawable = (GradientDrawable) this.LJLJI.getBackground();
                String str = borderInfo.avatarBackgroundColor;
                if (str == null || str.equals("")) {
                    gradientDrawable.setColor(ColorProtector.parseColor("#3f000000"));
                } else {
                    gradientDrawable.setColor(ColorProtector.parseColor(borderInfo.avatarBackgroundColor));
                }
                String str2 = borderInfo.avatarBackgroundBorderColor;
                if (str2 == null || str2.equals("")) {
                    gradientDrawable.setStroke(0, ColorProtector.parseColor("#00000000"));
                } else {
                    gradientDrawable.setStroke(C15380j0.LIZ(1.0f), ColorProtector.parseColor(borderInfo.avatarBackgroundBorderColor));
                }
                this.LJLJI.setBackground(gradientDrawable);
                return;
            }
            return;
        }
        this.LJLJJLL.setImageDrawable(null);
        LLIIJI();
    }

    public final void LLILL(long j) {
        int i;
        String LJIIIIZZ;
        CY3 cy3;
        if (j <= 0) {
            this.LLILZ = 0L;
        } else if (j > this.LLILZ) {
            this.LLILZ = j;
        }
        if (!LiveLikePerformanceOptimizeSettings.INSTANCE.enablePerformanceOptimize() && (cy3 = this.LJLLILLLL) != null && this.LJLLLL) {
            if (this.LJLILLLLZI) {
                C1Q4 LIZLLL = C259910h.LIZLLL(R.attr.atr, this.context);
                if (LIZLLL != null) {
                    LIZLLL.setTint(C15380j0.LIZIZ(R.color.a5b));
                    LIZLLL.setBounds(0, C15380j0.LIZ(-1.0f), C15380j0.LIZ(11.0f), C15380j0.LIZ(10.0f));
                }
                this.LJLLILLLL.setCompoundDrawablePadding(C15380j0.LIZ(2.0f));
                this.LJLLILLLL.setCompoundDrawables(LIZLLL, null, null, null);
            } else {
                cy3.setCompoundDrawablePadding(0);
                this.LJLLILLLL.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
        }
        if (this.LJLLILLLL != null && this.LJLLLL) {
            String j90 = ((IBarrageService) CN1.LIZ(IBarrageService.class)).j90(this.LLILZ);
            if (this.LJLILLLLZI) {
                LJIIIIZZ = j90;
            } else {
                long j2 = this.LLILZ;
                if (j2 > 2147483647L) {
                    i = Integer.MAX_VALUE;
                } else {
                    i = (int) j2;
                }
                LJIIIIZZ = C15380j0.LJIIIIZZ(R.plurals.mu, i, BidiFormatter.getInstance(CCJ.LIZ(this.context)).unicodeWrap(j90));
            }
            float f = 0.0f;
            if (LiveLikeDegradeSettings.INSTANCE.isScalableDowngrade(this.dataChannel)) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (!C38354F3m.LIZJ(LJIIIIZZ, this.LJLLILLLL.getText().toString()) && elapsedRealtime - this.LLJILLL >= 4000) {
                    if (this.LLJJ) {
                        CY3 cy32 = this.LJLLILLLL;
                        if (this.LJLILLLLZI) {
                            f = C15380j0.LIZ(12.0f);
                        }
                        cy32.LJJJJ(LJIIIIZZ, j90, f);
                    } else {
                        this.LJLLILLLL.setText(LJIIIIZZ);
                    }
                    this.LLJILLL = elapsedRealtime;
                }
            } else if (!C38354F3m.LIZJ(LJIIIIZZ, this.LJLLILLLL.getText().toString())) {
                if (this.LLJJ) {
                    CY3 cy33 = this.LJLLILLLL;
                    if (this.LJLILLLLZI) {
                        f = C15380j0.LIZ(12.0f);
                    }
                    cy33.LJJJJ(LJIIIIZZ, j90, f);
                } else {
                    this.LJLLILLLL.setText(LJIIIIZZ);
                }
            }
        }
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).QF(((IBarrageService) CN1.LIZ(IBarrageService.class)).j90(this.LLILZ));
    }

    @Override // com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget
    public final void onGetRoomInfo(Room room) {
        this.LLILIL = room;
        onLoad(new Object[]{Boolean.TRUE, new C29726Bla(SystemClock.elapsedRealtime())});
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onInit(Object... objArr) {
        ViewGroup viewGroup;
        this.LJLJI = (ViewGroup) findViewById(R.id.a2c);
        this.LJLJJI = (C47061t0) findViewById(R.id.a2d);
        this.LJLJJL = (C31597Caf) findViewById(R.id.e35);
        this.LJLJJLL = (C47061t0) findViewById(R.id.ezy);
        this.LJLJL = (C47121t6) findViewById(R.id.gir);
        this.LJLJLJ = findViewById(R.id.gw3);
        C16880lQ.LJIIL(this.LJLJI, new ACListenerS24S0101000_5(1, this, 6));
        this.LJLJLLL = (C47121t6) findViewById(R.id.mzt);
        this.LJLL = (ImageView) findViewById(R.id.a_u);
        this.LJLLI = findViewById(R.id.h3a);
        this.LJLLILLLL = (CY3) findViewById(R.id.fr4);
        this.LJLLJ = (CL0) findViewById(R.id.jbw);
        this.LJLLLLLL = (CL0) findViewById(R.id.ahq);
        this.LLII = findViewById(R.id.d3d);
        this.LLIIIILZ = (ViewGroup) findViewById(R.id.djo);
        this.LLIIII = (ViewGroup) findViewById(R.id.dkh);
        this.LJLZ = (C32205CkT) findViewById(R.id.fxz);
        this.LJZI = findViewById(R.id.fy0);
        this.LJZL = (C47061t0) findViewById(R.id.f6c);
        this.LL = (C2A8) findViewById(R.id.ma_);
        KL2.LJIILLIIL(8, this.LJZI);
        if (this.LJLJI instanceof ConstraintLayout) {
            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
            anonymousClass064.LJII((ConstraintLayout) this.LJLJI);
            anonymousClass064.LJIILL(this.LLIIII.getId()).LIZLLL.LJIJJLI = 0.0f;
            anonymousClass064.LIZIZ((ConstraintLayout) this.LJLJI);
        }
        View view = this.LJLJLJ;
        if (view instanceof ConstraintLayout) {
            ((C018905p) view.getLayoutParams()).matchConstraintMaxWidth = C15380j0.LIZ(92.72727f);
        }
        this.LLILL = ((Boolean) this.dataChannel.kv0(UserIsAnchorChannel.class)).booleanValue();
        this.LLIIIZ = findViewById(R.id.kpw);
        this.LLIIIJ = (C47121t6) findViewById(R.id.djm);
        if (!this.LLILL) {
            LiveIconView liveIconView = (LiveIconView) findViewById(R.id.v1);
            this.LLIIIL = liveIconView;
            C16880lQ.LJJII(liveIconView, new ACListenerS28S0101000_10(0, this, 0));
        }
        if (C259710f.LIZ.LJIIIZ()) {
            LiveIconView liveIconView2 = this.LLIIIL;
            if (liveIconView2 != null) {
                ViewGroup.LayoutParams layoutParams = liveIconView2.getLayoutParams();
                layoutParams.height = (int) (layoutParams.height * 1.3d);
                layoutParams.width = (int) (layoutParams.width * 1.3d);
                this.LLIIIL.setLayoutParams(layoutParams);
            }
            this.LLIIIJ.setText("");
            this.LLIIIJ.setPadding(0, 0, C15380j0.LIZ(3.0f), 0);
        }
        C16880lQ.LJJIIZ(this.LLIIIJ, new ACListenerS26S0101000_8(0, this, 0));
        this.LLIIII.setBackgroundResource(R.drawable.chs);
        this.LLIIIJ.setTextColor(this.context.getResources().getColor(R.color.acm));
        if (!this.LLILL) {
            this.LLIIIL.setIconTint(this.context.getResources().getColor(R.color.acm));
        }
        String LIZ = C87095YGd.LIZ(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).currentLocale());
        if (LIZ.equals("id-ID") || LIZ.contains("zh")) {
            this.LLIIIJ.setTextSize(1, 13.0f);
        }
        this.LLIIJI = (C2A4) findViewById(R.id.dkt);
        ImageView imageView = (ImageView) findViewById(R.id.kpy);
        this.LLIIJLIL = imageView;
        ACListenerS25S0100000_5 aCListenerS25S0100000_5 = new ACListenerS25S0100000_5(this, 251);
        C16880lQ.LJIILLIIL(imageView, aCListenerS25S0100000_5);
        C16880lQ.LJIIJ(aCListenerS25S0100000_5, this.LLIIIZ);
        this.LLIIIZ.setVisibility(8);
        SubscribeEnhanceIconSetting.INSTANCE.getValue();
        ImageView imageView2 = (ImageView) findViewById(R.id.i58);
        this.LLIIL = imageView2;
        C16880lQ.LJIILLIIL(imageView2, new ACListenerS26S0101000_8(0, this, 1));
        TextView textView = (TextView) findViewById(R.id.kq7);
        this.LLIILII = textView;
        if (this.LLJJI) {
            textView.setTextColor(this.context.getResources().getColor(R.color.a1r));
            C16880lQ.LJIJI(this.LLIILII, aCListenerS25S0100000_5);
        } else {
            C16880lQ.LJIJI(textView, null);
        }
        if (Arrays.asList(LiveUserInfoShowIconSetting.INSTANCE.getLanguage()).contains(C87095YGd.LIZ(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).currentLocale()))) {
            this.LJLILLLLZI = true;
        }
        this.LLIILZL = (C31597Caf) findViewById(R.id.jb5);
        IFansClubService iFansClubService = (IFansClubService) CN1.LIZ(IFansClubService.class);
        if (iFansClubService != null && (viewGroup = this.LLIIII) != null) {
            if (this.LLILL) {
                ViewGroup viewGroup2 = this.LLIL;
                if (viewGroup2 != null) {
                    C16880lQ.LJLLL(viewGroup2, viewGroup);
                }
                C57562Ns sr0 = iFansClubService.sr0(this.LLIIII.getContext());
                this.LLIL = sr0;
                if (sr0 != null) {
                    sr0.setVisibility(8);
                    this.LLIL.setId(R.id.d5n);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, C15380j0.LJFF(R.dimen.ac8));
                    layoutParams2.gravity = 17;
                    this.LLIL.setLayoutParams(layoutParams2);
                    this.LLIIII.addView(this.LLIL, layoutParams2);
                }
            } else {
                ViewGroup viewGroup3 = this.LLIIZ;
                if (viewGroup3 != null) {
                    C16880lQ.LJLLL(viewGroup3, viewGroup);
                }
                C28294B8o hJ = iFansClubService.hJ(this.LLIIII.getContext());
                this.LLIIZ = hJ;
                if (hJ != null) {
                    hJ.setVisibility(8);
                    this.LLIIZ.setId(R.id.d5o);
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams3.gravity = 17;
                    this.LLIIZ.setLayoutParams(layoutParams3);
                    this.LLIIII.addView(this.LLIIZ, layoutParams3);
                }
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        hashMap.put("room_id", Long.valueOf(((Room) this.dataChannel.kv0(RoomChannel.class)).getId()));
        Map<String, Object> map = C28965BYj.LIZ;
        ((LinkedHashMap) map).clear();
        map.putAll(hashMap);
        this.LLJILJILJ = new C29727Blb(this.LLIIIL, this.LJLJLJ, this.LLII, this.LLIIII, this.LLIIIJ, this.LLIIIZ, this.LLIIJI, this.LLIIJLIL, this.LLIIL, this.LLIILII, this.LJLJI, this.dataChannel, this.context, getView(), 1, this);
        LJZL();
        LL();
        LJZI();
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x0929, code lost:
    
        if (r1.LJIILJJIL(r2.intValue()) != false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0587, code lost:
    
        if (r1.officialChannelInfo.channelUser.getId() == r1.getOwnerUserId()) goto L200;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x093b  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x09a4  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x09a8  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03db  */
    /* JADX WARN: Type inference failed for: r0v237, types: [X.W5O, REQUEST] */
    /* JADX WARN: Type inference failed for: r1v70, types: [java.lang.Boolean, O] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLoad(java.lang.Object... r33) {
        /*
            Method dump skipped, instructions count: 2475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.onLoad(java.lang.Object[]):void");
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage != null && (iMessage instanceof LikeMessage)) {
            LikeMessage likeMessage = (LikeMessage) iMessage;
            if (!likeMessage.isLocalInsertMsg) {
                LLILL(likeMessage.total);
            }
        }
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        Map<String, String> map;
        if (c199097rd.LJLIL.equals("js_event_report_log_live_follow")) {
            try {
                map = (Map) c199097rd.LJLILLLLZI.LIZIZ().get("log_params");
            } catch (Exception unused) {
                map = null;
            }
            LLII("follow_discount_popup", map);
            return;
        }
        if (this.LLILL && c199097rd.LJLIL.equals("user_border_update_event")) {
            BorderInfo borderInfo = new BorderInfo();
            Gson gson = new Gson();
            try {
                if (!LiveStreamerLayoutBGSetting.INSTANCE.getValue()) {
                    InterfaceC78280Uns map2 = c199097rd.LJLILLLLZI.getMap("icon");
                    if (map2 != null) {
                        borderInfo.icon = (ImageModel) gson.LJI(C78501UrR.LIZIZ(map2).toString(), ImageModel.class);
                        LLILIL(borderInfo);
                        return;
                    }
                    return;
                }
                if (c199097rd.LJLILLLLZI.getInt("is_anchor_avatar") == 1) {
                    if (!this.LLILL) {
                        return;
                    }
                } else if (this.LLILL) {
                    return;
                }
                InterfaceC78280Uns map3 = c199097rd.LJLILLLLZI.getMap("icon");
                if (map3 != null) {
                    borderInfo.icon = (ImageModel) gson.LJI(C78501UrR.LIZIZ(map3).toString(), ImageModel.class);
                }
                borderInfo.avatarBackgroundColor = c199097rd.LJLILLLLZI.getString("avatar_background_color");
                borderInfo.avatarBackgroundBorderColor = c199097rd.LJLILLLLZI.getString("avatar_background_border_color");
                LLILIL(borderInfo);
            } catch (Exception unused2) {
            }
        }
    }

    public final void LLFZ(C31597Caf c31597Caf, ImageModel imageModel) {
        boolean z;
        if (LiveChatViewImageSetting.INSTANCE.getValue() >= 2) {
            z = true;
        } else {
            z = false;
        }
        C15700jW.LIZ(0, 0, R.drawable.cul, c31597Caf, imageModel, new B77(this), z);
    }

    public final void LLII(String str, Map<String, String> map) {
        User user;
        String str2;
        Object obj;
        Object obj2;
        String str3;
        Room room;
        try {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            hashMap.put("growth_deepevent", String.valueOf(1));
            if (!C38354F3m.LJ(C28594BKc.LIZJ().LIZLLL())) {
                hashMap.put("enter_live_method", C28594BKc.LIZJ().LIZLLL());
            }
            String LJIIIZ = BJM.LJIIIZ();
            if (!TextUtils.isEmpty(LJIIIZ) && "click_push_live_cd_user".equals(LJIIIZ)) {
                hashMap.put("is_subscribe", "1");
            } else {
                hashMap.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
            }
            User owner = this.LLILIL.getOwner();
            String valueOf = String.valueOf(owner.getId());
            String str4 = "live_audience_c_anchor";
            IMicRoomService iMicRoomService = this.LLJ;
            if (iMicRoomService != null && (room = this.LLILIL) != null && iMicRoomService.jT(room)) {
                if (this.LLJ.Nl()) {
                    str4 = "carousel_audience_c_official_id";
                } else {
                    str4 = "loyal_audience_c_official_id";
                }
                valueOf = String.valueOf(this.LLILIL.officialChannelInfo.channelUser.getId());
            }
            if (((IProgrammedLiveService) CN1.LIZ(IProgrammedLiveService.class)).lj()) {
                str4 = "program_live_audience_c_official_id";
            } else {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null && (user = (User) dataChannel.kv0(RoomUserChannel.class)) != null && ((IInteractService) CN1.LIZ(IInteractService.class)).p00(user)) {
                    str4 = "live_guest_c_anchor";
                }
            }
            if (!this.LLILL) {
                if (((IInteractService) CN1.LIZ(IInteractService.class)).OB()) {
                    hashMap.put("anchor_type", "current");
                    hashMap.put("channel_id", String.valueOf(B5G.LIZIZ().LJFF));
                }
                if (((IInteractService) CN1.LIZ(IInteractService.class)).mT()) {
                    hashMap.put("pk_id", String.valueOf(((IInteractService) CN1.LIZ(IInteractService.class)).eq()));
                }
            }
            String connectionType = ((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType();
            if ("manual_pk".equals(connectionType)) {
                if (((IInteractService) CN1.LIZ(IInteractService.class)).Qe0()) {
                    hashMap.put("match_status", "pk_phase");
                } else {
                    hashMap.put("match_status", "punish");
                }
                hashMap.putAll(((IInteractService) CN1.LIZ(IInteractService.class)).L00());
            }
            hashMap.put("connection_type", connectionType);
            hashMap.put("to_user_id", valueOf);
            hashMap.put("request_page", str4);
            hashMap.put("click_user_position", str);
            if (this.LLILLIZIL) {
                str2 = "portrait";
            } else {
                str2 = "landscape";
            }
            hashMap.put("room_orientation", str2);
            boolean equals = "portal".equals(BJM.LJIIIIZZ());
            if (equals) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("is_portal_user", obj);
            if (equals) {
                hashMap.put("portal_id", String.valueOf(BJM.LJIIL()));
            }
            Room room2 = this.LLILIL;
            if (room2 != null && room2.getOwner() != null && this.LLILIL.getOwner().getFollowInfo() != null) {
                int followStatus = (int) this.LLILIL.getOwner().getFollowInfo().getFollowStatus();
                if (followStatus != 1 && followStatus != 3) {
                    str3 = "single";
                    hashMap.put("follow_type", str3);
                }
                str3 = "mutual";
                hashMap.put("follow_type", str3);
            }
            if (C74838TYs.LJ().LJJ > 0) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("is_guest_connection", obj2);
            hashMap.put("server_heat_level", String.valueOf(((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).u4(this.LLILIL.getId())));
            hashMap.put("client_heat_level", String.valueOf(((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).F(this.LLILIL.getId())));
            ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
            hashMap.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
            hashMap.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
            hashMap.putAll(BJB.LIZ());
            CohostTopic P20 = ((IInteractService) CN1.LIZ(IInteractService.class)).P20();
            if (P20 != null) {
                hashMap.put("is_topic_connection", "1");
                hashMap.put("topic_id", String.valueOf(P20.id));
            } else {
                hashMap.put("is_topic_connection", CardStruct.IStatusCode.DEFAULT);
                hashMap.put("topic_id", CardStruct.IStatusCode.DEFAULT);
            }
            if (((IInteractService) CN1.LIZ(IInteractService.class)).QD().size() > 2) {
                hashMap.put("is_multi", "1");
            } else {
                hashMap.put("is_multi", CardStruct.IStatusCode.DEFAULT);
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_follow");
            LIZ.LJJIFFI(hashMap);
            LIZ.LJIILIIL(new BU8("live", owner.getId()));
            LIZ.LJIILLIIL(this.dataChannel);
            LIZ.LIZLLL(C28835BTj.LIZJ("user_live_follow"));
            LIZ.LJIIIZ("live_interact");
            LIZ.LJIIJJI("live_detail");
            LIZ.LJJIIJZLJL();
        } catch (Exception e) {
            C0NB.LJ(LLJL, e.toString());
        }
    }

    @Override // X.InterfaceC29986Bpm
    public final void t3(LikeHelper likeHelper, int i) {
        ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).CF(this.context, this.LLILIL, this.dataChannel);
        if (this.LLILL && !LLFII()) {
            if (!this.LLILL && this.LLFF == 0) {
                LLIILZL();
            } else {
                LLIIZ(this.LLIFFJFJJ);
            }
        }
        this.LLFII = false;
    }

    @Override // X.InterfaceC29986Bpm
    public final void g4(LikeHelper likeHelper, int i, int i2, float f, float f2, float f3, float f4) {
        LLILL(this.LLILZ + 1);
        if (!this.LLD) {
            if (!this.LLILL) {
                if (LLFII() || this.LLF || this.LLD) {
                    return;
                }
                if (!this.LLFII) {
                    LLIILII(true);
                    this.LLF = true;
                    this.LLFII = true;
                    this.LLJJIII.postDelayed(this.LLJJLIIIJLLLLLLLZ, 3000L);
                    return;
                }
                this.LLJJIII.removeCallbacks(this.LLJJLIIIJLLLLLLLZ);
                LLIIL(3);
                return;
            }
            LLILII();
        }
    }
}
