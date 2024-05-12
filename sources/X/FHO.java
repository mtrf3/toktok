package X;

import com.bytedance.ies.abmock.ConfigItem;
import com.google.gson.Gson;
import com.google.gson.m;
import java.util.HashSet;

/* loaded from: classes7.dex */
public final class FHO {
    public static Gson LJ;
    public final FHP LIZ;
    public final java.util.Set<String> LIZIZ = new HashSet();
    public final java.util.Map<String, ConfigItem> LIZJ;
    public final m LIZLLL;

    public final void LIZ(String str) {
        InterfaceC38688FGi interfaceC38688FGi = FHC.LIZIZ().LIZLLL;
        if (interfaceC38688FGi != null && interfaceC38688FGi.LJ()) {
            if (this.LIZ.contains(str)) {
                this.LIZ.LIZ(str);
                return;
            }
            return;
        }
        this.LIZ.LIZ(str);
    }

    public FHO(FHP fhp, java.util.Map<String, ConfigItem> map, m mVar) {
        this.LIZ = fhp;
        this.LIZJ = map;
        this.LIZLLL = mVar;
    }
}
