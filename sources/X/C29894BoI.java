package X;

import Y.ARunnableS41S0100000_5;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.room.SubscribeSuccessEvent;
import com.bytedance.android.live.room.SubscribeSuccessToastEvent;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.dataChannel.CommentCompressOnSmallEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentWidthOptSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionButtonIconNewSetting;
import com.bytedance.android.livesdk.livesetting.subscription.SubscribeRoomPositionSetting;
import com.bytedance.android.livesdk.model.message.SubNotifyMessage;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BoI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29894BoI implements InterfaceC30264BuG, OnIMMessageListener {
    public Room LJLIL;
    public boolean LJLILLLLZI;
    public ImageView LJLJJI;
    public C2A4 LJLJJL;
    public C47121t6 LJLJJLL;
    public C29888BoC LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public Context LJLL;
    public LifecycleOwner LJLLI;
    public DataChannel LJLLILLLL;
    public InterfaceC30269BuL LJLLJ;
    public IMessageManager LJLLL;
    public boolean LJLLLLLL;
    public boolean LJLJI = true;
    public final C15540jG LJLLLL = new C15540jG();
    public final C62822Ol8 LJLZ = C221108m2.LIZIZ(C29898BoM.INSTANCE);

    @Override // X.InterfaceC30264BuG
    public final long LLJZ() {
        return 500L;
    }

    @Override // X.InterfaceC30264BuG
    public final boolean LLLILZJ(View view) {
        return false;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "ToolbarAudienceSubscriptionBehavior";
    }

    public static String LIZJ() {
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

    public final void LIZLLL() {
        String str;
        int i;
        if (C29232Bdc.LJIILL(this.LJLIL)) {
            C73454SsE LJJJ = C31665Cbl.LIZJ(C29232Bdc.LJ(this.LJLIL)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
            LifecycleOwner lifecycleOwner = this.LJLLI;
            if (lifecycleOwner != null) {
                ((InterfaceC29856Bng) LJJJ.LIZJ(C73933Szx.LJ(lifecycleOwner))).LIZIZ(new AfS57S0100000_5(this, 263));
                return;
            } else {
                o.LJIJI("lifecycleOwner");
                throw null;
            }
        }
        ImageView imageView = this.LJLJJI;
        if (imageView != null) {
            if (LiveSubscriptionButtonIconNewSetting.INSTANCE.isEnabled()) {
                i = R.drawable.dbl;
            } else {
                i = R.drawable.dbk;
            }
            imageView.setImageResource(i);
        }
        C2A4 c2a4 = this.LJLJJL;
        if (c2a4 != null) {
            C15540jG c15540jG = this.LJLLLL;
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
            c15540jG.LJ = new BQZ(this);
        }
        C15490jB.LJI(this.LJLLLL);
    }

    public final void LJFF() {
        SubscribeInfo subscribeInfo;
        User owner;
        DataChannel dataChannel = this.LJLLILLLL;
        View view = null;
        if (dataChannel != null) {
            Room room = (Room) dataChannel.kv0(RoomChannel.class);
            if (room != null && (owner = room.getOwner()) != null) {
                subscribeInfo = owner.getSubscribeInfo();
            } else {
                subscribeInfo = null;
            }
            if (o.LJ(InterfaceC30442Bx8.c2.LIZ(), Boolean.TRUE) || subscribeInfo == null || !subscribeInfo.isSubscribed() || !subscribeInfo.userGiftSubAuth || !subscribeInfo.anchorGiftSubAuth) {
                return;
            }
            InterfaceC30269BuL interfaceC30269BuL = this.LJLLJ;
            if (interfaceC30269BuL != null) {
                view = interfaceC30269BuL.LJFF();
            }
            C1YG c1yg = new C1YG(view);
            c1yg.LJI = 5000L;
            c1yg.LJII = true;
            c1yg.LJIILLIIL = C15380j0.LJIILJJIL(R.string.lpj);
            c1yg.LJIIL = new C29896BoK(this);
            C30770C5u.LIZLLL(new C1YH(c1yg), C09.GIFTSUB_FUNCTION_ONLINE_NOTIFY);
            return;
        }
        o.LJIJI("dataChannel");
        throw null;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    public final void LJ(int i) {
        Long l;
        Long l2;
        BZI LIZ = C28787BRn.LIZ("livesdk_subscription_gift_sub_bubble_show");
        Room room = this.LJLIL;
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        LIZ.LJIJJ(String.valueOf(l), "anchor_id");
        Room room2 = this.LJLIL;
        if (room2 != null) {
            l2 = Long.valueOf(room2.getId());
        } else {
            l2 = null;
        }
        LIZ.LJIJJ(String.valueOf(l2), "room_id");
        LIZ.LJIJJ(Integer.valueOf(i), "bubble_type");
        DataChannel dataChannel = this.LJLLILLLL;
        if (dataChannel != null) {
            LIZ.LJIILLIIL(dataChannel);
            LIZ.LJJIIJZLJL();
        } else {
            o.LJIJI("dataChannel");
            throw null;
        }
    }

    @Override // X.InterfaceC30264BuG
    public final void onClick(View view) {
        Room room;
        User owner;
        Long l;
        Long l2;
        String str;
        if (!this.LJLJI) {
            C73943T0h LIZ = C73943T0h.LIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("subscribe_entrance_");
            LIZ2.append(LIZJ());
            LIZ.LIZIZ(new B3N(X1D.LIZIZ(LIZ2)));
        } else {
            Context LIZIZ = C29306Beo.LIZIZ(this.LJLL);
            if ((LIZIZ != null || (LIZIZ = C15380j0.LIZLLL()) != null) && (room = this.LJLIL) != null) {
                if (C29232Bdc.LJIILL(room)) {
                    ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).Ee(LIZIZ, room, LIZJ());
                } else {
                    InterfaceC06390Mx LIZ3 = CN1.LIZ(ISubscribeService.class);
                    o.LJIIIIZZ(LIZ3, "getService(\n            …va,\n                    )");
                    ((ISubscribeService) LIZ3).kg0(LIZIZ, room, LIZJ(), null);
                }
            }
        }
        Room room2 = this.LJLIL;
        if (room2 == null || (owner = room2.getOwner()) == null || owner.getSubscribeInfo() == null) {
            return;
        }
        BZI LIZ4 = C28787BRn.LIZ("livesdk_subscribe_icon_click");
        DataChannel dataChannel = this.LJLLILLLL;
        if (dataChannel != null) {
            LIZ4.LJIILLIIL(dataChannel);
            Room room3 = this.LJLIL;
            if (room3 != null) {
                l = Long.valueOf(room3.getOwnerUserId());
            } else {
                l = null;
            }
            LIZ4.LJIJJ(l, "anchor_id");
            Room room4 = this.LJLIL;
            if (room4 != null) {
                l2 = Long.valueOf(room4.getId());
            } else {
                l2 = null;
            }
            LIZ4.LJIJJ(l2, "room_id");
            LIZ4.LJIJJ(BJM.LJFF(), "enter_from_merge");
            LIZ4.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
            LIZ4.LJIJJ("click", "action_type");
            LIZ4.LJIJJ(BJM.LJIILIIL(), "request_id");
            LIZ4.LJIJJ(BJM.LJIJ(), "video_id");
            if (this.LJLILLLLZI) {
                str = "anchor";
            } else {
                str = "user";
            }
            LIZ4.LJIJJ(str, "user_type");
            LIZ4.LJIJJ(LIZJ(), "click_position");
            DataChannel dataChannel2 = this.LJLLILLLL;
            if (dataChannel2 != null) {
                LIZ4.LJJIFFI(C29232Bdc.LJIJJ(dataChannel2));
                LIZ4.LJJIIJZLJL();
                return;
            } else {
                o.LJIJI("dataChannel");
                throw null;
            }
        }
        o.LJIJI("dataChannel");
        throw null;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        String str;
        View view;
        User owner;
        if (iMessage instanceof SubNotifyMessage) {
            SubNotifyMessage subNotifyMessage = (SubNotifyMessage) iMessage;
            if (subNotifyMessage.subscribeMessageType == 8) {
                Iterator<TextPiece> it = subNotifyMessage.baseMessage.displayText.pieces.iterator();
                while (true) {
                    if (it.hasNext()) {
                        TextPiece next = it.next();
                        if (next.type == 1) {
                            str = next.stringValue;
                            o.LJIIIIZZ(str, "piece.stringValue");
                            break;
                        }
                    } else {
                        str = "";
                        break;
                    }
                }
                InterfaceC30269BuL interfaceC30269BuL = this.LJLLJ;
                String str2 = null;
                if (interfaceC30269BuL != null) {
                    view = interfaceC30269BuL.LJFF();
                } else {
                    view = null;
                }
                C1YG c1yg = new C1YG(view);
                c1yg.LJI = 5000L;
                c1yg.LJII = true;
                c1yg.LJIILLIIL = C15380j0.LJIILL(R.string.lpd, str);
                c1yg.LJIIL = new C29902BoQ(this);
                c1yg.LJIILIIL = new C28748BQa(this);
                C30770C5u.LIZLLL(new C1YH(c1yg), C09.GIFTSUB_RECEIVE_NOTIFY);
                C65814PsI.LIZ().getClass();
                SubscribeApi subscribeApi = (SubscribeApi) C65814PsI.LIZJ(SubscribeApi.class);
                Room room = this.LJLIL;
                if (room != null && (owner = room.getOwner()) != null) {
                    str2 = owner.getSecUid();
                }
                C1EW.LIZ(subscribeApi.getUserInfo(str2)).LJJJLIIL(CBJ.LJLIL, C29900BoO.LJLIL);
            }
            if (subNotifyMessage.subscribeMessageType == 12) {
                LJFF();
            }
        }
    }

    @Override // X.InterfaceC30264BuG
    public final void LIZ(C30252Bu4 toolbarContext, C30158BsY c30158BsY) {
        boolean z;
        boolean z2;
        User owner;
        Long l;
        Long l2;
        String str;
        View view;
        o.LJIIIZ(toolbarContext, "toolbarContext");
        this.LJLL = toolbarContext.LIZ;
        this.LJLLI = toolbarContext.LIZIZ;
        DataChannel dataChannel = toolbarContext.LIZJ;
        this.LJLLILLLL = dataChannel;
        this.LJLLJ = c30158BsY;
        if (dataChannel != null) {
            this.LJLIL = (Room) dataChannel.kv0(RoomChannel.class);
            DataChannel dataChannel2 = this.LJLLILLLL;
            if (dataChannel2 != null) {
                Boolean bool = (Boolean) dataChannel2.kv0(BCW.class);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = true;
                }
                this.LJLJI = z;
                DataChannel dataChannel3 = this.LJLLILLLL;
                if (dataChannel3 != null) {
                    Boolean bool2 = (Boolean) dataChannel3.kv0(UserIsAnchorChannel.class);
                    if (bool2 != null) {
                        z2 = bool2.booleanValue();
                    } else {
                        z2 = false;
                    }
                    this.LJLILLLLZI = z2;
                    DataChannel dataChannel4 = this.LJLLILLLL;
                    if (dataChannel4 != null) {
                        IMessageManager iMessageManager = (IMessageManager) dataChannel4.kv0(C29927Bop.class);
                        this.LJLLL = iMessageManager;
                        if (iMessageManager != null) {
                            iMessageManager.addMessageListener(EnumC31509CYf.SUB_NOTIFY_MESSAGE.getIntType(), (OnIMMessageListener) this);
                        }
                        this.LJLJJI = (ImageView) c30158BsY.LIZ(R.id.ldg);
                        this.LJLJJL = (C2A4) c30158BsY.LIZ(R.id.lco);
                        this.LJLJJLL = (C47121t6) c30158BsY.LIZ(R.id.ldm);
                        this.LJLJL = (C29888BoC) c30158BsY.LIZ(R.id.ko7);
                        DataChannel dataChannel5 = this.LJLLILLLL;
                        if (dataChannel5 != null) {
                            Object kv0 = dataChannel5.kv0(BNK.class);
                            Boolean bool3 = Boolean.TRUE;
                            if (o.LJ(kv0, bool3)) {
                                C47121t6 c47121t6 = this.LJLJJLL;
                                if (c47121t6 != null) {
                                    c47121t6.setVisibility(0);
                                    c47121t6.setText(C15380j0.LJIILJJIL(R.string.ob6));
                                }
                                C29888BoC c29888BoC = this.LJLJL;
                                if (c29888BoC != null) {
                                    c29888BoC.setVisibility(8);
                                }
                            } else {
                                C47121t6 c47121t62 = this.LJLJJLL;
                                if (c47121t62 != null) {
                                    c47121t62.setVisibility(8);
                                }
                                C29888BoC c29888BoC2 = this.LJLJL;
                                if (c29888BoC2 != null) {
                                    c29888BoC2.setVisibility(0);
                                }
                            }
                            if (LiveCommentWidthOptSetting.INSTANCE.isStrategyEnable()) {
                                ImageView imageView = this.LJLJJI;
                                if (imageView != null) {
                                    imageView.post(new ARunnableS41S0100000_5(this, 268));
                                }
                                DataChannel dataChannel6 = this.LJLLILLLL;
                                if (dataChannel6 != null) {
                                    LifecycleOwner lifecycleOwner = this.LJLLI;
                                    if (lifecycleOwner != null) {
                                        dataChannel6.ov0(lifecycleOwner, CommentCompressOnSmallEvent.class, new AqS171S0100000_5(this, 704));
                                    } else {
                                        o.LJIJI("lifecycleOwner");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("dataChannel");
                                    throw null;
                                }
                            }
                            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                            LifecycleOwner lifecycleOwner2 = this.LJLLI;
                            if (lifecycleOwner2 != null) {
                                dataChannelGlobal.nv0(this, lifecycleOwner2, SubscribeSuccessEvent.class, new AqS171S0100000_5(this, 705));
                                LifecycleOwner lifecycleOwner3 = this.LJLLI;
                                if (lifecycleOwner3 != null) {
                                    dataChannelGlobal.nv0(this, lifecycleOwner3, SubscribeSuccessToastEvent.class, new AqS171S0100000_5(this, 706));
                                    LIZLLL();
                                    if (this.LJLJI && !o.LJ(InterfaceC30442Bx8.b2.LIZ(), bool3) && C29232Bdc.LJIILL(this.LJLIL)) {
                                        InterfaceC30269BuL interfaceC30269BuL = this.LJLLJ;
                                        if (interfaceC30269BuL != null) {
                                            view = interfaceC30269BuL.LJFF();
                                        } else {
                                            view = null;
                                        }
                                        C1YG c1yg = new C1YG(view);
                                        c1yg.LJI = 5000L;
                                        c1yg.LJII = true;
                                        c1yg.LIZ(R.string.oeb);
                                        c1yg.LJIIL = C77876UhM.LJLILLLLZI;
                                        C30770C5u.LIZLLL(new C1YH(c1yg), C09.GUIDE_SUBSCRIPTION_ROOM_ENTRANCE);
                                    }
                                    LJFF();
                                    Room room = this.LJLIL;
                                    if (room == null || (owner = room.getOwner()) == null || owner.getSubscribeInfo() == null) {
                                        return;
                                    }
                                    BZI LIZ = C28787BRn.LIZ("livesdk_subscribe_icon_show");
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
                                    } else {
                                        l2 = null;
                                    }
                                    LIZ.LJIJJ(l2, "room_id");
                                    LIZ.LJIJJ(BJM.LJFF(), "enter_from_merge");
                                    LIZ.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
                                    LIZ.LJIJJ("click", "action_type");
                                    LIZ.LJIJJ(BJM.LJIILIIL(), "request_id");
                                    LIZ.LJIJJ(BJM.LJIJ(), "video_id");
                                    if (this.LJLILLLLZI) {
                                        str = "anchor";
                                    } else {
                                        str = "user";
                                    }
                                    LIZ.LJIJJ(str, "user_type");
                                    LIZ.LJIJJ(LIZJ(), "show_entrance");
                                    DataChannel dataChannel7 = this.LJLLILLLL;
                                    if (dataChannel7 != null) {
                                        LIZ.LJJIFFI(C29232Bdc.LJIJJ(dataChannel7));
                                        DataChannel dataChannel8 = this.LJLLILLLL;
                                        if (dataChannel8 != null) {
                                            LIZ.LJIILLIIL(dataChannel8);
                                            LIZ.LJJIIJZLJL();
                                            C30929CBx.LJIILLIIL(LIZJ());
                                            return;
                                        }
                                        o.LJIJI("dataChannel");
                                        throw null;
                                    }
                                    o.LJIJI("dataChannel");
                                    throw null;
                                }
                                o.LJIJI("lifecycleOwner");
                                throw null;
                            }
                            o.LJIJI("lifecycleOwner");
                            throw null;
                        }
                        o.LJIJI("dataChannel");
                        throw null;
                    }
                    o.LJIJI("dataChannel");
                    throw null;
                }
                o.LJIJI("dataChannel");
                throw null;
            }
            o.LJIJI("dataChannel");
            throw null;
        }
        o.LJIJI("dataChannel");
        throw null;
    }

    @Override // X.InterfaceC30264BuG
    public final void LIZIZ(C30252Bu4 toolbarContext, InterfaceC30269BuL interfaceC30269BuL) {
        o.LJIIIZ(toolbarContext, "toolbarContext");
        this.LJLLLL.LIZ();
        ((Handler) this.LJLZ.getValue()).removeCallbacksAndMessages(null);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
        IMessageManager iMessageManager = this.LJLLL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this);
        }
    }
}
