package com.bytedance.android.livesdk.chatroom.widget.followguide;

import X.AnonymousClass036;
import X.B83;
import X.BJM;
import X.BZI;
import X.C16880lQ;
import X.C28594BKc;
import X.C28787BRn;
import X.C29355Bfb;
import X.C29356Bfc;
import X.C29363Bfj;
import X.C29366Bfm;
import X.C29374Bfu;
import X.C29377Bfx;
import X.C29855Bnf;
import X.C2NU;
import X.C30868C9o;
import X.C38354F3m;
import X.C44729Hgz;
import X.C73318Sq2;
import X.C73969T1h;
import X.C74838TYs;
import X.CN1;
import X.InterfaceC29405BgP;
import X.InterfaceC29856Bng;
import X.OSZ;
import X.T16;
import Y.ARunnableS41S0100000_5;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.GuideMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public abstract class FollowGuideAbsWidget extends AnimatableRecyclableWidget {
    public Room LJLJI;
    public GuideMessage LJLJJI;
    public OSZ<String, Boolean> LJLJJL;
    public boolean LJLJL;
    public final C73318Sq2 LJLIL = new C73318Sq2();
    public final Handler LJLILLLLZI = new Handler(C16880lQ.LLJJJJ());
    public boolean LJLJJLL = true;
    public final ARunnableS41S0100000_5 LJLJLJ = new ARunnableS41S0100000_5(this, 144);

    public abstract OSZ<String, Boolean> LJLZ();

    public abstract long LJZI();

    public abstract void LLFFF();

    public abstract void LLFII();

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LLFF() {
        String str;
        String str2;
        CommonMessageData commonMessageData;
        BZI LIZ = C28787BRn.LIZ("livesdk_follow_popup_show");
        GuideMessage guideMessage = this.LJLJJI;
        Long l = null;
        if (guideMessage != null && (commonMessageData = guideMessage.baseMessage) != null) {
            str = commonMessageData.logId;
        } else {
            str = null;
        }
        LIZ.LJIJJ(str, "notification_request_id");
        GuideMessage guideMessage2 = this.LJLJJI;
        if (guideMessage2 != null) {
            str2 = guideMessage2.scene;
        } else {
            str2 = null;
        }
        LIZ.LJIJJ(str2, "notification_type");
        GuideMessage guideMessage3 = this.LJLJJI;
        if (guideMessage3 != null) {
            l = Long.valueOf(guideMessage3.displayStyle);
        }
        LIZ.LJIJJ(l, "style");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJJIIJZLJL();
    }

    public final void LLFZ() {
        if (this.LJLJL) {
            return;
        }
        GuideMessage guideMessage = this.LJLJJI;
        if (guideMessage != null && guideMessage.duration < 5000) {
            guideMessage.duration = 5000L;
        }
        this.LJLILLLLZI.postDelayed(this.LJLJLJ, 1000L);
        this.LJLJL = true;
    }

    public final void LJZ() {
        String str;
        String str2;
        CommonMessageData commonMessageData;
        if (!isViewValid()) {
            return;
        }
        getContext();
        if (C2NU.LIZ.LIZIZ()) {
            if (!((C29374Bfu) B83.LIZ().LIZIZ()).isLogin()) {
                Bundle LIZJ = AnonymousClass036.LIZJ("enter_from", "live_detail", "action_type", "follow");
                LIZJ.putString("source", "live");
                LIZJ.putString("v1_source", "follow");
                InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
                Context context = this.context;
                C29356Bfc c29356Bfc = new C29356Bfc();
                c29356Bfc.LIZ = C44729Hgz.LJJ();
                c29356Bfc.LIZIZ = C44729Hgz.LJIL();
                c29356Bfc.LJ = "live_detail";
                c29356Bfc.LJFF = "follow";
                c29356Bfc.LIZLLL = "live";
                c29356Bfc.LIZJ = -1;
                ((C29374Bfu) LIZIZ).LIZLLL(context, new C29377Bfx(c29356Bfc)).LIZ(new C29355Bfb());
                return;
            }
            HashMap hashMap = new HashMap();
            if (!C38354F3m.LJ(C28594BKc.LIZJ().LIZLLL())) {
                String LIZLLL = C28594BKc.LIZJ().LIZLLL();
                o.LJIIIIZZ(LIZLLL, "getInstance().liveDrawerRequestPage");
                hashMap.put("enter_live_method", LIZLLL);
            }
            String LJIIIZ = BJM.LJIIIZ();
            String str3 = "1";
            if (!TextUtils.isEmpty(LJIIIZ) && o.LJ("click_push_live_cd_user", LJIIIZ)) {
                hashMap.put("is_subscribe", "1");
            } else {
                hashMap.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
            }
            if (o.LJ("manual_pk", ((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType())) {
                if (((IInteractService) CN1.LIZ(IInteractService.class)).Qe0()) {
                    hashMap.put("match_status", "pk_phase");
                } else {
                    hashMap.put("match_status", "punish");
                }
                Map<String, String> L00 = ((IInteractService) CN1.LIZ(IInteractService.class)).L00();
                o.LJIIIIZZ(L00, "getService(IInteractServ…lass.java).matchLogParams");
                hashMap.putAll(L00);
            }
            ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
            hashMap.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
            hashMap.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
            BZI LIZ = C28787BRn.LIZ("livesdk_follow");
            GuideMessage guideMessage = this.LJLJJI;
            Long l = null;
            if (guideMessage != null && (commonMessageData = guideMessage.baseMessage) != null) {
                str = commonMessageData.logId;
            } else {
                str = null;
            }
            LIZ.LJIJJ(str, "notification_request_id");
            GuideMessage guideMessage2 = this.LJLJJI;
            if (guideMessage2 != null) {
                str2 = guideMessage2.scene;
            } else {
                str2 = null;
            }
            LIZ.LJIJJ(str2, "notification_type");
            GuideMessage guideMessage3 = this.LJLJJI;
            if (guideMessage3 != null) {
                l = Long.valueOf(guideMessage3.displayStyle);
            }
            LIZ.LJIJJ(l, "style");
            if (C74838TYs.LJ().LJJ <= 0) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ.LJIJJ(str3, "is_guest_connection");
            LIZ.LJIJJ(((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType(), "connection_type");
            LIZ.LJIJJ("live_follow_popup", "click_user_position");
            LIZ.LJIILLIIL(this.dataChannel);
            LIZ.LJJIIJZLJL();
            Room room = this.LJLJI;
            if (room != null) {
                InterfaceC29405BgP LIZIZ2 = B83.LIZ().LIZIZ();
                C29366Bfm c29366Bfm = new C29366Bfm();
                c29366Bfm.LIZIZ(room.getOwnerUserId());
                c29366Bfm.LJ(room.getId());
                c29366Bfm.getClass();
                ((InterfaceC29856Bng) ((C29374Bfu) LIZIZ2).LJIIIIZZ(new C29363Bfj(c29366Bfm)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZJ(WidgetExtendsKt.autoDispose(this))).LIZ();
                return;
            }
            return;
        }
        C30868C9o.LIZJ(R.string.n0o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJZL() {
        /*
            r7 = this;
            X.OSZ r4 = r7.LJLZ()
            boolean r0 = r7.isShowing()
            r3 = 0
            r6 = 0
            if (r0 == 0) goto L3e
            if (r4 == 0) goto L2a
            java.lang.Object r0 = r4.getSecond()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r4.getFirst()
            java.lang.String r0 = (java.lang.String) r0
            r7.LL(r0)
            r7.hide()
        L26:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L31
        L2a:
            boolean r0 = r7.LJLJL
            if (r0 != 0) goto L31
            r7.LLFZ()
        L31:
            r7.LJLJJL = r4
            return
        L34:
            android.os.Handler r1 = r7.LJLILLLLZI
            Y.ARunnableS41S0100000_5 r0 = r7.LJLJLJ
            r1.removeCallbacks(r0)
            r7.LJLJL = r3
            goto L26
        L3e:
            if (r4 == 0) goto L51
            X.OSZ<java.lang.String, java.lang.Boolean> r0 = r7.LJLJJL
            if (r0 != 0) goto L4d
            java.lang.Object r0 = r4.getFirst()
            java.lang.String r0 = (java.lang.String) r0
            r7.LL(r0)
        L4d:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L31
        L51:
            com.bytedance.android.livesdk.model.message.GuideMessage r0 = r7.LJLJJI
            if (r0 != 0) goto L56
            goto L31
        L56:
            X.B83 r0 = X.B83.LIZ()
            X.BgP r0 = r0.LIZIZ()
            X.Bfu r0 = (X.C29374Bfu) r0
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L67
            goto L31
        L67:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.LJLJI
            if (r0 == 0) goto L79
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            if (r0 == 0) goto L79
            boolean r1 = r0.isFollowing()
            r0 = 1
            if (r1 != r0) goto L79
            goto L31
        L79:
            boolean r0 = r7.LJLJJLL
            if (r0 == 0) goto L89
            r7.LLFF()
        L80:
            r7.show()
            r7.LLFZ()
            r7.LJLJJLL = r3
            goto L31
        L89:
            X.OSZ<java.lang.String, java.lang.Boolean> r0 = r7.LJLJJL
            if (r0 == 0) goto Ld2
            java.lang.Object r5 = r0.getFirst()
        L91:
            java.lang.String r0 = "livesdk_follow_popup_show_again"
            X.BZI r2 = X.C28787BRn.LIZ(r0)
            com.bytedance.android.livesdk.model.message.GuideMessage r0 = r7.LJLJJI
            if (r0 == 0) goto Ld0
            com.bytedance.android.livesdkapi.message.CommonMessageData r0 = r0.baseMessage
            if (r0 == 0) goto Ld0
            java.lang.String r1 = r0.logId
        La1:
            java.lang.String r0 = "notification_request_id"
            r2.LJIJJ(r1, r0)
            com.bytedance.android.livesdk.model.message.GuideMessage r0 = r7.LJLJJI
            if (r0 == 0) goto Lce
            java.lang.String r1 = r0.scene
        Lac:
            java.lang.String r0 = "notification_type"
            r2.LJIJJ(r1, r0)
            com.bytedance.android.livesdk.model.message.GuideMessage r0 = r7.LJLJJI
            if (r0 == 0) goto Lbb
            long r0 = r0.displayStyle
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
        Lbb:
            java.lang.String r0 = "style"
            r2.LJIJJ(r6, r0)
            java.lang.String r0 = "avoid_reason"
            r2.LJIJJ(r5, r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r7.dataChannel
            r2.LJIILLIIL(r0)
            r2.LJJIIJZLJL()
            goto L80
        Lce:
            r1 = r6
            goto Lac
        Ld0:
            r1 = r6
            goto La1
        Ld2:
            r5 = r6
            goto L91
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget.LJZL():void");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        if (!isShowing()) {
            return;
        }
        this.LJLILLLLZI.removeCallbacks(this.LJLJLJ);
        this.LJLJL = false;
        cancelShowAnimation();
        cancelHideAnimation();
        animateHide();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onUnload() {
        cancelShowAnimation();
        cancelHideAnimation();
        this.LJLILLLLZI.removeCallbacksAndMessages(null);
        this.LJLIL.LIZLLL();
        this.LJLJJI = null;
        this.LJLJL = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (isShowing()) {
            return;
        }
        cancelShowAnimation();
        cancelHideAnimation();
        animateShow();
    }

    public final void LL(String str) {
        String str2;
        String str3;
        CommonMessageData commonMessageData;
        BZI LIZ = C28787BRn.LIZ("livesdk_follow_popup_avoid");
        GuideMessage guideMessage = this.LJLJJI;
        Long l = null;
        if (guideMessage != null && (commonMessageData = guideMessage.baseMessage) != null) {
            str2 = commonMessageData.logId;
        } else {
            str2 = null;
        }
        LIZ.LJIJJ(str2, "notification_request_id");
        GuideMessage guideMessage2 = this.LJLJJI;
        if (guideMessage2 != null) {
            str3 = guideMessage2.scene;
        } else {
            str3 = null;
        }
        LIZ.LJIJJ(str3, "notification_type");
        GuideMessage guideMessage3 = this.LJLJJI;
        if (guideMessage3 != null) {
            l = Long.valueOf(guideMessage3.displayStyle);
        }
        LIZ.LJIJJ(l, "style");
        LIZ.LJIJJ(str, "avoid_reason");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJJIIJZLJL();
    }

    public final void LLF(String str) {
        String str2;
        String str3;
        CommonMessageData commonMessageData;
        BZI LIZ = C28787BRn.LIZ("livesdk_follow_popup_exit");
        GuideMessage guideMessage = this.LJLJJI;
        Long l = null;
        if (guideMessage != null && (commonMessageData = guideMessage.baseMessage) != null) {
            str2 = commonMessageData.logId;
        } else {
            str2 = null;
        }
        LIZ.LJIJJ(str2, "notification_request_id");
        GuideMessage guideMessage2 = this.LJLJJI;
        if (guideMessage2 != null) {
            str3 = guideMessage2.scene;
        } else {
            str3 = null;
        }
        LIZ.LJIJJ(str3, "notification_type");
        GuideMessage guideMessage3 = this.LJLJJI;
        if (guideMessage3 != null) {
            l = Long.valueOf(guideMessage3.displayStyle);
        }
        LIZ.LJIJJ(l, "style");
        LIZ.LJIJJ(str, "exit_method");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        long j;
        this.LJLJI = (Room) this.dataChannel.kv0(RoomChannel.class);
        LLFII();
        C73318Sq2 c73318Sq2 = this.LJLIL;
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        Room room = this.LJLJI;
        if (room != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        c73318Sq2.LIZ(((C29374Bfu) LIZIZ).LIZ(j).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS57S0100000_5(this, 97), C29855Bnf.LJLIL));
    }
}
