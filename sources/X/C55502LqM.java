package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LqM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55502LqM {
    public static final C55502LqM LIZ = new C55502LqM();
    public static final List<InterfaceC55513LqX> LIZIZ = new ArrayList();

    public final synchronized void LIZ(InterfaceC55513LqX interfaceC55513LqX) {
        List<InterfaceC55513LqX> list = LIZIZ;
        if (((ArrayList) list).contains(interfaceC55513LqX)) {
            return;
        }
        ((ArrayList) list).add(interfaceC55513LqX);
    }
}
