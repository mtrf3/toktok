package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* renamed from: X.1pl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C45051pl extends C1K3 {
    public C55932Hl LJLJI;

    public ColorStateList getSupportBackgroundTintList() {
        AnonymousClass178 anonymousClass178;
        C55932Hl c55932Hl = this.LJLJI;
        if (c55932Hl == null || (anonymousClass178 = c55932Hl.LJLJJL) == null) {
            return null;
        }
        return anonymousClass178.LIZ;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AnonymousClass178 anonymousClass178;
        C55932Hl c55932Hl = this.LJLJI;
        if (c55932Hl == null || (anonymousClass178 = c55932Hl.LJLJJL) == null) {
            return null;
        }
        return anonymousClass178.LIZIZ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C55932Hl c55932Hl = this.LJLJI;
        if (c55932Hl != null) {
            c55932Hl.LLLZ();
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C55932Hl c55932Hl = this.LJLJI;
        if (c55932Hl != null) {
            c55932Hl.LLLZI(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C55932Hl c55932Hl = this.LJLJI;
        if (c55932Hl != null) {
            c55932Hl.LLLZIL(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C55932Hl c55932Hl = this.LJLJI;
        if (c55932Hl != null) {
            c55932Hl.LLLZL(mode);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        C55932Hl c55932Hl = this.LJLJI;
        if ((c55932Hl != null && c55932Hl.LJLJJI == drawable) || super.verifyDrawable(drawable)) {
            return true;
        }
        return false;
    }

    public C45051pl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C55932Hl c55932Hl = new C55932Hl(this);
        this.LJLJI = c55932Hl;
        c55932Hl.LLLLZLLLI(attributeSet, 0, 0);
    }

    public C45051pl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        C55932Hl c55932Hl = new C55932Hl(this);
        this.LJLJI = c55932Hl;
        c55932Hl.LLLLZLLLI(attributeSet, 0, 0);
    }
}
