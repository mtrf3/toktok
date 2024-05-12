package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AqS120S0300000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3JS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3JS {
    public final C81983Jq LIZ;
    public volatile long LIZIZ;
    public volatile boolean LIZJ;
    public final java.util.Map<String, C3L4> LIZLLL;
    public final int LJ;
    public final C3JY LJFF;
    public volatile boolean LJI;
    public volatile boolean LJII;
    public volatile boolean LJIIIIZZ;
    public volatile int LJIIIZ;

    public C3JS() {
        throw null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sessionMap:");
        LIZ.append(this.LIZLLL.size());
        LIZ.append(" cursor:");
        LIZ.append(this.LIZIZ);
        LIZ.append(" hasMore:");
        LIZ.append(this.LIZJ);
        LIZ.append(" paginationSize:");
        LIZ.append(this.LJ);
        LIZ.append(" isLoading:");
        LIZ.append(this.LJI);
        LIZ.append(" isRefreshing:");
        LIZ.append(this.LJII);
        LIZ.append(" loadMoreInfo:");
        LIZ.append(this.LJFF);
        return X1D.LIZIZ(LIZ);
    }

    public C3JS(C81983Jq sessionPage) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = C3JT.LIZ.paginationCount;
        C3JY c3jy = new C3JY(sessionPage);
        o.LJIIIZ(sessionPage, "sessionPage");
        this.LIZ = sessionPage;
        this.LIZIZ = Long.MAX_VALUE;
        this.LIZJ = true;
        this.LIZLLL = linkedHashMap;
        this.LJ = i;
        this.LJFF = c3jy;
        this.LJI = false;
        this.LJII = false;
        this.LJIIIIZZ = false;
        this.LJIIIZ = 0;
    }

    public static OSZ LIZ(C63120Opw c63120Opw) {
        C109544Rq lastShowMessage;
        if (c63120Opw.isSingleChat()) {
            long LIZLLL = C81273Gx.LIZLLL(c63120Opw.getConversationId());
            return new OSZ(String.valueOf(LIZLLL), C79004UzY.LJIIL(c63120Opw, String.valueOf(LIZLLL)));
        }
        if (!c63120Opw.isGroupChat() || (lastShowMessage = c63120Opw.getLastShowMessage()) == null) {
            return null;
        }
        return new OSZ(String.valueOf(lastShowMessage.getSender()), lastShowMessage.getSecSender());
    }

    public final void LIZIZ(C81913Jj result, InterfaceC81623Ig onFilterResult, C3JS c3js) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(onFilterResult, "onFilterResult");
        long currentTimeMillis = System.currentTimeMillis();
        this.LIZIZ = result.LJLJJI;
        this.LIZJ = result.LJLJI;
        ArrayList arrayList = new ArrayList();
        for (C63120Opw c63120Opw : result.LJLILLLLZI) {
            if (this.LIZ.LJ.invoke(c63120Opw).booleanValue()) {
                arrayList.add(c63120Opw);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("toConversationList size : ");
        LIZ.append(arrayList.size());
        C81843Jc.LIZIZ("SessionRefactor-SessionListDataSource", X1D.LIZIZ(LIZ));
        int i = 0;
        if (c3js != null) {
            C81843Jc.LIZLLL(c3js.LIZ).LIZJ("get session from other tab");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("before using cache: ");
            LIZ2.append(this.LIZLLL.size());
            C81843Jc.LIZIZ("SessionRefactor-SessionListDataSource", X1D.LIZIZ(LIZ2));
            for (C3L4 c3l4 : c3js.LIZLLL.values()) {
                if (this.LIZ.LIZLLL.invoke(c3l4).booleanValue() && !this.LIZLLL.containsKey(c3l4.LJFF())) {
                    java.util.Map<String, C3L4> map = this.LIZLLL;
                    String LJFF = c3l4.LJFF();
                    o.LJIIIIZZ(LJFF, "session.sessionID");
                    map.put(LJFF, c3l4);
                    i++;
                }
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("after using cache: ");
            LIZ3.append(this.LIZLLL.size());
            C81843Jc.LIZIZ("SessionRefactor-SessionListDataSource", X1D.LIZIZ(LIZ3));
            C81843Jc.LIZLLL(c3js.LIZ).LIZ("get session from other tab");
            if (this.LIZIZ > c3js.LIZIZ) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("update the cursor to :");
                LIZ4.append(c3js.LIZIZ);
                C81843Jc.LIZIZ("SessionRefactor-SessionListDataSource", X1D.LIZIZ(LIZ4));
                this.LIZIZ = c3js.LIZIZ;
                this.LIZJ = c3js.LIZJ;
                return;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i2 = this.LJ;
        AqS120S0300000_1 aqS120S0300000_1 = new AqS120S0300000_1((List) arrayList2, (List<C63120Opw>) this, (C3JS) linkedHashSet, (java.util.Set<String>) 4);
        int i3 = C3KQ.LIZ().batchConvertSize;
        if (i3 <= 0 || arrayList.size() <= i2) {
            aqS120S0300000_1.invoke(Boolean.FALSE, arrayList);
        } else {
            ORZ.LJLJI(arrayList, i3, new AqS167S0100000_1(aqS120S0300000_1, 402));
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("onQueryResult cursor: ");
        LIZ5.append(this.LIZIZ);
        C81843Jc.LIZIZ("SessionRefactor-SessionListDataSource", X1D.LIZIZ(LIZ5));
        long currentTimeMillis2 = System.currentTimeMillis();
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append(this.LIZ);
        LIZ6.append(" filterResultListSize : ");
        LIZ6.append(arrayList2.size());
        LIZ6.append("  acceptCacheSize: ");
        LIZ6.append(i);
        C81843Jc.LIZJ("SessionRefactor-SessionListDataSource", X1D.LIZIZ(LIZ6));
        this.LJFF.N(arrayList2.size() + i, currentTimeMillis2 - currentTimeMillis);
        ((C4WE) onFilterResult).LIZ(arrayList2);
    }
}
