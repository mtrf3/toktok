package Y;

import X.B83;
import X.C276516r;
import X.C29374Bfu;
import X.C29401Dk;
import X.C31012CFc;
import X.C75516TkO;
import X.C75951TrP;
import X.C75952TrQ;
import X.InterfaceC64592gB;
import X.InterfaceC76622U5i;
import X.InterfaceC76688U7w;
import X.J7I;
import X.OSZ;
import X.U7T;
import X.U7W;
import X.UA9;
import X.UC0;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes14.dex */
public class AfS0S0210100_13 implements InterfaceC64592gB {
    public final int $t;
    public long j3;
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

    public static final void accept$0(AfS0S0210100_13 afS0S0210100_13, Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        if ((th instanceof C29401Dk) && ((C276516r) th).getErrorCode() == 10004) {
            C75516TkO c75516TkO = C75516TkO.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            U7T u7t = (U7T) afS0S0210100_13.l0;
            linkedHashMap.put("mChannelId", String.valueOf(u7t.LJI));
            linkedHashMap.put("mSelfLinkMicId", String.valueOf(u7t.LJJI));
            linkedHashMap.put("mRoomId", String.valueOf(u7t.LJIL));
            linkedHashMap.put("mUserId", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
            c75516TkO.LIZ(202, "permit 10004", linkedHashMap);
        }
        String str2 = ((U7T) afS0S0210100_13.l0).LJJI;
        long j = ((C75952TrQ) afS0S0210100_13.l1).LJLILLLLZI;
        long LIZIZ = C31012CFc.LIZIZ();
        OSZ LJIILL = UC0.LJIILL(th);
        String LJIJ = UC0.LJIJ(th);
        C75952TrQ c75952TrQ = (C75952TrQ) afS0S0210100_13.l1;
        String str3 = c75952TrQ.LJLJJLL;
        UA9.LJJIJL(c75952TrQ.LJLJJI, j, afS0S0210100_13.j3, LIZIZ, (U7T) afS0S0210100_13.l0, str2, null, LJIJ, str3, LJIILL);
        U7T u7t2 = (U7T) afS0S0210100_13.l0;
        U7W u7w = u7t2.LJJIII;
        long LIZIZ2 = C31012CFc.LIZIZ() - afS0S0210100_13.j3;
        String LJIJ2 = UC0.LJIJ(th);
        if (LJIJ2 == null) {
            LJIJ2 = "";
        }
        int LJIILJJIL = UC0.LJIILJJIL(th);
        if (((C75952TrQ) afS0S0210100_13.l1).LJLJJI == 1) {
            str = "agree";
        } else {
            str = "reject";
        }
        J7I.LJIIIZ(u7w, u7t2, "reply_invite", LIZIZ2, LJIJ2, LJIILJJIL, new OSZ("reply_status", str), false, null, 192);
        U7T u7t3 = (U7T) afS0S0210100_13.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t3.LJII;
        boolean z = afS0S0210100_13.z2;
        C75952TrQ c75952TrQ2 = (C75952TrQ) afS0S0210100_13.l1;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            List<InterfaceC76688U7w> LLIIZ = it.next().LLIIZ(u7t3);
            if (LLIIZ != null) {
                for (InterfaceC76688U7w interfaceC76688U7w : LLIIZ) {
                    if (z) {
                        if (interfaceC76688U7w != null) {
                            interfaceC76688U7w.LJJ(c75952TrQ2, th);
                        }
                    } else if (interfaceC76688U7w != null) {
                        interfaceC76688U7w.LJIJI(c75952TrQ2, th);
                    }
                }
            }
        }
    }

    public static final void accept$1(AfS0S0210100_13 afS0S0210100_13, Object obj) {
        String str;
        String str2;
        Throwable th = (Throwable) obj;
        if ((th instanceof C29401Dk) && ((C276516r) th).getErrorCode() == 10004) {
            C75516TkO c75516TkO = C75516TkO.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            U7T u7t = (U7T) afS0S0210100_13.l0;
            linkedHashMap.put("mChannelId", String.valueOf(u7t.LJI));
            linkedHashMap.put("mSelfLinkMicId", String.valueOf(u7t.LJJI));
            linkedHashMap.put("mRoomId", String.valueOf(u7t.LJIL));
            linkedHashMap.put("mUserId", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
            c75516TkO.LIZ(202, "permit 10004", linkedHashMap);
        }
        String str3 = ((U7T) afS0S0210100_13.l0).LJJI;
        long j = ((C75951TrP) afS0S0210100_13.l1).LJLILLLLZI;
        long LIZIZ = C31012CFc.LIZIZ();
        OSZ LJIILL = UC0.LJIILL(th);
        String LJIJ = UC0.LJIJ(th);
        C75951TrP c75951TrP = (C75951TrP) afS0S0210100_13.l1;
        String str4 = c75951TrP.LJLJJLL;
        UA9.LJJIIZI(c75951TrP.LJLJJI, j, afS0S0210100_13.j3, LIZIZ, (U7T) afS0S0210100_13.l0, str3, null, LJIJ, str4, LJIILL);
        U7T u7t2 = (U7T) afS0S0210100_13.l0;
        U7W u7w = u7t2.LJJIII;
        long LIZIZ2 = C31012CFc.LIZIZ() - afS0S0210100_13.j3;
        String LJIJ2 = UC0.LJIJ(th);
        if (LJIJ2 == null) {
            LJIJ2 = "";
        }
        int LJIILJJIL = UC0.LJIILJJIL(th);
        if (((C75951TrP) afS0S0210100_13.l1).LJLJJI == 1) {
            str = "agree";
        } else {
            str = "reject";
        }
        OSZ osz = new OSZ("permit_status", str);
        LinkUser LJIJI = ((U7T) afS0S0210100_13.l0).LJIIJJI.LJIJI(((C75951TrP) afS0S0210100_13.l1).LJLILLLLZI);
        if (LJIJI != null) {
            str2 = LJIJI.getLinkMicId();
        } else {
            str2 = null;
        }
        J7I.LJIIIZ(u7w, u7t2, "permit_apply", LIZIZ2, LJIJ2, LJIILJJIL, osz, false, str2, 64);
        U7T u7t3 = (U7T) afS0S0210100_13.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t3.LJII;
        boolean z = afS0S0210100_13.z2;
        C75951TrP c75951TrP2 = (C75951TrP) afS0S0210100_13.l1;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            List<InterfaceC76688U7w> LLIIZ = it.next().LLIIZ(u7t3);
            if (LLIIZ != null) {
                for (InterfaceC76688U7w interfaceC76688U7w : LLIIZ) {
                    if (z) {
                        if (interfaceC76688U7w != null) {
                            interfaceC76688U7w.LIZ(c75951TrP2, th);
                        }
                    } else if (interfaceC76688U7w != null) {
                        interfaceC76688U7w.LJJI(c75951TrP2, th);
                    }
                }
            }
        }
    }

    public AfS0S0210100_13(Object obj, Object obj2, long j, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.j3 = j;
        this.z2 = z;
    }
}
