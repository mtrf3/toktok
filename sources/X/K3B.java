package X;

import Y.IDrS47S0100000_8;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;
import o3.h0;

/* loaded from: classes9.dex */
public final class K3B implements C48X {
    public final RecyclerView LIZ;
    public Integer LIZIZ;
    public OSZ<Integer, Integer> LIZJ;
    public OSZ<Integer, Integer> LIZLLL;
    public boolean LJ;
    public RecyclerView LJFF;
    public View LJI;
    public boolean LJII;
    public InterfaceC65784Pro<C76800UCe> LJIIIIZZ;
    public final IDrS47S0100000_8 LJIIIZ;
    public final IDrS47S0100000_8 LJIIJ;

    public final void LIZJ() {
        this.LJ = false;
        LIZ();
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJIIIIZZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        this.LJIIIIZZ = null;
    }

    @Override // X.C48X
    public final void LIZ() {
        this.LIZ.LJJLL(this.LJIIIZ);
        RecyclerView recyclerView = this.LJFF;
        if (recyclerView != null) {
            recyclerView.LJJLL(this.LJIIJ);
        }
    }

    public final void LJ() {
        C0A2 layoutManager;
        View LJJIJIL;
        Integer num = this.LIZIZ;
        if (num != null && num.intValue() >= 0 && 1 != 0 && num != null) {
            int intValue = num.intValue();
            RecyclerView recyclerView = this.LJFF;
            if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (LJJIJIL = layoutManager.LJJIJIL(intValue)) != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(LJJIJIL, (Property<View, Float>) View.SCALE_X, 1.0f, 1.0425532f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(LJJIJIL, (Property<View, Float>) View.SCALE_Y, 1.0f, 1.0425532f);
                animatorSet.setDuration(240L);
                animatorSet.setInterpolator(C55953Lxd.LJI());
                animatorSet.playTogether(ofFloat, ofFloat2);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(LJJIJIL, (Property<View, Float>) View.SCALE_X, 1.0425532f, 1.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(LJJIJIL, (Property<View, Float>) View.SCALE_Y, 1.0425532f, 1.0f);
                animatorSet2.setDuration(200L);
                animatorSet2.setInterpolator(C55953Lxd.LJI());
                animatorSet2.playTogether(ofFloat3, ofFloat4);
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.play(animatorSet2).after(animatorSet);
                animatorSet3.start();
            }
        }
        LIZJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r2 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF() {
        /*
            r12 = this;
            androidx.recyclerview.widget.RecyclerView r6 = r12.LJFF
            if (r6 == 0) goto L86
            java.lang.Integer r1 = r12.LIZIZ
            if (r1 == 0) goto L86
            int r0 = r1.intValue()
            if (r0 < 0) goto L86
            int r2 = r1.intValue()
            boolean r0 = X.C90193gN.LIZ()
            if (r0 == 0) goto Le0
            r5 = -1
        L19:
            X.OSZ<java.lang.Integer, java.lang.Integer> r0 = r12.LIZJ
            java.lang.Object r0 = r0.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            X.OSZ<java.lang.Integer, java.lang.Integer> r0 = r12.LIZJ
            java.lang.Object r0 = r0.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            int r4 = r4 + r1
            X.0A2 r0 = r6.getLayoutManager()
            if (r0 == 0) goto Lb8
            android.view.View r0 = r0.LJJIJIL(r2)
            if (r0 == 0) goto Lb8
            X.OSZ r2 = LIZLLL(r0)
            if (r2 == 0) goto L86
        L44:
            X.OSZ r3 = LIZLLL(r6)
            boolean r0 = r12.LJII
            if (r0 == 0) goto L9f
            java.lang.Object r0 = r2.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r7 = r0.intValue()
            java.lang.Object r0 = r3.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r7 = r7 - r0
            int r4 = r4 * r5
            int r7 = r7 - r4
        L63:
            boolean r0 = r12.LJII
            if (r0 == 0) goto L8a
            boolean r0 = X.C90193gN.LIZ()
            if (r0 == 0) goto L6f
            if (r7 > 0) goto L77
        L6f:
            boolean r0 = X.C90193gN.LIZ()
            if (r0 != 0) goto L9b
            if (r7 >= 0) goto L9b
        L77:
            android.view.animation.Interpolator r9 = X.C55953Lxd.LJI()
            r8 = 0
            r10 = 300(0x12c, float:4.2E-43)
            r11 = r8
            r6.LJLIIL(r7, r8, r9, r10, r11)
        L82:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L89
        L86:
            r12.LIZJ()
        L89:
            return
        L8a:
            boolean r0 = X.C90193gN.LIZ()
            if (r0 == 0) goto L92
            if (r7 < 0) goto L77
        L92:
            boolean r0 = X.C90193gN.LIZ()
            if (r0 != 0) goto L9b
            if (r7 <= 0) goto L9b
            goto L77
        L9b:
            r12.LJ()
            goto L82
        L9f:
            java.lang.Object r0 = r2.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r3.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r1 - r0
            int r4 = r4 * r5
            int r4 = r4 + r1
            r7 = r4
            goto L63
        Lb8:
            X.OSZ<java.lang.Integer, java.lang.Integer> r3 = r12.LIZLLL
            if (r3 == 0) goto L86
            boolean r0 = X.C90193gN.LIZ()
            if (r0 == 0) goto Ld1
            X.OSZ r2 = new X.OSZ
            java.lang.Object r1 = r3.getSecond()
            java.lang.Object r0 = r3.getFirst()
            r2.<init>(r1, r0)
            goto L44
        Ld1:
            X.OSZ r2 = new X.OSZ
            java.lang.Object r1 = r3.getFirst()
            java.lang.Object r0 = r3.getSecond()
            r2.<init>(r1, r0)
            goto L44
        Le0:
            r5 = 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K3B.LJFF():void");
    }

    public K3B(RecyclerView parentRecyclerView) {
        o.LJIIIZ(parentRecyclerView, "parentRecyclerView");
        this.LIZ = parentRecyclerView;
        this.LIZJ = new OSZ<>(0, 0);
        this.LJIIIZ = new IDrS47S0100000_8(this, 8);
        this.LJIIJ = new IDrS47S0100000_8(this, 9);
    }

    public static OSZ LIZLLL(View view) {
        if (C90193gN.LIZ()) {
            return new OSZ(Integer.valueOf(view.getRight()), Integer.valueOf(view.getLeft()));
        }
        return new OSZ(Integer.valueOf(view.getLeft()), Integer.valueOf(view.getRight()));
    }

    @Override // X.C48X
    public final void LIZIZ(View view, RecyclerView recyclerView, int i, View view2, Integer num, OSZ<Integer, Integer> horizontalMargin, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        int i2;
        C07310Ql LIZ;
        int i3;
        boolean z;
        o.LJIIIZ(horizontalMargin, "horizontalMargin");
        this.LJFF = recyclerView;
        this.LJI = view;
        this.LIZIZ = Integer.valueOf(i);
        this.LIZJ = horizontalMargin;
        int i4 = 0;
        OSZ<Integer, Integer> osz = null;
        if (view2 != null) {
            int width = view2.getWidth();
            if (num != null) {
                if (C90193gN.LIZ()) {
                    i3 = -1;
                } else {
                    i3 = 1;
                }
                int intValue = i - num.intValue();
                if (intValue < 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.LJII = z;
                int intValue2 = (horizontalMargin.getSecond().intValue() + horizontalMargin.getFirst().intValue() + width) * intValue * i3;
                osz = new OSZ<>(Integer.valueOf(view2.getLeft() + intValue2), Integer.valueOf(view2.getRight() + intValue2));
            }
        }
        this.LIZLLL = osz;
        this.LJIIIIZZ = interfaceC65784Pro;
        this.LIZ.LJIIJJI(this.LJIIIZ);
        RecyclerView recyclerView2 = this.LJFF;
        if (recyclerView2 != null) {
            recyclerView2.LJIIJJI(this.LJIIJ);
        }
        View view3 = this.LJI;
        if (view3 != null && (!this.LJ)) {
            this.LJ = true;
            int[] iArr = {0, 0};
            Object parent = view3.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.View");
            View view4 = (View) parent;
            view4.getLocationInWindow(iArr);
            C16800lI LJIIIZ = h0.LJIIIZ(view3);
            if (LJIIIZ != null && (LIZ = LJIIIZ.LIZ(2)) != null) {
                i2 = LIZ.LIZLLL - LIZ.LIZIZ;
            } else {
                i2 = 0;
            }
            int height = ((view4.getHeight() + iArr[1]) - view3.getRootView().getHeight()) + i2;
            int bottom = view3.getBottom() - view4.getBottom();
            if (height >= 0) {
                i4 = height;
            }
            int i5 = bottom + i4;
            if (i5 > 0) {
                this.LIZ.LJLIIL(0, i5, C55953Lxd.LJI(), 300, false);
            } else {
                LJFF();
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        LIZJ();
    }
}
