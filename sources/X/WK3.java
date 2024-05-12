package X;

import Y.AObjectS86S0100000_7;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WK3 extends WM7 {
    public static final int LJLLILLLL = C164516cx.LIZ();
    public final WK0 LJLIL;
    public final LiveEvent<Boolean> LJLILLLLZI;
    public final ShortVideoContext LJLJI;
    public final C0IB<Boolean> LJLJJI;
    public RecyclerView LJLJJL;
    public WFU LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public boolean LJLJLLL;
    public OSZ<Integer, Integer> LJLL;
    public final C62822Ol8 LJLLI;

    public final WFU LLJJ() {
        WFU wfu = this.LJLJJLL;
        if (wfu != null) {
            return wfu;
        }
        o.LJIJI("toolbarAdapter");
        throw null;
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        this.LJLIL.LJIIIIZZ((InterfaceC82075WJb) this.LJLLI.getValue());
    }

    public final C81975WFf LLJILJIL(int i) {
        for (C81975WFf c81975WFf : this.LJLIL.getItems()) {
            if (c81975WFf.LJLIL == i) {
                return c81975WFf;
            }
        }
        return null;
    }

    public final View LLJILJILJ(int i) {
        int i2 = 0;
        for (C81975WFf c81975WFf : this.LJLIL.getItems()) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                if (c81975WFf.LJLIL == i) {
                    if (i2 >= this.LJLIL.LJLLI() - 1) {
                        RecyclerView recyclerView = this.LJLJJL;
                        if (recyclerView != null) {
                            return recyclerView.getChildAt(this.LJLIL.LJLLI() - 1);
                        }
                        o.LJIJI("toolbarRecyclerView");
                        throw null;
                    }
                    RecyclerView recyclerView2 = this.LJLJJL;
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

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ToolbarScene onActivityCreated ");
        LIZ.append(bundle);
        H78.LIZ(X1D.LIZIZ(LIZ));
        ((ArrayList) C82098WJy.LIZ).clear();
        View requireViewById = requireViewById(R.id.isl);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.recycler_toolbar)");
        RecyclerView recyclerView = (RecyclerView) requireViewById;
        this.LJLJJL = recyclerView;
        requireActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.LJLJJLL = new WFU(WJZ.LIZJ(this.LJLIL.getItems(), this.LJLIL.LJLLI(), this.LJLIL.LIZ()), C82100WKa.LJLIL);
        RecyclerView recyclerView2 = this.LJLJJL;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(LLJJ());
            if (!L2F.LIZ()) {
                C71311Ryl c71311Ryl = new C71311Ryl(requireActivity());
                Drawable LIZIZ = C04270Et.LIZIZ(requireActivity(), R.drawable.w3);
                if (LIZIZ != null) {
                    c71311Ryl.LJLIL = LIZIZ;
                    RecyclerView recyclerView3 = this.LJLJJL;
                    if (recyclerView3 != null) {
                        recyclerView3.LJII(c71311Ryl, -1);
                    } else {
                        o.LJIJI("toolbarRecyclerView");
                        throw null;
                    }
                }
            }
            RecyclerView recyclerView4 = this.LJLJJL;
            if (recyclerView4 != null) {
                recyclerView4.setItemAnimator(null);
                LLJJ().LJLJJI = new AqS180S0100000_14(this, 246);
                this.LJLILLLLZI.LIZLLL(this, new AObjectS86S0100000_7(this, 237));
                this.LJLJJI.LIZIZ(this, new AObjectS86S0100000_7(this, 238));
                this.LJLIL.LIZJ((InterfaceC82075WJb) this.LJLLI.getValue());
                return;
            }
            o.LJIJI("toolbarRecyclerView");
            throw null;
        }
        o.LJIJI("toolbarRecyclerView");
        throw null;
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        H78.LIZ("ToolbarScene onCreateView");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dsc, container, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…scene2, container, false)");
        return LLLLIILL;
    }

    public WK3(WK0 toolbarManager, C29901Fi topMargin, ShortVideoContext shortVideoContext, C0IB relayoutEvent) {
        o.LJIIIZ(toolbarManager, "toolbarManager");
        o.LJIIIZ(topMargin, "topMargin");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(relayoutEvent, "relayoutEvent");
        this.LJLIL = toolbarManager;
        this.LJLILLLLZI = topMargin;
        this.LJLJI = shortVideoContext;
        this.LJLJJI = relayoutEvent;
        this.LJLJL = SFS.LJI(32.0d);
        this.LJLJLJ = SFS.LJI(216.0d);
        this.LJLL = new OSZ<>(0, 0);
        this.LJLLI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 238));
    }
}
