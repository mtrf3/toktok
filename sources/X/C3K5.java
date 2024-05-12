package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.3K5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3K5 implements C4WS {
    public static boolean LJLJI;
    public static boolean LJLJJI;
    public static boolean LJLJJL;
    public static boolean LJLJJLL;
    public static int LJLJL;
    public static int LJLJLJ;
    public static int LJLJLLL;
    public static boolean LJLLI;
    public static final C3K5 LJLIL = new C3K5();
    public static final java.util.Map<String, Long> LJLILLLLZI = new LinkedHashMap();
    public static final HashMap<String, C3JY> LJLL = new HashMap<>();
    public static String LJLLILLLL = "";
    public static String LJLLJ = "";
    public static String LJLLL = "";
    public static String LJLLLL = "";

    public final synchronized void LIZIZ() {
        LIZJ("on_node_show", null);
    }

    @Override // X.C4WS
    public final void LJI() {
    }

    @Override // X.C4WS
    public final synchronized void LJII() {
        LIZJ("start_query", null);
        C3K4.LIZJ(C3K4.LIZ, "5");
    }

    public static void LJFF() {
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C3K6(LJLIL, false, null), 3);
    }

    public static boolean LIZ(String... strArr) {
        for (String str : strArr) {
            if (!LJLILLLLZI.containsKey(str)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091 A[Catch: all -> 0x020c, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0009, B:14:0x001e, B:16:0x0033, B:18:0x0042, B:19:0x004c, B:23:0x0055, B:25:0x0064, B:27:0x0073, B:28:0x007a, B:31:0x0082, B:33:0x0091, B:35:0x00a0, B:36:0x00a7, B:39:0x00af, B:42:0x00bb, B:45:0x00d2, B:48:0x00e9, B:51:0x00f7, B:54:0x0105, B:57:0x0123, B:59:0x013c, B:61:0x014b, B:62:0x0166, B:63:0x016a, B:65:0x0187, B:67:0x0196, B:68:0x019d, B:69:0x01a1, B:71:0x01bf, B:73:0x01cd, B:74:0x01d1, B:75:0x01d3), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013c A[Catch: all -> 0x020c, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0009, B:14:0x001e, B:16:0x0033, B:18:0x0042, B:19:0x004c, B:23:0x0055, B:25:0x0064, B:27:0x0073, B:28:0x007a, B:31:0x0082, B:33:0x0091, B:35:0x00a0, B:36:0x00a7, B:39:0x00af, B:42:0x00bb, B:45:0x00d2, B:48:0x00e9, B:51:0x00f7, B:54:0x0105, B:57:0x0123, B:59:0x013c, B:61:0x014b, B:62:0x0166, B:63:0x016a, B:65:0x0187, B:67:0x0196, B:68:0x019d, B:69:0x01a1, B:71:0x01bf, B:73:0x01cd, B:74:0x01d1, B:75:0x01d3), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0187 A[Catch: all -> 0x020c, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0009, B:14:0x001e, B:16:0x0033, B:18:0x0042, B:19:0x004c, B:23:0x0055, B:25:0x0064, B:27:0x0073, B:28:0x007a, B:31:0x0082, B:33:0x0091, B:35:0x00a0, B:36:0x00a7, B:39:0x00af, B:42:0x00bb, B:45:0x00d2, B:48:0x00e9, B:51:0x00f7, B:54:0x0105, B:57:0x0123, B:59:0x013c, B:61:0x014b, B:62:0x0166, B:63:0x016a, B:65:0x0187, B:67:0x0196, B:68:0x019d, B:69:0x01a1, B:71:0x01bf, B:73:0x01cd, B:74:0x01d1, B:75:0x01d3), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bf A[Catch: all -> 0x020c, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0009, B:14:0x001e, B:16:0x0033, B:18:0x0042, B:19:0x004c, B:23:0x0055, B:25:0x0064, B:27:0x0073, B:28:0x007a, B:31:0x0082, B:33:0x0091, B:35:0x00a0, B:36:0x00a7, B:39:0x00af, B:42:0x00bb, B:45:0x00d2, B:48:0x00e9, B:51:0x00f7, B:54:0x0105, B:57:0x0123, B:59:0x013c, B:61:0x014b, B:62:0x0166, B:63:0x016a, B:65:0x0187, B:67:0x0196, B:68:0x019d, B:69:0x01a1, B:71:0x01bf, B:73:0x01cd, B:74:0x01d1, B:75:0x01d3), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LJ(boolean r15) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3K5.LJ(boolean):void");
    }

    public static void LIZJ(String str, InterfaceC65784Pro interfaceC65784Pro) {
        if (!((Boolean) C3O7.LIZ.getValue()).booleanValue()) {
            return;
        }
        java.util.Map<String, Long> map = LJLILLLLZI;
        if (map.containsKey(str)) {
            return;
        }
        map.put(str, Long.valueOf(SystemClock.uptimeMillis()));
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // X.C4WS
    public final synchronized void LJIIJJI(C81913Jj result, C4WE onFilterResult) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(onFilterResult, "onFilterResult");
        C3K4.LIZ.LIZIZ(result);
        if (result.LJLILLLLZI.isEmpty()) {
            return;
        }
        LIZJ("fast_load", new AqS151S0100000_1(result, 879));
        if (result.LJLJJL < 0) {
            return;
        }
        LIZJ("preloaded", new AqS151S0100000_1(result, 880));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZLLL(C3K5 c3k5, String str, java.util.Map map, JSONObject jSONObject, int i) {
        if ((i & 2) != 0) {
            map = null;
        }
        if ((i & 4) != 0) {
            jSONObject = null;
        }
        c3k5.getClass();
        if (map != null) {
            C772831o.LIZ().LIZIZ(str, map);
        } else {
            if (jSONObject == null) {
                return;
            }
            C772831o.LIZ().LIZ(str, jSONObject);
        }
    }
}
