package com.bytedance.android.livesdk.impl.revenue.subscription.widget;

import X.AbstractC73672Svk;
import X.B83;
import X.B87;
import X.BCW;
import X.BZI;
import X.C09650Zl;
import X.C0NB;
import X.C15380j0;
import X.C199097rd;
import X.C1EW;
import X.C259910h;
import X.C28405BCv;
import X.C28787BRn;
import X.C29374Bfu;
import X.C29654BkQ;
import X.C29655BkR;
import X.C29674Bkk;
import X.C29677Bkn;
import X.C29678Bko;
import X.C29927Bop;
import X.C30945CCn;
import X.C30946CCo;
import X.C30953CCv;
import X.C47261Igj;
import X.C72818Shy;
import X.C73318Sq2;
import X.C73969T1h;
import X.C74050T4k;
import X.C83741Wtl;
import X.C8I2;
import X.EnumC31509CYf;
import X.InterfaceC29405BgP;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.KL2;
import X.Q7L;
import X.U2I;
import X.ViewOnLayoutChangeListenerC30947CCp;
import Y.ARunnableS24S0200000_5;
import Y.AUListenerS94S0100000_5;
import Y.AfS57S0100000_5;
import Y.IDAListenerS74S0100000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.chatroom.api.SubTimerSticker;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UpdateStickerPositionEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleWidgetSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubathonSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.android.play.core.appupdate.u;
import com.google.gson.Gson;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SubscribeTimeStickerWidget extends RoomRecycleWidget implements InterfaceC72822Si2, OnMessageListener {
    public int LJLJI;
    public int LJLJJI;
    public Room LJLJJL;
    public IMessageManager LJLJJLL;
    public boolean LJLJL;
    public long LJLJLLL;
    public long LJLL;
    public C73318Sq2 LJLLI;
    public ConstraintLayout LJLLILLLL;
    public C74050T4k LJLLJ;
    public C8I2 LJLLL;
    public U2I LJLLLL;
    public C74050T4k LJLLLLLL;
    public C74050T4k LJLZ;
    public C29674Bkk LJZ;
    public final float LJLIL = 14.0f;
    public final float LJLILLLLZI = 206.0f;
    public final CopyOnWriteArrayList<SubTimerSticker> LJLJLJ = new CopyOnWriteArrayList<>();
    public int[] LJZI = new int[4];
    public int[] LJZL = new int[4];
    public AnimatorSet LL;
    public AnimatorSet LLD;
    public AnimatorSet LLF;
    public final ArrayList<AnimatorSet> LLFF = C47261Igj.LJII(this.LL, this.LLD, this.LLF);
    public final C83741Wtl LLFFF = new C83741Wtl(0.65f, 0.0f, 0.35f, 1.0f);
    public final HashSet<Long> LLFII = new HashSet<>();

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dqk;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJLZ() {
        ConstraintLayout constraintLayout = this.LJLLILLLL;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        C29674Bkk c29674Bkk = this.LJZ;
        if (c29674Bkk != null) {
            c29674Bkk.setVisibility(8);
        }
        Iterator<AnimatorSet> it = this.LLFF.iterator();
        while (it.hasNext()) {
            AnimatorSet next = it.next();
            if (next != null) {
                next.cancel();
            }
        }
        C73318Sq2 c73318Sq2 = this.LJLLI;
        if (c73318Sq2 != null) {
            c73318Sq2.dispose();
        }
    }

    public final void LLIIII() {
        if (this.context == null) {
            return;
        }
        U2I u2i = this.LJLLLL;
        if (u2i != null) {
            u2i.setAlpha(1.0f);
        }
        U2I u2i2 = this.LJLLLL;
        if (u2i2 != null) {
            u2i2.setTextColor(C259910h.LIZIZ(R.attr.bmu, this.context));
        }
        C74050T4k c74050T4k = this.LJLLLLLL;
        if (c74050T4k != null) {
            c74050T4k.setVisibility(8);
        }
        C74050T4k c74050T4k2 = this.LJLLLLLL;
        if (c74050T4k2 != null) {
            c74050T4k2.setAlpha(0.0f);
        }
        C74050T4k c74050T4k3 = this.LJLZ;
        if (c74050T4k3 != null) {
            c74050T4k3.setVisibility(8);
        }
        C74050T4k c74050T4k4 = this.LJLZ;
        if (c74050T4k4 != null) {
            c74050T4k4.setAlpha(0.0f);
        }
        C8I2 c8i2 = this.LJLLL;
        if (c8i2 == null) {
            return;
        }
        c8i2.setSolidColor(C259910h.LIZIZ(R.attr.bmu, this.context));
    }

    public final void LLIIIL() {
        C73318Sq2 c73318Sq2;
        C73318Sq2 c73318Sq22 = this.LJLLI;
        if (c73318Sq22 != null) {
            c73318Sq22.dispose();
        }
        C73318Sq2 c73318Sq23 = new C73318Sq2();
        this.LJLLI = c73318Sq23;
        c73318Sq23.LIZ(AbstractC73672Svk.LJJIJIIJI(1000L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(this, 123)));
        if (this.LJLJL && (c73318Sq2 = this.LJLLI) != null) {
            c73318Sq2.LIZ(AbstractC73672Svk.LJJIJIIJI(LiveSubathonSetting.INSTANCE.getValue().getTimeAlignInterval(), TimeUnit.SECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(this, 124)));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return EnableRecycleSingleWidgetSetting.INSTANCE.getValue();
    }

    public final void LJZI() {
        long j;
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        Room room = this.LJLJJL;
        if (room != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        String LIZJ = ((C29374Bfu) LIZIZ).LIZJ(j);
        if (LIZJ == null) {
            LIZJ = "";
        }
        C1EW.LIZ(((SubscribeApi) Q7L.LIZIZ(SubscribeApi.class)).getSubathonTimer(this.LJLJL, LIZJ)).LJJJLIIL(new AfS57S0100000_5(this, 121), C29678Bko.LJLIL);
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        super.onUnload();
        C0NB.LJIIIZ("SubscribeTimeStickerWidget", "onUnLoad");
        C72818Shy.LJII("subathon_timer_change", this);
        IMessageManager iMessageManager = this.LJLJJLL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        C73318Sq2 c73318Sq2 = this.LJLLI;
        if (c73318Sq2 != null) {
            c73318Sq2.dispose();
        }
        this.LLFII.clear();
        Iterator<AnimatorSet> it = this.LLFF.iterator();
        while (it.hasNext()) {
            AnimatorSet next = it.next();
            if (next != null) {
                next.cancel();
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C29674Bkk c29674Bkk;
        ConstraintLayout constraintLayout;
        C74050T4k c74050T4k;
        C8I2 c8i2;
        U2I u2i;
        C74050T4k c74050T4k2;
        C0NB.LJIIIZ("SubscribeTimeStickerWidget", "onInIt");
        this.LJLJI = KL2.LJIIJJI(getContext());
        this.LJLJJI = KL2.LJIIIZ(getContext());
        View view = getView();
        C74050T4k c74050T4k3 = null;
        if (view != null) {
            c29674Bkk = (C29674Bkk) view.findViewById(R.id.c6n);
        } else {
            c29674Bkk = null;
        }
        this.LJZ = c29674Bkk;
        View view2 = getView();
        if (view2 != null) {
            constraintLayout = (ConstraintLayout) view2.findViewById(R.id.l7y);
        } else {
            constraintLayout = null;
        }
        this.LJLLILLLL = constraintLayout;
        View view3 = getView();
        if (view3 != null) {
            c74050T4k = (C74050T4k) view3.findViewById(R.id.mo6);
        } else {
            c74050T4k = null;
        }
        this.LJLLJ = c74050T4k;
        View view4 = getView();
        if (view4 != null) {
            c8i2 = (C8I2) view4.findViewById(R.id.l7s);
        } else {
            c8i2 = null;
        }
        this.LJLLL = c8i2;
        View view5 = getView();
        if (view5 != null) {
            u2i = (U2I) view5.findViewById(R.id.l7u);
        } else {
            u2i = null;
        }
        this.LJLLLL = u2i;
        View view6 = getView();
        if (view6 != null) {
            c74050T4k2 = (C74050T4k) view6.findViewById(R.id.mni);
        } else {
            c74050T4k2 = null;
        }
        this.LJLLLLLL = c74050T4k2;
        View view7 = getView();
        if (view7 != null) {
            c74050T4k3 = (C74050T4k) view7.findViewById(R.id.mnp);
        }
        this.LJLZ = c74050T4k3;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        boolean z;
        User owner;
        SubscribeInfo subscribeInfo;
        Boolean bool;
        Boolean bool2;
        super.onLoad(objArr);
        C0NB.LJIIIZ("SubscribeTimeStickerWidget", "onLoad");
        DataChannel dataChannel = this.dataChannel;
        TimerDetail timerDetail = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLJJL = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (bool2 = (Boolean) dataChannel2.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool2.booleanValue();
        } else {
            z = false;
        }
        this.LJLJL = z;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (bool = (Boolean) dataChannel3.kv0(BCW.class)) != null) {
            bool.booleanValue();
        }
        this.LJLJJLL = (IMessageManager) this.dataChannel.kv0(C29927Bop.class);
        C29674Bkk c29674Bkk = this.LJZ;
        if (c29674Bkk != null) {
            c29674Bkk.setVisibility(8);
        }
        ConstraintLayout constraintLayout = this.LJLLILLLL;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        ConstraintLayout constraintLayout2 = this.LJLLILLLL;
        if (constraintLayout2 != null) {
            constraintLayout2.setX(KL2.LIZJ(this.context, this.LJLIL));
        }
        ConstraintLayout constraintLayout3 = this.LJLLILLLL;
        if (constraintLayout3 != null) {
            constraintLayout3.setY(KL2.LIZJ(this.context, this.LJLILLLLZI));
        }
        C29674Bkk c29674Bkk2 = this.LJZ;
        if (c29674Bkk2 != null) {
            c29674Bkk2.LJLILLLLZI = this;
            c29674Bkk2.LJLIL = this.LJLJL;
        }
        if (isViewValid() && this.context != null) {
            int[] iArr = this.LJZI;
            iArr[0] = 0;
            iArr[1] = (((this.LJLJJI - C15380j0.LJFF(R.dimen.ahd)) - C15380j0.LJFF(R.dimen.aek)) - ((int) KL2.LIZJ(this.context, 10.0f))) - C15380j0.LJFF(R.dimen.a9g);
            int[] iArr2 = this.LJZI;
            iArr2[2] = 0;
            iArr2[3] = this.LJLJI;
            int[] copyOf = Arrays.copyOf(iArr2, iArr2.length);
            o.LJIIIIZZ(copyOf, "copyOf(this, newSize)");
            this.LJZL = copyOf;
        }
        C29674Bkk c29674Bkk3 = this.LJZ;
        if (c29674Bkk3 != null) {
            c29674Bkk3.LJJZZIII(this.LJZI);
        }
        C29674Bkk c29674Bkk4 = this.LJZ;
        if (c29674Bkk4 != null) {
            c29674Bkk4.setStickerView(this.LJLLILLLL);
        }
        B87 b87 = (B87) this.dataChannel.kv0(C28405BCv.class);
        if (b87 != null && b87.LJLIL) {
            LJZI();
        } else {
            Room room2 = this.LJLJJL;
            if (room2 != null && (owner = room2.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null) {
                timerDetail = subscribeInfo.timerDetail;
            }
            LJZL(timerDetail, true);
        }
        C72818Shy.LIZLLL("subathon_timer_change", this);
        IMessageManager iMessageManager = this.LJLJJLL;
        if (iMessageManager != null) {
            iMessageManager.addAsyncMessageListener(EnumC31509CYf.SUB_TIMER_STICKER_MESSAGE.getIntType(), this);
        }
        DataChannel dataChannel4 = this.dataChannel;
        dataChannel4.mv0(LinkCrossRoomStateChangeEvent.class, this, new C29655BkR(this));
        dataChannel4.ov0(this, UpdateStickerPositionEvent.class, new C29654BkQ(this));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        C30946CCo.LIZ(new ARunnableS24S0200000_5(this, iMessage, 27));
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        User owner;
        SubscribeInfo subscribeInfo;
        if (o.LJ(c199097rd.LJLIL, "subathon_timer_change")) {
            Gson gson = C09650Zl.LIZIZ;
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            String str = null;
            if (interfaceC78280Uns != null) {
                str = u.LJJIJIL(interfaceC78280Uns, "timerDetail", "");
            }
            TimerDetail timerDetail = (TimerDetail) GsonProtectorUtils.fromJson(gson, str, TimerDetail.class);
            if (timerDetail == null) {
                LJZI();
                return;
            }
            Room room = this.LJLJJL;
            if (room != null && (owner = room.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null) {
                subscribeInfo.timerDetail = timerDetail;
            }
            LJZL(timerDetail, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZL(com.bytedance.android.livesdk.chatroom.api.TimerDetail r23, boolean r24) {
        /*
            r22 = this;
            r4 = r23
            if (r4 != 0) goto L5
            return
        L5:
            int r0 = r4.auditStatus
            if (r0 != 0) goto La
            return
        La:
            int r1 = r4.timerStatus
            r5 = 0
            r7 = r22
            if (r1 == 0) goto L1f
            r0 = 1
            if (r1 == r0) goto L25
            r0 = 2
            if (r1 == r0) goto L1b
        L17:
            r7.LJLZ()
        L1a:
            return
        L1b:
            boolean r0 = r7.LJLJL
            r8 = 0
            goto L26
        L1f:
            boolean r0 = r7.LJLJL
            if (r0 == 0) goto L17
            r8 = 0
            goto L28
        L25:
            r8 = 1
        L26:
            r24 = 0
        L28:
            if (r0 == 0) goto L17
            java.lang.String r3 = r4.anchorSideTitle
            java.lang.String r2 = r4.userSideTitle
            long r0 = r4.timeIncreasePerSubS
            java.lang.String r9 = r7.LJZ(r0, r3, r2)
            if (r8 == 0) goto Laa
            long r2 = r4.remainingTimeS
            long r0 = r4.timestampS
            long r10 = X.C30953CCv.LIZ(r2, r0, r5)
        L3e:
            long r12 = r4.totalTimeS
            long r14 = r4.stickerX
            long r5 = r4.stickerY
            long r2 = r4.screenW
            long r0 = r4.screenH
            r18 = r2
            r20 = r0
            r16 = r5
            r7.LLIIIJ(r8, r9, r10, r12, r14, r16, r18, r20)
            if (r24 == 0) goto Lad
            boolean r0 = r7.LJLJL
            if (r0 == 0) goto Lad
            com.bytedance.android.livesdk.livesetting.subscription.LiveSubathonSetting r0 = com.bytedance.android.livesdk.livesetting.subscription.LiveSubathonSetting.INSTANCE
            com.bytedance.android.livesdk.livesetting.subscription.LiveSubathonConfig r0 = r0.getValue()
            boolean r0 = r0.getAnchorTimerAutoStart()
            if (r0 == 0) goto Lad
            java.lang.Class<com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeApi> r0 = com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeApi.class
            java.lang.Object r8 = X.Q7L.LIZIZ(r0)
            com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeApi r8 = (com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeApi) r8
            r9 = 2
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.LJLJJL
            r1 = 0
            if (r0 == 0) goto La7
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            if (r0 == 0) goto La7
            com.bytedance.android.live.base.model.user.SubscribeInfo r0 = r0.getSubscribeInfo()
            if (r0 == 0) goto La7
            com.bytedance.android.livesdk.chatroom.api.TimerDetail r0 = r0.timerDetail
            if (r0 == 0) goto La7
            long r10 = r0.timerId
        L84:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.LJLJJL
            if (r0 == 0) goto L8c
            long r1 = r0.getId()
        L8c:
            java.lang.Long r13 = java.lang.Long.valueOf(r1)
            r12 = 0
            X.Svk r0 = r8.updateSubathonTimerStatus(r9, r10, r12, r13)
            X.Svk r2 = X.C1EW.LIZ(r0)
            Y.AfS57S0100000_5 r1 = new Y.AfS57S0100000_5
            r0 = 341(0x155, float:4.78E-43)
            r1.<init>(r7, r0)
            X.2jO<T> r0 = new X.InterfaceC64592gB() { // from class: X.2jO
                static {
                    /*
                        X.2jO r0 = new X.2jO
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.2jO<T>) X.2jO.LJLIL X.2jO
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C66582jO.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C66582jO.<init>():void");
                }

                @Override // X.InterfaceC64592gB
                public final void accept(java.lang.Object r3) {
                    /*
                        r2 = this;
                        java.lang.Throwable r3 = (java.lang.Throwable) r3
                        java.lang.StringBuilder r1 = X.X1D.LIZ()
                        java.lang.String r0 = "on sticker start api error: "
                        r1.append(r0)
                        java.lang.String r0 = r3.getMessage()
                        r1.append(r0)
                        java.lang.String r1 = X.X1D.LIZIZ(r1)
                        java.lang.String r0 = "SubscribeTimeStickerWidget"
                        X.C0NB.LJ(r0, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C66582jO.accept(java.lang.Object):void");
                }
            }
            r2.LJJJLIIL(r1, r0)
            goto L1a
        La7:
            r10 = 0
            goto L84
        Laa:
            long r10 = r4.remainingTimeS
            goto L3e
        Lad:
            if (r8 == 0) goto Lc1
            long r5 = r4.remainingTimeS
            r1 = 10
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lbe
            java.lang.String r0 = "countdown"
        Lb9:
            r7.LLF(r4, r0)
            goto L1a
        Lbe:
            java.lang.String r0 = "normal"
            goto Lb9
        Lc1:
            java.lang.String r0 = "suspened"
            goto Lb9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.subscription.widget.SubscribeTimeStickerWidget.LJZL(com.bytedance.android.livesdk.chatroom.api.TimerDetail, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        if (r2 == 4) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LL(com.bytedance.android.livesdk.chatroom.api.SubTimerSticker r7, java.lang.String r8) {
        /*
            r6 = this;
            int r2 = r7.timerStatus
            r5 = 0
            r1 = 1
            if (r2 != r1) goto L82
            X.Sq2 r0 = r6.LJLLI
            if (r0 == 0) goto L77
            boolean r0 = r0.LJLILLLLZI
            if (r0 != r1) goto L77
        Le:
            java.lang.String r4 = "finished"
        L10:
            java.lang.String r0 = "livesdk_subathon_indicator_show"
            X.BZI r2 = X.C28787BRn.LIZ(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r6.LJLJJL
            r3 = 0
            if (r0 == 0) goto L75
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            if (r0 == 0) goto L75
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L29:
            r2.LJ(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r6.LJLJJL
            if (r0 == 0) goto L38
            long r0 = r0.getId()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
        L38:
            r2.LJJIII(r3)
            boolean r0 = r6.LJLJL
            if (r0 == 0) goto L72
            java.lang.String r1 = "anchor"
        L41:
            java.lang.String r0 = "user_type"
            r2.LJIJJ(r1, r0)
            java.lang.String r1 = r7.anchorSideTitle
            java.lang.String r0 = r7.userSideTitle
            r6.LLII(r2, r1, r0)
            long r0 = r7.timeIncreasePerSub
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "subathon_rules"
            r2.LJIJJ(r1, r0)
            int r0 = r7.subIncreaseCount
            if (r0 <= 0) goto L5d
            r5 = 1
        L5d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.String r0 = "is_new_subscribers"
            r2.LJIJJ(r1, r0)
            if (r8 != 0) goto L69
            r8 = r4
        L69:
            java.lang.String r0 = "indicator_status"
            r2.LJIJJ(r8, r0)
            r2.LJJIIJZLJL()
            return
        L72:
            java.lang.String r1 = "user"
            goto L41
        L75:
            r0 = r3
            goto L29
        L77:
            long r3 = r6.LJLJLLL
            r1 = 10
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L93
            java.lang.String r4 = "countdown"
            goto L10
        L82:
            r0 = 2
            if (r2 != r0) goto L88
            java.lang.String r4 = "suspened"
            goto L10
        L88:
            r0 = 3
            if (r2 != r0) goto L8e
            java.lang.String r4 = "delete"
            goto L10
        L8e:
            r0 = 4
            if (r2 != r0) goto L93
            goto Le
        L93:
            java.lang.String r4 = "normal"
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.subscription.widget.SubscribeTimeStickerWidget.LL(com.bytedance.android.livesdk.chatroom.api.SubTimerSticker, java.lang.String):void");
    }

    public final void LLF(TimerDetail timerDetail, String str) {
        Long l;
        Long l2;
        String str2;
        User owner;
        BZI LIZ = C28787BRn.LIZ("livesdk_subathon_indicator_show");
        Room room = this.LJLJJL;
        Long l3 = null;
        if (room != null && (owner = room.getOwner()) != null) {
            l = Long.valueOf(owner.getId());
        } else {
            l = null;
        }
        LIZ.LJ(l);
        Room room2 = this.LJLJJL;
        if (room2 != null) {
            l2 = Long.valueOf(room2.getId());
        } else {
            l2 = null;
        }
        LIZ.LJJIII(l2);
        if (this.LJLJL) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        LIZ.LJIJJ(str2, "user_type");
        LLFZ(LIZ, timerDetail);
        if (timerDetail != null) {
            l3 = Long.valueOf(timerDetail.timeIncreasePerSubS);
        }
        LIZ.LJIJJ(l3, "subathon_rules");
        int i = 0;
        if (timerDetail != null && timerDetail.subCount > 0) {
            i = 1;
        }
        LIZ.LJIJJ(Integer.valueOf(i), "is_new_subscribers");
        LIZ.LJIJJ(str, "indicator_status");
        LIZ.LJJIIJZLJL();
    }

    public final void LLFFF(SubTimerSticker subTimerSticker, boolean z) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        long j = subTimerSticker.timeIncrease;
        if (j > 0 && j == subTimerSticker.timeIncreasePerSub) {
            if (z && (animatorSet2 = this.LL) != null && animatorSet2.isRunning()) {
                this.LJLJLJ.add(subTimerSticker);
                return;
            }
            long j2 = this.LJLJLLL;
            long j3 = subTimerSticker.timeIncrease;
            if (this.context != null) {
                AnimatorSet animatorSet3 = this.LL;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                }
                C74050T4k c74050T4k = this.LJLLLLLL;
                if (c74050T4k != null) {
                    c74050T4k.setVisibility(0);
                }
                C74050T4k c74050T4k2 = this.LJLLLLLL;
                if (c74050T4k2 != null) {
                    c74050T4k2.setAlpha(0.0f);
                }
                C74050T4k c74050T4k3 = this.LJLLLLLL;
                if (c74050T4k3 != null) {
                    c74050T4k3.setText(C15380j0.LJIILL(R.string.oen, Long.valueOf(j3)));
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.LL = animatorSet4;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLLLL, (Property<U2I, Float>) View.ALPHA, 1.0f, 0.0f);
                ofFloat.setInterpolator(this.LLFFF);
                ofFloat.setStartDelay(0L);
                ofFloat.setDuration(200L);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LJLLLLLL, (Property<C74050T4k, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setInterpolator(this.LLFFF);
                ofFloat2.setStartDelay(200L);
                ofFloat2.setDuration(200L);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.LJLLLLLL, (Property<C74050T4k, Float>) View.TRANSLATION_Y, 13.0f, 0.0f);
                ofFloat3.setInterpolator(this.LLFFF);
                ofFloat3.setStartDelay(200L);
                ofFloat3.setDuration(200L);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.LJLLLLLL, (Property<C74050T4k, Float>) View.ALPHA, 1.0f, 0.0f);
                ofFloat4.setInterpolator(this.LLFFF);
                long j4 = 2 * 200;
                long j5 = j4 + 1600;
                ofFloat4.setStartDelay(j5);
                ofFloat4.setDuration(200L);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.LJLLLLLL, (Property<C74050T4k, Float>) View.TRANSLATION_Y, 0.0f, -13.0f);
                ofFloat5.setInterpolator(this.LLFFF);
                ofFloat5.setStartDelay(j5);
                ofFloat5.setDuration(200L);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.LJLLLL, (Property<U2I, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat6.setInterpolator(this.LLFFF);
                long j6 = j5 + 200;
                ofFloat6.setStartDelay(j6);
                ofFloat6.setDuration(200L);
                ValueAnimator duration = ValueAnimator.ofArgb(C259910h.LIZIZ(R.attr.bmu, this.context), C259910h.LIZIZ(R.attr.ape, this.context)).setDuration(j4);
                duration.setStartDelay(j6);
                duration.setInterpolator(this.LLFFF);
                duration.addUpdateListener(new AUListenerS94S0100000_5(this, 65));
                ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(j4);
                duration2.setStartDelay(j6);
                duration2.setInterpolator(this.LLFFF);
                duration2.addUpdateListener(new C30945CCn(j3, this, j2));
                ValueAnimator duration3 = ValueAnimator.ofArgb(C259910h.LIZIZ(R.attr.ape, this.context), C259910h.LIZIZ(R.attr.bmu, this.context)).setDuration(200L);
                duration3.setStartDelay(j5 + j4 + LiveChatShowDelayForHotLiveSetting.DEFAULT);
                duration3.setInterpolator(this.LLFFF);
                duration3.addUpdateListener(new AUListenerS94S0100000_5(this, 66));
                animatorSet4.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, duration, duration2, duration3);
                animatorSet4.addListener(new IDAListenerS74S0100000_5(this, 39));
                animatorSet4.start();
            }
            this.LJLL = subTimerSticker.totalTime;
            this.LJLJLLL = C30953CCv.LIZ(subTimerSticker.remainingTime, subTimerSticker.timestamp, false);
            C8I2 c8i2 = this.LJLLL;
            if (c8i2 == null) {
                return;
            }
            c8i2.setTotalTime(this.LJLL);
            return;
        }
        if (j >= 0) {
            if (!this.LLFII.contains(Long.valueOf(subTimerSticker.timerId))) {
                if (z && (animatorSet = this.LL) != null && animatorSet.isRunning()) {
                    this.LJLJLJ.add(subTimerSticker);
                    return;
                }
                long j7 = subTimerSticker.timerId;
                if (this.context != null) {
                    this.LLFII.add(Long.valueOf(j7));
                    C74050T4k c74050T4k4 = this.LJLZ;
                    if (c74050T4k4 != null) {
                        c74050T4k4.setVisibility(0);
                    }
                    C74050T4k c74050T4k5 = this.LJLZ;
                    if (c74050T4k5 != null) {
                        c74050T4k5.setAlpha(0.0f);
                    }
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.LLD = animatorSet5;
                    ValueAnimator duration4 = ValueAnimator.ofArgb(C259910h.LIZIZ(R.attr.bmu, this.context), C259910h.LIZIZ(R.attr.ape, this.context)).setDuration(200L);
                    duration4.setRepeatCount(2);
                    duration4.setRepeatMode(2);
                    duration4.setStartDelay(0L);
                    duration4.setInterpolator(this.LLFFF);
                    duration4.addUpdateListener(new AUListenerS94S0100000_5(this, 67));
                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.LJLLLL, (Property<U2I, Float>) View.ALPHA, 1.0f, 0.0f);
                    ofFloat7.setInterpolator(this.LLFFF);
                    ofFloat7.setStartDelay(1200L);
                    ofFloat7.setDuration(200L);
                    ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.LJLZ, (Property<C74050T4k, Float>) View.ALPHA, 0.0f, 1.0f);
                    ofFloat8.setInterpolator(this.LLFFF);
                    ofFloat8.setStartDelay(LinkMicRtcMixBitrateSetting.DEFAULT + 200);
                    ofFloat8.setDuration(200L);
                    ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.LJLZ, (Property<C74050T4k, Float>) View.ALPHA, 1.0f, 0.0f);
                    ofFloat9.setInterpolator(this.LLFFF);
                    ofFloat9.setStartDelay(3400L);
                    ofFloat9.setDuration(200L);
                    ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.LJLLLL, (Property<U2I, Float>) View.ALPHA, 0.0f, 1.0f);
                    ofFloat10.setInterpolator(this.LLFFF);
                    ofFloat10.setStartDelay(3400 + 200);
                    ofFloat10.setDuration(200L);
                    ValueAnimator duration5 = ValueAnimator.ofArgb(C259910h.LIZIZ(R.attr.ape, this.context), C259910h.LIZIZ(R.attr.bmu, this.context)).setDuration(200L);
                    duration5.setStartDelay(4200L);
                    duration5.setInterpolator(this.LLFFF);
                    duration5.addUpdateListener(new AUListenerS94S0100000_5(this, 68));
                    animatorSet5.playTogether(duration4, ofFloat7, ofFloat8, ofFloat9, ofFloat10, duration5);
                    animatorSet5.addListener(new IDAListenerS74S0100000_5(this, 40));
                    animatorSet5.start();
                }
            }
            this.LJLL = subTimerSticker.totalTime;
            long LIZ = C30953CCv.LIZ(subTimerSticker.remainingTime, subTimerSticker.timestamp, true);
            this.LJLJLLL = LIZ;
            C8I2 c8i22 = this.LJLLL;
            if (c8i22 != null) {
                c8i22.setTotalTime(this.LJLL);
                c8i22.setRemainTime(LIZ);
            }
            U2I u2i = this.LJLLLL;
            if (u2i == null) {
                return;
            }
            u2i.LIZ(this.LJLJLLL, false);
            return;
        }
        this.LJLL = subTimerSticker.totalTime;
        long LIZ2 = C30953CCv.LIZ(subTimerSticker.remainingTime, subTimerSticker.timestamp, true);
        this.LJLJLLL = LIZ2;
        C8I2 c8i23 = this.LJLLL;
        if (c8i23 != null) {
            c8i23.setTotalTime(this.LJLL);
            c8i23.setRemainTime(LIZ2);
        }
        U2I u2i2 = this.LJLLLL;
        if (u2i2 == null) {
            return;
        }
        u2i2.LIZ(this.LJLJLLL, false);
    }

    public final void LLFII(BZI bzi, TimerDetail timerDetail) {
        String str;
        if (timerDetail != null) {
            if (timerDetail.timerStatus == 1) {
                C73318Sq2 c73318Sq2 = this.LJLLI;
                if (c73318Sq2 == null || !c73318Sq2.LJLILLLLZI) {
                    if (this.LJLJLLL < 10) {
                        str = "countdown";
                    }
                }
                str = "finished";
            } else if (timerDetail.timerStatus == 2) {
                str = "suspened";
            } else {
                if (timerDetail.timerStatus != 4) {
                    if (timerDetail.timerStatus == 3) {
                        str = "delete";
                    }
                }
                str = "finished";
            }
            bzi.LJIJJ(str, "indicator_status");
        }
        str = "normal";
        bzi.LJIJJ(str, "indicator_status");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0009, code lost:
    
        if (r5 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLFZ(X.BZI r4, com.bytedance.android.livesdk.chatroom.api.TimerDetail r5) {
        /*
            r3 = this;
            java.lang.String r2 = ""
            if (r5 == 0) goto L8
            java.lang.String r1 = r5.anchorSideTitle
            if (r1 != 0) goto Lb
        L8:
            r1 = r2
            if (r5 == 0) goto Lf
        Lb:
            java.lang.String r0 = r5.userSideTitle
            if (r0 != 0) goto L13
        Lf:
            r3.LLII(r4, r1, r2)
            return
        L13:
            r2 = r0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.subscription.widget.SubscribeTimeStickerWidget.LLFZ(X.BZI, com.bytedance.android.livesdk.chatroom.api.TimerDetail):void");
    }

    public final String LJZ(long j, String str, String str2) {
        if (this.LJLJL) {
            if (str.length() == 0) {
                String LJIILL = C15380j0.LJIILL(R.string.oeg, String.valueOf(j));
                o.LJIIIIZZ(LJIILL, "getString(R.string.pm_su…ncreasePerSub.toString())");
                return LJIILL;
            }
            return str;
        }
        if (str2.length() == 0) {
            String LJIILL2 = C15380j0.LJIILL(R.string.oeg, String.valueOf(j));
            o.LJIIIIZZ(LJIILL2, "getString(R.string.pm_su…ncreasePerSub.toString())");
            return LJIILL2;
        }
        return str2;
    }

    public final void LLFF(int i, int i2, boolean z) {
        long j;
        User owner;
        SubscribeInfo subscribeInfo;
        TimerDetail timerDetail;
        TimerDetail timerDetail2;
        Long l;
        User owner2;
        User owner3;
        SubscribeInfo subscribeInfo2;
        if (this.LJLJL) {
            ConstraintLayout constraintLayout = this.LJLLILLLL;
            int i3 = 1;
            if (constraintLayout != null && constraintLayout.getVisibility() == 0) {
                if (z) {
                    Room room = this.LJLJJL;
                    Long l2 = null;
                    if (room != null && (owner3 = room.getOwner()) != null && (subscribeInfo2 = owner3.getSubscribeInfo()) != null) {
                        timerDetail2 = subscribeInfo2.timerDetail;
                    } else {
                        timerDetail2 = null;
                    }
                    BZI LIZ = C28787BRn.LIZ("livesdk_subathon_indicator_move");
                    Room room2 = this.LJLJJL;
                    if (room2 != null && (owner2 = room2.getOwner()) != null) {
                        l = Long.valueOf(owner2.getId());
                    } else {
                        l = null;
                    }
                    LIZ.LJ(l);
                    LLFZ(LIZ, timerDetail2);
                    if (timerDetail2 != null) {
                        l2 = Long.valueOf(timerDetail2.timeIncreasePerSubS);
                    }
                    LIZ.LJIJJ(l2, "subathon_rules");
                    if (timerDetail2 == null || timerDetail2.subCount <= 0) {
                        i3 = 0;
                    }
                    LIZ.LJIJJ(Integer.valueOf(i3), "is_new_subscribers");
                    LLFII(LIZ, timerDetail2);
                    LIZ.LJJIIJZLJL();
                }
                SubscribeApi subscribeApi = (SubscribeApi) Q7L.LIZIZ(SubscribeApi.class);
                Room room3 = this.LJLJJL;
                long j2 = 0;
                if (room3 != null && (owner = room3.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null && (timerDetail = subscribeInfo.timerDetail) != null) {
                    j = timerDetail.timerId;
                } else {
                    j = 0;
                }
                long j3 = i;
                long j4 = i2;
                long j5 = this.LJLJI;
                long j6 = this.LJLJJI;
                Room room4 = this.LJLJJL;
                if (room4 != null) {
                    j2 = room4.getId();
                }
                C1EW.LIZ(subscribeApi.updateSubathonTimerPosition(3, j, j3, j4, j5, j6, Long.valueOf(j2))).LJJJLIIL(new AfS57S0100000_5(this, 122), C29677Bkn.LJLIL);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r3.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLII(X.BZI r2, java.lang.String r3, java.lang.String r4) {
        /*
            r1 = this;
            boolean r0 = r1.LJLJL
            if (r0 == 0) goto L12
            int r0 = r3.length()
            if (r0 != 0) goto Lc
        La:
            java.lang.String r3 = "subscription_marathon"
        Lc:
            java.lang.String r0 = "subathon_title"
            r2.LJIJJ(r3, r0)
            return
        L12:
            int r0 = r4.length()
            if (r0 != 0) goto L19
            goto La
        L19:
            r3 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.subscription.widget.SubscribeTimeStickerWidget.LLII(X.BZI, java.lang.String, java.lang.String):void");
    }

    public final void LLIIIILZ(ConstraintLayout constraintLayout, int i, int i2, long j, long j2, long j3, long j4) {
        int LIZJ;
        int LIZJ2;
        float f;
        int i3 = i / 2;
        int i4 = i2 / 2;
        if (j >= 0 && j2 > 0) {
            float f2 = 1.0f;
            if (j3 > 0) {
                f = this.LJLJI / ((float) j3);
            } else {
                f = 1.0f;
            }
            if (j4 > 0) {
                f2 = this.LJLJJI / ((float) j4);
            }
            LIZJ = ((int) (((float) j) * f)) - i3;
            LIZJ2 = ((int) (((float) j2) * f2)) - i4;
        } else {
            LIZJ = (int) KL2.LIZJ(this.context, this.LJLIL);
            LIZJ2 = (int) KL2.LIZJ(this.context, this.LJLILLLLZI);
        }
        constraintLayout.setX(LIZJ);
        constraintLayout.setY(LIZJ2);
        C29674Bkk c29674Bkk = this.LJZ;
        if (c29674Bkk != null) {
            c29674Bkk.LJJLJLI(true);
        }
    }

    public final void LLIIIJ(boolean z, String str, long j, long j2, long j3, long j4, long j5, long j6) {
        this.LJLJLLL = j;
        this.LJLL = j2;
        C74050T4k c74050T4k = this.LJLLJ;
        if (c74050T4k != null) {
            c74050T4k.setText(str);
        }
        ConstraintLayout constraintLayout = this.LJLLILLLL;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        C29674Bkk c29674Bkk = this.LJZ;
        if (c29674Bkk != null) {
            c29674Bkk.setVisibility(0);
        }
        LLIIII();
        C8I2 c8i2 = this.LJLLL;
        if (c8i2 != null) {
            long j7 = this.LJLL;
            long j8 = this.LJLJLLL;
            c8i2.setTotalTime(j7);
            c8i2.setRemainTime(j8);
        }
        U2I u2i = this.LJLLLL;
        if (u2i != null) {
            u2i.LIZ(this.LJLJLLL, false);
        }
        ConstraintLayout constraintLayout2 = this.LJLLILLLL;
        if (constraintLayout2 != null) {
            constraintLayout2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC30947CCp(this, j3, j4, j5, j6));
        }
        C73318Sq2 c73318Sq2 = this.LJLLI;
        if (c73318Sq2 != null) {
            c73318Sq2.dispose();
        }
        if (z) {
            LLIIIL();
        }
    }
}
