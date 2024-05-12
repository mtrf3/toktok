package X;

import android.graphics.Rect;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.VUh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79819VUh implements VV1 {
    public final VNL LIZ;
    public final Handler LIZIZ;
    public final RunnableC79821VUj LIZJ;
    public final RecyclerView LIZLLL;
    public final HashSet<C79820VUi> LJ = new HashSet<>();
    public final Rect LJFF;
    public final int[] LJI;
    public final Rect LJII;
    public long LJIIIIZZ;

    @Override // X.VV1
    public final void LIZ(C79831VUt c79831VUt) {
    }

    @Override // X.VV1
    public final void LIZIZ() {
        LJ(false);
    }

    @Override // X.VV1
    public final void LIZJ(C79831VUt c79831VUt) {
    }

    @Override // X.VV1
    public final void LIZLLL(C79831VUt c79831VUt) {
    }

    public final void LJ(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!z && currentTimeMillis - this.LJIIIIZZ < 200) {
            return;
        }
        this.LJIIIIZZ = currentTimeMillis;
        this.LIZIZ.removeCallbacks(this.LIZJ);
        System.nanoTime();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.LIZLLL.getChildCount(); i++) {
            View childAt = this.LIZLLL.getChildAt(i);
            C79831VUt c79831VUt = (C79831VUt) this.LIZLLL.LJJJJJL(childAt);
            UIComponent uIComponent = c79831VUt.LJLIL.LJLILLLLZI;
            if (uIComponent != null && uIComponent.getEvents() != null && (uIComponent.getEvents().containsKey("nodeappear") | uIComponent.getEvents().containsKey("nodedisappear"))) {
                this.LJII.set(0, 0, childAt.getWidth(), childAt.getHeight());
                childAt.getLocationOnScreen(this.LJI);
                Rect rect = this.LJII;
                int[] iArr = this.LJI;
                rect.offset(iArr[0], iArr[1]);
                if (this.LJII.intersect(this.LJFF)) {
                    C79820VUi c79820VUi = new C79820VUi(c79831VUt.LJLIL.LJLILLLLZI.getSign(), c79831VUt.getLayoutPosition(), c79831VUt.LJLIL.LJLILLLLZI.LJLIL);
                    hashSet.add(c79820VUi);
                    if (!this.LJ.contains(c79820VUi)) {
                        arrayList.add(c79820VUi);
                    }
                }
            }
        }
        this.LJ.removeAll(hashSet);
        Iterator<C79820VUi> it = this.LJ.iterator();
        while (it.hasNext()) {
            LJFF("nodedisappear", it.next());
        }
        this.LJ.clear();
        this.LJ.addAll(hashSet);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            LJFF("nodeappear", (C79820VUi) it2.next());
        }
        if (!z) {
            this.LIZIZ.postDelayed(this.LIZJ, 200L);
        }
    }

    public C79819VUh(VNL vnl, RecyclerView recyclerView) {
        Rect rect = new Rect();
        this.LJFF = rect;
        this.LJI = new int[2];
        this.LJII = new Rect();
        this.LJIIIIZZ = 0L;
        DisplayMetrics LIZ = DisplayMetricsHolder.LIZ(recyclerView.getContext());
        rect.set(0, 0, LIZ.widthPixels, LIZ.heightPixels);
        this.LIZ = vnl;
        this.LIZIZ = new Handler(C16880lQ.LLJJJJ());
        this.LIZJ = new RunnableC79821VUj(this);
        this.LIZLLL = recyclerView;
        recyclerView.LJIIJJI(new C79822VUk(this));
        ViewTreeObserver viewTreeObserver = recyclerView.getViewTreeObserver();
        viewTreeObserver.addOnDrawListener(new ViewTreeObserverOnDrawListenerC79823VUl(this));
        viewTreeObserver.addOnScrollChangedListener(new ViewTreeObserverOnScrollChangedListenerC79824VUm(this));
    }

    public final void LJFF(String str, C79820VUi c79820VUi) {
        VUO vuo = new VUO(c79820VUi.LIZ, str);
        vuo.LIZJ(Integer.valueOf(c79820VUi.LIZIZ), "position");
        vuo.LIZJ(c79820VUi.LIZJ, "key");
        this.LIZ.LIZIZ(vuo);
    }
}
