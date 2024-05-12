package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VkD, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80601VkD extends AbstractC80600VkC {
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;

    @Override // X.AbstractC80600VkC
    public final void LIZ() {
        if (this.LJI >= this.LIZ * 2) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("The indicatorSize (");
        LIZ.append(this.LJI);
        LIZ.append(" px) cannot be less than twice of the trackThickness (");
        throw new IllegalArgumentException(C08380Uo.LIZ(LIZ, this.LIZ, " px).", LIZ));
    }

    public C80601VkD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.a3d, R.style.a0e);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.a37);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.a32);
        TypedArray LIZLLL = C80244VeS.LIZLLL(context, attributeSet, new int[]{R.attr.ahi, R.attr.ahk, R.attr.ahl}, R.attr.a3d, R.style.a0e, new int[0]);
        this.LJI = C80285Vf7.LIZJ(context, LIZLLL, 2, dimensionPixelSize);
        this.LJII = C80285Vf7.LIZJ(context, LIZLLL, 1, dimensionPixelSize2);
        this.LJIIIIZZ = LIZLLL.getInt(0, 0);
        LIZLLL.recycle();
        LIZ();
    }
}
