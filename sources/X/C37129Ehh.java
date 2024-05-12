package X;

import Y.ACallableS83S0200000_6;
import Y.AgS123S0100000_6;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ehh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37129Ehh extends AbstractC38521fE {
    @Override // X.AbstractC38521fE
    public final boolean LJIIIZ() {
        AbstractC37134Ehm dynamicAbstractTask = (AbstractC37134Ehm) this.LJLILLLLZI;
        o.LJIIIZ(dynamicAbstractTask, "dynamicAbstractTask");
        try {
            C09900aA.LJI("df_install_start", new JSONObject(dynamicAbstractTask.LJ()), null, null);
        } catch (Exception unused) {
        }
        String packageName = dynamicAbstractTask.LIZIZ;
        o.LJIIIZ(packageName, "packageName");
        C37100EhE c37100EhE = (C37100EhE) ((HashMap) C37095Eh9.LIZJ).get(packageName);
        if (c37100EhE == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("The state of ");
            LIZ.append(packageName);
            LIZ.append("was not found");
            C36922EeM.LJ(X1D.LIZIZ(LIZ));
            dynamicAbstractTask.LIZ(2, dynamicAbstractTask.LJIIIIZZ);
            return false;
        }
        int i = c37100EhE.LIZJ;
        C37099EhD.LIZIZ(i, dynamicAbstractTask);
        if (i == 5) {
            if (dynamicAbstractTask.LIZJ()) {
                dynamicAbstractTask.LIZIZ(1);
                return true;
            }
        } else if (i == 2 || i == 4) {
            F5V.LIZLLL().LJ(dynamicAbstractTask.LIZ).LIZ(dynamicAbstractTask);
            return false;
        }
        F5V LIZLLL = F5V.LIZLLL();
        LIZLLL.getClass();
        C10K.LIZIZ(new ACallableS83S0200000_6(LIZLLL, dynamicAbstractTask, 14), LIZLLL.LJLIL, null).LIZLLL(new AgS123S0100000_6(dynamicAbstractTask, 13));
        return false;
    }

    public C37129Ehh(C37122Eha c37122Eha) {
        super(c37122Eha);
    }
}
