package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: X.1ZA, reason: invalid class name */
/* loaded from: classes.dex */
public class C1ZA extends AbstractC21310sZ {
    public int[][] LJJIJIIJI;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21310sZ
    public void LJ() {
        Object obj;
        int[][] iArr = this.LJJIJIIJI;
        int[][] iArr2 = new int[iArr.length];
        for (int length = iArr.length - 1; length >= 0; length--) {
            int[] iArr3 = this.LJJIJIIJI[length];
            if (iArr3 != null) {
                obj = iArr3.clone();
            } else {
                obj = null;
            }
            iArr2[length] = obj;
        }
        this.LJJIJIIJI = iArr2;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new C1ZB(this, null);
    }

    public final int LJFF(int[] iArr) {
        int[][] iArr2 = this.LJJIJIIJI;
        int i = this.LJII;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new C1ZB(this, resources);
    }

    public C1ZA(C1ZA c1za, C1ZB c1zb, Resources resources) {
        super(c1za, c1zb, resources);
        if (c1za != null) {
            this.LJJIJIIJI = c1za.LJJIJIIJI;
        } else {
            this.LJJIJIIJI = new int[this.LJI.length];
        }
    }
}
