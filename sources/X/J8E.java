package X;

import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes9.dex */
public abstract class J8E implements Serializable {
    public final HashMap<String, String> LJLIL = new HashMap<>();

    public abstract HashMap<String, String> buildParams();

    public void installToMetrics(JHM jhm) {
        HashMap<String, String> buildParams = buildParams();
        if (jhm != null) {
            jhm.LIZ(buildParams);
        }
    }

    public final void appendParam(String str, String str2, InterfaceC1798974f interfaceC1798974f) {
        this.LJLIL.put(str, interfaceC1798974f.LIZ(str2));
    }
}
