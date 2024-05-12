package X;

import Y.ACListenerS34S0100000_14;
import Y.AObserverS82S0100000_14;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Vvo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81320Vvo implements InterfaceC81329Vvx {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public C81283VvD LIZ;
    public C83089WjF LIZIZ;
    public final C73893SzJ LIZJ = new C73893SzJ();
    public final C73893SzJ LIZLLL = new C73893SzJ();
    public final C81321Vvp LJ = new C81321Vvp(this);
    public final ViewGroup LJFF;
    public final LifecycleOwner LJI;
    public final InterfaceC81323Vvr LJII;

    @Override // X.InterfaceC81329Vvx
    public final C73426Srm LIZ() {
        C73893SzJ c73893SzJ = this.LIZJ;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    @Override // X.InterfaceC81329Vvx
    public final void hide() {
        InterfaceC81323Vvr interfaceC81323Vvr = this.LJII;
        if (interfaceC81323Vvr != null) {
            interfaceC81323Vvr.g6();
        }
        C83089WjF c83089WjF = this.LIZIZ;
        if (c83089WjF != null) {
            c83089WjF.hide();
            C81283VvD c81283VvD = this.LIZ;
            if (c81283VvD != null) {
                c81283VvD.setCategoryMap(C61878OQg.INSTANCE);
                return;
            } else {
                o.LJIJI("listView");
                throw null;
            }
        }
        o.LJIJI("transitionView");
        throw null;
    }

    @Override // X.InterfaceC81329Vvx
    public final void show() {
        InterfaceC81323Vvr interfaceC81323Vvr = this.LJII;
        if (interfaceC81323Vvr != null) {
            interfaceC81323Vvr.refreshData();
        }
        C83089WjF c83089WjF = this.LIZIZ;
        if (c83089WjF != null) {
            c83089WjF.show();
        } else {
            o.LJIJI("transitionView");
            throw null;
        }
    }

    public C81320Vvo(ViewGroup viewGroup, WP0 wp0, FilterBoxViewModel filterBoxViewModel, C81281VvB c81281VvB) {
        this.LJFF = viewGroup;
        this.LJI = wp0;
        this.LJII = filterBoxViewModel;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup.getContext()), R.layout.iy, viewGroup, false);
        viewGroup.addView(LLLLIILL);
        View findViewById = LLLLIILL.findViewById(R.id.d9k);
        o.LJIIIIZZ(findViewById, "content.findViewById(R.id.filter_box_view)");
        C81283VvD c81283VvD = (C81283VvD) findViewById;
        this.LIZ = c81283VvD;
        c81283VvD.setFilterBoxViewConfigure(c81281VvB);
        this.LIZIZ = new C83089WjF(LLLLIILL, LLLLIILL.findViewById(R.id.kgu));
        C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 100), LLLLIILL.findViewById(R.id.kkd));
        C83089WjF c83089WjF = this.LIZIZ;
        if (c83089WjF != null) {
            c83089WjF.LIZJ();
            MutableLiveData<OSZ<EnumC81318Vvm, C81288VvI>> mutableLiveData = filterBoxViewModel.LJLIL;
            if (mutableLiveData != null) {
                mutableLiveData.observe(wp0, new AObserverS82S0100000_14(this, 66));
                return;
            }
            return;
        }
        o.LJIJI("transitionView");
        throw null;
    }
}
