package X;

import java.util.LinkedHashMap;

/* loaded from: classes8.dex */
public final class GRW {
    public static final /* synthetic */ int LIZIZ = 0;
    public final java.util.Map<InterfaceC65350Pko<?>, GQ2<?>> LIZ = new LinkedHashMap();

    public final void LIZ(C65776Prg c65776Prg, GQ2 gq2) {
        if (!this.LIZ.containsKey(c65776Prg)) {
            this.LIZ.put(c65776Prg, gq2);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("renderer for ");
        LIZ.append(c65776Prg);
        LIZ.append(" is already registered");
        throw new UnsupportedOperationException(X1D.LIZIZ(LIZ));
    }
}
