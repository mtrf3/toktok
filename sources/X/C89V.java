package X;

import android.graphics.BlurMaskFilter;
import kotlin.jvm.internal.o;

/* renamed from: X.89V, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C89V extends F9E {
    public final float LJLIL;
    public final BlurMaskFilter.Blur LJLILLLLZI;
    public final float LJLJI;
    public final float LJLJJI;
    public final int LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Float.valueOf(this.LJLIL), this.LJLILLLLZI, Float.valueOf(this.LJLJI), Float.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL)};
    }

    public C89V(float f, BlurMaskFilter.Blur blur, float f2, int i) {
        o.LJIIIZ(blur, "blur");
        this.LJLIL = f;
        this.LJLILLLLZI = blur;
        this.LJLJI = 0.0f;
        this.LJLJJI = f2;
        this.LJLJJL = i;
    }
}
