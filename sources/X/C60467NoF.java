package X;

import android.view.View;
import android.view.ViewParent;
import android.webkit.WebView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NoF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60467NoF implements InterfaceC60172NjU {
    public final /* synthetic */ C60466NoE LJLIL;
    public final /* synthetic */ C73305Spp LJLILLLLZI;
    public final /* synthetic */ ActivityC45651qj LJLJI;

    @Override // X.InterfaceC60172NjU
    public final void gk(InterfaceC40516FvE instance, android.net.Uri uri, AbstractC59475NVv param) {
        o.LJIIIZ(instance, "instance");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(param, "param");
    }

    @Override // X.InterfaceC60172NjU
    public final void LLLLL(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        this.LJLIL.LJLJL = true;
    }

    @Override // X.InterfaceC60172NjU
    public final void LLL(android.net.Uri uri, Throwable e) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(e, "e");
        boolean z = false;
        this.LJLIL.LJLJL = false;
        this.LJLILLLLZI.setVisibility(0);
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
        }
        if (z) {
            C73305Spp c73305Spp = this.LJLILLLLZI;
            C73306Spq c73306Spq = new C73306Spq();
            C73312Spw.LJIIJ(c73306Spq, new AqS160S0100000_10(this.LJLIL, 180));
            c73305Spp.setStatus(c73306Spq);
            C26045AKb c26045AKb = new C26045AKb(this.LJLJI);
            c26045AKb.LJIIIIZZ(R.string.r9l);
            c26045AKb.LJIIJ();
            return;
        }
        C73305Spp c73305Spp2 = this.LJLILLLLZI;
        C73306Spq c73306Spq2 = new C73306Spq();
        C73312Spw.LJI(c73306Spq2, new AqS160S0100000_10(this.LJLIL, 181));
        c73305Spp2.setStatus(c73306Spq2);
    }

    public C60467NoF(C60466NoE c60466NoE, C73305Spp c73305Spp, ActivityC45651qj activityC45651qj) {
        this.LJLIL = c60466NoE;
        this.LJLILLLLZI = c73305Spp;
        this.LJLJI = activityC45651qj;
    }

    @Override // X.InterfaceC60172NjU
    public final void LLLII(View view, android.net.Uri uri, InterfaceC40516FvE instance) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(instance, "instance");
        this.LJLIL.LJLJL = false;
        this.LJLILLLLZI.setVisibility(8);
    }

    @Override // X.InterfaceC60172NjU
    public final void LLIIL(List<? extends C60213Nk9<? extends View>> viewComponents, android.net.Uri uri, InterfaceC40516FvE instance, boolean z) {
        ViewParent viewParent;
        o.LJIIIZ(viewComponents, "viewComponents");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(instance, "instance");
        C60466NoE c60466NoE = this.LJLIL;
        c60466NoE.LJLJJI = instance;
        BottomSheetDialogFragment bottomSheetDialogFragment = c60466NoE.LJLJJLL;
        if (bottomSheetDialogFragment == null) {
            return;
        }
        View view = bottomSheetDialogFragment.getView();
        View view2 = null;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof View) {
            view2 = (View) viewParent;
        }
        C76732zl c76732zl = new C76732zl();
        C60475NoN c60475NoN = new C60475NoN(c76732zl);
        InterfaceC40516FvE interfaceC40516FvE = c60466NoE.LJLJJI;
        if (!(interfaceC40516FvE instanceof NUX)) {
            return;
        }
        WebView view3 = ((NUX) interfaceC40516FvE).getView();
        if (!(view3 instanceof C59614NaU)) {
            return;
        }
        C59614NaU c59614NaU = (C59614NaU) view3;
        c60466NoE.LJLJJL = c59614NaU;
        c59614NaU.setWebScrollListener(new C60474NoM(c60475NoN));
        if (view2 == null) {
            return;
        }
        BottomSheetBehavior from = BottomSheetBehavior.from(view2);
        from.setBottomSheetCallback(new C60468NoG(c60466NoE, c76732zl, from, bottomSheetDialogFragment));
    }
}
