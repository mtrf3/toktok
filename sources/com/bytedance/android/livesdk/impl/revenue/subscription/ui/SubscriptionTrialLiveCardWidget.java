package com.bytedance.android.livesdk.impl.revenue.subscription.ui;

import X.B57;
import X.BJM;
import X.BKI;
import X.BWZ;
import X.BYI;
import X.BZI;
import X.C06530Nl;
import X.C07670Rv;
import X.C0NB;
import X.C15380j0;
import X.C15490jB;
import X.C16880lQ;
import X.C28643BLz;
import X.C28787BRn;
import X.C29232Bdc;
import X.C29927Bop;
import X.C2A7;
import X.C30770C5u;
import X.C47061t0;
import X.C47121t6;
import X.C72818Shy;
import X.C76052yf;
import X.CFX;
import X.CountDownTimerC29857Bnh;
import X.EnumC31509CYf;
import X.ViewOnClickListenerC29858Bni;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.room.SubscribeSuccessEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SubscriptionTrialLiveCardWidget extends AnimatableRecyclableWidget implements OnMessageListener {
    public LiveIconView LJLIL;
    public C47061t0 LJLILLLLZI;
    public C47121t6 LJLJI;
    public C2A7 LJLJJI;
    public IMessageManager LJLJJL;
    public Room LJLJJLL;
    public CountDownTimerC29857Bnh LJLJL;
    public long LJLJLJ;
    public long LJLJLLL = -1;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dqm;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJZI() {
        Long l;
        User owner;
        long j = this.LJLJLLL;
        long j2 = 0;
        if (j < 0) {
            return;
        }
        long j3 = (this.LJLJLJ - j) / 1000;
        BZI LIZ = C28787BRn.LIZ("livesdk_sub_only_live_preview_duration");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJIJJ(BJM.LIZLLL(), "action_type");
        LIZ.LJIJJ("", "enter_from");
        LIZ.LJIJJ(BJM.LJFF(), "enter_from_merge");
        LIZ.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
        Room room = this.LJLJJLL;
        Long l2 = null;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        LIZ.LJIJJ(l, "room_id");
        Room room2 = this.LJLJJLL;
        if (room2 != null && (owner = room2.getOwner()) != null) {
            l2 = Long.valueOf(owner.getId());
        }
        LIZ.LJIJJ(l2, "anchor_id");
        C06530Nl.LIZLLL(LIZ, "live_detail_page", "event_page", j3, "duration");
        Room room3 = this.LJLJJLL;
        if (room3 != null) {
            j2 = room3.maxPreviewTime;
        }
        LIZ.LJIJJ(Long.valueOf(j2 / 1000), "maximum_preview_duration");
        LIZ.LJJIIJZLJL();
        this.LJLJLLL = -1L;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        IMessageManager iMessageManager = this.LJLJJL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        CountDownTimerC29857Bnh countDownTimerC29857Bnh = this.LJLJL;
        if (countDownTimerC29857Bnh != null) {
            countDownTimerC29857Bnh.cancel();
        }
        this.LJLJL = null;
        cancelShowAnimation();
        cancelHideAnimation();
        B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData.subscribePreviewTime = -1L;
        LJZI();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        if (!isShowing()) {
            return;
        }
        cancelShowAnimation();
        cancelHideAnimation();
        animateHide();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (isShowing()) {
            return;
        }
        cancelShowAnimation();
        cancelHideAnimation();
        animateShow();
        BZI LIZ = C28787BRn.LIZ("livesdk_subscribe_icon_show");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJIJJ("sub_only_preview_card", "show_entrance");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJJIIJZLJL();
            return;
        }
        LIZ.LJJIJ();
        LIZ.LJJIIZ();
        LIZ.LJJIIZI();
    }

    public static String LJLZ(long j) {
        long j2 = j / 1000;
        if (j2 > 60) {
            String LJIILL = C15380j0.LJIILL(R.string.nq0, String.valueOf(j2 / 60));
            o.LJIIIIZZ(LJIILL, "getString(R.string.pm_pr…econds / 60L).toString())");
            return LJIILL;
        }
        String LJIILL2 = C15380j0.LJIILL(R.string.of6, String.valueOf(j2));
        o.LJIIIIZZ(LJIILL2, "getString(R.string.pm_su…le, (seconds).toString())");
        return LJIILL2;
    }

    public final void LJZ(long j) {
        Room room = this.LJLJJLL;
        if (room != null && room.disablePreviewSubOnly == 1) {
            this.dataChannel.rv0(SubOnlyLiveAudienceStatusChannel.class, BKI.NON_SUBSCRIBER_FORBIDDEN_LIVE);
            C30770C5u.LJII = false;
            return;
        }
        long j2 = 0;
        if (j > 0) {
            this.dataChannel.rv0(SubOnlyLiveAudienceStatusChannel.class, BKI.NON_SUBSCRIBER_TRIAL_LIVE);
            C30770C5u.LJII = false;
            C47121t6 c47121t6 = this.LJLJI;
            if (c47121t6 != null) {
                c47121t6.setText(LJLZ(j));
            }
            show();
            CountDownTimerC29857Bnh countDownTimerC29857Bnh = this.LJLJL;
            if (countDownTimerC29857Bnh != null) {
                countDownTimerC29857Bnh.cancel();
            }
            this.LJLJL = new CountDownTimerC29857Bnh(j, this);
            BZI LIZ = C28787BRn.LIZ("livesdk_sub_only_live_preview_play");
            LIZ.LJIILLIIL(this.dataChannel);
            Room room2 = this.LJLJJLL;
            if (room2 != null) {
                j2 = room2.maxPreviewTime;
            }
            LIZ.LJIJJ(Long.valueOf(j2 / 1000), "maximum_preview_duration");
            LIZ.LJJIIJZLJL();
            CountDownTimerC29857Bnh countDownTimerC29857Bnh2 = this.LJLJL;
            if (countDownTimerC29857Bnh2 == null) {
                return;
            }
            countDownTimerC29857Bnh2.start();
            return;
        }
        if (j < 0) {
            return;
        }
        this.dataChannel.rv0(SubOnlyLiveAudienceStatusChannel.class, BKI.NON_SUBSCRIBER_FORBIDDEN_LIVE);
        C30770C5u.LJII = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLIL = (LiveIconView) findViewById(R.id.bf7);
        this.LJLILLLLZI = (C47061t0) findViewById(R.id.kqi);
        this.LJLJI = (C47121t6) findViewById(R.id.bw3);
        findViewById(R.id.kpv);
        this.LJLJJI = (C2A7) findViewById(R.id.kpq);
        C15490jB.LJ(this.LJLILLLLZI, CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_watch_resource_normal_1"), "ttlive_subscription_icon_large.png");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        boolean z;
        Long valueOf;
        super.hide();
        this.LJLJJL = (IMessageManager) this.dataChannel.kv0(C29927Bop.class);
        this.LJLJJLL = (Room) this.dataChannel.kv0(RoomChannel.class);
        IMessageManager iMessageManager = this.LJLJJL;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.MEMBER.getIntType(), this);
        }
        if (C29232Bdc.LJFF(this.dataChannel)) {
            Room room = this.LJLJJLL;
            long j = 0;
            if (room != null && room.allowPreviewTime < 0) {
                return;
            }
            C28643BLz c28643BLz = B57.LIZ;
            Long valueOf2 = Long.valueOf(c28643BLz.LIZ().mEnterRoomConfig.mRoomsData.subscribePreviewTime);
            if (valueOf2.longValue() >= 0) {
                z = true;
            } else {
                z = false;
            }
            Long l = null;
            if (!z) {
                valueOf2 = null;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("previewTimeFromConfig:");
            LIZ.append(valueOf2);
            C0NB.LIZIZ("SubscriptionTrialLiveCardWidget", X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("room?.allowPreviewTime:");
            Room room2 = this.LJLJJLL;
            if (room2 != null) {
                l = Long.valueOf(room2.allowPreviewTime);
            }
            LIZ2.append(l);
            C0NB.LIZIZ("SubscriptionTrialLiveCardWidget", X1D.LIZIZ(LIZ2));
            Long valueOf3 = Long.valueOf(c28643BLz.LIZ().mEnterRoomConfig.mRoomsData.subscribePreviewTime);
            if (valueOf3.longValue() >= 0) {
                j = valueOf3.longValue();
            } else {
                Room room3 = this.LJLJJLL;
                if (room3 != null && (valueOf = Long.valueOf(room3.allowPreviewTime)) != null) {
                    j = valueOf.longValue();
                }
            }
            this.LJLJLJ = j;
            LJZ(j);
        }
        View view = getView();
        if (view != null) {
            C16880lQ.LJIIJ(ViewOnClickListenerC29858Bni.LJLIL, view);
        }
        LiveIconView liveIconView = this.LJLIL;
        if (liveIconView != null) {
            C16880lQ.LJJII(liveIconView, new ACListenerS25S0100000_5(this, 177));
        }
        C2A7 c2a7 = this.LJLJJI;
        if (c2a7 != null) {
            C16880lQ.LJJIII(c2a7, new ACListenerS25S0100000_5(this, 178));
        }
        DataChannelGlobal.LJLJJI.nv0(this, this, SubscribeSuccessEvent.class, new AqS171S0100000_5(this, 401));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long j;
        if (iMessage instanceof MemberMessage) {
            MemberMessage memberMessage = (MemberMessage) iMessage;
            int i = memberMessage.action;
            if (i == 28) {
                Room room = this.LJLJJLL;
                if (room != null) {
                    room.liveSubOnly = 1L;
                }
                BYI.LIZJ(BWZ.SUB_ONLY);
                Long l = null;
                C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), null, "switch_sub_only_live"));
                if (C29232Bdc.LJFF(this.dataChannel)) {
                    long j2 = memberMessage.allowPreviewTime;
                    Room room2 = this.LJLJJLL;
                    if (room2 != null) {
                        j = room2.maxPreviewTime;
                    } else {
                        j = -1;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("message previewTime");
                    LIZ.append(memberMessage.allowPreviewTime);
                    LIZ.append(", max preview time:");
                    Room room3 = this.LJLJJLL;
                    if (room3 != null) {
                        l = Long.valueOf(room3.maxPreviewTime);
                    }
                    C07670Rv.LJ(LIZ, l, LIZ, "SubscriptionTrialLiveCardWidget");
                    if (j2 > 0 && this.LJLJJLL != null && j > 0) {
                        j2 = j;
                    }
                    Room room4 = this.LJLJJLL;
                    if (room4 != null) {
                        room4.allowPreviewTime = j2;
                    }
                    this.LJLJLJ = j2;
                    LJZ(j2);
                    return;
                }
                if (!C29232Bdc.LJIILLIIL(this.dataChannel)) {
                    return;
                }
                this.dataChannel.rv0(SubOnlyLiveAudienceStatusChannel.class, BKI.SUBSCRIBER_NORMAL_LIVE);
                return;
            }
            if (i != 36) {
                return;
            }
            Room room5 = this.LJLJJLL;
            if (room5 != null) {
                room5.disablePreviewSubOnly = 1L;
            }
            if (!C29232Bdc.LJFF(this.dataChannel)) {
                return;
            }
            hide();
            CountDownTimerC29857Bnh countDownTimerC29857Bnh = this.LJLJL;
            if (countDownTimerC29857Bnh != null) {
                countDownTimerC29857Bnh.cancel();
            }
            this.dataChannel.rv0(SubOnlyLiveAudienceStatusChannel.class, BKI.NON_SUBSCRIBER_FORBIDDEN_LIVE);
            C30770C5u.LJII = false;
        }
    }
}
