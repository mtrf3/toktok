package X;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.Eno, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37508Eno implements InterfaceC37540EoK {
    public final java.util.Map<String, C37506Enm> LIZ = new HashMap();

    @Override // X.InterfaceC37540EoK
    public final void LIZ(C37506Enm c37506Enm) {
        C37516Enw c37516Enw = C37516Enw.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[EnvService] initialize cost: start=");
        LIZ.append(c37516Enw.LIZ);
        LIZ.append(", end=");
        LIZ.append(c37516Enw.LIZIZ);
        LIZ.append(".");
        C37238EjS.LJFF(X1D.LIZIZ(LIZ));
        if (c37506Enm == null) {
            return;
        }
        String str = c37506Enm.LIZ;
        if (!TextUtils.isEmpty(str)) {
            ((HashMap) this.LIZ).put(str, c37506Enm);
            return;
        }
        throw null;
    }

    public final C37506Enm LIZIZ(String str) {
        C37506Enm c37506Enm = (C37506Enm) ((HashMap) this.LIZ).get(str);
        if (c37506Enm == null) {
            return new C37506Enm();
        }
        return c37506Enm;
    }
}
