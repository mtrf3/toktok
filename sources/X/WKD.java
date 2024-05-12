package X;

import Y.ACListenerS34S0100000_14;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WKD extends WM7 {
    public final WKB LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public RecyclerView LJLJI;
    public WFT LJLJJI;
    public final C62822Ol8 LJLJJL;

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        this.LJLIL.LIZJ((InterfaceC82077WJd) this.LJLJJL.getValue());
        this.LJLILLLLZI.invoke();
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.gm9);
        o.LJIIIIZZ(requireViewById, "requireViewById<View>(R.id.more_commands_view)");
        View findViewById = requireViewById.findViewById(R.id.ism);
        o.LJIIIIZZ(findViewById, "moreCommands.findViewByI….recycler_toolbar_hidden)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.LJLJI = recyclerView;
        requireActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        WFT wft = new WFT(WKC.LIZ(this.LJLIL));
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
                C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 15), requireViewById);
                this.LJLIL.LIZLLL((InterfaceC82077WJd) this.LJLJJL.getValue());
                return;
            }
            o.LJIJI("toolbarHiddenRecyclerView");
            throw null;
        }
        o.LJIJI("toolbarHiddenRecyclerView");
        throw null;
    }

    public WKD(WKB toolbarManager, AqS164S0100000_14 aqS164S0100000_14) {
        o.LJIIIZ(toolbarManager, "toolbarManager");
        this.LJLIL = toolbarManager;
        this.LJLILLLLZI = aqS164S0100000_14;
        this.LJLJJL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 74));
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.az_, viewGroup, false, "inflater.inflate(R.layou…_scene, container, false)");
    }
}
