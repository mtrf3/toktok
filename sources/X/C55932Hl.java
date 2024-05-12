package X;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import o3.h0;

/* renamed from: X.2Hl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55932Hl extends AbstractC534928b<View> {
    public final View LJLILLLLZI;
    public Drawable LJLJI;
    public Drawable LJLJJI;
    public AnonymousClass178 LJLJJL;

    @Override // X.QXX
    public final int[] LLLLLLL() {
        return new int[]{R.attr.xk, R.attr.xl};
    }

    public final void LLLZ() {
        Drawable drawable;
        if (this.LJLJJI != null && Build.VERSION.SDK_INT == 21) {
            ColorStateList LJI = C16360ka.LJI(this.LJLILLLLZI);
            PorterDuff.Mode LJII = C16360ka.LJII(this.LJLILLLLZI);
            if (LJI != null) {
                C07820Sk.LJII(this.LJLJJI, LJI);
                Drawable drawable2 = this.LJLJJI;
                if (LJII == null) {
                    LJII = PorterDuff.Mode.SRC_IN;
                }
                C07820Sk.LJIIIIZZ(drawable2, LJII);
                return;
            }
            C07840Sm.LIZ(this.LJLJJI);
            return;
        }
        if (this.LJLJJL != null && (drawable = this.LJLJJI) != null) {
            drawable.mutate();
            AnonymousClass178 anonymousClass178 = this.LJLJJL;
            if (anonymousClass178.LIZLLL) {
                C07820Sk.LJII(this.LJLJJI, anonymousClass178.LIZ);
            }
            AnonymousClass178 anonymousClass1782 = this.LJLJJL;
            if (anonymousClass1782.LIZJ) {
                Drawable drawable3 = this.LJLJJI;
                PorterDuff.Mode mode = anonymousClass1782.LIZIZ;
                if (mode == null) {
                    mode = PorterDuff.Mode.SRC_IN;
                }
                C07820Sk.LJIIIIZZ(drawable3, mode);
            }
        }
    }

    public C55932Hl(View view) {
        super(view);
        this.LJLILLLLZI = view;
    }

    @Override // X.AbstractC534928b
    public final void LLLLZIL(TypedArray typedArray) {
        ColorStateList colorStateList;
        if (typedArray.hasValue(0)) {
            int resourceId = typedArray.getResourceId(0, 0);
            if (resourceId == 0 || (colorStateList = C04330Ez.LIZJ(resourceId, this.LJLILLLLZI.getContext())) == null) {
                colorStateList = typedArray.getColorStateList(0);
            }
            h0.LJIL(this.LJLILLLLZI, colorStateList);
        } else {
            h0.LJIL(this.LJLILLLLZI, null);
        }
        if (typedArray.hasValue(1)) {
            h0.LJJ(this.LJLILLLLZI, AnonymousClass179.LIZ(typedArray.getInt(1, -1), PorterDuff.Mode.SRC_IN));
        } else {
            h0.LJJ(this.LJLILLLLZI, PorterDuff.Mode.SRC_IN);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLZI(android.graphics.drawable.Drawable r3) {
        /*
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.LJLJI
            if (r0 != r3) goto L5
            return
        L5:
            r2.LJLJI = r3
            android.graphics.drawable.Drawable r1 = r2.LJLJJI
            r0 = 0
            if (r1 == 0) goto L11
            if (r1 == r3) goto L13
            r1.setCallback(r0)
        L11:
            if (r3 == 0) goto L24
        L13:
            android.graphics.drawable.Drawable r1 = X.C07840Sm.LJFF(r3)
            r2.LJLJJI = r1
            if (r1 == r3) goto L20
            android.view.View r0 = r2.LJLILLLLZI
            r1.setCallback(r0)
        L20:
            r2.LLLZ()
        L23:
            return
        L24:
            r2.LJLJJI = r0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55932Hl.LLLZI(android.graphics.drawable.Drawable):void");
    }

    public final void LLLZIL(ColorStateList colorStateList) {
        if (this.LJLJJL == null) {
            this.LJLJJL = new AnonymousClass178();
        }
        AnonymousClass178 anonymousClass178 = this.LJLJJL;
        anonymousClass178.LIZ = colorStateList;
        anonymousClass178.LIZLLL = true;
        LLLZ();
    }

    public final void LLLZL(PorterDuff.Mode mode) {
        if (this.LJLJJL == null) {
            this.LJLJJL = new AnonymousClass178();
        }
        AnonymousClass178 anonymousClass178 = this.LJLJJL;
        anonymousClass178.LIZIZ = mode;
        anonymousClass178.LIZJ = true;
        LLLZ();
    }

    @Override // X.AbstractC534928b
    public final void LLLLZLLLI(AttributeSet attributeSet, int i, int i2) {
        LLLZI(this.LJLILLLLZI.getBackground());
        super.LLLLZLLLI(attributeSet, i, i2);
    }
}
