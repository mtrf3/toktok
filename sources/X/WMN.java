package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.navigation.Record;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public class WMN implements InterfaceC82169WMr {
    public final Class<? extends WM7> LIZ;
    public final WMU LIZIZ = null;
    public final /* synthetic */ WMI LIZJ;

    @Override // X.InterfaceC82169WMr
    public final void execute() {
        List<Record> LIZIZ = this.LIZJ.LIZIZ.LIZIZ();
        int i = 0;
        for (int size = ((ArrayList) LIZIZ).size() - 1; size >= 0; size--) {
            if (((Record) ListProtector.get(LIZIZ, size)).LJLIL.getClass() == this.LIZ) {
                if (i == 0) {
                    return;
                }
                new WMR(this.LIZJ, this.LIZIZ, i).execute();
                return;
            }
            i++;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cant find ");
        LIZ.append(C16880lQ.LJLLJ(this.LIZ));
        LIZ.append(" in backStack");
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public WMN(WMI wmi, Class cls) {
        this.LIZJ = wmi;
        this.LIZ = cls;
    }
}
