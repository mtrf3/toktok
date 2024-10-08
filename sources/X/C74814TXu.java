package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPayPlan;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyParams;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.g0;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS55S0110000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TXu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74814TXu extends AbstractC74908Taa {
    public final MultiGuestV3GuestPresenter LJLILLLLZI;
    public final Room LJLJI;
    public final boolean LJLJJI;
    public final List<? extends LinkPayPlan> LJLJJL;
    public final int LJLJJLL;
    public final DataChannel LJLJL;
    public LiveEffect LJLLI;
    public boolean LJLLILLLL;
    public int LJLJLJ = 1;
    public int LJLJLLL = 2;
    public String LJLL = "";
    public final C73318Sq2 LJLLJ = new C73318Sq2();
    public final MultiGuestDataHolder LJLLL = (MultiGuestDataHolder) C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_DATA_HOLDER");
    public final Keva LJLLLL = Keva.getRepo("live-app-core-sdk");

    @Override // X.V8Q
    public final void LIZJ() {
        this.LJLIL = null;
        InterfaceC74802TXi LIZIZ = C74800TXg.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.clear();
        }
        this.LJLLJ.LIZLLL();
    }

    @Override // X.AbstractC74908Taa
    public final void LJIIJ() {
        int i;
        if (this.LJLJI != null) {
            MultiGuestDataHolder multiGuestDataHolder = this.LJLLL;
            if (multiGuestDataHolder != null) {
                i = multiGuestDataHolder.LJ("reply");
            } else {
                i = 2;
            }
            this.LJLJLJ = i;
            C74740TUy.LIZLLL().LJ = this.LJLJLLL;
            C74740TUy.LIZLLL().LJFF = this.LJLLI;
            C74740TUy.LIZLLL().LJIIIIZZ = this.LJLL;
            MultiGuestDataHolder multiGuestDataHolder2 = this.LJLLL;
            if (multiGuestDataHolder2 != null) {
                multiGuestDataHolder2.LJJJJI = "invite";
            }
            C75017TcL.LJIILJJIL("in_liveroom");
            this.LJLLILLLL = true;
            BizReplyParams bizReplyParams = new BizReplyParams(this.LJLJLJ, 0, 2, null);
            Room room = this.LJLJI;
            if (room != null) {
                C75911Tql c75911Tql = new C75911Tql(room.getId(), room.getOwnerUserId(), 1, bizReplyParams, 16);
                InterfaceC75441TjB R6 = C8E.LJ().R6();
                if (R6 != null) {
                    R6.LJJLIIIJL(c75911Tql, new C74819TXz(this));
                }
            }
        }
    }

    public final void LJIIZILJ() {
        LiveDialogFragment dialog;
        TY2 ty2;
        LiveDialogFragment dialog2;
        TY2 ty22 = (TY2) ((InterfaceC29082BbC) this.LJLIL);
        if (ty22 != null && (dialog = ty22.getDialog()) != null && dialog.isShowing() && (ty2 = (TY2) ((InterfaceC29082BbC) this.LJLIL)) != null && (dialog2 = ty2.getDialog()) != null) {
            dialog2.dismiss();
        }
    }

    public final void LJIJ() {
        Boolean bool;
        int i;
        long j;
        User owner;
        User owner2;
        FollowPair followPair = new FollowPair();
        Room room = this.LJLJI;
        if (room != null && (owner2 = room.getOwner()) != null) {
            bool = Boolean.valueOf(owner2.isFollower);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            i = 2;
        } else {
            i = 1;
        }
        followPair.followStatus = i;
        Room room2 = this.LJLJI;
        if (room2 != null && (owner = room2.getOwner()) != null) {
            j = owner.getId();
        } else {
            j = 0;
        }
        followPair.LIZ = j;
        followPair.LIZJ = followPair.followStatus;
        B83.LIZ().LIZIZ().LJFF(followPair);
    }

    @Override // X.AbstractC74908Taa
    public final ImageModel LJI() {
        return B83.LIZ().LIZIZ().getCurrentUser().getAvatarThumb();
    }

    @Override // X.AbstractC74908Taa
    public final C73318Sq2 LJ() {
        return this.LJLLJ;
    }

    @Override // X.AbstractC74908Taa
    public final String LJFF() {
        return this.LJLL;
    }

    @Override // X.AbstractC74908Taa
    public final int LJII() {
        return this.LJLJLJ;
    }

    @Override // X.AbstractC74908Taa
    public final boolean LJIIIIZZ() {
        return this.LJLJJI;
    }

    @Override // X.V8Q
    public final void LIZ(InterfaceC29082BbC interfaceC29082BbC) {
        this.LJLIL = interfaceC29082BbC;
        this.LJLJLLL = this.LJLLLL.getInt("live_interact_beauty_level", 2);
    }

    @Override // X.AbstractC74908Taa
    public final void LIZLLL(TWR twr) {
        int i;
        Fragment fragment;
        Activity mo49getActivity;
        if (this.LJLLILLLL) {
            return;
        }
        this.LJLLILLLL = true;
        C74740TUy LIZLLL = C74740TUy.LIZLLL();
        if (this.LJLJJI) {
            List<? extends LinkPayPlan> list = this.LJLJJL;
            o.LJI(list);
            int i2 = ((LinkPayPlan) ListProtector.get(list, 0)).duration;
            LIZLLL.LJIIIZ = true;
            LIZLLL.LJIIJ = i2;
        } else {
            LIZLLL.LJIIIZ = false;
            LIZLLL.LJIIJ = 0;
        }
        MultiGuestDataHolder multiGuestDataHolder = this.LJLLL;
        int i3 = 2;
        if (multiGuestDataHolder != null) {
            i = multiGuestDataHolder.LJ("apply");
        } else {
            i = 2;
        }
        this.LJLJLJ = i;
        MultiGuestDataHolder multiGuestDataHolder2 = this.LJLLL;
        if (multiGuestDataHolder2 != null) {
            i3 = multiGuestDataHolder2.LJJIJLIJ;
        }
        C29556Biq.LIZ().getClass();
        if (!C74983Tbn.LJIIL(twr)) {
            TY2 ty2 = (TY2) ((InterfaceC29082BbC) this.LJLIL);
            Context context = null;
            if (ty2 != null) {
                context = ty2.getContext();
            }
            C29556Biq.LIZ().getClass();
            if (C74983Tbn.LJIIL(twr)) {
                mo49getActivity = g0.LJIILJJIL(context);
                if (mo49getActivity == null) {
                    mo49getActivity = C8E.LIZ().getTopActivity();
                }
            } else {
                Object obj = (InterfaceC29082BbC) this.LJLIL;
                if (!(obj instanceof LiveBaseFragment) || (fragment = (Fragment) obj) == null) {
                    return;
                } else {
                    mo49getActivity = fragment.mo49getActivity();
                }
            }
            if (mo49getActivity != null) {
                C29556Biq.LIZ().getClass();
                if (C74983Tbn.LJIIL(twr)) {
                    C74824TYe.LJIIIZ = "connection_button";
                } else {
                    C74824TYe.LJIIIZ = "application_pannel";
                }
                C74769TWb.LIZ(true, this.LJLJL, 0, mo49getActivity, Long.valueOf(i3), new AqS144S0200000_13(this, twr, 64), new AqS163S0100000_13(this, 466));
                return;
            }
            return;
        }
        LJIJI(twr);
    }

    @Override // X.AbstractC74908Taa
    public final void LJIIL(int i) {
        this.LJLJLLL = i;
        this.LJLLLL.storeInt("live_interact_beauty_level", i);
    }

    @Override // X.AbstractC74908Taa
    public final void LJIILIIL(LiveEffect liveEffect) {
        this.LJLLI = liveEffect;
    }

    @Override // X.AbstractC74908Taa
    public final void LJIILL(String str) {
        String str2;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.LJLL = str2;
        C74740TUy LIZLLL = C74740TUy.LIZLLL();
        if (str == null) {
            str = "";
        }
        LIZLLL.LJIIIIZZ = str;
    }

    @Override // X.AbstractC74908Taa
    public final void LJIILLIIL(int i) {
        this.LJLJLJ = i;
    }

    public final void LJIJI(TWR twr) {
        Long l;
        Long l2;
        String str;
        int i;
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("roomId:");
        Room room = this.LJLJI;
        Boolean bool = null;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        LIZ.append(l);
        LIZ.append("; ownerUid:");
        Room room2 = this.LJLJI;
        if (room2 != null) {
            l2 = Long.valueOf(room2.getOwnerUserId());
        } else {
            l2 = null;
        }
        LIZ.append(l2);
        LIZ.append("; type:");
        LIZ.append(this.LJLJLJ);
        TYQ.LIZLLL("LinkIn_Guest_Apply", X1D.LIZIZ(LIZ));
        int LIZ2 = C74800TXg.LIZ();
        Room room3 = this.LJLJI;
        if (room3 != null) {
            long ownerUserId = room3.getOwnerUserId();
            long j = this.LJLJLJ;
            if (twr != null) {
                bool = Boolean.valueOf(twr.LIZLLL);
            }
            BizApplyParams bizApplyParams = new BizApplyParams(j, ownerUserId, LIZ2, C29306Beo.LJJIFFI(bool));
            C75023TcR.LIZLLL.LIZJ("key_sendApplyRequest");
            if (LIZ2 == 0) {
                C75017TcL.LJIILJJIL("in_liveroom");
            }
            C74824TYe.LJIILJJIL = Long.valueOf(System.currentTimeMillis());
            InterfaceC75441TjB R6 = C8E.LJ().R6();
            if (R6 != null) {
                if (twr != null && (num = twr.LIZ) != null) {
                    i = num.intValue();
                } else {
                    i = -1;
                }
                R6.LJLJLJ(new C76179Tv5(0L, 0L, i, 0L, bizApplyParams, null, 67), new C74808TXo(this, twr));
            }
            HashMap hashMap = new HashMap();
            Room room4 = this.LJLJI;
            if (room4 != null) {
                if (room4.getStreamType() == LiveMode.AUDIO) {
                    str = "radio";
                } else {
                    str = "video";
                }
                hashMap.put("room_type", str);
            }
            hashMap.put("audience_connection_type", "voice");
            BZI LIZ3 = C28787BRn.LIZ("audience_connection_apply");
            LIZ3.LJJIFFI(hashMap);
            LIZ3.LJIIJJI("live_detail");
            LIZ3.LJIIIZ("live");
            LIZ3.LJIIL("click");
            LIZ3.LJIIZILJ();
            LIZ3.LJJIIJZLJL();
        }
    }

    @Override // X.AbstractC74908Taa
    public final void LJIIJJI(boolean z, boolean z2) {
        int i;
        Fragment fragment;
        ActivityC45651qj mo49getActivity;
        MultiGuestDataHolder multiGuestDataHolder = this.LJLLL;
        int i2 = 2;
        if (multiGuestDataHolder != null) {
            i = multiGuestDataHolder.LJ("apply");
        } else {
            i = 2;
        }
        this.LJLJLJ = i;
        MultiGuestDataHolder multiGuestDataHolder2 = this.LJLLL;
        if (multiGuestDataHolder2 != null) {
            i2 = multiGuestDataHolder2.LJJIJLIJ;
        }
        if (!z) {
            Object obj = (InterfaceC29082BbC) this.LJLIL;
            if ((obj instanceof MultiGuestUserInfoFragment) && (fragment = (Fragment) obj) != null && (mo49getActivity = fragment.mo49getActivity()) != null) {
                C74769TWb.LIZIZ(true, 0, mo49getActivity, Long.valueOf(i2), new AqS55S0110000_13(this, z2, 1), new AqS163S0100000_13(this, 467));
                return;
            }
            return;
        }
        C75078TdK.LIZ(1, z2, this.LJLJI, this.LJLLJ, new TY1(this, z2));
    }

    public C74814TXu(MultiGuestV3GuestPresenter multiGuestV3GuestPresenter, Room room, boolean z, List list, int i, DataChannel dataChannel) {
        this.LJLILLLLZI = multiGuestV3GuestPresenter;
        this.LJLJI = room;
        this.LJLJJI = z;
        this.LJLJJL = list;
        this.LJLJJLL = i;
        this.LJLJL = dataChannel;
    }
}
