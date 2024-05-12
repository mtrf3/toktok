package X;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.ARu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26246ARu extends Animation {
    public final /* synthetic */ ViewGroup.MarginLayoutParams LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ C26245ARt LJLJJI;

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.LJLIL;
        int i = this.LJLILLLLZI;
        marginLayoutParams.topMargin = ((int) ((i - r1) * f)) + this.LJLJI;
        ViewGroup viewGroup = this.LJLJJI.LJLJL;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setLayoutParams(marginLayoutParams);
    }

    public C26246ARu(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, C26245ARt c26245ARt) {
        this.LJLIL = marginLayoutParams;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = c26245ARt;
    }
}
