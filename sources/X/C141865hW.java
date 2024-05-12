package X;

import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5hW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141865hW {
    public static final ConcurrentHashMap<OSZ<String, String>, String> LIZ = new ConcurrentHashMap<>();

    public static String LIZIZ() {
        java.util.Set<OSZ<String, String>> keySet = LIZ.keySet();
        o.LJIIIIZZ(keySet, "modelPathCache.keys");
        OSZ<String, String> osz = null;
        for (OSZ<String, String> osz2 : keySet) {
            if (o.LJ(osz2.getFirst(), "") && o.LJ(osz2.getSecond(), "audio_metrics")) {
                osz = osz2;
            }
        }
        if (osz != null) {
            ConcurrentHashMap<OSZ<String, String>, String> concurrentHashMap = LIZ;
            String str = concurrentHashMap.get(osz);
            if (str == null || str.length() == 0 || !F9B.LIZ(str)) {
                concurrentHashMap.remove(osz);
            } else {
                return str;
            }
        }
        return "";
    }

    public static Object LIZ(String str, final String str2, InterfaceC67352kd interfaceC67352kd) {
        final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{str}, C113554cx.LJJLIIIIJ(new OSZ(str, C47261Igj.LJJIJIL(str2))), new IFetchResourceListener() { // from class: X.5hV
            @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
            public final void onFailure(Exception exception) {
                o.LJIIIZ(exception, "exception");
                InterfaceC67352kd<String> interfaceC67352kd2 = c84654XKg;
                C3C5.m7constructorimpl("");
                interfaceC67352kd2.resumeWith("");
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027 A[Catch: Exception -> 0x0048, TryCatch #0 {Exception -> 0x0048, blocks: (B:3:0x0002, B:5:0x0007, B:7:0x0012, B:8:0x0021, B:10:0x0027, B:13:0x003f, B:15:0x0038), top: B:2:0x0002 }] */
            /* JADX WARN: Removed duplicated region for block: B:13:0x003f A[Catch: Exception -> 0x0048, TRY_LEAVE, TryCatch #0 {Exception -> 0x0048, blocks: (B:3:0x0002, B:5:0x0007, B:7:0x0012, B:8:0x0021, B:10:0x0027, B:13:0x003f, B:15:0x0038), top: B:2:0x0002 }] */
            @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onSuccess(long r6) {
                /*
                    r5 = this;
                    java.lang.String r3 = ""
                    boolean r0 = com.ss.android.ugc.effectmanager.knadapt.UseKNPlatform.enableKNPlatform     // Catch: java.lang.Exception -> L48
                    r4 = 0
                    if (r0 == 0) goto L38
                    X.XBf r0 = X.XBE.LJIIIIZZ     // Catch: java.lang.Exception -> L48
                    r0.getClass()     // Catch: java.lang.Exception -> L48
                    boolean r0 = X.C84419XBf.LIZJ()     // Catch: java.lang.Exception -> L48
                    if (r0 == 0) goto L38
                    X.XBE r0 = X.C84419XBf.LIZ()     // Catch: java.lang.Exception -> L48
                    com.ss.ugc.effectplatform.algorithm.AlgorithmModelResourceFinder r2 = r0.LIZLLL()     // Catch: java.lang.Exception -> L48
                    java.lang.String r1 = r1     // Catch: java.lang.Exception -> L48
                    r0 = 0
                    java.lang.String r2 = r2.realFindResourceUri(r0, r4, r1)     // Catch: java.lang.Exception -> L48
                L21:
                    boolean r0 = X.C78685UuP.LJJJZ(r2)     // Catch: java.lang.Exception -> L48
                    if (r0 == 0) goto L3f
                    X.2kd<java.lang.String> r1 = r2     // Catch: java.lang.Exception -> L48
                    java.net.URI r0 = java.net.URI.create(r2)     // Catch: java.lang.Exception -> L48
                    java.lang.String r0 = r0.getPath()     // Catch: java.lang.Exception -> L48
                    X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Exception -> L48
                    r1.resumeWith(r0)     // Catch: java.lang.Exception -> L48
                    goto L5a
                L38:
                    java.lang.String r0 = r1     // Catch: java.lang.Exception -> L48
                    java.lang.String r2 = com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder.findResourceUri(r4, r0)     // Catch: java.lang.Exception -> L48
                    goto L21
                L3f:
                    X.2kd<java.lang.String> r0 = r2     // Catch: java.lang.Exception -> L48
                    X.C3C5.m7constructorimpl(r3)     // Catch: java.lang.Exception -> L48
                    r0.resumeWith(r3)     // Catch: java.lang.Exception -> L48
                    goto L5a
                L48:
                    r0 = move-exception
                    java.lang.StackTraceElement[] r1 = r0.getStackTrace()
                    java.io.PrintStream r0 = java.lang.System.out
                    r0.print(r1)
                    X.2kd<java.lang.String> r0 = r2
                    X.C3C5.m7constructorimpl(r3)
                    r0.resumeWith(r3)
                L5a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C141855hV.onSuccess(long):void");
            }
        });
        return c84654XKg.LIZ();
    }
}
