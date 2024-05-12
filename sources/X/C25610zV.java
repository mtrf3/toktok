package X;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* renamed from: X.0zV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25610zV extends ActionMode {
    public final Context LIZ;
    public final AbstractC25580zS LIZIZ;

    @Override // android.view.ActionMode
    public final void finish() {
        this.LIZIZ.LIZJ();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.LIZIZ.LIZLLL();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC37401dQ(this.LIZ, this.LIZIZ.LJ());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.LIZIZ.LJFF();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.LIZIZ.LJI();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.LIZIZ.LJLIL;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.LIZIZ.LJII();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.LIZIZ.LJLILLLLZI;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.LIZIZ.LJIIIIZZ();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.LIZIZ.LJIIIZ();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.LIZIZ.LJIIJ(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.LIZIZ.LJIIJJI(i);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.LIZIZ.LJLIL = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.LIZIZ.LJIILIIL(i);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.LIZIZ.LJIILL(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.LIZIZ.LJIIL(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.LIZIZ.LJIILJJIL(charSequence);
    }

    public C25610zV(Context context, AbstractC25580zS abstractC25580zS) {
        this.LIZ = context;
        this.LIZIZ = abstractC25580zS;
    }
}
