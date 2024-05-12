package X;

import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import kotlin.jvm.internal.o;

/* renamed from: X.5fI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140485fI {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String requirement, final String modelName, final InterfaceC126374xd interfaceC126374xd) {
        o.LJIIIZ(requirement, "requirement");
        o.LJIIIZ(modelName, "modelName");
        DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{requirement}, C113554cx.LJJLIIIIJ(new OSZ(requirement, C47261Igj.LJJIJIL(modelName))), new IFetchResourceListener() { // from class: X.5hT
            @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
            public final void onFailure(Exception exception) {
                o.LJIIIZ(exception, "exception");
                InterfaceC126374xd interfaceC126374xd2 = interfaceC126374xd;
                if (interfaceC126374xd2 != null) {
                    interfaceC126374xd2.onFailure();
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0042 A[Catch: Exception -> 0x004a, TryCatch #0 {Exception -> 0x004a, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0010, B:7:0x001f, B:9:0x0025, B:11:0x0031, B:15:0x0042, B:17:0x0046, B:20:0x003a), top: B:1:0x0000 }] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[Catch: Exception -> 0x004a, TryCatch #0 {Exception -> 0x004a, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0010, B:7:0x001f, B:9:0x0025, B:11:0x0031, B:15:0x0042, B:17:0x0046, B:20:0x003a), top: B:1:0x0000 }] */
            @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onSuccess(long r5) {
                /*
                    r4 = this;
                    boolean r0 = com.ss.android.ugc.effectmanager.knadapt.UseKNPlatform.enableKNPlatform     // Catch: java.lang.Exception -> L4a
                    r3 = 0
                    if (r0 == 0) goto L3a
                    X.XBf r0 = X.XBE.LJIIIIZZ     // Catch: java.lang.Exception -> L4a
                    r0.getClass()     // Catch: java.lang.Exception -> L4a
                    boolean r0 = X.C84419XBf.LIZJ()     // Catch: java.lang.Exception -> L4a
                    if (r0 == 0) goto L3a
                    X.XBE r0 = X.C84419XBf.LIZ()     // Catch: java.lang.Exception -> L4a
                    com.ss.ugc.effectplatform.algorithm.AlgorithmModelResourceFinder r2 = r0.LIZLLL()     // Catch: java.lang.Exception -> L4a
                    java.lang.String r1 = r1     // Catch: java.lang.Exception -> L4a
                    r0 = 0
                    java.lang.String r1 = r2.realFindResourceUri(r0, r3, r1)     // Catch: java.lang.Exception -> L4a
                L1f:
                    boolean r0 = X.C78685UuP.LJJJZ(r1)     // Catch: java.lang.Exception -> L4a
                    if (r0 == 0) goto L42
                    java.net.URI r0 = java.net.URI.create(r1)     // Catch: java.lang.Exception -> L4a
                    java.lang.String r2 = r0.getPath()     // Catch: java.lang.Exception -> L4a
                    X.4xd r1 = r2     // Catch: java.lang.Exception -> L4a
                    if (r1 == 0) goto L41
                    java.lang.String r0 = "modelPath"
                    kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)     // Catch: java.lang.Exception -> L4a
                    r1.onSuccess(r2)     // Catch: java.lang.Exception -> L4a
                    goto L41
                L3a:
                    java.lang.String r0 = r1     // Catch: java.lang.Exception -> L4a
                    java.lang.String r1 = com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder.findResourceUri(r3, r0)     // Catch: java.lang.Exception -> L4a
                    goto L1f
                L41:
                    return
                L42:
                    X.4xd r0 = r2     // Catch: java.lang.Exception -> L4a
                    if (r0 == 0) goto L5b
                    r0.onFailure()     // Catch: java.lang.Exception -> L4a
                    goto L5b
                L4a:
                    r1 = move-exception
                    X.4xd r0 = r2
                    if (r0 == 0) goto L52
                    r0.onFailure()
                L52:
                    java.lang.StackTraceElement[] r1 = r1.getStackTrace()
                    java.io.PrintStream r0 = java.lang.System.out
                    r0.print(r1)
                L5b:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C141835hT.onSuccess(long):void");
            }
        });
    }
}
