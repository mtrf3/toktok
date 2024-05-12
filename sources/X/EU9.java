package X;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public final class EU9 extends AbstractC65781Prl implements InterfaceC65784Pro<EUC> {
    public static final EU9 LJLIL = new EU9();

    public EU9() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.EUC, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final EUC invoke() {
        Context LLLLL = C16880lQ.LLLLL(EF7.LIZIZ());
        if (LLLLL == null || !EUC.class.isInterface() || !EUC.class.equals(EUC.class)) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) EUB.LIZ;
        ?? r2 = concurrentHashMap.get(EUC.class);
        if (r2 != 0 && (r2 instanceof EUA)) {
            return r2;
        }
        EUA eua = new EUA(LLLLL);
        concurrentHashMap.put(EUC.class, eua);
        return eua;
    }
}
