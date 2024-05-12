package X;

import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.SearchUserLinearLayoutManager;
import defpackage.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JiW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49920JiW {
    public final SearchResultParam LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LJFF;
    public String LJI;
    public String LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public K4J LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public String LJIJ;
    public String LJIJJ;
    public int LJIJJLI;
    public int LJJI;
    public C49932Jii LJJIIJ;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public long LJJIJ;
    public int LJJIJIIJIL;
    public boolean LJJIJLIJ;
    public String LJJIL;
    public long LIZLLL = -1;
    public long LJ = -1;
    public int LJIIZILJ = -1;
    public int LJIJI = -1;
    public int LJIL = -1;
    public int LJJ = -1;
    public long LJJIFFI = -1;
    public long LJJII = -1;
    public long LJJIII = -1;
    public int LJJIIZI = EnumC49934Jik.SUCCESS.ordinal();
    public final ArrayList<String> LJJIJIIJI = new ArrayList<>();
    public int LJJIJIL = -1;
    public int LJJIJL = -1;
    public final List<Runnable> LJJIZ = new ArrayList();

    public final void LIZLLL() {
        if (o.LJ(this, C49567Jcp.LIZ)) {
            return;
        }
        C49921JiX.LIZ(this.LIZ);
    }

    public final void LJI() {
        if (o.LJ(this, C49567Jcp.LIZ)) {
            return;
        }
        long j = this.LIZJ;
        if (j == 0) {
            j = this.LIZIZ;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.LJIIIZ = currentTimeMillis;
        this.LJIILL = (int) (currentTimeMillis - j);
    }

    public final void LJII() {
        if (!o.LJ(this, C49567Jcp.LIZ) && this.LIZJ == 0) {
            this.LIZJ = System.currentTimeMillis();
        }
    }

    public final void LJIIIZ() {
        this.LJJII = SearchUserLinearLayoutManager.LLIIJLIL;
        SearchUserLinearLayoutManager.LLIIJLIL = -1L;
    }

    public final void LJIILJJIL() {
        if (!o.LJ(this, C49567Jcp.LIZ) && this.LJIIIIZZ == 0) {
            this.LJIIIIZZ = System.currentTimeMillis();
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchResultShowEvent(tabType=");
        LIZ.append(this.LJIIJJI);
        LIZ.append(", trigger=");
        C15890jp.LIZIZ(LIZ, this.LJIIL, ", displayType=", 0, ", itemCount=");
        LIZ.append(this.LJIILIIL);
        LIZ.append(", cost=");
        LIZ.append(this.LJIILJJIL);
        LIZ.append(", netCost=");
        LIZ.append(this.LJIILL);
        LIZ.append(", netLogId=");
        LIZ.append(this.LJIJ);
        LIZ.append(", status=");
        LIZ.append(this.LJIJI);
        LIZ.append(", errorMsg=");
        return q.LIZIZ(LIZ, this.LJIJJ, ')', LIZ);
    }

    public C49920JiW(SearchResultParam searchResultParam) {
        this.LIZ = searchResultParam;
    }

    public final void LIZ(String str) {
        this.LJJIJIIJI.add(str);
    }

    public final void LIZIZ(int i) {
        if (this.LJIL == -1) {
            this.LJIL = i;
        } else {
            if (this.LJJ != -1) {
                return;
            }
            this.LJJ = i;
        }
    }

    public final void LIZJ(int i) {
        if (o.LJ(this, C49567Jcp.LIZ)) {
            return;
        }
        this.LJIILIIL = i;
    }

    public final void LJ(long j) {
        if (j >= 0 && this.LJ == -1) {
            this.LJ = j;
        }
    }

    public final void LJFF(String str) {
        if (o.LJ(this, C49567Jcp.LIZ)) {
            return;
        }
        this.LJIJ = str;
        C49520Jc4 LIZIZ = C49521Jc5.LIZIZ(C49567Jcp.LIZ(this.LIZ));
        LIZIZ.getClass();
        if (o.LJ(LIZIZ, C49533JcH.LIZ)) {
            return;
        }
        if (str == null) {
            str = "";
        }
        LIZIZ.LIZ = str;
    }

    public final void LJIIIIZZ(int i) {
        if (o.LJ(this, C49567Jcp.LIZ)) {
            return;
        }
        this.LJJIIZI = i;
    }

    public final void LJIIJ(K4J k4j) {
        if (o.LJ(this, C49567Jcp.LIZ)) {
            return;
        }
        this.LJIIJ = k4j;
    }

    public final void LJIIJJI(int i) {
        if (o.LJ(this, C49567Jcp.LIZ)) {
            return;
        }
        this.LJIJI = i;
        if (i == 0) {
            this.LJIJJ = null;
            this.LJIJJLI = 0;
        } else {
            this.LJIJJLI = 1;
        }
    }

    public final void LJIIL(int i) {
        if (o.LJ(this, C49567Jcp.LIZ)) {
            return;
        }
        this.LJIIJJI = i;
    }

    public final void LJIILIIL(int i) {
        if (o.LJ(this, C49567Jcp.LIZ)) {
            return;
        }
        if (i == C50605JtZ.LJIIL()) {
            LJIIL(2);
        } else if (i == C50605JtZ.LJIILIIL()) {
            LJIIL(1);
        } else if (i == C50605JtZ.LJIIIZ()) {
            LJIIL(4);
        } else if (i == C50605JtZ.LIZJ()) {
            LJIIL(5);
        } else if (i == C50605JtZ.LJIIJJI()) {
            LJIIL(0);
        } else if (i == C50605JtZ.LJ()) {
            LJIIL(6);
        } else if (i == C50605JtZ.LJIIIIZZ()) {
            LJIIL(7);
        } else if (i == C50605JtZ.LJI()) {
            LJIIL(8);
        }
        this.LIZ.setIndex(i);
    }
}
