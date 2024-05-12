package X;

import android.content.Context;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.SearchUserLinearLayoutManager;
import defpackage.q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.JiZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49923JiZ {
    public final SearchResultParam LIZ;
    public long LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public long LJ;
    public K4J LJI;
    public int LJII;
    public int LJIIIIZZ;
    public String LJIIJ;
    public String LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public C49932Jii LJIILLIIL;
    public int LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public int LJIJJ;
    public boolean LJJI;
    public String LJJIIZ;
    public boolean LJJIJ;
    public long LJJIJIIJI;
    public long LJJIJIL;
    public final ArrayList<String> LJJIL;
    public long LJJIZ;
    public int LJFF = -1;
    public int LJIIIZ = -1;
    public int LJIIJJI = -1;
    public long LJIILL = -1;
    public Integer LJIJJLI = 0;
    public int LJIL = -1;
    public int LJJ = -1;
    public Integer LJJIFFI = 0;
    public Integer LJJII = 0;
    public Integer LJJIII = 0;
    public Integer LJJIIJ = 0;
    public Integer LJJIIJZLJL = 0;
    public int LJJIIZI = EnumC49934Jik.SUCCESS.ordinal();
    public long LJJIJIIJIL = -1;
    public long LJJIJL = -1;
    public long LJJIJLIJ = -1;

    public final void LIZIZ() {
        if (o.LJ(this, C49936Jim.LIZ)) {
            return;
        }
        C49922JiY.LIZ(this.LIZ);
    }

    public final void LIZJ() {
        if (o.LJ(this, C49936Jim.LIZ)) {
            return;
        }
        System.currentTimeMillis();
    }

    public final void LIZLLL() {
        if (o.LJ(this, C49936Jim.LIZ)) {
            return;
        }
        if (this.LJ == 0) {
            this.LJ = System.currentTimeMillis();
        }
        Context context = C81725W5p.LIZ;
        o.LJIIIIZZ(context, "getContext()");
        this.LJFF = C48203Ivv.LIZIZ(context).getValue();
    }

    public final void LJ() {
        String str;
        long j;
        SearchResultParam searchResultParam = this.LIZ;
        java.util.Map<String, java.util.Map<String, Long>> map = C49921JiX.LIZLLL;
        if (searchResultParam != null) {
            str = C49567Jcp.LIZ(searchResultParam);
        } else {
            str = null;
        }
        java.util.Map map2 = (java.util.Map) ((LinkedHashMap) map).get(str);
        if (map2 != null) {
            Long l = (Long) map2.get("lynxCreateViewHolderCost");
            long j2 = -1;
            if (l != null) {
                j = l.longValue();
            } else {
                j = -1;
            }
            this.LJJIJL = j;
            Long l2 = (Long) map2.get("lynxOnBindViewHolderCost");
            if (l2 != null) {
                j2 = l2.longValue();
            }
            this.LJJIJLIJ = j2;
        }
    }

    public final void LJFF() {
        this.LJIILL = SearchUserLinearLayoutManager.LLIIJLIL;
        SearchUserLinearLayoutManager.LLIIJLIL = -1L;
    }

    public final void LJIIIZ() {
        if (!o.LJ(this, C49936Jim.LIZ) && this.LIZLLL == 0) {
            this.LIZLLL = System.currentTimeMillis();
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchResultShowEventV2(tabType=");
        LIZ.append(this.LJIJJ);
        LIZ.append(", trigger=");
        LIZ.append(this.LIZJ);
        LIZ.append(", itemCount=");
        LIZ.append(this.LJII);
        LIZ.append(", cost=");
        LIZ.append(this.LJIIZILJ);
        LIZ.append(", netLogId=");
        LIZ.append(this.LJIIJ);
        LIZ.append(", status=");
        LIZ.append(this.LJIIJJI);
        LIZ.append(", errorMsg=");
        return q.LIZIZ(LIZ, this.LJIIL, ')', LIZ);
    }

    public C49923JiZ(SearchResultParam searchResultParam) {
        this.LIZ = searchResultParam;
        new ArrayList();
        this.LJJIL = new ArrayList<>();
        this.LJJIZ = -1L;
    }

    public final void LIZ(String str) {
        this.LJJIL.add(str);
    }

    public final void LJI(int i) {
        if (o.LJ(this, C49936Jim.LIZ)) {
            return;
        }
        this.LJIIJJI = i;
        if (i == 0) {
            this.LJIIL = null;
            this.LJIILIIL = 0;
        } else {
            this.LJIILIIL = 1;
        }
    }

    public final void LJII(int i) {
        if (o.LJ(this, C49936Jim.LIZ)) {
            return;
        }
        this.LJIJJ = i;
    }

    public final void LJIIIIZZ(int i) {
        if (o.LJ(this, C49936Jim.LIZ)) {
            return;
        }
        if (i == C50605JtZ.LJIIL()) {
            LJII(2);
        } else if (i == C50605JtZ.LJIILIIL()) {
            LJII(1);
        } else if (i == C50605JtZ.LJIIIZ()) {
            LJII(4);
        } else if (i == C50605JtZ.LIZJ()) {
            LJII(5);
        } else if (i == C50605JtZ.LJIIJJI()) {
            LJII(0);
        } else if (i == C50605JtZ.LJ()) {
            LJII(6);
        } else if (i == C50605JtZ.LJIIIIZZ()) {
            LJII(7);
        } else if (i == C50605JtZ.LJI()) {
            LJII(8);
        }
        this.LIZ.setIndex(i);
    }
}
