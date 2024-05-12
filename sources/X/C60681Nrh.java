package X;

import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Nrh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60681Nrh {
    public static final java.util.Map<String, C60682Nri> LIZ = new ConcurrentHashMap(3);
    public static final java.util.Map<String, Integer> LIZIZ = new LinkedHashMap();

    public static C60682Nri LIZ(String str, boolean z, boolean z2, Boolean bool) {
        EnumC60683Nrj enumC60683Nrj;
        if (bool == null) {
            return new C60682Nri(str, C60682Nri.LIZJ(), z, z2, EnumC60683Nrj.DEFAULT);
        }
        boolean booleanValue = bool.booleanValue();
        String LIZJ = C60682Nri.LIZJ();
        if (booleanValue) {
            enumC60683Nrj = EnumC60683Nrj.ENABLE;
        } else {
            enumC60683Nrj = EnumC60683Nrj.DISABLE;
        }
        return new C60682Nri(str, LIZJ, z, z2, enumC60683Nrj);
    }
}
