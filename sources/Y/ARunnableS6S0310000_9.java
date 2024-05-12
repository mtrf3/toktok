package Y;

import X.C36922EeM;
import X.C50420Jqa;
import X.C53665L4j;
import X.C54066LJu;
import X.C55366LoA;
import X.C55369LoD;
import X.EnumC53663L4h;
import X.MEG;
import X.MEJ;
import X.X1D;
import android.animation.ValueAnimator;
import android.view.View;
import com.ss.android.ugc.aweme.avatar.vm.AvatarControllerVM;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ARunnableS6S0310000_9 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        MEG meg = (MEG) this.l0;
        C50420Jqa c50420Jqa = (C50420Jqa) this.l1;
        MEJ mej = (MEJ) this.l2;
        boolean z = this.z3;
        View view = (View) ((HashMap) meg.LJFF).get(mej);
        if (view != null) {
            meg.LIZJ.getLayoutParams().height = meg.LIZ();
            if (z) {
                if (meg.LIZLLL.contains(view)) {
                    meg.LIZLLL.remove(view);
                    String LIZJ = meg.LIZJ();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Try push a view already in the stack; controller: ");
                    LIZ.append(mej);
                    LIZ.append("; event: ");
                    LIZ.append(c50420Jqa);
                    C36922EeM.LIZLLL(5, LIZJ, X1D.LIZIZ(LIZ));
                }
                if (meg.LIZLLL.empty()) {
                    meg.LJ(false);
                }
                meg.LIZLLL.push(view);
                if (!(view instanceof C54066LJu)) {
                    meg.LIZJ.removeAllViews();
                    meg.LIZJ.addView(view);
                }
                meg.LJFF();
            } else if (!meg.LIZLLL.empty()) {
                View lastElement = meg.LIZLLL.lastElement();
                if (o.LJ(lastElement, view)) {
                    View pop = meg.LIZLLL.pop();
                    if (!o.LJ(lastElement, pop) || (!(lastElement instanceof C54066LJu) && !o.LJ(lastElement, meg.LIZJ.getChildAt(0)))) {
                        String LIZJ2 = meg.LIZJ();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("something wrong with view stack management!!! controller: ");
                        LIZ2.append(mej);
                        LIZ2.append("; topView: ");
                        LIZ2.append(lastElement);
                        LIZ2.append("; popView: ");
                        LIZ2.append(pop);
                        LIZ2.append("; containerShownView: ");
                        LIZ2.append(meg.LIZJ.getChildAt(0));
                        LIZ2.append("; map: ");
                        LIZ2.append(meg.LJFF);
                        C36922EeM.LIZLLL(6, LIZJ2, X1D.LIZIZ(LIZ2));
                    }
                    if (meg.LIZLLL.empty()) {
                        meg.LIZJ.removeAllViews();
                        meg.LJ(true);
                    } else {
                        View lastElement2 = meg.LIZLLL.lastElement();
                        if (!(lastElement2 instanceof C54066LJu)) {
                            meg.LIZJ.removeAllViews();
                            meg.LIZJ.addView(lastElement2);
                        }
                    }
                    meg.LJFF();
                } else if (meg.LIZLLL.contains(view)) {
                    String LIZJ3 = meg.LIZJ();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Try pop a view not on the top but in the stack; controller: ");
                    LIZ3.append(mej);
                    LIZ3.append("; event: ");
                    LIZ3.append(c50420Jqa);
                    C36922EeM.LIZLLL(5, LIZJ3, X1D.LIZIZ(LIZ3));
                    meg.LIZLLL.remove(view);
                } else {
                    String LIZJ4 = meg.LIZJ();
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("Try pop a view not in the stack; controller: ");
                    LIZ4.append(mej);
                    LIZ4.append("; event: ");
                    LIZ4.append(c50420Jqa);
                    C36922EeM.LIZLLL(5, LIZJ4, X1D.LIZIZ(LIZ4));
                }
            }
        }
        Aweme LIZIZ = ((MEG) this.l0).LIZIZ();
        if (LIZIZ != null) {
            ((MEJ) this.l2).LIZ((C50420Jqa) this.l1, LIZIZ, this.z3);
        }
    }

    public static final void run$0(ARunnableS6S0310000_9 aRunnableS6S0310000_9) {
        boolean LIZ;
        try {
            AvatarControllerVM LJIL = ((C53665L4j) aRunnableS6S0310000_9.l0).LJIL();
            Object obj = aRunnableS6S0310000_9.l1;
            boolean z = aRunnableS6S0310000_9.z3;
            EnumC53663L4h enumC53663L4h = (EnumC53663L4h) aRunnableS6S0310000_9.l2;
            if (obj == null) {
                LJIL.getClass();
            } else {
                LJIL.iv0(enumC53663L4h, obj, LJIL.LJLIL, z);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS6S0310000_9 aRunnableS6S0310000_9) {
        C55369LoD c55369LoD;
        DetailFragmentPanel detailFragmentPanel = (DetailFragmentPanel) aRunnableS6S0310000_9.l0;
        boolean z = aRunnableS6S0310000_9.z3;
        Aweme aweme = (Aweme) aRunnableS6S0310000_9.l1;
        ValueAnimator valueAnimator = (ValueAnimator) aRunnableS6S0310000_9.l2;
        C55366LoA c55366LoA = detailFragmentPanel.LLIIIL;
        if (c55366LoA != null && (c55369LoD = c55366LoA.LJLIL) != null) {
            c55369LoD.LJI(z, aweme, valueAnimator);
        }
    }

    public static final void run$2(ARunnableS6S0310000_9 aRunnableS6S0310000_9) {
        boolean LIZ;
        try {
            aRunnableS6S0310000_9.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS6S0310000_9(DetailFragmentPanel detailFragmentPanel, int i) {
        this.$t = i;
        this.l0 = detailFragmentPanel;
        this.z3 = false;
        this.l1 = null;
        this.l2 = null;
    }

    public ARunnableS6S0310000_9(C53665L4j c53665L4j, Object obj, EnumC53663L4h enumC53663L4h, int i) {
        this.$t = i;
        this.l0 = c53665L4j;
        this.l1 = obj;
        this.z3 = false;
        this.l2 = enumC53663L4h;
    }

    public ARunnableS6S0310000_9(MEG meg, C50420Jqa c50420Jqa, MEJ mej, boolean z, int i) {
        this.$t = i;
        this.l0 = meg;
        this.l1 = c50420Jqa;
        this.l2 = mej;
        this.z3 = z;
    }
}
