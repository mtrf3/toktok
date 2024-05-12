package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: X.1ZB, reason: invalid class name */
/* loaded from: classes.dex */
public class C1ZB extends C21320sa {
    public C1ZA LJLLL;
    public boolean LJLLLL;

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // X.C21320sa
    /* renamed from: LJFF, reason: merged with bridge method [inline-methods] */
    public C1ZA LIZIZ() {
        return new C1ZA(this.LJLLL, this, null);
    }

    @Override // X.C21320sa, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.LJLLLL) {
            super.mutate();
            this.LJLLL.LJ();
            this.LJLLLL = true;
        }
        return this;
    }

    public C1ZB() {
    }

    @Override // X.C21320sa
    public void LJ(AbstractC21310sZ abstractC21310sZ) {
        this.LJLIL = abstractC21310sZ;
        int i = this.LJLJL;
        if (i >= 0) {
            Drawable LIZLLL = abstractC21310sZ.LIZLLL(i);
            this.LJLJI = LIZLLL;
            if (LIZLLL != null) {
                LIZJ(LIZLLL);
            }
        }
        this.LJLJJI = null;
        if (abstractC21310sZ instanceof C1ZA) {
            this.LJLLL = (C1ZA) abstractC21310sZ;
        }
    }

    @Override // X.C21320sa, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // X.C21320sa, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int LJFF = this.LJLLL.LJFF(iArr);
        if (LJFF < 0) {
            LJFF = this.LJLLL.LJFF(StateSet.WILD_CARD);
        }
        if (LIZLLL(LJFF) || onStateChange) {
            return true;
        }
        return false;
    }

    public C1ZB(C1ZA c1za, Resources resources) {
        LJ(new C1ZA(c1za, this, resources));
        onStateChange(getState());
    }
}
