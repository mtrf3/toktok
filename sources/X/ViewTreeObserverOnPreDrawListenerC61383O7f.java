package X;

import android.view.ViewTreeObserver;

/* renamed from: X.O7f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewTreeObserverOnPreDrawListenerC61383O7f implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ O7W LJLIL;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        O7W o7w = this.LJLIL;
        O7E o7e = o7w.LLIFFJFJJ;
        if (o7e != null && o7e.LLFZ == 0 && o7e.LL == 0) {
            o7w.LJII(0);
        }
        this.LJLIL.getViewTreeObserver().removeOnPreDrawListener(this);
        if (!C61359O6h.LJII().LJIIJ) {
            O7W o7w2 = this.LJLIL;
            o7w2.LLIIII.removeMessages(1);
            o7w2.LLIIII.sendEmptyMessageDelayed(1, o7w2.LLFF);
        }
        O7W o7w3 = this.LJLIL;
        InterfaceC61356O6e interfaceC61356O6e = o7w3.LLII;
        O7E o7e2 = o7w3.LLIFFJFJJ;
        ((O7F) interfaceC61356O6e).LIZ.LIZ(o7e2.LJLL, o7e2.LJLZ);
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC61383O7f(O7W o7w) {
        this.LJLIL = o7w;
    }
}
