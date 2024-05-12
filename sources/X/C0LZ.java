package X;

import android.util.SparseArray;
import kotlin.jvm.internal.IDqS416S0100000;

/* renamed from: X.0LZ, reason: invalid class name */
/* loaded from: classes.dex */
public class C0LZ {
    public final InterfaceC88472Yns<? super Integer, C0G4> LIZ;

    public C0LZ(IDqS416S0100000 iDqS416S0100000) {
        this.LIZ = iDqS416S0100000;
        new SparseArray();
    }

    public final C0G4 LIZ(int i) {
        C0G4 invoke;
        InterfaceC88472Yns<? super Integer, C0G4> interfaceC88472Yns = this.LIZ;
        if (interfaceC88472Yns == null || (invoke = interfaceC88472Yns.invoke(Integer.valueOf(i))) == null) {
            return new C0G4(1, 1);
        }
        return invoke;
    }
}
