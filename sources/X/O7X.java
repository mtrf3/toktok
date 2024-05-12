package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes11.dex */
public final class O7X implements View.OnLayoutChangeListener {
    public int LJLIL;
    public final /* synthetic */ O7W LJLILLLLZI;

    public O7X(O7W o7w) {
        this.LJLILLLLZI = o7w;
    }

    public final void LIZ(int i) {
        O7V o7v = this.LJLILLLLZI.LLIFFJFJJ.LLILII;
        boolean z = false;
        if (o7v != null && (o7v.LJIIIIZZ & 1) != 0) {
            z = true;
        }
        if (C61359O6h.LJII().LJIIL && z) {
            ImageView imageView = this.LJLILLLLZI.LJLJJL;
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                marginLayoutParams.topMargin += i;
                imageView.setLayoutParams(marginLayoutParams);
            }
            TextView textView = this.LJLILLLLZI.LJLJJLL;
            if (textView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                marginLayoutParams2.topMargin += i;
                textView.setLayoutParams(marginLayoutParams2);
            }
            FrameLayout frameLayout = this.LJLILLLLZI.LJLLL;
            frameLayout.setPadding(frameLayout.getPaddingLeft(), this.LJLILLLLZI.LJLLL.getPaddingTop() + i, this.LJLILLLLZI.LJLLL.getPaddingRight(), this.LJLILLLLZI.LJLLL.getPaddingBottom());
        } else {
            LinearLayout linearLayout = this.LJLILLLLZI.LJLLJ;
            linearLayout.setTranslationY(linearLayout.getTranslationY() + i);
        }
        this.LJLILLLLZI.LJLLJ.removeOnLayoutChangeListener(this);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:79:0x025a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    @Override // android.view.View.OnLayoutChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayoutChange(android.view.View r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O7X.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
    }
}
