package X;

import java.util.Collections;
import java.util.LinkedHashSet;

/* renamed from: X.Mt9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58223Mt9 extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Set<Integer>> {
    public static final C58223Mt9 LJLIL = new C58223Mt9();

    public C58223Mt9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Set<Integer> invoke() {
        return Collections.synchronizedSet(new LinkedHashSet());
    }
}
