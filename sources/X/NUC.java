package X;

import java.util.Collections;
import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public final class NUC extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, String>> {
    public static final NUC LJLIL = new NUC();

    public NUC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, String> invoke() {
        return Collections.synchronizedMap(new LinkedHashMap());
    }
}