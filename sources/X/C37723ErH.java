package X;

import java.util.Collections;
import java.util.LinkedHashMap;

/* renamed from: X.ErH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37723ErH extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, C25570A1u>> {
    public static final C37723ErH LJLIL = new C37723ErH();

    public C37723ErH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, C25570A1u> invoke() {
        return Collections.synchronizedMap(new LinkedHashMap());
    }
}
