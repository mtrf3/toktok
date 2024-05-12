package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3pF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95693pF extends F9E {
    public final List<C110714Wd> LJLIL;
    public final boolean LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public C95693pF() {
        this(C61878OQg.INSTANCE, false);
    }

    public C95693pF(List<C110714Wd> requests, boolean z) {
        o.LJIIIZ(requests, "requests");
        this.LJLIL = requests;
        this.LJLILLLLZI = z;
    }
}
