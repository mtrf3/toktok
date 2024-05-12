package com.ss.android.ugc.aweme.views;

import X.AbstractC029409q;
import X.C0A2;
import X.C0A7;
import X.C0AC;
import X.C16880lQ;
import X.C80126VcY;
import X.C80129Vcb;
import X.C80131Vcd;
import X.C90193gN;
import X.MHJ;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public class SpannedGridLayoutManager extends C0A2 {
    public MHJ LJLZ;
    public int LJZ;
    public float LJZI;
    public int LJZL;
    public int[] LL;
    public int LLD;
    public int LLF;
    public int LLFF;
    public int LLFFF;
    public boolean LLFII;
    public SparseArray<C80131Vcd> LLFZ;
    public List<Integer> LLI;
    public int LLIFFJFJJ;
    public final Rect LLII = new Rect();

    @Override // X.C0A2
    public final boolean LLIIIJ() {
        return true;
    }

    @Override // X.C0A2
    public final RecyclerView.LayoutParams LJJIJL() {
        return new C80126VcY();
    }

    public final void LLIILZL() {
        int LLIIJI;
        int ceil = ((int) Math.ceil(this.LJLLLLLL / this.LJZL)) + 1;
        int i = this.LLIFFJFJJ;
        if (i < ceil) {
            LLIIJI = 0;
        } else {
            LLIIJI = LLIIJI(LLIIIL(i - ceil));
        }
        if (this.LLFF > LLIIJI) {
            this.LLFF = LLIIJI;
        }
        int LLIIIL = LLIIIL(this.LLFF);
        this.LLD = LLIIIL;
        this.LLFFF = this.LLFF;
        this.LLF = LLIIIL;
    }

    @Override // X.C0A2
    public final boolean LJJ(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof C80126VcY;
    }

    @Override // X.C0A2
    public final int LJJIIZI(C0AC c0ac) {
        return this.LJLLLLLL;
    }

    @Override // X.C0A2
    public final int LJJIJ(C0AC c0ac) {
        if (LJJJI() == 0) {
            return 0;
        }
        return ((this.LLFF * this.LJZL) + getPaddingTop()) - LJJJJLL(LJJJ(0));
    }

    @Override // X.C0A2
    public final int LJJIJIIJI(C0AC c0ac) {
        return getPaddingBottom() + getPaddingTop() + (((ArrayList) this.LLI).size() * this.LJZL);
    }

    @Override // X.C0A2
    public final View LJJIJIL(int i) {
        int i2 = this.LLD;
        if (i < i2 || i > this.LLF) {
            return null;
        }
        return LJJJ(i - i2);
    }

    @Override // X.C0A2
    public final RecyclerView.LayoutParams LJJIL(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C80126VcY((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C80126VcY(layoutParams);
    }

    @Override // X.C0A2
    public final void LJJLIIJ(AbstractC029409q abstractC029409q) {
        LJLLI();
        this.LLFZ = null;
        this.LLI = null;
        this.LLD = 0;
        this.LLFF = 0;
        this.LLF = 0;
        this.LLFFF = 0;
        this.LJZL = 0;
        this.LLFII = false;
    }

    @Override // X.C0A2
    public final void LJZL(int i) {
        if (i >= LJJJJZ()) {
            i = LJJJJZ() - 1;
        }
        this.LLFF = LLIIJI(i);
        LLIILZL();
        this.LLFII = true;
        LJLLI();
        LJZ();
    }

    public final int LLIIIL(int i) {
        return ((Integer) ListProtector.get(this.LLI, i)).intValue();
    }

    public final int LLIIJI(int i) {
        if (i < this.LLFZ.size()) {
            return this.LLFZ.get(i).LIZ;
        }
        return -1;
    }

    @Override // X.C0A2
    public final RecyclerView.LayoutParams LJJIJLIJ(Context context, AttributeSet attributeSet) {
        return new C80126VcY(context, attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x01ba  */
    @Override // X.C0A2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJJI(X.C0A7 r13, X.C0AC r14) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.views.SpannedGridLayoutManager.LJLJJI(X.0A7, X.0AC):void");
    }

    public final int LLIIIZ(int i, C0AC c0ac) {
        int LIZIZ;
        int LLIIIL = LLIIIL(i);
        do {
            i++;
            if (i >= ((ArrayList) this.LLI).size()) {
                break;
            }
        } while (LLIIIL(i) == LLIIIL);
        if (i != ((ArrayList) this.LLI).size()) {
            LIZIZ = LLIIIL(i);
        } else {
            LIZIZ = c0ac.LIZIZ();
        }
        return LIZIZ - 1;
    }

    public final void LLIIL(int i, int i2) {
        if (((ArrayList) this.LLI).size() < i + 1) {
            ((ArrayList) this.LLI).add(Integer.valueOf(i2));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 int, still in use, count: 1, list:
          (r2v3 int) from 0x002e: ARITH (r2v3 int) * (wrap:int:0x002c: IGET (r5v0 'this' com.ss.android.ugc.aweme.views.SpannedGridLayoutManager A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] (LINE:50331692) com.ss.android.ugc.aweme.views.SpannedGridLayoutManager.LJZL int) A[WRAPPED] (LINE:50331694)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:163)
        	at jadx.core.utils.InsnRemover.unbindAllArgs(InsnRemover.java:95)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:79)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:163)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:140)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:116)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    @Override // X.C0A2
    public final int LL(int r6, X.C0A7 r7, X.C0AC r8) {
        /*
            r5 = this;
            int r0 = r5.LJJJI()
            r4 = 0
            if (r0 == 0) goto L9
            if (r6 != 0) goto La
        L9:
            return r4
        La:
            android.view.View r0 = r5.LJJJ(r4)
            int r3 = r5.LJJJJLL(r0)
            if (r6 >= 0) goto L53
            int r0 = r5.LLFF
            if (r0 != 0) goto L22
            int r0 = r5.getPaddingTop()
            int r0 = r0 - r3
            int r0 = -r0
            int r6 = java.lang.Math.max(r6, r0)
        L22:
            int r0 = r3 - r6
            if (r0 < 0) goto L33
            int r2 = r5.LLFF
            int r1 = r2 + (-1)
            if (r1 < 0) goto L33
            int r0 = r5.LJZL
            int r2 = r2 * r0
            int r3 = r3 - r2
            r5.LLIIJLIL(r1, r3, r7, r8)
        L33:
            int r0 = r5.LLFFF
            int r1 = r5.LLIIIL(r0)
            int r0 = r5.LLD
            int r1 = r1 - r0
            android.view.View r0 = r5.LJJJ(r1)
            int r1 = r5.LJJJJLL(r0)
            int r1 = r1 - r6
            int r0 = r5.LJLLLLLL
            if (r1 <= r0) goto L4e
            int r0 = r5.LLFFF
            r5.LLIILII(r0, r7, r8)
        L4e:
            int r0 = -r6
            r5.LJJLIIIJLLLLLLLZ(r0)
            return r6
        L53:
            int r0 = r5.LJJJI()
            int r0 = r0 + (-1)
            android.view.View r0 = r5.LJJJ(r0)
            int r2 = r5.LJJJJIZL(r0)
            int r1 = r5.LLF
            int r0 = r5.LJJJJZ()
            int r0 = r0 + (-1)
            if (r1 != r0) goto L7c
            int r0 = r5.LJLLLLLL
            int r1 = r2 - r0
            int r0 = r5.getPaddingBottom()
            int r0 = r0 + r1
            int r0 = java.lang.Math.max(r0, r4)
            int r6 = java.lang.Math.min(r6, r0)
        L7c:
            int r2 = r2 - r6
            int r0 = r5.LJLLLLLL
            if (r2 >= r0) goto L98
            int r0 = r5.LLFFF
            int r2 = r0 + 1
            java.util.List<java.lang.Integer> r0 = r5.LLI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r2 >= r0) goto L98
            int r1 = r5.LLFF
            int r0 = r5.LJZL
            int r1 = r1 * r0
            int r3 = r3 - r1
            r5.LLIIJLIL(r2, r3, r7, r8)
        L98:
            int r0 = r5.LLFF
            int r1 = r5.LLIIIZ(r0, r8)
            int r0 = r5.LLD
            int r1 = r1 - r0
            android.view.View r0 = r5.LJJJ(r1)
            int r0 = r5.LJJJJIZL(r0)
            int r0 = r0 - r6
            if (r0 >= 0) goto L4e
            int r0 = r5.LLFF
            r5.LLIILII(r0, r7, r8)
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.views.SpannedGridLayoutManager.LL(int, X.0A7, X.0AC):int");
    }

    @Override // X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        if (i >= LJJJJZ()) {
            i = LJJJJZ() - 1;
        }
        C80129Vcb c80129Vcb = new C80129Vcb(this, recyclerView.getContext());
        c80129Vcb.LIZ = i;
        LLIIIILZ(c80129Vcb);
    }

    public final void LLIILII(int i, C0A7 c0a7, C0AC c0ac) {
        int LLIIIL = LLIIIL(i);
        int LLIIIZ = LLIIIZ(i, c0ac);
        for (int i2 = LLIIIZ; i2 >= LLIIIL; i2--) {
            LJLLLL(i2 - this.LLD, c0a7);
        }
        if (i == this.LLFF) {
            int i3 = LLIIIZ + 1;
            this.LLD = i3;
            this.LLFF = LLIIJI(i3);
        }
        if (i == this.LLFFF) {
            int i4 = LLIIIL - 1;
            this.LLF = i4;
            this.LLFFF = LLIIJI(i4);
        }
    }

    public final int LLIIZ(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - i2) - i3, mode);
        }
        return i;
    }

    public SpannedGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        int indexOf;
        this.LJZ = 1;
        this.LJZI = 1.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.wc, R.attr.bbw}, i, i2);
        this.LJZ = obtainStyledAttributes.getInt(1, 1);
        String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 0);
        if (LLLZLZ != null && (indexOf = LLLZLZ.indexOf(58)) >= 0 && indexOf < LLLZLZ.length() - 1) {
            String substring = LLLZLZ.substring(0, indexOf);
            String substring2 = LLLZLZ.substring(indexOf + 1);
            if (substring.length() > 0 && substring2.length() > 0) {
                try {
                    float parseFloat = CastFloatProtector.parseFloat(substring);
                    float parseFloat2 = CastFloatProtector.parseFloat(substring2);
                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                        this.LJZI = Math.abs(parseFloat / parseFloat2);
                        obtainStyledAttributes.recycle();
                        this.LJLJLJ = true;
                        return;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        throw new IllegalArgumentException(a1.LJ("Could not parse aspect ratio: '", LLLZLZ, "'"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r7v4 */
    public final int LLIIJLIL(int i, int i2, C0A7 c0a7, C0AC c0ac) {
        int LJJJI;
        int LJJJIL;
        int i3;
        int i4;
        int LLIIIL = LLIIIL(i);
        int LLIIIZ = LLIIIZ(i, c0ac);
        ?? r7 = 0;
        if (i < this.LLFF) {
            LJJJI = 0;
        } else {
            LJJJI = LJJJI();
        }
        int i5 = LLIIIL;
        boolean z = false;
        while (i5 <= LLIIIZ) {
            View LJFF = c0a7.LJFF(i5);
            C80126VcY c80126VcY = (C80126VcY) LJFF.getLayoutParams();
            z |= c80126VcY.isItemRemoved();
            C80131Vcd c80131Vcd = this.LLFZ.get(i5);
            LJIJ(LJJJI, LJFF, r7);
            this.LJLZ.getClass();
            if (!C90193gN.LIZ()) {
                int[] iArr = this.LL;
                int i6 = c80131Vcd.LIZJ;
                LJJJIL = C0A2.LJJJIL(iArr[c80131Vcd.LIZLLL + i6] - iArr[i6], 1073741824, r7, ((ViewGroup.MarginLayoutParams) c80126VcY).width, r7);
            } else {
                int[] iArr2 = this.LL;
                int i7 = c80131Vcd.LIZJ;
                LJJJIL = C0A2.LJJJIL(iArr2[i7] - iArr2[i7 - c80131Vcd.LIZLLL], 1073741824, r7, ((ViewGroup.MarginLayoutParams) c80126VcY).width, r7);
            }
            int LJJJIL2 = C0A2.LJJJIL(c80131Vcd.LIZIZ * this.LJZL, 1073741824, r7, ((ViewGroup.MarginLayoutParams) c80126VcY).height, true);
            LJIJJ(this.LLII, LJFF);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) LJFF.getLayoutParams();
            int i8 = marginLayoutParams.leftMargin;
            Rect rect = this.LLII;
            int LLIIZ = LLIIZ(LJJJIL, i8 + rect.left, marginLayoutParams.rightMargin + rect.right);
            int i9 = marginLayoutParams.topMargin;
            Rect rect2 = this.LLII;
            LJFF.measure(LLIIZ, LLIIZ(LJJJIL2, i9 + rect2.top, marginLayoutParams.bottomMargin + rect2.bottom));
            this.LJLZ.getClass();
            if (!C90193gN.LIZ()) {
                i3 = this.LL[c80131Vcd.LIZJ];
                i4 = ((ViewGroup.MarginLayoutParams) c80126VcY).leftMargin;
            } else {
                i3 = this.LL[c80131Vcd.LIZJ - c80131Vcd.LIZLLL];
                i4 = ((ViewGroup.MarginLayoutParams) c80126VcY).leftMargin;
            }
            int i10 = i3 + i4;
            int i11 = ((ViewGroup.MarginLayoutParams) c80126VcY).topMargin + (c80131Vcd.LIZ * this.LJZL) + i2;
            C0A2.LJJLIIIJJI(LJFF, i10, i11, LJJJJL(LJFF) + i10, LJJJJJL(LJFF) + i11);
            c80126VcY.LJLIL = c80131Vcd.LIZLLL;
            c80126VcY.LJLILLLLZI = c80131Vcd.LIZIZ;
            i5++;
            LJJJI++;
            r7 = 0;
        }
        if (LLIIIL < this.LLD) {
            this.LLD = LLIIIL;
            this.LLFF = LLIIJI(LLIIIL);
        }
        if (LLIIIZ > this.LLF) {
            this.LLF = LLIIIZ;
            this.LLFFF = LLIIJI(LLIIIZ);
        }
        if (z) {
            return r7;
        }
        C80131Vcd c80131Vcd2 = this.LLFZ.get(LLIIIL);
        C80131Vcd c80131Vcd3 = this.LLFZ.get(LLIIIZ);
        return ((c80131Vcd3.LIZ + c80131Vcd3.LIZIZ) - c80131Vcd2.LIZ) * this.LJZL;
    }
}
