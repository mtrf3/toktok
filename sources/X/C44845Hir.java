package X;

import com.ss.android.vesdk.VEConfigCenter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Hir, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44845Hir {
    public static boolean LIZ;
    public static final C44845Hir LIZIZ = new C44845Hir();

    public static void LIZ() {
        C44839Hil c44839Hil = ((XFZ) C83739Wtj.LIZIZ()).LIZIZ;
        c44839Hil.getClass();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((HashMap) C44839Hil.LIZIZ()).entrySet()) {
            hashMap.put(entry.getKey(), c44839Hil.LIZ((InterfaceC44844Hiq) entry.getValue()).getFirst());
        }
        VEConfigCenter vEConfigCenter = VEConfigCenter.getInstance();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            ((String) entry2.getKey()).equals("ve_enable_set_preview_surface_priority");
            vEConfigCenter.updateValue((String) entry2.getKey(), entry2.getValue());
        }
    }
}
