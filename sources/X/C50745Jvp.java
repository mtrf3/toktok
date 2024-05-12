package X;

import X.InterfaceC50315Jot;
import java.util.HashMap;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.Jvp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50745Jvp<T extends InterfaceC50315Jot> {
    public final HashMap<String, InterfaceC88471Ynr<T, InterfaceC50310Joo, T>> LIZ = new HashMap<>();

    public final void LIZ(C65776Prg c65776Prg, InterfaceC88471Ynr reducer) {
        o.LJIIIZ(reducer, "reducer");
        HashMap<String, InterfaceC88471Ynr<T, InterfaceC50310Joo, T>> hashMap = this.LIZ;
        String LIZLLL = c65776Prg.LIZLLL();
        if (LIZLLL == null) {
            LIZLLL = "";
        }
        hashMap.put(LIZLLL, new AqS190S0100000_8(reducer, (InterfaceC88471Ynr<InterfaceC50315Jot, Object, InterfaceC50315Jot>) 45));
    }
}
