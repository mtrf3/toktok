package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class N6P implements JK9 {
    public final C58809N6f LJLIL;
    public final List<N6Q<View>> LJLILLLLZI;
    public List<? extends N6Q<? extends View>> LJLJI;

    public abstract void LIZ();

    public abstract void LIZIZ();

    @Override // X.JK9
    public void LLLLZI() {
        ViewGroup viewGroup = this.LJLIL.LIZIZ;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.setVisibility(8);
        }
        LIZIZ();
        ViewGroup viewGroup2 = this.LJLIL.LIZIZ;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        LIZ();
        List<N6Q<View>> list = this.LJLILLLLZI;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((N6Q) next).LIZJ(this.LJLIL)) {
                arrayList.add(next);
            }
        }
        this.LJLJI = arrayList;
        List<N6Q<View>> list2 = this.LJLILLLLZI;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((ArrayList) list2).iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (!((N6Q) next2).LIZJ(this.LJLIL)) {
                arrayList2.add(next2);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            View LIZ = ((N6Q) it3.next()).LIZ();
            if (LIZ != null) {
                LIZ.setVisibility(8);
            }
        }
        Iterator it4 = ((ArrayList) this.LJLJI).iterator();
        while (it4.hasNext()) {
            ((N6Q) it4.next()).LLLLZI();
        }
    }

    @Override // X.JK9
    public final void onViewAttachedToWindow() {
        Iterator<? extends N6Q<? extends View>> it = this.LJLJI.iterator();
        while (it.hasNext()) {
            it.next().onViewAttachedToWindow();
        }
    }

    @Override // X.JK9
    public final void onViewDetachedFromWindow() {
        Iterator<? extends N6Q<? extends View>> it = this.LJLJI.iterator();
        while (it.hasNext()) {
            it.next().onViewDetachedFromWindow();
        }
    }

    public N6P(C58809N6f c58809N6f) {
        this.LJLIL = c58809N6f;
        c58809N6f.LJI.getAweme();
        ViewGroup viewGroup = c58809N6f.LIZ;
        if (viewGroup != null) {
            viewGroup.getContext();
        }
        this.LJLILLLLZI = new ArrayList();
        this.LJLJI = new ArrayList();
    }
}
