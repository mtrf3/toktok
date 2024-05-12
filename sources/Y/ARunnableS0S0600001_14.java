package Y;

import X.C16360ka;
import X.C77357UXp;
import X.C78866UxK;
import X.C82000WGe;
import X.C82011WGp;
import X.C82158WMg;
import X.InterfaceC77358UXq;
import X.WGQ;
import X.WME;
import X.WN4;
import X.WN7;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS180S0100000_14;

/* loaded from: classes15.dex */
public class ARunnableS0S0600001_14 implements Runnable {
    public final int $t;
    public float f6;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

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
        boolean z;
        boolean z2;
        boolean z3;
        C82000WGe c82000WGe = (C82000WGe) this.l5;
        c82000WGe.LLF = null;
        RectF rectF = c82000WGe.LJLLLL;
        if (rectF == null || rectF.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        Rect rect = (Rect) this.l0;
        if (rect == null || rect.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        Rect rect2 = (Rect) this.l1;
        if (rect2 == null || rect2.isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z || z2 || z3) {
            ((C82000WGe) this.l5).LLD = new AnimatorSet();
            ((C82000WGe) this.l5).LLD.addListener(new ALAdapterS11S0100000_14(this, 40));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new AUListenerS101S0100000_14(this, 49));
            ((C82000WGe) this.l5).LLD.playTogether(ofFloat);
            C82000WGe c82000WGe2 = (C82000WGe) this.l5;
            c82000WGe2.LLD.setInterpolator(c82000WGe2.getInterpolator());
            ((C82000WGe) this.l5).LLD.setDuration(200L);
            ((C82000WGe) this.l5).LLD.start();
            return;
        }
        int[] iArr = new int[2];
        ((C82000WGe) this.l5).getLocationOnScreen(iArr);
        ((Rect) this.l0).offset(-iArr[0], -iArr[1]);
        ((Rect) this.l1).offset(-iArr[0], -iArr[1]);
        Animator LJFF = ((C82000WGe) this.l5).LJFF(new Matrix(((C82000WGe) this.l5).LJ((Rect) this.l0, (InterfaceC77358UXq) this.l2)), new Matrix(((C82000WGe) this.l5).LL), (WGQ) this.l3);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new AUListenerS101S0100000_14(this, 50));
        WGQ wgq = (WGQ) this.l3;
        if (wgq != null) {
            ofFloat2.setDuration(wgq.LJII);
            ofFloat2.setInterpolator(((WGQ) this.l3).LIZLLL);
        }
        ArrayList arrayList = new ArrayList();
        Rect rect3 = new Rect((Rect) this.l0);
        int[] iArr2 = (int[]) this.l4;
        if (iArr2 != null) {
            if (iArr2.length == 4) {
                rect3.left += iArr2[0];
                rect3.top += iArr2[1];
                rect3.right -= iArr2[2];
                rect3.bottom -= iArr2[3];
            } else {
                throw new IllegalArgumentException("maskInsetPixel length must equal 4");
            }
        }
        arrayList.add(((C82000WGe) this.l5).LIZLLL(rect3, (Rect) this.l1, this.f6, false));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        WGQ wgq2 = (WGQ) this.l3;
        if (wgq2 != null) {
            animatorSet.setDuration(wgq2.LJI);
            animatorSet.setInterpolator(((WGQ) this.l3).LIZJ);
        }
        ((C82000WGe) this.l5).LLD = new AnimatorSet();
        ((C82000WGe) this.l5).LLD.addListener(new ALAdapterS11S0100000_14(this, 41));
        ((C82000WGe) this.l5).LLD.playTogether(LJFF, animatorSet, ofFloat2);
        C82000WGe c82000WGe3 = (C82000WGe) this.l5;
        c82000WGe3.LLD.setInterpolator(c82000WGe3.getInterpolator());
        if (((WGQ) this.l3) == null) {
            ((C82000WGe) this.l5).LLD.setDuration(200L);
        }
        ((C82000WGe) this.l5).LLD.start();
    }

    public final void LIZ$1() {
        if (!((C82158WMg) this.l0).LIZLLL) {
            ((View) this.l1).setVisibility(8);
        }
        float f = this.f6;
        if (f > 0.0f) {
            C16360ka.LJIJ((View) this.l1, f);
        }
        WN7.LIZIZ((View) this.l1);
        WN7.LIZIZ((View) this.l2);
        if (((C82158WMg) this.l3).LIZJ.value < WME.VIEW_CREATED.value) {
            ((WN4) this.l5).LIZ.getOverlay().remove((View) this.l1);
        }
        ((Runnable) this.l4).run();
    }

    public final void LIZ$2() {
        boolean z;
        boolean z2;
        boolean z3;
        Rect rect;
        Rect rect2 = ((C82011WGp) this.l0).LJLLLL;
        if (rect2 != null) {
            z = rect2.isEmpty();
        } else {
            z = true;
        }
        Rect rect3 = (Rect) this.l1;
        if (rect3 != null) {
            z2 = rect3.isEmpty();
        } else {
            z2 = true;
        }
        Rect rect4 = (Rect) this.l2;
        if (rect4 != null) {
            z3 = rect4.isEmpty();
        } else {
            z3 = true;
        }
        if (z || z2 || z3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new AUListenerS101S0100000_14((C82011WGp) this.l0, 55));
            ((C82011WGp) this.l0).LLD = new AnimatorSet();
            C82011WGp c82011WGp = (C82011WGp) this.l0;
            AnimatorSet animatorSet = c82011WGp.LLD;
            if (animatorSet != null) {
                animatorSet.addListener(new ALAdapterS11S0100000_14(c82011WGp, 45));
                animatorSet.playTogether(ofFloat);
                animatorSet.setInterpolator(c82011WGp.LLI);
                animatorSet.setDuration(200L);
                animatorSet.start();
                return;
            }
            return;
        }
        Rect rect5 = (Rect) this.l1;
        if (rect5 == null || (rect = (Rect) this.l2) == null) {
            return;
        }
        int[] iArr = new int[2];
        ((C82011WGp) this.l0).getLocationOnScreen(iArr);
        rect5.offset(-iArr[0], -iArr[1]);
        rect.offset(-iArr[0], -iArr[1]);
        Matrix matrix = new Matrix(C78866UxK.LJJIL((Rect) this.l1, ((C82011WGp) this.l0).getWidth(), ((C82011WGp) this.l0).getHeight(), ((C82011WGp) this.l0).LJLLLL, (InterfaceC77358UXq) this.l3));
        Matrix matrix2 = new Matrix();
        C82011WGp c82011WGp2 = (C82011WGp) this.l0;
        AnimatorSet LJJJI = C78866UxK.LJJJI(matrix, matrix2, c82011WGp2.LJLLLL, (WGQ) this.l4, new AqS180S0100000_14(c82011WGp2, 368));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        WGQ wgq = (WGQ) this.l4;
        ofFloat2.addUpdateListener(new AUListenerS101S0100000_14((C82011WGp) this.l0, 54));
        ofFloat2.setDuration(wgq.LJII);
        ofFloat2.setInterpolator(wgq.LIZLLL);
        Rect rect6 = new Rect((Rect) this.l1);
        int[] iArr2 = (int[]) this.l5;
        if (iArr2 != null) {
            if (iArr2.length == 4) {
                rect6.left += iArr2[0];
                rect6.top += iArr2[1];
                rect6.right -= iArr2[2];
                rect6.bottom -= iArr2[3];
            } else {
                "maskInsetPixel length must equal 4".toString();
                throw new IllegalArgumentException("maskInsetPixel length must equal 4");
            }
        }
        Animator LIZLLL = ((C82011WGp) this.l0).LIZLLL(rect6, (Rect) this.l2, this.f6, false);
        WGQ wgq2 = (WGQ) this.l4;
        LIZLLL.setDuration(wgq2.LJI);
        LIZLLL.setInterpolator(wgq2.LIZJ);
        ((C82011WGp) this.l0).LLD = new AnimatorSet();
        C82011WGp c82011WGp3 = (C82011WGp) this.l0;
        AnimatorSet animatorSet2 = c82011WGp3.LLD;
        if (animatorSet2 != null) {
            animatorSet2.addListener(new ALAdapterS11S0100000_14(c82011WGp3, 46));
            animatorSet2.playTogether(LJJJI, LIZLLL, ofFloat2);
            animatorSet2.setInterpolator(c82011WGp3.LLI);
            animatorSet2.setDuration(200L);
            animatorSet2.start();
        }
    }

    public static final void run$0(ARunnableS0S0600001_14 aRunnableS0S0600001_14) {
        boolean LIZ;
        try {
            aRunnableS0S0600001_14.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S0600001_14 aRunnableS0S0600001_14) {
        boolean LIZ;
        try {
            aRunnableS0S0600001_14.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS0S0600001_14 aRunnableS0S0600001_14) {
        boolean LIZ;
        try {
            aRunnableS0S0600001_14.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S0600001_14(C82000WGe c82000WGe, Rect rect, Rect rect2, C77357UXp c77357UXp, WGQ wgq, int i) {
        this.$t = i;
        this.l5 = c82000WGe;
        this.l0 = rect;
        this.l1 = rect2;
        this.l2 = c77357UXp;
        this.l3 = wgq;
        this.l4 = null;
        this.f6 = 0.0f;
    }

    public ARunnableS0S0600001_14(C82011WGp c82011WGp, Rect rect, Rect rect2, C77357UXp c77357UXp, WGQ wgq, int i) {
        this.$t = i;
        this.l0 = c82011WGp;
        this.l1 = rect;
        this.l2 = rect2;
        this.l3 = c77357UXp;
        this.l4 = wgq;
        this.f6 = 0.0f;
        this.l5 = null;
    }

    public ARunnableS0S0600001_14(WN4 wn4, C82158WMg c82158WMg, View view, float f, View view2, C82158WMg c82158WMg2, Runnable runnable, int i) {
        this.$t = i;
        this.l5 = wn4;
        this.l0 = c82158WMg;
        this.l1 = view;
        this.f6 = f;
        this.l2 = view2;
        this.l3 = c82158WMg2;
        this.l4 = runnable;
    }
}
