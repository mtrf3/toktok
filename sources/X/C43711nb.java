package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.1nb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C43711nb extends C1ZA {
    public C0M5<Long> LJJIJIIJIL;
    public C0MB<Integer> LJJIJIL;

    @Override // X.C1ZA, X.AbstractC21310sZ
    public final void LJ() {
        this.LJJIJIIJIL = this.LJJIJIIJIL.clone();
        this.LJJIJIL = this.LJJIJIL.clone();
    }

    @Override // X.C1ZA, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C43721nc(this, null);
    }

    @Override // X.C1ZA, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C43721nc(this, resources);
    }

    public C43711nb(C43711nb c43711nb, C43721nc c43721nc, Resources resources) {
        super(c43711nb, c43721nc, resources);
        if (c43711nb != null) {
            this.LJJIJIIJIL = c43711nb.LJJIJIIJIL;
            this.LJJIJIL = c43711nb.LJJIJIL;
        } else {
            this.LJJIJIIJIL = new C0M5<>();
            this.LJJIJIL = new C0MB<>();
        }
    }
}
