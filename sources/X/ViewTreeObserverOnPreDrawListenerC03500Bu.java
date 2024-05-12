package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0Bu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class ViewTreeObserverOnPreDrawListenerC03500Bu implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final AbstractC03490Bt LJLIL;
    public final ViewGroup LJLILLLLZI;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c2 A[EDGE_INSN: B:121:0x01c2->B:122:0x01c2 BREAK  A[LOOP:1: B:17:0x0099->B:50:0x00ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewTreeObserverOnPreDrawListenerC03500Bu.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.LJLILLLLZI.getViewTreeObserver().removeOnPreDrawListener(this);
        this.LJLILLLLZI.removeOnAttachStateChangeListener(this);
        C03510Bv.LIZJ.remove(this.LJLILLLLZI);
        ArrayList<AbstractC03490Bt> orDefault = C03510Bv.LIZJ().getOrDefault(this.LJLILLLLZI, null);
        if (orDefault != null && orDefault.size() > 0) {
            Iterator<AbstractC03490Bt> it = orDefault.iterator();
            while (it.hasNext()) {
                it.next().LJJI(this.LJLILLLLZI);
            }
        }
        this.LJLIL.LJIIIIZZ(true);
    }

    public ViewTreeObserverOnPreDrawListenerC03500Bu(ViewGroup viewGroup, AbstractC03490Bt abstractC03490Bt) {
        this.LJLIL = abstractC03490Bt;
        this.LJLILLLLZI = viewGroup;
    }
}
