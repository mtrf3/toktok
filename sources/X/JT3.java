package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JT3 implements JSL {
    public RecyclerView LIZ;
    public JT4 LIZIZ;

    @Override // X.JSL
    public final void LIZJ() {
    }

    @Override // X.JSL
    public final void LIZLLL(JU3 ju3) {
    }

    @Override // X.JSL
    public final void LJ() {
    }

    @Override // X.JSL
    public final void LJFF() {
    }

    @Override // X.JSL
    public final void LJI() {
    }

    @Override // X.JSL
    public final Boolean isActive() {
        return Boolean.FALSE;
    }

    @Override // X.JSL
    public final void LIZIZ(int i, InterfaceC49186JSc interfaceC49186JSc) {
        LinearLayoutManager linearLayoutManager;
        if (i == -1) {
            return;
        }
        RecyclerView recyclerView = this.LIZ;
        if (recyclerView != null) {
            if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
                RecyclerView recyclerView2 = this.LIZ;
                if (recyclerView2 != null) {
                    C0A2 layoutManager = recyclerView2.getLayoutManager();
                    if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                        linearLayoutManager.LJFF(i, 0);
                        return;
                    }
                    return;
                }
                o.LJIJI("listView");
                throw null;
            }
            RecyclerView recyclerView3 = this.LIZ;
            if (recyclerView3 != null) {
                recyclerView3.LJLI(i);
                return;
            } else {
                o.LJIJI("listView");
                throw null;
            }
        }
        o.LJIJI("listView");
        throw null;
    }

    @Override // X.JSL
    public final void LJIJJLI(Aweme aweme, C49196JSm c49196JSm) {
        o.LJIIIZ(aweme, "aweme");
        JT4 jt4 = this.LIZIZ;
        if (jt4 == null) {
            return;
        }
        LIZIZ(jt4.LLD(aweme), c49196JSm);
    }

    @Override // X.JSL
    public final void LIZ(RecyclerView listView, InterfaceC49154JQw interfaceC49154JQw, int i, boolean z) {
        o.LJIIIZ(listView, "listView");
        this.LIZ = listView;
    }
}
