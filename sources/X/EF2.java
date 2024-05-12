package X;

import java.util.HashMap;

/* loaded from: classes7.dex */
public final class EF2 {
    public static final EF2 LIZIZ = new EF2();
    public final java.util.Map<Object, EnumC36103EEx> LIZ = new HashMap();

    public EF2() {
        for (EFK efk : EFK.values()) {
            this.LIZ.put(efk, EnumC36103EEx.values()[efk.ordinal()]);
        }
        for (EFN efn : EFN.values()) {
            this.LIZ.put(efn, EnumC36103EEx.values()[efn.ordinal() + 6]);
        }
        for (EFK efk2 : EFK.values()) {
            java.util.Map<Object, EnumC36103EEx> map = this.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("service");
            LIZ.append(efk2.name());
            map.put(X1D.LIZIZ(LIZ), EnumC36103EEx.values()[efk2.ordinal() + 11]);
        }
    }
}
