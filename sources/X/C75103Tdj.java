package X;

import Y.ACListenerS33S0100000_13;
import Y.ARunnableS41S0100000_5;
import Y.AfS65S0100000_13;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkReceiveEnlargeMessageEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AudioStateChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MicClickableEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiLiveUserMediaEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.PlayerPauseLiveForAnchorDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomService;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.dataChannel.MemberMessageChannel;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import o53.IDdS478S0100000_13;

/* renamed from: X.Tdj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C75103Tdj extends AbstractC32579CqV {
    public final AbstractC73672Svk<User> LJLJL;
    public final DataChannel LJLJLJ;
    public final Runnable LJLJLLL;
    public User LJLL;
    public LiveIconView LJLLI;
    public C47061t0 LJLLILLLL;
    public LiveIconView LJLLJ;
    public LiveIconView LJLLL;
    public C47121t6 LJLLLL;
    public LiveIconView LJLLLLLL;
    public LiveIconView LJLZ;
    public CX5 LJZ;
    public C73318Sq2 LJZI;
    public Room LJZL;
    public boolean LL;
    public User LLD;
    public Animatable LLF;
    public ActivityC45651qj LLFF;
    public final C73318Sq2 LLFFF;
    public int LLFII;
    public int LLFZ;
    public boolean LLI;
    public final String LLIFFJFJJ;
    public final TR1 LLII;
    public final TX0 LLIIII;
    public final int LLIIIILZ;

    @InterfaceC75138TeI(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder oMultiGuestDataHolder;

    @InterfaceC75138TeI(name = "ZOOM_SERVICE")
    public ZoomService oZoomService;

    public static void LJJII(LiveDialog liveDialog) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog, new Object[0], "void", new C65300Pk0(false, "()V", "-7226155974632497577")).LIZ) {
            return;
        }
        liveDialog.show();
    }

    public static String LJJIII() {
        Long l;
        User owner;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && (owner = room.getOwner()) != null) {
            l = Long.valueOf(owner.getId());
        } else {
            l = null;
        }
        return String.valueOf(l);
    }

    @Override // X.AbstractC32579CqV
    public final void LJIILIIL() {
        C0NB.LJIIIZ("MultiGuestLeafTrace", "Triggered onEnd");
        this.LL = false;
    }

    @Override // X.AbstractC32579CqV
    public final void LJIILJJIL() {
        C73318Sq2 c73318Sq2 = this.LJZI;
        if (c73318Sq2 != null) {
            c73318Sq2.LIZLLL();
        } else {
            o.LJIJI("compositeDisposable");
            throw null;
        }
    }

    @Override // X.AbstractC32579CqV
    public void LJIILL() {
        C0NB.LJIIIZ("MultiGuestLeafTrace", "Triggered onRegister");
        User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
        this.LJLL = LJ;
        C47061t0 c47061t0 = this.LJLLILLLL;
        if (c47061t0 != null) {
            C16880lQ.LJJI(c47061t0, new ACListenerS33S0100000_13(this, 152));
            LiveIconView liveIconView = this.LJLLI;
            if (liveIconView != null) {
                C16880lQ.LJJII(liveIconView, new ACListenerS33S0100000_13(this, 153));
                C47121t6 c47121t6 = this.LJLLLL;
                if (c47121t6 != null) {
                    C16880lQ.LJJIIZ(c47121t6, new ACListenerS33S0100000_13(this, 154));
                    CX5 cx5 = this.LJZ;
                    if (cx5 != null) {
                        cx5.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS33S0100000_13(this, 155)));
                        LiveIconView liveIconView2 = this.LJLLLLLL;
                        if (liveIconView2 != null) {
                            C16880lQ.LJJII(liveIconView2, new ACListenerS33S0100000_13(this, 156));
                            LiveIconView liveIconView3 = this.LJLZ;
                            if (liveIconView3 != null) {
                                C16880lQ.LJJII(liveIconView3, new ACListenerS33S0100000_13(this, 157));
                                LiveIconView liveIconView4 = this.LJLLJ;
                                if (liveIconView4 != null) {
                                    C16880lQ.LJJII(liveIconView4, new ACListenerS33S0100000_13(this, 158));
                                    LiveIconView liveIconView5 = this.LJLLL;
                                    if (liveIconView5 != null) {
                                        C16880lQ.LJJII(liveIconView5, new ACListenerS33S0100000_13(this, 159));
                                        if (this.LLFF != null) {
                                            DataChannel dataChannel = this.LJLJLJ;
                                            dataChannel.mv0(MultiLiveUserMediaEvent.class, this, new AqS179S0100000_13(this, 435));
                                            dataChannel.mv0(MemberMessageChannel.class, this, new AqS179S0100000_13(this, 436));
                                            dataChannel.mv0(LinkReceiveEnlargeMessageEvent.class, this, new AqS179S0100000_13(this, 437));
                                            dataChannel.mv0(PlayerPauseLiveForAnchorDialogEvent.class, this, new AqS179S0100000_13(this, 438));
                                            dataChannel.mv0(AudioStateChangeEvent.class, this, new AqS179S0100000_13(this, 439));
                                            dataChannel.mv0(MicClickableEvent.class, this, new AqS179S0100000_13(this, 440));
                                        }
                                        C8E.LJ().e3(this.LLII);
                                        C75106Tdm c75106Tdm = new C75106Tdm(this);
                                        C73943T0h.LIZ().LJ(CJ5.class).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJIFFI(C77275UUl.LJLIL).LJJIFFI(new C75118Tdy(c75106Tdm)).LJJJLIIL(new AfS65S0100000_13(c75106Tdm, 131), new InterfaceC64592gB() { // from class: X.9Xd
                                            @Override // X.InterfaceC64592gB
                                            public final void accept(Object obj) {
                                                Throwable th = (Throwable) obj;
                                                if (th != null) {
                                                    th.printStackTrace();
                                                }
                                            }
                                        });
                                        ((IInteractService) CN1.LIZ(IInteractService.class)).PO(this.LLIIII);
                                        this.LLFFF.LIZ(this.LJLJL.LJJJLIIL(new AfS65S0100000_13(this, 132), C75122Te2.LJLIL));
                                        return;
                                    }
                                    o.LJIJI("zoomButton");
                                    throw null;
                                }
                                o.LJIJI("cameraButton");
                                throw null;
                            }
                            o.LJIJI("kickOutButton");
                            throw null;
                        }
                        o.LJIJI("settingButton");
                        throw null;
                    }
                    o.LJIJI("userAvatarIconView");
                    throw null;
                }
                o.LJIJI("userNameTV");
                throw null;
            }
            o.LJIJI("micButton");
            throw null;
        }
        o.LJIJI("followView");
        throw null;
    }

    @Override // X.AbstractC32579CqV
    public void LJIJJ() {
        this.LLFFF.LIZLLL();
        DataChannel dataChannel = this.LJLJLJ;
        dataChannel.getClass();
        dataChannel.jv0(this);
        C8E.LJ().X3(this.LLII);
        ((IInteractService) CN1.LIZ(IInteractService.class)).ad0(this.LLIIII);
        super.LJIJJ();
        C0NB.LJIIIZ("MultiGuestLeafTrace", "Triggered onUnRegister");
    }

    public final TZX<LinkPlayerInfo, MultiLiveGuestInfoList> LJJIIJ() {
        InterfaceC74853TZh interfaceC74853TZh;
        InterfaceC31805Ce1 interfaceC31805Ce1;
        User user = this.LJLL;
        if (user != null) {
            if (C74947TbD.LJIILLIIL(user)) {
                Object obj = C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
                if (!(obj instanceof InterfaceC31805Ce1) || (interfaceC31805Ce1 = (InterfaceC31805Ce1) obj) == null) {
                    return null;
                }
                return interfaceC31805Ce1.LIZ();
            }
            Object obj2 = C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_V3_MODERATOR_USER_MANAGER");
            if (!(obj2 instanceof InterfaceC74853TZh) || (interfaceC74853TZh = (InterfaceC74853TZh) obj2) == null) {
                return null;
            }
            return interfaceC74853TZh.LIZ();
        }
        o.LJIJI("me");
        throw null;
    }

    public final int LJJIIJZLJL() {
        Boolean bool;
        Boolean bool2;
        String str;
        String str2;
        boolean z;
        ZoomService zoomService = this.oZoomService;
        String str3 = null;
        if (zoomService != null) {
            User user = this.LLD;
            if (user != null) {
                LinkPlayerInfo LJJIIZI = LJJIIZI(user);
                if (LJJIIZI != null) {
                    str2 = LJJIIZI.mInteractIdStr;
                } else {
                    str2 = null;
                }
                String str4 = "";
                if (str2 == null) {
                    str2 = "";
                }
                AbstractC75001Tc5 LJIIJJI = zoomService.LJIIJJI();
                LJIIJJI.getClass();
                if (!TextUtils.isEmpty(LJIIJJI.LIZ.LIZJ) && !o.LJ(str2, LJIIJJI.LIZ.LIZJ)) {
                    C74995Tbz c74995Tbz = LJIIJJI.LIZ;
                    String str5 = c74995Tbz.LIZJ;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    if (!c74995Tbz.LJI(str4)) {
                        z = true;
                        bool = Boolean.valueOf(z);
                    }
                }
                z = false;
                bool = Boolean.valueOf(z);
            } else {
                o.LJIJI("oTargetUser");
                throw null;
            }
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            return 1;
        }
        ZoomService zoomService2 = this.oZoomService;
        if (zoomService2 != null) {
            bool2 = Boolean.valueOf(zoomService2.LJI());
        } else {
            bool2 = null;
        }
        if (C29306Beo.LJJIFFI(bool2)) {
            return 2;
        }
        User user2 = this.LLD;
        if (user2 != null) {
            LinkPlayerInfo LJJIIZI2 = LJJIIZI(user2);
            if (LJJIIZI2 != null) {
                str = LJJIIZI2.mInteractIdStr;
            } else {
                str = null;
            }
            ZoomService zoomService3 = this.oZoomService;
            if (zoomService3 != null) {
                str3 = zoomService3.LJFF();
            }
            if (!o.LJ(str, str3)) {
                return 0;
            }
            return 3;
        }
        o.LJIJI("oTargetUser");
        throw null;
    }

    public final boolean LJJIJIL() {
        if (this.LLD != null && this.LL) {
            return true;
        }
        return false;
    }

    public final void LJJIJL() {
        String str;
        Context context = this.LJLIL;
        C73318Sq2 c73318Sq2 = this.LJZI;
        if (c73318Sq2 != null) {
            if (!C74947TbD.LJ("openUserProfile", context, c73318Sq2)) {
                return;
            }
            if (C74947TbD.LJIIZILJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()))) {
                str = "live_anchor_c_audience";
            } else {
                str = "live_audience_c_audience";
            }
            User user = this.LLD;
            if (user != null) {
                UserProfileEvent userProfileEvent = new UserProfileEvent(user, str);
                userProfileEvent.mReportType = "report_user";
                userProfileEvent.mSource = "guest_connection";
                userProfileEvent.mClickUserPosition = "gift_panel";
                C73943T0h.LIZ().LIZIZ(userProfileEvent);
                return;
            }
            o.LJIJI("oTargetUser");
            throw null;
        }
        o.LJIJI("compositeDisposable");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIJLIJ() {
        String str;
        String str2;
        if (this.LLD != null && C74947TbD.LJIILL()) {
            C74824TYe c74824TYe = C74824TYe.LIZ;
            User user = this.LLD;
            String str3 = null;
            if (user != null) {
                String LJJIIZ = LJJIIZ(user);
                if (LJJIIZ == null) {
                    LJJIIZ = "anchor_invite_guest";
                }
                int i = this.LLFII;
                int i2 = this.LLFZ;
                User user2 = this.LLD;
                if (user2 != null) {
                    boolean LIZJ = C29619Bjr.LIZJ(user2);
                    User user3 = this.LLD;
                    if (user3 != null) {
                        long id = user3.getId();
                        User user4 = this.LLD;
                        if (user4 != null) {
                            LinkPlayerInfo LJJIIZI = LJJIIZI(user4);
                            if (LJJIIZI != null) {
                                str = LJJIIZI.mInteractIdStr;
                            } else {
                                str = null;
                            }
                            ZoomService zoomService = this.oZoomService;
                            User user5 = this.LLD;
                            if (user5 != null) {
                                LinkPlayerInfo LJJIIZI2 = LJJIIZI(user5);
                                if (LJJIIZI2 != null) {
                                    str3 = LJJIIZI2.mInteractIdStr;
                                }
                                int LJJI = C77123UOp.LJJI(zoomService, str3);
                                if (!UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_anchor_guest_gift_panel_show")) {
                                    return;
                                }
                                HashMap LIZLLL = C73098SmU.LIZLLL();
                                Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                                if (room != null) {
                                    String idStr = room.getIdStr();
                                    o.LJIIIIZZ(idStr, "room.idStr");
                                    LIZLLL.put("room_id", idStr);
                                    LIZLLL.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                                    LIZLLL.put("guest_id", String.valueOf(id));
                                }
                                LIZLLL.put("guest_invite_type", LJJIIZ);
                                if (i != 0) {
                                    if (i != 1) {
                                        if (i == 2) {
                                            LIZLLL.put("camera_status", "off");
                                        }
                                    } else {
                                        LIZLLL.put("camera_status", "on");
                                    }
                                } else {
                                    LIZLLL.put("camera_status", "abnormal");
                                }
                                if (i2 != 1) {
                                    if (i2 == 2) {
                                        LIZLLL.put("mic_status", "off");
                                    }
                                } else {
                                    LIZLLL.put("mic_status", "on");
                                }
                                if (LIZJ) {
                                    str2 = "1";
                                } else {
                                    str2 = CardStruct.IStatusCode.DEFAULT;
                                }
                                C116484hg.LIZIZ(LIZLLL, "is_following", str2, LJJI, "enlarge_status");
                                String str4 = "null";
                                if (str == null) {
                                    str = "null";
                                }
                                LIZLLL.put("link_id", str);
                                Object obj = C58582Myw.LIZ().get(Long.valueOf(id));
                                if (obj != 0) {
                                    str4 = obj;
                                }
                                LIZLLL.put("guest_enter_from", str4);
                                C74824TYe.LIZJ(c74824TYe, LIZLLL);
                                C74824TYe.LJLL("livesdk_anchor_guest_gift_panel_show", LIZLLL);
                                return;
                            }
                            o.LJIJI("oTargetUser");
                            throw null;
                        }
                        o.LJIJI("oTargetUser");
                        throw null;
                    }
                    o.LJIJI("oTargetUser");
                    throw null;
                }
                o.LJIJI("oTargetUser");
                throw null;
            }
            o.LJIJI("oTargetUser");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIL() {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75103Tdj.LJJIL():void");
    }

    public final void LJJJI() {
        EnumC74949TbF enumC74949TbF;
        String str;
        LiveIconView liveIconView = this.LJLLL;
        if (liveIconView != null) {
            ZoomService zoomService = this.oZoomService;
            if (zoomService == null) {
                enumC74949TbF = EnumC74949TbF.ZOOM_DISABLED;
            } else {
                User user = this.LLD;
                if (user != null) {
                    LinkPlayerInfo LJJIIZI = LJJIIZI(user);
                    if (LJJIIZI == null || (str = LJJIIZI.mInteractIdStr) == null) {
                        enumC74949TbF = EnumC74949TbF.ZOOM_DISABLED;
                    } else {
                        enumC74949TbF = zoomService.LJIIJJI().LIZLLL(str);
                    }
                } else {
                    o.LJIJI("oTargetUser");
                    throw null;
                }
            }
            C74947TbD.LJJIIJZLJL(liveIconView, enumC74949TbF, this.LJLIL, C87277YNd.LJIJI(R.color.a3k), C87277YNd.LJIJI(R.color.bh));
            return;
        }
        o.LJIJI("zoomButton");
        throw null;
    }

    @Override // X.AbstractC32579CqV
    public final void onStart() {
        ZoomService zoomService;
        C0NB.LJIIIZ("MultiGuestLeafTrace", "Triggered onStart");
        Object LIZ = C75559Tl5.LIZIZ.LIZ("ZOOM_SERVICE");
        if (LIZ instanceof ZoomService) {
            zoomService = (ZoomService) LIZ;
        } else {
            zoomService = null;
        }
        this.oZoomService = zoomService;
        this.LLI = false;
        this.LL = true;
    }

    public int LJJI(LinkPlayerInfo linkPlayerInfo) {
        MultiGuestDataHolder multiGuestDataHolder = this.oMultiGuestDataHolder;
        if (multiGuestDataHolder != null) {
            return C74947TbD.LIZ(linkPlayerInfo, multiGuestDataHolder);
        }
        o.LJIJI("oMultiGuestDataHolder");
        throw null;
    }

    public int LJJIFFI(LinkPlayerInfo linkPlayerInfo) {
        LinkListUser linkListUser;
        if (linkPlayerInfo != null) {
            linkListUser = TV3.LIZIZ(linkPlayerInfo);
        } else {
            linkListUser = null;
        }
        MultiGuestDataHolder multiGuestDataHolder = this.oMultiGuestDataHolder;
        if (multiGuestDataHolder != null) {
            return C74947TbD.LIZIZ(linkListUser, multiGuestDataHolder);
        }
        o.LJIJI("oMultiGuestDataHolder");
        throw null;
    }

    public final String LJJIIZ(User user) {
        TRS trs;
        User user2 = this.LJLL;
        if (user2 != null) {
            if (C74947TbD.LJIILLIIL(user2)) {
                Object obj = C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
                if (!(obj instanceof InterfaceC31805Ce1)) {
                    return null;
                }
                trs = (TRS) obj;
            } else {
                Object obj2 = C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_V3_MODERATOR_USER_MANAGER");
                if (!(obj2 instanceof InterfaceC74853TZh)) {
                    return null;
                }
                trs = (TRS) obj2;
            }
            if (trs == null) {
                return null;
            }
            return trs.LIZIZ(user.getId());
        }
        o.LJIJI("me");
        throw null;
    }

    public final LinkPlayerInfo LJJIIZI(User user) {
        TZX<LinkPlayerInfo, MultiLiveGuestInfoList> LJJIIJ = LJJIIJ();
        if (LJJIIJ != null) {
            return C76917UGr.LJJIJL(LJJIIJ, user.getId());
        }
        return null;
    }

    public boolean LJJIJ(String str) {
        MultiGuestDataHolder multiGuestDataHolder = this.oMultiGuestDataHolder;
        if (multiGuestDataHolder != null) {
            if (multiGuestDataHolder.LJI(str) == 2) {
                return true;
            }
            return false;
        }
        o.LJIJI("oMultiGuestDataHolder");
        throw null;
    }

    public final Boolean LJJIJIIJIL(User user) {
        List LJJI;
        TZX<LinkPlayerInfo, MultiLiveGuestInfoList> LJJIIJ = LJJIIJ();
        if (LJJIIJ != null && (LJJI = ((AbstractC74727TUl) LJJIIJ).LJJI()) != null) {
            boolean z = false;
            if (!LJJI.isEmpty()) {
                Iterator it = LJJI.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((LinkPlayerInfo) it.next()).mUser.getId() == user.getId()) {
                        z = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
        return null;
    }

    public final void LJJIZ(boolean z) {
        LiveIconView liveIconView = this.LJLLJ;
        if (liveIconView != null) {
            liveIconView.setClickable(!z);
            LiveIconView liveIconView2 = this.LJLLI;
            if (liveIconView2 != null) {
                liveIconView2.setClickable(!z);
                return;
            } else {
                o.LJIJI("micButton");
                throw null;
            }
        }
        o.LJIJI("cameraButton");
        throw null;
    }

    public final void LJJJ(C75121Te1 it) {
        String str;
        int LJJIFFI;
        boolean z;
        o.LJIIIZ(it, "it");
        if (LJJIJIL()) {
            User user = this.LLD;
            if (user != null) {
                LinkPlayerInfo LJJIIZI = LJJIIZI(user);
                String str2 = it.LJLILLLLZI;
                if (LJJIIZI != null) {
                    str = LJJIIZI.mInteractIdStr;
                } else {
                    str = null;
                }
                if (o.LJ(str2, str)) {
                    User user2 = this.LJLL;
                    if (user2 != null) {
                        if (C74947TbD.LJIILLIIL(user2)) {
                            LJJIFFI = LJJI(LJJIIZI);
                        } else {
                            LJJIFFI = LJJIFFI(LJJIIZI);
                        }
                        this.LLFZ = LJJIFFI;
                        String str3 = LJJIIZI.mInteractIdStr;
                        Integer valueOf = Integer.valueOf(it.LJLIL);
                        if (str3 == null || (!LJJIJ(str3) && !LJJIJIIJI(valueOf, str3))) {
                            z = false;
                        } else {
                            z = true;
                        }
                        LiveIconView liveIconView = this.LJLLI;
                        if (liveIconView != null) {
                            C74947TbD.LJJIII(liveIconView, this.LLFZ, this.LJLIL, z, false);
                            return;
                        } else {
                            o.LJIJI("micButton");
                            throw null;
                        }
                    }
                    o.LJIJI("me");
                    throw null;
                }
                return;
            }
            o.LJIJI("oTargetUser");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:238:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0483  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r23) {
        /*
            Method dump skipped, instructions count: 1319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75103Tdj.onClick(android.view.View):void");
    }

    public boolean LJJIJIIJI(Integer num, String str) {
        int LIZIZ;
        if (str == null) {
            return false;
        }
        if (num != null) {
            LIZIZ = num.intValue();
        } else {
            MultiGuestDataHolder multiGuestDataHolder = this.oMultiGuestDataHolder;
            if (multiGuestDataHolder != null) {
                LIZIZ = multiGuestDataHolder.LIZIZ(str);
            } else {
                o.LJIJI("oMultiGuestDataHolder");
                throw null;
            }
        }
        if (LIZIZ != 4 && LIZIZ != 3) {
            return false;
        }
        return true;
    }

    public final void LJJJIL(String str, DialogInterface dialogInterface) {
        C28733BPl.LJIILIIL().LJIIIIZZ(this.LLIFFJFJJ, C113554cx.LJJLIIIIJ(new OSZ("action", "zoom"), new OSZ("step", "entrance")));
        ZoomService zoomService = this.oZoomService;
        if (zoomService != null) {
            zoomService.LJ(str, new C75097Tdd(this, dialogInterface), false, true, EnumC74929Tav.FROM_MULTI_GUEST_GIFT_LEAF);
        }
        this.LJLJLLL.run();
    }

    @Override // X.AbstractC32579CqV
    public final OSZ<View, C018905p> LJIJJLI(Context context, ViewGroup parent, LayoutInflater layoutInflater) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), this.LLIIIILZ, parent, false);
        View findViewById = LLLLIILL.findViewById(R.id.dke);
        o.LJIIIIZZ(findViewById, "it.findViewById(R.id.follow_icon)");
        this.LJLLILLLL = (C47061t0) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.atm);
        o.LJIIIIZZ(findViewById2, "it.findViewById(R.id.bt_gift_mic)");
        this.LJLLI = (LiveIconView) findViewById2;
        View findViewById3 = LLLLIILL.findViewById(R.id.lbj);
        o.LJIIIIZZ(findViewById3, "it.findViewById(R.id.to_user_name)");
        this.LJLLLL = (C47121t6) findViewById3;
        View findViewById4 = LLLLIILL.findViewById(R.id.my0);
        o.LJIIIIZZ(findViewById4, "it.findViewById(R.id.user_avatar)");
        this.LJZ = (CX5) findViewById4;
        View findViewById5 = LLLLIILL.findViewById(R.id.atn);
        o.LJIIIIZZ(findViewById5, "it.findViewById(R.id.bt_gift_setting)");
        this.LJLLLLLL = (LiveIconView) findViewById5;
        View findViewById6 = LLLLIILL.findViewById(R.id.atl);
        o.LJIIIIZZ(findViewById6, "it.findViewById(R.id.bt_gift_kickout)");
        this.LJLZ = (LiveIconView) findViewById6;
        View findViewById7 = LLLLIILL.findViewById(R.id.atj);
        o.LJIIIIZZ(findViewById7, "it.findViewById(R.id.bt_gift_camera)");
        this.LJLLJ = (LiveIconView) findViewById7;
        View findViewById8 = LLLLIILL.findViewById(R.id.ato);
        o.LJIIIIZZ(findViewById8, "it.findViewById(R.id.bt_gift_zoom)");
        this.LJLLL = (LiveIconView) findViewById8;
        this.LJZL = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        this.LJZI = new C73318Sq2();
        C47061t0 c47061t0 = this.LJLLILLLL;
        if (c47061t0 != null) {
            C81705W4v LIZJ = W5I.LIZJ();
            LIZJ.LJII(C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), "ttlive_rank_follow_anim.webp"));
            LIZJ.LJII = new IDdS478S0100000_13(this, 3);
            c47061t0.setController(LIZJ.LIZ());
            this.LLFF = g0.LJIILL(context);
            return new OSZ<>(LLLLIILL, null);
        }
        o.LJIJI("followView");
        throw null;
    }

    public C75103Tdj(Context context, C73893SzJ c73893SzJ, int i, DataChannel dataChannel, ARunnableS41S0100000_5 aRunnableS41S0100000_5) {
        super(context, i);
        this.LJLJL = c73893SzJ;
        this.LJLJLJ = dataChannel;
        this.LJLJLLL = aRunnableS41S0100000_5;
        this.LLFFF = new C73318Sq2();
        this.LLFII = 1;
        this.LLFZ = 1;
        this.LLIFFJFJJ = "Zoom/MultiGuestGiftLeaf";
        this.LLII = new TR1(this);
        this.LLIIII = new TX0(this);
        C75559Tl5.LIZIZ.LJ(this);
        this.LLIIIILZ = R.layout.dka;
    }
}
