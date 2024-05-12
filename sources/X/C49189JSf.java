package X;

import Y.ARunnableS14S0110000_8;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JSf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C49189JSf implements JSL {
    public boolean LIZ;
    public InterfaceC49154JQw LIZIZ;
    public RecyclerView LIZLLL;
    public InterfaceC49148JQq LJ;
    public boolean LJFF;
    public boolean LJI;
    public long LJII;
    public JU3 LJIIIIZZ;
    public InterfaceC49194JSk LJIIJ;
    public int LIZJ = -1;
    public final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 728));

    @Override // X.JSL
    public final void LIZJ() {
    }

    @Override // X.JSL
    public final void LJFF() {
    }

    @Override // X.JSL
    public final void LJI() {
        C49133JQb.LIZ("GHGCA", Boolean.valueOf(this.LIZ));
        if (!this.LIZ) {
            return;
        }
        this.LJFF = false;
        this.LJI = false;
        InterfaceC49148JQq interfaceC49148JQq = this.LJ;
        if (interfaceC49148JQq != null) {
            interfaceC49148JQq.LLLLLIL();
        }
    }

    public final void LJII() {
        this.LJFF = true;
        JU3 ju3 = this.LJIIIIZZ;
        if (ju3 != null) {
            JU2 ju2 = ju3.LIZ;
            if (ju2.LIZ) {
                List<InterfaceC49220JTk> list = ju2.LIZIZ;
                if (list != null && !list.isEmpty()) {
                    Iterator<InterfaceC49220JTk> it = list.iterator();
                    while (it.hasNext()) {
                        if (!it.next().isEnable()) {
                            return;
                        }
                    }
                }
            } else {
                return;
            }
        }
        InterfaceC49148JQq interfaceC49148JQq = this.LJ;
        if (interfaceC49148JQq != null) {
            interfaceC49148JQq.y(150L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fd, code lost:
    
        if (r0 != false) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ() {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49189JSf.LJIIIIZZ():void");
    }

    @Override // X.JSL
    public final Boolean isActive() {
        return Boolean.valueOf(this.LJFF);
    }

    @Override // X.JSL
    public final void LJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("is ready:");
        LIZ.append(this.LIZ);
        X1D.LIZIZ(LIZ);
        if (!this.LIZ) {
            this.LJI = true;
            return;
        }
        this.LJI = false;
        this.LJII = 0L;
        LJIIIIZZ();
    }

    @Override // X.JSL
    public final void LIZLLL(JU3 ju3) {
        this.LJIIIIZZ = ju3;
    }

    @Override // X.JSL
    public void LIZIZ(int i, InterfaceC49186JSc interfaceC49186JSc) {
        LinearLayoutManager linearLayoutManager;
        C49133JQb.LIZ("GHGCA", Integer.valueOf(i), this.LIZLLL);
        if (i == -1) {
            C49133JQb.LIZ("GHGCA", "position not found");
            LIZIZ(0, null);
            return;
        }
        RecyclerView recyclerView = this.LIZLLL;
        if (recyclerView != null) {
            if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
                C0A2 layoutManager = recyclerView.getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                    linearLayoutManager.LJFF(i, 0);
                }
            } else {
                recyclerView.LJLI(i);
            }
            RecyclerView recyclerView2 = this.LIZLLL;
            if (recyclerView2 != null) {
                if (C16330kX.LIZJ(recyclerView2) && !recyclerView2.isLayoutRequested()) {
                    C49133JQb.LIZ("GHGCA", "play when layout finish");
                    LJIIIZ(i, interfaceC49186JSc);
                    return;
                } else {
                    recyclerView2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC49191JSh(this, i, interfaceC49186JSc));
                    return;
                }
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public void LJIIIZ(int i, InterfaceC49186JSc interfaceC49186JSc) {
        Object obj;
        RecyclerView recyclerView = this.LIZLLL;
        InterfaceC49148JQq interfaceC49148JQq = null;
        if (recyclerView != null) {
            obj = recyclerView.LJJIZ(i);
        } else {
            obj = null;
        }
        if (obj instanceof InterfaceC49148JQq) {
            interfaceC49148JQq = (InterfaceC49148JQq) obj;
        }
        if (interfaceC49148JQq == null) {
            return;
        }
        this.LJ = interfaceC49148JQq;
        LJII();
        if (interfaceC49186JSc != null) {
            interfaceC49186JSc.LIZ(interfaceC49148JQq);
        }
    }

    @Override // X.JSL
    public final void LJIJJLI(Aweme aweme, C49196JSm c49196JSm) {
        o.LJIIIZ(aweme, "aweme");
        InterfaceC49194JSk interfaceC49194JSk = this.LJIIJ;
        if (interfaceC49194JSk == null) {
            return;
        }
        LIZIZ(interfaceC49194JSk.LLD(aweme), c49196JSm);
    }

    @Override // X.JSL
    public final void LIZ(RecyclerView listView, InterfaceC49154JQw interfaceC49154JQw, int i, boolean z) {
        o.LJIIIZ(listView, "listView");
        this.LIZLLL = listView;
        this.LIZIZ = interfaceC49154JQw;
        this.LIZJ = i;
        listView.LJJLL((C0A6) this.LJIIIZ.getValue());
        listView.LJIIJJI((C0A6) this.LJIIIZ.getValue());
        listView.post(new ARunnableS14S0110000_8(this, z, 13));
    }
}
