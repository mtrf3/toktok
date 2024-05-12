package Y;

import X.C15610jN;
import X.C75951TrP;
import X.C75952TrQ;
import X.C76662U6w;
import X.InterfaceC48038ItG;
import X.InterfaceC76675U7j;
import X.InterfaceC76768UAy;
import X.R2P;
import X.U4R;
import X.U7T;
import X.U7V;
import X.X1D;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import defpackage.b1;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS21S0200100_13;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.GroupChannelUser;
import tikcast.linkmic.controller.PermitJoinGroupReq;
import tikcast.linkmic.controller.PermitJoinGroupResp;

/* loaded from: classes14.dex */
public class IDhS5S0400000_13 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$0(IDhS5S0400000_13 iDhS5S0400000_13, Object obj) {
        List<GroupChannelUser> list;
        R2P permitJoinGroupResp = (R2P) obj;
        o.LJIIIZ(permitJoinGroupResp, "permitJoinGroupResp");
        StringBuilder LIZJ = b1.LIZJ("reply invite group", " success data=");
        LIZJ.append((C75952TrQ) iDhS5S0400000_13.l0);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZJ));
        U7T u7t = (U7T) iDhS5S0400000_13.l1;
        CopyOnWriteArrayList<InterfaceC76675U7j> copyOnWriteArrayList = u7t.LJIIIIZZ;
        PermitJoinGroupReq permitJoinGroupReq = (PermitJoinGroupReq) iDhS5S0400000_13.l2;
        Iterator<InterfaceC76675U7j> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().LIZ(u7t, permitJoinGroupReq.groupChannelId, ((PermitJoinGroupResp) permitJoinGroupResp.data).groupUser, permitJoinGroupResp.extra.now);
        }
        if (((C75952TrQ) iDhS5S0400000_13.l0).LJLJJI == 1) {
            C76662U6w LJJIZ = ((U7T) iDhS5S0400000_13.l1).LJJIZ();
            long j = ((C75952TrQ) iDhS5S0400000_13.l0).LJLILLLLZI;
            List<LinkUser> LJJIJLIJ = ((U7T) iDhS5S0400000_13.l1).LJJIJLIJ(((PermitJoinGroupResp) permitJoinGroupResp.data).groupUser);
            LJJIZ.getClass();
            U7V.LJIILJJIL(new AqS21S0200100_13(LJJIZ, LJJIJLIJ, j, 1));
        }
        if (((C75952TrQ) iDhS5S0400000_13.l0).LJLJJI == 1) {
            if (!((U7T) iDhS5S0400000_13.l1).LJIIIZ.LIZJ && !((U7T) iDhS5S0400000_13.l1).LJIIIZ.LIZ) {
                C15610jN.LIZ().post(new ARunnableS49S0100000_13((U7T) iDhS5S0400000_13.l1, 168));
            } else if (!((U7T) iDhS5S0400000_13.l1).LJIIIZ.LIZLLL) {
                ((U7T) iDhS5S0400000_13.l1).LJIIIZ.LJJL();
            }
            Long LIZLLL = ((U7T) iDhS5S0400000_13.l1).LJIIJJI.LIZLLL(((C75952TrQ) iDhS5S0400000_13.l0).LJLILLLLZI);
            if (LIZLLL != null) {
                U7T u7t2 = (U7T) iDhS5S0400000_13.l1;
                long longValue = LIZLLL.longValue();
                PermitJoinGroupResp permitJoinGroupResp2 = (PermitJoinGroupResp) permitJoinGroupResp.data;
                GroupChannelAllUser groupChannelAllUser = permitJoinGroupResp2.groupUser;
                if (groupChannelAllUser != null && (list = groupChannelAllUser.user) != null) {
                    u7t2.LJJIJ(permitJoinGroupResp2.groupRtcInfo, longValue, list, permitJoinGroupResp.extra.now);
                }
            }
        } else if (((U7T) iDhS5S0400000_13.l1).LJIIJJI.LJJIJIIJI() == null) {
            ((U7T) iDhS5S0400000_13.l1).LJJJJZI("stop_join_channel_advance", "stop_join_channel_advance", true, null);
        }
        return Boolean.valueOf(C15610jN.LIZ().post(new ARunnableS32S0200000_13(permitJoinGroupResp, (InterfaceC76768UAy) iDhS5S0400000_13.l3, 90)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$1(IDhS5S0400000_13 iDhS5S0400000_13, Object obj) {
        List<GroupChannelUser> list;
        long j;
        R2P permitJoinGroupResp = (R2P) obj;
        o.LJIIIZ(permitJoinGroupResp, "permitJoinGroupResp");
        StringBuilder LIZJ = b1.LIZJ("permit apply group", " success data=");
        LIZJ.append((C75951TrP) iDhS5S0400000_13.l0);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZJ));
        U7T u7t = (U7T) iDhS5S0400000_13.l1;
        CopyOnWriteArrayList<InterfaceC76675U7j> copyOnWriteArrayList = u7t.LJIIIIZZ;
        PermitJoinGroupReq permitJoinGroupReq = (PermitJoinGroupReq) iDhS5S0400000_13.l2;
        Iterator<InterfaceC76675U7j> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().LJJJJJL(u7t, permitJoinGroupReq.groupChannelId, ((PermitJoinGroupResp) permitJoinGroupResp.data).groupUser, permitJoinGroupResp.extra.now);
        }
        if (((C75951TrP) iDhS5S0400000_13.l0).LJLJJI == 1) {
            C76662U6w LJJIZ = ((U7T) iDhS5S0400000_13.l1).LJJIZ();
            List<LinkUser> LJJIJLIJ = ((U7T) iDhS5S0400000_13.l1).LJJIJLIJ(((PermitJoinGroupResp) permitJoinGroupResp.data).groupUser);
            LJJIZ.getClass();
            U7V.LJIILJJIL(new AqS160S0200000_13(LJJIZ, (C76662U6w) LJJIJLIJ, (List<LinkUser>) 57));
        }
        if (((C75951TrP) iDhS5S0400000_13.l0).LJLJJI == 1) {
            if (!((U7T) iDhS5S0400000_13.l1).LJIIIZ.LIZ && !((U7T) iDhS5S0400000_13.l1).LJIIIZ.LIZJ) {
                C15610jN.LIZ().post(new ARunnableS49S0100000_13((U7T) iDhS5S0400000_13.l1, 170));
            } else if (!((U7T) iDhS5S0400000_13.l1).LJIIIZ.LIZLLL) {
                ((U7T) iDhS5S0400000_13.l1).LJIIIZ.LJJL();
            }
            GroupChannelAllUser groupChannelAllUser = ((PermitJoinGroupResp) permitJoinGroupResp.data).groupUser;
            if (groupChannelAllUser != null && (list = groupChannelAllUser.user) != null) {
                U7T u7t2 = (U7T) iDhS5S0400000_13.l1;
                Long LIZLLL = u7t2.LJIIJJI.LIZLLL(((C75951TrP) iDhS5S0400000_13.l0).LJLILLLLZI);
                if (LIZLLL != null) {
                    j = LIZLLL.longValue();
                } else {
                    j = 0;
                }
                u7t2.LJJIJ(((PermitJoinGroupResp) permitJoinGroupResp.data).groupRtcInfo, j, list, permitJoinGroupResp.extra.now);
            }
        } else if (((U7T) iDhS5S0400000_13.l1).LJIIJJI.LJJIJIIJI() == null) {
            ((U7T) iDhS5S0400000_13.l1).LJJJJZI("stop_join_channel_advance", "stop_join_channel_advance", true, null);
        }
        return Boolean.valueOf(C15610jN.LIZ().post(new ARunnableS32S0200000_13(permitJoinGroupResp, (InterfaceC76768UAy) iDhS5S0400000_13.l3, 95)));
    }

    public IDhS5S0400000_13(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
