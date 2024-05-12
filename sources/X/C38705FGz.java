package X;

import defpackage.i0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.FGz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38705FGz {
    public static List<String> LIZIZ() {
        java.util.Map<String, ?> all = FHK.LIZJ.LIZ.getAll();
        if (all == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            if (key != null && key.endsWith("_vid_suffix")) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    public static void LIZ(String str) {
        FHK fhk = FHK.LIZJ;
        fhk.getClass();
        InterfaceC38688FGi interfaceC38688FGi = FHC.LIZIZ().LIZLLL;
        if (interfaceC38688FGi != null && interfaceC38688FGi.LJ()) {
            if (fhk.LIZ.contains(str)) {
                fhk.LIZ.LIZ(str);
                return;
            }
            return;
        }
        fhk.LIZ.LIZ(str);
    }

    public static String LIZJ(String str) {
        return i0.LJFF(str, "_vid_suffix");
    }
}
