package X;

import java.util.Collections;

/* renamed from: X.Mw0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58400Mw0 implements InterfaceC58399Mvz {
    public static final C58400Mw0 LIZ = new C58400Mw0();

    @Override // X.InterfaceC58399Mvz
    public final void getRequestHeaders() {
    }

    @Override // X.InterfaceC58399Mvz
    public final java.util.Map<String, String> LIZ(String str) {
        return Collections.singletonMap("client_id", str);
    }
}
