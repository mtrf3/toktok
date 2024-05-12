package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.FDu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38622FDu extends AbstractC38621FDt {
    @Override // X.AbstractC38621FDt
    public final EnumC38627FDz LIZ() {
        return EnumC38627FDz.NO_CACHE;
    }

    @Override // X.AbstractC38621FDt
    public final InterfaceC38616FDo LIZIZ(Context context, int i, FE1 fe1) {
        o.LJIIJ(context, "context");
        FE0 LJJIJIIJIL = C38891fp.LJJIJIIJIL(i);
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LIZ(fe1);
        }
        return null;
    }
}
