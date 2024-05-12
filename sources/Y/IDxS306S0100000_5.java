package Y;

import X.B75;
import X.BPP;
import X.BZI;
import X.C03880Dg;
import X.C0NB;
import X.C276516r;
import X.C28247B6t;
import X.C28720BOy;
import X.C28787BRn;
import X.C29372Bfs;
import X.C29401Dk;
import X.C29617Bjp;
import X.C29727Blb;
import X.C30868C9o;
import X.C47071t1;
import X.C65300Pk0;
import X.CN1;
import X.DialogC28288B8i;
import X.EnumC29732Blg;
import X.InterfaceC116954iR;
import X.InterfaceC92693kP;
import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.adminsetting.fastfiltercomment.FastFilterCommentFragmentSheet;
import com.bytedance.android.livesdk.api.model.RoomUpdateInfoResult;
import com.bytedance.android.livesdk.dataChannel.RemoveFollowMsgChannel;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDxS306S0100000_5 implements InterfaceC116954iR {
    public final int $t;
    public Object l0;

    public static final void onComplete$0(IDxS306S0100000_5 iDxS306S0100000_5) {
    }

    public static final void onComplete$1(IDxS306S0100000_5 iDxS306S0100000_5) {
    }

    public static final void onComplete$2(IDxS306S0100000_5 iDxS306S0100000_5) {
    }

    public static final void onComplete$4(IDxS306S0100000_5 iDxS306S0100000_5) {
    }

    public static final void onComplete$5(IDxS306S0100000_5 iDxS306S0100000_5) {
    }

    public static final void onSubscribe$2(IDxS306S0100000_5 iDxS306S0100000_5, InterfaceC92693kP interfaceC92693kP) {
    }

    public static final void onSubscribe$3(IDxS306S0100000_5 iDxS306S0100000_5, InterfaceC92693kP interfaceC92693kP) {
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        switch (this.$t) {
            case 0:
                onComplete$0(this);
                return;
            case 1:
                onComplete$1(this);
                return;
            case 2:
                onComplete$2(this);
                return;
            case 3:
                onComplete$3(this);
                return;
            case 4:
                onComplete$4(this);
                return;
            case 5:
                onComplete$5(this);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(th, "e");
                return;
            case 1:
                onError$1(this, th);
                return;
            case 2:
                onError$2(this, th);
                return;
            case 3:
                onError$3(this, th);
                return;
            case 4:
                o.LJIIIZ(th, "e");
                return;
            case 5:
                onError$5(this, th);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        switch (this.$t) {
            case 0:
                onNext$0(this, obj);
                return;
            case 1:
                onNext$1(this, obj);
                return;
            case 2:
                onNext$2(this, obj);
                return;
            case 3:
                onNext$3(this, obj);
                return;
            case 4:
                onNext$4(this, obj);
                return;
            case 5:
                onNext$5(this, obj);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            case 1:
                onSubscribe$1(this, interfaceC92693kP);
                return;
            case 2:
                onSubscribe$2(this, interfaceC92693kP);
                return;
            case 3:
                onSubscribe$3(this, interfaceC92693kP);
                return;
            case 4:
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            case 5:
                onSubscribe$5(this, interfaceC92693kP);
                return;
            default:
                return;
        }
    }

    public static final void onComplete$3(IDxS306S0100000_5 iDxS306S0100000_5) {
        ((C29372Bfs) iDxS306S0100000_5.l0).LIZJ.onComplete();
    }

    public IDxS306S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onError$1(IDxS306S0100000_5 iDxS306S0100000_5, Throwable th) {
        ((C29617Bjp) iDxS306S0100000_5.l0).finishWithFailure(th);
    }

    public static final void onError$2(IDxS306S0100000_5 iDxS306S0100000_5, Throwable th) {
        if (!((LiveRoomUserInfoWidget) iDxS306S0100000_5.l0).isViewValid()) {
            return;
        }
        C29727Blb c29727Blb = ((LiveRoomUserInfoWidget) iDxS306S0100000_5.l0).LLJILJILJ;
        if (c29727Blb != null) {
            c29727Blb.LIZ(EnumC29732Blg.UNFOLLOW);
        }
        BPP.LIZJ(((LiveRoomUserInfoWidget) iDxS306S0100000_5.l0).context, th);
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) iDxS306S0100000_5.l0;
        Context context = liveRoomUserInfoWidget.context;
        if ((th instanceof C29401Dk) && ((C276516r) th).getErrorCode() == 4002173) {
            String oI = ((IHostResource) CN1.LIZ(IHostResource.class)).oI(context);
            C47071t1 c47071t1 = new C47071t1(context);
            c47071t1.LJII(oI);
            c47071t1.LJIIL(R.string.sof, new IDcS170S0100000_5(liveRoomUserInfoWidget, 7));
            c47071t1.LJIIIZ(R.string.osu, new q());
            LiveDialog LIZ = c47071t1.LIZ();
            if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-5130796092727295645")).LIZ) {
                return;
            }
            LIZ.show();
        }
    }

    public static final void onError$3(IDxS306S0100000_5 iDxS306S0100000_5, Throwable th) {
        ((C29372Bfs) iDxS306S0100000_5.l0).LIZJ.onError(th);
    }

    public static final void onError$5(IDxS306S0100000_5 iDxS306S0100000_5, Throwable th) {
        C0NB.LJ("LiveDefaultCoverController", th.toString());
    }

    public static final void onNext$0(IDxS306S0100000_5 iDxS306S0100000_5, Object obj) {
        ((Boolean) obj).booleanValue();
        C30868C9o.LIZJ(R.string.kcn);
        ((FastFilterCommentFragmentSheet) iDxS306S0100000_5.l0).close();
    }

    public static final void onNext$1(IDxS306S0100000_5 iDxS306S0100000_5, Object obj) {
        ((C29617Bjp) iDxS306S0100000_5.l0).finishWithSuccess();
    }

    public static final void onNext$2(IDxS306S0100000_5 iDxS306S0100000_5, Object obj) {
        FollowPair followPair = (FollowPair) obj;
        C29727Blb c29727Blb = ((LiveRoomUserInfoWidget) iDxS306S0100000_5.l0).LLJILJILJ;
        if (c29727Blb != null) {
            boolean z = false;
            c29727Blb.LJIILLIIL(followPair, false);
            LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) iDxS306S0100000_5.l0;
            if (followPair.LIZ() != 0) {
                z = true;
            }
            liveRoomUserInfoWidget.LJLZ(z);
        }
        LiveRoomUserInfoWidget liveRoomUserInfoWidget2 = (LiveRoomUserInfoWidget) iDxS306S0100000_5.l0;
        liveRoomUserInfoWidget2.dataChannel.rv0(RemoveFollowMsgChannel.class, Long.valueOf(liveRoomUserInfoWidget2.LLILIL.getId()));
        ((LiveRoomUserInfoWidget) iDxS306S0100000_5.l0).LLII("follow_icon", null);
    }

    public static final void onNext$3(IDxS306S0100000_5 iDxS306S0100000_5, Object obj) {
        ((C29372Bfs) iDxS306S0100000_5.l0).LIZJ.onNext(obj);
        ((C29372Bfs) iDxS306S0100000_5.l0).LIZJ.onComplete();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onNext$4(IDxS306S0100000_5 iDxS306S0100000_5, Object obj) {
        Long l;
        Long l2;
        BaseResponse t = (BaseResponse) obj;
        o.LJIIIZ(t, "t");
        T t2 = t.data;
        if (t2 != 0 && ((Room) t2).getId() != 0) {
            Room room = (Room) t.data;
            if (room != null) {
                l = Long.valueOf(room.getId());
            } else {
                l = null;
            }
            Room room2 = ((C28247B6t) iDxS306S0100000_5.l0).LIZJ;
            if (room2 != null) {
                l2 = Long.valueOf(room2.getId());
            } else {
                l2 = null;
            }
            if (!o.LJ(l, l2)) {
                C28247B6t c28247B6t = (C28247B6t) iDxS306S0100000_5.l0;
                Room room3 = (Room) t.data;
                c28247B6t.getClass();
                Context LIZ = c28247B6t.LIZ();
                Context LIZ2 = c28247B6t.LIZ();
                Object[] objArr = new Object[1];
                EnterRoomConfig.GuestUser guestUser = c28247B6t.LIZIZ;
                if (guestUser != null) {
                    objArr[0] = guestUser.nickName;
                    String string = LIZ2.getString(R.string.mpf, objArr);
                    String string2 = c28247B6t.LIZ().getString(R.string.mgw);
                    B75 b75 = new B75(c28247B6t, room3);
                    DialogC28288B8i dialogC28288B8i = new DialogC28288B8i(LIZ);
                    dialogC28288B8i.LJLJJLL = b75;
                    dialogC28288B8i.LJLJL = string;
                    dialogC28288B8i.LJLJLJ = string2;
                    if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/chatroom/ui/LiveFollowGuestTipDialog", "show", dialogC28288B8i, new Object[0], "void", new C65300Pk0(false, "()V", "-3691331913611765991")).LIZ) {
                        return;
                    }
                    dialogC28288B8i.show();
                    return;
                }
                o.LJIJI("guestUser");
                throw null;
            }
        }
        Context LIZ3 = ((C28247B6t) iDxS306S0100000_5.l0).LIZ();
        Object[] objArr2 = new Object[1];
        EnterRoomConfig.GuestUser guestUser2 = ((C28247B6t) iDxS306S0100000_5.l0).LIZIZ;
        if (guestUser2 != null) {
            objArr2[0] = guestUser2.nickName;
            C30868C9o.LJI(LIZ3.getString(R.string.mho, objArr2));
        } else {
            o.LJIJI("guestUser");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onNext$5(IDxS306S0100000_5 iDxS306S0100000_5, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        C28720BOy c28720BOy = (C28720BOy) iDxS306S0100000_5.l0;
        c28720BOy.getClass();
        if (baseResponse == null) {
            return;
        }
        try {
            T t = baseResponse.data;
            if (t != 0 && ((RoomUpdateInfoResult) t).data.booleanValue()) {
                if (C0NB.LIZJ()) {
                    C0NB.LIZIZ("LiveDefaultCoverController", "update room cover info");
                }
                BZI LIZ = C28787BRn.LIZ("livesdk_cover_pass_audit");
                LIZ.LJJIFFI(c28720BOy.LIZJ());
                LIZ.LJJIIJZLJL();
                return;
            }
            C0NB.LJ("LiveDefaultCoverController", baseResponse.toString());
        } catch (Exception e) {
            C0NB.LJ("LiveDefaultCoverController", e.toString());
        }
    }

    public static final void onSubscribe$1(IDxS306S0100000_5 iDxS306S0100000_5, InterfaceC92693kP interfaceC92693kP) {
        ((C29617Bjp) iDxS306S0100000_5.l0).LJLIL = interfaceC92693kP;
    }

    public static final void onSubscribe$5(IDxS306S0100000_5 iDxS306S0100000_5, InterfaceC92693kP interfaceC92693kP) {
        ((C28720BOy) iDxS306S0100000_5.l0).LJFF.LIZ(interfaceC92693kP);
    }
}
