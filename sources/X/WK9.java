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
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WK9 extends WM7 {
    public final WKB LJLIL;
    public final LiveEvent<Boolean> LJLILLLLZI;
    public RecyclerView LJLJI;
    public WFT LJLJJI;
    public final int LJLJJL;
    public boolean LJLJJLL;
    public OSZ<Integer, Integer> LJLJL;
    public final C62822Ol8 LJLJLJ;

    public final List<C81975WFf> LLJILJIL() {
        ArrayList arrayList;
        int i;
        List<C81975WFf> items = this.LJLIL.getItems();
        int LJLLI = this.LJLIL.LJLLI();
        C81975WFf LIZ = this.LJLIL.LIZ();
        o.LJIIIZ(items, "items");
        if (items.size() > LJLLI) {
            if (LIZ != null) {
                i = 1;
            } else {
                i = 0;
            }
            int i2 = LJLLI - i;
            arrayList = new ArrayList();
            if (items.size() > i2) {
                arrayList.addAll(items.subList(0, i2));
            } else {
                arrayList.addAll(items);
            }
            if (LIZ != null) {
                arrayList.add(LIZ);
            }
        } else {
            arrayList = new ArrayList();
            if (items.size() > LJLLI) {
                arrayList.addAll(items.subList(0, LJLLI));
            } else {
                arrayList.addAll(items);
            }
        }
        return arrayList;
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        this.LJLIL.LIZJ((InterfaceC82077WJd) this.LJLJLJ.getValue());
    }

    public final C81975WFf LLJILJILJ(int i) {
        for (C81975WFf c81975WFf : this.LJLIL.getItems()) {
            if (c81975WFf.LJLIL == i) {
                return c81975WFf;
            }
        }
        return null;
    }

    public final View LLJJ(int i) {
        int i2 = 0;
        for (C81975WFf c81975WFf : this.LJLIL.getItems()) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                if (c81975WFf.LJLIL == i) {
                    if (i2 >= this.LJLIL.LJLLI() - 1) {
                        RecyclerView recyclerView = this.LJLJI;
                        if (recyclerView != null) {
                            return recyclerView.getChildAt(this.LJLIL.LJLLI() - 1);
                        }
                        o.LJIJI("toolbarRecyclerView");
                        throw null;
                    }
                    RecyclerView recyclerView2 = this.LJLJI;
                    if (recyclerView2 != null) {
                        return recyclerView2.getChildAt(i2);
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
        View requireViewById = requireViewById(R.id.isl);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.recycler_toolbar)");
        RecyclerView recyclerView = (RecyclerView) requireViewById;
        this.LJLJI = recyclerView;
        requireActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        WFT wft = new WFT(LLJILJIL());
        this.LJLJJI = wft;
        RecyclerView recyclerView2 = this.LJLJI;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(wft);
            C71311Ryl c71311Ryl = new C71311Ryl(requireActivity());
            Drawable LIZIZ = C04270Et.LIZIZ(requireActivity(), R.drawable.w3);
            o.LJI(LIZIZ);
            c71311Ryl.LJLIL = LIZIZ;
            RecyclerView recyclerView3 = this.LJLJI;
            if (recyclerView3 != null) {
                recyclerView3.LJII(c71311Ryl, -1);
                this.LJLILLLLZI.LIZLLL(this, new AObjectS86S0100000_7(this, 33));
                this.LJLIL.LIZLLL((InterfaceC82077WJd) this.LJLJLJ.getValue());
                return;
            }
            o.LJIJI("toolbarRecyclerView");
            throw null;
        }
        o.LJIJI("toolbarRecyclerView");
        throw null;
    }

    public WK9(WKB toolbarManager, C29901Fi topMargin) {
        o.LJIIIZ(toolbarManager, "toolbarManager");
        o.LJIIIZ(topMargin, "topMargin");
        this.LJLIL = toolbarManager;
        this.LJLILLLLZI = topMargin;
        this.LJLJJL = SFS.LJII(32.0d, C60903NvH.LJ);
        this.LJLJL = new OSZ<>(0, 0);
        this.LJLJLJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 76));
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.azb, viewGroup, false, "inflater.inflate(R.layou…scene2, container, false)");
    }
}
