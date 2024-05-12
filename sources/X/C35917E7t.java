package X;

import java.util.Collections;
import java.util.LinkedHashMap;

/* renamed from: X.E7t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35917E7t extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, C35911E7n>> {
    public static final C35917E7t LJLIL = new C35917E7t();

    public C35917E7t() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, C35911E7n> invoke() {
        return Collections.synchronizedMap(new LinkedHashMap());
    }
}
