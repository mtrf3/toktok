package X;

import java.util.Collections;
import java.util.LinkedHashMap;

/* renamed from: X.MuU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58306MuU extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, String>> {
    public static final C58306MuU LJLIL = new C58306MuU();

    public C58306MuU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, String> invoke() {
        return Collections.synchronizedMap(new LinkedHashMap());
    }
}
