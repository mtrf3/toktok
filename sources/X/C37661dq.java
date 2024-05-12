package X;

import Y.IDBReceiverS4S0100000;
import Y.IDRunnableS2S0300000;
import Y.IDcS169S0100000;
import Y.IDfS292S0100000;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.os.Looper;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bytedance.android.live.broadcast.api.GameFloatingWindowAudienceClickEvent;
import com.bytedance.android.live.broadcast.dialog.GameMessageAlertDialog;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.publicscreen.api.NewMessageNumChannel;
import com.bytedance.android.live.room.ChatMessageReplaceEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.chatroom.ui.GameBroadcastInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.GamePreparationFragment;
import com.bytedance.android.livesdk.comp.api.game.GameBroadcastStateChannel;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastGameCountDownNum;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastGameFloatWindowLibra;
import com.bytedance.android.livesdk.livesetting.broadcast.EnableTTCaptureSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.GameFloatNoticeSetting;
import com.bytedance.android.livesdk.livesetting.game.MultiDeviceInterruptGuideSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameStarCommentSetting;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.GameRankNotifyMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.message.IMessageService;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import defpackage.GameLiveFloatBallTipsUpdateEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.IDqS0S0010000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.IDqS425S0100000;
import kotlin.jvm.internal.o;
import webcast.api.game.TnsPiracyDetail;

/* renamed from: X.1dq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37661dq implements C12C, InterfaceC06400My {
    public final Room LIZ;
    public final GameBroadcastFragment LIZIZ;
    public final DataChannel LIZJ;
    public C3T LIZLLL;
    public C37801e4 LJ;
    public final ActivityC45651qj LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public final boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public final C73318Sq2 LJIILIIL;
    public CQP LJIILJJIL;
    public final boolean LJIILL;
    public C12U LJIILLIIL;
    public CUC LJIIZILJ;
    public C37791e3 LJIJ;
    public C12H LJIJI;
    public C2H2 LJIJJ;
    public C55762Gu LJIJJLI;
    public C37821e6 LJIL;
    public boolean LJJ;
    public C0RI LJJI;
    public Intent LJJIFFI;
    public C47061t0 LJJII;
    public AnonymousClass143 LJJIII;
    public final C5H3 LJJIIJ;
    public final ArrayList<InterfaceC79150V4o> LJJIIJZLJL;
    public PunishEventInfo LJJIIZ;
    public String LJJIIZI;
    public int LJJIJ;
    public PunishEventInfo LJJIJIIJI;
    public Cert LJJIJIIJIL;
    public boolean LJJIJIL;
    public InterfaceC266512v LJJIJL;
    public LiveDialog LJJIJLIJ;
    public final C62822Ol8 LJJIL;
    public final C62822Ol8 LJJIZ;
    public final C62822Ol8 LJJJ;
    public final C0TM LJJJI;
    public final C276616s LJJJIL;
    public final InterfaceC30601Ia LJJJJ;
    public final C30381He LJJJJI;
    public C38921fs LJJJJIZL;
    public InterfaceC31286CPq LJJJJJ;
    public IMessageManager LJJJJJL;
    public final List<InterfaceC04500Fq> LJJJJL;
    public int LJJJJLI;
    public boolean LJJJJLL;
    public final C1X2 LJJJJZ;
    public final C1XB LJJJJZI;
    public final C1XC LJJJLIIL;
    public final LinkedList<ChatMessage> LJJJLL;
    public final LinkedList<GiftMessage> LJJJLZIJ;
    public C40611ib LJJJZ;
    public final IDBReceiverS4S0100000 LJJL;

    @Override // X.InterfaceC06400My
    public final void LJI() {
        this.LJIIIZ = false;
        try {
            C278217i LJIIJ = LJIIJ();
            if (LJIIJ != null) {
                LJIIJ.LIZ();
            }
        } catch (Exception unused) {
        }
        try {
            C278217i c278217i = (C278217i) C005600m.LIZ("msg_view");
            if (c278217i != null) {
                c278217i.LIZ();
            }
        } catch (Exception unused2) {
        }
        try {
            C278217i LJIIL = LJIIL();
            if (LJIIL != null) {
                LJIIL.LIZ();
            }
        } catch (Exception unused3) {
        }
    }

    public final boolean LJIILIIL() {
        C37731dx c37731dx;
        C37771e1 c37771e1;
        C37761e0 c37761e0;
        C37721dw c37721dw;
        C12M[] c12mArr = new C12M[4];
        C12U c12u = this.LJIILLIIL;
        C12M c12m = null;
        if (c12u != null) {
            c37731dx = c12u.LJJJI;
        } else {
            c37731dx = null;
        }
        c12mArr[0] = c37731dx;
        if (c12u != null) {
            c37771e1 = c12u.LJJJJIZL;
        } else {
            c37771e1 = null;
        }
        c12mArr[1] = c37771e1;
        if (c12u != null) {
            c37761e0 = c12u.LJJJJJL;
        } else {
            c37761e0 = null;
        }
        c12mArr[2] = c37761e0;
        if (c12u != null) {
            c37721dw = c12u.LJJJJJ;
        } else {
            c37721dw = null;
        }
        c12mArr[3] = c37721dw;
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(c12mArr);
        C12U c12u2 = this.LJIILLIIL;
        if (c12u2 != null) {
            c12m = c12u2.LJJIL;
        }
        return LJJIJIIJI.contains(c12m);
    }

    public static C278217i LJIIJ() {
        AbstractC004900f LIZ = C005600m.LIZ("control_view");
        if (LIZ instanceof C278217i) {
            return (C278217i) LIZ;
        }
        return null;
    }

    public static C278217i LJIIL() {
        AbstractC004900f LIZ = C005600m.LIZ("small_view");
        if (LIZ instanceof C278217i) {
            return (C278217i) LIZ;
        }
        return null;
    }

    @Override // X.C12C
    public final void LIZ() {
        Object obj;
        MediaProjectionManager mediaProjectionManager;
        if (EnableTTCaptureSetting.INSTANCE.enable()) {
            ActivityC45651qj activityC45651qj = this.LJFF;
            Intent intent = null;
            if (activityC45651qj != null) {
                obj = C16880lQ.LLILLJJLI(activityC45651qj, "media_projection");
            } else {
                obj = null;
            }
            if ((obj instanceof MediaProjectionManager) && (mediaProjectionManager = (MediaProjectionManager) obj) != null) {
                try {
                    P34 p34 = C29174Bcg.LIZ;
                    C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476411393, "bpea-screen_capture_intent_resume");
                    p34.getClass();
                    intent = P34.LIZIZ(mediaProjectionManager, LJJIIJ);
                } catch (Q0C e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("create capture intent exception errorCode: ");
                    LIZ.append(e.getErrorCode());
                    LIZ.append(", msg: ");
                    LIZ.append(e.getMessage());
                    C0NB.LJ("GameUiStrategy", X1D.LIZIZ(LIZ));
                    return;
                }
            }
            GameBroadcastFragment gameBroadcastFragment = this.LIZIZ;
            C78598Ut0.LJIJJ(intent, gameBroadcastFragment);
            gameBroadcastFragment.startActivityForResult(intent, 1001);
        }
    }

    @Override // X.C12C
    public final InterfaceC74834TYo LIZIZ() {
        if (this.LIZIZ.isAdded()) {
            IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class);
            ViewModelProvider of = ViewModelProviders.of(this.LIZIZ);
            o.LJIIIIZZ(of, "of(fragment)");
            return iRoomFunctionService.RG(of);
        }
        return new C32583CqZ();
    }

    @Override // X.C12C
    public final void LJ() {
        C37691dt c37691dt = this.LIZIZ.LJZI;
        if (c37691dt != null) {
            if (c37691dt.LJLJI != null) {
                ArrayList arrayList = new ArrayList();
                if (c37691dt.LJLJJI.getStreamUrl().pushUrlList != null && !c37691dt.LJLJJI.getStreamUrl().pushUrlList.isEmpty()) {
                    arrayList.addAll(c37691dt.LJLJJI.getStreamUrl().pushUrlList);
                } else {
                    arrayList.add(c37691dt.LJLJJI.getStreamUrl().LIZ());
                }
                c37691dt.LJLJI.LJIIJ(arrayList);
                return;
            }
            return;
        }
        o.LJIJI("mServiceStrategy");
        throw null;
    }

    @Override // X.C12C
    public final EnumC264412a LJII() {
        if (this.LJIIL) {
            return EnumC264412a.LIVE_TIP_UNKNOWN;
        }
        C12U c12u = this.LJIILLIIL;
        if (c12u == null) {
            return null;
        }
        InterfaceC266512v interfaceC266512v = c12u.LIZLLL;
        if (interfaceC266512v != null && interfaceC266512v.LLIIIJ()) {
            InterfaceC266512v interfaceC266512v2 = c12u.LIZLLL;
            if (interfaceC266512v2 == null) {
                return null;
            }
            return interfaceC266512v2.LJJJJL();
        }
        return EnumC264412a.LIVE_TIP_UNKNOWN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [X.CW6, O] */
    /* JADX WARN: Type inference failed for: r6v13, types: [X.1dr] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.1ds] */
    @Override // X.InterfaceC06400My
    public final void LJIIIIZZ() {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        CUC cuc;
        Context context;
        C2H0 c2h0;
        CW6 cw6;
        View view;
        View view2;
        C278217i LJIIL;
        AbstractC004900f LIZ;
        C278217i LJIIJ;
        if (this.LJIIIZ) {
            return;
        }
        this.LJIIIZ = true;
        C278217i LJIIJ2 = LJIIJ();
        C40611ib c40611ib = null;
        if (LJIIJ2 != null) {
            bool = Boolean.valueOf(LJIIJ2.LJIIJJI);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool) && (LJIIJ = LJIIJ()) != null) {
            LJIIJ.LIZ();
        }
        C278217i c278217i = (C278217i) C005600m.LIZ("msg_view");
        if (c278217i != null) {
            bool2 = Boolean.valueOf(c278217i.LJIIJJI);
        } else {
            bool2 = null;
        }
        if (C29306Beo.LJJIFFI(bool2) && (LIZ = C005600m.LIZ("msg_view")) != null) {
            LIZ.LIZ();
        }
        C278217i LJIIL2 = LJIIL();
        if (LJIIL2 != null) {
            bool3 = Boolean.valueOf(LJIIL2.LJIIJJI);
        } else {
            bool3 = null;
        }
        if (C29306Beo.LJJIFFI(bool3) && (LJIIL = LJIIL()) != null) {
            LJIIL.LIZ();
        }
        ActivityC45651qj activityC45651qj = this.LJFF;
        if (activityC45651qj == null || activityC45651qj.isDestroyed()) {
            return;
        }
        if (this.LJIJJ == null) {
            View LLLZIIL = C16880lQ.LLLZIIL(R.layout.dks, C16880lQ.LLZIL(C15380j0.LIZLLL()), null);
            o.LJII(LLLZIIL, "null cannot be cast to non-null type com.bytedance.android.live.broadcast.bgbroadcast.game.gesture.TouchDetectLayout");
            C05320Iu c05320Iu = (C05320Iu) LLLZIIL;
            C1XC touchSignalSource = this.LJJJLIIL;
            o.LJIIIZ(touchSignalSource, "touchSignalSource");
            c05320Iu.LJLIL = touchSignalSource;
            c05320Iu.setClickable(false);
            Context LLLLL = C16880lQ.LLLLL(C15380j0.LIZLLL());
            o.LJIIIIZZ(LLLLL, "getContext().applicationContext");
            this.LJIJJ = new C2H2(LLLLL, LLLZIIL);
        }
        C12H c12h = new C12H(this.LJFF);
        this.LJIJI = c12h;
        c12h.setDataChannel(this.LIZJ);
        C005500l c005500l = new C005500l(C15380j0.LIZLLL());
        c005500l.LIZIZ = this.LJIJI;
        c005500l.LJIIJJI = "control_view";
        c005500l.LJI = 2;
        c005500l.LIZJ = C15380j0.LIZ(24.0f);
        c005500l.LIZLLL = C15380j0.LIZ(24.0f);
        c005500l.LJII = 0;
        c005500l.LJIIIIZZ = 0;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        c005500l.LJIIIZ = 300L;
        c005500l.LJIIJ = accelerateDecelerateInterpolator;
        c005500l.LJIIL = true;
        c005500l.LJIILIIL = new OUP() { // from class: X.1oY
            @Override // X.OUP, X.InterfaceC005200i
            public final void LIZIZ() {
                C37661dq.this.LJIJ(C12F.CMD_CLICK_FLOAT_BALL);
            }

            @Override // X.InterfaceC005200i
            public final void LJFF() {
                C37661dq c37661dq = C37661dq.this;
                C12F c12f = C12F.CMD_DRAG_MOVE_END;
                c12f.setParam(new C265212i(true, 0, 0));
                c37661dq.LJIJ(c12f);
            }

            @Override // X.InterfaceC005200i
            public final void LJIIIIZZ() {
                C37661dq.this.LJIJ(C12F.CMD_DRAG_MOVE_START);
                BZI LIZ2 = C28787BRn.LIZ("livesdk_floating_ball_drag");
                LIZ2.LJIJJ(C37661dq.this.LJIIIZ(), "anchor_id");
                LIZ2.LJIJ("screen_share");
                LIZ2.LJIJJ(Long.valueOf(C37661dq.this.LJIIJJI()), "room_id");
                LIZ2.LJJIIJZLJL();
            }

            @Override // X.OUP, X.InterfaceC005200i
            public final void onHide() {
                C78920UyC.LJI("livesdk_floating_window_status", CardStruct.IStatusCode.DEFAULT, "isOpen");
            }

            @Override // X.OUP, X.InterfaceC005200i
            public final void onShow() {
                C78920UyC.LJI("livesdk_floating_window_status", "1", "isOpen");
            }

            @Override // X.InterfaceC005200i
            public final void LJ(int i, int i2) {
                C37661dq c37661dq = C37661dq.this;
                C12F c12f = C12F.CMD_DRAG_ONGOING;
                c12f.setParam(new C265212i(true, i, i2));
                c37661dq.LJIJ(c12f);
            }
        };
        c005500l.LIZ();
        if (this.LJFF != null) {
            if (this.LJIILL) {
                this.LJIIZILJ = ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).uc(this.LJFF, this.LJJJJJ, new CWN() { // from class: X.1dr
                    @Override // X.CWN
                    public final void LIZ() {
                        C37661dq.LJIJI(C37661dq.this, false, false, 3);
                        BZI LIZ2 = C28787BRn.LIZ("livesdk_floating_ball_click");
                        LIZ2.LJIJJ(C37661dq.this.LJIIIZ(), "anchor_id");
                        LIZ2.LJIJ("screen_share");
                        LIZ2.LJIJJ(Long.valueOf(C37661dq.this.LJIIJJI()), "room_id");
                        LIZ2.LJIJJ("home", "click_icon");
                        Boolean LIZJ = InterfaceC30442Bx8.LJIIZILJ.LIZJ();
                        o.LJIIIIZZ(LIZJ, "LIVE_GAME_MSG_ENABLED.value");
                        LIZ2.LJIJJ(Integer.valueOf(LIZJ.booleanValue() ? 1 : 0), "notification_status");
                        LIZ2.LJJIIJZLJL();
                    }

                    @Override // X.CWN
                    public final long LIZIZ() {
                        return C37661dq.this.LIZIZ.LLD;
                    }

                    @Override // X.CWN
                    public final void LJ() {
                        C37661dq.this.LIZIZ.Ba(Boolean.TRUE, true);
                    }

                    @Override // X.CWN
                    public final void LJFF() {
                        C37661dq.LJIJI(C37661dq.this, false, true, 1);
                    }

                    @Override // X.CWN
                    public final void LJII() {
                        C37661dq.LJIJI(C37661dq.this, true, false, 2);
                        BZI LIZ2 = C28787BRn.LIZ("livesdk_floating_setting_click");
                        LIZ2.LJIJJ(C37661dq.this.LJIIIZ(), "anchor_id");
                        LIZ2.LJIJJ(Long.valueOf(C37661dq.this.LJIIJJI()), "room_id");
                        LIZ2.LJIJJ("screen_share", "live_type");
                        LIZ2.LJJIIJZLJL();
                    }

                    @Override // X.CWN
                    public final long getRoomId() {
                        Long l = (Long) C37661dq.this.LIZJ.kv0(BCN.class);
                        if (l != null) {
                            return l.longValue();
                        }
                        return 0L;
                    }

                    @Override // X.CWN
                    public final void LIZJ(List<? extends CQO<? extends CR6>> list) {
                        o.LJIIIZ(list, "list");
                        C37661dq c37661dq = C37661dq.this;
                        C1JJ.LIZLLL(c37661dq, c37661dq.LIZJ, list);
                    }

                    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Integer, O] */
                    @Override // X.CWN
                    public final boolean LIZLLL(boolean z) {
                        int i;
                        boolean z2;
                        CUC cuc2;
                        Integer num = (Integer) C37661dq.this.LIZJ.kv0(BD4.class);
                        if (num != null) {
                            i = num.intValue();
                        } else {
                            i = 0;
                        }
                        if (i >= 3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z) {
                            if (z2) {
                                C37661dq c37661dq = C37661dq.this;
                                int ordinal = EnumC264412a.LIVE_TIP_MESSAGE_PAUSE_TIP.ordinal();
                                String LJIILJJIL = C15380j0.LJIILJJIL(R.string.k_x);
                                o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_anchor_Pause_toast)");
                                C12B.LIZ(c37661dq, true, ordinal, LJIILJJIL, 8);
                                CUC cuc3 = C37661dq.this.LJIIZILJ;
                                if (cuc3 != null) {
                                    cuc3.LJIIJ(true);
                                }
                                C37661dq.this.LJIIZILJ(z, true);
                                return false;
                            }
                            C37661dq.this.LIZJ.rv0(GameBroadcastStateChannel.class, CWI.StatePause);
                            C37661dq.this.LIZJ.rv0(PauseLiveChannel.class, Boolean.valueOf(z));
                            ((C32537Cpp) C37661dq.this.LIZJ.gv0(BD4.class)).LIZ = Integer.valueOf(i + 1);
                        } else {
                            C37661dq.this.LIZJ.rv0(GameBroadcastStateChannel.class, CWI.StateConnected);
                            C37661dq.this.LIZJ.rv0(PauseLiveChannel.class, Boolean.valueOf(z));
                            if (z2 && (cuc2 = C37661dq.this.LJIIZILJ) != null) {
                                cuc2.LJIIJ(true);
                            }
                        }
                        C37661dq.this.LJIIZILJ(z, false);
                        return true;
                    }

                    @Override // X.CWN
                    public final void LJI(int i, int i2) {
                        C37661dq.this.getClass();
                        C278217i c278217i2 = (C278217i) C005600m.LIZ("msg_view");
                        if (c278217i2 != null) {
                            C45101pq c45101pq = c278217i2.LIZ;
                            int i3 = c45101pq.LJLJJL;
                            int i4 = c45101pq.LJLJJLL;
                            int i5 = i3 + i;
                            C005500l c005500l2 = c278217i2.LIZIZ;
                            if (c005500l2.LJI != 0) {
                                c005500l2.LJ = i5;
                                c45101pq.LJJ(i5);
                                int i6 = i4 + i2;
                                C005500l c005500l3 = c278217i2.LIZIZ;
                                if (c005500l3.LJI != 0) {
                                    c005500l3.LJFF = i6;
                                    c278217i2.LIZ.LJJI(i6);
                                    return;
                                }
                                throw new IllegalArgumentException("Current type window can not be move!");
                            }
                            throw new IllegalArgumentException("Current type window can not be move!");
                        }
                    }
                }, this.LIZJ);
            } else {
                this.LJIIZILJ = ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).KR(this.LJFF, this.LJJJJJ, new CWK() { // from class: X.1ds
                    @Override // X.CWK
                    public final void LIZ() {
                        BZI LIZ2 = C28787BRn.LIZ("livesdk_floating_ball_click");
                        LIZ2.LJIJJ(C37661dq.this.LJIIIZ(), "anchor_id");
                        LIZ2.LJIJ("screen_share");
                        LIZ2.LJIJJ(Long.valueOf(C37661dq.this.LJIIJJI()), "room_id");
                        LIZ2.LJIJJ("home", "click_icon");
                        Boolean LIZJ = InterfaceC30442Bx8.LJIIZILJ.LIZJ();
                        o.LJIIIIZZ(LIZJ, "LIVE_GAME_MSG_ENABLED.value");
                        LIZ2.LJIJJ(Integer.valueOf(LIZJ.booleanValue() ? 1 : 0), "notification_status");
                        LIZ2.LJJIIJZLJL();
                        C37661dq.LJIJI(C37661dq.this, false, false, 3);
                    }

                    @Override // X.CWK
                    public final long LIZIZ() {
                        return C37661dq.this.LIZIZ.LLD;
                    }

                    @Override // X.CWK
                    public final void LJFF() {
                        C12U c12u = C37661dq.this.LJIILLIIL;
                        if (c12u != null && o.LJ(c12u.LJJIL, c12u.LJJJI) && c12u.LIZIZ.LJIIJJI) {
                            c12u.LJIIJ();
                        }
                    }

                    @Override // X.CWK
                    public final long getRoomId() {
                        Long l = (Long) C37661dq.this.LIZJ.kv0(BCN.class);
                        if (l != null) {
                            return l.longValue();
                        }
                        return 0L;
                    }

                    @Override // X.CWK
                    public final void LIZJ(List<? extends CQO<? extends CR6>> list) {
                        o.LJIIIZ(list, "list");
                        C37661dq c37661dq = C37661dq.this;
                        C1JJ.LIZLLL(c37661dq, c37661dq.LIZJ, list);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
                    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
                    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Integer, O] */
                    @Override // X.CWK
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean LIZLLL(boolean r9) {
                        /*
                            r8 = this;
                            r5 = 1
                            r4 = 0
                            if (r9 == 0) goto L8f
                            X.1dq r0 = X.C37661dq.this
                            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r0.LIZJ
                            java.lang.Class<X.BD4> r0 = X.BD4.class
                            java.lang.Object r0 = r1.kv0(r0)
                            java.lang.Integer r0 = (java.lang.Integer) r0
                            if (r0 == 0) goto L3b
                            int r6 = r0.intValue()
                            r0 = 3
                            if (r6 < r0) goto L3c
                            r0 = 1
                        L1a:
                            r7 = 8
                            if (r0 == 0) goto L3e
                            X.1dq r3 = X.C37661dq.this
                            X.12a r0 = X.EnumC264412a.LIVE_TIP_MESSAGE_PAUSE_TIP
                            int r2 = r0.ordinal()
                            r0 = 2131835695(0x7f113b2f, float:1.9304536E38)
                            java.lang.String r1 = X.C15380j0.LJIILJJIL(r0)
                            java.lang.String r0 = "getString(R.string.pm_anchor_Pause_toast)"
                            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
                            X.C12B.LIZ(r3, r5, r2, r1, r7)
                            X.1dq r0 = X.C37661dq.this
                            r0.LJIIZILJ(r9, r5)
                            return r4
                        L3b:
                            r6 = 0
                        L3c:
                            r0 = 0
                            goto L1a
                        L3e:
                            X.J0d<java.lang.Boolean> r2 = X.InterfaceC30442Bx8.LJJJJLL
                            java.lang.Object r1 = r2.LIZJ()
                            java.lang.String r0 = "SHOW_PAUSE_LIVE_TIP.value"
                            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
                            java.lang.Boolean r1 = (java.lang.Boolean) r1
                            boolean r0 = r1.booleanValue()
                            if (r0 == 0) goto L6d
                            java.lang.Boolean r0 = java.lang.Boolean.FALSE
                            r2.LIZ(r0)
                            X.1dq r3 = X.C37661dq.this
                            X.12a r0 = X.EnumC264412a.LIVE_TIP_MESSAGE_PAUSE_TIP
                            int r2 = r0.ordinal()
                            r0 = 2131835731(0x7f113b53, float:1.9304609E38)
                            java.lang.String r1 = X.C15380j0.LJIILJJIL(r0)
                            java.lang.String r0 = "getString(R.string.pm_au…ence_Pause_page_title_V2)"
                            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
                            X.C12B.LIZ(r3, r5, r2, r1, r7)
                        L6d:
                            X.1dq r0 = X.C37661dq.this
                            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r0.LIZJ
                            java.lang.Class<com.bytedance.android.livesdk.dataChannel.PauseLiveChannel> r1 = com.bytedance.android.livesdk.dataChannel.PauseLiveChannel.class
                            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
                            r2.rv0(r1, r0)
                            X.1dq r0 = X.C37661dq.this
                            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r0.LIZJ
                            java.lang.Class<X.BD4> r2 = X.BD4.class
                            int r0 = r6 + 1
                            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                            X.Cps r0 = r3.gv0(r2)
                            X.Cpp r0 = (X.C32537Cpp) r0
                            r0.LIZ = r1
                            goto L9c
                        L8f:
                            X.1dq r0 = X.C37661dq.this
                            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r0.LIZJ
                            java.lang.Class<com.bytedance.android.livesdk.dataChannel.PauseLiveChannel> r1 = com.bytedance.android.livesdk.dataChannel.PauseLiveChannel.class
                            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
                            r2.rv0(r1, r0)
                        L9c:
                            X.1dq r0 = X.C37661dq.this
                            r0.LJIIZILJ(r9, r4)
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C37681ds.LIZLLL(boolean):boolean");
                    }

                    @Override // X.CWK
                    public final void LJ(int i) {
                        C12U c12u = C37661dq.this.LJIILLIIL;
                        if (c12u != null) {
                            c12u.LJIILJJIL = i;
                            if (i == 1) {
                                c12u.LJIIJ();
                            }
                        }
                    }

                    @Override // X.CWK
                    public final void LJI(boolean z) {
                        C12F c12f;
                        C37661dq c37661dq = C37661dq.this;
                        if (z) {
                            c12f = C12F.CMD_CLICK_MSG_BTN_CHECKED;
                        } else {
                            c12f = C12F.CMD_CLICK_MSG_BTN_UNCHECKED;
                        }
                        c37661dq.LJIJ(c12f);
                        BZI LIZ2 = C28787BRn.LIZ("livesdk_floating_ball_click");
                        LIZ2.LJIJJ(C37661dq.this.LJIIIZ(), "anchor_id");
                        LIZ2.LJIJ("screen_share");
                        LIZ2.LJIJJ(Long.valueOf(C37661dq.this.LJIIJJI()), "room_id");
                        LIZ2.LJIJJ("notification", "click_icon");
                        UFE.LIZIZ(z ? 1 : 0, LIZ2, "notification_status");
                    }
                }, this.LIZJ);
            }
            CQP cqp = this.LJIILJJIL;
            if (cqp != null && (cuc = this.LJIIZILJ) != null) {
                cuc.LJI(cqp);
            }
            C005500l c005500l2 = new C005500l(C15380j0.LIZLLL());
            c005500l2.LIZIZ = this.LJIIZILJ;
            c005500l2.LJIIJJI = "msg_view";
            c005500l2.LJI = 2;
            c005500l2.LJII = 0;
            c005500l2.LJIIIIZZ = 0;
            AccelerateDecelerateInterpolator accelerateDecelerateInterpolator2 = new AccelerateDecelerateInterpolator();
            c005500l2.LJIIIZ = 300L;
            c005500l2.LJIIJ = accelerateDecelerateInterpolator2;
            c005500l2.LJIIL = true;
            c005500l2.LJIILIIL = new OUP() { // from class: X.1oa
                @Override // X.InterfaceC005200i
                public final void LJFF() {
                    C37661dq c37661dq = C37661dq.this;
                    C12F c12f = C12F.CMD_DRAG_MOVE_END;
                    c12f.setParam(new C265212i(false, 0, 0));
                    c37661dq.LJIJ(c12f);
                }

                @Override // X.InterfaceC005200i
                public final void LJIIIIZZ() {
                    BZI LIZ2 = C28787BRn.LIZ("livesdk_floating_ball_drag");
                    LIZ2.LJIJJ(C37661dq.this.LJIIIZ(), "anchor_id");
                    LIZ2.LJIJ("screen_share");
                    LIZ2.LJIJJ(Long.valueOf(C37661dq.this.LJIIJJI()), "room_id");
                    LIZ2.LJJIIJZLJL();
                    C37661dq.this.LJIJ(C12F.CMD_DRAG_MOVE_START);
                }

                @Override // X.InterfaceC005200i
                public final void LJ(int i, int i2) {
                    C37661dq c37661dq = C37661dq.this;
                    C12F c12f = C12F.CMD_DRAG_ONGOING;
                    c12f.setParam(new C265212i(false, i, i2));
                    c37661dq.LJIJ(c12f);
                }
            };
            c005500l2.LIZ();
            GameBroadcastFragment gameBroadcastFragment = this.LIZIZ;
            gameBroadcastFragment.LJIIL().lv0(gameBroadcastFragment, ChatMessageReplaceEvent.class, new IDqS416S0100000(this, 346));
            this.LJIILIIL.LIZ(C73943T0h.LIZ().LJ(C30185Bsz.class).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new IDfS292S0100000(this, 45)));
            gameBroadcastFragment.LJIIL().mv0(GameLiveFloatBallTipsUpdateEvent.class, gameBroadcastFragment, new IDqS416S0100000(this, 348));
            Boolean bool4 = (Boolean) this.LIZJ.kv0(PauseLiveChannel.class);
            if (bool4 != null) {
                boolean booleanValue = bool4.booleanValue();
                CUC cuc2 = this.LJIIZILJ;
                if (cuc2 != null) {
                    cuc2.LJIIJJI(booleanValue);
                }
            }
        }
        if (this.LJIILL) {
            context = C16880lQ.LLLLL(C15380j0.LIZLLL());
        } else {
            context = this.LJFF;
        }
        C37791e3 c37791e3 = new C37791e3(context, this.LJIILLIIL);
        this.LJIJ = c37791e3;
        c37791e3.setDataChannel(this.LIZJ);
        C005500l c005500l3 = new C005500l(C15380j0.LIZLLL());
        c005500l3.LIZIZ = this.LJIJ;
        c005500l3.LJIIJJI = "small_view";
        c005500l3.LJI = 2;
        c005500l3.LJII = 0;
        c005500l3.LJIIIIZZ = 0;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator3 = new AccelerateDecelerateInterpolator();
        c005500l3.LJIIIZ = 300L;
        c005500l3.LJIIJ = accelerateDecelerateInterpolator3;
        c005500l3.LJIIL = true;
        c005500l3.LJIILIIL = new OUP() { // from class: X.1ob
            @Override // X.OUP, X.InterfaceC005200i
            public final void LIZIZ() {
                C37661dq.this.LJIJ(C12F.CMD_CLICK_SMALL_WINDOW);
            }

            @Override // X.InterfaceC005200i
            public final void LJFF() {
                C37661dq c37661dq = C37661dq.this;
                C12F c12f = C12F.CMD_DRAG_MOVE_END;
                c12f.setParam(new C265212i(false, 0, 0));
                c37661dq.LJIJ(c12f);
            }

            @Override // X.InterfaceC005200i
            public final void LJIIIIZZ() {
                C37661dq.this.LJIJ(C12F.CMD_DRAG_MOVE_START);
                BZI LIZ2 = C28787BRn.LIZ("livesdk_floating_ball_drag");
                LIZ2.LJIJJ(C37661dq.this.LJIIIZ(), "anchor_id");
                LIZ2.LJIJ("screen_share");
                LIZ2.LJIJJ(Long.valueOf(C37661dq.this.LJIIJJI()), "room_id");
                LIZ2.LJJIIJZLJL();
            }

            @Override // X.InterfaceC005200i
            public final void LJ(int i, int i2) {
                C37661dq c37661dq = C37661dq.this;
                C12F c12f = C12F.CMD_DRAG_ONGOING;
                c12f.setParam(new C265212i(false, i, i2));
                c37661dq.LJIJ(c12f);
            }
        };
        c005500l3.LIZ();
        if (this.LJIJJLI == null) {
            View it = C16880lQ.LLLZIIL(R.layout.dkz, C16880lQ.LLZIL(C15380j0.LIZLLL()), null);
            Context LLLLL2 = C16880lQ.LLLLL(C15380j0.LIZLLL());
            o.LJIIIIZZ(LLLLL2, "getContext().applicationContext");
            o.LJIIIIZZ(it, "it");
            C55762Gu c55762Gu = new C55762Gu(LLLLL2, it);
            this.LJIJJLI = c55762Gu;
            DataChannel dataChannel = this.LIZJ;
            c55762Gu.LJLJLLL = dataChannel;
            if (dataChannel != null) {
                dataChannel.mv0(NewMessageNumChannel.class, c55762Gu, new IDqS416S0100000(c55762Gu, 344));
            }
        }
        this.LJJIJL = new C55792Gx(new IDqS425S0100000(this, 17), 1);
        if (this.LJIILL) {
            c2h0 = new C2H0(this.LJJJLL, this.LJJJLZIJ, this.LIZJ);
        } else {
            c2h0 = null;
        }
        InterfaceC266512v interfaceC266512v = this.LJJIJL;
        if (interfaceC266512v != null) {
            interfaceC266512v.LJJLI(this.LIZJ);
        }
        if (this.LJIILL) {
            CUC cuc3 = this.LJIIZILJ;
            if (cuc3 != null) {
                Context context2 = cuc3.getContext();
                o.LJIIIIZZ(context2, "context");
                C37811e5 c37811e5 = new C37811e5(context2, null, 0);
                cuc3.setTipsView(c37811e5);
                DataChannel dataChannel2 = this.LIZJ;
                InterfaceC266512v interfaceC266512v2 = this.LJJIJL;
                o.LJII(interfaceC266512v2, "null cannot be cast to non-null type com.bytedance.android.live.broadcast.bgbroadcast.game.FloatTipView");
                this.LJJIJL = new C37701du(dataChannel2, (C55792Gx) interfaceC266512v2, c37811e5, new IDqS425S0100000(this, 18));
            }
            ?? cw62 = new CW6(LJIIJJI(), LJIIIZ(), C81185Vtd.LJ(this.LIZIZ.getContext()), C81185Vtd.LIZJ(this.LIZIZ.getContext()));
            ((C32537Cpp) this.LIZJ.gv0(C31446CVu.class)).LIZ = cw62;
            cw6 = cw62;
        } else {
            cw6 = null;
        }
        if (LiveGameStarCommentSetting.INSTANCE.enable()) {
            this.LJJI = new C0RI(this.LIZJ, this.LJIIZILJ, this.LJJIJL, this);
        }
        this.LJIL = new C37821e6();
        C278217i LJIIJ3 = LJIIJ();
        C278217i c278217i2 = (C278217i) C005600m.LIZ("msg_view");
        C278217i LJIIL3 = LJIIL();
        if (LJIIJ3 != null && c278217i2 != null && LJIIL3 != null) {
            C12U c12u = new C12U(LJIIJ3, c278217i2, this.LJIJJ, this.LJJIJL, LJIIL3, this.LJIJJLI, this.LIZLLL, c2h0, cw6, this.LJJI);
            C37821e6 c37821e6 = this.LJIL;
            o.LJI(c37821e6);
            ((ArrayList) c12u.LJJ).add(c37821e6);
            this.LJIILLIIL = c12u;
        }
        if (c2h0 != null) {
            c2h0.LJLLL = this.LJIILLIIL;
        }
        C55762Gu c55762Gu2 = this.LJIJJLI;
        if (c55762Gu2 != null) {
            c55762Gu2.LJLJLJ = this.LJIILLIIL;
        }
        C78949Uyf.LJJJJ(this.LJIIZILJ, this.LIZIZ);
        CUC cuc4 = this.LJIIZILJ;
        o.LJII(cuc4, "null cannot be cast to non-null type android.view.View");
        ViewTreeLifecycleOwner.set(cuc4, this.LJIIZILJ);
        GameBroadcastFragment gameBroadcastFragment2 = this.LIZIZ;
        if (c2h0 != null) {
            view = c2h0.LJLJJI;
        } else {
            view = null;
        }
        C78949Uyf.LJJJJ(view, gameBroadcastFragment2);
        if (c2h0 != null && (view2 = c2h0.LJLJJI) != null) {
            ViewTreeLifecycleOwner.set(view2, this.LJIIZILJ);
        }
        LJIJ(C12F.CMD_TRANSITION_TO_INIT);
        LJIJ(C12F.CMD_TRANSITION_TO_HIDDEN);
        if (GameFloatNoticeSetting.INSTANCE.isExperimentGroup()) {
            c40611ib = new C40611ib(this.LIZJ);
        }
        this.LJJJZ = c40611ib;
        if (c40611ib != null) {
            c40611ib.LIZ(this.LJJJJJL);
        }
    }

    public final String LJIIIZ() {
        return (String) this.LJJJ.getValue();
    }

    public final long LJIIJJI() {
        return ((Number) this.LJJIL.getValue()).longValue();
    }

    public final boolean LJIILJJIL() {
        C37751dz c37751dz;
        C37741dy c37741dy;
        C37711dv c37711dv;
        if (this.LJJJJLI != 32) {
            return false;
        }
        C12U c12u = this.LJIILLIIL;
        C12M c12m = null;
        if (c12u == null || c12u.LJJIL == null) {
            return false;
        }
        C12M[] c12mArr = new C12M[3];
        if (c12u != null) {
            c37751dz = c12u.LJJIZ;
        } else {
            c37751dz = null;
        }
        c12mArr[0] = c37751dz;
        if (c12u != null) {
            c37741dy = c12u.LJJJ;
        } else {
            c37741dy = null;
        }
        c12mArr[1] = c37741dy;
        if (c12u != null) {
            c37711dv = c12u.LJJJIL;
        } else {
            c37711dv = null;
        }
        c12mArr[2] = c37711dv;
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(c12mArr);
        C12U c12u2 = this.LJIILLIIL;
        if (c12u2 != null) {
            c12m = c12u2.LJJIL;
        }
        if (LJJIJIIJI.contains(c12m)) {
            return false;
        }
        return true;
    }

    @Override // X.C12C
    public final void LIZLLL(C78862UxG c78862UxG) {
        this.LIZIZ.Ta(1, c78862UxG);
    }

    public final void LJIJ(C12F c12f) {
        C12U c12u = this.LJIILLIIL;
        if (c12u != null) {
            c12u.LJJ(c12f);
        }
    }

    @Override // X.InterfaceC06400My
    public final void LIZJ(String str, String str2) {
        long j;
        if (this.LIZIZ.isAdded() && !((LiveDialogFragment) this.LJJIIJ.getValue()).isShowing()) {
            GameMessageAlertDialog gameMessageAlertDialog = (GameMessageAlertDialog) this.LJJIIJ.getValue();
            FragmentManager childFragmentManager = this.LIZIZ.getChildFragmentManager();
            o.LJIIIIZZ(childFragmentManager, "fragment.childFragmentManager");
            gameMessageAlertDialog.getClass();
            gameMessageAlertDialog.LJLJJL = str;
            gameMessageAlertDialog.LJLJJLL = str2;
            gameMessageAlertDialog.show(childFragmentManager, "GameMessageAlertDialog");
            if (!o.LJ(str, "in_app") || !gameMessageAlertDialog.LJLJLJ) {
                return;
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_live_overlay_settings_show");
            LIZ.LJIJJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            C07250Qf.LIZJ(j, LIZ, "room_id", "screen_share", "live_type");
            LIZ.LJIJJ(str, "enter_from");
            LIZ.LJIJJ(str2, "tab_name");
            LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(C40210FqI.LJ(C15380j0.LIZLLL()))) ? 1 : 0), "overlay_permission");
            LIZ.LJJIIJZLJL();
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.1e4] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.ugc.live.sdk.message.interfaces.IMessageManager, O] */
    public final void LJIILL(Intent intent, C78862UxG c78862UxG) {
        Boolean bool;
        boolean z;
        int i;
        String str;
        Intent intent2;
        if (C29306Beo.LJJIFFI((Boolean) this.LIZJ.kv0(BDT.class))) {
            return;
        }
        GameBroadcastFragment gameBroadcastFragment = this.LIZIZ;
        C0NB.LJIIIZ("GameUiStrategy", "onProjectReady");
        this.LJJIFFI = intent;
        IMessageManager iMessageManager = (IMessageManager) gameBroadcastFragment.LJIIL().kv0(C29927Bop.class);
        if (iMessageManager == null) {
            iMessageManager = ((IMessageService) CN1.LIZ(IMessageService.class)).messageManagerProvider(gameBroadcastFragment.xl().getId(), true, this.LJFF);
        }
        this.LJJJJJL = iMessageManager;
        ((C32537Cpp) gameBroadcastFragment.LJIIL().gv0(C29927Bop.class)).LIZ = this.LJJJJJL;
        gameBroadcastFragment.vl();
        InterfaceC31286CPq interfaceC31286CPq = this.LJJJJJ;
        if (interfaceC31286CPq != null) {
            interfaceC31286CPq.LJI(this.LJJJJJL);
        }
        C3T c3t = this.LIZLLL;
        if (c3t != null) {
            c3t.LIZJ(this.LJJJJJL);
        }
        C40611ib c40611ib = this.LJJJZ;
        if (c40611ib != null) {
            c40611ib.LIZ(this.LJJJJJL);
        }
        this.LJ = new OnMessageListener() { // from class: X.1e4
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage it) {
                String str2;
                String str3;
                PerceptionDialogInfo perceptionDialogInfo;
                String str4;
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("game receive message ");
                    LIZ.append(C16880lQ.LJLLILLLL(it.getClass()));
                    C0NB.LIZIZ("GameBroadcastFragment", X1D.LIZIZ(LIZ));
                }
                if (it instanceof PerceptionMessage) {
                    C37661dq c37661dq = C37661dq.this;
                    o.LJIIIIZZ(it, "it");
                    PerceptionMessage perceptionMessage = (PerceptionMessage) it;
                    c37661dq.getClass();
                    PunishEventInfo punishEventInfo = perceptionMessage.publicEventInfo;
                    if (punishEventInfo != null) {
                        str2 = punishEventInfo.punishType;
                    } else {
                        str2 = null;
                    }
                    if (o.LJ(str2, "muting_cancel") && (perceptionDialogInfo = perceptionMessage.dialog) != null && perceptionDialogInfo.scene == 6) {
                        PunishEventInfo punishEventInfo2 = perceptionMessage.publicEventInfo;
                        if (punishEventInfo2 != null) {
                            str4 = punishEventInfo2.punishId;
                        } else {
                            str4 = null;
                        }
                        long LJJII = C1E4.LJJII(str4);
                        GameBroadcastFragment gameBroadcastFragment2 = c37661dq.LIZIZ;
                        if (LJJII == gameBroadcastFragment2.LLI) {
                            C37691dt c37691dt = gameBroadcastFragment2.LJZI;
                            if (c37691dt != null) {
                                InterfaceC21020s6 interfaceC21020s6 = c37691dt.LJLJI;
                                if (interfaceC21020s6 != null) {
                                    interfaceC21020s6.LJIIL(false, C78857UxB.LJJIIJ(1476788233, "bpea-game_start_audio"));
                                    AnonymousClass147.LJ();
                                    C0TN.LIZ();
                                }
                                c37661dq.LIZIZ.LLI = -1L;
                                AnonymousClass143 anonymousClass143 = c37661dq.LJJIII;
                                if (anonymousClass143 != null) {
                                    anonymousClass143.LJIIIZ = false;
                                }
                                C12B.LIZ(c37661dq, false, EnumC264412a.LIVE_TIP_MESSAGE_MUTING_TIP.ordinal(), null, 12);
                                return;
                            }
                            o.LJIJI("mServiceStrategy");
                            throw null;
                        }
                    }
                    PerceptionDialogInfo perceptionDialogInfo2 = perceptionMessage.dialog;
                    if (perceptionDialogInfo2 != null && perceptionDialogInfo2.scene == 6) {
                        EnumC264412a enumC264412a = EnumC264412a.LIVE_TIP_BOTTOM_MESSAGE_CLOSE;
                        c37661dq.LJFF(false, enumC264412a.ordinal(), "", perceptionMessage.publicEventInfo);
                        c37661dq.LJFF(false, enumC264412a.ordinal(), "", perceptionMessage.publicEventInfo);
                        return;
                    }
                    C76732zl c76732zl = new C76732zl();
                    int LIZ2 = C264512b.LIZ(perceptionMessage.floatStyle, -1);
                    c76732zl.element = LIZ2;
                    if (LIZ2 == -1) {
                        return;
                    }
                    PerceptionDialogInfo perceptionDialogInfo3 = perceptionMessage.dialog;
                    if (perceptionDialogInfo3 != null && perceptionDialogInfo3.scene == 7) {
                        c76732zl.element = EnumC264412a.LIVE_TIP_COPYRIGHT_WARNING.ordinal();
                    }
                    Text text = perceptionMessage.floatText;
                    if (text != null) {
                        str3 = text.defaultPattern;
                    } else {
                        str3 = null;
                    }
                    String obj = CXJ.LJFF(text, str3).toString();
                    if (o.LJ(obj, "")) {
                        C0NB.LIZIZ("GameBroadcastFragment", "PerceptionMessage tip is null");
                        return;
                    }
                    c37661dq.LJFF(true, c76732zl.element, obj, perceptionMessage.publicEventInfo);
                    if (c76732zl.element != EnumC264412a.LIVE_TIP_GO_APPEAL_TIPS.ordinal()) {
                        return;
                    }
                    c37661dq.LJJIIJZLJL.add(XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C55812Gz(c37661dq, c76732zl, perceptionMessage, null), 2));
                    return;
                }
                if (!(it instanceof GameRankNotifyMessage)) {
                    return;
                }
                C37661dq c37661dq2 = C37661dq.this;
                o.LJIIIIZZ(it, "it");
                c37661dq2.getClass();
                String obj2 = CXJ.LJFF(((GameRankNotifyMessage) it).notifyText, "").toString();
                if (obj2.length() == 0) {
                    return;
                }
                C12B.LIZ(c37661dq2, true, EnumC264412a.LIVE_TIP_GAMING_RANKING_CHANGE_TIPS.ordinal(), obj2, 8);
            }
        };
        IMessageManager iMessageManager2 = this.LJJJJJL;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(EnumC31509CYf.PERCEPTION_MESSAGE.ordinal(), this.LJ);
        }
        IMessageManager iMessageManager3 = this.LJJJJJL;
        if (iMessageManager3 != null) {
            iMessageManager3.addAsyncMessageListener(EnumC31509CYf.GAME_RANK_NOTIFY_MESSAGE.ordinal(), this.LJ);
        }
        this.LJIIJJI = true;
        ActivityC45651qj activityC45651qj = this.LJFF;
        if (activityC45651qj != null && (intent2 = activityC45651qj.getIntent()) != null) {
            bool = Boolean.valueOf(intent2.getBooleanExtra("live.intent.extra.IS_CONTINUE_LIVE", false));
        } else {
            bool = null;
        }
        boolean LJJIFFI = C29306Beo.LJJIFFI(bool);
        if (this.LJIILL && C40210FqI.LJ(gameBroadcastFragment.mo49getActivity()) && BroadcastGameCountDownNum.INSTANCE.isNeedCountDown() && !LJJIFFI) {
            z = true;
        } else {
            z = false;
        }
        this.LJII = z;
        if (z && !this.LJIIIIZZ) {
            C30381He c30381He = this.LJJJJI;
            if (C40210FqI.LJ(c30381He.LIZ.mo49getActivity())) {
                c30381He.LIZJ.LJIIIIZZ();
            }
            GamePreparationFragment gamePreparationFragment = new GamePreparationFragment();
            if (gameBroadcastFragment.isAdded() && !gameBroadcastFragment.mStatusDestroyed && gameBroadcastFragment.getChildFragmentManager().LJJJIL("AbsPreparationFragment") == null) {
                gameBroadcastFragment.LJIIL().rv0(RoomChannel.class, gameBroadcastFragment.xl());
                gamePreparationFragment.Il(gameBroadcastFragment.LJIIL(), gameBroadcastFragment);
                gameBroadcastFragment.LL = gamePreparationFragment;
                FragmentManager childFragmentManager = gameBroadcastFragment.getChildFragmentManager();
                C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
                LIZ.LJIIIIZZ(R.id.i1d, 1, gamePreparationFragment, "AbsPreparationFragment");
                LIZ.LJI();
            }
            this.LJIIIIZZ = true;
            this.LJJIJIIJIL = c78862UxG;
            this.LJJIJIL = this.LJIIJ;
            BZI LIZ2 = C28787BRn.LIZ("livesdk_live_prepare_page_show");
            LIZ2.LJIJ("screen_share");
            LIZ2.LJFF(LJIIIZ());
            LIZ2.LJJIII(Long.valueOf(gameBroadcastFragment.getRoomId()));
            GameTag LIZIZ = C28514BHa.LIZIZ();
            if (LIZIZ != null && (str = LIZIZ.packageName) != null) {
                i = Integer.valueOf(FCD.LJFF(gameBroadcastFragment.getContext(), str) ? 1 : 0);
            } else {
                i = 0;
            }
            LIZ2.LJIJJ(i, "if_default_game");
            LIZ2.LJJIIJZLJL();
            return;
        }
        gameBroadcastFragment.em(c78862UxG, this.LJIIJ);
        gameBroadcastFragment.cm(new GameBroadcastInteractionFragment());
    }

    public final void LJIIZILJ(boolean z, boolean z2) {
        String str;
        BZI LIZ;
        if (this.LIZJ.kv0(BCX.class) != LiveMode.VIDEO) {
            str = "screen_share";
        } else {
            str = "video_live";
        }
        if (z) {
            LIZ = C28787BRn.LIZ("livesdk_live_pause_click");
            LIZ.LJIJJ(Integer.valueOf(z2 ? 1 : 0), "is_max_pause_num");
            Boolean LIZJ = InterfaceC30442Bx8.LJJJJLL.LIZJ();
            o.LJIIIIZZ(LIZJ, "SHOW_PAUSE_LIVE_TIP.value");
            LIZ.LJIJJ(Integer.valueOf(LIZJ.booleanValue() ? 1 : 0), "is_first");
        } else {
            LIZ = C28787BRn.LIZ("livesdk_live_anchor_resume_click");
        }
        LIZ.LJIJJ(str, "live_type");
        LIZ.LJIJJ(0, "in_app");
        LIZ.LJIJ("screen_share");
        LIZ.LJIJJ(Long.valueOf(LJIIJJI()), "room_id");
        LIZ.LJIJJ(1, "is_floating");
        LIZ.LJIILLIIL(this.LIZJ);
        LIZ.LJJIIJZLJL();
        C29689Bkz.LIZ.LJIIL(new IDqS0S0010000(z, 3));
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [X.1X2] */
    public C37661dq(Room room, final GameBroadcastFragment fragment, DataChannel dataChannel) {
        boolean z;
        InterfaceC30601Ia c41341jm;
        Intent intent;
        o.LJIIIZ(fragment, "fragment");
        this.LIZ = room;
        this.LIZIZ = fragment;
        this.LIZJ = dataChannel;
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        this.LJFF = mo49getActivity;
        if (mo49getActivity != null && (intent = mo49getActivity.getIntent()) != null) {
            z = intent.getBooleanExtra("hotsoon.intent.extra.IS_LANDSCAPE", true);
        } else {
            z = true;
        }
        this.LJIIJ = z;
        this.LJIILIIL = new C73318Sq2();
        this.LJIILL = BroadcastGameFloatWindowLibra.INSTANCE.isExperimentGroup();
        this.LJJIIJ = C78996UzQ.LJJIJIIJI(AnonymousClass283.LJLIL);
        this.LJJIIJZLJL = new ArrayList<>();
        this.LJJIIZI = "";
        this.LJJIJIL = true;
        this.LJJIL = C221108m2.LIZIZ(AnonymousClass284.LJLIL);
        this.LJJIZ = C221108m2.LIZIZ(AnonymousClass285.LJLIL);
        this.LJJJ = C221108m2.LIZIZ(new IDqS420S0100000(this, 182));
        this.LJJJI = new C0TM(fragment, this);
        this.LJJJIL = new C276616s(fragment, this);
        if (MultiDeviceInterruptGuideSetting.INSTANCE.isEnable()) {
            c41341jm = new C41351jn(fragment, dataChannel, this);
        } else {
            c41341jm = new C41341jm(fragment, dataChannel, this);
        }
        this.LJJJJ = c41341jm;
        this.LJJJJI = new C30381He(fragment, dataChannel, this);
        this.LJJJJL = new ArrayList();
        this.LJJJJLI = -1;
        this.LJJJJZ = new InterfaceC18260ne(fragment) { // from class: X.1X2
            public final GameBroadcastFragment LIZ;

            @Override // X.InterfaceC18260ne
            public final void start() {
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("MicrophoneSignalSource. start. ThreadName=");
                    LIZ.append(C18280ng.LIZ());
                    C0NB.LJIIIZ("MicrophoneSignalSource", X1D.LIZIZ(LIZ));
                }
            }

            @Override // X.InterfaceC18260ne
            public final void stop() {
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("MicrophoneSignalSource. stop. ThreadName=");
                    LIZ.append(C18280ng.LIZ());
                    C0NB.LJIIIZ("MicrophoneSignalSource", X1D.LIZIZ(LIZ));
                }
            }

            {
                o.LJIIIZ(fragment, "fragment");
                this.LIZ = fragment;
            }

            @Override // X.InterfaceC18260ne
            public final void LIZ(TnsPiracyDetail tnsPiracyDetail) {
                long LJIL;
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("MicrophoneSignalSource. flush. ThreadName=");
                    LIZ.append(C18280ng.LIZ());
                    C0NB.LJIIIZ("MicrophoneSignalSource", X1D.LIZIZ(LIZ));
                }
                C37691dt c37691dt = this.LIZ.LJZI;
                if (c37691dt != null) {
                    InterfaceC21020s6 interfaceC21020s6 = c37691dt.LJLJI;
                    if (interfaceC21020s6 == null) {
                        LJIL = 0;
                    } else {
                        LJIL = interfaceC21020s6.LJIL();
                    }
                    tnsPiracyDetail.microSound = LJIL;
                    return;
                }
                o.LJIJI("mServiceStrategy");
                throw null;
            }
        };
        this.LJJJJZI = new C1XB(fragment);
        this.LJJJLIIL = new C1XC();
        this.LJJJLL = new LinkedList<>();
        this.LJJJLZIJ = new LinkedList<>();
        this.LJJL = new IDBReceiverS4S0100000(this, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, r0) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(X.EnumC264412a r13, X.C12X r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37661dq.LJIILLIIL(X.12a, X.12X, java.lang.Object):void");
    }

    public static void LJIJI(C37661dq c37661dq, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if (C40210FqI.LIZ(c37661dq.LJFF)) {
            GameBroadcastFragment gameBroadcastFragment = c37661dq.LIZIZ;
            Context context = gameBroadcastFragment.getContext();
            if (context != null) {
                C16880lQ.LIZJ(context, new Intent(gameBroadcastFragment.getContext(), (Class<?>) ((IHostAction) CN1.LIZ(IHostAction.class)).getHostActivity(6)));
            }
            if (z) {
                c37661dq.LIZJ("popup_panel", "full");
            }
            if (z2) {
                c37661dq.LIZJ.pv0(GameFloatingWindowAudienceClickEvent.class);
                return;
            }
            return;
        }
        if (c37661dq.LJJIJLIJ == null) {
            C47071t1 c47071t1 = new C47071t1(c37661dq.LJFF);
            c47071t1.LJFF(R.string.mbt);
            c47071t1.LJIIL(R.string.mbu, new IDcS169S0100000(c37661dq, 35));
            c47071t1.LJIIIZ(R.string.mbv, C73040SlY.LJLJLJ);
            c37661dq.LJJIJLIJ = c47071t1.LIZ();
        }
        LiveDialog liveDialog = c37661dq.LJJIJLIJ;
        if (liveDialog != null && !new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog, new Object[0], "void", new C65300Pk0(false, "()V", "1624826173945489860")).LIZ) {
            liveDialog.show();
        }
        int ordinal = EnumC264412a.LIVE_TIP_MESSAGE_UN_START.ordinal();
        String string = c37661dq.LIZIZ.getString(R.string.mbt);
        o.LJIIIIZZ(string, "fragment.getString(R.str…e_popUpAccess_modal_body)");
        C12B.LIZ(c37661dq, true, ordinal, string, 8);
    }

    @Override // X.C12C
    public final void LJFF(boolean z, int i, CharSequence tipText, PunishEventInfo punishEventInfo) {
        C12F c12f;
        o.LJIIIZ(tipText, "tipText");
        if (this.LJIIL || !LJIILIIL()) {
            return;
        }
        CWR cwr = new CWR(tipText, z, i, punishEventInfo, null, 16);
        if (cwr.LIZIZ) {
            c12f = C12F.CMD_NEW_TIP;
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_floating_toast_show");
            LIZ.LJIJJ(LJIIIZ(), "anchor_id");
            LIZ.LJIJ("screen_share");
            LIZ.LJIJJ(Long.valueOf(LJIIJJI()), "room_id");
            LIZ.LJJIIJZLJL();
        } else {
            c12f = C12F.CMD_HIDE_TIP;
        }
        IDRunnableS2S0300000 iDRunnableS2S0300000 = new IDRunnableS2S0300000(this, c12f, cwr, 14);
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            iDRunnableS2S0300000.run();
        } else {
            C15610jN.LIZ().post(iDRunnableS2S0300000);
        }
    }
}
