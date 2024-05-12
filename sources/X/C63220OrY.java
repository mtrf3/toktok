package X;

import Y.IDComparatorS38S0000000_10;
import Y.IDbS169S0200000_10;
import Y.IDbS399S0100000_10;
import Y.IDcS134S0200000_10;
import Y.IDcS14S1100000_10;
import Y.IDcS407S0100000_10;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3RequestBody;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.OrY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C63220OrY implements InterfaceC63226Ore, InterfaceC63256Os8 {
    public static final IDComparatorS38S0000000_10 LJZL = new IDComparatorS38S0000000_10(4);
    public static final IDComparatorS38S0000000_10 LL = new IDComparatorS38S0000000_10(5);
    public final String LJLIL;
    public InterfaceC63226Ore LJLJJI;
    public final boolean LJLJJL;
    public final boolean LJLJLJ;
    public final boolean LJLLI;
    public C63237Orp LJLLILLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public final C63228Org LJZI;
    public C115954gp LJLILLLLZI = new C115954gp();
    public int LJLJI = 50;
    public final Object LJLJJLL = new Object();
    public final java.util.Set<InterfaceC63226Ore> LJLJL = new HashSet();
    public boolean LJLJLLL = true;
    public final AtomicBoolean LJLL = new AtomicBoolean(false);
    public java.util.Map<Long, C63148OqO> LJLLJ = new HashMap();
    public long LJLLL = 0;
    public long LJLZ = -1;
    public boolean LJZ = false;

    @Override // X.InterfaceC63226Ore
    public void K7(int i, String str, List list) {
        throw null;
    }

    @Override // X.InterfaceC63256Os8
    public final void LIZ() {
    }

    public void LJII() {
        throw null;
    }

    public void LJIILLIIL() {
        throw null;
    }

    public final List<InterfaceC63226Ore> LIZIZ() {
        ArrayList arrayList;
        synchronized (this.LJLJJLL) {
            arrayList = new ArrayList(this.LJLJL);
        }
        return arrayList;
    }

    public final List<C109544Rq> LIZJ() {
        return new ArrayList(this.LJLILLLLZI);
    }

    public final void LJIIJJI() {
        C63322OtC.LJFF("MessageModel loadOlderMessageList");
        C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(this.LJLIL);
        if (LJIIIZ == null) {
            M1(null, false);
            return;
        }
        if (this.LJLL.get()) {
            C63322OtC.LJFF("MessageModel loadOlderMessageList querying now");
            M1(null, false);
        } else if (C115944go.LIZJ().LIZLLL(this.LJLIL)) {
            C63322OtC.LJFF("MessageModel loadOlderMessageList checking now");
            this.LJLLLL = true;
            M1(null, false);
        } else if (this.LJLL.compareAndSet(false, true)) {
            RunnableC63345OtZ.LJ(new C63184Oqy(this, new ArrayList(this.LJLILLLLZI), LJIIIZ), new IDbS399S0100000_10(this, 5), true);
        }
    }

    public final void LJIIZILJ() {
        if (this.LJLJLLL) {
            return;
        }
        if (C115944go.LIZJ().LIZLLL(this.LJLIL)) {
            C63322OtC.LIZLLL("MessageModel requestNewerMessage checking now");
        } else {
            RunnableC63345OtZ.LJ(new IDcS134S0200000_10(this, new ArrayList(this.LJLILLLLZI), 6), new IDbS399S0100000_10(this, 4), false);
        }
    }

    public final void LJIJI() {
        int[] iArr;
        if (C63308Osy.LJI().LIZLLL != null) {
            C115954gp c115954gp = this.LJLILLLLZI;
            if (c115954gp == null || c115954gp.isEmpty()) {
                iArr = new int[]{0, 0};
            } else {
                ArrayList arrayList = new ArrayList(c115954gp);
                Collections.sort(arrayList, LJZL);
                Iterator it = arrayList.iterator();
                long j = 0;
                int i = 0;
                while (it.hasNext()) {
                    C109544Rq c109544Rq = (C109544Rq) it.next();
                    if (j > c109544Rq.getIndex()) {
                        i++;
                    }
                    j = c109544Rq.getIndex();
                }
                iArr = new int[]{arrayList.size(), i};
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("receive_no", iArr[0]);
                jSONObject.put("disordered_no", iArr[1]);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            C63310Ot0.LIZJ(jSONObject, "sdk_enter_chat", false);
            C115064fO c115064fO = new C115064fO();
            c115064fO.LIZ = "message_data_source";
            c115064fO.LIZIZ = "wrong_order";
            c115064fO.LIZJ.put("total_count", Integer.valueOf(iArr[0]));
            c115064fO.LIZJ.put("count", Integer.valueOf(iArr[1]));
            c115064fO.LIZ();
        }
    }

    public static final long LJFF(List<C109544Rq> list) {
        if (list.isEmpty()) {
            return 0L;
        }
        C63291Osh.LIZ().getClass();
        long LIZIZ = C63291Osh.LIZIZ();
        Iterator<C109544Rq> it = list.iterator();
        long j = Long.MIN_VALUE;
        while (it.hasNext()) {
            long indexInConversationV2 = it.next().getIndexInConversationV2();
            if (indexInConversationV2 >= LIZIZ) {
                j = Math.max(indexInConversationV2, j);
            }
        }
        if (j == Long.MIN_VALUE) {
            return 0L;
        }
        return j;
    }

    public static final long LJI(List<C109544Rq> list) {
        if (list.isEmpty()) {
            return 0L;
        }
        C63291Osh.LIZ().getClass();
        long LIZIZ = C63291Osh.LIZIZ();
        Iterator<C109544Rq> it = list.iterator();
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            long indexInConversationV2 = it.next().getIndexInConversationV2();
            if (indexInConversationV2 >= LIZIZ) {
                j = Math.min(indexInConversationV2, j);
            }
        }
        if (j == Long.MAX_VALUE) {
            return 0L;
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63220OrY.LJIIIZ(java.lang.String):boolean");
    }

    public final void LJIILJJIL(String str) {
        if (TextUtils.equals(this.LJLIL, str)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MessageModel onLeakRepairEnd, mRequestLoadOlder:");
            LIZ.append(this.LJLLLL);
            LIZ.append(", mRequestLoadNewer");
            LIZ.append(this.LJLLLLLL);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            if (this.LJLLLL) {
                this.LJLLLL = false;
                LJIIJJI();
                return;
            }
            if (!this.LJLLLLLL) {
                return;
            }
            this.LJLLLLLL = false;
            C63322OtC.LJFF("MessageModel loadNewerMessageList");
            if (this.LJLJLLL) {
                v0(null, true);
                return;
            }
            if (this.LJLILLLLZI.isEmpty()) {
                v0(null, false);
                LJII();
            } else if (C115944go.LIZJ().LIZLLL(this.LJLIL)) {
                C63322OtC.LJFF("MessageModel loadNewerMessageList checking now");
                this.LJLLLLLL = true;
                v0(null, false);
            } else if (this.LJLL.compareAndSet(false, true)) {
                RunnableC63345OtZ.LJ(new IDcS134S0200000_10(this, new ArrayList(this.LJLILLLLZI), 8), new IDbS399S0100000_10(this, 8), true);
            } else {
                C63322OtC.LJFF("MessageModel loadNewerMessageList querying now");
                v0(null, false);
            }
        }
    }

    @Override // X.InterfaceC63226Ore
    public final void T1(C109544Rq c109544Rq) {
        if (c109544Rq == null) {
            return;
        }
        if (this.LJLJJL) {
            ArrayList arrayList = (ArrayList) LIZIZ();
            if (arrayList.isEmpty()) {
                return;
            }
            C63308Osy.LJI().LIZLLL().getClass();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC63226Ore) it.next()).T1(c109544Rq);
            }
            return;
        }
        if (this.LJLJJI != null) {
            C47922IrO.LIZ();
            this.LJLJJI.T1(c109544Rq);
        }
    }

    @Override // X.InterfaceC63226Ore
    public final void y(C109544Rq c109544Rq) {
        if (this.LJLILLLLZI.remove(c109544Rq)) {
            if (this.LJLJJL) {
                Iterator it = ((ArrayList) LIZIZ()).iterator();
                while (it.hasNext()) {
                    ((InterfaceC63226Ore) it.next()).y(c109544Rq);
                }
            } else {
                InterfaceC63226Ore interfaceC63226Ore = this.LJLJJI;
                if (interfaceC63226Ore != null) {
                    interfaceC63226Ore.y(c109544Rq);
                }
            }
        }
    }

    public C63220OrY(String str, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageModel constructor, conversationId:");
        LIZ.append(str);
        LIZ.append(", unreadLiveControl:");
        LIZ.append(true);
        LIZ.append(", enableMsgRead:");
        LIZ.append(z);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        this.LJLIL = str;
        this.LJLJLJ = true;
        this.LJLLI = z;
        if (z) {
            C63322OtC.LJFF("MessageModel enter conversation request minIndex");
            LJIJ(str, null, null);
            this.LJLLILLLL = new C63237Orp((C63222Ora) this);
        }
        C47922IrO.LIZ();
        this.LJZI = new C63228Org(str);
        this.LJLJJL = C63308Osy.LJI().LIZLLL().LJLLLLLL;
    }

    public final void LIZLLL(InterfaceC86963bA interfaceC86963bA, C109544Rq c109544Rq) {
        C63322OtC.LJFF("read_receiptgetReadAndAllByLocal");
        RunnableC63345OtZ.LIZLLL(new IDcS134S0200000_10(this, c109544Rq, 9), new C63232Ork(interfaceC86963bA, c109544Rq, this), C63346Ota.LIZ());
    }

    public final Pair<List<Long>, List<Long>> LJ(C109544Rq c109544Rq, java.util.Map<Long, C63148OqO> map) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (c109544Rq != null && !TextUtils.isEmpty(c109544Rq.getConversationId()) && c109544Rq.getConversationId().equals(this.LJLIL) && map != null && !map.isEmpty()) {
            for (Map.Entry<Long, C63148OqO> entry : map.entrySet()) {
                if (entry != null && entry.getValue() != null && entry.getValue().LJLILLLLZI != C63308Osy.LJI().LIZIZ().getUid() && Math.abs(entry.getValue().LJLJI) <= c109544Rq.getIndex()) {
                    arrayList2.add(Long.valueOf(entry.getValue().LJLILLLLZI));
                    if (!c109544Rq.isIndexLocal() && (entry.getValue().LJLJJL >= c109544Rq.getOrderIndex() || (entry.getValue().LJLJJI >= c109544Rq.getIndex() && entry.getValue().LJLJJL <= -1))) {
                        arrayList.add(Long.valueOf(entry.getValue().LJLILLLLZI));
                    }
                }
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public final List LJIIJ(int i, List list) {
        C109544Rq c109544Rq;
        if (this.LJLILLLLZI.isEmpty()) {
            c109544Rq = null;
        } else {
            c109544Rq = this.LJLILLLLZI.get(0);
        }
        C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(this.LJLIL);
        if (c109544Rq == null || LJIIIZ == null || LJIIIZ.getLastShowMessage() == null || c109544Rq.getIndex() >= LJIIIZ.getLastShowMessage().getIndex()) {
            return Collections.emptyList();
        }
        String str = this.LJLIL;
        long index = c109544Rq.getIndex();
        C115944go LIZJ = C115944go.LIZJ();
        String str2 = this.LJLIL;
        LJFF(list);
        LIZJ.getClass();
        C115944go.LIZ(str2);
        List LJJI = C63150OqQ.LJJI(str, index, i, null);
        C63356Otk LJIIIZ2 = C63356Otk.LJIIIZ();
        int inboxType = LJIIIZ.getInboxType();
        EnumC63359Otn enumC63359Otn = EnumC63359Otn.MSG_SHOW;
        LJIIIZ2.getClass();
        C63356Otk.LIZLLL(LJJI, inboxType, enumC63359Otn);
        return LJJI;
    }

    public final void LJIIL(int i, C109544Rq c109544Rq) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageModel onAddMessageInner, mUptoNewest:");
        LIZ.append(this.LJLJLLL);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (!this.LJLJLLL) {
            return;
        }
        if (c109544Rq != null && i == AbstractC63551Owt.LIZ) {
            this.LJLILLLLZI.add(c109544Rq);
            if (this.LJLILLLLZI.size() > 3000) {
                this.LJLILLLLZI = new C115954gp(this.LJLILLLLZI.subList(0, 3000));
            }
        }
        if (this.LJLJJL) {
            Iterator it = ((ArrayList) LIZIZ()).iterator();
            while (it.hasNext()) {
                ((InterfaceC63226Ore) it.next()).u7(i, c109544Rq);
            }
        } else {
            InterfaceC63226Ore interfaceC63226Ore = this.LJLJJI;
            if (interfaceC63226Ore != null) {
                interfaceC63226Ore.u7(i, c109544Rq);
            }
        }
    }

    @Override // X.InterfaceC63226Ore
    public final void M1(List<C109544Rq> list, boolean z) {
        if (list != null && !list.isEmpty()) {
            this.LJLILLLLZI.appendList(list);
        }
        if (this.LJLJJL) {
            Iterator it = ((ArrayList) LIZIZ()).iterator();
            while (it.hasNext()) {
                ((InterfaceC63226Ore) it.next()).M1(list, z);
            }
        } else {
            InterfaceC63226Ore interfaceC63226Ore = this.LJLJJI;
            if (interfaceC63226Ore != null) {
                interfaceC63226Ore.M1(list, z);
            }
        }
        C63228Org c63228Org = this.LJZI;
        List<C109544Rq> LIZJ = LIZJ();
        c63228Org.getClass();
        c63228Org.LIZLLL = LIZJ;
    }

    @Override // X.InterfaceC63226Ore
    public final void ea(C109544Rq c109544Rq, boolean z) {
        if (!this.LJLJLLL) {
            return;
        }
        if (this.LJLJJL) {
            Iterator it = ((ArrayList) LIZIZ()).iterator();
            while (it.hasNext()) {
                ((InterfaceC63226Ore) it.next()).ea(c109544Rq, z);
            }
        } else {
            InterfaceC63226Ore interfaceC63226Ore = this.LJLJJI;
            if (interfaceC63226Ore != null) {
                interfaceC63226Ore.ea(c109544Rq, z);
            }
        }
    }

    @Override // X.InterfaceC63226Ore
    public final void u7(int i, C109544Rq c109544Rq) {
        if (c109544Rq.getLocalCache(-1) != null || this.LJLJLLL) {
            LJIIL(i, c109544Rq);
        } else {
            LJIIIIZZ(this.LJLJI, new C63245Orx(this, i, c109544Rq), "MessageModel.onAddMessage");
        }
    }

    @Override // X.InterfaceC63226Ore
    public final void v0(List<C109544Rq> list, boolean z) {
        if (this.LJLJJL) {
            Iterator it = ((ArrayList) LIZIZ()).iterator();
            while (it.hasNext()) {
                ((InterfaceC63226Ore) it.next()).v0(list, z);
            }
        } else {
            InterfaceC63226Ore interfaceC63226Ore = this.LJLJJI;
            if (interfaceC63226Ore != null) {
                interfaceC63226Ore.v0(list, z);
            }
        }
        C63228Org c63228Org = this.LJZI;
        List<C109544Rq> LIZJ = LIZJ();
        c63228Org.getClass();
        c63228Org.LIZLLL = LIZJ;
    }

    @Override // X.InterfaceC63226Ore
    public final void y5(int i, C63219OrX c63219OrX) {
        if (this.LJLJJL) {
            Iterator it = ((ArrayList) LIZIZ()).iterator();
            while (it.hasNext()) {
                ((InterfaceC63226Ore) it.next()).y5(i, c63219OrX);
            }
        } else {
            InterfaceC63226Ore interfaceC63226Ore = this.LJLJJI;
            if (interfaceC63226Ore != null) {
                interfaceC63226Ore.y5(i, c63219OrX);
            }
        }
    }

    public static void LJIJJ(String str, java.util.Map<String, String> map, InterfaceC86963bA<C109544Rq> interfaceC86963bA) {
        C63322OtC.LJFF("MessageModel  updateMessageLocalExtOnly");
        RunnableC63345OtZ.LIZLLL(new IDcS14S1100000_10(map, str, 1), new IDbS399S0100000_10(interfaceC86963bA, 6), C63346Ota.LIZJ());
    }

    public void LJIIIIZZ(int i, InterfaceC86963bA interfaceC86963bA, String str) {
        C63322OtC.LJFF("MessageModel initMessageList");
        if (this.LJLL.compareAndSet(false, true)) {
            this.LJLZ = SystemClock.uptimeMillis();
            RunnableC63345OtZ.LJ(new C63165Oqf(this, i), new C63185Oqz(this, i, str, interfaceC86963bA), true);
            return;
        }
        C63322OtC.LJFF("MessageModel initMessageList mLocalDBQuerying, return");
        if (interfaceC86963bA != null) {
            C63623Oy3 c63623Oy3 = C63623Oy3.LIZIZ().LIZ;
            c63623Oy3.LIZ = -10;
            interfaceC86963bA.LIZIZ(c63623Oy3);
        }
    }

    public final void LJIILIIL(List<C109544Rq> list, int i, C107074Id c107074Id) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageModel onGetMessage, list:");
        C109544Rq c109544Rq = null;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", msgSource:");
        LIZ.append(i);
        LIZ.append(", mUptoNewest:");
        LIZ.append(this.LJLJLLL);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (!this.LJLJLLL) {
            return;
        }
        Iterator<C109544Rq> it = this.LJLILLLLZI.iterator();
        long j = 0;
        while (it.hasNext()) {
            C109544Rq next = it.next();
            if (next != null) {
                j = Math.max(j, next.getIndexInConversationV2());
            }
        }
        if (!this.LJLILLLLZI.isEmpty()) {
            c109544Rq = this.LJLILLLLZI.get(0);
        }
        RunnableC63345OtZ.LIZLLL(new C63188Or2(this, j, c109544Rq, list), new C63224Orc(this, i, c107074Id), C63346Ota.LIZ());
    }

    public final void LJIILL(int i, C109544Rq c109544Rq, C63540Owi c63540Owi) {
        if (!this.LJLJLLL) {
            return;
        }
        if (c109544Rq != null && i == AbstractC63551Owt.LIZ) {
            this.LJLILLLLZI.add(c109544Rq);
            if (this.LJLILLLLZI.size() > 3000) {
                this.LJLILLLLZI = new C115954gp(this.LJLILLLLZI.subList(0, 3000));
            }
        }
        if (this.LJLJJL) {
            Iterator it = ((ArrayList) LIZIZ()).iterator();
            while (it.hasNext()) {
                ((InterfaceC63226Ore) it.next()).m4(i, c109544Rq, c63540Owi);
            }
        } else {
            InterfaceC63226Ore interfaceC63226Ore = this.LJLJJI;
            if (interfaceC63226Ore != null) {
                interfaceC63226Ore.m4(i, c109544Rq, c63540Owi);
            }
        }
    }

    public final void LJIJ(String str, C109544Rq c109544Rq, InterfaceC86963bA<Pair<List<Long>, List<Long>>> interfaceC86963bA) {
        C115284fk LJIILIIL = C115284fk.LJIILIIL();
        C63229Orh c63229Orh = new C63229Orh(this, str, interfaceC86963bA, c109544Rq);
        LJIILIIL.getClass();
        C63356Otk.LJIIIZ().getClass();
        C63238Orq c63238Orq = new C63238Orq(c63229Orh);
        C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(str);
        if (LJIIIZ == null || LJIIIZ.isLocal()) {
            c63238Orq.LIZIZ(C63622Oy2.LIZJ(-1017));
            return;
        }
        C63482Ovm c63482Ovm = new C63482Ovm();
        c63482Ovm.LIZLLL = Long.valueOf(LJIIIZ.getConversationShortId());
        c63482Ovm.LJ = Integer.valueOf(LJIIIZ.getConversationType());
        c63482Ovm.LJFF = LJIIIZ.getConversationId();
        GetConversationParticipantsMinIndexV3RequestBody build = c63482Ovm.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJJJJZI = build;
        c63238Orq.LJIIJJI(LJIIIZ.getInboxType(), c89453Z8v.build(), null, LJIIIZ);
    }

    @Override // X.InterfaceC63226Ore
    public final void X8(java.util.Map map, int i, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (i == 7) {
            this.LJLILLLLZI.addList(list);
            RunnableC63345OtZ.LIZLLL(new IDcS407S0100000_10(this.LJLILLLLZI, 5), new IDbS399S0100000_10(new C63231Orj(this, list, map, i), 9), C63346Ota.LIZ());
            return;
        }
        this.LJLILLLLZI.updateList(list);
        if (this.LJLJJL) {
            Iterator it = ((ArrayList) LIZIZ()).iterator();
            while (it.hasNext()) {
                ((InterfaceC63226Ore) it.next()).X8(map, i, list);
            }
        } else {
            InterfaceC63226Ore interfaceC63226Ore = this.LJLJJI;
            if (interfaceC63226Ore == null) {
                return;
            }
            interfaceC63226Ore.X8(map, i, list);
        }
    }

    @Override // X.InterfaceC63226Ore
    public final void m4(int i, C109544Rq c109544Rq, C63540Owi c63540Owi) {
        StringBuilder LJ = C7MY.LJ("MessageModel onSendMessage statusCode=", i, " message id=");
        LJ.append(c109544Rq.getMsgId());
        C63322OtC.LJFF(X1D.LIZIZ(LJ));
        if (!this.LJLJLLL) {
            LJIIIIZZ(this.LJLJI, new C63241Ort(this, i, c109544Rq, c63540Owi), "MessageModel.onSendMessage");
        } else {
            LJIILL(i, c109544Rq, c63540Owi);
        }
        C63228Org c63228Org = this.LJZI;
        List<C109544Rq> LIZJ = LIZJ();
        c63228Org.getClass();
        c63228Org.LIZLLL = LIZJ;
    }

    @Override // X.InterfaceC63226Ore
    public final void x6(List<C109544Rq> list, int i, C107074Id c107074Id) {
        if (!this.LJLJLLL) {
            C63242Oru c63242Oru = new C63242Oru(this, list, i, c107074Id);
            C63322OtC.LJFF("MessageModel loadNewerMessageListToEnd");
            if (!this.LJLJLLL) {
                if (this.LJLILLLLZI.isEmpty()) {
                    LJII();
                } else if (C115944go.LIZJ().LIZLLL(this.LJLIL)) {
                    C63322OtC.LJFF("MessageModel loadNewerMessageListToEnd checking now");
                    this.LJLLLLLL = true;
                } else if (this.LJLL.compareAndSet(false, true)) {
                    RunnableC63345OtZ.LJ(new IDcS134S0200000_10(this, new ArrayList(this.LJLILLLLZI), 10), new IDbS169S0200000_10(this, c63242Oru, 0), true);
                } else {
                    C63322OtC.LJFF("MessageModel loadNewerMessageListToEnd querying now");
                    C63623Oy3 c63623Oy3 = new C63375Ou3().LIZ;
                    c63623Oy3.LIZ = -10;
                    c63242Oru.LIZIZ(c63623Oy3);
                }
            }
        } else {
            LJIILIIL(list, i, c107074Id);
        }
        C63228Org c63228Org = this.LJZI;
        List<C109544Rq> LIZJ = LIZJ();
        c63228Org.getClass();
        c63228Org.LIZLLL = LIZJ;
    }

    @Override // X.InterfaceC63226Ore
    public final void v6(C109544Rq c109544Rq, java.util.Map<String, List<C32H>> map, java.util.Map<String, List<C32H>> map2, Long l, Long l2) {
        if (this.LJLJJL) {
            Iterator it = ((ArrayList) LIZIZ()).iterator();
            while (it.hasNext()) {
                ((InterfaceC63226Ore) it.next()).v6(c109544Rq, map, map2, l, l2);
            }
        } else {
            InterfaceC63226Ore interfaceC63226Ore = this.LJLJJI;
            if (interfaceC63226Ore != null) {
                interfaceC63226Ore.v6(c109544Rq, map, map2, l, l2);
            }
        }
    }
}
