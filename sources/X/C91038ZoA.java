package X;

import com.uber.h3core.H3Core;
import java.util.Collection;
import java.util.function.Function;

/* renamed from: X.ZoA, reason: case insensitive filesystem */
/* loaded from: classes24.dex */
public final /* synthetic */ class C91038ZoA implements Function {
    public final /* synthetic */ H3Core LIZ;

    public /* synthetic */ C91038ZoA(H3Core h3Core) {
        this.LIZ = h3Core;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return H3Core.lambda$semisugar$h3ToStringList$0(this.LIZ, (Collection) obj);
    }
}
