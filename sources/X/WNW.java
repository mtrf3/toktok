package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class WNW extends WNY {
    public final ArrayList LJLJJI;

    public WNW() {
        ArrayList arrayList = new ArrayList();
        this.LJLJJI = arrayList;
        arrayList.add(new C82178WNa());
        arrayList.add(new WNX());
    }

    @Override // X.WNY
    public final void LIZIZ(boolean z) {
        Iterator it = this.LJLJJI.iterator();
        while (it.hasNext()) {
            ((WNY) it.next()).LIZIZ(z);
        }
    }

    @Override // X.WNY
    public final WNT LIZJ(boolean z) {
        WNV wnv = new WNV();
        Iterator it = this.LJLJJI.iterator();
        while (it.hasNext()) {
            ((ArrayList) wnv.LIZJ).add(((WNY) it.next()).LIZJ(z));
        }
        return wnv;
    }

    @Override // X.WNY
    public final Animator LIZLLL(boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.LJLJJI.iterator();
        while (it.hasNext()) {
            arrayList.add(((WNY) it.next()).LIZLLL(z));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    @Override // X.WNY
    public final void LIZ(View view, View view2, View view3) {
        super.LIZ(view, view2, view3);
        Iterator it = this.LJLJJI.iterator();
        while (it.hasNext()) {
            ((WNY) it.next()).LIZ(view, view2, view3);
        }
    }
}
