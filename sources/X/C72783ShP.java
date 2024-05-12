package X;

import android.graphics.BlurMaskFilter;
import kotlin.jvm.internal.o;

/* renamed from: X.ShP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72783ShP extends F9E {
    public final float LJLIL;
    public final BlurMaskFilter.Blur LJLILLLLZI;
    public final float LJLJI;
    public final float LJLJJI;
    public final int LJLJJL;
    public final float LJLJJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Float.valueOf(this.LJLIL), this.LJLILLLLZI, Float.valueOf(this.LJLJI), Float.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), Float.valueOf(this.LJLJJLL)};
    }

    public C72783ShP(float f, BlurMaskFilter.Blur blur, float f2, int i, float f3) {
        o.LJIIIZ(blur, "blur");
        this.LJLIL = f;
        this.LJLILLLLZI = blur;
        this.LJLJI = 0.0f;
        this.LJLJJI = f2;
        this.LJLJJL = i;
        this.LJLJJLL = f3;
    }
}
