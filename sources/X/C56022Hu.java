package X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.2Hu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C56022Hu extends C2BF {
    public static final C0PI LJIJ = C0PI.LIZJ(null, WindowInsets.CONSUMED);

    @Override // X.C30651If, X.C0PE
    public final void LIZLLL(View view) {
    }

    @Override // X.C30651If, X.C0PE
    public final boolean LJIILIIL() {
        return this.LIZLLL.isVisible(C0PH.LIZ(8));
    }

    @Override // X.C30651If, X.C0PE
    public final C06920Oy LJFF(int i) {
        return C06920Oy.LIZLLL(this.LIZLLL.getInsets(C0PH.LIZ(i)));
    }

    public C56022Hu(C0PI c0pi, WindowInsets windowInsets) {
        super(c0pi, windowInsets);
    }
}
