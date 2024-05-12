package X;

import java.util.Collections;
import java.util.LinkedHashMap;

/* renamed from: X.MuX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58309MuX extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, C59886Nes>> {
    public static final C58309MuX LJLIL = new C58309MuX();

    public C58309MuX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, C59886Nes> invoke() {
        return Collections.synchronizedMap(new LinkedHashMap());
    }
}
