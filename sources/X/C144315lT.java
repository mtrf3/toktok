package X;

import android.util.Size;
import kotlin.jvm.internal.o;

/* renamed from: X.5lT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144315lT extends F9E {
    public final Size LJLIL;
    public final boolean LJLILLLLZI;

    public C144315lT() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public /* synthetic */ C144315lT(int i) {
        this(new Size(0, 0), true);
    }

    public C144315lT(Size size, boolean z) {
        o.LJIIIZ(size, "size");
        this.LJLIL = size;
        this.LJLILLLLZI = z;
    }
}
