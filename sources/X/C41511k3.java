package X;

import X.C018905p;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1k3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C41511k3<T extends C018905p> extends C1KB<T> {
    public int LJIIJJI;
    public int LJIIL;
    public float LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public int LJJ;
    public int LJJI;
    public float LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public int LJJIIZ;
    public int LJJIIZI;
    public int LJJIJ;
    public int LJJIJIIJI;
    public int LJJIJIIJIL;
    public int LJJIJIL;
    public float LJJIJL;
    public float LJJIJLIJ;
    public String LJJIL;
    public float LJJIZ;
    public float LJJJ;
    public int LJJJI;
    public int LJJJIL;
    public int LJJJJ;
    public int LJJJJI;
    public int LJJJJIZL;
    public int LJJJJJ;
    public int LJJJJJL;
    public int LJJJJL;
    public float LJJJJLI;
    public float LJJJJLL;
    public int LJJJJZ;
    public int LJJJJZI;
    public int LJJJLIIL;
    public boolean LJJJLL;
    public boolean LJJJLZIJ;
    public String LJJJZ;
    public boolean LJJL;

    @Override // X.C1KB, X.C0RS
    public Class<? extends ViewGroup.LayoutParams> LIZJ() {
        return C018905p.class;
    }

    public C41511k3(T t) {
        super(t);
        this.LJIIJJI = -1;
        this.LJIIL = -1;
        this.LJIILIIL = -1.0f;
        this.LJIILJJIL = -1;
        this.LJIILL = -1;
        this.LJIILLIIL = -1;
        this.LJIIZILJ = -1;
        this.LJIJ = -1;
        this.LJIJI = -1;
        this.LJIJJ = -1;
        this.LJIJJLI = -1;
        this.LJIL = -1;
        this.LJJ = -1;
        this.LJJII = -1;
        this.LJJIII = -1;
        this.LJJIIJ = -1;
        this.LJJIIJZLJL = -1;
        this.LJJIIZ = -1;
        this.LJJIIZI = -1;
        this.LJJIJ = -1;
        this.LJJIJIIJI = -1;
        this.LJJIJIIJIL = -1;
        this.LJJIJIL = -1;
        this.LJJIJL = 0.5f;
        this.LJJIJLIJ = 0.5f;
        this.LJJIZ = -1.0f;
        this.LJJJ = -1.0f;
        this.LJJJJLI = 1.0f;
        this.LJJJJLL = 1.0f;
        this.LJJJJZ = -1;
        this.LJJJJZI = -1;
        this.LJJJLIIL = -1;
    }

    @Override // X.C1KB
    /* renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public void LIZIZ(T t) {
        super.LIZIZ(t);
        this.LJIIJJI = t.guideBegin;
        this.LJIIL = t.guideEnd;
        this.LJIILIIL = t.guidePercent;
        this.LJIILJJIL = t.leftToLeft;
        this.LJIILL = t.leftToRight;
        this.LJIILLIIL = t.rightToLeft;
        this.LJIIZILJ = t.rightToRight;
        this.LJIJ = t.topToTop;
        this.LJIJI = t.topToBottom;
        this.LJIJJ = t.bottomToTop;
        this.LJIJJLI = t.bottomToBottom;
        this.LJIL = t.baselineToBaseline;
        this.LJJ = t.circleConstraint;
        this.LJJI = t.circleRadius;
        this.LJJIFFI = t.circleAngle;
        this.LJJII = t.startToEnd;
        this.LJJIII = t.startToStart;
        this.LJJIIJ = t.endToStart;
        this.LJJIIJZLJL = t.endToEnd;
        this.LJJIIZ = t.goneLeftMargin;
        this.LJJIIZI = t.goneTopMargin;
        this.LJJIJ = t.goneRightMargin;
        this.LJJIJIIJI = t.goneBottomMargin;
        this.LJJIJIIJIL = t.goneStartMargin;
        this.LJJIJIL = t.goneEndMargin;
        this.LJJIJL = t.horizontalBias;
        this.LJJIJLIJ = t.verticalBias;
        this.LJJIL = t.dimensionRatio;
        this.LJJIZ = t.horizontalWeight;
        this.LJJJ = t.verticalWeight;
        this.LJJJI = t.horizontalChainStyle;
        this.LJJJIL = t.verticalChainStyle;
        this.LJJJLL = t.constrainedWidth;
        this.LJJJLZIJ = t.constrainedHeight;
        this.LJJJJ = t.matchConstraintDefaultWidth;
        this.LJJJJI = t.matchConstraintDefaultHeight;
        this.LJJJJIZL = t.matchConstraintMinWidth;
        this.LJJJJJL = t.matchConstraintMaxWidth;
        this.LJJJJJ = t.matchConstraintMinHeight;
        this.LJJJJL = t.matchConstraintMaxHeight;
        this.LJJJJLI = t.matchConstraintPercentWidth;
        this.LJJJJLL = t.matchConstraintPercentHeight;
        this.LJJJJZ = t.editorAbsoluteX;
        this.LJJJJZI = t.editorAbsoluteY;
        this.LJJJLIIL = t.orientation;
        this.LJJJZ = t.constraintTag;
        this.LJJL = t.helped;
    }

    @Override // X.C1KB, X.C0RS
    public boolean LIZ(View view, ViewGroup.LayoutParams layoutParams) {
        C018205i c018205i;
        if (layoutParams == null || !(layoutParams instanceof C018905p)) {
            return false;
        }
        C018905p c018905p = (C018905p) layoutParams;
        if (!super.LIZ(view, c018905p) || this.LJIIJJI != c018905p.guideBegin || this.LJIIL != c018905p.guideEnd || this.LJIILIIL != c018905p.guidePercent || this.LJIILJJIL != c018905p.leftToLeft || this.LJIILL != c018905p.leftToRight || this.LJIILLIIL != c018905p.rightToLeft || this.LJIIZILJ != c018905p.rightToRight || this.LJIJ != c018905p.topToTop || this.LJIJI != c018905p.topToBottom || this.LJIJJ != c018905p.bottomToTop || this.LJIJJLI != c018905p.bottomToBottom || this.LJIL != c018905p.baselineToBaseline || this.LJJ != c018905p.circleConstraint || this.LJJI != c018905p.circleRadius || this.LJJIFFI != c018905p.circleAngle || this.LJJII != c018905p.startToEnd || this.LJJIII != c018905p.startToStart || this.LJJIIJ != c018905p.endToStart || this.LJJIIJZLJL != c018905p.endToEnd || this.LJJIIZ != c018905p.goneLeftMargin || this.LJJIIZI != c018905p.goneTopMargin || this.LJJIJ != c018905p.goneRightMargin || this.LJJIJIIJI != c018905p.goneBottomMargin || this.LJJIJIIJIL != c018905p.goneStartMargin || this.LJJIJIL != c018905p.goneEndMargin || this.LJJIJL != c018905p.horizontalBias || this.LJJIJLIJ != c018905p.verticalBias || !TextUtils.equals(this.LJJIL, c018905p.dimensionRatio) || this.LJJIZ != c018905p.horizontalWeight || this.LJJJ != c018905p.verticalWeight || this.LJJJI != c018905p.horizontalChainStyle || this.LJJJIL != c018905p.verticalChainStyle || this.LJJJLL != c018905p.constrainedWidth || this.LJJJLZIJ != c018905p.constrainedHeight || this.LJJJJ != c018905p.matchConstraintDefaultWidth || this.LJJJJI != c018905p.matchConstraintDefaultHeight || this.LJJJJIZL != c018905p.matchConstraintMinWidth || this.LJJJJJL != c018905p.matchConstraintMaxWidth || this.LJJJJJ != c018905p.matchConstraintMinHeight || this.LJJJJL != c018905p.matchConstraintMaxHeight || this.LJJJJLI != c018905p.matchConstraintPercentWidth || this.LJJJJLL != c018905p.matchConstraintPercentHeight || this.LJJJJZ != c018905p.editorAbsoluteX || this.LJJJJZI != c018905p.editorAbsoluteY || this.LJJJLIIL != c018905p.orientation || !TextUtils.equals(this.LJJJZ, c018905p.constraintTag) || this.LJJL != c018905p.helped || (c018205i = c018905p.widget) == null || c018205i.mCompanionWidget != view) {
            return false;
        }
        return true;
    }
}
