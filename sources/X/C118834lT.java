package X;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* renamed from: X.4lT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118834lT extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;
    public final Drawable LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), this.LJLJI, this.LJLJJI};
    }

    public C118834lT(int i, int i2, String str, Drawable drawable) {
        o.LJIIIZ(str, "str");
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = str;
        this.LJLJJI = drawable;
    }
}
