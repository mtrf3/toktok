package com.bytedance.android.livesdk.impl.revenue.subscription.widget;

import X.AnonymousClass064;
import X.B3N;
import X.BCW;
import X.BJM;
import X.BNK;
import X.BQY;
import X.BZI;
import X.C05200Ii;
import X.C09;
import X.C15380j0;
import X.C15490jB;
import X.C15540jG;
import X.C15650jR;
import X.C17280m4;
import X.C1EW;
import X.C1YG;
import X.C1YH;
import X.C221108m2;
import X.C28787BRn;
import X.C29232Bdc;
import X.C29306Beo;
import X.C29888BoC;
import X.C29895BoJ;
import X.C29897BoL;
import X.C29899BoN;
import X.C29901BoP;
import X.C29927Bop;
import X.C2A4;
import X.C30770C5u;
import X.C30929CBx;
import X.C47121t6;
import X.C62822Ol8;
import X.C68322mC;
import X.C6H;
import X.C73943T0h;
import X.C78720Uuy;
import X.CN1;
import X.EnumC30208BtM;
import X.EnumC31509CYf;
import X.InterfaceC06390Mx;
import X.InterfaceC30205BtJ;
import X.InterfaceC30442Bx8;
import X.Q7L;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import Y.ARunnableS41S0100000_5;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.live.room.SubscribeSuccessEvent;
import com.bytedance.android.live.room.SubscribeSuccessToastEvent;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.dataChannel.AudienceShowOrientationBeginTime;
import com.bytedance.android.livesdk.dataChannel.CommentCompressOnSmallEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentWidthOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionButtonIconNewSetting;
import com.bytedance.android.livesdk.livesetting.subscription.SubscribeRoomPositionSetting;
import com.bytedance.android.livesdk.model.message.SubNotifyMessage;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class SubscribeIconWidget extends RoomRecycleWidget implements OnIMMessageListener {
    public Room LJLIL;
    public boolean LJLJI;
    public IMessageManager LJLJJI;
    public ImageView LJLJJL;
    public C2A4 LJLJJLL;
    public View LJLJL;
    public C47121t6 LJLJLJ;
    public boolean LJLL;
    public C29888BoC LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public boolean LJLILLLLZI = true;
    public final C15540jG LJLJLLL = new C15540jG();
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(C29897BoL.INSTANCE);

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "SubscribeIconWidget";
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public static String LJLZ() {
        int value = SubscribeRoomPositionSetting.INSTANCE.getValue();
        if (value != 0) {
            if (value != 1) {
                if (value != 2) {
                    return "";
                }
                return "comment_right";
            }
            return "comment_left";
        }
        return "live_left_corner";
    }

    private final void LLFF() {
        SubscribeInfo subscribeInfo;
        User owner;
        Room room = (Room) this.dataChannel.kv0(RoomChannel.class);
        if (room != null && (owner = room.getOwner()) != null) {
            subscribeInfo = owner.getSubscribeInfo();
        } else {
            subscribeInfo = null;
        }
        if (!o.LJ(InterfaceC30442Bx8.c2.LIZ(), Boolean.TRUE) && subscribeInfo != null && subscribeInfo.isSubscribed() && subscribeInfo.userGiftSubAuth && subscribeInfo.anchorGiftSubAuth) {
            C1YG c1yg = new C1YG(getView());
            c1yg.LJI = 5000L;
            c1yg.LJII = true;
            c1yg.LJIILLIIL = C15380j0.LJIILJJIL(R.string.lpj);
            c1yg.LJIIL = new C29895BoJ(this);
            C30770C5u.LIZLLL(new C1YH(c1yg), C09.GIFTSUB_FUNCTION_ONLINE_NOTIFY);
        }
    }

    public final void LJZ() {
        Room room;
        Long l;
        String str;
        if (!this.LJLILLLLZI) {
            C73943T0h LIZ = C73943T0h.LIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("subscribe_entrance_");
            LIZ2.append(LJLZ());
            LIZ.LIZIZ(new B3N(X1D.LIZIZ(LIZ2)));
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (l = (Long) dataChannel.kv0(AudienceShowOrientationBeginTime.class)) != null) {
                IDefinitionService iDefinitionService = (IDefinitionService) CN1.LIZ(IDefinitionService.class);
                Room room2 = this.LJLIL;
                if (room2 == null || (str = C17280m4.LIZ(room2)) == null) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                iDefinitionService.Hu(1, l.longValue(), str, 0, "click_sub");
                return;
            }
            return;
        }
        Context LIZIZ = C29306Beo.LIZIZ(this.context);
        if ((LIZIZ == null && (LIZIZ = C15380j0.LIZLLL()) == null) || (room = this.LJLIL) == null) {
            return;
        }
        if (C29232Bdc.LJIILL(room)) {
            ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).Ee(LIZIZ, room, LJLZ());
            return;
        }
        InterfaceC06390Mx LIZ3 = CN1.LIZ(ISubscribeService.class);
        o.LJIIIIZZ(LIZ3, "getService(\n            …va,\n                    )");
        ((ISubscribeService) LIZ3).kg0(LIZIZ, room, LJLZ(), null);
    }

    public final void LJZI() {
        String str;
        List<String> list;
        boolean LJIILL = C29232Bdc.LJIILL(this.LJLIL);
        int i = R.drawable.dbk;
        if (LJIILL) {
            ImageView imageView = this.LJLJJL;
            if (imageView != null) {
                C29306Beo.LJJLJLI(imageView);
            }
            C78720Uuy LJII = C15650jR.LIZ().LJII(R.drawable.dbk);
            LJII.LJIJ(ImageView.ScaleType.CENTER_INSIDE);
            ImageModel LJ = C29232Bdc.LJ(this.LJLIL);
            if (LJ != null) {
                list = LJ.getUrls();
            } else {
                list = null;
            }
            LJII.LIZ(list);
            LJII.LIZLLL(ImageView.ScaleType.CENTER_INSIDE);
            LJII.LJIIJJI(this.LJLJJL);
            return;
        }
        ImageView imageView2 = this.LJLJJL;
        if (imageView2 != null) {
            if (LiveSubscriptionButtonIconNewSetting.INSTANCE.isEnabled()) {
                i = R.drawable.dbl;
            }
            imageView2.setImageResource(i);
        }
        C2A4 c2a4 = this.LJLJJLL;
        if (c2a4 != null) {
            C15540jG c15540jG = this.LJLJLLL;
            c15540jG.getClass();
            c15540jG.LIZ = c2a4;
            c15540jG.LIZIZ = "tiktok_live_broadcast_normal_1";
            if (LiveSubscriptionButtonIconNewSetting.INSTANCE.isEnabled()) {
                str = "tiktok_live_broadcast_subscribe_icon_change_animation_new.webp";
            } else {
                str = "tiktok_live_broadcast_subscribe_icon_change_animation.webp";
            }
            c15540jG.LIZJ = str;
            c15540jG.LJFF = false;
            c15540jG.LJIIJ = true;
            c15540jG.LJI = 1;
            c15540jG.LJIIL = true;
            c15540jG.LJ = new BQY(this);
        }
        C15490jB.LJI(this.LJLJLLL);
        ImageView imageView3 = this.LJLJJL;
        if (imageView3 == null) {
            return;
        }
        C29306Beo.LJJLJLI(imageView3);
    }

    public final void LL() {
        User owner;
        Long l;
        String str;
        Room room = this.LJLIL;
        Long l2 = null;
        if (room == null || (owner = room.getOwner()) == null || owner.getSubscribeInfo() == null) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_subscribe_icon_click");
        LIZ.LJIILLIIL(this.dataChannel);
        Room room2 = this.LJLIL;
        if (room2 != null) {
            l = Long.valueOf(room2.getOwnerUserId());
        } else {
            l = null;
        }
        LIZ.LJIJJ(l, "anchor_id");
        Room room3 = this.LJLIL;
        if (room3 != null) {
            l2 = Long.valueOf(room3.getId());
        }
        LIZ.LJIJJ(l2, "room_id");
        LIZ.LJIJJ(BJM.LJFF(), "enter_from_merge");
        LIZ.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
        LIZ.LJIJJ("click", "action_type");
        LIZ.LJIJJ(BJM.LJIILIIL(), "request_id");
        LIZ.LJIJJ(BJM.LJIJ(), "video_id");
        if (this.LJLJI) {
            str = "anchor";
        } else {
            str = "user";
        }
        LIZ.LJIJJ(str, "user_type");
        LIZ.LJIJJ(LJLZ(), "click_position");
        LIZ.LJJIFFI(C29232Bdc.LJIJJ(this.dataChannel));
        LIZ.LJJIIJZLJL();
    }

    public final void LLF() {
        C2A4 c2a4 = this.LJLJJLL;
        if (c2a4 != null) {
            C29306Beo.LJJLJLI(c2a4);
        }
        ImageView imageView = this.LJLJJL;
        if (imageView != null) {
            C29306Beo.LJIIIZ(imageView);
        }
        this.LJLJLLL.LJ();
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LJLJLLL.LIZ();
        ((Handler) this.LJLLI.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        if (ToolBarButtonWithTextExperiment.hasText()) {
            return R.layout.dn2;
        }
        return R.layout.dn0;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    public final void LJZL(int i) {
        Long l;
        BZI LIZ = C28787BRn.LIZ("livesdk_subscription_gift_sub_bubble_show");
        Room room = this.LJLIL;
        Long l2 = null;
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        LIZ.LJIJJ(String.valueOf(l), "anchor_id");
        Room room2 = this.LJLIL;
        if (room2 != null) {
            l2 = Long.valueOf(room2.getId());
        }
        LIZ.LJIJJ(String.valueOf(l2), "room_id");
        LIZ.LJIJJ(Integer.valueOf(i), "bubble_type");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLJJL = (ImageView) findViewById(R.id.ldg);
        this.LJLJJLL = (C2A4) findViewById(R.id.lco);
        this.LJLJLJ = (C47121t6) findViewById(R.id.ldm);
        this.LJLJL = findViewById(R.id.ldd);
        this.LJLLILLLL = (C29888BoC) findViewById(R.id.ko7);
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        boolean z;
        boolean z2;
        IMessageManager iMessageManager;
        boolean z3;
        User owner;
        Long l;
        String str;
        Boolean bool;
        LifecycleOwner lifecycleOwner;
        Long l2 = null;
        if (LiveCommentWidthOptSetting.INSTANCE.isStrategyEnable()) {
            ImageView imageView = this.LJLJJL;
            if (imageView != null) {
                imageView.post(new ARunnableS41S0100000_5(this, 155));
            }
            Object obj = this.context;
            if (obj instanceof LifecycleOwner) {
                o.LJII(obj, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                lifecycleOwner = (LifecycleOwner) obj;
            } else {
                lifecycleOwner = null;
            }
            this.dataChannel.ov0(lifecycleOwner, CommentCompressOnSmallEvent.class, new AqS171S0100000_5(this, 404));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLIL = room;
        Boolean bool2 = (Boolean) this.dataChannel.kv0(BCW.class);
        if (bool2 != null) {
            z = bool2.booleanValue();
        } else {
            z = true;
        }
        this.LJLILLLLZI = z;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (bool = (Boolean) dataChannel2.kv0(UserIsAnchorChannel.class)) != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = false;
        }
        this.LJLJI = z2;
        C05200Ii.LIZIZ();
        Room room2 = this.LJLIL;
        if (room2 != null) {
            room2.getId();
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            iMessageManager = (IMessageManager) dataChannel3.kv0(C29927Bop.class);
        } else {
            iMessageManager = null;
        }
        this.LJLJJI = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.SUB_NOTIFY_MESSAGE.getIntType(), (OnIMMessageListener) this);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.nv0(this, this, SubscribeSuccessEvent.class, new AqS171S0100000_5(this, 838));
        dataChannelGlobal.nv0(this, this, SubscribeSuccessToastEvent.class, new AqS171S0100000_5(this, 839));
        LJZI();
        if (this.LJLILLLLZI) {
            C47121t6 c47121t6 = this.LJLJLJ;
            if (c47121t6 != null) {
                c47121t6.setVisibility(0);
            }
            C47121t6 c47121t62 = this.LJLJLJ;
            if (c47121t62 != null) {
                c47121t62.setText(C15380j0.LJIILJJIL(R.string.ob6));
            }
        }
        InterfaceC30205BtJ pk = ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(this.dataChannel);
        if (pk != null) {
            pk.LJIJI(EnumC30208BtM.SUBSCRIPTION_ICON, this.dataChannel);
        }
        C6H.LIZ(new ACListenerS25S0100000_5(this, 185), getView());
        show();
        if (this.LJLILLLLZI && !o.LJ(InterfaceC30442Bx8.b2.LIZ(), Boolean.TRUE) && C29232Bdc.LJIILL(this.LJLIL)) {
            C1YG c1yg = new C1YG(getView());
            c1yg.LJI = 5000L;
            c1yg.LJII = true;
            c1yg.LIZ(R.string.oeb);
            c1yg.LJIIL = C29901BoP.LJLIL;
            C30770C5u.LIZLLL(new C1YH(c1yg), C09.GUIDE_SUBSCRIPTION_ROOM_ENTRANCE);
        }
        LLFF();
        Room room3 = this.LJLIL;
        if (room3 != null && (owner = room3.getOwner()) != null && owner.getSubscribeInfo() != null) {
            BZI LIZ = C28787BRn.LIZ("livesdk_subscribe_icon_show");
            Room room4 = this.LJLIL;
            if (room4 != null) {
                l = Long.valueOf(room4.getOwnerUserId());
            } else {
                l = null;
            }
            LIZ.LJIJJ(l, "anchor_id");
            Room room5 = this.LJLIL;
            if (room5 != null) {
                l2 = Long.valueOf(room5.getId());
            }
            LIZ.LJIJJ(l2, "room_id");
            LIZ.LJIJJ(BJM.LJFF(), "enter_from_merge");
            LIZ.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
            LIZ.LJIJJ("click", "action_type");
            LIZ.LJIJJ(BJM.LJIILIIL(), "request_id");
            LIZ.LJIJJ(BJM.LJIJ(), "video_id");
            if (this.LJLJI) {
                str = "anchor";
            } else {
                str = "user";
            }
            LIZ.LJIJJ(str, "user_type");
            LIZ.LJIJJ(LJLZ(), "show_entrance");
            LIZ.LJJIFFI(C29232Bdc.LJIJJ(this.dataChannel));
            LIZ.LJIILLIIL(this.dataChannel);
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
                LIZ.LJJIIJZLJL();
            } else {
                LIZ.LJJIJ();
                LIZ.LJJIIZ();
                LIZ.LJJIIZI();
            }
            C30929CBx.LJIILLIIL(LJLZ());
        }
        Boolean bool3 = (Boolean) this.dataChannel.kv0(BNK.class);
        if (bool3 != null) {
            z3 = bool3.booleanValue();
        } else {
            z3 = false;
        }
        if (!z3) {
            C47121t6 c47121t63 = this.LJLJLJ;
            if (c47121t63 != null) {
                c47121t63.setVisibility(8);
            }
            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
            View view = getView();
            o.LJII(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            anonymousClass064.LJII((ConstraintLayout) view);
            ImageView imageView2 = this.LJLJJL;
            if (imageView2 != null) {
                anonymousClass064.LJIIIIZZ(imageView2.getId(), 4, 0, 4);
            }
            View view2 = getView();
            o.LJII(view2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            anonymousClass064.LIZIZ((ConstraintLayout) view2);
            C29888BoC c29888BoC = this.LJLLILLLL;
            if (c29888BoC == null) {
                return;
            }
            c29888BoC.setVisibility(0);
            return;
        }
        C29888BoC c29888BoC2 = this.LJLLILLLL;
        if (c29888BoC2 == null) {
            return;
        }
        c29888BoC2.setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.Object, java.lang.String] */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        String str;
        User owner;
        if (iMessage instanceof SubNotifyMessage) {
            SubNotifyMessage subNotifyMessage = (SubNotifyMessage) iMessage;
            if (subNotifyMessage.subscribeMessageType == 8) {
                C68322mC c68322mC = new C68322mC();
                c68322mC.element = "";
                Iterator<TextPiece> it = subNotifyMessage.baseMessage.displayText.pieces.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    TextPiece next = it.next();
                    if (next.type == 1) {
                        ?? r1 = next.stringValue;
                        o.LJIIIIZZ(r1, "piece.stringValue");
                        c68322mC.element = r1;
                        break;
                    }
                }
                SubscribeApi subscribeApi = (SubscribeApi) Q7L.LIZIZ(SubscribeApi.class);
                Room room = this.LJLIL;
                if (room != null && (owner = room.getOwner()) != null) {
                    str = owner.getSecUid();
                } else {
                    str = null;
                }
                C1EW.LIZ(subscribeApi.getUserInfo(str)).LJJJLIIL(new AfS57S0100000_5(c68322mC, LiveTryModeCountDownThresholdSetting.DEFAULT), C29899BoN.LJLIL);
            }
            if (subNotifyMessage.subscribeMessageType == 12) {
                LLFF();
            }
        }
    }
}
