package X;

import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.google.android.play.core.appupdate.h;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.122, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass122 {
    public static final C5H3 LIZ = C78996UzQ.LJJIJIIJI(AnonymousClass281.LJLIL);
    public static final C5H3 LIZIZ = C78996UzQ.LJJIJIIJI(AnonymousClass280.LJLIL);
    public static final C5H3 LIZJ = C78996UzQ.LJJIJIIJI(C534727z.LJLIL);
    public static final C5H3 LIZLLL = C78996UzQ.LJJIJIIJI(C534527x.LJLIL);
    public static final C5H3 LJ = C78996UzQ.LJJIJIIJI(C534627y.LJLIL);
    public static final ConcurrentHashMap<String, InterfaceC24110x5> LJFF = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, ConcurrentHashMap<String, AnonymousClass127>> LJI = new ConcurrentHashMap<>();

    public static void LIZ(BFR bfr, String str, JSONObject jSONObject, long j) {
        h ce0;
        long j2;
        AnonymousClass127 putIfAbsent;
        ConcurrentHashMap<String, AnonymousClass127> putIfAbsent2;
        ConcurrentHashMap<String, ConcurrentHashMap<String, AnonymousClass127>> concurrentHashMap = LJI;
        ConcurrentHashMap<String, AnonymousClass127> concurrentHashMap2 = concurrentHashMap.get(str);
        if (concurrentHashMap2 == null && (putIfAbsent2 = concurrentHashMap.putIfAbsent(str, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap2 = putIfAbsent2;
        }
        ConcurrentHashMap<String, AnonymousClass127> concurrentHashMap3 = concurrentHashMap2;
        String str2 = bfr.LJLIL;
        AnonymousClass127 anonymousClass127 = concurrentHashMap3.get(str2);
        if (anonymousClass127 == null && (putIfAbsent = concurrentHashMap3.putIfAbsent(str2, (anonymousClass127 = new AnonymousClass127()))) != null) {
            anonymousClass127 = putIfAbsent;
        }
        AnonymousClass127 anonymousClass1272 = anonymousClass127;
        anonymousClass1272.LIZ = System.currentTimeMillis();
        anonymousClass1272.LIZIZ++;
        InterfaceC24110x5 interfaceC24110x5 = LJFF.get(str);
        if (interfaceC24110x5 != null) {
            String str3 = bfr.LJLIL;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            String jSONObject2 = jSONObject.toString();
            o.LJIIIIZZ(jSONObject2, "features ?: JSONObject()).toString()");
            if (C37651dp.LIZIZ > 0) {
                j2 = System.currentTimeMillis() - C37651dp.LIZ;
            } else {
                j2 = 0;
            }
            interfaceC24110x5.LIZ(new C35611aX(j2 / 1000, j, str3, jSONObject2));
        }
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest() && (ce0 = ((IDebugService) CN1.LIZ(IDebugService.class)).ce0()) != null) {
            String str4 = bfr.LJLIL;
            String str5 = bfr.LJLJI;
            String str6 = bfr.LJLILLLLZI;
            C43588H8u.LIZLLL(str4, "triggerType", str, "businessName", str5, "rulePkgName", str6, "ruleName");
            InterfaceC31193CMb interfaceC31193CMb = (InterfaceC31193CMb) ce0.LIZ;
            if (interfaceC31193CMb != null) {
                ((CMZ) interfaceC31193CMb).LIZ(str4, str, str5, str6, "", true);
            }
        }
        AnonymousClass126.LIZ(true, str, bfr, j, "");
    }
}
