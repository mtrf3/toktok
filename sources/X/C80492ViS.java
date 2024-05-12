package X;

import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: X.ViS, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80492ViS {
    public final ArrayList<C80494ViU> LIZ = new ArrayList<>();
    public ValueAnimator LIZIZ = null;
    public final C80493ViT LIZJ = new C80493ViT(this);

    public final void LIZ(int[] iArr, ValueAnimator valueAnimator) {
        C80494ViU c80494ViU = new C80494ViU(iArr, valueAnimator);
        valueAnimator.addListener(this.LIZJ);
        this.LIZ.add(c80494ViU);
    }
}
