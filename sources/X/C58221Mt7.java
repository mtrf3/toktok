package X;

import java.util.Collections;
import java.util.LinkedHashSet;

/* renamed from: X.Mt7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58221Mt7 extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Set<String>> {
    public static final C58221Mt7 LJLIL = new C58221Mt7();

    public C58221Mt7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Set<String> invoke() {
        return Collections.synchronizedSet(new LinkedHashSet());
    }
}
