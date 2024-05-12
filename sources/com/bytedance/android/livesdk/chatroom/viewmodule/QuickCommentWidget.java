package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.B83;
import X.BZI;
import X.C16880lQ;
import X.C1EW;
import X.C28787BRn;
import X.C29232Bdc;
import X.C29374Bfu;
import X.C29927Bop;
import X.C5H3;
import X.C78996UzQ;
import X.CJR;
import X.CJU;
import X.CJV;
import X.CJW;
import X.CJX;
import X.CJY;
import X.CJZ;
import X.CN1;
import X.EnumC31098CIk;
import X.EnumC31509CYf;
import X.InterfaceC09670Zn;
import X.InterfaceC29856Bng;
import X.Q7L;
import Y.ARunnableS41S0100000_5;
import Y.AfS57S0100000_5;
import Y.IDrS45S0100000_5;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.FirstGiftQuickComment;
import com.bytedance.android.live.ICommentService;
import com.bytedance.android.live.QuickCommentGiftSubChannel;
import com.bytedance.android.live.QuickCommentWithEmotesChannel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.WarningInfoVisibilityEvent;
import com.bytedance.android.livesdk.chatroom.CommentApi;
import com.bytedance.android.livesdk.dataChannel.BanTalkEvent;
import com.bytedance.android.livesdk.dataChannel.CustomPollCardVisibility;
import com.bytedance.android.livesdk.dataChannel.ECLiveStatusChangeChannel;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveEventCardVisibility;
import com.bytedance.android.livesdk.dataChannel.QuestionCardVisibilityEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.dataChannel.SelectPollShowChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.event.PartnershipPromoteGameCardShowChannel;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.QuickChatContent;
import com.bytedance.android.livesdk.slot.FrameL3SlotVisibilityChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class QuickCommentWidget extends AnimatableRecyclableWidget implements OnMessageListener, Handler.Callback, InterfaceC09670Zn {
    public static final /* synthetic */ int LJLLL = 0;
    public Room LJLJI;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public CJX LJLLI;
    public CJW LJLLJ;
    public final C5H3 LJLIL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 201));
    public final CJR LJLILLLLZI = new CJR(this);
    public boolean LJLJJI = true;
    public boolean LJLJJL = true;
    public long LJLJLJ = Long.MAX_VALUE;
    public long LJLJLLL = Long.MAX_VALUE;
    public String LJLL = "";
    public final Handler LJLLILLLL = new Handler(C16880lQ.LLJJJJ(), this);

    public final void LJLZ() {
        this.LJLJJI = false;
        this.LJLLJ = null;
        this.LJLLILLLL.removeMessages(1);
        if (!isShowing()) {
            return;
        }
        hide();
        cancelHideAnimation();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dc_;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onHideAnimationEnd() {
        super.onHideAnimationEnd();
        LJLZ();
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onHideAnimationStart() {
        super.onHideAnimationStart();
        View view = (View) this.LJLIL.getValue();
        if (view == null) {
            return;
        }
        view.setEnabled(false);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        LJLZ();
        this.LJLJJLL = false;
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.kv0(C29927Bop.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        ((ICommentService) CN1.LIZ(ICommentService.class)).Lt0(this);
        if (WatchMemoryLeakOpt.INSTANCE.settingValue()) {
            CJX cjx = this.LJLLI;
            if (cjx != null) {
                cjx.LIZJ = null;
            } else {
                o.LJIJI("mLogHelper");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC09670Zn
    public final void LJJJIL() {
        LJLZ();
    }

    public final void LJZI(CJW cjw) {
        long j;
        long j2 = cjw.LIZJ;
        CJW cjw2 = this.LJLLJ;
        if (cjw2 != null) {
            j = cjw2.LIZJ;
        } else {
            j = 0;
        }
        if (j2 >= j) {
            this.LJLLJ = cjw;
            this.LJLLILLLL.removeMessages(1);
            this.LJLLILLLL.sendEmptyMessageDelayed(1, TimeUnit.SECONDS.toMillis(cjw.LIZIZ));
            if (this.LJLJJLL) {
                LJZL(cjw);
            }
        }
    }

    public final void LJZL(CJW cjw) {
        Object obj;
        if (cjw == null) {
            return;
        }
        ((ICommentService) CN1.LIZ(ICommentService.class)).cn(this);
        CJR cjr = this.LJLILLLLZI;
        cjr.getClass();
        cjr.LJLIL.clear();
        cjr.LJLILLLLZI = cjw;
        List<QuickChatContent> list = cjw.LIZ;
        if (list != null) {
            cjr.LJLIL.addAll(list);
        }
        cjr.notifyDataSetChanged();
        show();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean LJ = o.LJ(cjw.LIZLLL, "1");
        String str = CardStruct.IStatusCode.DEFAULT;
        if (LJ) {
            if (cjw.LJ) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("quick_comment_subscribe_type", obj);
        }
        if (o.LJ(cjw.LIZLLL, "3")) {
            str = "1";
        }
        linkedHashMap.put("is_first_gift_quick_comment", str);
        String str2 = "2";
        if (!o.LJ(cjw.LIZLLL, "2")) {
            if (o.LJ(cjw.LIZLLL, "1")) {
                str2 = "1";
            } else {
                str2 = "";
            }
        }
        if (str2.length() != 0) {
            linkedHashMap.put("quick_comment_subscribe_show_type", str2);
        }
        if (o.LJ(cjw.LIZLLL, "5")) {
            linkedHashMap.put("is_ecom_quick", "1");
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_quick_comment_show");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJJIFFI(linkedHashMap);
        LIZ.LJJIIJZLJL();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        if (msg.what == 1) {
            Room room = this.LJLJI;
            if (room != null) {
                ((InterfaceC29856Bng) C1EW.LIZ(((CommentApi) Q7L.LIZIZ(CommentApi.class)).sendChatEvent(room.getId(), 1)).LIZJ(WidgetExtendsKt.autoDispose(this))).LIZJ(CJY.LJLIL, CJZ.LJLIL);
            }
            if (!isShowing()) {
                LJLZ();
            } else {
                animateHide();
            }
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLLI = new CJX();
        RecyclerView recyclerView = (RecyclerView) this.LJLIL.getValue();
        if (recyclerView != null) {
            CJX cjx = this.LJLLI;
            if (cjx != null) {
                cjx.LIZLLL = recyclerView;
                recyclerView.LJIIJJI(new IDrS45S0100000_5(cjx, 5));
            } else {
                o.LJIJI("mLogHelper");
                throw null;
            }
        }
        RecyclerView recyclerView2 = (RecyclerView) this.LJLIL.getValue();
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.LJLILLLLZI);
        }
        RecyclerView recyclerView3 = (RecyclerView) this.LJLIL.getValue();
        if (recyclerView3 != null) {
            recyclerView3.LJII(new CJV(this), -1);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        boolean z;
        boolean z2;
        RoomAuthStatus roomAuthStatus;
        RoomAuthStatus roomAuthStatus2;
        UserAttr userAttr;
        View view = (View) this.LJLIL.getValue();
        if (view != null) {
            view.setEnabled(true);
        }
        CJX cjx = this.LJLLI;
        if (cjx != null) {
            DataChannel dataChannel = this.dataChannel;
            cjx.LIZJ = dataChannel;
            this.LJLJI = (Room) dataChannel.kv0(RoomChannel.class);
            LJLZ();
            this.LJLJJI = true;
            this.LJLJJL = true;
            Boolean bool = (Boolean) this.dataChannel.kv0(ECLiveStatusChangeChannel.class);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            this.LJLJL = z;
            if (!((C29374Bfu) B83.LIZ().LIZIZ()).isLogin()) {
                this.LJLJJI = false;
                this.LJLJJL = false;
            }
            User user = (User) this.dataChannel.kv0(RoomUserChannel.class);
            if (user != null && (userAttr = user.getUserAttr()) != null && userAttr.isMuted) {
                this.LJLJJI = false;
                this.LJLJJL = false;
            } else {
                this.dataChannel.ov0(this, BanTalkEvent.class, new AqS171S0100000_5(this, 334));
            }
            Room room = this.LJLJI;
            if (room != null && (roomAuthStatus2 = room.getRoomAuthStatus()) != null && roomAuthStatus2.getQuickCommentState() == 2) {
                this.LJLJJI = false;
                this.LJLJJL = false;
            }
            Room room2 = this.LJLJI;
            if (room2 != null && (roomAuthStatus = room2.getRoomAuthStatus()) != null && !roomAuthStatus.enableChat) {
                this.LJLJJI = false;
                this.LJLJJL = false;
            } else {
                IMessageManager iMessageManager = (IMessageManager) this.dataChannel.kv0(C29927Bop.class);
                if (iMessageManager != null) {
                    iMessageManager.addMessageListener(EnumC31509CYf.ROOM_VERIFY.getIntType(), this);
                }
            }
            if (((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ(EnumC31098CIk.COMMENT)) {
                this.LJLJJI = false;
                this.LJLJJL = false;
            }
            Room room3 = this.LJLJI;
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                z2 = o.LJ(dataChannel2.kv0(UserIsAnchorChannel.class), Boolean.TRUE);
            } else {
                z2 = false;
            }
            if (C29232Bdc.LJIIJ(z2, room3) && !C29232Bdc.LJIILL(this.LJLJI)) {
                this.LJLJJI = false;
                this.LJLJJL = false;
            }
            Integer num = (Integer) this.dataChannel.kv0(SelectPollShowChannel.class);
            if (num != null && num.intValue() > 0) {
                this.LJLJJI = false;
                this.LJLJJL = false;
            }
            DataChannel dataChannel3 = this.dataChannel;
            dataChannel3.ov0(this, WarningInfoVisibilityEvent.class, new AqS171S0100000_5(this, 335));
            dataChannel3.ov0(this, QuestionCardVisibilityEvent.class, new AqS171S0100000_5(this, 336));
            dataChannel3.ov0(this, FrameL3SlotVisibilityChannel.class, new AqS171S0100000_5(this, 337));
            dataChannel3.ov0(this, SelectPollShowChannel.class, new AqS171S0100000_5(this, 338));
            dataChannel3.ov0(this, QuickCommentWithEmotesChannel.class, new AqS171S0100000_5(this, 339));
            dataChannel3.ov0(this, QuickCommentGiftSubChannel.class, new AqS171S0100000_5(this, 340));
            dataChannel3.ov0(this, CustomPollCardVisibility.class, new AqS171S0100000_5(this, 341));
            dataChannel3.ov0(this, PartnershipPromoteGameCardShowChannel.class, new AqS171S0100000_5(this, 342));
            dataChannel3.ov0(this, FirstGiftQuickComment.class, new AqS171S0100000_5(this, 330));
            dataChannel3.ov0(this, KeyboardStatusChannel.class, new AqS171S0100000_5(this, 331));
            dataChannel3.ov0(this, LiveEventCardVisibility.class, new AqS171S0100000_5(this, 332));
            dataChannel3.ov0(this, ECLiveStatusChangeChannel.class, new AqS171S0100000_5(this, 333));
            if (this.LJLJJI && !this.LJLJL) {
                this.LJLLILLLL.postDelayed(new ARunnableS41S0100000_5(this, 138), 3000L);
            }
            IMessageManager iMessageManager2 = (IMessageManager) this.dataChannel.kv0(C29927Bop.class);
            if (iMessageManager2 != null) {
                iMessageManager2.addMessageListener(EnumC31509CYf.QUICK_CHAT_LIST_MESSAGE.getIntType(), this);
                return;
            }
            return;
        }
        o.LJIJI("mLogHelper");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r1 == null) goto L28;
     */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r12) {
        /*
            r11 = this;
            boolean r1 = r12 instanceof com.bytedance.android.livesdk.model.message.RoomVerifyMessage
            r0 = 0
            if (r1 == 0) goto L8
            r0 = r12
            com.bytedance.android.livesdk.model.message.RoomVerifyMessage r0 = (com.bytedance.android.livesdk.model.message.RoomVerifyMessage) r0
        L8:
            r3 = 0
            if (r0 == 0) goto L13
            int r1 = r0.verifyAction
            r0 = 3
            if (r1 != r0) goto L13
            r11.LJLZ()
        L13:
            boolean r0 = r12 instanceof com.bytedance.android.livesdk.model.message.QuickChatListMessage
            if (r0 == 0) goto L6f
            com.bytedance.android.livesdk.model.message.QuickChatListMessage r12 = (com.bytedance.android.livesdk.model.message.QuickChatListMessage) r12
            if (r12 == 0) goto L6f
            java.util.List<com.bytedance.android.livesdk.model.message.QuickChatContent> r4 = r12.contentList
            long r5 = r12.duration
            long r8 = r12.priority
            java.lang.String r1 = r12.scene
            java.lang.String r0 = "commerce"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L4a
            java.lang.String r10 = "5"
        L2d:
            java.util.List<com.bytedance.android.livesdk.model.message.QuickChatContent> r1 = r12.contentList
            java.lang.String r0 = "message.contentList"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.util.Iterator r2 = r1.iterator()
        L38:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.android.livesdk.model.message.QuickChatContent r0 = (com.bytedance.android.livesdk.model.message.QuickChatContent) r0
            com.bytedance.android.live.base.model.emoji.EmoteModel r0 = r0.emote
            if (r0 != 0) goto L5a
            goto L38
        L4a:
            java.lang.String r1 = r12.scene
            java.lang.String r0 = ""
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L57
            java.lang.String r10 = "6"
            goto L2d
        L57:
            java.lang.String r10 = "0"
            goto L2d
        L5a:
            if (r1 != 0) goto L5d
        L5c:
            r3 = 1
        L5d:
            r7 = r3 ^ 1
            X.CJW r3 = new X.CJW
            r3.<init>(r4, r5, r7, r8, r10)
            boolean r0 = r11.LJLJJI
            if (r0 != 0) goto L6c
            boolean r0 = r11.LJLJJL
            if (r0 == 0) goto L6f
        L6c:
            r11.LJZI(r3)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.QuickCommentWidget.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    public final void LJZ(String str, JSONObject jSONObject) {
        boolean z;
        String str2;
        Room room = this.LJLJI;
        if (room != null) {
            boolean z2 = !o.LJ(str, CardStruct.IStatusCode.DEFAULT);
            CommentApi commentApi = (CommentApi) Q7L.LIZIZ(CommentApi.class);
            long id = room.getId();
            long ownerUserId = room.getOwnerUserId();
            User owner = room.getOwner();
            if (owner != null) {
                z = owner.isSubscribed();
            } else {
                z = false;
            }
            if (jSONObject == null || (str2 = jSONObject.toString()) == null) {
                str2 = "";
            }
            ((InterfaceC29856Bng) C1EW.LIZ(commentApi.queryQuickComments(id, ownerUserId, z, str, str2)).LIZJ(WidgetExtendsKt.autoDispose(this))).LIZJ(new CJU(this, z2, str), new AfS57S0100000_5(this, 89));
        }
    }
}
