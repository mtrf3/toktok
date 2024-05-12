package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Dxh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35573Dxh extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C35573Dxh LJLIL = new C35573Dxh();

    public C35573Dxh() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        if (!C35570Dxe.LJFF) {
            C35570Dxe.LJFF = true;
            Iterator it = ((LinkedHashMap) C35570Dxe.LJ).entrySet().iterator();
            while (it.hasNext()) {
                ((Runnable) ((Map.Entry) it.next()).getValue()).run();
            }
            ((LinkedHashMap) C35570Dxe.LJ).clear();
        }
        return C76800UCe.LIZ;
    }
}
