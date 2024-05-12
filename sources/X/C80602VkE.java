package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VkE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80602VkE extends AbstractC80600VkC {
    public int LJI;
    public int LJII;
    public boolean LJIIIIZZ;

    @Override // X.AbstractC80600VkC
    public final void LIZ() {
        if (this.LJI == 0) {
            if (this.LIZIZ <= 0) {
                if (this.LIZJ.length >= 3) {
                    return;
                } else {
                    throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
                }
            }
            throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
        }
    }

    public C80602VkE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.aoq, R.style.a0q);
        TypedArray LIZLLL = C80244VeS.LIZLLL(context, attributeSet, new int[]{R.attr.ahf, R.attr.ahj}, R.attr.aoq, R.style.a0q, new int[0]);
        this.LJI = LIZLLL.getInt(0, 1);
        this.LJII = LIZLLL.getInt(1, 0);
        LIZLLL.recycle();
        LIZ();
        this.LJIIIIZZ = this.LJII == 1;
    }
}
