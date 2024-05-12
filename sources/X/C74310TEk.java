package X;

import androidx.lifecycle.LiveData;

/* renamed from: X.TEk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74310TEk {
    public static /* synthetic */ LiveData LIZIZ(InterfaceC74309TEj interfaceC74309TEj, boolean z, int i) {
        boolean z2;
        boolean z3 = true;
        if ((i & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 2) == 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return interfaceC74309TEj.LIZIZ(null, z2, z3, z);
    }

    public static /* synthetic */ LiveData LIZ(InterfaceC74309TEj interfaceC74309TEj, String str, boolean z, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        return interfaceC74309TEj.LJIIJ(str, null, z, false);
    }
}
