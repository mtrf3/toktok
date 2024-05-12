package X;

import android.content.Context;
import android.util.SparseArray;

/* renamed from: X.Um5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78169Um5 {
    public static final SparseArray<InterfaceC78204Ume> LIZIZ = new SparseArray<>(2);
    public static int LIZJ;
    public static C78169Um5 LIZLLL;
    public final Context LIZ;

    public static C78169Um5 LIZ() {
        if (LIZLLL == null) {
            LIZLLL = new C78169Um5();
        }
        return LIZLLL;
    }

    public C78169Um5() {
        InterfaceC32258ClK interfaceC32258ClK = (InterfaceC32258ClK) C32260ClM.LIZ(InterfaceC32258ClK.class);
        if (interfaceC32258ClK != null) {
            this.LIZ = C16880lQ.LLLLL(interfaceC32258ClK.context());
        }
    }
}
