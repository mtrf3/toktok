package X;

import Y.ALAdapterS1S0200000_2;
import Y.AUListenerS10S0500000_2;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.57i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1297457i implements C59S {
    public final C59L LIZ;
    public float LIZIZ;
    public int LIZJ;
    public final /* synthetic */ C1297357h LIZLLL;

    @Override // X.C59S
    public final void LIZ() {
        C1297357h c1297357h;
        InterfaceC1298157p interfaceC1298157p;
        C1297357h c1297357h2 = this.LIZLLL;
        if (!c1297357h2.LJLLL) {
            return;
        }
        c1297357h2.LLD.cancel();
        this.LIZLLL.LLD.removeAllUpdateListeners();
        C16880lQ.LJLJL(this.LIZLLL.LLD);
        if (!this.LIZLLL.LJ(this.LIZJ)) {
            this.LIZJ = this.LIZ.getIndex();
        }
        if (((C59L) ListProtector.get(this.LIZLLL.LJLILLLLZI, this.LIZJ)).LLIFFJFJJ) {
            this.LIZJ--;
        }
        Iterator it = ((ArrayList) this.LIZLLL.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            C59L c59l = (C59L) it.next();
            c59l.setEnableDragMode(true);
            C59V c59v = (C59V) c59l.LIZ(R.id.et1);
            c59v.LJLL = false;
            c59v.invalidate();
        }
        this.LIZLLL.getClass();
        if (this.LIZLLL.LJ(this.LIZ.getIndex()) && (interfaceC1298157p = (c1297357h = this.LIZLLL).LJLJJL) != null) {
            interfaceC1298157p.LJJJLZIJ((NLETrackSlot) ListProtector.get(c1297357h.LJLJJI, this.LIZ.getIndex()), this.LIZ.getIndex(), this.LIZJ);
        }
        this.LIZLLL.LJLJI.getLayoutParams().width = -2;
    }

    @Override // X.C59S
    public final boolean LIZIZ() {
        C1297357h c1297357h = this.LIZLLL;
        List<NLETrackSlot> list = c1297357h.LJLJJI;
        boolean z = false;
        if (list != null && !list.isEmpty() && ((ArrayList) this.LIZLLL.LJLJJI).size() > 1 && this.LIZLLL.LLIIII) {
            z = true;
        }
        c1297357h.setLongClickEnable(z);
        return this.LIZLLL.LJLLL;
    }

    public C1297457i(C1297357h c1297357h, C59L c59l) {
        this.LIZLLL = c1297357h;
        this.LIZ = c59l;
    }

    @Override // X.C59S
    public final boolean LIZJ(float f, float f2) {
        Object obj;
        float f3 = f;
        boolean z = false;
        if (this.LIZLLL.getSelectIndex() != this.LIZ.getIndex() || this.LIZLLL.LJLLJ != EnumC127354zD.LINE) {
            this.LIZLLL.LJFF(this.LIZ.getIndex(), EnumC127354zD.LINE, false);
        }
        C1297357h c1297357h = this.LIZLLL;
        if (!c1297357h.LJLLL) {
            return false;
        }
        NLETrackSlot nLETrackSlot = (NLETrackSlot) ORZ.LJLLLLLL(this.LIZ.getIndex(), c1297357h.LJLJJI);
        if (nLETrackSlot == null) {
            return false;
        }
        this.LIZLLL.getClass();
        InterfaceC1298157p interfaceC1298157p = this.LIZLLL.LJLJJL;
        if (interfaceC1298157p != null) {
            interfaceC1298157p.LJJIZ(nLETrackSlot);
        }
        C1297357h c1297357h2 = this.LIZLLL;
        if (c1297357h2.LJLL) {
            C59L LIZJ = c1297357h2.getBlackSlotContainer().LIZJ();
            if (LIZJ != null) {
                C1297357h c1297357h3 = this.LIZLLL;
                C65777Prh.LIZ(c1297357h3.LJLJJI).remove(c1297357h3.getBlackSlotContainer().LIZLLL());
                ((ArrayList) c1297357h3.LJLILLLLZI).remove(LIZJ);
                C16880lQ.LLFZ(c1297357h3.LJLJI, LIZJ);
            }
        } else {
            C16880lQ.LLFZ(c1297357h2.LJLJI, c1297357h2.LJLJLJ);
        }
        this.LIZJ = this.LIZ.getIndex();
        C59L c59l = this.LIZ;
        c59l.bringToFront();
        C1302559h c1302559h = (C1302559h) c59l.LIZ(R.id.b_o);
        C1302859k c1302859k = c59l.LLIL;
        float f4 = c1302859k.LJIIJ;
        float f5 = c1302859k.LJIIIZ;
        c1302559h.LJLLJ = f4;
        c1302559h.LJLLILLLL = f5;
        c1302559h.invalidate();
        this.LIZLLL.getHapticFeedback().LIZ(this.LIZ, EnumC1284052e.VIBRATE_IMPACT_LIGHT);
        int[] iArr = new int[((ArrayList) this.LIZLLL.LJLILLLLZI).size()];
        int[] iArr2 = new int[((ArrayList) this.LIZLLL.LJLILLLLZI).size()];
        int[] iArr3 = new int[((ArrayList) this.LIZLLL.LJLILLLLZI).size()];
        C76732zl c76732zl = new C76732zl();
        c76732zl.element = this.LIZ.getHeight();
        int dimensionPixelSize = this.LIZLLL.getResources().getDimensionPixelSize(R.dimen.ajg);
        float f6 = 0.0f;
        if (this.LIZLLL.LIZLLL()) {
            float LJIIJ = f3 + V2B.LJIIJ(this.LIZLLL);
            int LJJI = C47261Igj.LJJI(this.LIZLLL.LJLILLLLZI);
            for (int i = -1; i < LJJI; i = -1) {
                C59L c59l2 = (C59L) ListProtector.get(this.LIZLLL.LJLILLLLZI, LJJI);
                c59l2.LJ();
                if (LJJI != this.LIZ.getIndex()) {
                    c59l2.setEnableDragMode(false);
                }
                if (LJJI > this.LIZ.getIndex()) {
                    int width = c59l2.getWidth();
                    C1297357h c1297357h4 = this.LIZLLL;
                    LJIIJ = ((width - ((c1297357h4.LLI + c1297357h4.LLIFFJFJJ) * 2)) - c59l2.getTransitionWidth()) + LJIIJ;
                } else if (LJJI == this.LIZ.getIndex()) {
                    int measuredWidth = this.LIZLLL.getMeasuredWidth();
                    int LJIIJ2 = V2B.LJIIJ(this.LIZLLL) + ((View) ListProtector.get(this.LIZLLL.LJLILLLLZI, LJJI)).getRight();
                    C1297357h c1297357h5 = this.LIZLLL;
                    iArr3[LJJI] = measuredWidth - ((LJIIJ2 - c1297357h5.LLI) - c1297357h5.LLIFFJFJJ);
                    iArr2[LJJI] = (((c1297357h5.getMeasuredWidth() - ((int) LJIIJ)) - V2B.LJIIJ(this.LIZLLL)) - iArr3[LJJI]) - (C1300758p.LIZJ / 2);
                    f6 = LJIIJ;
                } else if (LJJI < this.LIZ.getIndex()) {
                    int i2 = C1300758p.LIZJ;
                    LJIIJ += i2 + dimensionPixelSize;
                    int measuredWidth2 = this.LIZLLL.getMeasuredWidth();
                    int LJIIJ3 = V2B.LJIIJ(this.LIZLLL) + ((View) ListProtector.get(this.LIZLLL.LJLILLLLZI, LJJI)).getRight();
                    C1297357h c1297357h6 = this.LIZLLL;
                    iArr3[LJJI] = measuredWidth2 - ((LJIIJ3 - c1297357h6.LLI) - c1297357h6.LLIFFJFJJ);
                    iArr2[LJJI] = (((c1297357h6.getMeasuredWidth() - ((int) LJIIJ)) - V2B.LJIIJ(this.LIZLLL)) - iArr3[LJJI]) - (i2 / 2);
                }
                int width2 = c59l2.getWidth();
                C1297357h c1297357h7 = this.LIZLLL;
                iArr[LJJI] = (width2 - ((c1297357h7.LLI + c1297357h7.LLIFFJFJJ) * 2)) - C1300758p.LIZJ;
                LJJI--;
            }
            obj = null;
        } else {
            C1297357h c1297357h8 = this.LIZLLL;
            Iterator it = ((ArrayList) c1297357h8.LJLILLLLZI).iterator();
            f6 = 0.0f;
            int i3 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    C59L c59l3 = (C59L) next;
                    c59l3.LJ();
                    if (i3 != this.LIZ.getIndex()) {
                        c59l3.setEnableDragMode(z);
                    }
                    if (i3 < this.LIZ.getIndex()) {
                        f3 = ((c59l3.getWidth() - ((c1297357h8.LLI + c1297357h8.LLIFFJFJJ) * 2)) - c59l3.getTransitionWidth()) + f3;
                    } else if (i3 == this.LIZ.getIndex()) {
                        int left = (((View) ListProtector.get(c1297357h8.LJLILLLLZI, i3)).getLeft() - V2B.LJIIJ(c1297357h8)) + c1297357h8.LLI + c1297357h8.LLIFFJFJJ;
                        iArr3[i3] = left;
                        iArr2[i3] = (((int) f3) - left) - (C1300758p.LIZJ / 2);
                        f6 = f3;
                    } else if (i3 > this.LIZ.getIndex()) {
                        int i5 = C1300758p.LIZJ;
                        f3 += i5 + dimensionPixelSize;
                        int left2 = (((View) ListProtector.get(c1297357h8.LJLILLLLZI, i3)).getLeft() - V2B.LJIIJ(c1297357h8)) + c1297357h8.LLI + c1297357h8.LLIFFJFJJ;
                        iArr3[i3] = left2;
                        iArr2[i3] = (((int) f3) - left2) - (i5 / 2);
                    }
                    iArr[i3] = (c59l3.getWidth() - ((c1297357h8.LLI + c1297357h8.LLIFFJFJJ) * 2)) - C1300758p.LIZJ;
                    i3 = i4;
                    z = false;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            obj = null;
        }
        if (this.LIZLLL.LIZLLL()) {
            int size = ((ArrayList) this.LIZLLL.LJLILLLLZI).size();
            for (int index = this.LIZ.getIndex() + 1; index < size; index++) {
                int i6 = C1300758p.LIZJ;
                f6 -= i6 + dimensionPixelSize;
                int measuredWidth3 = this.LIZLLL.getMeasuredWidth();
                int LJIIJ4 = V2B.LJIIJ(this.LIZLLL) + ((View) ListProtector.get(this.LIZLLL.LJLILLLLZI, index)).getRight();
                C1297357h c1297357h9 = this.LIZLLL;
                iArr3[index] = measuredWidth3 - ((LJIIJ4 - c1297357h9.LLI) - c1297357h9.LLIFFJFJJ);
                iArr2[index] = (((c1297357h9.getMeasuredWidth() - ((int) f6)) - V2B.LJIIJ(this.LIZLLL)) - iArr3[index]) - (i6 / 2);
            }
        } else {
            for (int index2 = this.LIZ.getIndex() - 1; -1 < index2; index2--) {
                int i7 = C1300758p.LIZJ;
                f6 -= i7 + dimensionPixelSize;
                int left3 = ((View) ListProtector.get(this.LIZLLL.LJLILLLLZI, index2)).getLeft() - V2B.LJIIJ(this.LIZLLL);
                C1297357h c1297357h10 = this.LIZLLL;
                int i8 = left3 + c1297357h10.LLI + c1297357h10.LLIFFJFJJ;
                iArr3[index2] = i8;
                iArr2[index2] = (((int) f6) - i8) - (i7 / 2);
            }
        }
        this.LIZLLL.LLD.cancel();
        this.LIZLLL.LLD.removeAllUpdateListeners();
        C16880lQ.LJLJL(this.LIZLLL.LLD);
        C1297357h c1297357h11 = this.LIZLLL;
        c1297357h11.LLD.addUpdateListener(new AUListenerS10S0500000_2(c1297357h11, iArr, c76732zl, iArr3, iArr2, 2));
        this.LIZLLL.LJLJI.getLayoutParams().width = this.LIZLLL.LJLJI.getWidth();
        this.LIZLLL.LLD.addListener(new ALAdapterS1S0200000_2(this, this.LIZLLL, 10));
        this.LIZLLL.LLD.start();
        Iterator it2 = ((ArrayList) this.LIZLLL.LJLILLLLZI).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((C59L) next2).LLIFFJFJJ) {
                obj = next2;
                break;
            }
        }
        View view = (View) obj;
        if (view != null) {
            view.setVisibility(8);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r1[0] >= r3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x014a, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0117, code lost:
    
        if (r2[0] <= r3) goto L56;
     */
    @Override // X.C59S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(float r13, float r14, boolean r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1297457i.LIZLLL(float, float, boolean, boolean):void");
    }
}
