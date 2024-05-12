package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import com.zhiliaoapp.musically.R;

/* renamed from: X.47f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1042347f extends F9E implements C4KA {
    public final int LJLIL;
    public final int LJLILLLLZI = R.attr.e0;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI)};
    }

    public C1042347f(int i) {
        this.LJLIL = i;
    }

    @Override // X.C4KA
    public final void LJLLJ(Context context, GradientDrawable gradientDrawable) {
        Integer LJI = C79045V0n.LJI(this.LJLILLLLZI, context);
        if (LJI != null) {
            gradientDrawable.setStroke((int) context.getResources().getDimension(this.LJLIL), LJI.intValue());
        }
    }
}
