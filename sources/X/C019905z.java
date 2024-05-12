package X;

import android.view.ViewGroup;
import java.util.HashMap;

/* renamed from: X.05z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C019905z {
    public int LIZ;
    public final AnonymousClass062 LIZIZ = new AnonymousClass062();
    public final AnonymousClass061 LIZJ = new AnonymousClass061();
    public final AnonymousClass060 LIZLLL = new AnonymousClass060();
    public final AnonymousClass063 LJ = new AnonymousClass063();
    public HashMap<String, C019405u> LJFF = new HashMap<>();

    public final Object clone() {
        C019905z c019905z = new C019905z();
        c019905z.LIZLLL.LIZ(this.LIZLLL);
        c019905z.LIZJ.LIZ(this.LIZJ);
        AnonymousClass062 anonymousClass062 = c019905z.LIZIZ;
        AnonymousClass062 anonymousClass0622 = this.LIZIZ;
        anonymousClass062.getClass();
        anonymousClass062.LIZ = anonymousClass0622.LIZ;
        anonymousClass062.LIZIZ = anonymousClass0622.LIZIZ;
        anonymousClass062.LIZLLL = anonymousClass0622.LIZLLL;
        anonymousClass062.LJ = anonymousClass0622.LJ;
        anonymousClass062.LIZJ = anonymousClass0622.LIZJ;
        c019905z.LJ.LIZ(this.LJ);
        c019905z.LIZ = this.LIZ;
        return c019905z;
    }

    public final void LIZ(C018905p c018905p) {
        AnonymousClass060 anonymousClass060 = this.LIZLLL;
        c018905p.leftToLeft = anonymousClass060.LJII;
        c018905p.leftToRight = anonymousClass060.LJIIIIZZ;
        c018905p.rightToLeft = anonymousClass060.LJIIIZ;
        c018905p.rightToRight = anonymousClass060.LJIIJ;
        c018905p.topToTop = anonymousClass060.LJIIJJI;
        c018905p.topToBottom = anonymousClass060.LJIIL;
        c018905p.bottomToTop = anonymousClass060.LJIILIIL;
        c018905p.bottomToBottom = anonymousClass060.LJIILJJIL;
        c018905p.baselineToBaseline = anonymousClass060.LJIILL;
        c018905p.startToEnd = anonymousClass060.LJIILLIIL;
        c018905p.startToStart = anonymousClass060.LJIIZILJ;
        c018905p.endToStart = anonymousClass060.LJIJ;
        c018905p.endToEnd = anonymousClass060.LJIJI;
        ((ViewGroup.MarginLayoutParams) c018905p).leftMargin = anonymousClass060.LJJIIJZLJL;
        ((ViewGroup.MarginLayoutParams) c018905p).rightMargin = anonymousClass060.LJJIIZ;
        ((ViewGroup.MarginLayoutParams) c018905p).topMargin = anonymousClass060.LJJIIZI;
        ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin = anonymousClass060.LJJIJ;
        c018905p.goneStartMargin = anonymousClass060.LJJJ;
        c018905p.goneEndMargin = anonymousClass060.LJJIZ;
        c018905p.goneTopMargin = anonymousClass060.LJJIJL;
        c018905p.goneBottomMargin = anonymousClass060.LJJIL;
        c018905p.horizontalBias = anonymousClass060.LJIJJ;
        c018905p.verticalBias = anonymousClass060.LJIJJLI;
        c018905p.circleConstraint = anonymousClass060.LJJ;
        c018905p.circleRadius = anonymousClass060.LJJI;
        c018905p.circleAngle = anonymousClass060.LJJIFFI;
        c018905p.dimensionRatio = anonymousClass060.LJIL;
        c018905p.editorAbsoluteX = anonymousClass060.LJJII;
        c018905p.editorAbsoluteY = anonymousClass060.LJJIII;
        c018905p.verticalWeight = anonymousClass060.LJJJI;
        c018905p.horizontalWeight = anonymousClass060.LJJJIL;
        c018905p.verticalChainStyle = anonymousClass060.LJJJJI;
        c018905p.horizontalChainStyle = anonymousClass060.LJJJJ;
        c018905p.constrainedWidth = anonymousClass060.LJJLIIIIJ;
        c018905p.constrainedHeight = anonymousClass060.LJJLIIIJ;
        c018905p.matchConstraintDefaultWidth = anonymousClass060.LJJJJIZL;
        c018905p.matchConstraintDefaultHeight = anonymousClass060.LJJJJJ;
        c018905p.matchConstraintMaxWidth = anonymousClass060.LJJJJJL;
        c018905p.matchConstraintMaxHeight = anonymousClass060.LJJJJL;
        c018905p.matchConstraintMinWidth = anonymousClass060.LJJJJLI;
        c018905p.matchConstraintMinHeight = anonymousClass060.LJJJJLL;
        c018905p.matchConstraintPercentWidth = anonymousClass060.LJJJJZ;
        c018905p.matchConstraintPercentHeight = anonymousClass060.LJJJJZI;
        c018905p.orientation = anonymousClass060.LJJIIJ;
        c018905p.guidePercent = anonymousClass060.LJI;
        c018905p.guideBegin = anonymousClass060.LJ;
        c018905p.guideEnd = anonymousClass060.LJFF;
        ((ViewGroup.MarginLayoutParams) c018905p).width = anonymousClass060.LIZJ;
        ((ViewGroup.MarginLayoutParams) c018905p).height = anonymousClass060.LIZLLL;
        String str = anonymousClass060.LJJLI;
        if (str != null) {
            c018905p.constraintTag = str;
        }
        c018905p.setMarginStart(anonymousClass060.LJJIJIIJIL);
        c018905p.setMarginEnd(this.LIZLLL.LJJIJIIJI);
        c018905p.validate();
    }

    public final void LIZIZ(int i, C018905p c018905p) {
        this.LIZ = i;
        AnonymousClass060 anonymousClass060 = this.LIZLLL;
        anonymousClass060.LJII = c018905p.leftToLeft;
        anonymousClass060.LJIIIIZZ = c018905p.leftToRight;
        anonymousClass060.LJIIIZ = c018905p.rightToLeft;
        anonymousClass060.LJIIJ = c018905p.rightToRight;
        anonymousClass060.LJIIJJI = c018905p.topToTop;
        anonymousClass060.LJIIL = c018905p.topToBottom;
        anonymousClass060.LJIILIIL = c018905p.bottomToTop;
        anonymousClass060.LJIILJJIL = c018905p.bottomToBottom;
        anonymousClass060.LJIILL = c018905p.baselineToBaseline;
        anonymousClass060.LJIILLIIL = c018905p.startToEnd;
        anonymousClass060.LJIIZILJ = c018905p.startToStart;
        anonymousClass060.LJIJ = c018905p.endToStart;
        anonymousClass060.LJIJI = c018905p.endToEnd;
        anonymousClass060.LJIJJ = c018905p.horizontalBias;
        anonymousClass060.LJIJJLI = c018905p.verticalBias;
        anonymousClass060.LJIL = c018905p.dimensionRatio;
        anonymousClass060.LJJ = c018905p.circleConstraint;
        anonymousClass060.LJJI = c018905p.circleRadius;
        anonymousClass060.LJJIFFI = c018905p.circleAngle;
        anonymousClass060.LJJII = c018905p.editorAbsoluteX;
        anonymousClass060.LJJIII = c018905p.editorAbsoluteY;
        anonymousClass060.LJJIIJ = c018905p.orientation;
        anonymousClass060.LJI = c018905p.guidePercent;
        anonymousClass060.LJ = c018905p.guideBegin;
        anonymousClass060.LJFF = c018905p.guideEnd;
        anonymousClass060.LIZJ = ((ViewGroup.MarginLayoutParams) c018905p).width;
        anonymousClass060.LIZLLL = ((ViewGroup.MarginLayoutParams) c018905p).height;
        anonymousClass060.LJJIIJZLJL = ((ViewGroup.MarginLayoutParams) c018905p).leftMargin;
        anonymousClass060.LJJIIZ = ((ViewGroup.MarginLayoutParams) c018905p).rightMargin;
        anonymousClass060.LJJIIZI = ((ViewGroup.MarginLayoutParams) c018905p).topMargin;
        anonymousClass060.LJJIJ = ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin;
        anonymousClass060.LJJJI = c018905p.verticalWeight;
        anonymousClass060.LJJJIL = c018905p.horizontalWeight;
        anonymousClass060.LJJJJI = c018905p.verticalChainStyle;
        anonymousClass060.LJJJJ = c018905p.horizontalChainStyle;
        anonymousClass060.LJJLIIIIJ = c018905p.constrainedWidth;
        anonymousClass060.LJJLIIIJ = c018905p.constrainedHeight;
        anonymousClass060.LJJJJIZL = c018905p.matchConstraintDefaultWidth;
        anonymousClass060.LJJJJJ = c018905p.matchConstraintDefaultHeight;
        anonymousClass060.LJJJJJL = c018905p.matchConstraintMaxWidth;
        anonymousClass060.LJJJJL = c018905p.matchConstraintMaxHeight;
        anonymousClass060.LJJJJLI = c018905p.matchConstraintMinWidth;
        anonymousClass060.LJJJJLL = c018905p.matchConstraintMinHeight;
        anonymousClass060.LJJJJZ = c018905p.matchConstraintPercentWidth;
        anonymousClass060.LJJJJZI = c018905p.matchConstraintPercentHeight;
        anonymousClass060.LJJLI = c018905p.constraintTag;
        anonymousClass060.LJJIJL = c018905p.goneTopMargin;
        anonymousClass060.LJJIL = c018905p.goneBottomMargin;
        anonymousClass060.LJJIJIL = c018905p.goneLeftMargin;
        anonymousClass060.LJJIJLIJ = c018905p.goneRightMargin;
        anonymousClass060.LJJJ = c018905p.goneStartMargin;
        anonymousClass060.LJJIZ = c018905p.goneEndMargin;
        anonymousClass060.LJJIJIIJI = c018905p.getMarginEnd();
        this.LIZLLL.LJJIJIIJIL = c018905p.getMarginStart();
    }

    public final void LIZJ(int i, C1AI c1ai) {
        LIZIZ(i, c1ai);
        this.LIZIZ.LIZLLL = c1ai.LIZ;
        AnonymousClass063 anonymousClass063 = this.LJ;
        anonymousClass063.LIZIZ = c1ai.LIZLLL;
        anonymousClass063.LIZJ = c1ai.LJ;
        anonymousClass063.LIZLLL = c1ai.LJFF;
        anonymousClass063.LJ = c1ai.LJI;
        anonymousClass063.LJFF = c1ai.LJII;
        anonymousClass063.LJI = c1ai.LJIIIIZZ;
        anonymousClass063.LJII = c1ai.LJIIIZ;
        anonymousClass063.LJIIIIZZ = c1ai.LJIIJ;
        anonymousClass063.LJIIIZ = c1ai.LJIIJJI;
        anonymousClass063.LJIIJ = c1ai.LJIIL;
        anonymousClass063.LJIIL = c1ai.LIZJ;
        anonymousClass063.LJIIJJI = c1ai.LIZIZ;
    }
}
