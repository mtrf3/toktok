package X;

import Y.AObjectS117S0200000_7;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WK2 extends AbstractC48771vl {
    public final WK0 LJLJI;
    public final LiveEvent<Boolean> LJLJJI;
    public final ShortVideoContext LJLJJL;
    public final C0IB<Boolean> LJLJJLL;
    public RecyclerView LJLJL;
    public WFU LJLJLJ;
    public final int LJLJLLL;
    public boolean LJLL;
    public OSZ<Integer, Integer> LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C29901Fi<C76800UCe> LJLLJ;
    public final C29901Fi LJLLL;

    public final WFU LLJJI() {
        WFU wfu = this.LJLJLJ;
        if (wfu != null) {
            return wfu;
        }
        o.LJIJI("toolbarAdapter");
        throw null;
    }

    static {
        C164516cx.LIZ();
    }

    @Override // X.AbstractC48771vl
    public final void LLJILJIL(View view) {
        if (view != null) {
            ((ArrayList) C82098WJy.LIZ).clear();
            View requireViewById = requireViewById(R.id.isl);
            o.LJIIIIZZ(requireViewById, "requireViewById(R.id.recycler_toolbar)");
            RecyclerView recyclerView = (RecyclerView) requireViewById;
            this.LJLJL = recyclerView;
            requireActivity();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
            this.LJLJLJ = new WFU(WJZ.LIZJ(this.LJLJI.getItems(), this.LJLJI.LJLLI(), this.LJLJI.LIZ()), C82100WKa.LJLIL);
            RecyclerView recyclerView2 = this.LJLJL;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(LLJJI());
                if (!L2F.LIZ()) {
                    C71311Ryl c71311Ryl = new C71311Ryl(requireActivity());
                    Drawable LIZIZ = C04270Et.LIZIZ(requireActivity(), R.drawable.w3);
                    if (LIZIZ != null) {
                        c71311Ryl.LJLIL = LIZIZ;
                        RecyclerView recyclerView3 = this.LJLJL;
                        if (recyclerView3 != null) {
                            recyclerView3.LJII(c71311Ryl, -1);
                        } else {
                            o.LJIJI("toolbarRecyclerView");
                            throw null;
                        }
                    }
                }
                RecyclerView recyclerView4 = this.LJLJL;
                if (recyclerView4 != null) {
                    recyclerView4.setItemAnimator(null);
                    LLJJI().LJLJJI = new AqS180S0100000_14(this, 247);
                    this.LJLJJI.LIZLLL(this, new AObjectS117S0200000_7(view, this, 9));
                    this.LJLJJLL.LIZIZ(this, new AObjectS117S0200000_7(view, this, 10));
                    this.LJLJI.LIZJ((InterfaceC82075WJb) this.LJLLILLLL.getValue());
                    this.LJLLJ.LJII(C76800UCe.LIZ);
                    return;
                }
                o.LJIJI("toolbarRecyclerView");
                throw null;
            }
            o.LJIJI("toolbarRecyclerView");
            throw null;
        }
    }

    public final C81975WFf LLJILJILJ(int i) {
        for (C81975WFf c81975WFf : this.LJLJI.getItems()) {
            if (c81975WFf.LJLIL == i) {
                return c81975WFf;
            }
        }
        return null;
    }

    public final View LLJJ(int i) {
        int i2 = 0;
        for (C81975WFf c81975WFf : this.LJLJI.getItems()) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                if (c81975WFf.LJLIL == i) {
                    if (i2 >= this.LJLJI.LJLLI() - 1) {
                        RecyclerView recyclerView = this.LJLJL;
                        if (recyclerView != null) {
                            return recyclerView.getChildAt(this.LJLJI.LJLLI() - 1);
                        }
                        o.LJIJI("toolbarRecyclerView");
                        throw null;
                    }
                    RecyclerView recyclerView2 = this.LJLJL;
                    if (recyclerView2 != null) {
                        C0A2 layoutManager = recyclerView2.getLayoutManager();
                        if (layoutManager == null) {
                            return null;
                        }
                        return layoutManager.LJJIJIL(i2);
                    }
                    o.LJIJI("toolbarRecyclerView");
                    throw null;
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return null;
    }

    public WK2(WK0 toolbarManager, C29901Fi topMargin, ShortVideoContext shortVideoContext, C0IB relayoutEvent) {
        o.LJIIIZ(toolbarManager, "toolbarManager");
        o.LJIIIZ(topMargin, "topMargin");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(relayoutEvent, "relayoutEvent");
        this.LJLJI = toolbarManager;
        this.LJLJJI = topMargin;
        this.LJLJJL = shortVideoContext;
        this.LJLJJLL = relayoutEvent;
        SFS.LJI(32.0d);
        this.LJLJLLL = SFS.LJI(216.0d);
        this.LJLLI = new OSZ<>(0, 0);
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 240));
        C29901Fi<C76800UCe> c29901Fi = new C29901Fi<>();
        this.LJLLJ = c29901Fi;
        this.LJLLL = c29901Fi;
        this.LJLIL = e1.LIZ(31744, "creative_tools_toolbar_async_layout_inflater_scene_enabled", true, false);
    }
}
