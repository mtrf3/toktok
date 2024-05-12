package Y;

import X.B83;
import X.C29374Bfu;
import X.C31012CFc;
import X.C75951TrP;
import X.C75952TrQ;
import X.InterfaceC64592gB;
import X.InterfaceC76622U5i;
import X.InterfaceC76688U7w;
import X.J7I;
import X.OSZ;
import X.U7T;
import X.U7W;
import X.U85;
import X.UA9;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.controller.PermitJoinGroupResp;

/* loaded from: classes14.dex */
public class AfS0S0210200_13 implements InterfaceC64592gB {
    public final int $t;
    public long j3;
    public long j4;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS0S0210200_13 afS0S0210200_13, Object obj) {
        String str;
        BaseResponse baseResponse = (BaseResponse) obj;
        String str2 = ((U7T) afS0S0210200_13.l0).LJJI;
        long j = ((C75952TrQ) afS0S0210200_13.l1).LJLILLLLZI;
        String LJJIJL = U7T.LJJIJL(((PermitJoinGroupResp) baseResponse.data).groupUser, j);
        long LIZIZ = C31012CFc.LIZIZ();
        OSZ osz = new OSZ(0L, "");
        String str3 = baseResponse.LIZIZ;
        C75952TrQ c75952TrQ = (C75952TrQ) afS0S0210200_13.l1;
        String str4 = c75952TrQ.LJLJJLL;
        UA9.LJJIJL(c75952TrQ.LJLJJI, j, afS0S0210200_13.j3, LIZIZ, (U7T) afS0S0210200_13.l0, str2, LJJIJL, str3, str4, osz);
        if (((C75952TrQ) afS0S0210200_13.l1).LJLJJI == 1) {
            U7T u7t = (U7T) afS0S0210200_13.l0;
            GroupChannelAllUser groupChannelAllUser = ((PermitJoinGroupResp) baseResponse.data).groupUser;
            long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
            u7t.getClass();
            String LJJIJL2 = U7T.LJJIJL(groupChannelAllUser, currentUserId);
            if (LJJIJL2 != null) {
                U7T u7t2 = (U7T) afS0S0210200_13.l0;
                C75952TrQ c75952TrQ2 = (C75952TrQ) afS0S0210200_13.l1;
                long j2 = afS0S0210200_13.j4;
                GroupChannelAllUser groupChannelAllUser2 = ((PermitJoinGroupResp) baseResponse.data).groupUser;
                long j3 = c75952TrQ2.LJLILLLLZI;
                u7t2.getClass();
                String LJJIJL3 = U7T.LJJIJL(groupChannelAllUser2, j3);
                if (LJJIJL3 != null) {
                    u7t2.LJJIII.LIZIZ(U85.INVITEE, LJJIJL2, LJJIJL3, Long.valueOf(j2));
                }
            }
        }
        U7T u7t3 = (U7T) afS0S0210200_13.l0;
        U7W u7w = u7t3.LJJIII;
        long LIZIZ2 = C31012CFc.LIZIZ() - afS0S0210200_13.j3;
        String str5 = baseResponse.LIZIZ;
        if (str5 == null) {
            str5 = "";
        }
        if (((C75952TrQ) afS0S0210200_13.l1).LJLJJI == 1) {
            str = "agree";
        } else {
            str = "reject";
        }
        J7I.LJIIIZ(u7w, u7t3, "reply_invite", LIZIZ2, str5, 0, new OSZ("reply_status", str), false, null, 192);
        U7T u7t4 = (U7T) afS0S0210200_13.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t4.LJII;
        boolean z = afS0S0210200_13.z2;
        C75952TrQ c75952TrQ3 = (C75952TrQ) afS0S0210200_13.l1;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            List<InterfaceC76688U7w> LLIIZ = it.next().LLIIZ(u7t4);
            if (LLIIZ != null) {
                for (InterfaceC76688U7w interfaceC76688U7w : LLIIZ) {
                    if (z) {
                        if (interfaceC76688U7w != null) {
                            String str6 = baseResponse.LIZIZ;
                            if (str6 == null) {
                                str6 = "";
                            }
                            interfaceC76688U7w.LJIILJJIL(c75952TrQ3, str6);
                        }
                    } else if (interfaceC76688U7w != null) {
                        String str7 = baseResponse.LIZIZ;
                        if (str7 == null) {
                            str7 = "";
                        }
                        interfaceC76688U7w.LJIIJ(c75952TrQ3, str7);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS0S0210200_13 afS0S0210200_13, Object obj) {
        String str;
        String str2;
        BaseResponse baseResponse = (BaseResponse) obj;
        String str3 = ((U7T) afS0S0210200_13.l0).LJJI;
        long j = ((C75951TrP) afS0S0210200_13.l1).LJLILLLLZI;
        String LJJIJL = U7T.LJJIJL(((PermitJoinGroupResp) baseResponse.data).groupUser, j);
        long LIZIZ = C31012CFc.LIZIZ();
        OSZ osz = new OSZ(0L, "");
        String str4 = baseResponse.LIZIZ;
        C75951TrP c75951TrP = (C75951TrP) afS0S0210200_13.l1;
        String str5 = c75951TrP.LJLJJLL;
        UA9.LJJIIZI(c75951TrP.LJLJJI, j, afS0S0210200_13.j3, LIZIZ, (U7T) afS0S0210200_13.l0, str3, LJJIJL, str4, str5, osz);
        if (((C75951TrP) afS0S0210200_13.l1).LJLJJI == 1) {
            U7T u7t = (U7T) afS0S0210200_13.l0;
            GroupChannelAllUser groupChannelAllUser = ((PermitJoinGroupResp) baseResponse.data).groupUser;
            long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
            u7t.getClass();
            String LJJIJL2 = U7T.LJJIJL(groupChannelAllUser, currentUserId);
            if (LJJIJL2 != null) {
                U7T u7t2 = (U7T) afS0S0210200_13.l0;
                C75951TrP c75951TrP2 = (C75951TrP) afS0S0210200_13.l1;
                long j2 = afS0S0210200_13.j4;
                GroupChannelAllUser groupChannelAllUser2 = ((PermitJoinGroupResp) baseResponse.data).groupUser;
                long j3 = c75951TrP2.LJLILLLLZI;
                u7t2.getClass();
                String LJJIJL3 = U7T.LJJIJL(groupChannelAllUser2, j3);
                if (LJJIJL3 != null) {
                    u7t2.LJJIII.LIZIZ(U85.HANDLER, LJJIJL2, LJJIJL3, Long.valueOf(j2));
                }
            }
        }
        U7T u7t3 = (U7T) afS0S0210200_13.l0;
        U7W u7w = u7t3.LJJIII;
        long LIZIZ2 = C31012CFc.LIZIZ() - afS0S0210200_13.j3;
        String str6 = baseResponse.LIZIZ;
        if (str6 == null) {
            str6 = "";
        }
        if (((C75951TrP) afS0S0210200_13.l1).LJLJJI == 1) {
            str = "agree";
        } else {
            str = "reject";
        }
        OSZ osz2 = new OSZ("permit_status", str);
        LinkUser LJIJI = ((U7T) afS0S0210200_13.l0).LJIIJJI.LJIJI(((C75951TrP) afS0S0210200_13.l1).LJLILLLLZI);
        if (LJIJI != null) {
            str2 = LJIJI.getLinkMicId();
        } else {
            str2 = null;
        }
        J7I.LJIIIZ(u7w, u7t3, "permit_apply", LIZIZ2, str6, 0, osz2, false, str2, 64);
        U7T u7t4 = (U7T) afS0S0210200_13.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t4.LJII;
        boolean z = afS0S0210200_13.z2;
        C75951TrP c75951TrP3 = (C75951TrP) afS0S0210200_13.l1;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            List<InterfaceC76688U7w> LLIIZ = it.next().LLIIZ(u7t4);
            if (LLIIZ != null) {
                for (InterfaceC76688U7w interfaceC76688U7w : LLIIZ) {
                    if (z) {
                        if (interfaceC76688U7w != null) {
                            String str7 = baseResponse.LIZIZ;
                            if (str7 == null) {
                                str7 = "";
                            }
                            interfaceC76688U7w.LIZIZ(c75951TrP3, str7);
                        }
                    } else if (interfaceC76688U7w != null) {
                        String str8 = baseResponse.LIZIZ;
                        if (str8 == null) {
                            str8 = "";
                        }
                        interfaceC76688U7w.LJ(c75951TrP3, str8);
                    }
                }
            }
        }
    }

    public AfS0S0210200_13(Object obj, Object obj2, long j, long j2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.j3 = j;
        this.j4 = j2;
        this.z2 = z;
    }
}
