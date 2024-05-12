package X;

import Y.AObjectS42S0101000_5;
import Y.AfS0S0300100_5;
import Y.AfS0S0310100_5;
import Y.AfS31S0201000_5;
import Y.AfS36S0101000_5;
import Y.AfS54S0200000_5;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.CommentService;
import com.bytedance.android.live.ICommentService;
import com.bytedance.android.live.OpenGiftVerifyEvent;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.api.revenue.starcomment.StarCommentEntranceVisibleEvent;
import com.bytedance.android.livesdk.chatroom.CommentApi;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.comp.impl.game.GamePartnershipService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreloadInteractionLayerSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.bytedance.android.livesdk.model.message.RoomVerifyMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CHy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31086CHy extends AbstractC31497CXt<CI5> implements OnMessageListener {
    public boolean LJLIL = true;
    public Room LJLILLLLZI;
    public C73318Sq2 LJLJI;

    @Override // X.AbstractC31497CXt, X.BY9
    public final void detachView() {
        super.detachView();
        C73318Sq2 c73318Sq2 = this.LJLJI;
        if (c73318Sq2 != null) {
            c73318Sq2.dispose();
        }
        this.LJLJI = null;
        C31087CHz.LIZIZ = null;
        C31087CHz.LIZ.LJLJI = 0;
    }

    @Override // X.AbstractC31497CXt
    /* renamed from: LJJJJ, reason: merged with bridge method [inline-methods] */
    public final void attachView(CI5 ci5) {
        super.attachView((C31086CHy) ci5);
        this.LJLILLLLZI = (Room) this.dataChannel.kv0(RoomChannel.class);
        this.LJLIL = true;
        IMessageManager iMessageManager = this.mMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.ROOM_VERIFY.getIntType(), this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.GIFT_GUIDE_MESSAGE.getIntType(), this);
        }
        C73318Sq2 c73318Sq2 = this.LJLJI;
        if (c73318Sq2 != null) {
            c73318Sq2.dispose();
        }
        C73318Sq2 c73318Sq22 = new C73318Sq2();
        this.LJLJI = c73318Sq22;
        c73318Sq22.LIZ(C73943T0h.LIZ().LJ(ISendCommentEvent.class).LJJJJZI(new AfS36S0101000_5(1, this, 54)));
        DataChannel dataChannel = this.dataChannel;
        if ((dataChannel != null && ((Boolean) dataChannel.kv0(UserIsAnchorChannel.class)).booleanValue()) || LivePreloadInteractionLayerSetting.INSTANCE.isDisablePreload(this.dataChannel)) {
            C31087CHz.LIZIZ = this.LJLILLLLZI;
            C31087CHz.LIZJ();
        }
        this.dataChannel.ov0((LifecycleOwner) this.mView, StarCommentEntranceVisibleEvent.class, new AObjectS42S0101000_5(1, this, 55));
    }

    public final void LJJJJI(C31085CHx c31085CHx) {
        String str;
        if (this.LJLJI == null || TextUtils.isEmpty(c31085CHx.LIZ) || !this.LJLIL) {
            C73943T0h.LIZ().LIZIZ(new C31099CIl(c31085CHx, false));
            return;
        }
        if (c31085CHx.LIZJ.get("live.intent.extra.ENTER_LIVE_SOURCE") instanceof String) {
            str = (String) c31085CHx.LIZJ.get("live.intent.extra.ENTER_LIVE_SOURCE");
        } else {
            str = null;
        }
        this.LJLIL = false;
        C73318Sq2 c73318Sq2 = this.LJLJI;
        String content = c31085CHx.LIZ;
        long id = this.LJLILLLLZI.getId();
        String requestId = this.LJLILLLLZI.getRequestId();
        String labels = this.LJLILLLLZI.getLabels();
        C28837BTl LIZIZ = C28835BTj.LIZIZ(null, this.dataChannel, "");
        o.LJIIIZ(content, "content");
        C65814PsI.LIZ().getClass();
        c73318Sq2.LIZ(C1EW.LIZ(((CommentApi) C65814PsI.LIZJ(CommentApi.class)).sendBarrage(J7I.LJIIIIZZ(0, id, LIZIZ, content, null, requestId, labels, str, null, null, false, false))).LJJJLIIL(new AfS54S0200000_5(this, c31085CHx, 12), new AfS31S0201000_5(0, this, c31085CHx, 0)));
    }

    public final void LJJJJIZL(CI0 ci0) {
        String str;
        boolean z;
        C1FC c1fc;
        List list;
        if (this.LJLILLLLZI == null || this.LJLJI == null || (TextUtils.isEmpty(ci0.LIZIZ()) && ((c1fc = ci0.LJII) == null || (list = (List) c1fc.LJLJI) == null || list.size() == 0))) {
            C73943T0h.LIZ().LIZIZ(new C31099CIl(ci0, false));
            return;
        }
        ICommentService iCommentService = (ICommentService) CN1.LIZ(ICommentService.class);
        if (iCommentService instanceof CommentService) {
            Iterator<InterfaceC09670Zn> it = ((CommentService) iCommentService).LJLILLLLZI.iterator();
            while (it.hasNext()) {
                it.next().LJJJIL();
            }
        }
        if (ci0.LIZ().get("live.intent.extra.ENTER_LIVE_SOURCE") instanceof String) {
            str = (String) ci0.LIZ().get("live.intent.extra.ENTER_LIVE_SOURCE");
        } else {
            str = null;
        }
        ChatMessage pP = ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).pP(this.LJLILLLLZI.getId(), ci0.LIZIZ(), (User) ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ, ci0.LIZLLL(), ci0.LJII);
        ((CI5) this.mView).AV(pP);
        long uptimeMillis = SystemClock.uptimeMillis();
        if (ci0.LJFF() == ISendCommentEvent.Sender.QUICKCOMMENTFIRSTGIFT) {
            z = true;
        } else {
            z = false;
        }
        C73318Sq2 c73318Sq2 = this.LJLJI;
        String content = ci0.LIZIZ();
        String LJI = ci0.LJI();
        long id = this.LJLILLLLZI.getId();
        String requestId = this.LJLILLLLZI.getRequestId();
        String labels = this.LJLILLLLZI.getLabels();
        boolean LJ = ci0.LJ();
        int LIZLLL = ci0.LIZLLL();
        String str2 = "";
        C28837BTl LIZIZ = C28835BTj.LIZIZ(null, this.dataChannel, "");
        String str3 = ci0.LJI;
        C1FC c1fc2 = ci0.LJII;
        if (c1fc2 != null) {
            str2 = (String) c1fc2.LJLILLLLZI;
        }
        o.LJIIIZ(content, "content");
        C65814PsI.LIZ().getClass();
        c73318Sq2.LIZ(C1EW.LIZ(((CommentApi) C65814PsI.LIZIZ(CommentApi.class)).sendTextMessage(J7I.LJIIIIZZ(LIZLLL, id, LIZIZ, content, LJI, requestId, labels, str, str3, str2, LJ, z))).LJJJLIIL(new AfS0S0310100_5(this, ci0, z, pP, uptimeMillis, 0), new AfS0S0300100_5(uptimeMillis, (long) this, (GamePartnershipService) ci0, (InterfaceC88472Yns<? super C30605Bzl, C76800UCe>) pP, (DataChannel) 0)));
    }

    public final void LJJJJJ(boolean z) {
        String str;
        if (z) {
            EnumC30204BtI.GIFT.show(this.dataChannel);
            this.dataChannel.pv0(OpenGiftVerifyEvent.class);
        } else {
            EnumC30204BtI.GIFT.hide(this.dataChannel);
        }
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Gift icon status changed, visiable:");
        LIZ.append(z);
        LIZ.append(", reason:CommentPresenter sendGiftVisibilityCommand");
        String LIZIZ = X1D.LIZIZ(LIZ);
        LJIILIIL.getClass();
        C0NE.LIZ("ttlive_gift", LIZIZ);
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "TOOLBAR_GIFT_ON_COMMAND");
        if (z) {
            str = "VISIBLE";
        } else {
            str = "GONE";
        }
        hashMap.put("view_status", str);
        C28733BPl.LJIILIIL().LIZIZ("ttlive_gift", hashMap);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        DataChannel dataChannel;
        Boolean bool;
        T t;
        RoomAuthStatus roomAuthStatus;
        RoomAuthStatus roomAuthStatus2;
        RoomAuthStatus roomAuthStatus3;
        RoomAuthStatus roomAuthStatus4;
        RoomAuthStatus roomAuthStatus5;
        RoomAuthStatus roomAuthStatus6;
        RoomAuthStatus roomAuthStatus7;
        RoomAuthStatus roomAuthStatus8;
        T t2 = this.mView;
        if (t2 == 0 || iMessage == null) {
            return;
        }
        if (iMessage instanceof RoomVerifyMessage) {
            int i = ((RoomVerifyMessage) iMessage).verifyAction;
            if (i != 12) {
                if (i != 13) {
                    switch (i) {
                        case 3:
                            Room room = this.LJLILLLLZI;
                            if (room != null && (roomAuthStatus8 = room.mRoomAuthStatus) != null) {
                                roomAuthStatus8.setEnableChat(false);
                            }
                            C31087CHz.LIZJ();
                            ((CI5) this.mView).RE(false);
                            return;
                        case 4:
                            Room room2 = this.LJLILLLLZI;
                            if (room2 != null && (roomAuthStatus7 = room2.mRoomAuthStatus) != null) {
                                roomAuthStatus7.setEnableChat(true);
                            }
                            C31087CHz.LIZJ();
                            ((CI5) this.mView).RE(true);
                            return;
                        case 5:
                            Room room3 = this.LJLILLLLZI;
                            if (room3 != null && (roomAuthStatus6 = room3.mRoomAuthStatus) != null) {
                                roomAuthStatus6.enableDanmaku = false;
                            }
                            ((CI5) t2).Lf0(false);
                            return;
                        case 6:
                            Room room4 = this.LJLILLLLZI;
                            if (room4 != null && (roomAuthStatus5 = room4.mRoomAuthStatus) != null) {
                                roomAuthStatus5.enableDanmaku = true;
                            }
                            ((CI5) t2).Lf0(true);
                            return;
                        case 7:
                            Room room5 = this.LJLILLLLZI;
                            if (room5 != null && (roomAuthStatus4 = room5.mRoomAuthStatus) != null) {
                                roomAuthStatus4.enableGift = false;
                            }
                            LJJJJJ(false);
                            return;
                        case 8:
                            Room room6 = this.LJLILLLLZI;
                            if (room6 != null && (roomAuthStatus3 = room6.mRoomAuthStatus) != null) {
                                roomAuthStatus3.enableGift = true;
                            }
                            LJJJJJ(true);
                            return;
                        default:
                            return;
                    }
                }
                Room room7 = this.LJLILLLLZI;
                if (room7 == null || (roomAuthStatus2 = room7.mRoomAuthStatus) == null) {
                    return;
                }
                roomAuthStatus2.enableDigg = true;
                return;
            }
            Room room8 = this.LJLILLLLZI;
            if (room8 == null || (roomAuthStatus = room8.mRoomAuthStatus) == null) {
                return;
            }
            roomAuthStatus.enableDigg = false;
            return;
        }
        if (!(iMessage instanceof GiftGuideMessage) || !TextUtils.equals(((GiftGuideMessage) iMessage).guideType, "star_comment_guide")) {
            return;
        }
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.a3;
        if (c48459J0d.LIZJ().booleanValue() || (dataChannel = this.dataChannel) == null || (bool = (Boolean) dataChannel.kv0(StarCommentEntranceVisibleEvent.class)) == null || !bool.booleanValue() || (t = this.mView) == 0 || !((CI5) t).Wj0()) {
            return;
        }
        c48459J0d.LIZ(Boolean.TRUE);
    }
}
