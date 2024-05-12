package X;

import Y.ARunnableS0S1200500_13;
import Y.ARunnableS49S0100000_13;
import Y.AfS1S0400200_13;
import Y.AfS65S0100000_13;
import Y.IDaS222S0100000_13;
import Y.IDaS8S1100000_13;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupResult;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.LinkMicApi;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestLeakOptSetting;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import defpackage.b1;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.GroupChannelUser;
import tikcast.linkmic.common.GroupPlayer;
import tikcast.linkmic.controller.LeaveJoinGroupReq;

/* renamed from: X.U7t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76685U7t extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C76684U7s LJLIL;
    public final /* synthetic */ Long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ U7T LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ InterfaceC76768UAy<LeaveGroupResult> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76685U7t(C76684U7s c76684U7s, Long l, long j, U7T u7t, boolean z, InterfaceC76768UAy interfaceC76768UAy) {
        super(0);
        this.LJLIL = c76684U7s;
        this.LJLILLLLZI = l;
        this.LJLJI = j;
        this.LJLJJI = u7t;
        this.LJLJJL = z;
        this.LJLJJLL = interfaceC76768UAy;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        StringBuilder LIZJ = b1.LIZJ("leave group", " dealing data=");
        LIZJ.append(this.LJLIL);
        LIZJ.append(" leaveGroupChannelId=");
        LIZJ.append(this.LJLILLLLZI);
        LIZJ.append(" stayGroupChannelId=");
        LIZJ.append(this.LJLJI);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZJ));
        Long l = this.LJLILLLLZI;
        if (l == null && (l = this.LJLJJI.LJIIJJI.LJJIJIIJI()) == null) {
            UC7.LJ("leave group", " but currentLeaveChannel is empty. ", "Linker");
            if (!this.LJLJJL) {
                if (this.LJLIL.LIZIZ == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() && this.LJLJI == 0) {
                    String str = "kick_out_if_no_first_frame_came";
                    if (!o.LJ(this.LJLIL.LJ, "kick_out_if_no_first_frame_came")) {
                        str = "leave_normally";
                    }
                    this.LJLJJI.LJJIIZ(this.LJLIL.LJ, str, true, null, C61878OQg.INSTANCE);
                }
                C15610jN.LIZ().post(new ARunnableS49S0100000_13(this.LJLJJLL, 163));
            }
        } else {
            Player player = new Player(0L, 0L, 3, null);
            C76684U7s c76684U7s = this.LJLIL;
            player.roomId = c76684U7s.LIZ;
            player.uid = c76684U7s.LIZIZ;
            GroupPlayer groupPlayer = new GroupPlayer();
            groupPlayer.channelId = this.LJLIL.LIZJ;
            groupPlayer.user = player;
            LeaveJoinGroupReq leaveJoinGroupReq = new LeaveJoinGroupReq();
            U7T u7t = this.LJLJJI;
            C76684U7s c76684U7s2 = this.LJLIL;
            long j = this.LJLJI;
            leaveJoinGroupReq.common = U7T.LJJIJIL(u7t, c76684U7s2.LJ, 2);
            leaveJoinGroupReq.myself = u7t.LJJIL();
            leaveJoinGroupReq.leaver = groupPlayer;
            leaveJoinGroupReq.groupChannelId = l.longValue();
            leaveJoinGroupReq.curGroupChannelId = j;
            leaveJoinGroupReq.cohostReqExtra = c76684U7s2.LIZLLL;
            long LIZIZ = C31012CFc.LIZIZ();
            String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
            if (!this.LJLJJL) {
                this.LJLJJI.LJJLIIIJJIZ.add(LIZ);
            }
            java.util.Map<Long, ? extends List<GroupChannelUser>> groupChannelMap = this.LJLJJI.LJIIJJI.LJ;
            U7T linker = this.LJLJJI;
            long j2 = this.LJLIL.LIZIZ;
            long longValue = l.longValue();
            long j3 = this.LJLJI;
            long currentTimeMillis = System.currentTimeMillis();
            String leaveReason = this.LJLIL.LJ;
            o.LJIIIZ(linker, "linker");
            o.LJIIIZ(groupChannelMap, "groupChannelMap");
            o.LJIIIZ(leaveReason, "leaveReason");
            UC0.LJJLIIIIJ(new ARunnableS0S1200500_13(j2, longValue, LIZIZ, currentTimeMillis, j3, linker, leaveReason, groupChannelMap, 1));
            U7T u7t2 = this.LJLJJI;
            CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t2.LJII;
            C76684U7s c76684U7s3 = this.LJLIL;
            Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                List<InterfaceC76688U7w> LLIIZ = it.next().LLIIZ(u7t2);
                if (LLIIZ != null) {
                    for (InterfaceC76688U7w interfaceC76688U7w : LLIIZ) {
                        if (interfaceC76688U7w != null) {
                            interfaceC76688U7w.LJIILLIIL(c76684U7s3);
                        }
                    }
                }
            }
            U7T u7t3 = this.LJLJJI;
            C73470SsU LJIJJ = C76857UEj.LJI(((LinkMicApi) Q7L.LIZIZ(LinkMicApi.class)).leaveJoinGroup(leaveJoinGroupReq), "leave group").LJIILIIL(new AfS1S0400200_13(this.LJLJI, this.LJLJJI, LIZIZ, this.LJLIL, l, groupChannelMap, 0)).LJIIJ(new AfS1S0400200_13(this.LJLJI, this.LJLJJI, LIZIZ, this.LJLIL, l, groupChannelMap, 1)).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ()));
            ConcurrentHashSet<String> concurrentHashSet = this.LJLJJI.LJJLIIIJJIZ;
            u7t3.getClass();
            C73444Ss4 LIZLLL = new C73653SvR(U7T.LJJIFFI(LJIJJ, concurrentHashSet, LIZ).LJIIJJI(new C76674U7i(this.LJLIL, l, this.LJLJI, this.LJLJJI, this.LJLILLLLZI, this.LJLJJLL)).LJIIIIZZ(new AfS65S0100000_13(this.LJLJJLL, 160)).LJII(new IDaS222S0100000_13(this.LJLIL, 8))).LJIIIIZZ().LIZLLL(new IDaS8S1100000_13(this.LJLJJI, LIZ, 5));
            U7T u7t4 = this.LJLJJI;
            C73543Stf LJIIJ = LIZLLL.LJIIJ(new AfS65S0100000_13(u7t4, 152), new IDaS222S0100000_13(u7t4, 11));
            U7T u7t5 = this.LJLJJI;
            if (!LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
                C73318Sq2 compositeDisposable = u7t5.LJIILL;
                o.LJIIIZ(compositeDisposable, "compositeDisposable");
                compositeDisposable.LIZ(LJIIJ);
            }
            u7t3.LJJJLZIJ = LJIIJ;
        }
        return C76800UCe.LIZ;
    }
}
