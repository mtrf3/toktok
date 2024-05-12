package X;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuPresenter;
import java.lang.ref.WeakReference;

/* renamed from: X.1bq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36421bq extends AbstractC25580zS implements C02J {
    public final Context LJLJI;
    public final C281718r LJLJJI;
    public final InterfaceC25570zR LJLJJL;
    public WeakReference<View> LJLJJLL;
    public boolean LJLJL;
    public final C281318n LJLJLJ;

    @Override // X.AbstractC25580zS
    public final void LIZJ() {
        if (this.LJLJL) {
            return;
        }
        this.LJLJL = true;
        this.LJLJJL.LIZJ(this);
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
        return new C25650zZ(this.LJLJJI.getContext());
    }

    @Override // X.AbstractC25580zS
    public final CharSequence LJI() {
        return this.LJLJJI.getSubtitle();
    }

    @Override // X.AbstractC25580zS
    public final CharSequence LJII() {
        return this.LJLJJI.getTitle();
    }

    @Override // X.AbstractC25580zS
    public final void LJIIIIZZ() {
        this.LJLJJL.LIZIZ(this, this.LJLJLJ);
    }

    @Override // X.AbstractC25580zS
    public final boolean LJIIIZ() {
        return this.LJLJJI.LJZI;
    }

    @Override // X.AbstractC25580zS
    public final C281318n LJ() {
        return this.LJLJLJ;
    }

    @Override // X.C02J
    public final void LIZ(C281318n c281318n) {
        LJIIIIZZ();
        ActionMenuPresenter actionMenuPresenter = this.LJLJJI.LJLJJI;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.LJIILIIL();
        }
    }

    @Override // X.AbstractC25580zS
    public final void LJIIJ(View view) {
        WeakReference<View> weakReference;
        this.LJLJJI.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference<>(view);
        } else {
            weakReference = null;
        }
        this.LJLJJLL = weakReference;
    }

    @Override // X.AbstractC25580zS
    public final void LJIIJJI(int i) {
        LJIIL(this.LJLJI.getString(i));
    }

    @Override // X.AbstractC25580zS
    public final void LJIIL(CharSequence charSequence) {
        this.LJLJJI.setSubtitle(charSequence);
    }

    @Override // X.AbstractC25580zS
    public final void LJIILIIL(int i) {
        LJIILJJIL(this.LJLJI.getString(i));
    }

    @Override // X.AbstractC25580zS
    public final void LJIILJJIL(CharSequence charSequence) {
        this.LJLJJI.setTitle(charSequence);
    }

    @Override // X.AbstractC25580zS
    public final void LJIILL(boolean z) {
        this.LJLILLLLZI = z;
        this.LJLJJI.setTitleOptional(z);
    }

    @Override // X.C02J
    public final boolean LIZIZ(C281318n c281318n, MenuItem menuItem) {
        return this.LJLJJL.LIZLLL(this, menuItem);
    }

    public C36421bq(Context context, C281718r c281718r, InterfaceC25570zR interfaceC25570zR) {
        this.LJLJI = context;
        this.LJLJJI = c281718r;
        this.LJLJJL = interfaceC25570zR;
        C281318n c281318n = new C281318n(c281718r.getContext());
        c281318n.LJIIJJI = 1;
        this.LJLJLJ = c281318n;
        c281318n.LJ = this;
    }
}
