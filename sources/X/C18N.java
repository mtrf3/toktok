package X;

import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.app.AppCompatDelegateImpl;
import o3.h0;

/* renamed from: X.18N, reason: invalid class name */
/* loaded from: classes.dex */
public class C18N implements InterfaceC25570zR {
    public final InterfaceC25570zR LIZ;
    public final /* synthetic */ AppCompatDelegateImpl LIZIZ;

    @Override // X.InterfaceC25570zR
    public final void LIZJ(AbstractC25580zS abstractC25580zS) {
        this.LIZ.LIZJ(abstractC25580zS);
        AppCompatDelegateImpl appCompatDelegateImpl = this.LIZIZ;
        if (appCompatDelegateImpl.LJLZ != null) {
            appCompatDelegateImpl.LJLJJLL.getDecorView().removeCallbacks(this.LIZIZ.LJZ);
        }
        AppCompatDelegateImpl appCompatDelegateImpl2 = this.LIZIZ;
        if (appCompatDelegateImpl2.LJLLLLLL != null) {
            C16650l3 c16650l3 = appCompatDelegateImpl2.LJZI;
            if (c16650l3 != null) {
                c16650l3.LIZIZ();
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = this.LIZIZ;
            C16650l3 LIZ = h0.LIZ(appCompatDelegateImpl3.LJLLLLLL);
            LIZ.LIZ(0.0f);
            appCompatDelegateImpl3.LJZI = LIZ;
            this.LIZIZ.LJZI.LIZLLL(new C31309CQn() { // from class: X.1hE
                @Override // X.InterfaceC16660l4
                public final void LIZ() {
                    C18N.this.LIZIZ.LJLLLLLL.setVisibility(8);
                    AppCompatDelegateImpl appCompatDelegateImpl4 = C18N.this.LIZIZ;
                    PopupWindow popupWindow = appCompatDelegateImpl4.LJLZ;
                    if (popupWindow != null) {
                        popupWindow.dismiss();
                    } else if (appCompatDelegateImpl4.LJLLLLLL.getParent() instanceof View) {
                        C16340kY.LIZJ((View) C18N.this.LIZIZ.LJLLLLLL.getParent());
                    }
                    C18N.this.LIZIZ.LJLLLLLL.LJII();
                    C18N.this.LIZIZ.LJZI.LIZLLL(null);
                    AppCompatDelegateImpl appCompatDelegateImpl5 = C18N.this.LIZIZ;
                    appCompatDelegateImpl5.LJZI = null;
                    C16340kY.LIZJ(appCompatDelegateImpl5.LLD);
                }
            });
        }
        AppCompatDelegateImpl appCompatDelegateImpl4 = this.LIZIZ;
        AnonymousClass026 anonymousClass026 = appCompatDelegateImpl4.LJLJLJ;
        if (anonymousClass026 != null) {
            anonymousClass026.onSupportActionModeFinished(appCompatDelegateImpl4.LJLLLL);
        }
        AppCompatDelegateImpl appCompatDelegateImpl5 = this.LIZIZ;
        appCompatDelegateImpl5.LJLLLL = null;
        C16340kY.LIZJ(appCompatDelegateImpl5.LLD);
    }

    public C18N(AppCompatDelegateImpl appCompatDelegateImpl, InterfaceC25570zR interfaceC25570zR) {
        this.LIZIZ = appCompatDelegateImpl;
        this.LIZ = interfaceC25570zR;
    }

    @Override // X.InterfaceC25570zR
    public final boolean LIZ(AbstractC25580zS abstractC25580zS, C281318n c281318n) {
        return this.LIZ.LIZ(abstractC25580zS, c281318n);
    }

    @Override // X.InterfaceC25570zR
    public final boolean LIZIZ(AbstractC25580zS abstractC25580zS, C281318n c281318n) {
        C16340kY.LIZJ(this.LIZIZ.LLD);
        return this.LIZ.LIZIZ(abstractC25580zS, c281318n);
    }

    @Override // X.InterfaceC25570zR
    public final boolean LIZLLL(AbstractC25580zS abstractC25580zS, MenuItem menuItem) {
        return this.LIZ.LIZLLL(abstractC25580zS, menuItem);
    }
}
