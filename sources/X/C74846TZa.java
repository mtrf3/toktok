package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.MultiGuestModeratorInviteGuestEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestModeratorKickOutGuestEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestModeratorPermitGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.ModeratorKickOutGuestByWindowEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.managedialog.MultiGuestAsGuestModeratorManageDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.moderator.ModeratorBusinessUserManager;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.ResetRedDotNumEvent;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizPermitParams;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.HashSet;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TZa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74846TZa extends BY9<TRW> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLL;
    public final Room LJLIL;
    public final DataChannel LJLILLLLZI;
    public final LifecycleOwner LJLJI;
    public final HashSet<String> LJLJJI;
    public final HashSet<String> LJLJJL;
    public final C73318Sq2 LJLJJLL;
    public MultiGuestAsGuestModeratorManageDialog LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C31657Cbd LJLJLLL;
    public final C31657Cbd LJLL;
    public final C62822Ol8 LJLLI;
    public final TRX LJLLILLLL;
    public final TR7 LJLLJ;

    static {
        TBT tbt = new TBT(C74846TZa.class, "userManager", "getUserManager()Lcom/bytedance/android/live/liveinteract/multiguestv3/service/usermanage/common/IModeratorUserManager;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C74846TZa.class, "multiGuestDataHolder", "getMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0, c65351Pkp)};
    }

    public final InterfaceC74853TZh LJJJJI() {
        return (InterfaceC74853TZh) this.LJLJLLL.LIZ(this, LJLLL[0]);
    }

    @Override // X.BY9
    public final void detachView() {
        C31811Ce7.LIZLLL("MultiGuestAsGuestModeratorPresenter", "detachView");
        super.detachView();
        this.LJLILLLLZI.pv0(ResetRedDotNumEvent.class);
        TZY tzy = (TZY) this.LJLLI.getValue();
        InterfaceC74853TZh interfaceC74853TZh = tzy.LJLILLLLZI;
        if (interfaceC74853TZh != null) {
            interfaceC74853TZh.LIZLLL(tzy);
        }
        DataChannel dataChannel = tzy.LJLIL;
        dataChannel.getClass();
        dataChannel.jv0(tzy);
        C8E.LJ().X3(this.LJLLJ);
        InterfaceC74853TZh LJJJJI = LJJJJI();
        if (LJJJJI != null) {
            LJJJJI.LIZLLL(this.LJLLILLLL);
        }
        InterfaceC74853TZh LJJJJI2 = LJJJJI();
        if (LJJJJI2 != null) {
            LJJJJI2.release();
        }
        this.LJLJJI.clear();
        this.LJLJJL.clear();
        this.LJLJJLL.LIZLLL();
    }

    @Override // X.BY9
    /* renamed from: LJJJJ, reason: merged with bridge method [inline-methods] */
    public final void attachView(TRW trw) {
        C31811Ce7.LIZLLL("MultiGuestAsGuestModeratorPresenter", "attachView");
        super.attachView(trw);
        TZY tzy = (TZY) this.LJLLI.getValue();
        InterfaceC74853TZh interfaceC74853TZh = tzy.LJLILLLLZI;
        if (interfaceC74853TZh != null) {
            interfaceC74853TZh.LJ(tzy);
        }
        tzy.LJLIL.mv0(ResetRedDotNumEvent.class, tzy, new AqS179S0100000_13(tzy, 533));
        C8E.LJ().e3(this.LJLLJ);
        DataChannel dataChannel = this.LJLILLLLZI;
        dataChannel.lv0(this.LJLJI, MultiGuestModeratorInviteGuestEvent.class, new AqS179S0100000_13(this, 442));
        dataChannel.lv0(this.LJLJI, MultiGuestModeratorKickOutGuestEvent.class, new AqS179S0100000_13(this, 443));
        dataChannel.lv0(this.LJLJI, MultiGuestModeratorPermitGuestEvent.class, new AqS179S0100000_13(this, 444));
        dataChannel.lv0(this.LJLJI, ModeratorKickOutGuestByWindowEvent.class, new AqS179S0100000_13(this, 445));
    }

    public C74846TZa(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(room, "room");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = room;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = new HashSet<>();
        this.LJLJJL = new HashSet<>();
        this.LJLJJLL = new C73318Sq2();
        this.LJLJLJ = C221108m2.LIZIZ(C74850TZe.LJLIL);
        this.LJLJLLL = new C31657Cbd("MULTI_GUEST_V3_MODERATOR_USER_MANAGER");
        this.LJLL = new C31657Cbd("MULTI_GUEST_DATA_HOLDER");
        this.LJLLI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 392));
        TRX trx = new TRX(this);
        this.LJLLILLLL = trx;
        this.LJLLJ = new TR7(this);
        C75559Tl5.LIZIZ.LJI(new ModeratorBusinessUserManager(room, C78886Uxe.LJJJLIIL(C8E.LJ()), (IMessageManager) dataChannel.kv0(C29927Bop.class), lifecycleOwner), "MULTI_GUEST_V3_MODERATOR_USER_MANAGER");
        InterfaceC74853TZh LJJJJI = LJJJJI();
        if (LJJJJI != null) {
            LJJJJI.LJII(0);
            LJJJJI.LJ(trx);
            LJJJJI.init();
        }
    }

    public final void LJJJJIZL(long j, String str, String str2) {
        AbstractC74727TUl LIZ;
        LinkPlayerInfo linkPlayerInfo;
        long j2;
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("kickOut, userId=");
        LIZ2.append(j);
        LIZ2.append(", source=");
        LIZ2.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        LJIILIIL.getClass();
        C0NE.LIZ("MultiGuestAsGuestModeratorPresenter", LIZIZ);
        if (this.mView == 0 || this.LJLJJL.contains(str)) {
            return;
        }
        this.LJLJJL.add(str);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("roomId:");
        LIZ3.append(this.LJLIL.getId());
        LIZ3.append("; userId:");
        LIZ3.append(j);
        LIZ3.append("; secUserId:");
        LIZ3.append(str);
        TYQ.LIZLLL("moderator kickOut", X1D.LIZIZ(LIZ3));
        InterfaceC74853TZh LJJJJI = LJJJJI();
        if (LJJJJI != null && (LIZ = LJJJJI.LIZ()) != null && (linkPlayerInfo = (LinkPlayerInfo) LIZ.LJIIL(j)) != null) {
            User user = linkPlayerInfo.mUser;
            if (user != null) {
                j2 = user.getFollowInfo().getFollowStatus();
            } else {
                j2 = -1;
            }
            C29556Biq.LIZ().getClass();
            C74830TYk.LIZIZ(j, j2, C74983Tbn.LIZJ());
            InterfaceC75441TjB R6 = C8E.LJ().R6();
            if (R6 != null) {
                long id = this.LJLIL.getId();
                String str3 = linkPlayerInfo.mInteractIdStr;
                o.LJIIIIZZ(str3, "it.interactId");
                R6.LJZ(new C75186Tf4(5, id, j, str3), new C74848TZc(this, str, linkPlayerInfo, j));
            }
        }
    }

    public final void LJJJJJ(int i, long j, String str) {
        int i2;
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("permit, userId=");
        LIZ.append(j);
        LIZ.append(", interactId=");
        LIZ.append(str);
        LIZ.append(", linkMicPermitStatus=");
        LIZ.append(i);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LJIILIIL.getClass();
        C0NE.LIZ("MultiGuestAsGuestModeratorPresenter", LIZIZ);
        this.LJLJJI.add(str);
        if (i != 1) {
            if (i != 2) {
                i2 = 0;
            } else {
                i2 = 2;
            }
        } else {
            i2 = 1;
        }
        BizPermitParams bizPermitParams = new BizPermitParams(1800L);
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null) {
            R6.LJLIIIL(new C75993Ts5(this.LJLIL.getId(), j, null, str, i2, bizPermitParams, 64), new TZZ(this, str, i, j));
        }
    }
}
