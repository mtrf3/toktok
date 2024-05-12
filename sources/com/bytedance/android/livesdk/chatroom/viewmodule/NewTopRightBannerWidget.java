package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.B73;
import X.B83;
import X.BZI;
import X.C15380j0;
import X.C162476Zf;
import X.C1EX;
import X.C244989jS;
import X.C28787BRn;
import X.C29374Bfu;
import X.C29383Bg3;
import X.C29927Bop;
import X.C60829Nu5;
import X.C6G;
import X.C6J;
import X.C6M;
import X.C73737Swn;
import X.C73793Sxh;
import X.C73806Sxu;
import X.C73933Szx;
import X.C77413UZt;
import X.C78895Uxn;
import X.CAA;
import X.CAF;
import X.CAH;
import X.CAJ;
import X.CAN;
import X.EnumC31509CYf;
import X.InterfaceC29856Bng;
import X.InterfaceC92693kP;
import X.UFE;
import Y.AfS57S0100000_5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.banner.InRoomBannerManager;
import com.bytedance.android.live.liveinteract.api.event.LinkStateForH5Event;
import com.bytedance.android.live.performance.widget.PerformProcessWidget;
import com.bytedance.android.live.room.MicRoomDisableInteractionEvent;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.PreShowKeyboardEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.banner.LiveBannerEnableWarmupSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveBannerDegradePhoneTransparent;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class NewTopRightBannerWidget extends PerformProcessWidget implements CAN, OnMessageListener {
    public FrameLayout LJLIL;
    public Room LJLILLLLZI;
    public boolean LJLJI;
    public IMessageManager LJLJJI;
    public CAA LJLJJL;
    public boolean LJLJJLL;
    public final HashMap<Long, Boolean> LJLJL = new HashMap<>();
    public InterfaceC92693kP LJLJLJ;
    public InterfaceC92693kP LJLJLLL;

    @Override // X.CAN
    public final void LJJL() {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dpm;
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.CAN
    public final void LJIIL() {
        C6J c6j = C6J.LIZ;
        C6J.LIZIZ().LJIIJ = System.currentTimeMillis();
        c6j.LJFF();
    }

    public final void LJLZ() {
        InterfaceC92693kP interfaceC92693kP;
        InterfaceC92693kP interfaceC92693kP2;
        InterfaceC92693kP interfaceC92693kP3 = this.LJLJLLL;
        if (interfaceC92693kP3 != null && !interfaceC92693kP3.isDisposed() && (interfaceC92693kP2 = this.LJLJLLL) != null) {
            interfaceC92693kP2.dispose();
        }
        InterfaceC92693kP interfaceC92693kP4 = this.LJLJLJ;
        if (interfaceC92693kP4 != null && !interfaceC92693kP4.isDisposed() && (interfaceC92693kP = this.LJLJLJ) != null) {
            interfaceC92693kP.dispose();
        }
        B73.LIZ().removeCallbacksAndMessages(this);
        FrameLayout frameLayout = this.LJLIL;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            CAA caa = this.LJLJJL;
            if (caa != null) {
                caa.LIZIZ();
            }
            this.LJLJJL = null;
            return;
        }
        o.LJIJI("staticContainer");
        throw null;
    }

    public final void LLF() {
        boolean z;
        CAA caa = this.LJLJJL;
        if (caa != null && caa.LJ()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            FrameLayout frameLayout = this.LJLIL;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                CAA caa2 = this.LJLJJL;
                if (caa2 != null) {
                    caa2.LJI();
                }
            } else {
                o.LJIJI("staticContainer");
                throw null;
            }
        }
        if (!isViewValid()) {
            FrameLayout frameLayout2 = this.LJLIL;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            } else {
                o.LJIJI("staticContainer");
                throw null;
            }
        }
        C6J c6j = C6J.LIZ;
        C6J.LIZIZ().LJIIJJI = System.currentTimeMillis();
        c6j.LJI();
        if (!this.LJLJJLL || !LiveBannerEnableWarmupSetting.INSTANCE.getValue()) {
            return;
        }
        C60829Nu5.LIZIZ(new C244989jS(true));
    }

    public final void LJZL() {
        C6J.LIZIZ().LJII = System.currentTimeMillis();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        CAA caa = this.LJLJJL;
        if (caa != null) {
            caa.LJIIJJI();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        CAA caa = this.LJLJJL;
        if (caa != null) {
            caa.LJIIL();
        }
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        B73.LIZ().removeCallbacksAndMessages(this.dataChannel);
        LJLZ();
        IMessageManager iMessageManager = this.LJLJJI;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.LJLJJI = null;
        C6J.LIZIZ = null;
        this.LJLJL.clear();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.show();
        View view = getView();
        ViewGroup.LayoutParams layoutParams = null;
        if ((view instanceof ViewGroup) && view != null) {
            layoutParams = view.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && !LiveBannerDegradePhoneTransparent.INSTANCE.getValue()) {
            marginLayoutParams.setMarginEnd(C15380j0.LIZ(8.0f));
            marginLayoutParams.rightMargin = C15380j0.LIZ(8.0f);
        }
    }

    @Override // X.CAN
    public final void LJIILLIIL(String str) {
        C6J c6j = C6J.LIZ;
        C6J.LIZIZ().LJIIJ = System.currentTimeMillis();
        c6j.LJ(str);
    }

    @Override // X.CAN
    public final void LJIJ(BannerInRoom bannerInRoom) {
        Object obj;
        Object obj2;
        BZI LIZ = C28787BRn.LIZ("banner_slide");
        if (bannerInRoom != null) {
            obj = Long.valueOf(bannerInRoom.id);
        } else {
            obj = null;
        }
        LIZ.LJIJJ(obj, "banner_id");
        LIZ.LJIJJ("campaign_static", "banner_type");
        C78895Uxn.LIZIZ(LIZ, "live_take_detail", "banner_page", 0, "is_fe");
        if (bannerInRoom == null || (obj2 = C77413UZt.LJIIJJI(bannerInRoom)) == null) {
            obj2 = "";
        }
        LIZ.LJIJJ(obj2, "activity_id");
        UFE.LIZIZ(this.LJLJI ? 1 : 0, LIZ, "is_anchor");
    }

    @Override // X.CAN
    public final void LJJZZIII(String str) {
        C6M LIZIZ = C6J.LIZIZ();
        LIZIZ.LJIIIZ = System.currentTimeMillis();
        if (str != null) {
            LIZIZ.LIZLLL = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cf A[LOOP:1: B:54:0x00c7->B:56:0x00cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cd A[LOOP:2: B:59:0x01c7->B:61:0x01cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021c  */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZ(com.bytedance.android.livesdk.model.message.BannerInRoomCollection.BannerInfo r20) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget.LJZ(com.bytedance.android.livesdk.model.message.BannerInRoomCollection$BannerInfo):void");
    }

    public final void LJZI(String str) {
        C6J c6j = C6J.LIZ;
        C6J.LIZIZ().LJIIIIZZ = System.currentTimeMillis();
        C6M LIZIZ = C6J.LIZIZ();
        long LIZ = C6J.LIZ(LIZIZ.LJII, LIZIZ.LJIIIIZZ);
        HashMap hashMap = new HashMap(LIZIZ.LIZIZ());
        hashMap.put("duration", Long.valueOf(LIZ));
        if (str == null) {
            str = "unknown";
        }
        hashMap.put("error_message", str);
        C6J.LIZJ(c6j, "container_create", 1, hashMap);
    }

    public final void LL(int i) {
        C6J c6j = C6J.LIZ;
        C6M LIZIZ = C6J.LIZIZ();
        LIZIZ.LJIIL = i;
        LIZIZ.LJIIIIZZ = System.currentTimeMillis();
        c6j.LIZLLL();
    }

    public final void LLFF(CAA caa) {
        int i;
        int i2;
        caa.LJFF();
        FrameLayout frameLayout = this.LJLIL;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            View LIZJ = caa.LIZJ();
            if (LIZJ != null) {
                if (!LiveBannerDegradePhoneTransparent.INSTANCE.getValue()) {
                    i = C15380j0.LIZ(148.0f);
                    i2 = C15380j0.LIZ(40.0f);
                } else {
                    i = 0;
                    i2 = 0;
                }
                FrameLayout frameLayout2 = this.LJLIL;
                if (frameLayout2 != null) {
                    frameLayout2.addView(LIZJ, i, i2);
                    FrameLayout frameLayout3 = this.LJLIL;
                    if (frameLayout3 != null) {
                        C6G.LIZ(148.0f, 40.0f, frameLayout3);
                        if (caa.LJ()) {
                            FrameLayout frameLayout4 = this.LJLIL;
                            if (frameLayout4 != null) {
                                frameLayout4.setVisibility(0);
                                caa.LJI();
                            } else {
                                o.LJIJI("staticContainer");
                                throw null;
                            }
                        } else {
                            FrameLayout frameLayout5 = this.LJLIL;
                            if (frameLayout5 != null) {
                                frameLayout5.setVisibility(8);
                            } else {
                                o.LJIJI("staticContainer");
                                throw null;
                            }
                        }
                        this.LJLJJL = caa;
                        return;
                    }
                    o.LJIJI("staticContainer");
                    throw null;
                }
                o.LJIJI("staticContainer");
                throw null;
            }
            FrameLayout frameLayout6 = this.LJLIL;
            if (frameLayout6 != null) {
                frameLayout6.setVisibility(8);
                return;
            } else {
                o.LJIJI("staticContainer");
                throw null;
            }
        }
        o.LJIJI("staticContainer");
        throw null;
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        View findViewById = findViewById(R.id.kea);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.static_container)");
        this.LJLIL = (FrameLayout) findViewById;
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        boolean z;
        Room room2;
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        Long l = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLILLLLZI = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (bool = (Boolean) dataChannel2.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLJI = z;
        InRoomBannerManager inRoomBannerManager = InRoomBannerManager.LJLIL;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (room2 = (Room) dataChannel3.kv0(RoomChannel.class)) != null) {
            l = Long.valueOf(room2.getId());
        }
        inRoomBannerManager.getClass();
        InterfaceC29856Bng interfaceC29856Bng = (InterfaceC29856Bng) InRoomBannerManager.LJLJJL.LJJIFFI(new C1EX(l)).LIZJ(WidgetExtendsKt.autoDispose(this));
        if (interfaceC29856Bng != null) {
            interfaceC29856Bng.LIZIZ(new AfS57S0100000_5(this, 87));
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.lv0(this, KeyboardStatusChannel.class, new AqS171S0100000_5(this, 326));
            dataChannel4.lv0(this, PreShowKeyboardEvent.class, new AqS171S0100000_5(this, 327));
            dataChannel4.lv0(this, LinkStateForH5Event.class, new AqS171S0100000_5(this, 328));
            dataChannel4.lv0(this, MicRoomDisableInteractionEvent.class, new AqS171S0100000_5(this, 329));
        }
        C73793Sxh<C29383Bg3> c73793Sxh = ((C29374Bfu) B83.LIZ().LIZIZ()).LJI;
        c73793Sxh.getClass();
        C73933Szx.LJ(this).LIZIZ(new C73806Sxu(new C73737Swn(c73793Sxh), CAJ.LJLIL)).LIZIZ(new AfS57S0100000_5(this, 88));
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.kv0(C29927Bop.class);
        this.LJLJJI = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.IN_ROOM_BANNER_MESSAGE.getIntType(), this);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        CAA caa;
        CAA caa2;
        if (iMessage != null && (caa = this.LJLJJL) != null && caa.LJIILIIL(iMessage) && (caa2 = this.LJLJJL) != null) {
            caa2.LIZ(iMessage);
        }
    }

    @Override // X.CAN
    public final void LJJIJIIJI(int i, BannerInRoom bannerInRoom, CAH type) {
        Object obj;
        Object obj2;
        Object obj3;
        o.LJIIIZ(type, "type");
        C6J c6j = C6J.LIZ;
        HashMap hashMap = new HashMap(C6J.LIZIZ().LIZIZ());
        if (bannerInRoom != null) {
            hashMap.put("banner_id", Long.valueOf(bannerInRoom.id));
        }
        C6J.LIZJ(c6j, "banner_show", 0, hashMap);
        BZI LIZ = C28787BRn.LIZ("banner_show");
        if (bannerInRoom != null) {
            obj = Long.valueOf(bannerInRoom.id);
        } else {
            obj = null;
        }
        LIZ.LJIJJ(obj, "banner_id");
        LIZ.LJIJJ("campaign_static", "banner_type");
        LIZ.LJIJJ("live_take_detail", "banner_page");
        LIZ.LJIJJ(Integer.valueOf(i + 1), "banner_position");
        LIZ.LJIJJ(0, "is_fe");
        if (bannerInRoom == null || (obj2 = C77413UZt.LJIIJJI(bannerInRoom)) == null) {
            obj2 = "";
        }
        LIZ.LJIJJ(obj2, "activity_id");
        LIZ.LJIJJ(Integer.valueOf(this.LJLJI ? 1 : 0), "is_anchor");
        int i2 = CAF.LIZJ[type.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    obj3 = "detail_enter";
                } else {
                    throw new C162476Zf();
                }
            } else {
                obj3 = "slide";
            }
        } else {
            obj3 = "auto";
        }
        LIZ.LJIJJ(obj3, "show_type");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJJIIJZLJL();
        } else {
            LIZ.LJJIJ();
            LIZ.LJJIIZI();
        }
    }
}
