package X;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuPresenter;
import java.lang.ref.WeakReference;

/* renamed from: X.18g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C280618g extends AbstractC25580zS implements C02J {
    public final Context LJLJI;
    public final C281318n LJLJJI;
    public InterfaceC25570zR LJLJJL;
    public WeakReference<View> LJLJJLL;
    public final /* synthetic */ C280718h LJLJL;

    @Override // X.AbstractC25580zS
    public final void LIZJ() {
        C280718h c280718h = this.LJLJL;
        if (c280718h.LJIIIIZZ != this) {
            return;
        }
        boolean z = c280718h.LJIILLIIL;
        boolean z2 = c280718h.LJIIZILJ;
        if (z || z2) {
            c280718h.LJIIIZ = this;
            c280718h.LJIIJ = this.LJLJJL;
        } else {
            this.LJLJJL.LIZJ(this);
        }
        this.LJLJJL = null;
        this.LJLJL.LJIJ(false);
        C281718r c281718r = this.LJLJL.LJFF;
        if (c281718r.LJLLI == null) {
            c281718r.LJII();
        }
        C280718h c280718h2 = this.LJLJL;
        c280718h2.LIZJ.setHideOnContentScrollEnabled(c280718h2.LJIL);
        this.LJLJL.LJIIIIZZ = null;
    }

    @Override // X.AbstractC25580zS
    public final View LIZLLL() {
        WeakReference<View> weakReference = this.LJLJJLL;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // X.AbstractC25580zS
    public final MenuInflater LJFF() {
        return new C25650zZ(this.LJLJI);
    }

    @Override // X.AbstractC25580zS
    public final CharSequence LJI() {
        return this.LJLJL.LJFF.getSubtitle();
    }

    @Override // X.AbstractC25580zS
    public final CharSequence LJII() {
        return this.LJLJL.LJFF.getTitle();
    }

    @Override // X.AbstractC25580zS
    public final void LJIIIIZZ() {
        if (this.LJLJL.LJIIIIZZ != this) {
            return;
        }
        this.LJLJJI.LJJI();
        try {
            this.LJLJJL.LIZIZ(this, this.LJLJJI);
        } finally {
            this.LJLJJI.LJJ();
        }
    }

    @Override // X.AbstractC25580zS
    public final boolean LJIIIZ() {
        return this.LJLJL.LJFF.LJZI;
    }

    @Override // X.AbstractC25580zS
    public final C281318n LJ() {
        return this.LJLJJI;
    }

    @Override // X.C02J
    public final void LIZ(C281318n c281318n) {
        if (this.LJLJJL == null) {
            return;
        }
        LJIIIIZZ();
        ActionMenuPresenter actionMenuPresenter = this.LJLJL.LJFF.LJLJJI;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.LJIILIIL();
        }
    }

    @Override // X.AbstractC25580zS
    public final void LJIIJ(View view) {
        this.LJLJL.LJFF.setCustomView(view);
        this.LJLJJLL = new WeakReference<>(view);
    }

    @Override // X.AbstractC25580zS
    public final void LJIIJJI(int i) {
        LJIIL(this.LJLJL.LIZ.getResources().getString(i));
    }

    @Override // X.AbstractC25580zS
    public final void LJIIL(CharSequence charSequence) {
        this.LJLJL.LJFF.setSubtitle(charSequence);
    }

    @Override // X.AbstractC25580zS
    public final void LJIILIIL(int i) {
        LJIILJJIL(this.LJLJL.LIZ.getResources().getString(i));
    }

    @Override // X.AbstractC25580zS
    public final void LJIILJJIL(CharSequence charSequence) {
        this.LJLJL.LJFF.setTitle(charSequence);
    }

    @Override // X.AbstractC25580zS
    public final void LJIILL(boolean z) {
        this.LJLILLLLZI = z;
        this.LJLJL.LJFF.setTitleOptional(z);
    }

    @Override // X.C02J
    public final boolean LIZIZ(C281318n c281318n, MenuItem menuItem) {
        InterfaceC25570zR interfaceC25570zR = this.LJLJJL;
        if (interfaceC25570zR != null) {
            return interfaceC25570zR.LIZLLL(this, menuItem);
        }
        return false;
    }

    public C280618g(C280718h c280718h, Context context, C18N c18n) {
        this.LJLJL = c280718h;
        this.LJLJI = context;
        this.LJLJJL = c18n;
        C281318n c281318n = new C281318n(context);
        c281318n.LJIIJJI = 1;
        this.LJLJJI = c281318n;
        c281318n.LJ = this;
    }
}
