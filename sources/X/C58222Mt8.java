package X;

import java.util.Collections;
import java.util.LinkedHashSet;

/* renamed from: X.Mt8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58222Mt8 extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Set<String>> {
    public static final C58222Mt8 LJLIL = new C58222Mt8();

    public C58222Mt8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Set<String> invoke() {
        return Collections.synchronizedSet(new LinkedHashSet());
    }
}
